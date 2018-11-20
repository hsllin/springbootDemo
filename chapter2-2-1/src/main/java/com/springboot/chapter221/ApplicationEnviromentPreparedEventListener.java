package com.springboot.chapter221;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author haungsonglin
 * @version 2.0.0
 */
@Slf4j
public class ApplicationEnviromentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        System.out.println("........ApplicationEnvironmentPreparedEvent.......");
    }
}
