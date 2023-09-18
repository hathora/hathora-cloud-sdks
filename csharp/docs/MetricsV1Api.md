# Hathora.Cloud.Sdk.Api.MetricsV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetMetrics**](MetricsV1Api.md#getmetrics) | **GET** /metrics/v1/{appId}/process/{processId} |  |

<a name="getmetrics"></a>
# **GetMetrics**
> RecordPartialMetricNameMetricValueArray GetMetrics (string appId, string processId, List<MetricName> metrics = null, double? end = null, double? start = null, int? step = null)



Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetMetricsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new MetricsV1Api(config);
            var appId = "appId_example";  // string | 
            var processId = "processId_example";  // string | 
            var metrics = new List<MetricName>(); // List<MetricName> | Available metrics to query over time. (optional) 
            var end = 1.2D;  // double? | Unix timestamp. Default is current time. (optional) 
            var start = 1.2D;  // double? | Unix timestamp. Default is -1 hour from `end`. (optional) 
            var step = 56;  // int? |  (optional) 

            try
            {
                RecordPartialMetricNameMetricValueArray result = apiInstance.GetMetrics(appId, processId, metrics, end, start, step);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MetricsV1Api.GetMetrics: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetMetricsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<RecordPartialMetricNameMetricValueArray> response = apiInstance.GetMetricsWithHttpInfo(appId, processId, metrics, end, start, step);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MetricsV1Api.GetMetricsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  |  |
| **processId** | **string** |  |  |
| **metrics** | [**List&lt;MetricName&gt;**](MetricName.md) | Available metrics to query over time. | [optional]  |
| **end** | **double?** | Unix timestamp. Default is current time. | [optional]  |
| **start** | **double?** | Unix timestamp. Default is -1 hour from &#x60;end&#x60;. | [optional]  |
| **step** | **int?** |  | [optional]  |

### Return type

[**RecordPartialMetricNameMetricValueArray**](RecordPartialMetricNameMetricValueArray.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

