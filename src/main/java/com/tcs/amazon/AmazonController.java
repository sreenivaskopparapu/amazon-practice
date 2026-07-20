package com.tcs.amazon;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonController {
    @PostMapping
    public String welcome() {
        return "Welcome to Amazon!";
    }
}
