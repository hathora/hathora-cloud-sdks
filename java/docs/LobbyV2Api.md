# LobbyV2Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLobbyDeprecated**](LobbyV2Api.md#createLobbyDeprecated) | **POST** /lobby/v2/{appId}/create |  |
| [**createLocalLobby**](LobbyV2Api.md#createLocalLobby) | **POST** /lobby/v2/{appId}/create/local |  |
| [**createPrivateLobby**](LobbyV2Api.md#createPrivateLobby) | **POST** /lobby/v2/{appId}/create/private |  |
| [**createPublicLobby**](LobbyV2Api.md#createPublicLobby) | **POST** /lobby/v2/{appId}/create/public |  |
| [**getLobbyInfo**](LobbyV2Api.md#getLobbyInfo) | **GET** /lobby/v2/{appId}/info/{roomId} |  |
| [**listActivePublicLobbiesDeprecatedV2**](LobbyV2Api.md#listActivePublicLobbiesDeprecatedV2) | **GET** /lobby/v2/{appId}/list/public |  |
| [**setLobbyState**](LobbyV2Api.md#setLobbyState) | **POST** /lobby/v2/{appId}/setState/{roomId} |  |


<a name="createLobbyDeprecated"></a>
# **createLobbyDeprecated**
> Lobby createLobbyDeprecated(appId, createLobbyParams, roomId)



Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.

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
    
    // Configure HTTP bearer authorization: playerAuth
    HttpBearerAuth playerAuth = (HttpBearerAuth) defaultClient.getAuthentication("playerAuth");
    playerAuth.setBearerToken("BEARER TOKEN");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreateLobbyParams createLobbyParams = new CreateLobbyParams(); // CreateLobbyParams | 
    String roomId = "roomId_example"; // String | 
    try {
      Lobby result = apiInstance.createLobbyDeprecated(appId, createLobbyParams, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV2Api#createLobbyDeprecated");
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
| **createLobbyParams** | [**CreateLobbyParams**](CreateLobbyParams.md)|  | |
| **roomId** | **String**|  | [optional] |

### Return type

[**Lobby**](Lobby.md)

### Authorization

[playerAuth](../README.md#playerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **402** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="createLocalLobby"></a>
# **createLocalLobby**
> Lobby createLocalLobby(appId, createPrivateLobbyRequest, roomId)



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
    
    // Configure HTTP bearer authorization: playerAuth
    HttpBearerAuth playerAuth = (HttpBearerAuth) defaultClient.getAuthentication("playerAuth");
    playerAuth.setBearerToken("BEARER TOKEN");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreatePrivateLobbyRequest createPrivateLobbyRequest = new CreatePrivateLobbyRequest(); // CreatePrivateLobbyRequest | 
    String roomId = "roomId_example"; // String | 
    try {
      Lobby result = apiInstance.createLocalLobby(appId, createPrivateLobbyRequest, roomId);
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
| **createPrivateLobbyRequest** | [**CreatePrivateLobbyRequest**](CreatePrivateLobbyRequest.md)|  | |
| **roomId** | **String**|  | [optional] |

### Return type

[**Lobby**](Lobby.md)

### Authorization

[playerAuth](../README.md#playerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **402** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="createPrivateLobby"></a>
# **createPrivateLobby**
> Lobby createPrivateLobby(appId, createPrivateLobbyRequest, roomId)



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
    
    // Configure HTTP bearer authorization: playerAuth
    HttpBearerAuth playerAuth = (HttpBearerAuth) defaultClient.getAuthentication("playerAuth");
    playerAuth.setBearerToken("BEARER TOKEN");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreatePrivateLobbyRequest createPrivateLobbyRequest = new CreatePrivateLobbyRequest(); // CreatePrivateLobbyRequest | 
    String roomId = "roomId_example"; // String | 
    try {
      Lobby result = apiInstance.createPrivateLobby(appId, createPrivateLobbyRequest, roomId);
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
| **createPrivateLobbyRequest** | [**CreatePrivateLobbyRequest**](CreatePrivateLobbyRequest.md)|  | |
| **roomId** | **String**|  | [optional] |

### Return type

[**Lobby**](Lobby.md)

### Authorization

[playerAuth](../README.md#playerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **402** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="createPublicLobby"></a>
# **createPublicLobby**
> Lobby createPublicLobby(appId, createPrivateLobbyRequest, roomId)



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
    
    // Configure HTTP bearer authorization: playerAuth
    HttpBearerAuth playerAuth = (HttpBearerAuth) defaultClient.getAuthentication("playerAuth");
    playerAuth.setBearerToken("BEARER TOKEN");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreatePrivateLobbyRequest createPrivateLobbyRequest = new CreatePrivateLobbyRequest(); // CreatePrivateLobbyRequest | 
    String roomId = "roomId_example"; // String | 
    try {
      Lobby result = apiInstance.createPublicLobby(appId, createPrivateLobbyRequest, roomId);
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
| **createPrivateLobbyRequest** | [**CreatePrivateLobbyRequest**](CreatePrivateLobbyRequest.md)|  | |
| **roomId** | **String**|  | [optional] |

### Return type

[**Lobby**](Lobby.md)

### Authorization

[playerAuth](../README.md#playerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **402** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="getLobbyInfo"></a>
# **getLobbyInfo**
> Lobby getLobbyInfo(appId, roomId)



Get details for a lobby.

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

<a name="listActivePublicLobbiesDeprecatedV2"></a>
# **listActivePublicLobbiesDeprecatedV2**
> List&lt;Lobby&gt; listActivePublicLobbiesDeprecatedV2(appId, region)



Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a &#x60;region&#x60;. Use this endpoint to display all public lobbies that a player can join in the game client.

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
    Region region = Region.fromValue("Seattle"); // Region | Region to filter by. If omitted, active public lobbies in all regions will be returned.
    try {
      List<Lobby> result = apiInstance.listActivePublicLobbiesDeprecatedV2(appId, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV2Api#listActivePublicLobbiesDeprecatedV2");
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
| **region** | [**Region**](.md)| Region to filter by. If omitted, active public lobbies in all regions will be returned. | [optional] [enum: Seattle, Los_Angeles, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo, Dallas] |

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
> Lobby setLobbyState(appId, roomId, setLobbyStateParams)



Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores).

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
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    LobbyV2Api apiInstance = new LobbyV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    SetLobbyStateParams setLobbyStateParams = new SetLobbyStateParams(); // SetLobbyStateParams | 
    try {
      Lobby result = apiInstance.setLobbyState(appId, roomId, setLobbyStateParams);
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
| **setLobbyStateParams** | [**SetLobbyStateParams**](SetLobbyStateParams.md)|  | |

### Return type

[**Lobby**](Lobby.md)

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
| **429** |  |  -  |

