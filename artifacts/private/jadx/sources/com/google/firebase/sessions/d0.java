package com.google.firebase.sessions;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public enum d0 implements com.google.firebase.encoders.json.g {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f124977g = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124978a;

    d0(int i10) {
        this.f124978a = i10;
    }

    @NotNull
    public static kotlin.enums.a<d0> l() {
        return f124977g;
    }

    @Override // com.google.firebase.encoders.json.g
    public int i() {
        return this.f124978a;
    }
}
