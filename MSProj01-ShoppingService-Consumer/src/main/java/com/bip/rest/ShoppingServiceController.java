package com.bip.rest;

import com.bip.client.BillingServiceCosumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shopping/api")
public class ShoppingServiceController {
    @Autowired
    private BillingServiceCosumerClient billingServiceCosumerClient;
    @GetMapping("/get")
    public ResponseEntity<String> doShopping()
    {
        //use  Client Comp
        String  resultMsg=billingServiceCosumerClient.getBillingInfo();
        return new ResponseEntity<>("Shopping the items(shirt,trouser) ::::"+resultMsg, HttpStatus.OK);
    }

}
