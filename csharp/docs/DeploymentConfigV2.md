# Hathora.Cloud.Sdk.Model.DeploymentConfigV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdleTimeoutEnabled** | **bool** | Option to shut down processes that have had no new connections or rooms for five minutes. | 
**Env** | [**List&lt;DeploymentV2EnvInner&gt;**](DeploymentV2EnvInner.md) | The environment variable that our process will have access to at runtime. | 
**RoomsPerProcess** | **int** | Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. | 
**AdditionalContainerPorts** | [**List&lt;ContainerPort&gt;**](ContainerPort.md) | Additional ports your server listens on. | [optional] 
**TransportType** | **TransportType** |  | 
**ContainerPort** | **int** | Default port the server listens on. | 
**RequestedMemoryMB** | **double** | The amount of memory allocated to your process. | 
**RequestedCPU** | **double** | The number of cores allocated to your process. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

