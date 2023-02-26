package com.tq.service.impl;

import com.tq.mapper.ZylMapper;
import com.tq.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService , ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Autowired(required = false)
    private ZylMapper zylMapper;

    public void a() {

    }

    @Override
    public void setApplicationContext(ApplicationContext application) throws BeansException {

        applicationContext = application;
        ZylMapper bean = applicationContext.getBean(ZylMapper.class);

    }


}
