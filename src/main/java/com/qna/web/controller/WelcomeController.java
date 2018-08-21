package com.qna.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ehay@naver.com on 2018-08-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@Controller
public class WelcomeController {
    @GetMapping("/helloworld")
    public String welcome(String name, int age, Model model) {
        System.out.println("name : " + name + " age : " + age);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "welcome";
    }
}