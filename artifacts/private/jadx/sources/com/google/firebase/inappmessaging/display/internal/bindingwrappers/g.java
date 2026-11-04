package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.internal.k;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("com.google.firebase.inappmessaging.display.internal.injection.scopes.InAppMessageScope")
public final class g implements com.google.firebase.inappmessaging.display.dagger.internal.d<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f122284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<LayoutInflater> f122285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.model.i> f122286c;

    public g(ij.c<k> cVar, ij.c<LayoutInflater> cVar2, ij.c<com.google.firebase.inappmessaging.model.i> cVar3) {
        this.f122284a = cVar;
        this.f122285b = cVar2;
        this.f122286c = cVar3;
    }

    public static g a(ij.c<k> cVar, ij.c<LayoutInflater> cVar2, ij.c<com.google.firebase.inappmessaging.model.i> cVar3) {
        return new g(cVar, cVar2, cVar3);
    }

    public static f c(k kVar, LayoutInflater layoutInflater, com.google.firebase.inappmessaging.model.i iVar) {
        return new f(kVar, layoutInflater, iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f122284a.get(), this.f122285b.get(), this.f122286c.get());
    }
}
