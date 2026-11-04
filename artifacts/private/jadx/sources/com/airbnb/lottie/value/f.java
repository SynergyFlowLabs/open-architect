package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes3.dex */
abstract class f<T> extends j<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f88892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f88893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Interpolator f88894f;

    f(T t10, T t11) {
        this(t10, t11, new LinearInterpolator());
    }

    @Override // com.airbnb.lottie.value.j
    public T a(b<T> bVar) {
        return e(this.f88892d, this.f88893e, this.f88894f.getInterpolation(bVar.e()));
    }

    abstract T e(T t10, T t11, float f10);

    f(T t10, T t11, Interpolator interpolator) {
        this.f88892d = t10;
        this.f88893e = t11;
        this.f88894f = interpolator;
    }
}
