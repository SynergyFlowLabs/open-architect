package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class k<T> implements org.apache.commons.collections4.n<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335701b = -3520677225766901240L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final org.apache.commons.collections4.n f335702c = new k(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f335703a;

    public k(T t10) {
        this.f335703a = t10;
    }

    public static <T> org.apache.commons.collections4.n<T> a(T t10) {
        return t10 == null ? f335702c : new k(t10);
    }

    public T b() {
        return this.f335703a;
    }

    @Override // org.apache.commons.collections4.n
    public T k() {
        return this.f335703a;
    }
}
