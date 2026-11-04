package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class d6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f109874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e6 f109875b;

    d6(e6 e6Var, boolean z10) {
        this.f109874a = z10;
        Objects.requireNonNull(e6Var);
        this.f109875b = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f109875b.c().s0(this.f109874a);
    }
}
