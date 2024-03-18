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
import com.hathora.client.model.LobbyVisibility;
import com.hathora.client.model.Region;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * A lobby object allows you to store and manage metadata for your rooms.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Lobby {
  public static final String SERIALIZED_NAME_SHORT_CODE = "shortCode";
  @SerializedName(SERIALIZED_NAME_SHORT_CODE)
  private String shortCode;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private Object state;

  public static final String SERIALIZED_NAME_INITIAL_CONFIG = "initialConfig";
  @SerializedName(SERIALIZED_NAME_INITIAL_CONFIG)
  private Object initialConfig;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_LOCAL = "local";
  @SerializedName(SERIALIZED_NAME_LOCAL)
  private Boolean local;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private LobbyVisibility visibility;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private Region region;

  public static final String SERIALIZED_NAME_ROOM_ID = "roomId";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private String roomId;

  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public Lobby() {
  }

  public Lobby shortCode(String shortCode) {
    
    this.shortCode = shortCode;
    return this;
  }

   /**
   * User-defined identifier for a lobby.
   * @return shortCode
  **/
  @javax.annotation.Nullable

  public String getShortCode() {
    return shortCode;
  }


  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }


  public Lobby state(Object state) {
    
    this.state = state;
    return this;
  }

   /**
   * JSON blob to store metadata for a room. Must be smaller than 1MB.
   * @return state
  **/
  @javax.annotation.Nullable

  public Object getState() {
    return state;
  }


  public void setState(Object state) {
    this.state = state;
  }


  public Lobby initialConfig(Object initialConfig) {
    
    this.initialConfig = initialConfig;
    return this;
  }

   /**
   * User input to initialize the game state. Object must be smaller than 64KB.
   * @return initialConfig
  **/
  @javax.annotation.Nonnull

  public Object getInitialConfig() {
    return initialConfig;
  }


  public void setInitialConfig(Object initialConfig) {
    this.initialConfig = initialConfig;
  }


  public Lobby createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the lobby was created.
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Lobby createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * UserId or email address for the user that created the lobby.
   * @return createdBy
  **/
  @javax.annotation.Nonnull

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public Lobby local(Boolean local) {
    
    this.local = local;
    return this;
  }

   /**
   * Get local
   * @return local
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull

  public Boolean getLocal() {
    return local;
  }


  public void setLocal(Boolean local) {
    this.local = local;
  }


  public Lobby visibility(LobbyVisibility visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nonnull

  public LobbyVisibility getVisibility() {
    return visibility;
  }


  public void setVisibility(LobbyVisibility visibility) {
    this.visibility = visibility;
  }


  public Lobby region(Region region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nonnull

  public Region getRegion() {
    return region;
  }


  public void setRegion(Region region) {
    this.region = region;
  }


  public Lobby roomId(String roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique.
   * @return roomId
  **/
  @javax.annotation.Nonnull

  public String getRoomId() {
    return roomId;
  }


  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }


  public Lobby appId(String appId) {
    
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
   * @return the Lobby instance itself
   */
  public Lobby putAdditionalProperty(String key, Object value) {
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
    Lobby lobby = (Lobby) o;
    return Objects.equals(this.shortCode, lobby.shortCode) &&
        Objects.equals(this.state, lobby.state) &&
        Objects.equals(this.initialConfig, lobby.initialConfig) &&
        Objects.equals(this.createdAt, lobby.createdAt) &&
        Objects.equals(this.createdBy, lobby.createdBy) &&
        Objects.equals(this.local, lobby.local) &&
        Objects.equals(this.visibility, lobby.visibility) &&
        Objects.equals(this.region, lobby.region) &&
        Objects.equals(this.roomId, lobby.roomId) &&
        Objects.equals(this.appId, lobby.appId)&&
        Objects.equals(this.additionalProperties, lobby.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortCode, state, initialConfig, createdAt, createdBy, local, visibility, region, roomId, appId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lobby {\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    initialConfig: ").append(toIndentedString(initialConfig)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
    openapiFields.add("shortCode");
    openapiFields.add("state");
    openapiFields.add("initialConfig");
    openapiFields.add("createdAt");
    openapiFields.add("createdBy");
    openapiFields.add("local");
    openapiFields.add("visibility");
    openapiFields.add("region");
    openapiFields.add("roomId");
    openapiFields.add("appId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shortCode");
    openapiRequiredFields.add("initialConfig");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("createdBy");
    openapiRequiredFields.add("local");
    openapiRequiredFields.add("visibility");
    openapiRequiredFields.add("region");
    openapiRequiredFields.add("roomId");
    openapiRequiredFields.add("appId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Lobby
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Lobby.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Lobby is not found in the empty JSON string", Lobby.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Lobby.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("shortCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortCode").toString()));
      }
      if (!jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if (!jsonObj.get("roomId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roomId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roomId").toString()));
      }
      if (!jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Lobby.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Lobby' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Lobby> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Lobby.class));

       return (TypeAdapter<T>) new TypeAdapter<Lobby>() {
           @Override
           public void write(JsonWriter out, Lobby value) throws IOException {
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
           public Lobby read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Lobby instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Lobby given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Lobby
  * @throws IOException if the JSON string is invalid with respect to Lobby
  */
  public static Lobby fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Lobby.class);
  }

 /**
  * Convert an instance of Lobby to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

