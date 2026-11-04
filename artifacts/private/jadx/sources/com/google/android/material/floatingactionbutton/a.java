package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private Animator f112613a;

    a() {
    }

    public void a() {
        Animator animator = this.f112613a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f112613a = null;
    }

    public void c(Animator animator) {
        a();
        this.f112613a = animator;
    }
}
