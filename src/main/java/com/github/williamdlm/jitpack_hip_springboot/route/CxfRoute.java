package com.github.williamdlm.jitpack_hip_springboot.route;

import com.github.williamdlm.jitpack_hip_springboot.service.GreetingService;
import org.apache.camel.BindToRegistry;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
import org.springframework.stereotype.Component;

@Component
public class CxfRoute extends RouteBuilder {

    @BindToRegistry("testando")
    public CxfEndpoint greetingEndpoint() {
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("/greeting");
        cxfEndpoint.setServiceClass(GreetingService.class);
        return cxfEndpoint;
    }

    @Override
    public void configure() throws Exception {
        from("cxf:bean:testando")
                .log("{$body}")
                .to("bean:greetingServiceImpl?method=sayHi");
    }
}
