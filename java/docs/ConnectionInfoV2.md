

# ConnectionInfoV2

Connection information for the default and additional ports.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalExposedPorts** | [**List&lt;ExposedPort&gt;**](ExposedPort.md) |  |  |
|**exposedPort** | [**ExposedPort**](ExposedPort.md) |  |  [optional] |
|**status** | **RoomReadyStatus** |  |  |
|**roomId** | **String** | Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique. |  |



