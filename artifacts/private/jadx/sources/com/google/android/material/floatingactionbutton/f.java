package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.material.animation.i;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
interface f {
    void a();

    void b();

    i c();

    List<Animator.AnimatorListener> d();

    @p0
    i e();

    boolean f();

    void g(@NonNull Animator.AnimatorListener animatorListener);

    @androidx.annotation.b
    int h();

    AnimatorSet i();

    void j(@p0 ExtendedFloatingActionButton.l lVar);

    void k();

    void l(@NonNull Animator.AnimatorListener animatorListener);

    void m(@p0 i iVar);

    void onAnimationStart(Animator animator);
}
