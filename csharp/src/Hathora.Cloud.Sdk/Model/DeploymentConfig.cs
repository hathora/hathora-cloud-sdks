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
    /// User specified deployment configuration for your application at runtime.
    /// </summary>
    [DataContract(Name = "DeploymentConfig")]
    public partial class DeploymentConfig : IEquatable<DeploymentConfig>
    {

        /// <summary>
        /// Gets or Sets PlanName
        /// </summary>
        [DataMember(Name = "planName", IsRequired = true, EmitDefaultValue = true)]
        public PlanName PlanName { get; set; }

        /// <summary>
        /// Gets or Sets TransportType
        /// </summary>
        [DataMember(Name = "transportType", IsRequired = true, EmitDefaultValue = true)]
        public TransportType TransportType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentConfig" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DeploymentConfig()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentConfig" /> class.
        /// </summary>
        /// <param name="idleTimeoutEnabled">Option to shut down processes that have had no new connections or rooms for five minutes. (default to true).</param>
        /// <param name="env">The environment variable that our process will have access to at runtime. (required).</param>
        /// <param name="roomsPerProcess">Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process. (required).</param>
        /// <param name="planName">planName (required).</param>
        /// <param name="additionalContainerPorts">Additional ports your server listens on..</param>
        /// <param name="transportType">transportType (required).</param>
        /// <param name="containerPort">Default port the server listens on. (required).</param>
        public DeploymentConfig(bool idleTimeoutEnabled = true, List<DeploymentV2EnvInner> env = default(List<DeploymentV2EnvInner>), int roomsPerProcess = default(int), PlanName planName = default(PlanName), List<ContainerPort> additionalContainerPorts = default(List<ContainerPort>), TransportType transportType = default(TransportType), int containerPort = default(int))
        {
            // to ensure "env" is required (not null)
            if (env == null)
            {
                throw new ArgumentNullException("env is a required property for DeploymentConfig and cannot be null");
            }
            this.Env = env;
            this.RoomsPerProcess = roomsPerProcess;
            this.PlanName = planName;
            this.TransportType = transportType;
            this.ContainerPort = containerPort;
            this.IdleTimeoutEnabled = idleTimeoutEnabled;
            this.AdditionalContainerPorts = additionalContainerPorts;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Option to shut down processes that have had no new connections or rooms for five minutes.
        /// </summary>
        /// <value>Option to shut down processes that have had no new connections or rooms for five minutes.</value>
        [DataMember(Name = "idleTimeoutEnabled", EmitDefaultValue = true)]
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
        [DataMember(Name = "additionalContainerPorts", EmitDefaultValue = false)]
        public List<ContainerPort> AdditionalContainerPorts { get; set; }

        /// <summary>
        /// Default port the server listens on.
        /// </summary>
        /// <value>Default port the server listens on.</value>
        /// <example>4000</example>
        [DataMember(Name = "containerPort", IsRequired = true, EmitDefaultValue = true)]
        public int ContainerPort { get; set; }

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
            sb.Append("class DeploymentConfig {\n");
            sb.Append("  IdleTimeoutEnabled: ").Append(IdleTimeoutEnabled).Append("\n");
            sb.Append("  Env: ").Append(Env).Append("\n");
            sb.Append("  RoomsPerProcess: ").Append(RoomsPerProcess).Append("\n");
            sb.Append("  PlanName: ").Append(PlanName).Append("\n");
            sb.Append("  AdditionalContainerPorts: ").Append(AdditionalContainerPorts).Append("\n");
            sb.Append("  TransportType: ").Append(TransportType).Append("\n");
            sb.Append("  ContainerPort: ").Append(ContainerPort).Append("\n");
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
            return this.Equals(input as DeploymentConfig);
        }

        /// <summary>
        /// Returns true if DeploymentConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of DeploymentConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeploymentConfig input)
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
                    this.PlanName == input.PlanName ||
                    this.PlanName.Equals(input.PlanName)
                ) && 
                (
                    this.AdditionalContainerPorts == input.AdditionalContainerPorts ||
                    this.AdditionalContainerPorts != null &&
                    input.AdditionalContainerPorts != null &&
                    this.AdditionalContainerPorts.SequenceEqual(input.AdditionalContainerPorts)
                ) && 
                (
                    this.TransportType == input.TransportType ||
                    this.TransportType.Equals(input.TransportType)
                ) && 
                (
                    this.ContainerPort == input.ContainerPort ||
                    this.ContainerPort.Equals(input.ContainerPort)
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
                hashCode = (hashCode * 59) + this.PlanName.GetHashCode();
                if (this.AdditionalContainerPorts != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalContainerPorts.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TransportType.GetHashCode();
                hashCode = (hashCode * 59) + this.ContainerPort.GetHashCode();
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

    }

}
