# LogV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadLogForProcess**](LogV1Api.md#downloadLogForProcess) | **GET** /logs/v1/{appId}/process/{processId}/download |  |
| [**getLogsForApp**](LogV1Api.md#getLogsForApp) | **GET** /logs/v1/{appId}/all |  |
| [**getLogsForDeployment**](LogV1Api.md#getLogsForDeployment) | **GET** /logs/v1/{appId}/deployment/{deploymentId} |  |
| [**getLogsForProcess**](LogV1Api.md#getLogsForProcess) | **GET** /logs/v1/{appId}/process/{processId} |  |


<a name="downloadLogForProcess"></a>
# **downloadLogForProcess**
> byte[] downloadLogForProcess(appId, processId)



Download entire log file for a stopped process.

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    LogV1Api apiInstance = new LogV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      byte[] result = apiInstance.downloadLogForProcess(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogV1Api#downloadLogForProcess");
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

**byte[]**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** |  |  -  |
| **404** |  |  -  |
| **410** |  |  -  |
| **500** |  |  -  |

<a name="getLogsForApp"></a>
# **getLogsForApp**
> byte[] getLogsForApp(appId, follow, tailLines, region)



Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    LogV1Api apiInstance = new LogV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Boolean follow = false; // Boolean | 
    Integer tailLines = 56; // Integer | 
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
| **tailLines** | **Integer**|  | [optional] |
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Los_Angeles, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo] |

### Return type

**byte[]**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

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
> byte[] getLogsForDeployment(appId, deploymentId, follow, tailLines)



Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using &#x60;appId&#x60; and &#x60;deploymentId&#x60;.

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    LogV1Api apiInstance = new LogV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer deploymentId = 56; // Integer | 
    Boolean follow = false; // Boolean | 
    Integer tailLines = 56; // Integer | 
    try {
      byte[] result = apiInstance.getLogsForDeployment(appId, deploymentId, follow, tailLines);
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
| **deploymentId** | **Integer**|  | |
| **follow** | **Boolean**|  | [optional] [default to false] |
| **tailLines** | **Integer**|  | [optional] |

### Return type

**byte[]**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

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



Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using &#x60;appId&#x60; and &#x60;processId&#x60;.

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    LogV1Api apiInstance = new LogV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    Boolean follow = false; // Boolean | 
    Integer tailLines = 56; // Integer | 
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
| **tailLines** | **Integer**|  | [optional] |

### Return type

**byte[]**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** |  |  -  |
| **404** |  |  -  |
| **410** |  |  -  |
| **500** |  |  -  |

