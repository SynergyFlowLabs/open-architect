package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class l extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f55840i;

    public l(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, Format trackFormat, int trackSelectionReason, @p0 Object trackSelectionData, long startTimeUs, long endTimeUs, long chunkIndex) {
        super(dataSource, dataSpec, 1, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs);
        androidx.media2.exoplayer.external.util.a.g(trackFormat);
        this.f55840i = chunkIndex;
    }

    public long g() {
        long j10 = this.f55840i;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean h();
}
