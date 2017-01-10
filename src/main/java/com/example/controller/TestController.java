package com.example.controller;

import com.example.model.A;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {


    @GetMapping(value = "/test")
    String getTest02(@ModelAttribute A a, Model model, HttpServletRequest httpServletRequest) {
        model.addAttribute("a", new A());
        return "test";
    }
    @PostMapping(value = "/test")
    String postTest02(@ModelAttribute @Validated A a, BindingResult bindingResult,
                      Model model) {

        // グローバルなエラーをセット
        bindingResult.reject("global.na.error");

        return "test";
    }
}
