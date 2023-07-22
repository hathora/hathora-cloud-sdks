# Hathora.Cloud.Sdk.Model.ProcessWithRooms

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EgressedBytes** | **double** | Measures network traffic leaving the process in bytes. | 
**IdleSince** | **DateTime?** |  | 
**ActiveConnectionsUpdatedAt** | **DateTime** |  | 
**ActiveConnections** | **double** | Tracks the number of active connections to a process. | 
**RoomSlotsAvailableUpdatedAt** | **DateTime** |  | 
**RoomSlotsAvailable** | **double** | Tracks the number of room slots available on the process. | 
**Draining** | **bool** | Process in drain will not accept any new rooms. | 
**TerminatedAt** | **DateTime?** | When the process has been terminated. | 
**StoppingAt** | **DateTime?** | When the process is issued to stop. We use this to determine when we should stop billing. | 
**StartedAt** | **DateTime?** | When the process bound to the specified port. We use this to determine when we should start billing. | 
**StartingAt** | **DateTime** | When the process started being provisioned. | 
**RoomsPerProcess** | **int** | Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. | 
**AdditionalExposedPorts** | [**List&lt;ExposedPort&gt;**](ExposedPort.md) |  | 
**ExposedPort** | [**ExposedPort**](ExposedPort.md) |  | [optional] 
**Port** | **double** |  | 
**Host** | **string** |  | 
**Region** | **Region** |  | 
**ProcessId** | **string** | System generated unique identifier to a runtime instance of your game server. | 
**DeploymentId** | **int** | System generated id for a deployment. Increments by 1. | 
**AppId** | **string** | System generated unique identifier for an application. | 
**Rooms** | [**List&lt;PickRoomExcludeKeyofRoomAllocations&gt;**](PickRoomExcludeKeyofRoomAllocations.md) |  | 
**TotalRooms** | **double** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

