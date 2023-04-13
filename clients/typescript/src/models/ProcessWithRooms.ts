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
import type { Region } from './Region';
import {
    RegionFromJSON,
    RegionFromJSONTyped,
    RegionToJSON,
} from './Region';

/**
 * 
 * @export
 * @interface ProcessWithRooms
 */
export interface ProcessWithRooms {
    /**
     * 
     * @type {number}
     * @memberof ProcessWithRooms
     */
    egressedBytes: number;
    /**
     * 
     * @type {Date}
     * @memberof ProcessWithRooms
     */
    idleSince: Date | null;
    /**
     * 
     * @type {number}
     * @memberof ProcessWithRooms
     */
    activeConnections: number;
    /**
     * 
     * @type {number}
     * @memberof ProcessWithRooms
     */
    roomSlotsAvailable: number;
    /**
     * 
     * @type {boolean}
     * @memberof ProcessWithRooms
     */
    draining: boolean;
    /**
     * 
     * @type {Date}
     * @memberof ProcessWithRooms
     */
    terminatedAt: Date | null;
    /**
     * 
     * @type {Date}
     * @memberof ProcessWithRooms
     */
    stoppingAt: Date | null;
    /**
     * 
     * @type {Date}
     * @memberof ProcessWithRooms
     */
    startedAt: Date | null;
    /**
     * 
     * @type {Date}
     * @memberof ProcessWithRooms
     */
    startingAt: Date;
    /**
     * 
     * @type {number}
     * @memberof ProcessWithRooms
     */
    roomsPerProcess: number;
    /**
     * 
     * @type {number}
     * @memberof ProcessWithRooms
     */
    port: number;
    /**
     * 
     * @type {string}
     * @memberof ProcessWithRooms
     */
    host: string;
    /**
     * 
     * @type {Region}
     * @memberof ProcessWithRooms
     */
    region: Region;
    /**
     * 
     * @type {string}
     * @memberof ProcessWithRooms
     */
    processId: string;
    /**
     * 
     * @type {number}
     * @memberof ProcessWithRooms
     */
    deploymentId: number;
    /**
     * 
     * @type {string}
     * @memberof ProcessWithRooms
     */
    appId: string;
    /**
     * 
     * @type {Array<PickRoomExcludeKeyofRoomAllocations>}
     * @memberof ProcessWithRooms
     */
    rooms: Array<PickRoomExcludeKeyofRoomAllocations>;
    /**
     * 
     * @type {number}
     * @memberof ProcessWithRooms
     */
    totalRooms: number;
}

/**
 * Check if a given object implements the ProcessWithRooms interface.
 */
export function instanceOfProcessWithRooms(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "egressedBytes" in value;
    isInstance = isInstance && "idleSince" in value;
    isInstance = isInstance && "activeConnections" in value;
    isInstance = isInstance && "roomSlotsAvailable" in value;
    isInstance = isInstance && "draining" in value;
    isInstance = isInstance && "terminatedAt" in value;
    isInstance = isInstance && "stoppingAt" in value;
    isInstance = isInstance && "startedAt" in value;
    isInstance = isInstance && "startingAt" in value;
    isInstance = isInstance && "roomsPerProcess" in value;
    isInstance = isInstance && "port" in value;
    isInstance = isInstance && "host" in value;
    isInstance = isInstance && "region" in value;
    isInstance = isInstance && "processId" in value;
    isInstance = isInstance && "deploymentId" in value;
    isInstance = isInstance && "appId" in value;
    isInstance = isInstance && "rooms" in value;
    isInstance = isInstance && "totalRooms" in value;

    return isInstance;
}

export function ProcessWithRoomsFromJSON(json: any): ProcessWithRooms {
    return ProcessWithRoomsFromJSONTyped(json, false);
}

export function ProcessWithRoomsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ProcessWithRooms {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'egressedBytes': json['egressedBytes'],
        'idleSince': (json['idleSince'] === null ? null : new Date(json['idleSince'])),
        'activeConnections': json['activeConnections'],
        'roomSlotsAvailable': json['roomSlotsAvailable'],
        'draining': json['draining'],
        'terminatedAt': (json['terminatedAt'] === null ? null : new Date(json['terminatedAt'])),
        'stoppingAt': (json['stoppingAt'] === null ? null : new Date(json['stoppingAt'])),
        'startedAt': (json['startedAt'] === null ? null : new Date(json['startedAt'])),
        'startingAt': (new Date(json['startingAt'])),
        'roomsPerProcess': json['roomsPerProcess'],
        'port': json['port'],
        'host': json['host'],
        'region': RegionFromJSON(json['region']),
        'processId': json['processId'],
        'deploymentId': json['deploymentId'],
        'appId': json['appId'],
        'rooms': ((json['rooms'] as Array<any>).map(PickRoomExcludeKeyofRoomAllocationsFromJSON)),
        'totalRooms': json['totalRooms'],
    };
}

export function ProcessWithRoomsToJSON(value?: ProcessWithRooms | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'egressedBytes': value.egressedBytes,
        'idleSince': (value.idleSince === null ? null : value.idleSince.toISOString()),
        'activeConnections': value.activeConnections,
        'roomSlotsAvailable': value.roomSlotsAvailable,
        'draining': value.draining,
        'terminatedAt': (value.terminatedAt === null ? null : value.terminatedAt.toISOString()),
        'stoppingAt': (value.stoppingAt === null ? null : value.stoppingAt.toISOString()),
        'startedAt': (value.startedAt === null ? null : value.startedAt.toISOString()),
        'startingAt': (value.startingAt.toISOString()),
        'roomsPerProcess': value.roomsPerProcess,
        'port': value.port,
        'host': value.host,
        'region': RegionToJSON(value.region),
        'processId': value.processId,
        'deploymentId': value.deploymentId,
        'appId': value.appId,
        'rooms': ((value.rooms as Array<any>).map(PickRoomExcludeKeyofRoomAllocationsToJSON)),
        'totalRooms': value.totalRooms,
    };
}

