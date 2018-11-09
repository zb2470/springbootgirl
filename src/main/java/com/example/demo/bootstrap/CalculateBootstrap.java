package com.example.demo.bootstrap;

import com.example.demo.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.example.demo.service")
public class CalculateBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java7")
                .run(args);

        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println(calculateService.sum(new Integer[]{1, 2, 3, 4, 5, 6}));

        context.close();
    }
}
