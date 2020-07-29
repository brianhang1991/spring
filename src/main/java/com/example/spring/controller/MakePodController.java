package com.example.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring
 * @description: make pod controller
 * @author: hcy
 * @create: 2020-07-29 09:04
 **/

@RestController
//@RequestMapping(value = "/makepod")
public class MakePodController {

    @PostMapping(value = "makepod")
    public String makePod(){

        return "";
    }

}
