package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.collections4.k;

/* JADX INFO: loaded from: classes14.dex */
public class f<E> implements Comparator<E>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335641b = 2858887242028539265L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<? super E> f335642a;

    public f() {
        this(null);
    }

    @Override // java.util.Comparator
    public int compare(E e10, E e11) {
        return this.f335642a.compare(e11, e10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            return this.f335642a.equals(((f) obj).f335642a);
        }
        return false;
    }

    public int hashCode() {
        return this.f335642a.hashCode() ^ 175311160;
    }

    public f(Comparator<? super E> comparator) {
        this.f335642a = comparator == null ? k.f335897a : comparator;
    }
}
