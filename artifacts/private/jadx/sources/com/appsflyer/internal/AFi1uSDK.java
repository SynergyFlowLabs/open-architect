package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AFi1uSDK {

    @NonNull
    public final AFi1ySDK AFAdRevenueData;
    private boolean getMonetizationNetwork;

    public AFi1uSDK(boolean z10, @NonNull AFi1ySDK aFi1ySDK) {
        this.getMonetizationNetwork = z10;
        this.AFAdRevenueData = aFi1ySDK;
    }

    public final boolean getRevenue() {
        return this.getMonetizationNetwork;
    }
}
