package com.tonikolaba.springvuejsXstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by NdueKolaba on 25-Jan-19.
 */

@SpringBootApplication
public class springvuejsXstarter extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(springvuejsXstarter.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(springvuejsXstarter.class, args);
    }

}
