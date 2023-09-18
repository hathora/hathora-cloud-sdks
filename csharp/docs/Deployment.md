# Hathora.Cloud.Sdk.Model.Deployment
Deployment is a versioned configuration for a build that describes runtime behavior.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Env** | [**List&lt;DeploymentEnvInner&gt;**](DeploymentEnvInner.md) | The environment variable that our process will have access to at runtime. | 
**RoomsPerProcess** | **int** | Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. | 
**PlanName** | **PlanName** |  | 
**AdditionalContainerPorts** | [**List&lt;ContainerPort&gt;**](ContainerPort.md) | Additional ports your server listens on. | 
**DefaultContainerPort** | [**ContainerPort**](ContainerPort.md) |  | 
**TransportType** | **string** |  | 
**ContainerPort** | **double** |  | 
**CreatedAt** | **DateTime** | When the deployment was created. | 
**CreatedBy** | **string** | Email address for the user that created the deployment. | 
**RequestedMemoryMB** | **double** | The amount of memory allocated to your process. | 
**RequestedCPU** | **double** | The number of cores allocated to your process. | 
**DeploymentId** | **int** | System generated id for a deployment. Increments by 1. | 
**BuildId** | **int** | System generated id for a build. Increments by 1. | 
**AppId** | **string** | System generated unique identifier for an application. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

