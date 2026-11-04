package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
final class v0 extends com.google.android.gms.signin.internal.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f106240a;

    v0(z0 z0Var) {
        this.f106240a = new WeakReference(z0Var);
    }

    @Override // com.google.android.gms.signin.internal.c, com.google.android.gms.signin.internal.e
    @androidx.annotation.g
    public final void v9(zak zakVar) {
        z0 z0Var = (z0) this.f106240a.get();
        if (z0Var == null) {
            return;
        }
        z0Var.f106269a.f(new u0(this, z0Var, z0Var, zakVar));
    }
}
