# Hathora.Cloud.Sdk.Model.Build
A build represents a game server artifact and its associated metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BuildTag** | **string** | Tag to associate an external version with a build. It is accessible via [&#x60;GetBuildInfo()&#x60;](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo). | [optional] 
**RegionalContainerTags** | [**List&lt;BuildRegionalContainerTagsInner&gt;**](BuildRegionalContainerTagsInner.md) |  | 
**ImageSize** | **long** | The size (in bytes) of the Docker image built by Hathora. | 
**Status** | **BuildStatus** |  | 
**DeletedAt** | **DateTime?** | When the build was deleted. | 
**FinishedAt** | **DateTime?** | When [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing. | 
**StartedAt** | **DateTime?** | When [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called. | 
**CreatedAt** | **DateTime** | When [&#x60;CreateBuild()&#x60;](https://hathora.dev/api#tag/BuildV2/operation/CreateBuild) is called. | 
**CreatedBy** | **string** | UserId or email address for the user that created the build. | 
**BuildId** | **int** | System generated id for a build. Increments by 1. | 
**AppId** | **string** | System generated unique identifier for an application. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

