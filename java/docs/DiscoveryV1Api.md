# DiscoveryV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPingServiceEndpoints**](DiscoveryV1Api.md#getPingServiceEndpoints) | **GET** /discovery/v1/ping |  |


<a name="getPingServiceEndpoints"></a>
# **getPingServiceEndpoints**
> List&lt;DiscoveryResponseInner&gt; getPingServiceEndpoints()



Returns an array of all regions with a host and port that a client can directly ping.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.DiscoveryV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    DiscoveryV1Api apiInstance = new DiscoveryV1Api(defaultClient);
    try {
      List<DiscoveryResponseInner> result = apiInstance.getPingServiceEndpoints();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryV1Api#getPingServiceEndpoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DiscoveryResponseInner&gt;**](DiscoveryResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

