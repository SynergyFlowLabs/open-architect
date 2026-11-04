package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum k {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98714a;

    static {
        int i10 = 3 >> 1;
    }

    k(String str) {
        this.f98714a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        k[] kVarArrValuesCustom = values();
        return (k[]) Arrays.copyOf(kVarArrValuesCustom, kVarArrValuesCustom.length);
    }

    @NotNull
    public final String l() {
        return this.f98714a;
    }
}
