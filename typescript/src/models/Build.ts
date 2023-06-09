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
import type { BuildRegionalContainerTagsInner } from './BuildRegionalContainerTagsInner';
import {
    BuildRegionalContainerTagsInnerFromJSON,
    BuildRegionalContainerTagsInnerFromJSONTyped,
    BuildRegionalContainerTagsInnerToJSON,
} from './BuildRegionalContainerTagsInner';

/**
 * 
 * @export
 * @interface Build
 */
export interface Build {
    /**
     * 
     * @type {Array<BuildRegionalContainerTagsInner>}
     * @memberof Build
     */
    regionalContainerTags: Array<BuildRegionalContainerTagsInner>;
    /**
     * 
     * @type {number}
     * @memberof Build
     */
    imageSize: number;
    /**
     * 
     * @type {string}
     * @memberof Build
     */
    status: BuildStatusEnum;
    /**
     * 
     * @type {Date}
     * @memberof Build
     */
    deletedAt: Date | null;
    /**
     * 
     * @type {Date}
     * @memberof Build
     */
    finishedAt: Date | null;
    /**
     * 
     * @type {Date}
     * @memberof Build
     */
    startedAt: Date | null;
    /**
     * 
     * @type {Date}
     * @memberof Build
     */
    createdAt: Date;
    /**
     * 
     * @type {string}
     * @memberof Build
     */
    createdBy: string;
    /**
     * 
     * @type {number}
     * @memberof Build
     */
    buildId: number;
    /**
     * 
     * @type {string}
     * @memberof Build
     */
    appId: string;
}


/**
 * @export
 */
export const BuildStatusEnum = {
    Created: 'created',
    Running: 'running',
    Succeeded: 'succeeded',
    Failed: 'failed'
} as const;
export type BuildStatusEnum = typeof BuildStatusEnum[keyof typeof BuildStatusEnum];


/**
 * Check if a given object implements the Build interface.
 */
export function instanceOfBuild(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "regionalContainerTags" in value;
    isInstance = isInstance && "imageSize" in value;
    isInstance = isInstance && "status" in value;
    isInstance = isInstance && "deletedAt" in value;
    isInstance = isInstance && "finishedAt" in value;
    isInstance = isInstance && "startedAt" in value;
    isInstance = isInstance && "createdAt" in value;
    isInstance = isInstance && "createdBy" in value;
    isInstance = isInstance && "buildId" in value;
    isInstance = isInstance && "appId" in value;

    return isInstance;
}

export function BuildFromJSON(json: any): Build {
    return BuildFromJSONTyped(json, false);
}

export function BuildFromJSONTyped(json: any, ignoreDiscriminator: boolean): Build {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'regionalContainerTags': ((json['regionalContainerTags'] as Array<any>).map(BuildRegionalContainerTagsInnerFromJSON)),
        'imageSize': json['imageSize'],
        'status': json['status'],
        'deletedAt': (json['deletedAt'] === null ? null : new Date(json['deletedAt'])),
        'finishedAt': (json['finishedAt'] === null ? null : new Date(json['finishedAt'])),
        'startedAt': (json['startedAt'] === null ? null : new Date(json['startedAt'])),
        'createdAt': (new Date(json['createdAt'])),
        'createdBy': json['createdBy'],
        'buildId': json['buildId'],
        'appId': json['appId'],
    };
}

export function BuildToJSON(value?: Build | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'regionalContainerTags': ((value.regionalContainerTags as Array<any>).map(BuildRegionalContainerTagsInnerToJSON)),
        'imageSize': value.imageSize,
        'status': value.status,
        'deletedAt': (value.deletedAt === null ? null : value.deletedAt.toISOString()),
        'finishedAt': (value.finishedAt === null ? null : value.finishedAt.toISOString()),
        'startedAt': (value.startedAt === null ? null : value.startedAt.toISOString()),
        'createdAt': (value.createdAt.toISOString()),
        'createdBy': value.createdBy,
        'buildId': value.buildId,
        'appId': value.appId,
    };
}

