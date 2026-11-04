package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class l3 extends h3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.a f106120c;

    public l3(o.a aVar, com.google.android.gms.tasks.l lVar) {
        super(4, lVar);
        this.f106120c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.h3, com.google.android.gms.common.api.internal.m3
    public final /* bridge */ /* synthetic */ void d(@NonNull h0 h0Var, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.g2
    public final boolean f(u1 u1Var) {
        n2 n2Var = (n2) u1Var.y().get(this.f106120c);
        return n2Var != null && n2Var.f106145a.f();
    }

    @Override // com.google.android.gms.common.api.internal.g2
    @androidx.annotation.p0
    public final Feature[] g(u1 u1Var) {
        n2 n2Var = (n2) u1Var.y().get(this.f106120c);
        if (n2Var == null) {
            return null;
        }
        return n2Var.f106145a.c();
    }

    @Override // com.google.android.gms.common.api.internal.h3
    public final void h(u1 u1Var) throws RemoteException {
        n2 n2Var = (n2) u1Var.y().remove(this.f106120c);
        if (n2Var == null) {
            this.f106044b.e(Boolean.FALSE);
            return;
        }
        n2Var.f106146b.b(u1Var.w(), this.f106044b);
        n2Var.f106145a.a();
    }
}
