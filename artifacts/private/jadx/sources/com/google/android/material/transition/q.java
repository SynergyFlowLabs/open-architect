package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.transition.f1;
import androidx.transition.u0;
import com.google.android.material.transition.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class q<P extends w> extends f1 {
    private final P P3;

    @p0
    private w Q3;
    private final List<w> R3 = new ArrayList();

    protected q(P p10, @p0 w wVar) {
        this.P3 = p10;
        this.Q3 = wVar;
    }

    private static void X0(List<Animator> list, @p0 w wVar, ViewGroup viewGroup, View view, boolean z10) {
        if (wVar == null) {
            return;
        }
        Animator animatorB = z10 ? wVar.b(viewGroup, view) : wVar.a(viewGroup, view);
        if (animatorB != null) {
            list.add(animatorB);
        }
    }

    private Animator Z0(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        X0(arrayList, this.P3, viewGroup, view, z10);
        X0(arrayList, this.Q3, viewGroup, view, z10);
        Iterator<w> it = this.R3.iterator();
        while (it.hasNext()) {
            X0(arrayList, it.next(), viewGroup, view, z10);
        }
        f1(viewGroup.getContext(), z10);
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void f1(@NonNull Context context, boolean z10) {
        v.r(this, context, b1(z10));
        v.s(this, context, c1(z10), a1(z10));
    }

    @Override // androidx.transition.f1
    public Animator R0(ViewGroup viewGroup, View view, u0 u0Var, u0 u0Var2) {
        return Z0(viewGroup, view, true);
    }

    @Override // androidx.transition.f1
    public Animator T0(ViewGroup viewGroup, View view, u0 u0Var, u0 u0Var2) {
        return Z0(viewGroup, view, false);
    }

    public void W0(@NonNull w wVar) {
        this.R3.add(wVar);
    }

    public void Y0() {
        this.R3.clear();
    }

    @NonNull
    TimeInterpolator a1(boolean z10) {
        return com.google.android.material.animation.b.f111044b;
    }

    @androidx.annotation.f
    int b1(boolean z10) {
        return 0;
    }

    @androidx.annotation.f
    int c1(boolean z10) {
        return 0;
    }

    @NonNull
    public P d1() {
        return this.P3;
    }

    @Override // androidx.transition.g0
    public boolean e0() {
        return true;
    }

    @p0
    public w e1() {
        return this.Q3;
    }

    public boolean g1(@NonNull w wVar) {
        return this.R3.remove(wVar);
    }

    public void h1(@p0 w wVar) {
        this.Q3 = wVar;
    }
}
