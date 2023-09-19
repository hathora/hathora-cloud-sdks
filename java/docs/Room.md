

# Room

A room object represents a game session or match.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentAllocation** | [**RoomAllocation**](RoomAllocation.md) |  |  |
|**status** | **RoomStatus** |  |  |
|**allocations** | [**List&lt;RoomAllocation&gt;**](RoomAllocation.md) |  |  |
|**roomConfig** | **String** | Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo). |  |
|**roomId** | **String** | Unique identifier to a game session or match. Use either a system generated ID or pass in your own. |  |
|**appId** | **String** | System generated unique identifier for an application. |  |



