package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class t9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f110530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110531b;

    t9(ta taVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f110530a = x1Var;
        Objects.requireNonNull(taVar);
        this.f110531b = taVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        ta taVar = this.f110531b;
        h7 h7Var = taVar.f110184a.z().f110184a;
        int i10 = 5 ^ 0;
        if (h7Var.x().w().o(q8.ANALYTICS_STORAGE)) {
            if (!h7Var.x().A(h7Var.e().currentTimeMillis()) && h7Var.x().f110173r.a() != 0) {
                lValueOf = Long.valueOf(h7Var.x().f110173r.a());
            }
            if (lValueOf == null) {
                taVar.f110184a.C().b0(this.f110530a, lValueOf.longValue());
            } else {
                try {
                    this.f110530a.r(null);
                    return;
                } catch (RemoteException e10) {
                    this.f110531b.f110184a.a().o().b("getSessionId failed with exception", e10);
                    return;
                }
            }
        }
        h7Var.a().t().a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        if (lValueOf == null) {
            this.f110530a.r(null);
            return;
        }
        taVar.f110184a.C().b0(this.f110530a, lValueOf.longValue());
    }
}
