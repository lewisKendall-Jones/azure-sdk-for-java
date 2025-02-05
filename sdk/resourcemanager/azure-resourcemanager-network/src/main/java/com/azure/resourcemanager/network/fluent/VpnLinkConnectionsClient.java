// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.VpnSiteLinkConnectionInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VpnLinkConnectionsClient. */
public interface VpnLinkConnectionsClient {
    /**
     * Resets the VpnLink connection specified.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> resetConnectionWithResponseAsync(
        String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Resets the VpnLink connection specified.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginResetConnectionAsync(
        String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Resets the VpnLink connection specified.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginResetConnection(
        String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Resets the VpnLink connection specified.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginResetConnection(
        String resourceGroupName,
        String gatewayName,
        String connectionName,
        String linkConnectionName,
        Context context);

    /**
     * Resets the VpnLink connection specified.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> resetConnectionAsync(
        String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Resets the VpnLink connection specified.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resetConnection(
        String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Resets the VpnLink connection specified.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resetConnection(
        String resourceGroupName,
        String gatewayName,
        String connectionName,
        String linkConnectionName,
        Context context);

    /**
     * Lists IKE Security Associations for Vpn Site Link Connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> getIkeSasWithResponseAsync(
        String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Lists IKE Security Associations for Vpn Site Link Connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<String>, String> beginGetIkeSasAsync(
        String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Lists IKE Security Associations for Vpn Site Link Connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<String>, String> beginGetIkeSas(
        String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Lists IKE Security Associations for Vpn Site Link Connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<String>, String> beginGetIkeSas(
        String resourceGroupName,
        String gatewayName,
        String connectionName,
        String linkConnectionName,
        Context context);

    /**
     * Lists IKE Security Associations for Vpn Site Link Connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<String> getIkeSasAsync(
        String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Lists IKE Security Associations for Vpn Site Link Connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    String getIkeSas(String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

    /**
     * Lists IKE Security Associations for Vpn Site Link Connection in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn link connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    String getIkeSas(
        String resourceGroupName,
        String gatewayName,
        String connectionName,
        String linkConnectionName,
        Context context);

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the vpn gateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway as paginated response with
     *     {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VpnSiteLinkConnectionInner> listByVpnConnectionAsync(
        String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the vpn gateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteLinkConnectionInner> listByVpnConnection(
        String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the vpn gateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteLinkConnectionInner> listByVpnConnection(
        String resourceGroupName, String gatewayName, String connectionName, Context context);
}
