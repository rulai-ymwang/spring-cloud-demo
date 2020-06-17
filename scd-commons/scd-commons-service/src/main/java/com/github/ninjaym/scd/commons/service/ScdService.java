package com.github.ninjaym.scd.commons.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@SpringBootApplication(
    scanBasePackages = {"com.github.ninjaym.scd"}
)
@EnableFeignClients(
    basePackages = {"com.github.ninjaym.scd.api"}
)
public @interface ScdService {
}
