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


import com.hathora.client.model.Region;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LogV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public LogV1Api(ApiClient apiClient) {
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
     * Build call for getLogsForApp
     * @param appId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
     * @param region  (optional)
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
    public okhttp3.Call getLogsForAppCall(String appId, Boolean follow, Integer tailLines, Region region, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/logs/v1/{appId}/all"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (follow != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("follow", follow));
        }

        if (tailLines != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tailLines", tailLines));
        }

        if (region != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("region", region));
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "auth0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLogsForAppValidateBeforeCall(String appId, Boolean follow, Integer tailLines, Region region, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getLogsForApp(Async)");
        }

        return getLogsForAppCall(appId, follow, tailLines, region, _callback);

    }

    /**
     * 
     * Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.
     * @param appId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
     * @param region  (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getLogsForApp(String appId, Boolean follow, Integer tailLines, Region region) throws ApiException {
        ApiResponse<byte[]> localVarResp = getLogsForAppWithHttpInfo(appId, follow, tailLines, region);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.
     * @param appId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
     * @param region  (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getLogsForAppWithHttpInfo(String appId, Boolean follow, Integer tailLines, Region region) throws ApiException {
        okhttp3.Call localVarCall = getLogsForAppValidateBeforeCall(appId, follow, tailLines, region, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.
     * @param appId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
     * @param region  (optional)
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
    public okhttp3.Call getLogsForAppAsync(String appId, Boolean follow, Integer tailLines, Region region, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLogsForAppValidateBeforeCall(appId, follow, tailLines, region, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLogsForDeployment
     * @param appId  (required)
     * @param deploymentId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
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
    public okhttp3.Call getLogsForDeploymentCall(String appId, Integer deploymentId, Boolean follow, Integer tailLines, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/logs/v1/{appId}/deployment/{deploymentId}"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()))
            .replace("{" + "deploymentId" + "}", localVarApiClient.escapeString(deploymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (follow != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("follow", follow));
        }

        if (tailLines != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tailLines", tailLines));
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "auth0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLogsForDeploymentValidateBeforeCall(String appId, Integer deploymentId, Boolean follow, Integer tailLines, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getLogsForDeployment(Async)");
        }

        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new ApiException("Missing the required parameter 'deploymentId' when calling getLogsForDeployment(Async)");
        }

        return getLogsForDeploymentCall(appId, deploymentId, follow, tailLines, _callback);

    }

    /**
     * 
     * Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using &#x60;appId&#x60; and &#x60;deploymentId&#x60;.
     * @param appId  (required)
     * @param deploymentId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getLogsForDeployment(String appId, Integer deploymentId, Boolean follow, Integer tailLines) throws ApiException {
        ApiResponse<byte[]> localVarResp = getLogsForDeploymentWithHttpInfo(appId, deploymentId, follow, tailLines);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using &#x60;appId&#x60; and &#x60;deploymentId&#x60;.
     * @param appId  (required)
     * @param deploymentId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getLogsForDeploymentWithHttpInfo(String appId, Integer deploymentId, Boolean follow, Integer tailLines) throws ApiException {
        okhttp3.Call localVarCall = getLogsForDeploymentValidateBeforeCall(appId, deploymentId, follow, tailLines, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using &#x60;appId&#x60; and &#x60;deploymentId&#x60;.
     * @param appId  (required)
     * @param deploymentId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
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
    public okhttp3.Call getLogsForDeploymentAsync(String appId, Integer deploymentId, Boolean follow, Integer tailLines, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLogsForDeploymentValidateBeforeCall(appId, deploymentId, follow, tailLines, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLogsForProcess
     * @param appId  (required)
     * @param processId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
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
    public okhttp3.Call getLogsForProcessCall(String appId, String processId, Boolean follow, Integer tailLines, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/logs/v1/{appId}/process/{processId}"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()))
            .replace("{" + "processId" + "}", localVarApiClient.escapeString(processId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (follow != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("follow", follow));
        }

        if (tailLines != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tailLines", tailLines));
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "auth0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLogsForProcessValidateBeforeCall(String appId, String processId, Boolean follow, Integer tailLines, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getLogsForProcess(Async)");
        }

        // verify the required parameter 'processId' is set
        if (processId == null) {
            throw new ApiException("Missing the required parameter 'processId' when calling getLogsForProcess(Async)");
        }

        return getLogsForProcessCall(appId, processId, follow, tailLines, _callback);

    }

    /**
     * 
     * Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using &#x60;appId&#x60; and &#x60;processId&#x60;.
     * @param appId  (required)
     * @param processId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getLogsForProcess(String appId, String processId, Boolean follow, Integer tailLines) throws ApiException {
        ApiResponse<byte[]> localVarResp = getLogsForProcessWithHttpInfo(appId, processId, follow, tailLines);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using &#x60;appId&#x60; and &#x60;processId&#x60;.
     * @param appId  (required)
     * @param processId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getLogsForProcessWithHttpInfo(String appId, String processId, Boolean follow, Integer tailLines) throws ApiException {
        okhttp3.Call localVarCall = getLogsForProcessValidateBeforeCall(appId, processId, follow, tailLines, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using &#x60;appId&#x60; and &#x60;processId&#x60;.
     * @param appId  (required)
     * @param processId  (required)
     * @param follow  (optional, default to false)
     * @param tailLines  (optional)
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
    public okhttp3.Call getLogsForProcessAsync(String appId, String processId, Boolean follow, Integer tailLines, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLogsForProcessValidateBeforeCall(appId, processId, follow, tailLines, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
