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
/**
 * 
 * @export
 * @interface UpdateRoomConfigParams
 */
export interface UpdateRoomConfigParams {
    /**
     * Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [`GetRoomInfo()`](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
     * @type {string}
     * @memberof UpdateRoomConfigParams
     */
    roomConfig: string;
}

/**
 * Check if a given object implements the UpdateRoomConfigParams interface.
 */
export function instanceOfUpdateRoomConfigParams(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "roomConfig" in value;

    return isInstance;
}

export function UpdateRoomConfigParamsFromJSON(json: any): UpdateRoomConfigParams {
    return UpdateRoomConfigParamsFromJSONTyped(json, false);
}

export function UpdateRoomConfigParamsFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateRoomConfigParams {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'roomConfig': json['roomConfig'],
    };
}

export function UpdateRoomConfigParamsToJSON(value?: UpdateRoomConfigParams | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'roomConfig': value.roomConfig,
    };
}

