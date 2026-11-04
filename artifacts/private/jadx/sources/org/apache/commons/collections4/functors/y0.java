package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class y0<T> implements org.apache.commons.collections4.l0<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335769a = 3374767158756189740L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.collections4.l0 f335770b = new y0();

    private y0() {
    }

    public static <T> org.apache.commons.collections4.l0<T> c() {
        return f335770b;
    }

    private Object readResolve() {
        return f335770b;
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        return true;
    }
}
