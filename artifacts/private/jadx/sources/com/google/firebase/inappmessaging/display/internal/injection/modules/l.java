package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h
public final class l implements com.google.firebase.inappmessaging.display.dagger.internal.d<DisplayMetrics> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f122390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f122391b;

    public l(g gVar, ij.c<Application> cVar) {
        this.f122390a = gVar;
        this.f122391b = cVar;
    }

    public static l a(g gVar, ij.c<Application> cVar) {
        return new l(gVar, cVar);
    }

    public static DisplayMetrics c(g gVar, Application application) {
        return (DisplayMetrics) com.google.firebase.inappmessaging.display.dagger.internal.f.f(gVar.f(application));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DisplayMetrics get() {
        return c(this.f122390a, this.f122391b.get());
    }
}
