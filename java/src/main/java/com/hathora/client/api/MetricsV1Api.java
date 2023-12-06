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
import com.hathora.client.model.MetricName;
import com.hathora.client.model.RecordPartialMetricNameMetricValueArray;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MetricsV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MetricsV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public MetricsV1Api(ApiClient apiClient) {
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
     * Build call for getMetrics
     * @param appId  (required)
     * @param processId  (required)
     * @param metrics Available metrics to query over time. (optional)
     * @param end Unix timestamp. Default is current time. (optional)
     * @param start Unix timestamp. Default is -1 hour from &#x60;end&#x60;. (optional)
     * @param step  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetricsCall(String appId, String processId, List<MetricName> metrics, Double end, Double start, Integer step, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/metrics/v1/{appId}/process/{processId}"
            .replace("{" + "appId" + "}", localVarApiClient.escapeString(appId.toString()))
            .replace("{" + "processId" + "}", localVarApiClient.escapeString(processId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (metrics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "metrics", metrics));
        }

        if (end != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end", end));
        }

        if (start != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start", start));
        }

        if (step != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("step", step));
        }

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
    private okhttp3.Call getMetricsValidateBeforeCall(String appId, String processId, List<MetricName> metrics, Double end, Double start, Integer step, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getMetrics(Async)");
        }

        // verify the required parameter 'processId' is set
        if (processId == null) {
            throw new ApiException("Missing the required parameter 'processId' when calling getMetrics(Async)");
        }

        return getMetricsCall(appId, processId, metrics, end, start, step, _callback);

    }

    /**
     * 
     * Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using &#x60;appId&#x60; and &#x60;processId&#x60;.
     * @param appId  (required)
     * @param processId  (required)
     * @param metrics Available metrics to query over time. (optional)
     * @param end Unix timestamp. Default is current time. (optional)
     * @param start Unix timestamp. Default is -1 hour from &#x60;end&#x60;. (optional)
     * @param step  (optional)
     * @return RecordPartialMetricNameMetricValueArray
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public RecordPartialMetricNameMetricValueArray getMetrics(String appId, String processId, List<MetricName> metrics, Double end, Double start, Integer step) throws ApiException {
        ApiResponse<RecordPartialMetricNameMetricValueArray> localVarResp = getMetricsWithHttpInfo(appId, processId, metrics, end, start, step);
        return localVarResp.getData();
    }

    /**
     * 
     * Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using &#x60;appId&#x60; and &#x60;processId&#x60;.
     * @param appId  (required)
     * @param processId  (required)
     * @param metrics Available metrics to query over time. (optional)
     * @param end Unix timestamp. Default is current time. (optional)
     * @param start Unix timestamp. Default is -1 hour from &#x60;end&#x60;. (optional)
     * @param step  (optional)
     * @return ApiResponse&lt;RecordPartialMetricNameMetricValueArray&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RecordPartialMetricNameMetricValueArray> getMetricsWithHttpInfo(String appId, String processId, List<MetricName> metrics, Double end, Double start, Integer step) throws ApiException {
        okhttp3.Call localVarCall = getMetricsValidateBeforeCall(appId, processId, metrics, end, start, step, null);
        Type localVarReturnType = new TypeToken<RecordPartialMetricNameMetricValueArray>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using &#x60;appId&#x60; and &#x60;processId&#x60;.
     * @param appId  (required)
     * @param processId  (required)
     * @param metrics Available metrics to query over time. (optional)
     * @param end Unix timestamp. Default is current time. (optional)
     * @param start Unix timestamp. Default is -1 hour from &#x60;end&#x60;. (optional)
     * @param step  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 422 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 500 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetricsAsync(String appId, String processId, List<MetricName> metrics, Double end, Double start, Integer step, final ApiCallback<RecordPartialMetricNameMetricValueArray> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetricsValidateBeforeCall(appId, processId, metrics, end, start, step, _callback);
        Type localVarReturnType = new TypeToken<RecordPartialMetricNameMetricValueArray>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
