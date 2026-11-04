package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
public final class n extends r<s> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f114712e = 0.85f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f114713d;

    public n(boolean z10) {
        super(n(z10), o());
        this.f114713d = z10;
    }

    private static s n(boolean z10) {
        s sVar = new s(z10);
        sVar.m(0.85f);
        sVar.l(0.85f);
        return sVar;
    }

    private static x o() {
        return new d();
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

    public boolean p() {
        return this.f114713d;
    }
}
