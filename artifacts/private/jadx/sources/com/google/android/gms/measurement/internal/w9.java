package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class w9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110640b;

    w9(ta taVar, AtomicReference atomicReference) {
        this.f110639a = atomicReference;
        Objects.requireNonNull(taVar);
        this.f110640b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f110639a;
        synchronized (atomicReference) {
            try {
                try {
                    ta taVar = this.f110640b;
                    atomicReference.set(Long.valueOf(taVar.f110184a.w().D(taVar.f110184a.L().q(), z4.f110755d0)));
                    this.f110639a.notify();
                } catch (Throwable th2) {
                    this.f110639a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
