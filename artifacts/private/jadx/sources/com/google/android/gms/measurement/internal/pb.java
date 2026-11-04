package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class pb extends f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110362a;

    pb(xc xcVar, AtomicReference atomicReference) {
        this.f110362a = atomicReference;
        Objects.requireNonNull(xcVar);
    }

    @Override // com.google.android.gms.measurement.internal.g5
    @androidx.annotation.g
    public final void Ib(List list) {
        AtomicReference atomicReference = this.f110362a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
