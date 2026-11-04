package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class t<T> implements org.apache.commons.collections4.l0<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335740a = 7533784454832764388L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.collections4.l0 f335741b = new t();

    private t() {
    }

    public static <T> org.apache.commons.collections4.l0<T> c() {
        return f335741b;
    }

    private Object readResolve() {
        return f335741b;
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        return false;
    }
}
