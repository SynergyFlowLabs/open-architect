package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class m<T> implements org.apache.commons.collections4.m<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335711a = 825802648423525485L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f335712b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f335713c = -1;

    private m() {
    }

    public static <T> m<T> c() {
        return f335712b;
    }

    private Object readResolve() {
        return f335712b;
    }

    @Override // org.apache.commons.collections4.m
    public int a(T t10) {
        if (t10 == null) {
            return -1;
        }
        return t10.hashCode();
    }

    @Override // org.apache.commons.collections4.m
    public boolean b(T t10, T t11) {
        return t10 == t11 || (t10 != null && t10.equals(t11));
    }
}
