package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class i0<K> implements Iterable<b<K>> {
    private static final int X = -825114047;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f95548v = -1105259343;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f95549w = -1262997959;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    K[] f95551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float[] f95552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f95555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f95561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f95562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f95563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e f95564o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f95565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f95566t;

    public static class a<K> extends d<K> implements Iterable<b<K>>, Iterator<b<K>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b<K> f95567f;

        public a(i0<K> i0Var) {
            super(i0Var);
            this.f95567f = new b<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95574e) {
                return this.f95570a;
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
            if (!this.f95570a) {
                throw new NoSuchElementException();
            }
            if (!this.f95574e) {
                throw new t("#iterator() cannot be used nested.");
            }
            i0<K> i0Var = this.f95571b;
            K[] kArr = i0Var.f95551b;
            b<K> bVar = this.f95567f;
            int i10 = this.f95572c;
            bVar.f95568a = kArr[i10];
            bVar.f95569b = i0Var.f95552c[i10];
            this.f95573d = i10;
            c();
            return this.f95567f;
        }

        @Override // com.badlogic.gdx.utils.i0.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.i0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public K f95568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f95569b;

        public String toString() {
            return this.f95568a + "=" + this.f95569b;
        }
    }

    public static class c<K> extends d<K> implements Iterable<K>, Iterator<K> {
        public c(i0<K> i0Var) {
            super(i0Var);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95574e) {
                return this.f95570a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K> iterator() {
            return this;
        }

        public com.badlogic.gdx.utils.b<K> k() {
            int i10 = 3 << 1;
            com.badlogic.gdx.utils.b<K> bVar = new com.badlogic.gdx.utils.b<>(true, this.f95571b.f95550a);
            while (this.f95570a) {
                bVar.c(next());
            }
            return bVar;
        }

        public com.badlogic.gdx.utils.b<K> l(com.badlogic.gdx.utils.b<K> bVar) {
            while (this.f95570a) {
                bVar.c(next());
            }
            return bVar;
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f95570a) {
                throw new NoSuchElementException();
            }
            if (!this.f95574e) {
                throw new t("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f95571b.f95551b;
            int i10 = this.f95572c;
            K k10 = kArr[i10];
            this.f95573d = i10;
            c();
            return k10;
        }

        @Override // com.badlogic.gdx.utils.i0.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.i0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    private static class d<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final i0<K> f95571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95574e = true;

        public d(i0<K> i0Var) {
            this.f95571b = i0Var;
            reset();
        }

        void c() {
            int i10;
            this.f95570a = false;
            i0<K> i0Var = this.f95571b;
            K[] kArr = i0Var.f95551b;
            int i11 = i0Var.f95553d + i0Var.f95554e;
            do {
                i10 = this.f95572c + 1;
                this.f95572c = i10;
                if (i10 >= i11) {
                    return;
                }
            } while (kArr[i10] == null);
            this.f95570a = true;
        }

        public void remove() {
            int i10 = this.f95573d;
            if (i10 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            i0<K> i0Var = this.f95571b;
            if (i10 >= i0Var.f95553d) {
                i0Var.L(i10);
                this.f95572c = this.f95573d - 1;
                c();
            } else {
                i0Var.f95551b[i10] = null;
            }
            this.f95573d = -1;
            this.f95571b.f95550a--;
        }

        public void reset() {
            this.f95573d = -1;
            this.f95572c = -1;
            c();
        }
    }

    public static class e extends d<Object> {
        public e(i0<?> i0Var) {
            super(i0Var);
        }

        public boolean hasNext() {
            if (this.f95574e) {
                return this.f95570a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public float i() {
            if (!this.f95570a) {
                throw new NoSuchElementException();
            }
            if (!this.f95574e) {
                throw new t("#iterator() cannot be used nested.");
            }
            float[] fArr = this.f95571b.f95552c;
            int i10 = this.f95572c;
            float f10 = fArr[i10];
            this.f95573d = i10;
            c();
            return f10;
        }

        public q k() {
            q qVar = new q(true, this.f95571b.f95550a);
            while (this.f95570a) {
                qVar.a(i());
            }
            return qVar;
        }

        @Override // com.badlogic.gdx.utils.i0.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.i0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public i0() {
        this(32, 0.8f);
    }

    private void B(K k10, float f10, int i10, K k11, int i11, K k12, int i12, K k13) {
        K[] kArr = this.f95551b;
        float[] fArr = this.f95552c;
        int i13 = this.f95557h;
        int i14 = this.f95560k;
        float f11 = f10;
        int i15 = i10;
        K k14 = k11;
        int i16 = i11;
        K k15 = k12;
        int i17 = i12;
        K k16 = k13;
        int i18 = 0;
        K k17 = k10;
        while (true) {
            int iY = com.badlogic.gdx.math.s.y(2);
            if (iY == 0) {
                float f12 = fArr[i15];
                kArr[i15] = k17;
                fArr[i15] = f11;
                k17 = k14;
                f11 = f12;
            } else if (iY != 1) {
                float f13 = fArr[i17];
                kArr[i17] = k17;
                fArr[i17] = f11;
                f11 = f13;
                k17 = k16;
            } else {
                float f14 = fArr[i16];
                kArr[i16] = k17;
                fArr[i16] = f11;
                f11 = f14;
                k17 = k15;
            }
            int iHashCode = k17.hashCode();
            int i19 = iHashCode & i13;
            K k18 = kArr[i19];
            if (k18 == null) {
                kArr[i19] = k17;
                fArr[i19] = f11;
                int i20 = this.f95550a;
                this.f95550a = i20 + 1;
                if (i20 >= this.f95558i) {
                    M(this.f95553d << 1);
                    return;
                }
                return;
            }
            int iU = u(iHashCode);
            K k19 = kArr[iU];
            if (k19 == null) {
                kArr[iU] = k17;
                fArr[iU] = f11;
                int i21 = this.f95550a;
                this.f95550a = i21 + 1;
                if (i21 >= this.f95558i) {
                    M(this.f95553d << 1);
                    return;
                }
                return;
            }
            int iV = v(iHashCode);
            k16 = kArr[iV];
            if (k16 == null) {
                kArr[iV] = k17;
                fArr[iV] = f11;
                int i22 = this.f95550a;
                this.f95550a = i22 + 1;
                if (i22 >= this.f95558i) {
                    M(this.f95553d << 1);
                    return;
                }
                return;
            }
            i18++;
            if (i18 == i14) {
                G(k17, f11);
                return;
            }
            i17 = iV;
            i15 = i19;
            k14 = k18;
            i16 = iU;
            k15 = k19;
        }
    }

    private void F(K k10, float f10) {
        int iHashCode = k10.hashCode();
        int i10 = iHashCode & this.f95557h;
        K[] kArr = this.f95551b;
        K k11 = kArr[i10];
        if (k11 == null) {
            kArr[i10] = k10;
            this.f95552c[i10] = f10;
            int i11 = this.f95550a;
            this.f95550a = i11 + 1;
            if (i11 >= this.f95558i) {
                M(this.f95553d << 1);
            }
        } else {
            int iU = u(iHashCode);
            K[] kArr2 = this.f95551b;
            K k12 = kArr2[iU];
            if (k12 == null) {
                kArr2[iU] = k10;
                this.f95552c[iU] = f10;
                int i12 = this.f95550a;
                this.f95550a = i12 + 1;
                if (i12 >= this.f95558i) {
                    M(this.f95553d << 1);
                }
            } else {
                int iV = v(iHashCode);
                K[] kArr3 = this.f95551b;
                K k13 = kArr3[iV];
                if (k13 != null) {
                    B(k10, f10, i10, k11, iU, k12, iV, k13);
                    return;
                }
                kArr3[iV] = k10;
                this.f95552c[iV] = f10;
                int i13 = this.f95550a;
                this.f95550a = i13 + 1;
                if (i13 >= this.f95558i) {
                    M(this.f95553d << 1);
                }
            }
        }
    }

    private void G(K k10, float f10) {
        int i10 = this.f95554e;
        if (i10 == this.f95559j) {
            M(this.f95553d << 1);
            C(k10, f10);
            return;
        }
        int i11 = this.f95553d + i10;
        this.f95551b[i11] = k10;
        this.f95552c[i11] = f10;
        this.f95554e = i10 + 1;
        this.f95550a++;
    }

    private void M(int i10) {
        int i11 = this.f95553d + this.f95554e;
        this.f95553d = i10;
        this.f95558i = (int) (i10 * this.f95555f);
        this.f95557h = i10 - 1;
        this.f95556g = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95559j = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95560k = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        K[] kArr = this.f95551b;
        float[] fArr = this.f95552c;
        int i12 = this.f95559j;
        this.f95551b = (K[]) new Object[i10 + i12];
        this.f95552c = new float[i10 + i12];
        int i13 = this.f95550a;
        this.f95550a = 0;
        this.f95554e = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                K k10 = kArr[i14];
                if (k10 != null) {
                    F(k10, fArr[i14]);
                }
            }
        }
    }

    private boolean i(K k10) {
        K[] kArr = this.f95551b;
        int i10 = this.f95553d;
        int i11 = this.f95554e + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private float s(K k10, float f10, float f11) {
        K[] kArr = this.f95551b;
        int i10 = this.f95553d;
        int i11 = this.f95554e + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                float[] fArr = this.f95552c;
                float f12 = fArr[i10];
                fArr[i10] = f11 + f12;
                return f12;
            }
            i10++;
        }
        C(k10, f11 + f10);
        return f10;
    }

    private float t(K k10, float f10) {
        K[] kArr = this.f95551b;
        int i10 = this.f95553d;
        int i11 = this.f95554e + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                return this.f95552c[i10];
            }
            i10++;
        }
        return f10;
    }

    private int u(int i10) {
        int i11 = i10 * f95549w;
        return this.f95557h & (i11 ^ (i11 >>> this.f95556g));
    }

    private int v(int i10) {
        int i11 = i10 * X;
        return this.f95557h & (i11 ^ (i11 >>> this.f95556g));
    }

    public c<K> A() {
        if (this.f95565s == null) {
            this.f95565s = new c(this);
            this.f95566t = new c(this);
        }
        c cVar = this.f95565s;
        if (cVar.f95574e) {
            this.f95566t.reset();
            c<K> cVar2 = this.f95566t;
            cVar2.f95574e = true;
            this.f95565s.f95574e = false;
            return cVar2;
        }
        cVar.reset();
        c<K> cVar3 = this.f95565s;
        cVar3.f95574e = true;
        this.f95566t.f95574e = false;
        return cVar3;
    }

    public void C(K k10, float f10) {
        if (k10 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] objArr = this.f95551b;
        int iHashCode = k10.hashCode();
        int i10 = iHashCode & this.f95557h;
        K k11 = objArr[i10];
        if (k10.equals(k11)) {
            this.f95552c[i10] = f10;
            return;
        }
        int iU = u(iHashCode);
        K k12 = objArr[iU];
        if (k10.equals(k12)) {
            this.f95552c[iU] = f10;
            return;
        }
        int iV = v(iHashCode);
        K k13 = objArr[iV];
        if (k10.equals(k13)) {
            this.f95552c[iV] = f10;
            return;
        }
        int i11 = this.f95553d;
        int i12 = this.f95554e + i11;
        while (i11 < i12) {
            if (k10.equals(objArr[i11])) {
                this.f95552c[i11] = f10;
                return;
            }
            i11++;
        }
        if (k11 == null) {
            objArr[i10] = k10;
            this.f95552c[i10] = f10;
            int i13 = this.f95550a;
            this.f95550a = i13 + 1;
            if (i13 >= this.f95558i) {
                M(this.f95553d << 1);
            }
        } else if (k12 == null) {
            objArr[iU] = k10;
            this.f95552c[iU] = f10;
            int i14 = this.f95550a;
            this.f95550a = i14 + 1;
            if (i14 >= this.f95558i) {
                M(this.f95553d << 1);
            }
        } else {
            if (k13 != null) {
                B(k10, f10, i10, k11, iU, k12, iV, k13);
                return;
            }
            objArr[iV] = k10;
            this.f95552c[iV] = f10;
            int i15 = this.f95550a;
            this.f95550a = i15 + 1;
            if (i15 >= this.f95558i) {
                M(this.f95553d << 1);
            }
        }
    }

    public void D(i0<K> i0Var) {
        a<K> it = i0Var.m().iterator();
        while (it.hasNext()) {
            b<K> next = it.next();
            C(next.f95568a, next.f95569b);
        }
    }

    public float J(K k10, float f10) {
        int iHashCode = k10.hashCode();
        int i10 = this.f95557h & iHashCode;
        if (k10.equals(this.f95551b[i10])) {
            this.f95551b[i10] = null;
            float f11 = this.f95552c[i10];
            this.f95550a--;
            return f11;
        }
        int iU = u(iHashCode);
        if (k10.equals(this.f95551b[iU])) {
            this.f95551b[iU] = null;
            float f12 = this.f95552c[iU];
            this.f95550a--;
            return f12;
        }
        int iV = v(iHashCode);
        if (!k10.equals(this.f95551b[iV])) {
            return K(k10, f10);
        }
        this.f95551b[iV] = null;
        float f13 = this.f95552c[iV];
        this.f95550a--;
        return f13;
    }

    float K(K k10, float f10) {
        K[] kArr = this.f95551b;
        int i10 = this.f95553d;
        int i11 = this.f95554e + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                float f11 = this.f95552c[i10];
                L(i10);
                this.f95550a--;
                return f11;
            }
            i10++;
        }
        return f10;
    }

    void L(int i10) {
        int i11 = this.f95554e - 1;
        this.f95554e = i11;
        int i12 = this.f95553d + i11;
        if (i10 < i12) {
            K[] kArr = this.f95551b;
            kArr[i10] = kArr[i12];
            float[] fArr = this.f95552c;
            fArr[i10] = fArr[i12];
        }
    }

    public void N(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95550a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95553d <= i10) {
            return;
        }
        M(com.badlogic.gdx.math.s.u(i10));
    }

    public e O() {
        if (this.f95563n == null) {
            this.f95563n = new e(this);
            this.f95564o = new e(this);
        }
        e eVar = this.f95563n;
        if (eVar.f95574e) {
            this.f95564o.reset();
            e eVar2 = this.f95564o;
            eVar2.f95574e = true;
            this.f95563n.f95574e = false;
            return eVar2;
        }
        eVar.reset();
        e eVar3 = this.f95563n;
        eVar3.f95574e = true;
        this.f95564o.f95574e = false;
        return eVar3;
    }

    public void c(int i10) {
        if (this.f95553d <= i10) {
            clear();
        } else {
            this.f95550a = 0;
            M(i10);
        }
    }

    public void clear() {
        if (this.f95550a == 0) {
            return;
        }
        K[] kArr = this.f95551b;
        int i10 = this.f95553d + this.f95554e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95550a = 0;
                this.f95554e = 0;
                return;
            } else {
                kArr[i11] = null;
                i10 = i11;
            }
        }
    }

    public boolean d(K k10) {
        int iHashCode = k10.hashCode();
        if (!k10.equals(this.f95551b[this.f95557h & iHashCode])) {
            if (!k10.equals(this.f95551b[u(iHashCode)])) {
                if (!k10.equals(this.f95551b[v(iHashCode)])) {
                    return i(k10);
                }
            }
        }
        return true;
    }

    public boolean k(float f10) {
        float[] fArr = this.f95552c;
        int i10 = this.f95553d + this.f95554e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return false;
            }
            if (fArr[i11] == f10) {
                return true;
            }
            i10 = i11;
        }
    }

    public void l(int i10) {
        int i11 = this.f95550a + i10;
        if (i11 >= this.f95558i) {
            M(com.badlogic.gdx.math.s.u((int) (i11 / this.f95555f)));
        }
    }

    public a<K> m() {
        if (this.f95561l == null) {
            this.f95561l = new a(this);
            this.f95562m = new a(this);
        }
        a aVar = this.f95561l;
        if (aVar.f95574e) {
            this.f95562m.reset();
            a<K> aVar2 = this.f95562m;
            aVar2.f95574e = true;
            this.f95561l.f95574e = false;
            return aVar2;
        }
        aVar.reset();
        a<K> aVar3 = this.f95561l;
        aVar3.f95574e = true;
        this.f95562m.f95574e = false;
        return aVar3;
    }

    public K n(float f10) {
        float[] fArr = this.f95552c;
        int i10 = this.f95553d + this.f95554e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return null;
            }
            if (fArr[i11] == f10) {
                return this.f95551b[i11];
            }
            i10 = i11;
        }
    }

    public float p(K k10, float f10) {
        int iHashCode = k10.hashCode();
        int iU = this.f95557h & iHashCode;
        if (!k10.equals(this.f95551b[iU])) {
            iU = u(iHashCode);
            if (!k10.equals(this.f95551b[iU])) {
                iU = v(iHashCode);
                if (!k10.equals(this.f95551b[iU])) {
                    return t(k10, f10);
                }
            }
        }
        return this.f95552c[iU];
    }

    public float r(K k10, float f10, float f11) {
        int iHashCode = k10.hashCode();
        int iU = this.f95557h & iHashCode;
        if (!k10.equals(this.f95551b[iU])) {
            iU = u(iHashCode);
            if (!k10.equals(this.f95551b[iU])) {
                iU = v(iHashCode);
                if (!k10.equals(this.f95551b[iU])) {
                    return s(k10, f10, f11);
                }
            }
        }
        float[] fArr = this.f95552c;
        float f12 = fArr[iU];
        fArr[iU] = f11 + f12;
        return f12;
    }

    public String toString() {
        int i10;
        if (this.f95550a == 0) {
            return "{}";
        }
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_OBJ);
        K[] kArr = this.f95551b;
        float[] fArr = this.f95552c;
        int length = kArr.length;
        while (true) {
            i10 = length - 1;
            if (length > 0) {
                K k10 = kArr[i10];
                if (k10 != null) {
                    f1Var.n(k10);
                    f1Var.append('=');
                    f1Var.c(fArr[i10]);
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
                f1Var.c(fArr[i11]);
            }
            i10 = i11;
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a<K> iterator() {
        return m();
    }

    public i0(int i10) {
        this(i10, 0.8f);
    }

    public i0(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + i10);
        }
        int iU = com.badlogic.gdx.math.s.u(i10);
        this.f95553d = iU;
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
        }
        this.f95555f = f10;
        this.f95558i = (int) (iU * f10);
        this.f95557h = iU - 1;
        this.f95556g = 31 - Integer.numberOfTrailingZeros(iU);
        this.f95559j = Math.max(3, ((int) Math.ceil(Math.log(this.f95553d))) * 2);
        this.f95560k = Math.max(Math.min(this.f95553d, 8), ((int) Math.sqrt(this.f95553d)) / 8);
        K[] kArr = (K[]) new Object[this.f95553d + this.f95559j];
        this.f95551b = kArr;
        this.f95552c = new float[kArr.length];
    }

    public i0(i0<? extends K> i0Var) {
        this(i0Var.f95553d, i0Var.f95555f);
        this.f95554e = i0Var.f95554e;
        Object[] objArr = i0Var.f95551b;
        System.arraycopy(objArr, 0, this.f95551b, 0, objArr.length);
        float[] fArr = i0Var.f95552c;
        System.arraycopy(fArr, 0, this.f95552c, 0, fArr.length);
        this.f95550a = i0Var.f95550a;
    }
}
