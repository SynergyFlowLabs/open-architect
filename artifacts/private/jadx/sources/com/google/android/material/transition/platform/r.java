package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.material.transition.platform.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
abstract class r<P extends x> extends Visibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f114730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private x f114731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<x> f114732c = new ArrayList();

    protected r(P p10, @p0 x xVar) {
        this.f114730a = p10;
        this.f114731b = xVar;
    }

    private static void b(List<Animator> list, @p0 x xVar, ViewGroup viewGroup, View view, boolean z10) {
        if (xVar == null) {
            return;
        }
        Animator animatorB = z10 ? xVar.b(viewGroup, view) : xVar.a(viewGroup, view);
        if (animatorB != null) {
            list.add(animatorB);
        }
    }

    private Animator d(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        b(arrayList, this.f114730a, viewGroup, view, z10);
        b(arrayList, this.f114731b, viewGroup, view, z10);
        Iterator<x> it = this.f114732c.iterator();
        while (it.hasNext()) {
            b(arrayList, it.next(), viewGroup, view, z10);
        }
        j(viewGroup.getContext(), z10);
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void j(@NonNull Context context, boolean z10) {
        w.r(this, context, f(z10));
        w.s(this, context, g(z10), e(z10));
    }

    public void a(@NonNull x xVar) {
        this.f114732c.add(xVar);
    }

    public void c() {
        this.f114732c.clear();
    }

    @NonNull
    TimeInterpolator e(boolean z10) {
        return com.google.android.material.animation.b.f111044b;
    }

    @androidx.annotation.f
    int f(boolean z10) {
        return 0;
    }

    @androidx.annotation.f
    int g(boolean z10) {
        return 0;
    }

    @NonNull
    public P h() {
        return this.f114730a;
    }

    @p0
    public x i() {
        return this.f114731b;
    }

    public boolean k(@NonNull x xVar) {
        return this.f114732c.remove(xVar);
    }

    public void l(@p0 x xVar) {
        this.f114731b = xVar;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, false);
    }
}
