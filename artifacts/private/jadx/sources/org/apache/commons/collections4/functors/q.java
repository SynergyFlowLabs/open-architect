package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class q<T> implements org.apache.commons.collections4.l0<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335727a = 7179106032121985545L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.collections4.l0 f335728b = new q();

    private q() {
    }

    public static <T> org.apache.commons.collections4.l0<T> c() {
        return f335728b;
    }

    private Object readResolve() {
        return f335728b;
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        throw new org.apache.commons.collections4.q("ExceptionPredicate invoked");
    }
}
