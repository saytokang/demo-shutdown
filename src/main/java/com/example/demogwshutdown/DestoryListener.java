package com.example.demogwshutdown;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// @Component
public class DestoryListener {

    @PreDestroy
    public void cleann() {
        log.info("\n\n---------- destory -----------\n\n");
    }
    
}
