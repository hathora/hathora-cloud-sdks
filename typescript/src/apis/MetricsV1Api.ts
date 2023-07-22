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
  MetricName,
  RecordPartialMetricNameMetricValueArray,
} from '../models';
import {
    MetricNameFromJSON,
    MetricNameToJSON,
    RecordPartialMetricNameMetricValueArrayFromJSON,
    RecordPartialMetricNameMetricValueArrayToJSON,
} from '../models';

export interface GetMetricsRequest {
    appId: string;
    processId: string;
    metrics?: Array<MetricName>;
    end?: number;
    start?: number;
    step?: number;
}

/**
 * MetricsV1Api - interface
 * 
 * @export
 * @interface MetricsV1ApiInterface
 */
export interface MetricsV1ApiInterface {
    /**
     * Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     * @param {string} appId 
     * @param {string} processId 
     * @param {Array<MetricName>} [metrics] Available metrics to query over time.
     * @param {number} [end] Unix timestamp. Default is current time.
     * @param {number} [start] Unix timestamp. Default is -1 hour from &#x60;end&#x60;.
     * @param {number} [step] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MetricsV1ApiInterface
     */
    getMetricsRaw(requestParameters: GetMetricsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<RecordPartialMetricNameMetricValueArray>>;

    /**
     * Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     */
    getMetrics(appId: string, processId: string, metrics?: Array<MetricName>, end?: number, start?: number, step?: number, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<RecordPartialMetricNameMetricValueArray>;

}

/**
 * 
 */
export class MetricsV1Api extends runtime.BaseAPI implements MetricsV1ApiInterface {

    /**
     * Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     */
    async getMetricsRaw(requestParameters: GetMetricsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<RecordPartialMetricNameMetricValueArray>> {
        if (requestParameters.appId === null || requestParameters.appId === undefined) {
            throw new runtime.RequiredError('appId','Required parameter requestParameters.appId was null or undefined when calling getMetrics.');
        }

        if (requestParameters.processId === null || requestParameters.processId === undefined) {
            throw new runtime.RequiredError('processId','Required parameter requestParameters.processId was null or undefined when calling getMetrics.');
        }

        const queryParameters: any = {};

        if (requestParameters.metrics) {
            queryParameters['metrics'] = requestParameters.metrics;
        }

        if (requestParameters.end !== undefined) {
            queryParameters['end'] = requestParameters.end;
        }

        if (requestParameters.start !== undefined) {
            queryParameters['start'] = requestParameters.start;
        }

        if (requestParameters.step !== undefined) {
            queryParameters['step'] = requestParameters.step;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("auth0", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/metrics/v1/{appId}/process/{processId}`.replace(`{${"appId"}}`, encodeURIComponent(String(requestParameters.appId))).replace(`{${"processId"}}`, encodeURIComponent(String(requestParameters.processId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => RecordPartialMetricNameMetricValueArrayFromJSON(jsonValue));
    }

    /**
     * Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     */
    async getMetrics(appId: string, processId: string, metrics?: Array<MetricName>, end?: number, start?: number, step?: number, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<RecordPartialMetricNameMetricValueArray> {
        const response = await this.getMetricsRaw({ appId: appId, processId: processId, metrics: metrics, end: end, start: start, step: step }, initOverrides);
        return await response.value();
    }

}
