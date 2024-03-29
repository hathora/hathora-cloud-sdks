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
import com.hathora.client.model.AuthConfigurationGoogle;
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
 * Configure [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service) for your application. Use Hathora&#39;s built-in auth providers or use your own [custom authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service#custom-auth-provider).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthConfiguration {
  public static final String SERIALIZED_NAME_GOOGLE = "google";
  @SerializedName(SERIALIZED_NAME_GOOGLE)
  private AuthConfigurationGoogle google;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private Object nickname;

  public static final String SERIALIZED_NAME_ANONYMOUS = "anonymous";
  @SerializedName(SERIALIZED_NAME_ANONYMOUS)
  private Object anonymous;

  public AuthConfiguration() {
  }

  public AuthConfiguration google(AuthConfigurationGoogle google) {
    
    this.google = google;
    return this;
  }

   /**
   * Get google
   * @return google
  **/
  @javax.annotation.Nullable

  public AuthConfigurationGoogle getGoogle() {
    return google;
  }


  public void setGoogle(AuthConfigurationGoogle google) {
    this.google = google;
  }


  public AuthConfiguration nickname(Object nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Construct a type with a set of properties K of type T
   * @return nickname
  **/
  @javax.annotation.Nullable

  public Object getNickname() {
    return nickname;
  }


  public void setNickname(Object nickname) {
    this.nickname = nickname;
  }


  public AuthConfiguration anonymous(Object anonymous) {
    
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Construct a type with a set of properties K of type T
   * @return anonymous
  **/
  @javax.annotation.Nullable

  public Object getAnonymous() {
    return anonymous;
  }


  public void setAnonymous(Object anonymous) {
    this.anonymous = anonymous;
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
   * @return the AuthConfiguration instance itself
   */
  public AuthConfiguration putAdditionalProperty(String key, Object value) {
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
    AuthConfiguration authConfiguration = (AuthConfiguration) o;
    return Objects.equals(this.google, authConfiguration.google) &&
        Objects.equals(this.nickname, authConfiguration.nickname) &&
        Objects.equals(this.anonymous, authConfiguration.anonymous)&&
        Objects.equals(this.additionalProperties, authConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(google, nickname, anonymous, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfiguration {\n");
    sb.append("    google: ").append(toIndentedString(google)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
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
    openapiFields.add("google");
    openapiFields.add("nickname");
    openapiFields.add("anonymous");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthConfiguration is not found in the empty JSON string", AuthConfiguration.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `google`
      if (jsonObj.get("google") != null && !jsonObj.get("google").isJsonNull()) {
        AuthConfigurationGoogle.validateJsonObject(jsonObj.getAsJsonObject("google"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthConfiguration>() {
           @Override
           public void write(JsonWriter out, AuthConfiguration value) throws IOException {
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
           public AuthConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthConfiguration instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthConfiguration
  * @throws IOException if the JSON string is invalid with respect to AuthConfiguration
  */
  public static AuthConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthConfiguration.class);
  }

 /**
  * Convert an instance of AuthConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

