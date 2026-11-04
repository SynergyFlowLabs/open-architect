package androidx.media3.extractor.ts;

import androidx.media3.common.util.k1;
import androidx.media3.common.util.w0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class z extends androidx.media3.extractor.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f69549f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f69550g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f69551h = 20000;

    private static final class b implements androidx.media3.extractor.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w0 f69552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.common.util.o0 f69553b;

        private androidx.media3.extractor.e.C0604e c(androidx.media3.common.util.o0 o0Var, long j10, long j11) {
            int iF = -1;
            int iF2 = -1;
            long j12 = -9223372036854775807L;
            while (o0Var.a() >= 4) {
                if (z.k(o0Var.e(), o0Var.f()) != 442) {
                    o0Var.b0(1);
                } else {
                    o0Var.b0(4);
                    long jL = a0.l(o0Var);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f69552a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? androidx.media3.extractor.e.C0604e.d(jB, j11) : androidx.media3.extractor.e.C0604e.e(j11 + ((long) iF2));
                        }
                        if (100000 + jB > j10) {
                            return androidx.media3.extractor.e.C0604e.e(j11 + ((long) o0Var.f()));
                        }
                        iF2 = o0Var.f();
                        j12 = jB;
                    }
                    d(o0Var);
                    iF = o0Var.f();
                }
            }
            return j12 != -9223372036854775807L ? androidx.media3.extractor.e.C0604e.f(j12, j11 + ((long) iF)) : androidx.media3.extractor.e.C0604e.f67219h;
        }

        private static void d(androidx.media3.common.util.o0 o0Var) {
            int iK;
            int iG = o0Var.g();
            if (o0Var.a() < 10) {
                o0Var.a0(iG);
                return;
            }
            o0Var.b0(9);
            int iL = o0Var.L() & 7;
            if (o0Var.a() < iL) {
                o0Var.a0(iG);
                return;
            }
            o0Var.b0(iL);
            if (o0Var.a() < 4) {
                o0Var.a0(iG);
                return;
            }
            if (z.k(o0Var.e(), o0Var.f()) == 443) {
                o0Var.b0(4);
                int iT = o0Var.T();
                if (o0Var.a() < iT) {
                    o0Var.a0(iG);
                    return;
                }
                o0Var.b0(iT);
            }
            while (o0Var.a() >= 4 && (iK = z.k(o0Var.e(), o0Var.f())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                o0Var.b0(4);
                if (o0Var.a() < 2) {
                    o0Var.a0(iG);
                    return;
                }
                o0Var.a0(Math.min(o0Var.g(), o0Var.f() + o0Var.T()));
            }
        }

        @Override // androidx.media3.extractor.e.f
        public void a() {
            this.f69553b.X(k1.f61545f);
        }

        @Override // androidx.media3.extractor.e.f
        public androidx.media3.extractor.e.C0604e b(androidx.media3.extractor.s sVar, long j10) throws IOException {
            long position = sVar.getPosition();
            int iMin = (int) Math.min(20000L, sVar.getLength() - position);
            this.f69553b.W(iMin);
            sVar.i(this.f69553b.e(), 0, iMin);
            return c(this.f69553b, j10, position);
        }

        private b(w0 w0Var) {
            this.f69552a = w0Var;
            this.f69553b = new androidx.media3.common.util.o0();
        }
    }

    public z(w0 w0Var, long j10, long j11) {
        super(new androidx.media3.extractor.e.b(), new b(w0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
