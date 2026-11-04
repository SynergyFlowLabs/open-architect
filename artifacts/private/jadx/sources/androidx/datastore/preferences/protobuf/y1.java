package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class y1 extends z1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q2 f50772e;

    static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry<K, y1> f50773a;

        public y1 a() {
            return this.f50773a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f50773a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            y1 value = this.f50773a.getValue();
            if (value == null) {
                return null;
            }
            return value.p();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object value) {
            if (value instanceof q2) {
                return this.f50773a.getValue().m((q2) value);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, y1> entry) {
            this.f50773a = entry;
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f50774a;

        public c(Iterator<Map.Entry<K, Object>> iterator) {
            this.f50774a = iterator;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f50774a.next();
            return next.getValue() instanceof y1 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50774a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f50774a.remove();
        }
    }

    public y1(q2 defaultInstance, v0 extensionRegistry, u bytes) {
        super(extensionRegistry, bytes);
        this.f50772e = defaultInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.z1
    public boolean c() {
        return super.c() || this.f50895c == this.f50772e;
    }

    @Override // androidx.datastore.preferences.protobuf.z1
    public boolean equals(Object obj) {
        return p().equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.z1
    public int hashCode() {
        return p().hashCode();
    }

    public q2 p() {
        return g(this.f50772e);
    }

    public String toString() {
        return p().toString();
    }
}
