package org.apache.commons.collections4.map;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
abstract class b<K, V> extends e<K, V> {

    /* JADX INFO: renamed from: org.apache.commons.collections4.map.b$b, reason: collision with other inner class name */
    private class C2388b extends org.apache.commons.collections4.iterators.c<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<K, V> f336002b;

        protected C2388b(Iterator<Map.Entry<K, V>> it, b<K, V> bVar) {
            super(it);
            this.f336002b = bVar;
        }

        @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return new c(b().next(), this.f336002b);
        }
    }

    private class c extends org.apache.commons.collections4.keyvalue.c<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<K, V> f336004b;

        protected c(Map.Entry<K, V> entry, b<K, V> bVar) {
            super(entry);
            this.f336004b = bVar;
        }

        @Override // org.apache.commons.collections4.keyvalue.c, java.util.Map.Entry
        public V setValue(V v10) {
            return a().setValue(this.f336004b.b(v10));
        }
    }

    protected b() {
    }

    protected abstract V b(V v10);

    protected boolean c() {
        return true;
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return c() ? new a(this.f336038a.entrySet(), this) : this.f336038a.entrySet();
    }

    protected b(Map<K, V> map) {
        super(map);
    }

    private class a extends org.apache.commons.collections4.set.c<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f335999f = 4354731610923110264L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b<K, V> f336000d;

        protected a(Set<Map.Entry<K, V>> set, b<K, V> bVar) {
            super(set);
            this.f336000d = bVar;
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2388b(c().iterator(), this.f336000d);
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection
        public Object[] toArray() {
            Object[] array = c().toArray();
            for (int i10 = 0; i10 < array.length; i10++) {
                array[i10] = new c((Map.Entry) array[i10], this.f336000d);
            }
            return array;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.collections4.collection.a, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2 = (T[]) c().toArray(tArr.length > 0 ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 0) : tArr);
            for (int i10 = 0; i10 < tArr2.length; i10++) {
                tArr2[i10] = new c((Map.Entry) tArr2[i10], this.f336000d);
            }
            if (tArr2.length > tArr.length) {
                return tArr2;
            }
            System.arraycopy(tArr2, 0, tArr, 0, tArr2.length);
            if (tArr.length > tArr2.length) {
                tArr[tArr2.length] = null;
            }
            return tArr;
        }
    }
}
