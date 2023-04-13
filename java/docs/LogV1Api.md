# LogV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLogsForApp**](LogV1Api.md#getLogsForApp) | **GET** /logs/v1/{appId}/all |  |
| [**getLogsForDeployment**](LogV1Api.md#getLogsForDeployment) | **GET** /logs/v1/{appId}/deployment/{deploymentId} |  |
| [**getLogsForProcess**](LogV1Api.md#getLogsForProcess) | **GET** /logs/v1/{appId}/process/{processId} |  |


<a name="getLogsForApp"></a>
# **getLogsForApp**
> byte[] getLogsForApp(appId, follow, tailLines, region)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.LogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    LogV1Api apiInstance = new LogV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Boolean follow = false; // Boolean | 
    Double tailLines = 100D; // Double | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      byte[] result = apiInstance.getLogsForApp(appId, follow, tailLines, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogV1Api#getLogsForApp");
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
| **follow** | **Boolean**|  | [optional] [default to false] |
| **tailLines** | **Double**|  | [optional] [default to 100] |
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo] |

### Return type

**byte[]**

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

<a name="getLogsForDeployment"></a>
# **getLogsForDeployment**
> Object getLogsForDeployment(appId, deploymentId, follow, tailLines)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.LogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    LogV1Api apiInstance = new LogV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Double deploymentId = 3.4D; // Double | 
    Boolean follow = false; // Boolean | 
    Double tailLines = 100D; // Double | 
    try {
      Object result = apiInstance.getLogsForDeployment(appId, deploymentId, follow, tailLines);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogV1Api#getLogsForDeployment");
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
| **deploymentId** | **Double**|  | |
| **follow** | **Boolean**|  | [optional] [default to false] |
| **tailLines** | **Double**|  | [optional] [default to 100] |

### Return type

**Object**

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

<a name="getLogsForProcess"></a>
# **getLogsForProcess**
> byte[] getLogsForProcess(appId, processId, follow, tailLines)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.LogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    LogV1Api apiInstance = new LogV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    Boolean follow = false; // Boolean | 
    Double tailLines = 100D; // Double | 
    try {
      byte[] result = apiInstance.getLogsForProcess(appId, processId, follow, tailLines);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogV1Api#getLogsForProcess");
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
| **follow** | **Boolean**|  | [optional] [default to false] |
| **tailLines** | **Double**|  | [optional] [default to 100] |

### Return type

**byte[]**

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

