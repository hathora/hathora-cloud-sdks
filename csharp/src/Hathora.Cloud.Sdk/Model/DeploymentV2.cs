/*
 * Hathora Cloud API
 *
 * Welcome to the Hathora Cloud API documentation! Learn how to use the Hathora Cloud APIs to build and scale your game servers globally.
 *
 * The version of the OpenAPI document: 0.0.1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using OpenAPIDateConverter = Hathora.Cloud.Sdk.Client.OpenAPIDateConverter;

namespace Hathora.Cloud.Sdk.Model
{
    /// <summary>
    /// DeploymentV2
    /// </summary>
    [DataContract(Name = "DeploymentV2")]
    public partial class DeploymentV2 : IEquatable<DeploymentV2>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentV2" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DeploymentV2()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentV2" /> class.
        /// </summary>
        /// <param name="idleTimeoutEnabled">Option to shut down processes that have had no new connections or rooms for five minutes. (required).</param>
        /// <param name="env">The environment variable that our process will have access to at runtime. (required).</param>
        /// <param name="roomsPerProcess">Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. (required).</param>
        /// <param name="additionalContainerPorts">Additional ports your server listens on. (required).</param>
        /// <param name="defaultContainerPort">defaultContainerPort (required).</param>
        /// <param name="createdAt">When the deployment was created. (required).</param>
        /// <param name="createdBy">UserId or email address for the user that created the deployment. (required).</param>
        /// <param name="requestedMemoryMB">The amount of memory allocated to your process. (required).</param>
        /// <param name="requestedCPU">The number of cores allocated to your process. (required).</param>
        /// <param name="deploymentId">System generated id for a deployment. Increments by 1. (required).</param>
        /// <param name="buildId">System generated id for a build. Increments by 1. (required).</param>
        /// <param name="appId">System generated unique identifier for an application. (required).</param>
        public DeploymentV2(bool idleTimeoutEnabled = default(bool), List<DeploymentV2EnvInner> env = default(List<DeploymentV2EnvInner>), int roomsPerProcess = default(int), List<ContainerPort> additionalContainerPorts = default(List<ContainerPort>), ContainerPort defaultContainerPort = default(ContainerPort), DateTime createdAt = default(DateTime), string createdBy = default(string), double requestedMemoryMB = default(double), double requestedCPU = default(double), int deploymentId = default(int), int buildId = default(int), string appId = default(string))
        {
            this.IdleTimeoutEnabled = idleTimeoutEnabled;
            // to ensure "env" is required (not null)
            if (env == null)
            {
                throw new ArgumentNullException("env is a required property for DeploymentV2 and cannot be null");
            }
            this.Env = env;
            this.RoomsPerProcess = roomsPerProcess;
            // to ensure "additionalContainerPorts" is required (not null)
            if (additionalContainerPorts == null)
            {
                throw new ArgumentNullException("additionalContainerPorts is a required property for DeploymentV2 and cannot be null");
            }
            this.AdditionalContainerPorts = additionalContainerPorts;
            // to ensure "defaultContainerPort" is required (not null)
            if (defaultContainerPort == null)
            {
                throw new ArgumentNullException("defaultContainerPort is a required property for DeploymentV2 and cannot be null");
            }
            this.DefaultContainerPort = defaultContainerPort;
            this.CreatedAt = createdAt;
            // to ensure "createdBy" is required (not null)
            if (createdBy == null)
            {
                throw new ArgumentNullException("createdBy is a required property for DeploymentV2 and cannot be null");
            }
            this.CreatedBy = createdBy;
            this.RequestedMemoryMB = requestedMemoryMB;
            this.RequestedCPU = requestedCPU;
            this.DeploymentId = deploymentId;
            this.BuildId = buildId;
            // to ensure "appId" is required (not null)
            if (appId == null)
            {
                throw new ArgumentNullException("appId is a required property for DeploymentV2 and cannot be null");
            }
            this.AppId = appId;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Option to shut down processes that have had no new connections or rooms for five minutes.
        /// </summary>
        /// <value>Option to shut down processes that have had no new connections or rooms for five minutes.</value>
        [DataMember(Name = "idleTimeoutEnabled", IsRequired = true, EmitDefaultValue = true)]
        public bool IdleTimeoutEnabled { get; set; }

        /// <summary>
        /// The environment variable that our process will have access to at runtime.
        /// </summary>
        /// <value>The environment variable that our process will have access to at runtime.</value>
        [DataMember(Name = "env", IsRequired = true, EmitDefaultValue = true)]
        public List<DeploymentV2EnvInner> Env { get; set; }

        /// <summary>
        /// Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
        /// </summary>
        /// <value>Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.</value>
        /// <example>3</example>
        [DataMember(Name = "roomsPerProcess", IsRequired = true, EmitDefaultValue = true)]
        public int RoomsPerProcess { get; set; }

        /// <summary>
        /// Additional ports your server listens on.
        /// </summary>
        /// <value>Additional ports your server listens on.</value>
        [DataMember(Name = "additionalContainerPorts", IsRequired = true, EmitDefaultValue = true)]
        public List<ContainerPort> AdditionalContainerPorts { get; set; }

        /// <summary>
        /// Gets or Sets DefaultContainerPort
        /// </summary>
        [DataMember(Name = "defaultContainerPort", IsRequired = true, EmitDefaultValue = true)]
        public ContainerPort DefaultContainerPort { get; set; }

        /// <summary>
        /// When the deployment was created.
        /// </summary>
        /// <value>When the deployment was created.</value>
        [DataMember(Name = "createdAt", IsRequired = true, EmitDefaultValue = true)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// UserId or email address for the user that created the deployment.
        /// </summary>
        /// <value>UserId or email address for the user that created the deployment.</value>
        /// <example>&quot;google-oauth2|107030234048588177467&quot;</example>
        [DataMember(Name = "createdBy", IsRequired = true, EmitDefaultValue = true)]
        public string CreatedBy { get; set; }

        /// <summary>
        /// The amount of memory allocated to your process.
        /// </summary>
        /// <value>The amount of memory allocated to your process.</value>
        /// <example>1024</example>
        [DataMember(Name = "requestedMemoryMB", IsRequired = true, EmitDefaultValue = true)]
        public double RequestedMemoryMB { get; set; }

        /// <summary>
        /// The number of cores allocated to your process.
        /// </summary>
        /// <value>The number of cores allocated to your process.</value>
        /// <example>0.5</example>
        [DataMember(Name = "requestedCPU", IsRequired = true, EmitDefaultValue = true)]
        public double RequestedCPU { get; set; }

        /// <summary>
        /// System generated id for a deployment. Increments by 1.
        /// </summary>
        /// <value>System generated id for a deployment. Increments by 1.</value>
        /// <example>1</example>
        [DataMember(Name = "deploymentId", IsRequired = true, EmitDefaultValue = true)]
        public int DeploymentId { get; set; }

        /// <summary>
        /// System generated id for a build. Increments by 1.
        /// </summary>
        /// <value>System generated id for a build. Increments by 1.</value>
        /// <example>1</example>
        [DataMember(Name = "buildId", IsRequired = true, EmitDefaultValue = true)]
        public int BuildId { get; set; }

        /// <summary>
        /// System generated unique identifier for an application.
        /// </summary>
        /// <value>System generated unique identifier for an application.</value>
        /// <example>&quot;app-af469a92-5b45-4565-b3c4-b79878de67d2&quot;</example>
        [DataMember(Name = "appId", IsRequired = true, EmitDefaultValue = true)]
        public string AppId { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DeploymentV2 {\n");
            sb.Append("  IdleTimeoutEnabled: ").Append(IdleTimeoutEnabled).Append("\n");
            sb.Append("  Env: ").Append(Env).Append("\n");
            sb.Append("  RoomsPerProcess: ").Append(RoomsPerProcess).Append("\n");
            sb.Append("  AdditionalContainerPorts: ").Append(AdditionalContainerPorts).Append("\n");
            sb.Append("  DefaultContainerPort: ").Append(DefaultContainerPort).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CreatedBy: ").Append(CreatedBy).Append("\n");
            sb.Append("  RequestedMemoryMB: ").Append(RequestedMemoryMB).Append("\n");
            sb.Append("  RequestedCPU: ").Append(RequestedCPU).Append("\n");
            sb.Append("  DeploymentId: ").Append(DeploymentId).Append("\n");
            sb.Append("  BuildId: ").Append(BuildId).Append("\n");
            sb.Append("  AppId: ").Append(AppId).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as DeploymentV2);
        }

        /// <summary>
        /// Returns true if DeploymentV2 instances are equal
        /// </summary>
        /// <param name="input">Instance of DeploymentV2 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeploymentV2 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IdleTimeoutEnabled == input.IdleTimeoutEnabled ||
                    this.IdleTimeoutEnabled.Equals(input.IdleTimeoutEnabled)
                ) && 
                (
                    this.Env == input.Env ||
                    this.Env != null &&
                    input.Env != null &&
                    this.Env.SequenceEqual(input.Env)
                ) && 
                (
                    this.RoomsPerProcess == input.RoomsPerProcess ||
                    this.RoomsPerProcess.Equals(input.RoomsPerProcess)
                ) && 
                (
                    this.AdditionalContainerPorts == input.AdditionalContainerPorts ||
                    this.AdditionalContainerPorts != null &&
                    input.AdditionalContainerPorts != null &&
                    this.AdditionalContainerPorts.SequenceEqual(input.AdditionalContainerPorts)
                ) && 
                (
                    this.DefaultContainerPort == input.DefaultContainerPort ||
                    (this.DefaultContainerPort != null &&
                    this.DefaultContainerPort.Equals(input.DefaultContainerPort))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.CreatedBy == input.CreatedBy ||
                    (this.CreatedBy != null &&
                    this.CreatedBy.Equals(input.CreatedBy))
                ) && 
                (
                    this.RequestedMemoryMB == input.RequestedMemoryMB ||
                    this.RequestedMemoryMB.Equals(input.RequestedMemoryMB)
                ) && 
                (
                    this.RequestedCPU == input.RequestedCPU ||
                    this.RequestedCPU.Equals(input.RequestedCPU)
                ) && 
                (
                    this.DeploymentId == input.DeploymentId ||
                    this.DeploymentId.Equals(input.DeploymentId)
                ) && 
                (
                    this.BuildId == input.BuildId ||
                    this.BuildId.Equals(input.BuildId)
                ) && 
                (
                    this.AppId == input.AppId ||
                    (this.AppId != null &&
                    this.AppId.Equals(input.AppId))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.IdleTimeoutEnabled.GetHashCode();
                if (this.Env != null)
                {
                    hashCode = (hashCode * 59) + this.Env.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.RoomsPerProcess.GetHashCode();
                if (this.AdditionalContainerPorts != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalContainerPorts.GetHashCode();
                }
                if (this.DefaultContainerPort != null)
                {
                    hashCode = (hashCode * 59) + this.DefaultContainerPort.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.CreatedBy != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedBy.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.RequestedMemoryMB.GetHashCode();
                hashCode = (hashCode * 59) + this.RequestedCPU.GetHashCode();
                hashCode = (hashCode * 59) + this.DeploymentId.GetHashCode();
                hashCode = (hashCode * 59) + this.BuildId.GetHashCode();
                if (this.AppId != null)
                {
                    hashCode = (hashCode * 59) + this.AppId.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

    }

}
