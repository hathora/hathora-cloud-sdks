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
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Hathora.Cloud.Sdk.Client.OpenAPIDateConverter;

namespace Hathora.Cloud.Sdk.Model
{
    /// <summary>
    /// Defines Region
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Region
    {
        /// <summary>
        /// Enum Seattle for value: Seattle
        /// </summary>
        [EnumMember(Value = "Seattle")]
        Seattle = 1,

        /// <summary>
        /// Enum WashingtonDC for value: Washington_DC
        /// </summary>
        [EnumMember(Value = "Washington_DC")]
        WashingtonDC = 2,

        /// <summary>
        /// Enum Chicago for value: Chicago
        /// </summary>
        [EnumMember(Value = "Chicago")]
        Chicago = 3,

        /// <summary>
        /// Enum London for value: London
        /// </summary>
        [EnumMember(Value = "London")]
        London = 4,

        /// <summary>
        /// Enum Frankfurt for value: Frankfurt
        /// </summary>
        [EnumMember(Value = "Frankfurt")]
        Frankfurt = 5,

        /// <summary>
        /// Enum Mumbai for value: Mumbai
        /// </summary>
        [EnumMember(Value = "Mumbai")]
        Mumbai = 6,

        /// <summary>
        /// Enum Singapore for value: Singapore
        /// </summary>
        [EnumMember(Value = "Singapore")]
        Singapore = 7,

        /// <summary>
        /// Enum Tokyo for value: Tokyo
        /// </summary>
        [EnumMember(Value = "Tokyo")]
        Tokyo = 8,

        /// <summary>
        /// Enum Sydney for value: Sydney
        /// </summary>
        [EnumMember(Value = "Sydney")]
        Sydney = 9,

        /// <summary>
        /// Enum SaoPaulo for value: Sao_Paulo
        /// </summary>
        [EnumMember(Value = "Sao_Paulo")]
        SaoPaulo = 10

    }

}
