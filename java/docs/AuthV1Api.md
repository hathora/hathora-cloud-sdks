# AuthV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loginAnonymous**](AuthV1Api.md#loginAnonymous) | **POST** /auth/v1/{appId}/login/anonymous |  |
| [**loginGoogle**](AuthV1Api.md#loginGoogle) | **POST** /auth/v1/{appId}/login/google |  |
| [**loginNickname**](AuthV1Api.md#loginNickname) | **POST** /auth/v1/{appId}/login/nickname |  |


<a name="loginAnonymous"></a>
# **loginAnonymous**
> LoginResponse loginAnonymous(appId)



Returns a unique player token for an anonymous user.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.AuthV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    AuthV1Api apiInstance = new AuthV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      LoginResponse result = apiInstance.loginAnonymous(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthV1Api#loginAnonymous");
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
| **appId** | **String**|  | |

### Return type

[**LoginResponse**](LoginResponse.md)

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

<a name="loginGoogle"></a>
# **loginGoogle**
> LoginResponse loginGoogle(appId, loginGoogleRequest)



Returns a unique player token using a Google-signed OIDC &#x60;idToken&#x60;.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.AuthV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    AuthV1Api apiInstance = new AuthV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    LoginGoogleRequest loginGoogleRequest = new LoginGoogleRequest(); // LoginGoogleRequest | 
    try {
      LoginResponse result = apiInstance.loginGoogle(appId, loginGoogleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthV1Api#loginGoogle");
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
| **appId** | **String**|  | |
| **loginGoogleRequest** | [**LoginGoogleRequest**](LoginGoogleRequest.md)|  | |

### Return type

[**LoginResponse**](LoginResponse.md)

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

<a name="loginNickname"></a>
# **loginNickname**
> LoginResponse loginNickname(appId, loginNicknameRequest)



Returns a unique player token with a specified nickname for a user.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.models.*;
import com.hathora.client.api.AuthV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");

    AuthV1Api apiInstance = new AuthV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    LoginNicknameRequest loginNicknameRequest = new LoginNicknameRequest(); // LoginNicknameRequest | 
    try {
      LoginResponse result = apiInstance.loginNickname(appId, loginNicknameRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthV1Api#loginNickname");
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
| **appId** | **String**|  | |
| **loginNicknameRequest** | [**LoginNicknameRequest**](LoginNicknameRequest.md)|  | |

### Return type

[**LoginResponse**](LoginResponse.md)

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

