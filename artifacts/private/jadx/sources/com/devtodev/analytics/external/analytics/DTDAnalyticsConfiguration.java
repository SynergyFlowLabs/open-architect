package com.devtodev.analytics.external.analytics;

import com.devtodev.analytics.external.DTDLogLevel;
import com.devtodev.analytics.external.DTDTrackingStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDAnalyticsConfiguration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f98022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f98023c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DTDLogLevel f98021a = DTDLogLevel.Unknown;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DTDTrackingStatus f98024d = DTDTrackingStatus.Unknown;

    @NotNull
    public final DTDAnalyticsConfiguration clone$DTDAnalytics_androidRelease() {
        DTDAnalyticsConfiguration dTDAnalyticsConfiguration = new DTDAnalyticsConfiguration();
        dTDAnalyticsConfiguration.f98021a = this.f98021a;
        dTDAnalyticsConfiguration.f98022b = this.f98022b;
        dTDAnalyticsConfiguration.f98023c = this.f98023c;
        dTDAnalyticsConfiguration.f98024d = this.f98024d;
        return dTDAnalyticsConfiguration;
    }

    @Nullable
    public final Integer getCurrentLevel() {
        return this.f98022b;
    }

    @NotNull
    public final DTDLogLevel getLogLevel() {
        return this.f98021a;
    }

    @NotNull
    public final DTDTrackingStatus getTrackingAvailability() {
        return this.f98024d;
    }

    @Nullable
    public final String getUserId() {
        return this.f98023c;
    }

    public final void setCurrentLevel(@Nullable Integer num) {
        this.f98022b = num;
    }

    public final void setLogLevel(@NotNull DTDLogLevel dTDLogLevel) {
        Intrinsics.checkNotNullParameter(dTDLogLevel, "<set-?>");
        this.f98021a = dTDLogLevel;
    }

    public final void setTrackingAvailability(@NotNull DTDTrackingStatus dTDTrackingStatus) {
        Intrinsics.checkNotNullParameter(dTDTrackingStatus, "<set-?>");
        this.f98024d = dTDTrackingStatus;
    }

    public final void setUserId(@Nullable String str) {
        this.f98023c = str;
    }

    @NotNull
    public String toString() {
        return "logLevel:" + this.f98021a + "\ncurrentLevel:" + this.f98022b + "\nuserId:" + this.f98023c + "\ntrackingAvailability:" + this.f98024d;
    }
}
