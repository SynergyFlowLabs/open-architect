package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class l9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110232b;

    l9(ta taVar, AtomicReference atomicReference) {
        this.f110231a = atomicReference;
        Objects.requireNonNull(taVar);
        this.f110232b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f110231a;
        synchronized (atomicReference) {
            try {
                try {
                    ta taVar = this.f110232b;
                    atomicReference.set(Boolean.valueOf(taVar.f110184a.w().H(taVar.f110184a.L().q(), z4.f110749b0)));
                    this.f110231a.notify();
                } catch (Throwable th2) {
                    this.f110231a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
