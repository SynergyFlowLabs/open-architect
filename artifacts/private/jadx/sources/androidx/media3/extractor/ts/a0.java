package androidx.media3.extractor.ts;

import androidx.media3.common.util.k1;
import androidx.media3.common.util.w0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f68975i = "PsDurationReader";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f68976j = 20000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f68980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f68981e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w0 f68977a = new w0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f68982f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f68983g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f68984h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f68978b = new androidx.media3.common.util.o0();

    a0() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & org.msgpack.core.h.a.f339273i) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(androidx.media3.extractor.s sVar) {
        this.f68978b.X(k1.f61545f);
        this.f68979c = true;
        sVar.l();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
    }

    private int h(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var) throws IOException {
        int iMin = (int) Math.min(20000L, sVar.getLength());
        long j10 = 0;
        if (sVar.getPosition() != j10) {
            n0Var.f68159a = j10;
            return 1;
        }
        this.f68978b.W(iMin);
        sVar.l();
        sVar.i(this.f68978b.e(), 0, iMin);
        this.f68982f = i(this.f68978b);
        this.f68980d = true;
        return 0;
    }

    private long i(androidx.media3.common.util.o0 o0Var) {
        int iG = o0Var.g();
        for (int iF = o0Var.f(); iF < iG - 3; iF++) {
            if (f(o0Var.e(), iF) == 442) {
                o0Var.a0(iF + 4);
                long jL = l(o0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var) throws IOException {
        long length = sVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (sVar.getPosition() != j10) {
            n0Var.f68159a = j10;
            return 1;
        }
        this.f68978b.W(iMin);
        sVar.l();
        sVar.i(this.f68978b.e(), 0, iMin);
        this.f68983g = k(this.f68978b);
        this.f68981e = true;
        return 0;
    }

    private long k(androidx.media3.common.util.o0 o0Var) {
        int iF = o0Var.f();
        for (int iG = o0Var.g() - 4; iG >= iF; iG--) {
            if (f(o0Var.e(), iG) == 442) {
                o0Var.a0(iG + 4);
                long jL = l(o0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(androidx.media3.common.util.o0 o0Var) {
        int iF = o0Var.f();
        if (o0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        o0Var.n(bArr, 0, 9);
        o0Var.a0(iF);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        int i10 = 6 >> 2;
        byte b11 = bArr[2];
        int i11 = 1 ^ 5;
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f68984h;
    }

    public w0 d() {
        return this.f68977a;
    }

    public boolean e() {
        return this.f68979c;
    }

    public int g(androidx.media3.extractor.s sVar, androidx.media3.extractor.n0 n0Var) throws IOException {
        if (!this.f68981e) {
            return j(sVar, n0Var);
        }
        if (this.f68983g == -9223372036854775807L) {
            return b(sVar);
        }
        if (!this.f68980d) {
            return h(sVar, n0Var);
        }
        long j10 = this.f68982f;
        if (j10 == -9223372036854775807L) {
            return b(sVar);
        }
        this.f68984h = this.f68977a.c(this.f68983g) - this.f68977a.b(j10);
        return b(sVar);
    }
}
