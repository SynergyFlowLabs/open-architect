package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
public final class s implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f114733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f114734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f114735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f114736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f114737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f114738f;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f114741c;

        a(View view, float f10, float f11) {
            this.f114739a = view;
            this.f114740b = f10;
            this.f114741c = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f114739a.setScaleX(this.f114740b);
            this.f114739a.setScaleY(this.f114741c);
        }
    }

    public s() {
        this(true);
    }

    private static Animator c(View view, float f10, float f11) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f114738f) {
            return this.f114737e ? c(view, this.f114733a, this.f114734b) : c(view, this.f114736d, this.f114735c);
        }
        return null;
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f114737e ? c(view, this.f114735c, this.f114736d) : c(view, this.f114734b, this.f114733a);
    }

    public float d() {
        return this.f114736d;
    }

    public float e() {
        return this.f114735c;
    }

    public float f() {
        return this.f114734b;
    }

    public float g() {
        return this.f114733a;
    }

    public boolean h() {
        return this.f114737e;
    }

    public boolean i() {
        return this.f114738f;
    }

    public void j(boolean z10) {
        this.f114737e = z10;
    }

    public void k(float f10) {
        this.f114736d = f10;
    }

    public void l(float f10) {
        this.f114735c = f10;
    }

    public void m(float f10) {
        this.f114734b = f10;
    }

    public void n(float f10) {
        this.f114733a = f10;
    }

    public void o(boolean z10) {
        this.f114738f = z10;
    }

    public s(boolean z10) {
        this.f114733a = 1.0f;
        this.f114734b = 1.1f;
        this.f114735c = 0.8f;
        this.f114736d = 1.0f;
        this.f114738f = true;
        this.f114737e = z10;
    }
}
