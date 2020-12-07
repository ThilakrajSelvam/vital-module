package com.playground.vitalmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.playground.vitalmodule.proxy")
@EnableSwagger2
public class VitalModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(VitalModuleApplication.class, args);
    }

}
