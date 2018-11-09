package com.example.demo.bootstrap;

import com.example.demo.Repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.demo.Repository")
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyFirstLevelRepository myFirstLevelRepository=context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

        System.out.println(myFirstLevelRepository);
        context.close();
    }
}
