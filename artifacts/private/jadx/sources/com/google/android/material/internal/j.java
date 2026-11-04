package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f112864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f112865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f112866c = new float[2];

    public j(@androidx.annotation.p0 View view, @androidx.annotation.p0 View view2) {
        this.f112864a = view;
        this.f112865b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        k.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f112866c);
        View view = this.f112864a;
        if (view != null) {
            view.setAlpha(this.f112866c[0]);
        }
        View view2 = this.f112865b;
        if (view2 != null) {
            view2.setAlpha(this.f112866c[1]);
        }
    }
}
