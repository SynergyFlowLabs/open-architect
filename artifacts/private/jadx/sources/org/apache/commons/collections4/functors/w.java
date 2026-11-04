package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class w<T> implements org.apache.commons.collections4.l0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335755b = -89901658494523293L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f335756a;

    public w(T t10) {
        this.f335756a = t10;
    }

    public static <T> org.apache.commons.collections4.l0<T> d(T t10) {
        return t10 == null ? m0.c() : new w(t10);
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        return this.f335756a == t10;
    }

    public T c() {
        return this.f335756a;
    }
}
