package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AFi1vSDK {

    @NonNull
    public final String AFAdRevenueData;

    @androidx.annotation.p0
    public final Throwable component1;

    @androidx.annotation.p0
    public final String component3;

    @androidx.annotation.p0
    public final AFi1ySDK component4;

    @androidx.annotation.p0
    public final String getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final int getMonetizationNetwork;
    public final long getRevenue;

    public AFi1vSDK(@androidx.annotation.p0 String str, @NonNull String str2, long j10, long j11, int i10, @androidx.annotation.p0 AFi1ySDK aFi1ySDK, @androidx.annotation.p0 String str3, Throwable th2) {
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = str2;
        this.getRevenue = j10;
        this.getMediationNetwork = j11;
        this.getMonetizationNetwork = i10;
        this.component4 = aFi1ySDK;
        this.component3 = str3;
        this.component1 = th2;
    }
}
