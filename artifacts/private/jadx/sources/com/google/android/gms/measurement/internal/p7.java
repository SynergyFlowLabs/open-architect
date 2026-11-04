package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class p7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f110352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j8 f110353d;

    p7(j8 j8Var, String str, String str2, String str3) {
        this.f110350a = str;
        this.f110351b = str2;
        this.f110352c = str3;
        Objects.requireNonNull(j8Var);
        this.f110353d = j8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        j8 j8Var = this.f110353d;
        j8Var.L().E();
        return j8Var.L().F0().D0(this.f110350a, this.f110351b, this.f110352c);
    }
}
