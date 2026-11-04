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
public final class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f114589a = 1.0f;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f114592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f114593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f114594e;

        a(View view, float f10, float f11, float f12, float f13) {
            this.f114590a = view;
            this.f114591b = f10;
            this.f114592c = f11;
            this.f114593d = f12;
            this.f114594e = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f114590a.setAlpha(w.m(this.f114591b, this.f114592c, this.f114593d, this.f114594e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114596b;

        b(View view, float f10) {
            this.f114595a = view;
            this.f114596b = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f114595a.setAlpha(this.f114596b);
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
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.0f, this.f114589a, alpha);
    }

    public float d() {
        return this.f114589a;
    }

    public void e(float f10) {
        this.f114589a = f10;
    }
}
