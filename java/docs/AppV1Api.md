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
> Application createApp(appConfig)



Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    AppV1Api apiInstance = new AppV1Api(defaultClient);
    AppConfig appConfig = new AppConfig(); // AppConfig | 
    try {
      Application result = apiInstance.createApp(appConfig);
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
| **appConfig** | [**AppConfig**](AppConfig.md)|  | |

### Return type

[**Application**](Application.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **422** |  |  -  |
| **500** |  |  -  |

<a name="deleteApp"></a>
# **deleteApp**
> deleteApp(appId)



Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;. Your organization will lose access to this application.

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

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

<a name="getAppInfo"></a>
# **getAppInfo**
> Application getAppInfo(appId)



Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

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

<a name="getApps"></a>
# **getApps**
> List&lt;ApplicationWithLatestDeploymentAndBuild&gt; getApps()



Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an &#x60;appId&#x60;.

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    AppV1Api apiInstance = new AppV1Api(defaultClient);
    try {
      List<ApplicationWithLatestDeploymentAndBuild> result = apiInstance.getApps();
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

[**List&lt;ApplicationWithLatestDeploymentAndBuild&gt;**](ApplicationWithLatestDeploymentAndBuild.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="updateApp"></a>
# **updateApp**
> Application updateApp(appId, appConfig)



Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    AppV1Api apiInstance = new AppV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    AppConfig appConfig = new AppConfig(); // AppConfig | 
    try {
      Application result = apiInstance.updateApp(appId, appConfig);
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
| **appConfig** | [**AppConfig**](AppConfig.md)|  | |

### Return type

[**Application**](Application.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **500** |  |  -  |

