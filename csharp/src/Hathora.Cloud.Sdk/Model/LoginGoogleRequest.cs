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
    /// LoginGoogleRequest
    /// </summary>
    [DataContract(Name = "LoginGoogleRequest")]
    public partial class LoginGoogleRequest : IEquatable<LoginGoogleRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LoginGoogleRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LoginGoogleRequest()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="LoginGoogleRequest" /> class.
        /// </summary>
        /// <param name="idToken">A Google-signed OIDC ID token representing a player&#39;s authenticated identity. Learn how to get an &#x60;idToken&#x60; [here](https://cloud.google.com/docs/authentication/get-id-token). (required).</param>
        public LoginGoogleRequest(string idToken = default(string))
        {
            // to ensure "idToken" is required (not null)
            if (idToken == null)
            {
                throw new ArgumentNullException("idToken is a required property for LoginGoogleRequest and cannot be null");
            }
            this.IdToken = idToken;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// A Google-signed OIDC ID token representing a player&#39;s authenticated identity. Learn how to get an &#x60;idToken&#x60; [here](https://cloud.google.com/docs/authentication/get-id-token).
        /// </summary>
        /// <value>A Google-signed OIDC ID token representing a player&#39;s authenticated identity. Learn how to get an &#x60;idToken&#x60; [here](https://cloud.google.com/docs/authentication/get-id-token).</value>
        /// <example>&quot;eyJhbGciOiJSUzI1NiIsImtpZCI6ImZkNDhhNzUxMzhkOWQ0OGYwYWE2MzVlZjU2OWM0ZTE5NmY3YWU4ZDYiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJhY2NvdW50cy5nb29nbGUuY29tIiwiYXpwIjoiODQ4NDEyODI2Nzg4LW00bXNyYjZxNDRkbTJ1ZTNrZ3Z1aTBmcTdrZGE1NWxzLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiYXVkIjoiODQ4NDEyODI2Nzg4LW00bXNyYjZxNDRkbTJ1ZTNrZ3Z1aTBmcTdrZGE1NWxzLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwic3ViIjoiMTE0NTQyMzMwNzI3MTU2MTMzNzc2IiwiZW1haWwiOiJocGFdkeivmeuzQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJhdF9oYXNoIjoidno1NGhhdTNxbnVR&quot;</example>
        [DataMember(Name = "idToken", IsRequired = true, EmitDefaultValue = true)]
        public string IdToken { get; set; }

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
            sb.Append("class LoginGoogleRequest {\n");
            sb.Append("  IdToken: ").Append(IdToken).Append("\n");
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
            return this.Equals(input as LoginGoogleRequest);
        }

        /// <summary>
        /// Returns true if LoginGoogleRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of LoginGoogleRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LoginGoogleRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IdToken == input.IdToken ||
                    (this.IdToken != null &&
                    this.IdToken.Equals(input.IdToken))
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
                if (this.IdToken != null)
                {
                    hashCode = (hashCode * 59) + this.IdToken.GetHashCode();
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
