/*
 * Cainiao.com Inc.
 * Copyright (c) 2013-2022 All Rights Reserved.
 */

package com.cainiao.jenkins.demo.controller;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}