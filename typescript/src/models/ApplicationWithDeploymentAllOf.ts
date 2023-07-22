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
import type { Deployment } from './Deployment';
import {
    DeploymentFromJSON,
    DeploymentFromJSONTyped,
    DeploymentToJSON,
} from './Deployment';

/**
 * 
 * @export
 * @interface ApplicationWithDeploymentAllOf
 */
export interface ApplicationWithDeploymentAllOf {
    /**
     * 
     * @type {Deployment}
     * @memberof ApplicationWithDeploymentAllOf
     */
    deployment: Deployment;
}

/**
 * Check if a given object implements the ApplicationWithDeploymentAllOf interface.
 */
export function instanceOfApplicationWithDeploymentAllOf(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "deployment" in value;

    return isInstance;
}

export function ApplicationWithDeploymentAllOfFromJSON(json: any): ApplicationWithDeploymentAllOf {
    return ApplicationWithDeploymentAllOfFromJSONTyped(json, false);
}

export function ApplicationWithDeploymentAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): ApplicationWithDeploymentAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'deployment': DeploymentFromJSON(json['deployment']),
    };
}

export function ApplicationWithDeploymentAllOfToJSON(value?: ApplicationWithDeploymentAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'deployment': DeploymentToJSON(value.deployment),
    };
}

