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
 * @interface RoomConnectionDataAllOf
 */
export interface RoomConnectionDataAllOf {
    /**
     * System generated unique identifier to a runtime instance of your game server.
     * @type {string}
     * @memberof RoomConnectionDataAllOf
     */
    processId: string;
}

/**
 * Check if a given object implements the RoomConnectionDataAllOf interface.
 */
export function instanceOfRoomConnectionDataAllOf(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "processId" in value;

    return isInstance;
}

export function RoomConnectionDataAllOfFromJSON(json: any): RoomConnectionDataAllOf {
    return RoomConnectionDataAllOfFromJSONTyped(json, false);
}

export function RoomConnectionDataAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): RoomConnectionDataAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'processId': json['processId'],
    };
}

export function RoomConnectionDataAllOfToJSON(value?: RoomConnectionDataAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'processId': value.processId,
    };
}
