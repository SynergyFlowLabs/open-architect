package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class v9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110606b;

    v9(ta taVar, AtomicReference atomicReference) {
        this.f110605a = atomicReference;
        Objects.requireNonNull(taVar);
        this.f110606b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f110605a;
        synchronized (atomicReference) {
            try {
                try {
                    ta taVar = this.f110606b;
                    atomicReference.set(taVar.f110184a.w().C(taVar.f110184a.L().q(), z4.f110752c0));
                    this.f110605a.notify();
                } catch (Throwable th2) {
                    this.f110605a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
