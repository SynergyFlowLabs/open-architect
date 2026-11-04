package com.google.common.collect;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class i4<T> extends a9<T> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f117467d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final n6<T, Integer> f117468c;

    i4(List<T> valuesInOrder) {
        this(b8.Q(valuesInOrder));
    }

    private int H(T value) {
        Integer num = this.f117468c.get(value);
        if (num != null) {
            return num.intValue();
        }
        throw new a9.c(value);
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    public int compare(T left, T right) {
        return H(left) - H(right);
    }

    @Override // java.util.Comparator
    public boolean equals(@fj.a Object object) {
        if (object instanceof i4) {
            return this.f117468c.equals(((i4) object).f117468c);
        }
        return false;
    }

    public int hashCode() {
        return this.f117468c.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.f117468c.keySet() + ")";
    }

    i4(n6<T, Integer> rankMap) {
        this.f117468c = rankMap;
    }
}
