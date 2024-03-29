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
import type { TransportType } from './TransportType';
import {
    TransportTypeFromJSON,
    TransportTypeFromJSONTyped,
    TransportTypeToJSON,
} from './TransportType';

/**
 * Connection details for an active process.
 * @export
 * @interface ExposedPort
 */
export interface ExposedPort {
    /**
     * 
     * @type {TransportType}
     * @memberof ExposedPort
     */
    transportType: TransportType;
    /**
     * 
     * @type {number}
     * @memberof ExposedPort
     */
    port: number;
    /**
     * 
     * @type {string}
     * @memberof ExposedPort
     */
    host: string;
    /**
     * 
     * @type {string}
     * @memberof ExposedPort
     */
    name: string;
}

/**
 * Check if a given object implements the ExposedPort interface.
 */
export function instanceOfExposedPort(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "transportType" in value;
    isInstance = isInstance && "port" in value;
    isInstance = isInstance && "host" in value;
    isInstance = isInstance && "name" in value;

    return isInstance;
}

export function ExposedPortFromJSON(json: any): ExposedPort {
    return ExposedPortFromJSONTyped(json, false);
}

export function ExposedPortFromJSONTyped(json: any, ignoreDiscriminator: boolean): ExposedPort {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'transportType': TransportTypeFromJSON(json['transportType']),
        'port': json['port'],
        'host': json['host'],
        'name': json['name'],
    };
}

export function ExposedPortToJSON(value?: ExposedPort | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'transportType': TransportTypeToJSON(value.transportType),
        'port': value.port,
        'host': value.host,
        'name': value.name,
    };
}

