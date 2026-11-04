package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class t7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j8 f110525b;

    t7(j8 j8Var, zzr zzrVar) {
        this.f110524a = zzrVar;
        Objects.requireNonNull(j8Var);
        this.f110525b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 j8Var = this.f110525b;
        j8Var.L().E();
        j8Var.L().b0(this.f110524a);
    }
}
