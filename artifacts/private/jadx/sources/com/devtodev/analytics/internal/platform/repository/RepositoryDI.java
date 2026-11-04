package com.devtodev.analytics.internal.platform.repository;

import android.content.Context;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryDI {

    @NotNull
    private final f0 applicationRepository$delegate;

    @NotNull
    private final Context context;

    @NotNull
    private final f0 deviceRepository$delegate;

    @NotNull
    private final f0 googleApiRepository$delegate;

    @NotNull
    private final f0 huaweiApiRepository$delegate;

    @NotNull
    private final f0 playServiceRepository$delegate;

    public RepositoryDI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        j0 j0Var = j0.PUBLICATION;
        this.applicationRepository$delegate = g0.b(j0Var, new RepositoryDI$applicationRepository$2(this));
        this.deviceRepository$delegate = g0.b(j0Var, new RepositoryDI$deviceRepository$2(this));
        this.googleApiRepository$delegate = g0.b(j0Var, new RepositoryDI$googleApiRepository$2(this));
        this.playServiceRepository$delegate = g0.b(j0Var, new RepositoryDI$playServiceRepository$2(this));
        this.huaweiApiRepository$delegate = g0.b(j0Var, new RepositoryDI$huaweiApiRepository$2(this));
    }

    @NotNull
    public final ApplicationRepository getApplicationRepository$DTDAnalytics_androidRelease() {
        return (ApplicationRepository) this.applicationRepository$delegate.getValue();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final DeviceRepository getDeviceRepository$DTDAnalytics_androidRelease() {
        return (DeviceRepository) this.deviceRepository$delegate.getValue();
    }

    @NotNull
    public final GoogleApiRepository getGoogleApiRepository$DTDAnalytics_androidRelease() {
        return (GoogleApiRepository) this.googleApiRepository$delegate.getValue();
    }

    @NotNull
    public final HuaweiApiRepository getHuaweiApiRepository$DTDAnalytics_androidRelease() {
        return (HuaweiApiRepository) this.huaweiApiRepository$delegate.getValue();
    }

    @NotNull
    public final PlayServiceRepository getPlayServiceRepository$DTDAnalytics_androidRelease() {
        return (PlayServiceRepository) this.playServiceRepository$delegate.getValue();
    }
}
