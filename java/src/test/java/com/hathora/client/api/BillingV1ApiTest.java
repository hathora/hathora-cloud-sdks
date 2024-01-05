/*
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


package com.hathora.client.api;

import com.hathora.client.ApiException;
import com.hathora.client.model.ApiError;
import com.hathora.client.model.CustomerPortalUrl;
import com.hathora.client.model.Invoice;
import com.hathora.client.model.PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillingV1Api
 */
@Disabled
public class BillingV1ApiTest {

    private final BillingV1Api api = new BillingV1Api();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBalanceTest() throws ApiException {
        Double response = api.getBalance();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvoicesTest() throws ApiException {
        List<Invoice> response = api.getInvoices();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPaymentMethodTest() throws ApiException {
        PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod response = api.getPaymentMethod();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void initStripeCustomerPortalUrlTest() throws ApiException {
        CustomerPortalUrl customerPortalUrl = null;
        String response = api.initStripeCustomerPortalUrl(customerPortalUrl);
        // TODO: test validations
    }

}
