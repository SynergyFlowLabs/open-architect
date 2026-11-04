package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends t3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.collection.c f106066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f106067g;

    @androidx.annotation.l1
    i0(n nVar, i iVar, com.google.android.gms.common.f fVar) {
        super(nVar, fVar);
        this.f106066f = new androidx.collection.c();
        this.f106067g = iVar;
        this.f106121a.j("ConnectionlessLifecycleHelper", this);
    }

    @androidx.annotation.l0
    public static void v(Activity activity, i iVar, c cVar) {
        n nVarC = m.c(activity);
        i0 i0Var = (i0) nVarC.b("ConnectionlessLifecycleHelper", i0.class);
        if (i0Var == null) {
            i0Var = new i0(nVarC, iVar, com.google.android.gms.common.f.x());
        }
        com.google.android.gms.common.internal.w.s(cVar, "ApiKey cannot be null");
        i0Var.f106066f.add(cVar);
        iVar.b(i0Var);
    }

    private final void w() {
        if (this.f106066f.isEmpty()) {
            return;
        }
        this.f106067g.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void i() {
        super.i();
        w();
    }

    @Override // com.google.android.gms.common.api.internal.t3, com.google.android.gms.common.api.internal.m
    public final void k() {
        super.k();
        w();
    }

    @Override // com.google.android.gms.common.api.internal.t3, com.google.android.gms.common.api.internal.m
    public final void l() {
        super.l();
        this.f106067g.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.t3
    protected final void n(ConnectionResult connectionResult, int i10) {
        this.f106067g.K(connectionResult, i10);
    }

    @Override // com.google.android.gms.common.api.internal.t3
    protected final void o() {
        this.f106067g.L();
    }

    final androidx.collection.c u() {
        return this.f106066f;
    }
}
