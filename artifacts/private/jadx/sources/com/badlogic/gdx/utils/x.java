package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class x implements Iterable<b> {
    private static final int X = -1105259343;
    private static final int Y = -1262997959;
    private static final int Z = -825114047;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f95828p0 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f95830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f95831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f95834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f95835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f95836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f95840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f95841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f95842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f95843o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f95844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e f95845t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f95846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c f95847w;

    public static class a extends d implements Iterable<b>, Iterator<b> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b f95848h;

        public a(x xVar) {
            super(xVar);
            this.f95848h = new b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95857e) {
                return this.f95853a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b next() {
            if (!this.f95853a) {
                throw new NoSuchElementException();
            }
            if (!this.f95857e) {
                throw new t("#iterator() cannot be used nested.");
            }
            x xVar = this.f95854b;
            int[] iArr = xVar.f95830b;
            int i10 = this.f95855c;
            if (i10 == -1) {
                b bVar = this.f95848h;
                bVar.f95849a = 0;
                bVar.f95850b = xVar.f95834f;
            } else {
                b bVar2 = this.f95848h;
                bVar2.f95849a = iArr[i10];
                bVar2.f95850b = xVar.f95831c[i10];
            }
            this.f95856d = i10;
            c();
            return this.f95848h;
        }

        @Override // java.lang.Iterable
        public Iterator<b> iterator() {
            return this;
        }

        @Override // com.badlogic.gdx.utils.x.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.x.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f95850b;

        public String toString() {
            return this.f95849a + "=" + this.f95850b;
        }
    }

    public static class c extends d {
        public c(x xVar) {
            super(xVar);
        }

        public boolean hasNext() {
            if (this.f95857e) {
                return this.f95853a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public int i() {
            if (!this.f95853a) {
                throw new NoSuchElementException();
            }
            if (!this.f95857e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int i10 = this.f95855c;
            int i11 = i10 == -1 ? 0 : this.f95854b.f95830b[i10];
            this.f95856d = i10;
            c();
            return i11;
        }

        public v k() {
            v vVar = new v(true, this.f95854b.f95829a);
            while (this.f95853a) {
                vVar.a(i());
            }
            return vVar;
        }

        @Override // com.badlogic.gdx.utils.x.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.x.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f95851f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f95852g = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x f95854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95856d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95857e = true;

        public d(x xVar) {
            this.f95854b = xVar;
            reset();
        }

        void c() {
            int i10;
            this.f95853a = false;
            x xVar = this.f95854b;
            int[] iArr = xVar.f95830b;
            int i11 = xVar.f95832d + xVar.f95833e;
            do {
                i10 = this.f95855c + 1;
                this.f95855c = i10;
                if (i10 >= i11) {
                    return;
                }
            } while (iArr[i10] == 0);
            this.f95853a = true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        /* JADX WARN: Code duplicated, block: B:11:0x002d  */
        /* JADX WARN: Code duplicated, block: B:14:0x0040  */
        /* JADX WARN: Code duplicated, block: B:7:0x0014 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:8:0x0016  */
        public void remove() {
            x xVar;
            int i10 = this.f95856d;
            if (i10 == -1) {
                x xVar2 = this.f95854b;
                if (xVar2.f95835g) {
                    xVar2.f95835g = false;
                } else {
                    if (i10 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    xVar = this.f95854b;
                    if (i10 >= xVar.f95832d) {
                        xVar.K(i10);
                        this.f95855c = this.f95856d - 1;
                        c();
                    } else {
                        xVar.f95830b[i10] = 0;
                    }
                }
            } else {
                if (i10 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                xVar = this.f95854b;
                if (i10 >= xVar.f95832d) {
                    xVar.K(i10);
                    this.f95855c = this.f95856d - 1;
                    c();
                } else {
                    xVar.f95830b[i10] = 0;
                }
            }
            this.f95856d = -2;
            this.f95854b.f95829a--;
        }

        public void reset() {
            this.f95856d = -2;
            this.f95855c = -1;
            if (this.f95854b.f95835g) {
                this.f95853a = true;
            } else {
                c();
            }
        }
    }

    public static class e extends d {
        public e(x xVar) {
            super(xVar);
        }

        public boolean hasNext() {
            if (this.f95857e) {
                return this.f95853a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public int i() {
            if (!this.f95853a) {
                throw new NoSuchElementException();
            }
            if (!this.f95857e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int i10 = this.f95855c;
            int i11 = i10 == -1 ? this.f95854b.f95834f : this.f95854b.f95831c[i10];
            this.f95856d = i10;
            c();
            return i11;
        }

        public v k() {
            v vVar = new v(true, this.f95854b.f95829a);
            while (this.f95853a) {
                vVar.a(i());
            }
            return vVar;
        }

        @Override // com.badlogic.gdx.utils.x.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.x.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public x() {
        this(32, 0.8f);
    }

    private void A(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int[] iArr = this.f95830b;
        int[] iArr2 = this.f95831c;
        int i18 = this.f95838j;
        int i19 = this.f95841m;
        int i20 = 0;
        do {
            int iY = com.badlogic.gdx.math.s.y(2);
            if (iY == 0) {
                int i21 = iArr2[i12];
                iArr[i12] = i10;
                iArr2[i12] = i11;
                i10 = i13;
                i11 = i21;
            } else if (iY != 1) {
                int i22 = iArr2[i16];
                iArr[i16] = i10;
                iArr2[i16] = i11;
                i11 = i22;
                i10 = i17;
            } else {
                int i23 = iArr2[i14];
                iArr[i14] = i10;
                iArr2[i14] = i11;
                i11 = i23;
                i10 = i15;
            }
            i12 = i10 & i18;
            i13 = iArr[i12];
            if (i13 == 0) {
                iArr[i12] = i10;
                iArr2[i12] = i11;
                int i24 = this.f95829a;
                this.f95829a = i24 + 1;
                if (i24 >= this.f95839k) {
                    L(this.f95832d << 1);
                    return;
                }
                return;
            }
            i14 = u(i10);
            i15 = iArr[i14];
            if (i15 == 0) {
                iArr[i14] = i10;
                iArr2[i14] = i11;
                int i25 = this.f95829a;
                this.f95829a = i25 + 1;
                if (i25 >= this.f95839k) {
                    L(this.f95832d << 1);
                    return;
                }
                return;
            }
            i16 = v(i10);
            i17 = iArr[i16];
            if (i17 == 0) {
                iArr[i16] = i10;
                iArr2[i16] = i11;
                int i26 = this.f95829a;
                this.f95829a = i26 + 1;
                if (i26 >= this.f95839k) {
                    L(this.f95832d << 1);
                    return;
                }
                return;
            }
            i20++;
        } while (i20 != i19);
        F(i10, i11);
    }

    private void D(int i10, int i11) {
        if (i10 == 0) {
            this.f95834f = i11;
            this.f95835g = true;
            return;
        }
        int i12 = i10 & this.f95838j;
        int[] iArr = this.f95830b;
        int i13 = iArr[i12];
        if (i13 == 0) {
            iArr[i12] = i10;
            this.f95831c[i12] = i11;
            int i14 = this.f95829a;
            this.f95829a = i14 + 1;
            if (i14 >= this.f95839k) {
                L(this.f95832d << 1);
            }
        } else {
            int iU = u(i10);
            int[] iArr2 = this.f95830b;
            int i15 = iArr2[iU];
            if (i15 == 0) {
                iArr2[iU] = i10;
                this.f95831c[iU] = i11;
                int i16 = this.f95829a;
                this.f95829a = i16 + 1;
                if (i16 >= this.f95839k) {
                    L(this.f95832d << 1);
                }
            } else {
                int iV = v(i10);
                int[] iArr3 = this.f95830b;
                int i17 = iArr3[iV];
                if (i17 != 0) {
                    A(i10, i11, i12, i13, iU, i15, iV, i17);
                    return;
                }
                iArr3[iV] = i10;
                this.f95831c[iV] = i11;
                int i18 = this.f95829a;
                this.f95829a = i18 + 1;
                if (i18 >= this.f95839k) {
                    L(this.f95832d << 1);
                }
            }
        }
    }

    private void F(int i10, int i11) {
        int i12 = this.f95833e;
        if (i12 == this.f95840l) {
            L(this.f95832d << 1);
            B(i10, i11);
            return;
        }
        int i13 = this.f95832d + i12;
        this.f95830b[i13] = i10;
        this.f95831c[i13] = i11;
        this.f95833e = i12 + 1;
        this.f95829a++;
    }

    private void L(int i10) {
        int i11 = this.f95832d + this.f95833e;
        this.f95832d = i10;
        this.f95839k = (int) (i10 * this.f95836h);
        this.f95838j = i10 - 1;
        this.f95837i = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95840l = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95841m = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        int[] iArr = this.f95830b;
        int[] iArr2 = this.f95831c;
        int i12 = this.f95840l;
        this.f95830b = new int[i10 + i12];
        this.f95831c = new int[i10 + i12];
        int i13 = this.f95829a;
        this.f95829a = this.f95835g ? 1 : 0;
        this.f95833e = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = iArr[i14];
                if (i15 != 0) {
                    D(i15, iArr2[i14]);
                }
            }
        }
    }

    private boolean i(int i10) {
        int[] iArr = this.f95830b;
        int i11 = this.f95832d;
        int i12 = this.f95833e + i11;
        while (i11 < i12) {
            if (i10 == iArr[i11]) {
                return true;
            }
            i11++;
        }
        return false;
    }

    private int s(int i10, int i11, int i12) {
        int[] iArr = this.f95830b;
        int i13 = this.f95832d;
        int i14 = this.f95833e + i13;
        while (i13 < i14) {
            if (i10 == iArr[i13]) {
                int[] iArr2 = this.f95831c;
                int i15 = iArr2[i13];
                iArr2[i13] = i12 + i15;
                return i15;
            }
            i13++;
        }
        B(i10, i12 + i11);
        return i11;
    }

    private int t(int i10, int i11) {
        int[] iArr = this.f95830b;
        int i12 = this.f95832d;
        int i13 = this.f95833e + i12;
        while (i12 < i13) {
            if (i10 == iArr[i12]) {
                return this.f95831c[i12];
            }
            i12++;
        }
        return i11;
    }

    private int u(int i10) {
        int i11 = i10 * Y;
        return this.f95838j & (i11 ^ (i11 >>> this.f95837i));
    }

    private int v(int i10) {
        int i11 = i10 * Z;
        return this.f95838j & (i11 ^ (i11 >>> this.f95837i));
    }

    public void B(int i10, int i11) {
        if (i10 == 0) {
            this.f95834f = i11;
            if (this.f95835g) {
                return;
            }
            this.f95835g = true;
            this.f95829a++;
            return;
        }
        int[] iArr = this.f95830b;
        int i12 = i10 & this.f95838j;
        int i13 = iArr[i12];
        if (i10 == i13) {
            this.f95831c[i12] = i11;
            return;
        }
        int iU = u(i10);
        int i14 = iArr[iU];
        if (i10 == i14) {
            this.f95831c[iU] = i11;
            return;
        }
        int iV = v(i10);
        int i15 = iArr[iV];
        if (i10 == i15) {
            this.f95831c[iV] = i11;
            return;
        }
        int i16 = this.f95832d;
        int i17 = this.f95833e + i16;
        while (i16 < i17) {
            if (i10 == iArr[i16]) {
                this.f95831c[i16] = i11;
                return;
            }
            i16++;
        }
        if (i13 == 0) {
            iArr[i12] = i10;
            this.f95831c[i12] = i11;
            int i18 = this.f95829a;
            this.f95829a = i18 + 1;
            if (i18 >= this.f95839k) {
                L(this.f95832d << 1);
                return;
            }
            return;
        }
        if (i14 == 0) {
            iArr[iU] = i10;
            this.f95831c[iU] = i11;
            int i19 = this.f95829a;
            this.f95829a = i19 + 1;
            if (i19 >= this.f95839k) {
                L(this.f95832d << 1);
                return;
            }
            return;
        }
        if (i15 != 0) {
            A(i10, i11, i12, i13, iU, i14, iV, i15);
            return;
        }
        iArr[iV] = i10;
        this.f95831c[iV] = i11;
        int i20 = this.f95829a;
        this.f95829a = i20 + 1;
        if (i20 >= this.f95839k) {
            L(this.f95832d << 1);
        }
    }

    public void C(x xVar) {
        for (b bVar : xVar.m()) {
            B(bVar.f95849a, bVar.f95850b);
        }
    }

    public int G(int i10, int i11) {
        if (i10 == 0) {
            if (!this.f95835g) {
                return i11;
            }
            this.f95835g = false;
            this.f95829a--;
            return this.f95834f;
        }
        int i12 = this.f95838j & i10;
        int[] iArr = this.f95830b;
        if (i10 == iArr[i12]) {
            iArr[i12] = 0;
            int i13 = this.f95831c[i12];
            this.f95829a--;
            return i13;
        }
        int iU = u(i10);
        int[] iArr2 = this.f95830b;
        if (i10 == iArr2[iU]) {
            iArr2[iU] = 0;
            int i14 = this.f95831c[iU];
            this.f95829a--;
            return i14;
        }
        int iV = v(i10);
        int[] iArr3 = this.f95830b;
        if (i10 != iArr3[iV]) {
            return J(i10, i11);
        }
        iArr3[iV] = 0;
        int i15 = this.f95831c[iV];
        this.f95829a--;
        return i15;
    }

    int J(int i10, int i11) {
        int[] iArr = this.f95830b;
        int i12 = this.f95832d;
        int i13 = this.f95833e + i12;
        while (i12 < i13) {
            if (i10 == iArr[i12]) {
                int i14 = this.f95831c[i12];
                K(i12);
                this.f95829a--;
                return i14;
            }
            i12++;
        }
        return i11;
    }

    void K(int i10) {
        int i11 = this.f95833e - 1;
        this.f95833e = i11;
        int i12 = this.f95832d + i11;
        if (i10 < i12) {
            int[] iArr = this.f95830b;
            iArr[i10] = iArr[i12];
            int[] iArr2 = this.f95831c;
            iArr2[i10] = iArr2[i12];
        }
    }

    public void M(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95829a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95832d <= i10) {
            return;
        }
        L(com.badlogic.gdx.math.s.u(i10));
    }

    public e N() {
        if (this.f95844s == null) {
            this.f95844s = new e(this);
            this.f95845t = new e(this);
        }
        e eVar = this.f95844s;
        if (eVar.f95857e) {
            this.f95845t.reset();
            e eVar2 = this.f95845t;
            eVar2.f95857e = true;
            this.f95844s.f95857e = false;
            return eVar2;
        }
        eVar.reset();
        e eVar3 = this.f95844s;
        eVar3.f95857e = true;
        this.f95845t.f95857e = false;
        return eVar3;
    }

    public void c(int i10) {
        if (this.f95832d <= i10) {
            clear();
            return;
        }
        this.f95835g = false;
        this.f95829a = 0;
        L(i10);
    }

    public void clear() {
        if (this.f95829a == 0) {
            return;
        }
        int[] iArr = this.f95830b;
        int i10 = this.f95832d + this.f95833e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95829a = 0;
                this.f95833e = 0;
                this.f95835g = false;
                return;
            }
            iArr[i11] = 0;
            i10 = i11;
        }
    }

    public boolean d(int i10) {
        if (i10 == 0) {
            return this.f95835g;
        }
        if (this.f95830b[this.f95838j & i10] == i10) {
            return true;
        }
        if (this.f95830b[u(i10)] == i10) {
            return true;
        }
        if (this.f95830b[v(i10)] != i10) {
            return i(i10);
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return m();
    }

    public boolean k(int i10) {
        if (this.f95835g && this.f95834f == i10) {
            return true;
        }
        int[] iArr = this.f95831c;
        int i11 = this.f95832d + this.f95833e;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                return false;
            }
            if (iArr[i12] == i10) {
                return true;
            }
            i11 = i12;
        }
    }

    public void l(int i10) {
        int i11 = this.f95829a + i10;
        if (i11 >= this.f95839k) {
            L(com.badlogic.gdx.math.s.u((int) (i11 / this.f95836h)));
        }
    }

    public a m() {
        if (this.f95842n == null) {
            this.f95842n = new a(this);
            this.f95843o = new a(this);
        }
        a aVar = this.f95842n;
        if (aVar.f95857e) {
            this.f95843o.reset();
            a aVar2 = this.f95843o;
            aVar2.f95857e = true;
            this.f95842n.f95857e = false;
            return aVar2;
        }
        aVar.reset();
        a aVar3 = this.f95842n;
        aVar3.f95857e = true;
        this.f95843o.f95857e = false;
        return aVar3;
    }

    public int n(int i10, int i11) {
        if (this.f95835g && this.f95834f == i10) {
            return 0;
        }
        int[] iArr = this.f95831c;
        int i12 = this.f95832d + this.f95833e;
        while (true) {
            int i13 = i12 - 1;
            if (i12 <= 0) {
                return i11;
            }
            if (iArr[i13] == i10) {
                return this.f95830b[i13];
            }
            i12 = i13;
        }
    }

    public int p(int i10, int i11) {
        if (i10 == 0) {
            return !this.f95835g ? i11 : this.f95834f;
        }
        int iU = this.f95838j & i10;
        if (this.f95830b[iU] != i10) {
            iU = u(i10);
            if (this.f95830b[iU] != i10) {
                iU = v(i10);
                if (this.f95830b[iU] != i10) {
                    return t(i10, i11);
                }
            }
        }
        return this.f95831c[iU];
    }

    public int r(int i10, int i11, int i12) {
        if (i10 == 0) {
            if (this.f95835g) {
                int i13 = this.f95834f;
                this.f95834f = i12 + i13;
                return i13;
            }
            this.f95835g = true;
            this.f95834f = i12 + i11;
            this.f95829a++;
            return i11;
        }
        int iU = this.f95838j & i10;
        if (i10 != this.f95830b[iU]) {
            iU = u(i10);
            if (i10 != this.f95830b[iU]) {
                iU = v(i10);
                if (i10 != this.f95830b[iU]) {
                    return s(i10, i11, i12);
                }
            }
        }
        int[] iArr = this.f95831c;
        int i14 = iArr[iU];
        iArr[iU] = i12 + i14;
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054 A[EDGE_INSN: B:21:0x0054->B:15:0x0049 BREAK  A[LOOP:0: B:9:0x0030->B:13:0x0039]] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0049 -> B:16:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.f95829a
            if (r0 != 0) goto L8
            java.lang.String r7 = "{}"
            r6 = 6
            return r7
        L8:
            r6 = 5
            com.badlogic.gdx.utils.f1 r0 = new com.badlogic.gdx.utils.f1
            r1 = 32
            r6 = 4
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int[] r1 = r7.f95830b
            r6 = 1
            int[] r2 = r7.f95831c
            int r3 = r1.length
            r6 = 3
            boolean r4 = r7.f95835g
            r5 = 61
            if (r4 == 0) goto L30
            r6 = 4
            java.lang.String r4 = "0="
            r0.o(r4)
            int r7 = r7.f95834f
            r6 = 4
            r0.d(r7)
            goto L4a
        L30:
            int r7 = r3 + (-1)
            if (r3 <= 0) goto L49
            r3 = r1[r7]
            r6 = 2
            if (r3 != 0) goto L3b
            r3 = r7
            goto L30
        L3b:
            r0.d(r3)
            r6 = 6
            r0.append(r5)
            r6 = 4
            r3 = r2[r7]
            r6 = 1
            r0.d(r3)
        L49:
            r3 = r7
        L4a:
            int r7 = r3 + (-1)
            if (r3 <= 0) goto L6b
            r6 = 0
            r3 = r1[r7]
            if (r3 != 0) goto L54
            goto L49
        L54:
            java.lang.String r4 = ", "
            java.lang.String r4 = ", "
            r6 = 0
            r0.o(r4)
            r0.d(r3)
            r6 = 7
            r0.append(r5)
            r6 = 2
            r3 = r2[r7]
            r0.d(r3)
            r6 = 0
            goto L49
        L6b:
            r7 = 125(0x7d, float:1.75E-43)
            r0.append(r7)
            r6 = 3
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.x.toString():java.lang.String");
    }

    public c w() {
        if (this.f95846v == null) {
            this.f95846v = new c(this);
            this.f95847w = new c(this);
        }
        c cVar = this.f95846v;
        if (cVar.f95857e) {
            this.f95847w.reset();
            c cVar2 = this.f95847w;
            cVar2.f95857e = true;
            this.f95846v.f95857e = false;
            return cVar2;
        }
        cVar.reset();
        c cVar3 = this.f95846v;
        cVar3.f95857e = true;
        this.f95847w.f95857e = false;
        return cVar3;
    }

    public x(int i10) {
        this(i10, 0.8f);
    }

    public x(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 <= 1073741824) {
            int iU = com.badlogic.gdx.math.s.u(i10);
            this.f95832d = iU;
            if (f10 <= 0.0f) {
                throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
            }
            this.f95836h = f10;
            this.f95839k = (int) (iU * f10);
            this.f95838j = iU - 1;
            this.f95837i = 31 - Integer.numberOfTrailingZeros(iU);
            this.f95840l = Math.max(3, ((int) Math.ceil(Math.log(this.f95832d))) * 2);
            this.f95841m = Math.max(Math.min(this.f95832d, 8), ((int) Math.sqrt(this.f95832d)) / 8);
            int[] iArr = new int[this.f95832d + this.f95840l];
            this.f95830b = iArr;
            this.f95831c = new int[iArr.length];
            return;
        }
        throw new IllegalArgumentException("initialCapacity is too large: " + i10);
    }

    public x(x xVar) {
        this(xVar.f95832d, xVar.f95836h);
        this.f95833e = xVar.f95833e;
        int[] iArr = xVar.f95830b;
        System.arraycopy(iArr, 0, this.f95830b, 0, iArr.length);
        int[] iArr2 = xVar.f95831c;
        System.arraycopy(iArr2, 0, this.f95831c, 0, iArr2.length);
        this.f95829a = xVar.f95829a;
        this.f95834f = xVar.f95834f;
        this.f95835g = xVar.f95835g;
    }
}
