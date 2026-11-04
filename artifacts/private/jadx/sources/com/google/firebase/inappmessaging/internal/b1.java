package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.ImpressionStore"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class b1 implements com.google.firebase.inappmessaging.dagger.internal.c<a1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y2> f122591a;

    public b1(ij.c<y2> cVar) {
        this.f122591a = cVar;
    }

    public static b1 a(ij.c<y2> cVar) {
        return new b1(cVar);
    }

    public static a1 c(y2 y2Var) {
        return new a1(y2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a1 get() {
        return c(this.f122591a.get());
    }
}
