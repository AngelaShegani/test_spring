package com.example.test_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String Hello(){
        return "index";
    }

    @RequestMapping("/color/{favColor}")
    public String DspColor(@PathVariable("favColor") String favColor, Model model){
        model.addAttribute("favColor",favColor);
        return "color";

    }

    @RequestMapping("/student")
    public String studentDetails(Model viewModel){
        String name = "John";
        String city = "Tirana";
        viewModel.addAttribute("student", name);
        viewModel.addAttribute("city", city);

        ArrayList<String> stacks = new ArrayList<>();
        stacks.add("Java");
        stacks.add("Python");
        stacks.add("MERN");

        viewModel.addAttribute("myStacks", stacks);

        return "student";
    }

    @RequestMapping("/form")
    public String displayData(){
        return "form";

    }

   // @RequestMapping("/results")
    @PostMapping ("/results")
    public String results(@RequestParam String name, @RequestParam String email, @RequestParam String program, Model model, HttpSession session){
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("program", program);
        session.setAttribute("name", name);
        return "results";

    }

    @RequestMapping("/test")
    public String testSession(HttpSession session, Model model){
        String emri = (String)session.getAttribute("name");
        model.addAttribute("sesioni",emri);
        return "test";
    }

}
