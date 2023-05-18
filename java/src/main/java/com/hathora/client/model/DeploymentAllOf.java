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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * DeploymentAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeploymentAllOf {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_REQUESTED_MEMORY_M_B = "requestedMemoryMB";
  @SerializedName(SERIALIZED_NAME_REQUESTED_MEMORY_M_B)
  private Double requestedMemoryMB;

  public static final String SERIALIZED_NAME_REQUESTED_C_P_U = "requestedCPU";
  @SerializedName(SERIALIZED_NAME_REQUESTED_C_P_U)
  private Double requestedCPU;

  public static final String SERIALIZED_NAME_DEPLOYMENT_ID = "deploymentId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_ID)
  private Double deploymentId;

  public static final String SERIALIZED_NAME_BUILD_ID = "buildId";
  @SerializedName(SERIALIZED_NAME_BUILD_ID)
  private Double buildId;

  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public DeploymentAllOf() {
  }

  public DeploymentAllOf createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DeploymentAllOf createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nonnull

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public DeploymentAllOf requestedMemoryMB(Double requestedMemoryMB) {
    
    this.requestedMemoryMB = requestedMemoryMB;
    return this;
  }

   /**
   * Get requestedMemoryMB
   * @return requestedMemoryMB
  **/
  @javax.annotation.Nonnull

  public Double getRequestedMemoryMB() {
    return requestedMemoryMB;
  }


  public void setRequestedMemoryMB(Double requestedMemoryMB) {
    this.requestedMemoryMB = requestedMemoryMB;
  }


  public DeploymentAllOf requestedCPU(Double requestedCPU) {
    
    this.requestedCPU = requestedCPU;
    return this;
  }

   /**
   * Get requestedCPU
   * @return requestedCPU
  **/
  @javax.annotation.Nonnull

  public Double getRequestedCPU() {
    return requestedCPU;
  }


  public void setRequestedCPU(Double requestedCPU) {
    this.requestedCPU = requestedCPU;
  }


  public DeploymentAllOf deploymentId(Double deploymentId) {
    
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * Get deploymentId
   * @return deploymentId
  **/
  @javax.annotation.Nonnull

  public Double getDeploymentId() {
    return deploymentId;
  }


  public void setDeploymentId(Double deploymentId) {
    this.deploymentId = deploymentId;
  }


  public DeploymentAllOf buildId(Double buildId) {
    
    this.buildId = buildId;
    return this;
  }

   /**
   * Get buildId
   * @return buildId
  **/
  @javax.annotation.Nonnull

  public Double getBuildId() {
    return buildId;
  }


  public void setBuildId(Double buildId) {
    this.buildId = buildId;
  }


  public DeploymentAllOf appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
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
   * @return the DeploymentAllOf instance itself
   */
  public DeploymentAllOf putAdditionalProperty(String key, Object value) {
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
    DeploymentAllOf deploymentAllOf = (DeploymentAllOf) o;
    return Objects.equals(this.createdAt, deploymentAllOf.createdAt) &&
        Objects.equals(this.createdBy, deploymentAllOf.createdBy) &&
        Objects.equals(this.requestedMemoryMB, deploymentAllOf.requestedMemoryMB) &&
        Objects.equals(this.requestedCPU, deploymentAllOf.requestedCPU) &&
        Objects.equals(this.deploymentId, deploymentAllOf.deploymentId) &&
        Objects.equals(this.buildId, deploymentAllOf.buildId) &&
        Objects.equals(this.appId, deploymentAllOf.appId)&&
        Objects.equals(this.additionalProperties, deploymentAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, requestedMemoryMB, requestedCPU, deploymentId, buildId, appId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentAllOf {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    requestedMemoryMB: ").append(toIndentedString(requestedMemoryMB)).append("\n");
    sb.append("    requestedCPU: ").append(toIndentedString(requestedCPU)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
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
    openapiFields.add("createdAt");
    openapiFields.add("createdBy");
    openapiFields.add("requestedMemoryMB");
    openapiFields.add("requestedCPU");
    openapiFields.add("deploymentId");
    openapiFields.add("buildId");
    openapiFields.add("appId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("createdBy");
    openapiRequiredFields.add("requestedMemoryMB");
    openapiRequiredFields.add("requestedCPU");
    openapiRequiredFields.add("deploymentId");
    openapiRequiredFields.add("buildId");
    openapiRequiredFields.add("appId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeploymentAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeploymentAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeploymentAllOf is not found in the empty JSON string", DeploymentAllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeploymentAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if (!jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeploymentAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeploymentAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeploymentAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeploymentAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<DeploymentAllOf>() {
           @Override
           public void write(JsonWriter out, DeploymentAllOf value) throws IOException {
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
           public DeploymentAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeploymentAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeploymentAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeploymentAllOf
  * @throws IOException if the JSON string is invalid with respect to DeploymentAllOf
  */
  public static DeploymentAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeploymentAllOf.class);
  }

 /**
  * Convert an instance of DeploymentAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
