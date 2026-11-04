package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.internal.s3;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class f implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.firebase.inappmessaging.internal.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f122760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<s3> f122761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<m8.d> f122762c;

    public f(d dVar, ij.c<s3> cVar, ij.c<m8.d> cVar2) {
        this.f122760a = dVar;
        this.f122761b = cVar;
        this.f122762c = cVar2;
    }

    public static f a(d dVar, ij.c<s3> cVar, ij.c<m8.d> cVar2) {
        return new f(dVar, cVar, cVar2);
    }

    public static com.google.firebase.inappmessaging.internal.q c(d dVar, s3 s3Var, m8.d dVar2) {
        return (com.google.firebase.inappmessaging.internal.q) com.google.firebase.inappmessaging.dagger.internal.e.f(dVar.b(s3Var, dVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.internal.q get() {
        return c(this.f122760a, this.f122761b.get(), this.f122762c.get());
    }
}
