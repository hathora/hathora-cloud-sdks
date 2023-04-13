

# Build


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**regionalContainerTags** | [**List&lt;BuildRegionalContainerTagsInner&gt;**](BuildRegionalContainerTagsInner.md) |  |  |
|**imageSize** | **Double** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**deletedAt** | **OffsetDateTime** |  |  |
|**finishedAt** | **OffsetDateTime** |  |  |
|**startedAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**createdBy** | **String** |  |  |
|**buildId** | **Double** |  |  |
|**appId** | **String** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| RUNNING | &quot;running&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |



