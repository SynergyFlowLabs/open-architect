package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFi1xSDK {

    @NotNull
    public final String AFAdRevenueData;

    @NotNull
    public final String component2;

    @NotNull
    public List<String> getCurrencyIso4217Code;
    public long getMediationNetwork;
    public final int getMonetizationNetwork;
    public final float getRevenue;

    @oj.j
    public AFi1xSDK(long j10, float f10, @NotNull List<String> list, int i10, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getMediationNetwork = j10;
        this.getRevenue = f10;
        this.getCurrencyIso4217Code = list;
        this.getMonetizationNetwork = i10;
        this.AFAdRevenueData = str;
        this.component2 = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AFi1xSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFi1xSDK aFi1xSDK = (AFi1xSDK) obj;
        return this.getMediationNetwork == aFi1xSDK.getMediationNetwork && this.getRevenue == aFi1xSDK.getRevenue && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1xSDK.getCurrencyIso4217Code) && this.getMonetizationNetwork == aFi1xSDK.getMonetizationNetwork && Intrinsics.areEqual(this.AFAdRevenueData, aFi1xSDK.AFAdRevenueData) && Intrinsics.areEqual(this.component2, aFi1xSDK.component2);
    }

    @oj.i(name = "getCurrencyIso4217Code")
    public final boolean getCurrencyIso4217Code() {
        return TimeUnit.SECONDS.toMillis(this.getMediationNetwork) > ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData().component3().AFAdRevenueData();
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.getMediationNetwork) * 31) + Float.hashCode(this.getRevenue)) * 31) + this.getCurrencyIso4217Code.hashCode()) * 31) + this.getMonetizationNetwork) * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.component2.hashCode();
    }
}
