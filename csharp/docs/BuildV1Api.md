# Hathora.Cloud.Sdk.Api.BuildV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateBuild**](BuildV1Api.md#createbuild) | **POST** /builds/v1/{appId}/create |  |
| [**DeleteBuild**](BuildV1Api.md#deletebuild) | **DELETE** /builds/v1/{appId}/delete/{buildId} |  |
| [**GetBuildInfo**](BuildV1Api.md#getbuildinfo) | **GET** /builds/v1/{appId}/info/{buildId} |  |
| [**GetBuilds**](BuildV1Api.md#getbuilds) | **GET** /builds/v1/{appId}/list |  |
| [**RunBuild**](BuildV1Api.md#runbuild) | **POST** /builds/v1/{appId}/run/{buildId} |  |

<a name="createbuild"></a>
# **CreateBuild**
> Build CreateBuild (string appId)



Generate a new `buildId` for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. You need `buildId` to run a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class CreateBuildExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new BuildV1Api(config);
            var appId = "appId_example";  // string | 

            try
            {
                Build result = apiInstance.CreateBuild(appId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BuildV1Api.CreateBuild: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateBuildWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Build> response = apiInstance.CreateBuildWithHttpInfo(appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BuildV1Api.CreateBuildWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |

### Return type

[**Build**](Build.md)

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletebuild"></a>
# **DeleteBuild**
> void DeleteBuild (string appId, int buildId)



Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId` and `buildId`.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class DeleteBuildExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new BuildV1Api(config);
            var appId = "appId_example";  // string | 
            var buildId = 56;  // int | 

            try
            {
                apiInstance.DeleteBuild(appId, buildId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BuildV1Api.DeleteBuild: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteBuildWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteBuildWithHttpInfo(appId, buildId);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BuildV1Api.DeleteBuildWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **buildId** | **int** |  |  |

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
| **422** |  |  -  |
| **500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getbuildinfo"></a>
# **GetBuildInfo**
> Build GetBuildInfo (string appId, int buildId)



Get details for an existing [build](https://hathora.dev/docs/concepts/hathora-entities#build) using `appId` and `buildId`.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetBuildInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new BuildV1Api(config);
            var appId = "appId_example";  // string | 
            var buildId = 56;  // int | 

            try
            {
                Build result = apiInstance.GetBuildInfo(appId, buildId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BuildV1Api.GetBuildInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBuildInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Build> response = apiInstance.GetBuildInfoWithHttpInfo(appId, buildId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BuildV1Api.GetBuildInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **buildId** | **int** |  |  |

### Return type

[**Build**](Build.md)

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

<a name="getbuilds"></a>
# **GetBuilds**
> List&lt;Build&gt; GetBuilds (string appId)



Returns an array of [build](https://hathora.dev/docs/concepts/hathora-entities#build) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetBuildsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new BuildV1Api(config);
            var appId = "appId_example";  // string | 

            try
            {
                List<Build> result = apiInstance.GetBuilds(appId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BuildV1Api.GetBuilds: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBuildsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<Build>> response = apiInstance.GetBuildsWithHttpInfo(appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BuildV1Api.GetBuildsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |

### Return type

[**List&lt;Build&gt;**](Build.md)

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

<a name="runbuild"></a>
# **RunBuild**
> byte[] RunBuild (string appId, int buildId, System.IO.Stream file)



Provide a tarball that will generate a container image for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Pass in `buildId` generated from Create Build.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class RunBuildExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: auth0
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new BuildV1Api(config);
            var appId = "appId_example";  // string | 
            var buildId = 56;  // int | 
            var file = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | 

            try
            {
                byte[] result = apiInstance.RunBuild(appId, buildId, file);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BuildV1Api.RunBuild: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RunBuildWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<byte[]> response = apiInstance.RunBuildWithHttpInfo(appId, buildId, file);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BuildV1Api.RunBuildWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **buildId** | **int** |  |  |
| **file** | **System.IO.Stream****System.IO.Stream** |  |  |

### Return type

**byte[]**

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

