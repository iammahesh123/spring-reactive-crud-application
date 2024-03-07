package com.gfg.springreactivecrudapp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class UserRouter {

    @Autowired
    private UserHandler userHandler;

    @Bean
    public RouterFunction<ServerResponse> userRoutes() {
        return RouterFunctions
                .route(GET("/users"), userHandler::getAllUsers)
                .andRoute(GET("/users/{id}"), userHandler::getUserById)
                .andRoute(POST("/users"), userHandler::createUser)
                .andRoute(PUT("/users/{id}"), userHandler::updateUser)
                .andRoute(DELETE("/users/{id}"), userHandler::deleteUser);
    }
}

