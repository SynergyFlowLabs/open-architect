package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class h9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f110048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110049b;

    h9(ta taVar, long j10) {
        this.f110048a = j10;
        Objects.requireNonNull(taVar);
        this.f110049b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h7 h7Var = this.f110049b.f110184a;
        h6 h6Var = h7Var.x().f110167l;
        long j10 = this.f110048a;
        h6Var.b(j10);
        h7Var.a().v().b("Session timeout duration set", Long.valueOf(j10));
    }
}
