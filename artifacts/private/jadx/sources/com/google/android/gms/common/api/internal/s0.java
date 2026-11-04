package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class s0 extends x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f106196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z0 f106197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(z0 z0Var, Map map) {
        super(z0Var, null);
        this.f106197c = z0Var;
        this.f106196b = map;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    @androidx.annotation.m1
    public final void a() {
        com.google.android.gms.common.internal.u0 u0Var = new com.google.android.gms.common.internal.u0(this.f106197c.f106272d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.google.android.gms.common.api.a.f fVar : this.f106196b.keySet()) {
            if (!fVar.s() || ((p0) this.f106196b.get(fVar)).f106163c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i10 = 0;
        int iB = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i10 < size) {
                iB = u0Var.b(this.f106197c.f106271c, (com.google.android.gms.common.api.a.f) arrayList.get(i10));
                i10++;
                if (iB != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                iB = u0Var.b(this.f106197c.f106271c, (com.google.android.gms.common.api.a.f) arrayList2.get(i10));
                i10++;
                if (iB == 0) {
                    break;
                }
            }
        }
        if (iB != 0) {
            ConnectionResult connectionResult = new ConnectionResult(iB, null);
            z0 z0Var = this.f106197c;
            z0Var.f106269a.f(new q0(this, z0Var, connectionResult));
            return;
        }
        z0 z0Var2 = this.f106197c;
        if (z0Var2.f106281m && z0Var2.f106279k != null) {
            z0Var2.f106279k.l();
        }
        for (com.google.android.gms.common.api.a.f fVar2 : this.f106196b.keySet()) {
            com.google.android.gms.common.internal.f.c cVar = (com.google.android.gms.common.internal.f.c) this.f106196b.get(fVar2);
            if (!fVar2.s() || u0Var.b(this.f106197c.f106271c, fVar2) == 0) {
                fVar2.g(cVar);
            } else {
                z0 z0Var3 = this.f106197c;
                z0Var3.f106269a.f(new r0(this, z0Var3, cVar));
            }
        }
    }
}
