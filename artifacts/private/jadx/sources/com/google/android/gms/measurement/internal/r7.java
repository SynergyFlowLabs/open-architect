package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class r7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f110437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j8 f110438d;

    r7(j8 j8Var, String str, String str2, String str3) {
        this.f110435a = str;
        this.f110436b = str2;
        this.f110437c = str3;
        Objects.requireNonNull(j8Var);
        this.f110438d = j8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        j8 j8Var = this.f110438d;
        j8Var.L().E();
        return j8Var.L().F0().H0(this.f110435a, this.f110436b, this.f110437c);
    }
}
