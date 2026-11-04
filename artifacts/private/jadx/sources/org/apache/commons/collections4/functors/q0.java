package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class q0<T> implements org.apache.commons.collections4.w0<T, Boolean>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335729b = 5278818408044349346L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super T> f335730a;

    public q0(org.apache.commons.collections4.l0<? super T> l0Var) {
        this.f335730a = l0Var;
    }

    public static <T> org.apache.commons.collections4.w0<T, Boolean> c(org.apache.commons.collections4.l0<? super T> l0Var) {
        if (l0Var != null) {
            return new q0(l0Var);
        }
        throw new IllegalArgumentException("Predicate must not be null");
    }

    public org.apache.commons.collections4.l0<? super T> b() {
        return this.f335730a;
    }

    @Override // org.apache.commons.collections4.w0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean a(T t10) {
        return Boolean.valueOf(this.f335730a.a(t10));
    }
}
