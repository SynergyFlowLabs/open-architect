package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.internal.v2;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class g0 implements com.google.firebase.inappmessaging.dagger.internal.c<v2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f122765a;

    public g0(e0 e0Var) {
        this.f122765a = e0Var;
    }

    public static g0 a(e0 e0Var) {
        return new g0(e0Var);
    }

    public static v2 c(e0 e0Var) {
        return (v2) com.google.firebase.inappmessaging.dagger.internal.e.f(e0Var.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v2 get() {
        return c(this.f122765a);
    }
}
