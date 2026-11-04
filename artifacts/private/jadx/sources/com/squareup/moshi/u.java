package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
final class u<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f267273i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f267274j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<? super K> f267275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g<K, V>[] f267276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final g<K, V> f267277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f267278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f267279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f267280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u<K, V>.d f267281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u<K, V>.e f267282h;

    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g<K, V> f267283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f267284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f267285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f267286d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f267298c = null;
            gVar.f267296a = null;
            gVar.f267297b = null;
            gVar.f267304i = 1;
            int i10 = this.f267284b;
            if (i10 > 0) {
                int i11 = this.f267286d;
                if ((i11 & 1) == 0) {
                    this.f267286d = i11 + 1;
                    this.f267284b = i10 - 1;
                    this.f267285c++;
                }
            }
            gVar.f267296a = this.f267283a;
            this.f267283a = gVar;
            int i12 = this.f267286d;
            int i13 = i12 + 1;
            this.f267286d = i13;
            int i14 = this.f267284b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f267286d = i12 + 2;
                this.f267284b = i14 - 1;
                this.f267285c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f267286d & i16) != i16) {
                    return;
                }
                int i17 = this.f267285c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f267283a;
                    g<K, V> gVar3 = gVar2.f267296a;
                    g<K, V> gVar4 = gVar3.f267296a;
                    gVar3.f267296a = gVar4.f267296a;
                    this.f267283a = gVar3;
                    gVar3.f267297b = gVar4;
                    gVar3.f267298c = gVar2;
                    gVar3.f267304i = gVar2.f267304i + 1;
                    gVar4.f267296a = gVar3;
                    gVar2.f267296a = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f267283a;
                    g<K, V> gVar6 = gVar5.f267296a;
                    this.f267283a = gVar6;
                    gVar6.f267298c = gVar5;
                    gVar6.f267304i = gVar5.f267304i + 1;
                    gVar5.f267296a = gVar6;
                    this.f267285c = 0;
                } else if (i17 == 2) {
                    this.f267285c = 0;
                }
                i15 *= 2;
            }
        }

        void b(int i10) {
            this.f267284b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f267286d = 0;
            this.f267285c = 0;
            this.f267283a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f267283a;
            if (gVar.f267296a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g<K, V> f267287a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f267287a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f267296a;
            gVar.f267296a = null;
            g<K, V> gVar3 = gVar.f267298c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f267287a = gVar4;
                    return gVar;
                }
                gVar2.f267296a = gVar4;
                gVar3 = gVar2.f267297b;
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f267296a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f267297b;
            }
            this.f267287a = gVar2;
        }
    }

    final class d extends AbstractSet<Map.Entry<K, V>> {

        class a extends u<K, V>.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || u.this.e((Map.Entry) obj) == null) {
                return false;
            }
            int i10 = 2 & 1;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarE;
            if (!(obj instanceof Map.Entry) || (gVarE = u.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            u.this.h(gVarE, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.f267278d;
        }
    }

    final class e extends AbstractSet<K> {

        class a extends u<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f267301f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return u.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return u.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.f267278d;
        }
    }

    abstract class f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g<K, V> f267292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f267293b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f267294c;

        f() {
            this.f267292a = u.this.f267277c.f267299d;
            this.f267294c = u.this.f267279e;
        }

        final g<K, V> b() {
            g<K, V> gVar = this.f267292a;
            u uVar = u.this;
            if (gVar == uVar.f267277c) {
                throw new NoSuchElementException();
            }
            if (uVar.f267279e != this.f267294c) {
                throw new ConcurrentModificationException();
            }
            this.f267292a = gVar.f267299d;
            this.f267293b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f267292a != u.this.f267277c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f267293b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            u.this.h(gVar, true);
            this.f267293b = null;
            this.f267294c = u.this.f267279e;
        }
    }

    u() {
        this(null);
    }

    private void a() {
        g<K, V>[] gVarArrB = b(this.f267276b);
        this.f267276b = gVarArrB;
        this.f267280f = (gVarArrB.length / 2) + (gVarArrB.length / 4);
    }

    static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g<K, V> gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g<K, V> gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.f267302g & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g<K, V> gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.f267302g & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                gVarArr2[i10 + length] = i12 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean c(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    private void g(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f267297b;
            g<K, V> gVar3 = gVar.f267298c;
            int i10 = gVar2 != null ? gVar2.f267304i : 0;
            int i11 = gVar3 != null ? gVar3.f267304i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.f267297b;
                g<K, V> gVar5 = gVar3.f267298c;
                int i13 = (gVar4 != null ? gVar4.f267304i : 0) - (gVar5 != null ? gVar5.f267304i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    l(gVar3);
                }
                k(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.f267297b;
                g<K, V> gVar7 = gVar2.f267298c;
                int i14 = (gVar6 != null ? gVar6.f267304i : 0) - (gVar7 != null ? gVar7.f267304i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    k(gVar2);
                }
                l(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f267304i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f267304i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f267296a;
        }
    }

    private void j(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f267296a;
        gVar.f267296a = null;
        if (gVar2 != null) {
            gVar2.f267296a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f267302g;
            g<K, V>[] gVarArr = this.f267276b;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f267297b == gVar) {
            gVar3.f267297b = gVar2;
        } else {
            gVar3.f267298c = gVar2;
        }
    }

    private void k(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f267297b;
        g<K, V> gVar3 = gVar.f267298c;
        g<K, V> gVar4 = gVar3.f267297b;
        g<K, V> gVar5 = gVar3.f267298c;
        gVar.f267298c = gVar4;
        if (gVar4 != null) {
            gVar4.f267296a = gVar;
        }
        j(gVar, gVar3);
        gVar3.f267297b = gVar;
        gVar.f267296a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f267304i : 0, gVar4 != null ? gVar4.f267304i : 0) + 1;
        gVar.f267304i = iMax;
        gVar3.f267304i = Math.max(iMax, gVar5 != null ? gVar5.f267304i : 0) + 1;
    }

    private void l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f267297b;
        g<K, V> gVar3 = gVar.f267298c;
        g<K, V> gVar4 = gVar2.f267297b;
        g<K, V> gVar5 = gVar2.f267298c;
        gVar.f267297b = gVar5;
        if (gVar5 != null) {
            gVar5.f267296a = gVar;
        }
        j(gVar, gVar2);
        gVar2.f267298c = gVar;
        gVar.f267296a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f267304i : 0, gVar5 != null ? gVar5.f267304i : 0) + 1;
        gVar.f267304i = iMax;
        gVar2.f267304i = Math.max(iMax, gVar4 != null ? gVar4.f267304i : 0) + 1;
    }

    private static int m(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f267276b, (Object) null);
        this.f267278d = 0;
        this.f267279e++;
        g<K, V> gVar = this.f267277c;
        g<K, V> gVar2 = gVar.f267299d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f267299d;
            gVar2.f267300e = null;
            gVar2.f267299d = null;
            gVar2 = gVar3;
        }
        gVar.f267300e = gVar;
        gVar.f267299d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    g<K, V> d(K k10, boolean z10) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f267275a;
        g<K, V>[] gVarArr = this.f267276b;
        int iM = m(k10.hashCode());
        int length = (gVarArr.length - 1) & iM;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f267273i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f267301f) : comparator.compare(k10, gVar2.f267301f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f267297b : gVar2.f267298c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        g<K, V> gVar4 = this.f267277c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, iM, gVar4, gVar4.f267300e);
            if (i10 < 0) {
                gVar5.f267297b = gVar;
            } else {
                gVar5.f267298c = gVar;
            }
            g(gVar5, true);
        } else {
            if (comparator == f267273i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, iM, gVar4, gVar4.f267300e);
            gVarArr[length] = gVar;
        }
        int i11 = this.f267278d;
        this.f267278d = i11 + 1;
        if (i11 > this.f267280f) {
            a();
        }
        this.f267279e++;
        return gVar;
    }

    g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> gVarF = f(entry.getKey());
        if (gVarF == null || !c(gVarF.f267303h, entry.getValue())) {
            return null;
        }
        return gVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        u<K, V>.d dVar = this.f267281g;
        if (dVar != null) {
            return dVar;
        }
        u<K, V>.d dVar2 = new d();
        this.f267281g = dVar2;
        return dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> f(Object obj) {
        if (obj != 0) {
            try {
                return d(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            return gVarF.f267303h;
        }
        return null;
    }

    void h(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f267300e;
            gVar2.f267299d = gVar.f267299d;
            gVar.f267299d.f267300e = gVar2;
            gVar.f267300e = null;
            gVar.f267299d = null;
        }
        g<K, V> gVar3 = gVar.f267297b;
        g<K, V> gVar4 = gVar.f267298c;
        g<K, V> gVar5 = gVar.f267296a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                j(gVar, gVar3);
                gVar.f267297b = null;
            } else if (gVar4 != null) {
                j(gVar, gVar4);
                gVar.f267298c = null;
            } else {
                j(gVar, null);
            }
            g(gVar5, false);
            this.f267278d--;
            this.f267279e++;
            return;
        }
        g<K, V> gVarB = gVar3.f267304i > gVar4.f267304i ? gVar3.b() : gVar4.a();
        h(gVarB, false);
        g<K, V> gVar6 = gVar.f267297b;
        if (gVar6 != null) {
            i10 = gVar6.f267304i;
            gVarB.f267297b = gVar6;
            gVar6.f267296a = gVarB;
            gVar.f267297b = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f267298c;
        if (gVar7 != null) {
            i11 = gVar7.f267304i;
            gVarB.f267298c = gVar7;
            gVar7.f267296a = gVarB;
            gVar.f267298c = null;
        }
        gVarB.f267304i = Math.max(i10, i11) + 1;
        j(gVar, gVarB);
    }

    g<K, V> i(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            h(gVarF, true);
        }
        return gVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        u<K, V>.e eVar = this.f267282h;
        if (eVar != null) {
            return eVar;
        }
        u<K, V>.e eVar2 = new e();
        this.f267282h = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarD = d(k10, true);
        V v11 = gVarD.f267303h;
        gVarD.f267303h = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarI = i(obj);
        if (gVarI != null) {
            return gVarI.f267303h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f267278d;
    }

    u(Comparator<? super K> comparator) {
        this.f267278d = 0;
        this.f267279e = 0;
        if (comparator == null) {
            comparator = f267273i;
        }
        this.f267275a = comparator;
        this.f267277c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f267276b = gVarArr;
        this.f267280f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    static final class g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g<K, V> f267296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f267297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        g<K, V> f267298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        g<K, V> f267299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        g<K, V> f267300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final K f267301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f267302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        V f267303h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f267304i;

        g() {
            this.f267301f = null;
            this.f267302g = -1;
            this.f267300e = this;
            this.f267299d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f267297b;
            while (true) {
                g<K, V> gVar2 = gVar;
                g<K, V> gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.f267297b;
            }
        }

        public g<K, V> b() {
            g<K, V> gVar = this.f267298c;
            while (true) {
                g<K, V> gVar2 = gVar;
                g<K, V> gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.f267298c;
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0026  */
        /* JADX WARN: Code duplicated, block: B:16:0x002e  */
        /* JADX WARN: Code duplicated, block: B:18:0x0038 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            V v10;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f267301f;
                if (k10 == null) {
                    if (entry.getKey() == null) {
                        v10 = this.f267303h;
                        if (v10 == null) {
                            if (entry.getValue() == null) {
                                return true;
                            }
                        } else if (v10.equals(entry.getValue())) {
                            return true;
                        }
                    }
                } else if (k10.equals(entry.getKey())) {
                    v10 = this.f267303h;
                    if (v10 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v10.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f267301f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f267303h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f267301f;
            int iHashCode = 0;
            int iHashCode2 = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f267303h;
            if (v10 != null) {
                iHashCode = v10.hashCode();
            }
            return iHashCode2 ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f267303h;
            this.f267303h = v10;
            return v11;
        }

        public String toString() {
            return this.f267301f + "=" + this.f267303h;
        }

        g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f267296a = gVar;
            this.f267301f = k10;
            this.f267302g = i10;
            this.f267304i = 1;
            this.f267299d = gVar2;
            this.f267300e = gVar3;
            gVar3.f267299d = this;
            gVar2.f267300e = this;
        }
    }
}
