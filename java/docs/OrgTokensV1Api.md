# OrgTokensV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrgToken**](OrgTokensV1Api.md#createOrgToken) | **POST** /tokens/v1/orgs/{orgId}/create |  |
| [**getOrgTokens**](OrgTokensV1Api.md#getOrgTokens) | **GET** /tokens/v1/orgs/{orgId} |  |
| [**revokeOrgToken**](OrgTokensV1Api.md#revokeOrgToken) | **POST** /tokens/v1/orgs/{orgId}/tokens/{orgTokenId}/revoke |  |


<a name="createOrgToken"></a>
# **createOrgToken**
> CreatedOrgToken createOrgToken(orgId, createOrgToken)



Create a new organization token.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.OrgTokensV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    OrgTokensV1Api apiInstance = new OrgTokensV1Api(defaultClient);
    String orgId = "orgId_example"; // String | 
    CreateOrgToken createOrgToken = new CreateOrgToken(); // CreateOrgToken | 
    try {
      CreatedOrgToken result = apiInstance.createOrgToken(orgId, createOrgToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgTokensV1Api#createOrgToken");
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
| **orgId** | **String**|  | |
| **createOrgToken** | [**CreateOrgToken**](CreateOrgToken.md)|  | |

### Return type

[**CreatedOrgToken**](CreatedOrgToken.md)

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
| **422** |  |  -  |

<a name="getOrgTokens"></a>
# **getOrgTokens**
> ListOrgTokens getOrgTokens(orgId)



List all organization tokens for a given org.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.OrgTokensV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    OrgTokensV1Api apiInstance = new OrgTokensV1Api(defaultClient);
    String orgId = "orgId_example"; // String | 
    try {
      ListOrgTokens result = apiInstance.getOrgTokens(orgId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgTokensV1Api#getOrgTokens");
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
| **orgId** | **String**|  | |

### Return type

[**ListOrgTokens**](ListOrgTokens.md)

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

<a name="revokeOrgToken"></a>
# **revokeOrgToken**
> Boolean revokeOrgToken(orgId, orgTokenId)



Revoke an organization token.

### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.OrgTokensV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    OrgTokensV1Api apiInstance = new OrgTokensV1Api(defaultClient);
    String orgId = "orgId_example"; // String | 
    String orgTokenId = "orgTokenId_example"; // String | 
    try {
      Boolean result = apiInstance.revokeOrgToken(orgId, orgTokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgTokensV1Api#revokeOrgToken");
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
| **orgId** | **String**|  | |
| **orgTokenId** | **String**|  | |

### Return type

**Boolean**

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

