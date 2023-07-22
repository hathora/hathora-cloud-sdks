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
 * A container port object represents the transport configruations for how your server will listen.
 * @export
 * @interface ContainerPort
 */
export interface ContainerPort {
    /**
     * 
     * @type {TransportType}
     * @memberof ContainerPort
     */
    transportType: TransportType;
    /**
     * 
     * @type {number}
     * @memberof ContainerPort
     */
    port: number;
    /**
     * Readable name for the port.
     * @type {string}
     * @memberof ContainerPort
     */
    name: string;
}

/**
 * Check if a given object implements the ContainerPort interface.
 */
export function instanceOfContainerPort(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "transportType" in value;
    isInstance = isInstance && "port" in value;
    isInstance = isInstance && "name" in value;

    return isInstance;
}

export function ContainerPortFromJSON(json: any): ContainerPort {
    return ContainerPortFromJSONTyped(json, false);
}

export function ContainerPortFromJSONTyped(json: any, ignoreDiscriminator: boolean): ContainerPort {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'transportType': TransportTypeFromJSON(json['transportType']),
        'port': json['port'],
        'name': json['name'],
    };
}

export function ContainerPortToJSON(value?: ContainerPort | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'transportType': TransportTypeToJSON(value.transportType),
        'port': value.port,
        'name': value.name,
    };
}

