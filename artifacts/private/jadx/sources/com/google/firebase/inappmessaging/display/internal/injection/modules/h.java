package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h
public final class h implements com.google.firebase.inappmessaging.display.dagger.internal.d<com.google.firebase.inappmessaging.display.internal.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f122382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<DisplayMetrics> f122383b;

    public h(g gVar, ij.c<DisplayMetrics> cVar) {
        this.f122382a = gVar;
        this.f122383b = cVar;
    }

    public static h a(g gVar, ij.c<DisplayMetrics> cVar) {
        return new h(gVar, cVar);
    }

    public static com.google.firebase.inappmessaging.display.internal.k c(g gVar, DisplayMetrics displayMetrics) {
        return (com.google.firebase.inappmessaging.display.internal.k) com.google.firebase.inappmessaging.display.dagger.internal.f.f(gVar.b(displayMetrics));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.display.internal.k get() {
        return c(this.f122382a, this.f122383b.get());
    }
}
