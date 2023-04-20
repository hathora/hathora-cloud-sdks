/*
 * Hathora Cloud API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using NUnit.Framework;

using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Api;
// uncomment below to import models
//using Hathora.Cloud.Sdk.Model;

namespace Hathora.Cloud.Sdk.Test.Api
{
    /// <summary>
    ///  Class for testing LobbyV1Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class LobbyV1ApiTests : IDisposable
    {
        private LobbyV1Api instance;

        public LobbyV1ApiTests()
        {
            instance = new LobbyV1Api();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of LobbyV1Api
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' LobbyV1Api
            //Assert.IsType<LobbyV1Api>(instance);
        }

        /// <summary>
        /// Test CreatePrivateLobbyDeprecated
        /// </summary>
        [Test]
        public void CreatePrivateLobbyDeprecatedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string authorization = null;
            //Region? region = null;
            //bool? local = null;
            //var response = instance.CreatePrivateLobbyDeprecated(appId, authorization, region, local);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test CreatePublicLobbyDeprecated
        /// </summary>
        [Test]
        public void CreatePublicLobbyDeprecatedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string authorization = null;
            //Region? region = null;
            //bool? local = null;
            //var response = instance.CreatePublicLobbyDeprecated(appId, authorization, region, local);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test ListActivePublicLobbiesDeprecated
        /// </summary>
        [Test]
        public void ListActivePublicLobbiesDeprecatedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string authorization = null;
            //bool? local = null;
            //Region? region = null;
            //var response = instance.ListActivePublicLobbiesDeprecated(appId, authorization, local, region);
            //Assert.IsType<List<Lobby>>(response);
        }
    }
}
