package com.devtodev.analytics.internal.backend.repository.api;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EndpointAnalyticsReport {

    @NotNull
    public static final String ENDPOINT = "/analytics/report";

    @NotNull
    public static final EndpointAnalyticsReport INSTANCE = new EndpointAnalyticsReport();

    @NotNull
    public static final String PARAMETER_APP_ID = "appId";

    private EndpointAnalyticsReport() {
    }
}
