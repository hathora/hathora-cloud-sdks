# LobbyV2Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLobby**](LobbyV2Api.md#createLobby) | **POST** /lobby/v2/{appId}/create |  |
| [**createLocalLobby**](LobbyV2Api.md#createLocalLobby) | **POST** /lobby/v2/{appId}/create/local |  |
| [**createPrivateLobby**](LobbyV2Api.md#createPrivateLobby) | **POST** /lobby/v2/{appId}/create/private |  |
| [**createPublicLobby**](LobbyV2Api.md#createPublicLobby) | **POST** /lobby/v2/{appId}/create/public |  |
| [**getLobbyInfo**](LobbyV2Api.md#getLobbyInfo) | **GET** /lobby/v2/{appId}/info/{roomId} |  |
| [**listActivePublicLobbies**](LobbyV2Api.md#listActivePublicLobbies) | **GET** /lobby/v2/{appId}/list/public |  |
| [**setLobbyState**](LobbyV2Api.md#setLobbyState) | **POST** /lobby/v2/{appId}/setState/{roomId} |  |


<a name="createLobby"></a>
# **createLobby**
> Lobby createLobby(appId, authorization, createLobbyRequest, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String authorization = "authorization_example"; // String | 
    CreateLobbyRequest createLobbyRequest = new CreateLobbyRequest(); // CreateLobbyRequest | 
    String roomId = "roomId_example"; // String | 
    try {
      Lobby result = apiInstance.createLobby(appId, authorization, createLobbyRequest, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV2Api#createLobby");
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
| **createLobbyRequest** | [**CreateLobbyRequest**](CreateLobbyRequest.md)|  | |
| **roomId** | **String**|  | [optional] |

### Return type

[**Lobby**](Lobby.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="createLocalLobby"></a>
# **createLocalLobby**
> Lobby createLocalLobby(appId, authorization, createPrivateLobbyRequest, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String authorization = "authorization_example"; // String | 
    CreatePrivateLobbyRequest createPrivateLobbyRequest = new CreatePrivateLobbyRequest(); // CreatePrivateLobbyRequest | 
    String roomId = "roomId_example"; // String | 
    try {
      Lobby result = apiInstance.createLocalLobby(appId, authorization, createPrivateLobbyRequest, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV2Api#createLocalLobby");
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
| **createPrivateLobbyRequest** | [**CreatePrivateLobbyRequest**](CreatePrivateLobbyRequest.md)|  | |
| **roomId** | **String**|  | [optional] |

### Return type

[**Lobby**](Lobby.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="createPrivateLobby"></a>
# **createPrivateLobby**
> Lobby createPrivateLobby(appId, authorization, createPrivateLobbyRequest, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String authorization = "authorization_example"; // String | 
    CreatePrivateLobbyRequest createPrivateLobbyRequest = new CreatePrivateLobbyRequest(); // CreatePrivateLobbyRequest | 
    String roomId = "roomId_example"; // String | 
    try {
      Lobby result = apiInstance.createPrivateLobby(appId, authorization, createPrivateLobbyRequest, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV2Api#createPrivateLobby");
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
| **createPrivateLobbyRequest** | [**CreatePrivateLobbyRequest**](CreatePrivateLobbyRequest.md)|  | |
| **roomId** | **String**|  | [optional] |

### Return type

[**Lobby**](Lobby.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="createPublicLobby"></a>
# **createPublicLobby**
> Lobby createPublicLobby(appId, authorization, createPrivateLobbyRequest, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String authorization = "authorization_example"; // String | 
    CreatePrivateLobbyRequest createPrivateLobbyRequest = new CreatePrivateLobbyRequest(); // CreatePrivateLobbyRequest | 
    String roomId = "roomId_example"; // String | 
    try {
      Lobby result = apiInstance.createPublicLobby(appId, authorization, createPrivateLobbyRequest, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV2Api#createPublicLobby");
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
| **createPrivateLobbyRequest** | [**CreatePrivateLobbyRequest**](CreatePrivateLobbyRequest.md)|  | |
| **roomId** | **String**|  | [optional] |

### Return type

[**Lobby**](Lobby.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="getLobbyInfo"></a>
# **getLobbyInfo**
> Lobby getLobbyInfo(appId, roomId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      Lobby result = apiInstance.getLobbyInfo(appId, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV2Api#getLobbyInfo");
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

[**Lobby**](Lobby.md)

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

<a name="listActivePublicLobbies"></a>
# **listActivePublicLobbies**
> List&lt;Lobby&gt; listActivePublicLobbies(appId, region)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      List<Lobby> result = apiInstance.listActivePublicLobbies(appId, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV2Api#listActivePublicLobbies");
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

<a name="setLobbyState"></a>
# **setLobbyState**
> Lobby setLobbyState(appId, roomId, setLobbyStateRequest)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    SetLobbyStateRequest setLobbyStateRequest = new SetLobbyStateRequest(); // SetLobbyStateRequest | 
    try {
      Lobby result = apiInstance.setLobbyState(appId, roomId, setLobbyStateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV2Api#setLobbyState");
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
| **setLobbyStateRequest** | [**SetLobbyStateRequest**](SetLobbyStateRequest.md)|  | |

### Return type

[**Lobby**](Lobby.md)

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

