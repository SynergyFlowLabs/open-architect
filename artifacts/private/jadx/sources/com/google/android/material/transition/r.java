package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f114760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f114761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f114762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f114763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f114764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f114765f;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f114768c;

        a(View view, float f10, float f11) {
            this.f114766a = view;
            this.f114767b = f10;
            this.f114768c = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f114766a.setScaleX(this.f114767b);
            this.f114766a.setScaleY(this.f114768c);
        }
    }

    public r() {
        this(true);
    }

    private static Animator c(View view, float f10, float f11) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f114765f) {
            return this.f114764e ? c(view, this.f114760a, this.f114761b) : c(view, this.f114763d, this.f114762c);
        }
        return null;
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f114764e ? c(view, this.f114762c, this.f114763d) : c(view, this.f114761b, this.f114760a);
    }

    public float d() {
        return this.f114763d;
    }

    public float e() {
        return this.f114762c;
    }

    public float f() {
        return this.f114761b;
    }

    public float g() {
        return this.f114760a;
    }

    public boolean h() {
        return this.f114764e;
    }

    public boolean i() {
        return this.f114765f;
    }

    public void j(boolean z10) {
        this.f114764e = z10;
    }

    public void k(float f10) {
        this.f114763d = f10;
    }

    public void l(float f10) {
        this.f114762c = f10;
    }

    public void m(float f10) {
        this.f114761b = f10;
    }

    public void n(float f10) {
        this.f114760a = f10;
    }

    public void o(boolean z10) {
        this.f114765f = z10;
    }

    public r(boolean z10) {
        this.f114760a = 1.0f;
        this.f114761b = 1.1f;
        this.f114762c = 0.8f;
        this.f114763d = 1.0f;
        this.f114765f = true;
        this.f114764e = z10;
    }
}
