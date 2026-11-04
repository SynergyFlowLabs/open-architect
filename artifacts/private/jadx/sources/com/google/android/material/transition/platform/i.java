package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
public final class i extends Visibility {
    @Override // android.transition.Visibility
    @NonNull
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @p0 TransitionValues transitionValues, @p0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @NonNull
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @p0 TransitionValues transitionValues, @p0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
