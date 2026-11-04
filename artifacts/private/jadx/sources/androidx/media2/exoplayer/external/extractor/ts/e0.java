package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f54759i = 112800;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54764e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f54760a = new k0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f54765f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f54766g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f54767h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54761b = new androidx.media2.exoplayer.external.util.x();

    e0() {
    }

    private int a(androidx.media2.exoplayer.external.extractor.j input) {
        this.f54761b.N(q0.f57631f);
        this.f54762c = true;
        input.l();
        return 0;
    }

    private int f(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPositionHolder, int pcrPid) throws InterruptedException, IOException {
        int iMin = (int) Math.min(112800L, input.getLength());
        int i10 = 5 & 0;
        long j10 = 0;
        if (input.getPosition() != j10) {
            seekPositionHolder.f54695a = j10;
            return 1;
        }
        this.f54761b.M(iMin);
        input.l();
        input.i(this.f54761b.f57720a, 0, iMin);
        this.f54765f = g(this.f54761b, pcrPid);
        this.f54763d = true;
        return 0;
    }

    private long g(androidx.media2.exoplayer.external.util.x packetBuffer, int pcrPid) {
        int iD = packetBuffer.d();
        for (int iC = packetBuffer.c(); iC < iD; iC++) {
            if (packetBuffer.f57720a[iC] == 71) {
                long jB = i0.b(packetBuffer, iC, pcrPid);
                if (jB != -9223372036854775807L) {
                    return jB;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPositionHolder, int pcrPid) throws InterruptedException, IOException {
        long length = input.getLength();
        int iMin = (int) Math.min(112800L, length);
        long j10 = length - ((long) iMin);
        if (input.getPosition() != j10) {
            seekPositionHolder.f54695a = j10;
            return 1;
        }
        this.f54761b.M(iMin);
        input.l();
        input.i(this.f54761b.f57720a, 0, iMin);
        this.f54766g = i(this.f54761b, pcrPid);
        this.f54764e = true;
        return 0;
    }

    private long i(androidx.media2.exoplayer.external.util.x packetBuffer, int pcrPid) {
        int iC = packetBuffer.c();
        for (int iD = packetBuffer.d() - 1; iD >= iC; iD--) {
            if (packetBuffer.f57720a[iD] == 71) {
                long jB = i0.b(packetBuffer, iD, pcrPid);
                if (jB != -9223372036854775807L) {
                    return jB;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f54767h;
    }

    public k0 c() {
        return this.f54760a;
    }

    public boolean d() {
        return this.f54762c;
    }

    public int e(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPositionHolder, int pcrPid) throws InterruptedException, IOException {
        if (pcrPid <= 0) {
            return a(input);
        }
        if (!this.f54764e) {
            return h(input, seekPositionHolder, pcrPid);
        }
        if (this.f54766g == -9223372036854775807L) {
            return a(input);
        }
        if (!this.f54763d) {
            return f(input, seekPositionHolder, pcrPid);
        }
        long j10 = this.f54765f;
        if (j10 == -9223372036854775807L) {
            return a(input);
        }
        this.f54767h = this.f54760a.b(this.f54766g) - this.f54760a.b(j10);
        return a(input);
    }
}
