package com.devtodev.analytics.internal.backend.repository.api;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EndpointAnalyticsConfig {

    @NotNull
    public static final String ENDPOINT = "/analytics/config";

    @NotNull
    public static final EndpointAnalyticsConfig INSTANCE = new EndpointAnalyticsConfig();

    @NotNull
    public static final String PARAMETER_APP_ID = "appId";

    private EndpointAnalyticsConfig() {
    }
}
