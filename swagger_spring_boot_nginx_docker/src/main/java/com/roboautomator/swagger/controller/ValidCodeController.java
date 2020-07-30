package com.roboautomator.swagger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ValidCodeController {

    @GetMapping("/valid/{code}")
    public ResponseEntity<String> getIsValidCode(@PathVariable("code") String code) {
        return ResponseEntity.ok(String.valueOf(code.equals("abc123")));
    }
}
