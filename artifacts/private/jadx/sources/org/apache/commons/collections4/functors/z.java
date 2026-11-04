package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class z implements org.apache.commons.collections4.l0<Object>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335771b = -6682656911025165584L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f335772a;

    public z(Class<?> cls) {
        this.f335772a = cls;
    }

    public static org.apache.commons.collections4.l0<Object> d(Class<?> cls) {
        if (cls != null) {
            return new z(cls);
        }
        throw new NullPointerException("The type to check instanceof must not be null");
    }

    @Override // org.apache.commons.collections4.l0
    public boolean a(Object obj) {
        return this.f335772a.isInstance(obj);
    }

    public Class<?> c() {
        return this.f335772a;
    }
}
