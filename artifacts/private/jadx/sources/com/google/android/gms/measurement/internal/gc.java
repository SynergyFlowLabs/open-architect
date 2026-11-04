package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class gc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f109997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f109998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f109999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zzr f110000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ xc f110001e;

    gc(xc xcVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar) {
        this.f109997a = atomicReference;
        this.f109998b = str2;
        this.f109999c = str3;
        this.f110000d = zzrVar;
        Objects.requireNonNull(xcVar);
        this.f110001e = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f109997a;
        synchronized (atomicReference2) {
            try {
                try {
                    try {
                        xc xcVar = this.f110001e;
                        d5 d5VarN = xcVar.N();
                        if (d5VarN == null) {
                            xcVar.f110184a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f109998b, this.f109999c);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            zzr zzrVar = this.f110000d;
                            com.google.android.gms.common.internal.w.r(zzrVar);
                            atomicReference2.set(d5VarN.v8(this.f109998b, this.f109999c, zzrVar));
                        } else {
                            atomicReference2.set(d5VarN.I9(null, this.f109998b, this.f109999c));
                        }
                        xcVar.J();
                        atomicReference = this.f109997a;
                        atomicReference.notify();
                    } catch (RemoteException e10) {
                        this.f110001e.f110184a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.f109998b, e10);
                        this.f109997a.set(Collections.EMPTY_LIST);
                        atomicReference = this.f109997a;
                    }
                } catch (Throwable th2) {
                    this.f109997a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
