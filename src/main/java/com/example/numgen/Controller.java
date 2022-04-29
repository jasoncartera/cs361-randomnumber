package com.example.numgen;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller { 

    @GetMapping("/")
    public NumGen numgen(@RequestParam(value = "lower", defaultValue = "1") int lower, @RequestParam(value = "upper", defaultValue = "2147483647") int upper) {
        return new NumGen(lower, upper);
    }
}
