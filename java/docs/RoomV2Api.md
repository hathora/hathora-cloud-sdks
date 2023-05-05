# RoomV2Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRoom**](RoomV2Api.md#createRoom) | **POST** /rooms/v2/{appId}/create |  |
| [**destroyRoom**](RoomV2Api.md#destroyRoom) | **POST** /rooms/v2/{appId}/destroy/{roomId} |  |
| [**getActiveRoomsForProcess**](RoomV2Api.md#getActiveRoomsForProcess) | **GET** /rooms/v2/{appId}/list/{processId}/active |  |
| [**getConnectionInfo**](RoomV2Api.md#getConnectionInfo) | **GET** /rooms/v2/{appId}/connectioninfo/{roomId} |  |
| [**getInactiveRoomsForProcess**](RoomV2Api.md#getInactiveRoomsForProcess) | **GET** /rooms/v2/{appId}/list/{processId}/inactive |  |
| [**getRoomInfo**](RoomV2Api.md#getRoomInfo) | **GET** /rooms/v2/{appId}/info/{roomId} |  |
| [**suspendRoom**](RoomV2Api.md#suspendRoom) | **POST** /rooms/v2/{appId}/suspend/{roomId} |  |


<a name="createRoom"></a>
# **createRoom**
> ConnectionInfoV2 createRoom(appId, createRoomRequest, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.RoomV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    RoomV2Api apiInstance = new RoomV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreateRoomRequest createRoomRequest = new CreateRoomRequest(); // CreateRoomRequest | 
    String roomId = "roomId_example"; // String | 
    try {
      ConnectionInfoV2 result = apiInstance.createRoom(appId, createRoomRequest, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV2Api#createRoom");
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
| **roomId** | **String**|  | [optional] |

### Return type

[**ConnectionInfoV2**](ConnectionInfoV2.md)

### Authorization

[auth0](../README.md#auth0)

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
import com.hathora.client.api.RoomV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    RoomV2Api apiInstance = new RoomV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      apiInstance.destroyRoom(appId, roomId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV2Api#destroyRoom");
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
import com.hathora.client.api.RoomV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    RoomV2Api apiInstance = new RoomV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      List<PickRoomExcludeKeyofRoomAllocations> result = apiInstance.getActiveRoomsForProcess(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV2Api#getActiveRoomsForProcess");
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

<a name="getConnectionInfo"></a>
# **getConnectionInfo**
> ConnectionInfoV2 getConnectionInfo(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.RoomV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    RoomV2Api apiInstance = new RoomV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      ConnectionInfoV2 result = apiInstance.getConnectionInfo(appId, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV2Api#getConnectionInfo");
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

[**ConnectionInfoV2**](ConnectionInfoV2.md)

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
import com.hathora.client.api.RoomV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    RoomV2Api apiInstance = new RoomV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String processId = "processId_example"; // String | 
    try {
      List<PickRoomExcludeKeyofRoomAllocations> result = apiInstance.getInactiveRoomsForProcess(appId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV2Api#getInactiveRoomsForProcess");
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
import com.hathora.client.api.RoomV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    RoomV2Api apiInstance = new RoomV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      Room result = apiInstance.getRoomInfo(appId, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV2Api#getRoomInfo");
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
import com.hathora.client.api.RoomV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    RoomV2Api apiInstance = new RoomV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      apiInstance.suspendRoom(appId, roomId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoomV2Api#suspendRoom");
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

