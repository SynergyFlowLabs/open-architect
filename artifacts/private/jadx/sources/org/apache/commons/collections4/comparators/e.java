package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.collections4.k;

/* JADX INFO: loaded from: classes14.dex */
public class e<E> implements Comparator<E>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335638c = -5820772575483504339L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<? super E> f335639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f335640b;

    public e() {
        this(k.f335897a, true);
    }

    @Override // java.util.Comparator
    public int compare(E e10, E e11) {
        if (e10 == e11) {
            return 0;
        }
        if (e10 == null) {
            return this.f335640b ? 1 : -1;
        }
        if (e11 == null) {
            return this.f335640b ? -1 : 1;
        }
        return this.f335639a.compare(e10, e11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        e eVar = (e) obj;
        return this.f335640b == eVar.f335640b && this.f335639a.equals(eVar.f335639a);
    }

    public int hashCode() {
        return (this.f335640b ? -1 : 1) * this.f335639a.hashCode();
    }

    public e(Comparator<? super E> comparator) {
        this(comparator, true);
    }

    public e(boolean z10) {
        this(k.f335897a, z10);
    }

    public e(Comparator<? super E> comparator, boolean z10) {
        this.f335639a = comparator;
        this.f335640b = z10;
        if (comparator == null) {
            throw new NullPointerException("null nonNullComparator");
        }
    }
}
