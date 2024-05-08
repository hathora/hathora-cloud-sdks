# Hathora.Cloud.Sdk.Api.AuthV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**LoginAnonymous**](AuthV1Api.md#loginanonymous) | **POST** /auth/v1/{appId}/login/anonymous |  |
| [**LoginGoogle**](AuthV1Api.md#logingoogle) | **POST** /auth/v1/{appId}/login/google |  |
| [**LoginNickname**](AuthV1Api.md#loginnickname) | **POST** /auth/v1/{appId}/login/nickname |  |

<a name="loginanonymous"></a>
# **LoginAnonymous**
> PlayerTokenObject LoginAnonymous (string appId)



Returns a unique player token for an anonymous user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class LoginAnonymousExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new AuthV1Api(config);
            var appId = "appId_example";  // string | 

            try
            {
                PlayerTokenObject result = apiInstance.LoginAnonymous(appId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthV1Api.LoginAnonymous: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LoginAnonymousWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<PlayerTokenObject> response = apiInstance.LoginAnonymousWithHttpInfo(appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthV1Api.LoginAnonymousWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |

### Return type

[**PlayerTokenObject**](PlayerTokenObject.md)

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

<a name="logingoogle"></a>
# **LoginGoogle**
> PlayerTokenObject LoginGoogle (string appId, GoogleIdTokenObject googleIdTokenObject)



Returns a unique player token using a Google-signed OIDC `idToken`.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class LoginGoogleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new AuthV1Api(config);
            var appId = "appId_example";  // string | 
            var googleIdTokenObject = new GoogleIdTokenObject(); // GoogleIdTokenObject | 

            try
            {
                PlayerTokenObject result = apiInstance.LoginGoogle(appId, googleIdTokenObject);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthV1Api.LoginGoogle: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LoginGoogleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<PlayerTokenObject> response = apiInstance.LoginGoogleWithHttpInfo(appId, googleIdTokenObject);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthV1Api.LoginGoogleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **googleIdTokenObject** | [**GoogleIdTokenObject**](GoogleIdTokenObject.md) |  |  |

### Return type

[**PlayerTokenObject**](PlayerTokenObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="loginnickname"></a>
# **LoginNickname**
> PlayerTokenObject LoginNickname (string appId, NicknameObject nicknameObject)



Returns a unique player token with a specified nickname for a user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class LoginNicknameExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new AuthV1Api(config);
            var appId = "appId_example";  // string | 
            var nicknameObject = new NicknameObject(); // NicknameObject | 

            try
            {
                PlayerTokenObject result = apiInstance.LoginNickname(appId, nicknameObject);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthV1Api.LoginNickname: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LoginNicknameWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<PlayerTokenObject> response = apiInstance.LoginNicknameWithHttpInfo(appId, nicknameObject);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthV1Api.LoginNicknameWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **nicknameObject** | [**NicknameObject**](NicknameObject.md) |  |  |

### Return type

[**PlayerTokenObject**](PlayerTokenObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

