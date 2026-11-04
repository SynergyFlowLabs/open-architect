package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<T> implements p0<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335650b = -3094696765038308799L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final org.apache.commons.collections4.l0<? super T>[] f335651a;

    public a(org.apache.commons.collections4.l0<? super T>... l0VarArr) {
        this.f335651a = l0VarArr;
    }

    @Override // org.apache.commons.collections4.functors.p0
    public org.apache.commons.collections4.l0<? super T>[] b() {
        return v.e(this.f335651a);
    }
}
