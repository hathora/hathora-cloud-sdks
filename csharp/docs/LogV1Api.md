# Hathora.Cloud.Sdk.Api.LogV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DownloadLogForProcess**](LogV1Api.md#downloadlogforprocess) | **GET** /logs/v1/{appId}/process/{processId}/download |  |
| [**GetLogsForApp**](LogV1Api.md#getlogsforapp) | **GET** /logs/v1/{appId}/all |  |
| [**GetLogsForDeployment**](LogV1Api.md#getlogsfordeployment) | **GET** /logs/v1/{appId}/deployment/{deploymentId} |  |
| [**GetLogsForProcess**](LogV1Api.md#getlogsforprocess) | **GET** /logs/v1/{appId}/process/{processId} |  |

<a name="downloadlogforprocess"></a>
# **DownloadLogForProcess**
> byte[] DownloadLogForProcess (string appId, string processId)



Download entire log file for a stopped process.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class DownloadLogForProcessExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LogV1Api(config);
            var appId = "appId_example";  // string | 
            var processId = "processId_example";  // string | 

            try
            {
                byte[] result = apiInstance.DownloadLogForProcess(appId, processId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LogV1Api.DownloadLogForProcess: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DownloadLogForProcessWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<byte[]> response = apiInstance.DownloadLogForProcessWithHttpInfo(appId, processId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LogV1Api.DownloadLogForProcessWithHttpInfo: " + e.Message);
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

**byte[]**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **410** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlogsforapp"></a>
# **GetLogsForApp**
> byte[] GetLogsForApp (string appId, bool? follow = null, int? tailLines = null, Region? region = null)



Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetLogsForAppExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LogV1Api(config);
            var appId = "appId_example";  // string | 
            var follow = false;  // bool? |  (optional)  (default to false)
            var tailLines = 56;  // int? |  (optional) 
            var region = (Region) "Seattle";  // Region? |  (optional) 

            try
            {
                byte[] result = apiInstance.GetLogsForApp(appId, follow, tailLines, region);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LogV1Api.GetLogsForApp: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetLogsForAppWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<byte[]> response = apiInstance.GetLogsForAppWithHttpInfo(appId, follow, tailLines, region);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LogV1Api.GetLogsForAppWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **follow** | **bool?** |  | [optional] [default to false] |
| **tailLines** | **int?** |  | [optional]  |
| **region** | **Region?** |  | [optional]  |

### Return type

**byte[]**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlogsfordeployment"></a>
# **GetLogsForDeployment**
> byte[] GetLogsForDeployment (string appId, int deploymentId, bool? follow = null, int? tailLines = null)



Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using `appId` and `deploymentId`.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetLogsForDeploymentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LogV1Api(config);
            var appId = "appId_example";  // string | 
            var deploymentId = 56;  // int | 
            var follow = false;  // bool? |  (optional)  (default to false)
            var tailLines = 56;  // int? |  (optional) 

            try
            {
                byte[] result = apiInstance.GetLogsForDeployment(appId, deploymentId, follow, tailLines);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LogV1Api.GetLogsForDeployment: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetLogsForDeploymentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<byte[]> response = apiInstance.GetLogsForDeploymentWithHttpInfo(appId, deploymentId, follow, tailLines);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LogV1Api.GetLogsForDeploymentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **deploymentId** | **int** |  |  |
| **follow** | **bool?** |  | [optional] [default to false] |
| **tailLines** | **int?** |  | [optional]  |

### Return type

**byte[]**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlogsforprocess"></a>
# **GetLogsForProcess**
> byte[] GetLogsForProcess (string appId, string processId, bool? follow = null, int? tailLines = null)



Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetLogsForProcessExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new LogV1Api(config);
            var appId = "appId_example";  // string | 
            var processId = "processId_example";  // string | 
            var follow = false;  // bool? |  (optional)  (default to false)
            var tailLines = 56;  // int? |  (optional) 

            try
            {
                byte[] result = apiInstance.GetLogsForProcess(appId, processId, follow, tailLines);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LogV1Api.GetLogsForProcess: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetLogsForProcessWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<byte[]> response = apiInstance.GetLogsForProcessWithHttpInfo(appId, processId, follow, tailLines);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LogV1Api.GetLogsForProcessWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **processId** | **string** |  |  |
| **follow** | **bool?** |  | [optional] [default to false] |
| **tailLines** | **int?** |  | [optional]  |

### Return type

**byte[]**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **410** |  |  -  |
| **500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

