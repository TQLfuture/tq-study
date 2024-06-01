package com.tq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tql
 * @date 2024/5/29-21:04
 */
@RestController
@Slf4j
public class Test1 {

    @GetMapping("/jacoc")
    public String jacoc() {
        String bbbb = "bbbb";
        String s = "hello";
        return bbbb+s+"jacoc";
    }
}
