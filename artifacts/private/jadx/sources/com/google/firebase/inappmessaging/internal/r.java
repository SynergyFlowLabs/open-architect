package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class r implements com.google.firebase.inappmessaging.dagger.internal.c<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.h> f122918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<s3> f122919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<m8.d> f122920c;

    public r(ij.c<com.google.firebase.h> cVar, ij.c<s3> cVar2, ij.c<m8.d> cVar3) {
        this.f122918a = cVar;
        this.f122919b = cVar2;
        this.f122920c = cVar3;
    }

    public static r a(ij.c<com.google.firebase.h> cVar, ij.c<s3> cVar2, ij.c<m8.d> cVar3) {
        return new r(cVar, cVar2, cVar3);
    }

    public static q c(com.google.firebase.h hVar, s3 s3Var, m8.d dVar) {
        return new q(hVar, s3Var, dVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f122918a.get(), this.f122919b.get(), this.f122920c.get());
    }
}
