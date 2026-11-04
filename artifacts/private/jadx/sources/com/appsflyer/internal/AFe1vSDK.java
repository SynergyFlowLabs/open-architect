package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFe1vSDK {

    @NotNull
    final String AFAdRevenueData;

    @NotNull
    final String getMediationNetwork;

    public AFe1vSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1vSDK)) {
            return false;
        }
        AFe1vSDK aFe1vSDK = (AFe1vSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFe1vSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFe1vSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return (this.AFAdRevenueData.hashCode() * 31) + this.getMediationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        return "HostConfig(prefix=" + this.AFAdRevenueData + ", host=" + this.getMediationNetwork + ")";
    }
}
