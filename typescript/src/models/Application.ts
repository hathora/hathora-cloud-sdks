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
import type { AuthConfiguration } from './AuthConfiguration';
import {
    AuthConfigurationFromJSON,
    AuthConfigurationFromJSONTyped,
    AuthConfigurationToJSON,
} from './AuthConfiguration';

/**
 * An application object is the top level namespace for the game server.
 * @export
 * @interface Application
 */
export interface Application {
    /**
     * UserId or email address for the user that deleted the application.
     * @type {string}
     * @memberof Application
     */
    deletedBy: string | null;
    /**
     * When the application was deleted.
     * @type {Date}
     * @memberof Application
     */
    deletedAt: Date | null;
    /**
     * When the application was created.
     * @type {Date}
     * @memberof Application
     */
    createdAt: Date;
    /**
     * UserId or email address for the user that created the application.
     * @type {string}
     * @memberof Application
     */
    createdBy: string;
    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     * @type {string}
     * @memberof Application
     */
    orgId: string;
    /**
     * 
     * @type {AuthConfiguration}
     * @memberof Application
     */
    authConfiguration: AuthConfiguration;
    /**
     * Secret that is used for identity and access management.
     * @type {string}
     * @memberof Application
     */
    appSecret: string;
    /**
     * System generated unique identifier for an application.
     * @type {string}
     * @memberof Application
     */
    appId: string;
    /**
     * Readable name for an application. Must be unique within an organization.
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
        'authConfiguration': AuthConfigurationFromJSON(json['authConfiguration']),
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
        'authConfiguration': AuthConfigurationToJSON(value.authConfiguration),
        'appSecret': value.appSecret,
        'appId': value.appId,
        'appName': value.appName,
    };
}

