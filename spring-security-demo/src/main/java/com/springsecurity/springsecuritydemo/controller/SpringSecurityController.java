package com.springsecurity.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {

    @GetMapping("/")
    public String home() {
        return ("<div> Welcome</div>");
    }

    @RequestMapping("/user")
    public String user() {
        return "<div>Hello User</div>";
    }
    @RequestMapping("/admin")
    public String admin() {
        return "<div>Hello Admin</div>";
    }
}
