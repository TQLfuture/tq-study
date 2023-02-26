package com.tq.controller;


import com.alibaba.fastjson2.JSON;
import com.tq.mapper.ZylMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AController {

    @Resource
    private ZylMapper zylMapper;

    @GetMapping("/hello")
    public String hello() {
        return JSON.toJSONString(zylMapper.selectIdList());
    }
}


