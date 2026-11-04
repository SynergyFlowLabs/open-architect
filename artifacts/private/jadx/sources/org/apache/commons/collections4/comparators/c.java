package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class c<E> implements Comparator<E>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335624d = -721644942746081630L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Comparator<E>> f335625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BitSet f335626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f335627c;

    public c() {
        this(new ArrayList(), new BitSet());
    }

    private void c() {
        if (this.f335625a.size() == 0) {
            throw new UnsupportedOperationException("ComparatorChains must contain at least one Comparator");
        }
    }

    private void d() {
        if (this.f335627c) {
            throw new UnsupportedOperationException("Comparator ordering cannot be changed after the first comparison is performed");
        }
    }

    public void a(Comparator<E> comparator) {
        b(comparator, false);
    }

    public void b(Comparator<E> comparator, boolean z10) {
        d();
        this.f335625a.add(comparator);
        if (z10) {
            this.f335626b.set(this.f335625a.size() - 1);
        }
    }

    @Override // java.util.Comparator
    public int compare(E e10, E e11) throws UnsupportedOperationException {
        if (!this.f335627c) {
            c();
            this.f335627c = true;
        }
        Iterator<Comparator<E>> it = this.f335625a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int iCompare = it.next().compare(e10, e11);
            if (iCompare != 0) {
                if (this.f335626b.get(i10)) {
                    return iCompare > 0 ? -1 : 1;
                }
                return iCompare;
            }
            i10++;
        }
        return 0;
    }

    public boolean e() {
        return this.f335627c;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            c cVar = (c) obj;
            BitSet bitSet = this.f335626b;
            if (bitSet != null ? bitSet.equals(cVar.f335626b) : cVar.f335626b == null) {
                List<Comparator<E>> list = this.f335625a;
                if (list != null ? list.equals(cVar.f335625a) : cVar.f335625a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(int i10, Comparator<E> comparator) throws IndexOutOfBoundsException {
        g(i10, comparator, false);
    }

    public void g(int i10, Comparator<E> comparator, boolean z10) {
        d();
        this.f335625a.set(i10, comparator);
        if (z10) {
            this.f335626b.set(i10);
        } else {
            this.f335626b.clear(i10);
        }
    }

    public void h(int i10) {
        d();
        this.f335626b.clear(i10);
    }

    public int hashCode() {
        List<Comparator<E>> list = this.f335625a;
        int iHashCode = list != null ? list.hashCode() : 0;
        BitSet bitSet = this.f335626b;
        return bitSet != null ? bitSet.hashCode() ^ iHashCode : iHashCode;
    }

    public void i(int i10) {
        d();
        this.f335626b.set(i10);
    }

    public int j() {
        return this.f335625a.size();
    }

    public c(Comparator<E> comparator) {
        this((Comparator) comparator, false);
    }

    public c(Comparator<E> comparator, boolean z10) {
        this.f335626b = null;
        this.f335627c = false;
        ArrayList arrayList = new ArrayList(1);
        this.f335625a = arrayList;
        arrayList.add(comparator);
        BitSet bitSet = new BitSet(1);
        this.f335626b = bitSet;
        if (z10) {
            bitSet.set(0);
        }
    }

    public c(List<Comparator<E>> list) {
        this(list, new BitSet(list.size()));
    }

    public c(List<Comparator<E>> list, BitSet bitSet) {
        this.f335627c = false;
        this.f335625a = list;
        this.f335626b = bitSet;
    }
}
