package com.qna.web.controller;

import com.qna.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2018-08-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@Controller
public class UserController {
    private List<User> users = new ArrayList<User>();

    @PostMapping("/create")
    public String create(User user) {
        System.out.println("user : " + user);
        users.add(user);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", users);
        return "list";
    }
}
