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
import com.hathora.client.model.Application;
import com.hathora.client.model.ApplicationWithDeployment;
import com.hathora.client.model.CreateAppRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppV1Api
 */
@Disabled
public class AppV1ApiTest {

    private final AppV1Api api = new AppV1Api();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAppTest() throws ApiException {
        CreateAppRequest createAppRequest = null;
        Application response = api.createApp(createAppRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAppTest() throws ApiException {
        String appId = null;
        api.deleteApp(appId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAppInfoTest() throws ApiException {
        String appId = null;
        Application response = api.getAppInfo(appId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAppsTest() throws ApiException {
        List<ApplicationWithDeployment> response = api.getApps();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAppTest() throws ApiException {
        String appId = null;
        CreateAppRequest createAppRequest = null;
        Application response = api.updateApp(appId, createAppRequest);
        // TODO: test validations
    }

}
