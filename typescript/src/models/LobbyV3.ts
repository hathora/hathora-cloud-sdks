/* tslint:disable */
/* eslint-disable */
/**
 * Hathora Cloud API
 * Welcome to the Hathora Cloud API documentation! Learn how to use the Hathora Cloud APIs to build and scale your game servers globally.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import type { LobbyVisibility } from './LobbyVisibility';
import {
    LobbyVisibilityFromJSON,
    LobbyVisibilityFromJSONTyped,
    LobbyVisibilityToJSON,
} from './LobbyVisibility';
import type { Region } from './Region';
import {
    RegionFromJSON,
    RegionFromJSONTyped,
    RegionToJSON,
} from './Region';

/**
 * A lobby object allows you to store and manage metadata for your rooms.
 * @export
 * @interface LobbyV3
 */
export interface LobbyV3 {
    /**
     * User-defined identifier for a lobby.
     * @type {string}
     * @memberof LobbyV3
     */
    shortCode: string;
    /**
     * When the lobby was created.
     * @type {Date}
     * @memberof LobbyV3
     */
    createdAt: Date;
    /**
     * UserId or email address for the user that created the lobby.
     * @type {string}
     * @memberof LobbyV3
     */
    createdBy: string;
    /**
     * Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [`GetRoomInfo()`](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
     * @type {string}
     * @memberof LobbyV3
     */
    roomConfig: string | null;
    /**
     * 
     * @type {LobbyVisibility}
     * @memberof LobbyV3
     */
    visibility: LobbyVisibility;
    /**
     * 
     * @type {Region}
     * @memberof LobbyV3
     */
    region: Region;
    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     * @type {string}
     * @memberof LobbyV3
     */
    roomId: string;
    /**
     * System generated unique identifier for an application.
     * @type {string}
     * @memberof LobbyV3
     */
    appId: string;
}

/**
 * Check if a given object implements the LobbyV3 interface.
 */
export function instanceOfLobbyV3(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "shortCode" in value;
    isInstance = isInstance && "createdAt" in value;
    isInstance = isInstance && "createdBy" in value;
    isInstance = isInstance && "roomConfig" in value;
    isInstance = isInstance && "visibility" in value;
    isInstance = isInstance && "region" in value;
    isInstance = isInstance && "roomId" in value;
    isInstance = isInstance && "appId" in value;

    return isInstance;
}

export function LobbyV3FromJSON(json: any): LobbyV3 {
    return LobbyV3FromJSONTyped(json, false);
}

export function LobbyV3FromJSONTyped(json: any, ignoreDiscriminator: boolean): LobbyV3 {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'shortCode': json['shortCode'],
        'createdAt': (new Date(json['createdAt'])),
        'createdBy': json['createdBy'],
        'roomConfig': json['roomConfig'],
        'visibility': LobbyVisibilityFromJSON(json['visibility']),
        'region': RegionFromJSON(json['region']),
        'roomId': json['roomId'],
        'appId': json['appId'],
    };
}

export function LobbyV3ToJSON(value?: LobbyV3 | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'shortCode': value.shortCode,
        'createdAt': (value.createdAt.toISOString()),
        'createdBy': value.createdBy,
        'roomConfig': value.roomConfig,
        'visibility': LobbyVisibilityToJSON(value.visibility),
        'region': RegionToJSON(value.region),
        'roomId': value.roomId,
        'appId': value.appId,
    };
}

