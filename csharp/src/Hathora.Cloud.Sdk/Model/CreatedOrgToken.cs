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
    /// CreatedOrgToken
    /// </summary>
    [DataContract(Name = "CreatedOrgToken")]
    public partial class CreatedOrgToken : IEquatable<CreatedOrgToken>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreatedOrgToken" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreatedOrgToken()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreatedOrgToken" /> class.
        /// </summary>
        /// <param name="plainTextToken">plainTextToken (required).</param>
        /// <param name="orgToken">orgToken (required).</param>
        public CreatedOrgToken(string plainTextToken = default(string), OrgToken orgToken = default(OrgToken))
        {
            // to ensure "plainTextToken" is required (not null)
            if (plainTextToken == null)
            {
                throw new ArgumentNullException("plainTextToken is a required property for CreatedOrgToken and cannot be null");
            }
            this.PlainTextToken = plainTextToken;
            // to ensure "orgToken" is required (not null)
            if (orgToken == null)
            {
                throw new ArgumentNullException("orgToken is a required property for CreatedOrgToken and cannot be null");
            }
            this.OrgToken = orgToken;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets PlainTextToken
        /// </summary>
        [DataMember(Name = "plainTextToken", IsRequired = true, EmitDefaultValue = true)]
        public string PlainTextToken { get; set; }

        /// <summary>
        /// Gets or Sets OrgToken
        /// </summary>
        [DataMember(Name = "orgToken", IsRequired = true, EmitDefaultValue = true)]
        public OrgToken OrgToken { get; set; }

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
            sb.Append("class CreatedOrgToken {\n");
            sb.Append("  PlainTextToken: ").Append(PlainTextToken).Append("\n");
            sb.Append("  OrgToken: ").Append(OrgToken).Append("\n");
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
            return this.Equals(input as CreatedOrgToken);
        }

        /// <summary>
        /// Returns true if CreatedOrgToken instances are equal
        /// </summary>
        /// <param name="input">Instance of CreatedOrgToken to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreatedOrgToken input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PlainTextToken == input.PlainTextToken ||
                    (this.PlainTextToken != null &&
                    this.PlainTextToken.Equals(input.PlainTextToken))
                ) && 
                (
                    this.OrgToken == input.OrgToken ||
                    (this.OrgToken != null &&
                    this.OrgToken.Equals(input.OrgToken))
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
                if (this.PlainTextToken != null)
                {
                    hashCode = (hashCode * 59) + this.PlainTextToken.GetHashCode();
                }
                if (this.OrgToken != null)
                {
                    hashCode = (hashCode * 59) + this.OrgToken.GetHashCode();
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
