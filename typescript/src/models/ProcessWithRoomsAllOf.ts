/* tslint:disable */
/* eslint-disable */
/**
 * Hathora Cloud API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import type { PickRoomExcludeKeyofRoomAllocations } from './PickRoomExcludeKeyofRoomAllocations';
import {
    PickRoomExcludeKeyofRoomAllocationsFromJSON,
    PickRoomExcludeKeyofRoomAllocationsFromJSONTyped,
    PickRoomExcludeKeyofRoomAllocationsToJSON,
} from './PickRoomExcludeKeyofRoomAllocations';

/**
 * 
 * @export
 * @interface ProcessWithRoomsAllOf
 */
export interface ProcessWithRoomsAllOf {
    /**
     * 
     * @type {Array<PickRoomExcludeKeyofRoomAllocations>}
     * @memberof ProcessWithRoomsAllOf
     */
    rooms: Array<PickRoomExcludeKeyofRoomAllocations>;
    /**
     * 
     * @type {number}
     * @memberof ProcessWithRoomsAllOf
     */
    totalRooms: number;
}

/**
 * Check if a given object implements the ProcessWithRoomsAllOf interface.
 */
export function instanceOfProcessWithRoomsAllOf(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "rooms" in value;
    isInstance = isInstance && "totalRooms" in value;

    return isInstance;
}

export function ProcessWithRoomsAllOfFromJSON(json: any): ProcessWithRoomsAllOf {
    return ProcessWithRoomsAllOfFromJSONTyped(json, false);
}

export function ProcessWithRoomsAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): ProcessWithRoomsAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'rooms': ((json['rooms'] as Array<any>).map(PickRoomExcludeKeyofRoomAllocationsFromJSON)),
        'totalRooms': json['totalRooms'],
    };
}

export function ProcessWithRoomsAllOfToJSON(value?: ProcessWithRoomsAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'rooms': ((value.rooms as Array<any>).map(PickRoomExcludeKeyofRoomAllocationsToJSON)),
        'totalRooms': value.totalRooms,
    };
}
