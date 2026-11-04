package com.badlogic.gdx.utils;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f95891n = -1105259343;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f95892o = -1262997959;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f95893p = -825114047;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f95894q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f95896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f95897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f95899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f95900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f95906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f95907m;

    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f95908f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f95909g = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f95910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final z f95911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f95914e = true;

        public a(z zVar) {
            this.f95911b = zVar;
            d();
        }

        void a() {
            int i10;
            this.f95910a = false;
            z zVar = this.f95911b;
            int[] iArr = zVar.f95896b;
            int i11 = zVar.f95897c + zVar.f95898d;
            do {
                i10 = this.f95912c + 1;
                this.f95912c = i10;
                if (i10 >= i11) {
                    return;
                }
            } while (iArr[i10] == 0);
            this.f95910a = true;
        }

        public int b() {
            if (!this.f95910a) {
                throw new NoSuchElementException();
            }
            if (!this.f95914e) {
                throw new t("#iterator() cannot be used nested.");
            }
            int i10 = this.f95912c;
            int i11 = i10 == -1 ? 0 : this.f95911b.f95896b[i10];
            this.f95913d = i10;
            a();
            return i11;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:11:0x002b  */
        /* JADX WARN: Code duplicated, block: B:14:0x003d  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:8:0x0015  */
        public void c() {
            z zVar;
            int i10 = this.f95913d;
            if (i10 == -1) {
                z zVar2 = this.f95911b;
                if (zVar2.f95899e) {
                    zVar2.f95899e = false;
                } else {
                    if (i10 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    zVar = this.f95911b;
                    if (i10 >= zVar.f95897c) {
                        zVar.u(i10);
                        this.f95912c = this.f95913d - 1;
                        a();
                    } else {
                        zVar.f95896b[i10] = 0;
                    }
                }
            } else {
                if (i10 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                zVar = this.f95911b;
                if (i10 >= zVar.f95897c) {
                    zVar.u(i10);
                    this.f95912c = this.f95913d - 1;
                    a();
                } else {
                    zVar.f95896b[i10] = 0;
                }
            }
            this.f95913d = -2;
            this.f95911b.f95895a--;
        }

        public void d() {
            this.f95913d = -2;
            this.f95912c = -1;
            if (this.f95911b.f95899e) {
                this.f95910a = true;
            } else {
                a();
            }
        }

        public v e() {
            v vVar = new v(true, this.f95911b.f95895a);
            while (this.f95910a) {
                vVar.a(b());
            }
            return vVar;
        }
    }

    public z() {
        this(32, 0.8f);
    }

    private void g(int i10) {
        if (i10 == 0) {
            this.f95899e = true;
            return;
        }
        int i11 = i10 & this.f95902h;
        int[] iArr = this.f95896b;
        int i12 = iArr[i11];
        if (i12 == 0) {
            iArr[i11] = i10;
            int i13 = this.f95895a;
            this.f95895a = i13 + 1;
            if (i13 >= this.f95903i) {
                v(this.f95897c << 1);
                return;
            }
            return;
        }
        int iO = o(i10);
        int[] iArr2 = this.f95896b;
        int i14 = iArr2[iO];
        if (i14 == 0) {
            iArr2[iO] = i10;
            int i15 = this.f95895a;
            this.f95895a = i15 + 1;
            if (i15 >= this.f95903i) {
                v(this.f95897c << 1);
                return;
            }
            return;
        }
        int iP = p(i10);
        int[] iArr3 = this.f95896b;
        int i16 = iArr3[iP];
        if (i16 != 0) {
            r(i10, i11, i12, iO, i14, iP, i16);
            return;
        }
        iArr3[iP] = i10;
        int i17 = this.f95895a;
        this.f95895a = i17 + 1;
        if (i17 >= this.f95903i) {
            v(this.f95897c << 1);
        }
    }

    private void h(int i10) {
        int i11 = this.f95898d;
        if (i11 == this.f95904j) {
            v(this.f95897c << 1);
            a(i10);
        } else {
            this.f95896b[this.f95897c + i11] = i10;
            this.f95898d = i11 + 1;
            this.f95895a++;
        }
    }

    private boolean l(int i10) {
        int[] iArr = this.f95896b;
        int i11 = this.f95897c;
        int i12 = this.f95898d + i11;
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return true;
            }
            i11++;
        }
        return false;
    }

    private int o(int i10) {
        int i11 = i10 * f95892o;
        return this.f95902h & (i11 ^ (i11 >>> this.f95901g));
    }

    private int p(int i10) {
        int i11 = i10 * f95893p;
        return this.f95902h & (i11 ^ (i11 >>> this.f95901g));
    }

    private void r(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int[] iArr = this.f95896b;
        int i17 = this.f95902h;
        int i18 = this.f95905k;
        int i19 = 0;
        do {
            int iY = com.badlogic.gdx.math.s.y(2);
            if (iY == 0) {
                iArr[i11] = i10;
                i10 = i12;
            } else if (iY != 1) {
                iArr[i15] = i10;
                i10 = i16;
            } else {
                iArr[i13] = i10;
                i10 = i14;
            }
            i11 = i10 & i17;
            i12 = iArr[i11];
            if (i12 == 0) {
                iArr[i11] = i10;
                int i20 = this.f95895a;
                this.f95895a = i20 + 1;
                if (i20 >= this.f95903i) {
                    v(this.f95897c << 1);
                    return;
                }
                return;
            }
            i13 = o(i10);
            i14 = iArr[i13];
            if (i14 == 0) {
                iArr[i13] = i10;
                int i21 = this.f95895a;
                this.f95895a = i21 + 1;
                if (i21 >= this.f95903i) {
                    v(this.f95897c << 1);
                    return;
                }
                return;
            }
            i15 = p(i10);
            i16 = iArr[i15];
            if (i16 == 0) {
                iArr[i15] = i10;
                int i22 = this.f95895a;
                this.f95895a = i22 + 1;
                if (i22 >= this.f95903i) {
                    v(this.f95897c << 1);
                    return;
                }
                return;
            }
            i19++;
        } while (i19 != i18);
        h(i10);
    }

    private void v(int i10) {
        int i11 = this.f95897c + this.f95898d;
        this.f95897c = i10;
        this.f95903i = (int) (i10 * this.f95900f);
        this.f95902h = i10 - 1;
        this.f95901g = 31 - Integer.numberOfTrailingZeros(i10);
        double d10 = i10;
        this.f95904j = Math.max(3, ((int) Math.ceil(Math.log(d10))) * 2);
        this.f95905k = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d10)) / 8);
        int[] iArr = this.f95896b;
        this.f95896b = new int[i10 + this.f95904j];
        int i12 = this.f95895a;
        this.f95895a = this.f95899e ? 1 : 0;
        this.f95898d = 0;
        if (i12 > 0) {
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = iArr[i13];
                if (i14 != 0) {
                    g(i14);
                }
            }
        }
    }

    public static z x(int... iArr) {
        z zVar = new z();
        zVar.e(iArr);
        return zVar;
    }

    public boolean a(int i10) {
        int iO;
        int i11;
        int iP;
        int i12;
        if (i10 == 0) {
            if (this.f95899e) {
                return false;
            }
            this.f95899e = true;
            this.f95895a++;
            return true;
        }
        int[] iArr = this.f95896b;
        int i13 = i10 & this.f95902h;
        int i14 = iArr[i13];
        if (i14 == i10 || (i11 = iArr[(iO = o(i10))]) == i10 || (i12 = iArr[(iP = p(i10))]) == i10) {
            return false;
        }
        int i15 = this.f95897c;
        int i16 = this.f95898d + i15;
        while (i15 < i16) {
            if (iArr[i15] == i10) {
                return false;
            }
            i15++;
        }
        if (i14 == 0) {
            iArr[i13] = i10;
            int i17 = this.f95895a;
            this.f95895a = i17 + 1;
            if (i17 >= this.f95903i) {
                v(this.f95897c << 1);
            }
            return true;
        }
        if (i11 == 0) {
            iArr[iO] = i10;
            int i18 = this.f95895a;
            this.f95895a = i18 + 1;
            if (i18 >= this.f95903i) {
                v(this.f95897c << 1);
            }
            return true;
        }
        if (i12 != 0) {
            r(i10, i13, i14, iO, i11, iP, i12);
            return true;
        }
        iArr[iP] = i10;
        int i19 = this.f95895a;
        this.f95895a = i19 + 1;
        if (i19 >= this.f95903i) {
            v(this.f95897c << 1);
        }
        return true;
    }

    public void b(v vVar) {
        c(vVar, 0, vVar.f95785b);
    }

    public void c(v vVar, int i10, int i11) {
        if (i10 + i11 <= vVar.f95785b) {
            f(vVar.f95784a, i10, i11);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i10 + " + " + i11 + " <= " + vVar.f95785b);
    }

    public void d(z zVar) {
        m(zVar.f95895a);
        a aVarQ = zVar.q();
        while (aVarQ.f95910a) {
            a(aVarQ.b());
        }
    }

    public void e(int... iArr) {
        f(iArr, 0, iArr.length);
    }

    public void f(int[] iArr, int i10, int i11) {
        m(i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            a(iArr[i10]);
            i10++;
        }
    }

    public void i() {
        if (this.f95895a == 0) {
            return;
        }
        int[] iArr = this.f95896b;
        int i10 = this.f95897c + this.f95898d;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                this.f95895a = 0;
                this.f95898d = 0;
                this.f95899e = false;
                return;
            }
            iArr[i11] = 0;
            i10 = i11;
        }
    }

    public void j(int i10) {
        if (this.f95897c <= i10) {
            i();
            return;
        }
        this.f95899e = false;
        this.f95895a = 0;
        v(i10);
    }

    public boolean k(int i10) {
        if (i10 == 0) {
            return this.f95899e;
        }
        if (this.f95896b[this.f95902h & i10] != i10) {
            if (this.f95896b[o(i10)] != i10) {
                if (this.f95896b[p(i10)] != i10) {
                    return l(i10);
                }
            }
        }
        return true;
    }

    public void m(int i10) {
        int i11 = this.f95895a + i10;
        if (i11 >= this.f95903i) {
            v(com.badlogic.gdx.math.s.u((int) (i11 / this.f95900f)));
        }
    }

    public int n() {
        if (this.f95899e) {
            return 0;
        }
        int[] iArr = this.f95896b;
        int i10 = this.f95897c + this.f95898d;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                return i12;
            }
        }
        throw new IllegalStateException("IntSet is empty.");
    }

    public a q() {
        if (this.f95906l == null) {
            this.f95906l = new a(this);
            this.f95907m = new a(this);
        }
        a aVar = this.f95906l;
        if (aVar.f95914e) {
            this.f95907m.d();
            a aVar2 = this.f95907m;
            aVar2.f95914e = true;
            this.f95906l.f95914e = false;
            return aVar2;
        }
        aVar.d();
        a aVar3 = this.f95906l;
        aVar3.f95914e = true;
        this.f95907m.f95914e = false;
        return aVar3;
    }

    public boolean s(int i10) {
        if (i10 == 0) {
            if (!this.f95899e) {
                return false;
            }
            this.f95899e = false;
            this.f95895a--;
            return true;
        }
        int i11 = this.f95902h & i10;
        int[] iArr = this.f95896b;
        if (iArr[i11] == i10) {
            iArr[i11] = 0;
            this.f95895a--;
            return true;
        }
        int iO = o(i10);
        int[] iArr2 = this.f95896b;
        if (iArr2[iO] == i10) {
            iArr2[iO] = 0;
            this.f95895a--;
            return true;
        }
        int iP = p(i10);
        int[] iArr3 = this.f95896b;
        if (iArr3[iP] != i10) {
            return t(i10);
        }
        iArr3[iP] = 0;
        this.f95895a--;
        return true;
    }

    boolean t(int i10) {
        int[] iArr = this.f95896b;
        int i11 = this.f95897c;
        int i12 = this.f95898d + i11;
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                u(i11);
                this.f95895a--;
                return true;
            }
            i11++;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[EDGE_INSN: B:21:0x0040->B:15:0x0034 BREAK  A[LOOP:0: B:9:0x0024->B:13:0x002e]] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0034 -> B:16:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.f95895a
            if (r0 != 0) goto L7
            java.lang.String r5 = "[]"
            return r5
        L7:
            com.badlogic.gdx.utils.f1 r0 = new com.badlogic.gdx.utils.f1
            r4 = 0
            r1 = 32
            r4 = 7
            r0.<init>(r1)
            r4 = 5
            r1 = 91
            r0.append(r1)
            r4 = 6
            int[] r1 = r5.f95896b
            int r2 = r1.length
            boolean r5 = r5.f95899e
            if (r5 == 0) goto L24
            java.lang.String r5 = "0"
            r0.o(r5)
            goto L35
        L24:
            int r5 = r2 + (-1)
            r4 = 2
            if (r2 <= 0) goto L34
            r2 = r1[r5]
            r4 = 1
            if (r2 != 0) goto L31
            r2 = r5
            r2 = r5
            goto L24
        L31:
            r0.d(r2)
        L34:
            r2 = r5
        L35:
            int r5 = r2 + (-1)
            r4 = 3
            if (r2 <= 0) goto L4a
            r2 = r1[r5]
            r4 = 6
            if (r2 != 0) goto L40
            goto L34
        L40:
            java.lang.String r3 = ", "
            r4 = 6
            r0.o(r3)
            r0.d(r2)
            goto L34
        L4a:
            r5 = 93
            r0.append(r5)
            r4 = 3
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.z.toString():java.lang.String");
    }

    void u(int i10) {
        int i11 = this.f95898d - 1;
        this.f95898d = i11;
        int i12 = this.f95897c + i11;
        if (i10 < i12) {
            int[] iArr = this.f95896b;
            iArr[i10] = iArr[i12];
        }
    }

    public void w(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i10);
        }
        int i11 = this.f95895a;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.f95897c <= i10) {
            return;
        }
        v(com.badlogic.gdx.math.s.u(i10));
    }

    public z(int i10) {
        this(i10, 0.8f);
    }

    public z(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i10);
        }
        if (i10 <= 1073741824) {
            int iU = com.badlogic.gdx.math.s.u(i10);
            this.f95897c = iU;
            int i11 = 6 << 0;
            if (f10 > 0.0f) {
                this.f95900f = f10;
                this.f95903i = (int) (iU * f10);
                this.f95902h = iU - 1;
                this.f95901g = 31 - Integer.numberOfTrailingZeros(iU);
                this.f95904j = Math.max(3, ((int) Math.ceil(Math.log(this.f95897c))) * 2);
                this.f95905k = Math.max(Math.min(this.f95897c, 8), ((int) Math.sqrt(this.f95897c)) / 8);
                this.f95896b = new int[this.f95897c + this.f95904j];
                return;
            }
            throw new IllegalArgumentException("loadFactor must be > 0: " + f10);
        }
        throw new IllegalArgumentException("initialCapacity is too large: " + i10);
    }

    public z(z zVar) {
        this(zVar.f95897c, zVar.f95900f);
        this.f95898d = zVar.f95898d;
        int[] iArr = zVar.f95896b;
        System.arraycopy(iArr, 0, this.f95896b, 0, iArr.length);
        this.f95895a = zVar.f95895a;
        this.f95899e = zVar.f95899e;
    }
}
