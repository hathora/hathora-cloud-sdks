

# DeploymentConfig

User specified deployment configuration for your application at runtime.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idleTimeoutEnabled** | **Boolean** | Option to shut down processes that have had no new connections or rooms for five minutes. |  [optional] |
|**env** | [**List&lt;DeploymentEnvInner&gt;**](DeploymentEnvInner.md) | The environment variable that our process will have access to at runtime. |  |
|**roomsPerProcess** | **Integer** | Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. |  |
|**planName** | **PlanName** |  |  |
|**additionalContainerPorts** | [**List&lt;ContainerPort&gt;**](ContainerPort.md) | Additional ports your server listens on. |  [optional] |
|**transportType** | **TransportType** |  |  |
|**containerPort** | **Integer** | Default port the server listens on. |  |



