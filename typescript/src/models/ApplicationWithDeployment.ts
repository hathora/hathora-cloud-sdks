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
import type { ApplicationAuthConfiguration } from './ApplicationAuthConfiguration';
import {
    ApplicationAuthConfigurationFromJSON,
    ApplicationAuthConfigurationFromJSONTyped,
    ApplicationAuthConfigurationToJSON,
} from './ApplicationAuthConfiguration';
import type { Deployment } from './Deployment';
import {
    DeploymentFromJSON,
    DeploymentFromJSONTyped,
    DeploymentToJSON,
} from './Deployment';

/**
 * 
 * @export
 * @interface ApplicationWithDeployment
 */
export interface ApplicationWithDeployment {
    /**
     * Email address for the user that deleted the application.
     * @type {string}
     * @memberof ApplicationWithDeployment
     */
    deletedBy: string | null;
    /**
     * When the application was deleted.
     * @type {Date}
     * @memberof ApplicationWithDeployment
     */
    deletedAt: Date | null;
    /**
     * When the application was created.
     * @type {Date}
     * @memberof ApplicationWithDeployment
     */
    createdAt: Date;
    /**
     * Email address for the user that deleted the application.
     * @type {string}
     * @memberof ApplicationWithDeployment
     */
    createdBy: string;
    /**
     * System generated unique identifier for an organization.
     * @type {string}
     * @memberof ApplicationWithDeployment
     */
    orgId: string;
    /**
     * 
     * @type {ApplicationAuthConfiguration}
     * @memberof ApplicationWithDeployment
     */
    authConfiguration: ApplicationAuthConfiguration;
    /**
     * Secret that is used for identity and access management.
     * @type {string}
     * @memberof ApplicationWithDeployment
     */
    appSecret: string;
    /**
     * System generated unique identifier for an application.
     * @type {string}
     * @memberof ApplicationWithDeployment
     */
    appId: string;
    /**
     * Readable name for an application. Must be unique within an organization.
     * @type {string}
     * @memberof ApplicationWithDeployment
     */
    appName: string;
    /**
     * 
     * @type {Deployment}
     * @memberof ApplicationWithDeployment
     */
    deployment: Deployment;
}

/**
 * Check if a given object implements the ApplicationWithDeployment interface.
 */
export function instanceOfApplicationWithDeployment(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "deletedBy" in value;
    isInstance = isInstance && "deletedAt" in value;
    isInstance = isInstance && "createdAt" in value;
    isInstance = isInstance && "createdBy" in value;
    isInstance = isInstance && "orgId" in value;
    isInstance = isInstance && "authConfiguration" in value;
    isInstance = isInstance && "appSecret" in value;
    isInstance = isInstance && "appId" in value;
    isInstance = isInstance && "appName" in value;
    isInstance = isInstance && "deployment" in value;

    return isInstance;
}

export function ApplicationWithDeploymentFromJSON(json: any): ApplicationWithDeployment {
    return ApplicationWithDeploymentFromJSONTyped(json, false);
}

export function ApplicationWithDeploymentFromJSONTyped(json: any, ignoreDiscriminator: boolean): ApplicationWithDeployment {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'deletedBy': json['deletedBy'],
        'deletedAt': (json['deletedAt'] === null ? null : new Date(json['deletedAt'])),
        'createdAt': (new Date(json['createdAt'])),
        'createdBy': json['createdBy'],
        'orgId': json['orgId'],
        'authConfiguration': ApplicationAuthConfigurationFromJSON(json['authConfiguration']),
        'appSecret': json['appSecret'],
        'appId': json['appId'],
        'appName': json['appName'],
        'deployment': DeploymentFromJSON(json['deployment']),
    };
}

export function ApplicationWithDeploymentToJSON(value?: ApplicationWithDeployment | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'deletedBy': value.deletedBy,
        'deletedAt': (value.deletedAt === null ? null : value.deletedAt.toISOString()),
        'createdAt': (value.createdAt.toISOString()),
        'createdBy': value.createdBy,
        'orgId': value.orgId,
        'authConfiguration': ApplicationAuthConfigurationToJSON(value.authConfiguration),
        'appSecret': value.appSecret,
        'appId': value.appId,
        'appName': value.appName,
        'deployment': DeploymentToJSON(value.deployment),
    };
}

