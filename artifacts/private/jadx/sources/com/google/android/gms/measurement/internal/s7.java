package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class s7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j8 f110474b;

    s7(j8 j8Var, zzr zzrVar) {
        this.f110473a = zzrVar;
        Objects.requireNonNull(j8Var);
        this.f110474b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 j8Var = this.f110474b;
        j8Var.L().E();
        qe qeVarL = j8Var.L();
        qeVarL.b().h();
        qeVarL.O0();
        zzr zzrVar = this.f110473a;
        com.google.android.gms.common.internal.w.l(zzrVar.f110881a);
        qeVarL.o0(zzrVar);
    }
}
