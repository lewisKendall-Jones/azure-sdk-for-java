// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.models.Replica;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SignalRReplicasListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"sku\":{\"name\":\"ltxdwhmozu\",\"tier\":\"Standard\",\"size\":\"ln\",\"family\":\"nj\",\"capacity\":1586632226},\"properties\":{\"provisioningState\":\"Succeeded\"},\"location\":\"pymwamxqzragp\",\"tags\":{\"vl\":\"htvdula\",\"rupdwvnphcnzq\":\"jchcsrlzknmzla\"},\"id\":\"pjhmqrhvthl\",\"name\":\"iwdcxsmlzzhzd\",\"type\":\"xetlgydlhqv\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        SignalRManager manager =
            SignalRManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Replica> response =
            manager.signalRReplicas().list("lhguyn", "chl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pymwamxqzragp", response.iterator().next().location());
        Assertions.assertEquals("htvdula", response.iterator().next().tags().get("vl"));
        Assertions.assertEquals("ltxdwhmozu", response.iterator().next().sku().name());
        Assertions.assertEquals(SignalRSkuTier.STANDARD, response.iterator().next().sku().tier());
        Assertions.assertEquals(1586632226, response.iterator().next().sku().capacity());
    }
}
