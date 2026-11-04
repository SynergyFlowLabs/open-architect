package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.transition.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends q<r> {
    private static final float T3 = 0.85f;
    private final boolean S3;

    public m(boolean z10) {
        super(i1(z10), j1());
        this.S3 = z10;
    }

    private static r i1(boolean z10) {
        r rVar = new r(z10);
        rVar.m(0.85f);
        rVar.l(0.85f);
        return rVar;
    }

    private static w j1() {
        return new d();
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

    public boolean k1() {
        return this.S3;
    }
}
