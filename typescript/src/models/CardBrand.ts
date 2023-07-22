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
export const CardBrand = {
    Amex: 'amex',
    CartesBancaires: 'cartes_bancaires',
    Diners: 'diners',
    Discover: 'discover',
    Jcb: 'jcb',
    Mastercard: 'mastercard',
    Visa: 'visa',
    Unionpay: 'unionpay',
    Card: 'card'
} as const;
export type CardBrand = typeof CardBrand[keyof typeof CardBrand];


export function CardBrandFromJSON(json: any): CardBrand {
    return CardBrandFromJSONTyped(json, false);
}

export function CardBrandFromJSONTyped(json: any, ignoreDiscriminator: boolean): CardBrand {
    return json as CardBrand;
}

export function CardBrandToJSON(value?: CardBrand | null): any {
    return value as any;
}

