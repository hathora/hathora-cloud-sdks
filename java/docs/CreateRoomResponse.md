

# CreateRoomResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalExposedPorts** | [**List&lt;ExposedPort&gt;**](ExposedPort.md) |  |  |
|**exposedPort** | [**ExposedPort**](ExposedPort.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | &#x60;exposedPort&#x60; will only be available when the &#x60;status&#x60; of a room is \&quot;active\&quot;. |  |
|**roomId** | **String** | Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique. |  |
|**processId** | **String** | System generated unique identifier to a runtime instance of your game server. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| STARTING | &quot;starting&quot; |
| ACTIVE | &quot;active&quot; |



