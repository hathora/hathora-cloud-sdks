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
    /// CreateBuildRequest
    /// </summary>
    [DataContract(Name = "CreateBuildRequest")]
    public partial class CreateBuildRequest : IEquatable<CreateBuildRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateBuildRequest" /> class.
        /// </summary>
        /// <param name="buildTag">Tag to associate an external version with a build. It is accessible via [&#x60;GetBuildInfo()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/GetBuildInfo)..</param>
        public CreateBuildRequest(string buildTag = default(string))
        {
            this.BuildTag = buildTag;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Tag to associate an external version with a build. It is accessible via [&#x60;GetBuildInfo()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/GetBuildInfo).
        /// </summary>
        /// <value>Tag to associate an external version with a build. It is accessible via [&#x60;GetBuildInfo()&#x60;](https://hathora.dev/api#tag/BuildV1/operation/GetBuildInfo).</value>
        /// <example>&quot;0.1.14-14c793&quot;</example>
        [DataMember(Name = "buildTag", EmitDefaultValue = false)]
        public string BuildTag { get; set; }

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
            sb.Append("class CreateBuildRequest {\n");
            sb.Append("  BuildTag: ").Append(BuildTag).Append("\n");
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
            return this.Equals(input as CreateBuildRequest);
        }

        /// <summary>
        /// Returns true if CreateBuildRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateBuildRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateBuildRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BuildTag == input.BuildTag ||
                    (this.BuildTag != null &&
                    this.BuildTag.Equals(input.BuildTag))
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
                if (this.BuildTag != null)
                {
                    hashCode = (hashCode * 59) + this.BuildTag.GetHashCode();
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