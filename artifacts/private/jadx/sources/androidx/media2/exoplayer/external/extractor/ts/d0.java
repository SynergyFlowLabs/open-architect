package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class d0 extends androidx.media2.exoplayer.external.extractor.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f54746f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f54747g = 940;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54748h = 112800;

    private static final class a implements androidx.media2.exoplayer.external.extractor.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k0 f54749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.util.x f54750b = new androidx.media2.exoplayer.external.util.x();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54751c;

        public a(int pcrPid, k0 pcrTimestampAdjuster) {
            this.f54751c = pcrPid;
            this.f54749a = pcrTimestampAdjuster;
        }

        private androidx.media2.exoplayer.external.extractor.a.f c(androidx.media2.exoplayer.external.util.x packetBuffer, long targetPcrTimeUs, long bufferStartOffset) {
            int iA;
            int iA2;
            int iD = packetBuffer.d();
            long j10 = -1;
            long j11 = -1;
            long j12 = -9223372036854775807L;
            while (packetBuffer.a() >= 188 && (iA2 = (iA = i0.a(packetBuffer.f57720a, packetBuffer.c(), iD)) + 188) <= iD) {
                long jB = i0.b(packetBuffer, iA, this.f54751c);
                if (jB != -9223372036854775807L) {
                    long jB2 = this.f54749a.b(jB);
                    if (jB2 > targetPcrTimeUs) {
                        return j12 == -9223372036854775807L ? androidx.media2.exoplayer.external.extractor.a.f.d(jB2, bufferStartOffset) : androidx.media2.exoplayer.external.extractor.a.f.e(bufferStartOffset + j11);
                    }
                    if (100000 + jB2 > targetPcrTimeUs) {
                        return androidx.media2.exoplayer.external.extractor.a.f.e(((long) iA) + bufferStartOffset);
                    }
                    j11 = iA;
                    j12 = jB2;
                }
                packetBuffer.Q(iA2);
                j10 = iA2;
            }
            return j12 != -9223372036854775807L ? androidx.media2.exoplayer.external.extractor.a.f.f(j12, bufferStartOffset + j10) : androidx.media2.exoplayer.external.extractor.a.f.f53958h;
        }

        @Override // androidx.media2.exoplayer.external.extractor.a.g
        public void a() {
            this.f54750b.N(q0.f57631f);
        }

        @Override // androidx.media2.exoplayer.external.extractor.a.g
        public androidx.media2.exoplayer.external.extractor.a.f b(androidx.media2.exoplayer.external.extractor.j input, long targetTimestamp, androidx.media2.exoplayer.external.extractor.a.c outputFrameHolder) throws InterruptedException, IOException {
            long position = input.getPosition();
            int iMin = (int) Math.min(112800L, input.getLength() - position);
            this.f54750b.M(iMin);
            input.i(this.f54750b.f57720a, 0, iMin);
            return c(this.f54750b, targetTimestamp, position);
        }
    }

    public d0(k0 pcrTimestampAdjuster, long streamDurationUs, long inputLength, int pcrPid) {
        super(new androidx.media2.exoplayer.external.extractor.a.b(), new a(pcrPid, pcrTimestampAdjuster), streamDurationUs, 0L, streamDurationUs + 1, 0L, inputLength, 188L, f54747g);
    }
}
