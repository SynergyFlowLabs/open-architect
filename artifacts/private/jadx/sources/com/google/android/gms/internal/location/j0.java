package com.google.android.gms.internal.location;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class j0 implements com.google.android.gms.common.api.internal.w, v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f108124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private com.google.android.gms.common.api.internal.o f108125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f108126c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k0 f108127d;

    j0(k0 k0Var, com.google.android.gms.common.api.internal.o oVar, i0 i0Var) {
        this.f108127d = k0Var;
        this.f108125b = oVar;
        this.f108124a = i0Var;
    }

    @Override // com.google.android.gms.internal.location.v2
    public final synchronized com.google.android.gms.common.api.internal.o a() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f108125b;
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        com.google.android.gms.common.api.internal.o.a aVarB;
        boolean z10;
        d3 d3Var = (d3) obj;
        com.google.android.gms.tasks.l lVar = (com.google.android.gms.tasks.l) obj2;
        synchronized (this) {
            try {
                aVarB = this.f108125b.b();
                z10 = this.f108126c;
                this.f108125b.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVarB == null) {
            lVar.c(Boolean.FALSE);
        } else {
            this.f108124a.a(d3Var, aVarB, z10, lVar);
        }
    }

    @Override // com.google.android.gms.internal.location.v2
    public final synchronized void b(com.google.android.gms.common.api.internal.o oVar) {
        com.google.android.gms.common.api.internal.o oVar2 = this.f108125b;
        if (oVar2 != oVar) {
            oVar2.a();
            this.f108125b = oVar;
        }
    }

    @Override // com.google.android.gms.internal.location.v2
    public final void h() {
        com.google.android.gms.common.api.internal.o.a<?> aVarB;
        synchronized (this) {
            this.f108126c = false;
            aVarB = this.f108125b.b();
        }
        if (aVarB != null) {
            this.f108127d.v0(aVarB, 2441);
        }
    }
}
