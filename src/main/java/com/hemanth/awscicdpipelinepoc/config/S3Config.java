package com.hemanth.awscicdpipelinepoc.config;

import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class S3Config {

    private final S3Client s3Client;

    private final String s3BucketName = System.getenv("S3_BUCKET_NAME");

    public S3Config(){
        AwsBasicCredentials awsBasicCredentials = AwsBasicCredentials
                .create(System.getenv("AWS_ACCESS_KEY_ID"),System.getenv("AWS_SECRET_ACCESS_KEY"));
        this.s3Client = S3Client.builder()
                .credentialsProvider(StaticCredentialsProvider.create(awsBasicCredentials))
                .region(Region.AP_SOUTH_1)
                .build();
    }

}
