

# DeploymentConfigV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idleTimeoutEnabled** | **Boolean** | Option to shut down processes that have had no new connections or rooms for five minutes. |  |
|**env** | [**List&lt;DeploymentV2EnvInner&gt;**](DeploymentV2EnvInner.md) | The environment variable that our process will have access to at runtime. |  |
|**roomsPerProcess** | **Integer** | Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. |  |
|**additionalContainerPorts** | [**List&lt;ContainerPort&gt;**](ContainerPort.md) | Additional ports your server listens on. |  [optional] |
|**transportType** | **TransportType** |  |  |
|**containerPort** | **Integer** | Default port the server listens on. |  |
|**requestedMemoryMB** | **Double** | The amount of memory allocated to your process. |  |
|**requestedCPU** | **Double** | The number of cores allocated to your process. |  |



