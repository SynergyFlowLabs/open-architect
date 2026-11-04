package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class f0<T> implements org.apache.commons.collections4.w0<T, T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335676a = 2133891748318574490L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.collections4.w0 f335677b = new f0();

    private f0() {
    }

    public static <T> org.apache.commons.collections4.w0<T, T> b() {
        return f335677b;
    }

    private Object readResolve() {
        return f335677b;
    }

    @Override // org.apache.commons.collections4.w0
    public T a(T t10) {
        return t10;
    }
}
