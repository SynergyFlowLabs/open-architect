package com.devtodev.analytics.internal.backend.repository.api;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EndpointConfigAbtests {

    @NotNull
    public static final String ENDPOINT = "/remoteconfig/experiments";

    @NotNull
    public static final EndpointConfigAbtests INSTANCE = new EndpointConfigAbtests();

    @NotNull
    public static final String PARAMETER_APP_ID = "appId";

    private EndpointConfigAbtests() {
    }
}
