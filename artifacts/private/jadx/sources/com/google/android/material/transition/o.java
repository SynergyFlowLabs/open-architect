package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.transition.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends q<e> {
    private static final float S3 = 0.92f;

    @androidx.annotation.f
    private static final int T3 = r6.a.c.Ed;

    @androidx.annotation.f
    private static final int U3 = r6.a.c.Vd;

    public o() {
        super(i1(), j1());
    }

    private static e i1() {
        return new e();
    }

    private static w j1() {
        r rVar = new r();
        rVar.o(false);
        rVar.l(S3);
        return rVar;
    }

    @Override // com.google.android.material.transition.q, androidx.transition.f1
    public /* bridge */ /* synthetic */ Animator R0(ViewGroup viewGroup, View view, u0 u0Var, u0 u0Var2) {
        return super.R0(viewGroup, view, u0Var, u0Var2);
    }

    @Override // com.google.android.material.transition.q, androidx.transition.f1
    public /* bridge */ /* synthetic */ Animator T0(ViewGroup viewGroup, View view, u0 u0Var, u0 u0Var2) {
        return super.T0(viewGroup, view, u0Var, u0Var2);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void W0(@NonNull w wVar) {
        super.W0(wVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void Y0() {
        super.Y0();
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int b1(boolean z10) {
        return T3;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int c1(boolean z10) {
        return U3;
    }

    @Override // com.google.android.material.transition.q
    @NonNull
    public /* bridge */ /* synthetic */ w d1() {
        return super.d1();
    }

    @Override // com.google.android.material.transition.q, androidx.transition.g0
    public /* bridge */ /* synthetic */ boolean e0() {
        return super.e0();
    }

    @Override // com.google.android.material.transition.q
    @p0
    public /* bridge */ /* synthetic */ w e1() {
        return super.e1();
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ boolean g1(@NonNull w wVar) {
        return super.g1(wVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void h1(@p0 w wVar) {
        super.h1(wVar);
    }
}
