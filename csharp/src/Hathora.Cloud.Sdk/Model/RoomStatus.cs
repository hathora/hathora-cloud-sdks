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
    /// The allocation status of a room.  &#x60;scheduling&#x60;: a process is not allocated yet and the room is waiting to be scheduled  &#x60;active&#x60;: ready to accept connections  &#x60;suspended&#x60;: room is unallocated from the process but can be rescheduled later with the same &#x60;roomId&#x60;  &#x60;destroyed&#x60;: all associated metadata is deleted
    /// </summary>
    /// <value>The allocation status of a room.  &#x60;scheduling&#x60;: a process is not allocated yet and the room is waiting to be scheduled  &#x60;active&#x60;: ready to accept connections  &#x60;suspended&#x60;: room is unallocated from the process but can be rescheduled later with the same &#x60;roomId&#x60;  &#x60;destroyed&#x60;: all associated metadata is deleted</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum RoomStatus
    {
        /// <summary>
        /// Enum Scheduling for value: scheduling
        /// </summary>
        [EnumMember(Value = "scheduling")]
        Scheduling = 1,

        /// <summary>
        /// Enum Active for value: active
        /// </summary>
        [EnumMember(Value = "active")]
        Active = 2,

        /// <summary>
        /// Enum Suspended for value: suspended
        /// </summary>
        [EnumMember(Value = "suspended")]
        Suspended = 3,

        /// <summary>
        /// Enum Destroyed for value: destroyed
        /// </summary>
        [EnumMember(Value = "destroyed")]
        Destroyed = 4

    }

}
