package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class qc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f110395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ rc f110396b;

    qc(rc rcVar, ConnectionResult connectionResult) {
        this.f110395a = connectionResult;
        Objects.requireNonNull(rcVar);
        this.f110396b = rcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc xcVar = this.f110396b.f110454c;
        xcVar.O(null);
        if (this.f110395a.O1() != 7777) {
            xcVar.L();
            return;
        }
        if (xcVar.P() == null) {
            xcVar.Q(Executors.newScheduledThreadPool(1));
        }
        xcVar.P().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.oc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final xc xcVar2 = this.f110328a.f110396b.f110454c;
                xcVar2.f110184a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.pc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        xcVar2.w();
                    }
                });
            }
        }, ((Long) z4.f110746a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
