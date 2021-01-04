package com.example.security.controller;

import com.example.security.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/m")
    public String member() {
        return "member";
    }

    @GetMapping("/a")
    public String admin() {
        return "admin";
    }

    @GetMapping("/ad")
    public String accessDenied() {
        return "accessdenied";
    }

    @GetMapping("/success")
    public String mainfunc() {
        return "main";
    }

}
