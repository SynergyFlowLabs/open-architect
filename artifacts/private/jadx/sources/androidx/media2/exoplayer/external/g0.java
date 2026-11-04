package androidx.media2.exoplayer.external;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.source.TrackGroupArray;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class g0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f55224o = "MediaPeriodHolder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media2.exoplayer.external.source.x f55225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media2.exoplayer.external.source.v0[] f55227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f55230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f55231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u0[] f55232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.trackselection.r f55233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.z f55234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private g0 f55235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TrackGroupArray f55236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.media2.exoplayer.external.trackselection.s f55237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f55238n;

    public g0(u0[] rendererCapabilities, long rendererPositionOffsetUs, androidx.media2.exoplayer.external.trackselection.r trackSelector, androidx.media2.exoplayer.external.upstream.b allocator, androidx.media2.exoplayer.external.source.z mediaSource, h0 info, androidx.media2.exoplayer.external.trackselection.s emptyTrackSelectorResult) {
        this.f55232h = rendererCapabilities;
        this.f55238n = rendererPositionOffsetUs;
        this.f55233i = trackSelector;
        this.f55234j = mediaSource;
        androidx.media2.exoplayer.external.source.z.a aVar = info.f55252a;
        this.f55226b = aVar.f56507a;
        this.f55230f = info;
        this.f55236l = TrackGroupArray.f55656d;
        this.f55237m = emptyTrackSelectorResult;
        this.f55227c = new androidx.media2.exoplayer.external.source.v0[rendererCapabilities.length];
        this.f55231g = new boolean[rendererCapabilities.length];
        this.f55225a = e(aVar, mediaSource, allocator, info.f55253b, info.f55255d);
    }

    private void c(androidx.media2.exoplayer.external.source.v0[] sampleStreams) {
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = this.f55232h;
            if (i10 >= u0VarArr.length) {
                return;
            }
            if (u0VarArr[i10].f() == 6 && this.f55237m.c(i10)) {
                sampleStreams[i10] = new androidx.media2.exoplayer.external.source.p();
            }
            i10++;
        }
    }

    private static androidx.media2.exoplayer.external.source.x e(androidx.media2.exoplayer.external.source.z.a id2, androidx.media2.exoplayer.external.source.z mediaSource, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs, long endPositionUs) {
        androidx.media2.exoplayer.external.source.x xVarE = mediaSource.e(id2, allocator, startPositionUs);
        return (endPositionUs == -9223372036854775807L || endPositionUs == Long.MIN_VALUE) ? xVarE : new androidx.media2.exoplayer.external.source.e(xVarE, true, 0L, endPositionUs);
    }

    private void f() {
        if (r()) {
            int i10 = 0;
            while (true) {
                androidx.media2.exoplayer.external.trackselection.s sVar = this.f55237m;
                if (i10 >= sVar.f57229a) {
                    break;
                }
                boolean zC = sVar.c(i10);
                androidx.media2.exoplayer.external.trackselection.m mVarA = this.f55237m.f57231c.a(i10);
                if (zC && mVarA != null) {
                    mVarA.d();
                }
                i10++;
            }
        }
    }

    private void g(androidx.media2.exoplayer.external.source.v0[] sampleStreams) {
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = this.f55232h;
            if (i10 >= u0VarArr.length) {
                return;
            }
            if (u0VarArr[i10].f() == 6) {
                sampleStreams[i10] = null;
            }
            i10++;
        }
    }

    private void h() {
        if (r()) {
            int i10 = 0;
            while (true) {
                androidx.media2.exoplayer.external.trackselection.s sVar = this.f55237m;
                if (i10 >= sVar.f57229a) {
                    break;
                }
                boolean zC = sVar.c(i10);
                androidx.media2.exoplayer.external.trackselection.m mVarA = this.f55237m.f57231c.a(i10);
                if (zC && mVarA != null) {
                    mVarA.h();
                }
                i10++;
            }
        }
    }

    private boolean r() {
        return this.f55235k == null;
    }

    private static void u(long endPositionUs, androidx.media2.exoplayer.external.source.z mediaSource, androidx.media2.exoplayer.external.source.x mediaPeriod) {
        try {
            if (endPositionUs == -9223372036854775807L || endPositionUs == Long.MIN_VALUE) {
                mediaSource.c(mediaPeriod);
            } else {
                mediaSource.c(((androidx.media2.exoplayer.external.source.e) mediaPeriod).f55852a);
            }
        } catch (RuntimeException e10) {
            androidx.media2.exoplayer.external.util.p.e(f55224o, "Period release failed.", e10);
        }
    }

    public long a(androidx.media2.exoplayer.external.trackselection.s trackSelectorResult, long positionUs, boolean forceRecreateStreams) {
        return b(trackSelectorResult, positionUs, forceRecreateStreams, new boolean[this.f55232h.length]);
    }

    public long b(androidx.media2.exoplayer.external.trackselection.s newTrackSelectorResult, long positionUs, boolean forceRecreateStreams, boolean[] streamResetFlags) {
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= newTrackSelectorResult.f57229a) {
                break;
            }
            boolean[] zArr = this.f55231g;
            if (forceRecreateStreams || !newTrackSelectorResult.b(this.f55237m, i10)) {
                z10 = false;
            }
            zArr[i10] = z10;
            i10++;
        }
        g(this.f55227c);
        f();
        this.f55237m = newTrackSelectorResult;
        h();
        androidx.media2.exoplayer.external.trackselection.p pVar = newTrackSelectorResult.f57231c;
        long jS = this.f55225a.s(pVar.b(), this.f55231g, this.f55227c, streamResetFlags, positionUs);
        c(this.f55227c);
        this.f55229e = false;
        int i11 = 0;
        while (true) {
            androidx.media2.exoplayer.external.source.v0[] v0VarArr = this.f55227c;
            if (i11 >= v0VarArr.length) {
                return jS;
            }
            if (v0VarArr[i11] != null) {
                androidx.media2.exoplayer.external.util.a.i(newTrackSelectorResult.c(i11));
                if (this.f55232h[i11].f() != 6) {
                    this.f55229e = true;
                }
            } else {
                androidx.media2.exoplayer.external.util.a.i(pVar.a(i11) == null);
            }
            i11++;
        }
    }

    public void d(long rendererPositionUs) {
        androidx.media2.exoplayer.external.util.a.i(r());
        this.f55225a.k(y(rendererPositionUs));
    }

    public long i() {
        if (!this.f55228d) {
            return this.f55230f.f55253b;
        }
        long jB = this.f55229e ? this.f55225a.b() : Long.MIN_VALUE;
        return jB == Long.MIN_VALUE ? this.f55230f.f55256e : jB;
    }

    @androidx.annotation.p0
    public g0 j() {
        return this.f55235k;
    }

    public long k() {
        if (this.f55228d) {
            return this.f55225a.e();
        }
        return 0L;
    }

    public long l() {
        return this.f55238n;
    }

    public long m() {
        return this.f55230f.f55253b + this.f55238n;
    }

    public TrackGroupArray n() {
        return this.f55236l;
    }

    public androidx.media2.exoplayer.external.trackselection.s o() {
        return this.f55237m;
    }

    public void p(float playbackSpeed, z0 timeline) throws i {
        this.f55228d = true;
        this.f55236l = this.f55225a.m();
        long jA = a(v(playbackSpeed, timeline), this.f55230f.f55253b, false);
        long j10 = this.f55238n;
        h0 h0Var = this.f55230f;
        this.f55238n = j10 + (h0Var.f55253b - jA);
        this.f55230f = h0Var.b(jA);
    }

    public boolean q() {
        return this.f55228d && (!this.f55229e || this.f55225a.b() == Long.MIN_VALUE);
    }

    public void s(long rendererPositionUs) {
        androidx.media2.exoplayer.external.util.a.i(r());
        if (this.f55228d) {
            this.f55225a.c(y(rendererPositionUs));
        }
    }

    public void t() {
        f();
        u(this.f55230f.f55255d, this.f55234j, this.f55225a);
    }

    public androidx.media2.exoplayer.external.trackselection.s v(float playbackSpeed, z0 timeline) throws i {
        androidx.media2.exoplayer.external.trackselection.s sVarE = this.f55233i.e(this.f55232h, n(), this.f55230f.f55252a, timeline);
        int i10 = 5 & 0;
        for (androidx.media2.exoplayer.external.trackselection.m mVar : sVarE.f57231c.b()) {
            if (mVar != null) {
                mVar.m(playbackSpeed);
            }
        }
        return sVarE;
    }

    public void w(@androidx.annotation.p0 g0 nextMediaPeriodHolder) {
        if (nextMediaPeriodHolder == this.f55235k) {
            return;
        }
        f();
        this.f55235k = nextMediaPeriodHolder;
        h();
    }

    public void x(long rendererPositionOffsetUs) {
        this.f55238n = rendererPositionOffsetUs;
    }

    public long y(long rendererTimeUs) {
        return rendererTimeUs - l();
    }

    public long z(long periodTimeUs) {
        return periodTimeUs + l();
    }
}
