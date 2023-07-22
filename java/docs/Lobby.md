

# Lobby

A lobby object allows you to store and manage metadata for your rooms.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | **Object** | JSON blob to store metadata for a room. Must be smaller than 1MB. |  [optional] |
|**initialConfig** | **Object** | User input to initialize the game state. Object must be smaller than 64KB. |  |
|**createdAt** | **OffsetDateTime** | When the lobby was created. |  |
|**createdBy** | **String** | Email address for the user that created the lobby. |  |
|**local** | **Boolean** |  |  |
|**visibility** | **LobbyVisibility** |  |  |
|**region** | **Region** |  |  |
|**roomId** | **String** | Unique identifier to a game session or match. Use either a system generated ID or pass in your own. |  |
|**appId** | **String** | System generated unique identifier for an application. |  |



