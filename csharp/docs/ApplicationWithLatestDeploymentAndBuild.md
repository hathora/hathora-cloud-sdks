# Hathora.Cloud.Sdk.Model.ApplicationWithLatestDeploymentAndBuild

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletedBy** | **string** | UserId or email address for the user that deleted the application. | 
**DeletedAt** | **DateTime?** | When the application was deleted. | 
**CreatedAt** | **DateTime** | When the application was created. | 
**CreatedBy** | **string** | UserId or email address for the user that created the application. | 
**OrgId** | **string** | System generated unique identifier for an organization. Not guaranteed to have a specific format. | 
**AuthConfiguration** | [**AuthConfiguration**](AuthConfiguration.md) |  | 
**AppSecret** | **string** | Secret that is used for identity and access management. | 
**AppId** | **string** | System generated unique identifier for an application. | 
**AppName** | **string** | Readable name for an application. Must be unique within an organization. | 
**Deployment** | [**ApplicationWithLatestDeploymentAndBuildAllOfDeployment**](ApplicationWithLatestDeploymentAndBuildAllOfDeployment.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

