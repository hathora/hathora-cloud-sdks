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
import com.hathora.client.model.MetricValue;
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
 * Construct a type with a set of properties K of type T
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecordPartialMetricNameMetricValueArray {
  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private List<MetricValue> cpu;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private List<MetricValue> memory;

  public static final String SERIALIZED_NAME_RATE_EGRESS = "rate_egress";
  @SerializedName(SERIALIZED_NAME_RATE_EGRESS)
  private List<MetricValue> rateEgress;

  public static final String SERIALIZED_NAME_TOTAL_EGRESS = "total_egress";
  @SerializedName(SERIALIZED_NAME_TOTAL_EGRESS)
  private List<MetricValue> totalEgress;

  public RecordPartialMetricNameMetricValueArray() {
  }

  public RecordPartialMetricNameMetricValueArray cpu(List<MetricValue> cpu) {
    
    this.cpu = cpu;
    return this;
  }

  public RecordPartialMetricNameMetricValueArray addCpuItem(MetricValue cpuItem) {
    if (this.cpu == null) {
      this.cpu = new ArrayList<>();
    }
    this.cpu.add(cpuItem);
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @javax.annotation.Nullable
  public List<MetricValue> getCpu() {
    return cpu;
  }


  public void setCpu(List<MetricValue> cpu) {
    this.cpu = cpu;
  }


  public RecordPartialMetricNameMetricValueArray memory(List<MetricValue> memory) {
    
    this.memory = memory;
    return this;
  }

  public RecordPartialMetricNameMetricValueArray addMemoryItem(MetricValue memoryItem) {
    if (this.memory == null) {
      this.memory = new ArrayList<>();
    }
    this.memory.add(memoryItem);
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  public List<MetricValue> getMemory() {
    return memory;
  }


  public void setMemory(List<MetricValue> memory) {
    this.memory = memory;
  }


  public RecordPartialMetricNameMetricValueArray rateEgress(List<MetricValue> rateEgress) {
    
    this.rateEgress = rateEgress;
    return this;
  }

  public RecordPartialMetricNameMetricValueArray addRateEgressItem(MetricValue rateEgressItem) {
    if (this.rateEgress == null) {
      this.rateEgress = new ArrayList<>();
    }
    this.rateEgress.add(rateEgressItem);
    return this;
  }

   /**
   * Get rateEgress
   * @return rateEgress
  **/
  @javax.annotation.Nullable
  public List<MetricValue> getRateEgress() {
    return rateEgress;
  }


  public void setRateEgress(List<MetricValue> rateEgress) {
    this.rateEgress = rateEgress;
  }


  public RecordPartialMetricNameMetricValueArray totalEgress(List<MetricValue> totalEgress) {
    
    this.totalEgress = totalEgress;
    return this;
  }

  public RecordPartialMetricNameMetricValueArray addTotalEgressItem(MetricValue totalEgressItem) {
    if (this.totalEgress == null) {
      this.totalEgress = new ArrayList<>();
    }
    this.totalEgress.add(totalEgressItem);
    return this;
  }

   /**
   * Get totalEgress
   * @return totalEgress
  **/
  @javax.annotation.Nullable
  public List<MetricValue> getTotalEgress() {
    return totalEgress;
  }


  public void setTotalEgress(List<MetricValue> totalEgress) {
    this.totalEgress = totalEgress;
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
   * @return the RecordPartialMetricNameMetricValueArray instance itself
   */
  public RecordPartialMetricNameMetricValueArray putAdditionalProperty(String key, Object value) {
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
    RecordPartialMetricNameMetricValueArray recordPartialMetricNameMetricValueArray = (RecordPartialMetricNameMetricValueArray) o;
    return Objects.equals(this.cpu, recordPartialMetricNameMetricValueArray.cpu) &&
        Objects.equals(this.memory, recordPartialMetricNameMetricValueArray.memory) &&
        Objects.equals(this.rateEgress, recordPartialMetricNameMetricValueArray.rateEgress) &&
        Objects.equals(this.totalEgress, recordPartialMetricNameMetricValueArray.totalEgress)&&
        Objects.equals(this.additionalProperties, recordPartialMetricNameMetricValueArray.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory, rateEgress, totalEgress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordPartialMetricNameMetricValueArray {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    rateEgress: ").append(toIndentedString(rateEgress)).append("\n");
    sb.append("    totalEgress: ").append(toIndentedString(totalEgress)).append("\n");
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
    openapiFields.add("cpu");
    openapiFields.add("memory");
    openapiFields.add("rate_egress");
    openapiFields.add("total_egress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RecordPartialMetricNameMetricValueArray
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordPartialMetricNameMetricValueArray.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordPartialMetricNameMetricValueArray is not found in the empty JSON string", RecordPartialMetricNameMetricValueArray.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("cpu") != null && !jsonObj.get("cpu").isJsonNull()) {
        JsonArray jsonArraycpu = jsonObj.getAsJsonArray("cpu");
        if (jsonArraycpu != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cpu").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cpu` to be an array in the JSON string but got `%s`", jsonObj.get("cpu").toString()));
          }

          // validate the optional field `cpu` (array)
          for (int i = 0; i < jsonArraycpu.size(); i++) {
            MetricValue.validateJsonElement(jsonArraycpu.get(i));
          };
        }
      }
      if (jsonObj.get("memory") != null && !jsonObj.get("memory").isJsonNull()) {
        JsonArray jsonArraymemory = jsonObj.getAsJsonArray("memory");
        if (jsonArraymemory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("memory").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `memory` to be an array in the JSON string but got `%s`", jsonObj.get("memory").toString()));
          }

          // validate the optional field `memory` (array)
          for (int i = 0; i < jsonArraymemory.size(); i++) {
            MetricValue.validateJsonElement(jsonArraymemory.get(i));
          };
        }
      }
      if (jsonObj.get("rate_egress") != null && !jsonObj.get("rate_egress").isJsonNull()) {
        JsonArray jsonArrayrateEgress = jsonObj.getAsJsonArray("rate_egress");
        if (jsonArrayrateEgress != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rate_egress").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rate_egress` to be an array in the JSON string but got `%s`", jsonObj.get("rate_egress").toString()));
          }

          // validate the optional field `rate_egress` (array)
          for (int i = 0; i < jsonArrayrateEgress.size(); i++) {
            MetricValue.validateJsonElement(jsonArrayrateEgress.get(i));
          };
        }
      }
      if (jsonObj.get("total_egress") != null && !jsonObj.get("total_egress").isJsonNull()) {
        JsonArray jsonArraytotalEgress = jsonObj.getAsJsonArray("total_egress");
        if (jsonArraytotalEgress != null) {
          // ensure the json data is an array
          if (!jsonObj.get("total_egress").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `total_egress` to be an array in the JSON string but got `%s`", jsonObj.get("total_egress").toString()));
          }

          // validate the optional field `total_egress` (array)
          for (int i = 0; i < jsonArraytotalEgress.size(); i++) {
            MetricValue.validateJsonElement(jsonArraytotalEgress.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordPartialMetricNameMetricValueArray.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordPartialMetricNameMetricValueArray' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordPartialMetricNameMetricValueArray> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordPartialMetricNameMetricValueArray.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordPartialMetricNameMetricValueArray>() {
           @Override
           public void write(JsonWriter out, RecordPartialMetricNameMetricValueArray value) throws IOException {
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
           public RecordPartialMetricNameMetricValueArray read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RecordPartialMetricNameMetricValueArray instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecordPartialMetricNameMetricValueArray given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecordPartialMetricNameMetricValueArray
  * @throws IOException if the JSON string is invalid with respect to RecordPartialMetricNameMetricValueArray
  */
  public static RecordPartialMetricNameMetricValueArray fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordPartialMetricNameMetricValueArray.class);
  }

 /**
  * Convert an instance of RecordPartialMetricNameMetricValueArray to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

