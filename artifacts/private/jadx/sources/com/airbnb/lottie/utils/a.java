package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends ValueAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f88828a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f88829b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Animator.AnimatorPauseListener> f88830c = new CopyOnWriteArraySet();

    void a() {
        Iterator<Animator.AnimatorListener> it = this.f88829b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f88829b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f88830c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f88828a.add(animatorUpdateListener);
    }

    void b(boolean z10) {
        Iterator<Animator.AnimatorListener> it = this.f88829b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z10);
        }
    }

    void c() {
        Iterator<Animator.AnimatorPauseListener> it = this.f88830c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void d() {
        Iterator<Animator.AnimatorListener> it = this.f88829b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void e() {
        Iterator<Animator.AnimatorPauseListener> it = this.f88830c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    void f(boolean z10) {
        Iterator<Animator.AnimatorListener> it = this.f88829b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z10);
        }
    }

    void g() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f88828a.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f88829b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f88828a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f88829b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f88830c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f88828a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
