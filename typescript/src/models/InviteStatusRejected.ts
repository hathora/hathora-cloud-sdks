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
 * @interface InviteStatusRejected
 */
export interface InviteStatusRejected {
    /**
     * System generated unique identifier for a user. Not guaranteed to have a specific format.
     * @type {string}
     * @memberof InviteStatusRejected
     */
    userId: string;
    /**
     * 
     * @type {string}
     * @memberof InviteStatusRejected
     */
    type: InviteStatusRejectedTypeEnum;
}


/**
 * @export
 */
export const InviteStatusRejectedTypeEnum = {
    Rejected: 'rejected'
} as const;
export type InviteStatusRejectedTypeEnum = typeof InviteStatusRejectedTypeEnum[keyof typeof InviteStatusRejectedTypeEnum];


/**
 * Check if a given object implements the InviteStatusRejected interface.
 */
export function instanceOfInviteStatusRejected(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "userId" in value;
    isInstance = isInstance && "type" in value;

    return isInstance;
}

export function InviteStatusRejectedFromJSON(json: any): InviteStatusRejected {
    return InviteStatusRejectedFromJSONTyped(json, false);
}

export function InviteStatusRejectedFromJSONTyped(json: any, ignoreDiscriminator: boolean): InviteStatusRejected {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'userId': json['userId'],
        'type': json['type'],
    };
}

export function InviteStatusRejectedToJSON(value?: InviteStatusRejected | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'userId': value.userId,
        'type': value.type,
    };
}

