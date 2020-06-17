package com.github.ninjaym.scd.bar;

import com.github.ninjaym.scd.commons.service.ScdService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@ScdService
public class BarApplication {


    public static void main(String[] args) {
        SpringApplication.run(BarApplication.class, args);
    }

    @RestController
    public static class AppController {

        @Value("${spring.cloud.client.hostname}:${spring.application.name}:${spring.application.instance_id:${server.port}}")
        private String instanceId;

        @GetMapping("/hello")
        public String hello() {
            return String.format("hello world from bar-service (%s)", instanceId);
        }
    }
}
