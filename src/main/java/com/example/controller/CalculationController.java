package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationController {

    @RequestMapping("/calculate")
    public String greeting(
        @RequestParam("number1") int number1,
        @RequestParam("number1") int number2,
        Model model) {

        String message = "Here are your calculation results for: " + number1
                + " and " + number2;

        model.addAttribute("sum", (number1 + number2));
        model.addAttribute("subtract", (number1 - number2));
        model.addAttribute("multiply", (number1 * number2));
        model.addAttribute("divide", (number1 / number2));

        return "resultsPage";
    }
}
