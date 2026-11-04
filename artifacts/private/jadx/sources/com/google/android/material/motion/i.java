package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.a0;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.view.d0;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class i extends com.google.android.material.motion.a<View> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f112996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f112997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f112998m;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f112999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f113000b;

        a(boolean z10, int i10) {
            this.f112999a = z10;
            this.f113000b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f112971b.setTranslationX(0.0f);
            i.this.k(0.0f, this.f112999a, this.f113000b);
        }
    }

    public i(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f112996k = resources.getDimension(r6.a.f.f360437v2);
        this.f112997l = resources.getDimension(r6.a.f.f360421u2);
        this.f112998m = resources.getDimension(r6.a.f.f360453w2);
    }

    private boolean g(@a0 int i10, @a0 int i11) {
        return (d0.d(i10, u1.c0(this.f112971b)) & i11) == i11;
    }

    private int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f112971b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f112971b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f112971b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v10 = this.f112971b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f112974e);
        animatorSet.start();
    }

    public void h(@NonNull androidx.activity.d dVar, @a0 int i10, @p0 Animator.AnimatorListener animatorListener, @p0 ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i11 = 1 << 1;
        boolean z10 = dVar.b() == 0;
        boolean zG = g(i10, 3);
        float width = (this.f112971b.getWidth() * this.f112971b.getScaleX()) + i(zG);
        V v10 = this.f112971b;
        Property property = View.TRANSLATION_X;
        if (zG) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v10, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new androidx.interpolator.view.animation.b());
        objectAnimatorOfFloat.setDuration(com.google.android.material.animation.b.c(this.f112972c, this.f112973d, dVar.a()));
        objectAnimatorOfFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void j(@NonNull androidx.activity.d dVar) {
        super.d(dVar);
    }

    @l1
    public void k(float f10, boolean z10, @a0 int i10) {
        float fA = a(f10);
        boolean zG = g(i10, 3);
        boolean z11 = z10 == zG;
        int width = this.f112971b.getWidth();
        int height = this.f112971b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f112996k / f11;
            float f14 = this.f112997l / f11;
            float f15 = this.f112998m / f12;
            V v10 = this.f112971b;
            if (zG) {
                f11 = 0.0f;
            }
            v10.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float fA2 = com.google.android.material.animation.b.a(0.0f, f14, fA);
            float f16 = fA2 + 1.0f;
            this.f112971b.setScaleX(f16);
            float fA3 = 1.0f - com.google.android.material.animation.b.a(0.0f, f15, fA);
            this.f112971b.setScaleY(fA3);
            V v11 = this.f112971b;
            if (v11 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v11;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(zG ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - fA2 : 1.0f;
                    float f18 = fA3 != 0.0f ? (f16 / fA3) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }

    public void l(@NonNull androidx.activity.d dVar, @a0 int i10) {
        if (super.e(dVar) == null) {
            return;
        }
        k(dVar.a(), dVar.b() == 0, i10);
    }
}
