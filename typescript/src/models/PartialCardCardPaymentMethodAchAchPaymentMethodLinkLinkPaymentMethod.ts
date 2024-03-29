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
import type { AchPaymentMethod } from './AchPaymentMethod';
import {
    AchPaymentMethodFromJSON,
    AchPaymentMethodFromJSONTyped,
    AchPaymentMethodToJSON,
} from './AchPaymentMethod';
import type { CardPaymentMethod } from './CardPaymentMethod';
import {
    CardPaymentMethodFromJSON,
    CardPaymentMethodFromJSONTyped,
    CardPaymentMethodToJSON,
} from './CardPaymentMethod';
import type { LinkPaymentMethod } from './LinkPaymentMethod';
import {
    LinkPaymentMethodFromJSON,
    LinkPaymentMethodFromJSONTyped,
    LinkPaymentMethodToJSON,
} from './LinkPaymentMethod';

/**
 * Make all properties in T optional
 * @export
 * @interface PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod
 */
export interface PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod {
    /**
     * 
     * @type {CardPaymentMethod}
     * @memberof PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod
     */
    card?: CardPaymentMethod;
    /**
     * 
     * @type {AchPaymentMethod}
     * @memberof PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod
     */
    ach?: AchPaymentMethod;
    /**
     * 
     * @type {LinkPaymentMethod}
     * @memberof PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod
     */
    link?: LinkPaymentMethod;
}

/**
 * Check if a given object implements the PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod interface.
 */
export function instanceOfPartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethodFromJSON(json: any): PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod {
    return PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethodFromJSONTyped(json, false);
}

export function PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'card': !exists(json, 'card') ? undefined : CardPaymentMethodFromJSON(json['card']),
        'ach': !exists(json, 'ach') ? undefined : AchPaymentMethodFromJSON(json['ach']),
        'link': !exists(json, 'link') ? undefined : LinkPaymentMethodFromJSON(json['link']),
    };
}

export function PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethodToJSON(value?: PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'card': CardPaymentMethodToJSON(value.card),
        'ach': AchPaymentMethodToJSON(value.ach),
        'link': LinkPaymentMethodToJSON(value.link),
    };
}

