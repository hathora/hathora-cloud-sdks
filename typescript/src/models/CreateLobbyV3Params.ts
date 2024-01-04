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
 * 
 * @export
 * @interface CreateLobbyV3Params
 */
export interface CreateLobbyV3Params {
    /**
     * 
     * @type {LobbyVisibility}
     * @memberof CreateLobbyV3Params
     */
    visibility: LobbyVisibility;
    /**
     * Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [`GetRoomInfo()`](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
     * @type {string}
     * @memberof CreateLobbyV3Params
     */
    roomConfig?: string;
    /**
     * 
     * @type {Region}
     * @memberof CreateLobbyV3Params
     */
    region: Region;
}

/**
 * Check if a given object implements the CreateLobbyV3Params interface.
 */
export function instanceOfCreateLobbyV3Params(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "visibility" in value;
    isInstance = isInstance && "region" in value;

    return isInstance;
}

export function CreateLobbyV3ParamsFromJSON(json: any): CreateLobbyV3Params {
    return CreateLobbyV3ParamsFromJSONTyped(json, false);
}

export function CreateLobbyV3ParamsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateLobbyV3Params {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'visibility': LobbyVisibilityFromJSON(json['visibility']),
        'roomConfig': !exists(json, 'roomConfig') ? undefined : json['roomConfig'],
        'region': RegionFromJSON(json['region']),
    };
}

export function CreateLobbyV3ParamsToJSON(value?: CreateLobbyV3Params | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'visibility': LobbyVisibilityToJSON(value.visibility),
        'roomConfig': value.roomConfig,
        'region': RegionToJSON(value.region),
    };
}

