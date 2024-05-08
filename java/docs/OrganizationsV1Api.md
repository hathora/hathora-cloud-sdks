# OrganizationsV1Api

All URIs are relative to *https://api.hathora.dev*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptInvite**](OrganizationsV1Api.md#acceptInvite) | **POST** /orgs/v1/{orgId}/invites/accept |  |
| [**getOrgPendingInvites**](OrganizationsV1Api.md#getOrgPendingInvites) | **GET** /orgs/v1/{orgId}/invites/pending |  |
| [**getUserPendingInvites**](OrganizationsV1Api.md#getUserPendingInvites) | **GET** /orgs/v1/user/invites/pending |  |
| [**inviteUser**](OrganizationsV1Api.md#inviteUser) | **PUT** /orgs/v1/{orgId}/invites |  |
| [**rejectInvite**](OrganizationsV1Api.md#rejectInvite) | **POST** /orgs/v1/{orgId}/invites/reject |  |
| [**rescindInvite**](OrganizationsV1Api.md#rescindInvite) | **POST** /orgs/v1/{orgId}/invites/rescind |  |


<a name="acceptInvite"></a>
# **acceptInvite**
> acceptInvite(orgId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.OrganizationsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    OrganizationsV1Api apiInstance = new OrganizationsV1Api(defaultClient);
    String orgId = "orgId_example"; // String | 
    try {
      apiInstance.acceptInvite(orgId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsV1Api#acceptInvite");
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
| **429** |  |  -  |

<a name="getOrgPendingInvites"></a>
# **getOrgPendingInvites**
> OrgInvitesPage getOrgPendingInvites(orgId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.OrganizationsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    OrganizationsV1Api apiInstance = new OrganizationsV1Api(defaultClient);
    String orgId = "orgId_example"; // String | 
    try {
      OrgInvitesPage result = apiInstance.getOrgPendingInvites(orgId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsV1Api#getOrgPendingInvites");
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

[**OrgInvitesPage**](OrgInvitesPage.md)

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
| **429** |  |  -  |

<a name="getUserPendingInvites"></a>
# **getUserPendingInvites**
> OrgInvitesPage getUserPendingInvites()



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.OrganizationsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    OrganizationsV1Api apiInstance = new OrganizationsV1Api(defaultClient);
    try {
      OrgInvitesPage result = apiInstance.getUserPendingInvites();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsV1Api#getUserPendingInvites");
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

[**OrgInvitesPage**](OrgInvitesPage.md)

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
| **429** |  |  -  |

<a name="inviteUser"></a>
# **inviteUser**
> OrgPermission inviteUser(orgId, createUserInvite)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.OrganizationsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    OrganizationsV1Api apiInstance = new OrganizationsV1Api(defaultClient);
    String orgId = "orgId_example"; // String | 
    CreateUserInvite createUserInvite = new CreateUserInvite(); // CreateUserInvite | 
    try {
      OrgPermission result = apiInstance.inviteUser(orgId, createUserInvite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsV1Api#inviteUser");
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
| **createUserInvite** | [**CreateUserInvite**](CreateUserInvite.md)|  | |

### Return type

[**OrgPermission**](OrgPermission.md)

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
| **422** |  |  -  |
| **429** |  |  -  |

<a name="rejectInvite"></a>
# **rejectInvite**
> rejectInvite(orgId)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.OrganizationsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    OrganizationsV1Api apiInstance = new OrganizationsV1Api(defaultClient);
    String orgId = "orgId_example"; // String | 
    try {
      apiInstance.rejectInvite(orgId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsV1Api#rejectInvite");
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
| **429** |  |  -  |

<a name="rescindInvite"></a>
# **rescindInvite**
> rescindInvite(orgId, rescindUserInvite)



### Example
```java
// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.OrganizationsV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: hathoraDevToken
    HttpBearerAuth hathoraDevToken = (HttpBearerAuth) defaultClient.getAuthentication("hathoraDevToken");
    hathoraDevToken.setBearerToken("BEARER TOKEN");

    OrganizationsV1Api apiInstance = new OrganizationsV1Api(defaultClient);
    String orgId = "orgId_example"; // String | 
    RescindUserInvite rescindUserInvite = new RescindUserInvite(); // RescindUserInvite | 
    try {
      apiInstance.rescindInvite(orgId, rescindUserInvite);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsV1Api#rescindInvite");
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
| **rescindUserInvite** | [**RescindUserInvite**](RescindUserInvite.md)|  | |

### Return type

null (empty response body)

### Authorization

[hathoraDevToken](../README.md#hathoraDevToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

