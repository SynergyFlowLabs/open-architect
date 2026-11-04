package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
public final class o extends r<d> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f114714d = 0.8f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f114715e = 0.3f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f114716f = r6.a.c.Ld;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f114717g = r6.a.c.Od;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f114718h = r6.a.c.Ud;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f114719i = r6.a.c.Td;

    public o() {
        super(n(), o());
    }

    private static d n() {
        d dVar = new d();
        dVar.e(f114715e);
        return dVar;
    }

    private static x o() {
        s sVar = new s();
        sVar.o(false);
        sVar.l(0.8f);
        return sVar;
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void a(@NonNull x xVar) {
        super.a(xVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.material.transition.platform.r
    @NonNull
    TimeInterpolator e(boolean z10) {
        return com.google.android.material.animation.b.f111043a;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int f(boolean z10) {
        return z10 ? f114716f : f114717g;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int g(boolean z10) {
        return z10 ? f114718h : f114719i;
    }

    @Override // com.google.android.material.transition.platform.r
    @NonNull
    public /* bridge */ /* synthetic */ x h() {
        return super.h();
    }

    @Override // com.google.android.material.transition.platform.r
    @p0
    public /* bridge */ /* synthetic */ x i() {
        return super.i();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ boolean k(@NonNull x xVar) {
        return super.k(xVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void l(@p0 x xVar) {
        super.l(xVar);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
