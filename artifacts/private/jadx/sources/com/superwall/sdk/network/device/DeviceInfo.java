package com.superwall.sdk.network.device;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class DeviceInfo {

    @NotNull
    private final String appInstalledAtString;

    @NotNull
    private final String locale;

    public DeviceInfo(@NotNull String appInstalledAtString, @NotNull String locale) {
        Intrinsics.checkNotNullParameter(appInstalledAtString, "appInstalledAtString");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.appInstalledAtString = appInstalledAtString;
        this.locale = locale;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceInfo.appInstalledAtString;
        }
        if ((i10 & 2) != 0) {
            str2 = deviceInfo.locale;
        }
        return deviceInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.appInstalledAtString;
    }

    @NotNull
    public final String component2() {
        return this.locale;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String appInstalledAtString, @NotNull String locale) {
        Intrinsics.checkNotNullParameter(appInstalledAtString, "appInstalledAtString");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return new DeviceInfo(appInstalledAtString, locale);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return Intrinsics.areEqual(this.appInstalledAtString, deviceInfo.appInstalledAtString) && Intrinsics.areEqual(this.locale, deviceInfo.locale);
    }

    @NotNull
    public final String getAppInstalledAtString() {
        return this.appInstalledAtString;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    public int hashCode() {
        return (this.appInstalledAtString.hashCode() * 31) + this.locale.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(appInstalledAtString=" + this.appInstalledAtString + ", locale=" + this.locale + ")";
    }
}
