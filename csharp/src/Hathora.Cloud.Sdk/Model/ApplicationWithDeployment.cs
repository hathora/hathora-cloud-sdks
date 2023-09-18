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
    /// ApplicationWithDeployment
    /// </summary>
    [DataContract(Name = "ApplicationWithDeployment")]
    public partial class ApplicationWithDeployment : IEquatable<ApplicationWithDeployment>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApplicationWithDeployment" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ApplicationWithDeployment()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ApplicationWithDeployment" /> class.
        /// </summary>
        /// <param name="deletedBy">Email address for the user that deleted the application. (required).</param>
        /// <param name="deletedAt">When the application was deleted. (required).</param>
        /// <param name="createdAt">When the application was created. (required).</param>
        /// <param name="createdBy">Email address for the user that deleted the application. (required).</param>
        /// <param name="orgId">System generated unique identifier for an organization. (required).</param>
        /// <param name="authConfiguration">authConfiguration (required).</param>
        /// <param name="appSecret">Secret that is used for identity and access management. (required).</param>
        /// <param name="appId">System generated unique identifier for an application. (required).</param>
        /// <param name="appName">Readable name for an application. Must be unique within an organization. (required).</param>
        /// <param name="deployment">deployment (required).</param>
        public ApplicationWithDeployment(string deletedBy = default(string), DateTime? deletedAt = default(DateTime?), DateTime createdAt = default(DateTime), string createdBy = default(string), string orgId = default(string), AuthConfiguration authConfiguration = default(AuthConfiguration), string appSecret = default(string), string appId = default(string), string appName = default(string), Deployment deployment = default(Deployment))
        {
            // to ensure "deletedBy" is required (not null)
            if (deletedBy == null)
            {
                throw new ArgumentNullException("deletedBy is a required property for ApplicationWithDeployment and cannot be null");
            }
            this.DeletedBy = deletedBy;
            // to ensure "deletedAt" is required (not null)
            if (deletedAt == null)
            {
                throw new ArgumentNullException("deletedAt is a required property for ApplicationWithDeployment and cannot be null");
            }
            this.DeletedAt = deletedAt;
            this.CreatedAt = createdAt;
            // to ensure "createdBy" is required (not null)
            if (createdBy == null)
            {
                throw new ArgumentNullException("createdBy is a required property for ApplicationWithDeployment and cannot be null");
            }
            this.CreatedBy = createdBy;
            // to ensure "orgId" is required (not null)
            if (orgId == null)
            {
                throw new ArgumentNullException("orgId is a required property for ApplicationWithDeployment and cannot be null");
            }
            this.OrgId = orgId;
            // to ensure "authConfiguration" is required (not null)
            if (authConfiguration == null)
            {
                throw new ArgumentNullException("authConfiguration is a required property for ApplicationWithDeployment and cannot be null");
            }
            this.AuthConfiguration = authConfiguration;
            // to ensure "appSecret" is required (not null)
            if (appSecret == null)
            {
                throw new ArgumentNullException("appSecret is a required property for ApplicationWithDeployment and cannot be null");
            }
            this.AppSecret = appSecret;
            // to ensure "appId" is required (not null)
            if (appId == null)
            {
                throw new ArgumentNullException("appId is a required property for ApplicationWithDeployment and cannot be null");
            }
            this.AppId = appId;
            // to ensure "appName" is required (not null)
            if (appName == null)
            {
                throw new ArgumentNullException("appName is a required property for ApplicationWithDeployment and cannot be null");
            }
            this.AppName = appName;
            // to ensure "deployment" is required (not null)
            if (deployment == null)
            {
                throw new ArgumentNullException("deployment is a required property for ApplicationWithDeployment and cannot be null");
            }
            this.Deployment = deployment;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Email address for the user that deleted the application.
        /// </summary>
        /// <value>Email address for the user that deleted the application.</value>
        /// <example>&quot;dev@hathora.dev&quot;</example>
        [DataMember(Name = "deletedBy", IsRequired = true, EmitDefaultValue = true)]
        public string DeletedBy { get; set; }

        /// <summary>
        /// When the application was deleted.
        /// </summary>
        /// <value>When the application was deleted.</value>
        [DataMember(Name = "deletedAt", IsRequired = true, EmitDefaultValue = true)]
        public DateTime? DeletedAt { get; set; }

        /// <summary>
        /// When the application was created.
        /// </summary>
        /// <value>When the application was created.</value>
        [DataMember(Name = "createdAt", IsRequired = true, EmitDefaultValue = true)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Email address for the user that deleted the application.
        /// </summary>
        /// <value>Email address for the user that deleted the application.</value>
        /// <example>&quot;dev@hathora.dev&quot;</example>
        [DataMember(Name = "createdBy", IsRequired = true, EmitDefaultValue = true)]
        public string CreatedBy { get; set; }

        /// <summary>
        /// System generated unique identifier for an organization.
        /// </summary>
        /// <value>System generated unique identifier for an organization.</value>
        /// <example>&quot;google-oauth2|107030234048588177467&quot;</example>
        [DataMember(Name = "orgId", IsRequired = true, EmitDefaultValue = true)]
        public string OrgId { get; set; }

        /// <summary>
        /// Gets or Sets AuthConfiguration
        /// </summary>
        [DataMember(Name = "authConfiguration", IsRequired = true, EmitDefaultValue = true)]
        public AuthConfiguration AuthConfiguration { get; set; }

        /// <summary>
        /// Secret that is used for identity and access management.
        /// </summary>
        /// <value>Secret that is used for identity and access management.</value>
        /// <example>&quot;secret-6f706e83-0ec1-437a-9a46-7d4281eb2f39&quot;</example>
        [DataMember(Name = "appSecret", IsRequired = true, EmitDefaultValue = true)]
        public string AppSecret { get; set; }

        /// <summary>
        /// System generated unique identifier for an application.
        /// </summary>
        /// <value>System generated unique identifier for an application.</value>
        /// <example>&quot;app-af469a92-5b45-4565-b3c4-b79878de67d2&quot;</example>
        [DataMember(Name = "appId", IsRequired = true, EmitDefaultValue = true)]
        public string AppId { get; set; }

        /// <summary>
        /// Readable name for an application. Must be unique within an organization.
        /// </summary>
        /// <value>Readable name for an application. Must be unique within an organization.</value>
        /// <example>&quot;minecraft&quot;</example>
        [DataMember(Name = "appName", IsRequired = true, EmitDefaultValue = true)]
        public string AppName { get; set; }

        /// <summary>
        /// Gets or Sets Deployment
        /// </summary>
        [DataMember(Name = "deployment", IsRequired = true, EmitDefaultValue = true)]
        public Deployment Deployment { get; set; }

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
            sb.Append("class ApplicationWithDeployment {\n");
            sb.Append("  DeletedBy: ").Append(DeletedBy).Append("\n");
            sb.Append("  DeletedAt: ").Append(DeletedAt).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CreatedBy: ").Append(CreatedBy).Append("\n");
            sb.Append("  OrgId: ").Append(OrgId).Append("\n");
            sb.Append("  AuthConfiguration: ").Append(AuthConfiguration).Append("\n");
            sb.Append("  AppSecret: ").Append(AppSecret).Append("\n");
            sb.Append("  AppId: ").Append(AppId).Append("\n");
            sb.Append("  AppName: ").Append(AppName).Append("\n");
            sb.Append("  Deployment: ").Append(Deployment).Append("\n");
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
            return this.Equals(input as ApplicationWithDeployment);
        }

        /// <summary>
        /// Returns true if ApplicationWithDeployment instances are equal
        /// </summary>
        /// <param name="input">Instance of ApplicationWithDeployment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApplicationWithDeployment input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DeletedBy == input.DeletedBy ||
                    (this.DeletedBy != null &&
                    this.DeletedBy.Equals(input.DeletedBy))
                ) && 
                (
                    this.DeletedAt == input.DeletedAt ||
                    (this.DeletedAt != null &&
                    this.DeletedAt.Equals(input.DeletedAt))
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
                    this.OrgId == input.OrgId ||
                    (this.OrgId != null &&
                    this.OrgId.Equals(input.OrgId))
                ) && 
                (
                    this.AuthConfiguration == input.AuthConfiguration ||
                    (this.AuthConfiguration != null &&
                    this.AuthConfiguration.Equals(input.AuthConfiguration))
                ) && 
                (
                    this.AppSecret == input.AppSecret ||
                    (this.AppSecret != null &&
                    this.AppSecret.Equals(input.AppSecret))
                ) && 
                (
                    this.AppId == input.AppId ||
                    (this.AppId != null &&
                    this.AppId.Equals(input.AppId))
                ) && 
                (
                    this.AppName == input.AppName ||
                    (this.AppName != null &&
                    this.AppName.Equals(input.AppName))
                ) && 
                (
                    this.Deployment == input.Deployment ||
                    (this.Deployment != null &&
                    this.Deployment.Equals(input.Deployment))
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
                if (this.DeletedBy != null)
                {
                    hashCode = (hashCode * 59) + this.DeletedBy.GetHashCode();
                }
                if (this.DeletedAt != null)
                {
                    hashCode = (hashCode * 59) + this.DeletedAt.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.CreatedBy != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedBy.GetHashCode();
                }
                if (this.OrgId != null)
                {
                    hashCode = (hashCode * 59) + this.OrgId.GetHashCode();
                }
                if (this.AuthConfiguration != null)
                {
                    hashCode = (hashCode * 59) + this.AuthConfiguration.GetHashCode();
                }
                if (this.AppSecret != null)
                {
                    hashCode = (hashCode * 59) + this.AppSecret.GetHashCode();
                }
                if (this.AppId != null)
                {
                    hashCode = (hashCode * 59) + this.AppId.GetHashCode();
                }
                if (this.AppName != null)
                {
                    hashCode = (hashCode * 59) + this.AppName.GetHashCode();
                }
                if (this.Deployment != null)
                {
                    hashCode = (hashCode * 59) + this.Deployment.GetHashCode();
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
