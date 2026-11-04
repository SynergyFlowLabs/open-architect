package com.devtodev.analytics.internal.platform.repository.playservice;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IReferrerClientListener {
    void onReferrerFeatureNotSupported();

    void onReferrerServiceConnectionClosed();

    void onReferrerServiceDisconnected();

    void onReferrerServiceUnavailable();

    void onReferrerSetup(@NotNull String str, boolean z10, long j10, long j11);

    void onReferrerSetupFail();
}
