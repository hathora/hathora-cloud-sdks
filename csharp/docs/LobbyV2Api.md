# Hathora.Cloud.Sdk.Api.LobbyV2Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateLobbyDeprecated**](LobbyV2Api.md#createlobbydeprecated) | **POST** /lobby/v2/{appId}/create |  |
| [**CreateLocalLobby**](LobbyV2Api.md#createlocallobby) | **POST** /lobby/v2/{appId}/create/local |  |
| [**CreatePrivateLobby**](LobbyV2Api.md#createprivatelobby) | **POST** /lobby/v2/{appId}/create/private |  |
| [**CreatePublicLobby**](LobbyV2Api.md#createpubliclobby) | **POST** /lobby/v2/{appId}/create/public |  |
| [**GetLobbyInfo**](LobbyV2Api.md#getlobbyinfo) | **GET** /lobby/v2/{appId}/info/{roomId} |  |
| [**ListActivePublicLobbiesDeprecatedV2**](LobbyV2Api.md#listactivepubliclobbiesdeprecatedv2) | **GET** /lobby/v2/{appId}/list/public |  |
| [**SetLobbyState**](LobbyV2Api.md#setlobbystate) | **POST** /lobby/v2/{appId}/setState/{roomId} |  |

<a name="createlobbydeprecated"></a>
# **CreateLobbyDeprecated**
> Lobby CreateLobbyDeprecated (string appId, CreateLobbyParams createLobbyParams, string roomId = null)



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
    public class CreateLobbyDeprecatedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: playerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LobbyV2Api(config);
            var appId = "appId_example";  // string | 
            var createLobbyParams = new CreateLobbyParams(); // CreateLobbyParams | 
            var roomId = "roomId_example";  // string |  (optional) 

            try
            {
                Lobby result = apiInstance.CreateLobbyDeprecated(appId, createLobbyParams, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV2Api.CreateLobbyDeprecated: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateLobbyDeprecatedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Lobby> response = apiInstance.CreateLobbyDeprecatedWithHttpInfo(appId, createLobbyParams, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV2Api.CreateLobbyDeprecatedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **createLobbyParams** | [**CreateLobbyParams**](CreateLobbyParams.md) |  |  |
| **roomId** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createlocallobby"></a>
# **CreateLocalLobby**
> Lobby CreateLocalLobby (string appId, CreatePrivateLobbyRequest createPrivateLobbyRequest, string roomId = null)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class CreateLocalLobbyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: playerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LobbyV2Api(config);
            var appId = "appId_example";  // string | 
            var createPrivateLobbyRequest = new CreatePrivateLobbyRequest(); // CreatePrivateLobbyRequest | 
            var roomId = "roomId_example";  // string |  (optional) 

            try
            {
                Lobby result = apiInstance.CreateLocalLobby(appId, createPrivateLobbyRequest, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV2Api.CreateLocalLobby: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateLocalLobbyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Lobby> response = apiInstance.CreateLocalLobbyWithHttpInfo(appId, createPrivateLobbyRequest, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV2Api.CreateLocalLobbyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **createPrivateLobbyRequest** | [**CreatePrivateLobbyRequest**](CreatePrivateLobbyRequest.md) |  |  |
| **roomId** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createprivatelobby"></a>
# **CreatePrivateLobby**
> Lobby CreatePrivateLobby (string appId, CreatePrivateLobbyRequest createPrivateLobbyRequest, string roomId = null)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class CreatePrivateLobbyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: playerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LobbyV2Api(config);
            var appId = "appId_example";  // string | 
            var createPrivateLobbyRequest = new CreatePrivateLobbyRequest(); // CreatePrivateLobbyRequest | 
            var roomId = "roomId_example";  // string |  (optional) 

            try
            {
                Lobby result = apiInstance.CreatePrivateLobby(appId, createPrivateLobbyRequest, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV2Api.CreatePrivateLobby: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreatePrivateLobbyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Lobby> response = apiInstance.CreatePrivateLobbyWithHttpInfo(appId, createPrivateLobbyRequest, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV2Api.CreatePrivateLobbyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **createPrivateLobbyRequest** | [**CreatePrivateLobbyRequest**](CreatePrivateLobbyRequest.md) |  |  |
| **roomId** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createpubliclobby"></a>
# **CreatePublicLobby**
> Lobby CreatePublicLobby (string appId, CreatePrivateLobbyRequest createPrivateLobbyRequest, string roomId = null)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class CreatePublicLobbyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: playerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LobbyV2Api(config);
            var appId = "appId_example";  // string | 
            var createPrivateLobbyRequest = new CreatePrivateLobbyRequest(); // CreatePrivateLobbyRequest | 
            var roomId = "roomId_example";  // string |  (optional) 

            try
            {
                Lobby result = apiInstance.CreatePublicLobby(appId, createPrivateLobbyRequest, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV2Api.CreatePublicLobby: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreatePublicLobbyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Lobby> response = apiInstance.CreatePublicLobbyWithHttpInfo(appId, createPrivateLobbyRequest, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV2Api.CreatePublicLobbyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **createPrivateLobbyRequest** | [**CreatePrivateLobbyRequest**](CreatePrivateLobbyRequest.md) |  |  |
| **roomId** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlobbyinfo"></a>
# **GetLobbyInfo**
> Lobby GetLobbyInfo (string appId, string roomId)



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
    public class GetLobbyInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new LobbyV2Api(config);
            var appId = "appId_example";  // string | 
            var roomId = "roomId_example";  // string | 

            try
            {
                Lobby result = apiInstance.GetLobbyInfo(appId, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV2Api.GetLobbyInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetLobbyInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Lobby> response = apiInstance.GetLobbyInfoWithHttpInfo(appId, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV2Api.GetLobbyInfoWithHttpInfo: " + e.Message);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listactivepubliclobbiesdeprecatedv2"></a>
# **ListActivePublicLobbiesDeprecatedV2**
> List&lt;Lobby&gt; ListActivePublicLobbiesDeprecatedV2 (string appId, Region? region = null)



Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class ListActivePublicLobbiesDeprecatedV2Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new LobbyV2Api(config);
            var appId = "appId_example";  // string | 
            var region = (Region) "Seattle";  // Region? | Region to filter by. If omitted, active public lobbies in all regions will be returned. (optional) 

            try
            {
                List<Lobby> result = apiInstance.ListActivePublicLobbiesDeprecatedV2(appId, region);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV2Api.ListActivePublicLobbiesDeprecatedV2: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListActivePublicLobbiesDeprecatedV2WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<Lobby>> response = apiInstance.ListActivePublicLobbiesDeprecatedV2WithHttpInfo(appId, region);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV2Api.ListActivePublicLobbiesDeprecatedV2WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **region** | **Region?** | Region to filter by. If omitted, active public lobbies in all regions will be returned. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="setlobbystate"></a>
# **SetLobbyState**
> Lobby SetLobbyState (string appId, string roomId, SetLobbyStateParams setLobbyStateParams)



Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class SetLobbyStateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LobbyV2Api(config);
            var appId = "appId_example";  // string | 
            var roomId = "roomId_example";  // string | 
            var setLobbyStateParams = new SetLobbyStateParams(); // SetLobbyStateParams | 

            try
            {
                Lobby result = apiInstance.SetLobbyState(appId, roomId, setLobbyStateParams);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LobbyV2Api.SetLobbyState: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SetLobbyStateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Lobby> response = apiInstance.SetLobbyStateWithHttpInfo(appId, roomId, setLobbyStateParams);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LobbyV2Api.SetLobbyStateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **roomId** | **string** |  |  |
| **setLobbyStateParams** | [**SetLobbyStateParams**](SetLobbyStateParams.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

