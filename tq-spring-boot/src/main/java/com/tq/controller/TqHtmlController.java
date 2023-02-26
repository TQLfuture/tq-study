package com.tq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TqHtmlController {

    @RequestMapping("/getDemoHtml")
    public String getDemoHtml(){
        //此处是需要展示的html在templates下的具体路径
        return "demo/demoHtm";
    }
}
