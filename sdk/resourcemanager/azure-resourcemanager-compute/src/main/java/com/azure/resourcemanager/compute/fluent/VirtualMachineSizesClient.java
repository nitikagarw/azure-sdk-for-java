// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.inner.VirtualMachineSizeInner;
import com.azure.resourcemanager.compute.models.VirtualMachineSizeListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualMachineSizes. */
public final class VirtualMachineSizesClient {
    private final ClientLogger logger = new ClientLogger(VirtualMachineSizesClient.class);

    /** The proxy service used to perform REST calls. */
    private final VirtualMachineSizesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClient client;

    /**
     * Initializes an instance of VirtualMachineSizesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineSizesClient(ComputeManagementClient client) {
        this.service =
            RestProxy.create(VirtualMachineSizesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientVirtualMachineSizes to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface VirtualMachineSizesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/vmSizes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VirtualMachineSizeListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);
    }

    /**
     * This API is deprecated. Use [Resources
     * Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualMachineSizeInner>> listSinglePageAsync(String location) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-12-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(), location, apiVersion, this.client.getSubscriptionId(), context))
            .<PagedResponse<VirtualMachineSizeInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * This API is deprecated. Use [Resources
     * Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualMachineSizeInner>> listSinglePageAsync(String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-12-01";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), location, apiVersion, this.client.getSubscriptionId(), context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * This API is deprecated. Use [Resources
     * Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualMachineSizeInner> listAsync(String location) {
        return new PagedFlux<>(() -> listSinglePageAsync(location));
    }

    /**
     * This API is deprecated. Use [Resources
     * Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualMachineSizeInner> listAsync(String location, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(location, context));
    }

    /**
     * This API is deprecated. Use [Resources
     * Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualMachineSizeInner> list(String location) {
        return new PagedIterable<>(listAsync(location));
    }

    /**
     * This API is deprecated. Use [Resources
     * Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualMachineSizeInner> list(String location, Context context) {
        return new PagedIterable<>(listAsync(location, context));
    }
}
