

# Application

An application object is the top level namespace for the game server.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deletedBy** | **String** | Email address for the user that deleted the application. |  |
|**deletedAt** | **OffsetDateTime** | When the application was deleted. |  |
|**createdAt** | **OffsetDateTime** | When the application was created. |  |
|**createdBy** | **String** | Email address for the user that deleted the application. |  |
|**orgId** | **String** | System generated unique identifier for an organization. |  |
|**authConfiguration** | [**ApplicationAuthConfiguration**](ApplicationAuthConfiguration.md) |  |  |
|**appSecret** | **String** | Secret that is used for identity and access management. |  |
|**appId** | **String** | System generated unique identifier for an application. |  |
|**appName** | **String** | Readable name for an application. Must be unique within an organization. |  |


