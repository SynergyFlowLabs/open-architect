package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ad implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ qe f109758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f109759b;

    ad(fd fdVar, qe qeVar, Runnable runnable) {
        this.f109758a = qeVar;
        this.f109759b = runnable;
        Objects.requireNonNull(fdVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        qe qeVar = this.f109758a;
        qeVar.E();
        qeVar.D(this.f109759b);
        qeVar.r();
    }
}
