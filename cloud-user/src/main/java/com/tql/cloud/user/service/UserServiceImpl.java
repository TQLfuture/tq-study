package com.tql.cloud.user.service;

import com.tql.cloud.api.user.IUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tql
 * @date 2023/9/19-19:53
 */
@RestController
public class UserServiceImpl implements IUserService {

    @Value("${server.port}")
    private String port;

    @Override
    public String getUser() {
        return "hello" + port;
    }
}
