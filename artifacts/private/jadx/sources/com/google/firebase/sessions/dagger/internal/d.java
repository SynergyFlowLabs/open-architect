package com.google.firebase.sessions.dagger.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class d<T> implements c<T>, m9.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<Object> f124983b = new d<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f124984a;

    private d(T t10) {
        this.f124984a = t10;
    }

    public static <T> c<T> a(T t10) {
        return new d(e.c(t10, "instance cannot be null"));
    }

    public static <T> c<T> b(T t10) {
        return t10 == null ? c() : new d(t10);
    }

    private static <T> d<T> c() {
        return (d<T>) f124983b;
    }

    @Override // ij.c
    public T get() {
        return this.f124984a;
    }
}
