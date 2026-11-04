package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.transition.f1;
import androidx.transition.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends f1 {
    @Override // androidx.transition.f1
    @NonNull
    public Animator R0(@NonNull ViewGroup viewGroup, @NonNull View view, @p0 u0 u0Var, @p0 u0 u0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.f1
    @NonNull
    public Animator T0(@NonNull ViewGroup viewGroup, @NonNull View view, @p0 u0 u0Var, @p0 u0 u0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
