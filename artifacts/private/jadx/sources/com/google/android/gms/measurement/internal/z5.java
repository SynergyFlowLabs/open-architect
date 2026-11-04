package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.m1
final class z5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y5 f110809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f110810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f110811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f110812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f110813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f110814f;

    /* synthetic */ z5(String str, y5 y5Var, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        com.google.android.gms.common.internal.w.r(y5Var);
        this.f110809a = y5Var;
        this.f110810b = i10;
        this.f110811c = th2;
        this.f110812d = bArr;
        this.f110813e = str;
        this.f110814f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110809a.a(this.f110813e, this.f110810b, this.f110811c, this.f110812d, this.f110814f);
    }
}
