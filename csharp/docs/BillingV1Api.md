# Hathora.Cloud.Sdk.Api.BillingV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetBalance**](BillingV1Api.md#getbalance) | **GET** /billing/v1/balance |  |
| [**GetInvoices**](BillingV1Api.md#getinvoices) | **GET** /billing/v1/invoices |  |
| [**GetPaymentMethod**](BillingV1Api.md#getpaymentmethod) | **GET** /billing/v1/paymentmethod |  |
| [**InitStripeCustomerPortalUrl**](BillingV1Api.md#initstripecustomerportalurl) | **POST** /billing/v1/customerportalurl |  |

<a name="getbalance"></a>
# **GetBalance**
> double GetBalance ()



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetBalanceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new BillingV1Api(config);

            try
            {
                double result = apiInstance.GetBalance();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BillingV1Api.GetBalance: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBalanceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<double> response = apiInstance.GetBalanceWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BillingV1Api.GetBalanceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

**double**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getinvoices"></a>
# **GetInvoices**
> List&lt;Invoice&gt; GetInvoices ()



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetInvoicesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new BillingV1Api(config);

            try
            {
                List<Invoice> result = apiInstance.GetInvoices();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BillingV1Api.GetInvoices: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetInvoicesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<Invoice>> response = apiInstance.GetInvoicesWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BillingV1Api.GetInvoicesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**List&lt;Invoice&gt;**](Invoice.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpaymentmethod"></a>
# **GetPaymentMethod**
> PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod GetPaymentMethod ()



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class GetPaymentMethodExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new BillingV1Api(config);

            try
            {
                PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod result = apiInstance.GetPaymentMethod();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BillingV1Api.GetPaymentMethod: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetPaymentMethodWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod> response = apiInstance.GetPaymentMethodWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BillingV1Api.GetPaymentMethodWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod**](PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod.md)

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
| **500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="initstripecustomerportalurl"></a>
# **InitStripeCustomerPortalUrl**
> string InitStripeCustomerPortalUrl (CustomerPortalUrl customerPortalUrl)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Hathora.Cloud.Sdk.Api;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Example
{
    public class InitStripeCustomerPortalUrlExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.hathora.dev";
            // Configure Bearer token for authorization: hathoraDevToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new BillingV1Api(config);
            var customerPortalUrl = new CustomerPortalUrl(); // CustomerPortalUrl | 

            try
            {
                string result = apiInstance.InitStripeCustomerPortalUrl(customerPortalUrl);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BillingV1Api.InitStripeCustomerPortalUrl: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the InitStripeCustomerPortalUrlWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<string> response = apiInstance.InitStripeCustomerPortalUrlWithHttpInfo(customerPortalUrl);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BillingV1Api.InitStripeCustomerPortalUrlWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **customerPortalUrl** | [**CustomerPortalUrl**](CustomerPortalUrl.md) |  |  |

### Return type

**string**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

