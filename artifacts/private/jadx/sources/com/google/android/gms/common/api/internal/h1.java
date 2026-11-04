package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
final class h1 extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f106042a;

    h1(i1 i1Var) {
        this.f106042a = new WeakReference(i1Var);
    }

    @Override // com.google.android.gms.common.api.internal.a2
    public final void a() {
        i1 i1Var = (i1) this.f106042a.get();
        if (i1Var == null) {
            return;
        }
        i1.P(i1Var);
    }
}
