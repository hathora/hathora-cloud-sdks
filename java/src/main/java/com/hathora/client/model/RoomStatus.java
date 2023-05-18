/*
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
 * Gets or Sets RoomStatus
 */
@JsonAdapter(RoomStatus.Adapter.class)
public enum RoomStatus {
  
  SCHEDULING("scheduling"),
  
  ACTIVE("active"),
  
  SUSPENDED("suspended"),
  
  DESTROYED("destroyed");

  private String value;

  RoomStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RoomStatus fromValue(String value) {
    for (RoomStatus b : RoomStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RoomStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final RoomStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RoomStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RoomStatus.fromValue(value);
    }
  }
}
