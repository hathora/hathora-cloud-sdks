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
 * 
 * @export
 */
export const ProcessStatus = {
    Starting: 'starting',
    Running: 'running',
    Draining: 'draining',
    Stopping: 'stopping',
    Stopped: 'stopped',
    Failed: 'failed'
} as const;
export type ProcessStatus = typeof ProcessStatus[keyof typeof ProcessStatus];


export function ProcessStatusFromJSON(json: any): ProcessStatus {
    return ProcessStatusFromJSONTyped(json, false);
}

export function ProcessStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): ProcessStatus {
    return json as ProcessStatus;
}

export function ProcessStatusToJSON(value?: ProcessStatus | null): any {
    return value as any;
}

