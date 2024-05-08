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
    /// A lobby object allows you to store and manage metadata for your rooms.
    /// </summary>
    [DataContract(Name = "LobbyV3")]
    public partial class LobbyV3 : IEquatable<LobbyV3>
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
        /// Initializes a new instance of the <see cref="LobbyV3" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LobbyV3()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="LobbyV3" /> class.
        /// </summary>
        /// <param name="shortCode">User-defined identifier for a lobby. (required).</param>
        /// <param name="createdAt">When the lobby was created. (required).</param>
        /// <param name="createdBy">UserId or email address for the user that created the lobby. (required).</param>
        /// <param name="roomConfig">Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo). (required).</param>
        /// <param name="visibility">visibility (required).</param>
        /// <param name="region">region (required).</param>
        /// <param name="roomId">Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique. (required).</param>
        /// <param name="appId">System generated unique identifier for an application. (required).</param>
        public LobbyV3(string shortCode = default(string), DateTime createdAt = default(DateTime), string createdBy = default(string), string roomConfig = default(string), LobbyVisibility visibility = default(LobbyVisibility), Region region = default(Region), string roomId = default(string), string appId = default(string))
        {
            // to ensure "shortCode" is required (not null)
            if (shortCode == null)
            {
                throw new ArgumentNullException("shortCode is a required property for LobbyV3 and cannot be null");
            }
            this.ShortCode = shortCode;
            this.CreatedAt = createdAt;
            // to ensure "createdBy" is required (not null)
            if (createdBy == null)
            {
                throw new ArgumentNullException("createdBy is a required property for LobbyV3 and cannot be null");
            }
            this.CreatedBy = createdBy;
            // to ensure "roomConfig" is required (not null)
            if (roomConfig == null)
            {
                throw new ArgumentNullException("roomConfig is a required property for LobbyV3 and cannot be null");
            }
            this.RoomConfig = roomConfig;
            this.Visibility = visibility;
            this.Region = region;
            // to ensure "roomId" is required (not null)
            if (roomId == null)
            {
                throw new ArgumentNullException("roomId is a required property for LobbyV3 and cannot be null");
            }
            this.RoomId = roomId;
            // to ensure "appId" is required (not null)
            if (appId == null)
            {
                throw new ArgumentNullException("appId is a required property for LobbyV3 and cannot be null");
            }
            this.AppId = appId;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// User-defined identifier for a lobby.
        /// </summary>
        /// <value>User-defined identifier for a lobby.</value>
        /// <example>&quot;LFG4&quot;</example>
        [DataMember(Name = "shortCode", IsRequired = true, EmitDefaultValue = true)]
        public string ShortCode { get; set; }

        /// <summary>
        /// When the lobby was created.
        /// </summary>
        /// <value>When the lobby was created.</value>
        [DataMember(Name = "createdAt", IsRequired = true, EmitDefaultValue = true)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// UserId or email address for the user that created the lobby.
        /// </summary>
        /// <value>UserId or email address for the user that created the lobby.</value>
        /// <example>&quot;google-oauth2|107030234048588177467&quot;</example>
        [DataMember(Name = "createdBy", IsRequired = true, EmitDefaultValue = true)]
        public string CreatedBy { get; set; }

        /// <summary>
        /// Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
        /// </summary>
        /// <value>Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [&#x60;GetRoomInfo()&#x60;](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).</value>
        /// <example>&quot;{&quot;name&quot;:&quot;my-room&quot;}&quot;</example>
        [DataMember(Name = "roomConfig", IsRequired = true, EmitDefaultValue = true)]
        public string RoomConfig { get; set; }

        /// <summary>
        /// Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique.
        /// </summary>
        /// <value>Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own. Note: error will be returned if &#x60;roomId&#x60; is not globally unique.</value>
        /// <example>&quot;2swovpy1fnunu&quot;</example>
        [DataMember(Name = "roomId", IsRequired = true, EmitDefaultValue = true)]
        public string RoomId { get; set; }

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
            sb.Append("class LobbyV3 {\n");
            sb.Append("  ShortCode: ").Append(ShortCode).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CreatedBy: ").Append(CreatedBy).Append("\n");
            sb.Append("  RoomConfig: ").Append(RoomConfig).Append("\n");
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
            return this.Equals(input as LobbyV3);
        }

        /// <summary>
        /// Returns true if LobbyV3 instances are equal
        /// </summary>
        /// <param name="input">Instance of LobbyV3 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LobbyV3 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ShortCode == input.ShortCode ||
                    (this.ShortCode != null &&
                    this.ShortCode.Equals(input.ShortCode))
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
                    this.RoomConfig == input.RoomConfig ||
                    (this.RoomConfig != null &&
                    this.RoomConfig.Equals(input.RoomConfig))
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
                if (this.ShortCode != null)
                {
                    hashCode = (hashCode * 59) + this.ShortCode.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.CreatedBy != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedBy.GetHashCode();
                }
                if (this.RoomConfig != null)
                {
                    hashCode = (hashCode * 59) + this.RoomConfig.GetHashCode();
                }
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

    }

}