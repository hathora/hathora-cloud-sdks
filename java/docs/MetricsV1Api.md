# MetricsV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetrics**](MetricsV1Api.md#getMetrics) | **GET** /metrics/v1/{appId}/process/{processId} |  |


<a name="getMetrics"></a>
# **getMetrics**
> RecordPartialMetricNameMetricValueArray getMetrics(appId, processId, metrics, end, start, step)



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
    List<MetricName> metrics = Arrays.asList(); // List<MetricName> | 
    Integer end = 56; // Integer | 
    Integer start = 56; // Integer | 
    Integer step = 60; // Integer | 
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
| **metrics** | [**List&lt;MetricName&gt;**](MetricName.md)|  | [optional] |
| **end** | **Integer**|  | [optional] |
| **start** | **Integer**|  | [optional] |
| **step** | **Integer**|  | [optional] [default to 60] |

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

