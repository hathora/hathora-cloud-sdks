# AppV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApp**](AppV1Api.md#createApp) | **POST** /apps/v1/create |  |
| [**deleteApp**](AppV1Api.md#deleteApp) | **DELETE** /apps/v1/delete/{appId} |  |
| [**getAppInfo**](AppV1Api.md#getAppInfo) | **GET** /apps/v1/info/{appId} |  |
| [**getApps**](AppV1Api.md#getApps) | **GET** /apps/v1/list |  |
| [**updateApp**](AppV1Api.md#updateApp) | **POST** /apps/v1/update/{appId} |  |


<a name="createApp"></a>
# **createApp**
> Application createApp(createAppRequest)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.AppV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    AppV1Api apiInstance = new AppV1Api(defaultClient);
    CreateAppRequest createAppRequest = new CreateAppRequest(); // CreateAppRequest | 
    try {
      Application result = apiInstance.createApp(createAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppV1Api#createApp");
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
| **createAppRequest** | [**CreateAppRequest**](CreateAppRequest.md)|  | |

### Return type

[**Application**](Application.md)

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **422** |  |  -  |
| **500** |  |  -  |

<a name="deleteApp"></a>
# **deleteApp**
> deleteApp(appId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.AppV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    AppV1Api apiInstance = new AppV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      apiInstance.deleteApp(appId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppV1Api#deleteApp");
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

### Return type

null (empty response body)

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="getAppInfo"></a>
# **getAppInfo**
> Application getAppInfo(appId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.AppV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    AppV1Api apiInstance = new AppV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      Application result = apiInstance.getAppInfo(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppV1Api#getAppInfo");
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

### Return type

[**Application**](Application.md)

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

<a name="getApps"></a>
# **getApps**
> List&lt;ApplicationWithDeployment&gt; getApps()



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.AppV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    AppV1Api apiInstance = new AppV1Api(defaultClient);
    try {
      List<ApplicationWithDeployment> result = apiInstance.getApps();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppV1Api#getApps");
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

[**List&lt;ApplicationWithDeployment&gt;**](ApplicationWithDeployment.md)

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="updateApp"></a>
# **updateApp**
> Application updateApp(appId, createAppRequest)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.AppV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    AppV1Api apiInstance = new AppV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreateAppRequest createAppRequest = new CreateAppRequest(); // CreateAppRequest | 
    try {
      Application result = apiInstance.updateApp(appId, createAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppV1Api#updateApp");
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
| **createAppRequest** | [**CreateAppRequest**](CreateAppRequest.md)|  | |

### Return type

[**Application**](Application.md)

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

