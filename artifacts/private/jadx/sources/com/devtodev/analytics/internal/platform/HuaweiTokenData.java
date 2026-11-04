package com.devtodev.analytics.internal.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class HuaweiTokenData {

    @Nullable
    private final String exception;
    private final boolean isLimitAdTrackingEnabled;

    @Nullable
    private final String token;

    public HuaweiTokenData(@Nullable String str, boolean z10, @Nullable String str2) {
        this.token = str;
        this.isLimitAdTrackingEnabled = z10;
        this.exception = str2;
    }

    public static /* synthetic */ HuaweiTokenData copy$default(HuaweiTokenData huaweiTokenData, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = huaweiTokenData.token;
        }
        if ((i10 & 2) != 0) {
            z10 = huaweiTokenData.isLimitAdTrackingEnabled;
        }
        if ((i10 & 4) != 0) {
            str2 = huaweiTokenData.exception;
        }
        return huaweiTokenData.copy(str, z10, str2);
    }

    @Nullable
    public final String component1() {
        return this.token;
    }

    public final boolean component2() {
        return this.isLimitAdTrackingEnabled;
    }

    @Nullable
    public final String component3() {
        return this.exception;
    }

    @NotNull
    public final HuaweiTokenData copy(@Nullable String str, boolean z10, @Nullable String str2) {
        return new HuaweiTokenData(str, z10, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HuaweiTokenData)) {
            return false;
        }
        HuaweiTokenData huaweiTokenData = (HuaweiTokenData) obj;
        return Intrinsics.areEqual(this.token, huaweiTokenData.token) && this.isLimitAdTrackingEnabled == huaweiTokenData.isLimitAdTrackingEnabled && Intrinsics.areEqual(this.exception, huaweiTokenData.exception);
    }

    @Nullable
    public final String getException() {
        return this.exception;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.isLimitAdTrackingEnabled;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
            int i10 = 0 >> 1;
        }
        int i11 = (iHashCode + r10) * 31;
        String str2 = this.exception;
        return i11 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    @NotNull
    public String toString() {
        return "HuaweiTokenData(token=" + this.token + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", exception=" + this.exception + ")";
    }
}
