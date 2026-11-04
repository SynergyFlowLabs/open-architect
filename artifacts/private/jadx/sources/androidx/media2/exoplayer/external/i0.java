package androidx.media2.exoplayer.external;

import android.util.Pair;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class i0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f55268m = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f55271c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f55274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private g0 f55275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private g0 f55276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private g0 f55277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private Object f55279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f55280l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0.b f55269a = new z0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0.c f55270b = new z0.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z0 f55272d = z0.f57952a;

    private boolean A() {
        g0 g0VarJ = this.f55275g;
        if (g0VarJ == null) {
            return true;
        }
        int iB = this.f55272d.b(g0VarJ.f55226b);
        while (true) {
            iB = this.f55272d.d(iB, this.f55269a, this.f55270b, this.f55273e, this.f55274f);
            while (g0VarJ.j() != null && !g0VarJ.f55230f.f55257f) {
                g0VarJ = g0VarJ.j();
            }
            g0 g0VarJ2 = g0VarJ.j();
            if (iB == -1 || g0VarJ2 == null || this.f55272d.b(g0VarJ2.f55226b) != iB) {
                break;
            }
            g0VarJ = g0VarJ2;
        }
        boolean zU = u(g0VarJ);
        g0VarJ.f55230f = p(g0VarJ.f55230f);
        return !zU;
    }

    private boolean c(long previousDurationUs, long newDurationUs) {
        if (previousDurationUs != -9223372036854775807L && previousDurationUs != newDurationUs) {
            return false;
        }
        return true;
    }

    private boolean d(h0 oldInfo, h0 newInfo) {
        return oldInfo.f55253b == newInfo.f55253b && oldInfo.f55252a.equals(newInfo.f55252a);
    }

    private h0 g(l0 playbackInfo) {
        return j(playbackInfo.f55299b, playbackInfo.f55301d, playbackInfo.f55300c);
    }

    @androidx.annotation.p0
    private h0 h(g0 mediaPeriodHolder, long rendererPositionUs) {
        Object obj;
        long j10;
        long j11;
        long j12;
        long j13;
        h0 h0Var = mediaPeriodHolder.f55230f;
        long jL = (mediaPeriodHolder.l() + h0Var.f55256e) - rendererPositionUs;
        if (!h0Var.f55257f) {
            androidx.media2.exoplayer.external.source.z.a aVar = h0Var.f55252a;
            this.f55272d.h(aVar.f56507a, this.f55269a);
            if (!aVar.b()) {
                int iE = this.f55269a.e(h0Var.f55255d);
                if (iE == -1) {
                    return l(aVar.f56507a, h0Var.f55256e, aVar.f56510d);
                }
                int iJ = this.f55269a.j(iE);
                if (this.f55269a.o(iE, iJ)) {
                    return k(aVar.f56507a, iE, iJ, h0Var.f55256e, aVar.f56510d);
                }
                return null;
            }
            int i10 = aVar.f56508b;
            int iA = this.f55269a.a(i10);
            if (iA == -1) {
                return null;
            }
            int iK = this.f55269a.k(i10, aVar.f56509c);
            if (iK < iA) {
                if (this.f55269a.o(i10, iK)) {
                    return k(aVar.f56507a, i10, iK, h0Var.f55254c, aVar.f56510d);
                }
                return null;
            }
            long jLongValue = h0Var.f55254c;
            if (jLongValue == -9223372036854775807L) {
                z0 z0Var = this.f55272d;
                z0.c cVar = this.f55270b;
                z0.b bVar = this.f55269a;
                Pair<Object, Long> pairK = z0Var.k(cVar, bVar, bVar.f57955c, -9223372036854775807L, Math.max(0L, jL));
                if (pairK == null) {
                    return null;
                }
                jLongValue = ((Long) pairK.second).longValue();
            }
            return l(aVar.f56507a, jLongValue, aVar.f56510d);
        }
        int iD = this.f55272d.d(this.f55272d.b(h0Var.f55252a.f56507a), this.f55269a, this.f55270b, this.f55273e, this.f55274f);
        if (iD == -1) {
            return null;
        }
        int i11 = this.f55272d.g(iD, this.f55269a, true).f57955c;
        Object obj2 = this.f55269a.f57954b;
        long j14 = h0Var.f55252a.f56510d;
        if (this.f55272d.n(i11, this.f55270b).f57965g == iD) {
            Pair<Object, Long> pairK2 = this.f55272d.k(this.f55270b, this.f55269a, i11, -9223372036854775807L, Math.max(0L, jL));
            if (pairK2 == null) {
                return null;
            }
            Object obj3 = pairK2.first;
            long jLongValue2 = ((Long) pairK2.second).longValue();
            g0 g0VarJ = mediaPeriodHolder.j();
            if (g0VarJ == null || !g0VarJ.f55226b.equals(obj3)) {
                j13 = this.f55271c;
                this.f55271c = 1 + j13;
            } else {
                j13 = g0VarJ.f55230f.f55252a.f56510d;
            }
            long j15 = j13;
            obj = obj3;
            j10 = j15;
            j11 = jLongValue2;
            j12 = -9223372036854775807L;
        } else {
            obj = obj2;
            j10 = j14;
            j11 = 0;
            j12 = 0;
        }
        return j(w(obj, j11, j10), j12, j11);
    }

    private h0 j(androidx.media2.exoplayer.external.source.z.a id2, long contentPositionUs, long startPositionUs) {
        this.f55272d.h(id2.f56507a, this.f55269a);
        if (!id2.b()) {
            return l(id2.f56507a, startPositionUs, id2.f56510d);
        }
        if (this.f55269a.o(id2.f56508b, id2.f56509c)) {
            return k(id2.f56507a, id2.f56508b, id2.f56509c, contentPositionUs, id2.f56510d);
        }
        return null;
    }

    private h0 k(Object periodUid, int adGroupIndex, int adIndexInAdGroup, long contentPositionUs, long windowSequenceNumber) {
        androidx.media2.exoplayer.external.source.z.a aVar = new androidx.media2.exoplayer.external.source.z.a(periodUid, adGroupIndex, adIndexInAdGroup, windowSequenceNumber);
        return new h0(aVar, adIndexInAdGroup == this.f55269a.j(adGroupIndex) ? this.f55269a.g() : 0L, contentPositionUs, -9223372036854775807L, this.f55272d.h(aVar.f56507a, this.f55269a).b(aVar.f56508b, aVar.f56509c), false, false);
    }

    private h0 l(Object periodUid, long startPositionUs, long windowSequenceNumber) {
        int iD = this.f55269a.d(startPositionUs);
        androidx.media2.exoplayer.external.source.z.a aVar = new androidx.media2.exoplayer.external.source.z.a(periodUid, windowSequenceNumber, iD);
        boolean zQ = q(aVar);
        boolean zR = r(aVar, zQ);
        long jF = iD != -1 ? this.f55269a.f(iD) : -9223372036854775807L;
        return new h0(aVar, startPositionUs, -9223372036854775807L, jF, (jF == -9223372036854775807L || jF == Long.MIN_VALUE) ? this.f55269a.f57956d : jF, zQ, zR);
    }

    private boolean q(androidx.media2.exoplayer.external.source.z.a id2) {
        return !id2.b() && id2.f56511e == -1;
    }

    private boolean r(androidx.media2.exoplayer.external.source.z.a id2, boolean isLastMediaPeriodInPeriod) {
        int iB = this.f55272d.b(id2.f56507a);
        return !this.f55272d.n(this.f55272d.f(iB, this.f55269a).f57955c, this.f55270b).f57964f && this.f55272d.t(iB, this.f55269a, this.f55270b, this.f55273e, this.f55274f) && isLastMediaPeriodInPeriod;
    }

    private androidx.media2.exoplayer.external.source.z.a w(Object periodUid, long positionUs, long windowSequenceNumber) {
        this.f55272d.h(periodUid, this.f55269a);
        int iE = this.f55269a.e(positionUs);
        return iE == -1 ? new androidx.media2.exoplayer.external.source.z.a(periodUid, windowSequenceNumber, this.f55269a.d(positionUs)) : new androidx.media2.exoplayer.external.source.z.a(periodUid, iE, this.f55269a.j(iE), windowSequenceNumber);
    }

    private long x(Object periodUid) {
        int iB;
        int i10 = this.f55272d.h(periodUid, this.f55269a).f57955c;
        Object obj = this.f55279k;
        if (obj != null && (iB = this.f55272d.b(obj)) != -1 && this.f55272d.f(iB, this.f55269a).f57955c == i10) {
            return this.f55280l;
        }
        for (g0 g0VarJ = this.f55275g; g0VarJ != null; g0VarJ = g0VarJ.j()) {
            if (g0VarJ.f55226b.equals(periodUid)) {
                return g0VarJ.f55230f.f55252a.f56510d;
            }
        }
        for (g0 g0VarJ2 = this.f55275g; g0VarJ2 != null; g0VarJ2 = g0VarJ2.j()) {
            int iB2 = this.f55272d.b(g0VarJ2.f55226b);
            if (iB2 != -1 && this.f55272d.f(iB2, this.f55269a).f57955c == i10) {
                return g0VarJ2.f55230f.f55252a.f56510d;
            }
        }
        long j10 = this.f55271c;
        this.f55271c = 1 + j10;
        return j10;
    }

    public boolean B(long rendererPositionUs, long maxRendererReadPositionUs) {
        boolean zU;
        h0 h0VarP;
        g0 g0VarJ = this.f55275g;
        g0 g0Var = null;
        while (g0VarJ != null) {
            h0 h0Var = g0VarJ.f55230f;
            if (g0Var != null) {
                h0 h0VarH = h(g0Var, rendererPositionUs);
                if (h0VarH == null) {
                    zU = u(g0Var);
                } else if (d(h0Var, h0VarH)) {
                    h0VarP = h0VarH;
                } else {
                    zU = u(g0Var);
                }
                return !zU;
            }
            h0VarP = p(h0Var);
            g0VarJ.f55230f = h0VarP.a(h0Var.f55254c);
            if (!c(h0Var.f55256e, h0VarP.f55256e)) {
                long j10 = h0VarP.f55256e;
                return (u(g0VarJ) || (g0VarJ == this.f55276h && ((maxRendererReadPositionUs > Long.MIN_VALUE ? 1 : (maxRendererReadPositionUs == Long.MIN_VALUE ? 0 : -1)) == 0 || (maxRendererReadPositionUs > ((j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : g0VarJ.z(j10)) ? 1 : (maxRendererReadPositionUs == ((j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : g0VarJ.z(j10)) ? 0 : -1)) >= 0))) ? false : true;
            }
            g0Var = g0VarJ;
            g0VarJ = g0VarJ.j();
        }
        return true;
    }

    public boolean C(int repeatMode) {
        this.f55273e = repeatMode;
        return A();
    }

    public boolean D(boolean shuffleModeEnabled) {
        this.f55274f = shuffleModeEnabled;
        return A();
    }

    @androidx.annotation.p0
    public g0 a() {
        g0 g0Var = this.f55275g;
        if (g0Var == null) {
            return null;
        }
        if (g0Var == this.f55276h) {
            this.f55276h = g0Var.j();
        }
        this.f55275g.t();
        int i10 = this.f55278j - 1;
        this.f55278j = i10;
        if (i10 == 0) {
            this.f55277i = null;
            g0 g0Var2 = this.f55275g;
            this.f55279k = g0Var2.f55226b;
            this.f55280l = g0Var2.f55230f.f55252a.f56510d;
        }
        g0 g0VarJ = this.f55275g.j();
        this.f55275g = g0VarJ;
        return g0VarJ;
    }

    public g0 b() {
        g0 g0Var = this.f55276h;
        androidx.media2.exoplayer.external.util.a.i((g0Var == null || g0Var.j() == null) ? false : true);
        g0 g0VarJ = this.f55276h.j();
        this.f55276h = g0VarJ;
        return g0VarJ;
    }

    public void e(boolean keepFrontPeriodUid) {
        g0 g0Var = this.f55275g;
        if (g0Var != null) {
            this.f55279k = keepFrontPeriodUid ? g0Var.f55226b : null;
            this.f55280l = g0Var.f55230f.f55252a.f56510d;
            u(g0Var);
            g0Var.t();
        } else if (!keepFrontPeriodUid) {
            this.f55279k = null;
        }
        this.f55275g = null;
        this.f55277i = null;
        this.f55276h = null;
        this.f55278j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public g0 f(u0[] rendererCapabilities, androidx.media2.exoplayer.external.trackselection.r trackSelector, androidx.media2.exoplayer.external.upstream.b allocator, androidx.media2.exoplayer.external.source.z mediaSource, h0 info, androidx.media2.exoplayer.external.trackselection.s emptyTrackSelectorResult) {
        long jL;
        g0 g0Var = this.f55277i;
        if (g0Var != null) {
            jL = (g0Var.l() + this.f55277i.f55230f.f55256e) - info.f55253b;
        } else if (info.f55252a.b()) {
            jL = info.f55254c;
            if (jL == -9223372036854775807L) {
                jL = 0;
            }
        } else {
            jL = 0;
        }
        g0 g0Var2 = new g0(rendererCapabilities, jL, trackSelector, allocator, mediaSource, info, emptyTrackSelectorResult);
        g0 g0Var3 = this.f55277i;
        if (g0Var3 != null) {
            g0Var3.w(g0Var2);
        } else {
            this.f55275g = g0Var2;
            this.f55276h = g0Var2;
        }
        this.f55279k = null;
        this.f55277i = g0Var2;
        this.f55278j++;
        return g0Var2;
    }

    @androidx.annotation.p0
    public g0 i() {
        return this.f55277i;
    }

    @androidx.annotation.p0
    public h0 m(long rendererPositionUs, l0 playbackInfo) {
        g0 g0Var = this.f55277i;
        return g0Var == null ? g(playbackInfo) : h(g0Var, rendererPositionUs);
    }

    @androidx.annotation.p0
    public g0 n() {
        return this.f55275g;
    }

    @androidx.annotation.p0
    public g0 o() {
        return this.f55276h;
    }

    public h0 p(h0 info) {
        long jI;
        androidx.media2.exoplayer.external.source.z.a aVar = info.f55252a;
        boolean zQ = q(aVar);
        boolean zR = r(aVar, zQ);
        this.f55272d.h(info.f55252a.f56507a, this.f55269a);
        if (aVar.b()) {
            jI = this.f55269a.b(aVar.f56508b, aVar.f56509c);
        } else {
            jI = info.f55255d;
            if (jI == -9223372036854775807L || jI == Long.MIN_VALUE) {
                jI = this.f55269a.i();
            }
        }
        return new h0(aVar, info.f55253b, info.f55254c, info.f55255d, jI, zQ, zR);
    }

    public boolean s(androidx.media2.exoplayer.external.source.x mediaPeriod) {
        g0 g0Var = this.f55277i;
        return g0Var != null && g0Var.f55225a == mediaPeriod;
    }

    public void t(long rendererPositionUs) {
        g0 g0Var = this.f55277i;
        if (g0Var != null) {
            g0Var.s(rendererPositionUs);
        }
    }

    public boolean u(g0 mediaPeriodHolder) {
        boolean z10 = false;
        androidx.media2.exoplayer.external.util.a.i(mediaPeriodHolder != null);
        this.f55277i = mediaPeriodHolder;
        while (mediaPeriodHolder.j() != null) {
            mediaPeriodHolder = mediaPeriodHolder.j();
            if (mediaPeriodHolder == this.f55276h) {
                this.f55276h = this.f55275g;
                z10 = true;
            }
            mediaPeriodHolder.t();
            this.f55278j--;
        }
        this.f55277i.w(null);
        return z10;
    }

    public androidx.media2.exoplayer.external.source.z.a v(Object periodUid, long positionUs) {
        return w(periodUid, positionUs, x(periodUid));
    }

    public void y(z0 timeline) {
        this.f55272d = timeline;
    }

    public boolean z() {
        g0 g0Var = this.f55277i;
        return g0Var == null || (!g0Var.f55230f.f55258g && g0Var.q() && this.f55277i.f55230f.f55256e != -9223372036854775807L && this.f55278j < 100);
    }
}
