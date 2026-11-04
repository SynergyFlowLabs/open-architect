package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class qb extends a9<Object> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final qb f118002c = new qb();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118003d = 0;

    private qb() {
    }

    private Object readResolve() {
        return f118002c;
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    public int compare(Object left, Object right) {
        return left.toString().compareTo(right.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
