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
/**
 * 
 * @export
 * @interface CreateBuildParams
 */
export interface CreateBuildParams {
    /**
     * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
     * @type {string}
     * @memberof CreateBuildParams
     */
    buildTag?: string;
}

/**
 * Check if a given object implements the CreateBuildParams interface.
 */
export function instanceOfCreateBuildParams(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function CreateBuildParamsFromJSON(json: any): CreateBuildParams {
    return CreateBuildParamsFromJSONTyped(json, false);
}

export function CreateBuildParamsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateBuildParams {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'buildTag': !exists(json, 'buildTag') ? undefined : json['buildTag'],
    };
}

export function CreateBuildParamsToJSON(value?: CreateBuildParams | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'buildTag': value.buildTag,
    };
}

