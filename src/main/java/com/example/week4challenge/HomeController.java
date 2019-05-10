package com.example.week4challenge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/profile")
    public String profilePage() {
        return "profile";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        return "about";

    }

    @RequestMapping("/git_One")
    public String aboutGitOne() {
        return "gitOne";

    }


}
