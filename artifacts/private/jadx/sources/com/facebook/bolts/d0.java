package com.facebook.bolts;

import androidx.annotation.l1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private b0<?> f99327a;

    public d0(@Nullable b0<?> b0Var) {
        this.f99327a = b0Var;
    }

    public final void a() {
        this.f99327a = null;
    }

    @l1(otherwise = 4)
    public final void finalize() {
        b0.c cVarE;
        b0<?> b0Var = this.f99327a;
        if (b0Var == null || (cVarE = b0.f99290j.E()) == null) {
            return;
        }
        cVarE.a(b0Var, new e0(b0Var.N()));
    }
}
