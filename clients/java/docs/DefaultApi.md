# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApp**](DefaultApi.md#createApp) | **POST** /apps/v1/create |  |
| [**createBuild**](DefaultApi.md#createBuild) | **POST** /builds/v1/{appId}/create |  |
| [**createDeployment**](DefaultApi.md#createDeployment) | **POST** /deployments/v1/{appId}/create/{buildId} |  |
| [**createPrivateLobby**](DefaultApi.md#createPrivateLobby) | **POST** /lobby/v1/{appId}/create/private |  |
| [**createPublicLobby**](DefaultApi.md#createPublicLobby) | **POST** /lobby/v1/{appId}/create/public |  |
| [**createRoom**](DefaultApi.md#createRoom) | **POST** /rooms/v1/{appId}/create |  |
| [**deleteApp**](DefaultApi.md#deleteApp) | **DELETE** /apps/v1/delete/{appId} |  |
| [**deleteBuild**](DefaultApi.md#deleteBuild) | **DELETE** /builds/v1/{appId}/delete/{buildId} |  |
| [**destroyRoom**](DefaultApi.md#destroyRoom) | **POST** /rooms/v1/{appId}/destroy/{roomId} |  |
| [**getActiveRoomsForProcess**](DefaultApi.md#getActiveRoomsForProcess) | **GET** /rooms/v1/{appId}/list/{processId}/active |  |
| [**getAppInfo**](DefaultApi.md#getAppInfo) | **GET** /apps/v1/info/{appId} |  |
| [**getApps**](DefaultApi.md#getApps) | **GET** /apps/v1/list |  |
| [**getBuildInfo**](DefaultApi.md#getBuildInfo) | **GET** /builds/v1/{appId}/info/{buildId} |  |
| [**getBuilds**](DefaultApi.md#getBuilds) | **GET** /builds/v1/{appId}/list |  |
| [**getConnectionInfo**](DefaultApi.md#getConnectionInfo) | **GET** /rooms/v1/{appId}/connectioninfo/{roomId} |  |
| [**getDeploymentInfo**](DefaultApi.md#getDeploymentInfo) | **GET** /deployments/v1/{appId}/info/{deploymentId} |  |
| [**getDeployments**](DefaultApi.md#getDeployments) | **GET** /deployments/v1/{appId}/list |  |
| [**getInactiveRoomsForProcess**](DefaultApi.md#getInactiveRoomsForProcess) | **GET** /rooms/v1/{appId}/list/{processId}/inactive |  |
| [**getLogsForApp**](DefaultApi.md#getLogsForApp) | **GET** /logs/v1/{appId}/all |  |
| [**getLogsForDeployment**](DefaultApi.md#getLogsForDeployment) | **GET** /logs/v1/{appId}/deployment/{deploymentId} |  |
| [**getLogsForProcess**](DefaultApi.md#getLogsForProcess) | **GET** /logs/v1/{appId}/process/{processId} |  |
| [**getMetrics**](DefaultApi.md#getMetrics) | **GET** /metrics/v1/{appId}/process/{processId} |  |
| [**getProcessInfo**](DefaultApi.md#getProcessInfo) | **GET** /processes/v1/{appId}/info/{processId} |  |
| [**getRoomInfo**](DefaultApi.md#getRoomInfo) | **GET** /rooms/v1/{appId}/info/{roomId} |  |
| [**getRunningProcesses**](DefaultApi.md#getRunningProcesses) | **GET** /processes/v1/{appId}/list/running |  |
| [**getStoppedProcesses**](DefaultApi.md#getStoppedProcesses) | **GET** /processes/v1/{appId}/list/stopped |  |
| [**listActivePublicLobbies**](DefaultApi.md#listActivePublicLobbies) | **GET** /lobby/v1/{appId}/list |  |
| [**loginAnonymous**](DefaultApi.md#loginAnonymous) | **POST** /auth/v1/{appId}/login/anonymous |  |
| [**loginGoogle**](DefaultApi.md#loginGoogle) | **POST** /auth/v1/{appId}/login/google |  |
| [**loginNickname**](DefaultApi.md#loginNickname) | **POST** /auth/v1/{appId}/login/nickname |  |
| [**runBuild**](DefaultApi.md#runBuild) | **POST** /builds/v1/{appId}/run/{buildId} |  |
| [**suspendRoom**](DefaultApi.md#suspendRoom) | **POST** /rooms/v1/{appId}/suspend/{roomId} |  |
| [**updateApp**](DefaultApi.md#updateApp) | **POST** /apps/v1/update/{appId} |  |


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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CreateAppRequest createAppRequest = new CreateAppRequest(); // CreateAppRequest | 
    try {
      Application result = apiInstance.createApp(createAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createApp");
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

<a name="createBuild"></a>
# **createBuild**
> Build createBuild(appId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      Build result = apiInstance.createBuild(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createBuild");
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

[**Build**](Build.md)

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
| **422** |  |  -  |
| **500** |  |  -  |

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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    Double buildId = 3.4D; // Double | 
    DeploymentConfig deploymentConfig = new DeploymentConfig(); // DeploymentConfig | 
    try {
      Deployment result = apiInstance.createDeployment(appId, buildId, deploymentConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createDeployment");
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

<a name="createPrivateLobby"></a>
# **createPrivateLobby**
> String createPrivateLobby(appId, authorization, region, local)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String authorization = "authorization_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    Boolean local = false; // Boolean | 
    try {
      String result = apiInstance.createPrivateLobby(appId, authorization, region, local);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createPrivateLobby");
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
| **authorization** | **String**|  | |
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo] |
| **local** | **Boolean**|  | [optional] [default to false] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="createPublicLobby"></a>
# **createPublicLobby**
> String createPublicLobby(appId, authorization, region, local)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String authorization = "authorization_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    Boolean local = false; // Boolean | 
    try {
      String result = apiInstance.createPublicLobby(appId, authorization, region, local);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createPublicLobby");
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
| **authorization** | **String**|  | |
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo] |
| **local** | **Boolean**|  | [optional] [default to false] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="createRoom"></a>
# **createRoom**
> String createRoom(appId, createRoomRequest)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    CreateRoomRequest createRoomRequest = new CreateRoomRequest(); // CreateRoomRequest | 
    try {
      String result = apiInstance.createRoom(appId, createRoomRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createRoom");
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
| **createRoomRequest** | [**CreateRoomRequest**](CreateRoomRequest.md)|  | |

### Return type

**String**

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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      apiInstance.deleteApp(appId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteApp");
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

<a name="deleteBuild"></a>
# **deleteBuild**
> deleteBuild(appId, buildId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    Double buildId = 3.4D; // Double | 
    try {
      apiInstance.deleteBuild(appId, buildId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteBuild");
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
| **422** |  |  -  |
| **500** |  |  -  |

<a name="destroyRoom"></a>
# **destroyRoom**
> destroyRoom(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      apiInstance.destroyRoom(appId, roomId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#destroyRoom");
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
| **roomId** | **String**|  | |

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

<a name="getActiveRoomsForProcess"></a>
# **getActiveRoomsForProcess**
> List&lt;PickRoomExcludeKeyofRoomAllocations&gt; getActiveRoomsForProcess(appId, processId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      List<PickRoomExcludeKeyofRoomAllocations> result = apiInstance.getActiveRoomsForProcess(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getActiveRoomsForProcess");
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

[**List&lt;PickRoomExcludeKeyofRoomAllocations&gt;**](PickRoomExcludeKeyofRoomAllocations.md)

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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      Application result = apiInstance.getAppInfo(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAppInfo");
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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<ApplicationWithDeployment> result = apiInstance.getApps();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getApps");
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

<a name="getBuildInfo"></a>
# **getBuildInfo**
> Build getBuildInfo(appId, buildId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    Double buildId = 3.4D; // Double | 
    try {
      Build result = apiInstance.getBuildInfo(appId, buildId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getBuildInfo");
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

### Return type

[**Build**](Build.md)

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

<a name="getBuilds"></a>
# **getBuilds**
> List&lt;Build&gt; getBuilds(appId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<Build> result = apiInstance.getBuilds(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getBuilds");
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

[**List&lt;Build&gt;**](Build.md)

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

<a name="getConnectionInfo"></a>
# **getConnectionInfo**
> ConnectionInfo getConnectionInfo(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      ConnectionInfo result = apiInstance.getConnectionInfo(appId, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getConnectionInfo");
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
| **roomId** | **String**|  | |

### Return type

[**ConnectionInfo**](ConnectionInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    Double deploymentId = 3.4D; // Double | 
    try {
      Deployment result = apiInstance.getDeploymentInfo(appId, deploymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getDeploymentInfo");
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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<Deployment> result = apiInstance.getDeployments(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getDeployments");
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

<a name="getInactiveRoomsForProcess"></a>
# **getInactiveRoomsForProcess**
> List&lt;PickRoomExcludeKeyofRoomAllocations&gt; getInactiveRoomsForProcess(appId, processId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      List<PickRoomExcludeKeyofRoomAllocations> result = apiInstance.getInactiveRoomsForProcess(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getInactiveRoomsForProcess");
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

[**List&lt;PickRoomExcludeKeyofRoomAllocations&gt;**](PickRoomExcludeKeyofRoomAllocations.md)

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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    Boolean follow = false; // Boolean | 
    Double tailLines = 100D; // Double | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      byte[] result = apiInstance.getLogsForApp(appId, follow, tailLines, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getLogsForApp");
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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    Double deploymentId = 3.4D; // Double | 
    Boolean follow = false; // Boolean | 
    Double tailLines = 100D; // Double | 
    try {
      Object result = apiInstance.getLogsForDeployment(appId, deploymentId, follow, tailLines);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getLogsForDeployment");
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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    Boolean follow = false; // Boolean | 
    Double tailLines = 100D; // Double | 
    try {
      byte[] result = apiInstance.getLogsForProcess(appId, processId, follow, tailLines);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getLogsForProcess");
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

<a name="getMetrics"></a>
# **getMetrics**
> RecordPartialMetricNameMetricValueArray getMetrics(appId, processId, metrics, end, start, step)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    List<MetricName> metrics = Arrays.asList(); // List<MetricName> | 
    Double end = 3.4D; // Double | 
    Double start = 3.4D; // Double | 
    Double step = 60D; // Double | 
    try {
      RecordPartialMetricNameMetricValueArray result = apiInstance.getMetrics(appId, processId, metrics, end, start, step);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getMetrics");
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
| **metrics** | [**List&lt;MetricName&gt;**](MetricName.md)|  | [optional] |
| **end** | **Double**|  | [optional] |
| **start** | **Double**|  | [optional] |
| **step** | **Double**|  | [optional] [default to 60] |

### Return type

[**RecordPartialMetricNameMetricValueArray**](RecordPartialMetricNameMetricValueArray.md)

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
| **422** |  |  -  |

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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      Process result = apiInstance.getProcessInfo(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getProcessInfo");
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

<a name="getRoomInfo"></a>
# **getRoomInfo**
> Room getRoomInfo(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      Room result = apiInstance.getRoomInfo(appId, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRoomInfo");
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
| **roomId** | **String**|  | |

### Return type

[**Room**](Room.md)

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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      List<ProcessWithRooms> result = apiInstance.getRunningProcesses(appId, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRunningProcesses");
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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      List<Process> result = apiInstance.getStoppedProcesses(appId, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getStoppedProcesses");
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

<a name="listActivePublicLobbies"></a>
# **listActivePublicLobbies**
> List&lt;Lobby&gt; listActivePublicLobbies(appId, authorization, local, region)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String authorization = "authorization_example"; // String | 
    Boolean local = false; // Boolean | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      List<Lobby> result = apiInstance.listActivePublicLobbies(appId, authorization, local, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listActivePublicLobbies");
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
| **authorization** | **String**|  | |
| **local** | **Boolean**|  | [optional] [default to false] |
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo] |

### Return type

[**List&lt;Lobby&gt;**](Lobby.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

<a name="loginAnonymous"></a>
# **loginAnonymous**
> LoginAnonymous200Response loginAnonymous(appId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      LoginAnonymous200Response result = apiInstance.loginAnonymous(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#loginAnonymous");
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

[**LoginAnonymous200Response**](LoginAnonymous200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

<a name="loginGoogle"></a>
# **loginGoogle**
> LoginAnonymous200Response loginGoogle(appId, loginGoogleRequest)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    LoginGoogleRequest loginGoogleRequest = new LoginGoogleRequest(); // LoginGoogleRequest | 
    try {
      LoginAnonymous200Response result = apiInstance.loginGoogle(appId, loginGoogleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#loginGoogle");
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
| **loginGoogleRequest** | [**LoginGoogleRequest**](LoginGoogleRequest.md)|  | |

### Return type

[**LoginAnonymous200Response**](LoginAnonymous200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

<a name="loginNickname"></a>
# **loginNickname**
> LoginAnonymous200Response loginNickname(appId, loginNicknameRequest)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    LoginNicknameRequest loginNicknameRequest = new LoginNicknameRequest(); // LoginNicknameRequest | 
    try {
      LoginAnonymous200Response result = apiInstance.loginNickname(appId, loginNicknameRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#loginNickname");
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
| **loginNicknameRequest** | [**LoginNicknameRequest**](LoginNicknameRequest.md)|  | |

### Return type

[**LoginAnonymous200Response**](LoginAnonymous200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

<a name="runBuild"></a>
# **runBuild**
> byte[] runBuild(appId, buildId, _file)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    Double buildId = 3.4D; // Double | 
    File _file = new File("/path/to/file"); // File | 
    try {
      byte[] result = apiInstance.runBuild(appId, buildId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#runBuild");
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
| **_file** | **File**|  | |

### Return type

**byte[]**

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="suspendRoom"></a>
# **suspendRoom**
> suspendRoom(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      apiInstance.suspendRoom(appId, roomId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#suspendRoom");
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
| **roomId** | **String**|  | |

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
import com.hathora.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    CreateAppRequest createAppRequest = new CreateAppRequest(); // CreateAppRequest | 
    try {
      Application result = apiInstance.updateApp(appId, createAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateApp");
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

