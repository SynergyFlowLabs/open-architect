package com.android.volley;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final T f89654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final f.a f89655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final a0 f89656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89657d;

    public interface a {
        void b(a0 a0Var);
    }

    public interface b<T> {
        void onResponse(T t10);
    }

    private v(@p0 T t10, @p0 f.a aVar) {
        this.f89657d = false;
        this.f89654a = t10;
        this.f89655b = aVar;
        this.f89656c = null;
    }

    public static <T> v<T> a(a0 a0Var) {
        return new v<>(a0Var);
    }

    public static <T> v<T> c(@p0 T t10, @p0 f.a aVar) {
        return new v<>(t10, aVar);
    }

    public boolean b() {
        return this.f89656c == null;
    }

    private v(a0 a0Var) {
        this.f89657d = false;
        this.f89654a = null;
        this.f89655b = null;
        this.f89656c = a0Var;
    }
}
