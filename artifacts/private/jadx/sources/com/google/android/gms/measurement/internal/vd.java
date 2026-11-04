package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class vd extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ wd f110612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    vd(wd wdVar, m8 m8Var) {
        super(m8Var);
        Objects.requireNonNull(wdVar);
        this.f110612e = wdVar;
    }

    @Override // com.google.android.gms.measurement.internal.w
    public final void a() {
        wd wdVar = this.f110612e;
        wdVar.n();
        wdVar.f110184a.a().w().a("Starting upload from DelayedRunnable");
        wdVar.f110700b.r();
    }
}
