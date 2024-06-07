package com.github.williamdlm.jitpack_hip_springboot.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi(String text) {
        return "Hi " + text;
    }

    @Override
    public String sayHello(String text) {
        return "Hello " + text;
    }
}
