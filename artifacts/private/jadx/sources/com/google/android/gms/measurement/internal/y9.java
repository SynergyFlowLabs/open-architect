package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class y9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110733b;

    y9(ta taVar, AtomicReference atomicReference) {
        this.f110732a = atomicReference;
        Objects.requireNonNull(taVar);
        this.f110733b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f110732a;
        synchronized (atomicReference) {
            try {
                try {
                    ta taVar = this.f110733b;
                    atomicReference.set(Double.valueOf(taVar.f110184a.w().G(taVar.f110184a.L().q(), z4.f110761f0)));
                    this.f110732a.notify();
                } catch (Throwable th2) {
                    this.f110732a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
