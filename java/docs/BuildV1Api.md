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
> Build createBuild(appId)



Generate a new &#x60;buildId&#x60; for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;. You need &#x60;buildId&#x60; to run a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

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
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    BuildV1Api apiInstance = new BuildV1Api(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      Build result = apiInstance.createBuild(appId);
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

### Return type

[**Build**](Build.md)

### Authorization

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: Not defined
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



Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60; and &#x60;buildId&#x60;.

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
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

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

[auth0](../README.md#auth0)

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



Get details for an existing [build](https://hathora.dev/docs/concepts/hathora-entities#build) using &#x60;appId&#x60; and &#x60;buildId&#x60;.

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
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

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

[auth0](../README.md#auth0)

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



Returns an array of [build](https://hathora.dev/docs/concepts/hathora-entities#build) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;.

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
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

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

[auth0](../README.md#auth0)

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



Provide a tarball that will generate a container image for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using &#x60;appId&#x60;. Pass in &#x60;buildId&#x60; generated from Create Build.

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
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

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

[auth0](../README.md#auth0)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

