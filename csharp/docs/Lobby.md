# Hathora.Cloud.Sdk.Model.Lobby
A lobby object allows you to store and manage metadata for your rooms.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**State** | **Object** | JSON blob to store metadata for a room. Must be smaller than 1MB. | [optional] 
**InitialConfig** | **Object** | User input to initialize the game state. Object must be smaller than 64KB. | 
**CreatedAt** | **DateTime** | When the lobby was created. | 
**CreatedBy** | **string** | Email address for the user that created the lobby. | 
**Local** | **bool** |  | 
**Visibility** | **LobbyVisibility** |  | 
**Region** | **Region** |  | 
**RoomId** | **string** | Unique identifier to a game session or match. Use either a system generated ID or pass in your own. | 
**AppId** | **string** | System generated unique identifier for an application. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

