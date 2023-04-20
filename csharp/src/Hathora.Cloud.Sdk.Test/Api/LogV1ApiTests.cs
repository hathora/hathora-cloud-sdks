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
    ///  Class for testing LogV1Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class LogV1ApiTests : IDisposable
    {
        private LogV1Api instance;

        public LogV1ApiTests()
        {
            instance = new LogV1Api();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of LogV1Api
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' LogV1Api
            //Assert.IsType<LogV1Api>(instance);
        }

        /// <summary>
        /// Test GetLogsForApp
        /// </summary>
        [Test]
        public void GetLogsForAppTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //bool? follow = null;
            //double? tailLines = null;
            //Region? region = null;
            //var response = instance.GetLogsForApp(appId, follow, tailLines, region);
            //Assert.IsType<byte[]>(response);
        }

        /// <summary>
        /// Test GetLogsForDeployment
        /// </summary>
        [Test]
        public void GetLogsForDeploymentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //double deploymentId = null;
            //bool? follow = null;
            //double? tailLines = null;
            //var response = instance.GetLogsForDeployment(appId, deploymentId, follow, tailLines);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test GetLogsForProcess
        /// </summary>
        [Test]
        public void GetLogsForProcessTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string processId = null;
            //bool? follow = null;
            //double? tailLines = null;
            //var response = instance.GetLogsForProcess(appId, processId, follow, tailLines);
            //Assert.IsType<byte[]>(response);
        }
    }
}
