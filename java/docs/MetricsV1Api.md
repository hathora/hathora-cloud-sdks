# MetricsV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetrics**](MetricsV1Api.md#getMetrics) | **GET** /metrics/v1/{appId}/process/{processId} |  |


<a id="getMetrics"></a>
# **getMetrics**
> RecordPartialMetricNameMetricValueArray getMetrics(appId, processId, metrics, end, start, step)



Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using &#x60;appId&#x60; and &#x60;processId&#x60;.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.MetricsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    MetricsV1Api apiInstance = new MetricsV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    List<MetricName> metrics = Arrays.asList(); // List<MetricName> | Available metrics to query over time.
    Double end = 3.4D; // Double | Unix timestamp. Default is current time.
    Double start = 3.4D; // Double | Unix timestamp. Default is -1 hour from `end`.
    Integer step = 56; // Integer | 
    try {
      RecordPartialMetricNameMetricValueArray result = apiInstance.getMetrics(appId, processId, metrics, end, start, step);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsV1Api#getMetrics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **processId** | **String**|  | |
| **metrics** | [**List&lt;MetricName&gt;**](MetricName.md)| Available metrics to query over time. | [optional] |
| **end** | **Double**| Unix timestamp. Default is current time. | [optional] |
| **start** | **Double**| Unix timestamp. Default is -1 hour from &#x60;end&#x60;. | [optional] |
| **step** | **Integer**|  | [optional] |

### Return type

[**RecordPartialMetricNameMetricValueArray**](RecordPartialMetricNameMetricValueArray.md)

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |
| **422** |  |  -  |

