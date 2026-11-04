package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f111059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f111060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private TimeInterpolator f111061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111063e;

    public j(long j10, long j11) {
        this.f111061c = null;
        this.f111062d = 0;
        boolean z10 = false | true;
        this.f111063e = 1;
        this.f111059a = j10;
        this.f111060b = j11;
    }

    @NonNull
    static j b(@NonNull ValueAnimator valueAnimator) {
        j jVar = new j(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        jVar.f111062d = valueAnimator.getRepeatCount();
        jVar.f111063e = valueAnimator.getRepeatMode();
        return jVar;
    }

    private static TimeInterpolator f(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return b.f111044b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return b.f111045c;
        }
        return interpolator instanceof DecelerateInterpolator ? b.f111046d : interpolator;
    }

    public void a(@NonNull Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f111059a;
    }

    public long d() {
        return this.f111060b;
    }

    @p0
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f111061c;
        return timeInterpolator != null ? timeInterpolator : b.f111044b;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (c() == jVar.c() && d() == jVar.d() && g() == jVar.g() && h() == jVar.h()) {
            return e().getClass().equals(jVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f111062d;
    }

    public int h() {
        return this.f111063e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + AbstractJsonLexerKt.BEGIN_OBJ + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public j(long j10, long j11, @NonNull TimeInterpolator timeInterpolator) {
        this.f111062d = 0;
        int i10 = 7 ^ 1;
        this.f111063e = 1;
        this.f111059a = j10;
        this.f111060b = j11;
        this.f111061c = timeInterpolator;
    }
}
