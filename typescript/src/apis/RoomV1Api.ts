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
  ConnectionInfo,
  CreateRoomRequest,
  PickRoomExcludeKeyofRoomAllocations,
  Room,
} from '../models/index';
import {
    ConnectionInfoFromJSON,
    ConnectionInfoToJSON,
    CreateRoomRequestFromJSON,
    CreateRoomRequestToJSON,
    PickRoomExcludeKeyofRoomAllocationsFromJSON,
    PickRoomExcludeKeyofRoomAllocationsToJSON,
    RoomFromJSON,
    RoomToJSON,
} from '../models/index';

export interface CreateRoomDeprecatedRequest {
    appId: string;
    createRoomRequest: CreateRoomRequest;
    roomId?: string;
}

export interface DestroyRoomDeprecatedRequest {
    appId: string;
    roomId: string;
}

export interface GetActiveRoomsForProcessDeprecatedRequest {
    appId: string;
    processId: string;
}

export interface GetConnectionInfoDeprecatedRequest {
    appId: string;
    roomId: string;
}

export interface GetInactiveRoomsForProcessDeprecatedRequest {
    appId: string;
    processId: string;
}

export interface GetRoomInfoDeprecatedRequest {
    appId: string;
    roomId: string;
}

export interface SuspendRoomDeprecatedRequest {
    appId: string;
    roomId: string;
}

/**
 * RoomV1Api - interface
 * 
 * @export
 * @interface RoomV1ApiInterface
 */
