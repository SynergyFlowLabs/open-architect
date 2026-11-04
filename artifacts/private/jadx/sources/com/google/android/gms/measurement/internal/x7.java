package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class x7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbg f110679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j8 f110681c;

    x7(j8 j8Var, zzbg zzbgVar, String str) {
        this.f110679a = zzbgVar;
        this.f110680b = str;
        Objects.requireNonNull(j8Var);
        this.f110681c = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 j8Var = this.f110681c;
        j8Var.L().E();
        j8Var.L().i(this.f110679a, this.f110680b);
    }
}
