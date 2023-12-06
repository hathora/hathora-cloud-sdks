# LobbyV3Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLobby**](LobbyV3Api.md#createLobby) | **POST** /lobby/v3/{appId}/create |  |
| [**getLobbyInfoByRoomId**](LobbyV3Api.md#getLobbyInfoByRoomId) | **GET** /lobby/v3/{appId}/info/roomid/{roomId} |  |
| [**getLobbyInfoByShortCode**](LobbyV3Api.md#getLobbyInfoByShortCode) | **GET** /lobby/v3/{appId}/info/shortcode/{shortCode} |  |
| [**listActivePublicLobbies**](LobbyV3Api.md#listActivePublicLobbies) | **GET** /lobby/v3/{appId}/list/public |  |


<a name="createLobby"></a>
# **createLobby**
> LobbyV3 createLobby(appId, createLobbyV3Params, shortCode, roomId)



Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV3Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: playerAuth
    HttpBearerAuth playerAuth = (HttpBearerAuth) defaultClient.getAuthentication("playerAuth");
    playerAuth.setBearerToken("BEARER TOKEN");

    LobbyV3Api apiInstance = new LobbyV3Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreateLobbyV3Params createLobbyV3Params = new CreateLobbyV3Params(); // CreateLobbyV3Params | 
    String shortCode = "shortCode_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      LobbyV3 result = apiInstance.createLobby(appId, createLobbyV3Params, shortCode, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV3Api#createLobby");
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
| **createLobbyV3Params** | [**CreateLobbyV3Params**](CreateLobbyV3Params.md)|  | |
| **shortCode** | **String**|  | [optional] |
| **roomId** | **String**|  | [optional] |

### Return type

[**LobbyV3**](LobbyV3.md)

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
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="getLobbyInfoByRoomId"></a>
# **getLobbyInfoByRoomId**
> LobbyV3 getLobbyInfoByRoomId(appId, roomId)



Get details for a lobby.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV3Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV3Api apiInstance = new LobbyV3Api(defaultClient);
    String appId = "appId_example"; // String | 
    String roomId = "roomId_example"; // String | 
    try {
      LobbyV3 result = apiInstance.getLobbyInfoByRoomId(appId, roomId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV3Api#getLobbyInfoByRoomId");
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

[**LobbyV3**](LobbyV3.md)

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

<a name="getLobbyInfoByShortCode"></a>
# **getLobbyInfoByShortCode**
> LobbyV3 getLobbyInfoByShortCode(appId, shortCode)



Get details for a lobby. If 2 or more lobbies have the same &#x60;shortCode&#x60;, then the most recently created lobby will be returned.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV3Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV3Api apiInstance = new LobbyV3Api(defaultClient);
    String appId = "appId_example"; // String | 
    String shortCode = "shortCode_example"; // String | 
    try {
      LobbyV3 result = apiInstance.getLobbyInfoByShortCode(appId, shortCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV3Api#getLobbyInfoByShortCode");
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
| **shortCode** | **String**|  | |

### Return type

[**LobbyV3**](LobbyV3.md)

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
> List&lt;LobbyV3&gt; listActivePublicLobbies(appId, region)



Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a &#x60;region&#x60;. Use this endpoint to display all public lobbies that a player can join in the game client.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV3Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV3Api apiInstance = new LobbyV3Api(defaultClient);
    String appId = "appId_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | If omitted, active public lobbies in all regions will be returned.
    try {
      List<LobbyV3> result = apiInstance.listActivePublicLobbies(appId, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV3Api#listActivePublicLobbies");
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
| **region** | [**Region**](.md)| If omitted, active public lobbies in all regions will be returned. | [optional] [enum: Seattle, Los_Angeles, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo] |

### Return type

[**List&lt;LobbyV3&gt;**](LobbyV3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

