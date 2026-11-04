package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f112845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f112846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<AnimatorListenerAdapter> f112847c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<View> f112848d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private ValueAnimator.AnimatorUpdateListener f112849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f112850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f112851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f112852h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.f112846b.setVisibility(0);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.f112846b.setVisibility(8);
        }
    }

    public g(@NonNull View view, @NonNull View view2) {
        this.f112845a = view;
        this.f112846b = view2;
    }

    private void f(Animator animator, List<AnimatorListenerAdapter> list) {
        Iterator<AnimatorListenerAdapter> it = list.iterator();
        while (it.hasNext()) {
            animator.addListener(it.next());
        }
    }

    private AnimatorSet g(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(k(z10), l(z10), i(z10));
        return animatorSet;
    }

    private Animator i(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f112846b.getLeft() - this.f112845a.getLeft()) + (this.f112845a.getRight() - this.f112846b.getRight()), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(t.m(this.f112848d));
        valueAnimatorOfFloat.setDuration(this.f112850f);
        valueAnimatorOfFloat.setInterpolator(y.a(z10, com.google.android.material.animation.b.f111044b));
        return valueAnimatorOfFloat;
    }

    private Animator k(boolean z10) {
        Rect rectE = p0.e(this.f112845a, this.f112851g);
        Rect rectE2 = p0.e(this.f112846b, this.f112852h);
        final Rect rect = new Rect(rectE);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new x(rect), rectE, rectE2);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p0.z(this.f112843a.f112846b, rect);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f112849e;
        if (animatorUpdateListener != null) {
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        }
        valueAnimatorOfObject.setDuration(this.f112850f);
        valueAnimatorOfObject.setInterpolator(y.a(z10, com.google.android.material.animation.b.f111044b));
        return valueAnimatorOfObject;
    }

    private Animator l(boolean z10) {
        List<View> listK = p0.k(this.f112846b);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(t.e(listK));
        valueAnimatorOfFloat.setDuration(this.f112850f);
        valueAnimatorOfFloat.setInterpolator(y.a(z10, com.google.android.material.animation.b.f111043a));
        return valueAnimatorOfFloat;
    }

    @NonNull
    @z7.a
    public g c(@NonNull Collection<View> collection) {
        this.f112848d.addAll(collection);
        return this;
    }

    @NonNull
    @z7.a
    public g d(@NonNull View... viewArr) {
        Collections.addAll(this.f112848d, viewArr);
        return this;
    }

    @NonNull
    @z7.a
    public g e(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f112847c.add(animatorListenerAdapter);
        return this;
    }

    @NonNull
    public Animator h() {
        AnimatorSet animatorSetG = g(false);
        animatorSetG.addListener(new b());
        f(animatorSetG, this.f112847c);
        return animatorSetG;
    }

    @NonNull
    public Animator j() {
        AnimatorSet animatorSetG = g(true);
        animatorSetG.addListener(new a());
        f(animatorSetG, this.f112847c);
        return animatorSetG;
    }

    @NonNull
    @z7.a
    public g m(@androidx.annotation.p0 ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f112849e = animatorUpdateListener;
        return this;
    }

    @NonNull
    @z7.a
    public g n(int i10) {
        this.f112851g = i10;
        return this;
    }

    @NonNull
    @z7.a
    public g o(long j10) {
        this.f112850f = j10;
        return this;
    }

    @NonNull
    @z7.a
    public g p(int i10) {
        this.f112852h = i10;
        return this;
    }
}
