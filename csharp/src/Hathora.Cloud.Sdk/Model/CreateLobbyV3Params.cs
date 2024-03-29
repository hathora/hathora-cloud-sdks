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
    /// CreateLobbyV3Params
    /// </summary>
    [DataContract(Name = "CreateLobbyV3Params")]
    public partial class CreateLobbyV3Params : IEquatable<CreateLobbyV3Params>
    {

        /// <summary>
        /// Gets or Sets Visibility
        /// </summary>
        [DataMember(Name = "visibility", IsRequired = true, EmitDefaultValue = true)]
        public LobbyVisibility Visibility { get; set; }

        /// <summary>
        /// Gets or Sets Region
        /// </summary>
        [DataMember(Name = "region", IsRequired = true, EmitDefaultValue = true)]
        public Region Region { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateLobbyV3Params" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateLobbyV3Params()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateLobbyV3Params" /> class.
        /// </summary>
        /// <param name="visibility">visibility (required).</param>
        /// <param name="roomConfig">Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo)..</param>
        /// <param name="region">region (required).</param>
        public CreateLobbyV3Params(LobbyVisibility visibility = default(LobbyVisibility), string roomConfig = default(string), Region region = default(Region))
        {
            this.Visibility = visibility;
            this.Region = region;
            this.RoomConfig = roomConfig;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
        /// </summary>
        /// <value>Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).</value>
        /// <example>&quot;{&quot;name&quot;:&quot;my-room&quot;}&quot;</example>
        [DataMember(Name = "roomConfig", EmitDefaultValue = false)]
        public string RoomConfig { get; set; }

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
            sb.Append("class CreateLobbyV3Params {\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
            sb.Append("  RoomConfig: ").Append(RoomConfig).Append("\n");
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
            return this.Equals(input as CreateLobbyV3Params);
        }

        /// <summary>
        /// Returns true if CreateLobbyV3Params instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateLobbyV3Params to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateLobbyV3Params input)
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
                    this.RoomConfig == input.RoomConfig ||
                    (this.RoomConfig != null &&
                    this.RoomConfig.Equals(input.RoomConfig))
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
                if (this.RoomConfig != null)
                {
                    hashCode = (hashCode * 59) + this.RoomConfig.GetHashCode();
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
