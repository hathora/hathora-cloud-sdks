/*
 * Hathora Cloud API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hathora.client.api;

import com.hathora.client.ApiException;
import com.hathora.client.model.Deployment;
import com.hathora.client.model.DeploymentConfig;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeploymentV1Api
 */
@Disabled
public class DeploymentV1ApiTest {

    private final DeploymentV1Api api = new DeploymentV1Api();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDeploymentTest() throws ApiException {
        String appId = null;
        Double buildId = null;
        DeploymentConfig deploymentConfig = null;
        Deployment response = api.createDeployment(appId, buildId, deploymentConfig);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeploymentInfoTest() throws ApiException {
        String appId = null;
        Double deploymentId = null;
        Deployment response = api.getDeploymentInfo(appId, deploymentId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeploymentsTest() throws ApiException {
        String appId = null;
        List<Deployment> response = api.getDeployments(appId);
        // TODO: test validations
    }

}
