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
import com.hathora.client.model.Build;
import com.hathora.client.model.CreateBuildParams;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BuildV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BuildV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public BuildV1Api(ApiClient apiClient) {
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
     * Build call for createBuild
     * @param appId  (required)
     * @param createBuildParams  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBuildCall(String appId, CreateBuildParams createBuildParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createBuildParams;

        // create path and map variables
        String localVarPath = "/builds/v1/{appId}/create"
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
    private okhttp3.Call createBuildValidateBeforeCall(String appId, CreateBuildParams createBuildParams, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling createBuild(Async)");
        }

        // verify the required parameter 'createBuildParams' is set
        if (createBuildParams == null) {
            throw new ApiException("Missing the required parameter 'createBuildParams' when calling createBuild(Async)");
        }

        return createBuildCall(appId, createBuildParams, _callback);

    }

    /**
     * 
     * Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a &#x60;buildId&#x60; that you must pass to [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a &#x60;buildTag&#x60; to associate an external version with a build.
     * @param appId  (required)
     * @param createBuildParams  (required)
     * @return Build
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Build createBuild(String appId, CreateBuildParams createBuildParams) throws ApiException {
        ApiResponse<Build> localVarResp = createBuildWithHttpInfo(appId, createBuildParams);
        return localVarResp.getData();
    }

    /**
     * 
     * Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a &#x60;buildId&#x60; that you must pass to [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a &#x60;buildTag&#x60; to associate an external version with a build.
     * @param appId  (required)
     * @param createBuildParams  (required)
     * @return ApiResponse&lt;Build&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Build> createBuildWithHttpInfo(String appId, CreateBuildParams createBuildParams) throws ApiException {
        okhttp3.Call localVarCall = createBuildValidateBeforeCall(appId, createBuildParams, null);
        Type localVarReturnType = new TypeToken<Build>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a &#x60;buildId&#x60; that you must pass to [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a &#x60;buildTag&#x60; to associate an external version with a build.
     * @param appId  (required)
     * @param createBuildParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBuildAsync(String appId, CreateBuildParams createBuildParams, final ApiCallback<Build> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBuildValidateBeforeCall(appId, createBuildParams, _callback);
        Type localVarReturnType = new TypeToken<Build>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteBuild
     * @param appId  (required)
     * @param buildId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteBuildCall(String appId, Integer buildId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/builds/v1/{appId}/delete/{buildId}"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()))
            .replace("{" + "buildId" + "}", localVarApiClient.escapeString(buildId.toString()));

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
    private okhttp3.Call deleteBuildValidateBeforeCall(String appId, Integer buildId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling deleteBuild(Async)");
        }

        // verify the required parameter 'buildId' is set
        if (buildId == null) {
            throw new ApiException("Missing the required parameter 'buildId' when calling deleteBuild(Async)");
        }

        return deleteBuildCall(appId, buildId, _callback);

    }

    /**
     * 
     * Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
     * @param appId  (required)
     * @param buildId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public void deleteBuild(String appId, Integer buildId) throws ApiException {
        deleteBuildWithHttpInfo(appId, buildId);
    }

    /**
     * 
     * Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
     * @param appId  (required)
     * @param buildId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteBuildWithHttpInfo(String appId, Integer buildId) throws ApiException {
        okhttp3.Call localVarCall = deleteBuildValidateBeforeCall(appId, buildId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
     * @param appId  (required)
     * @param buildId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteBuildAsync(String appId, Integer buildId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteBuildValidateBeforeCall(appId, buildId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBuildInfo
     * @param appId  (required)
     * @param buildId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBuildInfoCall(String appId, Integer buildId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/builds/v1/{appId}/info/{buildId}"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()))
            .replace("{" + "buildId" + "}", localVarApiClient.escapeString(buildId.toString()));

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
    private okhttp3.Call getBuildInfoValidateBeforeCall(String appId, Integer buildId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getBuildInfo(Async)");
        }

        // verify the required parameter 'buildId' is set
        if (buildId == null) {
            throw new ApiException("Missing the required parameter 'buildId' when calling getBuildInfo(Async)");
        }

        return getBuildInfoCall(appId, buildId, _callback);

    }

    /**
     * 
     * Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).
     * @param appId  (required)
     * @param buildId  (required)
     * @return Build
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Build getBuildInfo(String appId, Integer buildId) throws ApiException {
        ApiResponse<Build> localVarResp = getBuildInfoWithHttpInfo(appId, buildId);
        return localVarResp.getData();
    }

    /**
     * 
     * Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).
     * @param appId  (required)
     * @param buildId  (required)
     * @return ApiResponse&lt;Build&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Build> getBuildInfoWithHttpInfo(String appId, Integer buildId) throws ApiException {
        okhttp3.Call localVarCall = getBuildInfoValidateBeforeCall(appId, buildId, null);
        Type localVarReturnType = new TypeToken<Build>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).
     * @param appId  (required)
     * @param buildId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBuildInfoAsync(String appId, Integer buildId, final ApiCallback<Build> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBuildInfoValidateBeforeCall(appId, buildId, _callback);
        Type localVarReturnType = new TypeToken<Build>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBuilds
     * @param appId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBuildsCall(String appId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/builds/v1/{appId}/list"
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
    private okhttp3.Call getBuildsValidateBeforeCall(String appId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getBuilds(Async)");
        }

        return getBuildsCall(appId, _callback);

    }

    /**
     * 
     * Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appId  (required)
     * @return List&lt;Build&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<Build> getBuilds(String appId) throws ApiException {
        ApiResponse<List<Build>> localVarResp = getBuildsWithHttpInfo(appId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appId  (required)
     * @return ApiResponse&lt;List&lt;Build&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Build>> getBuildsWithHttpInfo(String appId) throws ApiException {
        okhttp3.Call localVarCall = getBuildsValidateBeforeCall(appId, null);
        Type localVarReturnType = new TypeToken<List<Build>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBuildsAsync(String appId, final ApiCallback<List<Build>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBuildsValidateBeforeCall(appId, _callback);
        Type localVarReturnType = new TypeToken<List<Build>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for runBuild
     * @param appId  (required)
     * @param buildId  (required)
     * @param _file  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runBuildCall(String appId, Integer buildId, File _file, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/builds/v1/{appId}/run/{buildId}"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()))
            .replace("{" + "buildId" + "}", localVarApiClient.escapeString(buildId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "hathoraDevToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call runBuildValidateBeforeCall(String appId, Integer buildId, File _file, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling runBuild(Async)");
        }

        // verify the required parameter 'buildId' is set
        if (buildId == null) {
            throw new ApiException("Missing the required parameter 'buildId' when calling runBuild(Async)");
        }

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling runBuild(Async)");
        }

        return runBuildCall(appId, buildId, _file, _callback);

    }

    /**
     * 
     * Builds a game server artifact from a tarball you provide. Pass in the &#x60;buildId&#x60; generated from [&#x60;CreateBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).
     * @param appId  (required)
     * @param buildId  (required)
     * @param _file  (required)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public byte[] runBuild(String appId, Integer buildId, File _file) throws ApiException {
        ApiResponse<byte[]> localVarResp = runBuildWithHttpInfo(appId, buildId, _file);
        return localVarResp.getData();
    }

    /**
     * 
     * Builds a game server artifact from a tarball you provide. Pass in the &#x60;buildId&#x60; generated from [&#x60;CreateBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).
     * @param appId  (required)
     * @param buildId  (required)
     * @param _file  (required)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> runBuildWithHttpInfo(String appId, Integer buildId, File _file) throws ApiException {
        okhttp3.Call localVarCall = runBuildValidateBeforeCall(appId, buildId, _file, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Builds a game server artifact from a tarball you provide. Pass in the &#x60;buildId&#x60; generated from [&#x60;CreateBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).
     * @param appId  (required)
     * @param buildId  (required)
     * @param _file  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runBuildAsync(String appId, Integer buildId, File _file, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = runBuildValidateBeforeCall(appId, buildId, _file, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
