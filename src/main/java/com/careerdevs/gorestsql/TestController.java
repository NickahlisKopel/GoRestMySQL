package com.careerdevs.gorestsql;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping("/")
    public String getRootRoute(){
        return "You are at the root route";

    }
}
