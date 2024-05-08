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

/**
 * 
 * @export
 * @interface DeploymentV2
 */
export interface DeploymentV2 {
    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     * @type {boolean}
     * @memberof DeploymentV2
     */
    idleTimeoutEnabled: boolean;
    /**
     * The environment variable that our process will have access to at runtime.
     * @type {Array<DeploymentV2EnvInner>}
     * @memberof DeploymentV2
     */
    env: Array<DeploymentV2EnvInner>;
    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     * @type {number}
     * @memberof DeploymentV2
     */
    roomsPerProcess: number;
    /**
     * Additional ports your server listens on.
     * @type {Array<ContainerPort>}
     * @memberof DeploymentV2
     */
    additionalContainerPorts: Array<ContainerPort>;
    /**
     * 
     * @type {ContainerPort}
     * @memberof DeploymentV2
     */
    defaultContainerPort: ContainerPort;
    /**
     * When the deployment was created.
     * @type {Date}
     * @memberof DeploymentV2
     */
    createdAt: Date;
    /**
     * UserId or email address for the user that created the deployment.
     * @type {string}
     * @memberof DeploymentV2
     */
    createdBy: string;
    /**
     * The amount of memory allocated to your process.
     * @type {number}
     * @memberof DeploymentV2
     */
    requestedMemoryMB: number;
    /**
     * The number of cores allocated to your process.
     * @type {number}
     * @memberof DeploymentV2
     */
    requestedCPU: number;
    /**
     * System generated id for a deployment. Increments by 1.
     * @type {number}
     * @memberof DeploymentV2
     */
    deploymentId: number;
    /**
     * System generated id for a build. Increments by 1.
     * @type {number}
     * @memberof DeploymentV2
     */
    buildId: number;
    /**
     * System generated unique identifier for an application.
     * @type {string}
     * @memberof DeploymentV2
     */
    appId: string;
}

/**
 * Check if a given object implements the DeploymentV2 interface.
 */
export function instanceOfDeploymentV2(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "idleTimeoutEnabled" in value;
    isInstance = isInstance && "env" in value;
    isInstance = isInstance && "roomsPerProcess" in value;
    isInstance = isInstance && "additionalContainerPorts" in value;
    isInstance = isInstance && "defaultContainerPort" in value;
    isInstance = isInstance && "createdAt" in value;
    isInstance = isInstance && "createdBy" in value;
    isInstance = isInstance && "requestedMemoryMB" in value;
    isInstance = isInstance && "requestedCPU" in value;
    isInstance = isInstance && "deploymentId" in value;
    isInstance = isInstance && "buildId" in value;
    isInstance = isInstance && "appId" in value;

    return isInstance;
}

export function DeploymentV2FromJSON(json: any): DeploymentV2 {
    return DeploymentV2FromJSONTyped(json, false);
}

export function DeploymentV2FromJSONTyped(json: any, ignoreDiscriminator: boolean): DeploymentV2 {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'idleTimeoutEnabled': json['idleTimeoutEnabled'],
        'env': ((json['env'] as Array<any>).map(DeploymentV2EnvInnerFromJSON)),
        'roomsPerProcess': json['roomsPerProcess'],
        'additionalContainerPorts': ((json['additionalContainerPorts'] as Array<any>).map(ContainerPortFromJSON)),
        'defaultContainerPort': ContainerPortFromJSON(json['defaultContainerPort']),
        'createdAt': (new Date(json['createdAt'])),
        'createdBy': json['createdBy'],
        'requestedMemoryMB': json['requestedMemoryMB'],
        'requestedCPU': json['requestedCPU'],
        'deploymentId': json['deploymentId'],
        'buildId': json['buildId'],
        'appId': json['appId'],
    };
}

export function DeploymentV2ToJSON(value?: DeploymentV2 | null): any {
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
        'additionalContainerPorts': ((value.additionalContainerPorts as Array<any>).map(ContainerPortToJSON)),
        'defaultContainerPort': ContainerPortToJSON(value.defaultContainerPort),
        'createdAt': (value.createdAt.toISOString()),
        'createdBy': value.createdBy,
        'requestedMemoryMB': value.requestedMemoryMB,
        'requestedCPU': value.requestedCPU,
        'deploymentId': value.deploymentId,
        'buildId': value.buildId,
        'appId': value.appId,
    };
}
