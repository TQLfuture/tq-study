package com.tq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tql
 * @date 2024/6/3-20:28
 */
@RestController
public class AAController {

    @GetMapping("kkkkkk")
    public String hello() {
        return "jjj";
    }
}
