# Hathora.Cloud.Sdk.Api.RoomV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateRoom**](RoomV1Api.md#createroom) | **POST** /rooms/v1/{appId}/create |  |
| [**DestroyRoom**](RoomV1Api.md#destroyroom) | **POST** /rooms/v1/{appId}/destroy/{roomId} |  |
| [**GetActiveRoomsForProcess**](RoomV1Api.md#getactiveroomsforprocess) | **GET** /rooms/v1/{appId}/list/{processId}/active |  |
| [**GetConnectionInfo**](RoomV1Api.md#getconnectioninfo) | **GET** /rooms/v1/{appId}/connectioninfo/{roomId} |  |
| [**GetInactiveRoomsForProcess**](RoomV1Api.md#getinactiveroomsforprocess) | **GET** /rooms/v1/{appId}/list/{processId}/inactive |  |
| [**GetRoomInfo**](RoomV1Api.md#getroominfo) | **GET** /rooms/v1/{appId}/info/{roomId} |  |
| [**SuspendRoom**](RoomV1Api.md#suspendroom) | **POST** /rooms/v1/{appId}/suspend/{roomId} |  |

<a name="createroom"></a>
# **CreateRoom**
> string CreateRoom (string appId, CreateRoomRequest createRoomRequest, string roomId = null)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class CreateRoomExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new RoomV1Api(config);
            var appId = "appId_example";  // string | 
            var createRoomRequest = new CreateRoomRequest(); // CreateRoomRequest | 
            var roomId = "roomId_example";  // string |  (optional) 

            try
            {
                string result = apiInstance.CreateRoom(appId, createRoomRequest, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RoomV1Api.CreateRoom: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateRoomWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<string> response = apiInstance.CreateRoomWithHttpInfo(appId, createRoomRequest, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RoomV1Api.CreateRoomWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **createRoomRequest** | [**CreateRoomRequest**](CreateRoomRequest.md) |  |  |
| **roomId** | **string** |  | [optional]  |

### Return type

**string**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="destroyroom"></a>
# **DestroyRoom**
> void DestroyRoom (string appId, string roomId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class DestroyRoomExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new RoomV1Api(config);
            var appId = "appId_example";  // string | 
            var roomId = "roomId_example";  // string | 

            try
            {
                apiInstance.DestroyRoom(appId, roomId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RoomV1Api.DestroyRoom: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DestroyRoomWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DestroyRoomWithHttpInfo(appId, roomId);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RoomV1Api.DestroyRoomWithHttpInfo: " + e.Message);
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

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getactiveroomsforprocess"></a>
# **GetActiveRoomsForProcess**
> List&lt;PickRoomExcludeKeyofRoomAllocations&gt; GetActiveRoomsForProcess (string appId, string processId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetActiveRoomsForProcessExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new RoomV1Api(config);
            var appId = "appId_example";  // string | 
            var processId = "processId_example";  // string | 

            try
            {
                List<PickRoomExcludeKeyofRoomAllocations> result = apiInstance.GetActiveRoomsForProcess(appId, processId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RoomV1Api.GetActiveRoomsForProcess: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetActiveRoomsForProcessWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<PickRoomExcludeKeyofRoomAllocations>> response = apiInstance.GetActiveRoomsForProcessWithHttpInfo(appId, processId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RoomV1Api.GetActiveRoomsForProcessWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **processId** | **string** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getconnectioninfo"></a>
# **GetConnectionInfo**
> ConnectionInfo GetConnectionInfo (string appId, string roomId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetConnectionInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new RoomV1Api(config);
            var appId = "appId_example";  // string | 
            var roomId = "roomId_example";  // string | 

            try
            {
                ConnectionInfo result = apiInstance.GetConnectionInfo(appId, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RoomV1Api.GetConnectionInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetConnectionInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ConnectionInfo> response = apiInstance.GetConnectionInfoWithHttpInfo(appId, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RoomV1Api.GetConnectionInfoWithHttpInfo: " + e.Message);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getinactiveroomsforprocess"></a>
# **GetInactiveRoomsForProcess**
> List&lt;PickRoomExcludeKeyofRoomAllocations&gt; GetInactiveRoomsForProcess (string appId, string processId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetInactiveRoomsForProcessExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new RoomV1Api(config);
            var appId = "appId_example";  // string | 
            var processId = "processId_example";  // string | 

            try
            {
                List<PickRoomExcludeKeyofRoomAllocations> result = apiInstance.GetInactiveRoomsForProcess(appId, processId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RoomV1Api.GetInactiveRoomsForProcess: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetInactiveRoomsForProcessWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<PickRoomExcludeKeyofRoomAllocations>> response = apiInstance.GetInactiveRoomsForProcessWithHttpInfo(appId, processId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RoomV1Api.GetInactiveRoomsForProcessWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **processId** | **string** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getroominfo"></a>
# **GetRoomInfo**
> Room GetRoomInfo (string appId, string roomId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetRoomInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new RoomV1Api(config);
            var appId = "appId_example";  // string | 
            var roomId = "roomId_example";  // string | 

            try
            {
                Room result = apiInstance.GetRoomInfo(appId, roomId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RoomV1Api.GetRoomInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetRoomInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Room> response = apiInstance.GetRoomInfoWithHttpInfo(appId, roomId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RoomV1Api.GetRoomInfoWithHttpInfo: " + e.Message);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="suspendroom"></a>
# **SuspendRoom**
> void SuspendRoom (string appId, string roomId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class SuspendRoomExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new RoomV1Api(config);
            var appId = "appId_example";  // string | 
            var roomId = "roomId_example";  // string | 

            try
            {
                apiInstance.SuspendRoom(appId, roomId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RoomV1Api.SuspendRoom: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SuspendRoomWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.SuspendRoomWithHttpInfo(appId, roomId);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RoomV1Api.SuspendRoomWithHttpInfo: " + e.Message);
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

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

