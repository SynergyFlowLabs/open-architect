package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1aSDK {

    @oj.f
    public final long AFAdRevenueData;

    @oj.f
    public final boolean getMediationNetwork;

    @oj.f
    @NotNull
    public final String getRevenue;

    public AFf1aSDK(@NotNull String str, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
        this.AFAdRevenueData = j10;
        this.getMediationNetwork = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.areEqual(this.getRevenue, aFf1aSDK.getRevenue) && this.AFAdRevenueData == aFf1aSDK.AFAdRevenueData && this.getMediationNetwork == aFf1aSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iHashCode = ((this.getRevenue.hashCode() * 31) + Long.hashCode(this.AFAdRevenueData)) * 31;
        boolean z10 = this.getMediationNetwork;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @NotNull
    public final String toString() {
        return "AFUninstallToken(token=" + this.getRevenue + ", receivedTime=" + this.AFAdRevenueData + ", isQueued=" + this.getMediationNetwork + ")";
    }
}
