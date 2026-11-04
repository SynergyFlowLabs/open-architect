package com.devtodev.analytics.internal.backend.repository.api;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EndpointOfferAbtests {

    @NotNull
    public static final String ENDPOINT = "/remoteconfig/offer";

    @NotNull
    public static final EndpointOfferAbtests INSTANCE = new EndpointOfferAbtests();

    @NotNull
    public static final String PARAMETER_APP_ID = "appId";

    private EndpointOfferAbtests() {
    }
}
