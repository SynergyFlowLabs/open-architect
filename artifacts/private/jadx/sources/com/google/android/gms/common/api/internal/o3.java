package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 extends t3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray f106159f;

    private o3(n nVar) {
        super(nVar, com.google.android.gms.common.f.x());
        this.f106159f = new SparseArray();
        this.f106121a.j("AutoManageHelper", this);
    }

    public static o3 u(l lVar) {
        n nVarE = m.e(lVar);
        o3 o3Var = (o3) nVarE.b("AutoManageHelper", o3.class);
        return o3Var != null ? o3Var : new o3(nVarE);
    }

    @androidx.annotation.p0
    private final n3 x(int i10) {
        if (this.f106159f.size() <= i10) {
            return null;
        }
        SparseArray sparseArray = this.f106159f;
        return (n3) sparseArray.get(sparseArray.keyAt(i10));
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        for (int i10 = 0; i10 < this.f106159f.size(); i10++) {
            n3 n3VarX = x(i10);
            if (n3VarX != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(n3VarX.f106148a);
                printWriter.println(":");
                n3VarX.f106149b.j(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.t3, com.google.android.gms.common.api.internal.m
    public final void k() {
        super.k();
        String.valueOf(this.f106159f);
        if (this.f106207c.get() == null) {
            for (int i10 = 0; i10 < this.f106159f.size(); i10++) {
                n3 n3VarX = x(i10);
                if (n3VarX != null) {
                    n3VarX.f106149b.g();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.t3, com.google.android.gms.common.api.internal.m
    public final void l() {
        super.l();
        for (int i10 = 0; i10 < this.f106159f.size(); i10++) {
            n3 n3VarX = x(i10);
            if (n3VarX != null) {
                n3VarX.f106149b.i();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.t3
    protected final void n(ConnectionResult connectionResult, int i10) {
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        n3 n3Var = (n3) this.f106159f.get(i10);
        if (n3Var != null) {
            w(i10);
            com.google.android.gms.common.api.l.c cVar = n3Var.f106150c;
            if (cVar != null) {
                cVar.n(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.t3
    protected final void o() {
        for (int i10 = 0; i10 < this.f106159f.size(); i10++) {
            n3 n3VarX = x(i10);
            if (n3VarX != null) {
                n3VarX.f106149b.g();
            }
        }
    }

    public final void v(int i10, com.google.android.gms.common.api.l lVar, @androidx.annotation.p0 com.google.android.gms.common.api.l.c cVar) {
        com.google.android.gms.common.internal.w.s(lVar, "GoogleApiClient instance cannot be null");
        com.google.android.gms.common.internal.w.y(this.f106159f.indexOfKey(i10) < 0, "Already managing a GoogleApiClient with id " + i10);
        q3 q3Var = (q3) this.f106207c.get();
        String.valueOf(q3Var);
        n3 n3Var = new n3(this, i10, lVar, cVar);
        lVar.C(n3Var);
        this.f106159f.put(i10, n3Var);
        if (this.f106206b && q3Var == null) {
            "connecting ".concat(lVar.toString());
            lVar.g();
        }
    }

    public final void w(int i10) {
        n3 n3Var = (n3) this.f106159f.get(i10);
        this.f106159f.remove(i10);
        if (n3Var != null) {
            n3Var.f106149b.G(n3Var);
            n3Var.f106149b.i();
        }
    }
}
