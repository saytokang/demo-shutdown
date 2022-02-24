package com.example.demogwshutdown;

import java.net.UnknownHostException;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DemoGwShutdownApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGwShutdownApplication.class, args);
	}

    @Autowired Environment env;
    @Autowired
    private ServerProperties serverProperties;
    
    @PreDestroy
    public void cleann() throws UnknownHostException {
        log.info("ip: {}", serverProperties.getAddress().getLocalHost().getHostAddress());
        log.info("port: {}", serverProperties.getPort());
        log.info("\n\n---------- destory -----------\n\n");
    }

}
