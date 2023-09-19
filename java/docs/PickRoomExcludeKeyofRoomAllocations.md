

# PickRoomExcludeKeyofRoomAllocations

From T, pick a set of properties whose keys are in the union K

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | System generated unique identifier for an application. |  |
|**roomId** | **String** | Unique identifier to a game session or match. Use either a system generated ID or pass in your own. |  |
|**roomConfig** | **String** | Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo). |  |
|**status** | **RoomStatus** |  |  |
|**currentAllocation** | [**RoomAllocation**](RoomAllocation.md) |  |  |



