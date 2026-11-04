package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class m7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzah f110250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzr f110251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j8 f110252c;

    m7(j8 j8Var, zzah zzahVar, zzr zzrVar) {
        this.f110250a = zzahVar;
        this.f110251b = zzrVar;
        Objects.requireNonNull(j8Var);
        this.f110252c = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 j8Var = this.f110252c;
        j8Var.L().E();
        zzah zzahVar = this.f110250a;
        if (zzahVar.f110847c.O1() == null) {
            j8Var.L().m0(zzahVar, this.f110251b);
        } else {
            j8Var.L().k0(zzahVar, this.f110251b);
        }
    }
}
