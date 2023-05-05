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
import com.hathora.client.model.ContainerPort;
import com.hathora.client.model.DeploymentConfigEnvInner;
import com.hathora.client.model.PlanName;
import com.hathora.client.model.TransportType;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hathora.client.JSON;

/**
 * DeploymentConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeploymentConfig {
  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<DeploymentConfigEnvInner> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROOMS_PER_PROCESS = "roomsPerProcess";
  @SerializedName(SERIALIZED_NAME_ROOMS_PER_PROCESS)
  private Integer roomsPerProcess;

  public static final String SERIALIZED_NAME_PLAN_NAME = "planName";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private PlanName planName;

  public static final String SERIALIZED_NAME_ADDITIONAL_CONTAINER_PORTS = "additionalContainerPorts";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_CONTAINER_PORTS)
  private List<ContainerPort> additionalContainerPorts;

  public static final String SERIALIZED_NAME_TRANSPORT_TYPE = "transportType";
  @SerializedName(SERIALIZED_NAME_TRANSPORT_TYPE)
  private TransportType transportType;

  public static final String SERIALIZED_NAME_CONTAINER_PORT = "containerPort";
  @SerializedName(SERIALIZED_NAME_CONTAINER_PORT)
  private Integer containerPort;

  public DeploymentConfig() {
  }

  public DeploymentConfig env(List<DeploymentConfigEnvInner> env) {
    
    this.env = env;
    return this;
  }

  public DeploymentConfig addEnvItem(DeploymentConfigEnvInner envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @javax.annotation.Nonnull

  public List<DeploymentConfigEnvInner> getEnv() {
    return env;
  }


  public void setEnv(List<DeploymentConfigEnvInner> env) {
    this.env = env;
  }


  public DeploymentConfig roomsPerProcess(Integer roomsPerProcess) {
    
    this.roomsPerProcess = roomsPerProcess;
    return this;
  }

   /**
   * Get roomsPerProcess
   * minimum: 1
   * maximum: 10000
   * @return roomsPerProcess
  **/
  @javax.annotation.Nonnull

  public Integer getRoomsPerProcess() {
    return roomsPerProcess;
  }


  public void setRoomsPerProcess(Integer roomsPerProcess) {
    this.roomsPerProcess = roomsPerProcess;
  }


  public DeploymentConfig planName(PlanName planName) {
    
    this.planName = planName;
    return this;
  }

   /**
   * Get planName
   * @return planName
  **/
  @javax.annotation.Nonnull

  public PlanName getPlanName() {
    return planName;
  }


  public void setPlanName(PlanName planName) {
    this.planName = planName;
  }


  public DeploymentConfig additionalContainerPorts(List<ContainerPort> additionalContainerPorts) {
    
    this.additionalContainerPorts = additionalContainerPorts;
    return this;
  }

  public DeploymentConfig addAdditionalContainerPortsItem(ContainerPort additionalContainerPortsItem) {
    if (this.additionalContainerPorts == null) {
      this.additionalContainerPorts = new ArrayList<>();
    }
    this.additionalContainerPorts.add(additionalContainerPortsItem);
    return this;
  }

   /**
   * Get additionalContainerPorts
   * @return additionalContainerPorts
  **/
  @javax.annotation.Nullable

  public List<ContainerPort> getAdditionalContainerPorts() {
    return additionalContainerPorts;
  }


  public void setAdditionalContainerPorts(List<ContainerPort> additionalContainerPorts) {
    this.additionalContainerPorts = additionalContainerPorts;
  }


  public DeploymentConfig transportType(TransportType transportType) {
    
    this.transportType = transportType;
    return this;
  }

   /**
   * Get transportType
   * @return transportType
  **/
  @javax.annotation.Nonnull

  public TransportType getTransportType() {
    return transportType;
  }


  public void setTransportType(TransportType transportType) {
    this.transportType = transportType;
  }


  public DeploymentConfig containerPort(Integer containerPort) {
    
    this.containerPort = containerPort;
    return this;
  }

   /**
   * Get containerPort
   * minimum: 1
   * maximum: 65535
   * @return containerPort
  **/
  @javax.annotation.Nonnull

  public Integer getContainerPort() {
    return containerPort;
  }


  public void setContainerPort(Integer containerPort) {
    this.containerPort = containerPort;
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
   * @return the DeploymentConfig instance itself
   */
  public DeploymentConfig putAdditionalProperty(String key, Object value) {
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
    DeploymentConfig deploymentConfig = (DeploymentConfig) o;
    return Objects.equals(this.env, deploymentConfig.env) &&
        Objects.equals(this.roomsPerProcess, deploymentConfig.roomsPerProcess) &&
        Objects.equals(this.planName, deploymentConfig.planName) &&
        Objects.equals(this.additionalContainerPorts, deploymentConfig.additionalContainerPorts) &&
        Objects.equals(this.transportType, deploymentConfig.transportType) &&
        Objects.equals(this.containerPort, deploymentConfig.containerPort)&&
        Objects.equals(this.additionalProperties, deploymentConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, roomsPerProcess, planName, additionalContainerPorts, transportType, containerPort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentConfig {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    roomsPerProcess: ").append(toIndentedString(roomsPerProcess)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    additionalContainerPorts: ").append(toIndentedString(additionalContainerPorts)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
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
    openapiFields.add("env");
    openapiFields.add("roomsPerProcess");
    openapiFields.add("planName");
    openapiFields.add("additionalContainerPorts");
    openapiFields.add("transportType");
    openapiFields.add("containerPort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("env");
    openapiRequiredFields.add("roomsPerProcess");
    openapiRequiredFields.add("planName");
    openapiRequiredFields.add("transportType");
    openapiRequiredFields.add("containerPort");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeploymentConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeploymentConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeploymentConfig is not found in the empty JSON string", DeploymentConfig.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeploymentConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("env").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `env` to be an array in the JSON string but got `%s`", jsonObj.get("env").toString()));
      }

      JsonArray jsonArrayenv = jsonObj.getAsJsonArray("env");
      // validate the required field `env` (array)
      for (int i = 0; i < jsonArrayenv.size(); i++) {
        DeploymentConfigEnvInner.validateJsonObject(jsonArrayenv.get(i).getAsJsonObject());
      };
      if (jsonObj.get("additionalContainerPorts") != null && !jsonObj.get("additionalContainerPorts").isJsonNull()) {
        JsonArray jsonArrayadditionalContainerPorts = jsonObj.getAsJsonArray("additionalContainerPorts");
        if (jsonArrayadditionalContainerPorts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalContainerPorts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalContainerPorts` to be an array in the JSON string but got `%s`", jsonObj.get("additionalContainerPorts").toString()));
          }

          // validate the optional field `additionalContainerPorts` (array)
          for (int i = 0; i < jsonArrayadditionalContainerPorts.size(); i++) {
            ContainerPort.validateJsonObject(jsonArrayadditionalContainerPorts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeploymentConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeploymentConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeploymentConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeploymentConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<DeploymentConfig>() {
           @Override
           public void write(JsonWriter out, DeploymentConfig value) throws IOException {
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
           public DeploymentConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeploymentConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeploymentConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeploymentConfig
  * @throws IOException if the JSON string is invalid with respect to DeploymentConfig
  */
  public static DeploymentConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeploymentConfig.class);
  }

 /**
  * Convert an instance of DeploymentConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

