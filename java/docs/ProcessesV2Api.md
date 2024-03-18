# ProcessesV2Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLatestProcesses**](ProcessesV2Api.md#getLatestProcesses) | **GET** /processes/v2/{appId}/list/latest |  |
| [**getProcessInfo**](ProcessesV2Api.md#getProcessInfo) | **GET** /processes/v2/{appId}/info/{processId} |  |
| [**stopProcess**](ProcessesV2Api.md#stopProcess) | **POST** /processes/v2/{appId}/stop/{processId} |  |


<a name="getLatestProcesses"></a>
# **getLatestProcesses**
> List&lt;ProcessV2&gt; getLatestProcesses(appId, status, region)



Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a &#x60;status&#x60; or &#x60;region&#x60;.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.ProcessesV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    ProcessesV2Api apiInstance = new ProcessesV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    List<ProcessStatus> status = Arrays.asList(); // List<ProcessStatus> | 
    List<Region> region = Arrays.asList(); // List<Region> | 
    try {
      List<ProcessV2> result = apiInstance.getLatestProcesses(appId, status, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesV2Api#getLatestProcesses");
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
| **status** | [**List&lt;ProcessStatus&gt;**](ProcessStatus.md)|  | [optional] |
| **region** | [**List&lt;Region&gt;**](Region.md)|  | [optional] |

### Return type

[**List&lt;ProcessV2&gt;**](ProcessV2.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

<a name="getProcessInfo"></a>
# **getProcessInfo**
> ProcessV2 getProcessInfo(appId, processId)



Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.ProcessesV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    ProcessesV2Api apiInstance = new ProcessesV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      ProcessV2 result = apiInstance.getProcessInfo(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesV2Api#getProcessInfo");
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

[**ProcessV2**](ProcessV2.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

<a name="stopProcess"></a>
# **stopProcess**
> stopProcess(appId, processId)



Stops a [process](https://hathora.dev/docs/concepts/hathora-entities#process) immediately.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.ProcessesV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    ProcessesV2Api apiInstance = new ProcessesV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      apiInstance.stopProcess(appId, processId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesV2Api#stopProcess");
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

null (empty response body)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

