package com.quizzio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by cloarec1 on 19/12/2017.
 */

@SpringBootApplication
@EnableWebSocket
@PropertySource("classpath:application.properties")
public class Application implements WebSocketConfigurer {

    private WebSocketHandler echoWebsocketHandler;

    @Override
    public void registerWebSocketHandlers(final WebSocketHandlerRegistry registry) {
        registry.addHandler(this.echoWebsocketHandler, "/ws").setAllowedOrigins("*");
    }

    @Autowired
    public Application(final WebSocketHandler echoWebsocketHandler) {
        this.echoWebsocketHandler = echoWebsocketHandler;
    }

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
