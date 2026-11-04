package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum bb {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    BACKOFF(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109797a;

    bb(int i10) {
        this.f109797a = i10;
    }

    public final int a() {
        return this.f109797a;
    }
}
