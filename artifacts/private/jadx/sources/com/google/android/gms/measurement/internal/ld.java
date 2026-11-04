package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ld extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ nd f110237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ld(nd ndVar, m8 m8Var) {
        super(m8Var);
        Objects.requireNonNull(ndVar);
        this.f110237e = ndVar;
    }

    @Override // com.google.android.gms.measurement.internal.w
    @androidx.annotation.m1
    public final void a() {
        nd ndVar = this.f110237e;
        pd pdVar = ndVar.f110299d;
        pdVar.h();
        h7 h7Var = pdVar.f110184a;
        ndVar.d(false, false, h7Var.e().b());
        pdVar.f110184a.M().k(h7Var.e().b());
    }
}
