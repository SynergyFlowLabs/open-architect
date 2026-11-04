package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class l<I, O> implements org.apache.commons.collections4.w0<I, O>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335706b = 6374440726369055124L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final org.apache.commons.collections4.w0 f335707c = new l(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f335708a;

    public l(O o10) {
        this.f335708a = o10;
    }

    public static <I, O> org.apache.commons.collections4.w0<I, O> b(O o10) {
        return o10 == null ? d() : new l(o10);
    }

    public static <I, O> org.apache.commons.collections4.w0<I, O> d() {
        return f335707c;
    }

    @Override // org.apache.commons.collections4.w0
    public O a(I i10) {
        return this.f335708a;
    }

    public O c() {
        return this.f335708a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        Object objC = ((l) obj).c();
        return objC == c() || (objC != null && objC.equals(c()));
    }

    public int hashCode() {
        if (c() != null) {
            return c().hashCode() | (-144463148);
        }
        return -144463148;
    }
}
