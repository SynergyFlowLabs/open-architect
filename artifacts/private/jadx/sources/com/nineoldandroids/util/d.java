package com.nineoldandroids.util;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f131298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<V> f131299b;

    public d(Class<V> cls, String str) {
        this.f131298a = str;
        this.f131299b = cls;
    }

    public static <T, V> d<T, V> e(Class<T> cls, Class<V> cls2, String str) {
        return new e(cls, cls2, str);
    }

    public abstract V a(T t10);

    public String b() {
        return this.f131298a;
    }

    public Class<V> c() {
        return this.f131299b;
    }

    public boolean d() {
        return false;
    }

    public void f(T t10, V v10) {
        throw new UnsupportedOperationException("Property " + b() + " is read-only");
    }
}
