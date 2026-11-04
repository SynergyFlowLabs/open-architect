package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class c9 implements com.google.common.util.concurrent.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzoh f109844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f109845b;

    c9(ta taVar, zzoh zzohVar) {
        this.f109844a = zzohVar;
        Objects.requireNonNull(taVar);
        this.f109845b = taVar;
    }

    private final void a() {
        h7 h7Var = this.f109845b.f110184a;
        SparseArray sparseArrayR = h7Var.x().r();
        zzoh zzohVar = this.f109844a;
        sparseArrayR.put(zzohVar.f110864c, Long.valueOf(zzohVar.f110863b));
        k6 k6VarX = h7Var.x();
        int[] iArr = new int[sparseArrayR.size()];
        long[] jArr = new long[sparseArrayR.size()];
        for (int i10 = 0; i10 < sparseArrayR.size(); i10++) {
            iArr[i10] = sparseArrayR.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayR.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        k6VarX.f110170o.b(bundle);
    }

    @Override // com.google.common.util.concurrent.e1
    public final void b(Object obj) {
        ta taVar = this.f109845b;
        taVar.h();
        a();
        int i10 = 5 >> 0;
        taVar.a0(false);
        taVar.c0(1);
        taVar.f110184a.a().v().b("Successfully registered trigger URI", this.f109844a.f110862a);
        taVar.y0();
    }

    @Override // com.google.common.util.concurrent.e1
    public final void onFailure(Throwable th2) {
        ta taVar = this.f109845b;
        taVar.h();
        taVar.a0(false);
        h7 h7Var = taVar.f110184a;
        int iE0 = (h7Var.w().H(null, z4.U0) ? taVar.e0(th2) : 2) - 1;
        if (iE0 == 0) {
            h7Var.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", w5.x(taVar.f110184a.L().q()), w5.x(th2.toString()));
            taVar.c0(1);
            taVar.x0().add(this.f109844a);
            return;
        }
        if (iE0 != 1) {
            h7Var.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", w5.x(taVar.f110184a.L().q()), th2);
            a();
            taVar.c0(1);
            taVar.y0();
            return;
        }
        taVar.x0().add(this.f109844a);
        if (taVar.b0() > ((Integer) z4.f110804x0.b(null)).intValue()) {
            taVar.c0(1);
            h7Var.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", w5.x(taVar.f110184a.L().q()), w5.x(th2.toString()));
        } else {
            h7Var.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", w5.x(taVar.f110184a.L().q()), w5.x(String.valueOf(taVar.b0())), w5.x(th2.toString()));
            taVar.W(taVar.b0());
            int iB0 = taVar.b0();
            taVar.c0(iB0 + iB0);
        }
    }
}
