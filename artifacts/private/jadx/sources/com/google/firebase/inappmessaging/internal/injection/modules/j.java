package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.internal.s3;
import com.google.firebase.inappmessaging.internal.u3;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class j implements com.google.firebase.inappmessaging.dagger.internal.c<u3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f122773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<s3> f122774b;

    public j(d dVar, ij.c<s3> cVar) {
        this.f122773a = dVar;
        this.f122774b = cVar;
    }

    public static j a(d dVar, ij.c<s3> cVar) {
        return new j(dVar, cVar);
    }

    public static u3 c(d dVar, s3 s3Var) {
        return (u3) com.google.firebase.inappmessaging.dagger.internal.e.f(dVar.f(s3Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u3 get() {
        return c(this.f122773a, this.f122774b.get());
    }
}
