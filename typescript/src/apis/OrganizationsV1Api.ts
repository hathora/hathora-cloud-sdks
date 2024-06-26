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
  CreateUserInvite,
  OrgInvitesPage,
  OrgPermission,
  RescindUserInvite,
} from '../models';
import {
    ApiErrorFromJSON,
    ApiErrorToJSON,
    CreateUserInviteFromJSON,
    CreateUserInviteToJSON,
    OrgInvitesPageFromJSON,
    OrgInvitesPageToJSON,
    OrgPermissionFromJSON,
    OrgPermissionToJSON,
    RescindUserInviteFromJSON,
    RescindUserInviteToJSON,
} from '../models';

export interface AcceptInviteRequest {
    orgId: string;
}

export interface GetOrgPendingInvitesRequest {
    orgId: string;
}

export interface InviteUserRequest {
    orgId: string;
    createUserInvite: CreateUserInvite;
}

export interface RejectInviteRequest {
    orgId: string;
}

export interface RescindInviteRequest {
    orgId: string;
    rescindUserInvite: RescindUserInvite;
}

/**
 * OrganizationsV1Api - interface
 * 
 * @export
 * @interface OrganizationsV1ApiInterface
 */
export interface OrganizationsV1ApiInterface {
    /**
     * 
     * @param {string} orgId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OrganizationsV1ApiInterface
     */
    acceptInviteRaw(requestParameters: AcceptInviteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>>;

    /**
     */
    acceptInvite(orgId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void>;

    /**
     * 
     * @param {string} orgId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OrganizationsV1ApiInterface
     */
    getOrgPendingInvitesRaw(requestParameters: GetOrgPendingInvitesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<OrgInvitesPage>>;

    /**
     */
    getOrgPendingInvites(orgId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<OrgInvitesPage>;

    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OrganizationsV1ApiInterface
     */
    getUserPendingInvitesRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<OrgInvitesPage>>;

    /**
     */
    getUserPendingInvites(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<OrgInvitesPage>;

    /**
     * 
     * @param {string} orgId 
     * @param {CreateUserInvite} createUserInvite 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OrganizationsV1ApiInterface
     */
    inviteUserRaw(requestParameters: InviteUserRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<OrgPermission>>;

    /**
     */
    inviteUser(orgId: string, createUserInvite: CreateUserInvite, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<OrgPermission>;

    /**
     * 
     * @param {string} orgId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OrganizationsV1ApiInterface
     */
    rejectInviteRaw(requestParameters: RejectInviteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>>;

    /**
     */
    rejectInvite(orgId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void>;

    /**
     * 
     * @param {string} orgId 
     * @param {RescindUserInvite} rescindUserInvite 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OrganizationsV1ApiInterface
     */
    rescindInviteRaw(requestParameters: RescindInviteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>>;

    /**
     */
    rescindInvite(orgId: string, rescindUserInvite: RescindUserInvite, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void>;

}

/**
 * 
 */
export class OrganizationsV1Api extends runtime.BaseAPI implements OrganizationsV1ApiInterface {

    /**
     */
    async acceptInviteRaw(requestParameters: AcceptInviteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.orgId === null || requestParameters.orgId === undefined) {
            throw new runtime.RequiredError('orgId','Required parameter requestParameters.orgId was null or undefined when calling acceptInvite.');
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
            path: `/orgs/v1/{orgId}/invites/accept`.replace(`{${"orgId"}}`, encodeURIComponent(String(requestParameters.orgId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     */
    async acceptInvite(orgId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.acceptInviteRaw({ orgId: orgId }, initOverrides);
    }

    /**
     */
    async getOrgPendingInvitesRaw(requestParameters: GetOrgPendingInvitesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<OrgInvitesPage>> {
        if (requestParameters.orgId === null || requestParameters.orgId === undefined) {
            throw new runtime.RequiredError('orgId','Required parameter requestParameters.orgId was null or undefined when calling getOrgPendingInvites.');
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
            path: `/orgs/v1/{orgId}/invites/pending`.replace(`{${"orgId"}}`, encodeURIComponent(String(requestParameters.orgId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => OrgInvitesPageFromJSON(jsonValue));
    }

    /**
     */
    async getOrgPendingInvites(orgId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<OrgInvitesPage> {
        const response = await this.getOrgPendingInvitesRaw({ orgId: orgId }, initOverrides);
        return await response.value();
    }

    /**
     */
    async getUserPendingInvitesRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<OrgInvitesPage>> {
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
            path: `/orgs/v1/user/invites/pending`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => OrgInvitesPageFromJSON(jsonValue));
    }

    /**
     */
    async getUserPendingInvites(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<OrgInvitesPage> {
        const response = await this.getUserPendingInvitesRaw(initOverrides);
        return await response.value();
    }

    /**
     */
    async inviteUserRaw(requestParameters: InviteUserRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<OrgPermission>> {
        if (requestParameters.orgId === null || requestParameters.orgId === undefined) {
            throw new runtime.RequiredError('orgId','Required parameter requestParameters.orgId was null or undefined when calling inviteUser.');
        }

        if (requestParameters.createUserInvite === null || requestParameters.createUserInvite === undefined) {
            throw new runtime.RequiredError('createUserInvite','Required parameter requestParameters.createUserInvite was null or undefined when calling inviteUser.');
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
            path: `/orgs/v1/{orgId}/invites`.replace(`{${"orgId"}}`, encodeURIComponent(String(requestParameters.orgId))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: CreateUserInviteToJSON(requestParameters.createUserInvite),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => OrgPermissionFromJSON(jsonValue));
    }

    /**
     */
    async inviteUser(orgId: string, createUserInvite: CreateUserInvite, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<OrgPermission> {
        const response = await this.inviteUserRaw({ orgId: orgId, createUserInvite: createUserInvite }, initOverrides);
        return await response.value();
    }

    /**
     */
    async rejectInviteRaw(requestParameters: RejectInviteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.orgId === null || requestParameters.orgId === undefined) {
            throw new runtime.RequiredError('orgId','Required parameter requestParameters.orgId was null or undefined when calling rejectInvite.');
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
            path: `/orgs/v1/{orgId}/invites/reject`.replace(`{${"orgId"}}`, encodeURIComponent(String(requestParameters.orgId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     */
    async rejectInvite(orgId: string, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.rejectInviteRaw({ orgId: orgId }, initOverrides);
    }

    /**
     */
    async rescindInviteRaw(requestParameters: RescindInviteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.orgId === null || requestParameters.orgId === undefined) {
            throw new runtime.RequiredError('orgId','Required parameter requestParameters.orgId was null or undefined when calling rescindInvite.');
        }

        if (requestParameters.rescindUserInvite === null || requestParameters.rescindUserInvite === undefined) {
            throw new runtime.RequiredError('rescindUserInvite','Required parameter requestParameters.rescindUserInvite was null or undefined when calling rescindInvite.');
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
            path: `/orgs/v1/{orgId}/invites/rescind`.replace(`{${"orgId"}}`, encodeURIComponent(String(requestParameters.orgId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: RescindUserInviteToJSON(requestParameters.rescindUserInvite),
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     */
    async rescindInvite(orgId: string, rescindUserInvite: RescindUserInvite, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.rescindInviteRaw({ orgId: orgId, rescindUserInvite: rescindUserInvite }, initOverrides);
    }

}
