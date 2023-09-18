# Hathora.Cloud.Sdk.Model.Build
A build represents a game server artifact and its associated metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BuildTag** | **string** | Tag to associate an external version with a build. It is accessible via [&#x60;GetBuildInfo()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/GetBuildInfo). | 
**RegionalContainerTags** | [**List&lt;BuildRegionalContainerTagsInner&gt;**](BuildRegionalContainerTagsInner.md) | Identifiers for the containers stored in Hathora&#39;s registries. | 
**ImageSize** | **double** | The size (in bytes) of the Docker image built by Hathora. | 
**Status** | **string** | Current status of your build.  &#x60;created&#x60;: a build was created but not yet run  &#x60;running&#x60;: the build process is actively executing  &#x60;succeeded&#x60;: the game server artifact was successfully built and stored in the Hathora registries  &#x60;failed&#x60;: the build process was unsuccessful, most likely due to an error with the &#x60;Dockerfile&#x60; | 
**DeletedAt** | **DateTime?** | When the build was deleted. | 
**FinishedAt** | **DateTime?** | When [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) finished executing. | 
**StartedAt** | **DateTime?** | When [&#x60;RunBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) is called. | 
**CreatedAt** | **DateTime** | When [&#x60;CreateBuild()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild) is called. | 
**CreatedBy** | **string** | Email address for the user that created the build. | 
**BuildId** | **int** | System generated id for a build. Increments by 1. | 
**AppId** | **string** | System generated unique identifier for an application. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

