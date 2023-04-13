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
 * @interface Lobby
 */
export interface Lobby {
    /**
     * 
     * @type {object}
     * @memberof Lobby
     */
    state?: object;
    /**
     * 
     * @type {object}
     * @memberof Lobby
     */
    initialConfig: object;
    /**
     * 
     * @type {Date}
     * @memberof Lobby
     */
    createdAt: Date;
    /**
     * 
     * @type {string}
     * @memberof Lobby
     */
    createdBy: string;
    /**
     * 
     * @type {boolean}
     * @memberof Lobby
     */
    local: boolean;
    /**
     * 
     * @type {string}
     * @memberof Lobby
     */
    visibility: LobbyVisibilityEnum;
    /**
     * 
     * @type {Region}
     * @memberof Lobby
     */
    region: Region;
    /**
     * 
     * @type {string}
     * @memberof Lobby
     */
    roomId: string;
    /**
     * 
     * @type {string}
     * @memberof Lobby
     */
    appId: string;
}


/**
 * @export
 */
export const LobbyVisibilityEnum = {
    Private: 'private',
    Public: 'public'
} as const;
export type LobbyVisibilityEnum = typeof LobbyVisibilityEnum[keyof typeof LobbyVisibilityEnum];


/**
 * Check if a given object implements the Lobby interface.
 */
export function instanceOfLobby(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "initialConfig" in value;
    isInstance = isInstance && "createdAt" in value;
    isInstance = isInstance && "createdBy" in value;
    isInstance = isInstance && "local" in value;
    isInstance = isInstance && "visibility" in value;
    isInstance = isInstance && "region" in value;
    isInstance = isInstance && "roomId" in value;
    isInstance = isInstance && "appId" in value;

    return isInstance;
}

export function LobbyFromJSON(json: any): Lobby {
    return LobbyFromJSONTyped(json, false);
}

export function LobbyFromJSONTyped(json: any, ignoreDiscriminator: boolean): Lobby {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'state': !exists(json, 'state') ? undefined : json['state'],
        'initialConfig': json['initialConfig'],
        'createdAt': (new Date(json['createdAt'])),
        'createdBy': json['createdBy'],
        'local': json['local'],
        'visibility': json['visibility'],
        'region': RegionFromJSON(json['region']),
        'roomId': json['roomId'],
        'appId': json['appId'],
    };
}

export function LobbyToJSON(value?: Lobby | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'state': value.state,
        'initialConfig': value.initialConfig,
        'createdAt': (value.createdAt.toISOString()),
        'createdBy': value.createdBy,
        'local': value.local,
        'visibility': value.visibility,
        'region': RegionToJSON(value.region),
        'roomId': value.roomId,
        'appId': value.appId,
    };
}

