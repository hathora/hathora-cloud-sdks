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
import type { ProcessStatus } from './ProcessStatus';
import {
    ProcessStatusFromJSON,
    ProcessStatusFromJSONTyped,
    ProcessStatusToJSON,
} from './ProcessStatus';
import type { Region } from './Region';
import {
    RegionFromJSON,
    RegionFromJSONTyped,
    RegionToJSON,
} from './Region';

/**
 * 
 * @export
 * @interface ProcessV2
 */
export interface ProcessV2 {
    /**
     * 
     * @type {ProcessStatus}
     * @memberof ProcessV2
     */
    status: ProcessStatus;
    /**
     * Tracks the number of rooms that have been allocated to the process.
     * @type {number}
     * @memberof ProcessV2
     */
    roomsAllocated: number;
    /**
     * When the process has been terminated.
     * @type {Date}
     * @memberof ProcessV2
     */
    terminatedAt: Date | null;
    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     * @type {Date}
     * @memberof ProcessV2
     */
    stoppingAt: Date | null;
    /**
     * When the process bound to the specified port. We use this to determine when we should start billing.
     * @type {Date}
     * @memberof ProcessV2
     */
    startedAt: Date | null;
    /**
     * When the process started being provisioned.
     * @type {Date}
     * @memberof ProcessV2
     */
    createdAt: Date;
    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     * @type {number}
     * @memberof ProcessV2
     */
    roomsPerProcess: number;
    /**
     * 
     * @type {Array<ExposedPort>}
     * @memberof ProcessV2
     */
    additionalExposedPorts: Array<ExposedPort>;
    /**
     * 
     * @type {ExposedPort}
     * @memberof ProcessV2
     */
    exposedPort: ExposedPort | null;
    /**
     * 
     * @type {Region}
     * @memberof ProcessV2
     */
    region: Region;
    /**
     * System generated unique identifier to a runtime instance of your game server.
     * @type {string}
     * @memberof ProcessV2
     */
    processId: string;
    /**
     * System generated id for a deployment. Increments by 1.
     * @type {number}
     * @memberof ProcessV2
     */
    deploymentId: number;
    /**
     * System generated unique identifier for an application.
     * @type {string}
     * @memberof ProcessV2
     */
    appId: string;
}

/**
 * Check if a given object implements the ProcessV2 interface.
 */
export function instanceOfProcessV2(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "status" in value;
    isInstance = isInstance && "roomsAllocated" in value;
    isInstance = isInstance && "terminatedAt" in value;
    isInstance = isInstance && "stoppingAt" in value;
    isInstance = isInstance && "startedAt" in value;
    isInstance = isInstance && "createdAt" in value;
    isInstance = isInstance && "roomsPerProcess" in value;
    isInstance = isInstance && "additionalExposedPorts" in value;
    isInstance = isInstance && "exposedPort" in value;
    isInstance = isInstance && "region" in value;
    isInstance = isInstance && "processId" in value;
    isInstance = isInstance && "deploymentId" in value;
    isInstance = isInstance && "appId" in value;

    return isInstance;
}

export function ProcessV2FromJSON(json: any): ProcessV2 {
    return ProcessV2FromJSONTyped(json, false);
}

export function ProcessV2FromJSONTyped(json: any, ignoreDiscriminator: boolean): ProcessV2 {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'status': ProcessStatusFromJSON(json['status']),
        'roomsAllocated': json['roomsAllocated'],
        'terminatedAt': (json['terminatedAt'] === null ? null : new Date(json['terminatedAt'])),
        'stoppingAt': (json['stoppingAt'] === null ? null : new Date(json['stoppingAt'])),
        'startedAt': (json['startedAt'] === null ? null : new Date(json['startedAt'])),
        'createdAt': (new Date(json['createdAt'])),
        'roomsPerProcess': json['roomsPerProcess'],
        'additionalExposedPorts': ((json['additionalExposedPorts'] as Array<any>).map(ExposedPortFromJSON)),
        'exposedPort': ExposedPortFromJSON(json['exposedPort']),
        'region': RegionFromJSON(json['region']),
        'processId': json['processId'],
        'deploymentId': json['deploymentId'],
        'appId': json['appId'],
    };
}

export function ProcessV2ToJSON(value?: ProcessV2 | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'status': ProcessStatusToJSON(value.status),
        'roomsAllocated': value.roomsAllocated,
        'terminatedAt': (value.terminatedAt === null ? null : value.terminatedAt.toISOString()),
        'stoppingAt': (value.stoppingAt === null ? null : value.stoppingAt.toISOString()),
        'startedAt': (value.startedAt === null ? null : value.startedAt.toISOString()),
        'createdAt': (value.createdAt.toISOString()),
        'roomsPerProcess': value.roomsPerProcess,
        'additionalExposedPorts': ((value.additionalExposedPorts as Array<any>).map(ExposedPortToJSON)),
        'exposedPort': ExposedPortToJSON(value.exposedPort),
        'region': RegionToJSON(value.region),
        'processId': value.processId,
        'deploymentId': value.deploymentId,
        'appId': value.appId,
    };
}
