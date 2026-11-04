package androidx.media3.exoplayer.source;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class p1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f65282h = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f65283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f65284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f65285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f65286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f65287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f65288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f65289g;

    private static final class a implements androidx.media3.exoplayer.upstream.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f65290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f65291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public androidx.media3.exoplayer.upstream.a f65292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public a f65293d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // androidx.media3.exoplayer.upstream.b.a
        public androidx.media3.exoplayer.upstream.a a() {
            return (androidx.media3.exoplayer.upstream.a) androidx.media3.common.util.a.g(this.f65292c);
        }

        public a b() {
            this.f65292c = null;
            a aVar = this.f65293d;
            this.f65293d = null;
            return aVar;
        }

        public void c(androidx.media3.exoplayer.upstream.a aVar, a aVar2) {
            this.f65292c = aVar;
            this.f65293d = aVar2;
        }

        public void d(long j10, int i10) {
            androidx.media3.common.util.a.i(this.f65292c == null);
            this.f65290a = j10;
            this.f65291b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f65290a)) + this.f65292c.f65840b;
        }

        @Override // androidx.media3.exoplayer.upstream.b.a
        @androidx.annotation.p0
        public androidx.media3.exoplayer.upstream.b.a next() {
            a aVar = this.f65293d;
            if (aVar == null || aVar.f65292c == null) {
                return null;
            }
            return aVar;
        }
    }

    public p1(androidx.media3.exoplayer.upstream.b bVar) {
        this.f65283a = bVar;
        int iD = bVar.d();
        this.f65284b = iD;
        this.f65285c = new androidx.media3.common.util.o0(32);
        a aVar = new a(0L, iD);
        this.f65286d = aVar;
        this.f65287e = aVar;
        this.f65288f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f65292c == null) {
            return;
        }
        this.f65283a.e(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f65291b) {
            aVar = aVar.f65293d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f65289g + ((long) i10);
        this.f65289g = j10;
        a aVar = this.f65288f;
        if (j10 == aVar.f65291b) {
            this.f65288f = aVar.f65293d;
        }
    }

    private int h(int i10) {
        a aVar = this.f65288f;
        if (aVar.f65292c == null) {
            aVar.c(this.f65283a.c(), new a(this.f65288f.f65291b, this.f65284b));
        }
        return Math.min(i10, (int) (this.f65288f.f65291b - this.f65289g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarD = d(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarD.f65291b - j10));
            byteBuffer.put(aVarD.f65292c.f65839a, aVarD.e(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f65291b) {
                aVarD = aVarD.f65293d;
            }
        }
        return aVarD;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a aVarD = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarD.f65291b - j10));
            System.arraycopy(aVarD.f65292c.f65839a, aVarD.e(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f65291b) {
                aVarD = aVarD.f65293d;
            }
        }
        return aVarD;
    }

    private static a k(a aVar, androidx.media3.decoder.g gVar, r1.b bVar, androidx.media3.common.util.o0 o0Var) {
        long j10 = bVar.f65455b;
        int iT = 1;
        o0Var.W(1);
        a aVarJ = j(aVar, j10, o0Var.e(), 1);
        long j11 = j10 + 1;
        byte b10 = o0Var.e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        androidx.media3.decoder.d dVar = gVar.f62699c;
        byte[] bArr = dVar.f62683a;
        if (bArr == null) {
            dVar.f62683a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j11, dVar.f62683a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            o0Var.W(2);
            aVarJ2 = j(aVarJ2, j12, o0Var.e(), 2);
            j12 += 2;
            iT = o0Var.T();
        }
        int i11 = iT;
        int[] iArr = dVar.f62686d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = dVar.f62687e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            o0Var.W(i12);
            aVarJ2 = j(aVarJ2, j12, o0Var.e(), i12);
            j12 += (long) i12;
            o0Var.a0(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = o0Var.T();
                iArr4[i13] = o0Var.P();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f65454a - ((int) (j12 - bVar.f65455b));
        }
        androidx.media3.extractor.u0.a aVar2 = (androidx.media3.extractor.u0.a) androidx.media3.common.util.k1.o(bVar.f65456c);
        dVar.c(i11, iArr2, iArr4, aVar2.f69558b, dVar.f62683a, aVar2.f69557a, aVar2.f69559c, aVar2.f69560d);
        long j13 = bVar.f65455b;
        int i14 = (int) (j12 - j13);
        bVar.f65455b = j13 + ((long) i14);
        bVar.f65454a -= i14;
        return aVarJ2;
    }

    private static a l(a aVar, androidx.media3.decoder.g gVar, r1.b bVar, androidx.media3.common.util.o0 o0Var) {
        if (gVar.I()) {
            aVar = k(aVar, gVar, bVar, o0Var);
        }
        if (!gVar.r()) {
            gVar.E(bVar.f65454a);
            return i(aVar, bVar.f65455b, gVar.f62700d, bVar.f65454a);
        }
        o0Var.W(4);
        a aVarJ = j(aVar, bVar.f65455b, o0Var.e(), 4);
        int iP = o0Var.P();
        bVar.f65455b += 4;
        bVar.f65454a -= 4;
        gVar.E(iP);
        a aVarI = i(aVarJ, bVar.f65455b, gVar.f62700d, iP);
        bVar.f65455b += (long) iP;
        int i10 = bVar.f65454a - iP;
        bVar.f65454a = i10;
        gVar.M(i10);
        return i(aVarI, bVar.f65455b, gVar.f62703g, bVar.f65454a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f65286d;
            if (j10 < aVar.f65291b) {
                break;
            }
            this.f65283a.f(aVar.f65292c);
            this.f65286d = this.f65286d.b();
        }
        if (this.f65287e.f65290a < aVar.f65290a) {
            this.f65287e = aVar;
        }
    }

    public void c(long j10) {
        androidx.media3.common.util.a.a(j10 <= this.f65289g);
        this.f65289g = j10;
        if (j10 != 0) {
            a aVar = this.f65286d;
            if (j10 != aVar.f65290a) {
                while (this.f65289g > aVar.f65291b) {
                    aVar = aVar.f65293d;
                }
                a aVar2 = (a) androidx.media3.common.util.a.g(aVar.f65293d);
                a(aVar2);
                a aVar3 = new a(aVar.f65291b, this.f65284b);
                aVar.f65293d = aVar3;
                if (this.f65289g == aVar.f65291b) {
                    aVar = aVar3;
                }
                this.f65288f = aVar;
                if (this.f65287e == aVar2) {
                    this.f65287e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f65286d);
        a aVar4 = new a(this.f65289g, this.f65284b);
        this.f65286d = aVar4;
        this.f65287e = aVar4;
        this.f65288f = aVar4;
    }

    public long e() {
        return this.f65289g;
    }

    public void f(androidx.media3.decoder.g gVar, r1.b bVar) {
        l(this.f65287e, gVar, bVar, this.f65285c);
    }

    public void m(androidx.media3.decoder.g gVar, r1.b bVar) {
        this.f65287e = l(this.f65287e, gVar, bVar, this.f65285c);
    }

    public void n() {
        a(this.f65286d);
        this.f65286d.d(0L, this.f65284b);
        a aVar = this.f65286d;
        this.f65287e = aVar;
        this.f65288f = aVar;
        this.f65289g = 0L;
        this.f65283a.b();
    }

    public void o() {
        this.f65287e = this.f65286d;
    }

    public int p(androidx.media3.common.l lVar, int i10, boolean z10) throws IOException {
        int iH = h(i10);
        a aVar = this.f65288f;
        int i11 = lVar.read(aVar.f65292c.f65839a, aVar.e(this.f65289g), iH);
        if (i11 != -1) {
            g(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(androidx.media3.common.util.o0 o0Var, int i10) {
        while (i10 > 0) {
            int iH = h(i10);
            a aVar = this.f65288f;
            o0Var.n(aVar.f65292c.f65839a, aVar.e(this.f65289g), iH);
            i10 -= iH;
            g(iH);
        }
    }
}
