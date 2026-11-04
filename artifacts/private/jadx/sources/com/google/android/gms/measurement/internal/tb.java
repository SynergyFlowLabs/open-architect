package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class tb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzr f110554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ xc f110555c;

    tb(xc xcVar, AtomicReference atomicReference, zzr zzrVar) {
        this.f110553a = atomicReference;
        this.f110554b = zzrVar;
        Objects.requireNonNull(xcVar);
        this.f110555c = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f110553a;
        synchronized (atomicReference2) {
            try {
                try {
                    xc xcVar = this.f110555c;
                    h7 h7Var = xcVar.f110184a;
                    if (h7Var.x().w().o(q8.ANALYTICS_STORAGE)) {
                        d5 d5VarN = xcVar.N();
                        if (d5VarN != null) {
                            zzr zzrVar = this.f110554b;
                            com.google.android.gms.common.internal.w.r(zzrVar);
                            atomicReference2.set(d5VarN.Z4(zzrVar));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                xcVar.f110184a.B().F(str);
                                h7Var.x().f110163h.b(str);
                            }
                            xcVar.J();
                            atomicReference = this.f110553a;
                            atomicReference.notify();
                            return;
                        }
                        h7Var.a().o().a("Failed to get app instance id");
                        atomicReference2.notify();
                    } else {
                        h7Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                        xcVar.f110184a.B().F(null);
                        h7Var.x().f110163h.b(null);
                        atomicReference2.set(null);
                        atomicReference2.notify();
                    }
                } catch (RemoteException e10) {
                    this.f110555c.f110184a.a().o().b("Failed to get app instance id", e10);
                    atomicReference = this.f110553a;
                }
            } catch (Throwable th2) {
                this.f110553a.notify();
                throw th2;
            }
        }
    }
}
