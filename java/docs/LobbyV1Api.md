# LobbyV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPrivateLobbyDeprecated**](LobbyV1Api.md#createPrivateLobbyDeprecated) | **POST** /lobby/v1/{appId}/create/private |  |
| [**createPublicLobbyDeprecated**](LobbyV1Api.md#createPublicLobbyDeprecated) | **POST** /lobby/v1/{appId}/create/public |  |
| [**listActivePublicLobbiesDeprecatedV1**](LobbyV1Api.md#listActivePublicLobbiesDeprecatedV1) | **GET** /lobby/v1/{appId}/list |  |


<a name="createPrivateLobbyDeprecated"></a>
# **createPrivateLobbyDeprecated**
> String createPrivateLobbyDeprecated(appId, region, local)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: playerAuth
    HttpBearerAuth playerAuth = (HttpBearerAuth) defaultClient.getAuthentication("playerAuth");
    playerAuth.setBearerToken("BEARER TOKEN");

    LobbyV1Api apiInstance = new LobbyV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    Boolean local = false; // Boolean | 
    try {
      String result = apiInstance.createPrivateLobbyDeprecated(appId, region, local);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV1Api#createPrivateLobbyDeprecated");
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
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Los_Angeles, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo, Dallas] |
| **local** | **Boolean**|  | [optional] [default to false] |

### Return type

**String**

### Authorization

[playerAuth](../README.md#playerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **402** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="createPublicLobbyDeprecated"></a>
# **createPublicLobbyDeprecated**
> String createPublicLobbyDeprecated(appId, region, local)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: playerAuth
    HttpBearerAuth playerAuth = (HttpBearerAuth) defaultClient.getAuthentication("playerAuth");
    playerAuth.setBearerToken("BEARER TOKEN");

    LobbyV1Api apiInstance = new LobbyV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    Boolean local = false; // Boolean | 
    try {
      String result = apiInstance.createPublicLobbyDeprecated(appId, region, local);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV1Api#createPublicLobbyDeprecated");
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
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Los_Angeles, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo, Dallas] |
| **local** | **Boolean**|  | [optional] [default to false] |

### Return type

**String**

### Authorization

[playerAuth](../README.md#playerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **402** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a name="listActivePublicLobbiesDeprecatedV1"></a>
# **listActivePublicLobbiesDeprecatedV1**
> List&lt;Lobby&gt; listActivePublicLobbiesDeprecatedV1(appId, local, region)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.LobbyV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    LobbyV1Api apiInstance = new LobbyV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Boolean local = false; // Boolean | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      List<Lobby> result = apiInstance.listActivePublicLobbiesDeprecatedV1(appId, local, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV1Api#listActivePublicLobbiesDeprecatedV1");
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
| **local** | **Boolean**|  | [optional] [default to false] |
| **region** | [**Region**](.md)|  | [optional] [enum: Seattle, Los_Angeles, Washington_DC, Chicago, London, Frankfurt, Mumbai, Singapore, Tokyo, Sydney, Sao_Paulo, Dallas] |

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
| **404** |  |  -  |

