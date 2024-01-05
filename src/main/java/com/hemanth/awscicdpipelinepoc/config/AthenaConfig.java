package com.hemanth.awscicdpipelinepoc.config;

import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.athena.AthenaClient;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class AthenaConfig {

    private final AthenaClient athenaClient;

    public AthenaConfig(){

        AwsBasicCredentials awsBasicCredentials = AwsBasicCredentials
                .create(System.getenv("AWS_ACCESS_KEY_ID"),System.getenv("AWS_SECRET_ACCESS_KEY"));

        this.athenaClient = AthenaClient.builder()
                .credentialsProvider(StaticCredentialsProvider.create(awsBasicCredentials))
                .region(Region.AP_SOUTH_1)
                .build();

    }
}
