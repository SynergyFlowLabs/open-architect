package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import androidx.core.view.u1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
public final class t implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f114742c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f114743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @t0
    private int f114744b = -1;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114746b;

        a(View view, float f10) {
            this.f114745a = view;
            this.f114746b = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f114745a.setTranslationX(this.f114746b);
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f114748b;

        b(View view, float f10) {
            this.f114747a = view;
            this.f114748b = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f114747a.setTranslationY(this.f114748b);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface c {
    }

    public t(int i10) {
        this.f114743a = i10;
    }

    private static Animator c(View view, View view2, int i10, @t0 int i11) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i10 == 3) {
            return e(view2, i11 + translationX, translationX, translationX);
        }
        if (i10 == 5) {
            return e(view2, translationX - i11, translationX, translationX);
        }
        if (i10 == 48) {
            return f(view2, translationY - i11, translationY, translationY);
        }
        if (i10 == 80) {
            return f(view2, i11 + translationY, translationY, translationY);
        }
        if (i10 == 8388611) {
            return e(view2, j(view) ? i11 + translationX : translationX - i11, translationX, translationX);
        }
        if (i10 == 8388613) {
            return e(view2, j(view) ? translationX - i11 : i11 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i10);
    }

    private static Animator d(View view, View view2, int i10, @t0 int i11) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i10 == 3) {
            return e(view2, translationX, translationX - i11, translationX);
        }
        if (i10 == 5) {
            return e(view2, translationX, i11 + translationX, translationX);
        }
        if (i10 == 48) {
            return f(view2, translationY, i11 + translationY, translationY);
        }
        if (i10 == 80) {
            return f(view2, translationY, translationY - i11, translationY);
        }
        if (i10 == 8388611) {
            return e(view2, translationX, j(view) ? translationX - i11 : i11 + translationX, translationX);
        }
        if (i10 == 8388613) {
            return e(view2, translationX, j(view) ? i11 + translationX : translationX - i11, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i10);
    }

    private static Animator e(View view, float f10, float f11, float f12) {
        boolean z10 = false & true;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f11));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view, f12));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static Animator f(View view, float f10, float f11, float f12) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f10, f11));
        objectAnimatorOfPropertyValuesHolder.addListener(new b(view, f12));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private int h(Context context) {
        int i10 = this.f114744b;
        return i10 != -1 ? i10 : context.getResources().getDimensionPixelSize(r6.a.f.Zd);
    }

    private static boolean j(View view) {
        return u1.c0(view) == 1;
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return d(viewGroup, view, this.f114743a, h(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return c(viewGroup, view, this.f114743a, h(view.getContext()));
    }

    @t0
    public int g() {
        return this.f114744b;
    }

    public int i() {
        return this.f114743a;
    }

    public void k(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.f114744b = i10;
    }

    public void l(int i10) {
        this.f114743a = i10;
    }
}
