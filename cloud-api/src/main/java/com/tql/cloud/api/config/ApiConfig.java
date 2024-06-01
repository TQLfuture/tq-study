package com.tql.cloud.api.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author tql
 * @date 2023/9/19-19:56
 */
@ComponentScan("com.tql.cloud.api.user")
@Configuration
public class ApiConfig {

    public static final String SERVICE_NAME = "eureka-service-provider";

    // 自动配置feign扫描包 使用方零配置 微服务本身不加载自己的API中的feign
    @ConditionalOnExpression("#{!environment['spring.application.name'].endsWith('" + SERVICE_NAME + "')}")
    @EnableFeignClients("com.tql.cloud.api.user")
    public class FeignConfig {
    }
}
