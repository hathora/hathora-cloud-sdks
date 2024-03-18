

# Build

A build represents a game server artifact and its associated metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buildTag** | **String** | Tag to associate an external version with a build. It is accessible via [&#x60;GetBuildInfo()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/GetBuildInfo). |  [optional] |
|**regionalContainerTags** | [**List&lt;BuildRegionalContainerTagsInner&gt;**](BuildRegionalContainerTagsInner.md) |  |  |
|**imageSize** | **Integer** | The size (in bytes) of the Docker image built by Hathora. |  |
|**status** | **BuildStatus** |  |  |
|**deletedAt** | **OffsetDateTime** | When the build was deleted. |  |
|**finishedAt** | **OffsetDateTime** | When [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) finished executing. |  |
|**startedAt** | **OffsetDateTime** | When [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) is called. |  |
|**createdAt** | **OffsetDateTime** | When [&#x60;CreateBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild) is called. |  |
|**createdBy** | **String** | UserId or email address for the user that created the build. |  |
|**buildId** | **Integer** | System generated id for a build. Increments by 1. |  |
|**appId** | **String** | System generated unique identifier for an application. |  |



