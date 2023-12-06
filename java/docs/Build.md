

# Build

A build represents a game server artifact and its associated metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buildTag** | **String** | Tag to associate an external version with a build. It is accessible via [&#x60;GetBuildInfo()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/GetBuildInfo). |  |
|**regionalContainerTags** | [**List&lt;BuildRegionalContainerTagsInner&gt;**](BuildRegionalContainerTagsInner.md) |  |  |
|**imageSize** | **Integer** | The size (in bytes) of the Docker image built by Hathora. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of your build.  &#x60;created&#x60;: a build was created but not yet run  &#x60;running&#x60;: the build process is actively executing  &#x60;succeeded&#x60;: the game server artifact was successfully built and stored in the Hathora registries  &#x60;failed&#x60;: the build process was unsuccessful, most likely due to an error with the &#x60;Dockerfile&#x60; |  |
|**deletedAt** | **OffsetDateTime** | When the build was deleted. |  |
|**finishedAt** | **OffsetDateTime** | When [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) finished executing. |  |
|**startedAt** | **OffsetDateTime** | When [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) is called. |  |
|**createdAt** | **OffsetDateTime** | When [&#x60;CreateBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild) is called. |  |
|**createdBy** | **String** | Email address for the user that created the build. |  |
|**buildId** | **Integer** | System generated id for a build. Increments by 1. |  |
|**appId** | **String** | System generated unique identifier for an application. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| RUNNING | &quot;running&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |



