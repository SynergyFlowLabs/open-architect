package com.google.firebase.sessions;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public enum l implements com.google.firebase.encoders.json.g {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f125054e = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125055a;

    l(int i10) {
        this.f125055a = i10;
    }

    @NotNull
    public static kotlin.enums.a<l> l() {
        return f125054e;
    }

    @Override // com.google.firebase.encoders.json.g
    public int i() {
        return this.f125055a;
    }
}
