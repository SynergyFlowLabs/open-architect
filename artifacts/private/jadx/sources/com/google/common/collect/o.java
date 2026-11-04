package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
abstract class o<E> extends i<E> implements ga<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @w5
    final Comparator<? super E> f117880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient ga<E> f117881d;

    class a extends y3<E> {
        a() {
        }

        @Override // com.google.common.collect.y3
        ga<E> A1() {
            return o.this;
        }

        @Override // com.google.common.collect.y3, com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return o.this.descendingIterator();
        }

        @Override // com.google.common.collect.y3
        Iterator<q8.a<E>> z1() {
            return o.this.r();
        }
    }

    o() {
        this(a9.z());
    }

    public ga<E> J2() {
        ga<E> gaVar = this.f117881d;
        if (gaVar != null) {
            return gaVar;
        }
        ga<E> gaVarN = n();
        this.f117881d = gaVarN;
        return gaVarN;
    }

    public Comparator<? super E> comparator() {
        return this.f117880c;
    }

    Iterator<E> descendingIterator() {
        return r8.n(J2());
    }

    @fj.a
    public q8.a<E> firstEntry() {
        Iterator<q8.a<E>> itM = m();
        if (itM.hasNext()) {
            return itM.next();
        }
        return null;
    }

    @fj.a
    public q8.a<E> lastEntry() {
        Iterator<q8.a<E>> itR = r();
        if (itR.hasNext()) {
            return itR.next();
        }
        return null;
    }

    ga<E> n() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.i
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> c() {
        return new ia.b(this);
    }

    @fj.a
    public q8.a<E> pollFirstEntry() {
        Iterator<q8.a<E>> itM = m();
        if (!itM.hasNext()) {
            return null;
        }
        q8.a<E> next = itM.next();
        q8.a<E> aVarK = r8.k(next.X0(), next.getCount());
        itM.remove();
        return aVarK;
    }

    @fj.a
    public q8.a<E> pollLastEntry() {
        Iterator<q8.a<E>> itR = r();
        if (!itR.hasNext()) {
            return null;
        }
        q8.a<E> next = itR.next();
        q8.a<E> aVarK = r8.k(next.X0(), next.getCount());
        itR.remove();
        return aVarK;
    }

    abstract Iterator<q8.a<E>> r();

    public ga<E> x3(@b9 E fromElement, x fromBoundType, @b9 E toElement, x toBoundType) {
        com.google.common.base.j0.E(fromBoundType);
        com.google.common.base.j0.E(toBoundType);
        return b4(fromElement, fromBoundType).T2(toElement, toBoundType);
    }

    o(Comparator<? super E> comparator) {
        this.f117880c = (Comparator) com.google.common.base.j0.E(comparator);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    public NavigableSet<E> o() {
        return (NavigableSet) super.o();
    }
}
