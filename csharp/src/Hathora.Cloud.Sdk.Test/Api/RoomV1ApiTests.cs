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
    ///  Class for testing RoomV1Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class RoomV1ApiTests : IDisposable
    {
        private RoomV1Api instance;

        public RoomV1ApiTests()
        {
            instance = new RoomV1Api();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of RoomV1Api
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' RoomV1Api
            //Assert.IsType<RoomV1Api>(instance);
        }

        /// <summary>
        /// Test CreateRoom
        /// </summary>
        [Test]
        public void CreateRoomTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //CreateRoomRequest createRoomRequest = null;
            //var response = instance.CreateRoom(appId, createRoomRequest);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test DestroyRoom
        /// </summary>
        [Test]
        public void DestroyRoomTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string roomId = null;
            //instance.DestroyRoom(appId, roomId);
        }

        /// <summary>
        /// Test GetActiveRoomsForProcess
        /// </summary>
        [Test]
        public void GetActiveRoomsForProcessTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string processId = null;
            //var response = instance.GetActiveRoomsForProcess(appId, processId);
            //Assert.IsType<List<PickRoomExcludeKeyofRoomAllocations>>(response);
        }

        /// <summary>
        /// Test GetConnectionInfo
        /// </summary>
        [Test]
        public void GetConnectionInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string roomId = null;
            //var response = instance.GetConnectionInfo(appId, roomId);
            //Assert.IsType<ConnectionInfo>(response);
        }

        /// <summary>
        /// Test GetInactiveRoomsForProcess
        /// </summary>
        [Test]
        public void GetInactiveRoomsForProcessTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string processId = null;
            //var response = instance.GetInactiveRoomsForProcess(appId, processId);
            //Assert.IsType<List<PickRoomExcludeKeyofRoomAllocations>>(response);
        }

        /// <summary>
        /// Test GetRoomInfo
        /// </summary>
        [Test]
        public void GetRoomInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string roomId = null;
            //var response = instance.GetRoomInfo(appId, roomId);
            //Assert.IsType<Room>(response);
        }

        /// <summary>
        /// Test SuspendRoom
        /// </summary>
        [Test]
        public void SuspendRoomTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //string roomId = null;
            //instance.SuspendRoom(appId, roomId);
        }
    }
}
