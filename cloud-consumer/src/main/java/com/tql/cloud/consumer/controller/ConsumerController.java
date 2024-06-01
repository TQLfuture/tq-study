package com.tql.cloud.consumer.controller;

import com.tql.cloud.api.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author tql
 * @date 2023/9/19-20:04
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IUserService userService;

    //    @Value("${basic.key}")
    private String hello;

    /**
     * 实例化RestTemplate
     * <p>
     * LoadBalanced 这个注解不能少，否则走的RestTemplate不会被代理，直接访问对应url数据
     *
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }

    @GetMapping("/index")
    public String index() {
        String str = restTemplate
                .getForObject("http://eureka-service-provider/userService/getUserById?userId",String.class);
        return str;
    }

}
