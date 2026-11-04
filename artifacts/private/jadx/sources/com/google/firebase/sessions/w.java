package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class w implements com.google.firebase.sessions.dagger.internal.c<d1> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final w f125192a = new w();

        private a() {
        }
    }

    public static w a() {
        return a.f125192a;
    }

    public static d1 c() {
        return (d1) com.google.firebase.sessions.dagger.internal.e.f(o.b.f125065a.o());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d1 get() {
        return c();
    }
}
