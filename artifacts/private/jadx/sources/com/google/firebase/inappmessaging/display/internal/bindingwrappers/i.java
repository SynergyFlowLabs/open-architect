package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.internal.k;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("com.google.firebase.inappmessaging.display.internal.injection.scopes.InAppMessageScope")
public final class i implements com.google.firebase.inappmessaging.display.dagger.internal.d<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f122298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<LayoutInflater> f122299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.model.i> f122300c;

    public i(ij.c<k> cVar, ij.c<LayoutInflater> cVar2, ij.c<com.google.firebase.inappmessaging.model.i> cVar3) {
        this.f122298a = cVar;
        this.f122299b = cVar2;
        this.f122300c = cVar3;
    }

    public static i a(ij.c<k> cVar, ij.c<LayoutInflater> cVar2, ij.c<com.google.firebase.inappmessaging.model.i> cVar3) {
        return new i(cVar, cVar2, cVar3);
    }

    public static h c(k kVar, LayoutInflater layoutInflater, com.google.firebase.inappmessaging.model.i iVar) {
        return new h(kVar, layoutInflater, iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f122298a.get(), this.f122299b.get(), this.f122300c.get());
    }
}
