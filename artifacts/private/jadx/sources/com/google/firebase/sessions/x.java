package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class x implements com.google.firebase.sessions.dagger.internal.c<f1> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final x f125195a = new x();

        private a() {
        }
    }

    public static x a() {
        return a.f125195a;
    }

    public static f1 c() {
        return (f1) com.google.firebase.sessions.dagger.internal.e.f(o.b.f125065a.p());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 get() {
        return c();
    }
}
