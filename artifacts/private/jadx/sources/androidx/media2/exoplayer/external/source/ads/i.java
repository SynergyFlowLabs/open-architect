package androidx.media2.exoplayer.external.source.ads;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.media2.exoplayer.external.source.r;
import androidx.media2.exoplayer.external.z0;

/* JADX INFO: loaded from: classes2.dex */
@l1(otherwise = 3)
@b1({b1.a.LIBRARY_GROUP})
public final class i extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f55735c;

    public i(z0 contentTimeline, a adPlaybackState) {
        super(contentTimeline);
        androidx.media2.exoplayer.external.util.a.i(contentTimeline.i() == 1);
        androidx.media2.exoplayer.external.util.a.i(contentTimeline.r() == 1);
        this.f55735c = adPlaybackState;
    }

    @Override // androidx.media2.exoplayer.external.source.r, androidx.media2.exoplayer.external.z0
    public z0.b g(int periodIndex, z0.b period, boolean setIds) {
        this.f56325b.g(periodIndex, period, setIds);
        period.q(period.f57953a, period.f57954b, period.f57955c, period.f57956d, period.m(), this.f55735c);
        return period;
    }

    @Override // androidx.media2.exoplayer.external.source.r, androidx.media2.exoplayer.external.z0
    public z0.c o(int windowIndex, z0.c window, long defaultPositionProjectionUs) {
        z0.c cVarO = super.o(windowIndex, window, defaultPositionProjectionUs);
        if (cVarO.f57968j == -9223372036854775807L) {
            cVarO.f57968j = this.f55735c.f55698e;
        }
        return cVarO;
    }
}
