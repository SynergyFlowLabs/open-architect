package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class v0 {

    private static class b<K, V> implements t<K, V>, a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r<K, V> f336407a;

        @Override // org.apache.commons.collections4.s
        public a0<K, V> T() {
            r<K, V> rVar = this.f336407a;
            return org.apache.commons.collections4.iterators.q0.b(rVar instanceof s ? ((s) rVar).T() : new org.apache.commons.collections4.map.l(rVar.entrySet()));
        }

        @Override // java.util.Map, org.apache.commons.collections4.n0
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public boolean containsKey(Object obj) {
            return this.f336407a.containsKey(obj);
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public boolean containsValue(Object obj) {
            return this.f336407a.containsValue(obj);
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public Set<Map.Entry<K, V>> entrySet() {
            return org.apache.commons.collections4.map.g0.l(this.f336407a.entrySet());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).f336407a.equals(this.f336407a);
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public V get(Object obj) {
            return this.f336407a.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f336407a.hashCode() | 360074000;
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public boolean isEmpty() {
            return this.f336407a.isEmpty();
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public Set<K> keySet() {
            return org.apache.commons.collections4.set.o.k(this.f336407a.keySet());
        }

        @Override // java.util.Map, org.apache.commons.collections4.n0
        public V put(K k10, V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map, org.apache.commons.collections4.n0
        public void putAll(Map<? extends K, ? extends V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public V remove(Object obj) {
            return this.f336407a.remove(obj);
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public int size() {
            return this.f336407a.size();
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public Collection<V> values() {
            return org.apache.commons.collections4.collection.h.i(this.f336407a.values());
        }

        private b(r<K, V> rVar) {
            this.f336407a = rVar;
        }
    }

    private static class c<K, V> implements Map<K, V>, n0<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n0<K, V> f336408a;

        @Override // java.util.Map, org.apache.commons.collections4.n0
        public void clear() {
            this.f336408a.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof c) && ((c) obj).f336408a.equals(this.f336408a);
        }

        @Override // java.util.Map
        public V get(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f336408a.hashCode() | 360220320;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map, org.apache.commons.collections4.n0
        public V put(K k10, V v10) {
            return (V) this.f336408a.put(k10, v10);
        }

        @Override // java.util.Map, org.apache.commons.collections4.n0
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f336408a.putAll(map);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public int size() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public Collection<V> values() {
            throw new UnsupportedOperationException();
        }

        private c(n0<K, V> n0Var) {
            this.f336408a = n0Var;
        }
    }

    private v0() {
    }

    public static <K, V> t<K, V> a(r<K, V> rVar) {
        if (rVar == null) {
            throw new NullPointerException("Get must not be null");
        }
        if (rVar instanceof Map) {
            return rVar instanceof t ? (t) rVar : b0.R((Map) rVar);
        }
        return new b(rVar);
    }

    public static <K, V> Map<K, V> b(n0<K, V> n0Var) {
        if (n0Var != null) {
            return n0Var instanceof Map ? (Map) n0Var : new c(n0Var);
        }
        throw new NullPointerException("Put must not be null");
    }
}
