# BuildV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBuild**](BuildV1Api.md#createBuild) | **POST** /builds/v1/{appId}/create |  |
| [**deleteBuild**](BuildV1Api.md#deleteBuild) | **DELETE** /builds/v1/{appId}/delete/{buildId} |  |
| [**getBuildInfo**](BuildV1Api.md#getBuildInfo) | **GET** /builds/v1/{appId}/info/{buildId} |  |
| [**getBuilds**](BuildV1Api.md#getBuilds) | **GET** /builds/v1/{appId}/list |  |
| [**runBuild**](BuildV1Api.md#runBuild) | **POST** /builds/v1/{appId}/run/{buildId} |  |


<a name="createBuild"></a>
# **createBuild**
> Build createBuild(appId, createBuildRequest)



Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a &#x60;buildId&#x60; that you must pass to [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a &#x60;buildTag&#x60; to associate an external version with a build.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BuildV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV1Api apiInstance = new BuildV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreateBuildRequest createBuildRequest = new CreateBuildRequest(); // CreateBuildRequest | 
    try {
      Build result = apiInstance.createBuild(appId, createBuildRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV1Api#createBuild");
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
| **createBuildRequest** | [**CreateBuildRequest**](CreateBuildRequest.md)|  | |

### Return type

[**Build**](Build.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="deleteBuild"></a>
# **deleteBuild**
> deleteBuild(appId, buildId)



Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BuildV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV1Api apiInstance = new BuildV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer buildId = 56; // Integer | 
    try {
      apiInstance.deleteBuild(appId, buildId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV1Api#deleteBuild");
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
| **buildId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

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

<a name="getBuildInfo"></a>
# **getBuildInfo**
> Build getBuildInfo(appId, buildId)



Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BuildV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV1Api apiInstance = new BuildV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer buildId = 56; // Integer | 
    try {
      Build result = apiInstance.getBuildInfo(appId, buildId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV1Api#getBuildInfo");
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
| **buildId** | **Integer**|  | |

### Return type

[**Build**](Build.md)

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

<a name="getBuilds"></a>
# **getBuilds**
> List&lt;Build&gt; getBuilds(appId)



Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BuildV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV1Api apiInstance = new BuildV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<Build> result = apiInstance.getBuilds(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV1Api#getBuilds");
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

[**List&lt;Build&gt;**](Build.md)

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

<a name="runBuild"></a>
# **runBuild**
> byte[] runBuild(appId, buildId, _file)



Builds a game server artifact from a tarball you provide. Pass in the &#x60;buildId&#x60; generated from [&#x60;CreateBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BuildV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV1Api apiInstance = new BuildV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer buildId = 56; // Integer | 
    File _file = new File("/path/to/file"); // File | 
    try {
      byte[] result = apiInstance.runBuild(appId, buildId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV1Api#runBuild");
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
| **buildId** | **Integer**|  | |
| **_file** | **File**|  | |

### Return type

**byte[]**

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

