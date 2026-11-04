package androidx.media2.exoplayer.external.analytics;

import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.m0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.trackselection.m;
import androidx.media2.exoplayer.external.trackselection.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.s;
import androidx.media2.exoplayer.external.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h implements c, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f53192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, b> f53193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, c.a> f53194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final a f53195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f53196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z0.b f53197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f53198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private String f53199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private String f53200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f53203l;

    public interface a {
        void a(c.a eventTime, g playbackStats);
    }

    private static final class b {
        private long A;
        private long B;
        private long C;
        private long D;
        private long E;
        private int F;
        private int G;
        private int H;
        private long I;
        private boolean J;
        private boolean K;
        private boolean L;
        private boolean M;
        private int N;
        private boolean O;
        private boolean P;
        private long Q;

        @p0
        private Format R;

        @p0
        private Format S;
        private long T;
        private long U;
        private float V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f53204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f53205b = new long[13];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<Pair<c.a, Integer>> f53206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<long[]> f53207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<Pair<c.a, Format>> f53208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<Pair<c.a, Format>> f53209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<Pair<c.a, Exception>> f53210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List<Pair<c.a, Exception>> f53211h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f53212i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f53213j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f53214k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f53215l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f53216m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f53217n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f53218o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f53219p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f53220q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f53221r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f53222s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f53223t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f53224u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private long f53225v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private long f53226w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private long f53227x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private long f53228y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private long f53229z;

        public b(boolean keepHistory, c.a startTime) {
            this.f53204a = keepHistory;
            this.f53206c = keepHistory ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f53207d = keepHistory ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f53208e = keepHistory ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f53209f = keepHistory ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f53210g = keepHistory ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.f53211h = keepHistory ? new ArrayList<>() : Collections.EMPTY_LIST;
            boolean z10 = false;
            this.H = 0;
            this.I = startTime.f53140a;
            this.N = 1;
            this.f53213j = -9223372036854775807L;
            this.f53221r = -9223372036854775807L;
            z.a aVar = startTime.f53143d;
            if (aVar != null && aVar.b()) {
                z10 = true;
            }
            this.f53212i = z10;
            this.f53224u = -1L;
            this.f53223t = -1L;
            this.f53222s = -1;
            this.V = 1.0f;
        }

        private int D() {
            if (this.L) {
                return this.H == 9 ? 9 : 12;
            }
            if (this.J) {
                return 5;
            }
            if (this.O) {
                return 11;
            }
            if (!this.K) {
                return this.P ? 1 : 0;
            }
            int i10 = this.N;
            if (i10 == 4) {
                return 9;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return this.M ? 3 : 4;
                }
                if (i10 != 1 || this.H == 0) {
                    return this.H;
                }
                return 10;
            }
            int i11 = this.H;
            if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 12) {
                return 2;
            }
            if (i11 != 5 && i11 != 8) {
                return this.M ? 6 : 7;
            }
            return 8;
        }

        private long[] b(long realtimeMs) {
            List<long[]> list = this.f53207d;
            long[] jArr = list.get(list.size() - 1);
            return new long[]{realtimeMs, jArr[1] + ((long) ((realtimeMs - jArr[0]) * this.V))};
        }

        private static boolean c(int oldState, int newState) {
            return ((oldState != 1 && oldState != 2 && oldState != 12) || newState == 1 || newState == 2 || newState == 12 || newState == 3 || newState == 4 || newState == 9) ? false : true;
        }

        private static boolean d(int state) {
            return state == 4 || state == 7;
        }

        private static boolean e(int state) {
            if (state != 3 && state != 4) {
                return false;
            }
            return true;
        }

        private static boolean f(int state) {
            return state == 6 || state == 7;
        }

        private void g(long nowMs) {
            Format format;
            int i10;
            if (this.H == 3 && (format = this.S) != null && (i10 = format.f53097e) != -1) {
                long j10 = (long) ((nowMs - this.U) * this.V);
                this.f53229z += j10;
                this.A += j10 * ((long) i10);
            }
            this.U = nowMs;
        }

        private void h(long nowMs) {
            Format format;
            if (this.H == 3 && (format = this.R) != null) {
                long j10 = (long) ((nowMs - this.T) * this.V);
                int i10 = format.f53111o;
                if (i10 != -1) {
                    this.f53225v += j10;
                    this.f53226w += ((long) i10) * j10;
                }
                int i11 = format.f53097e;
                if (i11 != -1) {
                    this.f53227x += j10;
                    this.f53228y += j10 * ((long) i11);
                }
            }
            this.T = nowMs;
        }

        private void i(c.a eventTime, @p0 Format newFormat) {
            int i10;
            if (q0.b(this.S, newFormat)) {
                return;
            }
            g(eventTime.f53140a);
            if (newFormat != null && this.f53224u == -1 && (i10 = newFormat.f53097e) != -1) {
                this.f53224u = i10;
            }
            this.S = newFormat;
            if (this.f53204a) {
                this.f53209f.add(Pair.create(eventTime, newFormat));
            }
        }

        private void j(long nowMs) {
            if (f(this.H)) {
                long j10 = nowMs - this.Q;
                long j11 = this.f53221r;
                if (j11 == -9223372036854775807L || j10 > j11) {
                    this.f53221r = j10;
                }
            }
        }

        private void k(long realtimeMs, long mediaTimeMs) {
            if (this.H != 3) {
                if (mediaTimeMs == -9223372036854775807L) {
                    return;
                }
                if (!this.f53207d.isEmpty()) {
                    List<long[]> list = this.f53207d;
                    long j10 = list.get(list.size() - 1)[1];
                    if (j10 != mediaTimeMs) {
                        this.f53207d.add(new long[]{realtimeMs, j10});
                    }
                }
            }
            this.f53207d.add(mediaTimeMs == -9223372036854775807L ? b(realtimeMs) : new long[]{realtimeMs, mediaTimeMs});
        }

        private void l(c.a eventTime, boolean belongsToPlayback) {
            int iD = D();
            if (iD == this.H) {
                return;
            }
            androidx.media2.exoplayer.external.util.a.a(eventTime.f53140a >= this.I);
            long j10 = eventTime.f53140a;
            long j11 = j10 - this.I;
            long[] jArr = this.f53205b;
            int i10 = this.H;
            jArr[i10] = jArr[i10] + j11;
            if (this.f53213j == -9223372036854775807L) {
                this.f53213j = j10;
            }
            this.f53216m |= c(i10, iD);
            this.f53214k |= e(iD);
            this.f53215l |= iD == 9;
            if (!d(this.H) && d(iD)) {
                this.f53217n++;
            }
            if (iD == 5) {
                this.f53219p++;
            }
            if (!f(this.H) && f(iD)) {
                this.f53220q++;
                this.Q = eventTime.f53140a;
            }
            if (iD == 7 && this.H == 6) {
                this.f53218o++;
            }
            k(eventTime.f53140a, belongsToPlayback ? eventTime.f53144e : -9223372036854775807L);
            j(eventTime.f53140a);
            h(eventTime.f53140a);
            g(eventTime.f53140a);
            this.H = iD;
            this.I = eventTime.f53140a;
            if (this.f53204a) {
                this.f53206c.add(Pair.create(eventTime, Integer.valueOf(iD)));
            }
        }

        private void m(c.a eventTime, @p0 Format newFormat) {
            int i10;
            int i11;
            if (q0.b(this.R, newFormat)) {
                return;
            }
            h(eventTime.f53140a);
            if (newFormat != null) {
                if (this.f53222s == -1 && (i11 = newFormat.f53111o) != -1) {
                    this.f53222s = i11;
                }
                if (this.f53223t == -1 && (i10 = newFormat.f53097e) != -1) {
                    this.f53223t = i10;
                }
            }
            this.R = newFormat;
            if (this.f53204a) {
                this.f53208e.add(Pair.create(eventTime, newFormat));
            }
        }

        public void A(c.a eventTime, boolean belongsToPlayback) {
            this.L = true;
            this.J = false;
            l(eventTime, belongsToPlayback);
        }

        public void B(c.a eventTime, p trackSelections) {
            boolean z10 = false;
            boolean z11 = false;
            for (m mVar : trackSelections.b()) {
                if (mVar != null && mVar.length() > 0) {
                    int iG = s.g(mVar.l(0).f53103i);
                    if (iG == 2) {
                        z10 = true;
                    } else if (iG == 1) {
                        z11 = true;
                    }
                }
            }
            if (!z10) {
                m(eventTime, null);
            }
            if (z11) {
                return;
            }
            i(eventTime, null);
        }

        public void C(c.a eventTime, int width, int height) {
            Format format = this.R;
            if (format == null || format.f53111o != -1) {
                return;
            }
            m(eventTime, format.n(width, height));
        }

        public g a(boolean z10) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.f53205b;
            List<long[]> list2 = this.f53207d;
            if (z10) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.f53205b, 13);
                long jMax = Math.max(0L, jElapsedRealtime - this.I);
                int i10 = this.H;
                jArrCopyOf[i10] = jArrCopyOf[i10] + jMax;
                j(jElapsedRealtime);
                h(jElapsedRealtime);
                g(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.f53207d);
                if (this.f53204a && this.H == 3) {
                    arrayList.add(b(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i11 = (this.f53216m || !this.f53214k) ? 1 : 0;
            long j10 = i11 != 0 ? -9223372036854775807L : jArr[2];
            int i12 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z10 ? this.f53208e : new ArrayList(this.f53208e);
            List arrayList3 = z10 ? this.f53209f : new ArrayList(this.f53209f);
            List arrayList4 = z10 ? this.f53206c : new ArrayList(this.f53206c);
            long j11 = this.f53213j;
            boolean z11 = this.K;
            int i13 = !this.f53214k ? 1 : 0;
            boolean z12 = this.f53215l;
            int i14 = i11 ^ 1;
            int i15 = this.f53217n;
            int i16 = this.f53218o;
            int i17 = this.f53219p;
            int i18 = this.f53220q;
            long j12 = this.f53221r;
            boolean z13 = this.f53212i;
            long j13 = this.f53225v;
            long j14 = this.f53226w;
            long j15 = this.f53227x;
            long j16 = this.f53228y;
            long j17 = this.f53229z;
            long j18 = this.A;
            int i19 = this.f53222s;
            int i20 = i19 == -1 ? 0 : 1;
            long j19 = this.f53223t;
            int i21 = j19 == -1 ? 0 : 1;
            long j20 = this.f53224u;
            int i22 = j20 == -1 ? 0 : 1;
            long j21 = this.B;
            long j22 = this.C;
            long j23 = this.D;
            long j24 = this.E;
            int i23 = this.F;
            return new g(1, jArr, arrayList4, list, j11, z11 ? 1 : 0, i13, z12 ? 1 : 0, i12, j10, i14, i15, i16, i17, i18, j12, z13 ? 1 : 0, arrayList2, arrayList3, j13, j14, j15, j16, j17, j18, i20, i21, i19, j19, i22, j20, j21, j22, j23, j24, i23 > 0 ? 1 : 0, i23, this.G, this.f53210g, this.f53211h);
        }

        public void n() {
            this.E++;
        }

        public void o(long timeMs, long bytes) {
            this.B += timeMs;
            this.C += bytes;
        }

        public void p(c.a eventTime, k0.c mediaLoadData) {
            int i10 = mediaLoadData.f56248b;
            if (i10 == 2 || i10 == 0) {
                m(eventTime, mediaLoadData.f56249c);
            } else if (i10 == 1) {
                i(eventTime, mediaLoadData.f56249c);
            }
        }

        public void q(int droppedFrames) {
            this.D += (long) droppedFrames;
        }

        public void r(c.a eventTime, Exception error) {
            this.F++;
            if (this.f53204a) {
                this.f53210g.add(Pair.create(eventTime, error));
            }
            this.O = true;
            this.L = false;
            this.J = false;
            l(eventTime, true);
        }

        public void s(c.a eventTime) {
            this.K = true;
            l(eventTime, true);
        }

        public void t(c.a eventTime) {
            this.P = true;
            l(eventTime, true);
        }

        public void u(c.a eventTime, Exception error) {
            this.G++;
            if (this.f53204a) {
                this.f53211h.add(Pair.create(eventTime, error));
            }
        }

        public void v(c.a eventTime, float playbackSpeed) {
            k(eventTime.f53140a, eventTime.f53144e);
            h(eventTime.f53140a);
            g(eventTime.f53140a);
            this.V = playbackSpeed;
        }

        public void w(c.a eventTime, boolean playWhenReady, int playbackState, boolean belongsToPlayback) {
            this.M = playWhenReady;
            this.N = playbackState;
            boolean z10 = true | true;
            if (playbackState != 1) {
                this.O = false;
            }
            if (playbackState == 1 || playbackState == 4) {
                this.L = false;
            }
            l(eventTime, belongsToPlayback);
        }

        public void x(c.a eventTime) {
            this.L = false;
            l(eventTime, true);
        }

        public void y(c.a eventTime) {
            this.J = false;
            l(eventTime, true);
        }

        public void z(c.a eventTime) {
            this.J = true;
            l(eventTime, true);
        }
    }

    public h(boolean keepHistory, @p0 a callback) {
        this.f53195d = callback;
        this.f53196e = keepHistory;
        e eVar = new e();
        this.f53192a = eVar;
        this.f53193b = new HashMap();
        this.f53194c = new HashMap();
        this.f53198g = g.f53165c0;
        this.f53201j = false;
        this.f53202k = 1;
        this.f53203l = 1.0f;
        this.f53197f = new z0.b();
        eVar.e(this);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void A(c.a aVar, k0.b bVar, k0.c cVar) {
        androidx.media2.exoplayer.external.analytics.b.r(this, aVar, bVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void B(c.a eventTime, int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).n();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void C(c.a aVar, Metadata metadata) {
        androidx.media2.exoplayer.external.analytics.b.x(this, aVar, metadata);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void D(c.a eventTime, androidx.media2.exoplayer.external.i error) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).r(eventTime, error);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.f.a
    public void E(c.a eventTime, String contentSession, String adSession) {
        androidx.media2.exoplayer.external.util.a.i(((z.a) androidx.media2.exoplayer.external.util.a.g(eventTime.f53143d)).b());
        long jF = eventTime.f53141b.h(eventTime.f53143d.f56507a, this.f53197f).f(eventTime.f53143d.f56508b);
        long j10 = eventTime.f53140a;
        z0 z0Var = eventTime.f53141b;
        int i10 = eventTime.f53142c;
        z.a aVar = eventTime.f53143d;
        ((b) androidx.media2.exoplayer.external.util.a.g(this.f53193b.get(contentSession))).A(new c.a(j10, z0Var, i10, new z.a(aVar.f56507a, aVar.f56510d, aVar.f56508b), androidx.media2.exoplayer.external.c.c(jF), eventTime.f53145f, eventTime.f53146g), true);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void F(c.a eventTime, m0 playbackParameters) {
        this.f53203l = playbackParameters.f55313a;
        this.f53192a.c(eventTime);
        Iterator<b> it = this.f53193b.values().iterator();
        while (it.hasNext()) {
            it.next().v(eventTime, this.f53203l);
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void G(c.a eventTime, int reason) {
        this.f53192a.a(eventTime);
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).x(eventTime);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void H(c.a eventTime, k0.b loadEventInfo, k0.c mediaLoadData) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).t(eventTime);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void I(c.a aVar, int i10, androidx.media2.exoplayer.external.decoder.d dVar) {
        androidx.media2.exoplayer.external.analytics.b.e(this, aVar, i10, dVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void J(c.a aVar) {
        androidx.media2.exoplayer.external.analytics.b.j(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void K(c.a aVar) {
        androidx.media2.exoplayer.external.analytics.b.w(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void L(c.a aVar, boolean z10) {
        androidx.media2.exoplayer.external.analytics.b.u(this, aVar, z10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void M(c.a aVar, k0.b bVar, k0.c cVar) {
        androidx.media2.exoplayer.external.analytics.b.q(this, aVar, bVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void N(c.a eventTime, boolean playWhenReady, int playbackState) {
        this.f53201j = playWhenReady;
        this.f53202k = playbackState;
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            this.f53193b.get(str).w(eventTime, playWhenReady, playbackState, this.f53192a.d(eventTime, str));
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void O(c.a aVar, Surface surface) {
        androidx.media2.exoplayer.external.analytics.b.D(this, aVar, surface);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void P(c.a aVar, boolean z10) {
        androidx.media2.exoplayer.external.analytics.b.H(this, aVar, z10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void Q(c.a aVar, int i10, androidx.media2.exoplayer.external.decoder.d dVar) {
        androidx.media2.exoplayer.external.analytics.b.f(this, aVar, i10, dVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void R(c.a aVar) {
        androidx.media2.exoplayer.external.analytics.b.l(this, aVar);
    }

    public void S() {
        HashMap map = new HashMap(this.f53193b);
        c.a aVar = new c.a(SystemClock.elapsedRealtime(), z0.f57952a, 0, null, 0L, 0L, 0L);
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            a(aVar, (String) it.next(), false);
        }
    }

    public g T() {
        int i10 = 1;
        g[] gVarArr = new g[this.f53193b.size() + 1];
        gVarArr[0] = this.f53198g;
        Iterator<b> it = this.f53193b.values().iterator();
        while (it.hasNext()) {
            gVarArr[i10] = it.next().a(false);
            i10++;
        }
        return g.W(gVarArr);
    }

    @p0
    public g U() {
        b bVar;
        String str = this.f53200i;
        if (str != null) {
            bVar = this.f53193b.get(str);
        } else {
            String str2 = this.f53199h;
            bVar = str2 != null ? this.f53193b.get(str2) : null;
        }
        if (bVar == null) {
            return null;
        }
        return bVar.a(false);
    }

    @Override // androidx.media2.exoplayer.external.analytics.f.a
    public void a(c.a eventTime, String session, boolean automaticTransition) {
        if (session.equals(this.f53200i)) {
            this.f53200i = null;
        } else if (session.equals(this.f53199h)) {
            this.f53199h = null;
        }
        b bVar = (b) androidx.media2.exoplayer.external.util.a.g(this.f53193b.remove(session));
        c.a aVar = (c.a) androidx.media2.exoplayer.external.util.a.g(this.f53194c.remove(session));
        if (automaticTransition) {
            bVar.w(eventTime, true, 4, false);
        }
        bVar.A(eventTime, false);
        g gVarA = bVar.a(true);
        this.f53198g = g.W(this.f53198g, gVarA);
        a aVar2 = this.f53195d;
        if (aVar2 != null) {
            aVar2.a(aVar, gVarA);
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void b(c.a eventTime, Exception error) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).u(eventTime, error);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.f.a
    public void c(c.a eventTime, String session) {
        ((b) androidx.media2.exoplayer.external.util.a.g(this.f53193b.get(session))).s(eventTime);
        z.a aVar = eventTime.f53143d;
        if (aVar == null || !aVar.b()) {
            this.f53199h = session;
        } else {
            this.f53200i = session;
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void d(c.a eventTime) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).z(eventTime);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void e(c.a eventTime, int reason) {
        this.f53192a.f(eventTime, reason);
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).x(eventTime);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void f(c.a aVar, int i10, String str, long j10) {
        androidx.media2.exoplayer.external.analytics.b.g(this, aVar, i10, str, j10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void g(c.a aVar) {
        androidx.media2.exoplayer.external.analytics.b.k(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void h(c.a aVar) {
        androidx.media2.exoplayer.external.analytics.b.m(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void i(c.a aVar) {
        androidx.media2.exoplayer.external.analytics.b.v(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.f.a
    public void j(c.a eventTime, String session) {
        b bVar = new b(this.f53196e, eventTime);
        bVar.w(eventTime, this.f53201j, this.f53202k, true);
        bVar.v(eventTime, this.f53203l);
        this.f53193b.put(session, bVar);
        this.f53194c.put(session, eventTime);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void k(c.a aVar, int i10) {
        androidx.media2.exoplayer.external.analytics.b.E(this, aVar, i10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void l(c.a eventTime) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).y(eventTime);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void m(c.a eventTime, k0.c mediaLoadData) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).p(eventTime, mediaLoadData);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void n(c.a aVar) {
        androidx.media2.exoplayer.external.analytics.b.C(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void o(c.a aVar, androidx.media2.exoplayer.external.audio.c cVar) {
        androidx.media2.exoplayer.external.analytics.b.a(this, aVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void p(c.a aVar, int i10, int i11) {
        androidx.media2.exoplayer.external.analytics.b.I(this, aVar, i10, i11);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void q(c.a eventTime, int totalLoadTimeMs, long totalBytesLoaded, long bitrateEstimate) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).o(totalLoadTimeMs, totalBytesLoaded);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void r(c.a aVar, int i10) {
        androidx.media2.exoplayer.external.analytics.b.b(this, aVar, i10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void s(c.a eventTime, k0.b loadEventInfo, k0.c mediaLoadData, IOException error, boolean wasCanceled) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).u(eventTime, error);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void t(c.a eventTime, int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).C(eventTime, width, height);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void u(c.a eventTime, TrackGroupArray trackGroups, p trackSelections) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).B(eventTime, trackSelections);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void v(c.a aVar) {
        androidx.media2.exoplayer.external.analytics.b.o(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void w(c.a aVar, float f10) {
        androidx.media2.exoplayer.external.analytics.b.N(this, aVar, f10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void x(c.a eventTime, int droppedFrames, long elapsedMs) {
        this.f53192a.c(eventTime);
        for (String str : this.f53193b.keySet()) {
            if (this.f53192a.d(eventTime, str)) {
                this.f53193b.get(str).q(droppedFrames);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void y(c.a aVar, k0.c cVar) {
        androidx.media2.exoplayer.external.analytics.b.L(this, aVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void z(c.a aVar, int i10, Format format) {
        androidx.media2.exoplayer.external.analytics.b.h(this, aVar, i10, format);
    }
}
