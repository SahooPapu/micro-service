package com.bip.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class BillingServiceCosumerClient {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    public String getBillingInfo() {
        System.out.println("discoveryClient getBillingInfo() method");
        // Get Billing-Service  Instance from eureka server

        ServiceInstance instance = loadBalancerClient.choose("Billing-service");


        // get details from Serivce Instance
        URI uri = instance.getUri();
        //prepare  provider MS related url to cosume method
        String url = uri.toString() + "/billing/api/info";

        //create RestTemplate class obj to cosume the provider  service
        RestTemplate template = new RestTemplate();
        //  consume the provider service
        ResponseEntity<String> response = template.getForEntity(url, String.class);
        // get response content from ResponseEntity object
        String responseContent = response.getBody();
        return responseContent;
    }

}
