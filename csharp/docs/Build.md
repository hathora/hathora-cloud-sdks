# Hathora.Cloud.Sdk.Model.Build
Build is a versioned artifact for a game server's container image and its data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RegionalContainerTags** | [**List&lt;BuildRegionalContainerTagsInner&gt;**](BuildRegionalContainerTagsInner.md) | An alias for the container image in our regional registries. | 
**ImageSize** | **double** | Image size in MB. | 
**Status** | **string** | Status of creating a build.  &#x60;created&#x60;: a new &#x60;buildId&#x60; was generated  &#x60;running&#x60;: the container image is being built  &#x60;succeeded&#x60;: the container image was successfully built and stored in our registry  &#x60;failed&#x60;: there was an issue creating and storing the container image in our container registry | 
**DeletedAt** | **DateTime?** | When the container image was deleted. | 
**FinishedAt** | **DateTime?** | When the container image finished being built. | 
**StartedAt** | **DateTime?** | When the container image starts getting built. | 
**CreatedAt** | **DateTime** | When a new &#x60;buildId&#x60; is generated. | 
**CreatedBy** | **string** | Email address for the user that created the build. | 
**BuildId** | **int** | System generated id for a build. Increments by 1. | 
**AppId** | **string** | System generated unique identifier for an application. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

