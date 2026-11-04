package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class h0<T> implements org.apache.commons.collections4.l0<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335682a = 7533784454832764388L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.collections4.l0 f335683b = new h0();

    private h0() {
    }

    public static <T> org.apache.commons.collections4.l0<T> c() {
        return f335683b;
    }

    private Object readResolve() {
        return f335683b;
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        return t10 != null;
    }
}
