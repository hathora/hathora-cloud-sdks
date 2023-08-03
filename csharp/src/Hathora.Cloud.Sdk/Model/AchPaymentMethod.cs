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
    /// AchPaymentMethod
    /// </summary>
    [DataContract(Name = "AchPaymentMethod")]
    public partial class AchPaymentMethod : IEquatable<AchPaymentMethod>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AchPaymentMethod" /> class.
        /// </summary>
        /// <param name="last4">last4.</param>
        /// <param name="bankName">bankName.</param>
        public AchPaymentMethod(string last4 = default(string), string bankName = default(string))
        {
            this.Last4 = last4;
            this.BankName = bankName;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Last4
        /// </summary>
        [DataMember(Name = "last4", EmitDefaultValue = false)]
        public string Last4 { get; set; }

        /// <summary>
        /// Gets or Sets BankName
        /// </summary>
        [DataMember(Name = "bankName", EmitDefaultValue = false)]
        public string BankName { get; set; }

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
            sb.Append("class AchPaymentMethod {\n");
            sb.Append("  Last4: ").Append(Last4).Append("\n");
            sb.Append("  BankName: ").Append(BankName).Append("\n");
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
            return this.Equals(input as AchPaymentMethod);
        }

        /// <summary>
        /// Returns true if AchPaymentMethod instances are equal
        /// </summary>
        /// <param name="input">Instance of AchPaymentMethod to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AchPaymentMethod input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Last4 == input.Last4 ||
                    (this.Last4 != null &&
                    this.Last4.Equals(input.Last4))
                ) && 
                (
                    this.BankName == input.BankName ||
                    (this.BankName != null &&
                    this.BankName.Equals(input.BankName))
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
                if (this.Last4 != null)
                {
                    hashCode = (hashCode * 59) + this.Last4.GetHashCode();
                }
                if (this.BankName != null)
                {
                    hashCode = (hashCode * 59) + this.BankName.GetHashCode();
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