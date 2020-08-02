package com.example.mouse.server.Configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
public class MouseRobot {

    @Bean
    public Robot robot() throws AWTException {
        return new Robot();
    }
}
