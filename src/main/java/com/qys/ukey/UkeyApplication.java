package com.qys.ukey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class UkeyApplication {
    public static void main(String[] args) {
        SpringApplication.run(UkeyApplication.class, args);
    }
}
