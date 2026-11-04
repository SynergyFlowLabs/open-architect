package org.apache.commons.collections4.map;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class d0<K, V> extends org.apache.commons.collections4.map.c<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f336021c = 255;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<K, V>[] f336022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g[] f336023b;

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<Map.Entry<K, V>> f336024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f336025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map.Entry<K, V> f336026c;

        private b() {
            this.f336024a = new ArrayList<>();
        }

        protected Map.Entry<K, V> b() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            ArrayList<Map.Entry<K, V>> arrayList = this.f336024a;
            Map.Entry<K, V> entryRemove = arrayList.remove(arrayList.size() - 1);
            this.f336026c = entryRemove;
            return entryRemove;
        }

        public boolean hasNext() {
            if (this.f336024a.size() > 0) {
                return true;
            }
            while (this.f336025b < d0.this.f336022a.length) {
                synchronized (d0.this.f336023b[this.f336025b]) {
                    try {
                        for (h<K, V> hVar = d0.this.f336022a[this.f336025b]; hVar != null; hVar = hVar.f336035c) {
                            this.f336024a.add(hVar);
                        }
                        this.f336025b++;
                        if (this.f336024a.size() > 0) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return false;
        }

        public void remove() {
            Map.Entry<K, V> entry = this.f336026c;
            if (entry == null) {
                throw new IllegalStateException();
            }
            d0.this.remove(entry.getKey());
            this.f336026c = null;
        }
    }

    private class c extends d0<K, V>.b implements Iterator<Map.Entry<K, V>> {
        private c() {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return b();
        }
    }

    private class d extends AbstractSet<Map.Entry<K, V>> {
        private d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            int iF = d0.this.f(entry.getKey());
            synchronized (d0.this.f336023b[iF]) {
                try {
                    for (h<K, V> hVar = d0.this.f336022a[iF]; hVar != null; hVar = hVar.f336035c) {
                        if (hVar.equals(entry)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iF = d0.this.f(entry.getKey());
            synchronized (d0.this.f336023b[iF]) {
                try {
                    for (h<K, V> hVar = d0.this.f336022a[iF]; hVar != null; hVar = hVar.f336035c) {
                        if (hVar.equals(entry)) {
                            d0.this.remove(hVar.getKey());
                            int i10 = 7 ^ 1;
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d0.this.size();
        }
    }

    private class e extends d0<K, V>.b implements Iterator<K> {
        private e() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return b().getKey();
        }
    }

    private class f extends AbstractSet<K> {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return d0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iF = d0.this.f(obj);
            synchronized (d0.this.f336023b[iF]) {
                try {
                    for (h<K, V> hVar = d0.this.f336022a[iF]; hVar != null; hVar = hVar.f336035c) {
                        K key = hVar.getKey();
                        if (key != obj && (key == null || !key.equals(obj))) {
                        }
                        d0.this.remove(key);
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d0.this.size();
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f336032a;

        private g() {
        }
    }

    private static final class h<K, V> implements Map.Entry<K, V>, org.apache.commons.collections4.x<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected K f336033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected V f336034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected h<K, V> f336035c;

        private h() {
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
            K k10 = this.f336033a;
            if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                V v10 = this.f336034b;
                if (v10 != null ? v10.equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry, org.apache.commons.collections4.x
        public K getKey() {
            return this.f336033a;
        }

        @Override // java.util.Map.Entry, org.apache.commons.collections4.x
        public V getValue() {
            return this.f336034b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f336033a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f336034b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f336034b;
            this.f336034b = v10;
            return v11;
        }
    }

    private class i extends d0<K, V>.b implements Iterator<V> {
        private i() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return b().getValue();
        }
    }

    private class j extends AbstractCollection<V> {
        private j() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d0.this.size();
        }
    }

    public d0() {
        this(255);
    }

    private void e(Runnable runnable, int i10) {
        if (i10 >= this.f336022a.length) {
            runnable.run();
            return;
        }
        synchronized (this.f336023b[i10]) {
            try {
                e(runnable, i10 + 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        int iHashCode = obj.hashCode();
        int i10 = iHashCode + (~(iHashCode << 15));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = i13 + (~(i13 << 11));
        int length = (i14 ^ (i14 >>> 16)) % this.f336022a.length;
        return length < 0 ? length * (-1) : length;
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        for (int i10 = 0; i10 < this.f336022a.length; i10++) {
            g gVar = this.f336023b[i10];
            synchronized (gVar) {
                this.f336022a[i10] = null;
                gVar.f336032a = 0;
            }
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        int iF = f(obj);
        synchronized (this.f336023b[iF]) {
            try {
                for (h<K, V> hVar = this.f336022a[iF]; hVar != null; hVar = hVar.f336035c) {
                    K k10 = hVar.f336033a;
                    if (k10 != obj && (k10 == null || !k10.equals(obj))) {
                    }
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        for (int i10 = 0; i10 < this.f336022a.length; i10++) {
            synchronized (this.f336023b[i10]) {
                try {
                    for (h<K, V> hVar = this.f336022a[i10]; hVar != null; hVar = hVar.f336035c) {
                        V v10 = hVar.f336034b;
                        if (v10 != obj && (v10 == null || !v10.equals(obj))) {
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return false;
    }

    public void d(Runnable runnable) {
        runnable.getClass();
        e(runnable, 0);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return new d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        int iF = f(obj);
        synchronized (this.f336023b[iF]) {
            try {
                for (h<K, V> hVar = this.f336022a[iF]; hVar != null; hVar = hVar.f336035c) {
                    K k10 = hVar.f336033a;
                    if (k10 != obj && (k10 == null || !k10.equals(obj))) {
                    }
                    return hVar.f336034b;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int iHashCode = 0;
        for (int i10 = 0; i10 < this.f336022a.length; i10++) {
            synchronized (this.f336023b[i10]) {
                try {
                    for (h<K, V> hVar = this.f336022a[i10]; hVar != null; hVar = hVar.f336035c) {
                        iHashCode += hVar.hashCode();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return iHashCode;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        return new f();
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        int iF = f(k10);
        synchronized (this.f336023b[iF]) {
            try {
                h<K, V> hVar = this.f336022a[iF];
                if (hVar == null) {
                    h<K, V> hVar2 = new h<>();
                    hVar2.f336033a = k10;
                    hVar2.f336034b = v10;
                    this.f336022a[iF] = hVar2;
                    this.f336023b[iF].f336032a++;
                    return null;
                }
                h<K, V> hVar3 = hVar;
                while (hVar != null) {
                    K k11 = hVar.f336033a;
                    if (k11 != k10 && (k11 == null || !k11.equals(k10))) {
                        hVar3 = hVar;
                        hVar = hVar.f336035c;
                    }
                    V v11 = hVar.f336034b;
                    hVar.f336034b = v10;
                    return v11;
                }
                h<K, V> hVar4 = new h<>();
                hVar4.f336033a = k10;
                hVar4.f336034b = v10;
                hVar3.f336035c = hVar4;
                this.f336023b[iF].f336032a++;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        int iF = f(obj);
        synchronized (this.f336023b[iF]) {
            try {
                h<K, V> hVar = null;
                for (h<K, V> hVar2 = this.f336022a[iF]; hVar2 != null; hVar2 = hVar2.f336035c) {
                    K k10 = hVar2.f336033a;
                    if (k10 != obj && (k10 == null || !k10.equals(obj))) {
                        hVar = hVar2;
                    }
                    if (hVar == null) {
                        this.f336022a[iF] = hVar2.f336035c;
                    } else {
                        hVar.f336035c = hVar2.f336035c;
                    }
                    this.f336023b[iF].f336032a--;
                    return hVar2.f336034b;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public int size() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f336022a.length; i11++) {
            synchronized (this.f336023b[i11]) {
                i10 += this.f336023b[i11].f336032a;
            }
        }
        return i10;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        return new j();
    }

    public d0(int i10) {
        int iMax = Math.max(17, i10);
        iMax = iMax % 2 == 0 ? iMax - 1 : iMax;
        this.f336022a = new h[iMax];
        this.f336023b = new g[iMax];
        for (int i11 = 0; i11 < iMax; i11++) {
            this.f336023b[i11] = new g();
        }
    }
}
