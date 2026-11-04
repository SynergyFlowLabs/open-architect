package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.r;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media3.exoplayer.audio.s0;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class a implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f54574p = 72000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f54575q = 100000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f54576r = 30000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f54577s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f54578t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f54579u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f54580v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f54581w = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f54582d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f54583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f54584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f54585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f54587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f54588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f54589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f54591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f54592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f54593o;

    private final class b implements q {
        private b() {
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public long Q1() {
            return a.this.f54585g.a(a.this.f54587i);
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public q.a R1(long timeUs) {
            return new q.a(new r(timeUs, q0.s((a.this.f54583e + ((a.this.f54585g.b(timeUs) * (a.this.f54584f - a.this.f54583e)) / a.this.f54587i)) - 30000, a.this.f54583e, a.this.f54584f - 1)));
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public boolean S1() {
            return true;
        }
    }

    public a(i streamReader, long payloadStartPosition, long payloadEndPosition, long firstPayloadPageSize, long firstPayloadPageGranulePosition, boolean firstPayloadPageIsLastPage) {
        androidx.media2.exoplayer.external.util.a.a(payloadStartPosition >= 0 && payloadEndPosition > payloadStartPosition);
        this.f54585g = streamReader;
        this.f54583e = payloadStartPosition;
        this.f54584f = payloadEndPosition;
        if (firstPayloadPageSize != payloadEndPosition - payloadStartPosition && !firstPayloadPageIsLastPage) {
            this.f54586h = 0;
            return;
        }
        this.f54587i = firstPayloadPageGranulePosition;
        this.f54586h = 4;
    }

    private long i(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        if (this.f54590l == this.f54591m) {
            return -1L;
        }
        long position = input.getPosition();
        if (!l(input, this.f54591m)) {
            long j10 = this.f54590l;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f54582d.a(input, false);
        input.l();
        long j11 = this.f54589k;
        f fVar = this.f54582d;
        long j12 = fVar.f54625c;
        long j13 = j11 - j12;
        int i10 = fVar.f54630h + fVar.f54631i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f54591m = position;
            this.f54593o = j12;
        } else {
            this.f54590l = input.getPosition() + ((long) i10);
            this.f54592n = this.f54582d.f54625c;
        }
        long j14 = this.f54591m;
        long j15 = this.f54590l;
        if (j14 - j15 < s0.f63372z) {
            this.f54591m = j15;
            return j15;
        }
        long position2 = input.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f54591m;
        long j17 = this.f54590l;
        return q0.s(position2 + ((j13 * (j16 - j17)) / (this.f54593o - this.f54592n)), j17, j16 - 1);
    }

    private boolean l(androidx.media2.exoplayer.external.extractor.j input, long limit) throws InterruptedException, IOException {
        int i10;
        long jMin = Math.min(limit + 3, this.f54584f);
        int position = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i11 = 0;
            if (input.getPosition() + ((long) position) > jMin && (position = (int) (jMin - input.getPosition())) < 4) {
                return false;
            }
            input.k(bArr, 0, position, false);
            while (true) {
                i10 = position - 3;
                if (i11 < i10) {
                    if (bArr[i11] == 79 && bArr[i11 + 1] == 103 && bArr[i11 + 2] == 103 && bArr[i11 + 3] == 83) {
                        input.o(i11);
                        return true;
                    }
                    i11++;
                }
            }
            input.o(i10);
        }
    }

    private void m(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        this.f54582d.a(input, false);
        while (true) {
            f fVar = this.f54582d;
            if (fVar.f54625c > this.f54589k) {
                input.l();
                return;
            }
            input.o(fVar.f54630h + fVar.f54631i);
            this.f54590l = input.getPosition();
            f fVar2 = this.f54582d;
            this.f54592n = fVar2.f54625c;
            fVar2.a(input, false);
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.g
    public long b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        int i10 = this.f54586h;
        if (i10 == 0) {
            long position = input.getPosition();
            this.f54588j = position;
            this.f54586h = 1;
            long j10 = this.f54584f - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jI = i(input);
                if (jI != -1) {
                    return jI;
                }
                this.f54586h = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            m(input);
            this.f54586h = 4;
            return -(this.f54592n + 2);
        }
        this.f54587i = j(input);
        this.f54586h = 4;
        return this.f54588j;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.g
    public void c(long targetGranule) {
        this.f54589k = q0.s(targetGranule, 0L, this.f54587i - 1);
        this.f54586h = 2;
        this.f54590l = this.f54583e;
        this.f54591m = this.f54584f;
        this.f54592n = 0L;
        this.f54593o = this.f54587i;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f54587i != 0) {
            return new b();
        }
        return null;
    }

    @l1
    long j(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        k(input);
        this.f54582d.b();
        while ((this.f54582d.f54624b & 4) != 4 && input.getPosition() < this.f54584f) {
            this.f54582d.a(input, false);
            f fVar = this.f54582d;
            input.o(fVar.f54630h + fVar.f54631i);
        }
        return this.f54582d.f54625c;
    }

    @l1
    void k(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        if (!l(input, this.f54584f)) {
            throw new EOFException();
        }
    }
}
