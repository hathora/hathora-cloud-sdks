# LobbyV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPrivateLobbyDeprecated**](LobbyV1Api.md#createPrivateLobbyDeprecated) | **POST** /lobby/v1/{appId}/create/private |  |
| [**createPublicLobbyDeprecated**](LobbyV1Api.md#createPublicLobbyDeprecated) | **POST** /lobby/v1/{appId}/create/public |  |
| [**listActivePublicLobbiesDeprecated**](LobbyV1Api.md#listActivePublicLobbiesDeprecated) | **GET** /lobby/v1/{appId}/list |  |


<a id="createPrivateLobbyDeprecated"></a>
# **createPrivateLobbyDeprecated**
> String createPrivateLobbyDeprecated(appId, authorization, region, local)



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
    String authorization = "authorization_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    Boolean local = false; // Boolean | 
    try {
      String result = apiInstance.createPrivateLobbyDeprecated(appId, authorization, region, local);
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
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a id="createPublicLobbyDeprecated"></a>
# **createPublicLobbyDeprecated**
> String createPublicLobbyDeprecated(appId, authorization, region, local)



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
    String authorization = "authorization_example"; // String | 
    Region region = Region.fromValue("Seattle"); // Region | 
    Boolean local = false; // Boolean | 
    try {
      String result = apiInstance.createPublicLobbyDeprecated(appId, authorization, region, local);
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
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

<a id="listActivePublicLobbiesDeprecated"></a>
# **listActivePublicLobbiesDeprecated**
> List&lt;Lobby&gt; listActivePublicLobbiesDeprecated(appId, authorization, local, region)



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
    String authorization = "authorization_example"; // String | 
    Boolean local = false; // Boolean | 
    Region region = Region.fromValue("Seattle"); // Region | 
    try {
      List<Lobby> result = apiInstance.listActivePublicLobbiesDeprecated(appId, authorization, local, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LobbyV1Api#listActivePublicLobbiesDeprecated");
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

