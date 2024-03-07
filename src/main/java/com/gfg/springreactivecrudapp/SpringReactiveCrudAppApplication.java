package com.gfg.springreactivecrudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class SpringReactiveCrudAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactiveCrudAppApplication.class, args);
    }

}
