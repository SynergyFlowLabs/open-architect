package org.apache.commons.collections4.map;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class j<K, V> extends c<K, V> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336066c = -6096931280583808322L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<K, V>[] f336067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a<K, V> f336068b;

    public interface a<K, V> extends Serializable {
        V S3(j<K, V> jVar, Map<K, V>[] mapArr, K k10, V v10);

        void q2(j<K, V> jVar, Map<K, V>[] mapArr, Map<? extends K, ? extends V> map);

        void z2(j<K, V> jVar, Map<K, V> map, Map<K, V> map2, Collection<K> collection);
    }

    public j() {
        this(new Map[0], (a) null);
    }

    public synchronized void a(Map<K, V> map) throws IllegalArgumentException {
        try {
            for (int length = this.f336067a.length - 1; length >= 0; length--) {
                Collection<K> collectionK = org.apache.commons.collections4.j.K(this.f336067a[length].keySet(), map.keySet());
                if (collectionK.size() != 0) {
                    a<K, V> aVar = this.f336068b;
                    if (aVar == null) {
                        throw new IllegalArgumentException("Key collision adding Map to CompositeMap");
                    }
                    aVar.z2(this, this.f336067a[length], map, collectionK);
                }
            }
            Map<K, V>[] mapArr = this.f336067a;
            int length2 = mapArr.length;
            Map<K, V>[] mapArr2 = new Map[length2 + 1];
            System.arraycopy(mapArr, 0, mapArr2, 0, mapArr.length);
            mapArr2[length2] = map;
            this.f336067a = mapArr2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Map<K, V> b(Map<K, V> map) {
        try {
            int length = this.f336067a.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f336067a[i10].equals(map)) {
                    Map<K, V>[] mapArr = new Map[length - 1];
                    System.arraycopy(this.f336067a, 0, mapArr, 0, i10);
                    System.arraycopy(this.f336067a, i10 + 1, mapArr, i10, (length - i10) - 1);
                    this.f336067a = mapArr;
                    return map;
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void c(a<K, V> aVar) {
        this.f336068b = aVar;
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        int length = this.f336067a.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            } else {
                this.f336067a[length].clear();
            }
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        for (int length = this.f336067a.length - 1; length >= 0; length--) {
            if (this.f336067a[length].containsKey(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        for (int length = this.f336067a.length - 1; length >= 0; length--) {
            if (this.f336067a[length].containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        org.apache.commons.collections4.set.e eVar = new org.apache.commons.collections4.set.e();
        for (int length = this.f336067a.length - 1; length >= 0; length--) {
            eVar.c(this.f336067a[length].entrySet());
        }
        return eVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        int length = this.f336067a.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
        } while (!this.f336067a[length].containsKey(obj));
        return this.f336067a[length].get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        for (int length = this.f336067a.length - 1; length >= 0; length--) {
            if (!this.f336067a[length].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        org.apache.commons.collections4.set.e eVar = new org.apache.commons.collections4.set.e();
        for (int length = this.f336067a.length - 1; length >= 0; length--) {
            eVar.c(this.f336067a[length].keySet());
        }
        return eVar;
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        a<K, V> aVar = this.f336068b;
        if (aVar != null) {
            return aVar.S3(this, this.f336067a, k10, v10);
        }
        throw new UnsupportedOperationException("No mutator specified");
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        a<K, V> aVar = this.f336068b;
        if (aVar == null) {
            throw new UnsupportedOperationException("No mutator specified");
        }
        aVar.q2(this, this.f336067a, map);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        for (int length = this.f336067a.length - 1; length >= 0; length--) {
            if (this.f336067a[length].containsKey(obj)) {
                return this.f336067a[length].remove(obj);
            }
        }
        return null;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public int size() {
        int size = 0;
        for (int length = this.f336067a.length - 1; length >= 0; length--) {
            size += this.f336067a[length].size();
        }
        return size;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        org.apache.commons.collections4.collection.b bVar = new org.apache.commons.collections4.collection.b();
        for (int length = this.f336067a.length - 1; length >= 0; length--) {
            bVar.c(this.f336067a[length].values());
        }
        return bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Map<K, V> map, Map<K, V> map2) {
        this(new Map[]{map, map2}, (a) null);
        int i10 = 6 >> 1;
    }

    public j(Map<K, V> map, Map<K, V> map2, a<K, V> aVar) {
        this(new Map[]{map, map2}, aVar);
    }

    public j(Map<K, V>... mapArr) {
        this(mapArr, (a) null);
    }

    public j(Map<K, V>[] mapArr, a<K, V> aVar) {
        this.f336068b = aVar;
        this.f336067a = new Map[0];
        for (int length = mapArr.length - 1; length >= 0; length--) {
            a(mapArr[length]);
        }
    }
}
