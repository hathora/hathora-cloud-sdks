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
 * Available metrics to query over time.
 */
@JsonAdapter(MetricName.Adapter.class)
public enum MetricName {
  
  CPU("cpu"),
  
  MEMORY("memory"),
  
  RATE_EGRESS("rate_egress"),
  
  TOTAL_EGRESS("total_egress"),
  
  ACTIVE_CONNECTIONS("active_connections");

  private String value;

  MetricName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MetricName fromValue(String value) {
    for (MetricName b : MetricName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MetricName> {
    @Override
    public void write(final JsonWriter jsonWriter, final MetricName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MetricName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MetricName.fromValue(value);
    }
  }
}

