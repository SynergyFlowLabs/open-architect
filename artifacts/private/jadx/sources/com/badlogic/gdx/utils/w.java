package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class w implements Iterable<b> {
    private static final int X = -1105259343;
    private static final int Y = -1262997959;
    private static final int Z = -825114047;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f95798p0 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f95800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float[] f95801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f95804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f95805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f95806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f95810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f95811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f95812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f95813o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f95814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e f95815t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f95816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c f95817w;

    public static class a extends d implements Iterable<b>, Iterator<b> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b f95818h;

        public a(w wVar) {
            super(wVar);
            this.f95818h = new b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f95827e) {
                return this.f95823a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b next() {
            if (!this.f95823a) {
                throw new NoSuchElementException();
            }
            if (!this.f95827e) {
                throw new t("#iterator() cannot be used nested.");
            }
            w wVar = this.f95824b;
            int[] iArr = wVar.f95800b;
            int i10 = this.f95825c;
            if (i10 == -1) {
                b bVar = this.f95818h;
                bVar.f95819a = 0;
                bVar.f95820b = wVar.f95804f;
            } else {
                b bVar2 = this.f95818h;
                bVar2.f95819a = iArr[i10];
                bVar2.f95820b = wVar.f95801c[i10];
            }
            this.f95826d = i10;
            c();
            return this.f95818h;
        }

        @Override // java.lang.Iterable
        public Iterator<b> iterator() {
            return this;
        }

        @Override // com.badlogic.gdx.utils.w.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.w.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f95820b;

        public String toString() {
            return this.f95819a + "=" + this.f95820b;
        }
    }

    public static class c extends d {
        public c(w wVar) {
            super(wVar);
        }

        public boolean hasNext() {
            if (this.f95827e) {
                return this.f95823a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public int i() {
            if (!this.f95823a) {
                throw new NoSuchElementException();
            }
            if (!this.f95827e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int i10 = this.f95825c;
            int i11 = i10 == -1 ? 0 : this.f95824b.f95800b[i10];
            this.f95826d = i10;
            c();
            return i11;
        }

        public v k() {
            v vVar = new v(true, this.f95824b.f95799a);
            while (this.f95823a) {
                vVar.a(i());
            }
            return vVar;
        }

        @Override // com.badlogic.gdx.utils.w.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.w.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f95821f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f95822g = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final w f95824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95827e = true;

        public d(w wVar) {
            this.f95824b = wVar;
            reset();
        }

        void c() {
            int i10;
            this.f95823a = false;
            w wVar = this.f95824b;
            int[] iArr = wVar.f95800b;
            int i11 = wVar.f95802d + wVar.f95803e;
            do {
                i10 = this.f95825c + 1;
                this.f95825c = i10;
                if (i10 < i11) {
                }
            } while (iArr[i10] == 0);
            this.f95823a = true;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x0029  */
        /* JADX WARN: Code duplicated, block: B:15:0x003a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0012  */
        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        public void remove() {
            w wVar;
            int i10 = this.f95826d;
            if (i10 == -1) {
                w wVar2 = this.f95824b;
                if (wVar2.f95805g) {
                    wVar2.f95805g = false;
                } else {
                    if (i10 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    wVar = this.f95824b;
                    if (i10 >= wVar.f95802d) {
                        wVar.L(i10);
                        this.f95825c = this.f95826d - 1;
                        c();
                    } else {
                        wVar.f95800b[i10] = 0;
                    }
                }
            } else {
                if (i10 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                wVar = this.f95824b;
                if (i10 >= wVar.f95802d) {
                    wVar.L(i10);
                    this.f95825c = this.f95826d - 1;
                    c();
                } else {
                    wVar.f95800b[i10] = 0;
                }
            }
            this.f95826d = -2;
            this.f95824b.f95799a--;
        }

        public void reset() {
            this.f95826d = -2;
            this.f95825c = -1;
            if (this.f95824b.f95805g) {
                this.f95823a = true;
            } else {
                c();
            }
        }
    }

    public static class e extends d {
        public e(w wVar) {
            super(wVar);
        }

        public boolean hasNext() {
            if (this.f95827e) {
                return this.f95823a;
            }
            throw new t("#iterator() cannot be used nested.");
        }

        public float i() {
            if (!this.f95823a) {
                throw new NoSuchElementException();
            }
            if (!this.f95827e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int i10 = this.f95825c;
            int i11 = 0 & (-1);
            float f10 = i10 == -1 ? this.f95824b.f95804f : this.f95824b.f95801c[i10];
            this.f95826d = i10;
            c();
            return f10;
        }

        public q k() {
            q qVar = new q(true, this.f95824b.f95799a);
            while (this.f95823a) {
                qVar.a(i());
            }
            return qVar;
        }

        @Override // com.badlogic.gdx.utils.w.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.w.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public w() {
        this(32, 0.8f);
    }

    private void B(int i10, float f10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int[] iArr = this.f95800b;
        float[] fArr = this.f95801c;
        int i17 = this.f95808j;
        int i18 = this.f95811m;
        int i19 = 0;
        do {
            int iY = com.badlogic.gdx.math.s.y(2);
            if (iY == 0) {
                float f11 = fArr[i11];
                iArr[i11] = i10;
                fArr[i11] = f10;
                i10 = i12;
                f10 = f11;
            } else if (iY != 1) {
                float f12 = fArr[i15];
                iArr[i15] = i10;
                fArr[i15] = f10;
                f10 = f12;
                i10 = i16;
            } else {
                float f13 = fArr[i13];
                iArr[i13] = i10;
                fArr[i13] = f10;
                f10 = f13;
                i10 = i14;
            }
            i11 = i10 & i17;
            i12 = iArr[i11];
            if (i12 == 0) {
                iArr[i11] = i10;
                fArr[i11] = f10;
                int i20 = this.f95799a;
                this.f95799a = i20 + 1;
                if (i20 >= this.f95809k) {
                    M(this.f95802d << 1);
                    return;
                }
                return;
            }
            i13 = v(i10);
            i14 = iArr[i13];
            if (i14 == 0) {
                iArr[i13] = i10;
                fArr[i13] = f10;
                int i21 = this.f95799a;
                this.f95799a = i21 + 1;
                if (i21 >= this.f95809k) {
                    M(this.f95802d << 1);
                    return;
                }
                return;
            }
            i15 = w(i10);
            i16 = iArr[i15];
            if (i16 == 0) {
                iArr[i15] = i10;
                fArr[i15] = f10;
                int i22 = this.f95799a;
                this.f95799a = i22 + 1;
                if (i22 >= this.f95809k) {
                    M(this.f95802d << 1);
                    return;
                }
                return;
            }
            i19++;
        } while (i19 != i18);
        G(i10, f10);
    }

    private void F(int i10, float f10) {
        if (i10 == 0) {
            this.f95804f = f10;
            this.f95805g = true;
            return;
        }
        int i11 = i10 & this.f95808j;
        int[] iArr = this.f95800b;
        int i12 = iArr[i11];
        if (i12 == 0) {
            iArr[i11] = i10;
            this.f95801c[i11] = f10;
            int i13 = this.f95799a;
            this.f95799a = i13 + 1;
            if (i13 >= this.f95809k) {
                M(this.f95802d << 1);
                return;
            }
            return;
        }
        int iV = v(i10);
        int[] iArr2 = this.f95800b;
        int i14 = iArr2[iV];
        if (i14 == 0) {
            iArr2[iV] = i10;
            this.f95801c[iV] = f10;
            int i15 = this.f95799a;
            this.f95799a = i15 + 1;
            if (i15 >= this.f95809k) {
                M(this.f95802d << 1);
                return;
            }
            return;
        }
        int iW = w(i10);
        int[] iArr3 = this.f95800b;
        int i16 = iArr3[iW];
        if (i16 != 0) {
            B(i10, f10, i11, i12, iV, i14, iW, i16);
            return;
        }
        iArr3[iW] = i10;
        this.f95801c[iW] = f10;
        int i17 = this.f95799a;
        this.f95799a = i17 + 1;
        if (i17 >= this.f95809k) {
            M(this.f95802d << 1);
        }
    }

    private void G(int i10, float f10) {
        int i11 = this.f95803e;
        if (i11 == this.f95810l) {
            M(this.f95802d << 1);
            C(i10, f10);
            return;
        }
        int i12 = this.f95802d + i11;
        this.f95800b[i12] = i10;
        this.f95801c[i12] = f10;
        this.f95803e = i11 + 1;
        this.f95799a++;
    }

    private void M(int i10) {
        int i11 = this.f95802d + this.f95803e;
        this.f95802d = i10;
        this.f95809k = (int) (i10 * this.f95806h);
        this.f95808j = i10 - 1;
        this.f95807i = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95810l = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95811m = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        int[] iArr = this.f95800b;
        float[] fArr = this.f95801c;
        int i12 = this.f95810l;
        this.f95800b = new int[i10 + i12];
        this.f95801c = new float[i10 + i12];
        int i13 = this.f95799a;
        this.f95799a = this.f95805g ? 1 : 0;
        this.f95803e = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = iArr[i14];
                if (i15 != 0) {
                    F(i15, fArr[i14]);
                }
            }
        }
    }

    private boolean i(int i10) {
        int[] iArr = this.f95800b;
        int i11 = this.f95802d;
        int i12 = this.f95803e + i11;
        while (i11 < i12) {
            if (i10 == iArr[i11]) {
                return true;
            }
            i11++;
        }
        return false;
    }

    private float t(int i10, float f10, float f11) {
        int[] iArr = this.f95800b;
        int i11 = this.f95802d;
        int i12 = this.f95803e + i11;
        while (i11 < i12) {
            if (i10 == iArr[i11]) {
                float[] fArr = this.f95801c;
                float f12 = fArr[i11];
                fArr[i11] = f11 + f12;
                return f12;
            }
            i11++;
        }
        C(i10, f11 + f10);
        return f10;
    }

    private float u(int i10, float f10) {
        int[] iArr = this.f95800b;
        int i11 = this.f95802d;
        int i12 = this.f95803e + i11;
        while (i11 < i12) {
            if (i10 == iArr[i11]) {
                return this.f95801c[i11];
            }
            i11++;
        }
        return f10;
    }

    private int v(int i10) {
        int i11 = i10 * Y;
        return this.f95808j & (i11 ^ (i11 >>> this.f95807i));
    }

    private int w(int i10) {
        int i11 = i10 * Z;
        return this.f95808j & (i11 ^ (i11 >>> this.f95807i));
    }

    public c A() {
        if (this.f95816v == null) {
            this.f95816v = new c(this);
            this.f95817w = new c(this);
        }
        c cVar = this.f95816v;
        if (cVar.f95827e) {
            this.f95817w.reset();
            c cVar2 = this.f95817w;
            cVar2.f95827e = true;
            this.f95816v.f95827e = false;
            return cVar2;
        }
        cVar.reset();
        c cVar3 = this.f95816v;
        cVar3.f95827e = true;
        this.f95817w.f95827e = false;
        return cVar3;
    }

    public void C(int i10, float f10) {
        if (i10 == 0) {
            this.f95804f = f10;
            if (this.f95805g) {
                return;
            }
            this.f95805g = true;
            this.f95799a++;
            return;
        }
        int[] iArr = this.f95800b;
        int i11 = i10 & this.f95808j;
        int i12 = iArr[i11];
        if (i10 == i12) {
            this.f95801c[i11] = f10;
            return;
        }
        int iV = v(i10);
        int i13 = iArr[iV];
        if (i10 == i13) {
            this.f95801c[iV] = f10;
            return;
        }
        int iW = w(i10);
        int i14 = iArr[iW];
        if (i10 == i14) {
            this.f95801c[iW] = f10;
            return;
        }
        int i15 = this.f95802d;
        int i16 = this.f95803e + i15;
        while (i15 < i16) {
            if (i10 == iArr[i15]) {
                this.f95801c[i15] = f10;
                return;
            }
            i15++;
        }
        if (i12 == 0) {
            iArr[i11] = i10;
            this.f95801c[i11] = f10;
            int i17 = this.f95799a;
            this.f95799a = i17 + 1;
            if (i17 >= this.f95809k) {
                M(this.f95802d << 1);
                return;
            }
            return;
        }
        if (i13 == 0) {
            iArr[iV] = i10;
            this.f95801c[iV] = f10;
            int i18 = this.f95799a;
            this.f95799a = i18 + 1;
            if (i18 >= this.f95809k) {
                M(this.f95802d << 1);
                return;
            }
            return;
        }
        if (i14 != 0) {
            B(i10, f10, i11, i12, iV, i13, iW, i14);
            return;
        }
        iArr[iW] = i10;
        this.f95801c[iW] = f10;
        int i19 = this.f95799a;
        this.f95799a = i19 + 1;
        if (i19 >= this.f95809k) {
            M(this.f95802d << 1);
        }
    }

    public void D(w wVar) {
        for (b bVar : wVar.n()) {
            C(bVar.f95819a, bVar.f95820b);
        }
    }

    public float J(int i10, float f10) {
        if (i10 == 0) {
            if (!this.f95805g) {
                return f10;
            }
            this.f95805g = false;
            this.f95799a--;
            return this.f95804f;
        }
        int i11 = this.f95808j & i10;
        int[] iArr = this.f95800b;
        if (i10 == iArr[i11]) {
            iArr[i11] = 0;
            float f11 = this.f95801c[i11];
            this.f95799a--;
            return f11;
        }
        int iV = v(i10);
        int[] iArr2 = this.f95800b;
        if (i10 == iArr2[iV]) {
            iArr2[iV] = 0;
            float f12 = this.f95801c[iV];
            this.f95799a--;
            return f12;
        }
        int iW = w(i10);
        int[] iArr3 = this.f95800b;
        if (i10 != iArr3[iW]) {
            return K(i10, f10);
        }
        iArr3[iW] = 0;
        float f13 = this.f95801c[iW];
        this.f95799a--;
        return f13;
    }

    float K(int i10, float f10) {
        int[] iArr = this.f95800b;
        int i11 = this.f95802d;
        int i12 = this.f95803e + i11;
        while (i11 < i12) {
            if (i10 == iArr[i11]) {
                float f11 = this.f95801c[i11];
                L(i11);
                this.f95799a--;
                return f11;
            }
            i11++;
        }
        return f10;
    }

    void L(int i10) {
        int i11 = this.f95803e - 1;
        this.f95803e = i11;
        int i12 = this.f95802d + i11;
        if (i10 < i12) {
            int[] iArr = this.f95800b;
            iArr[i10] = iArr[i12];
            float[] fArr = this.f95801c;
            fArr[i10] = fArr[i12];
        }
    }

    public void N(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95799a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95802d <= i10) {
            return;
        }
        M(com.badlogic.gdx.math.s.u(i10));
    }

    public e O() {
        if (this.f95814s == null) {
            this.f95814s = new e(this);
            this.f95815t = new e(this);
        }
        e eVar = this.f95814s;
        if (eVar.f95827e) {
            this.f95815t.reset();
            e eVar2 = this.f95815t;
            eVar2.f95827e = true;
            this.f95814s.f95827e = false;
            return eVar2;
        }
        eVar.reset();
        e eVar3 = this.f95814s;
        eVar3.f95827e = true;
        this.f95815t.f95827e = false;
        return eVar3;
    }

    public void c(int i10) {
        if (this.f95802d <= i10) {
            clear();
            return;
        }
        this.f95805g = false;
        this.f95799a = 0;
        M(i10);
    }

    public void clear() {
        if (this.f95799a == 0) {
            return;
        }
        int[] iArr = this.f95800b;
        int i10 = this.f95802d + this.f95803e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95805g = false;
                this.f95799a = 0;
                this.f95803e = 0;
                return;
            }
            iArr[i11] = 0;
            i10 = i11;
        }
    }

    public boolean d(int i10) {
        if (i10 == 0) {
            return this.f95805g;
        }
        if (this.f95800b[this.f95808j & i10] != i10) {
            if (this.f95800b[v(i10)] != i10) {
                if (this.f95800b[w(i10)] != i10) {
                    return i(i10);
                }
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return n();
    }

    public boolean k(float f10) {
        if (this.f95805g && this.f95804f == f10) {
            return true;
        }
        float[] fArr = this.f95801c;
        int i10 = this.f95802d + this.f95803e;
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

    public boolean l(float f10, float f11) {
        if (this.f95805g && Math.abs(this.f95804f - f10) <= f11) {
            return true;
        }
        float[] fArr = this.f95801c;
        int i10 = this.f95802d + this.f95803e;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return false;
            }
            if (Math.abs(fArr[i11] - f10) <= f11) {
                return true;
            }
            i10 = i11;
        }
    }

    public void m(int i10) {
        int i11 = this.f95799a + i10;
        if (i11 >= this.f95809k) {
            M(com.badlogic.gdx.math.s.u((int) (i11 / this.f95806h)));
        }
    }

    public a n() {
        if (this.f95812n == null) {
            this.f95812n = new a(this);
            this.f95813o = new a(this);
        }
        a aVar = this.f95812n;
        if (aVar.f95827e) {
            this.f95813o.reset();
            a aVar2 = this.f95813o;
            aVar2.f95827e = true;
            this.f95812n.f95827e = false;
            return aVar2;
        }
        aVar.reset();
        a aVar3 = this.f95812n;
        aVar3.f95827e = true;
        this.f95813o.f95827e = false;
        return aVar3;
    }

    public int p(float f10, int i10) {
        if (this.f95805g && this.f95804f == f10) {
            int i11 = 4 | 0;
            return 0;
        }
        float[] fArr = this.f95801c;
        int i12 = this.f95802d + this.f95803e;
        while (true) {
            int i13 = i12 - 1;
            if (i12 <= 0) {
                return i10;
            }
            if (fArr[i13] == f10) {
                return this.f95800b[i13];
            }
            i12 = i13;
        }
    }

    public float r(int i10, float f10) {
        if (i10 == 0) {
            return !this.f95805g ? f10 : this.f95804f;
        }
        int iV = this.f95808j & i10;
        if (this.f95800b[iV] != i10) {
            iV = v(i10);
            if (this.f95800b[iV] != i10) {
                iV = w(i10);
                if (this.f95800b[iV] != i10) {
                    return u(i10, f10);
                }
            }
        }
        return this.f95801c[iV];
    }

    public float s(int i10, float f10, float f11) {
        if (i10 == 0) {
            if (this.f95805g) {
                float f12 = this.f95804f;
                this.f95804f = f11 + f12;
                return f12;
            }
            this.f95805g = true;
            this.f95804f = f11 + f10;
            this.f95799a++;
            return f10;
        }
        int iV = this.f95808j & i10;
        if (i10 != this.f95800b[iV]) {
            iV = v(i10);
            if (i10 != this.f95800b[iV]) {
                iV = w(i10);
                if (i10 != this.f95800b[iV]) {
                    return t(i10, f10, f11);
                }
            }
        }
        float[] fArr = this.f95801c;
        float f13 = fArr[iV];
        fArr[iV] = f11 + f13;
        return f13;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[EDGE_INSN: B:21:0x0056->B:15:0x004b BREAK  A[LOOP:0: B:9:0x0032->B:13:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:16:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.f95799a
            r6 = 6
            if (r0 != 0) goto L9
            java.lang.String r7 = "{}"
            r6 = 6
            return r7
        L9:
            com.badlogic.gdx.utils.f1 r0 = new com.badlogic.gdx.utils.f1
            r1 = 32
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r6 = 1
            int[] r1 = r7.f95800b
            r6 = 2
            float[] r2 = r7.f95801c
            r6 = 5
            int r3 = r1.length
            r6 = 1
            boolean r4 = r7.f95805g
            r5 = 61
            if (r4 == 0) goto L32
            r6 = 1
            java.lang.String r4 = "0="
            r6 = 1
            r0.o(r4)
            float r7 = r7.f95804f
            r0.c(r7)
            r6 = 3
            goto L4c
        L32:
            int r7 = r3 + (-1)
            r6 = 3
            if (r3 <= 0) goto L4b
            r6 = 6
            r3 = r1[r7]
            r6 = 2
            if (r3 != 0) goto L3f
            r3 = r7
            goto L32
        L3f:
            r0.d(r3)
            r6 = 6
            r0.append(r5)
            r3 = r2[r7]
            r0.c(r3)
        L4b:
            r3 = r7
        L4c:
            int r7 = r3 + (-1)
            if (r3 <= 0) goto L68
            r6 = 6
            r3 = r1[r7]
            if (r3 != 0) goto L56
            goto L4b
        L56:
            r6 = 3
            java.lang.String r4 = ", "
            r0.o(r4)
            r0.d(r3)
            r0.append(r5)
            r3 = r2[r7]
            r0.c(r3)
            goto L4b
        L68:
            r7 = 125(0x7d, float:1.75E-43)
            r6 = 3
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.w.toString():java.lang.String");
    }

    public w(int i10) {
        this(i10, 0.8f);
    }

    public w(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 <= 1073741824) {
            int iU = com.badlogic.gdx.math.s.u(i10);
            this.f95802d = iU;
            if (f10 > 0.0f) {
                this.f95806h = f10;
                this.f95809k = (int) (iU * f10);
                this.f95808j = iU - 1;
                this.f95807i = 31 - Integer.numberOfTrailingZeros(iU);
                this.f95810l = Math.max(3, ((int) Math.ceil(Math.log(this.f95802d))) * 2);
                this.f95811m = Math.max(Math.min(this.f95802d, 8), ((int) Math.sqrt(this.f95802d)) / 8);
                int[] iArr = new int[this.f95802d + this.f95810l];
                this.f95800b = iArr;
                this.f95801c = new float[iArr.length];
                return;
            }
            throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
        }
        throw new IllegalArgumentException("initialCapacity is too large: " + i10);
    }

    public w(w wVar) {
        this(wVar.f95802d, wVar.f95806h);
        this.f95803e = wVar.f95803e;
        int[] iArr = wVar.f95800b;
        System.arraycopy(iArr, 0, this.f95800b, 0, iArr.length);
        float[] fArr = wVar.f95801c;
        System.arraycopy(fArr, 0, this.f95801c, 0, fArr.length);
        this.f95799a = wVar.f95799a;
        this.f95804f = wVar.f95804f;
        this.f95805g = wVar.f95805g;
    }
}
