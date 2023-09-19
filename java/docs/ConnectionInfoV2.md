

# ConnectionInfoV2

Connection information for the default and additional ports.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalExposedPorts** | [**List&lt;ExposedPort&gt;**](ExposedPort.md) |  |  |
|**exposedPort** | [**ExposedPort**](ExposedPort.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | &#x60;exposedPort&#x60; will only be available when the &#x60;status&#x60; of a room is \&quot;active\&quot;. |  |
|**roomId** | **String** | Unique identifier to a game session or match. Use either a system generated ID or pass in your own. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| STARTING | &quot;starting&quot; |
| ACTIVE | &quot;active&quot; |



