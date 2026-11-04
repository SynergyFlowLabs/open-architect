package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface AFd1vSDK {

    public interface AFa1ySDK {
        void onConfigurationChanged(boolean z10);
    }

    void AFAdRevenueData();

    void AFAdRevenueData(@androidx.annotation.p0 AFa1ySDK aFa1ySDK);

    void getCurrencyIso4217Code();

    void getMediationNetwork(@NonNull Throwable th2, @NonNull String str);
}
