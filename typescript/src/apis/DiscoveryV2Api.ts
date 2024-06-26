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
  PingEndpointsInner,
} from '../models';
import {
    PingEndpointsInnerFromJSON,
    PingEndpointsInnerToJSON,
} from '../models';

/**
 * DiscoveryV2Api - interface
 * 
 * @export
 * @interface DiscoveryV2ApiInterface
 */
export interface DiscoveryV2ApiInterface {
    /**
     * Returns an array of all regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DiscoveryV2ApiInterface
     */
    getPingServiceEndpointsRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PingEndpointsInner>>>;

    /**
     * Returns an array of all regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.
     */
    getPingServiceEndpoints(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PingEndpointsInner>>;

}

/**
 * 
 */
export class DiscoveryV2Api extends runtime.BaseAPI implements DiscoveryV2ApiInterface {

    /**
     * Returns an array of all regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.
     */
    async getPingServiceEndpointsRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PingEndpointsInner>>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/discovery/v2/ping`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(PingEndpointsInnerFromJSON));
    }

    /**
     * Returns an array of all regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.
     */
    async getPingServiceEndpoints(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PingEndpointsInner>> {
        const response = await this.getPingServiceEndpointsRaw(initOverrides);
        return await response.value();
    }

}
