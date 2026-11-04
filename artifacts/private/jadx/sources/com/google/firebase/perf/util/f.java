package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f124233a;

    private f() {
        this.f124233a = null;
    }

    public static <T> f<T> a() {
        return new f<>();
    }

    public static <T> f<T> b(T t10) {
        return t10 == null ? a() : e(t10);
    }

    public static <T> f<T> e(T t10) {
        return new f<>(t10);
    }

    public T c() {
        T t10 = this.f124233a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f124233a != null;
    }

    private f(T t10) {
        if (t10 != null) {
            this.f124233a = t10;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
