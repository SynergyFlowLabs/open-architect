package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class u7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j8 f110582b;

    u7(j8 j8Var, zzr zzrVar) {
        this.f110581a = zzrVar;
        Objects.requireNonNull(j8Var);
        this.f110582b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 j8Var = this.f110582b;
        j8Var.L().E();
        qe qeVarL = j8Var.L();
        qeVarL.b().h();
        qeVarL.O0();
        zzr zzrVar = this.f110581a;
        com.google.android.gms.common.internal.w.l(zzrVar.f110881a);
        qeVarL.P0(zzrVar);
        qeVarL.Q0(zzrVar);
    }
}
