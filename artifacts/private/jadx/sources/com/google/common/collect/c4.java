package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
class c4 extends m6<Object, Object> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final c4 f117239k = new c4();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f117240l = 0;

    private c4() {
        super(n6.q(), 0);
    }

    private Object readResolve() {
        return f117239k;
    }

    @Override // com.google.common.collect.r6, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    /* JADX INFO: renamed from: j */
    public n6<Object, Collection<Object>> l() {
        return super.l();
    }
}
