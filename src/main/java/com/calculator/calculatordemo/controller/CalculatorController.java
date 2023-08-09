package com.calculator.calculatordemo.controller;

import com.calculator.calculatordemo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;
    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }

//    @GetMapping("/add/{a}/{b}")       // passing parameters with http link, this method is not professional
//    public int add(@PathVariable int a, @PathVariable int b) {
//        return calculatorService.add(a,b);
//    }
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculatorService.add(a,b);
    }

//    @RequestHeader - Authorise
//    @RequestBody - Send objects
    @GetMapping("/sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return calculatorService.sub(a,b);
    }
    @GetMapping("/mul")
    public int mul(@RequestParam int a, @RequestParam int b) {
        return calculatorService.mul(a,b);
    }
    @GetMapping("/div")
    public int div(@RequestParam int a, @RequestParam int b) {
        return calculatorService.div(a,b);
    }
}
