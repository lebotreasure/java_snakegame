package com.lebo.snakegame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;

@SpringBootApplication
public class SnakeGameApplication {

    public static void main(String[] args) {

//        SpringApplication.run(SnakeGameApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SnakeGameApplication.class);
        builder.headless(false);
        builder.run(args);
        JFrame mf = new JFrame();
        mf.setVisible(true);
        new GameFrame();
    }

}
