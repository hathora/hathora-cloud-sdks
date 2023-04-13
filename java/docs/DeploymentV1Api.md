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
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DeploymentV1Api apiInstance = new DeploymentV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Double buildId = 3.4D; // Double | 
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
| **buildId** | **Double**|  | |
| **deploymentConfig** | [**DeploymentConfig**](DeploymentConfig.md)|  | |

### Return type

[**Deployment**](Deployment.md)

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
| **422** |  |  -  |
| **500** |  |  -  |

<a name="getDeploymentInfo"></a>
# **getDeploymentInfo**
> Deployment getDeploymentInfo(appId, deploymentId)



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
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DeploymentV1Api apiInstance = new DeploymentV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Double deploymentId = 3.4D; // Double | 
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
| **deploymentId** | **Double**|  | |

### Return type

[**Deployment**](Deployment.md)

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

<a name="getDeployments"></a>
# **getDeployments**
> List&lt;Deployment&gt; getDeployments(appId)



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
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

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

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

