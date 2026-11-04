package com.google.android.gms.common.api.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class t0 extends x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f106202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z0 f106203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(z0 z0Var, ArrayList arrayList) {
        super(z0Var, null);
        this.f106203c = z0Var;
        this.f106202b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    @androidx.annotation.m1
    public final void a() {
        z0 z0Var = this.f106203c;
        z0Var.f106269a.f106136n.f106082s = z0.y(z0Var);
        ArrayList arrayList = this.f106202b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) arrayList.get(i10);
            z0 z0Var2 = this.f106203c;
            fVar.k(z0Var2.f106283o, z0Var2.f106269a.f106136n.f106082s);
        }
    }
}
