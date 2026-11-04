package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class i9 extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ta f110084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i9(ta taVar, m8 m8Var) {
        super(m8Var);
        Objects.requireNonNull(taVar);
        this.f110084e = taVar;
    }

    @Override // com.google.android.gms.measurement.internal.w
    @androidx.annotation.m1
    public final void a() {
        this.f110084e.r();
    }
}
