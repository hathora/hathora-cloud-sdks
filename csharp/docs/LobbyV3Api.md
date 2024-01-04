# Hathora.Cloud.Sdk.Api.LobbyV3Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateLobby**](LobbyV3Api.md#createlobby) | **POST** /lobby/v3/{appId}/create |  |
| [**GetLobbyInfoByRoomId**](LobbyV3Api.md#getlobbyinfobyroomid) | **GET** /lobby/v3/{appId}/info/roomid/{roomId} |  |
| [**GetLobbyInfoByShortCode**](LobbyV3Api.md#getlobbyinfobyshortcode) | **GET** /lobby/v3/{appId}/info/shortcode/{shortCode} |  |
| [**ListActivePublicLobbies**](LobbyV3Api.md#listactivepubliclobbies) | **GET** /lobby/v3/{appId}/list/public |  |

<a name="createlobby"></a>
# **CreateLobby**
> LobbyV3 CreateLobby (string appId, CreateLobbyV3Params createLobbyV3Params, string shortCode = null, string roomId = null)



Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class CreateLobbyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: playerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LobbyV3Api(config);
            var appId = "appId_example";  // string | 
            var createLobbyV3Params = new CreateLobbyV3Params(); // CreateLobbyV3Params | 
            var shortCode = "shortCode_example";  // string |  (optional) 
            var roomId = "roomId_example";  // string |  (optional) 

            try
            {
                LobbyV3 result = apiInstance.CreateLobby(appId, createLobbyV3Params, shortCode, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV3Api.CreateLobby: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateLobbyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<LobbyV3> response = apiInstance.CreateLobbyWithHttpInfo(appId, createLobbyV3Params, shortCode, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV3Api.CreateLobbyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **createLobbyV3Params** | [**CreateLobbyV3Params**](CreateLobbyV3Params.md) |  |  |
| **shortCode** | **string** |  | [optional]  |
| **roomId** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlobbyinfobyroomid"></a>
# **GetLobbyInfoByRoomId**
> LobbyV3 GetLobbyInfoByRoomId (string appId, string roomId)



Get details for a lobby.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetLobbyInfoByRoomIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new LobbyV3Api(config);
            var appId = "appId_example";  // string | 
            var roomId = "roomId_example";  // string | 

            try
            {
                LobbyV3 result = apiInstance.GetLobbyInfoByRoomId(appId, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV3Api.GetLobbyInfoByRoomId: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetLobbyInfoByRoomIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<LobbyV3> response = apiInstance.GetLobbyInfoByRoomIdWithHttpInfo(appId, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV3Api.GetLobbyInfoByRoomIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **roomId** | **string** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlobbyinfobyshortcode"></a>
# **GetLobbyInfoByShortCode**
> LobbyV3 GetLobbyInfoByShortCode (string appId, string shortCode)



Get details for a lobby. If 2 or more lobbies have the same `shortCode`, then the most recently created lobby will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetLobbyInfoByShortCodeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new LobbyV3Api(config);
            var appId = "appId_example";  // string | 
            var shortCode = "shortCode_example";  // string | 

            try
            {
                LobbyV3 result = apiInstance.GetLobbyInfoByShortCode(appId, shortCode);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV3Api.GetLobbyInfoByShortCode: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetLobbyInfoByShortCodeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<LobbyV3> response = apiInstance.GetLobbyInfoByShortCodeWithHttpInfo(appId, shortCode);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV3Api.GetLobbyInfoByShortCodeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **shortCode** | **string** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listactivepubliclobbies"></a>
# **ListActivePublicLobbies**
> List&lt;LobbyV3&gt; ListActivePublicLobbies (string appId, Region? region = null)



Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class ListActivePublicLobbiesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new LobbyV3Api(config);
            var appId = "appId_example";  // string | 
            var region = (Region) "Seattle";  // Region? | If omitted, active public lobbies in all regions will be returned. (optional) 

            try
            {
                List<LobbyV3> result = apiInstance.ListActivePublicLobbies(appId, region);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV3Api.ListActivePublicLobbies: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListActivePublicLobbiesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<LobbyV3>> response = apiInstance.ListActivePublicLobbiesWithHttpInfo(appId, region);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV3Api.ListActivePublicLobbiesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **region** | **Region?** | If omitted, active public lobbies in all regions will be returned. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

