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
    public String aboutPage(){
        return "about";
    }
    @RequestMapping("/git_One")
    public String aboutGitOne() {
        return "git1";
    }
    @RequestMapping("/git_Two")
    public String aboutGitTwo() {
        return "git2";
    }
    @RequestMapping("/core_One")
    public String coreJavaOne() {
        return "coreJavaConcept1";
    }
    @RequestMapping("/core_Two")
    public String coreJavaTwo() {
        return "coreJavaConcept2";
    }
    @RequestMapping("/Prog&Alg_One")
    public String programAlgorithOne() {
        return "program_design_&_algorithms1";
    }
    @RequestMapping("/Prog&Alg_Two")
    public String programAlgorithTwo() {
        return "program_design_&_algorithms2";
    }
    @RequestMapping("/OOP_One")
    public String oopOne() {
        return "oopConcept1";
    }
    @RequestMapping("/OOP_Two")
    public String oopTwo() {
        return "oopConcept2";
    }
    @RequestMapping("/HTML_One")
    public String htmlOne() {
        return "htmlTopic1";
    }
    @RequestMapping("/CSS_One")
    public String cssOne() {
        return "cssTopic1";
    }





}
