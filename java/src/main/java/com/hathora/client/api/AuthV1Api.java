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


import com.hathora.client.model.LoginAnonymous200Response;
import com.hathora.client.model.LoginGoogleRequest;
import com.hathora.client.model.LoginNicknameRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthV1Api(ApiClient apiClient) {
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
     * Build call for loginAnonymous
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
    public okhttp3.Call loginAnonymousCall(String appId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth/v1/{appId}/login/anonymous"
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call loginAnonymousValidateBeforeCall(String appId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling loginAnonymous(Async)");
        }

        return loginAnonymousCall(appId, _callback);

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @return LoginAnonymous200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public LoginAnonymous200Response loginAnonymous(String appId) throws ApiException {
        ApiResponse<LoginAnonymous200Response> localVarResp = loginAnonymousWithHttpInfo(appId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @return ApiResponse&lt;LoginAnonymous200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LoginAnonymous200Response> loginAnonymousWithHttpInfo(String appId) throws ApiException {
        okhttp3.Call localVarCall = loginAnonymousValidateBeforeCall(appId, null);
        Type localVarReturnType = new TypeToken<LoginAnonymous200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
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
    public okhttp3.Call loginAnonymousAsync(String appId, final ApiCallback<LoginAnonymous200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = loginAnonymousValidateBeforeCall(appId, _callback);
        Type localVarReturnType = new TypeToken<LoginAnonymous200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for loginGoogle
     * @param appId  (required)
     * @param loginGoogleRequest  (required)
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
    public okhttp3.Call loginGoogleCall(String appId, LoginGoogleRequest loginGoogleRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = loginGoogleRequest;

        // create path and map variables
        String localVarPath = "/auth/v1/{appId}/login/google"
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call loginGoogleValidateBeforeCall(String appId, LoginGoogleRequest loginGoogleRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling loginGoogle(Async)");
        }

        // verify the required parameter 'loginGoogleRequest' is set
        if (loginGoogleRequest == null) {
            throw new ApiException("Missing the required parameter 'loginGoogleRequest' when calling loginGoogle(Async)");
        }

        return loginGoogleCall(appId, loginGoogleRequest, _callback);

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param loginGoogleRequest  (required)
     * @return LoginAnonymous200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public LoginAnonymous200Response loginGoogle(String appId, LoginGoogleRequest loginGoogleRequest) throws ApiException {
        ApiResponse<LoginAnonymous200Response> localVarResp = loginGoogleWithHttpInfo(appId, loginGoogleRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param loginGoogleRequest  (required)
     * @return ApiResponse&lt;LoginAnonymous200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LoginAnonymous200Response> loginGoogleWithHttpInfo(String appId, LoginGoogleRequest loginGoogleRequest) throws ApiException {
        okhttp3.Call localVarCall = loginGoogleValidateBeforeCall(appId, loginGoogleRequest, null);
        Type localVarReturnType = new TypeToken<LoginAnonymous200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (required)
     * @param loginGoogleRequest  (required)
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
    public okhttp3.Call loginGoogleAsync(String appId, LoginGoogleRequest loginGoogleRequest, final ApiCallback<LoginAnonymous200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = loginGoogleValidateBeforeCall(appId, loginGoogleRequest, _callback);
        Type localVarReturnType = new TypeToken<LoginAnonymous200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for loginNickname
     * @param appId  (required)
     * @param loginNicknameRequest  (required)
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
    public okhttp3.Call loginNicknameCall(String appId, LoginNicknameRequest loginNicknameRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = loginNicknameRequest;

        // create path and map variables
        String localVarPath = "/auth/v1/{appId}/login/nickname"
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call loginNicknameValidateBeforeCall(String appId, LoginNicknameRequest loginNicknameRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling loginNickname(Async)");
        }

        // verify the required parameter 'loginNicknameRequest' is set
        if (loginNicknameRequest == null) {
            throw new ApiException("Missing the required parameter 'loginNicknameRequest' when calling loginNickname(Async)");
        }

        return loginNicknameCall(appId, loginNicknameRequest, _callback);

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param loginNicknameRequest  (required)
     * @return LoginAnonymous200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public LoginAnonymous200Response loginNickname(String appId, LoginNicknameRequest loginNicknameRequest) throws ApiException {
        ApiResponse<LoginAnonymous200Response> localVarResp = loginNicknameWithHttpInfo(appId, loginNicknameRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param loginNicknameRequest  (required)
     * @return ApiResponse&lt;LoginAnonymous200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LoginAnonymous200Response> loginNicknameWithHttpInfo(String appId, LoginNicknameRequest loginNicknameRequest) throws ApiException {
        okhttp3.Call localVarCall = loginNicknameValidateBeforeCall(appId, loginNicknameRequest, null);
        Type localVarReturnType = new TypeToken<LoginAnonymous200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (required)
     * @param loginNicknameRequest  (required)
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
    public okhttp3.Call loginNicknameAsync(String appId, LoginNicknameRequest loginNicknameRequest, final ApiCallback<LoginAnonymous200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = loginNicknameValidateBeforeCall(appId, loginNicknameRequest, _callback);
        Type localVarReturnType = new TypeToken<LoginAnonymous200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}