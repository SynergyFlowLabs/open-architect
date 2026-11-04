package com.appsflyer;

import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum AFPurchaseType {
    SUBSCRIPTION("subscription"),
    ONE_TIME_PURCHASE("one_time_purchase");


    @NotNull
    private final String value;

    AFPurchaseType(String str) {
        this.value = str;
    }

    @i(name = "getValue")
    @NotNull
    public final String getValue() {
        return this.value;
    }
}
