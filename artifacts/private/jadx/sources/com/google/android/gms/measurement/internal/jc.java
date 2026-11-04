package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class jc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d5 f110124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ rc f110125b;

    jc(rc rcVar, d5 d5Var) {
        this.f110124a = d5Var;
        Objects.requireNonNull(rcVar);
        this.f110125b = rcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc rcVar = this.f110125b;
        synchronized (rcVar) {
            try {
                rcVar.d(false);
                xc xcVar = rcVar.f110454c;
                if (!xcVar.W()) {
                    xcVar.f110184a.a().w().a("Connected to service");
                    xcVar.z(this.f110124a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
