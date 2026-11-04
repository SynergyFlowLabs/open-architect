package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class mc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d5 f110267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ rc f110268b;

    mc(rc rcVar, d5 d5Var) {
        this.f110267a = d5Var;
        Objects.requireNonNull(rcVar);
        this.f110268b = rcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc rcVar = this.f110268b;
        synchronized (rcVar) {
            try {
                rcVar.d(false);
                xc xcVar = rcVar.f110454c;
                if (!xcVar.W()) {
                    xcVar.f110184a.a().v().a("Connected to remote service");
                    xcVar.z(this.f110267a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        xc xcVar2 = this.f110268b.f110454c;
        if (xcVar2.P() != null) {
            xcVar2.P().shutdownNow();
            xcVar2.Q(null);
        }
    }
}
