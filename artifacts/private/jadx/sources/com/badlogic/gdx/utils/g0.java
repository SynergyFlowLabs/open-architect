package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class g0<V> implements Iterable<b<V>> {
    private static final int X = -1105259343;
    private static final int Y = -1262997959;
    private static final int Z = -825114047;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f95500p0 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long[] f95502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    V[] f95503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    V f95506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f95507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f95508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f95512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f95513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f95514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f95515o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f95516s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e f95517t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f95518v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c f95519w;

    public static class a<V> extends d<V> implements Iterable<b<V>>, Iterator<b<V>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b<V> f95520h;

        public a(g0 g0Var) {
            super(g0Var);
            this.f95520h = new b<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95529e) {
                return this.f95525a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b<V> next() {
            if (!this.f95525a) {
                throw new NoSuchElementException();
            }
            if (!this.f95529e) {
                throw new t("#iterator() cannot be used nested.");
            }
            g0<V> g0Var = this.f95526b;
            long[] jArr = g0Var.f95502b;
            int i10 = this.f95527c;
            if (i10 == -1) {
                b<V> bVar = this.f95520h;
                bVar.f95521a = 0L;
                bVar.f95522b = g0Var.f95506f;
            } else {
                b<V> bVar2 = this.f95520h;
                bVar2.f95521a = jArr[i10];
                bVar2.f95522b = g0Var.f95503c[i10];
            }
            this.f95528d = i10;
            c();
            return this.f95520h;
        }

        @Override // java.lang.Iterable
        public Iterator<b<V>> iterator() {
            return this;
        }

        @Override // com.badlogic.gdx.utils.g0.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.g0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f95521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f95522b;

        public String toString() {
            return this.f95521a + "=" + this.f95522b;
        }
    }

    public static class c extends d {
        public c(g0 g0Var) {
            super(g0Var);
        }

        public long i() {
            if (!this.f95525a) {
                throw new NoSuchElementException();
            }
            if (!this.f95529e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int i10 = this.f95527c;
            long j10 = i10 == -1 ? 0L : this.f95526b.f95502b[i10];
            this.f95528d = i10;
            c();
            return j10;
        }

        public f0 k() {
            f0 f0Var = new f0(true, this.f95526b.f95501a);
            while (this.f95525a) {
                f0Var.a(i());
            }
            return f0Var;
        }

        @Override // com.badlogic.gdx.utils.g0.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.g0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    private static class d<V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f95523f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f95524g = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<V> f95526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95529e = true;

        public d(g0<V> g0Var) {
            this.f95526b = g0Var;
            reset();
        }

        void c() {
            int i10;
            this.f95525a = false;
            g0<V> g0Var = this.f95526b;
            long[] jArr = g0Var.f95502b;
            int i11 = g0Var.f95504d + g0Var.f95505e;
            do {
                i10 = this.f95527c + 1;
                this.f95527c = i10;
                if (i10 < i11) {
                }
            } while (jArr[i10] == 0);
            this.f95525a = true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        /* JADX WARN: Code duplicated, block: B:11:0x002e  */
        /* JADX WARN: Code duplicated, block: B:14:0x0049  */
        /* JADX WARN: Code duplicated, block: B:7:0x0015 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:8:0x0017  */
        public void remove() {
            g0<V> g0Var;
            int i10 = this.f95528d;
            if (i10 == -1) {
                g0<V> g0Var2 = this.f95526b;
                if (g0Var2.f95507g) {
                    g0Var2.f95506f = null;
                    g0Var2.f95507g = false;
                } else {
                    if (i10 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    g0Var = this.f95526b;
                    if (i10 >= g0Var.f95504d) {
                        g0Var.J(i10);
                        this.f95527c = this.f95528d - 1;
                        c();
                    } else {
                        g0Var.f95502b[i10] = 0;
                        g0Var.f95503c[i10] = null;
                    }
                }
            } else {
                if (i10 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                g0Var = this.f95526b;
                if (i10 >= g0Var.f95504d) {
                    g0Var.J(i10);
                    this.f95527c = this.f95528d - 1;
                    c();
                } else {
                    g0Var.f95502b[i10] = 0;
                    g0Var.f95503c[i10] = null;
                }
            }
            this.f95528d = -2;
            this.f95526b.f95501a--;
        }

        public void reset() {
            this.f95528d = -2;
            this.f95527c = -1;
            if (this.f95526b.f95507g) {
                this.f95525a = true;
            } else {
                c();
            }
        }
    }

    public static class e<V> extends d<V> implements Iterable<V>, Iterator<V> {
        public e(g0<V> g0Var) {
            super(g0Var);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95529e) {
                return this.f95525a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public com.badlogic.gdx.utils.b<V> i() {
            com.badlogic.gdx.utils.b<V> bVar = new com.badlogic.gdx.utils.b<>(true, this.f95526b.f95501a);
            while (this.f95525a) {
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
            if (!this.f95525a) {
                throw new NoSuchElementException();
            }
            if (!this.f95529e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int i10 = this.f95527c;
            V v10 = i10 == -1 ? this.f95526b.f95506f : this.f95526b.f95503c[i10];
            this.f95528d = i10;
            c();
            return v10;
        }

        @Override // com.badlogic.gdx.utils.g0.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.g0.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public g0() {
        this(32, 0.8f);
    }

    private void C(long j10, V v10) {
        if (j10 == 0) {
            this.f95506f = v10;
            this.f95507g = true;
            return;
        }
        int i10 = (int) (((long) this.f95510j) & j10);
        long[] jArr = this.f95502b;
        long j11 = jArr[i10];
        if (j11 == 0) {
            jArr[i10] = j10;
            this.f95503c[i10] = v10;
            int i11 = this.f95501a;
            this.f95501a = i11 + 1;
            if (i11 >= this.f95511k) {
                K(this.f95504d << 1);
                return;
            }
            return;
        }
        int iT = t(j10);
        long[] jArr2 = this.f95502b;
        long j12 = jArr2[iT];
        if (j12 == 0) {
            jArr2[iT] = j10;
            this.f95503c[iT] = v10;
            int i12 = this.f95501a;
            this.f95501a = i12 + 1;
            if (i12 >= this.f95511k) {
                K(this.f95504d << 1);
                return;
            }
            return;
        }
        int iU = u(j10);
        long[] jArr3 = this.f95502b;
        long j13 = jArr3[iU];
        if (j13 != 0) {
            w(j10, v10, i10, j11, iT, j12, iU, j13);
            return;
        }
        jArr3[iU] = j10;
        this.f95503c[iU] = v10;
        int i13 = this.f95501a;
        this.f95501a = i13 + 1;
        if (i13 >= this.f95511k) {
            K(this.f95504d << 1);
        }
    }

    private void D(long j10, V v10) {
        int i10 = this.f95505e;
        if (i10 == this.f95512l) {
            K(this.f95504d << 1);
            A(j10, v10);
            return;
        }
        int i11 = this.f95504d + i10;
        this.f95502b[i11] = j10;
        this.f95503c[i11] = v10;
        this.f95505e = i10 + 1;
        this.f95501a++;
    }

    private void K(int i10) {
        int i11 = this.f95504d + this.f95505e;
        this.f95504d = i10;
        this.f95511k = (int) (i10 * this.f95508h);
        this.f95510j = i10 - 1;
        this.f95509i = 63 - Long.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95512l = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95513m = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        long[] jArr = this.f95502b;
        V[] vArr = this.f95503c;
        int i12 = this.f95512l;
        this.f95502b = new long[i10 + i12];
        this.f95503c = (V[]) new Object[i10 + i12];
        int i13 = this.f95501a;
        this.f95501a = this.f95507g ? 1 : 0;
        this.f95505e = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                long j10 = jArr[i14];
                if (j10 != 0) {
                    C(j10, vArr[i14]);
                }
            }
        }
    }

    private boolean i(long j10) {
        long[] jArr = this.f95502b;
        int i10 = this.f95504d;
        int i11 = this.f95505e + i10;
        while (i10 < i11) {
            if (jArr[i10] == j10) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private V s(long j10, V v10) {
        long[] jArr = this.f95502b;
        int i10 = this.f95504d;
        int i11 = this.f95505e + i10;
        while (i10 < i11) {
            if (jArr[i10] == j10) {
                return this.f95503c[i10];
            }
            i10++;
        }
        return v10;
    }

    private int t(long j10) {
        long j11 = j10 * (-1262997959);
        return (int) ((j11 ^ (j11 >>> this.f95509i)) & ((long) this.f95510j));
    }

    private int u(long j10) {
        long j11 = j10 * (-825114047);
        return (int) ((j11 ^ (j11 >>> this.f95509i)) & ((long) this.f95510j));
    }

    private void w(long j10, V v10, int i10, long j11, int i11, long j12, int i12, long j13) {
        long[] jArr = this.f95502b;
        V[] vArr = this.f95503c;
        int i13 = this.f95510j;
        int i14 = this.f95513m;
        V v11 = v10;
        int i15 = i10;
        long j14 = j11;
        int i16 = i11;
        long j15 = j12;
        int i17 = i12;
        long j16 = j13;
        int i18 = 0;
        long j17 = j10;
        while (true) {
            long[] jArr2 = jArr;
            int iY = com.badlogic.gdx.math.s.y(2);
            V[] vArr2 = vArr;
            if (iY == 0) {
                V v12 = vArr2[i15];
                jArr2[i15] = j17;
                vArr2[i15] = v11;
                v11 = v12;
                j17 = j14;
            } else if (iY != 1) {
                V v13 = vArr2[i17];
                jArr2[i17] = j17;
                vArr2[i17] = v11;
                v11 = v13;
                j17 = j16;
            } else {
                V v14 = vArr2[i16];
                jArr2[i16] = j17;
                vArr2[i16] = v11;
                v11 = v14;
                j17 = j15;
            }
            i15 = (int) (((long) i13) & j17);
            j14 = jArr2[i15];
            if (j14 == 0) {
                jArr2[i15] = j17;
                vArr2[i15] = v11;
                int i19 = this.f95501a;
                this.f95501a = i19 + 1;
                if (i19 >= this.f95511k) {
                    K(this.f95504d << 1);
                    return;
                }
                return;
            }
            int iT = t(j17);
            long j18 = jArr2[iT];
            if (j18 == 0) {
                jArr2[iT] = j17;
                vArr2[iT] = v11;
                int i20 = this.f95501a;
                this.f95501a = i20 + 1;
                if (i20 >= this.f95511k) {
                    K(this.f95504d << 1);
                    return;
                }
                return;
            }
            int iU = u(j17);
            long j19 = jArr2[iU];
            if (j19 == 0) {
                jArr2[iU] = j17;
                vArr2[iU] = v11;
                int i21 = this.f95501a;
                this.f95501a = i21 + 1;
                if (i21 >= this.f95511k) {
                    K(this.f95504d << 1);
                    return;
                }
                return;
            }
            int i22 = i18 + 1;
            if (i22 == i14) {
                D(j17, v11);
                return;
            }
            i16 = iT;
            i18 = i22;
            j15 = j18;
            i17 = iU;
            vArr = vArr2;
            jArr = jArr2;
            j16 = j19;
        }
    }

    public V A(long j10, V v10) {
        if (j10 == 0) {
            V v11 = this.f95506f;
            this.f95506f = v10;
            if (!this.f95507g) {
                this.f95507g = true;
                this.f95501a++;
            }
            return v11;
        }
        long[] jArr = this.f95502b;
        int i10 = (int) (j10 & ((long) this.f95510j));
        long j11 = jArr[i10];
        if (j11 == j10) {
            V[] vArr = this.f95503c;
            V v12 = vArr[i10];
            vArr[i10] = v10;
            return v12;
        }
        int iT = t(j10);
        long j12 = jArr[iT];
        if (j12 == j10) {
            V[] vArr2 = this.f95503c;
            V v13 = vArr2[iT];
            vArr2[iT] = v10;
            return v13;
        }
        int iU = u(j10);
        long j13 = jArr[iU];
        if (j13 == j10) {
            V[] vArr3 = this.f95503c;
            V v14 = vArr3[iU];
            vArr3[iU] = v10;
            return v14;
        }
        int i11 = this.f95504d;
        int i12 = this.f95505e + i11;
        while (i11 < i12) {
            if (jArr[i11] == j10) {
                V[] vArr4 = this.f95503c;
                V v15 = vArr4[i11];
                vArr4[i11] = v10;
                return v15;
            }
            i11++;
        }
        if (j11 == 0) {
            jArr[i10] = j10;
            this.f95503c[i10] = v10;
            int i13 = this.f95501a;
            this.f95501a = i13 + 1;
            if (i13 >= this.f95511k) {
                K(this.f95504d << 1);
            }
            return null;
        }
        if (j12 == 0) {
            jArr[iT] = j10;
            this.f95503c[iT] = v10;
            int i14 = this.f95501a;
            this.f95501a = i14 + 1;
            if (i14 >= this.f95511k) {
                K(this.f95504d << 1);
            }
            return null;
        }
        if (j13 != 0) {
            w(j10, v10, i10, j11, iT, j12, iU, j13);
            return null;
        }
        jArr[iU] = j10;
        this.f95503c[iU] = v10;
        int i15 = this.f95501a;
        this.f95501a = i15 + 1;
        if (i15 >= this.f95511k) {
            K(this.f95504d << 1);
        }
        return null;
    }

    public void B(g0<V> g0Var) {
        for (b<V> bVar : g0Var.m()) {
            A(bVar.f95521a, bVar.f95522b);
        }
    }

    public V F(long j10) {
        if (j10 == 0) {
            if (!this.f95507g) {
                return null;
            }
            V v10 = this.f95506f;
            this.f95506f = null;
            this.f95507g = false;
            this.f95501a--;
            return v10;
        }
        int i10 = (int) (((long) this.f95510j) & j10);
        long[] jArr = this.f95502b;
        if (jArr[i10] == j10) {
            jArr[i10] = 0;
            V[] vArr = this.f95503c;
            V v11 = vArr[i10];
            vArr[i10] = null;
            this.f95501a--;
            return v11;
        }
        int iT = t(j10);
        long[] jArr2 = this.f95502b;
        if (jArr2[iT] == j10) {
            jArr2[iT] = 0;
            V[] vArr2 = this.f95503c;
            V v12 = vArr2[iT];
            vArr2[iT] = null;
            this.f95501a--;
            return v12;
        }
        int iU = u(j10);
        long[] jArr3 = this.f95502b;
        if (jArr3[iU] != j10) {
            return G(j10);
        }
        jArr3[iU] = 0;
        V[] vArr3 = this.f95503c;
        V v13 = vArr3[iU];
        vArr3[iU] = null;
        this.f95501a--;
        return v13;
    }

    V G(long j10) {
        long[] jArr = this.f95502b;
        int i10 = this.f95504d;
        int i11 = this.f95505e + i10;
        while (i10 < i11) {
            if (jArr[i10] == j10) {
                V v10 = this.f95503c[i10];
                J(i10);
                this.f95501a--;
                return v10;
            }
            i10++;
        }
        return null;
    }

    void J(int i10) {
        int i11 = this.f95505e - 1;
        this.f95505e = i11;
        int i12 = this.f95504d + i11;
        if (i10 >= i12) {
            this.f95503c[i10] = null;
            return;
        }
        long[] jArr = this.f95502b;
        jArr[i10] = jArr[i12];
        V[] vArr = this.f95503c;
        vArr[i10] = vArr[i12];
        vArr[i12] = null;
    }

    public void L(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95501a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95504d <= i10) {
            return;
        }
        K(com.badlogic.gdx.math.s.u(i10));
    }

    public e<V> M() {
        if (this.f95516s == null) {
            this.f95516s = new e(this);
            this.f95517t = new e(this);
        }
        e eVar = this.f95516s;
        if (eVar.f95529e) {
            this.f95517t.reset();
            e<V> eVar2 = this.f95517t;
            eVar2.f95529e = true;
            this.f95516s.f95529e = false;
            return eVar2;
        }
        eVar.reset();
        e<V> eVar3 = this.f95516s;
        eVar3.f95529e = true;
        this.f95517t.f95529e = false;
        return eVar3;
    }

    public void c(int i10) {
        if (this.f95504d <= i10) {
            clear();
            return;
        }
        this.f95506f = null;
        this.f95507g = false;
        this.f95501a = 0;
        K(i10);
    }

    public void clear() {
        if (this.f95501a == 0) {
            return;
        }
        long[] jArr = this.f95502b;
        V[] vArr = this.f95503c;
        int i10 = this.f95504d + this.f95505e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95501a = 0;
                this.f95505e = 0;
                this.f95506f = null;
                this.f95507g = false;
                return;
            }
            jArr[i11] = 0;
            vArr[i11] = null;
            i10 = i11;
        }
    }

    public boolean d(long j10) {
        if (j10 == 0) {
            return this.f95507g;
        }
        if (this.f95502b[(int) (((long) this.f95510j) & j10)] == j10) {
            return true;
        }
        if (this.f95502b[t(j10)] == j10) {
            return true;
        }
        if (this.f95502b[u(j10)] != j10) {
            return i(j10);
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<b<V>> iterator() {
        return m();
    }

    public boolean k(Object obj, boolean z10) {
        V[] vArr = this.f95503c;
        if (obj == null) {
            if (!this.f95507g || this.f95506f != null) {
                long[] jArr = this.f95502b;
                int i10 = this.f95504d + this.f95505e;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    if (jArr[i11] != 0 && vArr[i11] == null) {
                        return true;
                    }
                    i10 = i11;
                }
            } else {
                return true;
            }
        } else if (z10) {
            if (obj != this.f95506f) {
                int i12 = this.f95504d + this.f95505e;
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
        } else if (!this.f95507g || !obj.equals(this.f95506f)) {
            int i14 = this.f95504d + this.f95505e;
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
        int i11 = this.f95501a + i10;
        if (i11 >= this.f95511k) {
            K(com.badlogic.gdx.math.s.u((int) (i11 / this.f95508h)));
        }
    }

    public a<V> m() {
        if (this.f95514n == null) {
            this.f95514n = new a(this);
            this.f95515o = new a(this);
        }
        a aVar = this.f95514n;
        if (aVar.f95529e) {
            this.f95515o.reset();
            a<V> aVar2 = this.f95515o;
            aVar2.f95529e = true;
            this.f95514n.f95529e = false;
            return aVar2;
        }
        aVar.reset();
        a<V> aVar3 = this.f95514n;
        aVar3.f95529e = true;
        this.f95515o.f95529e = false;
        return aVar3;
    }

    public long n(Object obj, boolean z10, long j10) {
        V[] vArr = this.f95503c;
        if (obj == null) {
            if (!this.f95507g || this.f95506f != null) {
                long[] jArr = this.f95502b;
                int i10 = this.f95504d + this.f95505e;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    long j11 = jArr[i11];
                    if (j11 != 0 && vArr[i11] == null) {
                        return j11;
                    }
                    i10 = i11;
                }
            } else {
                return 0L;
            }
        } else if (z10) {
            if (obj != this.f95506f) {
                int i12 = this.f95504d + this.f95505e;
                while (true) {
                    int i13 = i12 - 1;
                    if (i12 <= 0) {
                        break;
                    }
                    if (vArr[i13] == obj) {
                        return this.f95502b[i13];
                    }
                    i12 = i13;
                }
            } else {
                return 0L;
            }
        } else if (!this.f95507g || !obj.equals(this.f95506f)) {
            int i14 = this.f95504d + this.f95505e;
            while (true) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    break;
                }
                if (obj.equals(vArr[i15])) {
                    return this.f95502b[i15];
                }
                i14 = i15;
            }
        } else {
            return 0L;
        }
        return j10;
    }

    public V p(long j10) {
        if (j10 == 0) {
            if (this.f95507g) {
                return this.f95506f;
            }
            return null;
        }
        int iT = (int) (((long) this.f95510j) & j10);
        if (this.f95502b[iT] != j10) {
            iT = t(j10);
            if (this.f95502b[iT] != j10) {
                iT = u(j10);
                if (this.f95502b[iT] != j10) {
                    return s(j10, null);
                }
            }
        }
        return this.f95503c[iT];
    }

    public V r(long j10, V v10) {
        if (j10 == 0) {
            return !this.f95507g ? v10 : this.f95506f;
        }
        int iT = (int) (((long) this.f95510j) & j10);
        if (this.f95502b[iT] != j10) {
            iT = t(j10);
            if (this.f95502b[iT] != j10) {
                iT = u(j10);
                if (this.f95502b[iT] != j10) {
                    return s(j10, v10);
                }
            }
        }
        return this.f95503c[iT];
    }

    public String toString() {
        int i10;
        if (this.f95501a == 0) {
            return okhttp3.v.f334777p;
        }
        f1 f1Var = new f1(32);
        f1Var.append(AbstractJsonLexerKt.BEGIN_LIST);
        long[] jArr = this.f95502b;
        V[] vArr = this.f95503c;
        int length = jArr.length;
        while (true) {
            i10 = length - 1;
            if (length <= 0) {
                break;
            }
            long j10 = jArr[i10];
            if (j10 != 0) {
                f1Var.g(j10);
                f1Var.append('=');
                f1Var.n(vArr[i10]);
                break;
            }
            length = i10;
        }
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                f1Var.append(AbstractJsonLexerKt.END_LIST);
                return f1Var.toString();
            }
            long j11 = jArr[i11];
            if (j11 != 0) {
                f1Var.o(", ");
                f1Var.g(j11);
                f1Var.append('=');
                f1Var.n(vArr[i11]);
            }
            i10 = i11;
        }
    }

    public c v() {
        if (this.f95518v == null) {
            this.f95518v = new c(this);
            this.f95519w = new c(this);
        }
        c cVar = this.f95518v;
        if (cVar.f95529e) {
            this.f95519w.reset();
            c cVar2 = this.f95519w;
            cVar2.f95529e = true;
            this.f95518v.f95529e = false;
            return cVar2;
        }
        cVar.reset();
        c cVar3 = this.f95518v;
        cVar3.f95529e = true;
        this.f95519w.f95529e = false;
        return cVar3;
    }

    public g0(int i10) {
        this(i10, 0.8f);
    }

    public g0(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 <= 1073741824) {
            int iU = com.badlogic.gdx.math.s.u(i10);
            this.f95504d = iU;
            if (f10 <= 0.0f) {
                throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
            }
            this.f95508h = f10;
            this.f95511k = (int) (iU * f10);
            this.f95510j = iU - 1;
            this.f95509i = 63 - Long.numberOfTrailingZeros(iU);
            this.f95512l = Math.max(3, ((int) Math.ceil(Math.log(this.f95504d))) * 2);
            this.f95513m = Math.max(Math.min(this.f95504d, 8), ((int) Math.sqrt(this.f95504d)) / 8);
            long[] jArr = new long[this.f95504d + this.f95512l];
            this.f95502b = jArr;
            this.f95503c = (V[]) new Object[jArr.length];
            return;
        }
        throw new IllegalArgumentException("initialCapacity is too large: " + i10);
    }

    public g0(g0<? extends V> g0Var) {
        this(g0Var.f95504d, g0Var.f95508h);
        this.f95505e = g0Var.f95505e;
        long[] jArr = g0Var.f95502b;
        System.arraycopy(jArr, 0, this.f95502b, 0, jArr.length);
        Object[] objArr = g0Var.f95503c;
        System.arraycopy(objArr, 0, this.f95503c, 0, objArr.length);
        this.f95501a = g0Var.f95501a;
        this.f95506f = g0Var.f95506f;
        this.f95507g = g0Var.f95507g;
    }
}
