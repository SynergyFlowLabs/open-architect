package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f55119i = 20000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f55123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55124e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f55120a = new k0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f55125f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f55126g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f55127h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f55121b = new androidx.media2.exoplayer.external.util.x();

    w() {
    }

    private static boolean a(byte[] scrBytes) {
        return (scrBytes[0] & org.msgpack.core.h.a.f339273i) == 68 && (scrBytes[2] & 4) == 4 && (scrBytes[4] & 4) == 4 && (scrBytes[5] & 1) == 1 && (scrBytes[8] & 3) == 3;
    }

    private int b(androidx.media2.exoplayer.external.extractor.j input) {
        this.f55121b.N(q0.f57631f);
        this.f55122c = true;
        input.l();
        return 0;
    }

    private int f(byte[] data, int position) {
        return ((data[position] & 255) << 24) | ((data[position + 1] & 255) << 16) | ((data[position + 2] & 255) << 8) | (data[position + 3] & 255);
    }

    private int h(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPositionHolder) throws InterruptedException, IOException {
        int iMin = (int) Math.min(20000L, input.getLength());
        long j10 = 0;
        if (input.getPosition() != j10) {
            seekPositionHolder.f54695a = j10;
            return 1;
        }
        this.f55121b.M(iMin);
        input.l();
        input.i(this.f55121b.f57720a, 0, iMin);
        this.f55125f = i(this.f55121b);
        this.f55123d = true;
        return 0;
    }

    private long i(androidx.media2.exoplayer.external.util.x packetBuffer) {
        int iD = packetBuffer.d();
        for (int iC = packetBuffer.c(); iC < iD - 3; iC++) {
            if (f(packetBuffer.f57720a, iC) == 442) {
                packetBuffer.Q(iC + 4);
                long jL = l(packetBuffer);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPositionHolder) throws InterruptedException, IOException {
        long length = input.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (input.getPosition() != j10) {
            seekPositionHolder.f54695a = j10;
            return 1;
        }
        this.f55121b.M(iMin);
        input.l();
        input.i(this.f55121b.f57720a, 0, iMin);
        this.f55126g = k(this.f55121b);
        this.f55124e = true;
        return 0;
    }

    private long k(androidx.media2.exoplayer.external.util.x packetBuffer) {
        int iC = packetBuffer.c();
        for (int iD = packetBuffer.d() - 4; iD >= iC; iD--) {
            if (f(packetBuffer.f57720a, iD) == 442) {
                packetBuffer.Q(iD + 4);
                long jL = l(packetBuffer);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(androidx.media2.exoplayer.external.util.x packetBuffer) {
        int iC = packetBuffer.c();
        if (packetBuffer.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        packetBuffer.i(bArr, 0, 9);
        packetBuffer.Q(iC);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] scrBytes) {
        byte b10 = scrBytes[0];
        int i10 = 2 ^ 3;
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) scrBytes[1]) & 255) << 20);
        byte b11 = scrBytes[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) scrBytes[3]) & 255) << 5) | ((((long) scrBytes[4]) & 248) >> 3);
    }

    public long c() {
        return this.f55127h;
    }

    public k0 d() {
        return this.f55120a;
    }

    public boolean e() {
        return this.f55122c;
    }

    public int g(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPositionHolder) throws InterruptedException, IOException {
        if (!this.f55124e) {
            return j(input, seekPositionHolder);
        }
        if (this.f55126g == -9223372036854775807L) {
            return b(input);
        }
        if (!this.f55123d) {
            return h(input, seekPositionHolder);
        }
        long j10 = this.f55125f;
        if (j10 == -9223372036854775807L) {
            return b(input);
        }
        this.f55127h = this.f55120a.b(this.f55126g) - this.f55120a.b(j10);
        return b(input);
    }
}
