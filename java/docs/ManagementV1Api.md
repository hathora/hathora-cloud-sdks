# ManagementV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendVerificationEmail**](ManagementV1Api.md#sendVerificationEmail) | **POST** /management/v1/sendverificationemail |  |


<a name="sendVerificationEmail"></a>
# **sendVerificationEmail**
> VerificationEmailResponse sendVerificationEmail(verificationEmailRequest)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.ManagementV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    ManagementV1Api apiInstance = new ManagementV1Api(defaultClient);
    VerificationEmailRequest verificationEmailRequest = new VerificationEmailRequest(); // VerificationEmailRequest | 
    try {
      VerificationEmailResponse result = apiInstance.sendVerificationEmail(verificationEmailRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementV1Api#sendVerificationEmail");
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
| **verificationEmailRequest** | [**VerificationEmailRequest**](VerificationEmailRequest.md)|  | |

### Return type

[**VerificationEmailResponse**](VerificationEmailResponse.md)

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
| **500** |  |  -  |

