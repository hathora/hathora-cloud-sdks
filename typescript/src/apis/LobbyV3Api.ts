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


import * as runtime from '../runtime';
import type {
  ApiError,
  CreateLobbyV3Params,
  LobbyV3,
  Region,
} from '../models';
import {
    ApiErrorFromJSON,
    ApiErrorToJSON,
    CreateLobbyV3ParamsFromJSON,
    CreateLobbyV3ParamsToJSON,
    LobbyV3FromJSON,
    LobbyV3ToJSON,
    RegionFromJSON,
    RegionToJSON,
} from '../models';

export interface CreateLobbyRequest {
    appId: string;
    createLobbyV3Params: CreateLobbyV3Params;
    shortCode?: string;
    roomId?: string;
}

export interface GetLobbyInfoByRoomIdRequest {
    appId: string;
    roomId: string;
}

export interface GetLobbyInfoByShortCodeRequest {
    appId: string;
    shortCode: string;
}

export interface ListActivePublicLobbiesRequest {
    appId: string;
    region?: Region;
}

/**
 * LobbyV3Api - interface
 * 
 * @export
 * @interface LobbyV3ApiInterface
 */
export interface LobbyV3ApiInterface {
    /**
     * Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
     * @param {string} appId 
     * @param {CreateLobbyV3Params} createLobbyV3Params 
     * @param {string} [shortCode] 
     * @param {string} [roomId] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LobbyV3ApiInterface
     */
    createLobbyRaw(requestParameters: CreateLobbyRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LobbyV3>>;

    /**
     * Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
     */
    createLobby(appId: string, createLobbyV3Params: CreateLobbyV3Params, shortCode?: string, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LobbyV3>;

    /**
     * Get details for a lobby.
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LobbyV3ApiInterface
     */
    getLobbyInfoByRoomIdRaw(requestParameters: GetLobbyInfoByRoomIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LobbyV3>>;

    /**
     * Get details for a lobby.
     */
    getLobbyInfoByRoomId(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LobbyV3>;

    /**
     * Get details for a lobby. If 2 or more lobbies have the same `shortCode`, then the most recently created lobby will be returned.
     * @param {string} appId 
     * @param {string} shortCode 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LobbyV3ApiInterface
     */
    getLobbyInfoByShortCodeRaw(requestParameters: GetLobbyInfoByShortCodeRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LobbyV3>>;

    /**
     * Get details for a lobby. If 2 or more lobbies have the same `shortCode`, then the most recently created lobby will be returned.
     */
    getLobbyInfoByShortCode(appId: string, shortCode: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LobbyV3>;

    /**
     * Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.
     * @param {string} appId 
     * @param {Region} [region] If omitted, active public lobbies in all regions will be returned.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LobbyV3ApiInterface
     */
    listActivePublicLobbiesRaw(requestParameters: ListActivePublicLobbiesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<LobbyV3>>>;

    /**
     * Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.
     */
    listActivePublicLobbies(appId: string, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<LobbyV3>>;

}

/**
 * 
 */
export class LobbyV3Api extends runtime.BaseAPI implements LobbyV3ApiInterface {

    /**
     * Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
     */
    async createLobbyRaw(requestParameters: CreateLobbyRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LobbyV3>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling createLobby.');
        }

        if (requestParameters.createLobbyV3Params === null || requestParameters.createLobbyV3Params === undefined) {
            throw new runtime.RequiredError('createLobbyV3Params','Required parameter requestParameters.createLobbyV3Params was null or undefined when calling createLobby.');
        }

        const queryParameters: any = {};

        if (requestParameters.shortCode !== undefined) {
            queryParameters['shortCode'] = requestParameters.shortCode;
        }

        if (requestParameters.roomId !== undefined) {
            queryParameters['roomId'] = requestParameters.roomId;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("playerAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/lobby/v3/{appId}/create`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreateLobbyV3ParamsToJSON(requestParameters.createLobbyV3Params),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LobbyV3FromJSON(jsonValue));
    }

    /**
     * Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
     */
    async createLobby(appId: string, createLobbyV3Params: CreateLobbyV3Params, shortCode?: string, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LobbyV3> {
        const response = await this.createLobbyRaw({ appId: appId, createLobbyV3Params: createLobbyV3Params, shortCode: shortCode, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     * Get details for a lobby.
     */
    async getLobbyInfoByRoomIdRaw(requestParameters: GetLobbyInfoByRoomIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LobbyV3>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getLobbyInfoByRoomId.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling getLobbyInfoByRoomId.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/lobby/v3/{appId}/info/roomid/{roomId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"roomId"}}`, encodeURIComponent(String(requestParameters.roomId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LobbyV3FromJSON(jsonValue));
    }

    /**
     * Get details for a lobby.
     */
    async getLobbyInfoByRoomId(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LobbyV3> {
        const response = await this.getLobbyInfoByRoomIdRaw({ appId: appId, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     * Get details for a lobby. If 2 or more lobbies have the same `shortCode`, then the most recently created lobby will be returned.
     */
    async getLobbyInfoByShortCodeRaw(requestParameters: GetLobbyInfoByShortCodeRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LobbyV3>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getLobbyInfoByShortCode.');
        }

        if (requestParameters.shortCode === null || requestParameters.shortCode === undefined) {
            throw new runtime.RequiredError('shortCode','Required parameter requestParameters.shortCode was null or undefined when calling getLobbyInfoByShortCode.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/lobby/v3/{appId}/info/shortcode/{shortCode}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"shortCode"}}`, encodeURIComponent(String(requestParameters.shortCode))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LobbyV3FromJSON(jsonValue));
    }

    /**
     * Get details for a lobby. If 2 or more lobbies have the same `shortCode`, then the most recently created lobby will be returned.
     */
    async getLobbyInfoByShortCode(appId: string, shortCode: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LobbyV3> {
        const response = await this.getLobbyInfoByShortCodeRaw({ appId: appId, shortCode: shortCode }, initOverrides);
        return await response.value();
    }

    /**
     * Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.
     */
    async listActivePublicLobbiesRaw(requestParameters: ListActivePublicLobbiesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<LobbyV3>>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling listActivePublicLobbies.');
        }

        const queryParameters: any = {};

        if (requestParameters.region !== undefined) {
            queryParameters['region'] = requestParameters.region;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/lobby/v3/{appId}/list/public`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(LobbyV3FromJSON));
    }

    /**
     * Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.
     */
    async listActivePublicLobbies(appId: string, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<LobbyV3>> {
        const response = await this.listActivePublicLobbiesRaw({ appId: appId, region: region }, initOverrides);
        return await response.value();
    }

}
