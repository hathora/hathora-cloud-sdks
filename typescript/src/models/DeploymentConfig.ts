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
import type { ContainerPort } from './ContainerPort';
import {
    ContainerPortFromJSON,
    ContainerPortFromJSONTyped,
    ContainerPortToJSON,
} from './ContainerPort';
import type { DeploymentConfigEnvInner } from './DeploymentConfigEnvInner';
import {
    DeploymentConfigEnvInnerFromJSON,
    DeploymentConfigEnvInnerFromJSONTyped,
    DeploymentConfigEnvInnerToJSON,
} from './DeploymentConfigEnvInner';
import type { PlanName } from './PlanName';
import {
    PlanNameFromJSON,
    PlanNameFromJSONTyped,
    PlanNameToJSON,
} from './PlanName';
import type { TransportType } from './TransportType';
import {
    TransportTypeFromJSON,
    TransportTypeFromJSONTyped,
    TransportTypeToJSON,
} from './TransportType';

/**
 * 
 * @export
 * @interface DeploymentConfig
 */
export interface DeploymentConfig {
    /**
     * 
     * @type {Array<DeploymentConfigEnvInner>}
     * @memberof DeploymentConfig
     */
    env: Array<DeploymentConfigEnvInner>;
    /**
     * 
     * @type {number}
     * @memberof DeploymentConfig
     */
    roomsPerProcess: number;
    /**
     * 
     * @type {PlanName}
     * @memberof DeploymentConfig
     */
    planName: PlanName;
    /**
     * 
     * @type {Array<ContainerPort>}
     * @memberof DeploymentConfig
     */
    additionalContainerPorts?: Array<ContainerPort>;
    /**
     * 
     * @type {TransportType}
     * @memberof DeploymentConfig
     */
    transportType: TransportType;
    /**
     * 
     * @type {number}
     * @memberof DeploymentConfig
     */
    containerPort: number;
}

/**
 * Check if a given object implements the DeploymentConfig interface.
 */
export function instanceOfDeploymentConfig(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "env" in value;
    isInstance = isInstance && "roomsPerProcess" in value;
    isInstance = isInstance && "planName" in value;
    isInstance = isInstance && "transportType" in value;
    isInstance = isInstance && "containerPort" in value;

    return isInstance;
}

export function DeploymentConfigFromJSON(json: any): DeploymentConfig {
    return DeploymentConfigFromJSONTyped(json, false);
}

export function DeploymentConfigFromJSONTyped(json: any, ignoreDiscriminator: boolean): DeploymentConfig {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'env': ((json['env'] as Array<any>).map(DeploymentConfigEnvInnerFromJSON)),
        'roomsPerProcess': json['roomsPerProcess'],
        'planName': PlanNameFromJSON(json['planName']),
        'additionalContainerPorts': !exists(json, 'additionalContainerPorts') ? undefined : ((json['additionalContainerPorts'] as Array<any>).map(ContainerPortFromJSON)),
        'transportType': TransportTypeFromJSON(json['transportType']),
        'containerPort': json['containerPort'],
    };
}

export function DeploymentConfigToJSON(value?: DeploymentConfig | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'env': ((value.env as Array<any>).map(DeploymentConfigEnvInnerToJSON)),
        'roomsPerProcess': value.roomsPerProcess,
        'planName': PlanNameToJSON(value.planName),
        'additionalContainerPorts': value.additionalContainerPorts === undefined ? undefined : ((value.additionalContainerPorts as Array<any>).map(ContainerPortToJSON)),
        'transportType': TransportTypeToJSON(value.transportType),
        'containerPort': value.containerPort,
    };
}
