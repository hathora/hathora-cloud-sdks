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
import type { Region } from './Region';
import {
    RegionFromJSON,
    RegionFromJSONTyped,
    RegionToJSON,
} from './Region';

/**
 * 
 * @export
 * @interface CreateRoomDeprecatedRequest
 */
export interface CreateRoomDeprecatedRequest {
    /**
     * 
     * @type {Region}
     * @memberof CreateRoomDeprecatedRequest
     */
    region: Region;
}

/**
 * Check if a given object implements the CreateRoomDeprecatedRequest interface.
 */
export function instanceOfCreateRoomDeprecatedRequest(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "region" in value;

    return isInstance;
}

export function CreateRoomDeprecatedRequestFromJSON(json: any): CreateRoomDeprecatedRequest {
    return CreateRoomDeprecatedRequestFromJSONTyped(json, false);
}

export function CreateRoomDeprecatedRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateRoomDeprecatedRequest {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'region': RegionFromJSON(json['region']),
    };
}

export function CreateRoomDeprecatedRequestToJSON(value?: CreateRoomDeprecatedRequest | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'region': RegionToJSON(value.region),
    };
}

