

# ConnectionInfoV2

Connection information for the default and additional ports.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalExposedPorts** | [**List&lt;ExposedPort&gt;**](ExposedPort.md) |  |  |
|**exposedPort** | [**ExposedPort**](ExposedPort.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**roomId** | **String** | Unique identifier to a game session or match. Use either a system generated ID or pass in your own. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| STARTING | &quot;starting&quot; |
| ACTIVE | &quot;active&quot; |



