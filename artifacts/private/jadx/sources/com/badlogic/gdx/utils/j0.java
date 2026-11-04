package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class j0<K> implements Iterable<b<K>> {
    private static final int X = -825114047;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f95579v = -1105259343;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f95580w = -1262997959;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    K[] f95582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f95583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f95586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f95592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f95593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f95594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e f95595o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f95596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f95597t;

    public static class a<K> extends d<K> implements Iterable<b<K>>, Iterator<b<K>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b<K> f95598f;

        public a(j0<K> j0Var) {
            super(j0Var);
            this.f95598f = new b<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95605e) {
                return this.f95601a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a<K> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b<K> next() {
            if (!this.f95601a) {
                throw new NoSuchElementException();
            }
            if (!this.f95605e) {
                throw new t("#iterator() cannot be used nested.");
            }
            j0<K> j0Var = this.f95602b;
            K[] kArr = j0Var.f95582b;
            b<K> bVar = this.f95598f;
            int i10 = this.f95603c;
            bVar.f95599a = kArr[i10];
            bVar.f95600b = j0Var.f95583c[i10];
            this.f95604d = i10;
            c();
            return this.f95598f;
        }

        @Override // com.badlogic.gdx.utils.j0.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.j0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public K f95599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f95600b;

        public String toString() {
            return this.f95599a + "=" + this.f95600b;
        }
    }

    public static class c<K> extends d<K> implements Iterable<K>, Iterator<K> {
        public c(j0<K> j0Var) {
            super(j0Var);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95605e) {
                return this.f95601a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K> iterator() {
            return this;
        }

        public com.badlogic.gdx.utils.b<K> k() {
            com.badlogic.gdx.utils.b<K> bVar = new com.badlogic.gdx.utils.b<>(true, this.f95602b.f95581a);
            while (this.f95601a) {
                bVar.c(next());
            }
            return bVar;
        }

        public com.badlogic.gdx.utils.b<K> l(com.badlogic.gdx.utils.b<K> bVar) {
            while (this.f95601a) {
                bVar.c(next());
            }
            return bVar;
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f95601a) {
                throw new NoSuchElementException();
            }
            if (!this.f95605e) {
                throw new t("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f95602b.f95582b;
            int i10 = this.f95603c;
            K k10 = kArr[i10];
            this.f95604d = i10;
            c();
            return k10;
        }

        @Override // com.badlogic.gdx.utils.j0.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.j0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    private static class d<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j0<K> f95602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95605e = true;

        public d(j0<K> j0Var) {
            this.f95602b = j0Var;
            reset();
        }

        void c() {
            int i10;
            this.f95601a = false;
            j0<K> j0Var = this.f95602b;
            K[] kArr = j0Var.f95582b;
            int i11 = j0Var.f95584d + j0Var.f95585e;
            do {
                i10 = this.f95603c + 1;
                this.f95603c = i10;
                if (i10 < i11) {
                }
            } while (kArr[i10] == null);
            this.f95601a = true;
        }

        public void remove() {
            int i10 = this.f95604d;
            if (i10 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            j0<K> j0Var = this.f95602b;
            if (i10 >= j0Var.f95584d) {
                j0Var.K(i10);
                this.f95603c = this.f95604d - 1;
                c();
            } else {
                j0Var.f95582b[i10] = null;
            }
            this.f95604d = -1;
            this.f95602b.f95581a--;
        }

        public void reset() {
            this.f95604d = -1;
            this.f95603c = -1;
            c();
        }
    }

    public static class e extends d<Object> {
        public e(j0<?> j0Var) {
            super(j0Var);
        }

        public boolean hasNext() {
            if (this.f95605e) {
                return this.f95601a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public int i() {
            if (!this.f95601a) {
                throw new NoSuchElementException();
            }
            if (!this.f95605e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int[] iArr = this.f95602b.f95583c;
            int i10 = this.f95603c;
            int i11 = iArr[i10];
            this.f95604d = i10;
            c();
            return i11;
        }

        public v k() {
            v vVar = new v(true, this.f95602b.f95581a);
            while (this.f95601a) {
                vVar.a(i());
            }
            return vVar;
        }

        @Override // com.badlogic.gdx.utils.j0.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.j0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public j0() {
        this(32, 0.8f);
    }

    private void B(K k10, int i10, int i11, K k11, int i12, K k12, int i13, K k13) {
        K[] kArr = this.f95582b;
        int[] iArr = this.f95583c;
        int i14 = this.f95588h;
        int i15 = this.f95591k;
        int i16 = i10;
        int i17 = i11;
        K k14 = k11;
        int i18 = i12;
        K k15 = k12;
        int i19 = i13;
        K k16 = k13;
        int i20 = 0;
        K k17 = k10;
        while (true) {
            int iY = com.badlogic.gdx.math.s.y(2);
            if (iY == 0) {
                int i21 = iArr[i17];
                kArr[i17] = k17;
                iArr[i17] = i16;
                k17 = k14;
                i16 = i21;
            } else if (iY != 1) {
                int i22 = iArr[i19];
                kArr[i19] = k17;
                iArr[i19] = i16;
                i16 = i22;
                k17 = k16;
            } else {
                int i23 = iArr[i18];
                kArr[i18] = k17;
                iArr[i18] = i16;
                i16 = i23;
                k17 = k15;
            }
            int iHashCode = k17.hashCode();
            int i24 = iHashCode & i14;
            K k18 = kArr[i24];
            if (k18 == null) {
                kArr[i24] = k17;
                iArr[i24] = i16;
                int i25 = this.f95581a;
                this.f95581a = i25 + 1;
                if (i25 >= this.f95589i) {
                    L(this.f95584d << 1);
                    return;
                }
                return;
            }
            int iU = u(iHashCode);
            K k19 = kArr[iU];
            if (k19 == null) {
                kArr[iU] = k17;
                iArr[iU] = i16;
                int i26 = this.f95581a;
                this.f95581a = i26 + 1;
                if (i26 >= this.f95589i) {
                    L(this.f95584d << 1);
                    return;
                }
                return;
            }
            int iV = v(iHashCode);
            k16 = kArr[iV];
            if (k16 == null) {
                kArr[iV] = k17;
                iArr[iV] = i16;
                int i27 = this.f95581a;
                this.f95581a = i27 + 1;
                if (i27 >= this.f95589i) {
                    L(this.f95584d << 1);
                    return;
                }
                return;
            }
            i20++;
            if (i20 == i15) {
                G(k17, i16);
                return;
            }
            i19 = iV;
            i17 = i24;
            k14 = k18;
            i18 = iU;
            k15 = k19;
        }
    }

    private void F(K k10, int i10) {
        int iHashCode = k10.hashCode();
        int i11 = iHashCode & this.f95588h;
        K[] kArr = this.f95582b;
        K k11 = kArr[i11];
        if (k11 == null) {
            kArr[i11] = k10;
            this.f95583c[i11] = i10;
            int i12 = this.f95581a;
            this.f95581a = i12 + 1;
            if (i12 >= this.f95589i) {
                L(this.f95584d << 1);
                return;
            }
            return;
        }
        int iU = u(iHashCode);
        K[] kArr2 = this.f95582b;
        K k12 = kArr2[iU];
        if (k12 == null) {
            kArr2[iU] = k10;
            this.f95583c[iU] = i10;
            int i13 = this.f95581a;
            this.f95581a = i13 + 1;
            if (i13 >= this.f95589i) {
                L(this.f95584d << 1);
                return;
            }
            return;
        }
        int iV = v(iHashCode);
        K[] kArr3 = this.f95582b;
        K k13 = kArr3[iV];
        if (k13 != null) {
            B(k10, i10, i11, k11, iU, k12, iV, k13);
            return;
        }
        kArr3[iV] = k10;
        this.f95583c[iV] = i10;
        int i14 = this.f95581a;
        this.f95581a = i14 + 1;
        if (i14 >= this.f95589i) {
            L(this.f95584d << 1);
        }
    }

    private void G(K k10, int i10) {
        int i11 = this.f95585e;
        if (i11 == this.f95590j) {
            L(this.f95584d << 1);
            C(k10, i10);
            return;
        }
        int i12 = this.f95584d + i11;
        this.f95582b[i12] = k10;
        this.f95583c[i12] = i10;
        this.f95585e = i11 + 1;
        this.f95581a++;
    }

    private void L(int i10) {
        int i11 = this.f95584d + this.f95585e;
        this.f95584d = i10;
        this.f95589i = (int) (i10 * this.f95586f);
        this.f95588h = i10 - 1;
        this.f95587g = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95590j = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95591k = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        K[] kArr = this.f95582b;
        int[] iArr = this.f95583c;
        int i12 = this.f95590j;
        this.f95582b = (K[]) new Object[i10 + i12];
        this.f95583c = new int[i10 + i12];
        int i13 = this.f95581a;
        this.f95581a = 0;
        this.f95585e = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                K k10 = kArr[i14];
                if (k10 != null) {
                    F(k10, iArr[i14]);
                }
            }
        }
    }

    private boolean i(K k10) {
        K[] kArr = this.f95582b;
        int i10 = this.f95584d;
        int i11 = this.f95585e + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private int s(K k10, int i10, int i11) {
        K[] kArr = this.f95582b;
        int i12 = this.f95584d;
        int i13 = this.f95585e + i12;
        while (i12 < i13) {
            if (k10.equals(kArr[i12])) {
                int[] iArr = this.f95583c;
                int i14 = iArr[i12];
                iArr[i12] = i11 + i14;
                return i14;
            }
            i12++;
        }
        C(k10, i11 + i10);
        return i10;
    }

    private int t(K k10, int i10) {
        K[] kArr = this.f95582b;
        int i11 = this.f95584d;
        int i12 = this.f95585e + i11;
        while (i11 < i12) {
            if (k10.equals(kArr[i11])) {
                return this.f95583c[i11];
            }
            i11++;
        }
        return i10;
    }

    private int u(int i10) {
        int i11 = i10 * f95580w;
        return this.f95588h & (i11 ^ (i11 >>> this.f95587g));
    }

    private int v(int i10) {
        int i11 = i10 * X;
        return this.f95588h & (i11 ^ (i11 >>> this.f95587g));
    }

    public c<K> A() {
        if (this.f95596s == null) {
            this.f95596s = new c(this);
            this.f95597t = new c(this);
        }
        c cVar = this.f95596s;
        if (cVar.f95605e) {
            this.f95597t.reset();
            c<K> cVar2 = this.f95597t;
            cVar2.f95605e = true;
            this.f95596s.f95605e = false;
            return cVar2;
        }
        cVar.reset();
        c<K> cVar3 = this.f95596s;
        cVar3.f95605e = true;
        this.f95597t.f95605e = false;
        return cVar3;
    }

    public void C(K k10, int i10) {
        if (k10 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] objArr = this.f95582b;
        int iHashCode = k10.hashCode();
        int i11 = iHashCode & this.f95588h;
        K k11 = objArr[i11];
        if (k10.equals(k11)) {
            this.f95583c[i11] = i10;
            return;
        }
        int iU = u(iHashCode);
        K k12 = objArr[iU];
        if (k10.equals(k12)) {
            this.f95583c[iU] = i10;
            return;
        }
        int iV = v(iHashCode);
        K k13 = objArr[iV];
        if (k10.equals(k13)) {
            this.f95583c[iV] = i10;
            return;
        }
        int i12 = this.f95584d;
        int i13 = this.f95585e + i12;
        while (i12 < i13) {
            if (k10.equals(objArr[i12])) {
                this.f95583c[i12] = i10;
                return;
            }
            i12++;
        }
        if (k11 == null) {
            objArr[i11] = k10;
            this.f95583c[i11] = i10;
            int i14 = this.f95581a;
            this.f95581a = i14 + 1;
            if (i14 >= this.f95589i) {
                L(this.f95584d << 1);
                return;
            }
            return;
        }
        if (k12 == null) {
            objArr[iU] = k10;
            this.f95583c[iU] = i10;
            int i15 = this.f95581a;
            this.f95581a = i15 + 1;
            if (i15 >= this.f95589i) {
                L(this.f95584d << 1);
                return;
            }
            return;
        }
        if (k13 != null) {
            B(k10, i10, i11, k11, iU, k12, iV, k13);
            return;
        }
        objArr[iV] = k10;
        this.f95583c[iV] = i10;
        int i16 = this.f95581a;
        this.f95581a = i16 + 1;
        if (i16 >= this.f95589i) {
            L(this.f95584d << 1);
        }
    }

    public void D(j0<K> j0Var) {
        a<K> it = j0Var.m().iterator();
        while (it.hasNext()) {
            b<K> next = it.next();
            C(next.f95599a, next.f95600b);
        }
    }

    int J(K k10, int i10) {
        K[] kArr = this.f95582b;
        int i11 = this.f95584d;
        int i12 = this.f95585e + i11;
        while (i11 < i12) {
            if (k10.equals(kArr[i11])) {
                int i13 = this.f95583c[i11];
                K(i11);
                this.f95581a--;
                return i13;
            }
            i11++;
        }
        return i10;
    }

    void K(int i10) {
        int i11 = this.f95585e - 1;
        this.f95585e = i11;
        int i12 = this.f95584d + i11;
        if (i10 < i12) {
            K[] kArr = this.f95582b;
            kArr[i10] = kArr[i12];
            int[] iArr = this.f95583c;
            iArr[i10] = iArr[i12];
        }
    }

    public void M(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95581a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95584d <= i10) {
            return;
        }
        L(com.badlogic.gdx.math.s.u(i10));
    }

    public e N() {
        if (this.f95594n == null) {
            this.f95594n = new e(this);
            this.f95595o = new e(this);
        }
        e eVar = this.f95594n;
        if (eVar.f95605e) {
            this.f95595o.reset();
            e eVar2 = this.f95595o;
            eVar2.f95605e = true;
            this.f95594n.f95605e = false;
            return eVar2;
        }
        eVar.reset();
        e eVar3 = this.f95594n;
        eVar3.f95605e = true;
        this.f95595o.f95605e = false;
        return eVar3;
    }

    public void c(int i10) {
        if (this.f95584d <= i10) {
            clear();
        } else {
            this.f95581a = 0;
            L(i10);
        }
    }

    public void clear() {
        if (this.f95581a == 0) {
            return;
        }
        K[] kArr = this.f95582b;
        int i10 = this.f95584d + this.f95585e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95581a = 0;
                this.f95585e = 0;
                return;
            } else {
                kArr[i11] = null;
                i10 = i11;
            }
        }
    }

    public boolean d(K k10) {
        int iHashCode = k10.hashCode();
        if (!k10.equals(this.f95582b[this.f95588h & iHashCode])) {
            if (!k10.equals(this.f95582b[u(iHashCode)])) {
                if (!k10.equals(this.f95582b[v(iHashCode)])) {
                    return i(k10);
                }
            }
        }
        return true;
    }

    public int f0(K k10, int i10) {
        int iHashCode = k10.hashCode();
        int i11 = this.f95588h & iHashCode;
        if (k10.equals(this.f95582b[i11])) {
            this.f95582b[i11] = null;
            int i12 = this.f95583c[i11];
            this.f95581a--;
            return i12;
        }
        int iU = u(iHashCode);
        if (k10.equals(this.f95582b[iU])) {
            this.f95582b[iU] = null;
            int i13 = this.f95583c[iU];
            this.f95581a--;
            return i13;
        }
        int iV = v(iHashCode);
        if (!k10.equals(this.f95582b[iV])) {
            return J(k10, i10);
        }
        this.f95582b[iV] = null;
        int i14 = this.f95583c[iV];
        this.f95581a--;
        return i14;
    }

    public boolean k(int i10) {
        int[] iArr = this.f95583c;
        int i11 = this.f95584d + this.f95585e;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                return false;
            }
            if (iArr[i12] == i10) {
                int i13 = 7 ^ 1;
                return true;
            }
            i11 = i12;
        }
    }

    public void l(int i10) {
        int i11 = this.f95581a + i10;
        if (i11 >= this.f95589i) {
            L(com.badlogic.gdx.math.s.u((int) (i11 / this.f95586f)));
        }
    }

    public a<K> m() {
        if (this.f95592l == null) {
            this.f95592l = new a(this);
            this.f95593m = new a(this);
        }
        a aVar = this.f95592l;
        if (aVar.f95605e) {
            this.f95593m.reset();
            a<K> aVar2 = this.f95593m;
            aVar2.f95605e = true;
            this.f95592l.f95605e = false;
            return aVar2;
        }
        aVar.reset();
        a<K> aVar3 = this.f95592l;
        aVar3.f95605e = true;
        this.f95593m.f95605e = false;
        return aVar3;
    }

    public K n(int i10) {
        int[] iArr = this.f95583c;
        int i11 = this.f95584d + this.f95585e;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                return null;
            }
            if (iArr[i12] == i10) {
                return this.f95582b[i12];
            }
            i11 = i12;
        }
    }

    public int p(K k10, int i10) {
        int iHashCode = k10.hashCode();
        int iU = this.f95588h & iHashCode;
        if (!k10.equals(this.f95582b[iU])) {
            iU = u(iHashCode);
            if (!k10.equals(this.f95582b[iU])) {
                iU = v(iHashCode);
                if (!k10.equals(this.f95582b[iU])) {
                    return t(k10, i10);
                }
            }
        }
        return this.f95583c[iU];
    }

    public int r(K k10, int i10, int i11) {
        int iHashCode = k10.hashCode();
        int iU = this.f95588h & iHashCode;
        if (!k10.equals(this.f95582b[iU])) {
            iU = u(iHashCode);
            if (!k10.equals(this.f95582b[iU])) {
                iU = v(iHashCode);
                if (!k10.equals(this.f95582b[iU])) {
                    return s(k10, i10, i11);
                }
            }
        }
        int[] iArr = this.f95583c;
        int i12 = iArr[iU];
        iArr[iU] = i11 + i12;
        return i12;
    }

    public String toString() {
        int i10;
        if (this.f95581a == 0) {
            return "{}";
        }
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_OBJ);
        K[] kArr = this.f95582b;
        int[] iArr = this.f95583c;
        int length = kArr.length;
        while (true) {
            i10 = length - 1;
            if (length > 0) {
                K k10 = kArr[i10];
                if (k10 != null) {
                    f1Var.n(k10);
                    f1Var.append('=');
                    f1Var.d(iArr[i10]);
                    break;
                }
                length = i10;
            } else {
                break;
            }
        }
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                f1Var.append(AbstractJsonLexerKt.END_OBJ);
                return f1Var.toString();
            }
            K k11 = kArr[i11];
            if (k11 != null) {
                f1Var.o(", ");
                f1Var.n(k11);
                f1Var.append('=');
                f1Var.d(iArr[i11]);
            }
            i10 = i11;
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a<K> iterator() {
        return m();
    }

    public j0(int i10) {
        this(i10, 0.8f);
    }

    public j0(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + i10);
        }
        int iU = com.badlogic.gdx.math.s.u(i10);
        this.f95584d = iU;
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
        }
        this.f95586f = f10;
        this.f95589i = (int) (iU * f10);
        this.f95588h = iU - 1;
        this.f95587g = 31 - Integer.numberOfTrailingZeros(iU);
        this.f95590j = Math.max(3, ((int) Math.ceil(Math.log(this.f95584d))) * 2);
        this.f95591k = Math.max(Math.min(this.f95584d, 8), ((int) Math.sqrt(this.f95584d)) / 8);
        K[] kArr = (K[]) new Object[this.f95584d + this.f95590j];
        this.f95582b = kArr;
        this.f95583c = new int[kArr.length];
    }

    public j0(j0<? extends K> j0Var) {
        this(j0Var.f95584d, j0Var.f95586f);
        this.f95585e = j0Var.f95585e;
        Object[] objArr = j0Var.f95582b;
        System.arraycopy(objArr, 0, this.f95582b, 0, objArr.length);
        int[] iArr = j0Var.f95583c;
        System.arraycopy(iArr, 0, this.f95583c, 0, iArr.length);
        this.f95581a = j0Var.f95581a;
    }
}
