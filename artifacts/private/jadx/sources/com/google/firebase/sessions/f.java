package com.google.firebase.sessions;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public enum f implements com.google.firebase.encoders.json.g {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f125025i = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125026a;

    static {
        int i10 = 2 | 0;
        int i11 = 0 | 5;
    }

    f(int i10) {
        this.f125026a = i10;
    }

    @NotNull
    public static kotlin.enums.a<f> l() {
        return f125025i;
    }

    @Override // com.google.firebase.encoders.json.g
    public int i() {
        return this.f125026a;
    }
}
