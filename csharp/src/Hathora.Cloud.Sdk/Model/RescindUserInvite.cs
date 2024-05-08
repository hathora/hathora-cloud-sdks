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
    /// RescindUserInvite
    /// </summary>
    [DataContract(Name = "RescindUserInvite")]
    public partial class RescindUserInvite : IEquatable<RescindUserInvite>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RescindUserInvite" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RescindUserInvite()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="RescindUserInvite" /> class.
        /// </summary>
        /// <param name="userEmail">userEmail (required).</param>
        public RescindUserInvite(string userEmail = default(string))
        {
            // to ensure "userEmail" is required (not null)
            if (userEmail == null)
            {
                throw new ArgumentNullException("userEmail is a required property for RescindUserInvite and cannot be null");
            }
            this.UserEmail = userEmail;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets UserEmail
        /// </summary>
        [DataMember(Name = "userEmail", IsRequired = true, EmitDefaultValue = true)]
        public string UserEmail { get; set; }

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
            sb.Append("class RescindUserInvite {\n");
            sb.Append("  UserEmail: ").Append(UserEmail).Append("\n");
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
            return this.Equals(input as RescindUserInvite);
        }

        /// <summary>
        /// Returns true if RescindUserInvite instances are equal
        /// </summary>
        /// <param name="input">Instance of RescindUserInvite to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RescindUserInvite input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.UserEmail == input.UserEmail ||
                    (this.UserEmail != null &&
                    this.UserEmail.Equals(input.UserEmail))
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
                if (this.UserEmail != null)
                {
                    hashCode = (hashCode * 59) + this.UserEmail.GetHashCode();
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
