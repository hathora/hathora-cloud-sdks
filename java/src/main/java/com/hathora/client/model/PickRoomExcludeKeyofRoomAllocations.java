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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.hathora.client.model.RoomAllocation;
import com.hathora.client.model.RoomStatus;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hathora.client.JSON;

/**
 * From T, pick a set of properties whose keys are in the union K
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PickRoomExcludeKeyofRoomAllocations {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_ROOM_ID = "roomId";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private String roomId;

  public static final String SERIALIZED_NAME_ROOM_CONFIG = "roomConfig";
  @SerializedName(SERIALIZED_NAME_ROOM_CONFIG)
  private String roomConfig;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RoomStatus status;

  public static final String SERIALIZED_NAME_CURRENT_ALLOCATION = "currentAllocation";
  @SerializedName(SERIALIZED_NAME_CURRENT_ALLOCATION)
  private RoomAllocation currentAllocation;

  public PickRoomExcludeKeyofRoomAllocations() {
  }

  public PickRoomExcludeKeyofRoomAllocations appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * System generated unique identifier for an application.
   * @return appId
  **/
  @javax.annotation.Nonnull

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public PickRoomExcludeKeyofRoomAllocations roomId(String roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * Unique identifier to a game session or match. Use either a system generated ID or pass in your own.
   * @return roomId
  **/
  @javax.annotation.Nonnull

  public String getRoomId() {
    return roomId;
  }


  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }


  public PickRoomExcludeKeyofRoomAllocations roomConfig(String roomConfig) {
    
    this.roomConfig = roomConfig;
    return this;
  }

   /**
   * Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
   * @return roomConfig
  **/
  @javax.annotation.Nullable

  public String getRoomConfig() {
    return roomConfig;
  }


  public void setRoomConfig(String roomConfig) {
    this.roomConfig = roomConfig;
  }


  public PickRoomExcludeKeyofRoomAllocations status(RoomStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull

  public RoomStatus getStatus() {
    return status;
  }


  public void setStatus(RoomStatus status) {
    this.status = status;
  }


  public PickRoomExcludeKeyofRoomAllocations currentAllocation(RoomAllocation currentAllocation) {
    
    this.currentAllocation = currentAllocation;
    return this;
  }

   /**
   * Get currentAllocation
   * @return currentAllocation
  **/
  @javax.annotation.Nullable

  public RoomAllocation getCurrentAllocation() {
    return currentAllocation;
  }


  public void setCurrentAllocation(RoomAllocation currentAllocation) {
    this.currentAllocation = currentAllocation;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PickRoomExcludeKeyofRoomAllocations instance itself
   */
  public PickRoomExcludeKeyofRoomAllocations putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickRoomExcludeKeyofRoomAllocations pickRoomExcludeKeyofRoomAllocations = (PickRoomExcludeKeyofRoomAllocations) o;
    return Objects.equals(this.appId, pickRoomExcludeKeyofRoomAllocations.appId) &&
        Objects.equals(this.roomId, pickRoomExcludeKeyofRoomAllocations.roomId) &&
        Objects.equals(this.roomConfig, pickRoomExcludeKeyofRoomAllocations.roomConfig) &&
        Objects.equals(this.status, pickRoomExcludeKeyofRoomAllocations.status) &&
        Objects.equals(this.currentAllocation, pickRoomExcludeKeyofRoomAllocations.currentAllocation)&&
        Objects.equals(this.additionalProperties, pickRoomExcludeKeyofRoomAllocations.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, roomId, roomConfig, status, currentAllocation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickRoomExcludeKeyofRoomAllocations {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomConfig: ").append(toIndentedString(roomConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currentAllocation: ").append(toIndentedString(currentAllocation)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("appId");
    openapiFields.add("roomId");
    openapiFields.add("roomConfig");
    openapiFields.add("status");
    openapiFields.add("currentAllocation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("appId");
    openapiRequiredFields.add("roomId");
    openapiRequiredFields.add("roomConfig");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("currentAllocation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PickRoomExcludeKeyofRoomAllocations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PickRoomExcludeKeyofRoomAllocations.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PickRoomExcludeKeyofRoomAllocations is not found in the empty JSON string", PickRoomExcludeKeyofRoomAllocations.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PickRoomExcludeKeyofRoomAllocations.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
      if (!jsonObj.get("roomId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roomId").toString()));
      }
      if (!jsonObj.get("roomConfig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomConfig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roomConfig").toString()));
      }
      // validate the required field `currentAllocation`
      RoomAllocation.validateJsonObject(jsonObj.getAsJsonObject("currentAllocation"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PickRoomExcludeKeyofRoomAllocations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PickRoomExcludeKeyofRoomAllocations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PickRoomExcludeKeyofRoomAllocations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PickRoomExcludeKeyofRoomAllocations.class));

       return (TypeAdapter<T>) new TypeAdapter<PickRoomExcludeKeyofRoomAllocations>() {
           @Override
           public void write(JsonWriter out, PickRoomExcludeKeyofRoomAllocations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PickRoomExcludeKeyofRoomAllocations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PickRoomExcludeKeyofRoomAllocations instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PickRoomExcludeKeyofRoomAllocations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PickRoomExcludeKeyofRoomAllocations
  * @throws IOException if the JSON string is invalid with respect to PickRoomExcludeKeyofRoomAllocations
  */
  public static PickRoomExcludeKeyofRoomAllocations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PickRoomExcludeKeyofRoomAllocations.class);
  }

 /**
  * Convert an instance of PickRoomExcludeKeyofRoomAllocations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

