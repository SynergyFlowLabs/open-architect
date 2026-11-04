package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class i7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j8 f110081b;

    i7(j8 j8Var, String str) {
        this.f110080a = str;
        Objects.requireNonNull(j8Var);
        this.f110081b = j8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        j8 j8Var = this.f110081b;
        j8Var.L().E();
        return j8Var.L().F0().C0(this.f110080a);
    }
}
