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


package com.hathora.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets InvoiceStatus
 */
@JsonAdapter(InvoiceStatus.Adapter.class)
public enum InvoiceStatus {
  
  PENDING("pending"),
  
  PAID("paid"),
  
  OVERDUE("overdue");

  private String value;

  InvoiceStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvoiceStatus fromValue(String value) {
    for (InvoiceStatus b : InvoiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InvoiceStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvoiceStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InvoiceStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InvoiceStatus.fromValue(value);
    }
  }
}

