package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1 f106142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f106143b = false;

    public n0(m1 m1Var) {
        int i10 = 2 & 0;
        this.f106142a = m1Var;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void b() {
        if (this.f106143b) {
            this.f106143b = false;
            this.f106142a.f(new m0(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void c(int i10) {
        this.f106142a.e(null);
        this.f106142a.f106137o.a(i10, this.f106143b);
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final e.a d(e.a aVar) {
        f(aVar);
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final boolean e() {
        if (!this.f106143b) {
            Set set = this.f106142a.f106136n.f106089z;
            if (set == null || set.isEmpty()) {
                this.f106142a.e(null);
                return true;
            }
            this.f106143b = true;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((e3) it.next()).k();
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final e.a f(e.a aVar) {
        try {
            this.f106142a.f106136n.A.a(aVar);
            i1 i1Var = this.f106142a.f106136n;
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) i1Var.f106081r.get(aVar.y());
            com.google.android.gms.common.internal.w.s(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f106142a.f106129g.containsKey(aVar.y())) {
                aVar.A(fVar);
                return aVar;
            }
            aVar.b(new Status(17));
            return aVar;
        } catch (DeadObjectException unused) {
            this.f106142a.f(new l0(this, this));
            return aVar;
        }
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void g(@androidx.annotation.p0 Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void h(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z10) {
    }

    final void j() {
        if (this.f106143b) {
            this.f106143b = false;
            this.f106142a.f106136n.A.b();
            e();
        }
    }
}
