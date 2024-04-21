package ru.maxima;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class ParameterController {
    @GetMapping("/number")
    public String getSum(@RequestParam(name = "num1") double num1,
                         @RequestParam(name = "num2") double num2,
                         @RequestParam(name = "operation") String operation, Model model) {
        double result = 0.0;
        switch (operation) {
            case "sum":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    return "Error: Division by zero!";
                }
                break;

        }
        model.addAttribute("message", "Result = " + result);

        return "calc";
    }
}
