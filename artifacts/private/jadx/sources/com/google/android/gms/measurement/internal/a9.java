package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class a9 extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ta f109750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a9(ta taVar, m8 m8Var) {
        super(m8Var);
        Objects.requireNonNull(taVar);
        this.f109750e = taVar;
    }

    @Override // com.google.android.gms.measurement.internal.w
    @androidx.annotation.m1
    public final void a() {
        final ta taVarB = this.f109750e.f110184a.B();
        Objects.requireNonNull(taVarB);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.z8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                taVarB.v0();
            }
        }).start();
    }
}
