package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class d implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f53992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f53993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f53994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f53995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f53996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f53997i;

    public d(long inputLength, long firstFrameBytePosition, int bitrate, int frameSize) {
        this.f53992d = inputLength;
        this.f53993e = firstFrameBytePosition;
        this.f53994f = frameSize == -1 ? 1 : frameSize;
        this.f53996h = bitrate;
        if (inputLength == -1) {
            this.f53995g = -1L;
            this.f53997i = -9223372036854775807L;
        } else {
            this.f53995g = inputLength - firstFrameBytePosition;
            this.f53997i = c(inputLength, firstFrameBytePosition, bitrate);
        }
    }

    private long a(long timeUs) {
        long j10 = (timeUs * ((long) this.f53996h)) / 8000000;
        int i10 = this.f53994f;
        return this.f53993e + q0.s((j10 / ((long) i10)) * ((long) i10), 0L, this.f53995g - ((long) i10));
    }

    private static long c(long position, long firstFrameBytePosition, int bitrate) {
        return (Math.max(0L, position - firstFrameBytePosition) * 8000000) / ((long) bitrate);
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public long Q1() {
        return this.f53997i;
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public q.a R1(long timeUs) {
        if (this.f53995g == -1) {
            return new q.a(new r(0L, this.f53993e));
        }
        long jA = a(timeUs);
        long jB = b(jA);
        r rVar = new r(jB, jA);
        if (jB < timeUs) {
            int i10 = this.f53994f;
            if (((long) i10) + jA < this.f53992d) {
                long j10 = jA + ((long) i10);
                return new q.a(rVar, new r(b(j10), j10));
            }
        }
        return new q.a(rVar);
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public boolean S1() {
        return this.f53995g != -1;
    }

    public long b(long position) {
        return c(position, this.f53993e, this.f53996h);
    }
}
