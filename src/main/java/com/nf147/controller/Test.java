package com.nf147.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/rest")
@Controller
public class Test {

    @RequestMapping(value = "/form")
    public ModelAndView goForm() {
        ModelAndView mav = new ModelAndView("/form");
        return mav;
    }


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String testGet() {
        System.out.println("rest 的 get 请求。。。");
        return "/rest/get";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String testPost() {
        System.out.println("rest 的 post 请求。。。");
        return "/rest/post";
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public String testPut() {
        System.out.println("rest 的 put 请求。。。");
        return "/rest/put";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String testDelete() {
        System.out.println("rest 的 delete 请求。。。");
        return "/rest/delete";
    }

}
