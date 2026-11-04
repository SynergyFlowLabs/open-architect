package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ba implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r8 f109788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f109789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f109790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ta f109791d;

    ba(ta taVar, r8 r8Var, long j10, boolean z10) {
        this.f109788a = r8Var;
        this.f109789b = j10;
        this.f109790c = z10;
        Objects.requireNonNull(taVar);
        this.f109791d = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta taVar = this.f109791d;
        r8 r8Var = this.f109788a;
        taVar.o(r8Var);
        taVar.Y(r8Var, this.f109789b, true, this.f109790c);
    }
}
