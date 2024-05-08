# DeploymentV2Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeployment**](DeploymentV2Api.md#createDeployment) | **POST** /deployments/v2/{appId}/create/{buildId} |  |
| [**getDeploymentInfo**](DeploymentV2Api.md#getDeploymentInfo) | **GET** /deployments/v2/{appId}/info/{deploymentId} |  |
| [**getDeployments**](DeploymentV2Api.md#getDeployments) | **GET** /deployments/v2/{appId}/list |  |
| [**getLatestDeployment**](DeploymentV2Api.md#getLatestDeployment) | **GET** /deployments/v2/{appId}/latest |  |


<a name="createDeployment"></a>
# **createDeployment**
> DeploymentV2 createDeployment(appId, buildId, deploymentConfigV2)



Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DeploymentV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    DeploymentV2Api apiInstance = new DeploymentV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer buildId = 56; // Integer | 
    DeploymentConfigV2 deploymentConfigV2 = new DeploymentConfigV2(); // DeploymentConfigV2 | 
    try {
      DeploymentV2 result = apiInstance.createDeployment(appId, buildId, deploymentConfigV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentV2Api#createDeployment");
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
| **buildId** | **Integer**|  | |
| **deploymentConfigV2** | [**DeploymentConfigV2**](DeploymentConfigV2.md)|  | |

### Return type

[**DeploymentV2**](DeploymentV2.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="getDeploymentInfo"></a>
# **getDeploymentInfo**
> DeploymentV2 getDeploymentInfo(appId, deploymentId)



Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DeploymentV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    DeploymentV2Api apiInstance = new DeploymentV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer deploymentId = 56; // Integer | 
    try {
      DeploymentV2 result = apiInstance.getDeploymentInfo(appId, deploymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentV2Api#getDeploymentInfo");
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

### Return type

[**DeploymentV2**](DeploymentV2.md)

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

<a name="getDeployments"></a>
# **getDeployments**
> List&lt;DeploymentV2&gt; getDeployments(appId)



Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DeploymentV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    DeploymentV2Api apiInstance = new DeploymentV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<DeploymentV2> result = apiInstance.getDeployments(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentV2Api#getDeployments");
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

[**List&lt;DeploymentV2&gt;**](DeploymentV2.md)

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

<a name="getLatestDeployment"></a>
# **getLatestDeployment**
> DeploymentV2 getLatestDeployment(appId)



Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DeploymentV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    DeploymentV2Api apiInstance = new DeploymentV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      DeploymentV2 result = apiInstance.getLatestDeployment(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentV2Api#getLatestDeployment");
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

[**DeploymentV2**](DeploymentV2.md)

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

