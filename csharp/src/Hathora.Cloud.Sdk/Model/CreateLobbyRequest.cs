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
    /// CreateLobbyRequest
    /// </summary>
    [DataContract(Name = "CreateLobby_request")]
    public partial class CreateLobbyRequest : IEquatable<CreateLobbyRequest>
    {
        /// <summary>
        /// Defines Visibility
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum VisibilityEnum
        {
            /// <summary>
            /// Enum Public for value: public
            /// </summary>
            [EnumMember(Value = "public")]
            Public = 1,

            /// <summary>
            /// Enum Private for value: private
            /// </summary>
            [EnumMember(Value = "private")]
            Private = 2,

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
        /// Initializes a new instance of the <see cref="CreateLobbyRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateLobbyRequest()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateLobbyRequest" /> class.
        /// </summary>
        /// <param name="visibility">visibility (required).</param>
        /// <param name="initialConfig">initialConfig (required).</param>
        /// <param name="region">region (required).</param>
        public CreateLobbyRequest(VisibilityEnum visibility = default(VisibilityEnum), Object initialConfig = default(Object), Region region = default(Region))
        {
            this.Visibility = visibility;
            // to ensure "initialConfig" is required (not null)
            if (initialConfig == null)
            {
                throw new ArgumentNullException("initialConfig is a required property for CreateLobbyRequest and cannot be null");
            }
            this.InitialConfig = initialConfig;
            this.Region = region;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets InitialConfig
        /// </summary>
        [DataMember(Name = "initialConfig", IsRequired = true, EmitDefaultValue = true)]
        public Object InitialConfig { get; set; }

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
            sb.Append("class CreateLobbyRequest {\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
            sb.Append("  InitialConfig: ").Append(InitialConfig).Append("\n");
            sb.Append("  Region: ").Append(Region).Append("\n");
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
            return this.Equals(input as CreateLobbyRequest);
        }

        /// <summary>
        /// Returns true if CreateLobbyRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateLobbyRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateLobbyRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Visibility == input.Visibility ||
                    this.Visibility.Equals(input.Visibility)
                ) && 
                (
                    this.InitialConfig == input.InitialConfig ||
                    (this.InitialConfig != null &&
                    this.InitialConfig.Equals(input.InitialConfig))
                ) && 
                (
                    this.Region == input.Region ||
                    this.Region.Equals(input.Region)
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
                hashCode = (hashCode * 59) + this.Visibility.GetHashCode();
                if (this.InitialConfig != null)
                {
                    hashCode = (hashCode * 59) + this.InitialConfig.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Region.GetHashCode();
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

    }

}