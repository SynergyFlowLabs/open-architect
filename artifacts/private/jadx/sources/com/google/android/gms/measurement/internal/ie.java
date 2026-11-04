package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class ie implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f110096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ qe f110097b;

    ie(qe qeVar, zzr zzrVar) {
        this.f110096a = zzrVar;
        Objects.requireNonNull(qeVar);
        this.f110097b = qeVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzr zzrVar = this.f110096a;
        String str = (String) com.google.android.gms.common.internal.w.r(zzrVar.f110881a);
        qe qeVar = this.f110097b;
        r8 r8VarG = qeVar.g(str);
        q8 q8Var = q8.ANALYTICS_STORAGE;
        if (r8VarG.o(q8Var) && r8.f(zzrVar.f110907w, 100).o(q8Var)) {
            return qeVar.o0(zzrVar).p0();
        }
        qeVar.a().w().a("Analytics storage consent denied. Returning null app instance id");
        int i10 = 2 >> 0;
        return null;
    }
}
