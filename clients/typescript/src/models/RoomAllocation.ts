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
/**
 * 
 * @export
 * @interface RoomAllocation
 */
export interface RoomAllocation {
    /**
     * 
     * @type {Date}
     * @memberof RoomAllocation
     */
    unscheduledAt: Date | null;
    /**
     * 
     * @type {Date}
     * @memberof RoomAllocation
     */
    scheduledAt: Date;
    /**
     * 
     * @type {string}
     * @memberof RoomAllocation
     */
    processId: string;
    /**
     * 
     * @type {string}
     * @memberof RoomAllocation
     */
    roomAllocationId: string;
}

/**
 * Check if a given object implements the RoomAllocation interface.
 */
export function instanceOfRoomAllocation(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "unscheduledAt" in value;
    isInstance = isInstance && "scheduledAt" in value;
    isInstance = isInstance && "processId" in value;
    isInstance = isInstance && "roomAllocationId" in value;

    return isInstance;
}

export function RoomAllocationFromJSON(json: any): RoomAllocation {
    return RoomAllocationFromJSONTyped(json, false);
}

export function RoomAllocationFromJSONTyped(json: any, ignoreDiscriminator: boolean): RoomAllocation {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'unscheduledAt': (json['unscheduledAt'] === null ? null : new Date(json['unscheduledAt'])),
        'scheduledAt': (new Date(json['scheduledAt'])),
        'processId': json['processId'],
        'roomAllocationId': json['roomAllocationId'],
    };
}

export function RoomAllocationToJSON(value?: RoomAllocation | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'unscheduledAt': (value.unscheduledAt === null ? null : value.unscheduledAt.toISOString()),
        'scheduledAt': (value.scheduledAt.toISOString()),
        'processId': value.processId,
        'roomAllocationId': value.roomAllocationId,
    };
}

