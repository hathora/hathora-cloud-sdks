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
 * @interface NicknameObject
 */
export interface NicknameObject {
    /**
     * An alias to represent a player.
     * @type {string}
     * @memberof NicknameObject
     */
    nickname: string;
}

/**
 * Check if a given object implements the NicknameObject interface.
 */
export function instanceOfNicknameObject(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "nickname" in value;

    return isInstance;
}

export function NicknameObjectFromJSON(json: any): NicknameObject {
    return NicknameObjectFromJSONTyped(json, false);
}

export function NicknameObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): NicknameObject {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'nickname': json['nickname'],
    };
}

export function NicknameObjectToJSON(value?: NicknameObject | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'nickname': value.nickname,
    };
}

