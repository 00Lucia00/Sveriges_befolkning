package com.folk.Sveriges_befolkning.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/secured")
public class mainController {
    @GetMapping("/secured")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to sveriges befolkning API");
    }

}
