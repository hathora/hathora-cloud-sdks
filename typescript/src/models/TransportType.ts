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


/**
 * 
 * @export
 */
export const TransportType = {
    Tcp: 'tcp',
    Udp: 'udp',
    Tls: 'tls'
} as const;
export type TransportType = typeof TransportType[keyof typeof TransportType];


export function TransportTypeFromJSON(json: any): TransportType {
    return TransportTypeFromJSONTyped(json, false);
}

export function TransportTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): TransportType {
    return json as TransportType;
}

export function TransportTypeToJSON(value?: TransportType | null): any {
    return value as any;
}

