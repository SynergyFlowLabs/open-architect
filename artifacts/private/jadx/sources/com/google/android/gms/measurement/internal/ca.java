package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ca implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r8 f109846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f109847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f109848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ta f109849d;

    ca(ta taVar, r8 r8Var, long j10, boolean z10) {
        this.f109846a = r8Var;
        this.f109847b = j10;
        this.f109848c = z10;
        Objects.requireNonNull(taVar);
        this.f109849d = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta taVar = this.f109849d;
        r8 r8Var = this.f109846a;
        taVar.o(r8Var);
        taVar.Y(r8Var, this.f109847b, false, this.f109848c);
    }
}
