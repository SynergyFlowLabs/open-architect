package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f106021a;

    @androidx.annotation.l1(otherwise = 2)
    f1(e0 e0Var) {
        this.f106021a = new WeakReference(e0Var);
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final a b(Runnable runnable) {
        e0 e0Var = (e0) this.f106021a.get();
        if (e0Var == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        e0Var.o(runnable);
        return this;
    }
}
