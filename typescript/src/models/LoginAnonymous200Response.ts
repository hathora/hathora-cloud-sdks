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
/**
 * 
 * @export
 * @interface LoginAnonymous200Response
 */
export interface LoginAnonymous200Response {
    /**
     * 
     * @type {string}
     * @memberof LoginAnonymous200Response
     */
    token: string;
}

/**
 * Check if a given object implements the LoginAnonymous200Response interface.
 */
export function instanceOfLoginAnonymous200Response(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "token" in value;

    return isInstance;
}

export function LoginAnonymous200ResponseFromJSON(json: any): LoginAnonymous200Response {
    return LoginAnonymous200ResponseFromJSONTyped(json, false);
}

export function LoginAnonymous200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): LoginAnonymous200Response {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'token': json['token'],
    };
}

export function LoginAnonymous200ResponseToJSON(value?: LoginAnonymous200Response | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'token': value.token,
    };
}

