

# Build

Build is a versioned artifact for a game server's container image and its data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**regionalContainerTags** | [**List&lt;BuildRegionalContainerTagsInner&gt;**](BuildRegionalContainerTagsInner.md) | An alias for the container image in our regional registries. |  |
|**imageSize** | **Double** | Image size in MB. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of creating a build.  &#x60;created&#x60;: a new &#x60;buildId&#x60; was generated  &#x60;running&#x60;: the container image is being built  &#x60;succeeded&#x60;: the container image was successfully built and stored in our registry  &#x60;failed&#x60;: there was an issue creating and storing the container image in our container registry |  |
|**deletedAt** | **OffsetDateTime** | When the container image was deleted. |  |
|**finishedAt** | **OffsetDateTime** | When the container image finished being built. |  |
|**startedAt** | **OffsetDateTime** | When the container image starts getting built. |  |
|**createdAt** | **OffsetDateTime** | When a new &#x60;buildId&#x60; is generated. |  |
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



