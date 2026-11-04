package com.devtodev.analytics.internal.backend.repository.api;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EndpointAnalyticsIdentification {

    @NotNull
    public static final String ENDPOINT = "/analytics/identification";

    @NotNull
    public static final EndpointAnalyticsIdentification INSTANCE = new EndpointAnalyticsIdentification();

    @NotNull
    public static final String PARAMETER_APP_ID = "appId";

    private EndpointAnalyticsIdentification() {
    }
}
