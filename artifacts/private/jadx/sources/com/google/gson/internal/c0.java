package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class c0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f125456i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f125457j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<? super K> f125458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f125459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e<K, V> f125460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f125461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f125462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final e<K, V> f125463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c0<K, V>.b f125464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c0<K, V>.c f125465h;

    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends c0<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && c0.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = c0.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            c0.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c0.this.f125461d;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends c0<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f125479f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return c0.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c0.this.f125461d;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f125470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f125471b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f125472c;

        d() {
            this.f125470a = c0.this.f125463f.f125477d;
            this.f125472c = c0.this.f125462e;
        }

        final e<K, V> b() {
            e<K, V> eVar = this.f125470a;
            c0 c0Var = c0.this;
            if (eVar == c0Var.f125463f) {
                throw new NoSuchElementException();
            }
            if (c0Var.f125462e != this.f125472c) {
                throw new ConcurrentModificationException();
            }
            this.f125470a = eVar.f125477d;
            this.f125471b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f125470a != c0.this.f125463f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f125471b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            c0.this.f(eVar, true);
            this.f125471b = null;
            this.f125472c = c0.this.f125462e;
        }
    }

    public c0() {
        this(f125456i, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void e(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f125475b;
            e<K, V> eVar3 = eVar.f125476c;
            int i10 = eVar2 != null ? eVar2.f125482i : 0;
            int i11 = eVar3 != null ? eVar3.f125482i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f125475b;
                e<K, V> eVar5 = eVar3.f125476c;
                int i13 = (eVar4 != null ? eVar4.f125482i : 0) - (eVar5 != null ? eVar5.f125482i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z10) {
                    break;
                } else {
                    eVar = eVar.f125474a;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f125475b;
                e<K, V> eVar7 = eVar2.f125476c;
                int i14 = (eVar6 != null ? eVar6.f125482i : 0) - (eVar7 != null ? eVar7.f125482i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z10) {
                    break;
                } else {
                    eVar = eVar.f125474a;
                }
            } else if (i12 == 0) {
                eVar.f125482i = i10 + 1;
                if (z10) {
                    break;
                } else {
                    eVar = eVar.f125474a;
                }
            } else {
                eVar.f125482i = Math.max(i10, i11) + 1;
                if (!z10) {
                    break;
                } else {
                    eVar = eVar.f125474a;
                }
            }
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f125474a;
        eVar.f125474a = null;
        if (eVar2 != null) {
            eVar2.f125474a = eVar3;
        }
        if (eVar3 == null) {
            this.f125460c = eVar2;
        } else if (eVar3.f125475b == eVar) {
            eVar3.f125475b = eVar2;
        } else {
            eVar3.f125476c = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f125475b;
        e<K, V> eVar3 = eVar.f125476c;
        e<K, V> eVar4 = eVar3.f125475b;
        e<K, V> eVar5 = eVar3.f125476c;
        eVar.f125476c = eVar4;
        if (eVar4 != null) {
            eVar4.f125474a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f125475b = eVar;
        eVar.f125474a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f125482i : 0, eVar4 != null ? eVar4.f125482i : 0) + 1;
        eVar.f125482i = iMax;
        eVar3.f125482i = Math.max(iMax, eVar5 != null ? eVar5.f125482i : 0) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f125475b;
        e<K, V> eVar3 = eVar.f125476c;
        e<K, V> eVar4 = eVar2.f125475b;
        e<K, V> eVar5 = eVar2.f125476c;
        eVar.f125475b = eVar5;
        if (eVar5 != null) {
            eVar5.f125474a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f125476c = eVar;
        eVar.f125474a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f125482i : 0, eVar5 != null ? eVar5.f125482i : 0) + 1;
        eVar.f125482i = iMax;
        eVar2.f125482i = Math.max(iMax, eVar4 != null ? eVar4.f125482i : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    e<K, V> b(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f125458a;
        e<K, V> eVar2 = this.f125460c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f125456i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f125479f) : comparator.compare(k10, eVar2.f125479f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f125475b : eVar2.f125476c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z10) {
            return null;
        }
        e<K, V> eVar5 = this.f125463f;
        if (eVar4 == null) {
            if (comparator == f125456i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.f125459b, eVar4, k10, eVar5, eVar5.f125478e);
            this.f125460c = eVar;
        } else {
            eVar = new e<>(this.f125459b, eVar4, k10, eVar5, eVar5.f125478e);
            if (iCompareTo < 0) {
                eVar4.f125475b = eVar;
            } else {
                eVar4.f125476c = eVar;
            }
            e(eVar4, true);
        }
        this.f125461d++;
        this.f125462e++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f125481h, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f125460c = null;
        this.f125461d = 0;
        this.f125462e++;
        e<K, V> eVar = this.f125463f;
        eVar.f125478e = eVar;
        eVar.f125477d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        c0<K, V>.b bVar = this.f125464g;
        if (bVar != null) {
            return bVar;
        }
        c0<K, V>.b bVar2 = new b();
        this.f125464g = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f125478e;
            eVar2.f125477d = eVar.f125477d;
            eVar.f125477d.f125478e = eVar2;
        }
        e<K, V> eVar3 = eVar.f125475b;
        e<K, V> eVar4 = eVar.f125476c;
        e<K, V> eVar5 = eVar.f125474a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f125475b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f125476c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f125461d--;
            this.f125462e++;
            return;
        }
        e<K, V> eVarB = eVar3.f125482i > eVar4.f125482i ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e<K, V> eVar6 = eVar.f125475b;
        if (eVar6 != null) {
            i10 = eVar6.f125482i;
            eVarB.f125475b = eVar6;
            eVar6.f125474a = eVarB;
            eVar.f125475b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f125476c;
        if (eVar7 != null) {
            i11 = eVar7.f125482i;
            eVarB.f125476c = eVar7;
            eVar7.f125474a = eVarB;
            eVar.f125476c = null;
        }
        eVarB.f125482i = Math.max(i10, i11) + 1;
        h(eVar, eVarB);
    }

    e<K, V> g(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f125481h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        c0<K, V>.c cVar = this.f125465h;
        if (cVar != null) {
            return cVar;
        }
        c0<K, V>.c cVar2 = new c();
        this.f125465h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @z7.a
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        if (v10 == null && !this.f125459b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarB = b(k10, true);
        V v11 = eVarB.f125481h;
        eVarB.f125481h = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f125481h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f125461d;
    }

    public c0(boolean z10) {
        this(f125456i, z10);
    }

    public c0(Comparator<? super K> comparator, boolean z10) {
        this.f125461d = 0;
        this.f125462e = 0;
        this.f125458a = comparator == null ? f125456i : comparator;
        this.f125459b = z10;
        this.f125463f = new e<>(z10);
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f125474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f125475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e<K, V> f125476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e<K, V> f125477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e<K, V> f125478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final K f125479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f125480g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        V f125481h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f125482i;

        e(boolean z10) {
            this.f125479f = null;
            this.f125480g = z10;
            this.f125478e = this;
            this.f125477d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this.f125475b;
            while (true) {
                e<K, V> eVar2 = eVar;
                e<K, V> eVar3 = this;
                this = eVar2;
                if (this == null) {
                    return eVar3;
                }
                eVar = this.f125475b;
            }
        }

        public e<K, V> b() {
            e<K, V> eVar = this.f125476c;
            while (true) {
                e<K, V> eVar2 = eVar;
                e<K, V> eVar3 = this;
                this = eVar2;
                if (this == null) {
                    return eVar3;
                }
                eVar = this.f125476c;
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            V v10;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f125479f;
                if (k10 == null) {
                    if (entry.getKey() == null) {
                        v10 = this.f125481h;
                        if (v10 == null ? v10.equals(entry.getValue()) : entry.getValue() == null) {
                        }
                    }
                } else if (k10.equals(entry.getKey())) {
                    v10 = this.f125481h;
                    return v10 == null ? true : true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f125479f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f125481h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f125479f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f125481h;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (v10 == null && !this.f125480g) {
                throw new NullPointerException("value == null");
            }
            V v11 = this.f125481h;
            this.f125481h = v10;
            return v11;
        }

        public String toString() {
            return this.f125479f + "=" + this.f125481h;
        }

        e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f125474a = eVar;
            this.f125479f = k10;
            this.f125480g = z10;
            this.f125482i = 1;
            this.f125477d = eVar2;
            this.f125478e = eVar3;
            eVar3.f125477d = this;
            eVar2.f125478e = this;
        }
    }
}
