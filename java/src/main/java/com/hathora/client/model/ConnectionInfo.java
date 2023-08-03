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
import com.hathora.client.model.ActiveConnectionInfo;
import com.hathora.client.model.StartingConnectionInfo;
import com.hathora.client.model.TransportType;
import java.io.IOException;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.hathora.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionInfo extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ConnectionInfo.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConnectionInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConnectionInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ActiveConnectionInfo> adapterActiveConnectionInfo = gson.getDelegateAdapter(this, TypeToken.get(ActiveConnectionInfo.class));
            final TypeAdapter<StartingConnectionInfo> adapterStartingConnectionInfo = gson.getDelegateAdapter(this, TypeToken.get(StartingConnectionInfo.class));

            return (TypeAdapter<T>) new TypeAdapter<ConnectionInfo>() {
                @Override
                public void write(JsonWriter out, ConnectionInfo value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ActiveConnectionInfo`
                    if (value.getActualInstance() instanceof ActiveConnectionInfo) {
                        JsonObject obj = adapterActiveConnectionInfo.toJsonTree((ActiveConnectionInfo)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `StartingConnectionInfo`
                    if (value.getActualInstance() instanceof StartingConnectionInfo) {
                        JsonObject obj = adapterStartingConnectionInfo.toJsonTree((StartingConnectionInfo)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ActiveConnectionInfo, StartingConnectionInfo");
                }

                @Override
                public ConnectionInfo read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    // deserialize ActiveConnectionInfo
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ActiveConnectionInfo.validateJsonElement(jsonElement);
                        log.log(Level.FINER, "Input data matches schema 'ActiveConnectionInfo'");
                        ConnectionInfo ret = new ConnectionInfo();
                        ret.setActualInstance(adapterActiveConnectionInfo.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ActiveConnectionInfo'", e);
                    }

                    // deserialize StartingConnectionInfo
                    try {
                        // validate the JSON object to see if any exception is thrown
                        StartingConnectionInfo.validateJsonElement(jsonElement);
                        log.log(Level.FINER, "Input data matches schema 'StartingConnectionInfo'");
                        ConnectionInfo ret = new ConnectionInfo();
                        ret.setActualInstance(adapterStartingConnectionInfo.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'StartingConnectionInfo'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ConnectionInfo: no class matched. JSON: %s", jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ConnectionInfo() {
        super("anyOf", Boolean.FALSE);
    }

    public ConnectionInfo(ActiveConnectionInfo o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ConnectionInfo(StartingConnectionInfo o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ActiveConnectionInfo", ActiveConnectionInfo.class);
        schemas.put("StartingConnectionInfo", StartingConnectionInfo.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ConnectionInfo.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ActiveConnectionInfo, StartingConnectionInfo
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ActiveConnectionInfo) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof StartingConnectionInfo) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ActiveConnectionInfo, StartingConnectionInfo");
    }

    /**
     * Get the actual instance, which can be the following:
     * ActiveConnectionInfo, StartingConnectionInfo
     *
     * @return The actual instance (ActiveConnectionInfo, StartingConnectionInfo)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ActiveConnectionInfo`. If the actual instance is not `ActiveConnectionInfo`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ActiveConnectionInfo`
     * @throws ClassCastException if the instance is not `ActiveConnectionInfo`
     */
    public ActiveConnectionInfo getActiveConnectionInfo() throws ClassCastException {
        return (ActiveConnectionInfo)super.getActualInstance();
    }

    /**
     * Get the actual instance of `StartingConnectionInfo`. If the actual instance is not `StartingConnectionInfo`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StartingConnectionInfo`
     * @throws ClassCastException if the instance is not `StartingConnectionInfo`
     */
    public StartingConnectionInfo getStartingConnectionInfo() throws ClassCastException {
        return (StartingConnectionInfo)super.getActualInstance();
    }


 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConnectionInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with ActiveConnectionInfo
    try {
      ActiveConnectionInfo.validateJsonElement(jsonElement);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with StartingConnectionInfo
    try {
      StartingConnectionInfo.validateJsonElement(jsonElement);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ConnectionInfo with anyOf schemas: ActiveConnectionInfo, StartingConnectionInfo. JSON: %s", jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ConnectionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionInfo
  * @throws IOException if the JSON string is invalid with respect to ConnectionInfo
  */
  public static ConnectionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionInfo.class);
  }

 /**
  * Convert an instance of ConnectionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

