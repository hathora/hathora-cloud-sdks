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


import * as runtime from '../runtime';
import type {
  Lobby,
  Region,
} from '../models';
import {
    LobbyFromJSON,
    LobbyToJSON,
    RegionFromJSON,
    RegionToJSON,
} from '../models';

export interface CreatePrivateLobbyDeprecatedRequest {
    appId: string;
    authorization: string;
    region?: Region;
    local?: boolean;
}

export interface CreatePublicLobbyDeprecatedRequest {
    appId: string;
    authorization: string;
    region?: Region;
    local?: boolean;
}

export interface ListActivePublicLobbiesDeprecatedRequest {
    appId: string;
    authorization: string;
    local?: boolean;
    region?: Region;
}

/**
 * LobbyV1Api - interface
 * 
 * @export
 * @interface LobbyV1ApiInterface
 */
export interface LobbyV1ApiInterface {
    /**
     * 
     * @param {string} appId 
     * @param {string} authorization 
     * @param {Region} [region] 
     * @param {boolean} [local] 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV1ApiInterface
     */
    createPrivateLobbyDeprecatedRaw(requestParameters: CreatePrivateLobbyDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>>;

    /**
     */
    createPrivateLobbyDeprecated(appId: string, authorization: string, region?: Region, local?: boolean, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string>;

    /**
     * 
     * @param {string} appId 
     * @param {string} authorization 
     * @param {Region} [region] 
     * @param {boolean} [local] 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV1ApiInterface
     */
    createPublicLobbyDeprecatedRaw(requestParameters: CreatePublicLobbyDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>>;

    /**
     */
    createPublicLobbyDeprecated(appId: string, authorization: string, region?: Region, local?: boolean, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string>;

    /**
     * 
     * @param {string} appId 
     * @param {string} authorization 
     * @param {boolean} [local] 
     * @param {Region} [region] 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof LobbyV1ApiInterface
     */
    listActivePublicLobbiesDeprecatedRaw(requestParameters: ListActivePublicLobbiesDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<Lobby>>>;

    /**
     */
    listActivePublicLobbiesDeprecated(appId: string, authorization: string, local?: boolean, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<Lobby>>;

}

/**
 * 
 */
export class LobbyV1Api extends runtime.BaseAPI implements LobbyV1ApiInterface {

    /**
     */
    async createPrivateLobbyDeprecatedRaw(requestParameters: CreatePrivateLobbyDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling createPrivateLobbyDeprecated.');
        }

        if (requestParameters.authorization === null || requestParameters.authorization === undefined) {
            throw new runtime.RequiredError('authorization','Required parameter requestParameters.authorization was null or undefined when calling createPrivateLobbyDeprecated.');
        }

        const queryParameters: any = {};

        if (requestParameters.region !== undefined) {
            queryParameters['region'] = requestParameters.region;
        }

        if (requestParameters.local !== undefined) {
            queryParameters['local'] = requestParameters.local;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (requestParameters.authorization !== undefined && requestParameters.authorization !== null) {
            headerParameters['Authorization'] = String(requestParameters.authorization);
        }

        const response = await this.request({
            path: `/lobby/v1/{appId}/create/private`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        if (this.isJsonMime(response.headers.get('content-type'))) {
            return new runtime.JSONApiResponse<string>(response);
        } else {
            return new runtime.TextApiResponse(response) as any;
        }
    }

    /**
     */
    async createPrivateLobbyDeprecated(appId: string, authorization: string, region?: Region, local?: boolean, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string> {
        const response = await this.createPrivateLobbyDeprecatedRaw({ appId: appId, authorization: authorization, region: region, local: local }, initOverrides);
        return await response.value();
    }

    /**
     */
    async createPublicLobbyDeprecatedRaw(requestParameters: CreatePublicLobbyDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling createPublicLobbyDeprecated.');
        }

        if (requestParameters.authorization === null || requestParameters.authorization === undefined) {
            throw new runtime.RequiredError('authorization','Required parameter requestParameters.authorization was null or undefined when calling createPublicLobbyDeprecated.');
        }

        const queryParameters: any = {};

        if (requestParameters.region !== undefined) {
            queryParameters['region'] = requestParameters.region;
        }

        if (requestParameters.local !== undefined) {
            queryParameters['local'] = requestParameters.local;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (requestParameters.authorization !== undefined && requestParameters.authorization !== null) {
            headerParameters['Authorization'] = String(requestParameters.authorization);
        }

        const response = await this.request({
            path: `/lobby/v1/{appId}/create/public`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        if (this.isJsonMime(response.headers.get('content-type'))) {
            return new runtime.JSONApiResponse<string>(response);
        } else {
            return new runtime.TextApiResponse(response) as any;
        }
    }

    /**
     */
    async createPublicLobbyDeprecated(appId: string, authorization: string, region?: Region, local?: boolean, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string> {
        const response = await this.createPublicLobbyDeprecatedRaw({ appId: appId, authorization: authorization, region: region, local: local }, initOverrides);
        return await response.value();
    }

    /**
     */
    async listActivePublicLobbiesDeprecatedRaw(requestParameters: ListActivePublicLobbiesDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<Lobby>>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling listActivePublicLobbiesDeprecated.');
        }

        if (requestParameters.authorization === null || requestParameters.authorization === undefined) {
            throw new runtime.RequiredError('authorization','Required parameter requestParameters.authorization was null or undefined when calling listActivePublicLobbiesDeprecated.');
        }

        const queryParameters: any = {};

        if (requestParameters.local !== undefined) {
            queryParameters['local'] = requestParameters.local;
        }

        if (requestParameters.region !== undefined) {
            queryParameters['region'] = requestParameters.region;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (requestParameters.authorization !== undefined && requestParameters.authorization !== null) {
            headerParameters['Authorization'] = String(requestParameters.authorization);
        }

        const response = await this.request({
            path: `/lobby/v1/{appId}/list`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(LobbyFromJSON));
    }

    /**
     */
    async listActivePublicLobbiesDeprecated(appId: string, authorization: string, local?: boolean, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<Lobby>> {
        const response = await this.listActivePublicLobbiesDeprecatedRaw({ appId: appId, authorization: authorization, local: local, region: region }, initOverrides);
        return await response.value();
    }

}
