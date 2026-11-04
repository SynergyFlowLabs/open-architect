package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class z7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzpl f110815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzr f110816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j8 f110817c;

    z7(j8 j8Var, zzpl zzplVar, zzr zzrVar) {
        this.f110815a = zzplVar;
        this.f110816b = zzrVar;
        Objects.requireNonNull(j8Var);
        this.f110817c = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 j8Var = this.f110817c;
        j8Var.L().E();
        zzpl zzplVar = this.f110815a;
        if (zzplVar.O1() != null) {
            j8Var.L().c0(zzplVar, this.f110816b);
        } else {
            zzr zzrVar = this.f110816b;
            j8Var.L().d0(zzplVar.f110875b, zzrVar);
        }
    }
}
