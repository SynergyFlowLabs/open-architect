package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class a<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f116030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f116031b;

    /* JADX INFO: renamed from: com.google.api.client.util.a$a, reason: collision with other inner class name */
    final class C1034a implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f116032a;

        C1034a(int i10) {
            this.f116032a = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return f0.a(getKey(), entry.getKey()) && f0.a(getValue(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) a.this.h(this.f116032a);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) a.this.i(this.f116032a);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            Object value = getValue();
            return (key != null ? key.hashCode() : 0) ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            return (V) a.this.n(this.f116032a, v10);
        }
    }

    final class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f116034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f116035b;

        b() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            int i10 = this.f116035b;
            a aVar = a.this;
            if (i10 == aVar.f116030a) {
                throw new NoSuchElementException();
            }
            this.f116035b = i10 + 1;
            return new C1034a(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f116035b < a.this.f116030a;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f116035b - 1;
            if (this.f116034a || i10 < 0) {
                throw new IllegalArgumentException();
            }
            a.this.k(i10);
            this.f116034a = true;
        }
    }

    final class c extends AbstractSet<Map.Entry<K, V>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.f116030a;
        }
    }

    public static <K, V> a<K, V> c() {
        return new a<>();
    }

    public static <K, V> a<K, V> d(int i10) {
        a<K, V> aVarC = c();
        aVarC.e(i10);
        return aVarC;
    }

    private int f(Object obj) {
        int i10 = this.f116030a << 1;
        Object[] objArr = this.f116031b;
        for (int i11 = 0; i11 < i10; i11 += 2) {
            Object obj2 = objArr[i11];
            if (obj == null) {
                if (obj2 == null) {
                    return i11;
                }
            } else {
                if (obj.equals(obj2)) {
                    return i11;
                }
            }
        }
        return -2;
    }

    public static <K, V> a<K, V> j(Object... objArr) {
        a<K, V> aVarD = d(1);
        int length = objArr.length;
        if (1 == length % 2) {
            throw new IllegalArgumentException("missing value for last key: " + objArr[length - 1]);
        }
        aVarD.f116030a = objArr.length / 2;
        Object[] objArr2 = new Object[length];
        ((a) aVarD).f116031b = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return aVarD;
    }

    private V l(int i10) {
        int i11 = this.f116030a << 1;
        if (i10 < 0 || i10 >= i11) {
            return null;
        }
        V vT = t(i10 + 1);
        Object[] objArr = this.f116031b;
        int i12 = (i11 - i10) - 2;
        if (i12 != 0) {
            System.arraycopy(objArr, i10 + 2, objArr, i10, i12);
        }
        this.f116030a--;
        p(i11 - 2, null, null);
        return vT;
    }

    private void p(int i10, K k10, V v10) {
        Object[] objArr = this.f116031b;
        objArr[i10] = k10;
        objArr[i10 + 1] = v10;
    }

    private void q(int i10) {
        if (i10 == 0) {
            this.f116031b = null;
            return;
        }
        int i11 = this.f116030a;
        Object[] objArr = this.f116031b;
        if (i11 == 0 || i10 != objArr.length) {
            Object[] objArr2 = new Object[i10];
            this.f116031b = objArr2;
            if (i11 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i11 << 1);
            }
        }
    }

    private V t(int i10) {
        if (i10 < 0) {
            return null;
        }
        return (V) this.f116031b[i10];
    }

    public final void a(K k10, V v10) {
        o(this.f116030a, k10, v10);
    }

    @Override // java.util.AbstractMap
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a<K, V> clone() {
        try {
            a<K, V> aVar = (a) super.clone();
            Object[] objArr = this.f116031b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                aVar.f116031b = objArr2;
                int i10 = 3 | 0;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f116030a = 0;
        this.f116031b = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return -2 != f(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i10 = this.f116030a << 1;
        Object[] objArr = this.f116031b;
        for (int i11 = 1; i11 < i10; i11 += 2) {
            Object obj2 = objArr[i11];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else {
                if (obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] objArr = this.f116031b;
        int i11 = i10 << 1;
        int length = objArr == null ? 0 : objArr.length;
        if (i11 > length) {
            int i12 = (length / 2) * 3;
            int i13 = i12 + 1;
            if (i13 % 2 != 0) {
                i13 = i12 + 2;
            }
            if (i13 >= i11) {
                i11 = i13;
            }
            q(i11);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new c();
    }

    public final int g(K k10) {
        return f(k10) >> 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return t(f(obj) + 1);
    }

    public final K h(int i10) {
        if (i10 < 0 || i10 >= this.f116030a) {
            return null;
        }
        return (K) this.f116031b[i10 << 1];
    }

    public final V i(int i10) {
        if (i10 < 0 || i10 >= this.f116030a) {
            return null;
        }
        return t((i10 << 1) + 1);
    }

    public final V k(int i10) {
        return l(i10 << 1);
    }

    public final V n(int i10, V v10) {
        int i11 = this.f116030a;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = (i10 << 1) + 1;
        V vT = t(i12);
        this.f116031b[i12] = v10;
        return vT;
    }

    public final V o(int i10, K k10, V v10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i11 = i10 + 1;
        e(i11);
        int i12 = i10 << 1;
        V vT = t(i12 + 1);
        p(i12, k10, v10);
        if (i11 > this.f116030a) {
            this.f116030a = i11;
        }
        return vT;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        int iG = g(k10);
        if (iG == -1) {
            iG = this.f116030a;
        }
        return o(iG, k10, v10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return l(f(obj));
    }

    public final void s() {
        q(this.f116030a << 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f116030a;
    }
}
