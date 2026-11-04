package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class k<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Comparator<? super E> f335821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Iterator<? extends E>> f335822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<E> f335823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BitSet f335824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f335825e;

    public k() {
        this((Comparator) null, 2);
    }

    private boolean c(List<Iterator<? extends E>> list) {
        Iterator<Iterator<? extends E>> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().hasNext()) {
                return true;
            }
        }
        return false;
    }

    private boolean d(BitSet bitSet) {
        for (int i10 = 0; i10 < bitSet.size(); i10++) {
            if (bitSet.get(i10)) {
                return true;
            }
        }
        return false;
    }

    private void e() throws IllegalStateException {
        if (this.f335823c != null) {
            throw new IllegalStateException("Can't do that after next or hasNext has been called.");
        }
    }

    private void f(int i10) {
        this.f335823c.set(i10, null);
        this.f335824d.clear(i10);
    }

    private int j() {
        Object obj = null;
        int i10 = -1;
        for (int i11 = 0; i11 < this.f335823c.size(); i11++) {
            if (!this.f335824d.get(i11)) {
                k(i11);
            }
            if (this.f335824d.get(i11)) {
                if (i10 == -1) {
                    obj = this.f335823c.get(i11);
                    i10 = i11;
                } else {
                    E e10 = this.f335823c.get(i11);
                    Comparator<? super E> comparator = this.f335821a;
                    if (comparator == null) {
                        throw new NullPointerException("You must invoke setComparator() to set a comparator first.");
                    }
                    if (comparator.compare(e10, obj) < 0) {
                        i10 = i11;
                        obj = e10;
                    }
                }
            }
        }
        return i10;
    }

    private boolean k(int i10) {
        Iterator<? extends E> it = this.f335822b.get(i10);
        if (it.hasNext()) {
            this.f335823c.set(i10, it.next());
            this.f335824d.set(i10);
            return true;
        }
        this.f335823c.set(i10, null);
        this.f335824d.clear(i10);
        return false;
    }

    private void n() {
        if (this.f335823c == null) {
            this.f335823c = new ArrayList(this.f335822b.size());
            this.f335824d = new BitSet(this.f335822b.size());
            int i10 = 5 << 0;
            for (int i11 = 0; i11 < this.f335822b.size(); i11++) {
                this.f335823c.add(null);
                this.f335824d.clear(i11);
            }
        }
    }

    public void b(Iterator<? extends E> it) {
        e();
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        this.f335822b.add(it);
    }

    public Comparator<? super E> g() {
        return this.f335821a;
    }

    public int h() {
        int i10 = this.f335825e;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalStateException("No value has been returned yet");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        n();
        return d(this.f335824d) || c(this.f335822b);
    }

    public List<Iterator<? extends E>> i() {
        return org.apache.commons.collections4.list.m.k(this.f335822b);
    }

    public void l(Comparator<? super E> comparator) {
        e();
        this.f335821a = comparator;
    }

    public void m(int i10, Iterator<? extends E> it) {
        e();
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        this.f335822b.set(i10, it);
    }

    @Override // java.util.Iterator
    public E next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int iJ = j();
        if (iJ == -1) {
            throw new NoSuchElementException();
        }
        E e10 = this.f335823c.get(iJ);
        f(iJ);
        this.f335825e = iJ;
        return e10;
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f335825e;
        if (i10 == -1) {
            throw new IllegalStateException("No value can be removed at present");
        }
        this.f335822b.get(i10).remove();
    }

    public k(Comparator<? super E> comparator) {
        this(comparator, 2);
    }

    public k(Comparator<? super E> comparator, int i10) {
        this.f335821a = null;
        this.f335822b = null;
        this.f335823c = null;
        this.f335824d = null;
        this.f335825e = -1;
        this.f335822b = new ArrayList(i10);
        l(comparator);
    }

    public k(Comparator<? super E> comparator, Iterator<? extends E> it, Iterator<? extends E> it2) {
        this(comparator, 2);
        b(it);
        b(it2);
    }

    public k(Comparator<? super E> comparator, Iterator<? extends E>[] itArr) {
        this(comparator, itArr.length);
        for (Iterator<? extends E> it : itArr) {
            b(it);
        }
    }

    public k(Comparator<? super E> comparator, Collection<Iterator<? extends E>> collection) {
        this(comparator, collection.size());
        Iterator<Iterator<? extends E>> it = collection.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
