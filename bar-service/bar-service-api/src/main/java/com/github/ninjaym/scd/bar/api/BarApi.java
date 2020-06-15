package com.github.ninjaym.scd.bar.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("scd-bar-service")
public interface BarApi {

    @GetMapping({"/hello"})
    String hello();
}
