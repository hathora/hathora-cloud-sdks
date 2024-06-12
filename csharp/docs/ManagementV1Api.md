# Hathora.Cloud.Sdk.Api.ManagementV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SendVerificationEmail**](ManagementV1Api.md#sendverificationemail) | **POST** /management/v1/sendverificationemail |  |

<a name="sendverificationemail"></a>
# **SendVerificationEmail**
> VerificationEmailSuccess SendVerificationEmail (VerificationEmailRequest verificationEmailRequest)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class SendVerificationEmailExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            var apiInstance = new ManagementV1Api(config);
            var verificationEmailRequest = new VerificationEmailRequest(); // VerificationEmailRequest | 

            try
            {
                VerificationEmailSuccess result = apiInstance.SendVerificationEmail(verificationEmailRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ManagementV1Api.SendVerificationEmail: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SendVerificationEmailWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<VerificationEmailSuccess> response = apiInstance.SendVerificationEmailWithHttpInfo(verificationEmailRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ManagementV1Api.SendVerificationEmailWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **verificationEmailRequest** | [**VerificationEmailRequest**](VerificationEmailRequest.md) |  |  |

### Return type

[**VerificationEmailSuccess**](VerificationEmailSuccess.md)

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
| **429** |  |  -  |
| **500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

