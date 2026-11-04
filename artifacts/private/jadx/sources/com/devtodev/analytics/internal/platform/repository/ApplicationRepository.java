package com.devtodev.analytics.internal.platform.repository;

import com.devtodev.analytics.internal.platform.repository.android.AndroidApplication;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationRepository implements IApplicationRepository {

    @NotNull
    private final AndroidApplication androidApplication;

    public ApplicationRepository(@NotNull AndroidApplication androidApplication) {
        Intrinsics.checkNotNullParameter(androidApplication, "androidApplication");
        this.androidApplication = androidApplication;
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IApplicationRepository
    @NotNull
    public String getInstallSourceLocation() {
        return this.androidApplication.getInstallSource();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IApplicationRepository
    @NotNull
    public String getPackageName() {
        return this.androidApplication.getPackageName();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IApplicationRepository
    @NotNull
    public String getPlatformEngine() {
        return this.androidApplication.getPlatformEngine();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IApplicationRepository
    public long getSdkVersionCode() {
        return this.androidApplication.getSdkVersionCode();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IApplicationRepository
    @NotNull
    public String getSdkVersionName() {
        return this.androidApplication.getSdkVersionName();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IApplicationRepository
    public long getVersionCode() {
        return this.androidApplication.getVersionCode();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IApplicationRepository
    @NotNull
    public String getVersionName() {
        return this.androidApplication.getVersionName();
    }
}
