package com.badlogic.gdx.utils.compression.lzma;

import com.google.android.material.internal.p0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.badlogic.gdx.utils.compression.lz.c f95332a = new com.badlogic.gdx.utils.compression.lz.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.badlogic.gdx.utils.compression.rangecoder.c f95333b = new com.badlogic.gdx.utils.compression.rangecoder.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    short[] f95334c = new short[192];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    short[] f95335d = new short[12];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    short[] f95336e = new short[12];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    short[] f95337f = new short[12];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    short[] f95338g = new short[12];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    short[] f95339h = new short[192];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.badlogic.gdx.utils.compression.rangecoder.a[] f95340i = new com.badlogic.gdx.utils.compression.rangecoder.a[4];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    short[] f95341j = new short[114];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    com.badlogic.gdx.utils.compression.rangecoder.a f95342k = new com.badlogic.gdx.utils.compression.rangecoder.a(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    a f95343l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    a f95344m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    C0848b f95345n = new C0848b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f95346o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f95347p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f95348q;

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        short[] f95349a = new short[2];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.badlogic.gdx.utils.compression.rangecoder.a[] f95350b = new com.badlogic.gdx.utils.compression.rangecoder.a[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.badlogic.gdx.utils.compression.rangecoder.a[] f95351c = new com.badlogic.gdx.utils.compression.rangecoder.a[16];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.badlogic.gdx.utils.compression.rangecoder.a f95352d = new com.badlogic.gdx.utils.compression.rangecoder.a(8);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f95353e = 0;

        a() {
        }

        public void a(int i10) {
            while (true) {
                int i11 = this.f95353e;
                if (i11 >= i10) {
                    return;
                }
                this.f95350b[i11] = new com.badlogic.gdx.utils.compression.rangecoder.a(3);
                this.f95351c[this.f95353e] = new com.badlogic.gdx.utils.compression.rangecoder.a(3);
                this.f95353e++;
            }
        }

        public int b(com.badlogic.gdx.utils.compression.rangecoder.c cVar, int i10) throws IOException {
            if (cVar.a(this.f95349a, 0) == 0) {
                return this.f95350b[i10].a(cVar);
            }
            return cVar.a(this.f95349a, 1) == 0 ? this.f95351c[i10].a(cVar) + 8 : this.f95352d.a(cVar) + 16;
        }

        public void c() {
            com.badlogic.gdx.utils.compression.rangecoder.c.d(this.f95349a);
            for (int i10 = 0; i10 < this.f95353e; i10++) {
                this.f95350b[i10].b();
                this.f95351c[i10].b();
            }
            this.f95352d.b();
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.utils.compression.lzma.b$b, reason: collision with other inner class name */
    class C0848b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a[] f95355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f95356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f95357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95358d;

        /* JADX INFO: renamed from: com.badlogic.gdx.utils.compression.lzma.b$b$a */
        class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            short[] f95360a = new short[p0.f112892a];

            a() {
            }

            public byte a(com.badlogic.gdx.utils.compression.rangecoder.c cVar) throws IOException {
                int iA = 1;
                do {
                    iA = cVar.a(this.f95360a, iA) | (iA << 1);
                } while (iA < 256);
                return (byte) iA;
            }

            public byte b(com.badlogic.gdx.utils.compression.rangecoder.c cVar, byte b10) throws IOException {
                int iA = 1;
                do {
                    int i10 = (b10 >> 7) & 1;
                    b10 = (byte) (b10 << 1);
                    int iA2 = cVar.a(this.f95360a, ((i10 + 1) << 8) + iA);
                    iA = (iA << 1) | iA2;
                    if (i10 != iA2) {
                        while (iA < 256) {
                            iA = (iA << 1) | cVar.a(this.f95360a, iA);
                        }
                        break;
                    }
                } while (iA < 256);
                return (byte) iA;
            }

            public void c() {
                com.badlogic.gdx.utils.compression.rangecoder.c.d(this.f95360a);
            }
        }

        C0848b() {
        }

        public void a(int i10, int i11) {
            if (this.f95355a == null || this.f95356b != i11 || this.f95357c != i10) {
                this.f95357c = i10;
                this.f95358d = (1 << i10) - 1;
                this.f95356b = i11;
                int i12 = 1 << (i11 + i10);
                this.f95355a = new a[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    this.f95355a[i13] = new a();
                }
            }
        }

        a b(int i10, byte b10) {
            a[] aVarArr = this.f95355a;
            int i11 = i10 & this.f95358d;
            int i12 = this.f95356b;
            return aVarArr[(i11 << i12) + ((b10 & 255) >>> (8 - i12))];
        }

        public void c() {
            int i10 = 1 << (this.f95356b + this.f95357c);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f95355a[i11].c();
            }
        }
    }

    public b() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f95340i[i10] = new com.badlogic.gdx.utils.compression.rangecoder.a(6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    public boolean a(InputStream inputStream, OutputStream outputStream, long j10) throws IOException {
        int iB;
        byte bD;
        this.f95333b.f(inputStream);
        this.f95332a.h(outputStream);
        b();
        int iB2 = com.badlogic.gdx.utils.compression.lzma.a.b();
        long j11 = 0;
        byte b10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j12 = 0;
        while (true) {
            int iB3 = 1;
            if (j10 >= j11 && j12 >= j10) {
                break;
            }
            int i14 = (int) j12;
            int i15 = this.f95348q & i14;
            int i16 = (iB2 << 4) + i15;
            if (this.f95333b.a(this.f95334c, i16) == 0) {
                C0848b.a aVarB = this.f95345n.b(i14, b10);
                bD = !com.badlogic.gdx.utils.compression.lzma.a.c(iB2) ? aVarB.b(this.f95333b, this.f95332a.d(i12)) : aVarB.a(this.f95333b);
                this.f95332a.f(bD);
                iB2 = com.badlogic.gdx.utils.compression.lzma.a.d(iB2);
                j12++;
            } else {
                if (this.f95333b.a(this.f95335d, iB2) == 1) {
                    if (this.f95333b.a(this.f95336e, iB2) == 0) {
                        if (this.f95333b.a(this.f95339h, i16) == 0) {
                            iB2 = com.badlogic.gdx.utils.compression.lzma.a.g(iB2);
                        }
                        if (iB3 == 0) {
                            iB3 = this.f95344m.b(this.f95333b, i15) + 2;
                            iB2 = com.badlogic.gdx.utils.compression.lzma.a.f(iB2);
                        }
                    } else {
                        if (this.f95333b.a(this.f95337f, iB2) != 0) {
                            if (this.f95333b.a(this.f95338g, iB2) == 0) {
                                int i17 = i13;
                                i13 = i10;
                                i10 = i17;
                            }
                            int i18 = i13;
                            i13 = i10;
                            i10 = i11;
                            i11 = i18;
                        }
                        int i19 = i12;
                        i12 = i11;
                        i11 = i19;
                    }
                    iB3 = 0;
                    if (iB3 == 0) {
                        iB3 = this.f95344m.b(this.f95333b, i15) + 2;
                        iB2 = com.badlogic.gdx.utils.compression.lzma.a.f(iB2);
                    }
                } else {
                    int iB4 = this.f95343l.b(this.f95333b, i15) + 2;
                    iB2 = com.badlogic.gdx.utils.compression.lzma.a.e(iB2);
                    int iA = this.f95340i[com.badlogic.gdx.utils.compression.lzma.a.a(iB4)].a(this.f95333b);
                    if (iA >= 4) {
                        int i20 = iA >> 1;
                        int i21 = i20 - 1;
                        int i22 = ((iA & 1) | 2) << i21;
                        if (iA >= 14) {
                            iB = i22 + (this.f95333b.b(i20 - 5) << 4) + this.f95342k.c(this.f95333b);
                            if (iB < 0) {
                                if (iB == -1) {
                                    break;
                                }
                                return false;
                            }
                        } else {
                            iB = i22 + com.badlogic.gdx.utils.compression.rangecoder.a.d(this.f95341j, (i22 - iA) - 1, this.f95333b, i21);
                        }
                        iB3 = iB4;
                        i13 = i10;
                        i10 = i11;
                        i11 = i12;
                        i12 = iB;
                    } else {
                        iB3 = iB4;
                        i13 = i10;
                        i10 = i11;
                        i11 = i12;
                        i12 = iA;
                    }
                }
                if (i12 >= j12 || i12 >= this.f95347p) {
                    return false;
                }
                this.f95332a.a(i12, iB3);
                j12 += (long) iB3;
                bD = this.f95332a.d(0);
            }
            b10 = bD;
            j11 = 0;
        }
        this.f95332a.c();
        this.f95332a.g();
        this.f95333b.e();
        return true;
    }

    void b() throws IOException {
        this.f95332a.e(false);
        com.badlogic.gdx.utils.compression.rangecoder.c.d(this.f95334c);
        com.badlogic.gdx.utils.compression.rangecoder.c.d(this.f95339h);
        com.badlogic.gdx.utils.compression.rangecoder.c.d(this.f95335d);
        com.badlogic.gdx.utils.compression.rangecoder.c.d(this.f95336e);
        com.badlogic.gdx.utils.compression.rangecoder.c.d(this.f95337f);
        com.badlogic.gdx.utils.compression.rangecoder.c.d(this.f95338g);
        com.badlogic.gdx.utils.compression.rangecoder.c.d(this.f95341j);
        this.f95345n.c();
        for (int i10 = 0; i10 < 4; i10++) {
            this.f95340i[i10].b();
        }
        this.f95343l.c();
        this.f95344m.c();
        this.f95342k.b();
        this.f95333b.c();
    }

    public boolean c(byte[] bArr) {
        if (bArr.length < 5) {
            return false;
        }
        int i10 = bArr[0] & 255;
        int i11 = i10 % 9;
        int i12 = i10 / 9;
        int i13 = i12 % 5;
        int i14 = i12 / 5;
        int i15 = 0;
        int i16 = 0;
        while (i15 < 4) {
            int i17 = i15 + 1;
            i16 += (bArr[i17] & 255) << (i15 * 8);
            i15 = i17;
        }
        if (e(i11, i13, i14)) {
            return d(i16);
        }
        return false;
    }

    boolean d(int i10) {
        if (i10 < 0) {
            return false;
        }
        if (this.f95346o != i10) {
            this.f95346o = i10;
            int iMax = Math.max(i10, 1);
            this.f95347p = iMax;
            this.f95332a.b(Math.max(iMax, 4096));
        }
        return true;
    }

    boolean e(int i10, int i11, int i12) {
        if (i10 <= 8 && i11 <= 4 && i12 <= 4) {
            this.f95345n.a(i11, i10);
            int i13 = 1 << i12;
            this.f95343l.a(i13);
            this.f95344m.a(i13);
            this.f95348q = i13 - 1;
            return true;
        }
        return false;
    }
}
