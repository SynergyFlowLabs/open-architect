package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class n7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzah f110285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j8 f110286b;

    n7(j8 j8Var, zzah zzahVar) {
        this.f110285a = zzahVar;
        Objects.requireNonNull(j8Var);
        this.f110286b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 j8Var = this.f110286b;
        j8Var.L().E();
        zzah zzahVar = this.f110285a;
        if (zzahVar.f110847c.O1() == null) {
            j8Var.L().l0(zzahVar);
        } else {
            j8Var.L().j0(zzahVar);
        }
    }
}
