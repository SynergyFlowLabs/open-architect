package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f110658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y1 f110659b;

    x0(y1 y1Var, long j10) {
        this.f110658a = j10;
        Objects.requireNonNull(y1Var);
        this.f110659b = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110659b.n(this.f110658a);
    }
}
