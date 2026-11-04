package androidx.media2.exoplayer.external;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.source.TrackGroupArray;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class l0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final androidx.media2.exoplayer.external.source.z.a f55297n = new androidx.media2.exoplayer.external.source.z.a(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f55298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media2.exoplayer.external.source.z.a f55299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final i f55303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrackGroupArray f55305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.media2.exoplayer.external.trackselection.s f55306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.media2.exoplayer.external.source.z.a f55307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile long f55308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f55309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile long f55310m;

    public l0(z0 timeline, androidx.media2.exoplayer.external.source.z.a periodId, long startPositionUs, long contentPositionUs, int playbackState, @androidx.annotation.p0 i playbackError, boolean isLoading, TrackGroupArray trackGroups, androidx.media2.exoplayer.external.trackselection.s trackSelectorResult, androidx.media2.exoplayer.external.source.z.a loadingMediaPeriodId, long bufferedPositionUs, long totalBufferedDurationUs, long positionUs) {
        this.f55298a = timeline;
        this.f55299b = periodId;
        this.f55300c = startPositionUs;
        this.f55301d = contentPositionUs;
        this.f55302e = playbackState;
        this.f55303f = playbackError;
        this.f55304g = isLoading;
        this.f55305h = trackGroups;
        this.f55306i = trackSelectorResult;
        this.f55307j = loadingMediaPeriodId;
        this.f55308k = bufferedPositionUs;
        this.f55309l = totalBufferedDurationUs;
        this.f55310m = positionUs;
    }

    public static l0 h(long startPositionUs, androidx.media2.exoplayer.external.trackselection.s emptyTrackSelectorResult) {
        z0 z0Var = z0.f57952a;
        androidx.media2.exoplayer.external.source.z.a aVar = f55297n;
        return new l0(z0Var, aVar, startPositionUs, -9223372036854775807L, 1, null, false, TrackGroupArray.f55656d, emptyTrackSelectorResult, aVar, startPositionUs, 0L, startPositionUs);
    }

    @androidx.annotation.j
    public l0 a(boolean isLoading) {
        return new l0(this.f55298a, this.f55299b, this.f55300c, this.f55301d, this.f55302e, this.f55303f, isLoading, this.f55305h, this.f55306i, this.f55307j, this.f55308k, this.f55309l, this.f55310m);
    }

    @androidx.annotation.j
    public l0 b(androidx.media2.exoplayer.external.source.z.a loadingMediaPeriodId) {
        return new l0(this.f55298a, this.f55299b, this.f55300c, this.f55301d, this.f55302e, this.f55303f, this.f55304g, this.f55305h, this.f55306i, loadingMediaPeriodId, this.f55308k, this.f55309l, this.f55310m);
    }

    @androidx.annotation.j
    public l0 c(androidx.media2.exoplayer.external.source.z.a periodId, long positionUs, long contentPositionUs, long totalBufferedDurationUs) {
        return new l0(this.f55298a, periodId, positionUs, periodId.b() ? contentPositionUs : -9223372036854775807L, this.f55302e, this.f55303f, this.f55304g, this.f55305h, this.f55306i, this.f55307j, this.f55308k, totalBufferedDurationUs, positionUs);
    }

    @androidx.annotation.j
    public l0 d(@androidx.annotation.p0 i playbackError) {
        return new l0(this.f55298a, this.f55299b, this.f55300c, this.f55301d, this.f55302e, playbackError, this.f55304g, this.f55305h, this.f55306i, this.f55307j, this.f55308k, this.f55309l, this.f55310m);
    }

    @androidx.annotation.j
    public l0 e(int playbackState) {
        return new l0(this.f55298a, this.f55299b, this.f55300c, this.f55301d, playbackState, this.f55303f, this.f55304g, this.f55305h, this.f55306i, this.f55307j, this.f55308k, this.f55309l, this.f55310m);
    }

    @androidx.annotation.j
    public l0 f(z0 timeline) {
        return new l0(timeline, this.f55299b, this.f55300c, this.f55301d, this.f55302e, this.f55303f, this.f55304g, this.f55305h, this.f55306i, this.f55307j, this.f55308k, this.f55309l, this.f55310m);
    }

    @androidx.annotation.j
    public l0 g(TrackGroupArray trackGroups, androidx.media2.exoplayer.external.trackselection.s trackSelectorResult) {
        return new l0(this.f55298a, this.f55299b, this.f55300c, this.f55301d, this.f55302e, this.f55303f, this.f55304g, trackGroups, trackSelectorResult, this.f55307j, this.f55308k, this.f55309l, this.f55310m);
    }

    public androidx.media2.exoplayer.external.source.z.a i(boolean shuffleModeEnabled, z0.c window, z0.b period) {
        if (this.f55298a.s()) {
            return f55297n;
        }
        int iA = this.f55298a.a(shuffleModeEnabled);
        int i10 = this.f55298a.n(iA, window).f57965g;
        int iB = this.f55298a.b(this.f55299b.f56507a);
        return new androidx.media2.exoplayer.external.source.z.a(this.f55298a.m(i10), (iB == -1 || iA != this.f55298a.f(iB, period).f57955c) ? -1L : this.f55299b.f56510d);
    }
}
