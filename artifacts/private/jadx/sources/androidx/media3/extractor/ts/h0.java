package androidx.media3.extractor.ts;

import androidx.media3.common.util.k1;
import androidx.media3.common.util.w0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class h0 extends androidx.media3.extractor.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f69099f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f69100g = 940;

    private static final class a implements androidx.media3.extractor.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w0 f69101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.common.util.o0 f69102b = new androidx.media3.common.util.o0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f69103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f69104d;

        public a(int i10, w0 w0Var, int i11) {
            this.f69103c = i10;
            this.f69101a = w0Var;
            this.f69104d = i11;
        }

        private androidx.media3.extractor.e.C0604e c(androidx.media3.common.util.o0 o0Var, long j10, long j11) {
            int iA;
            int iA2;
            int iG = o0Var.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (o0Var.a() >= 188 && (iA2 = (iA = n0.a(o0Var.e(), o0Var.f(), iG)) + 188) <= iG) {
                long jC = n0.c(o0Var, iA, this.f69103c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f69101a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? androidx.media3.extractor.e.C0604e.d(jB, j11) : androidx.media3.extractor.e.C0604e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return androidx.media3.extractor.e.C0604e.e(((long) iA) + j11);
                    }
                    j13 = iA;
                    j14 = jB;
                }
                o0Var.a0(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? androidx.media3.extractor.e.C0604e.f(j14, j11 + j12) : androidx.media3.extractor.e.C0604e.f67219h;
        }

        @Override // androidx.media3.extractor.e.f
        public void a() {
            this.f69102b.X(k1.f61545f);
        }

        @Override // androidx.media3.extractor.e.f
        public androidx.media3.extractor.e.C0604e b(androidx.media3.extractor.s sVar, long j10) throws IOException {
            long position = sVar.getPosition();
            int iMin = (int) Math.min(this.f69104d, sVar.getLength() - position);
            this.f69102b.W(iMin);
            sVar.i(this.f69102b.e(), 0, iMin);
            return c(this.f69102b, j10, position);
        }
    }

    public h0(w0 w0Var, long j10, long j11, int i10, int i11) {
        super(new androidx.media3.extractor.e.b(), new a(i10, w0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, f69100g);
    }
}
