package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class r7<T> extends a9<Iterable<T>> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118032d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Comparator<? super T> f118033c;

    r7(Comparator<? super T> elementOrder) {
        this.f118033c = elementOrder;
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compare(Iterable<T> leftIterable, Iterable<T> rightIterable) {
        Iterator<T> it = leftIterable.iterator();
        Iterator<T> it2 = rightIterable.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f118033c.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof r7) {
            return this.f118033c.equals(((r7) object).f118033c);
        }
        return false;
    }

    public int hashCode() {
        return this.f118033c.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.f118033c + ".lexicographical()";
    }
}
