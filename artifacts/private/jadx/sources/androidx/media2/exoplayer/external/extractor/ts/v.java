package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class v extends androidx.media2.exoplayer.external.extractor.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f55114f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f55115g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f55116h = 20000;

    private static final class b implements androidx.media2.exoplayer.external.extractor.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k0 f55117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.util.x f55118b;

        private androidx.media2.exoplayer.external.extractor.a.f c(androidx.media2.exoplayer.external.util.x packetBuffer, long targetScrTimeUs, long bufferStartOffset) {
            int iC = -1;
            int iC2 = -1;
            long j10 = -9223372036854775807L;
            while (packetBuffer.a() >= 4) {
                if (v.k(packetBuffer.f57720a, packetBuffer.c()) != 442) {
                    packetBuffer.R(1);
                } else {
                    packetBuffer.R(4);
                    long jL = w.l(packetBuffer);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f55117a.b(jL);
                        if (jB > targetScrTimeUs) {
                            return j10 == -9223372036854775807L ? androidx.media2.exoplayer.external.extractor.a.f.d(jB, bufferStartOffset) : androidx.media2.exoplayer.external.extractor.a.f.e(bufferStartOffset + ((long) iC2));
                        }
                        if (100000 + jB > targetScrTimeUs) {
                            return androidx.media2.exoplayer.external.extractor.a.f.e(bufferStartOffset + ((long) packetBuffer.c()));
                        }
                        iC2 = packetBuffer.c();
                        j10 = jB;
                    }
                    d(packetBuffer);
                    iC = packetBuffer.c();
                }
            }
            return j10 != -9223372036854775807L ? androidx.media2.exoplayer.external.extractor.a.f.f(j10, bufferStartOffset + ((long) iC)) : androidx.media2.exoplayer.external.extractor.a.f.f53958h;
        }

        private static void d(androidx.media2.exoplayer.external.util.x packetBuffer) {
            int iK;
            int iD = packetBuffer.d();
            if (packetBuffer.a() < 10) {
                packetBuffer.Q(iD);
                return;
            }
            packetBuffer.R(9);
            int iD2 = packetBuffer.D() & 7;
            if (packetBuffer.a() < iD2) {
                packetBuffer.Q(iD);
                return;
            }
            packetBuffer.R(iD2);
            if (packetBuffer.a() < 4) {
                packetBuffer.Q(iD);
                return;
            }
            if (v.k(packetBuffer.f57720a, packetBuffer.c()) == 443) {
                packetBuffer.R(4);
                int iJ = packetBuffer.J();
                if (packetBuffer.a() < iJ) {
                    packetBuffer.Q(iD);
                    return;
                }
                packetBuffer.R(iJ);
            }
            while (packetBuffer.a() >= 4 && (iK = v.k(packetBuffer.f57720a, packetBuffer.c())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                packetBuffer.R(4);
                if (packetBuffer.a() < 2) {
                    packetBuffer.Q(iD);
                    return;
                }
                packetBuffer.Q(Math.min(packetBuffer.d(), packetBuffer.c() + packetBuffer.J()));
            }
        }

        @Override // androidx.media2.exoplayer.external.extractor.a.g
        public void a() {
            this.f55118b.N(q0.f57631f);
        }

        @Override // androidx.media2.exoplayer.external.extractor.a.g
        public androidx.media2.exoplayer.external.extractor.a.f b(androidx.media2.exoplayer.external.extractor.j input, long targetTimestamp, androidx.media2.exoplayer.external.extractor.a.c outputFrameHolder) throws InterruptedException, IOException {
            long position = input.getPosition();
            int iMin = (int) Math.min(20000L, input.getLength() - position);
            this.f55118b.M(iMin);
            input.i(this.f55118b.f57720a, 0, iMin);
            return c(this.f55118b, targetTimestamp, position);
        }

        private b(k0 scrTimestampAdjuster) {
            this.f55117a = scrTimestampAdjuster;
            this.f55118b = new androidx.media2.exoplayer.external.util.x();
        }
    }

    public v(k0 scrTimestampAdjuster, long streamDurationUs, long inputLength) {
        super(new androidx.media2.exoplayer.external.extractor.a.b(), new b(scrTimestampAdjuster), streamDurationUs, 0L, streamDurationUs + 1, 0L, inputLength, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] data, int position) {
        return (data[position + 3] & 255) | ((data[position] & 255) << 24) | ((data[position + 1] & 255) << 16) | ((data[position + 2] & 255) << 8);
    }
}
