package com.devtodev.analytics.internal.platform.repository;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IApplicationRepository {
    @NotNull
    String getInstallSourceLocation();

    @NotNull
    String getPackageName();

    @NotNull
    String getPlatformEngine();

    long getSdkVersionCode();

    @NotNull
    String getSdkVersionName();

    long getVersionCode();

    @NotNull
    String getVersionName();
}
