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
  LoginGoogleRequest,
  LoginNicknameRequest,
  LoginResponse,
} from '../models';
import {
    LoginGoogleRequestFromJSON,
    LoginGoogleRequestToJSON,
    LoginNicknameRequestFromJSON,
    LoginNicknameRequestToJSON,
    LoginResponseFromJSON,
    LoginResponseToJSON,
} from '../models';

export interface LoginAnonymousRequest {
    appId: string;
}

export interface LoginGoogleOperationRequest {
    appId: string;
    loginGoogleRequest: LoginGoogleRequest;
}

export interface LoginNicknameOperationRequest {
    appId: string;
    loginNicknameRequest: LoginNicknameRequest;
}

/**
 * AuthV1Api - interface
 * 
 * @export
 * @interface AuthV1ApiInterface
 */
export interface AuthV1ApiInterface {
    /**
     * 
     * @param {string} appId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthV1ApiInterface
     */
    loginAnonymousRaw(requestParameters: LoginAnonymousRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LoginResponse>>;

    /**
     */
    loginAnonymous(appId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LoginResponse>;

    /**
     * 
     * @param {string} appId 
     * @param {LoginGoogleRequest} loginGoogleRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthV1ApiInterface
     */
    loginGoogleRaw(requestParameters: LoginGoogleOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LoginResponse>>;

    /**
     */
    loginGoogle(appId: string, loginGoogleRequest: LoginGoogleRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LoginResponse>;

    /**
     * 
     * @param {string} appId 
     * @param {LoginNicknameRequest} loginNicknameRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthV1ApiInterface
     */
    loginNicknameRaw(requestParameters: LoginNicknameOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LoginResponse>>;

    /**
     */
    loginNickname(appId: string, loginNicknameRequest: LoginNicknameRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LoginResponse>;

}

/**
 * 
 */
export class AuthV1Api extends runtime.BaseAPI implements AuthV1ApiInterface {

    /**
     */
    async loginAnonymousRaw(requestParameters: LoginAnonymousRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LoginResponse>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling loginAnonymous.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/auth/v1/{appId}/login/anonymous`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LoginResponseFromJSON(jsonValue));
    }

    /**
     */
    async loginAnonymous(appId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LoginResponse> {
        const response = await this.loginAnonymousRaw({ appId: appId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async loginGoogleRaw(requestParameters: LoginGoogleOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LoginResponse>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling loginGoogle.');
        }

        if (requestParameters.loginGoogleRequest === null || requestParameters.loginGoogleRequest === undefined) {
            throw new runtime.RequiredError('loginGoogleRequest','Required parameter requestParameters.loginGoogleRequest was null or undefined when calling loginGoogle.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/auth/v1/{appId}/login/google`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: LoginGoogleRequestToJSON(requestParameters.loginGoogleRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LoginResponseFromJSON(jsonValue));
    }

    /**
     */
    async loginGoogle(appId: string, loginGoogleRequest: LoginGoogleRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LoginResponse> {
        const response = await this.loginGoogleRaw({ appId: appId, loginGoogleRequest: loginGoogleRequest }, initOverrides);
        return await response.value();
    }

    /**
     */
    async loginNicknameRaw(requestParameters: LoginNicknameOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LoginResponse>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling loginNickname.');
        }

        if (requestParameters.loginNicknameRequest === null || requestParameters.loginNicknameRequest === undefined) {
            throw new runtime.RequiredError('loginNicknameRequest','Required parameter requestParameters.loginNicknameRequest was null or undefined when calling loginNickname.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/auth/v1/{appId}/login/nickname`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: LoginNicknameRequestToJSON(requestParameters.loginNicknameRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LoginResponseFromJSON(jsonValue));
    }

    /**
     */
    async loginNickname(appId: string, loginNicknameRequest: LoginNicknameRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LoginResponse> {
        const response = await this.loginNicknameRaw({ appId: appId, loginNicknameRequest: loginNicknameRequest }, initOverrides);
        return await response.value();
    }

}