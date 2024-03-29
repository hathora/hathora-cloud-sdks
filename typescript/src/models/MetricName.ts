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


/**
 * Available metrics to query over time.
 * @export
 */
export const MetricName = {
    Cpu: 'cpu',
    Memory: 'memory',
    RateEgress: 'rate_egress',
    TotalEgress: 'total_egress',
    ActiveConnections: 'active_connections'
} as const;
export type MetricName = typeof MetricName[keyof typeof MetricName];


export function MetricNameFromJSON(json: any): MetricName {
    return MetricNameFromJSONTyped(json, false);
}

export function MetricNameFromJSONTyped(json: any, ignoreDiscriminator: boolean): MetricName {
    return json as MetricName;
}

export function MetricNameToJSON(value?: MetricName | null): any {
    return value as any;
}

