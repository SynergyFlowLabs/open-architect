package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h
public final class n implements com.google.firebase.inappmessaging.display.dagger.internal.d<com.google.firebase.inappmessaging.display.internal.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f122394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<DisplayMetrics> f122395b;

    public n(g gVar, ij.c<DisplayMetrics> cVar) {
        this.f122394a = gVar;
        this.f122395b = cVar;
    }

    public static n a(g gVar, ij.c<DisplayMetrics> cVar) {
        return new n(gVar, cVar);
    }

    public static com.google.firebase.inappmessaging.display.internal.k c(g gVar, DisplayMetrics displayMetrics) {
        return (com.google.firebase.inappmessaging.display.internal.k) com.google.firebase.inappmessaging.display.dagger.internal.f.f(gVar.h(displayMetrics));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.display.internal.k get() {
        return c(this.f122394a, this.f122395b.get());
    }
}
