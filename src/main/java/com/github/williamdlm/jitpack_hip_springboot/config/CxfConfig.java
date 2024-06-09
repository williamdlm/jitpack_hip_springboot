package com.github.williamdlm.jitpack_hip_springboot.config;

import com.github.williamdlm.jitpack_hip_springboot.service.GreetingService;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.annotation.ManagedResource;

@Configuration
@ManagedResource
public class CxfConfig {
    @Bean
    public CxfEndpoint greetingEndpoint() {
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("/greeting");
        cxfEndpoint.setServiceClass(GreetingService.class);
        return cxfEndpoint;
    }
}
