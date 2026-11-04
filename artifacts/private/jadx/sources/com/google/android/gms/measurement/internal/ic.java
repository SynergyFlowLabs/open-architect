package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class ic implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f110091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zzr f110092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f110093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ xc f110094f;

    ic(xc xcVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar, boolean z10) {
        this.f110089a = atomicReference;
        this.f110090b = str2;
        this.f110091c = str3;
        this.f110092d = zzrVar;
        this.f110093e = z10;
        Objects.requireNonNull(xcVar);
        this.f110094f = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f110089a;
        synchronized (atomicReference2) {
            try {
                try {
                    try {
                        xc xcVar = this.f110094f;
                        d5 d5VarN = xcVar.N();
                        if (d5VarN == null) {
                            xcVar.f110184a.a().o().d("(legacy) Failed to get user properties; not connected to service", null, this.f110090b, this.f110091c);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            zzr zzrVar = this.f110092d;
                            com.google.android.gms.common.internal.w.r(zzrVar);
                            atomicReference2.set(d5VarN.k8(this.f110090b, this.f110091c, this.f110093e, zzrVar));
                        } else {
                            atomicReference2.set(d5VarN.S8(null, this.f110090b, this.f110091c, this.f110093e));
                        }
                        xcVar.J();
                        atomicReference = this.f110089a;
                        atomicReference.notify();
                    } catch (RemoteException e10) {
                        this.f110094f.f110184a.a().o().d("(legacy) Failed to get user properties; remote exception", null, this.f110090b, e10);
                        this.f110089a.set(Collections.EMPTY_LIST);
                        atomicReference = this.f110089a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                this.f110089a.notify();
                throw th3;
            }
        }
    }
}
