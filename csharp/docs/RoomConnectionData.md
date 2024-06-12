# Hathora.Cloud.Sdk.Model.RoomConnectionData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdditionalExposedPorts** | [**List&lt;ExposedPort&gt;**](ExposedPort.md) |  | 
**ExposedPort** | [**ExposedPort**](ExposedPort.md) |  | [optional] 
**Status** | **RoomReadyStatus** |  | 
**RoomId** | **string** | Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique. | 
**ProcessId** | **string** | System generated unique identifier to a runtime instance of your game server. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

