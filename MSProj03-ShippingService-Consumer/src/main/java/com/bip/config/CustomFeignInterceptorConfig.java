package com.bip.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomFeignInterceptorConfig {

    @Bean(name = "customFeignInterceptorBean")
    public RequestInterceptor customFeignInterceptor() {
        return new CustomFeignInterceptor();
    }

    private static class CustomFeignInterceptor implements RequestInterceptor {

        @Override
        public void apply(RequestTemplate requestTemplate) {
            // Add custom logic to modify the request, such as adding headers
            requestTemplate.header("Custom-Header", "Custom-Value");
        }
    }
}
