package com.badlogic.gdx.utils.compression.lzma;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.ui.spatial.e;
import com.google.android.material.internal.p0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f95362b0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f95363c0 = 1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    static final int f95364d0 = 268435455;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    static byte[] f95365e0 = null;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final int f95366f0 = 22;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final int f95367g0 = 32;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f95368h0 = 16;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final int f95369i0 = 4096;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f95370j0 = 5;
    int D;
    long M;
    boolean N;
    InputStream O;
    int U;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    int f95372a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    byte f95373b;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f95392u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f95393v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f95394w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f95395x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f95396y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f95397z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f95371a = com.badlogic.gdx.utils.compression.lzma.a.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f95374c = new int[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d[] f95375d = new d[4096];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.badlogic.gdx.utils.compression.lz.a f95376e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    com.badlogic.gdx.utils.compression.rangecoder.d f95377f = new com.badlogic.gdx.utils.compression.rangecoder.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    short[] f95378g = new short[192];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    short[] f95379h = new short[12];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    short[] f95380i = new short[12];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    short[] f95381j = new short[12];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    short[] f95382k = new short[12];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    short[] f95383l = new short[192];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    com.badlogic.gdx.utils.compression.rangecoder.b[] f95384m = new com.badlogic.gdx.utils.compression.rangecoder.b[4];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    short[] f95385n = new short[114];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    com.badlogic.gdx.utils.compression.rangecoder.b f95386o = new com.badlogic.gdx.utils.compression.rangecoder.b(4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    b f95387p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    b f95388q = new b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    C0849c f95389r = new C0849c();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int[] f95390s = new int[548];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f95391t = 32;
    int[] A = new int[256];
    int[] B = new int[512];
    int[] C = new int[16];
    int E = 44;
    int F = 2;
    int G = 3;
    int H = 0;
    int I = 3;
    int J = 4194304;
    int K = -1;
    int L = -1;
    int P = 1;
    boolean Q = false;
    boolean R = false;
    int[] S = new int[4];
    int[] T = new int[4];
    long[] V = new long[1];
    long[] W = new long[1];
    boolean[] X = new boolean[1];
    byte[] Y = new byte[5];
    int[] Z = new int[128];

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        short[] f95398a = new short[2];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.badlogic.gdx.utils.compression.rangecoder.b[] f95399b = new com.badlogic.gdx.utils.compression.rangecoder.b[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.badlogic.gdx.utils.compression.rangecoder.b[] f95400c = new com.badlogic.gdx.utils.compression.rangecoder.b[16];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.badlogic.gdx.utils.compression.rangecoder.b f95401d = new com.badlogic.gdx.utils.compression.rangecoder.b(8);

        public a() {
            for (int i10 = 0; i10 < 16; i10++) {
                this.f95399b[i10] = new com.badlogic.gdx.utils.compression.rangecoder.b(3);
                this.f95400c[i10] = new com.badlogic.gdx.utils.compression.rangecoder.b(3);
            }
        }

        public void a(com.badlogic.gdx.utils.compression.rangecoder.d dVar, int i10, int i11) throws IOException {
            if (i10 < 8) {
                dVar.a(this.f95398a, 0, 0);
                this.f95399b[i11].a(dVar, i10);
                return;
            }
            int i12 = i10 - 8;
            dVar.a(this.f95398a, 0, 1);
            if (i12 < 8) {
                dVar.a(this.f95398a, 1, 0);
                this.f95400c[i11].a(dVar, i12);
            } else {
                dVar.a(this.f95398a, 1, 1);
                this.f95401d.a(dVar, i10 - 16);
            }
        }

        public void b(int i10) {
            com.badlogic.gdx.utils.compression.rangecoder.d.j(this.f95398a);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f95399b[i11].c();
                this.f95400c[i11].c();
            }
            this.f95401d.c();
        }

        public void c(int i10, int i11, int[] iArr, int i12) {
            int i13 = 0;
            int iF = com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95398a[0]);
            int iG = com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95398a[0]);
            int iF2 = com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95398a[1]) + iG;
            int iG2 = iG + com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95398a[1]);
            while (i13 < 8) {
                if (i13 >= i11) {
                    return;
                }
                iArr[i12 + i13] = this.f95399b[i10].b(i13) + iF;
                i13++;
            }
            while (i13 < 16) {
                if (i13 >= i11) {
                    return;
                }
                iArr[i12 + i13] = this.f95400c[i10].b(i13 - 8) + iF2;
                i13++;
            }
            while (i13 < i11) {
                iArr[i12 + i13] = this.f95401d.b(i13 - 16) + iG2;
                i13++;
            }
        }
    }

    class b extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f95403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f95404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int[] f95405h;

        b() {
            super();
            this.f95403f = new int[4352];
            this.f95405h = new int[16];
        }

        @Override // com.badlogic.gdx.utils.compression.lzma.c.a
        public void a(com.badlogic.gdx.utils.compression.rangecoder.d dVar, int i10, int i11) throws IOException {
            super.a(dVar, i10, i11);
            int[] iArr = this.f95405h;
            int i12 = iArr[i11] - 1;
            iArr[i11] = i12;
            if (i12 == 0) {
                f(i11);
            }
        }

        public int d(int i10, int i11) {
            return this.f95403f[(i11 * com.badlogic.gdx.utils.compression.lzma.a.f95331z) + i10];
        }

        public void e(int i10) {
            this.f95404g = i10;
        }

        void f(int i10) {
            c(i10, this.f95404g, this.f95403f, i10 * com.badlogic.gdx.utils.compression.lzma.a.f95331z);
            this.f95405h[i10] = this.f95404g;
        }

        public void g(int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                f(i11);
            }
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.utils.compression.lzma.c$c, reason: collision with other inner class name */
    class C0849c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a[] f95407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f95408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95410d;

        /* JADX INFO: renamed from: com.badlogic.gdx.utils.compression.lzma.c$c$a */
        class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            short[] f95412a = new short[p0.f112892a];

            a() {
            }

            public void a(com.badlogic.gdx.utils.compression.rangecoder.d dVar, byte b10) throws IOException {
                int i10 = 1;
                for (int i11 = 7; i11 >= 0; i11--) {
                    int i12 = (b10 >> i11) & 1;
                    dVar.a(this.f95412a, i10, i12);
                    i10 = (i10 << 1) | i12;
                }
            }

            public void b(com.badlogic.gdx.utils.compression.rangecoder.d dVar, byte b10, byte b11) throws IOException {
                int i10;
                int i11 = 1;
                boolean z10 = true;
                for (int i12 = 7; i12 >= 0; i12--) {
                    int i13 = (b11 >> i12) & 1;
                    if (z10) {
                        int i14 = (b10 >> i12) & 1;
                        i10 = ((i14 + 1) << 8) + i11;
                        z10 = i14 == i13;
                    } else {
                        i10 = i11;
                    }
                    dVar.a(this.f95412a, i10, i13);
                    i11 = (i11 << 1) | i13;
                }
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0031  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:8:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            public int c(boolean r9, byte r10, byte r11) {
                /*
                    r8 = this;
                    r0 = 0
                    r1 = 1
                    r2 = 7
                    r7 = r2
                    if (r9 == 0) goto L2d
                    r9 = r1
                L7:
                    if (r2 < 0) goto L2f
                    int r3 = r10 >> r2
                    r3 = r3 & r1
                    int r4 = r11 >> r2
                    r4 = r4 & r1
                    short[] r5 = r8.f95412a
                    int r6 = r3 + 1
                    int r6 = r6 << 8
                    int r6 = r6 + r9
                    r7 = 4
                    short r5 = r5[r6]
                    r7 = 0
                    int r5 = com.badlogic.gdx.utils.compression.rangecoder.d.e(r5, r4)
                    r7 = 6
                    int r0 = r0 + r5
                    int r9 = r9 << 1
                    r7 = 6
                    r9 = r9 | r4
                    if (r3 == r4) goto L29
                L26:
                    int r2 = r2 + (-1)
                    goto L2f
                L29:
                    r7 = 6
                    int r2 = r2 + (-1)
                    goto L7
                L2d:
                    r7 = 5
                    r9 = r1
                L2f:
                    if (r2 < 0) goto L44
                    int r10 = r11 >> r2
                    r10 = r10 & r1
                    r7 = 6
                    short[] r3 = r8.f95412a
                    r7 = 1
                    short r3 = r3[r9]
                    r7 = 1
                    int r3 = com.badlogic.gdx.utils.compression.rangecoder.d.e(r3, r10)
                    int r0 = r0 + r3
                    int r9 = r9 << r1
                    r9 = r9 | r10
                    r7 = 4
                    goto L26
                L44:
                    r7 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.compression.lzma.c.C0849c.a.c(boolean, byte, byte):int");
            }

            public void d() {
                com.badlogic.gdx.utils.compression.rangecoder.d.j(this.f95412a);
            }
        }

        C0849c() {
        }

        public void a(int i10, int i11) {
            if (this.f95407a != null && this.f95408b == i11 && this.f95409c == i10) {
                return;
            }
            this.f95409c = i10;
            this.f95410d = (1 << i10) - 1;
            this.f95408b = i11;
            int i12 = 1 << (i11 + i10);
            this.f95407a = new a[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                this.f95407a[i13] = new a();
            }
        }

        public a b(int i10, byte b10) {
            a[] aVarArr = this.f95407a;
            int i11 = i10 & this.f95410d;
            int i12 = this.f95408b;
            return aVarArr[(i11 << i12) + ((b10 & 255) >>> (8 - i12))];
        }

        public void c() {
            int i10 = 1 << (this.f95408b + this.f95409c);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f95407a[i11].d();
            }
        }
    }

    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f95415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f95416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f95417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f95418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f95419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f95420g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f95421h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f95422i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f95423j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f95424k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f95425l;

        d() {
        }

        public boolean a() {
            return this.f95421h == 0;
        }

        public void b() {
            this.f95421h = -1;
            this.f95415b = false;
        }

        public void c() {
            this.f95421h = 0;
            this.f95415b = false;
        }
    }

    static {
        byte[] bArr = new byte[2048];
        f95365e0 = bArr;
        bArr[0] = 0;
        bArr[1] = 1;
        int i10 = 2;
        for (int i11 = 2; i11 < 22; i11++) {
            int i12 = 1 << ((i11 >> 1) - 1);
            int i13 = 0;
            while (i13 < i12) {
                f95365e0[i10] = (byte) i11;
                i13++;
                i10++;
            }
        }
    }

    public c() {
        for (int i10 = 0; i10 < 4096; i10++) {
            this.f95375d[i10] = new d();
        }
        for (int i11 = 0; i11 < 4; i11++) {
            this.f95384m[i11] = new com.badlogic.gdx.utils.compression.rangecoder.b(6);
        }
    }

    static int l(int i10) {
        if (i10 < 2048) {
            return f95365e0[i10];
        }
        return i10 < 2097152 ? f95365e0[i10 >> 10] + com.google.common.base.c.f116471x : f95365e0[i10 >> 20] + 40;
    }

    static int m(int i10) {
        if (i10 < 131072) {
            return f95365e0[i10 >> 6] + com.google.common.base.c.f116461n;
        }
        return i10 < 134217728 ? f95365e0[i10 >> 16] + 32 : f95365e0[i10 >> 26] + 52;
    }

    public boolean A(int i10) {
        if (i10 < 0 || i10 > 2) {
            return false;
        }
        int i11 = this.P;
        this.P = i10;
        if (this.f95376e != null && i11 != i10) {
            this.K = -1;
            this.f95376e = null;
        }
        return true;
    }

    public boolean B(int i10) {
        if (i10 >= 5 && i10 <= 273) {
            this.f95391t = i10;
            return true;
        }
        return false;
    }

    void C(OutputStream outputStream) {
        this.f95377f.l(outputStream);
    }

    void D(InputStream inputStream, OutputStream outputStream, long j10, long j11) {
        this.O = inputStream;
        this.N = false;
        f();
        C(outputStream);
        q();
        h();
        g();
        this.f95387p.e(this.f95391t - 1);
        this.f95387p.g(1 << this.F);
        this.f95388q.e(this.f95391t - 1);
        this.f95388q.g(1 << this.F);
        this.M = 0L;
    }

    void E(boolean z10) {
        this.Q = z10;
    }

    public void F(OutputStream outputStream) throws IOException {
        this.Y[0] = (byte) ((((this.F * 5) + this.H) * 9) + this.I);
        int i10 = 0;
        while (i10 < 4) {
            int i11 = i10 + 1;
            this.Y[i11] = (byte) (this.J >> (i10 * 8));
            i10 = i11;
        }
        outputStream.write(this.Y, 0, 5);
    }

    void G(int i10) throws IOException {
        if (this.Q) {
            this.f95377f.a(this.f95378g, (this.f95371a << 4) + i10, 1);
            this.f95377f.a(this.f95379h, this.f95371a, 0);
            this.f95371a = com.badlogic.gdx.utils.compression.lzma.a.e(this.f95371a);
            this.f95387p.a(this.f95377f, 0, i10);
            this.f95384m[com.badlogic.gdx.utils.compression.lzma.a.a(2)].a(this.f95377f, 63);
            this.f95377f.b(e.f41245c, 26);
            this.f95386o.d(this.f95377f, 15);
        }
    }

    int a(int i10) {
        this.f95395x = i10;
        d dVar = this.f95375d[i10];
        int i11 = dVar.f95420g;
        int i12 = dVar.f95421h;
        while (true) {
            d[] dVarArr = this.f95375d;
            if (dVarArr[i10].f95415b) {
                dVarArr[i11].b();
                d[] dVarArr2 = this.f95375d;
                int i13 = i11 - 1;
                dVarArr2[i11].f95420g = i13;
                d dVar2 = dVarArr2[i10];
                if (dVar2.f95416c) {
                    d dVar3 = dVarArr2[i13];
                    dVar3.f95415b = false;
                    dVar3.f95420g = dVar2.f95417d;
                    dVar3.f95421h = dVar2.f95418e;
                }
            }
            d[] dVarArr3 = this.f95375d;
            d dVar4 = dVarArr3[i11];
            int i14 = dVar4.f95421h;
            int i15 = dVar4.f95420g;
            dVar4.f95421h = i12;
            dVar4.f95420g = i10;
            if (i11 <= 0) {
                d dVar5 = dVarArr3[0];
                this.U = dVar5.f95421h;
                int i16 = dVar5.f95420g;
                this.f95396y = i16;
                return i16;
            }
            i10 = i11;
            i12 = i14;
            i11 = i15;
        }
    }

    void b() {
        this.f95371a = com.badlogic.gdx.utils.compression.lzma.a.b();
        this.f95373b = (byte) 0;
        for (int i10 = 0; i10 < 4; i10++) {
            this.f95374c[i10] = 0;
        }
    }

    boolean c(int i10, int i11) {
        return i10 < 33554432 && i11 >= (i10 << 7);
    }

    public void d(InputStream inputStream, OutputStream outputStream, long j10, long j11, com.badlogic.gdx.utils.compression.b bVar) throws IOException {
        this.R = false;
        try {
            D(inputStream, outputStream, j10, j11);
            while (true) {
                e(this.V, this.W, this.X);
                if (this.X[0]) {
                    v();
                    return;
                } else if (bVar != null) {
                    bVar.a(this.V[0], this.W[0]);
                }
            }
        } catch (Throwable th2) {
            v();
            throw th2;
        }
    }

    public void e(long[] jArr, long[] jArr2, boolean[] zArr) throws IOException {
        jArr[0] = 0;
        jArr2[0] = 0;
        zArr[0] = true;
        InputStream inputStream = this.O;
        if (inputStream != null) {
            this.f95376e.l(inputStream);
            this.f95376e.f();
            this.R = true;
            this.O = null;
        }
        if (this.N) {
            return;
        }
        this.N = true;
        long j10 = this.M;
        if (j10 == 0) {
            if (this.f95376e.e() == 0) {
                i((int) this.M);
                return;
            }
            s();
            this.f95377f.a(this.f95378g, (this.f95371a << 4) + (((int) this.M) & this.G), 0);
            this.f95371a = com.badlogic.gdx.utils.compression.lzma.a.d(this.f95371a);
            byte bC = this.f95376e.c(0 - this.f95394w);
            this.f95389r.b((int) this.M, this.f95373b).a(this.f95377f, bC);
            this.f95373b = bC;
            this.f95394w--;
            this.M++;
        }
        if (this.f95376e.e() == 0) {
            i((int) this.M);
            return;
        }
        while (true) {
            int iJ = j((int) this.M);
            int i10 = this.U;
            int i11 = ((int) this.M) & this.G;
            int i12 = (this.f95371a << 4) + i11;
            if (iJ == 1 && i10 == -1) {
                this.f95377f.a(this.f95378g, i12, 0);
                byte bC2 = this.f95376e.c(0 - this.f95394w);
                C0849c.a aVarB = this.f95389r.b((int) this.M, this.f95373b);
                if (com.badlogic.gdx.utils.compression.lzma.a.c(this.f95371a)) {
                    aVarB.a(this.f95377f, bC2);
                } else {
                    aVarB.b(this.f95377f, this.f95376e.c(((-1) - this.f95374c[0]) - this.f95394w), bC2);
                }
                this.f95373b = bC2;
                this.f95371a = com.badlogic.gdx.utils.compression.lzma.a.d(this.f95371a);
            } else {
                this.f95377f.a(this.f95378g, i12, 1);
                if (i10 < 4) {
                    this.f95377f.a(this.f95379h, this.f95371a, 1);
                    if (i10 == 0) {
                        this.f95377f.a(this.f95380i, this.f95371a, 0);
                        if (iJ == 1) {
                            this.f95377f.a(this.f95383l, i12, 0);
                        } else {
                            this.f95377f.a(this.f95383l, i12, 1);
                        }
                    } else {
                        this.f95377f.a(this.f95380i, this.f95371a, 1);
                        if (i10 == 1) {
                            this.f95377f.a(this.f95381j, this.f95371a, 0);
                        } else {
                            this.f95377f.a(this.f95381j, this.f95371a, 1);
                            this.f95377f.a(this.f95382k, this.f95371a, i10 - 2);
                        }
                    }
                    if (iJ == 1) {
                        this.f95371a = com.badlogic.gdx.utils.compression.lzma.a.g(this.f95371a);
                    } else {
                        this.f95388q.a(this.f95377f, iJ - 2, i11);
                        this.f95371a = com.badlogic.gdx.utils.compression.lzma.a.f(this.f95371a);
                    }
                    int i13 = this.f95374c[i10];
                    if (i10 != 0) {
                        while (i10 >= 1) {
                            int[] iArr = this.f95374c;
                            iArr[i10] = iArr[i10 - 1];
                            i10--;
                        }
                        this.f95374c[0] = i13;
                    }
                } else {
                    this.f95377f.a(this.f95379h, this.f95371a, 0);
                    this.f95371a = com.badlogic.gdx.utils.compression.lzma.a.e(this.f95371a);
                    this.f95387p.a(this.f95377f, iJ - 2, i11);
                    int i14 = i10 - 4;
                    int iL = l(i14);
                    this.f95384m[com.badlogic.gdx.utils.compression.lzma.a.a(iJ)].a(this.f95377f, iL);
                    if (iL >= 4) {
                        int i15 = iL >> 1;
                        int i16 = i15 - 1;
                        int i17 = ((iL & 1) | 2) << i16;
                        int i18 = i14 - i17;
                        if (iL < 14) {
                            com.badlogic.gdx.utils.compression.rangecoder.b.e(this.f95385n, (i17 - iL) - 1, this.f95377f, i16, i18);
                        } else {
                            this.f95377f.b(i18 >> 4, i15 - 5);
                            this.f95386o.d(this.f95377f, i18 & 15);
                            this.D++;
                        }
                    }
                    for (int i19 = 3; i19 >= 1; i19--) {
                        int[] iArr2 = this.f95374c;
                        iArr2[i19] = iArr2[i19 - 1];
                    }
                    this.f95374c[0] = i14;
                    this.f95372a0++;
                }
                this.f95373b = this.f95376e.c((iJ - 1) - this.f95394w);
            }
            int i20 = this.f95394w - iJ;
            this.f95394w = i20;
            this.M += (long) iJ;
            if (i20 == 0) {
                if (this.f95372a0 >= 128) {
                    h();
                }
                if (this.D >= 16) {
                    g();
                }
                jArr[0] = this.M;
                jArr2[0] = this.f95377f.h();
                if (this.f95376e.e() == 0) {
                    i((int) this.M);
                    return;
                } else if (this.M - j10 >= PlaybackStateCompat.H1) {
                    this.N = false;
                    zArr[0] = false;
                    return;
                }
            }
        }
    }

    void f() {
        if (this.f95376e == null) {
            com.badlogic.gdx.utils.compression.lz.a aVar = new com.badlogic.gdx.utils.compression.lz.a();
            aVar.r(this.P == 0 ? 2 : 4);
            this.f95376e = aVar;
        }
        this.f95389r.a(this.H, this.I);
        int i10 = this.J;
        if (i10 == this.K && this.L == this.f95391t) {
            return;
        }
        this.f95376e.m(i10, 4096, this.f95391t, 274);
        this.K = this.J;
        this.L = this.f95391t;
    }

    void g() {
        for (int i10 = 0; i10 < 16; i10++) {
            this.C[i10] = this.f95386o.f(i10);
        }
        this.D = 0;
    }

    void h() {
        for (int i10 = 4; i10 < 128; i10++) {
            int iL = l(i10);
            int i11 = (iL >> 1) - 1;
            int i12 = ((iL & 1) | 2) << i11;
            this.Z[i10] = com.badlogic.gdx.utils.compression.rangecoder.b.g(this.f95385n, (i12 - iL) - 1, i11, i10 - i12);
        }
        for (int i13 = 0; i13 < 4; i13++) {
            com.badlogic.gdx.utils.compression.rangecoder.b bVar = this.f95384m[i13];
            int i14 = i13 << 6;
            for (int i15 = 0; i15 < this.E; i15++) {
                this.A[i14 + i15] = bVar.b(i15);
            }
            for (int i16 = 14; i16 < this.E; i16++) {
                int[] iArr = this.A;
                int i17 = i14 + i16;
                iArr[i17] = iArr[i17] + (((i16 >> 1) - 5) << 6);
            }
            int i18 = i13 * 128;
            int i19 = 0;
            while (i19 < 4) {
                this.B[i18 + i19] = this.A[i14 + i19];
                i19++;
            }
            while (i19 < 128) {
                this.B[i18 + i19] = this.A[l(i19) + i14] + this.Z[i19];
                i19++;
            }
        }
        this.f95372a0 = 0;
    }

    void i(int i10) throws IOException {
        t();
        G(i10 & this.G);
        this.f95377f.c();
        this.f95377f.d();
    }

    /* JADX WARN: Code duplicated, block: B:158:0x041c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0532  */
    /* JADX WARN: Code duplicated, block: B:224:0x066c  */
    int j(int i10) throws IOException {
        int iS;
        int i11;
        int iD;
        int i12;
        int i13;
        int iF;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19;
        int i20;
        int i21;
        int[] iArr;
        int i22;
        int i23;
        int iF2;
        boolean z11;
        int i24 = i10;
        int i25 = this.f95395x;
        int i26 = this.f95396y;
        if (i25 != i26) {
            d dVar = this.f95375d[i26];
            int i27 = dVar.f95420g;
            int i28 = i27 - i26;
            this.U = dVar.f95421h;
            this.f95396y = i27;
            return i28;
        }
        int i29 = 0;
        this.f95395x = 0;
        this.f95396y = 0;
        if (this.f95397z) {
            iS = this.f95392u;
            this.f95397z = false;
        } else {
            iS = s();
        }
        int i30 = this.f95393v;
        boolean z12 = true;
        int i31 = 2;
        if (this.f95376e.e() + 1 < 2) {
            this.U = -1;
            return 1;
        }
        int i32 = 0;
        int i33 = 0;
        while (true) {
            if (i32 >= 4) {
                break;
            }
            int[] iArr2 = this.S;
            int i34 = this.f95374c[i32];
            iArr2[i32] = i34;
            this.T[i32] = this.f95376e.d(-1, i34, com.badlogic.gdx.utils.compression.lzma.a.A);
            int[] iArr3 = this.T;
            if (iArr3[i32] > iArr3[i33]) {
                i33 = i32;
            }
            i32++;
        }
        int i35 = this.T[i33];
        int i36 = this.f95391t;
        if (i35 >= i36) {
            this.U = i33;
            r(i35 - 1);
            return i35;
        }
        if (iS >= i36) {
            this.U = this.f95390s[i30 - 1] + 4;
            r(iS - 1);
            return iS;
        }
        byte bC = this.f95376e.c(-1);
        byte bC2 = this.f95376e.c((-2) - this.f95374c[0]);
        if (iS < 2 && bC != bC2 && this.T[i33] < 2) {
            this.U = -1;
            return 1;
        }
        d[] dVarArr = this.f95375d;
        d dVar2 = dVarArr[0];
        int i37 = this.f95371a;
        dVar2.f95414a = i37;
        int i38 = this.G & i24;
        int i39 = -2;
        dVarArr[1].f95419f = com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95378g[(i37 << 4) + i38]) + this.f95389r.b(i24, this.f95373b).c(!com.badlogic.gdx.utils.compression.lzma.a.c(this.f95371a), bC2, bC);
        this.f95375d[1].b();
        int iG = com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95378g[(this.f95371a << 4) + i38]);
        int iG2 = com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95379h[this.f95371a]) + iG;
        if (bC2 == bC) {
            int iO = o(this.f95371a, i38) + iG2;
            d dVar3 = this.f95375d[1];
            if (iO < dVar3.f95419f) {
                dVar3.f95419f = iO;
                dVar3.c();
            }
        }
        int i40 = this.T[i33];
        if (iS >= i40) {
            i40 = iS;
        }
        if (i40 < 2) {
            this.U = this.f95375d[1].f95421h;
            return 1;
        }
        d[] dVarArr2 = this.f95375d;
        dVarArr2[1].f95420g = 0;
        d dVar4 = dVarArr2[0];
        int[] iArr4 = this.S;
        dVar4.f95422i = iArr4[0];
        dVar4.f95423j = iArr4[1];
        dVar4.f95424k = iArr4[2];
        char c10 = 3;
        dVar4.f95425l = iArr4[3];
        int i41 = i40;
        while (true) {
            int i42 = i41 - 1;
            this.f95375d[i41].f95419f = f95364d0;
            if (i42 < 2) {
                break;
            }
            i24 = i10;
            i41 = i42;
            i39 = -2;
        }
        int i43 = 0;
        for (i11 = 4; i43 < i11; i11 = 4) {
            int i44 = this.T[i43];
            if (i44 < 2) {
                z11 = z12;
            } else {
                int iN = n(i43, this.f95371a, i38) + iG2;
                while (true) {
                    int iD2 = this.f95388q.d(i44 - 2, i38) + iN;
                    d dVar5 = this.f95375d[i44];
                    z11 = z12;
                    if (iD2 < dVar5.f95419f) {
                        dVar5.f95419f = iD2;
                        dVar5.f95420g = 0;
                        dVar5.f95421h = i43;
                        dVar5.f95415b = false;
                    }
                    i44--;
                    if (i44 < 2) {
                        break;
                    }
                    z12 = z11;
                }
            }
            i43++;
            c10 = c10;
            z12 = z11;
        }
        boolean z13 = z12;
        char c11 = c10;
        int iF3 = iG + com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95379h[this.f95371a]);
        int i45 = this.T[0];
        int i46 = i45 >= 2 ? i45 + 1 : 2;
        if (i46 <= iS) {
            int i47 = 0;
            while (i46 > this.f95390s[i47]) {
                i47 += 2;
            }
            while (true) {
                int i48 = this.f95390s[i47 + 1];
                int iK = k(i48, i46, i38) + iF3;
                d dVar6 = this.f95375d[i46];
                if (iK < dVar6.f95419f) {
                    dVar6.f95419f = iK;
                    dVar6.f95420g = 0;
                    dVar6.f95421h = i48 + 4;
                    dVar6.f95415b = false;
                }
                if (i46 == this.f95390s[i47] && (i47 = i47 + 2) == i30) {
                    break;
                }
                i46++;
            }
        }
        int i49 = 0;
        while (true) {
            i49++;
            if (i49 == i40) {
                return a(i49);
            }
            int iS2 = s();
            int i50 = this.f95393v;
            if (iS2 >= this.f95391t) {
                this.f95392u = iS2;
                this.f95397z = z13;
                return a(i49);
            }
            int i51 = i24 + 1;
            d[] dVarArr3 = this.f95375d;
            d dVar7 = dVarArr3[i49];
            int i52 = dVar7.f95420g;
            if (dVar7.f95415b) {
                i52--;
                if (dVar7.f95416c) {
                    int i53 = dVarArr3[dVar7.f95417d].f95414a;
                    iF2 = dVar7.f95418e < 4 ? com.badlogic.gdx.utils.compression.lzma.a.f(i53) : com.badlogic.gdx.utils.compression.lzma.a.e(i53);
                } else {
                    iF2 = dVarArr3[i52].f95414a;
                }
                iD = com.badlogic.gdx.utils.compression.lzma.a.d(iF2);
            } else {
                iD = dVarArr3[i52].f95414a;
            }
            if (i52 == i49) {
                iF = this.f95375d[i49].a() ? com.badlogic.gdx.utils.compression.lzma.a.g(iD) : com.badlogic.gdx.utils.compression.lzma.a.d(iD);
            } else {
                d dVar8 = this.f95375d[i49];
                if (dVar8.f95415b && dVar8.f95416c) {
                    i52 = dVar8.f95417d;
                    i12 = dVar8.f95418e;
                    iF = com.badlogic.gdx.utils.compression.lzma.a.f(iD);
                    i13 = 4;
                } else {
                    i12 = dVar8.f95421h;
                    i13 = 4;
                    iF = i12 < 4 ? com.badlogic.gdx.utils.compression.lzma.a.f(iD) : com.badlogic.gdx.utils.compression.lzma.a.e(iD);
                }
                d dVar9 = this.f95375d[i52];
                if (i12 >= i13) {
                    int[] iArr5 = this.S;
                    iArr5[i29] = i12 - 4;
                    iArr5[1] = dVar9.f95422i;
                    iArr5[i31] = dVar9.f95423j;
                    iArr5[c11] = dVar9.f95424k;
                } else if (i12 == 0) {
                    int[] iArr6 = this.S;
                    iArr6[i29] = dVar9.f95422i;
                    iArr6[1] = dVar9.f95423j;
                    iArr6[i31] = dVar9.f95424k;
                    iArr6[c11] = dVar9.f95425l;
                } else if (i12 == 1) {
                    int[] iArr7 = this.S;
                    iArr7[i29] = dVar9.f95423j;
                    iArr7[1] = dVar9.f95422i;
                    iArr7[i31] = dVar9.f95424k;
                    iArr7[c11] = dVar9.f95425l;
                } else if (i12 == i31) {
                    int[] iArr8 = this.S;
                    iArr8[i29] = dVar9.f95424k;
                    iArr8[1] = dVar9.f95422i;
                    iArr8[i31] = dVar9.f95423j;
                    iArr8[c11] = dVar9.f95425l;
                } else {
                    int[] iArr9 = this.S;
                    iArr9[i29] = dVar9.f95425l;
                    iArr9[1] = dVar9.f95422i;
                    iArr9[i31] = dVar9.f95423j;
                    iArr9[c11] = dVar9.f95424k;
                }
            }
            d dVar10 = this.f95375d[i49];
            dVar10.f95414a = iF;
            int[] iArr10 = this.S;
            dVar10.f95422i = iArr10[i29];
            dVar10.f95423j = iArr10[1];
            dVar10.f95424k = iArr10[i31];
            dVar10.f95425l = iArr10[c11];
            int i54 = dVar10.f95419f;
            byte bC3 = this.f95376e.c(-1);
            byte bC4 = this.f95376e.c((-2) - this.S[i29]);
            int i55 = this.G & i51;
            int i56 = (iF << 4) + i55;
            int i57 = i29;
            int i58 = i24;
            int iF4 = com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95378g[i56]) + i54 + this.f95389r.b(i51, this.f95376e.c(i39)).c(!com.badlogic.gdx.utils.compression.lzma.a.c(iF), bC4, bC3);
            int i59 = i49 + 2;
            d dVar11 = this.f95375d[i59];
            if (iF4 < dVar11.f95419f) {
                dVar11.f95419f = iF4;
                dVar11.f95420g = i49;
                dVar11.b();
                i14 = 1;
            } else {
                i14 = i57;
            }
            int iG3 = i54 + com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95378g[i56]);
            int iG4 = com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95379h[iF]) + iG3;
            if (bC4 != bC3 || (dVar11.f95420g < i49 && dVar11.f95421h == 0)) {
                i15 = i40;
            } else {
                int iO2 = iG4 + o(iF, i55);
                i15 = i40;
                if (iO2 <= dVar11.f95419f) {
                    dVar11.f95419f = iO2;
                    dVar11.f95420g = i49;
                    dVar11.c();
                    i14 = 1;
                }
            }
            int iMin = Math.min(4095 - i49, this.f95376e.e() + 1);
            if (iMin < 2) {
                i31 = 2;
                i24 = i51;
                i29 = i57;
                i40 = i15;
                i39 = -2;
                z13 = true;
            } else {
                int i60 = this.f95391t;
                int i61 = iMin > i60 ? i60 : iMin;
                if (i14 != 0 || bC4 == bC3) {
                    i16 = i50;
                    i17 = i51;
                } else {
                    int iD3 = this.f95376e.d(i57, this.S[i57], Math.min(iMin - 1, i60));
                    if (iD3 >= 2) {
                        int iD4 = com.badlogic.gdx.utils.compression.lzma.a.d(iF);
                        int i62 = (i58 + 2) & this.G;
                        int iG5 = iF4 + com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95378g[(iD4 << 4) + i62]) + com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95379h[iD4]);
                        int i63 = i59 + iD3;
                        i16 = i50;
                        while (true) {
                            i23 = i15;
                            if (i23 >= i63) {
                                break;
                            }
                            i15 = i23 + 1;
                            this.f95375d[i15].f95419f = f95364d0;
                            i51 = i51;
                        }
                        i15 = i23;
                        i17 = i51;
                        int iP = iG5 + p(0, iD3, iD4, i62);
                        d dVar12 = this.f95375d[i63];
                        if (iP < dVar12.f95419f) {
                            dVar12.f95419f = iP;
                            dVar12.f95420g = i59;
                            dVar12.f95421h = 0;
                            dVar12.f95415b = true;
                            dVar12.f95416c = false;
                        }
                    } else {
                        i16 = i50;
                        i17 = i51;
                    }
                }
                int i64 = 2;
                int i65 = 0;
                while (i65 < 4) {
                    int iD5 = this.f95376e.d(-1, this.S[i65], i61);
                    if (iD5 >= 2) {
                        int i66 = iD5;
                        int i67 = i15;
                        while (true) {
                            int i68 = i49 + i66;
                            if (i67 >= i68) {
                                int iP2 = iG4 + p(i65, i66, iF, i55);
                                d dVar13 = this.f95375d[i68];
                                if (iP2 < dVar13.f95419f) {
                                    dVar13.f95419f = iP2;
                                    dVar13.f95420g = i49;
                                    dVar13.f95421h = i65;
                                    dVar13.f95415b = false;
                                }
                                i66--;
                                if (i66 < 2) {
                                    break;
                                }
                            } else {
                                i67++;
                                this.f95375d[i67].f95419f = f95364d0;
                            }
                        }
                        if (i65 == 0) {
                            i64 = iD5 + 1;
                        }
                        if (iD5 < iMin) {
                            int iD6 = this.f95376e.d(iD5, this.S[i65], Math.min((iMin - 1) - iD5, this.f95391t));
                            if (iD6 >= 2) {
                                int iF5 = com.badlogic.gdx.utils.compression.lzma.a.f(iF);
                                int i69 = i17 + iD5;
                                int i70 = i64;
                                int iP3 = iG4 + p(i65, iD5, iF, i55) + com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95378g[(iF5 << 4) + (this.G & i69)]);
                                int i71 = iD5 - 1;
                                int i72 = i67;
                                int iC = iP3 + this.f95389r.b(i69, this.f95376e.c(iD5 - 2)).c(true, this.f95376e.c(i71 - (this.S[i65] + 1)), this.f95376e.c(i71));
                                int iD7 = com.badlogic.gdx.utils.compression.lzma.a.d(iF5);
                                int i73 = this.G & (i69 + 1);
                                int iG6 = iC + com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95378g[(iD7 << 4) + i73]) + com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95379h[iD7]);
                                int i74 = iD5 + 1 + iD6;
                                int i75 = i72;
                                while (true) {
                                    i22 = i49 + i74;
                                    if (i75 >= i22) {
                                        break;
                                    }
                                    i75++;
                                    this.f95375d[i75].f95419f = f95364d0;
                                }
                                int iP4 = iG6 + p(0, iD6, iD7, i73);
                                d dVar14 = this.f95375d[i22];
                                if (iP4 < dVar14.f95419f) {
                                    dVar14.f95419f = iP4;
                                    dVar14.f95420g = i49 + iD5 + 1;
                                    dVar14.f95421h = 0;
                                    dVar14.f95415b = true;
                                    dVar14.f95416c = true;
                                    dVar14.f95417d = i49;
                                    dVar14.f95418e = i65;
                                }
                                i15 = i75;
                                i64 = i70;
                            } else {
                                i64 = i64;
                                i15 = i67;
                            }
                        } else {
                            i64 = i64;
                            i15 = i67;
                        }
                    }
                    i65++;
                    iF = iF;
                }
                int i76 = iF;
                if (iS2 > i61) {
                    int i77 = 0;
                    while (true) {
                        iArr = this.f95390s;
                        if (i61 <= iArr[i77]) {
                            break;
                        }
                        i77 += 2;
                    }
                    iArr[i77] = i61;
                    i18 = i77 + 2;
                    iS2 = i61;
                } else {
                    i18 = i16;
                }
                if (iS2 >= i64) {
                    int iF6 = iG3 + com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95379h[i76]);
                    int i78 = i15;
                    while (i78 < i49 + iS2) {
                        i78++;
                        this.f95375d[i78].f95419f = f95364d0;
                    }
                    int i79 = 0;
                    while (i64 > this.f95390s[i79]) {
                        i79 += 2;
                    }
                    while (true) {
                        int i80 = this.f95390s[i79 + 1];
                        int iK2 = k(i80, i64, i55) + iF6;
                        int i81 = i49 + i64;
                        d dVar15 = this.f95375d[i81];
                        if (iK2 < dVar15.f95419f) {
                            dVar15.f95419f = iK2;
                            dVar15.f95420g = i49;
                            dVar15.f95421h = i80 + 4;
                            dVar15.f95415b = false;
                        }
                        if (i64 == this.f95390s[i79]) {
                            if (i64 < iMin) {
                                int iD8 = this.f95376e.d(i64, i80, Math.min((iMin - 1) - i64, this.f95391t));
                                if (iD8 >= 2) {
                                    int iE = com.badlogic.gdx.utils.compression.lzma.a.e(i76);
                                    int i82 = i17 + i64;
                                    i20 = i64;
                                    int i83 = i78;
                                    int iF7 = iK2 + com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95378g[(iE << 4) + (this.G & i82)]) + this.f95389r.b(i82, this.f95376e.c(i20 - 2)).c(true, this.f95376e.c((i20 - (i80 + 1)) - 1), this.f95376e.c(i20 - 1));
                                    int iD9 = com.badlogic.gdx.utils.compression.lzma.a.d(iE);
                                    int i84 = this.G & (i82 + 1);
                                    int iG7 = iF7 + com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95378g[(iD9 << 4) + i84]) + com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95379h[iD9]);
                                    int i85 = i20 + 1 + iD8;
                                    int i86 = i83;
                                    while (true) {
                                        i21 = i49 + i85;
                                        if (i86 >= i21) {
                                            break;
                                        }
                                        i86++;
                                        this.f95375d[i86].f95419f = f95364d0;
                                    }
                                    i19 = 0;
                                    int iP5 = iG7 + p(0, iD8, iD9, i84);
                                    d dVar16 = this.f95375d[i21];
                                    if (iP5 < dVar16.f95419f) {
                                        dVar16.f95419f = iP5;
                                        dVar16.f95420g = i81 + 1;
                                        dVar16.f95421h = 0;
                                        z10 = true;
                                        dVar16.f95415b = true;
                                        dVar16.f95416c = true;
                                        dVar16.f95417d = i49;
                                        dVar16.f95418e = i80 + 4;
                                    } else {
                                        z10 = true;
                                    }
                                    i78 = i86;
                                } else {
                                    i20 = i64;
                                    z10 = true;
                                    i19 = 0;
                                    i78 = i78;
                                }
                            } else {
                                i20 = i64;
                                z10 = true;
                                i19 = 0;
                                i78 = i78;
                            }
                            i79 += 2;
                            if (i79 == i18) {
                                break;
                            }
                        } else {
                            iMin = iMin;
                            i20 = i64;
                        }
                        i64 = i20 + 1;
                        iMin = iMin;
                    }
                    i40 = i78;
                } else {
                    z10 = true;
                    i19 = 0;
                    i40 = i15;
                }
                i24 = i17;
                z13 = z10;
                i29 = i19;
                i31 = 2;
                i39 = -2;
            }
        }
    }

    int k(int i10, int i11, int i12) {
        int i13;
        int iA = com.badlogic.gdx.utils.compression.lzma.a.a(i11);
        if (i10 < 128) {
            i13 = this.B[(iA * 128) + i10];
        } else {
            i13 = this.C[i10 & 15] + this.A[(iA << 6) + m(i10)];
        }
        return i13 + this.f95387p.d(i11 - 2, i12);
    }

    int n(int i10, int i11, int i12) {
        int iE;
        if (i10 == 0) {
            return com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95380i[i11]) + com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95383l[(i11 << 4) + i12]);
        }
        int iG = com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95380i[i11]);
        if (i10 == 1) {
            iE = com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95381j[i11]);
        } else {
            iG += com.badlogic.gdx.utils.compression.rangecoder.d.g(this.f95381j[i11]);
            iE = com.badlogic.gdx.utils.compression.rangecoder.d.e(this.f95382k[i11], i10 - 2);
        }
        return iG + iE;
    }

    int o(int i10, int i11) {
        return com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95380i[i10]) + com.badlogic.gdx.utils.compression.rangecoder.d.f(this.f95383l[(i10 << 4) + i11]);
    }

    int p(int i10, int i11, int i12, int i13) {
        return this.f95388q.d(i11 - 2, i13) + n(i10, i12, i13);
    }

    void q() {
        b();
        this.f95377f.i();
        com.badlogic.gdx.utils.compression.rangecoder.d.j(this.f95378g);
        com.badlogic.gdx.utils.compression.rangecoder.d.j(this.f95383l);
        com.badlogic.gdx.utils.compression.rangecoder.d.j(this.f95379h);
        com.badlogic.gdx.utils.compression.rangecoder.d.j(this.f95380i);
        com.badlogic.gdx.utils.compression.rangecoder.d.j(this.f95381j);
        com.badlogic.gdx.utils.compression.rangecoder.d.j(this.f95382k);
        com.badlogic.gdx.utils.compression.rangecoder.d.j(this.f95385n);
        this.f95389r.c();
        int i10 = 2 << 0;
        for (int i11 = 0; i11 < 4; i11++) {
            this.f95384m[i11].c();
        }
        this.f95387p.b(1 << this.F);
        this.f95388q.b(1 << this.F);
        this.f95386o.c();
        this.f95397z = false;
        this.f95395x = 0;
        this.f95396y = 0;
        this.f95394w = 0;
    }

    void r(int i10) throws IOException {
        if (i10 > 0) {
            this.f95376e.s(i10);
            this.f95394w += i10;
        }
    }

    int s() throws IOException {
        int iD;
        int iN = this.f95376e.n(this.f95390s);
        this.f95393v = iN;
        if (iN > 0) {
            int[] iArr = this.f95390s;
            iD = iArr[iN - 2];
            if (iD == this.f95391t) {
                iD += this.f95376e.d(iD - 1, iArr[iN - 1], 273 - iD);
            }
        } else {
            iD = 0;
        }
        this.f95394w++;
        return iD;
    }

    void t() {
        com.badlogic.gdx.utils.compression.lz.a aVar = this.f95376e;
        if (aVar == null || !this.R) {
            return;
        }
        aVar.k();
        this.R = false;
    }

    void u() {
        this.f95377f.k();
    }

    void v() {
        t();
        u();
    }

    public boolean w(int i10) {
        return true;
    }

    public boolean x(int i10) {
        int i11 = 0;
        if (i10 < 1 || i10 > 536870912) {
            return false;
        }
        this.J = i10;
        while (i10 > (1 << i11)) {
            i11++;
        }
        this.E = i11 * 2;
        return true;
    }

    public void y(boolean z10) {
        this.Q = z10;
    }

    public boolean z(int i10, int i11, int i12) {
        if (i11 < 0 || i11 > 4 || i10 < 0 || i10 > 8 || i12 < 0 || i12 > 4) {
            return false;
        }
        this.H = i11;
        this.I = i10;
        this.F = i12;
        this.G = (1 << i12) - 1;
        return true;
    }
}
