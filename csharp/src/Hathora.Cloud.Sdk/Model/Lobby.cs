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
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Hathora.Cloud.Sdk.Client.OpenAPIDateConverter;

namespace Hathora.Cloud.Sdk.Model
{
    /// <summary>
    /// Lobby
    /// </summary>
    [DataContract(Name = "Lobby")]
    public partial class Lobby : IEquatable<Lobby>, IValidatableObject
    {
        /// <summary>
        /// Defines Visibility
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum VisibilityEnum
        {
            /// <summary>
            /// Enum Private for value: private
            /// </summary>
            [EnumMember(Value = "private")]
            Private = 1,

            /// <summary>
            /// Enum Public for value: public
            /// </summary>
            [EnumMember(Value = "public")]
            Public = 2,

            /// <summary>
            /// Enum Local for value: local
            /// </summary>
            [EnumMember(Value = "local")]
            Local = 3

        }


        /// <summary>
        /// Gets or Sets Visibility
        /// </summary>
        [DataMember(Name = "visibility", IsRequired = true, EmitDefaultValue = true)]
        public VisibilityEnum Visibility { get; set; }

        /// <summary>
        /// Gets or Sets Region
        /// </summary>
        [DataMember(Name = "region", IsRequired = true, EmitDefaultValue = true)]
        public Region Region { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Lobby" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Lobby()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="Lobby" /> class.
        /// </summary>
        /// <param name="state">state.</param>
        /// <param name="initialConfig">initialConfig (required).</param>
        /// <param name="createdAt">createdAt (required).</param>
        /// <param name="createdBy">createdBy (required).</param>
        /// <param name="local">local (required).</param>
        /// <param name="visibility">visibility (required).</param>
        /// <param name="region">region (required).</param>
        /// <param name="roomId">roomId (required).</param>
        /// <param name="appId">appId (required).</param>
        public Lobby(Object state = default(Object), Object initialConfig = default(Object), DateTime createdAt = default(DateTime), string createdBy = default(string), bool local = default(bool), VisibilityEnum visibility = default(VisibilityEnum), Region region = default(Region), string roomId = default(string), string appId = default(string))
        {
            // to ensure "initialConfig" is required (not null)
            if (initialConfig == null)
            {
                throw new ArgumentNullException("initialConfig is a required property for Lobby and cannot be null");
            }
            this.InitialConfig = initialConfig;
            this.CreatedAt = createdAt;
            // to ensure "createdBy" is required (not null)
            if (createdBy == null)
            {
                throw new ArgumentNullException("createdBy is a required property for Lobby and cannot be null");
            }
            this.CreatedBy = createdBy;
            this.Local = local;
            this.Visibility = visibility;
            this.Region = region;
            // to ensure "roomId" is required (not null)
            if (roomId == null)
            {
                throw new ArgumentNullException("roomId is a required property for Lobby and cannot be null");
            }
            this.RoomId = roomId;
            // to ensure "appId" is required (not null)
            if (appId == null)
            {
                throw new ArgumentNullException("appId is a required property for Lobby and cannot be null");
            }
            this.AppId = appId;
            this.State = state;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name = "state", EmitDefaultValue = false)]
        public Object State { get; set; }

        /// <summary>
        /// Gets or Sets InitialConfig
        /// </summary>
        [DataMember(Name = "initialConfig", IsRequired = true, EmitDefaultValue = true)]
        public Object InitialConfig { get; set; }

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
        /// Gets or Sets Local
        /// </summary>
        [DataMember(Name = "local", IsRequired = true, EmitDefaultValue = true)]
        public bool Local { get; set; }

        /// <summary>
        /// Gets or Sets RoomId
        /// </summary>
        [DataMember(Name = "roomId", IsRequired = true, EmitDefaultValue = true)]
        public string RoomId { get; set; }

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
            sb.Append("class Lobby {\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  InitialConfig: ").Append(InitialConfig).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CreatedBy: ").Append(CreatedBy).Append("\n");
            sb.Append("  Local: ").Append(Local).Append("\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
            sb.Append("  Region: ").Append(Region).Append("\n");
            sb.Append("  RoomId: ").Append(RoomId).Append("\n");
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
            return this.Equals(input as Lobby);
        }

        /// <summary>
        /// Returns true if Lobby instances are equal
        /// </summary>
        /// <param name="input">Instance of Lobby to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Lobby input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.InitialConfig == input.InitialConfig ||
                    (this.InitialConfig != null &&
                    this.InitialConfig.Equals(input.InitialConfig))
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
                    this.Local == input.Local ||
                    this.Local.Equals(input.Local)
                ) && 
                (
                    this.Visibility == input.Visibility ||
                    this.Visibility.Equals(input.Visibility)
                ) && 
                (
                    this.Region == input.Region ||
                    this.Region.Equals(input.Region)
                ) && 
                (
                    this.RoomId == input.RoomId ||
                    (this.RoomId != null &&
                    this.RoomId.Equals(input.RoomId))
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
                if (this.State != null)
                {
                    hashCode = (hashCode * 59) + this.State.GetHashCode();
                }
                if (this.InitialConfig != null)
                {
                    hashCode = (hashCode * 59) + this.InitialConfig.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.CreatedBy != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedBy.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Local.GetHashCode();
                hashCode = (hashCode * 59) + this.Visibility.GetHashCode();
                hashCode = (hashCode * 59) + this.Region.GetHashCode();
                if (this.RoomId != null)
                {
                    hashCode = (hashCode * 59) + this.RoomId.GetHashCode();
                }
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

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
