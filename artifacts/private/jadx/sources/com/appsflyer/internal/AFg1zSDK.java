package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1zSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1zSDK(int i10, int i11, int i12, int i13, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork = i10;
        this.getCurrencyIso4217Code = i11;
        this.getRevenue = i12;
        this.AFAdRevenueData = i13;
        this.getMediationNetwork = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1zSDK)) {
            return false;
        }
        AFg1zSDK aFg1zSDK = (AFg1zSDK) obj;
        return this.getMonetizationNetwork == aFg1zSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFg1zSDK.getCurrencyIso4217Code && this.getRevenue == aFg1zSDK.getRevenue && this.AFAdRevenueData == aFg1zSDK.AFAdRevenueData && Intrinsics.areEqual(this.getMediationNetwork, aFg1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.getMonetizationNetwork) * 31) + Integer.hashCode(this.getCurrencyIso4217Code)) * 31) + Integer.hashCode(this.getRevenue)) * 31) + Integer.hashCode(this.AFAdRevenueData)) * 31) + this.getMediationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.getMonetizationNetwork + ", gdprApplies=" + this.getCurrencyIso4217Code + ", cmpSdkId=" + this.getRevenue + ", cmpSdkVersion=" + this.AFAdRevenueData + ", tcString=" + this.getMediationNetwork + ")";
    }
}
