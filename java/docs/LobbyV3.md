

# LobbyV3

A lobby object allows you to store and manage metadata for your rooms.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shortCode** | **String** | User-defined identifier for a lobby. |  |
|**createdAt** | **OffsetDateTime** | When the lobby was created. |  |
|**createdBy** | **String** | Email address for the user that created the lobby. |  |
|**roomConfig** | **String** | Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo). |  |
|**visibility** | **LobbyVisibility** |  |  |
|**region** | **Region** |  |  |
|**roomId** | **String** | Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique. |  |
|**appId** | **String** | System generated unique identifier for an application. |  |



