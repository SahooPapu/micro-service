package com.bip.rest;

import com.bip.client.IBillingServiceConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingController {
    @Autowired
    private IBillingServiceConsumerClient iBillingServiceConsumerClient;

    @GetMapping("/cart")
    public ResponseEntity<String> doShopping() {
        System.out.println("Proxy class name ::" + iBillingServiceConsumerClient.getClass() + "........." + Arrays.toString(iBillingServiceConsumerClient.getClass().getInterfaces()));
        //use  Client Comp
        String resultMsg = iBillingServiceConsumerClient.fetchBillingInfo().getBody();
        return new ResponseEntity<String>("Shopping the items(shirt,trouser) ::::" + resultMsg, HttpStatus.OK);

    }//method

}
