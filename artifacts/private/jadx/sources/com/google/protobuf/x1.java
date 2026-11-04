package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class x1 extends y1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n2 f126456f;

    static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry<K, x1> f126457a;

        public x1 a() {
            return this.f126457a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f126457a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            x1 value = this.f126457a.getValue();
            if (value == null) {
                return null;
            }
            return value.p();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object value) {
            if (value instanceof n2) {
                return this.f126457a.getValue().m((n2) value);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, x1> entry) {
            this.f126457a = entry;
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f126458a;

        public c(Iterator<Map.Entry<K, Object>> iterator) {
            this.f126458a = iterator;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f126458a.next();
            if (!(next.getValue() instanceof x1)) {
                return next;
            }
            int i10 = 2 >> 0;
            return new b(next);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f126458a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f126458a.remove();
        }
    }

    public x1(n2 defaultInstance, v0 extensionRegistry, u bytes) {
        super(extensionRegistry, bytes);
        this.f126456f = defaultInstance;
    }

    @Override // com.google.protobuf.y1
    public boolean c() {
        return super.c() || this.f126521c == this.f126456f;
    }

    @Override // com.google.protobuf.y1
    public boolean equals(Object obj) {
        return p().equals(obj);
    }

    @Override // com.google.protobuf.y1
    public int hashCode() {
        return p().hashCode();
    }

    public n2 p() {
        return g(this.f126456f);
    }

    public String toString() {
        return p().toString();
    }
}
