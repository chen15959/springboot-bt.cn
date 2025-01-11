package com.example;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class DemoWeb {

    Logger logger = LoggerFactory.getLogger(this.getClass());



    @GetMapping("/")
    public String hello() {
        logger.warn("hello");
        return "hello @ " + new Date().toString() + "\n";
    }
}
