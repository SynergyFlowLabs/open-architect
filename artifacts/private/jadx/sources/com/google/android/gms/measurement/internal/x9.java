package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class x9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110684b;

    x9(ta taVar, AtomicReference atomicReference) {
        this.f110683a = atomicReference;
        Objects.requireNonNull(taVar);
        this.f110684b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f110683a;
        synchronized (atomicReference) {
            try {
                try {
                    ta taVar = this.f110684b;
                    atomicReference.set(Integer.valueOf(taVar.f110184a.w().E(taVar.f110184a.L().q(), z4.f110758e0)));
                    this.f110683a.notify();
                } catch (Throwable th2) {
                    this.f110683a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
