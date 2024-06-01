package com.tql.cloud.api.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tql
 * @date 2023/9/19-19:53
 */
@Component
@FeignClient("eureka-service-provider")
@RequestMapping(path = "userService")
public interface IUserService {

    @GetMapping(path = "getUserById")
    public String getUser();
}
