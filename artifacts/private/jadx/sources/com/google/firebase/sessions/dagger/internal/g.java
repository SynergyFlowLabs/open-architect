package com.google.firebase.sessions.dagger.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ij.c f124985a;

        a(ij.c cVar) {
            this.f124985a = cVar;
        }

        @Override // ij.c
        public T get() {
            return (T) this.f124985a.get();
        }
    }

    private g() {
    }

    public static <T> f<T> a(ij.c<T> cVar) {
        e.b(cVar);
        return new a(cVar);
    }
}
