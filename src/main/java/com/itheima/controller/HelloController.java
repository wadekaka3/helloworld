package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Brian
 * @version 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    private String hello() {
        System.out.println("hello ... ");
        return "OK";
    }
}
