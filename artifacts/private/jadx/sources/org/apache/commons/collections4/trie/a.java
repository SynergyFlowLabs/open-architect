package org.apache.commons.collections4.trie;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import org.apache.commons.collections4.y0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<K, V> extends AbstractMap<K, V> implements y0<K, V>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336310b = 5826987063535505652L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<? super K> f336311a;

    protected a(c<? super K> cVar) {
        if (cVar == null) {
            throw new NullPointerException("keyAnalyzer");
        }
        this.f336311a = cVar;
    }

    static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    final int a(K k10, K k11) {
        return this.f336311a.a(k10, 0, h(k10), k11, 0, h(k11));
    }

    final int b() {
        return this.f336311a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final K c(Object obj) {
        return obj;
    }

    final boolean e(K k10, K k11) {
        if (k10 == null) {
            return k11 == null;
        }
        return k11 != null && this.f336311a.compare(k10, k11) == 0;
    }

    protected c<? super K> f() {
        return this.f336311a;
    }

    final boolean g(K k10, int i10, int i11) {
        if (k10 == null) {
            return false;
        }
        return this.f336311a.c(k10, i10, i11);
    }

    final int h(K k10) {
        if (k10 == null) {
            return 0;
        }
        return this.f336311a.i(k10);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Trie[");
        sb2.append(size());
        sb2.append("]={\n");
        for (Map.Entry<K, V> entry : entrySet()) {
            sb2.append("  ");
            sb2.append(entry);
            sb2.append("\n");
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: org.apache.commons.collections4.trie.a$a, reason: collision with other inner class name */
    static abstract class AbstractC2400a<K, V> implements Map.Entry<K, V>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f336312c = -944364551314110330L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected K f336313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected V f336314b;

        public AbstractC2400a(K k10) {
            this.f336313a = k10;
        }

        public V a(K k10, V v10) {
            this.f336313a = k10;
            return setValue(v10);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a.d(this.f336313a, entry.getKey()) && a.d(this.f336314b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f336313a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f336314b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f336314b;
            this.f336314b = v10;
            return v11;
        }

        public String toString() {
            return this.f336313a + "=" + this.f336314b;
        }

        public AbstractC2400a(K k10, V v10) {
            this.f336313a = k10;
            this.f336314b = v10;
        }
    }
}
