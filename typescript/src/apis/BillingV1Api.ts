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
  CustomerPortalUrl,
  Invoice,
  PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod,
} from '../models';
import {
    CustomerPortalUrlFromJSON,
    CustomerPortalUrlToJSON,
    InvoiceFromJSON,
    InvoiceToJSON,
    PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethodFromJSON,
    PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethodToJSON,
} from '../models';

export interface InitStripeCustomerPortalUrlRequest {
    customerPortalUrl: CustomerPortalUrl;
}

/**
 * BillingV1Api - interface
 * 
 * @export
 * @interface BillingV1ApiInterface
 */
export interface BillingV1ApiInterface {
    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BillingV1ApiInterface
     */
    getBalanceRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<number>>;

    /**
     */
    getBalance(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<number>;

    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BillingV1ApiInterface
     */
    getInvoicesRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<Invoice>>>;

    /**
     */
    getInvoices(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<Invoice>>;

    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BillingV1ApiInterface
     */
    getPaymentMethodRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod>>;

    /**
     */
    getPaymentMethod(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod>;

    /**
     * 
     * @param {CustomerPortalUrl} customerPortalUrl 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BillingV1ApiInterface
     */
    initStripeCustomerPortalUrlRaw(requestParameters: InitStripeCustomerPortalUrlRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>>;

    /**
     */
    initStripeCustomerPortalUrl(customerPortalUrl: CustomerPortalUrl, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string>;

}

/**
 * 
 */
export class BillingV1Api extends runtime.BaseAPI implements BillingV1ApiInterface {

    /**
     */
    async getBalanceRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<number>> {
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
            path: `/billing/v1/balance`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        if (this.isJsonMime(response.headers.get('content-type'))) {
            return new runtime.JSONApiResponse<number>(response);
        } else {
            return new runtime.TextApiResponse(response) as any;
        }
    }

    /**
     */
    async getBalance(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<number> {
        const response = await this.getBalanceRaw(initOverrides);
        return await response.value();
    }

    /**
     */
    async getInvoicesRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<Invoice>>> {
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
            path: `/billing/v1/invoices`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(InvoiceFromJSON));
    }

    /**
     */
    async getInvoices(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<Invoice>> {
        const response = await this.getInvoicesRaw(initOverrides);
        return await response.value();
    }

    /**
     */
    async getPaymentMethodRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod>> {
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
            path: `/billing/v1/paymentmethod`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethodFromJSON(jsonValue));
    }

    /**
     */
    async getPaymentMethod(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod> {
        const response = await this.getPaymentMethodRaw(initOverrides);
        return await response.value();
    }

    /**
     */
    async initStripeCustomerPortalUrlRaw(requestParameters: InitStripeCustomerPortalUrlRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.customerPortalUrl === null || requestParameters.customerPortalUrl === undefined) {
            throw new runtime.RequiredError('customerPortalUrl','Required parameter requestParameters.customerPortalUrl was null or undefined when calling initStripeCustomerPortalUrl.');
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
            path: `/billing/v1/customerportalurl`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CustomerPortalUrlToJSON(requestParameters.customerPortalUrl),
        }, initOverrides);

        if (this.isJsonMime(response.headers.get('content-type'))) {
            return new runtime.JSONApiResponse<string>(response);
        } else {
            return new runtime.TextApiResponse(response) as any;
        }
    }

    /**
     */
    async initStripeCustomerPortalUrl(customerPortalUrl: CustomerPortalUrl, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string> {
        const response = await this.initStripeCustomerPortalUrlRaw({ customerPortalUrl: customerPortalUrl }, initOverrides);
        return await response.value();
    }

}
