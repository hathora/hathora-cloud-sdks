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
import com.hathora.client.model.ExposedPort;
import com.hathora.client.model.PickRoomExcludeKeyofRoomAllocations;
import com.hathora.client.model.Region;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hathora.client.JSON;

/**
 * ProcessWithRooms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessWithRooms {
  public static final String SERIALIZED_NAME_EGRESSED_BYTES = "egressedBytes";
  @SerializedName(SERIALIZED_NAME_EGRESSED_BYTES)
  private Double egressedBytes;

  public static final String SERIALIZED_NAME_IDLE_SINCE = "idleSince";
  @SerializedName(SERIALIZED_NAME_IDLE_SINCE)
  private OffsetDateTime idleSince;

  public static final String SERIALIZED_NAME_ACTIVE_CONNECTIONS = "activeConnections";
  @SerializedName(SERIALIZED_NAME_ACTIVE_CONNECTIONS)
  private Double activeConnections;

  public static final String SERIALIZED_NAME_ROOM_SLOTS_AVAILABLE = "roomSlotsAvailable";
  @SerializedName(SERIALIZED_NAME_ROOM_SLOTS_AVAILABLE)
  private Double roomSlotsAvailable;

  public static final String SERIALIZED_NAME_DRAINING = "draining";
  @SerializedName(SERIALIZED_NAME_DRAINING)
  private Boolean draining;

  public static final String SERIALIZED_NAME_TERMINATED_AT = "terminatedAt";
  @SerializedName(SERIALIZED_NAME_TERMINATED_AT)
  private OffsetDateTime terminatedAt;

  public static final String SERIALIZED_NAME_STOPPING_AT = "stoppingAt";
  @SerializedName(SERIALIZED_NAME_STOPPING_AT)
  private OffsetDateTime stoppingAt;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt;

  public static final String SERIALIZED_NAME_STARTING_AT = "startingAt";
  @SerializedName(SERIALIZED_NAME_STARTING_AT)
  private OffsetDateTime startingAt;

  public static final String SERIALIZED_NAME_ROOMS_PER_PROCESS = "roomsPerProcess";
  @SerializedName(SERIALIZED_NAME_ROOMS_PER_PROCESS)
  private Double roomsPerProcess;

  public static final String SERIALIZED_NAME_ADDITIONAL_EXPOSED_PORTS = "additionalExposedPorts";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_EXPOSED_PORTS)
  private List<ExposedPort> additionalExposedPorts = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPOSED_PORT = "exposedPort";
  @SerializedName(SERIALIZED_NAME_EXPOSED_PORT)
  private ExposedPort exposedPort;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Double port;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private Region region;

  public static final String SERIALIZED_NAME_PROCESS_ID = "processId";
  @SerializedName(SERIALIZED_NAME_PROCESS_ID)
  private String processId;

  public static final String SERIALIZED_NAME_DEPLOYMENT_ID = "deploymentId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_ID)
  private Double deploymentId;

  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_ROOMS = "rooms";
  @SerializedName(SERIALIZED_NAME_ROOMS)
  private List<PickRoomExcludeKeyofRoomAllocations> rooms = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_ROOMS = "totalRooms";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROOMS)
  private Double totalRooms;

  public ProcessWithRooms() {
  }

  public ProcessWithRooms egressedBytes(Double egressedBytes) {
    
    this.egressedBytes = egressedBytes;
    return this;
  }

   /**
   * Get egressedBytes
   * @return egressedBytes
  **/
  @javax.annotation.Nonnull

  public Double getEgressedBytes() {
    return egressedBytes;
  }


  public void setEgressedBytes(Double egressedBytes) {
    this.egressedBytes = egressedBytes;
  }


  public ProcessWithRooms idleSince(OffsetDateTime idleSince) {
    
    this.idleSince = idleSince;
    return this;
  }

   /**
   * Get idleSince
   * @return idleSince
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getIdleSince() {
    return idleSince;
  }


  public void setIdleSince(OffsetDateTime idleSince) {
    this.idleSince = idleSince;
  }


  public ProcessWithRooms activeConnections(Double activeConnections) {
    
    this.activeConnections = activeConnections;
    return this;
  }

   /**
   * Get activeConnections
   * @return activeConnections
  **/
  @javax.annotation.Nonnull

  public Double getActiveConnections() {
    return activeConnections;
  }


  public void setActiveConnections(Double activeConnections) {
    this.activeConnections = activeConnections;
  }


  public ProcessWithRooms roomSlotsAvailable(Double roomSlotsAvailable) {
    
    this.roomSlotsAvailable = roomSlotsAvailable;
    return this;
  }

   /**
   * Get roomSlotsAvailable
   * @return roomSlotsAvailable
  **/
  @javax.annotation.Nonnull

  public Double getRoomSlotsAvailable() {
    return roomSlotsAvailable;
  }


  public void setRoomSlotsAvailable(Double roomSlotsAvailable) {
    this.roomSlotsAvailable = roomSlotsAvailable;
  }


  public ProcessWithRooms draining(Boolean draining) {
    
    this.draining = draining;
    return this;
  }

   /**
   * Get draining
   * @return draining
  **/
  @javax.annotation.Nonnull

  public Boolean getDraining() {
    return draining;
  }


  public void setDraining(Boolean draining) {
    this.draining = draining;
  }


  public ProcessWithRooms terminatedAt(OffsetDateTime terminatedAt) {
    
    this.terminatedAt = terminatedAt;
    return this;
  }

   /**
   * Get terminatedAt
   * @return terminatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getTerminatedAt() {
    return terminatedAt;
  }


  public void setTerminatedAt(OffsetDateTime terminatedAt) {
    this.terminatedAt = terminatedAt;
  }


  public ProcessWithRooms stoppingAt(OffsetDateTime stoppingAt) {
    
    this.stoppingAt = stoppingAt;
    return this;
  }

   /**
   * Get stoppingAt
   * @return stoppingAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getStoppingAt() {
    return stoppingAt;
  }


  public void setStoppingAt(OffsetDateTime stoppingAt) {
    this.stoppingAt = stoppingAt;
  }


  public ProcessWithRooms startedAt(OffsetDateTime startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }


  public ProcessWithRooms startingAt(OffsetDateTime startingAt) {
    
    this.startingAt = startingAt;
    return this;
  }

   /**
   * Get startingAt
   * @return startingAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getStartingAt() {
    return startingAt;
  }


  public void setStartingAt(OffsetDateTime startingAt) {
    this.startingAt = startingAt;
  }


  public ProcessWithRooms roomsPerProcess(Double roomsPerProcess) {
    
    this.roomsPerProcess = roomsPerProcess;
    return this;
  }

   /**
   * Get roomsPerProcess
   * @return roomsPerProcess
  **/
  @javax.annotation.Nonnull

  public Double getRoomsPerProcess() {
    return roomsPerProcess;
  }


  public void setRoomsPerProcess(Double roomsPerProcess) {
    this.roomsPerProcess = roomsPerProcess;
  }


  public ProcessWithRooms additionalExposedPorts(List<ExposedPort> additionalExposedPorts) {
    
    this.additionalExposedPorts = additionalExposedPorts;
    return this;
  }

  public ProcessWithRooms addAdditionalExposedPortsItem(ExposedPort additionalExposedPortsItem) {
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


  public ProcessWithRooms exposedPort(ExposedPort exposedPort) {
    
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


  public ProcessWithRooms port(Double port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull

  public Double getPort() {
    return port;
  }


  public void setPort(Double port) {
    this.port = port;
  }


  public ProcessWithRooms host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public ProcessWithRooms region(Region region) {
    
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


  public ProcessWithRooms processId(String processId) {
    
    this.processId = processId;
    return this;
  }

   /**
   * Get processId
   * @return processId
  **/
  @javax.annotation.Nonnull

  public String getProcessId() {
    return processId;
  }


  public void setProcessId(String processId) {
    this.processId = processId;
  }


  public ProcessWithRooms deploymentId(Double deploymentId) {
    
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


  public ProcessWithRooms appId(String appId) {
    
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


  public ProcessWithRooms rooms(List<PickRoomExcludeKeyofRoomAllocations> rooms) {
    
    this.rooms = rooms;
    return this;
  }

  public ProcessWithRooms addRoomsItem(PickRoomExcludeKeyofRoomAllocations roomsItem) {
    if (this.rooms == null) {
      this.rooms = new ArrayList<>();
    }
    this.rooms.add(roomsItem);
    return this;
  }

   /**
   * Get rooms
   * @return rooms
  **/
  @javax.annotation.Nonnull

  public List<PickRoomExcludeKeyofRoomAllocations> getRooms() {
    return rooms;
  }


  public void setRooms(List<PickRoomExcludeKeyofRoomAllocations> rooms) {
    this.rooms = rooms;
  }


  public ProcessWithRooms totalRooms(Double totalRooms) {
    
    this.totalRooms = totalRooms;
    return this;
  }

   /**
   * Get totalRooms
   * @return totalRooms
  **/
  @javax.annotation.Nonnull

  public Double getTotalRooms() {
    return totalRooms;
  }


  public void setTotalRooms(Double totalRooms) {
    this.totalRooms = totalRooms;
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
   * @return the ProcessWithRooms instance itself
   */
  public ProcessWithRooms putAdditionalProperty(String key, Object value) {
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
    ProcessWithRooms processWithRooms = (ProcessWithRooms) o;
    return Objects.equals(this.egressedBytes, processWithRooms.egressedBytes) &&
        Objects.equals(this.idleSince, processWithRooms.idleSince) &&
        Objects.equals(this.activeConnections, processWithRooms.activeConnections) &&
        Objects.equals(this.roomSlotsAvailable, processWithRooms.roomSlotsAvailable) &&
        Objects.equals(this.draining, processWithRooms.draining) &&
        Objects.equals(this.terminatedAt, processWithRooms.terminatedAt) &&
        Objects.equals(this.stoppingAt, processWithRooms.stoppingAt) &&
        Objects.equals(this.startedAt, processWithRooms.startedAt) &&
        Objects.equals(this.startingAt, processWithRooms.startingAt) &&
        Objects.equals(this.roomsPerProcess, processWithRooms.roomsPerProcess) &&
        Objects.equals(this.additionalExposedPorts, processWithRooms.additionalExposedPorts) &&
        Objects.equals(this.exposedPort, processWithRooms.exposedPort) &&
        Objects.equals(this.port, processWithRooms.port) &&
        Objects.equals(this.host, processWithRooms.host) &&
        Objects.equals(this.region, processWithRooms.region) &&
        Objects.equals(this.processId, processWithRooms.processId) &&
        Objects.equals(this.deploymentId, processWithRooms.deploymentId) &&
        Objects.equals(this.appId, processWithRooms.appId) &&
        Objects.equals(this.rooms, processWithRooms.rooms) &&
        Objects.equals(this.totalRooms, processWithRooms.totalRooms)&&
        Objects.equals(this.additionalProperties, processWithRooms.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(egressedBytes, idleSince, activeConnections, roomSlotsAvailable, draining, terminatedAt, stoppingAt, startedAt, startingAt, roomsPerProcess, additionalExposedPorts, exposedPort, port, host, region, processId, deploymentId, appId, rooms, totalRooms, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessWithRooms {\n");
    sb.append("    egressedBytes: ").append(toIndentedString(egressedBytes)).append("\n");
    sb.append("    idleSince: ").append(toIndentedString(idleSince)).append("\n");
    sb.append("    activeConnections: ").append(toIndentedString(activeConnections)).append("\n");
    sb.append("    roomSlotsAvailable: ").append(toIndentedString(roomSlotsAvailable)).append("\n");
    sb.append("    draining: ").append(toIndentedString(draining)).append("\n");
    sb.append("    terminatedAt: ").append(toIndentedString(terminatedAt)).append("\n");
    sb.append("    stoppingAt: ").append(toIndentedString(stoppingAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    startingAt: ").append(toIndentedString(startingAt)).append("\n");
    sb.append("    roomsPerProcess: ").append(toIndentedString(roomsPerProcess)).append("\n");
    sb.append("    additionalExposedPorts: ").append(toIndentedString(additionalExposedPorts)).append("\n");
    sb.append("    exposedPort: ").append(toIndentedString(exposedPort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
    sb.append("    totalRooms: ").append(toIndentedString(totalRooms)).append("\n");
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
    openapiFields.add("egressedBytes");
    openapiFields.add("idleSince");
    openapiFields.add("activeConnections");
    openapiFields.add("roomSlotsAvailable");
    openapiFields.add("draining");
    openapiFields.add("terminatedAt");
    openapiFields.add("stoppingAt");
    openapiFields.add("startedAt");
    openapiFields.add("startingAt");
    openapiFields.add("roomsPerProcess");
    openapiFields.add("additionalExposedPorts");
    openapiFields.add("exposedPort");
    openapiFields.add("port");
    openapiFields.add("host");
    openapiFields.add("region");
    openapiFields.add("processId");
    openapiFields.add("deploymentId");
    openapiFields.add("appId");
    openapiFields.add("rooms");
    openapiFields.add("totalRooms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("egressedBytes");
    openapiRequiredFields.add("idleSince");
    openapiRequiredFields.add("activeConnections");
    openapiRequiredFields.add("roomSlotsAvailable");
    openapiRequiredFields.add("draining");
    openapiRequiredFields.add("terminatedAt");
    openapiRequiredFields.add("stoppingAt");
    openapiRequiredFields.add("startedAt");
    openapiRequiredFields.add("startingAt");
    openapiRequiredFields.add("roomsPerProcess");
    openapiRequiredFields.add("additionalExposedPorts");
    openapiRequiredFields.add("port");
    openapiRequiredFields.add("host");
    openapiRequiredFields.add("region");
    openapiRequiredFields.add("processId");
    openapiRequiredFields.add("deploymentId");
    openapiRequiredFields.add("appId");
    openapiRequiredFields.add("rooms");
    openapiRequiredFields.add("totalRooms");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessWithRooms
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProcessWithRooms.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessWithRooms is not found in the empty JSON string", ProcessWithRooms.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProcessWithRooms.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("additionalExposedPorts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalExposedPorts` to be an array in the JSON string but got `%s`", jsonObj.get("additionalExposedPorts").toString()));
      }

      JsonArray jsonArrayadditionalExposedPorts = jsonObj.getAsJsonArray("additionalExposedPorts");
      // validate the required field `additionalExposedPorts` (array)
      for (int i = 0; i < jsonArrayadditionalExposedPorts.size(); i++) {
        ExposedPort.validateJsonObject(jsonArrayadditionalExposedPorts.get(i).getAsJsonObject());
      };
      // validate the optional field `exposedPort`
      if (jsonObj.get("exposedPort") != null && !jsonObj.get("exposedPort").isJsonNull()) {
        ExposedPort.validateJsonObject(jsonObj.getAsJsonObject("exposedPort"));
      }
      if (!jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if (!jsonObj.get("processId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processId").toString()));
      }
      if (!jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("rooms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rooms` to be an array in the JSON string but got `%s`", jsonObj.get("rooms").toString()));
      }

      JsonArray jsonArrayrooms = jsonObj.getAsJsonArray("rooms");
      // validate the required field `rooms` (array)
      for (int i = 0; i < jsonArrayrooms.size(); i++) {
        PickRoomExcludeKeyofRoomAllocations.validateJsonObject(jsonArrayrooms.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessWithRooms.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessWithRooms' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessWithRooms> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessWithRooms.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessWithRooms>() {
           @Override
           public void write(JsonWriter out, ProcessWithRooms value) throws IOException {
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
           public ProcessWithRooms read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProcessWithRooms instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProcessWithRooms given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessWithRooms
  * @throws IOException if the JSON string is invalid with respect to ProcessWithRooms
  */
  public static ProcessWithRooms fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessWithRooms.class);
  }

 /**
  * Convert an instance of ProcessWithRooms to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

