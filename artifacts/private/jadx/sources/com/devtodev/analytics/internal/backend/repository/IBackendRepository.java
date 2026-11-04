package com.devtodev.analytics.internal.backend.repository;

import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import com.devtodev.analytics.internal.backend.BackendConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IBackendRepository {
    @NotNull
    RemoteConfigSealedClass requestABTestConfig(@NotNull String str, @NotNull BackendMessage backendMessage);

    @NotNull
    AbTestOffer requestABTestOffer(@NotNull String str, @NotNull BackendMessage backendMessage);

    @NotNull
    BackendUserData requestBackendUserData(@NotNull String str, @NotNull BackendMessage backendMessage);

    @NotNull
    BackendConfig requestConfig(@NotNull String str, @NotNull BackendMessage backendMessage);

    @NotNull
    AnalyticsReport sendAnalytics(@NotNull String str, @NotNull BackendMessage backendMessage, @NotNull String str2);

    @NotNull
    DTDVerifyResponse sendVerifyReceipt(@NotNull String str, @NotNull BackendMessage backendMessage);
}
