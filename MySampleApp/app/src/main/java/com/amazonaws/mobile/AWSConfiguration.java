//
// Copyright 2016 Amazon.com, Inc. or its affiliates (Amazon). All Rights Reserved.
//
// Code generated by AWS Mobile Hub. Amazon gives unlimited permission to 
// copy, distribute and modify it.
//
// Source code generated from template: aws-my-sample-app-android v0.8
//
package com.amazonaws.mobile;

import com.amazonaws.regions.Regions;

/**
 * This class defines constants for the developer's resource
 * identifiers and API keys. This configuration should not
 * be shared or posted to any public source code repository.
 */
public class AWSConfiguration {

    // AWS MobileHub user agent string
    public static final String AWS_MOBILEHUB_USER_AGENT =
        "MobileHub 5c81a499-a6f8-49d1-a159-b2368ecbc8c7 aws-my-sample-app-android-v0.8";
    public static final Regions AMAZON_DEFAULT_REGION = Regions.US_EAST_1;

    // AMAZON COGNITO
    public static final Regions AMAZON_COGNITO_REGION =
      Regions.fromName("eu-west-1");
    public static final String  AMAZON_COGNITO_IDENTITY_POOL_ID =
        "eu-west-1:12a975f0-843f-4e1b-abbe-14b8818740a7";
    public static final Regions AMAZON_CLOUD_LOGIC_REGION =
       Regions.fromName("eu-west-1");
}