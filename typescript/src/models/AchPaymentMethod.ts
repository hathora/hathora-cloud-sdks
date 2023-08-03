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
 * @interface AchPaymentMethod
 */
export interface AchPaymentMethod {
    /**
     * 
     * @type {string}
     * @memberof AchPaymentMethod
     */
    last4?: string;
    /**
     * 
     * @type {string}
     * @memberof AchPaymentMethod
     */
    bankName?: string;
}

/**
 * Check if a given object implements the AchPaymentMethod interface.
 */
export function instanceOfAchPaymentMethod(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function AchPaymentMethodFromJSON(json: any): AchPaymentMethod {
    return AchPaymentMethodFromJSONTyped(json, false);
}

export function AchPaymentMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): AchPaymentMethod {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'last4': !exists(json, 'last4') ? undefined : json['last4'],
        'bankName': !exists(json, 'bankName') ? undefined : json['bankName'],
    };
}

export function AchPaymentMethodToJSON(value?: AchPaymentMethod | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'last4': value.last4,
        'bankName': value.bankName,
    };
}
