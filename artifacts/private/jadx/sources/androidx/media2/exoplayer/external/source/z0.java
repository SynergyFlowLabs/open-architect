package androidx.media2.exoplayer.external.source;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class z0 extends androidx.media2.exoplayer.external.z0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f56512l = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f56513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f56514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f56515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f56516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f56517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f56518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f56519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f56520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final Object f56521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final Object f56522k;

    public z0(long durationUs, boolean isSeekable, boolean isDynamic) {
        this(durationUs, isSeekable, isDynamic, null, null);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int b(Object uid) {
        return f56512l.equals(uid) ? 0 : -1;
    }

    @Override // androidx.media2.exoplayer.external.z0
    public androidx.media2.exoplayer.external.z0.b g(int periodIndex, androidx.media2.exoplayer.external.z0.b period, boolean setIds) {
        androidx.media2.exoplayer.external.util.a.c(periodIndex, 0, 1);
        return period.p(null, setIds ? f56512l : null, 0, this.f56515d, -this.f56517f);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int i() {
        return 1;
    }

    @Override // androidx.media2.exoplayer.external.z0
    public Object m(int periodIndex) {
        androidx.media2.exoplayer.external.util.a.c(periodIndex, 0, 1);
        return f56512l;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v3 long) binds: [B:3:0x000f, B:5:0x0017, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media2.exoplayer.external.z0
    public androidx.media2.exoplayer.external.z0.c o(int windowIndex, androidx.media2.exoplayer.external.z0.c window, long defaultPositionProjectionUs) {
        long j10;
        androidx.media2.exoplayer.external.util.a.c(windowIndex, 0, 1);
        long j11 = this.f56518g;
        boolean z10 = this.f56520i;
        if (!z10 || defaultPositionProjectionUs == 0) {
            j10 = j11;
        } else {
            long j12 = this.f56516e;
            if (j12 != -9223372036854775807L) {
                j11 += defaultPositionProjectionUs;
                if (j11 <= j12) {
                    j10 = j11;
                }
            }
            j10 = -9223372036854775807L;
        }
        return window.g(this.f56521j, this.f56522k, this.f56513b, this.f56514c, this.f56519h, z10, j10, this.f56516e, 0, 0, this.f56517f);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int r() {
        return 1;
    }

    public z0(long durationUs, boolean isSeekable, boolean isDynamic, @androidx.annotation.p0 Object manifest, @androidx.annotation.p0 Object tag) {
        this(durationUs, durationUs, 0L, 0L, isSeekable, isDynamic, manifest, tag);
    }

    public z0(long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, @androidx.annotation.p0 Object manifest, @androidx.annotation.p0 Object tag) {
        this(-9223372036854775807L, -9223372036854775807L, periodDurationUs, windowDurationUs, windowPositionInPeriodUs, windowDefaultStartPositionUs, isSeekable, isDynamic, manifest, tag);
    }

    public z0(long presentationStartTimeMs, long windowStartTimeMs, long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, @androidx.annotation.p0 Object manifest, @androidx.annotation.p0 Object tag) {
        this.f56513b = presentationStartTimeMs;
        this.f56514c = windowStartTimeMs;
        this.f56515d = periodDurationUs;
        this.f56516e = windowDurationUs;
        this.f56517f = windowPositionInPeriodUs;
        this.f56518g = windowDefaultStartPositionUs;
        this.f56519h = isSeekable;
        this.f56520i = isDynamic;
        this.f56522k = manifest;
        this.f56521j = tag;
    }
}
