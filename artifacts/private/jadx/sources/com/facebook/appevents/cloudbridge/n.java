package com.facebook.appevents.cloudbridge;

import androidx.core.app.w;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum n {
    EVENT(w.I0),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98759a;

    n(String str) {
        this.f98759a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        n[] nVarArrValuesCustom = values();
        return (n[]) Arrays.copyOf(nVarArrValuesCustom, nVarArrValuesCustom.length);
    }

    @NotNull
    public final String l() {
        return this.f98759a;
    }
}
