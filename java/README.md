# hathora-cloud-sdk

Hathora Cloud API
- API version: 0.0.1

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.hathora</groupId>
  <artifactId>hathora-cloud-sdk</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'hathora-cloud-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'hathora-cloud-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.hathora:hathora-cloud-sdk:0.0.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/hathora-cloud-sdk-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.hathora.client.ApiClient;
import com.hathora.client.ApiException;
import com.hathora.client.Configuration;
import com.hathora.client.auth.*;
import com.hathora.client.models.*;
import com.hathora.client.api.AppV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hathora.dev");
    
    // Configure HTTP bearer authorization: auth0
    HttpBearerAuth auth0 = (HttpBearerAuth) defaultClient.getAuthentication("auth0");
    auth0.setBearerToken("BEARER TOKEN");

    AppV1Api apiInstance = new AppV1Api(defaultClient);
    AppConfig appConfig = new AppConfig(); // AppConfig | 
    try {
      Application result = apiInstance.createApp(appConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppV1Api#createApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.hathora.dev*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppV1Api* | [**createApp**](docs/AppV1Api.md#createApp) | **POST** /apps/v1/create | 
*AppV1Api* | [**deleteApp**](docs/AppV1Api.md#deleteApp) | **DELETE** /apps/v1/delete/{appId} | 
*AppV1Api* | [**getAppInfo**](docs/AppV1Api.md#getAppInfo) | **GET** /apps/v1/info/{appId} | 
*AppV1Api* | [**getApps**](docs/AppV1Api.md#getApps) | **GET** /apps/v1/list | 
*AppV1Api* | [**updateApp**](docs/AppV1Api.md#updateApp) | **POST** /apps/v1/update/{appId} | 
*AuthV1Api* | [**loginAnonymous**](docs/AuthV1Api.md#loginAnonymous) | **POST** /auth/v1/{appId}/login/anonymous | 
*AuthV1Api* | [**loginGoogle**](docs/AuthV1Api.md#loginGoogle) | **POST** /auth/v1/{appId}/login/google | 
*AuthV1Api* | [**loginNickname**](docs/AuthV1Api.md#loginNickname) | **POST** /auth/v1/{appId}/login/nickname | 
*BuildV1Api* | [**createBuild**](docs/BuildV1Api.md#createBuild) | **POST** /builds/v1/{appId}/create | 
*BuildV1Api* | [**deleteBuild**](docs/BuildV1Api.md#deleteBuild) | **DELETE** /builds/v1/{appId}/delete/{buildId} | 
*BuildV1Api* | [**getBuildInfo**](docs/BuildV1Api.md#getBuildInfo) | **GET** /builds/v1/{appId}/info/{buildId} | 
*BuildV1Api* | [**getBuilds**](docs/BuildV1Api.md#getBuilds) | **GET** /builds/v1/{appId}/list | 
*BuildV1Api* | [**runBuild**](docs/BuildV1Api.md#runBuild) | **POST** /builds/v1/{appId}/run/{buildId} | 
*DeploymentV1Api* | [**createDeployment**](docs/DeploymentV1Api.md#createDeployment) | **POST** /deployments/v1/{appId}/create/{buildId} | 
*DeploymentV1Api* | [**getDeploymentInfo**](docs/DeploymentV1Api.md#getDeploymentInfo) | **GET** /deployments/v1/{appId}/info/{deploymentId} | 
*DeploymentV1Api* | [**getDeployments**](docs/DeploymentV1Api.md#getDeployments) | **GET** /deployments/v1/{appId}/list | 
*DiscoveryV1Api* | [**getPingServiceEndpoints**](docs/DiscoveryV1Api.md#getPingServiceEndpoints) | **GET** /discovery/v1/ping | 
*LobbyV1Api* | [**createPrivateLobbyDeprecated**](docs/LobbyV1Api.md#createPrivateLobbyDeprecated) | **POST** /lobby/v1/{appId}/create/private | 
*LobbyV1Api* | [**createPublicLobbyDeprecated**](docs/LobbyV1Api.md#createPublicLobbyDeprecated) | **POST** /lobby/v1/{appId}/create/public | 
*LobbyV1Api* | [**listActivePublicLobbiesDeprecated**](docs/LobbyV1Api.md#listActivePublicLobbiesDeprecated) | **GET** /lobby/v1/{appId}/list | 
*LobbyV2Api* | [**createLobby**](docs/LobbyV2Api.md#createLobby) | **POST** /lobby/v2/{appId}/create | 
*LobbyV2Api* | [**createLocalLobby**](docs/LobbyV2Api.md#createLocalLobby) | **POST** /lobby/v2/{appId}/create/local | 
*LobbyV2Api* | [**createPrivateLobby**](docs/LobbyV2Api.md#createPrivateLobby) | **POST** /lobby/v2/{appId}/create/private | 
*LobbyV2Api* | [**createPublicLobby**](docs/LobbyV2Api.md#createPublicLobby) | **POST** /lobby/v2/{appId}/create/public | 
*LobbyV2Api* | [**getLobbyInfo**](docs/LobbyV2Api.md#getLobbyInfo) | **GET** /lobby/v2/{appId}/info/{roomId} | 
*LobbyV2Api* | [**listActivePublicLobbies**](docs/LobbyV2Api.md#listActivePublicLobbies) | **GET** /lobby/v2/{appId}/list/public | 
*LobbyV2Api* | [**setLobbyState**](docs/LobbyV2Api.md#setLobbyState) | **POST** /lobby/v2/{appId}/setState/{roomId} | 
*LogV1Api* | [**getLogsForApp**](docs/LogV1Api.md#getLogsForApp) | **GET** /logs/v1/{appId}/all | 
*LogV1Api* | [**getLogsForDeployment**](docs/LogV1Api.md#getLogsForDeployment) | **GET** /logs/v1/{appId}/deployment/{deploymentId} | 
*LogV1Api* | [**getLogsForProcess**](docs/LogV1Api.md#getLogsForProcess) | **GET** /logs/v1/{appId}/process/{processId} | 
*MetricsV1Api* | [**getMetrics**](docs/MetricsV1Api.md#getMetrics) | **GET** /metrics/v1/{appId}/process/{processId} | 
*ProcessesV1Api* | [**getProcessInfo**](docs/ProcessesV1Api.md#getProcessInfo) | **GET** /processes/v1/{appId}/info/{processId} | 
*ProcessesV1Api* | [**getRunningProcesses**](docs/ProcessesV1Api.md#getRunningProcesses) | **GET** /processes/v1/{appId}/list/running | 
*ProcessesV1Api* | [**getStoppedProcesses**](docs/ProcessesV1Api.md#getStoppedProcesses) | **GET** /processes/v1/{appId}/list/stopped | 
*RoomV1Api* | [**createRoomDeprecated**](docs/RoomV1Api.md#createRoomDeprecated) | **POST** /rooms/v1/{appId}/create | 
*RoomV1Api* | [**destroyRoomDeprecated**](docs/RoomV1Api.md#destroyRoomDeprecated) | **POST** /rooms/v1/{appId}/destroy/{roomId} | 
*RoomV1Api* | [**getActiveRoomsForProcessDeprecated**](docs/RoomV1Api.md#getActiveRoomsForProcessDeprecated) | **GET** /rooms/v1/{appId}/list/{processId}/active | 
*RoomV1Api* | [**getConnectionInfoDeprecated**](docs/RoomV1Api.md#getConnectionInfoDeprecated) | **GET** /rooms/v1/{appId}/connectioninfo/{roomId} | 
*RoomV1Api* | [**getInactiveRoomsForProcessDeprecated**](docs/RoomV1Api.md#getInactiveRoomsForProcessDeprecated) | **GET** /rooms/v1/{appId}/list/{processId}/inactive | 
*RoomV1Api* | [**getRoomInfoDeprecated**](docs/RoomV1Api.md#getRoomInfoDeprecated) | **GET** /rooms/v1/{appId}/info/{roomId} | 
*RoomV1Api* | [**suspendRoomDeprecated**](docs/RoomV1Api.md#suspendRoomDeprecated) | **POST** /rooms/v1/{appId}/suspend/{roomId} | 
*RoomV2Api* | [**createRoom**](docs/RoomV2Api.md#createRoom) | **POST** /rooms/v2/{appId}/create | 
*RoomV2Api* | [**destroyRoom**](docs/RoomV2Api.md#destroyRoom) | **POST** /rooms/v2/{appId}/destroy/{roomId} | 
*RoomV2Api* | [**getActiveRoomsForProcess**](docs/RoomV2Api.md#getActiveRoomsForProcess) | **GET** /rooms/v2/{appId}/list/{processId}/active | 
*RoomV2Api* | [**getConnectionInfo**](docs/RoomV2Api.md#getConnectionInfo) | **GET** /rooms/v2/{appId}/connectioninfo/{roomId} | 
*RoomV2Api* | [**getInactiveRoomsForProcess**](docs/RoomV2Api.md#getInactiveRoomsForProcess) | **GET** /rooms/v2/{appId}/list/{processId}/inactive | 
*RoomV2Api* | [**getRoomInfo**](docs/RoomV2Api.md#getRoomInfo) | **GET** /rooms/v2/{appId}/info/{roomId} | 
*RoomV2Api* | [**suspendRoom**](docs/RoomV2Api.md#suspendRoom) | **POST** /rooms/v2/{appId}/suspend/{roomId} | 


## Documentation for Models

 - [ActiveConnectionInfo](docs/ActiveConnectionInfo.md)
 - [AppConfig](docs/AppConfig.md)
 - [Application](docs/Application.md)
 - [ApplicationAuthConfiguration](docs/ApplicationAuthConfiguration.md)
 - [ApplicationAuthConfigurationGoogle](docs/ApplicationAuthConfigurationGoogle.md)
 - [ApplicationWithDeployment](docs/ApplicationWithDeployment.md)
 - [ApplicationWithDeploymentAllOf](docs/ApplicationWithDeploymentAllOf.md)
 - [Build](docs/Build.md)
 - [BuildRegionalContainerTagsInner](docs/BuildRegionalContainerTagsInner.md)
 - [ConnectionInfo](docs/ConnectionInfo.md)
 - [ConnectionInfoV2](docs/ConnectionInfoV2.md)
 - [ContainerPort](docs/ContainerPort.md)
 - [CreateLobbyRequest](docs/CreateLobbyRequest.md)
 - [CreatePrivateLobbyRequest](docs/CreatePrivateLobbyRequest.md)
 - [CreateRoomRequest](docs/CreateRoomRequest.md)
 - [Deployment](docs/Deployment.md)
 - [DeploymentConfig](docs/DeploymentConfig.md)
 - [DeploymentConfigEnvInner](docs/DeploymentConfigEnvInner.md)
 - [DeploymentEnvInner](docs/DeploymentEnvInner.md)
 - [DiscoveryResponseInner](docs/DiscoveryResponseInner.md)
 - [ExposedPort](docs/ExposedPort.md)
 - [Lobby](docs/Lobby.md)
 - [LoginGoogleRequest](docs/LoginGoogleRequest.md)
 - [LoginNicknameRequest](docs/LoginNicknameRequest.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [MetricName](docs/MetricName.md)
 - [MetricValue](docs/MetricValue.md)
 - [PickRoomExcludeKeyofRoomAllocations](docs/PickRoomExcludeKeyofRoomAllocations.md)
 - [PlanName](docs/PlanName.md)
 - [Process](docs/Process.md)
 - [ProcessWithRooms](docs/ProcessWithRooms.md)
 - [ProcessWithRoomsAllOf](docs/ProcessWithRoomsAllOf.md)
 - [RecordPartialMetricNameMetricValueArray](docs/RecordPartialMetricNameMetricValueArray.md)
 - [Region](docs/Region.md)
 - [Room](docs/Room.md)
 - [RoomAllocation](docs/RoomAllocation.md)
 - [RoomStatus](docs/RoomStatus.md)
 - [SetLobbyStateRequest](docs/SetLobbyStateRequest.md)
 - [StartingConnectionInfo](docs/StartingConnectionInfo.md)
 - [TransportType](docs/TransportType.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### auth0

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


