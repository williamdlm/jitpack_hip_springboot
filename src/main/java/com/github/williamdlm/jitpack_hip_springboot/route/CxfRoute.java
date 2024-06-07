package com.github.williamdlm.jitpack_hip_springboot.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CxfRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("cxf:bean:greetingEndpoint")
                .log("{$body}")
                .to("bean:greetingServiceImpl?method=sayHi");
    }
}
