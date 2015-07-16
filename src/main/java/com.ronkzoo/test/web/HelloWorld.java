package com.ronkzoo.test.web;

import com.ronkzoo.test.vo.HelloWorldVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller("helloworld")
public class HelloWorld extends HttpServlet {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    public String HelloWorld(HttpServletRequest request, Model model){
        HelloWorldVo hello = new HelloWorldVo() ;

        hello.setId("leeminuk");
        hello.setName("이민욱");

        model.addAttribute("hello",hello);

        return "jsonTemplate";
    }



}
