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

import { exists, mapValues } from '../runtime';
import type { MetricValue } from './MetricValue';
import {
    MetricValueFromJSON,
    MetricValueFromJSONTyped,
    MetricValueToJSON,
} from './MetricValue';

/**
 * Construct a type with a set of properties K of type T
 * @export
 * @interface RecordPartialMetricNameMetricValueArray
 */
export interface RecordPartialMetricNameMetricValueArray {
    /**
     * 
     * @type {Array<MetricValue>}
     * @memberof RecordPartialMetricNameMetricValueArray
     */
    cpu?: Array<MetricValue>;
    /**
     * 
     * @type {Array<MetricValue>}
     * @memberof RecordPartialMetricNameMetricValueArray
     */
    memory?: Array<MetricValue>;
    /**
     * 
     * @type {Array<MetricValue>}
     * @memberof RecordPartialMetricNameMetricValueArray
     */
    rateEgress?: Array<MetricValue>;
    /**
     * 
     * @type {Array<MetricValue>}
     * @memberof RecordPartialMetricNameMetricValueArray
     */
    totalEgress?: Array<MetricValue>;
}

/**
 * Check if a given object implements the RecordPartialMetricNameMetricValueArray interface.
 */
export function instanceOfRecordPartialMetricNameMetricValueArray(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function RecordPartialMetricNameMetricValueArrayFromJSON(json: any): RecordPartialMetricNameMetricValueArray {
    return RecordPartialMetricNameMetricValueArrayFromJSONTyped(json, false);
}

export function RecordPartialMetricNameMetricValueArrayFromJSONTyped(json: any, ignoreDiscriminator: boolean): RecordPartialMetricNameMetricValueArray {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'cpu': !exists(json, 'cpu') ? undefined : ((json['cpu'] as Array<any>).map(MetricValueFromJSON)),
        'memory': !exists(json, 'memory') ? undefined : ((json['memory'] as Array<any>).map(MetricValueFromJSON)),
        'rateEgress': !exists(json, 'rate_egress') ? undefined : ((json['rate_egress'] as Array<any>).map(MetricValueFromJSON)),
        'totalEgress': !exists(json, 'total_egress') ? undefined : ((json['total_egress'] as Array<any>).map(MetricValueFromJSON)),
    };
}

export function RecordPartialMetricNameMetricValueArrayToJSON(value?: RecordPartialMetricNameMetricValueArray | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'cpu': value.cpu === undefined ? undefined : ((value.cpu as Array<any>).map(MetricValueToJSON)),
        'memory': value.memory === undefined ? undefined : ((value.memory as Array<any>).map(MetricValueToJSON)),
        'rate_egress': value.rateEgress === undefined ? undefined : ((value.rateEgress as Array<any>).map(MetricValueToJSON)),
        'total_egress': value.totalEgress === undefined ? undefined : ((value.totalEgress as Array<any>).map(MetricValueToJSON)),
    };
}

