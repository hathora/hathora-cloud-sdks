

# ApplicationWithLatestDeploymentAndBuild


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deletedBy** | **String** | UserId or email address for the user that deleted the application. |  |
|**deletedAt** | **OffsetDateTime** | When the application was deleted. |  |
|**createdAt** | **OffsetDateTime** | When the application was created. |  |
|**createdBy** | **String** | UserId or email address for the user that created the application. |  |
|**orgId** | **String** | System generated unique identifier for an organization. Not guaranteed to have a specific format. |  |
|**authConfiguration** | [**AuthConfiguration**](AuthConfiguration.md) |  |  |
|**appSecret** | **String** | Secret that is used for identity and access management. |  |
|**appId** | **String** | System generated unique identifier for an application. |  |
|**appName** | **String** | Readable name for an application. Must be unique within an organization. |  |
|**deployment** | [**ApplicationWithLatestDeploymentAndBuildAllOfDeployment**](ApplicationWithLatestDeploymentAndBuildAllOfDeployment.md) |  |  [optional] |



