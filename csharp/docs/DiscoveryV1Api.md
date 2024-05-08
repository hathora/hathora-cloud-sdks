# Hathora.Cloud.Sdk.Api.DiscoveryV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetPingServiceEndpointsDeprecated**](DiscoveryV1Api.md#getpingserviceendpointsdeprecated) | **GET** /discovery/v1/ping |  |

<a name="getpingserviceendpointsdeprecated"></a>
# **GetPingServiceEndpointsDeprecated**
> List&lt;PingEndpointsInner&gt; GetPingServiceEndpointsDeprecated ()



Returns an array of V1 regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetPingServiceEndpointsDeprecatedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new DiscoveryV1Api(config);

            try
            {
                List<PingEndpointsInner> result = apiInstance.GetPingServiceEndpointsDeprecated();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryV1Api.GetPingServiceEndpointsDeprecated: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetPingServiceEndpointsDeprecatedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<PingEndpointsInner>> response = apiInstance.GetPingServiceEndpointsDeprecatedWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryV1Api.GetPingServiceEndpointsDeprecatedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**List&lt;PingEndpointsInner&gt;**](PingEndpointsInner.md)

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

