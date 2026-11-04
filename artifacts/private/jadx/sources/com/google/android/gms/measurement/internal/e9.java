package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class e9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f109915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f109916b;

    e9(ta taVar, boolean z10) {
        this.f109915a = z10;
        Objects.requireNonNull(taVar);
        this.f109916b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta taVar = this.f109916b;
        h7 h7Var = taVar.f110184a;
        boolean zG = h7Var.g();
        boolean zF = h7Var.f();
        boolean z10 = this.f109915a;
        h7Var.P(z10);
        if (zF == z10) {
            h7Var.a().w().b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (h7Var.g() == zG || h7Var.g() != h7Var.f()) {
            h7Var.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(zG));
        }
        taVar.Z();
    }
}
