package com.tq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tql
 * @date 2024/5/29-21:04
 */
@RestController
public class Test1 {

    @GetMapping("/jacoc")
    public String jacoc() {
        return "jacoc";
    }
}
