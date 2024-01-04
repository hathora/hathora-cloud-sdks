# Hathora.Cloud.Sdk.Model.PickRoomExcludeKeyofRoomAllocations
From T, pick a set of properties whose keys are in the union K

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | **string** | System generated unique identifier for an application. | 
**RoomId** | **string** | Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique. | 
**RoomConfig** | **string** | Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo). | 
**Status** | **RoomStatus** |  | 
**CurrentAllocation** | [**RoomAllocation**](RoomAllocation.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

