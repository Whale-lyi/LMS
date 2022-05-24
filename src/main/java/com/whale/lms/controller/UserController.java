package com.whale.lms.controller;

import com.whale.lms.pojo.User;
import com.whale.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        User user = userService.getUser(username, password);
        if (user != null) {
            session.setAttribute("loginUser", user);
            return "redirect:/index?pageNo=1";
        } else {
            return "login";
        }
    }

    @GetMapping(value = {"/register"})
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam("username") String username,
                        @RequestParam("password") String password) {
        Integer count = userService.getUserCountByName(username);
        if (count > 0) {
            return "register";
        }else {
            userService.insertUser(username, password);
            return "login";
        }
    }
}
