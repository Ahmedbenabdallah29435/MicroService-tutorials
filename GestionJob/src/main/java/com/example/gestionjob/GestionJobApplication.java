package com.example.gestionjob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
@EnableEurekaClient
@SpringBootApplication
public class GestionJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionJobApplication.class, args);
    }
    @Autowired
    private JobRepository repository;
    @Bean
    ApplicationRunner init() {
        return (args) -> {
// save
            repository.save(new Job("FULL STACK DEV", true));
            repository.save(new Job("HR", false));
            repository.save(new Job("OPERATION",true));



            repository.findAll().forEach(System.out::println);
        };
    }
}
