package com.devtodev.analytics.internal.backend;

import com.google.firebase.remoteconfig.e0;
import h4.a;
import h4.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Versions {

    @NotNull
    private String appBuildVersion;

    @NotNull
    private String appVersion;
    private long configVersion;

    @Nullable
    private Long excludeVersion;
    private long sbsConfigVersion;
    private long sdkCodeVersion;

    @NotNull
    private String sdkVersion;

    public Versions(@NotNull String sdkVersion, long j10, @NotNull String appVersion, @NotNull String appBuildVersion, @Nullable Long l10, long j11, long j12) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        this.sdkVersion = sdkVersion;
        this.sdkCodeVersion = j10;
        this.appVersion = appVersion;
        this.appBuildVersion = appBuildVersion;
        this.excludeVersion = l10;
        this.sbsConfigVersion = j11;
        this.configVersion = j12;
    }

    public static /* synthetic */ Versions copy$default(Versions versions, String str, long j10, String str2, String str3, Long l10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = versions.sdkVersion;
        }
        if ((i10 & 2) != 0) {
            j10 = versions.sdkCodeVersion;
        }
        if ((i10 & 4) != 0) {
            str2 = versions.appVersion;
        }
        if ((i10 & 8) != 0) {
            str3 = versions.appBuildVersion;
        }
        if ((i10 & 16) != 0) {
            l10 = versions.excludeVersion;
        }
        if ((i10 & 32) != 0) {
            j11 = versions.sbsConfigVersion;
        }
        if ((i10 & 64) != 0) {
            j12 = versions.configVersion;
        }
        long j13 = j12;
        Long l11 = l10;
        String str4 = str2;
        return versions.copy(str, j10, str4, str3, l11, j11, j13);
    }

    @NotNull
    public final String component1() {
        return this.sdkVersion;
    }

    public final long component2() {
        return this.sdkCodeVersion;
    }

    @NotNull
    public final String component3() {
        return this.appVersion;
    }

    @NotNull
    public final String component4() {
        return this.appBuildVersion;
    }

    @Nullable
    public final Long component5() {
        return this.excludeVersion;
    }

    public final long component6() {
        return this.sbsConfigVersion;
    }

    public final long component7() {
        return this.configVersion;
    }

    @NotNull
    public final Versions copy(@NotNull String sdkVersion, long j10, @NotNull String appVersion, @NotNull String appBuildVersion, @Nullable Long l10, long j11, long j12) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        return new Versions(sdkVersion, j10, appVersion, appBuildVersion, l10, j11, j12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Versions)) {
            return false;
        }
        Versions versions = (Versions) obj;
        if (Intrinsics.areEqual(this.sdkVersion, versions.sdkVersion) && this.sdkCodeVersion == versions.sdkCodeVersion && Intrinsics.areEqual(this.appVersion, versions.appVersion) && Intrinsics.areEqual(this.appBuildVersion, versions.appBuildVersion) && Intrinsics.areEqual(this.excludeVersion, versions.excludeVersion) && this.sbsConfigVersion == versions.sbsConfigVersion && this.configVersion == versions.configVersion) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final long getConfigVersion() {
        return this.configVersion;
    }

    @Nullable
    public final Long getExcludeVersion() {
        return this.excludeVersion;
    }

    @NotNull
    public final String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate(e0.b.f124461v2, this.sdkVersion);
        jSONObject.accumulate("sdkCodeVersion", Long.valueOf(this.sdkCodeVersion));
        jSONObject.accumulate(e0.b.f124458s2, this.appVersion);
        if (!Intrinsics.areEqual(this.excludeVersion, VersionsKt.getEMPTY_EXCLUDE_VERSION())) {
            jSONObject.accumulate("excludeVersion", this.excludeVersion);
        }
        jSONObject.accumulate("sbsConfigVersion", Long.valueOf(this.sbsConfigVersion));
        long j10 = this.configVersion;
        if (j10 != -1) {
            jSONObject.accumulate("configVersion", Long.valueOf(j10));
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final long getSbsConfigVersion() {
        return this.sbsConfigVersion;
    }

    public final long getSdkCodeVersion() {
        return this.sdkCodeVersion;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        int iA = b.a(this.appBuildVersion, b.a(this.appVersion, a.a(this.sdkCodeVersion, this.sdkVersion.hashCode() * 31, 31), 31), 31);
        Long l10 = this.excludeVersion;
        return Long.hashCode(this.configVersion) + a.a(this.sbsConfigVersion, (iA + (l10 == null ? 0 : l10.hashCode())) * 31, 31);
    }

    public final void setAppBuildVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appBuildVersion = str;
    }

    public final void setAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setConfigVersion(long j10) {
        this.configVersion = j10;
    }

    public final void setExcludeVersion(@Nullable Long l10) {
        this.excludeVersion = l10;
    }

    public final void setSbsConfigVersion(long j10) {
        this.sbsConfigVersion = j10;
    }

    public final void setSdkCodeVersion(long j10) {
        this.sdkCodeVersion = j10;
    }

    public final void setSdkVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sdkVersion = str;
    }

    @NotNull
    public String toString() {
        return "Versions(sdkVersion=" + this.sdkVersion + ", sdkCodeVersion=" + this.sdkCodeVersion + ", appVersion=" + this.appVersion + ", appBuildVersion=" + this.appBuildVersion + ", excludeVersion=" + this.excludeVersion + ", sbsConfigVersion=" + this.sbsConfigVersion + ", configVersion=" + this.configVersion + ")";
    }

    public /* synthetic */ Versions(String str, long j10, String str2, String str3, Long l10, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? (Long) VersionsKt.getEMPTY_EXCLUDE_VERSION() : l10, (i10 & 32) != 0 ? 0L : j11, (i10 & 64) != 0 ? -1L : j12);
    }
}
