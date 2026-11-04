package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class q7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f110382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j8 f110383d;

    q7(j8 j8Var, String str, String str2, String str3) {
        this.f110380a = str;
        this.f110381b = str2;
        this.f110382c = str3;
        Objects.requireNonNull(j8Var);
        this.f110383d = j8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        j8 j8Var = this.f110383d;
        j8Var.L().E();
        return j8Var.L().F0().H0(this.f110380a, this.f110381b, this.f110382c);
    }
}
