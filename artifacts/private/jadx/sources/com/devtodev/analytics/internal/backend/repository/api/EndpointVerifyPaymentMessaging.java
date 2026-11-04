package com.devtodev.analytics.internal.backend.repository.api;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EndpointVerifyPaymentMessaging {

    @NotNull
    public static final String ENDPOINT = "/verify/payment";

    @NotNull
    public static final EndpointVerifyPaymentMessaging INSTANCE = new EndpointVerifyPaymentMessaging();

    @NotNull
    public static final String PARAMETER_APP_ID = "appId";

    private EndpointVerifyPaymentMessaging() {
    }
}
