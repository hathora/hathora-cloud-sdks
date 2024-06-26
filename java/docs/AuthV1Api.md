# AuthV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loginAnonymous**](AuthV1Api.md#loginAnonymous) | **POST** /auth/v1/{appId}/login/anonymous |  |
| [**loginGoogle**](AuthV1Api.md#loginGoogle) | **POST** /auth/v1/{appId}/login/google |  |
| [**loginNickname**](AuthV1Api.md#loginNickname) | **POST** /auth/v1/{appId}/login/nickname |  |


<a name="loginAnonymous"></a>
# **loginAnonymous**
> PlayerTokenObject loginAnonymous(appId)



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
      PlayerTokenObject result = apiInstance.loginAnonymous(appId);
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

<a name="loginGoogle"></a>
# **loginGoogle**
> PlayerTokenObject loginGoogle(appId, googleIdTokenObject)



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
    GoogleIdTokenObject googleIdTokenObject = new GoogleIdTokenObject(); // GoogleIdTokenObject | 
    try {
      PlayerTokenObject result = apiInstance.loginGoogle(appId, googleIdTokenObject);
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
| **googleIdTokenObject** | [**GoogleIdTokenObject**](GoogleIdTokenObject.md)|  | |

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

<a name="loginNickname"></a>
# **loginNickname**
> PlayerTokenObject loginNickname(appId, nicknameObject)



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
    NicknameObject nicknameObject = new NicknameObject(); // NicknameObject | 
    try {
      PlayerTokenObject result = apiInstance.loginNickname(appId, nicknameObject);
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
| **nicknameObject** | [**NicknameObject**](NicknameObject.md)|  | |

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

