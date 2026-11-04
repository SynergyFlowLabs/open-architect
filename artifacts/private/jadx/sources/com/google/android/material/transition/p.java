package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.view.d0;
import androidx.transition.u0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends q<w> {
    public static final int U3 = 0;
    public static final int V3 = 1;
    public static final int W3 = 2;

    @androidx.annotation.f
    private static final int X3 = r6.a.c.Ed;

    @androidx.annotation.f
    private static final int Y3 = r6.a.c.Vd;
    private final int S3;
    private final boolean T3;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface a {
    }

    public p(int i10, boolean z10) {
        super(i1(i10, z10), j1());
        this.S3 = i10;
        this.T3 = z10;
    }

    private static w i1(int i10, boolean z10) {
        if (i10 == 0) {
            return new s(z10 ? d0.f48644c : d0.f48643b);
        }
        if (i10 == 1) {
            return new s(z10 ? 80 : 48);
        }
        if (i10 == 2) {
            return new r(z10);
        }
        throw new IllegalArgumentException("Invalid axis: " + i10);
    }

    private static w j1() {
        return new e();
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
        return X3;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int c1(boolean z10) {
        return Y3;
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

    public int k1() {
        return this.S3;
    }

    public boolean l1() {
        return this.T3;
    }
}
