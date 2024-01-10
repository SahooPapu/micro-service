package com.bip.rest;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
public class BillingController {
    @GetMapping("/info")
    public ResponseEntity<String> getBillingInfo(HttpServletRequest servletRequest) {
        String header = servletRequest.getHeader("Custom-Header");
        System.out.println("daaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa: "+ header);
        return new ResponseEntity<>("Billing of 500 Rs ", HttpStatus.OK);
    }
}
