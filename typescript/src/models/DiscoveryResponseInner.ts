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
import type { Region } from './Region';
import {
    RegionFromJSON,
    RegionFromJSONTyped,
    RegionToJSON,
} from './Region';

/**
 * 
 * @export
 * @interface DiscoveryResponseInner
 */
export interface DiscoveryResponseInner {
    /**
     * 
     * @type {number}
     * @memberof DiscoveryResponseInner
     */
    port: number;
    /**
     * 
     * @type {string}
     * @memberof DiscoveryResponseInner
     */
    host: string;
    /**
     * 
     * @type {Region}
     * @memberof DiscoveryResponseInner
     */
    region: Region;
}

/**
 * Check if a given object implements the DiscoveryResponseInner interface.
 */
export function instanceOfDiscoveryResponseInner(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "port" in value;
    isInstance = isInstance && "host" in value;
    isInstance = isInstance && "region" in value;

    return isInstance;
}

export function DiscoveryResponseInnerFromJSON(json: any): DiscoveryResponseInner {
    return DiscoveryResponseInnerFromJSONTyped(json, false);
}

export function DiscoveryResponseInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): DiscoveryResponseInner {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'port': json['port'],
        'host': json['host'],
        'region': RegionFromJSON(json['region']),
    };
}

export function DiscoveryResponseInnerToJSON(value?: DiscoveryResponseInner | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'port': value.port,
        'host': value.host,
        'region': RegionToJSON(value.region),
    };
}

