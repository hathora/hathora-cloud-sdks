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
  Process,
  ProcessWithRooms,
  Region,
} from '../models';
import {
    ProcessFromJSON,
    ProcessToJSON,
    ProcessWithRoomsFromJSON,
    ProcessWithRoomsToJSON,
    RegionFromJSON,
    RegionToJSON,
} from '../models';

export interface GetProcessInfoRequest {
    appId: string;
    processId: string;
}

export interface GetRunningProcessesRequest {
    appId: string;
    region?: Region;
}

export interface GetStoppedProcessesRequest {
    appId: string;
    region?: Region;
}

/**
 * ProcessesV1Api - interface
 * 
 * @export
 * @interface ProcessesV1ApiInterface
 */
export interface ProcessesV1ApiInterface {
    /**
     * Get details for an existing [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     * @param {string} appId 
     * @param {string} processId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProcessesV1ApiInterface
     */
    getProcessInfoRaw(requestParameters: GetProcessInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Process>>;

    /**
     * Get details for an existing [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     */
    getProcessInfo(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Process>;

    /**
     * Returns an array of active [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.
     * @param {string} appId 
     * @param {Region} [region] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProcessesV1ApiInterface
     */
    getRunningProcessesRaw(requestParameters: GetRunningProcessesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<ProcessWithRooms>>>;

    /**
     * Returns an array of active [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.
     */
    getRunningProcesses(appId: string, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<ProcessWithRooms>>;

    /**
     * Returns an array of stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.
     * @param {string} appId 
     * @param {Region} [region] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProcessesV1ApiInterface
     */
    getStoppedProcessesRaw(requestParameters: GetStoppedProcessesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<Process>>>;

    /**
     * Returns an array of stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.
     */
    getStoppedProcesses(appId: string, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<Process>>;

}

/**
 * 
 */
export class ProcessesV1Api extends runtime.BaseAPI implements ProcessesV1ApiInterface {

    /**
     * Get details for an existing [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     */
    async getProcessInfoRaw(requestParameters: GetProcessInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Process>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getProcessInfo.');
        }

        if (requestParameters.processId === null || requestParameters.processId === undefined) {
            throw new runtime.RequiredError('processId','Required parameter requestParameters.processId was null or undefined when calling getProcessInfo.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("hathoraDevToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/processes/v1/{appId}/info/{processId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"processId"}}`, encodeURIComponent(String(requestParameters.processId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ProcessFromJSON(jsonValue));
    }

    /**
     * Get details for an existing [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     */
    async getProcessInfo(appId: string, processId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Process> {
        const response = await this.getProcessInfoRaw({ appId: appId, processId: processId }, initOverrides);
        return await response.value();
    }

    /**
     * Returns an array of active [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.
     */
    async getRunningProcessesRaw(requestParameters: GetRunningProcessesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<ProcessWithRooms>>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getRunningProcesses.');
        }

        const queryParameters: any = {};

        if (requestParameters.region !== undefined) {
            queryParameters['region'] = requestParameters.region;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("hathoraDevToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/processes/v1/{appId}/list/running`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(ProcessWithRoomsFromJSON));
    }

    /**
     * Returns an array of active [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.
     */
    async getRunningProcesses(appId: string, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<ProcessWithRooms>> {
        const response = await this.getRunningProcessesRaw({ appId: appId, region: region }, initOverrides);
        return await response.value();
    }

    /**
     * Returns an array of stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.
     */
    async getStoppedProcessesRaw(requestParameters: GetStoppedProcessesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<Process>>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getStoppedProcesses.');
        }

        const queryParameters: any = {};

        if (requestParameters.region !== undefined) {
            queryParameters['region'] = requestParameters.region;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("hathoraDevToken", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/processes/v1/{appId}/list/stopped`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(ProcessFromJSON));
    }

    /**
     * Returns an array of stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.
     */
    async getStoppedProcesses(appId: string, region?: Region, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<Process>> {
        const response = await this.getStoppedProcessesRaw({ appId: appId, region: region }, initOverrides);
        return await response.value();
    }

}
