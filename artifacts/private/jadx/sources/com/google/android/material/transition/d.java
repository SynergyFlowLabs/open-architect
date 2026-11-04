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
public final class d implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f114485a = 1.0f;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f114488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f114489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f114490e;

        a(View view, float f10, float f11, float f12, float f13) {
            this.f114486a = view;
            this.f114487b = f10;
            this.f114488c = f11;
            this.f114489d = f12;
            this.f114490e = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f114486a.setAlpha(v.m(this.f114487b, this.f114488c, this.f114489d, this.f114490e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114492b;

        b(View view, float f10) {
            this.f114491a = view;
            this.f114492b = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f114491a.setAlpha(this.f114492b);
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
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.0f, this.f114485a, alpha);
    }

    public float d() {
        return this.f114485a;
    }

    public void e(float f10) {
        this.f114485a = f10;
    }
}
