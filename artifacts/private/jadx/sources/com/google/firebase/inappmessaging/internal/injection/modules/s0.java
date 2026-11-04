package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class s0 implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.firebase.inappmessaging.internal.time.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f122797a;

    public s0(r0 r0Var) {
        this.f122797a = r0Var;
    }

    public static s0 a(r0 r0Var) {
        return new s0(r0Var);
    }

    public static com.google.firebase.inappmessaging.internal.time.a c(r0 r0Var) {
        return (com.google.firebase.inappmessaging.internal.time.a) com.google.firebase.inappmessaging.dagger.internal.e.f(r0Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.internal.time.a get() {
        return c(this.f122797a);
    }
}
