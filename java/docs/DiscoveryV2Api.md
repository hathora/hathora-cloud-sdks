# DiscoveryV2Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPingServiceEndpoints**](DiscoveryV2Api.md#getPingServiceEndpoints) | **GET** /discovery/v2/ping |  |


<a name="getPingServiceEndpoints"></a>
# **getPingServiceEndpoints**
> List&lt;PingEndpointsInner&gt; getPingServiceEndpoints()



Returns an array of all regions with a host and port that a client can directly ping. Open a websocket connection to &#x60;wss://&lt;host&gt;:&lt;port&gt;/ws&#x60; and send a packet. To calculate ping, measure the time it takes to get an echo packet back.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.DiscoveryV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    DiscoveryV2Api apiInstance = new DiscoveryV2Api(defaultClient);
    try {
      List<PingEndpointsInner> result = apiInstance.getPingServiceEndpoints();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryV2Api#getPingServiceEndpoints");
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

[**List&lt;PingEndpointsInner&gt;**](PingEndpointsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

