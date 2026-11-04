package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class y<V> implements Iterable<b<V>> {
    private static final int X = -1105259343;
    private static final int Y = -1262997959;
    private static final int Z = -825114047;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f95860p0 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f95862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    V[] f95863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    V f95866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f95867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f95868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f95872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f95873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f95874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f95875o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f95876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e f95877t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f95878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c f95879w;

    public static class a<V> extends d<V> implements Iterable<b<V>>, Iterator<b<V>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b<V> f95880h;

        public a(y yVar) {
            super(yVar);
            this.f95880h = new b<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95889e) {
                return this.f95885a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b<V> next() {
            if (!this.f95885a) {
                throw new NoSuchElementException();
            }
            if (!this.f95889e) {
                throw new t("#iterator() cannot be used nested.");
            }
            y<V> yVar = this.f95886b;
            int[] iArr = yVar.f95862b;
            int i10 = this.f95887c;
            if (i10 == -1) {
                b<V> bVar = this.f95880h;
                bVar.f95881a = 0;
                bVar.f95882b = yVar.f95866f;
            } else {
                b<V> bVar2 = this.f95880h;
                bVar2.f95881a = iArr[i10];
                bVar2.f95882b = yVar.f95863c[i10];
            }
            this.f95888d = i10;
            c();
            return this.f95880h;
        }

        @Override // java.lang.Iterable
        public Iterator<b<V>> iterator() {
            return this;
        }

        @Override // com.badlogic.gdx.utils.y.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.y.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f95882b;

        public String toString() {
            return this.f95881a + "=" + this.f95882b;
        }
    }

    public static class c extends d {
        public c(y yVar) {
            super(yVar);
        }

        public int i() {
            if (!this.f95885a) {
                throw new NoSuchElementException();
            }
            if (!this.f95889e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int i10 = this.f95887c;
            int i11 = i10 == -1 ? 0 : this.f95886b.f95862b[i10];
            this.f95888d = i10;
            c();
            return i11;
        }

        public v k() {
            v vVar = new v(true, this.f95886b.f95861a);
            while (this.f95885a) {
                vVar.a(i());
            }
            return vVar;
        }

        @Override // com.badlogic.gdx.utils.y.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.y.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    private static class d<V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f95883f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f95884g = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final y<V> f95886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95889e = true;

        public d(y<V> yVar) {
            this.f95886b = yVar;
            reset();
        }

        void c() {
            int i10;
            this.f95885a = false;
            y<V> yVar = this.f95886b;
            int[] iArr = yVar.f95862b;
            int i11 = yVar.f95864d + yVar.f95865e;
            do {
                i10 = this.f95887c + 1;
                this.f95887c = i10;
                if (i10 >= i11) {
                    return;
                }
            } while (iArr[i10] == 0);
            this.f95885a = true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:11:0x002f  */
        /* JADX WARN: Code duplicated, block: B:14:0x0044  */
        /* JADX WARN: Code duplicated, block: B:7:0x0016 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        public void remove() {
            y<V> yVar;
            int i10 = this.f95888d;
            if (i10 == -1) {
                y<V> yVar2 = this.f95886b;
                if (yVar2.f95867g) {
                    yVar2.f95866f = null;
                    yVar2.f95867g = false;
                } else {
                    if (i10 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    yVar = this.f95886b;
                    if (i10 >= yVar.f95864d) {
                        yVar.F(i10);
                        this.f95887c = this.f95888d - 1;
                        c();
                    } else {
                        yVar.f95862b[i10] = 0;
                        yVar.f95863c[i10] = null;
                    }
                }
            } else {
                if (i10 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                yVar = this.f95886b;
                if (i10 >= yVar.f95864d) {
                    yVar.F(i10);
                    this.f95887c = this.f95888d - 1;
                    c();
                } else {
                    yVar.f95862b[i10] = 0;
                    yVar.f95863c[i10] = null;
                }
            }
            this.f95888d = -2;
            this.f95886b.f95861a--;
        }

        public void reset() {
            this.f95888d = -2;
            this.f95887c = -1;
            if (this.f95886b.f95867g) {
                this.f95885a = true;
            } else {
                c();
            }
        }
    }

    public static class e<V> extends d<V> implements Iterable<V>, Iterator<V> {
        public e(y<V> yVar) {
            super(yVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95889e) {
                return this.f95885a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public com.badlogic.gdx.utils.b<V> i() {
            com.badlogic.gdx.utils.b<V> bVar = new com.badlogic.gdx.utils.b<>(true, this.f95886b.f95861a);
            while (this.f95885a) {
                bVar.c(next());
            }
            return bVar;
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f95885a) {
                throw new NoSuchElementException();
            }
            if (!this.f95889e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int i10 = this.f95887c;
            V v10 = i10 == -1 ? this.f95886b.f95866f : this.f95886b.f95863c[i10];
            this.f95888d = i10;
            c();
            return v10;
        }

        @Override // com.badlogic.gdx.utils.y.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.y.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public y() {
        this(32, 0.8f);
    }

    private void B(int i10, V v10) {
        if (i10 == 0) {
            this.f95866f = v10;
            this.f95867g = true;
            return;
        }
        int i11 = i10 & this.f95870j;
        int[] iArr = this.f95862b;
        int i12 = iArr[i11];
        if (i12 == 0) {
            iArr[i11] = i10;
            this.f95863c[i11] = v10;
            int i13 = this.f95861a;
            this.f95861a = i13 + 1;
            if (i13 >= this.f95871k) {
                G(this.f95864d << 1);
                return;
            }
            return;
        }
        int iS = s(i10);
        int[] iArr2 = this.f95862b;
        int i14 = iArr2[iS];
        if (i14 == 0) {
            iArr2[iS] = i10;
            this.f95863c[iS] = v10;
            int i15 = this.f95861a;
            this.f95861a = i15 + 1;
            if (i15 >= this.f95871k) {
                G(this.f95864d << 1);
                return;
            }
            return;
        }
        int iT = t(i10);
        int[] iArr3 = this.f95862b;
        int i16 = iArr3[iT];
        if (i16 != 0) {
            v(i10, v10, i11, i12, iS, i14, iT, i16);
            return;
        }
        iArr3[iT] = i10;
        this.f95863c[iT] = v10;
        int i17 = this.f95861a;
        this.f95861a = i17 + 1;
        if (i17 >= this.f95871k) {
            G(this.f95864d << 1);
        }
    }

    private void C(int i10, V v10) {
        int i11 = this.f95865e;
        if (i11 == this.f95872l) {
            G(this.f95864d << 1);
            w(i10, v10);
            return;
        }
        int i12 = this.f95864d + i11;
        this.f95862b[i12] = i10;
        this.f95863c[i12] = v10;
        this.f95865e = i11 + 1;
        this.f95861a++;
    }

    private void G(int i10) {
        int i11 = this.f95864d + this.f95865e;
        this.f95864d = i10;
        this.f95871k = (int) (i10 * this.f95868h);
        this.f95870j = i10 - 1;
        this.f95869i = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95872l = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95873m = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        int[] iArr = this.f95862b;
        V[] vArr = this.f95863c;
        int i12 = this.f95872l;
        this.f95862b = new int[i10 + i12];
        this.f95863c = (V[]) new Object[i10 + i12];
        int i13 = this.f95861a;
        this.f95861a = this.f95867g ? 1 : 0;
        this.f95865e = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = iArr[i14];
                if (i15 != 0) {
                    B(i15, vArr[i14]);
                }
            }
        }
    }

    private boolean i(int i10) {
        int[] iArr = this.f95862b;
        int i11 = this.f95864d;
        int i12 = this.f95865e + i11;
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return true;
            }
            i11++;
        }
        return false;
    }

    private V r(int i10, V v10) {
        int[] iArr = this.f95862b;
        int i11 = this.f95864d;
        int i12 = this.f95865e + i11;
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return this.f95863c[i11];
            }
            i11++;
        }
        return v10;
    }

    private int s(int i10) {
        int i11 = i10 * Y;
        return this.f95870j & (i11 ^ (i11 >>> this.f95869i));
    }

    private int t(int i10) {
        int i11 = i10 * Z;
        return this.f95870j & (i11 ^ (i11 >>> this.f95869i));
    }

    private void v(int i10, V v10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int[] iArr = this.f95862b;
        V[] vArr = this.f95863c;
        int i17 = this.f95870j;
        int i18 = this.f95873m;
        int i19 = 0;
        do {
            int iY = com.badlogic.gdx.math.s.y(2);
            if (iY == 0) {
                V v11 = vArr[i11];
                iArr[i11] = i10;
                vArr[i11] = v10;
                i10 = i12;
                v10 = v11;
            } else if (iY != 1) {
                V v12 = vArr[i15];
                iArr[i15] = i10;
                vArr[i15] = v10;
                v10 = v12;
                i10 = i16;
            } else {
                V v13 = vArr[i13];
                iArr[i13] = i10;
                vArr[i13] = v10;
                v10 = v13;
                i10 = i14;
            }
            i11 = i10 & i17;
            i12 = iArr[i11];
            if (i12 == 0) {
                iArr[i11] = i10;
                vArr[i11] = v10;
                int i20 = this.f95861a;
                this.f95861a = i20 + 1;
                if (i20 >= this.f95871k) {
                    G(this.f95864d << 1);
                    return;
                }
                return;
            }
            i13 = s(i10);
            i14 = iArr[i13];
            if (i14 == 0) {
                iArr[i13] = i10;
                vArr[i13] = v10;
                int i21 = this.f95861a;
                this.f95861a = i21 + 1;
                if (i21 >= this.f95871k) {
                    G(this.f95864d << 1);
                    return;
                }
                return;
            }
            i15 = t(i10);
            i16 = iArr[i15];
            if (i16 == 0) {
                iArr[i15] = i10;
                vArr[i15] = v10;
                int i22 = this.f95861a;
                this.f95861a = i22 + 1;
                if (i22 >= this.f95871k) {
                    G(this.f95864d << 1);
                    return;
                }
                return;
            }
            i19++;
        } while (i19 != i18);
        C(i10, v10);
    }

    public void A(y<V> yVar) {
        for (b<V> bVar : yVar.m()) {
            w(bVar.f95881a, bVar.f95882b);
        }
    }

    V D(int i10) {
        int[] iArr = this.f95862b;
        int i11 = this.f95864d;
        int i12 = this.f95865e + i11;
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                V v10 = this.f95863c[i11];
                F(i11);
                this.f95861a--;
                return v10;
            }
            i11++;
        }
        return null;
    }

    void F(int i10) {
        int i11 = this.f95865e - 1;
        this.f95865e = i11;
        int i12 = this.f95864d + i11;
        if (i10 >= i12) {
            this.f95863c[i10] = null;
            return;
        }
        int[] iArr = this.f95862b;
        iArr[i10] = iArr[i12];
        V[] vArr = this.f95863c;
        vArr[i10] = vArr[i12];
        vArr[i12] = null;
    }

    public void J(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95861a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95864d <= i10) {
            return;
        }
        G(com.badlogic.gdx.math.s.u(i10));
    }

    public e<V> K() {
        if (this.f95876s == null) {
            this.f95876s = new e(this);
            this.f95877t = new e(this);
        }
        e eVar = this.f95876s;
        if (eVar.f95889e) {
            this.f95877t.reset();
            e<V> eVar2 = this.f95877t;
            eVar2.f95889e = true;
            this.f95876s.f95889e = false;
            return eVar2;
        }
        eVar.reset();
        e<V> eVar3 = this.f95876s;
        eVar3.f95889e = true;
        this.f95877t.f95889e = false;
        return eVar3;
    }

    public void c(int i10) {
        if (this.f95864d <= i10) {
            clear();
            return;
        }
        this.f95866f = null;
        this.f95867g = false;
        this.f95861a = 0;
        G(i10);
    }

    public void clear() {
        if (this.f95861a == 0) {
            return;
        }
        int[] iArr = this.f95862b;
        V[] vArr = this.f95863c;
        int i10 = this.f95864d + this.f95865e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95861a = 0;
                this.f95865e = 0;
                this.f95866f = null;
                this.f95867g = false;
                return;
            }
            iArr[i11] = 0;
            vArr[i11] = null;
            i10 = i11;
        }
    }

    public boolean d(int i10) {
        if (i10 == 0) {
            return this.f95867g;
        }
        if (this.f95862b[this.f95870j & i10] == i10) {
            return true;
        }
        if (this.f95862b[s(i10)] == i10) {
            return true;
        }
        if (this.f95862b[t(i10)] != i10) {
            return i(i10);
        }
        return true;
    }

    public V get(int i10) {
        if (i10 == 0) {
            if (this.f95867g) {
                return this.f95866f;
            }
            return null;
        }
        int iS = this.f95870j & i10;
        if (this.f95862b[iS] != i10) {
            iS = s(i10);
            if (this.f95862b[iS] != i10) {
                iS = t(i10);
                if (this.f95862b[iS] != i10) {
                    return r(i10, null);
                }
            }
        }
        return this.f95863c[iS];
    }

    @Override // java.lang.Iterable
    public Iterator<b<V>> iterator() {
        return m();
    }

    public boolean k(Object obj, boolean z10) {
        V[] vArr = this.f95863c;
        if (obj == null) {
            if (!this.f95867g || this.f95866f != null) {
                int[] iArr = this.f95862b;
                int i10 = this.f95864d + this.f95865e;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    if (iArr[i11] != 0 && vArr[i11] == null) {
                        return true;
                    }
                    i10 = i11;
                }
            } else {
                return true;
            }
        } else if (z10) {
            if (obj != this.f95866f) {
                int i12 = this.f95864d + this.f95865e;
                while (true) {
                    int i13 = i12 - 1;
                    if (i12 <= 0) {
                        break;
                    }
                    if (vArr[i13] == obj) {
                        return true;
                    }
                    i12 = i13;
                }
            } else {
                return true;
            }
        } else if (!this.f95867g || !obj.equals(this.f95866f)) {
            int i14 = this.f95864d + this.f95865e;
            while (true) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    break;
                }
                if (obj.equals(vArr[i15])) {
                    return true;
                }
                i14 = i15;
            }
        } else {
            return true;
        }
        return false;
    }

    public void l(int i10) {
        int i11 = this.f95861a + i10;
        if (i11 >= this.f95871k) {
            G(com.badlogic.gdx.math.s.u((int) (i11 / this.f95868h)));
        }
    }

    public a<V> m() {
        if (this.f95874n == null) {
            this.f95874n = new a(this);
            this.f95875o = new a(this);
        }
        a aVar = this.f95874n;
        if (aVar.f95889e) {
            this.f95875o.reset();
            a<V> aVar2 = this.f95875o;
            aVar2.f95889e = true;
            this.f95874n.f95889e = false;
            return aVar2;
        }
        aVar.reset();
        a<V> aVar3 = this.f95874n;
        aVar3.f95889e = true;
        this.f95875o.f95889e = false;
        return aVar3;
    }

    public int n(Object obj, boolean z10, int i10) {
        V[] vArr = this.f95863c;
        if (obj == null) {
            if (!this.f95867g || this.f95866f != null) {
                int[] iArr = this.f95862b;
                int i11 = this.f95864d + this.f95865e;
                while (true) {
                    int i12 = i11 - 1;
                    if (i11 <= 0) {
                        break;
                    }
                    int i13 = iArr[i12];
                    if (i13 != 0 && vArr[i12] == null) {
                        return i13;
                    }
                    i11 = i12;
                }
            } else {
                return 0;
            }
        } else if (z10) {
            if (obj != this.f95866f) {
                int i14 = this.f95864d + this.f95865e;
                while (true) {
                    int i15 = i14 - 1;
                    if (i14 <= 0) {
                        break;
                    }
                    if (vArr[i15] == obj) {
                        return this.f95862b[i15];
                    }
                    i14 = i15;
                }
            } else {
                return 0;
            }
        } else if (!this.f95867g || !obj.equals(this.f95866f)) {
            int i16 = this.f95864d + this.f95865e;
            while (true) {
                int i17 = i16 - 1;
                if (i16 <= 0) {
                    break;
                }
                if (obj.equals(vArr[i17])) {
                    return this.f95862b[i17];
                }
                i16 = i17;
            }
        } else {
            return 0;
        }
        return i10;
    }

    public V p(int i10, V v10) {
        if (i10 == 0) {
            return !this.f95867g ? v10 : this.f95866f;
        }
        int iS = this.f95870j & i10;
        if (this.f95862b[iS] != i10) {
            iS = s(i10);
            if (this.f95862b[iS] != i10) {
                iS = t(i10);
                if (this.f95862b[iS] != i10) {
                    return r(i10, v10);
                }
            }
        }
        return this.f95863c[iS];
    }

    public V remove(int i10) {
        if (i10 == 0) {
            if (!this.f95867g) {
                return null;
            }
            V v10 = this.f95866f;
            this.f95866f = null;
            this.f95867g = false;
            this.f95861a--;
            return v10;
        }
        int i11 = this.f95870j & i10;
        int[] iArr = this.f95862b;
        if (iArr[i11] == i10) {
            iArr[i11] = 0;
            V[] vArr = this.f95863c;
            V v11 = vArr[i11];
            vArr[i11] = null;
            this.f95861a--;
            return v11;
        }
        int iS = s(i10);
        int[] iArr2 = this.f95862b;
        if (iArr2[iS] == i10) {
            iArr2[iS] = 0;
            V[] vArr2 = this.f95863c;
            V v12 = vArr2[iS];
            vArr2[iS] = null;
            this.f95861a--;
            return v12;
        }
        int iT = t(i10);
        int[] iArr3 = this.f95862b;
        if (iArr3[iT] != i10) {
            return D(i10);
        }
        iArr3[iT] = 0;
        V[] vArr3 = this.f95863c;
        V v13 = vArr3[iT];
        vArr3[iT] = null;
        this.f95861a--;
        return v13;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e A[EDGE_INSN: B:20:0x004e->B:15:0x0044 BREAK  A[LOOP:0: B:9:0x002d->B:13:0x0035]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[EDGE_INSN: B:21:0x0050->B:15:0x0044 BREAK  A[LOOP:0: B:9:0x002d->B:13:0x0035]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0044 -> B:16:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.f95861a
            if (r0 != 0) goto L7
            java.lang.String r7 = "[]"
            return r7
        L7:
            com.badlogic.gdx.utils.f1 r0 = new com.badlogic.gdx.utils.f1
            r6 = 3
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r7.f95862b
            r6 = 0
            V[] r2 = r7.f95863c
            int r3 = r1.length
            boolean r4 = r7.f95867g
            r5 = 61
            if (r4 == 0) goto L2d
            java.lang.String r4 = "0="
            r0.o(r4)
            V r7 = r7.f95866f
            r6 = 6
            r0.n(r7)
            r6 = 6
            goto L46
        L2d:
            int r7 = r3 + (-1)
            if (r3 <= 0) goto L44
            r3 = r1[r7]
            if (r3 != 0) goto L39
            r6 = 5
            r3 = r7
            r3 = r7
            goto L2d
        L39:
            r0.d(r3)
            r0.append(r5)
            r3 = r2[r7]
            r0.n(r3)
        L44:
            r6 = 4
            r3 = r7
        L46:
            int r7 = r3 + (-1)
            if (r3 <= 0) goto L64
            r3 = r1[r7]
            if (r3 != 0) goto L50
            r6 = 3
            goto L44
        L50:
            java.lang.String r4 = ", "
            java.lang.String r4 = ", "
            r0.o(r4)
            r0.d(r3)
            r6 = 5
            r0.append(r5)
            r3 = r2[r7]
            r0.n(r3)
            goto L44
        L64:
            r6 = 6
            r7 = 93
            r6 = 0
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6 = 2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.y.toString():java.lang.String");
    }

    public c u() {
        if (this.f95878v == null) {
            this.f95878v = new c(this);
            this.f95879w = new c(this);
        }
        c cVar = this.f95878v;
        if (cVar.f95889e) {
            this.f95879w.reset();
            c cVar2 = this.f95879w;
            cVar2.f95889e = true;
            this.f95878v.f95889e = false;
            return cVar2;
        }
        cVar.reset();
        c cVar3 = this.f95878v;
        cVar3.f95889e = true;
        this.f95879w.f95889e = false;
        return cVar3;
    }

    public V w(int i10, V v10) {
        if (i10 == 0) {
            V v11 = this.f95866f;
            this.f95866f = v10;
            if (!this.f95867g) {
                this.f95867g = true;
                this.f95861a++;
            }
            return v11;
        }
        int[] iArr = this.f95862b;
        int i11 = i10 & this.f95870j;
        int i12 = iArr[i11];
        if (i12 == i10) {
            V[] vArr = this.f95863c;
            V v12 = vArr[i11];
            vArr[i11] = v10;
            return v12;
        }
        int iS = s(i10);
        int i13 = iArr[iS];
        if (i13 == i10) {
            V[] vArr2 = this.f95863c;
            V v13 = vArr2[iS];
            vArr2[iS] = v10;
            return v13;
        }
        int iT = t(i10);
        int i14 = iArr[iT];
        if (i14 == i10) {
            V[] vArr3 = this.f95863c;
            V v14 = vArr3[iT];
            vArr3[iT] = v10;
            return v14;
        }
        int i15 = this.f95864d;
        int i16 = this.f95865e + i15;
        while (i15 < i16) {
            if (iArr[i15] == i10) {
                V[] vArr4 = this.f95863c;
                V v15 = vArr4[i15];
                vArr4[i15] = v10;
                return v15;
            }
            i15++;
        }
        if (i12 == 0) {
            iArr[i11] = i10;
            this.f95863c[i11] = v10;
            int i17 = this.f95861a;
            this.f95861a = i17 + 1;
            if (i17 >= this.f95871k) {
                G(this.f95864d << 1);
            }
            return null;
        }
        if (i13 == 0) {
            iArr[iS] = i10;
            this.f95863c[iS] = v10;
            int i18 = this.f95861a;
            this.f95861a = i18 + 1;
            if (i18 >= this.f95871k) {
                G(this.f95864d << 1);
            }
            return null;
        }
        if (i14 != 0) {
            v(i10, v10, i11, i12, iS, i13, iT, i14);
            return null;
        }
        iArr[iT] = i10;
        this.f95863c[iT] = v10;
        int i19 = this.f95861a;
        this.f95861a = i19 + 1;
        if (i19 >= this.f95871k) {
            G(this.f95864d << 1);
        }
        return null;
    }

    public y(int i10) {
        this(i10, 0.8f);
    }

    public y(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 <= 1073741824) {
            int iU = com.badlogic.gdx.math.s.u(i10);
            this.f95864d = iU;
            if (f10 <= 0.0f) {
                throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
            }
            this.f95868h = f10;
            this.f95871k = (int) (iU * f10);
            this.f95870j = iU - 1;
            this.f95869i = 31 - Integer.numberOfTrailingZeros(iU);
            this.f95872l = Math.max(3, ((int) Math.ceil(Math.log(this.f95864d))) * 2);
            this.f95873m = Math.max(Math.min(this.f95864d, 8), ((int) Math.sqrt(this.f95864d)) / 8);
            int[] iArr = new int[this.f95864d + this.f95872l];
            this.f95862b = iArr;
            this.f95863c = (V[]) new Object[iArr.length];
            return;
        }
        throw new IllegalArgumentException("initialCapacity is too large: " + i10);
    }

    public y(y<? extends V> yVar) {
        this(yVar.f95864d, yVar.f95868h);
        this.f95865e = yVar.f95865e;
        int[] iArr = yVar.f95862b;
        System.arraycopy(iArr, 0, this.f95862b, 0, iArr.length);
        Object[] objArr = yVar.f95863c;
        System.arraycopy(objArr, 0, this.f95863c, 0, objArr.length);
        this.f95861a = yVar.f95861a;
        this.f95866f = yVar.f95866f;
        this.f95867g = yVar.f95867g;
    }
}
