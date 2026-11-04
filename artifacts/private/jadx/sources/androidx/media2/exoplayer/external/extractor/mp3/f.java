package androidx.media2.exoplayer.external.extractor.mp3;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.extractor.o;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.r;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class f implements e.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f54283h = "VbriSeeker";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f54284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f54285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f54286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f54287g;

    private f(long[] timesUs, long[] positions, long durationUs, long dataEndPosition) {
        this.f54284d = timesUs;
        this.f54285e = positions;
        this.f54286f = durationUs;
        this.f54287g = dataEndPosition;
    }

    @p0
    public static f a(long inputLength, long position, o mpegAudioHeader, x frame) {
        int iD;
        frame.R(10);
        int iL = frame.l();
        f fVar = null;
        if (iL <= 0) {
            return null;
        }
        int i10 = mpegAudioHeader.f54570d;
        long jI0 = q0.I0(iL, ((long) (i10 >= 32000 ? 1152 : 576)) * 1000000, i10);
        int iJ = frame.J();
        int iJ2 = frame.J();
        int iJ3 = frame.J();
        frame.R(2);
        long j10 = position + ((long) mpegAudioHeader.f54569c);
        long[] jArr = new long[iJ];
        long[] jArr2 = new long[iJ];
        int i11 = 0;
        long j11 = position;
        while (i11 < iJ) {
            f fVar2 = fVar;
            int i12 = iJ2;
            long[] jArr3 = jArr;
            jArr3[i11] = (((long) i11) * jI0) / ((long) iJ);
            jArr2[i11] = Math.max(j11, j10);
            if (iJ3 == 1) {
                iD = frame.D();
            } else if (iJ3 == 2) {
                iD = frame.J();
            } else if (iJ3 == 3) {
                iD = frame.G();
            } else {
                if (iJ3 != 4) {
                    return fVar2;
                }
                iD = frame.H();
            }
            j11 += (long) (iD * i12);
            i11++;
            fVar = fVar2;
            iJ2 = i12;
            jArr = jArr3;
        }
        long[] jArr4 = jArr;
        if (inputLength != -1 && inputLength != j11) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("VBRI data size mismatch: ");
            sb2.append(inputLength);
            sb2.append(", ");
            sb2.append(j11);
            p.l(f54283h, sb2.toString());
        }
        return new f(jArr4, jArr2, jI0, j11);
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public long Q1() {
        return this.f54286f;
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public q.a R1(long timeUs) {
        int iH = q0.h(this.f54284d, timeUs, true, true);
        r rVar = new r(this.f54284d[iH], this.f54285e[iH]);
        if (rVar.f54701a >= timeUs || iH == this.f54284d.length - 1) {
            return new q.a(rVar);
        }
        int i10 = iH + 1;
        return new q.a(rVar, new r(this.f54284d[i10], this.f54285e[i10]));
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public boolean S1() {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.mp3.e.b
    public long d() {
        return this.f54287g;
    }

    @Override // androidx.media2.exoplayer.external.extractor.mp3.e.b
    public long e(long position) {
        return this.f54284d[q0.h(this.f54285e, position, true, true)];
    }
}
