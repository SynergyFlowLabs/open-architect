package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
public final class e implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final float f114597b = 0.35f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f114598a = f114597b;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f114601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f114602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f114603e;

        a(View view, float f10, float f11, float f12, float f13) {
            this.f114599a = view;
            this.f114600b = f10;
            this.f114601c = f11;
            this.f114602d = f12;
            this.f114603e = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f114599a.setAlpha(w.m(this.f114600b, this.f114601c, this.f114602d, this.f114603e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114605b;

        b(View view, float f10) {
            this.f114604a = view;
            this.f114605b = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f114604a.setAlpha(this.f114605b);
        }
    }

    private static Animator c(View view, float f10, float f11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f12, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f13, float f14) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(view, f10, f11, f12, f13));
        valueAnimatorOfFloat.addListener(new b(view, f14));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, this.f114598a, alpha);
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f114598a, 1.0f, alpha);
    }

    public float d() {
        return this.f114598a;
    }

    public void e(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        this.f114598a = f10;
    }
}
