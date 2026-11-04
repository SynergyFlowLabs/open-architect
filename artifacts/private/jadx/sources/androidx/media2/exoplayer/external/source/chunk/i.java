package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.upstream.o0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class i extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p f55826t = new p();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f55827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f55828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e f55829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f55830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile boolean f55831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f55832s;

    public i(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, Format trackFormat, int trackSelectionReason, Object trackSelectionData, long startTimeUs, long endTimeUs, long clippedStartTimeUs, long clippedEndTimeUs, long chunkIndex, int chunkCount, long sampleOffsetUs, e extractorWrapper) {
        super(dataSource, dataSpec, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, clippedStartTimeUs, clippedEndTimeUs, chunkIndex);
        this.f55827n = chunkCount;
        this.f55828o = sampleOffsetUs;
        this.f55829p = extractorWrapper;
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public final void a() throws InterruptedException, IOException {
        androidx.media2.exoplayer.external.upstream.o oVarD = this.f55774a.d(this.f55830q);
        try {
            o0 o0Var = this.f55781h;
            androidx.media2.exoplayer.external.extractor.e eVar = new androidx.media2.exoplayer.external.extractor.e(o0Var, oVarD.f57374e, o0Var.b(oVarD));
            if (this.f55830q == 0) {
                c cVarJ = j();
                cVarJ.c(this.f55828o);
                e eVar2 = this.f55829p;
                e.b bVarL = l(cVarJ);
                long j10 = this.f55764j;
                long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f55828o;
                long j12 = this.f55765k;
                eVar2.d(bVarL, j11, j12 != -9223372036854775807L ? j12 - this.f55828o : -9223372036854775807L);
            }
            try {
                androidx.media2.exoplayer.external.extractor.i iVar = this.f55829p.f55782a;
                int iF = 0;
                while (iF == 0 && !this.f55831r) {
                    iF = iVar.f(eVar, f55826t);
                }
                androidx.media2.exoplayer.external.util.a.i(iF != 1);
                this.f55830q = eVar.getPosition() - this.f55774a.f57374e;
                q0.n(this.f55781h);
                this.f55832s = true;
            } catch (Throwable th2) {
                this.f55830q = eVar.getPosition() - this.f55774a.f57374e;
                throw th2;
            }
        } catch (Throwable th3) {
            q0.n(this.f55781h);
            throw th3;
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public final void b() {
        this.f55831r = true;
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.l
    public long g() {
        return this.f55840i + ((long) this.f55827n);
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.l
    public boolean h() {
        return this.f55832s;
    }

    protected e.b l(c baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }
}
