package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.internal.s3;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class i implements com.google.firebase.inappmessaging.dagger.internal.c<s3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f122770a;

    public i(d dVar) {
        this.f122770a = dVar;
    }

    public static i a(d dVar) {
        return new i(dVar);
    }

    public static s3 c(d dVar) {
        return (s3) com.google.firebase.inappmessaging.dagger.internal.e.f(dVar.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s3 get() {
        return c(this.f122770a);
    }
}
