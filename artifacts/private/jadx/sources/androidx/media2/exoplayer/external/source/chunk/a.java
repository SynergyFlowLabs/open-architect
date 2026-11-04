package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class a extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f55764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f55765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f55766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f55767m;

    public a(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, Format trackFormat, int trackSelectionReason, @p0 Object trackSelectionData, long startTimeUs, long endTimeUs, long clippedStartTimeUs, long clippedEndTimeUs, long chunkIndex) {
        super(dataSource, dataSpec, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, chunkIndex);
        this.f55764j = clippedStartTimeUs;
        this.f55765k = clippedEndTimeUs;
    }

    public final int i(int trackIndex) {
        return this.f55767m[trackIndex];
    }

    protected final c j() {
        return this.f55766l;
    }

    public void k(c output) {
        this.f55766l = output;
        this.f55767m = output.b();
    }
}
