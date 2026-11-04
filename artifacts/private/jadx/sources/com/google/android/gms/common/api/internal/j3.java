package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class j3 extends h3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2 f106108c;

    public j3(n2 n2Var, com.google.android.gms.tasks.l lVar) {
        super(3, lVar);
        this.f106108c = n2Var;
    }

    @Override // com.google.android.gms.common.api.internal.h3, com.google.android.gms.common.api.internal.m3
    public final /* bridge */ /* synthetic */ void d(@NonNull h0 h0Var, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.g2
    public final boolean f(u1 u1Var) {
        return this.f106108c.f106145a.f();
    }

    @Override // com.google.android.gms.common.api.internal.g2
    @androidx.annotation.p0
    public final Feature[] g(u1 u1Var) {
        return this.f106108c.f106145a.c();
    }

    @Override // com.google.android.gms.common.api.internal.h3
    public final void h(u1 u1Var) throws RemoteException {
        this.f106108c.f106145a.d(u1Var.w(), this.f106044b);
        o.a aVarB = this.f106108c.f106145a.b();
        if (aVarB != null) {
            u1Var.y().put(aVarB, this.f106108c);
        }
    }
}
