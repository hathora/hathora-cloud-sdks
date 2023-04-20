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
    ///  Class for testing DeploymentV1Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DeploymentV1ApiTests : IDisposable
    {
        private DeploymentV1Api instance;

        public DeploymentV1ApiTests()
        {
            instance = new DeploymentV1Api();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of DeploymentV1Api
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' DeploymentV1Api
            //Assert.IsType<DeploymentV1Api>(instance);
        }

        /// <summary>
        /// Test CreateDeployment
        /// </summary>
        [Test]
        public void CreateDeploymentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //double buildId = null;
            //DeploymentConfig deploymentConfig = null;
            //var response = instance.CreateDeployment(appId, buildId, deploymentConfig);
            //Assert.IsType<Deployment>(response);
        }

        /// <summary>
        /// Test GetDeploymentInfo
        /// </summary>
        [Test]
        public void GetDeploymentInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //double deploymentId = null;
            //var response = instance.GetDeploymentInfo(appId, deploymentId);
            //Assert.IsType<Deployment>(response);
        }

        /// <summary>
        /// Test GetDeployments
        /// </summary>
        [Test]
        public void GetDeploymentsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //var response = instance.GetDeployments(appId);
            //Assert.IsType<List<Deployment>>(response);
        }
    }
}
