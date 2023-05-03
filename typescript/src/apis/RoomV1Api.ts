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
  ConnectionInfo,
  CreateRoomRequest,
  PickRoomExcludeKeyofRoomAllocations,
  Room,
} from '../models';
import {
    ConnectionInfoFromJSON,
    ConnectionInfoToJSON,
    CreateRoomRequestFromJSON,
    CreateRoomRequestToJSON,
    PickRoomExcludeKeyofRoomAllocationsFromJSON,
    PickRoomExcludeKeyofRoomAllocationsToJSON,
    RoomFromJSON,
    RoomToJSON,
} from '../models';

export interface CreateRoomOperationRequest {
    appId: string;
    createRoomRequest: CreateRoomRequest;
    roomId?: string;
}

export interface DestroyRoomRequest {
    appId: string;
    roomId: string;
}

export interface GetActiveRoomsForProcessRequest {
    appId: string;
    processId: string;
}

export interface GetConnectionInfoRequest {
    appId: string;
    roomId: string;
}

export interface GetInactiveRoomsForProcessRequest {
    appId: string;
    processId: string;
}

export interface GetRoomInfoRequest {
    appId: string;
    roomId: string;
}

export interface SuspendRoomRequest {
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
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    createRoomRaw(requestParameters: CreateRoomOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>>;

    /**
     */
    createRoom(appId: string, createRoomRequest: CreateRoomRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string>;

    /**
     * 
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    destroyRoomRaw(requestParameters: DestroyRoomRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>>;

    /**
     */
    destroyRoom(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void>;

    /**
     * 
     * @param {string} appId 
     * @param {string} processId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    getActiveRoomsForProcessRaw(requestParameters: GetActiveRoomsForProcessRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PickRoomExcludeKeyofRoomAllocations>>>;

    /**
     */
    getActiveRoomsForProcess(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PickRoomExcludeKeyofRoomAllocations>>;

    /**
     * 
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    getConnectionInfoRaw(requestParameters: GetConnectionInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ConnectionInfo>>;

    /**
     */
    getConnectionInfo(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ConnectionInfo>;

    /**
     * 
     * @param {string} appId 
     * @param {string} processId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    getInactiveRoomsForProcessRaw(requestParameters: GetInactiveRoomsForProcessRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PickRoomExcludeKeyofRoomAllocations>>>;

    /**
     */
    getInactiveRoomsForProcess(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PickRoomExcludeKeyofRoomAllocations>>;

    /**
     * 
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    getRoomInfoRaw(requestParameters: GetRoomInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Room>>;

    /**
     */
    getRoomInfo(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Room>;

    /**
     * 
     * @param {string} appId 
     * @param {string} roomId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RoomV1ApiInterface
     */
    suspendRoomRaw(requestParameters: SuspendRoomRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>>;

    /**
     */
    suspendRoom(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void>;

}

/**
 * 
 */
export class RoomV1Api extends runtime.BaseAPI implements RoomV1ApiInterface {

    /**
     */
    async createRoomRaw(requestParameters: CreateRoomOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling createRoom.');
        }

        if (requestParameters.createRoomRequest === null || requestParameters.createRoomRequest === undefined) {
            throw new runtime.RequiredError('createRoomRequest','Required parameter requestParameters.createRoomRequest was null or undefined when calling createRoom.');
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
    async createRoom(appId: string, createRoomRequest: CreateRoomRequest, roomId?: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string> {
        const response = await this.createRoomRaw({ appId: appId, createRoomRequest: createRoomRequest, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async destroyRoomRaw(requestParameters: DestroyRoomRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling destroyRoom.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling destroyRoom.');
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
    async destroyRoom(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.destroyRoomRaw({ appId: appId, roomId: roomId }, initOverrides);
    }

    /**
     */
    async getActiveRoomsForProcessRaw(requestParameters: GetActiveRoomsForProcessRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PickRoomExcludeKeyofRoomAllocations>>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getActiveRoomsForProcess.');
        }

        if (requestParameters.processId === null || requestParameters.processId === undefined) {
            throw new runtime.RequiredError('processId','Required parameter requestParameters.processId was null or undefined when calling getActiveRoomsForProcess.');
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
    async getActiveRoomsForProcess(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PickRoomExcludeKeyofRoomAllocations>> {
        const response = await this.getActiveRoomsForProcessRaw({ appId: appId, processId: processId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async getConnectionInfoRaw(requestParameters: GetConnectionInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ConnectionInfo>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getConnectionInfo.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling getConnectionInfo.');
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
    async getConnectionInfo(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ConnectionInfo> {
        const response = await this.getConnectionInfoRaw({ appId: appId, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async getInactiveRoomsForProcessRaw(requestParameters: GetInactiveRoomsForProcessRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PickRoomExcludeKeyofRoomAllocations>>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getInactiveRoomsForProcess.');
        }

        if (requestParameters.processId === null || requestParameters.processId === undefined) {
            throw new runtime.RequiredError('processId','Required parameter requestParameters.processId was null or undefined when calling getInactiveRoomsForProcess.');
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
    async getInactiveRoomsForProcess(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PickRoomExcludeKeyofRoomAllocations>> {
        const response = await this.getInactiveRoomsForProcessRaw({ appId: appId, processId: processId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async getRoomInfoRaw(requestParameters: GetRoomInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Room>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getRoomInfo.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling getRoomInfo.');
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
    async getRoomInfo(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Room> {
        const response = await this.getRoomInfoRaw({ appId: appId, roomId: roomId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async suspendRoomRaw(requestParameters: SuspendRoomRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling suspendRoom.');
        }

        if (requestParameters.roomId === null || requestParameters.roomId === undefined) {
            throw new runtime.RequiredError('roomId','Required parameter requestParameters.roomId was null or undefined when calling suspendRoom.');
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
    async suspendRoom(appId: string, roomId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.suspendRoomRaw({ appId: appId, roomId: roomId }, initOverrides);
    }

}
