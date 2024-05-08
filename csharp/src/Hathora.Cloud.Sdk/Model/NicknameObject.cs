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
    /// NicknameObject
    /// </summary>
    [DataContract(Name = "NicknameObject")]
    public partial class NicknameObject : IEquatable<NicknameObject>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NicknameObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NicknameObject()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="NicknameObject" /> class.
        /// </summary>
        /// <param name="nickname">An alias to represent a player. (required).</param>
        public NicknameObject(string nickname = default(string))
        {
            // to ensure "nickname" is required (not null)
            if (nickname == null)
            {
                throw new ArgumentNullException("nickname is a required property for NicknameObject and cannot be null");
            }
            this.Nickname = nickname;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// An alias to represent a player.
        /// </summary>
        /// <value>An alias to represent a player.</value>
        /// <example>&quot;squiddytwoshoes&quot;</example>
        [DataMember(Name = "nickname", IsRequired = true, EmitDefaultValue = true)]
        public string Nickname { get; set; }

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
            sb.Append("class NicknameObject {\n");
            sb.Append("  Nickname: ").Append(Nickname).Append("\n");
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
            return this.Equals(input as NicknameObject);
        }

        /// <summary>
        /// Returns true if NicknameObject instances are equal
        /// </summary>
        /// <param name="input">Instance of NicknameObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NicknameObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Nickname == input.Nickname ||
                    (this.Nickname != null &&
                    this.Nickname.Equals(input.Nickname))
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
                if (this.Nickname != null)
                {
                    hashCode = (hashCode * 59) + this.Nickname.GetHashCode();
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
