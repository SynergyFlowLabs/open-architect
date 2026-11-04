package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class o extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f55844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Format f55845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f55846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f55847q;

    public o(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, Format trackFormat, int trackSelectionReason, Object trackSelectionData, long startTimeUs, long endTimeUs, long chunkIndex, int trackType, Format sampleFormat) {
        super(dataSource, dataSpec, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, -9223372036854775807L, -9223372036854775807L, chunkIndex);
        this.f55844n = trackType;
        this.f55845o = sampleFormat;
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public void a() throws InterruptedException, IOException {
        try {
            long jB = this.f55781h.b(this.f55774a.d(this.f55846p));
            if (jB != -1) {
                jB += this.f55846p;
            }
            androidx.media2.exoplayer.external.extractor.e eVar = new androidx.media2.exoplayer.external.extractor.e(this.f55781h, this.f55846p, jB);
            c cVarJ = j();
            cVarJ.c(0L);
            s sVarA = cVarJ.a(0, this.f55844n);
            sVarA.c(this.f55845o);
            for (int iA = 0; iA != -1; iA = sVarA.a(eVar, Integer.MAX_VALUE, true)) {
                this.f55846p += (long) iA;
            }
            sVarA.b(this.f55779f, 1, (int) this.f55846p, 0, null);
            q0.n(this.f55781h);
            this.f55847q = true;
        } catch (Throwable th2) {
            q0.n(this.f55781h);
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public void b() {
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.l
    public boolean h() {
        return this.f55847q;
    }
}
