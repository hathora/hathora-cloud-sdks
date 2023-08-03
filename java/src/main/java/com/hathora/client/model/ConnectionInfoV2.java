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
import com.hathora.client.model.ExposedPort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hathora.client.JSON;

/**
 * Connection information for the default and additional ports.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionInfoV2 {
  public static final String SERIALIZED_NAME_ADDITIONAL_EXPOSED_PORTS = "additionalExposedPorts";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_EXPOSED_PORTS)
  private List<ExposedPort> additionalExposedPorts = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPOSED_PORT = "exposedPort";
  @SerializedName(SERIALIZED_NAME_EXPOSED_PORT)
  private ExposedPort exposedPort;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    STARTING("starting"),
    
    ACTIVE("active");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ROOM_ID = "roomId";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private String roomId;

  public ConnectionInfoV2() {
  }

  public ConnectionInfoV2 additionalExposedPorts(List<ExposedPort> additionalExposedPorts) {
    
    this.additionalExposedPorts = additionalExposedPorts;
    return this;
  }

  public ConnectionInfoV2 addAdditionalExposedPortsItem(ExposedPort additionalExposedPortsItem) {
    if (this.additionalExposedPorts == null) {
      this.additionalExposedPorts = new ArrayList<>();
    }
    this.additionalExposedPorts.add(additionalExposedPortsItem);
    return this;
  }

   /**
   * Get additionalExposedPorts
   * @return additionalExposedPorts
  **/
  @javax.annotation.Nonnull
  public List<ExposedPort> getAdditionalExposedPorts() {
    return additionalExposedPorts;
  }


  public void setAdditionalExposedPorts(List<ExposedPort> additionalExposedPorts) {
    this.additionalExposedPorts = additionalExposedPorts;
  }


  public ConnectionInfoV2 exposedPort(ExposedPort exposedPort) {
    
    this.exposedPort = exposedPort;
    return this;
  }

   /**
   * Get exposedPort
   * @return exposedPort
  **/
  @javax.annotation.Nullable
  public ExposedPort getExposedPort() {
    return exposedPort;
  }


  public void setExposedPort(ExposedPort exposedPort) {
    this.exposedPort = exposedPort;
  }


  public ConnectionInfoV2 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ConnectionInfoV2 roomId(String roomId) {
    
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
   * @return the ConnectionInfoV2 instance itself
   */
  public ConnectionInfoV2 putAdditionalProperty(String key, Object value) {
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
    ConnectionInfoV2 connectionInfoV2 = (ConnectionInfoV2) o;
    return Objects.equals(this.additionalExposedPorts, connectionInfoV2.additionalExposedPorts) &&
        Objects.equals(this.exposedPort, connectionInfoV2.exposedPort) &&
        Objects.equals(this.status, connectionInfoV2.status) &&
        Objects.equals(this.roomId, connectionInfoV2.roomId)&&
        Objects.equals(this.additionalProperties, connectionInfoV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalExposedPorts, exposedPort, status, roomId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInfoV2 {\n");
    sb.append("    additionalExposedPorts: ").append(toIndentedString(additionalExposedPorts)).append("\n");
    sb.append("    exposedPort: ").append(toIndentedString(exposedPort)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
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
    openapiFields.add("additionalExposedPorts");
    openapiFields.add("exposedPort");
    openapiFields.add("status");
    openapiFields.add("roomId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("additionalExposedPorts");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("roomId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConnectionInfoV2
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConnectionInfoV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionInfoV2 is not found in the empty JSON string", ConnectionInfoV2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConnectionInfoV2.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("additionalExposedPorts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalExposedPorts` to be an array in the JSON string but got `%s`", jsonObj.get("additionalExposedPorts").toString()));
      }

      JsonArray jsonArrayadditionalExposedPorts = jsonObj.getAsJsonArray("additionalExposedPorts");
      // validate the required field `additionalExposedPorts` (array)
      for (int i = 0; i < jsonArrayadditionalExposedPorts.size(); i++) {
        ExposedPort.validateJsonElement(jsonArrayadditionalExposedPorts.get(i));
      };
      // validate the optional field `exposedPort`
      if (jsonObj.get("exposedPort") != null && !jsonObj.get("exposedPort").isJsonNull()) {
        ExposedPort.validateJsonElement(jsonObj.get("exposedPort"));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("roomId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roomId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionInfoV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionInfoV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionInfoV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionInfoV2.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionInfoV2>() {
           @Override
           public void write(JsonWriter out, ConnectionInfoV2 value) throws IOException {
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
           public ConnectionInfoV2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ConnectionInfoV2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConnectionInfoV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionInfoV2
  * @throws IOException if the JSON string is invalid with respect to ConnectionInfoV2
  */
  public static ConnectionInfoV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionInfoV2.class);
  }

 /**
  * Convert an instance of ConnectionInfoV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

