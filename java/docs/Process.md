

# Process

A process object represents a runtime instance of your game server and its metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**egressedBytes** | **Double** | Measures network traffic leaving the process in bytes. |  |
|**idleSince** | **OffsetDateTime** |  |  |
|**activeConnectionsUpdatedAt** | **OffsetDateTime** |  |  |
|**activeConnections** | **Double** | Tracks the number of active connections to a process. |  |
|**roomsAllocatedUpdatedAt** | **OffsetDateTime** |  |  |
|**roomsAllocated** | **Double** | Tracks the number of rooms that have been allocated to the process. |  |
|**roomSlotsAvailableUpdatedAt** | **OffsetDateTime** |  |  |
|**roomSlotsAvailable** | **Double** |  |  |
|**draining** | **Boolean** | Process in drain will not accept any new rooms. |  |
|**terminatedAt** | **OffsetDateTime** | When the process has been terminated. |  |
|**stoppingAt** | **OffsetDateTime** | When the process is issued to stop. We use this to determine when we should stop billing. |  |
|**startedAt** | **OffsetDateTime** | When the process bound to the specified port. We use this to determine when we should start billing. |  |
|**startingAt** | **OffsetDateTime** | When the process started being provisioned. |  |
|**roomsPerProcess** | **Integer** | Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. |  |
|**additionalExposedPorts** | [**List&lt;ExposedPort&gt;**](ExposedPort.md) |  |  |
|**exposedPort** | [**ExposedPort**](ExposedPort.md) |  |  [optional] |
|**port** | **Double** |  |  |
|**host** | **String** |  |  |
|**region** | **Region** |  |  |
|**processId** | **String** | System generated unique identifier to a runtime instance of your game server. |  |
|**deploymentId** | **Integer** | System generated id for a deployment. Increments by 1. |  |
|**appId** | **String** | System generated unique identifier for an application. |  |



