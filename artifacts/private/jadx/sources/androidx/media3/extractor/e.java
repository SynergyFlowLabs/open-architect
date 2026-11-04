package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f67195e = 262144;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f67196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f67197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    protected c f67198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f67199d;

    public static class a implements p0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f67200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f67201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f67202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f67203g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f67204h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f67205i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f67206j;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f67200d = dVar;
            this.f67201e = j10;
            this.f67202f = j11;
            this.f67203g = j12;
            this.f67204h = j13;
            this.f67205i = j14;
            this.f67206j = j15;
        }

        @Override // androidx.media3.extractor.p0
        public long Q1() {
            return this.f67201e;
        }

        @Override // androidx.media3.extractor.p0
        public p0.a R1(long j10) {
            return new p0.a(new q0(j10, c.h(this.f67200d.a(j10), this.f67202f, this.f67203g, this.f67204h, this.f67205i, this.f67206j)));
        }

        @Override // androidx.media3.extractor.p0
        public boolean S1() {
            return true;
        }

        public long h(long j10) {
            return this.f67200d.a(j10);
        }
    }

    public static final class b implements d {
        @Override // androidx.media3.extractor.e.d
        public long a(long j10) {
            return j10;
        }
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f67207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f67208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f67209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f67210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f67211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f67212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f67213g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f67214h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f67207a = j10;
            this.f67208b = j11;
            this.f67210d = j12;
            this.f67211e = j13;
            this.f67212f = j14;
            this.f67213g = j15;
            this.f67209c = j16;
            this.f67214h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return k1.x(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f67213g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f67212f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f67214h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f67207a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f67208b;
        }

        private void n() {
            this.f67214h = h(this.f67208b, this.f67210d, this.f67211e, this.f67212f, this.f67213g, this.f67209c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f67211e = j10;
            this.f67213g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f67210d = j10;
            this.f67212f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: renamed from: androidx.media3.extractor.e$e, reason: collision with other inner class name */
    public static final class C0604e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f67215d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f67216e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f67217f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f67218g = -3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0604e f67219h = new C0604e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f67220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f67221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f67222c;

        private C0604e(int i10, long j10, long j11) {
            this.f67220a = i10;
            this.f67221b = j10;
            this.f67222c = j11;
        }

        public static C0604e d(long j10, long j11) {
            return new C0604e(-1, j10, j11);
        }

        public static C0604e e(long j10) {
            return new C0604e(0, -9223372036854775807L, j10);
        }

        public static C0604e f(long j10, long j11) {
            return new C0604e(-2, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface f {
        default void a() {
        }

        C0604e b(s sVar, long j10) throws IOException;
    }

    protected e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f67197b = fVar;
        this.f67199d = i10;
        this.f67196a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f67196a.h(j10), this.f67196a.f67202f, this.f67196a.f67203g, this.f67196a.f67204h, this.f67196a.f67205i, this.f67196a.f67206j);
    }

    public final p0 b() {
        return this.f67196a;
    }

    public int c(s sVar, n0 n0Var) throws IOException {
        while (true) {
            c cVar = (c) androidx.media3.common.util.a.k(this.f67198c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f67199d) {
                e(false, j10);
                return g(sVar, j10, n0Var);
            }
            if (!i(sVar, jK)) {
                return g(sVar, jK, n0Var);
            }
            sVar.l();
            C0604e c0604eB = this.f67197b.b(sVar, cVar.m());
            int i10 = c0604eB.f67220a;
            int i11 = 5 & (-3);
            if (i10 == -3) {
                e(false, jK);
                return g(sVar, jK, n0Var);
            }
            if (i10 == -2) {
                cVar.p(c0604eB.f67221b, c0604eB.f67222c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(sVar, c0604eB.f67222c);
                    e(true, c0604eB.f67222c);
                    return g(sVar, c0604eB.f67222c, n0Var);
                }
                cVar.o(c0604eB.f67221b, c0604eB.f67222c);
            }
        }
    }

    public final boolean d() {
        return this.f67198c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f67198c = null;
        this.f67197b.a();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected final int g(s sVar, long j10, n0 n0Var) {
        if (j10 == sVar.getPosition()) {
            return 0;
        }
        n0Var.f68159a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f67198c;
        if (cVar == null || cVar.l() != j10) {
            this.f67198c = a(j10);
        }
    }

    protected final boolean i(s sVar, long j10) throws IOException {
        long position = j10 - sVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        sVar.o((int) position);
        return true;
    }
}
