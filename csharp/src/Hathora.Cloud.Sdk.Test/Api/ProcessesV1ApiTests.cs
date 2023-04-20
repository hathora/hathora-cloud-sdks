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
    ///  Class for testing ProcessesV1Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ProcessesV1ApiTests : IDisposable
    {
        private ProcessesV1Api instance;

        public ProcessesV1ApiTests()
        {
            instance = new ProcessesV1Api();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ProcessesV1Api
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ProcessesV1Api
            //Assert.IsType<ProcessesV1Api>(instance);
        }

        /// <summary>
        /// Test GetProcessInfo
        /// </summary>
        [Test]
        public void GetProcessInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string processId = null;
            //var response = instance.GetProcessInfo(appId, processId);
            //Assert.IsType<Process>(response);
        }

        /// <summary>
        /// Test GetRunningProcesses
        /// </summary>
        [Test]
        public void GetRunningProcessesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //Region? region = null;
            //var response = instance.GetRunningProcesses(appId, region);
            //Assert.IsType<List<ProcessWithRooms>>(response);
        }

        /// <summary>
        /// Test GetStoppedProcesses
        /// </summary>
        [Test]
        public void GetStoppedProcessesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //Region? region = null;
            //var response = instance.GetStoppedProcesses(appId, region);
            //Assert.IsType<List<Process>>(response);
        }
    }
}
