package com.test.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController
{
    @GetMapping("landingpage")
    public String getLandingPage()
    {
        return "landingpage";
    }



}
