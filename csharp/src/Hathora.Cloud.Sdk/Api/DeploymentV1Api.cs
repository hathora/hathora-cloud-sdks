/*
 * Hathora Cloud API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using Hathora.Cloud.Sdk.Client;
using Hathora.Cloud.Sdk.Model;

namespace Hathora.Cloud.Sdk.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDeploymentV1ApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="buildId"></param>
        /// <param name="deploymentConfig"></param>
        /// <returns>Deployment</returns>
        Deployment CreateDeployment(string appId, double buildId, DeploymentConfig deploymentConfig);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="buildId"></param>
        /// <param name="deploymentConfig"></param>
        /// <returns>ApiResponse of Deployment</returns>
        ApiResponse<Deployment> CreateDeploymentWithHttpInfo(string appId, double buildId, DeploymentConfig deploymentConfig);
        /// <summary>
        /// 
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="deploymentId"></param>
        /// <returns>Deployment</returns>
        Deployment GetDeploymentInfo(string appId, double deploymentId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="deploymentId"></param>
        /// <returns>ApiResponse of Deployment</returns>
        ApiResponse<Deployment> GetDeploymentInfoWithHttpInfo(string appId, double deploymentId);
        /// <summary>
        /// 
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <returns>List&lt;Deployment&gt;</returns>
        List<Deployment> GetDeployments(string appId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <returns>ApiResponse of List&lt;Deployment&gt;</returns>
        ApiResponse<List<Deployment>> GetDeploymentsWithHttpInfo(string appId);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDeploymentV1ApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="buildId"></param>
        /// <param name="deploymentConfig"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Deployment</returns>
        System.Threading.Tasks.Task<Deployment> CreateDeploymentAsync(string appId, double buildId, DeploymentConfig deploymentConfig, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="buildId"></param>
        /// <param name="deploymentConfig"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Deployment)</returns>
        System.Threading.Tasks.Task<ApiResponse<Deployment>> CreateDeploymentWithHttpInfoAsync(string appId, double buildId, DeploymentConfig deploymentConfig, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="deploymentId"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Deployment</returns>
        System.Threading.Tasks.Task<Deployment> GetDeploymentInfoAsync(string appId, double deploymentId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="deploymentId"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Deployment)</returns>
        System.Threading.Tasks.Task<ApiResponse<Deployment>> GetDeploymentInfoWithHttpInfoAsync(string appId, double deploymentId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;Deployment&gt;</returns>
        System.Threading.Tasks.Task<List<Deployment>> GetDeploymentsAsync(string appId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;Deployment&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Deployment>>> GetDeploymentsWithHttpInfoAsync(string appId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDeploymentV1Api : IDeploymentV1ApiSync, IDeploymentV1ApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DeploymentV1Api : IDisposable, IDeploymentV1Api
    {
        private Hathora.Cloud.Sdk.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentV1Api"/> class.
        /// **IMPORTANT** This will also create an instance of HttpClient, which is less than ideal.
        /// It's better to reuse the <see href="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/implement-resilient-applications/use-httpclientfactory-to-implement-resilient-http-requests#issues-with-the-original-httpclient-class-available-in-net">HttpClient and HttpClientHandler</see>.
        /// </summary>
        /// <returns></returns>
        public DeploymentV1Api() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentV1Api"/> class.
        /// **IMPORTANT** This will also create an instance of HttpClient, which is less than ideal.
        /// It's better to reuse the <see href="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/implement-resilient-applications/use-httpclientfactory-to-implement-resilient-http-requests#issues-with-the-original-httpclient-class-available-in-net">HttpClient and HttpClientHandler</see>.
        /// </summary>
        /// <param name="basePath">The target service's base path in URL format.</param>
        /// <exception cref="ArgumentException"></exception>
        /// <returns></returns>
        public DeploymentV1Api(string basePath)
        {
            this.Configuration = Hathora.Cloud.Sdk.Client.Configuration.MergeConfigurations(
                Hathora.Cloud.Sdk.Client.GlobalConfiguration.Instance,
                new Hathora.Cloud.Sdk.Client.Configuration { BasePath = basePath }
            );
            this.ApiClient = new Hathora.Cloud.Sdk.Client.ApiClient(this.Configuration.BasePath);
            this.Client =  this.ApiClient;
            this.AsynchronousClient = this.ApiClient;
            this.ExceptionFactory = Hathora.Cloud.Sdk.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentV1Api"/> class using Configuration object.
        /// **IMPORTANT** This will also create an instance of HttpClient, which is less than ideal.
        /// It's better to reuse the <see href="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/implement-resilient-applications/use-httpclientfactory-to-implement-resilient-http-requests#issues-with-the-original-httpclient-class-available-in-net">HttpClient and HttpClientHandler</see>.
        /// </summary>
        /// <param name="configuration">An instance of Configuration.</param>
        /// <exception cref="ArgumentNullException"></exception>
        /// <returns></returns>
        public DeploymentV1Api(Hathora.Cloud.Sdk.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Hathora.Cloud.Sdk.Client.Configuration.MergeConfigurations(
                Hathora.Cloud.Sdk.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.ApiClient = new Hathora.Cloud.Sdk.Client.ApiClient(this.Configuration.BasePath);
            this.Client = this.ApiClient;
            this.AsynchronousClient = this.ApiClient;
            ExceptionFactory = Hathora.Cloud.Sdk.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentV1Api"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        /// <exception cref="ArgumentNullException"></exception>
        public DeploymentV1Api(Hathora.Cloud.Sdk.Client.ISynchronousClient client, Hathora.Cloud.Sdk.Client.IAsynchronousClient asyncClient, Hathora.Cloud.Sdk.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Hathora.Cloud.Sdk.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Disposes resources if they were created by us
        /// </summary>
        public void Dispose()
        {
            this.ApiClient?.Dispose();
        }

        /// <summary>
        /// Holds the ApiClient if created
        /// </summary>
        public Hathora.Cloud.Sdk.Client.ApiClient ApiClient { get; set; } = null;

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Hathora.Cloud.Sdk.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Hathora.Cloud.Sdk.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Hathora.Cloud.Sdk.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Hathora.Cloud.Sdk.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="buildId"></param>
        /// <param name="deploymentConfig"></param>
        /// <returns>Deployment</returns>
        public Deployment CreateDeployment(string appId, double buildId, DeploymentConfig deploymentConfig)
        {
            Hathora.Cloud.Sdk.Client.ApiResponse<Deployment> localVarResponse = CreateDeploymentWithHttpInfo(appId, buildId, deploymentConfig);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="buildId"></param>
        /// <param name="deploymentConfig"></param>
        /// <returns>ApiResponse of Deployment</returns>
        public Hathora.Cloud.Sdk.Client.ApiResponse<Deployment> CreateDeploymentWithHttpInfo(string appId, double buildId, DeploymentConfig deploymentConfig)
        {
            // verify the required parameter 'appId' is set
            if (appId == null)
                throw new Hathora.Cloud.Sdk.Client.ApiException(400, "Missing required parameter 'appId' when calling DeploymentV1Api->CreateDeployment");

            // verify the required parameter 'deploymentConfig' is set
            if (deploymentConfig == null)
                throw new Hathora.Cloud.Sdk.Client.ApiException(400, "Missing required parameter 'deploymentConfig' when calling DeploymentV1Api->CreateDeployment");

            Hathora.Cloud.Sdk.Client.RequestOptions localVarRequestOptions = new Hathora.Cloud.Sdk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("appId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(appId)); // path parameter
            localVarRequestOptions.PathParameters.Add("buildId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(buildId)); // path parameter
            localVarRequestOptions.Data = deploymentConfig;

            // authentication (auth0) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<Deployment>("/deployments/v1/{appId}/create/{buildId}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateDeployment", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="buildId"></param>
        /// <param name="deploymentConfig"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Deployment</returns>
        public async System.Threading.Tasks.Task<Deployment> CreateDeploymentAsync(string appId, double buildId, DeploymentConfig deploymentConfig, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var task = CreateDeploymentWithHttpInfoAsync(appId, buildId, deploymentConfig, cancellationToken);
#if UNITY_EDITOR || !UNITY_WEBGL
            Hathora.Cloud.Sdk.Client.ApiResponse<Deployment> localVarResponse = await task.ConfigureAwait(false);
#else
            Hathora.Cloud.Sdk.Client.ApiResponse<Deployment> localVarResponse = await task;
#endif
            return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="buildId"></param>
        /// <param name="deploymentConfig"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Deployment)</returns>
        public async System.Threading.Tasks.Task<Hathora.Cloud.Sdk.Client.ApiResponse<Deployment>> CreateDeploymentWithHttpInfoAsync(string appId, double buildId, DeploymentConfig deploymentConfig, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'appId' is set
            if (appId == null)
                throw new Hathora.Cloud.Sdk.Client.ApiException(400, "Missing required parameter 'appId' when calling DeploymentV1Api->CreateDeployment");

            // verify the required parameter 'deploymentConfig' is set
            if (deploymentConfig == null)
                throw new Hathora.Cloud.Sdk.Client.ApiException(400, "Missing required parameter 'deploymentConfig' when calling DeploymentV1Api->CreateDeployment");


            Hathora.Cloud.Sdk.Client.RequestOptions localVarRequestOptions = new Hathora.Cloud.Sdk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("appId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(appId)); // path parameter
            localVarRequestOptions.PathParameters.Add("buildId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(buildId)); // path parameter
            localVarRequestOptions.Data = deploymentConfig;

            // authentication (auth0) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request

            var task = this.AsynchronousClient.PostAsync<Deployment>("/deployments/v1/{appId}/create/{buildId}", localVarRequestOptions, this.Configuration, cancellationToken);

#if UNITY_EDITOR || !UNITY_WEBGL
            var localVarResponse = await task.ConfigureAwait(false);
#else
            var localVarResponse = await task;
#endif

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateDeployment", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="deploymentId"></param>
        /// <returns>Deployment</returns>
        public Deployment GetDeploymentInfo(string appId, double deploymentId)
        {
            Hathora.Cloud.Sdk.Client.ApiResponse<Deployment> localVarResponse = GetDeploymentInfoWithHttpInfo(appId, deploymentId);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="deploymentId"></param>
        /// <returns>ApiResponse of Deployment</returns>
        public Hathora.Cloud.Sdk.Client.ApiResponse<Deployment> GetDeploymentInfoWithHttpInfo(string appId, double deploymentId)
        {
            // verify the required parameter 'appId' is set
            if (appId == null)
                throw new Hathora.Cloud.Sdk.Client.ApiException(400, "Missing required parameter 'appId' when calling DeploymentV1Api->GetDeploymentInfo");

            Hathora.Cloud.Sdk.Client.RequestOptions localVarRequestOptions = new Hathora.Cloud.Sdk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("appId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(appId)); // path parameter
            localVarRequestOptions.PathParameters.Add("deploymentId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(deploymentId)); // path parameter

            // authentication (auth0) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<Deployment>("/deployments/v1/{appId}/info/{deploymentId}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetDeploymentInfo", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="deploymentId"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Deployment</returns>
        public async System.Threading.Tasks.Task<Deployment> GetDeploymentInfoAsync(string appId, double deploymentId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var task = GetDeploymentInfoWithHttpInfoAsync(appId, deploymentId, cancellationToken);
#if UNITY_EDITOR || !UNITY_WEBGL
            Hathora.Cloud.Sdk.Client.ApiResponse<Deployment> localVarResponse = await task.ConfigureAwait(false);
#else
            Hathora.Cloud.Sdk.Client.ApiResponse<Deployment> localVarResponse = await task;
#endif
            return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="deploymentId"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Deployment)</returns>
        public async System.Threading.Tasks.Task<Hathora.Cloud.Sdk.Client.ApiResponse<Deployment>> GetDeploymentInfoWithHttpInfoAsync(string appId, double deploymentId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'appId' is set
            if (appId == null)
                throw new Hathora.Cloud.Sdk.Client.ApiException(400, "Missing required parameter 'appId' when calling DeploymentV1Api->GetDeploymentInfo");


            Hathora.Cloud.Sdk.Client.RequestOptions localVarRequestOptions = new Hathora.Cloud.Sdk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("appId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(appId)); // path parameter
            localVarRequestOptions.PathParameters.Add("deploymentId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(deploymentId)); // path parameter

            // authentication (auth0) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request

            var task = this.AsynchronousClient.GetAsync<Deployment>("/deployments/v1/{appId}/info/{deploymentId}", localVarRequestOptions, this.Configuration, cancellationToken);

#if UNITY_EDITOR || !UNITY_WEBGL
            var localVarResponse = await task.ConfigureAwait(false);
#else
            var localVarResponse = await task;
#endif

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetDeploymentInfo", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <returns>List&lt;Deployment&gt;</returns>
        public List<Deployment> GetDeployments(string appId)
        {
            Hathora.Cloud.Sdk.Client.ApiResponse<List<Deployment>> localVarResponse = GetDeploymentsWithHttpInfo(appId);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <returns>ApiResponse of List&lt;Deployment&gt;</returns>
        public Hathora.Cloud.Sdk.Client.ApiResponse<List<Deployment>> GetDeploymentsWithHttpInfo(string appId)
        {
            // verify the required parameter 'appId' is set
            if (appId == null)
                throw new Hathora.Cloud.Sdk.Client.ApiException(400, "Missing required parameter 'appId' when calling DeploymentV1Api->GetDeployments");

            Hathora.Cloud.Sdk.Client.RequestOptions localVarRequestOptions = new Hathora.Cloud.Sdk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("appId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(appId)); // path parameter

            // authentication (auth0) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<List<Deployment>>("/deployments/v1/{appId}/list", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetDeployments", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;Deployment&gt;</returns>
        public async System.Threading.Tasks.Task<List<Deployment>> GetDeploymentsAsync(string appId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var task = GetDeploymentsWithHttpInfoAsync(appId, cancellationToken);
#if UNITY_EDITOR || !UNITY_WEBGL
            Hathora.Cloud.Sdk.Client.ApiResponse<List<Deployment>> localVarResponse = await task.ConfigureAwait(false);
#else
            Hathora.Cloud.Sdk.Client.ApiResponse<List<Deployment>> localVarResponse = await task;
#endif
            return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="appId"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;Deployment&gt;)</returns>
        public async System.Threading.Tasks.Task<Hathora.Cloud.Sdk.Client.ApiResponse<List<Deployment>>> GetDeploymentsWithHttpInfoAsync(string appId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'appId' is set
            if (appId == null)
                throw new Hathora.Cloud.Sdk.Client.ApiException(400, "Missing required parameter 'appId' when calling DeploymentV1Api->GetDeployments");


            Hathora.Cloud.Sdk.Client.RequestOptions localVarRequestOptions = new Hathora.Cloud.Sdk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = Hathora.Cloud.Sdk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("appId", Hathora.Cloud.Sdk.Client.ClientUtils.ParameterToString(appId)); // path parameter

            // authentication (auth0) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request

            var task = this.AsynchronousClient.GetAsync<List<Deployment>>("/deployments/v1/{appId}/list", localVarRequestOptions, this.Configuration, cancellationToken);

#if UNITY_EDITOR || !UNITY_WEBGL
            var localVarResponse = await task.ConfigureAwait(false);
#else
            var localVarResponse = await task;
#endif

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetDeployments", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
