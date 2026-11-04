package androidx.media3.extractor.flac;

import androidx.media3.extractor.a0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.x;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class b extends androidx.media3.extractor.e {

    /* JADX INFO: renamed from: androidx.media3.extractor.flac.b$b, reason: collision with other inner class name */
    private static final class C0605b implements androidx.media3.extractor.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0 f67233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f67234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x.a f67235c;

        private long c(s sVar) throws IOException {
            while (sVar.m() < sVar.getLength() - 6 && !x.h(sVar, this.f67233a, this.f67234b, this.f67235c)) {
                sVar.n(1);
            }
            if (sVar.m() < sVar.getLength() - 6) {
                return this.f67235c.f69631a;
            }
            sVar.n((int) (sVar.getLength() - sVar.m()));
            return this.f67233a.f67021j;
        }

        @Override // androidx.media3.extractor.e.f
        public androidx.media3.extractor.e.C0604e b(s sVar, long j10) throws IOException {
            long position = sVar.getPosition();
            long jC = c(sVar);
            long jM = sVar.m();
            sVar.n(Math.max(6, this.f67233a.f67014c));
            long jC2 = c(sVar);
            long jM2 = sVar.m();
            if (jC > j10 || jC2 <= j10) {
                return jC2 <= j10 ? androidx.media3.extractor.e.C0604e.f(jC2, jM2) : androidx.media3.extractor.e.C0604e.d(jC, position);
            }
            return androidx.media3.extractor.e.C0604e.e(jM);
        }

        private C0605b(a0 a0Var, int i10) {
            this.f67233a = a0Var;
            this.f67234b = i10;
            this.f67235c = new x.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final a0 a0Var, int i10, long j10, long j11) {
        super(new androidx.media3.extractor.e.d() { // from class: androidx.media3.extractor.flac.a
            @Override // androidx.media3.extractor.e.d
            public final long a(long j12) {
                return a0Var.l(j12);
            }
        }, new C0605b(a0Var, i10), a0Var.h(), 0L, a0Var.f67021j, j10, j11, a0Var.e(), Math.max(6, a0Var.f67014c));
        Objects.requireNonNull(a0Var);
    }
}
