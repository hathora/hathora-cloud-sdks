/*
 * Hathora Cloud API
 * Welcome to the Hathora Cloud API documentation! Learn how to use the Hathora Cloud APIs to build and scale your game servers globally.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hathora.client.api;

import com.hathora.client.ApiCallback;
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.ApiResponse;
import com.hathora.client.Configuration;
import com.hathora.client.Pair;
import com.hathora.client.ProgressRequestBody;
import com.hathora.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.hathora.client.model.ApiError;
import com.hathora.client.model.AppConfig;
import com.hathora.client.model.Application;
import com.hathora.client.model.ApplicationWithLatestDeploymentAndBuild;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AppV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AppV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AppV1Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createApp
     * @param appConfig  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAppCall(AppConfig appConfig, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = appConfig;

        // create path and map variables
        String localVarPath = "/apps/v1/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "hathoraDevToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createAppValidateBeforeCall(AppConfig appConfig, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appConfig' is set
        if (appConfig == null) {
            throw new ApiException("Missing the required parameter 'appConfig' when calling createApp(Async)");
        }

        return createAppCall(appConfig, _callback);

    }

    /**
     * 
     * Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appConfig  (required)
     * @return Application
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Application createApp(AppConfig appConfig) throws ApiException {
        ApiResponse<Application> localVarResp = createAppWithHttpInfo(appConfig);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appConfig  (required)
     * @return ApiResponse&lt;Application&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Application> createAppWithHttpInfo(AppConfig appConfig) throws ApiException {
        okhttp3.Call localVarCall = createAppValidateBeforeCall(appConfig, null);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appConfig  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAppAsync(AppConfig appConfig, final ApiCallback<Application> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAppValidateBeforeCall(appConfig, _callback);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteApp
     * @param appId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAppCall(String appId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apps/v1/delete/{appId}"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "hathoraDevToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteAppValidateBeforeCall(String appId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling deleteApp(Async)");
        }

        return deleteAppCall(appId, _callback);

    }

    /**
     * 
     * Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;. Your organization will lose access to this application.
     * @param appId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public void deleteApp(String appId) throws ApiException {
        deleteAppWithHttpInfo(appId);
    }

    /**
     * 
     * Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;. Your organization will lose access to this application.
     * @param appId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteAppWithHttpInfo(String appId) throws ApiException {
        okhttp3.Call localVarCall = deleteAppValidateBeforeCall(appId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;. Your organization will lose access to this application.
     * @param appId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAppAsync(String appId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAppValidateBeforeCall(appId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAppInfo
     * @param appId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAppInfoCall(String appId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apps/v1/info/{appId}"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "hathoraDevToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAppInfoValidateBeforeCall(String appId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getAppInfo(Async)");
        }

        return getAppInfoCall(appId, _callback);

    }

    /**
     * 
     * Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.
     * @param appId  (required)
     * @return Application
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Application getAppInfo(String appId) throws ApiException {
        ApiResponse<Application> localVarResp = getAppInfoWithHttpInfo(appId);
        return localVarResp.getData();
    }

    /**
     * 
     * Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.
     * @param appId  (required)
     * @return ApiResponse&lt;Application&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Application> getAppInfoWithHttpInfo(String appId) throws ApiException {
        okhttp3.Call localVarCall = getAppInfoValidateBeforeCall(appId, null);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.
     * @param appId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAppInfoAsync(String appId, final ApiCallback<Application> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAppInfoValidateBeforeCall(appId, _callback);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApps
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAppsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apps/v1/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "hathoraDevToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAppsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getAppsCall(_callback);

    }

    /**
     * 
     * Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an &#x60;appId&#x60;.
     * @return List&lt;ApplicationWithLatestDeploymentAndBuild&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public List<ApplicationWithLatestDeploymentAndBuild> getApps() throws ApiException {
        ApiResponse<List<ApplicationWithLatestDeploymentAndBuild>> localVarResp = getAppsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an &#x60;appId&#x60;.
     * @return ApiResponse&lt;List&lt;ApplicationWithLatestDeploymentAndBuild&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ApplicationWithLatestDeploymentAndBuild>> getAppsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAppsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<ApplicationWithLatestDeploymentAndBuild>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an &#x60;appId&#x60;.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAppsAsync(final ApiCallback<List<ApplicationWithLatestDeploymentAndBuild>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAppsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<ApplicationWithLatestDeploymentAndBuild>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateApp
     * @param appId  (required)
     * @param appConfig  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAppCall(String appId, AppConfig appConfig, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = appConfig;

        // create path and map variables
        String localVarPath = "/apps/v1/update/{appId}"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "hathoraDevToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateAppValidateBeforeCall(String appId, AppConfig appConfig, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling updateApp(Async)");
        }

        // verify the required parameter 'appConfig' is set
        if (appConfig == null) {
            throw new ApiException("Missing the required parameter 'appConfig' when calling updateApp(Async)");
        }

        return updateAppCall(appId, appConfig, _callback);

    }

    /**
     * 
     * Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.
     * @param appId  (required)
     * @param appConfig  (required)
     * @return Application
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Application updateApp(String appId, AppConfig appConfig) throws ApiException {
        ApiResponse<Application> localVarResp = updateAppWithHttpInfo(appId, appConfig);
        return localVarResp.getData();
    }

    /**
     * 
     * Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.
     * @param appId  (required)
     * @param appConfig  (required)
     * @return ApiResponse&lt;Application&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Application> updateAppWithHttpInfo(String appId, AppConfig appConfig) throws ApiException {
        okhttp3.Call localVarCall = updateAppValidateBeforeCall(appId, appConfig, null);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.
     * @param appId  (required)
     * @param appConfig  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAppAsync(String appId, AppConfig appConfig, final ApiCallback<Application> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAppValidateBeforeCall(appId, appConfig, _callback);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
