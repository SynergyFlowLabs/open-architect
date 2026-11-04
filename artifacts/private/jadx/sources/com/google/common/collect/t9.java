package com.google.common.collect;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class t9<R, C, V> extends k7<R, C, V> {

    private final class b extends l7<oa.a<R, C, V>> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.l7
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public oa.a<R, C, V> get(int index) {
            return t9.this.G(index);
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            if (object instanceof oa.a) {
                oa.a aVar = (oa.a) object;
                Object objW = t9.this.w(aVar.b(), aVar.a());
                if (objW != null && objW.equals(aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t9.this.size();
        }

        @Override // com.google.common.collect.l7, com.google.common.collect.z6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class c extends l6<V> {
        private c() {
        }

        @Override // java.util.List
        public V get(int i10) {
            return (V) t9.this.H(i10);
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return t9.this.size();
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    t9() {
    }

    public static /* synthetic */ int A(Comparator comparator, Comparator comparator2, oa.a aVar, oa.a aVar2) {
        int iCompare = comparator == null ? 0 : comparator.compare(aVar.b(), aVar2.b());
        if (iCompare != 0) {
            return iCompare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(aVar.a(), aVar2.a());
    }

    static <R, C, V> t9<R, C, V> C(Iterable<oa.a<R, C, V>> cells) {
        return E(cells, null, null);
    }

    static <R, C, V> t9<R, C, V> D(List<oa.a<R, C, V>> cells, @fj.a final Comparator<? super R> rowComparator, @fj.a final Comparator<? super C> columnComparator) {
        com.google.common.base.j0.E(cells);
        if (rowComparator != null || columnComparator != null) {
            Collections.sort(cells, new Comparator() { // from class: com.google.common.collect.s9
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return t9.A(rowComparator, columnComparator, (oa.a) obj, (oa.a) obj2);
                }
            });
        }
        return E(cells, rowComparator, columnComparator);
    }

    private static <R, C, V> t9<R, C, V> E(Iterable<oa.a<R, C, V>> cells, @fj.a Comparator<? super R> rowComparator, @fj.a Comparator<? super C> columnComparator) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        l6 l6VarV = l6.v(cells);
        for (oa.a<R, C, V> aVar : cells) {
            linkedHashSet.add(aVar.b());
            linkedHashSet2.add(aVar.a());
        }
        return F(l6VarV, rowComparator == null ? z6.A(linkedHashSet) : z6.A(l6.W(rowComparator, linkedHashSet)), columnComparator == null ? z6.A(linkedHashSet2) : z6.A(l6.W(columnComparator, linkedHashSet2)));
    }

    static <R, C, V> t9<R, C, V> F(l6<oa.a<R, C, V>> cellList, z6<R> rowSpace, z6<C> columnSpace) {
        return ((long) cellList.size()) > (((long) rowSpace.size()) * ((long) columnSpace.size())) / 2 ? new v3(cellList, rowSpace, columnSpace) : new ka(cellList, rowSpace, columnSpace);
    }

    final void B(R rowKey, C columnKey, @fj.a V existingValue, V newValue) {
        com.google.common.base.j0.A(existingValue == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", rowKey, columnKey, newValue, existingValue);
    }

    abstract oa.a<R, C, V> G(int iterationIndex);

    abstract V H(int iterationIndex);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.k7, com.google.common.collect.q
    /* JADX INFO: renamed from: n */
    public final z6<oa.a<R, C, V>> b() {
        return isEmpty() ? z6.G() : new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.k7, com.google.common.collect.q
    /* JADX INFO: renamed from: o */
    public final h6<V> c() {
        return isEmpty() ? l6.F() : new c();
    }

    @Override // com.google.common.collect.k7
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    abstract Object writeReplace();
}
