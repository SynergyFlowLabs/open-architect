package com.devtodev.analytics.internal.platform;

import h4.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceConstants {

    @NotNull
    private final String androidId;
    private final int deviceType;

    @NotNull
    private final String deviceVersionKey;

    @NotNull
    private final String devtodevUDID;
    private final boolean isRooted;

    @NotNull
    private final String language;

    @NotNull
    private final String macAddress;

    @NotNull
    private final String manufacturer;

    @NotNull
    private final String model;

    @NotNull
    private final String odin;

    @NotNull
    private final String osKey;
    private final int timezoneOffset;

    @NotNull
    private final String userAgent;

    public DeviceConstants(@NotNull String androidId, @NotNull String deviceVersionKey, @NotNull String devtodevUDID, boolean z10, @NotNull String language, @NotNull String macAddress, @NotNull String manufacturer, @NotNull String model, @NotNull String odin, @NotNull String osKey, int i10, @NotNull String userAgent, int i11) {
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(deviceVersionKey, "deviceVersionKey");
        Intrinsics.checkNotNullParameter(devtodevUDID, "devtodevUDID");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(odin, "odin");
        Intrinsics.checkNotNullParameter(osKey, "osKey");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.androidId = androidId;
        this.deviceVersionKey = deviceVersionKey;
        this.devtodevUDID = devtodevUDID;
        this.isRooted = z10;
        this.language = language;
        this.macAddress = macAddress;
        this.manufacturer = manufacturer;
        this.model = model;
        this.odin = odin;
        this.osKey = osKey;
        this.timezoneOffset = i10;
        this.userAgent = userAgent;
        this.deviceType = i11;
    }

    public static /* synthetic */ DeviceConstants copy$default(DeviceConstants deviceConstants, String str, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8, String str9, int i10, String str10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deviceConstants.androidId;
        }
        return deviceConstants.copy(str, (i12 & 2) != 0 ? deviceConstants.deviceVersionKey : str2, (i12 & 4) != 0 ? deviceConstants.devtodevUDID : str3, (i12 & 8) != 0 ? deviceConstants.isRooted : z10, (i12 & 16) != 0 ? deviceConstants.language : str4, (i12 & 32) != 0 ? deviceConstants.macAddress : str5, (i12 & 64) != 0 ? deviceConstants.manufacturer : str6, (i12 & 128) != 0 ? deviceConstants.model : str7, (i12 & 256) != 0 ? deviceConstants.odin : str8, (i12 & 512) != 0 ? deviceConstants.osKey : str9, (i12 & 1024) != 0 ? deviceConstants.timezoneOffset : i10, (i12 & 2048) != 0 ? deviceConstants.userAgent : str10, (i12 & 4096) != 0 ? deviceConstants.deviceType : i11);
    }

    @NotNull
    public final String component1() {
        return this.androidId;
    }

    @NotNull
    public final String component10() {
        return this.osKey;
    }

    public final int component11() {
        return this.timezoneOffset;
    }

    @NotNull
    public final String component12() {
        return this.userAgent;
    }

    public final int component13() {
        return this.deviceType;
    }

    @NotNull
    public final String component2() {
        return this.deviceVersionKey;
    }

    @NotNull
    public final String component3() {
        return this.devtodevUDID;
    }

    public final boolean component4() {
        return this.isRooted;
    }

    @NotNull
    public final String component5() {
        return this.language;
    }

    @NotNull
    public final String component6() {
        return this.macAddress;
    }

    @NotNull
    public final String component7() {
        return this.manufacturer;
    }

    @NotNull
    public final String component8() {
        return this.model;
    }

    @NotNull
    public final String component9() {
        return this.odin;
    }

    @NotNull
    public final DeviceConstants copy(@NotNull String androidId, @NotNull String deviceVersionKey, @NotNull String devtodevUDID, boolean z10, @NotNull String language, @NotNull String macAddress, @NotNull String manufacturer, @NotNull String model, @NotNull String odin, @NotNull String osKey, int i10, @NotNull String userAgent, int i11) {
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(deviceVersionKey, "deviceVersionKey");
        Intrinsics.checkNotNullParameter(devtodevUDID, "devtodevUDID");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(odin, "odin");
        Intrinsics.checkNotNullParameter(osKey, "osKey");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        return new DeviceConstants(androidId, deviceVersionKey, devtodevUDID, z10, language, macAddress, manufacturer, model, odin, osKey, i10, userAgent, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceConstants)) {
            return false;
        }
        DeviceConstants deviceConstants = (DeviceConstants) obj;
        return Intrinsics.areEqual(this.androidId, deviceConstants.androidId) && Intrinsics.areEqual(this.deviceVersionKey, deviceConstants.deviceVersionKey) && Intrinsics.areEqual(this.devtodevUDID, deviceConstants.devtodevUDID) && this.isRooted == deviceConstants.isRooted && Intrinsics.areEqual(this.language, deviceConstants.language) && Intrinsics.areEqual(this.macAddress, deviceConstants.macAddress) && Intrinsics.areEqual(this.manufacturer, deviceConstants.manufacturer) && Intrinsics.areEqual(this.model, deviceConstants.model) && Intrinsics.areEqual(this.odin, deviceConstants.odin) && Intrinsics.areEqual(this.osKey, deviceConstants.osKey) && this.timezoneOffset == deviceConstants.timezoneOffset && Intrinsics.areEqual(this.userAgent, deviceConstants.userAgent) && this.deviceType == deviceConstants.deviceType;
    }

    @NotNull
    public final String getAndroidId() {
        return this.androidId;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDeviceVersionKey() {
        return this.deviceVersionKey;
    }

    @NotNull
    public final String getDevtodevUDID() {
        return this.devtodevUDID;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getMacAddress() {
        return this.macAddress;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOdin() {
        return this.odin;
    }

    @NotNull
    public final String getOsKey() {
        return this.osKey;
    }

    public final int getTimezoneOffset() {
        return this.timezoneOffset;
    }

    @NotNull
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public int hashCode() {
        int iA = b.a(this.devtodevUDID, b.a(this.deviceVersionKey, this.androidId.hashCode() * 31, 31), 31);
        boolean z10 = this.isRooted;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.deviceType) + b.a(this.userAgent, (Integer.hashCode(this.timezoneOffset) + b.a(this.osKey, b.a(this.odin, b.a(this.model, b.a(this.manufacturer, b.a(this.macAddress, b.a(this.language, (iA + r10) * 31, 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    public final boolean isRooted() {
        return this.isRooted;
    }

    @NotNull
    public String toString() {
        return "DeviceConstants(androidId=" + this.androidId + ", deviceVersionKey=" + this.deviceVersionKey + ", devtodevUDID=" + this.devtodevUDID + ", isRooted=" + this.isRooted + ", language=" + this.language + ", macAddress=" + this.macAddress + ", manufacturer=" + this.manufacturer + ", model=" + this.model + ", odin=" + this.odin + ", osKey=" + this.osKey + ", timezoneOffset=" + this.timezoneOffset + ", userAgent=" + this.userAgent + ", deviceType=" + this.deviceType + ")";
    }
}
