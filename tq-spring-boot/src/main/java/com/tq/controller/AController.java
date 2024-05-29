package com.tq.controller;


import com.alibaba.fastjson2.JSON;
import com.tq.mapper.ZylMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AController {

    @Resource
    private ZylMapper zylMapper;

    @GetMapping("/hello")
    public String hello() {
        return JSON.toJSONString(zylMapper.selectIdList());
    }


    class Animal {

        public Animal() {

        }

        public Animal(String name) {

        }
        public void eat() {
            Animal animal = new Animal("jjjj");
        }

        public void drink(){}


    }

    class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }


        @Override
        public void eat() {
            // 舔
        }

        @Override
        public void drink() {
            // 舔
        }
    }

    class Person extends Animal {
        @Override
        public void eat() {
            // 筷子吃
        }

        @Override
        public void drink() {
            // 用水瓶喝水
        }
    }

    public void test() {
        Animal animal = new Dog("");
        animal.drink();

        List<String> list = new ArrayList<>();
    }
}


