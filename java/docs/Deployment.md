

# Deployment

Deployment is a versioned configuration for a build that describes runtime behavior.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**env** | [**List&lt;DeploymentEnvInner&gt;**](DeploymentEnvInner.md) | The environment variable that our process will have access to at runtime. |  |
|**roomsPerProcess** | **Integer** | Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. |  |
|**planName** | **PlanName** |  |  |
|**additionalContainerPorts** | [**List&lt;ContainerPort&gt;**](ContainerPort.md) | Additional ports your server listens on. |  |
|**defaultContainerPort** | [**ContainerPort**](ContainerPort.md) |  |  |
|**transportType** | [**TransportTypeEnum**](#TransportTypeEnum) |  |  |
|**containerPort** | **Double** |  |  |
|**createdAt** | **OffsetDateTime** | When the deployment was created. |  |
|**createdBy** | **String** | Email address for the user that created the deployment. |  |
|**requestedMemoryMB** | **Integer** | The amount of memory allocated to your process. |  |
|**requestedCPU** | **Double** | The number of cores allocated to your process. |  |
|**deploymentId** | **Integer** | System generated id for a deployment. Increments by 1. |  |
|**buildId** | **Integer** | System generated id for a build. Increments by 1. |  |
|**appId** | **String** | System generated unique identifier for an application. |  |



## Enum: TransportTypeEnum

| Name | Value |
|---- | -----|
| TCP | &quot;tcp&quot; |
| UDP | &quot;udp&quot; |
| TLS | &quot;tls&quot; |



