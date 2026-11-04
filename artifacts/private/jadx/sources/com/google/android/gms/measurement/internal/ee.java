package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ee implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ re f109936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ qe f109937b;

    ee(qe qeVar, re reVar) {
        this.f109936a = reVar;
        Objects.requireNonNull(qeVar);
        this.f109937b = qeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qe qeVar = this.f109937b;
        qeVar.u0(this.f109936a);
        qeVar.A0();
    }
}
