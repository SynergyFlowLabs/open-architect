package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.internal.k;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("com.google.firebase.inappmessaging.display.internal.injection.scopes.InAppMessageScope")
public final class b implements com.google.firebase.inappmessaging.display.dagger.internal.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f122259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<LayoutInflater> f122260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.model.i> f122261c;

    public b(ij.c<k> cVar, ij.c<LayoutInflater> cVar2, ij.c<com.google.firebase.inappmessaging.model.i> cVar3) {
        this.f122259a = cVar;
        this.f122260b = cVar2;
        this.f122261c = cVar3;
    }

    public static b a(ij.c<k> cVar, ij.c<LayoutInflater> cVar2, ij.c<com.google.firebase.inappmessaging.model.i> cVar3) {
        return new b(cVar, cVar2, cVar3);
    }

    public static a c(k kVar, LayoutInflater layoutInflater, com.google.firebase.inappmessaging.model.i iVar) {
        return new a(kVar, layoutInflater, iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f122259a.get(), this.f122260b.get(), this.f122261c.get());
    }
}
