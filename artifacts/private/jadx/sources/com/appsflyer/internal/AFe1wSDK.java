package com.appsflyer.internal;

import io.intercom.android.sdk.metrics.MetricTracker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum AFe1wSDK {
    API(MetricTracker.Place.API),
    RC("rc"),
    DEFAULT("");


    @NotNull
    public final String getCurrencyIso4217Code;

    AFe1wSDK(String str) {
        this.getCurrencyIso4217Code = str;
    }
}
