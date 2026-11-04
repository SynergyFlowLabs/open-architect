package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class qb extends i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xc f110394b;

    qb(xc xcVar, AtomicReference atomicReference) {
        this.f110393a = atomicReference;
        Objects.requireNonNull(xcVar);
        this.f110394b = xcVar;
    }

    @Override // com.google.android.gms.measurement.internal.j5
    @androidx.annotation.g
    public final void qe(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f110393a;
        synchronized (atomicReference) {
            try {
                this.f110394b.f110184a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(zzoqVar.f110873a.size()));
                atomicReference.set(zzoqVar);
                atomicReference.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
