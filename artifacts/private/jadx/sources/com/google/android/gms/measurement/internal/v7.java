package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class v7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j8 f110604b;

    v7(j8 j8Var, zzr zzrVar) {
        this.f110603a = zzrVar;
        Objects.requireNonNull(j8Var);
        this.f110604b = j8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        j8 j8Var = this.f110604b;
        j8Var.L().E();
        return new zzao(j8Var.L().S0(this.f110603a.f110881a));
    }
}
