# RoomV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRoomDeprecated**](RoomV1Api.md#createRoomDeprecated) | **POST** /rooms/v1/{appId}/create |  |
| [**destroyRoomDeprecated**](RoomV1Api.md#destroyRoomDeprecated) | **POST** /rooms/v1/{appId}/destroy/{roomId} |  |
| [**getActiveRoomsForProcessDeprecated**](RoomV1Api.md#getActiveRoomsForProcessDeprecated) | **GET** /rooms/v1/{appId}/list/{processId}/active |  |
| [**getConnectionInfoDeprecated**](RoomV1Api.md#getConnectionInfoDeprecated) | **GET** /rooms/v1/{appId}/connectioninfo/{roomId} |  |
| [**getInactiveRoomsForProcessDeprecated**](RoomV1Api.md#getInactiveRoomsForProcessDeprecated) | **GET** /rooms/v1/{appId}/list/{processId}/inactive |  |
| [**getRoomInfoDeprecated**](RoomV1Api.md#getRoomInfoDeprecated) | **GET** /rooms/v1/{appId}/info/{roomId} |  |
| [**suspendRoomDeprecated**](RoomV1Api.md#suspendRoomDeprecated) | **POST** /rooms/v1/{appId}/suspend/{roomId} |  |


<a name="createRoomDeprecated"></a>
# **createRoomDeprecated**
> String createRoomDeprecated(appId, createRoomParams, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.RoomV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    RoomV1Api apiInstance = new RoomV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreateRoomParams createRoomParams = new CreateRoomParams(); // CreateRoomParams | 
    String roomId = "roomId_example"; // String | 
    try {
      String result = apiInstance.createRoomDeprecated(appId, createRoomParams, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV1Api#createRoomDeprecated");
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
| **createRoomParams** | [**CreateRoomParams**](CreateRoomParams.md)|  | |
| **roomId** | **String**|  | [optional] |

### Return type

**String**

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
| **402** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="destroyRoomDeprecated"></a>
# **destroyRoomDeprecated**
> destroyRoomDeprecated(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.RoomV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    RoomV1Api apiInstance = new RoomV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      apiInstance.destroyRoomDeprecated(appId, roomId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV1Api#destroyRoomDeprecated");
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

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="getActiveRoomsForProcessDeprecated"></a>
# **getActiveRoomsForProcessDeprecated**
> List&lt;PickRoomExcludeKeyofRoomAllocations&gt; getActiveRoomsForProcessDeprecated(appId, processId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.RoomV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    RoomV1Api apiInstance = new RoomV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      List<PickRoomExcludeKeyofRoomAllocations> result = apiInstance.getActiveRoomsForProcessDeprecated(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV1Api#getActiveRoomsForProcessDeprecated");
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

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

<a name="getConnectionInfoDeprecated"></a>
# **getConnectionInfoDeprecated**
> ConnectionInfo getConnectionInfoDeprecated(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.RoomV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    RoomV1Api apiInstance = new RoomV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      ConnectionInfo result = apiInstance.getConnectionInfoDeprecated(appId, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV1Api#getConnectionInfoDeprecated");
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
| **400** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="getInactiveRoomsForProcessDeprecated"></a>
# **getInactiveRoomsForProcessDeprecated**
> List&lt;PickRoomExcludeKeyofRoomAllocations&gt; getInactiveRoomsForProcessDeprecated(appId, processId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.RoomV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    RoomV1Api apiInstance = new RoomV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      List<PickRoomExcludeKeyofRoomAllocations> result = apiInstance.getInactiveRoomsForProcessDeprecated(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV1Api#getInactiveRoomsForProcessDeprecated");
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

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

<a name="getRoomInfoDeprecated"></a>
# **getRoomInfoDeprecated**
> Room getRoomInfoDeprecated(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.RoomV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    RoomV1Api apiInstance = new RoomV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      Room result = apiInstance.getRoomInfoDeprecated(appId, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV1Api#getRoomInfoDeprecated");
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

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

<a name="suspendRoomDeprecated"></a>
# **suspendRoomDeprecated**
> suspendRoomDeprecated(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.RoomV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    RoomV1Api apiInstance = new RoomV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      apiInstance.suspendRoomDeprecated(appId, roomId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV1Api#suspendRoomDeprecated");
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

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

