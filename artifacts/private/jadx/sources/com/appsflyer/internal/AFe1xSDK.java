package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFe1xSDK {

    @NotNull
    public final AFe1wSDK AFAdRevenueData;

    @NotNull
    public final String getMediationNetwork;

    @Nullable
    public final String getRevenue;

    public AFe1xSDK(@NotNull String str, @Nullable String str2, @NotNull AFe1wSDK aFe1wSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1wSDK, "");
        this.getMediationNetwork = str;
        this.getRevenue = str2;
        this.AFAdRevenueData = aFe1wSDK;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1xSDK)) {
            return false;
        }
        AFe1xSDK aFe1xSDK = (AFe1xSDK) obj;
        return Intrinsics.areEqual(this.getMediationNetwork, aFe1xSDK.getMediationNetwork) && Intrinsics.areEqual(this.getRevenue, aFe1xSDK.getRevenue) && this.AFAdRevenueData == aFe1xSDK.AFAdRevenueData;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.getMediationNetwork.hashCode() * 31;
        String str = this.getRevenue;
        if (str == null) {
            iHashCode = 0;
            int i10 = 6 << 0;
        } else {
            iHashCode = str.hashCode();
        }
        return ((iHashCode2 + iHashCode) * 31) + this.AFAdRevenueData.hashCode();
    }

    @NotNull
    public final String toString() {
        return "HostMeta(name=" + this.getMediationNetwork + ", prefix=" + this.getRevenue + ", method=" + this.AFAdRevenueData + ")";
    }
}
