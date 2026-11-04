package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class f extends com.google.android.material.motion.a<View> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f112983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f112984l;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f112971b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    public f(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f112983k = resources.getDimension(r6.a.f.f360357q2);
        this.f112984l = resources.getDimension(r6.a.f.f360373r2);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        int i10 = 4 >> 2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f112971b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f112971b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v10 = this.f112971b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i11), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new androidx.interpolator.view.animation.b());
        return animatorSet;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorG = g();
        animatorG.setDuration(this.f112974e);
        animatorG.start();
    }

    public void h(@NonNull androidx.activity.d dVar, @p0 Animator.AnimatorListener animatorListener) {
        boolean z10 = true & true;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f112971b, (Property<V, Float>) View.TRANSLATION_Y, this.f112971b.getHeight() * this.f112971b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new androidx.interpolator.view.animation.b());
        objectAnimatorOfFloat.setDuration(com.google.android.material.animation.b.c(this.f112972c, this.f112973d, dVar.a()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void i(@NonNull androidx.activity.d dVar, @p0 Animator.AnimatorListener animatorListener) {
        Animator animatorG = g();
        animatorG.setDuration(com.google.android.material.animation.b.c(this.f112972c, this.f112973d, dVar.a()));
        if (animatorListener != null) {
            animatorG.addListener(animatorListener);
        }
        animatorG.start();
    }

    public void j(@NonNull androidx.activity.d dVar) {
        super.d(dVar);
    }

    @l1
    public void k(float f10) {
        float fA = a(f10);
        float width = this.f112971b.getWidth();
        float height = this.f112971b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f11 = this.f112983k / width;
            float f12 = this.f112984l / height;
            float fA2 = 1.0f - com.google.android.material.animation.b.a(0.0f, f11, fA);
            float fA3 = 1.0f - com.google.android.material.animation.b.a(0.0f, f12, fA);
            this.f112971b.setScaleX(fA2);
            this.f112971b.setPivotY(height);
            this.f112971b.setScaleY(fA3);
            V v10 = this.f112971b;
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    childAt.setPivotY(-childAt.getTop());
                    childAt.setScaleY(fA3 != 0.0f ? fA2 / fA3 : 1.0f);
                }
            }
        }
    }

    public void l(@NonNull androidx.activity.d dVar) {
        if (super.e(dVar) == null) {
            return;
        }
        k(dVar.a());
    }
}
