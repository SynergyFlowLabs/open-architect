package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
abstract class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f54639n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f54640o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f54641p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f54642q = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f54643a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f54644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.k f54645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f54646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f54647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f54648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f54649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f54652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f54653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f54654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f54655m;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Format f54656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f54657b;

        b() {
        }
    }

    private static final class c implements g {
        private c() {
        }

        @Override // androidx.media2.exoplayer.external.extractor.ogg.g
        public q a() {
            return new q.b(-9223372036854775807L);
        }

        @Override // androidx.media2.exoplayer.external.extractor.ogg.g
        public long b(androidx.media2.exoplayer.external.extractor.j input) {
            return -1L;
        }

        @Override // androidx.media2.exoplayer.external.extractor.ogg.g
        public void c(long targetGranule) {
        }
    }

    private int g(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        boolean zH = true;
        while (zH) {
            if (!this.f54643a.d(input)) {
                this.f54650h = 3;
                return -1;
            }
            this.f54653k = input.getPosition() - this.f54648f;
            zH = h(this.f54643a.c(), this.f54648f, this.f54652j);
            if (zH) {
                this.f54648f = input.getPosition();
            }
        }
        Format format = this.f54652j.f54656a;
        this.f54651i = format.f53112p0;
        if (!this.f54655m) {
            this.f54644b.c(format);
            this.f54655m = true;
        }
        g gVar = this.f54652j.f54657b;
        if (gVar != null) {
            this.f54646d = gVar;
        } else if (input.getLength() == -1) {
            this.f54646d = new c();
        } else {
            f fVarB = this.f54643a.b();
            this.f54646d = new androidx.media2.exoplayer.external.extractor.ogg.a(this, this.f54648f, input.getLength(), fVarB.f54630h + fVarB.f54631i, fVarB.f54625c, (fVarB.f54624b & 4) != 0);
        }
        this.f54652j = null;
        this.f54650h = 2;
        this.f54643a.f();
        return 0;
    }

    private int i(androidx.media2.exoplayer.external.extractor.j input, p seekPosition) throws InterruptedException, IOException {
        long jB = this.f54646d.b(input);
        if (jB >= 0) {
            seekPosition.f54695a = jB;
            return 1;
        }
        if (jB < -1) {
            d(-(jB + 2));
        }
        if (!this.f54654l) {
            this.f54645c.q(this.f54646d.a());
            this.f54654l = true;
        }
        if (this.f54653k <= 0 && !this.f54643a.d(input)) {
            this.f54650h = 3;
            return -1;
        }
        this.f54653k = 0L;
        x xVarC = this.f54643a.c();
        long jE = e(xVarC);
        if (jE >= 0) {
            long j10 = this.f54649g;
            if (j10 + jE >= this.f54647e) {
                long jA = a(j10);
                this.f54644b.d(xVarC, xVarC.d());
                this.f54644b.b(jA, 1, xVarC.d(), 0, null);
                this.f54647e = -1L;
            }
        }
        this.f54649g += jE;
        return 0;
    }

    protected long a(long granule) {
        return (granule * 1000000) / ((long) this.f54651i);
    }

    protected long b(long timeUs) {
        return (((long) this.f54651i) * timeUs) / 1000000;
    }

    void c(androidx.media2.exoplayer.external.extractor.k output, s trackOutput) {
        this.f54645c = output;
        this.f54644b = trackOutput;
        j(true);
    }

    protected void d(long currentGranule) {
        this.f54649g = currentGranule;
    }

    protected abstract long e(x packet);

    final int f(androidx.media2.exoplayer.external.extractor.j input, p seekPosition) throws InterruptedException, IOException {
        int i10 = this.f54650h;
        if (i10 == 0) {
            return g(input);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                return i(input, seekPosition);
            }
            throw new IllegalStateException();
        }
        input.o((int) this.f54648f);
        this.f54650h = 2;
        return 0;
    }

    protected abstract boolean h(x packet, long position, b setupData) throws InterruptedException, IOException;

    protected void j(boolean headerData) {
        if (headerData) {
            this.f54652j = new b();
            this.f54648f = 0L;
            this.f54650h = 0;
        } else {
            this.f54650h = 1;
        }
        this.f54647e = -1L;
        this.f54649g = 0L;
    }

    final void k(long position, long timeUs) {
        this.f54643a.e();
        if (position == 0) {
            j(!this.f54654l);
        } else if (this.f54650h != 0) {
            long jB = b(timeUs);
            this.f54647e = jB;
            this.f54646d.c(jB);
            this.f54650h = 2;
        }
    }
}
