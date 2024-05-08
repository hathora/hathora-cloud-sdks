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
import type { ExposedPort } from './ExposedPort';
import {
    ExposedPortFromJSON,
    ExposedPortFromJSONTyped,
    ExposedPortToJSON,
} from './ExposedPort';
import type { RoomReadyStatus } from './RoomReadyStatus';
import {
    RoomReadyStatusFromJSON,
    RoomReadyStatusFromJSONTyped,
    RoomReadyStatusToJSON,
} from './RoomReadyStatus';

/**
 * Connection information for the default and additional ports.
 * @export
 * @interface ConnectionInfoV2
 */
export interface ConnectionInfoV2 {
    /**
     * 
     * @type {Array<ExposedPort>}
     * @memberof ConnectionInfoV2
     */
    additionalExposedPorts: Array<ExposedPort>;
    /**
     * 
     * @type {ExposedPort}
     * @memberof ConnectionInfoV2
     */
    exposedPort?: ExposedPort;
    /**
     * 
     * @type {RoomReadyStatus}
     * @memberof ConnectionInfoV2
     */
    status: RoomReadyStatus;
    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     * @type {string}
     * @memberof ConnectionInfoV2
     */
    roomId: string;
}

/**
 * Check if a given object implements the ConnectionInfoV2 interface.
 */
export function instanceOfConnectionInfoV2(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "additionalExposedPorts" in value;
    isInstance = isInstance && "status" in value;
    isInstance = isInstance && "roomId" in value;

    return isInstance;
}

export function ConnectionInfoV2FromJSON(json: any): ConnectionInfoV2 {
    return ConnectionInfoV2FromJSONTyped(json, false);
}

export function ConnectionInfoV2FromJSONTyped(json: any, ignoreDiscriminator: boolean): ConnectionInfoV2 {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'additionalExposedPorts': ((json['additionalExposedPorts'] as Array<any>).map(ExposedPortFromJSON)),
        'exposedPort': !exists(json, 'exposedPort') ? undefined : ExposedPortFromJSON(json['exposedPort']),
        'status': RoomReadyStatusFromJSON(json['status']),
        'roomId': json['roomId'],
    };
}

export function ConnectionInfoV2ToJSON(value?: ConnectionInfoV2 | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'additionalExposedPorts': ((value.additionalExposedPorts as Array<any>).map(ExposedPortToJSON)),
        'exposedPort': ExposedPortToJSON(value.exposedPort),
        'status': RoomReadyStatusToJSON(value.status),
        'roomId': value.roomId,
    };
}

