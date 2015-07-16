package com.ronkzoo.test.web;

import com.ronkzoo.test.vo.HelloWorldVo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ronkzoo on 2015. 7. 16..
 */
@RestController
public class HelloWorld2 {


    @RequestMapping(value = "/hello2")
    public HelloWorldVo getAllEmployees()
    {
        HelloWorldVo hello = new HelloWorldVo();
        hello.setName("이민욱");
        hello.setId("ronkzoo");
        return hello;
    }

    @RequestMapping(value = "/hello2/{name}")
    public HelloWorldVo getAllHelloByName(@PathVariable("name") String name)
    {
        HelloWorldVo hello = new HelloWorldVo();
        hello.setName(name);
        hello.setId("ronkzoo");
        return hello;
    }

}
