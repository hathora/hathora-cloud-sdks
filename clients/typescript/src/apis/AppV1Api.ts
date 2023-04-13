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
  Application,
  ApplicationWithDeployment,
  CreateAppRequest,
} from '../models';
import {
    ApplicationFromJSON,
    ApplicationToJSON,
    ApplicationWithDeploymentFromJSON,
    ApplicationWithDeploymentToJSON,
    CreateAppRequestFromJSON,
    CreateAppRequestToJSON,
} from '../models';

export interface CreateAppOperationRequest {
    createAppRequest: CreateAppRequest;
}

export interface DeleteAppRequest {
    appId: string;
}

export interface GetAppInfoRequest {
    appId: string;
}

export interface UpdateAppRequest {
    appId: string;
    createAppRequest: CreateAppRequest;
}

/**
 * AppV1Api - interface
 * 
 * @export
 * @interface AppV1ApiInterface
 */
export interface AppV1ApiInterface {
    /**
     * 
     * @param {CreateAppRequest} createAppRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AppV1ApiInterface
     */
    createAppRaw(requestParameters: CreateAppOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Application>>;

    /**
     */
    createApp(requestParameters: CreateAppOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Application>;

    /**
     * 
     * @param {string} appId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AppV1ApiInterface
     */
    deleteAppRaw(requestParameters: DeleteAppRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>>;

    /**
     */
    deleteApp(requestParameters: DeleteAppRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void>;

    /**
     * 
     * @param {string} appId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AppV1ApiInterface
     */
    getAppInfoRaw(requestParameters: GetAppInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Application>>;

    /**
     */
    getAppInfo(requestParameters: GetAppInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Application>;

    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AppV1ApiInterface
     */
    getAppsRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<ApplicationWithDeployment>>>;

    /**
     */
    getApps(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<ApplicationWithDeployment>>;

    /**
     * 
     * @param {string} appId 
     * @param {CreateAppRequest} createAppRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AppV1ApiInterface
     */
    updateAppRaw(requestParameters: UpdateAppRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Application>>;

    /**
     */
    updateApp(requestParameters: UpdateAppRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Application>;

}

/**
 * 
 */
export class AppV1Api extends runtime.BaseAPI implements AppV1ApiInterface {

    /**
     */
    async createAppRaw(requestParameters: CreateAppOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Application>> {
        if (requestParameters.createAppRequest === null || requestParameters.createAppRequest === undefined) {
            throw new runtime.RequiredError('createAppRequest','Required parameter requestParameters.createAppRequest was null or undefined when calling createApp.');
        }

        const queryParameters: any = {};

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
            path: `/apps/v1/create`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreateAppRequestToJSON(requestParameters.createAppRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ApplicationFromJSON(jsonValue));
    }

    /**
     */
    async createApp(requestParameters: CreateAppOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Application> {
        const response = await this.createAppRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async deleteAppRaw(requestParameters: DeleteAppRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling deleteApp.');
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
            path: `/apps/v1/delete/{appId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     */
    async deleteApp(requestParameters: DeleteAppRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.deleteAppRaw(requestParameters, initOverrides);
    }

    /**
     */
    async getAppInfoRaw(requestParameters: GetAppInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Application>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getAppInfo.');
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
            path: `/apps/v1/info/{appId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ApplicationFromJSON(jsonValue));
    }

    /**
     */
    async getAppInfo(requestParameters: GetAppInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Application> {
        const response = await this.getAppInfoRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async getAppsRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<ApplicationWithDeployment>>> {
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
            path: `/apps/v1/list`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(ApplicationWithDeploymentFromJSON));
    }

    /**
     */
    async getApps(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<ApplicationWithDeployment>> {
        const response = await this.getAppsRaw(initOverrides);
        return await response.value();
    }

    /**
     */
    async updateAppRaw(requestParameters: UpdateAppRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Application>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling updateApp.');
        }

        if (requestParameters.createAppRequest === null || requestParameters.createAppRequest === undefined) {
            throw new runtime.RequiredError('createAppRequest','Required parameter requestParameters.createAppRequest was null or undefined when calling updateApp.');
        }

        const queryParameters: any = {};

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
            path: `/apps/v1/update/{appId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreateAppRequestToJSON(requestParameters.createAppRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ApplicationFromJSON(jsonValue));
    }

    /**
     */
    async updateApp(requestParameters: UpdateAppRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Application> {
        const response = await this.updateAppRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
