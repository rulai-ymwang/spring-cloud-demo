package com.github.ninjaym.scd.bar;

import com.github.ninjaym.scd.commons.service.ScdService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
        @GetMapping("/hello")
        public String hello() {
            return "hello world from bar-service";
        }
    }
}
