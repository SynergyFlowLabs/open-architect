package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
class d4 extends a7<Object, Object> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final d4 f117297m = new d4();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f117298n = 0;

    private d4() {
        super(n6.q(), 0, null);
    }

    private Object readResolve() {
        return f117297m;
    }

    @Override // com.google.common.collect.r6, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    /* JADX INFO: renamed from: j */
    public n6<Object, Collection<Object>> l() {
        return super.l();
    }
}
