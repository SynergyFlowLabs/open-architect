package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class j7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j8 f110108b;

    j7(j8 j8Var, zzr zzrVar) {
        this.f110107a = zzrVar;
        Objects.requireNonNull(j8Var);
        this.f110108b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 j8Var = this.f110108b;
        j8Var.L().E();
        j8Var.L().h0(this.f110107a);
    }
}
