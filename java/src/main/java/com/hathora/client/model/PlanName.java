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
 * A plan defines how much CPU and memory is required to run an instance of your game server.  &#x60;tiny&#x60;: shared core, 1gb memory  &#x60;small&#x60;: 1 core, 2gb memory  &#x60;medium&#x60;: 2 core, 4gb memory  &#x60;large&#x60;: 4 core, 8gb memory
 */
@JsonAdapter(PlanName.Adapter.class)
public enum PlanName {
  
  TINY("tiny"),
  
  SMALL("small"),
  
  MEDIUM("medium"),
  
  LARGE("large");

  private String value;

  PlanName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlanName fromValue(String value) {
    for (PlanName b : PlanName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PlanName> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlanName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlanName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlanName.fromValue(value);
    }
  }
}