export interface RoomV1ApiInterface {
    /**
     * 
     * @param {string} appId 
     * @param {CreateRoomRequest} createRoomRequest 
     * @param {string} [roomId] 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    createRoomDeprecatedRaw(requestParameters: CreateRoomDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>>;

    /**
     */
    createRoomDeprecated(appId: string, createRoomRequest: CreateRoomRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string>;

    /**
     * 
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    destroyRoomDeprecatedRaw(requestParameters: DestroyRoomDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>>;

    /**
     */
    destroyRoomDeprecated(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void>;

    /**
     * 
     * @param {string} appId 
     * @param {string} processId 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    getActiveRoomsForProcessDeprecatedRaw(requestParameters: GetActiveRoomsForProcessDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PickRoomExcludeKeyofRoomAllocations>>>;

    /**
     */
    getActiveRoomsForProcessDeprecated(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PickRoomExcludeKeyofRoomAllocations>>;

    /**
     * 
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    getConnectionInfoDeprecatedRaw(requestParameters: GetConnectionInfoDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ConnectionInfo>>;

    /**
     */
    getConnectionInfoDeprecated(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ConnectionInfo>;

    /**
     * 
     * @param {string} appId 
     * @param {string} processId 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    getInactiveRoomsForProcessDeprecatedRaw(requestParameters: GetInactiveRoomsForProcessDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PickRoomExcludeKeyofRoomAllocations>>>;

    /**
     */
    getInactiveRoomsForProcessDeprecated(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PickRoomExcludeKeyofRoomAllocations>>;

    /**
     * 
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    getRoomInfoDeprecatedRaw(requestParameters: GetRoomInfoDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Room>>;

    /**
     */
    getRoomInfoDeprecated(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Room>;

    /**
     * 
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @deprecated
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    suspendRoomDeprecatedRaw(requestParameters: SuspendRoomDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>>;

    /**
     */
    suspendRoomDeprecated(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void>;

}

/**
 * 
 */
export class RoomV1Api extends runtime.BaseAPI implements RoomV1ApiInterface {

    /**
     */
    async createRoomDeprecatedRaw(requestParameters: CreateRoomDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling createRoomDeprecated.');
        }

        if (requestParameters.createRoomRequest === null || requestParameters.createRoomRequest === undefined) {
            throw new runtime.RequiredError('createRoomRequest','Required parameter requestParameters.createRoomRequest was null or undefined when calling createRoomDeprecated.');
        }

        const queryParameters: any = {};

        if (requestParameters.roomId !== undefined) {
            queryParameters['roomId'] = requestParameters.roomId;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("auth0", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/rooms/v1/{appId}/create`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreateRoomRequestToJSON(requestParameters.createRoomRequest),
        }, initOverrides);

        if (this.isJsonMime(response.headers.get('content-type'))) {
            return new runtime.JSONApiResponse<string>(response);
        } else {
            return new runtime.TextApiResponse(response) as any;
        }
    }

    /**
     */
    async createRoomDeprecated(appId: string, createRoomRequest: CreateRoomRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string> {
        const response = await this.createRoomDeprecatedRaw({ appId: appId, createRoomRequest: createRoomRequest, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async destroyRoomDeprecatedRaw(requestParameters: DestroyRoomDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling destroyRoomDeprecated.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling destroyRoomDeprecated.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("auth0", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/rooms/v1/{appId}/destroy/{roomId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"roomId"}}`, encodeURIComponent(String(requestParameters.roomId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     */
    async destroyRoomDeprecated(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.destroyRoomDeprecatedRaw({ appId: appId, roomId: roomId }, initOverrides);
    }

    /**
     */
    async getActiveRoomsForProcessDeprecatedRaw(requestParameters: GetActiveRoomsForProcessDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PickRoomExcludeKeyofRoomAllocations>>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getActiveRoomsForProcessDeprecated.');
        }

        if (requestParameters.processId === null || requestParameters.processId === undefined) {
            throw new runtime.RequiredError('processId','Required parameter requestParameters.processId was null or undefined when calling getActiveRoomsForProcessDeprecated.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("auth0", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/rooms/v1/{appId}/list/{processId}/active`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"processId"}}`, encodeURIComponent(String(requestParameters.processId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(PickRoomExcludeKeyofRoomAllocationsFromJSON));
    }

    /**
     */
    async getActiveRoomsForProcessDeprecated(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PickRoomExcludeKeyofRoomAllocations>> {
        const response = await this.getActiveRoomsForProcessDeprecatedRaw({ appId: appId, processId: processId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async getConnectionInfoDeprecatedRaw(requestParameters: GetConnectionInfoDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ConnectionInfo>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getConnectionInfoDeprecated.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling getConnectionInfoDeprecated.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/rooms/v1/{appId}/connectioninfo/{roomId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"roomId"}}`, encodeURIComponent(String(requestParameters.roomId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ConnectionInfoFromJSON(jsonValue));
    }

    /**
     */
    async getConnectionInfoDeprecated(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ConnectionInfo> {
        const response = await this.getConnectionInfoDeprecatedRaw({ appId: appId, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async getInactiveRoomsForProcessDeprecatedRaw(requestParameters: GetInactiveRoomsForProcessDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PickRoomExcludeKeyofRoomAllocations>>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getInactiveRoomsForProcessDeprecated.');
        }

        if (requestParameters.processId === null || requestParameters.processId === undefined) {
            throw new runtime.RequiredError('processId','Required parameter requestParameters.processId was null or undefined when calling getInactiveRoomsForProcessDeprecated.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("auth0", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/rooms/v1/{appId}/list/{processId}/inactive`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"processId"}}`, encodeURIComponent(String(requestParameters.processId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(PickRoomExcludeKeyofRoomAllocationsFromJSON));
    }

    /**
     */
    async getInactiveRoomsForProcessDeprecated(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PickRoomExcludeKeyofRoomAllocations>> {
        const response = await this.getInactiveRoomsForProcessDeprecatedRaw({ appId: appId, processId: processId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async getRoomInfoDeprecatedRaw(requestParameters: GetRoomInfoDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Room>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getRoomInfoDeprecated.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling getRoomInfoDeprecated.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("auth0", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/rooms/v1/{appId}/info/{roomId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"roomId"}}`, encodeURIComponent(String(requestParameters.roomId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => RoomFromJSON(jsonValue));
    }

    /**
     */
    async getRoomInfoDeprecated(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Room> {
        const response = await this.getRoomInfoDeprecatedRaw({ appId: appId, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async suspendRoomDeprecatedRaw(requestParameters: SuspendRoomDeprecatedRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling suspendRoomDeprecated.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling suspendRoomDeprecated.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("auth0", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/rooms/v1/{appId}/suspend/{roomId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"roomId"}}`, encodeURIComponent(String(requestParameters.roomId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     */
    async suspendRoomDeprecated(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.suspendRoomDeprecatedRaw({ appId: appId, roomId: roomId }, initOverrides);
    }

}
