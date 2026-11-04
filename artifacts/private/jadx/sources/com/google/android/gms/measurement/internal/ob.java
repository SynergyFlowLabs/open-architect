package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class ob implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzr f110325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f110326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ xc f110327d;

    ob(xc xcVar, AtomicReference atomicReference, zzr zzrVar, boolean z10) {
        this.f110324a = atomicReference;
        this.f110325b = zzrVar;
        this.f110326c = z10;
        Objects.requireNonNull(xcVar);
        this.f110327d = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f110324a;
        synchronized (atomicReference2) {
            try {
                try {
                    try {
                        xc xcVar = this.f110327d;
                        d5 d5VarN = xcVar.N();
                        if (d5VarN == null) {
                            xcVar.f110184a.a().o().a("Failed to get all user properties; not connected to service");
                            atomicReference2.notify();
                            return;
                        }
                        zzr zzrVar = this.f110325b;
                        com.google.android.gms.common.internal.w.r(zzrVar);
                        atomicReference2.set(d5VarN.m5(zzrVar, this.f110326c));
                        xcVar.J();
                        atomicReference = this.f110324a;
                        atomicReference.notify();
                    } catch (RemoteException e10) {
                        this.f110327d.f110184a.a().o().b("Failed to get all user properties; remote exception", e10);
                        atomicReference = this.f110324a;
                    }
                } catch (Throwable th2) {
                    this.f110324a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
