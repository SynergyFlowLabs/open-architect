package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class z0<T> implements org.apache.commons.collections4.l0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335773b = -3319417438027438040L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<T> f335774a = new HashSet();

    public static <T> org.apache.commons.collections4.l0<T> c() {
        return new z0();
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(T t10) {
        return this.f335774a.add(t10);
    }
}
