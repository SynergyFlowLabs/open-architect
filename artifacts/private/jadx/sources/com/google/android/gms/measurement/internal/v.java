package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m8 f110593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f110594b;

    v(w wVar, m8 m8Var) {
        this.f110593a = m8Var;
        Objects.requireNonNull(wVar);
        this.f110594b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m8 m8Var = this.f110593a;
        m8Var.c();
        if (f.a()) {
            m8Var.b().t(this);
            return;
        }
        w wVar = this.f110594b;
        boolean zC = wVar.c();
        wVar.e(0L);
        if (zC) {
            wVar.a();
        }
    }
}
