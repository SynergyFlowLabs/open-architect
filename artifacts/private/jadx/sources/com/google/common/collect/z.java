package com.google.common.collect;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class z<E> extends AbstractList<List<E>> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient l6<List<E>> f118408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int[] f118409b;

    class a extends l6<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f118410f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z f118411g;

        a(final z this$0, final int val$index) {
            this.f118410f = val$index;
            this.f118411g = this$0;
        }

        @Override // java.util.List
        public E get(int i10) {
            com.google.common.base.j0.C(i10, size());
            return (E) ((List) this.f118411g.f118408a.get(i10)).get(this.f118411g.l(this.f118410f, i10));
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118411g.f118408a.size();
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    z(l6<List<E>> axes) {
        this.f118408a = axes;
        int[] iArr = new int[axes.size() + 1];
        iArr[axes.size()] = 1;
        try {
            for (int size = axes.size() - 1; size >= 0; size--) {
                iArr[size] = com.google.common.math.f.d(iArr[size + 1], axes.get(size).size());
            }
            this.f118409b = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    static <E> List<List<E>> i(List<? extends List<? extends E>> lists) {
        l6.a aVar = new l6.a(lists.size());
        Iterator<? extends List<? extends E>> it = lists.iterator();
        while (it.hasNext()) {
            l6 l6VarW = l6.w(it.next());
            if (l6VarW.isEmpty()) {
                return l6.F();
            }
            aVar.a(l6VarW);
        }
        return new z(aVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l(int index, int axis) {
        return (index / this.f118409b[axis + 1]) % this.f118408a.get(axis).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@fj.a Object object) {
        if (!(object instanceof List)) {
            return false;
        }
        List list = (List) object;
        if (list.size() != this.f118408a.size()) {
            return false;
        }
        Iterator<E> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!this.f118408a.get(i10).contains(it.next())) {
                return false;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@fj.a Object o10) {
        if (!(o10 instanceof List)) {
            return -1;
        }
        List list = (List) o10;
        if (list.size() != this.f118408a.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = this.f118408a.get(iNextIndex).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i10 += iIndexOf * this.f118409b[iNextIndex + 1];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public l6<E> get(int index) {
        com.google.common.base.j0.C(index, size());
        return new a(this, index);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@fj.a Object o10) {
        if (!(o10 instanceof List)) {
            return -1;
        }
        List list = (List) o10;
        if (list.size() != this.f118408a.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iLastIndexOf = this.f118408a.get(iNextIndex).lastIndexOf(listIterator.next());
            if (iLastIndexOf == -1) {
                return -1;
            }
            i10 += iLastIndexOf * this.f118409b[iNextIndex + 1];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f118409b[0];
    }
}
