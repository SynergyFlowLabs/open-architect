package androidx.media3.extractor.ogg;

import androidx.annotation.l1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.audio.s0;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.q0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.u;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
final class a implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f68192m = 72000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f68193n = 100000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f68194o = 30000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68195p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68196q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f68197r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f68198s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f68199t = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f68200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f68201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f68202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f68203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f68205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f68206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f68207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f68208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f68209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f68210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f68211l;

    private final class b implements p0 {
        private b() {
        }

        @Override // androidx.media3.extractor.p0
        public long Q1() {
            return a.this.f68203d.b(a.this.f68205f);
        }

        @Override // androidx.media3.extractor.p0
        public p0.a R1(long j10) {
            return new p0.a(new q0(j10, k1.x((a.this.f68201b + BigInteger.valueOf(a.this.f68203d.c(j10)).multiply(BigInteger.valueOf(a.this.f68202c - a.this.f68201b)).divide(BigInteger.valueOf(a.this.f68205f)).longValue()) - 30000, a.this.f68201b, a.this.f68202c - 1)));
        }

        @Override // androidx.media3.extractor.p0
        public boolean S1() {
            return true;
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        androidx.media3.common.util.a.a(j10 >= 0 && j11 > j10);
        this.f68203d = iVar;
        this.f68201b = j10;
        this.f68202c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f68205f = j13;
            this.f68204e = 4;
        } else {
            this.f68204e = 0;
        }
        this.f68200a = new f();
    }

    private long i(s sVar) throws IOException {
        if (this.f68208i == this.f68209j) {
            return -1L;
        }
        long position = sVar.getPosition();
        if (!this.f68200a.d(sVar, this.f68209j)) {
            long j10 = this.f68208i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f68200a.a(sVar, false);
        sVar.l();
        long j11 = this.f68207h;
        f fVar = this.f68200a;
        long j12 = fVar.f68239c;
        long j13 = j11 - j12;
        int i10 = fVar.f68244h + fVar.f68245i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f68209j = position;
            this.f68211l = j12;
        } else {
            this.f68208i = sVar.getPosition() + ((long) i10);
            this.f68210k = this.f68200a.f68239c;
        }
        long j14 = this.f68209j;
        long j15 = this.f68208i;
        if (j14 - j15 < s0.f63372z) {
            this.f68209j = j15;
            return j15;
        }
        long position2 = sVar.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f68209j;
        long j17 = this.f68208i;
        return k1.x(position2 + ((j13 * (j16 - j17)) / (this.f68211l - this.f68210k)), j17, j16 - 1);
    }

    private void k(s sVar) throws IOException {
        while (true) {
            this.f68200a.c(sVar);
            this.f68200a.a(sVar, false);
            f fVar = this.f68200a;
            if (fVar.f68239c > this.f68207h) {
                sVar.l();
                return;
            } else {
                sVar.o(fVar.f68244h + fVar.f68245i);
                this.f68208i = sVar.getPosition();
                this.f68210k = this.f68200a.f68239c;
            }
        }
    }

    @Override // androidx.media3.extractor.ogg.g
    public long b(s sVar) throws IOException {
        int i10 = this.f68204e;
        if (i10 == 0) {
            long position = sVar.getPosition();
            this.f68206g = position;
            this.f68204e = 1;
            long j10 = this.f68202c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jI = i(sVar);
                if (jI != -1) {
                    return jI;
                }
                this.f68204e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(sVar);
            this.f68204e = 4;
            return -(this.f68210k + 2);
        }
        this.f68205f = j(sVar);
        this.f68204e = 4;
        return this.f68206g;
    }

    @Override // androidx.media3.extractor.ogg.g
    public void c(long j10) {
        this.f68207h = k1.x(j10, 0L, this.f68205f - 1);
        this.f68204e = 2;
        this.f68208i = this.f68201b;
        this.f68209j = this.f68202c;
        this.f68210k = 0L;
        this.f68211l = this.f68205f;
    }

    @Override // androidx.media3.extractor.ogg.g
    @androidx.annotation.p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f68205f != 0) {
            return new b();
        }
        return null;
    }

    @l1
    long j(s sVar) throws IOException {
        this.f68200a.b();
        if (!this.f68200a.c(sVar)) {
            throw new EOFException();
        }
        this.f68200a.a(sVar, false);
        f fVar = this.f68200a;
        sVar.o(fVar.f68244h + fVar.f68245i);
        long j10 = this.f68200a.f68239c;
        while (true) {
            f fVar2 = this.f68200a;
            if ((fVar2.f68238b & 4) == 4 || !fVar2.c(sVar) || sVar.getPosition() >= this.f68202c || !this.f68200a.a(sVar, true)) {
                break;
            }
            f fVar3 = this.f68200a;
            if (!u.e(sVar, fVar3.f68244h + fVar3.f68245i)) {
                break;
            }
            j10 = this.f68200a.f68239c;
        }
        return j10;
    }
}
