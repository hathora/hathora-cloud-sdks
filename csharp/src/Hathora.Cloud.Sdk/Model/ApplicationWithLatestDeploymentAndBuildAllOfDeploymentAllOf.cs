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
    /// ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf
    /// </summary>
    [DataContract(Name = "ApplicationWithLatestDeploymentAndBuild_allOf_deployment_allOf")]
    public partial class ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf : IEquatable<ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf" /> class.
        /// </summary>
        /// <param name="build">build (required).</param>
        public ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf(Build build = default(Build))
        {
            // to ensure "build" is required (not null)
            if (build == null)
            {
                throw new ArgumentNullException("build is a required property for ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf and cannot be null");
            }
            this.Build = build;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Build
        /// </summary>
        [DataMember(Name = "build", IsRequired = true, EmitDefaultValue = true)]
        public Build Build { get; set; }

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
            sb.Append("class ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf {\n");
            sb.Append("  Build: ").Append(Build).Append("\n");
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
            return this.Equals(input as ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf);
        }

        /// <summary>
        /// Returns true if ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Build == input.Build ||
                    (this.Build != null &&
                    this.Build.Equals(input.Build))
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
                if (this.Build != null)
                {
                    hashCode = (hashCode * 59) + this.Build.GetHashCode();
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