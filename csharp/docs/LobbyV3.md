# Hathora.Cloud.Sdk.Model.LobbyV3
A lobby object allows you to store and manage metadata for your rooms.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShortCode** | **string** | User-defined identifier for a lobby. | 
**CreatedAt** | **DateTime** | When the lobby was created. | 
**CreatedBy** | **string** | Email address for the user that created the lobby. | 
**RoomConfig** | **string** | Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo). | 
**Visibility** | **LobbyVisibility** |  | 
**Region** | **Region** |  | 
**RoomId** | **string** | Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique. | 
**AppId** | **string** | System generated unique identifier for an application. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

