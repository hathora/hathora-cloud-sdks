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
    /// Connection information for the default and additional ports.
    /// </summary>
    [DataContract(Name = "ConnectionInfoV2")]
    public partial class ConnectionInfoV2 : IEquatable<ConnectionInfoV2>
    {
        /// <summary>
        /// &#x60;exposedPort&#x60; will only be available when the &#x60;status&#x60; of a room is \&quot;active\&quot;.
        /// </summary>
        /// <value>&#x60;exposedPort&#x60; will only be available when the &#x60;status&#x60; of a room is \&quot;active\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum Starting for value: starting
            /// </summary>
            [EnumMember(Value = "starting")]
            Starting = 1,

            /// <summary>
            /// Enum Active for value: active
            /// </summary>
            [EnumMember(Value = "active")]
            Active = 2

        }


        /// <summary>
        /// &#x60;exposedPort&#x60; will only be available when the &#x60;status&#x60; of a room is \&quot;active\&quot;.
        /// </summary>
        /// <value>&#x60;exposedPort&#x60; will only be available when the &#x60;status&#x60; of a room is \&quot;active\&quot;.</value>
        /// <example>&quot;active&quot;</example>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public StatusEnum Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionInfoV2" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ConnectionInfoV2()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionInfoV2" /> class.
        /// </summary>
        /// <param name="additionalExposedPorts">additionalExposedPorts (required).</param>
        /// <param name="exposedPort">exposedPort.</param>
        /// <param name="status">&#x60;exposedPort&#x60; will only be available when the &#x60;status&#x60; of a room is \&quot;active\&quot;. (required).</param>
        /// <param name="roomId">Unique identifier to a game session or match. Use either a system generated ID or pass in your own. (required).</param>
        public ConnectionInfoV2(List<ExposedPort> additionalExposedPorts = default(List<ExposedPort>), ExposedPort exposedPort = default(ExposedPort), StatusEnum status = default(StatusEnum), string roomId = default(string))
        {
            // to ensure "additionalExposedPorts" is required (not null)
            if (additionalExposedPorts == null)
            {
                throw new ArgumentNullException("additionalExposedPorts is a required property for ConnectionInfoV2 and cannot be null");
            }
            this.AdditionalExposedPorts = additionalExposedPorts;
            this.Status = status;
            // to ensure "roomId" is required (not null)
            if (roomId == null)
            {
                throw new ArgumentNullException("roomId is a required property for ConnectionInfoV2 and cannot be null");
            }
            this.RoomId = roomId;
            this.ExposedPort = exposedPort;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets AdditionalExposedPorts
        /// </summary>
        [DataMember(Name = "additionalExposedPorts", IsRequired = true, EmitDefaultValue = true)]
        public List<ExposedPort> AdditionalExposedPorts { get; set; }

        /// <summary>
        /// Gets or Sets ExposedPort
        /// </summary>
        [DataMember(Name = "exposedPort", EmitDefaultValue = false)]
        public ExposedPort ExposedPort { get; set; }

        /// <summary>
        /// Unique identifier to a game session or match. Use either a system generated ID or pass in your own.
        /// </summary>
        /// <value>Unique identifier to a game session or match. Use either a system generated ID or pass in your own.</value>
        /// <example>&quot;2swovpy1fnunu&quot;</example>
        [DataMember(Name = "roomId", IsRequired = true, EmitDefaultValue = true)]
        public string RoomId { get; set; }

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
            sb.Append("class ConnectionInfoV2 {\n");
            sb.Append("  AdditionalExposedPorts: ").Append(AdditionalExposedPorts).Append("\n");
            sb.Append("  ExposedPort: ").Append(ExposedPort).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  RoomId: ").Append(RoomId).Append("\n");
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
            return this.Equals(input as ConnectionInfoV2);
        }

        /// <summary>
        /// Returns true if ConnectionInfoV2 instances are equal
        /// </summary>
        /// <param name="input">Instance of ConnectionInfoV2 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConnectionInfoV2 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AdditionalExposedPorts == input.AdditionalExposedPorts ||
                    this.AdditionalExposedPorts != null &&
                    input.AdditionalExposedPorts != null &&
                    this.AdditionalExposedPorts.SequenceEqual(input.AdditionalExposedPorts)
                ) && 
                (
                    this.ExposedPort == input.ExposedPort ||
                    (this.ExposedPort != null &&
                    this.ExposedPort.Equals(input.ExposedPort))
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.RoomId == input.RoomId ||
                    (this.RoomId != null &&
                    this.RoomId.Equals(input.RoomId))
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
                if (this.AdditionalExposedPorts != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalExposedPorts.GetHashCode();
                }
                if (this.ExposedPort != null)
                {
                    hashCode = (hashCode * 59) + this.ExposedPort.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.RoomId != null)
                {
                    hashCode = (hashCode * 59) + this.RoomId.GetHashCode();
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
