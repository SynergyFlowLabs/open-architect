package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class s0<T> implements org.apache.commons.collections4.w0<T, String>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335738a = 7511110693171758606L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final org.apache.commons.collections4.w0<Object, String> f335739b = new s0();

    private s0() {
    }

    public static <T> org.apache.commons.collections4.w0<T, String> b() {
        return (org.apache.commons.collections4.w0<T, String>) f335739b;
    }

    private Object readResolve() {
        return f335739b;
    }

    @Override // org.apache.commons.collections4.w0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(T t10) {
        return String.valueOf(t10);
    }
}
