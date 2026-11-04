package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class p<T> implements org.apache.commons.collections4.n<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335725a = 7179106032121985545L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.collections4.n f335726b = new p();

    private p() {
    }

    public static <T> org.apache.commons.collections4.n<T> a() {
        return f335726b;
    }

    private Object readResolve() {
        return f335726b;
    }

    @Override // org.apache.commons.collections4.n
    public T k() {
        throw new org.apache.commons.collections4.q("ExceptionFactory invoked");
    }
}
