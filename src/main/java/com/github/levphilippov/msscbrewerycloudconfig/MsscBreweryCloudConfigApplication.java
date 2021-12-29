package com.github.levphilippov.msscbrewerycloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsscBreweryCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBreweryCloudConfigApplication.class, args);
    }

}
