# BillingV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalance**](BillingV1Api.md#getBalance) | **GET** /billing/v1/balance |  |
| [**getInvoices**](BillingV1Api.md#getInvoices) | **GET** /billing/v1/invoices |  |
| [**getPaymentMethod**](BillingV1Api.md#getPaymentMethod) | **GET** /billing/v1/paymentmethod |  |
| [**initStripeCustomerPortalUrl**](BillingV1Api.md#initStripeCustomerPortalUrl) | **POST** /billing/v1/customerportalurl |  |


<a name="getBalance"></a>
# **getBalance**
> Double getBalance()



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BillingV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BillingV1Api apiInstance = new BillingV1Api(defaultClient);
    try {
      Double result = apiInstance.getBalance();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingV1Api#getBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Double**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

<a name="getInvoices"></a>
# **getInvoices**
> List&lt;Invoice&gt; getInvoices()



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BillingV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BillingV1Api apiInstance = new BillingV1Api(defaultClient);
    try {
      List<Invoice> result = apiInstance.getInvoices();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingV1Api#getInvoices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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
| **401** |  |  -  |
| **404** |  |  -  |

<a name="getPaymentMethod"></a>
# **getPaymentMethod**
> PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod getPaymentMethod()



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BillingV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BillingV1Api apiInstance = new BillingV1Api(defaultClient);
    try {
      PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod result = apiInstance.getPaymentMethod();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingV1Api#getPaymentMethod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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
| **401** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="initStripeCustomerPortalUrl"></a>
# **initStripeCustomerPortalUrl**
> String initStripeCustomerPortalUrl(customerPortalUrl)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BillingV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BillingV1Api apiInstance = new BillingV1Api(defaultClient);
    CustomerPortalUrl customerPortalUrl = new CustomerPortalUrl(); // CustomerPortalUrl | 
    try {
      String result = apiInstance.initStripeCustomerPortalUrl(customerPortalUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingV1Api#initStripeCustomerPortalUrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerPortalUrl** | [**CustomerPortalUrl**](CustomerPortalUrl.md)|  | |

### Return type

**String**

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

