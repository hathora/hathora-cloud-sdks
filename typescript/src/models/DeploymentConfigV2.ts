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
import type { ContainerPort } from './ContainerPort';
import {
    ContainerPortFromJSON,
    ContainerPortFromJSONTyped,
    ContainerPortToJSON,
} from './ContainerPort';
import type { DeploymentV2EnvInner } from './DeploymentV2EnvInner';
import {
    DeploymentV2EnvInnerFromJSON,
    DeploymentV2EnvInnerFromJSONTyped,
    DeploymentV2EnvInnerToJSON,
} from './DeploymentV2EnvInner';
import type { TransportType } from './TransportType';
import {
    TransportTypeFromJSON,
    TransportTypeFromJSONTyped,
    TransportTypeToJSON,
} from './TransportType';

/**
 * 
 * @export
 * @interface DeploymentConfigV2
 */
export interface DeploymentConfigV2 {
    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     * @type {boolean}
     * @memberof DeploymentConfigV2
     */
    idleTimeoutEnabled: boolean;
    /**
     * The environment variable that our process will have access to at runtime.
     * @type {Array<DeploymentV2EnvInner>}
     * @memberof DeploymentConfigV2
     */
    env: Array<DeploymentV2EnvInner>;
    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     * @type {number}
     * @memberof DeploymentConfigV2
     */
    roomsPerProcess: number;
    /**
     * Additional ports your server listens on.
     * @type {Array<ContainerPort>}
     * @memberof DeploymentConfigV2
     */
    additionalContainerPorts?: Array<ContainerPort>;
    /**
     * 
     * @type {TransportType}
     * @memberof DeploymentConfigV2
     */
    transportType: TransportType;
    /**
     * Default port the server listens on.
     * @type {number}
     * @memberof DeploymentConfigV2
     */
    containerPort: number;
    /**
     * The amount of memory allocated to your process.
     * @type {number}
     * @memberof DeploymentConfigV2
     */
    requestedMemoryMB: number;
    /**
     * The number of cores allocated to your process.
     * @type {number}
     * @memberof DeploymentConfigV2
     */
    requestedCPU: number;
}

/**
 * Check if a given object implements the DeploymentConfigV2 interface.
 */
export function instanceOfDeploymentConfigV2(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "idleTimeoutEnabled" in value;
    isInstance = isInstance && "env" in value;
    isInstance = isInstance && "roomsPerProcess" in value;
    isInstance = isInstance && "transportType" in value;
    isInstance = isInstance && "containerPort" in value;
    isInstance = isInstance && "requestedMemoryMB" in value;
    isInstance = isInstance && "requestedCPU" in value;

    return isInstance;
}

export function DeploymentConfigV2FromJSON(json: any): DeploymentConfigV2 {
    return DeploymentConfigV2FromJSONTyped(json, false);
}

export function DeploymentConfigV2FromJSONTyped(json: any, ignoreDiscriminator: boolean): DeploymentConfigV2 {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'idleTimeoutEnabled': json['idleTimeoutEnabled'],
        'env': ((json['env'] as Array<any>).map(DeploymentV2EnvInnerFromJSON)),
        'roomsPerProcess': json['roomsPerProcess'],
        'additionalContainerPorts': !exists(json, 'additionalContainerPorts') ? undefined : ((json['additionalContainerPorts'] as Array<any>).map(ContainerPortFromJSON)),
        'transportType': TransportTypeFromJSON(json['transportType']),
        'containerPort': json['containerPort'],
        'requestedMemoryMB': json['requestedMemoryMB'],
        'requestedCPU': json['requestedCPU'],
    };
}

export function DeploymentConfigV2ToJSON(value?: DeploymentConfigV2 | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'idleTimeoutEnabled': value.idleTimeoutEnabled,
        'env': ((value.env as Array<any>).map(DeploymentV2EnvInnerToJSON)),
        'roomsPerProcess': value.roomsPerProcess,
        'additionalContainerPorts': value.additionalContainerPorts === undefined ? undefined : ((value.additionalContainerPorts as Array<any>).map(ContainerPortToJSON)),
        'transportType': TransportTypeToJSON(value.transportType),
        'containerPort': value.containerPort,
        'requestedMemoryMB': value.requestedMemoryMB,
        'requestedCPU': value.requestedCPU,
    };
}

