package com.devtodev.analytics.internal.platform;

import h4.a;
import h4.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationData {

    @NotNull
    private String appVersion;

    @NotNull
    private final String bundleId;
    private final long codeVersion;

    @NotNull
    private final String installSource;

    @NotNull
    private final String platformEngine;
    private final long sdkVersionCode;

    @NotNull
    private final String sdkVersionName;

    public ApplicationData(@NotNull String appVersion, @NotNull String bundleId, long j10, @NotNull String installSource, @NotNull String sdkVersionName, long j11, @NotNull String platformEngine) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(installSource, "installSource");
        Intrinsics.checkNotNullParameter(sdkVersionName, "sdkVersionName");
        Intrinsics.checkNotNullParameter(platformEngine, "platformEngine");
        this.appVersion = appVersion;
        this.bundleId = bundleId;
        this.codeVersion = j10;
        this.installSource = installSource;
        this.sdkVersionName = sdkVersionName;
        this.sdkVersionCode = j11;
        this.platformEngine = platformEngine;
    }

    public static /* synthetic */ ApplicationData copy$default(ApplicationData applicationData, String str, String str2, long j10, String str3, String str4, long j11, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = applicationData.appVersion;
        }
        if ((i10 & 2) != 0) {
            str2 = applicationData.bundleId;
        }
        if ((i10 & 4) != 0) {
            j10 = applicationData.codeVersion;
        }
        if ((i10 & 8) != 0) {
            str3 = applicationData.installSource;
        }
        if ((i10 & 16) != 0) {
            str4 = applicationData.sdkVersionName;
        }
        if ((i10 & 32) != 0) {
            j11 = applicationData.sdkVersionCode;
        }
        if ((i10 & 64) != 0) {
            str5 = applicationData.platformEngine;
        }
        String str6 = str5;
        long j12 = j10;
        return applicationData.copy(str, str2, j12, str3, str4, j11, str6);
    }

    @NotNull
    public final String component1() {
        return this.appVersion;
    }

    @NotNull
    public final String component2() {
        return this.bundleId;
    }

    public final long component3() {
        return this.codeVersion;
    }

    @NotNull
    public final String component4() {
        return this.installSource;
    }

    @NotNull
    public final String component5() {
        return this.sdkVersionName;
    }

    public final long component6() {
        return this.sdkVersionCode;
    }

    @NotNull
    public final String component7() {
        return this.platformEngine;
    }

    @NotNull
    public final ApplicationData copy(@NotNull String appVersion, @NotNull String bundleId, long j10, @NotNull String installSource, @NotNull String sdkVersionName, long j11, @NotNull String platformEngine) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(installSource, "installSource");
        Intrinsics.checkNotNullParameter(sdkVersionName, "sdkVersionName");
        Intrinsics.checkNotNullParameter(platformEngine, "platformEngine");
        return new ApplicationData(appVersion, bundleId, j10, installSource, sdkVersionName, j11, platformEngine);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationData)) {
            return false;
        }
        ApplicationData applicationData = (ApplicationData) obj;
        return Intrinsics.areEqual(this.appVersion, applicationData.appVersion) && Intrinsics.areEqual(this.bundleId, applicationData.bundleId) && this.codeVersion == applicationData.codeVersion && Intrinsics.areEqual(this.installSource, applicationData.installSource) && Intrinsics.areEqual(this.sdkVersionName, applicationData.sdkVersionName) && this.sdkVersionCode == applicationData.sdkVersionCode && Intrinsics.areEqual(this.platformEngine, applicationData.platformEngine);
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getBundleId() {
        return this.bundleId;
    }

    public final long getCodeVersion() {
        return this.codeVersion;
    }

    @NotNull
    public final String getInstallSource() {
        return this.installSource;
    }

    @NotNull
    public final String getPlatformEngine() {
        return this.platformEngine;
    }

    public final long getSdkVersionCode() {
        return this.sdkVersionCode;
    }

    @NotNull
    public final String getSdkVersionName() {
        return this.sdkVersionName;
    }

    public int hashCode() {
        return this.platformEngine.hashCode() + a.a(this.sdkVersionCode, b.a(this.sdkVersionName, b.a(this.installSource, a.a(this.codeVersion, b.a(this.bundleId, this.appVersion.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final void setAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    @NotNull
    public String toString() {
        return "ApplicationData(appVersion=" + this.appVersion + ", bundleId=" + this.bundleId + ", codeVersion=" + this.codeVersion + ", installSource=" + this.installSource + ", sdkVersionName=" + this.sdkVersionName + ", sdkVersionCode=" + this.sdkVersionCode + ", platformEngine=" + this.platformEngine + ")";
    }
}
