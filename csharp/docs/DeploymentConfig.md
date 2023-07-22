# Hathora.Cloud.Sdk.Model.DeploymentConfig
User specified deployment configuration for your application at runtime.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Env** | [**List&lt;DeploymentEnvInner&gt;**](DeploymentEnvInner.md) | The environment variable that our process will have access to at runtime. | 
**RoomsPerProcess** | **int** | Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. | 
**PlanName** | **PlanName** |  | 
**AdditionalContainerPorts** | [**List&lt;ContainerPort&gt;**](ContainerPort.md) | Additional ports your server listens on. | [optional] 
**TransportType** | **TransportType** |  | 
**ContainerPort** | **int** | Default port the server listens on. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

