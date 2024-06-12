# Hathora.Cloud.Sdk.Model.ProcessV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **ProcessStatus** |  | 
**RoomsAllocated** | **int** | Tracks the number of rooms that have been allocated to the process. | 
**TerminatedAt** | **DateTime?** | When the process has been terminated. | 
**StoppingAt** | **DateTime?** | When the process is issued to stop. We use this to determine when we should stop billing. | 
**StartedAt** | **DateTime?** | When the process bound to the specified port. We use this to determine when we should start billing. | 
**CreatedAt** | **DateTime** | When the process started being provisioned. | 
**RoomsPerProcess** | **int** | Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. | 
**AdditionalExposedPorts** | [**List&lt;ExposedPort&gt;**](ExposedPort.md) |  | 
**ExposedPort** | [**ExposedPort**](ExposedPort.md) |  | 
**Region** | **Region** |  | 
**ProcessId** | **string** | System generated unique identifier to a runtime instance of your game server. | 
**DeploymentId** | **int** | System generated id for a deployment. Increments by 1. | 
**AppId** | **string** | System generated unique identifier for an application. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

