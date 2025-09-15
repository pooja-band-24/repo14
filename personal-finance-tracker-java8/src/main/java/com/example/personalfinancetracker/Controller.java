
package com.example.personalfinancetracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/personal-finance-tracker")
    public String home() {
        return "Track your expenses and income";
    }
}
