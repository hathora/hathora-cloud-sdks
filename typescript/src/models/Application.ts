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
import type { ApplicationAuthConfiguration } from './ApplicationAuthConfiguration';
import {
    ApplicationAuthConfigurationFromJSON,
    ApplicationAuthConfigurationFromJSONTyped,
    ApplicationAuthConfigurationToJSON,
} from './ApplicationAuthConfiguration';

/**
 * 
 * @export
 * @interface Application
 */
export interface Application {
    /**
     * 
     * @type {string}
     * @memberof Application
     */
    deletedBy: string | null;
    /**
     * 
     * @type {Date}
     * @memberof Application
     */
    deletedAt: Date | null;
    /**
     * 
     * @type {Date}
     * @memberof Application
     */
    createdAt: Date;
    /**
     * 
     * @type {string}
     * @memberof Application
     */
    createdBy: string;
    /**
     * 
     * @type {string}
     * @memberof Application
     */
    orgId: string;
    /**
     * 
     * @type {ApplicationAuthConfiguration}
     * @memberof Application
     */
    authConfiguration: ApplicationAuthConfiguration;
    /**
     * 
     * @type {string}
     * @memberof Application
     */
    appSecret: string;
    /**
     * 
     * @type {string}
     * @memberof Application
     */
    appId: string;
    /**
     * 
     * @type {string}
     * @memberof Application
     */
    appName: string;
}

/**
 * Check if a given object implements the Application interface.
 */
export function instanceOfApplication(value: object): boolean {
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

    return isInstance;
}

export function ApplicationFromJSON(json: any): Application {
    return ApplicationFromJSONTyped(json, false);
}

export function ApplicationFromJSONTyped(json: any, ignoreDiscriminator: boolean): Application {
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
    };
}

export function ApplicationToJSON(value?: Application | null): any {
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
    };
}

