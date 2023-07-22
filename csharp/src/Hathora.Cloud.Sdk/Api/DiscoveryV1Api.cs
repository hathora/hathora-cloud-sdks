/*
 * Hathora Cloud API
 *
 * Welcome to the Hathora Cloud API documentation! Learn how to use the Hathora Cloud APIs to build and scale your game servers globally.
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
    public interface IDiscoveryV1ApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Returns an array of all regions with a host and port that a client can directly ping.
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;DiscoveryResponseInner&gt;</returns>
        List<DiscoveryResponseInner> GetPingServiceEndpoints();

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Returns an array of all regions with a host and port that a client can directly ping.
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;DiscoveryResponseInner&gt;</returns>
        ApiResponse<List<DiscoveryResponseInner>> GetPingServiceEndpointsWithHttpInfo();
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDiscoveryV1ApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Returns an array of all regions with a host and port that a client can directly ping.
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;DiscoveryResponseInner&gt;</returns>
        System.Threading.Tasks.Task<List<DiscoveryResponseInner>> GetPingServiceEndpointsAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Returns an array of all regions with a host and port that a client can directly ping.
        /// </remarks>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;DiscoveryResponseInner&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<DiscoveryResponseInner>>> GetPingServiceEndpointsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDiscoveryV1Api : IDiscoveryV1ApiSync, IDiscoveryV1ApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DiscoveryV1Api : IDisposable, IDiscoveryV1Api
    {
        private Hathora.Cloud.Sdk.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="DiscoveryV1Api"/> class.
        /// **IMPORTANT** This will also create an instance of HttpClient, which is less than ideal.
        /// It's better to reuse the <see href="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/implement-resilient-applications/use-httpclientfactory-to-implement-resilient-http-requests#issues-with-the-original-httpclient-class-available-in-net">HttpClient and HttpClientHandler</see>.
        /// </summary>
        /// <returns></returns>
        public DiscoveryV1Api() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DiscoveryV1Api"/> class.
        /// **IMPORTANT** This will also create an instance of HttpClient, which is less than ideal.
        /// It's better to reuse the <see href="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/implement-resilient-applications/use-httpclientfactory-to-implement-resilient-http-requests#issues-with-the-original-httpclient-class-available-in-net">HttpClient and HttpClientHandler</see>.
        /// </summary>
        /// <param name="basePath">The target service's base path in URL format.</param>
        /// <exception cref="ArgumentException"></exception>
        /// <returns></returns>
        public DiscoveryV1Api(string basePath)
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
        /// Initializes a new instance of the <see cref="DiscoveryV1Api"/> class using Configuration object.
        /// **IMPORTANT** This will also create an instance of HttpClient, which is less than ideal.
        /// It's better to reuse the <see href="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/implement-resilient-applications/use-httpclientfactory-to-implement-resilient-http-requests#issues-with-the-original-httpclient-class-available-in-net">HttpClient and HttpClientHandler</see>.
        /// </summary>
        /// <param name="configuration">An instance of Configuration.</param>
        /// <exception cref="ArgumentNullException"></exception>
        /// <returns></returns>
        public DiscoveryV1Api(Hathora.Cloud.Sdk.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="DiscoveryV1Api"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        /// <exception cref="ArgumentNullException"></exception>
        public DiscoveryV1Api(Hathora.Cloud.Sdk.Client.ISynchronousClient client, Hathora.Cloud.Sdk.Client.IAsynchronousClient asyncClient, Hathora.Cloud.Sdk.Client.IReadableConfiguration configuration)
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
        ///  Returns an array of all regions with a host and port that a client can directly ping.
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;DiscoveryResponseInner&gt;</returns>
        public List<DiscoveryResponseInner> GetPingServiceEndpoints()
        {
            Hathora.Cloud.Sdk.Client.ApiResponse<List<DiscoveryResponseInner>> localVarResponse = GetPingServiceEndpointsWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Returns an array of all regions with a host and port that a client can directly ping.
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;DiscoveryResponseInner&gt;</returns>
        public Hathora.Cloud.Sdk.Client.ApiResponse<List<DiscoveryResponseInner>> GetPingServiceEndpointsWithHttpInfo()
        {
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



            // make the HTTP request
            var localVarResponse = this.Client.Get<List<DiscoveryResponseInner>>("/discovery/v1/ping", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPingServiceEndpoints", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Returns an array of all regions with a host and port that a client can directly ping.
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;DiscoveryResponseInner&gt;</returns>
        public async System.Threading.Tasks.Task<List<DiscoveryResponseInner>> GetPingServiceEndpointsAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var task = GetPingServiceEndpointsWithHttpInfoAsync(cancellationToken);
#if UNITY_EDITOR || !UNITY_WEBGL
            Hathora.Cloud.Sdk.Client.ApiResponse<List<DiscoveryResponseInner>> localVarResponse = await task.ConfigureAwait(false);
#else
            Hathora.Cloud.Sdk.Client.ApiResponse<List<DiscoveryResponseInner>> localVarResponse = await task;
#endif
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Returns an array of all regions with a host and port that a client can directly ping.
        /// </summary>
        /// <exception cref="Hathora.Cloud.Sdk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;DiscoveryResponseInner&gt;)</returns>
        public async System.Threading.Tasks.Task<Hathora.Cloud.Sdk.Client.ApiResponse<List<DiscoveryResponseInner>>> GetPingServiceEndpointsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

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



            // make the HTTP request

            var task = this.AsynchronousClient.GetAsync<List<DiscoveryResponseInner>>("/discovery/v1/ping", localVarRequestOptions, this.Configuration, cancellationToken);

#if UNITY_EDITOR || !UNITY_WEBGL
            var localVarResponse = await task.ConfigureAwait(false);
#else
            var localVarResponse = await task;
#endif

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPingServiceEndpoints", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
