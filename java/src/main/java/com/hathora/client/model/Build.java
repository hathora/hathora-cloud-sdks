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
import com.hathora.client.model.BuildRegionalContainerTagsInner;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Build is a versioned artifact for a game server&#39;s container image and its data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Build {
  public static final String SERIALIZED_NAME_REGIONAL_CONTAINER_TAGS = "regionalContainerTags";
  @SerializedName(SERIALIZED_NAME_REGIONAL_CONTAINER_TAGS)
  private List<BuildRegionalContainerTagsInner> regionalContainerTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMAGE_SIZE = "imageSize";
  @SerializedName(SERIALIZED_NAME_IMAGE_SIZE)
  private Double imageSize;

  /**
   * Status of creating a build.  &#x60;created&#x60;: a new &#x60;buildId&#x60; was generated  &#x60;running&#x60;: the container image is being built  &#x60;succeeded&#x60;: the container image was successfully built and stored in our registry  &#x60;failed&#x60;: there was an issue creating and storing the container image in our container registry
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("created"),
    
    RUNNING("running"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed");

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

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private OffsetDateTime deletedAt;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private OffsetDateTime finishedAt;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_BUILD_ID = "buildId";
  @SerializedName(SERIALIZED_NAME_BUILD_ID)
  private Integer buildId;

  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public Build() {
  }

  public Build regionalContainerTags(List<BuildRegionalContainerTagsInner> regionalContainerTags) {
    
    this.regionalContainerTags = regionalContainerTags;
    return this;
  }

  public Build addRegionalContainerTagsItem(BuildRegionalContainerTagsInner regionalContainerTagsItem) {
    if (this.regionalContainerTags == null) {
      this.regionalContainerTags = new ArrayList<>();
    }
    this.regionalContainerTags.add(regionalContainerTagsItem);
    return this;
  }

   /**
   * An alias for the container image in our regional registries.
   * @return regionalContainerTags
  **/
  @javax.annotation.Nonnull
  public List<BuildRegionalContainerTagsInner> getRegionalContainerTags() {
    return regionalContainerTags;
  }


  public void setRegionalContainerTags(List<BuildRegionalContainerTagsInner> regionalContainerTags) {
    this.regionalContainerTags = regionalContainerTags;
  }


  public Build imageSize(Double imageSize) {
    
    this.imageSize = imageSize;
    return this;
  }

   /**
   * Image size in MB.
   * @return imageSize
  **/
  @javax.annotation.Nonnull
  public Double getImageSize() {
    return imageSize;
  }


  public void setImageSize(Double imageSize) {
    this.imageSize = imageSize;
  }


  public Build status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of creating a build.  &#x60;created&#x60;: a new &#x60;buildId&#x60; was generated  &#x60;running&#x60;: the container image is being built  &#x60;succeeded&#x60;: the container image was successfully built and stored in our registry  &#x60;failed&#x60;: there was an issue creating and storing the container image in our container registry
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Build deletedAt(OffsetDateTime deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * When the container image was deleted.
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }


  public Build finishedAt(OffsetDateTime finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * When the container image finished being built.
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }


  public Build startedAt(OffsetDateTime startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * When the container image starts getting built.
   * @return startedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }


  public Build createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When a new &#x60;buildId&#x60; is generated.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Build createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Email address for the user that created the build.
   * @return createdBy
  **/
  @javax.annotation.Nonnull
  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public Build buildId(Integer buildId) {
    
    this.buildId = buildId;
    return this;
  }

   /**
   * System generated id for a build. Increments by 1.
   * @return buildId
  **/
  @javax.annotation.Nonnull
  public Integer getBuildId() {
    return buildId;
  }


  public void setBuildId(Integer buildId) {
    this.buildId = buildId;
  }


  public Build appId(String appId) {
    
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
   * @return the Build instance itself
   */
  public Build putAdditionalProperty(String key, Object value) {
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
    Build build = (Build) o;
    return Objects.equals(this.regionalContainerTags, build.regionalContainerTags) &&
        Objects.equals(this.imageSize, build.imageSize) &&
        Objects.equals(this.status, build.status) &&
        Objects.equals(this.deletedAt, build.deletedAt) &&
        Objects.equals(this.finishedAt, build.finishedAt) &&
        Objects.equals(this.startedAt, build.startedAt) &&
        Objects.equals(this.createdAt, build.createdAt) &&
        Objects.equals(this.createdBy, build.createdBy) &&
        Objects.equals(this.buildId, build.buildId) &&
        Objects.equals(this.appId, build.appId)&&
        Objects.equals(this.additionalProperties, build.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionalContainerTags, imageSize, status, deletedAt, finishedAt, startedAt, createdAt, createdBy, buildId, appId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Build {\n");
    sb.append("    regionalContainerTags: ").append(toIndentedString(regionalContainerTags)).append("\n");
    sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
    openapiFields.add("regionalContainerTags");
    openapiFields.add("imageSize");
    openapiFields.add("status");
    openapiFields.add("deletedAt");
    openapiFields.add("finishedAt");
    openapiFields.add("startedAt");
    openapiFields.add("createdAt");
    openapiFields.add("createdBy");
    openapiFields.add("buildId");
    openapiFields.add("appId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("regionalContainerTags");
    openapiRequiredFields.add("imageSize");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("deletedAt");
    openapiRequiredFields.add("finishedAt");
    openapiRequiredFields.add("startedAt");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("createdBy");
    openapiRequiredFields.add("buildId");
    openapiRequiredFields.add("appId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Build
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Build.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Build is not found in the empty JSON string", Build.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Build.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("regionalContainerTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionalContainerTags` to be an array in the JSON string but got `%s`", jsonObj.get("regionalContainerTags").toString()));
      }

      JsonArray jsonArrayregionalContainerTags = jsonObj.getAsJsonArray("regionalContainerTags");
      // validate the required field `regionalContainerTags` (array)
      for (int i = 0; i < jsonArrayregionalContainerTags.size(); i++) {
        BuildRegionalContainerTagsInner.validateJsonElement(jsonArrayregionalContainerTags.get(i));
      };
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
       if (!Build.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Build' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Build> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Build.class));

       return (TypeAdapter<T>) new TypeAdapter<Build>() {
           @Override
           public void write(JsonWriter out, Build value) throws IOException {
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
           public Build read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Build instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Build given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Build
  * @throws IOException if the JSON string is invalid with respect to Build
  */
  public static Build fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Build.class);
  }

 /**
  * Convert an instance of Build to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

