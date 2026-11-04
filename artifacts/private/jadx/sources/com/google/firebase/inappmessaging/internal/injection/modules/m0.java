package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.AppForeground"})
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class m0 implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.firebase.inappmessaging.model.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f122784a;

    public m0(l0 l0Var) {
        this.f122784a = l0Var;
    }

    public static m0 a(l0 l0Var) {
        return new m0(l0Var);
    }

    public static com.google.firebase.inappmessaging.model.m c(l0 l0Var) {
        return (com.google.firebase.inappmessaging.model.m) com.google.firebase.inappmessaging.dagger.internal.e.f(l0Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.model.m get() {
        return c(this.f122784a);
    }
}
