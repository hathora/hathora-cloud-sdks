# ProcessesV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProcessInfo**](ProcessesV1Api.md#getProcessInfo) | **GET** /processes/v1/{appId}/info/{processId} |  |
| [**getRunningProcesses**](ProcessesV1Api.md#getRunningProcesses) | **GET** /processes/v1/{appId}/list/running |  |
| [**getStoppedProcesses**](ProcessesV1Api.md#getStoppedProcesses) | **GET** /processes/v1/{appId}/list/stopped |  |


<a name="getProcessInfo"></a>
# **getProcessInfo**
> Process getProcessInfo(appId, processId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.ProcessesV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    ProcessesV1Api apiInstance = new ProcessesV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      Process result = apiInstance.getProcessInfo(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesV1Api#getProcessInfo");
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

### Return type

[**Process**](Process.md)

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

<a name="getRunningProcesses"></a>
# **getRunningProcesses**
> List&lt;ProcessWithRooms&gt; getRunningProcesses(appId, region)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.ProcessesV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    ProcessesV1Api apiInstance = new ProcessesV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      List<ProcessWithRooms> result = apiInstance.getRunningProcesses(appId, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesV1Api#getRunningProcesses");
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
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo] |

### Return type

[**List&lt;ProcessWithRooms&gt;**](ProcessWithRooms.md)

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

<a name="getStoppedProcesses"></a>
# **getStoppedProcesses**
> List&lt;Process&gt; getStoppedProcesses(appId, region)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.ProcessesV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    ProcessesV1Api apiInstance = new ProcessesV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      List<Process> result = apiInstance.getStoppedProcesses(appId, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesV1Api#getStoppedProcesses");
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
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo] |

### Return type

[**List&lt;Process&gt;**](Process.md)

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

