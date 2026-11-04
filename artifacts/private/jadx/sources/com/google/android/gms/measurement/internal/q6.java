package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class q6 extends androidx.collection.d1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ x6 f110379j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q6(x6 x6Var, int i10) {
        super(20);
        Objects.requireNonNull(x6Var);
        this.f110379j = x6Var;
    }

    @Override // androidx.collection.d1
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        com.google.android.gms.common.internal.w.l(str);
        return this.f110379j.o(str);
    }
}
