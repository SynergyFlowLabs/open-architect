package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class o7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f110312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j8 f110313d;

    o7(j8 j8Var, String str, String str2, String str3) {
        this.f110310a = str;
        this.f110311b = str2;
        this.f110312c = str3;
        Objects.requireNonNull(j8Var);
        this.f110313d = j8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        j8 j8Var = this.f110313d;
        j8Var.L().E();
        return j8Var.L().F0().D0(this.f110310a, this.f110311b, this.f110312c);
    }
}
