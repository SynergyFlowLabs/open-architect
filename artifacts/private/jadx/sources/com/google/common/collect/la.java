package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
class la<R, C, V> extends ma<R, C, V> implements w9<R, C, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f117639i = 0;

    private class b extends ma<R, C, V>.h implements SortedMap<R, Map<C, V>> {
        private b() {
            super();
        }

        @Override // java.util.SortedMap
        @fj.a
        public Comparator<? super R> comparator() {
            return la.this.p().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b8.r0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> g() {
            return new b8.g0(this);
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) la.this.p().firstKey();
        }

        @Override // com.google.common.collect.b8.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> h() {
            return (SortedSet) super.h();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R toKey) {
            com.google.common.base.j0.E(toKey);
            return new la(la.this.p().headMap(toKey), la.this.f117686d).s();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) la.this.p().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R fromKey, R toKey) {
            com.google.common.base.j0.E(fromKey);
            com.google.common.base.j0.E(toKey);
            return new la(la.this.p().subMap(fromKey, toKey), la.this.f117686d).s();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R fromKey) {
            com.google.common.base.j0.E(fromKey);
            return new la(la.this.p().tailMap(fromKey), la.this.f117686d).s();
        }
    }

    la(SortedMap<R, Map<C, V>> backingMap, com.google.common.base.s0<? extends Map<C, V>> factory) {
        super(backingMap, factory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> p() {
        return (SortedMap) this.f117685c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ma
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public SortedMap<R, Map<C, V>> j() {
        return new b();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    public SortedMap<R, Map<C, V>> s() {
        return (SortedMap) super.s();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public SortedSet<R> t() {
        return (SortedSet) s().keySet();
    }
}
