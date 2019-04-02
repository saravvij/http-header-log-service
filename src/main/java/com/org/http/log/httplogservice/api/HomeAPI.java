package com.org.http.log.httplogservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAPI {

    @GetMapping("/home")
    public String hello() {
        return "Hello, Welcome to Home";
    }
}
