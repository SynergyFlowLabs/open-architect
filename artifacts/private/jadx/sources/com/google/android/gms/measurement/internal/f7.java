package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class f7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ y8 f109949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h7 f109950b;

    f7(h7 h7Var, y8 y8Var) {
        this.f109949a = y8Var;
        Objects.requireNonNull(h7Var);
        this.f109950b = h7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h7 h7Var = this.f109950b;
        y8 y8Var = this.f109949a;
        h7Var.p(y8Var);
        h7Var.v(y8Var.f110728d);
    }
}
