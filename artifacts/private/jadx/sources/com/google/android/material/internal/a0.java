package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f112745a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private b f112746b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    ValueAnimator f112747c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f112748d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0 a0Var = a0.this;
            if (a0Var.f112747c == animator) {
                a0Var.f112747c = null;
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f112750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ValueAnimator f112751b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f112750a = iArr;
            this.f112751b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f112747c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f112747c = null;
        }
    }

    private void e(@NonNull b bVar) {
        ValueAnimator valueAnimator = bVar.f112751b;
        this.f112747c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f112748d);
        this.f112745a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f112747c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f112747c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f112745a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f112745a.get(i10);
            if (StateSet.stateSetMatches(bVar.f112750a, iArr)) {
                break;
            } else {
                i10++;
            }
        }
        b bVar2 = this.f112746b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f112746b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
