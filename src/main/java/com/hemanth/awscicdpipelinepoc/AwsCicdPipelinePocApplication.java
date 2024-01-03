package com.hemanth.awscicdpipelinepoc;

import com.hemanth.awscicdpipelinepoc.config.CustomBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsCicdPipelinePocApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AwsCicdPipelinePocApplication.class);
        app.setBanner(new CustomBanner());
        app.run(args);
    }

}
