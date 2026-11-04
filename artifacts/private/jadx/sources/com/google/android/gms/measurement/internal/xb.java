package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class xb extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ xc f110691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    xb(xc xcVar, m8 m8Var) {
        super(m8Var);
        Objects.requireNonNull(xcVar);
        this.f110691e = xcVar;
    }

    @Override // com.google.android.gms.measurement.internal.w
    public final void a() {
        xc xcVar = this.f110691e;
        xcVar.h();
        if (xcVar.W()) {
            xcVar.f110184a.a().w().a("Inactivity, disconnecting from the service");
            xcVar.A();
        }
    }
}
