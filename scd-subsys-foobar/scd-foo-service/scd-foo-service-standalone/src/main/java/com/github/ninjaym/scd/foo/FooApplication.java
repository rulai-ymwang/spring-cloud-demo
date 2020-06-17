package com.github.ninjaym.scd.foo;

import com.github.ninjaym.scd.api.bar.BarApi;
import com.github.ninjaym.scd.commons.service.ScdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@ScdService
public class FooApplication {
    public static void main(String[] args) {
        SpringApplication.run(FooApplication.class, args);
    }

    @RestController
    public static class AppController {
        @Autowired
        private BarApi barApi;

        @GetMapping("/hello")
        public String hello() {
            return barApi.hello();
        }
    }
}
