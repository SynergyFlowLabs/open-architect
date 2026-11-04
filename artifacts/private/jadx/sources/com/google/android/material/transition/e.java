package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.x;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final float f114493b = 0.35f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f114494a = f114493b;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f114497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f114498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f114499e;

        a(View view, float f10, float f11, float f12, float f13) {
            this.f114495a = view;
            this.f114496b = f10;
            this.f114497c = f11;
            this.f114498d = f12;
            this.f114499e = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f114495a.setAlpha(v.m(this.f114496b, this.f114497c, this.f114498d, this.f114499e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114501b;

        b(View view, float f10) {
            this.f114500a = view;
            this.f114501b = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f114500a.setAlpha(this.f114501b);
        }
    }

    private static Animator c(View view, float f10, float f11, @x(from = 0.0d, to = 1.0d) float f12, @x(from = 0.0d, to = 1.0d) float f13, float f14) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(view, f10, f11, f12, f13));
        valueAnimatorOfFloat.addListener(new b(view, f14));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, this.f114494a, alpha);
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f114494a, 1.0f, alpha);
    }

    public float d() {
        return this.f114494a;
    }

    public void e(@x(from = 0.0d, to = 1.0d) float f10) {
        this.f114494a = f10;
    }
}
