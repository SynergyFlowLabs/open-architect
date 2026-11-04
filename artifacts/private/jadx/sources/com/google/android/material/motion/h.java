package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class h extends com.google.android.material.motion.a<View> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f112987q = 0.9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f112988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f112989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f112990m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private Rect f112991n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Rect f112992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private Integer f112993p;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f112994a;

        a(View view) {
            this.f112994a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f112994a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public h(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f112988k = resources.getDimension(r6.a.f.f360405t2);
        this.f112989l = resources.getDimension(r6.a.f.f360389s2);
    }

    @NonNull
    private ValueAnimator h(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), k());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.motion.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                clippableRoundedCornerLayout.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    @NonNull
    private AnimatorSet i(@p0 View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f112971b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f112971b, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f112971b, (Property<V, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f112971b, (Property<V, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new a(view));
        return animatorSet;
    }

    private int n() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.f112971b.getRootWindowInsets()) == null) {
            return 0;
        }
        return Math.max(Math.max(o(rootWindowInsets, 0), o(rootWindowInsets, 1)), Math.max(o(rootWindowInsets, 3), o(rootWindowInsets, 2)));
    }

    @w0(31)
    private int o(WindowInsets windowInsets, int i10) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private boolean p() {
        int[] iArr = new int[2];
        this.f112971b.getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private void q() {
        this.f112990m = 0.0f;
        this.f112991n = null;
        this.f112992o = null;
    }

    public void g(@p0 View view) {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSetI = i(view);
        V v10 = this.f112971b;
        if (v10 instanceof ClippableRoundedCornerLayout) {
            animatorSetI.playTogether(h((ClippableRoundedCornerLayout) v10));
        }
        animatorSetI.setDuration(this.f112974e);
        animatorSetI.start();
        q();
    }

    public void j(long j10, @p0 View view) {
        AnimatorSet animatorSetI = i(view);
        animatorSetI.setDuration(j10);
        animatorSetI.start();
        q();
    }

    public int k() {
        if (this.f112993p == null) {
            this.f112993p = Integer.valueOf(p() ? n() : 0);
        }
        return this.f112993p.intValue();
    }

    @p0
    public Rect l() {
        return this.f112992o;
    }

    @p0
    public Rect m() {
        return this.f112991n;
    }

    @l1
    public void r(float f10, @p0 View view) {
        this.f112991n = com.google.android.material.internal.p0.d(this.f112971b);
        if (view != null) {
            this.f112992o = com.google.android.material.internal.p0.c(this.f112971b, view);
        }
        this.f112990m = f10;
    }

    public void s(@NonNull androidx.activity.d dVar, @p0 View view) {
        super.d(dVar);
        r(dVar.d(), view);
    }

    @l1
    public void t(float f10, boolean z10, float f11, float f12) {
        float fA = a(f10);
        float width = this.f112971b.getWidth();
        float height = this.f112971b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float fA2 = com.google.android.material.animation.b.a(1.0f, f112987q, fA);
            float fA3 = com.google.android.material.animation.b.a(0.0f, Math.max(0.0f, ((width - (f112987q * width)) / 2.0f) - this.f112988k), fA) * (z10 ? 1 : -1);
            float fMin = Math.min(Math.max(0.0f, ((height - (fA2 * height)) / 2.0f) - this.f112988k), this.f112989l);
            float f13 = f11 - this.f112990m;
            float fA4 = com.google.android.material.animation.b.a(0.0f, fMin, Math.abs(f13) / height) * Math.signum(f13);
            this.f112971b.setScaleX(fA2);
            this.f112971b.setScaleY(fA2);
            this.f112971b.setTranslationX(fA3);
            this.f112971b.setTranslationY(fA4);
            V v10 = this.f112971b;
            if (v10 instanceof ClippableRoundedCornerLayout) {
                ((ClippableRoundedCornerLayout) v10).e(com.google.android.material.animation.b.a(k(), f12, fA));
            }
        }
    }

    public void u(@NonNull androidx.activity.d dVar, @p0 View view, float f10) {
        if (super.e(dVar) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        t(dVar.a(), dVar.b() == 0, dVar.d(), f10);
    }
}
