package com.devtodev.analytics.internal.backend;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Identifiers {

    @Nullable
    private Long crossPlatformDevtodevId;

    @NotNull
    private final String deviceId;

    @Nullable
    private Long devtodevId;

    @Nullable
    private Long devtodevIdTimestamp;
    private boolean isValid;

    @Nullable
    private final String previousDeviceId;

    @Nullable
    private final String previousUserId;

    @Nullable
    private final String userId;

    public Identifiers(@NotNull String deviceId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, boolean z10) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.previousDeviceId = str;
        this.userId = str2;
        this.previousUserId = str3;
        this.devtodevId = l10;
        this.crossPlatformDevtodevId = l11;
        this.devtodevIdTimestamp = l12;
        this.isValid = z10;
    }

    public static /* synthetic */ Identifiers copy$default(Identifiers identifiers, String str, String str2, String str3, String str4, Long l10, Long l11, Long l12, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = identifiers.deviceId;
        }
        if ((i10 & 2) != 0) {
            str2 = identifiers.previousDeviceId;
        }
        if ((i10 & 4) != 0) {
            str3 = identifiers.userId;
        }
        if ((i10 & 8) != 0) {
            str4 = identifiers.previousUserId;
        }
        if ((i10 & 16) != 0) {
            l10 = identifiers.devtodevId;
        }
        if ((i10 & 32) != 0) {
            l11 = identifiers.crossPlatformDevtodevId;
        }
        if ((i10 & 64) != 0) {
            l12 = identifiers.devtodevIdTimestamp;
        }
        if ((i10 & 128) != 0) {
            z10 = identifiers.isValid;
        }
        Long l13 = l12;
        boolean z11 = z10;
        Long l14 = l10;
        Long l15 = l11;
        return identifiers.copy(str, str2, str3, str4, l14, l15, l13, z11);
    }

    @NotNull
    public final String component1() {
        return this.deviceId;
    }

    @Nullable
    public final String component2() {
        return this.previousDeviceId;
    }

    @Nullable
    public final String component3() {
        return this.userId;
    }

    @Nullable
    public final String component4() {
        return this.previousUserId;
    }

    @Nullable
    public final Long component5() {
        return this.devtodevId;
    }

    @Nullable
    public final Long component6() {
        return this.crossPlatformDevtodevId;
    }

    @Nullable
    public final Long component7() {
        return this.devtodevIdTimestamp;
    }

    public final boolean component8() {
        return this.isValid;
    }

    @NotNull
    public final Identifiers copy(@NotNull String deviceId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, boolean z10) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new Identifiers(deviceId, str, str2, str3, l10, l11, l12, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Identifiers)) {
            return false;
        }
        Identifiers identifiers = (Identifiers) obj;
        if (Intrinsics.areEqual(this.deviceId, identifiers.deviceId) && Intrinsics.areEqual(this.previousDeviceId, identifiers.previousDeviceId) && Intrinsics.areEqual(this.userId, identifiers.userId) && Intrinsics.areEqual(this.previousUserId, identifiers.previousUserId) && Intrinsics.areEqual(this.devtodevId, identifiers.devtodevId) && Intrinsics.areEqual(this.crossPlatformDevtodevId, identifiers.crossPlatformDevtodevId) && Intrinsics.areEqual(this.devtodevIdTimestamp, identifiers.devtodevIdTimestamp) && this.isValid == identifiers.isValid) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Long getCrossPlatformDevtodevId() {
        return this.crossPlatformDevtodevId;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final Long getDevtodevId() {
        return this.devtodevId;
    }

    @Nullable
    public final Long getDevtodevIdTimestamp() {
        return this.devtodevIdTimestamp;
    }

    @Nullable
    public final String getPreviousDeviceId() {
        return this.previousDeviceId;
    }

    @Nullable
    public final String getPreviousUserId() {
        return this.previousUserId;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public int hashCode() {
        int iHashCode = this.deviceId.hashCode() * 31;
        String str = this.previousDeviceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.previousUserId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.devtodevId;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.crossPlatformDevtodevId;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.devtodevIdTimestamp;
        int iHashCode7 = (iHashCode6 + (l12 != null ? l12.hashCode() : 0)) * 31;
        boolean z10 = this.isValid;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode7 + r10;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final void setCrossPlatformDevtodevId(@Nullable Long l10) {
        this.crossPlatformDevtodevId = l10;
    }

    public final void setDevtodevId(@Nullable Long l10) {
        this.devtodevId = l10;
    }

    public final void setDevtodevIdTimestamp(@Nullable Long l10) {
        this.devtodevIdTimestamp = l10;
    }

    public final void setValid(boolean z10) {
        this.isValid = z10;
    }

    @NotNull
    public String toString() {
        return "Identifiers(deviceId=" + this.deviceId + ", previousDeviceId=" + this.previousDeviceId + ", userId=" + this.userId + ", previousUserId=" + this.previousUserId + ", devtodevId=" + this.devtodevId + ", crossPlatformDevtodevId=" + this.crossPlatformDevtodevId + ", devtodevIdTimestamp=" + this.devtodevIdTimestamp + ", isValid=" + this.isValid + ")";
    }

    public /* synthetic */ Identifiers(String str, String str2, String str3, String str4, Long l10, Long l11, Long l12, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? null : l11, (i10 & 64) != 0 ? null : l12, z10);
    }
}
