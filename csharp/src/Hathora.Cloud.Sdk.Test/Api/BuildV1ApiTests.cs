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
    ///  Class for testing BuildV1Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class BuildV1ApiTests : IDisposable
    {
        private BuildV1Api instance;

        public BuildV1ApiTests()
        {
            instance = new BuildV1Api();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of BuildV1Api
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' BuildV1Api
            //Assert.IsType<BuildV1Api>(instance);
        }

        /// <summary>
        /// Test CreateBuild
        /// </summary>
        [Test]
        public void CreateBuildTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //var response = instance.CreateBuild(appId);
            //Assert.IsType<Build>(response);
        }

        /// <summary>
        /// Test DeleteBuild
        /// </summary>
        [Test]
        public void DeleteBuildTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //double buildId = null;
            //instance.DeleteBuild(appId, buildId);
        }

        /// <summary>
        /// Test GetBuildInfo
        /// </summary>
        [Test]
        public void GetBuildInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //double buildId = null;
            //var response = instance.GetBuildInfo(appId, buildId);
            //Assert.IsType<Build>(response);
        }

        /// <summary>
        /// Test GetBuilds
        /// </summary>
        [Test]
        public void GetBuildsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //var response = instance.GetBuilds(appId);
            //Assert.IsType<List<Build>>(response);
        }

        /// <summary>
        /// Test RunBuild
        /// </summary>
        [Test]
        public void RunBuildTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //double buildId = null;
            //System.IO.Stream file = null;
            //var response = instance.RunBuild(appId, buildId, file);
            //Assert.IsType<byte[]>(response);
        }
    }
}
