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
import com.hathora.client.model.CreateOrgToken;
import com.hathora.client.model.CreatedOrgToken;
import com.hathora.client.model.ListOrgTokens;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OrgTokensV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OrgTokensV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public OrgTokensV1Api(ApiClient apiClient) {
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
     * Build call for createOrgToken
     * @param orgId  (required)
     * @param createOrgToken  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createOrgTokenCall(String orgId, CreateOrgToken createOrgToken, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createOrgToken;

        // create path and map variables
        String localVarPath = "/tokens/v1/orgs/{orgId}/create"
            .replace("{" + "orgId" + "}", localVarApiClient.escapeString(orgId.toString()));

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
    private okhttp3.Call createOrgTokenValidateBeforeCall(String orgId, CreateOrgToken createOrgToken, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling createOrgToken(Async)");
        }

        // verify the required parameter 'createOrgToken' is set
        if (createOrgToken == null) {
            throw new ApiException("Missing the required parameter 'createOrgToken' when calling createOrgToken(Async)");
        }

        return createOrgTokenCall(orgId, createOrgToken, _callback);

    }

    /**
     * 
     * Create a new organization token.
     * @param orgId  (required)
     * @param createOrgToken  (required)
     * @return CreatedOrgToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public CreatedOrgToken createOrgToken(String orgId, CreateOrgToken createOrgToken) throws ApiException {
        ApiResponse<CreatedOrgToken> localVarResp = createOrgTokenWithHttpInfo(orgId, createOrgToken);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a new organization token.
     * @param orgId  (required)
     * @param createOrgToken  (required)
     * @return ApiResponse&lt;CreatedOrgToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreatedOrgToken> createOrgTokenWithHttpInfo(String orgId, CreateOrgToken createOrgToken) throws ApiException {
        okhttp3.Call localVarCall = createOrgTokenValidateBeforeCall(orgId, createOrgToken, null);
        Type localVarReturnType = new TypeToken<CreatedOrgToken>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a new organization token.
     * @param orgId  (required)
     * @param createOrgToken  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createOrgTokenAsync(String orgId, CreateOrgToken createOrgToken, final ApiCallback<CreatedOrgToken> _callback) throws ApiException {

        okhttp3.Call localVarCall = createOrgTokenValidateBeforeCall(orgId, createOrgToken, _callback);
        Type localVarReturnType = new TypeToken<CreatedOrgToken>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOrgTokens
     * @param orgId  (required)
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
    public okhttp3.Call getOrgTokensCall(String orgId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/tokens/v1/orgs/{orgId}"
            .replace("{" + "orgId" + "}", localVarApiClient.escapeString(orgId.toString()));

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
    private okhttp3.Call getOrgTokensValidateBeforeCall(String orgId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling getOrgTokens(Async)");
        }

        return getOrgTokensCall(orgId, _callback);

    }

    /**
     * 
     * List all organization tokens for a given org.
     * @param orgId  (required)
     * @return ListOrgTokens
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ListOrgTokens getOrgTokens(String orgId) throws ApiException {
        ApiResponse<ListOrgTokens> localVarResp = getOrgTokensWithHttpInfo(orgId);
        return localVarResp.getData();
    }

    /**
     * 
     * List all organization tokens for a given org.
     * @param orgId  (required)
     * @return ApiResponse&lt;ListOrgTokens&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListOrgTokens> getOrgTokensWithHttpInfo(String orgId) throws ApiException {
        okhttp3.Call localVarCall = getOrgTokensValidateBeforeCall(orgId, null);
        Type localVarReturnType = new TypeToken<ListOrgTokens>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all organization tokens for a given org.
     * @param orgId  (required)
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
    public okhttp3.Call getOrgTokensAsync(String orgId, final ApiCallback<ListOrgTokens> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOrgTokensValidateBeforeCall(orgId, _callback);
        Type localVarReturnType = new TypeToken<ListOrgTokens>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for revokeOrgToken
     * @param orgId  (required)
     * @param orgTokenId  (required)
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
    public okhttp3.Call revokeOrgTokenCall(String orgId, String orgTokenId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/tokens/v1/orgs/{orgId}/tokens/{orgTokenId}/revoke"
            .replace("{" + "orgId" + "}", localVarApiClient.escapeString(orgId.toString()))
            .replace("{" + "orgTokenId" + "}", localVarApiClient.escapeString(orgTokenId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call revokeOrgTokenValidateBeforeCall(String orgId, String orgTokenId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling revokeOrgToken(Async)");
        }

        // verify the required parameter 'orgTokenId' is set
        if (orgTokenId == null) {
            throw new ApiException("Missing the required parameter 'orgTokenId' when calling revokeOrgToken(Async)");
        }

        return revokeOrgTokenCall(orgId, orgTokenId, _callback);

    }

    /**
     * 
     * Revoke an organization token.
     * @param orgId  (required)
     * @param orgTokenId  (required)
     * @return Boolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Boolean revokeOrgToken(String orgId, String orgTokenId) throws ApiException {
        ApiResponse<Boolean> localVarResp = revokeOrgTokenWithHttpInfo(orgId, orgTokenId);
        return localVarResp.getData();
    }

    /**
     * 
     * Revoke an organization token.
     * @param orgId  (required)
     * @param orgTokenId  (required)
     * @return ApiResponse&lt;Boolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Boolean> revokeOrgTokenWithHttpInfo(String orgId, String orgTokenId) throws ApiException {
        okhttp3.Call localVarCall = revokeOrgTokenValidateBeforeCall(orgId, orgTokenId, null);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Revoke an organization token.
     * @param orgId  (required)
     * @param orgTokenId  (required)
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
    public okhttp3.Call revokeOrgTokenAsync(String orgId, String orgTokenId, final ApiCallback<Boolean> _callback) throws ApiException {

        okhttp3.Call localVarCall = revokeOrgTokenValidateBeforeCall(orgId, orgTokenId, _callback);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
