package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class i<T> implements org.apache.commons.collections4.w0<T, T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335684b = 478466901448617286L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.h<? super T> f335685a;

    public i(org.apache.commons.collections4.h<? super T> hVar) {
        this.f335685a = hVar;
    }

    public static <T> org.apache.commons.collections4.w0<T, T> b(org.apache.commons.collections4.h<? super T> hVar) {
        if (hVar != null) {
            return new i(hVar);
        }
        throw new NullPointerException("Closure must not be null");
    }

    @Override // org.apache.commons.collections4.w0
    public T a(T t10) {
        this.f335685a.a(t10);
        return t10;
    }

    public org.apache.commons.collections4.h<? super T> c() {
        return this.f335685a;
    }
}
