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
  CreateLobbyParams,
  CreatePrivateLobbyRequest,
  Lobby,
  Region,
  SetLobbyStateParams,
} from '../models';
import {
    ApiErrorFromJSON,
    ApiErrorToJSON,
    CreateLobbyParamsFromJSON,
    CreateLobbyParamsToJSON,
    CreatePrivateLobbyRequestFromJSON,
    CreatePrivateLobbyRequestToJSON,
    LobbyFromJSON,
    LobbyToJSON,
    RegionFromJSON,
    RegionToJSON,
    SetLobbyStateParamsFromJSON,
    SetLobbyStateParamsToJSON,
} from '../models';

export interface CreateLobbyDeprecatedRequest {
    appId: string;
    createLobbyParams: CreateLobbyParams;
    roomId?: string;
}

export interface CreateLocalLobbyRequest {
    appId: string;
    createPrivateLobbyRequest: CreatePrivateLobbyRequest;
    roomId?: string;
}

export interface CreatePrivateLobbyOperationRequest {
    appId: string;
    createPrivateLobbyRequest: CreatePrivateLobbyRequest;
    roomId?: string;
}

export interface CreatePublicLobbyRequest {
    appId: string;
    createPrivateLobbyRequest: CreatePrivateLobbyRequest;
    roomId?: string;
}

export interface GetLobbyInfoRequest {
    appId: string;
    roomId: string;
}

export interface ListActivePublicLobbiesDeprecatedV2Request {
    appId: string;
    region?: Region;
}

export interface SetLobbyStateRequest {
    appId: string;
    roomId: string;
    setLobbyStateParams: SetLobbyStateParams;
}

/**
 * LobbyV2Api - interface
 * 
 * @export
 * @interface LobbyV2ApiInterface
 */
