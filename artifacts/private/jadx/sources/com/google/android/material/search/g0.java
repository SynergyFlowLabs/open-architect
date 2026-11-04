package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
class g0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0 f113446a;

    g0(f0 f0Var) {
        this.f113446a = f0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f113446a.f113422a.x()) {
            this.f113446a.f113422a.K();
        }
        this.f113446a.f113422a.setTransitionState(SearchView.c.SHOWN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f113446a.f113424c.setVisibility(0);
        this.f113446a.f113422a.setTransitionState(SearchView.c.SHOWING);
    }
}
