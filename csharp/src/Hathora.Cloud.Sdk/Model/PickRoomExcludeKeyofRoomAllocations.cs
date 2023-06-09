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
    /// From T, pick a set of properties whose keys are in the union K
    /// </summary>
    [DataContract(Name = "Pick_Room.Exclude_keyofRoom.allocations__")]
    public partial class PickRoomExcludeKeyofRoomAllocations : IEquatable<PickRoomExcludeKeyofRoomAllocations>
    {

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public RoomStatus Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PickRoomExcludeKeyofRoomAllocations" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PickRoomExcludeKeyofRoomAllocations()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="PickRoomExcludeKeyofRoomAllocations" /> class.
        /// </summary>
        /// <param name="appId">appId (required).</param>
        /// <param name="roomId">roomId (required).</param>
        /// <param name="status">status (required).</param>
        /// <param name="currentAllocation">currentAllocation (required).</param>
        public PickRoomExcludeKeyofRoomAllocations(string appId = default(string), string roomId = default(string), RoomStatus status = default(RoomStatus), RoomAllocation currentAllocation = default(RoomAllocation))
        {
            // to ensure "appId" is required (not null)
            if (appId == null)
            {
                throw new ArgumentNullException("appId is a required property for PickRoomExcludeKeyofRoomAllocations and cannot be null");
            }
            this.AppId = appId;
            // to ensure "roomId" is required (not null)
            if (roomId == null)
            {
                throw new ArgumentNullException("roomId is a required property for PickRoomExcludeKeyofRoomAllocations and cannot be null");
            }
            this.RoomId = roomId;
            this.Status = status;
            // to ensure "currentAllocation" is required (not null)
            if (currentAllocation == null)
            {
                throw new ArgumentNullException("currentAllocation is a required property for PickRoomExcludeKeyofRoomAllocations and cannot be null");
            }
            this.CurrentAllocation = currentAllocation;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets AppId
        /// </summary>
        [DataMember(Name = "appId", IsRequired = true, EmitDefaultValue = true)]
        public string AppId { get; set; }

        /// <summary>
        /// Gets or Sets RoomId
        /// </summary>
        [DataMember(Name = "roomId", IsRequired = true, EmitDefaultValue = true)]
        public string RoomId { get; set; }

        /// <summary>
        /// Gets or Sets CurrentAllocation
        /// </summary>
        [DataMember(Name = "currentAllocation", IsRequired = true, EmitDefaultValue = true)]
        public RoomAllocation CurrentAllocation { get; set; }

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
            sb.Append("class PickRoomExcludeKeyofRoomAllocations {\n");
            sb.Append("  AppId: ").Append(AppId).Append("\n");
            sb.Append("  RoomId: ").Append(RoomId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  CurrentAllocation: ").Append(CurrentAllocation).Append("\n");
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
            return this.Equals(input as PickRoomExcludeKeyofRoomAllocations);
        }

        /// <summary>
        /// Returns true if PickRoomExcludeKeyofRoomAllocations instances are equal
        /// </summary>
        /// <param name="input">Instance of PickRoomExcludeKeyofRoomAllocations to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PickRoomExcludeKeyofRoomAllocations input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AppId == input.AppId ||
                    (this.AppId != null &&
                    this.AppId.Equals(input.AppId))
                ) && 
                (
                    this.RoomId == input.RoomId ||
                    (this.RoomId != null &&
                    this.RoomId.Equals(input.RoomId))
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.CurrentAllocation == input.CurrentAllocation ||
                    (this.CurrentAllocation != null &&
                    this.CurrentAllocation.Equals(input.CurrentAllocation))
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
                if (this.AppId != null)
                {
                    hashCode = (hashCode * 59) + this.AppId.GetHashCode();
                }
                if (this.RoomId != null)
                {
                    hashCode = (hashCode * 59) + this.RoomId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.CurrentAllocation != null)
                {
                    hashCode = (hashCode * 59) + this.CurrentAllocation.GetHashCode();
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
