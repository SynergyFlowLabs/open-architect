package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bc extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ xc f109798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(xc xcVar, m8 m8Var) {
        super(m8Var);
        Objects.requireNonNull(xcVar);
        this.f109798e = xcVar;
    }

    @Override // com.google.android.gms.measurement.internal.w
    public final void a() {
        this.f109798e.f110184a.a().r().a("Tasks have been queued for a long time");
    }
}
