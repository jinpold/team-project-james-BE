package com.james.api;
import com.james.api.common.HomeController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ApiApplication {
    private final HomeController controller;
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);

    }
}
