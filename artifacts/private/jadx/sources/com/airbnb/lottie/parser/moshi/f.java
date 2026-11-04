package com.airbnb.lottie.parser.moshi;

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

/* JADX INFO: loaded from: classes3.dex */
final class f<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f88752i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f88753j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Comparator<? super K> f88754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g<K, V>[] f88755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final g<K, V> f88756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f88757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f88758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f88759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f<K, V>.d f88760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f<K, V>.e f88761h;

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
        private g<K, V> f88762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f88763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f88764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f88765d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f88777c = null;
            gVar.f88775a = null;
            gVar.f88776b = null;
            gVar.f88783i = 1;
            int i10 = this.f88763b;
            if (i10 > 0) {
                int i11 = this.f88765d;
                if ((i11 & 1) == 0) {
                    this.f88765d = i11 + 1;
                    this.f88763b = i10 - 1;
                    this.f88764c++;
                }
            }
            gVar.f88775a = this.f88762a;
            this.f88762a = gVar;
            int i12 = this.f88765d;
            int i13 = i12 + 1;
            this.f88765d = i13;
            int i14 = this.f88763b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f88765d = i12 + 2;
                this.f88763b = i14 - 1;
                this.f88764c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f88765d & i16) != i16) {
                    return;
                }
                int i17 = this.f88764c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f88762a;
                    g<K, V> gVar3 = gVar2.f88775a;
                    g<K, V> gVar4 = gVar3.f88775a;
                    gVar3.f88775a = gVar4.f88775a;
                    this.f88762a = gVar3;
                    gVar3.f88776b = gVar4;
                    gVar3.f88777c = gVar2;
                    gVar3.f88783i = gVar2.f88783i + 1;
                    gVar4.f88775a = gVar3;
                    gVar2.f88775a = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f88762a;
                    g<K, V> gVar6 = gVar5.f88775a;
                    this.f88762a = gVar6;
                    gVar6.f88777c = gVar5;
                    gVar6.f88783i = gVar5.f88783i + 1;
                    gVar5.f88775a = gVar6;
                    this.f88764c = 0;
                } else if (i17 == 2) {
                    this.f88764c = 0;
                }
                i15 *= 2;
            }
        }

        void b(int i10) {
            this.f88763b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f88765d = 0;
            this.f88764c = 0;
            this.f88762a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f88762a;
            if (gVar.f88775a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g<K, V> f88766a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f88766a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f88775a;
            gVar.f88775a = null;
            g<K, V> gVar3 = gVar.f88777c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f88766a = gVar4;
                    return gVar;
                }
                gVar2.f88775a = gVar4;
                gVar3 = gVar2.f88776b;
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f88775a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f88776b;
            }
            this.f88766a = gVar2;
        }
    }

    final class d extends AbstractSet<Map.Entry<K, V>> {

        class a extends f<K, V>.AbstractC0827f<Map.Entry<K, V>> {
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
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && f.this.e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarE;
            if (!(obj instanceof Map.Entry) || (gVarE = f.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            f.this.h(gVarE, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.f88757d;
        }
    }

    final class e extends AbstractSet<K> {

        class a extends f<K, V>.AbstractC0827f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f88780f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return f.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.f88757d;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.f$f, reason: collision with other inner class name */
    abstract class AbstractC0827f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g<K, V> f88771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f88772b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f88773c;

        AbstractC0827f() {
            this.f88771a = f.this.f88756c.f88778d;
            this.f88773c = f.this.f88758e;
        }

        final g<K, V> b() {
            g<K, V> gVar = this.f88771a;
            f fVar = f.this;
            if (gVar == fVar.f88756c) {
                throw new NoSuchElementException();
            }
            if (fVar.f88758e != this.f88773c) {
                throw new ConcurrentModificationException();
            }
            this.f88771a = gVar.f88778d;
            this.f88772b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f88771a != f.this.f88756c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f88772b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            f.this.h(gVar, true);
            this.f88772b = null;
            this.f88773c = f.this.f88758e;
        }
    }

    f() {
        this(null);
    }

    private void a() {
        g<K, V>[] gVarArrB = b(this.f88755b);
        this.f88755b = gVarArrB;
        this.f88759f = (gVarArrB.length / 2) + (gVarArrB.length / 4);
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
                    if ((gVarA.f88781g & length) == 0) {
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
                    if ((gVarA2.f88781g & length) == 0) {
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
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void g(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f88776b;
            g<K, V> gVar3 = gVar.f88777c;
            int i10 = gVar2 != null ? gVar2.f88783i : 0;
            int i11 = gVar3 != null ? gVar3.f88783i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.f88776b;
                g<K, V> gVar5 = gVar3.f88777c;
                int i13 = (gVar4 != null ? gVar4.f88783i : 0) - (gVar5 != null ? gVar5.f88783i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    k(gVar);
                } else {
                    l(gVar3);
                    k(gVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.f88776b;
                g<K, V> gVar7 = gVar2.f88777c;
                int i14 = (gVar6 != null ? gVar6.f88783i : 0) - (gVar7 != null ? gVar7.f88783i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    l(gVar);
                } else {
                    k(gVar2);
                    l(gVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f88783i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f88783i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f88775a;
        }
    }

    private void j(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f88775a;
        gVar.f88775a = null;
        if (gVar2 != null) {
            gVar2.f88775a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f88781g;
            g<K, V>[] gVarArr = this.f88755b;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f88776b == gVar) {
            gVar3.f88776b = gVar2;
        } else {
            gVar3.f88777c = gVar2;
        }
    }

    private void k(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f88776b;
        g<K, V> gVar3 = gVar.f88777c;
        g<K, V> gVar4 = gVar3.f88776b;
        g<K, V> gVar5 = gVar3.f88777c;
        gVar.f88777c = gVar4;
        if (gVar4 != null) {
            gVar4.f88775a = gVar;
        }
        j(gVar, gVar3);
        gVar3.f88776b = gVar;
        gVar.f88775a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f88783i : 0, gVar4 != null ? gVar4.f88783i : 0) + 1;
        gVar.f88783i = iMax;
        gVar3.f88783i = Math.max(iMax, gVar5 != null ? gVar5.f88783i : 0) + 1;
    }

    private void l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f88776b;
        g<K, V> gVar3 = gVar.f88777c;
        g<K, V> gVar4 = gVar2.f88776b;
        g<K, V> gVar5 = gVar2.f88777c;
        gVar.f88776b = gVar5;
        if (gVar5 != null) {
            gVar5.f88775a = gVar;
        }
        j(gVar, gVar2);
        gVar2.f88777c = gVar;
        gVar.f88775a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f88783i : 0, gVar5 != null ? gVar5.f88783i : 0) + 1;
        gVar.f88783i = iMax;
        gVar2.f88783i = Math.max(iMax, gVar4 != null ? gVar4.f88783i : 0) + 1;
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
        Arrays.fill(this.f88755b, (Object) null);
        this.f88757d = 0;
        this.f88758e++;
        g<K, V> gVar = this.f88756c;
        g<K, V> gVar2 = gVar.f88778d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f88778d;
            gVar2.f88779e = null;
            gVar2.f88778d = null;
            gVar2 = gVar3;
        }
        gVar.f88779e = gVar;
        gVar.f88778d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    g<K, V> d(K k10, boolean z10) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f88754a;
        g<K, V>[] gVarArr = this.f88755b;
        int iM = m(k10.hashCode());
        int length = (gVarArr.length - 1) & iM;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f88752i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f88780f) : comparator.compare(k10, gVar2.f88780f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f88776b : gVar2.f88777c;
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
        g<K, V> gVar4 = this.f88756c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, iM, gVar4, gVar4.f88779e);
            if (i10 < 0) {
                gVar5.f88776b = gVar;
            } else {
                gVar5.f88777c = gVar;
            }
            g(gVar5, true);
        } else {
            if (comparator == f88752i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, iM, gVar4, gVar4.f88779e);
            gVarArr[length] = gVar;
        }
        int i11 = this.f88757d;
        this.f88757d = i11 + 1;
        if (i11 > this.f88759f) {
            a();
        }
        this.f88758e++;
        return gVar;
    }

    g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> gVarF = f(entry.getKey());
        if (gVarF == null || !c(gVarF.f88782h, entry.getValue())) {
            return null;
        }
        return gVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        f<K, V>.d dVar = this.f88760g;
        if (dVar != null) {
            return dVar;
        }
        f<K, V>.d dVar2 = new d();
        this.f88760g = dVar2;
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
            return gVarF.f88782h;
        }
        return null;
    }

    void h(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f88779e;
            gVar2.f88778d = gVar.f88778d;
            gVar.f88778d.f88779e = gVar2;
            gVar.f88779e = null;
            gVar.f88778d = null;
        }
        g<K, V> gVar3 = gVar.f88776b;
        g<K, V> gVar4 = gVar.f88777c;
        g<K, V> gVar5 = gVar.f88775a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                j(gVar, gVar3);
                gVar.f88776b = null;
            } else if (gVar4 != null) {
                j(gVar, gVar4);
                gVar.f88777c = null;
            } else {
                j(gVar, null);
            }
            g(gVar5, false);
            this.f88757d--;
            this.f88758e++;
            return;
        }
        g<K, V> gVarB = gVar3.f88783i > gVar4.f88783i ? gVar3.b() : gVar4.a();
        h(gVarB, false);
        g<K, V> gVar6 = gVar.f88776b;
        if (gVar6 != null) {
            i10 = gVar6.f88783i;
            gVarB.f88776b = gVar6;
            gVar6.f88775a = gVarB;
            gVar.f88776b = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f88777c;
        if (gVar7 != null) {
            i11 = gVar7.f88783i;
            gVarB.f88777c = gVar7;
            gVar7.f88775a = gVarB;
            gVar.f88777c = null;
        }
        gVarB.f88783i = Math.max(i10, i11) + 1;
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
        f<K, V>.e eVar = this.f88761h;
        if (eVar != null) {
            return eVar;
        }
        f<K, V>.e eVar2 = new e();
        this.f88761h = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarD = d(k10, true);
        V v11 = gVarD.f88782h;
        gVarD.f88782h = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarI = i(obj);
        if (gVarI != null) {
            return gVarI.f88782h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f88757d;
    }

    f(Comparator<? super K> comparator) {
        this.f88757d = 0;
        this.f88758e = 0;
        if (comparator == null) {
            comparator = f88752i;
        }
        this.f88754a = comparator;
        this.f88756c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f88755b = gVarArr;
        this.f88759f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    static final class g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g<K, V> f88775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f88776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        g<K, V> f88777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        g<K, V> f88778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        g<K, V> f88779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final K f88780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f88781g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        V f88782h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f88783i;

        g() {
            this.f88780f = null;
            this.f88781g = -1;
            this.f88779e = this;
            this.f88778d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f88776b;
            while (true) {
                g<K, V> gVar2 = gVar;
                g<K, V> gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.f88776b;
            }
        }

        public g<K, V> b() {
            g<K, V> gVar = this.f88777c;
            while (true) {
                g<K, V> gVar2 = gVar;
                g<K, V> gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.f88777c;
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0024  */
        /* JADX WARN: Code duplicated, block: B:16:0x002c  */
        /* JADX WARN: Code duplicated, block: B:18:0x0038 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            V v10;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f88780f;
                if (k10 == null) {
                    if (entry.getKey() == null) {
                        v10 = this.f88782h;
                        if (v10 == null) {
                            if (entry.getValue() == null) {
                                return true;
                            }
                        } else if (v10.equals(entry.getValue())) {
                            return true;
                        }
                    }
                } else if (k10.equals(entry.getKey())) {
                    v10 = this.f88782h;
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
            return this.f88780f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f88782h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f88780f;
            int iHashCode = 0;
            int iHashCode2 = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f88782h;
            if (v10 != null) {
                iHashCode = v10.hashCode();
            }
            return iHashCode2 ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f88782h;
            this.f88782h = v10;
            return v11;
        }

        public String toString() {
            return this.f88780f + "=" + this.f88782h;
        }

        g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f88775a = gVar;
            this.f88780f = k10;
            this.f88781g = i10;
            this.f88783i = 1;
            this.f88778d = gVar2;
            this.f88779e = gVar3;
            gVar3.f88778d = this;
            gVar2.f88779e = this;
        }
    }
}
