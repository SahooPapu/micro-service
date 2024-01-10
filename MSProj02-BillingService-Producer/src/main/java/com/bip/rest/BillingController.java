package com.bip.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
public class BillingController {
    @GetMapping("/info")
    public ResponseEntity<String> fetchBillingDetails() {
        return new ResponseEntity<String>(" Final BillAmt= BillAmt- discount (Rs.5000)", HttpStatus.OK);
    }

    @GetMapping("/testing")
    public String getTesting() {
        return "Hellow World";
    }
}
