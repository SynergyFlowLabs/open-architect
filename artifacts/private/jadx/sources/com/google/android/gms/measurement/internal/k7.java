package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class k7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j8 f110183b;

    k7(j8 j8Var, zzr zzrVar) {
        this.f110182a = zzrVar;
        Objects.requireNonNull(j8Var);
        this.f110183b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        j8 j8Var = this.f110183b;
        j8Var.L().E();
        j8Var.L().i0(this.f110182a);
    }
}
