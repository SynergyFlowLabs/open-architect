package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public abstract class r5<E> extends j5<E> implements ga<E> {

    protected abstract class a extends y3<E> {
        public a() {
        }

        @Override // com.google.common.collect.y3
        ga<E> A1() {
            return r5.this;
        }
    }

    protected class b extends ia.b<E> {
        public b() {
            super(r5.this);
        }
    }

    protected r5() {
    }

    @fj.a
    protected q8.a<E> A1() {
        Iterator<q8.a<E>> it = J2().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        q8.a<E> next = it.next();
        return r8.k(next.X0(), next.getCount());
    }

    @fj.a
    protected q8.a<E> C1() {
        Iterator<q8.a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        q8.a<E> next = it.next();
        q8.a<E> aVarK = r8.k(next.X0(), next.getCount());
        it.remove();
        return aVarK;
    }

    @fj.a
    protected q8.a<E> D1() {
        Iterator<q8.a<E>> it = J2().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        q8.a<E> next = it.next();
        q8.a<E> aVarK = r8.k(next.X0(), next.getCount());
        it.remove();
        return aVarK;
    }

    protected ga<E> F1(@b9 E lowerBound, x lowerBoundType, @b9 E upperBound, x upperBoundType) {
        return b4(lowerBound, lowerBoundType).T2(upperBound, upperBoundType);
    }

    @Override // com.google.common.collect.ga
    public ga<E> J2() {
        return i1().J2();
    }

    @Override // com.google.common.collect.ga
    public ga<E> T2(@b9 E upperBound, x boundType) {
        return i1().T2(upperBound, boundType);
    }

    @Override // com.google.common.collect.ga
    public ga<E> b4(@b9 E lowerBound, x boundType) {
        return i1().b4(lowerBound, boundType);
    }

    @Override // com.google.common.collect.ga, com.google.common.collect.ca
    public Comparator<? super E> comparator() {
        return i1().comparator();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> firstEntry() {
        return i1().firstEntry();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> lastEntry() {
        return i1().lastEntry();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> pollFirstEntry() {
        return i1().pollFirstEntry();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> pollLastEntry() {
        return i1().pollLastEntry();
    }

    @Override // com.google.common.collect.ga
    public ga<E> x3(@b9 E lowerBound, x lowerBoundType, @b9 E upperBound, x upperBoundType) {
        return i1().x3(lowerBound, lowerBoundType, upperBound, upperBoundType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.j5
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public abstract ga<E> i1();

    @fj.a
    protected q8.a<E> z1() {
        Iterator<q8.a<E>> it = entrySet().iterator();
        if (it.hasNext()) {
            q8.a<E> next = it.next();
            return r8.k(next.X0(), next.getCount());
        }
        int i10 = 3 | 0;
        return null;
    }

    @Override // com.google.common.collect.j5, com.google.common.collect.q8
    public NavigableSet<E> o() {
        return i1().o();
    }
}
