package com.ronkzoo.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ronkzoo on 2015. 7. 18..
 */
@Controller("helloWorldController3")
@RequestMapping("/hello3")
public class CalendarController extends HttpServlet {


    @RequestMapping(value = "/hello3")
    public ModelAndView getCalendarPage(HttpServletRequest request, HttpServletResponse response, Model model) {

        model.addAttribute("leeminuk","lee");

        return new ModelAndView("com/ronkzoo/test/Calendar");
    }



}
