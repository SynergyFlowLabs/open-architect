package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class d0<I, O> implements org.apache.commons.collections4.w0<I, O>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335670b = 862391807045468939L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<? super I, ? extends O> f335671a;

    private d0(Map<? super I, ? extends O> map) {
        this.f335671a = map;
    }

    public static <I, O> org.apache.commons.collections4.w0<I, O> c(Map<? super I, ? extends O> map) {
        return map == null ? l.d() : new d0(map);
    }

    @Override // org.apache.commons.collections4.w0
    public O a(I i10) {
        return this.f335671a.get(i10);
    }

    public Map<? super I, ? extends O> b() {
        return this.f335671a;
    }
}
