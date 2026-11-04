package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class s<I, O> implements org.apache.commons.collections4.w0<I, O>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335736b = -6817674502475353160L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.n<? extends O> f335737a;

    public s(org.apache.commons.collections4.n<? extends O> nVar) {
        this.f335737a = nVar;
    }

    public static <I, O> org.apache.commons.collections4.w0<I, O> b(org.apache.commons.collections4.n<? extends O> nVar) {
        if (nVar != null) {
            return new s(nVar);
        }
        throw new NullPointerException("Factory must not be null");
    }

    @Override // org.apache.commons.collections4.w0
    public O a(I i10) {
        return this.f335737a.k();
    }

    public org.apache.commons.collections4.n<? extends O> c() {
        return this.f335737a;
    }
}
