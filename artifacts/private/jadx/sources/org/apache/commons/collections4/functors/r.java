package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class r<I, O> implements org.apache.commons.collections4.w0<I, O>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335731a = 7179106032121985545L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.collections4.w0 f335732b = new r();

    private r() {
    }

    public static <I, O> org.apache.commons.collections4.w0<I, O> b() {
        return f335732b;
    }

    private Object readResolve() {
        return f335732b;
    }

    @Override // org.apache.commons.collections4.w0
    public O a(I i10) {
        throw new org.apache.commons.collections4.q("ExceptionTransformer invoked");
    }
}
