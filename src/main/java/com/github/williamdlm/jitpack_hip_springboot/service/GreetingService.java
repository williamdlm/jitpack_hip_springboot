package com.github.williamdlm.jitpack_hip_springboot.service;

import jakarta.jws.WebService;

@WebService
public interface GreetingService {
    String sayHi(String text);

    String sayHello(String text);
}
