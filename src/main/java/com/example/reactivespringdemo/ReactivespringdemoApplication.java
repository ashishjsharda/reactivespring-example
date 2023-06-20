package com.example.reactivespringdemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReactivespringdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactivespringdemoApplication.class, args);
    }

    @GetMapping("/add")
    public int add(@RequestParam(value = "num1", defaultValue = "0") int num1,
                   @RequestParam(value = "num2", defaultValue = "0") int num2) {
        return num1 + num2;
    }
}
