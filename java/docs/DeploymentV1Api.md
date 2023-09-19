# DeploymentV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeployment**](DeploymentV1Api.md#createDeployment) | **POST** /deployments/v1/{appId}/create/{buildId} |  |
| [**getDeploymentInfo**](DeploymentV1Api.md#getDeploymentInfo) | **GET** /deployments/v1/{appId}/info/{deploymentId} |  |
| [**getDeployments**](DeploymentV1Api.md#getDeployments) | **GET** /deployments/v1/{appId}/list |  |


<a name="createDeployment"></a>
# **createDeployment**
> Deployment createDeployment(appId, buildId, deploymentConfig)



Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DeploymentV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    DeploymentV1Api apiInstance = new DeploymentV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer buildId = 56; // Integer | 
    DeploymentConfig deploymentConfig = new DeploymentConfig(); // DeploymentConfig | 
    try {
      Deployment result = apiInstance.createDeployment(appId, buildId, deploymentConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentV1Api#createDeployment");
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
| **deploymentConfig** | [**DeploymentConfig**](DeploymentConfig.md)|  | |

### Return type

[**Deployment**](Deployment.md)

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
| **404** |  |  -  |
| **500** |  |  -  |

<a name="getDeploymentInfo"></a>
# **getDeploymentInfo**
> Deployment getDeploymentInfo(appId, deploymentId)



Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DeploymentV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    DeploymentV1Api apiInstance = new DeploymentV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer deploymentId = 56; // Integer | 
    try {
      Deployment result = apiInstance.getDeploymentInfo(appId, deploymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentV1Api#getDeploymentInfo");
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

[**Deployment**](Deployment.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

<a name="getDeployments"></a>
# **getDeployments**
> List&lt;Deployment&gt; getDeployments(appId)



Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DeploymentV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    DeploymentV1Api apiInstance = new DeploymentV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<Deployment> result = apiInstance.getDeployments(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentV1Api#getDeployments");
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

[**List&lt;Deployment&gt;**](Deployment.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

