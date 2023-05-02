/*
 * Hathora Cloud API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
    /// Deployment
    /// </summary>
    [DataContract(Name = "Deployment")]
    public partial class Deployment : IEquatable<Deployment>
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
        /// Initializes a new instance of the <see cref="Deployment" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Deployment()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="Deployment" /> class.
        /// </summary>
        /// <param name="env">env (required).</param>
        /// <param name="roomsPerProcess">roomsPerProcess (required).</param>
        /// <param name="planName">planName (required).</param>
        /// <param name="transportType">transportType (required).</param>
        /// <param name="containerPort">containerPort (required).</param>
        /// <param name="createdAt">createdAt (required).</param>
        /// <param name="createdBy">createdBy (required).</param>
        /// <param name="requestedMemoryMB">requestedMemoryMB (required).</param>
        /// <param name="requestedCPU">requestedCPU (required).</param>
        /// <param name="deploymentId">deploymentId (required).</param>
        /// <param name="buildId">buildId (required).</param>
        /// <param name="appId">appId (required).</param>
        public Deployment(List<DeploymentConfigEnvInner> env = default(List<DeploymentConfigEnvInner>), int roomsPerProcess = default(int), PlanName planName = default(PlanName), TransportType transportType = default(TransportType), int containerPort = default(int), DateTime createdAt = default(DateTime), string createdBy = default(string), double requestedMemoryMB = default(double), double requestedCPU = default(double), double deploymentId = default(double), double buildId = default(double), string appId = default(string))
        {
            // to ensure "env" is required (not null)
            if (env == null)
            {
                throw new ArgumentNullException("env is a required property for Deployment and cannot be null");
            }
            this.Env = env;
            this.RoomsPerProcess = roomsPerProcess;
            this.PlanName = planName;
            this.TransportType = transportType;
            this.ContainerPort = containerPort;
            this.CreatedAt = createdAt;
            // to ensure "createdBy" is required (not null)
            if (createdBy == null)
            {
                throw new ArgumentNullException("createdBy is a required property for Deployment and cannot be null");
            }
            this.CreatedBy = createdBy;
            this.RequestedMemoryMB = requestedMemoryMB;
            this.RequestedCPU = requestedCPU;
            this.DeploymentId = deploymentId;
            this.BuildId = buildId;
            // to ensure "appId" is required (not null)
            if (appId == null)
            {
                throw new ArgumentNullException("appId is a required property for Deployment and cannot be null");
            }
            this.AppId = appId;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Env
        /// </summary>
        [DataMember(Name = "env", IsRequired = true, EmitDefaultValue = true)]
        public List<DeploymentConfigEnvInner> Env { get; set; }

        /// <summary>
        /// Gets or Sets RoomsPerProcess
        /// </summary>
        [DataMember(Name = "roomsPerProcess", IsRequired = true, EmitDefaultValue = true)]
        public int RoomsPerProcess { get; set; }

        /// <summary>
        /// Gets or Sets ContainerPort
        /// </summary>
        [DataMember(Name = "containerPort", IsRequired = true, EmitDefaultValue = true)]
        public int ContainerPort { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name = "createdAt", IsRequired = true, EmitDefaultValue = true)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets CreatedBy
        /// </summary>
        [DataMember(Name = "createdBy", IsRequired = true, EmitDefaultValue = true)]
        public string CreatedBy { get; set; }

        /// <summary>
        /// Gets or Sets RequestedMemoryMB
        /// </summary>
        [DataMember(Name = "requestedMemoryMB", IsRequired = true, EmitDefaultValue = true)]
        public double RequestedMemoryMB { get; set; }

        /// <summary>
        /// Gets or Sets RequestedCPU
        /// </summary>
        [DataMember(Name = "requestedCPU", IsRequired = true, EmitDefaultValue = true)]
        public double RequestedCPU { get; set; }

        /// <summary>
        /// Gets or Sets DeploymentId
        /// </summary>
        [DataMember(Name = "deploymentId", IsRequired = true, EmitDefaultValue = true)]
        public double DeploymentId { get; set; }

        /// <summary>
        /// Gets or Sets BuildId
        /// </summary>
        [DataMember(Name = "buildId", IsRequired = true, EmitDefaultValue = true)]
        public double BuildId { get; set; }

        /// <summary>
        /// Gets or Sets AppId
        /// </summary>
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
            sb.Append("class Deployment {\n");
            sb.Append("  Env: ").Append(Env).Append("\n");
            sb.Append("  RoomsPerProcess: ").Append(RoomsPerProcess).Append("\n");
            sb.Append("  PlanName: ").Append(PlanName).Append("\n");
            sb.Append("  TransportType: ").Append(TransportType).Append("\n");
            sb.Append("  ContainerPort: ").Append(ContainerPort).Append("\n");
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
            return this.Equals(input as Deployment);
        }

        /// <summary>
        /// Returns true if Deployment instances are equal
        /// </summary>
        /// <param name="input">Instance of Deployment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Deployment input)
        {
            if (input == null)
            {
                return false;
            }
            return 
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
                    this.TransportType == input.TransportType ||
                    this.TransportType.Equals(input.TransportType)
                ) && 
                (
                    this.ContainerPort == input.ContainerPort ||
                    this.ContainerPort.Equals(input.ContainerPort)
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
                if (this.Env != null)
                {
                    hashCode = (hashCode * 59) + this.Env.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.RoomsPerProcess.GetHashCode();
                hashCode = (hashCode * 59) + this.PlanName.GetHashCode();
                hashCode = (hashCode * 59) + this.TransportType.GetHashCode();
                hashCode = (hashCode * 59) + this.ContainerPort.GetHashCode();
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
