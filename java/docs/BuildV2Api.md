# BuildV2Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBuild**](BuildV2Api.md#createBuild) | **POST** /builds/v2/{appId}/create |  |
| [**deleteBuild**](BuildV2Api.md#deleteBuild) | **DELETE** /builds/v2/{appId}/delete/{buildId} |  |
| [**getBuildInfo**](BuildV2Api.md#getBuildInfo) | **GET** /builds/v2/{appId}/info/{buildId} |  |
| [**getBuilds**](BuildV2Api.md#getBuilds) | **GET** /builds/v2/{appId}/list |  |
| [**runBuild**](BuildV2Api.md#runBuild) | **POST** /builds/v2/{appId}/run/{buildId} |  |


<a name="createBuild"></a>
# **createBuild**
> Build createBuild(appId, createBuildParams)



Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a &#x60;buildId&#x60; that you must pass to [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a &#x60;buildTag&#x60; to associate an external version with a build.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BuildV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV2Api apiInstance = new BuildV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    CreateBuildParams createBuildParams = new CreateBuildParams(); // CreateBuildParams | 
    try {
      Build result = apiInstance.createBuild(appId, createBuildParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV2Api#createBuild");
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
| **createBuildParams** | [**CreateBuildParams**](CreateBuildParams.md)|  | |

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
| **401** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |
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
import com.hathora.client.api.BuildV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV2Api apiInstance = new BuildV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer buildId = 56; // Integer | 
    try {
      apiInstance.deleteBuild(appId, buildId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV2Api#deleteBuild");
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
| **401** |  |  -  |
| **404** |  |  -  |
| **422** |  |  -  |
| **429** |  |  -  |
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
import com.hathora.client.api.BuildV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV2Api apiInstance = new BuildV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer buildId = 56; // Integer | 
    try {
      Build result = apiInstance.getBuildInfo(appId, buildId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV2Api#getBuildInfo");
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
| **401** |  |  -  |
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
import com.hathora.client.api.BuildV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV2Api apiInstance = new BuildV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<Build> result = apiInstance.getBuilds(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV2Api#getBuilds");
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
| **401** |  |  -  |
| **404** |  |  -  |

<a name="runBuild"></a>
# **runBuild**
> File runBuild(appId, buildId, _file)



Builds a game server artifact from a tarball you provide. Pass in the &#x60;buildId&#x60; generated from [&#x60;CreateBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.BuildV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    BuildV2Api apiInstance = new BuildV2Api(defaultClient);
    String appId = "appId_example"; // String | 
    Integer buildId = 56; // Integer | 
    File _file = new File("/path/to/file"); // File | 
    try {
      File result = apiInstance.runBuild(appId, buildId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuildV2Api#runBuild");
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

[**File**](File.md)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