export interface LobbyV2ApiInterface {
    /**
     * Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
     * @param {string} appId 
     * @param {CreateLobbyParams} createLobbyParams 
     * @param {string} [roomId] 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV2ApiInterface
     */
    createLobbyDeprecatedRaw(requestParameters: CreateLobbyDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>>;

    /**
     * Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
     */
    createLobbyDeprecated(appId: string, createLobbyParams: CreateLobbyParams, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby>;

    /**
     * 
     * @param {string} appId 
     * @param {CreatePrivateLobbyRequest} createPrivateLobbyRequest 
     * @param {string} [roomId] 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV2ApiInterface
     */
    createLocalLobbyRaw(requestParameters: CreateLocalLobbyRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>>;

    /**
     */
    createLocalLobby(appId: string, createPrivateLobbyRequest: CreatePrivateLobbyRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby>;

    /**
     * 
     * @param {string} appId 
     * @param {CreatePrivateLobbyRequest} createPrivateLobbyRequest 
     * @param {string} [roomId] 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV2ApiInterface
     */
    createPrivateLobbyRaw(requestParameters: CreatePrivateLobbyOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>>;

    /**
     */
    createPrivateLobby(appId: string, createPrivateLobbyRequest: CreatePrivateLobbyRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby>;

    /**
     * 
     * @param {string} appId 
     * @param {CreatePrivateLobbyRequest} createPrivateLobbyRequest 
     * @param {string} [roomId] 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV2ApiInterface
     */
    createPublicLobbyRaw(requestParameters: CreatePublicLobbyRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>>;

    /**
     */
    createPublicLobby(appId: string, createPrivateLobbyRequest: CreatePrivateLobbyRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby>;

    /**
     * Get details for a lobby.
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV2ApiInterface
     */
    getLobbyInfoRaw(requestParameters: GetLobbyInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>>;

    /**
     * Get details for a lobby.
     */
    getLobbyInfo(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby>;

    /**
     * Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.
     * @param {string} appId 
     * @param {Region} [region] Region to filter by. If omitted, active public lobbies in all regions will be returned.
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV2ApiInterface
     */
    listActivePublicLobbiesDeprecatedV2Raw(requestParameters: ListActivePublicLobbiesDeprecatedV2Request, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<Lobby>>>;

    /**
     * Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.
     */
    listActivePublicLobbiesDeprecatedV2(appId: string, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<Lobby>>;

    /**
     * Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores).
     * @param {string} appId 
     * @param {string} roomId 
     * @param {SetLobbyStateParams} setLobbyStateParams 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV2ApiInterface
     */
    setLobbyStateRaw(requestParameters: SetLobbyStateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>>;

    /**
     * Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores).
     */
    setLobbyState(appId: string, roomId: string, setLobbyStateParams: SetLobbyStateParams, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby>;

}

/**
 * 
 */
export class LobbyV2Api extends runtime.BaseAPI implements LobbyV2ApiInterface {

    /**
     * Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
     */
    async createLobbyDeprecatedRaw(requestParameters: CreateLobbyDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling createLobbyDeprecated.');
        }

        if (requestParameters.createLobbyParams === null || requestParameters.createLobbyParams === undefined) {
            throw new runtime.RequiredError('createLobbyParams','Required parameter requestParameters.createLobbyParams was null or undefined when calling createLobbyDeprecated.');
        }

        const queryParameters: any = {};

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
            path: `/lobby/v2/{appId}/create`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreateLobbyParamsToJSON(requestParameters.createLobbyParams),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LobbyFromJSON(jsonValue));
    }

    /**
     * Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
     */
    async createLobbyDeprecated(appId: string, createLobbyParams: CreateLobbyParams, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby> {
        const response = await this.createLobbyDeprecatedRaw({ appId: appId, createLobbyParams: createLobbyParams, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async createLocalLobbyRaw(requestParameters: CreateLocalLobbyRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling createLocalLobby.');
        }

        if (requestParameters.createPrivateLobbyRequest === null || requestParameters.createPrivateLobbyRequest === undefined) {
            throw new runtime.RequiredError('createPrivateLobbyRequest','Required parameter requestParameters.createPrivateLobbyRequest was null or undefined when calling createLocalLobby.');
        }

        const queryParameters: any = {};

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
            path: `/lobby/v2/{appId}/create/local`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreatePrivateLobbyRequestToJSON(requestParameters.createPrivateLobbyRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LobbyFromJSON(jsonValue));
    }

    /**
     */
    async createLocalLobby(appId: string, createPrivateLobbyRequest: CreatePrivateLobbyRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby> {
        const response = await this.createLocalLobbyRaw({ appId: appId, createPrivateLobbyRequest: createPrivateLobbyRequest, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async createPrivateLobbyRaw(requestParameters: CreatePrivateLobbyOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling createPrivateLobby.');
        }

        if (requestParameters.createPrivateLobbyRequest === null || requestParameters.createPrivateLobbyRequest === undefined) {
            throw new runtime.RequiredError('createPrivateLobbyRequest','Required parameter requestParameters.createPrivateLobbyRequest was null or undefined when calling createPrivateLobby.');
        }

        const queryParameters: any = {};

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
            path: `/lobby/v2/{appId}/create/private`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreatePrivateLobbyRequestToJSON(requestParameters.createPrivateLobbyRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LobbyFromJSON(jsonValue));
    }

    /**
     */
    async createPrivateLobby(appId: string, createPrivateLobbyRequest: CreatePrivateLobbyRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby> {
        const response = await this.createPrivateLobbyRaw({ appId: appId, createPrivateLobbyRequest: createPrivateLobbyRequest, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async createPublicLobbyRaw(requestParameters: CreatePublicLobbyRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling createPublicLobby.');
        }

        if (requestParameters.createPrivateLobbyRequest === null || requestParameters.createPrivateLobbyRequest === undefined) {
            throw new runtime.RequiredError('createPrivateLobbyRequest','Required parameter requestParameters.createPrivateLobbyRequest was null or undefined when calling createPublicLobby.');
        }

        const queryParameters: any = {};

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
            path: `/lobby/v2/{appId}/create/public`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreatePrivateLobbyRequestToJSON(requestParameters.createPrivateLobbyRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LobbyFromJSON(jsonValue));
    }

    /**
     */
    async createPublicLobby(appId: string, createPrivateLobbyRequest: CreatePrivateLobbyRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby> {
        const response = await this.createPublicLobbyRaw({ appId: appId, createPrivateLobbyRequest: createPrivateLobbyRequest, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     * Get details for a lobby.
     */
    async getLobbyInfoRaw(requestParameters: GetLobbyInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getLobbyInfo.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling getLobbyInfo.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/lobby/v2/{appId}/info/{roomId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"roomId"}}`, encodeURIComponent(String(requestParameters.roomId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LobbyFromJSON(jsonValue));
    }

    /**
     * Get details for a lobby.
     */
    async getLobbyInfo(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby> {
        const response = await this.getLobbyInfoRaw({ appId: appId, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     * Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.
     */
    async listActivePublicLobbiesDeprecatedV2Raw(requestParameters: ListActivePublicLobbiesDeprecatedV2Request, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<Lobby>>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling listActivePublicLobbiesDeprecatedV2.');
        }

        const queryParameters: any = {};

        if (requestParameters.region !== undefined) {
            queryParameters['region'] = requestParameters.region;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/lobby/v2/{appId}/list/public`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(LobbyFromJSON));
    }

    /**
     * Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.
     */
    async listActivePublicLobbiesDeprecatedV2(appId: string, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<Lobby>> {
        const response = await this.listActivePublicLobbiesDeprecatedV2Raw({ appId: appId, region: region }, initOverrides);
        return await response.value();
    }

    /**
     * Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores).
     */
    async setLobbyStateRaw(requestParameters: SetLobbyStateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Lobby>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling setLobbyState.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling setLobbyState.');
        }

        if (requestParameters.setLobbyStateParams === null || requestParameters.setLobbyStateParams === undefined) {
            throw new runtime.RequiredError('setLobbyStateParams','Required parameter requestParameters.setLobbyStateParams was null or undefined when calling setLobbyState.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("hathoraDevToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/lobby/v2/{appId}/setState/{roomId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"roomId"}}`, encodeURIComponent(String(requestParameters.roomId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: SetLobbyStateParamsToJSON(requestParameters.setLobbyStateParams),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LobbyFromJSON(jsonValue));
    }

    /**
     * Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores).
     */
    async setLobbyState(appId: string, roomId: string, setLobbyStateParams: SetLobbyStateParams, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Lobby> {
        const response = await this.setLobbyStateRaw({ appId: appId, roomId: roomId, setLobbyStateParams: setLobbyStateParams }, initOverrides);
        return await response.value();
    }

}
