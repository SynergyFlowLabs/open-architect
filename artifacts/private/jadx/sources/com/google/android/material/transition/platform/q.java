package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.view.d0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
public final class q extends r<x> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f114723f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f114724g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f114725h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f114726i = r6.a.c.Ed;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f114727j = r6.a.c.Vd;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f114728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f114729e;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface a {
    }

    public q(int i10, boolean z10) {
        super(n(i10, z10), o());
        this.f114728d = i10;
        this.f114729e = z10;
    }

    private static x n(int i10, boolean z10) {
        if (i10 == 0) {
            return new t(z10 ? d0.f48644c : d0.f48643b);
        }
        if (i10 == 1) {
            return new t(z10 ? 80 : 48);
        }
        if (i10 == 2) {
            return new s(z10);
        }
        throw new IllegalArgumentException("Invalid axis: " + i10);
    }

    private static x o() {
        return new e();
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
    @androidx.annotation.f
    int f(boolean z10) {
        return f114726i;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int g(boolean z10) {
        return f114727j;
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

    public int p() {
        return this.f114728d;
    }

    public boolean q() {
        return this.f114729e;
    }
}
