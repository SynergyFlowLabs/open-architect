package androidx.media2.exoplayer.external;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b0 implements Handler.Callback, androidx.media2.exoplayer.external.source.x.a, androidx.media2.exoplayer.external.trackselection.r.a, androidx.media2.exoplayer.external.source.z.b, g.a, q0.a {
    private static final int A3 = 11;
    private static final int B3 = 12;
    private static final int C3 = 13;
    private static final int D3 = 14;
    private static final int E3 = 15;
    private static final int F3 = 16;
    private static final int G3 = 17;
    private static final int H3 = 10;
    private static final int I3 = 1000;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final String f53594m3 = "ExoPlayerImplInternal";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f53595n3 = 0;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f53596o3 = 1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f53597p3 = 0;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int f53598q3 = 1;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final int f53599r3 = 2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f53600s3 = 3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f53601t3 = 4;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f53602u3 = 5;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int f53603v3 = 6;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f53604w3 = 7;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final int f53605x3 = 8;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final int f53606y3 = 9;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final int f53607z3 = 10;
    private boolean H1;
    private l0 X;
    private androidx.media2.exoplayer.external.source.z Y;
    private t0[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0[] f53608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u0[] f53609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.trackselection.r f53610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.trackselection.s f53611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0 f53612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.d f53613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.n f53614g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f53615g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HandlerThread f53616h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f53617h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Handler f53618i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private int f53619i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final z0.c f53620j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private e f53621j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final z0.b f53622k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private long f53623k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f53624l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private int f53625l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f53626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g f53627n;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f53629p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f53630p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f53631p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<c> f53632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.c f53633t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final i0 f53634v = new i0();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private x0 f53635w = x0.f57926g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d f53628o = new d();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media2.exoplayer.external.source.z f53636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z0 f53637b;

        public b(androidx.media2.exoplayer.external.source.z source, z0 timeline) {
            this.f53636a = source;
            this.f53637b = timeline;
        }
    }

    private static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0 f53638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f53639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f53640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f53641d;

        public c(q0 message) {
            this.f53638a = message;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull c other) {
            Object obj = this.f53641d;
            if ((obj == null) != (other.f53641d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f53639b - other.f53639b;
            return i10 != 0 ? i10 : androidx.media2.exoplayer.external.util.q0.p(this.f53640c, other.f53640c);
        }

        public void c(int periodIndex, long periodTimeUs, Object periodUid) {
            this.f53639b = periodIndex;
            this.f53640c = periodTimeUs;
            this.f53641d = periodUid;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private l0 f53642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f53644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f53645d;

        private d() {
        }

        public boolean d(l0 playbackInfo) {
            return playbackInfo != this.f53642a || this.f53643b > 0 || this.f53644c;
        }

        public void e(int operationAcks) {
            this.f53643b += operationAcks;
        }

        public void f(l0 playbackInfo) {
            this.f53642a = playbackInfo;
            this.f53643b = 0;
            this.f53644c = false;
        }

        public void g(int discontinuityReason) {
            if (this.f53644c && this.f53645d != 4) {
                androidx.media2.exoplayer.external.util.a.a(discontinuityReason == 4);
            } else {
                this.f53644c = true;
                this.f53645d = discontinuityReason;
            }
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z0 f53646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f53648c;

        public e(z0 timeline, int windowIndex, long windowPositionUs) {
            this.f53646a = timeline;
            this.f53647b = windowIndex;
            this.f53648c = windowPositionUs;
        }
    }

    public b0(t0[] renderers, androidx.media2.exoplayer.external.trackselection.r trackSelector, androidx.media2.exoplayer.external.trackselection.s emptyTrackSelectorResult, f0 loadControl, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, boolean playWhenReady, int repeatMode, boolean shuffleModeEnabled, Handler eventHandler, androidx.media2.exoplayer.external.util.c clock) {
        this.f53608a = renderers;
        this.f53610c = trackSelector;
        this.f53611d = emptyTrackSelectorResult;
        this.f53612e = loadControl;
        this.f53613f = bandwidthMeter;
        this.f53630p1 = playWhenReady;
        this.f53631p2 = repeatMode;
        this.f53615g3 = shuffleModeEnabled;
        this.f53618i = eventHandler;
        this.f53633t = clock;
        this.f53624l = loadControl.d();
        this.f53626m = loadControl.b();
        this.X = l0.h(-9223372036854775807L, emptyTrackSelectorResult);
        this.f53609b = new u0[renderers.length];
        for (int i10 = 0; i10 < renderers.length; i10++) {
            renderers[i10].setIndex(i10);
            this.f53609b[i10] = renderers[i10].p();
        }
        this.f53627n = new g(this, clock);
        this.f53632s = new ArrayList<>();
        this.Z = new t0[0];
        this.f53620j = new z0.c();
        this.f53622k = new z0.b();
        trackSelector.b(this, bandwidthMeter);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f53616h = handlerThread;
        handlerThread.start();
        this.f53614g = clock.d(handlerThread.getLooper(), this);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x012f A[LOOP:0: B:46:0x012f->B:60:0x012f, LOOP_START, PHI: r15
      0x012f: PHI (r15v17 androidx.media2.exoplayer.external.g0) = (r15v14 androidx.media2.exoplayer.external.g0), (r15v18 androidx.media2.exoplayer.external.g0) binds: [B:45:0x012d, B:60:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:53:0x015b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:58:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x012f A[SYNTHETIC] */
    private void A(b sourceRefreshInfo) throws i {
        androidx.media2.exoplayer.external.source.z.a aVar;
        long jLongValue;
        long jLongValue2;
        androidx.media2.exoplayer.external.source.z.a aVarV;
        g0 g0VarN;
        long j10;
        if (sourceRefreshInfo.f53636a != this.Y) {
            return;
        }
        this.f53628o.e(this.f53619i3);
        this.f53619i3 = 0;
        z0 z0Var = this.X.f55298a;
        z0 z0Var2 = sourceRefreshInfo.f53637b;
        this.f53634v.y(z0Var2);
        this.X = this.X.f(z0Var2);
        V();
        androidx.media2.exoplayer.external.source.z.a aVarV2 = this.X.f55299b;
        long j11 = aVarV2.b() ? this.X.f55301d : this.X.f55310m;
        e eVar = this.f53621j3;
        if (eVar == null) {
            if (j11 == -9223372036854775807L && !z0Var2.s()) {
                Pair<Object, Long> pairR = r(z0Var2, z0Var2.a(this.f53615g3), -9223372036854775807L);
                androidx.media2.exoplayer.external.source.z.a aVarV3 = this.f53634v.v(pairR.first, ((Long) pairR.second).longValue());
                jLongValue = !aVarV3.b() ? ((Long) pairR.second).longValue() : j11;
                aVar = aVarV3;
            } else if (z0Var2.b(aVarV2.f56507a) == -1) {
                Object objX = X(aVarV2.f56507a, z0Var, z0Var2);
                if (objX == null) {
                    z();
                    return;
                } else {
                    Pair<Object, Long> pairR2 = r(z0Var2, z0Var2.h(objX, this.f53622k).f57955c, -9223372036854775807L);
                    jLongValue2 = ((Long) pairR2.second).longValue();
                    aVarV = this.f53634v.v(pairR2.first, jLongValue2);
                }
            } else {
                if (aVarV2.b()) {
                    aVarV2 = this.f53634v.v(aVarV2.f56507a, j11);
                }
                aVar = aVarV2;
                jLongValue = j11;
            }
            if (this.X.f55299b.equals(aVar) || j11 != jLongValue) {
                g0VarN = this.f53634v.n();
                if (g0VarN != null) {
                    while (g0VarN.j() != null) {
                        g0VarN = g0VarN.j();
                        if (g0VarN.f55230f.f55252a.equals(aVar)) {
                            g0VarN.f55230f = this.f53634v.p(g0VarN.f55230f);
                        }
                    }
                }
                if (aVar.b()) {
                    j10 = 0;
                } else {
                    j10 = jLongValue;
                }
                this.X = this.X.c(aVar, c0(aVar, j10), jLongValue, t());
            } else if (!this.f53634v.B(this.f53623k3, p())) {
                a0(false);
            }
            w(false);
        }
        Pair<Object, Long> pairW = W(eVar, true);
        this.f53621j3 = null;
        if (pairW == null) {
            z();
            return;
        } else {
            jLongValue2 = ((Long) pairW.second).longValue();
            aVarV = this.f53634v.v(pairW.first, jLongValue2);
        }
        aVar = aVarV;
        jLongValue = jLongValue2;
        if (this.X.f55299b.equals(aVar)) {
            g0VarN = this.f53634v.n();
            if (g0VarN != null) {
                while (g0VarN.j() != null) {
                    g0VarN = g0VarN.j();
                    if (g0VarN.f55230f.f55252a.equals(aVar)) {
                        g0VarN.f55230f = this.f53634v.p(g0VarN.f55230f);
                    }
                }
            }
            if (aVar.b()) {
                j10 = 0;
            } else {
                j10 = jLongValue;
            }
            this.X = this.X.c(aVar, c0(aVar, j10), jLongValue, t());
        } else {
            g0VarN = this.f53634v.n();
            if (g0VarN != null) {
                while (g0VarN.j() != null) {
                    g0VarN = g0VarN.j();
                    if (g0VarN.f55230f.f55252a.equals(aVar)) {
                        g0VarN.f55230f = this.f53634v.p(g0VarN.f55230f);
                    }
                }
            }
            if (aVar.b()) {
                j10 = 0;
            } else {
                j10 = jLongValue;
            }
            this.X = this.X.c(aVar, c0(aVar, j10), jLongValue, t());
        }
        w(false);
    }

    private boolean B() {
        g0 g0VarO = this.f53634v.o();
        if (!g0VarO.f55228d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            t0[] t0VarArr = this.f53608a;
            if (i10 >= t0VarArr.length) {
                return true;
            }
            t0 t0Var = t0VarArr[i10];
            androidx.media2.exoplayer.external.source.v0 v0Var = g0VarO.f55227c[i10];
            if (t0Var.e() != v0Var || (v0Var != null && !t0Var.q())) {
                return false;
            }
            i10++;
        }
    }

    private void B0(boolean z10, boolean z11, boolean z12) {
        S(z10 || !this.f53617h3, true, z11, z11, z11);
        this.f53628o.e(this.f53619i3 + (z12 ? 1 : 0));
        this.f53619i3 = 0;
        this.f53612e.f();
        w0(1);
    }

    private boolean C() {
        g0 g0VarN = this.f53634v.n();
        long j10 = g0VarN.f55230f.f55256e;
        return g0VarN.f55228d && (j10 == -9223372036854775807L || this.X.f55310m < j10);
    }

    private void C0() throws i {
        this.f53627n.g();
        for (t0 t0Var : this.Z) {
            n(t0Var);
        }
    }

    private void D0(TrackGroupArray trackGroups, androidx.media2.exoplayer.external.trackselection.s trackSelectorResult) {
        this.f53612e.h(this.f53608a, trackGroups, trackSelectorResult.f57231c);
    }

    private void E() {
        g0 g0VarI = this.f53634v.i();
        long jK = g0VarI.k();
        if (jK == Long.MIN_VALUE) {
            int i10 = 6 >> 0;
            l0(false);
            return;
        }
        boolean zI = this.f53612e.i(u(jK), this.f53627n.c().f55313a);
        l0(zI);
        if (zI) {
            g0VarI.d(this.f53623k3);
        }
    }

    private void E0() throws i, IOException {
        androidx.media2.exoplayer.external.source.z zVar = this.Y;
        if (zVar == null) {
            return;
        }
        if (this.f53619i3 > 0) {
            zVar.a();
            return;
        }
        I();
        K();
        J();
    }

    private void F() {
        if (this.f53628o.d(this.X)) {
            this.f53618i.obtainMessage(0, this.f53628o.f53643b, this.f53628o.f53644c ? this.f53628o.f53645d : -1, this.X).sendToTarget();
            this.f53628o.f(this.X);
        }
    }

    private void F0() throws i {
        g0 g0VarN = this.f53634v.n();
        if (g0VarN == null) {
            return;
        }
        long jI = g0VarN.f55228d ? g0VarN.f55225a.i() : -9223372036854775807L;
        if (jI != -9223372036854775807L) {
            T(jI);
            if (jI != this.X.f55310m) {
                l0 l0Var = this.X;
                this.X = l0Var.c(l0Var.f55299b, jI, l0Var.f55301d, t());
                this.f53628o.g(4);
            }
        } else {
            long jH = this.f53627n.h(g0VarN != this.f53634v.o());
            this.f53623k3 = jH;
            long jY = g0VarN.y(jH);
            H(this.X.f55310m, jY);
            this.X.f55310m = jY;
        }
        this.X.f55308k = this.f53634v.i().i();
        this.X.f55309l = t();
    }

    private void G() throws IOException {
        if (this.f53634v.i() != null) {
            for (t0 t0Var : this.Z) {
                if (!t0Var.q()) {
                    return;
                }
            }
        }
        this.Y.a();
    }

    private void G0(@androidx.annotation.p0 g0 oldPlayingPeriodHolder) throws i {
        g0 g0VarN = this.f53634v.n();
        if (g0VarN == null || oldPlayingPeriodHolder == g0VarN) {
            return;
        }
        boolean[] zArr = new boolean[this.f53608a.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            t0[] t0VarArr = this.f53608a;
            if (i10 >= t0VarArr.length) {
                this.X = this.X.g(g0VarN.n(), g0VarN.o());
                m(zArr, i11);
                return;
            }
            t0 t0Var = t0VarArr[i10];
            zArr[i10] = t0Var.getState() != 0;
            if (g0VarN.o().c(i10)) {
                i11++;
            }
            if (zArr[i10] && (!g0VarN.o().c(i10) || (t0Var.r() && t0Var.e() == oldPlayingPeriodHolder.f55227c[i10]))) {
                i(t0Var);
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x003c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007a, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H(long r8, long r10) throws androidx.media2.exoplayer.external.i {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.b0.H(long, long):void");
    }

    private void H0(float playbackSpeed) {
        for (g0 g0VarN = this.f53634v.n(); g0VarN != null; g0VarN = g0VarN.j()) {
            for (androidx.media2.exoplayer.external.trackselection.m mVar : g0VarN.o().f57231c.b()) {
                if (mVar != null) {
                    mVar.m(playbackSpeed);
                }
            }
        }
    }

    private void I() throws i, IOException {
        this.f53634v.t(this.f53623k3);
        if (this.f53634v.z()) {
            h0 h0VarM = this.f53634v.m(this.f53623k3, this.X);
            if (h0VarM == null) {
                G();
            } else {
                g0 g0VarF = this.f53634v.f(this.f53609b, this.f53610c, this.f53612e.e(), this.Y, h0VarM, this.f53611d);
                g0VarF.f55225a.r(this, h0VarM.f55253b);
                l0(true);
                if (this.f53634v.n() == g0VarF) {
                    T(g0VarF.m());
                }
                w(false);
            }
        }
        g0 g0VarI = this.f53634v.i();
        if (g0VarI == null || g0VarI.q()) {
            l0(false);
        } else {
            if (this.X.f55304g) {
                return;
            }
            E();
        }
    }

    private void J() throws i {
        boolean z10 = false;
        while (x0()) {
            if (z10) {
                F();
            }
            g0 g0VarN = this.f53634v.n();
            if (g0VarN == this.f53634v.o()) {
                i0();
            }
            g0 g0VarA = this.f53634v.a();
            G0(g0VarN);
            l0 l0Var = this.X;
            h0 h0Var = g0VarA.f55230f;
            this.X = l0Var.c(h0Var.f55252a, h0Var.f55253b, h0Var.f55254c, t());
            this.f53628o.g(g0VarN.f55230f.f55257f ? 0 : 3);
            F0();
            z10 = true;
        }
    }

    private void K() throws i {
        g0 g0VarO = this.f53634v.o();
        if (g0VarO != null) {
            int i10 = 0;
            if (g0VarO.j() != null) {
                if (B() && g0VarO.j().f55228d) {
                    androidx.media2.exoplayer.external.trackselection.s sVarO = g0VarO.o();
                    g0 g0VarB = this.f53634v.b();
                    androidx.media2.exoplayer.external.trackselection.s sVarO2 = g0VarB.o();
                    if (g0VarB.f55225a.i() == -9223372036854775807L) {
                        int i11 = 0;
                        while (true) {
                            t0[] t0VarArr = this.f53608a;
                            if (i11 >= t0VarArr.length) {
                                break;
                            }
                            t0 t0Var = t0VarArr[i11];
                            if (sVarO.c(i11) && !t0Var.r()) {
                                androidx.media2.exoplayer.external.trackselection.m mVarA = sVarO2.f57231c.a(i11);
                                boolean zC = sVarO2.c(i11);
                                boolean z10 = this.f53609b[i11].f() == 6;
                                v0 v0Var = sVarO.f57230b[i11];
                                v0 v0Var2 = sVarO2.f57230b[i11];
                                if (zC && v0Var2.equals(v0Var) && !z10) {
                                    t0Var.A(o(mVarA), g0VarB.f55227c[i11], g0VarB.l());
                                } else {
                                    t0Var.v();
                                }
                            }
                            i11++;
                        }
                    } else {
                        i0();
                    }
                }
            } else if (g0VarO.f55230f.f55258g) {
                while (true) {
                    t0[] t0VarArr2 = this.f53608a;
                    if (i10 >= t0VarArr2.length) {
                        break;
                    }
                    t0 t0Var2 = t0VarArr2[i10];
                    androidx.media2.exoplayer.external.source.v0 v0Var3 = g0VarO.f55227c[i10];
                    if (v0Var3 != null && t0Var2.e() == v0Var3 && t0Var2.q()) {
                        t0Var2.v();
                    }
                    i10++;
                }
            }
        }
    }

    private void L() {
        for (g0 g0VarN = this.f53634v.n(); g0VarN != null; g0VarN = g0VarN.j()) {
            for (androidx.media2.exoplayer.external.trackselection.m mVar : g0VarN.o().f57231c.b()) {
                if (mVar != null) {
                    mVar.e();
                }
            }
        }
    }

    private void O(androidx.media2.exoplayer.external.source.z mediaSource, boolean resetPosition, boolean resetState) {
        this.f53619i3++;
        S(false, true, resetPosition, resetState, true);
        this.f53612e.a();
        this.Y = mediaSource;
        w0(2);
        mediaSource.b(this, this.f53613f.e());
        this.f53614g.i(2);
    }

    private void Q() {
        S(true, true, true, true, false);
        this.f53612e.c();
        w0(1);
        this.f53616h.quit();
        synchronized (this) {
            try {
                this.f53629p0 = true;
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void R() throws i {
        float f10 = this.f53627n.c().f55313a;
        g0 g0VarO = this.f53634v.o();
        boolean z10 = true;
        for (g0 g0VarN = this.f53634v.n(); g0VarN != null && g0VarN.f55228d; g0VarN = g0VarN.j()) {
            androidx.media2.exoplayer.external.trackselection.s sVarV = g0VarN.v(f10, this.X.f55298a);
            if (!sVarV.a(g0VarN.o())) {
                if (z10) {
                    g0 g0VarN2 = this.f53634v.n();
                    boolean zU = this.f53634v.u(g0VarN2);
                    boolean[] zArr = new boolean[this.f53608a.length];
                    long jB = g0VarN2.b(sVarV, this.X.f55310m, zU, zArr);
                    l0 l0Var = this.X;
                    if (l0Var.f55302e != 4 && jB != l0Var.f55310m) {
                        l0 l0Var2 = this.X;
                        this.X = l0Var2.c(l0Var2.f55299b, jB, l0Var2.f55301d, t());
                        this.f53628o.g(4);
                        T(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f53608a.length];
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        t0[] t0VarArr = this.f53608a;
                        if (i10 >= t0VarArr.length) {
                            break;
                        }
                        t0 t0Var = t0VarArr[i10];
                        boolean z11 = t0Var.getState() != 0;
                        zArr2[i10] = z11;
                        androidx.media2.exoplayer.external.source.v0 v0Var = g0VarN2.f55227c[i10];
                        if (v0Var != null) {
                            i11++;
                        }
                        if (z11) {
                            if (v0Var != t0Var.e()) {
                                i(t0Var);
                            } else if (zArr[i10]) {
                                t0Var.t(this.f53623k3);
                            }
                        }
                        i10++;
                    }
                    this.X = this.X.g(g0VarN2.n(), g0VarN2.o());
                    m(zArr2, i11);
                } else {
                    this.f53634v.u(g0VarN);
                    if (g0VarN.f55228d) {
                        g0VarN.a(sVarV, Math.max(g0VarN.f55230f.f55253b, g0VarN.y(this.f53623k3)), false);
                    }
                }
                w(true);
                if (this.X.f55302e != 4) {
                    E();
                    F0();
                    this.f53614g.i(2);
                    return;
                }
                return;
            }
            if (g0VarN == g0VarO) {
                z10 = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[LOOP:2: B:34:0x00a1->B:36:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    private void S(boolean resetRenderers, boolean releaseMediaSource, boolean resetPosition, boolean resetState, boolean resetError) {
        boolean z10;
        androidx.media2.exoplayer.external.source.z.a aVarI;
        long j10;
        z0 z0Var;
        l0 l0Var;
        i iVar;
        TrackGroupArray trackGroupArray;
        androidx.media2.exoplayer.external.trackselection.s sVar;
        androidx.media2.exoplayer.external.source.z zVar;
        Iterator<c> it;
        this.f53614g.k(2);
        this.H1 = false;
        this.f53627n.g();
        this.f53623k3 = 0L;
        for (t0 t0Var : this.Z) {
            try {
                i(t0Var);
            } catch (i | RuntimeException e10) {
                androidx.media2.exoplayer.external.util.p.e(f53594m3, "Disable failed.", e10);
            }
        }
        if (resetRenderers) {
            for (t0 t0Var2 : this.f53608a) {
                try {
                    t0Var2.reset();
                } catch (RuntimeException e11) {
                    androidx.media2.exoplayer.external.util.p.e(f53594m3, "Reset failed.", e11);
                }
            }
        }
        this.Z = new t0[0];
        if (!resetPosition) {
            if (resetState) {
                if (this.f53621j3 == null && !this.X.f55298a.s()) {
                    l0 l0Var2 = this.X;
                    l0Var2.f55298a.h(l0Var2.f55299b.f56507a, this.f53622k);
                    this.f53621j3 = new e(z0.f57952a, this.f53622k.f57955c, this.X.f55310m + this.f53622k.m());
                }
                z10 = true;
            }
            this.f53634v.e(!resetState);
            l0(false);
            if (resetState) {
                this.f53634v.y(z0.f57952a);
                it = this.f53632s.iterator();
                while (it.hasNext()) {
                    it.next().f53638a.l(false);
                }
                this.f53632s.clear();
                this.f53625l3 = 0;
            }
            if (z10) {
                aVarI = this.X.i(this.f53615g3, this.f53620j, this.f53622k);
            } else {
                aVarI = this.X.f55299b;
            }
            androidx.media2.exoplayer.external.source.z.a aVar = aVarI;
            if (z10) {
                j10 = -9223372036854775807L;
            } else {
                j10 = this.X.f55310m;
            }
            long j11 = z10 ? -9223372036854775807L : this.X.f55301d;
            if (resetState) {
                z0Var = z0.f57952a;
            } else {
                z0Var = this.X.f55298a;
            }
            z0 z0Var2 = z0Var;
            l0Var = this.X;
            int i10 = l0Var.f55302e;
            if (resetError) {
                iVar = null;
            } else {
                iVar = l0Var.f55303f;
            }
            if (resetState) {
                trackGroupArray = TrackGroupArray.f55656d;
            } else {
                trackGroupArray = l0Var.f55305h;
            }
            TrackGroupArray trackGroupArray2 = trackGroupArray;
            if (resetState) {
                sVar = this.f53611d;
            } else {
                sVar = l0Var.f55306i;
            }
            this.X = new l0(z0Var2, aVar, j10, j11, i10, iVar, false, trackGroupArray2, sVar, aVar, j10, 0L, j10);
            if (releaseMediaSource || (zVar = this.Y) == null) {
            }
            zVar.f(this);
            this.Y = null;
            return;
        }
        this.f53621j3 = null;
        z10 = resetPosition;
        this.f53634v.e(!resetState);
        l0(false);
        if (resetState) {
            this.f53634v.y(z0.f57952a);
            it = this.f53632s.iterator();
            while (it.hasNext()) {
                it.next().f53638a.l(false);
            }
            this.f53632s.clear();
            this.f53625l3 = 0;
        }
        if (z10) {
            aVarI = this.X.i(this.f53615g3, this.f53620j, this.f53622k);
        } else {
            aVarI = this.X.f55299b;
        }
        androidx.media2.exoplayer.external.source.z.a aVar2 = aVarI;
        if (z10) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.X.f55310m;
        }
        long j12 = z10 ? -9223372036854775807L : this.X.f55301d;
        if (resetState) {
            z0Var = z0.f57952a;
        } else {
            z0Var = this.X.f55298a;
        }
        z0 z0Var3 = z0Var;
        l0Var = this.X;
        int i11 = l0Var.f55302e;
        if (resetError) {
            iVar = null;
        } else {
            iVar = l0Var.f55303f;
        }
        if (resetState) {
            trackGroupArray = TrackGroupArray.f55656d;
        } else {
            trackGroupArray = l0Var.f55305h;
        }
        TrackGroupArray trackGroupArray3 = trackGroupArray;
        if (resetState) {
            sVar = this.f53611d;
        } else {
            sVar = l0Var.f55306i;
        }
        this.X = new l0(z0Var3, aVar2, j10, j12, i11, iVar, false, trackGroupArray3, sVar, aVar2, j10, 0L, j10);
        if (releaseMediaSource) {
        }
    }

    private void T(long periodPositionUs) throws i {
        g0 g0VarN = this.f53634v.n();
        if (g0VarN != null) {
            periodPositionUs = g0VarN.z(periodPositionUs);
        }
        this.f53623k3 = periodPositionUs;
        this.f53627n.d(periodPositionUs);
        int i10 = 4 & 0;
        for (t0 t0Var : this.Z) {
            t0Var.t(this.f53623k3);
        }
        L();
    }

    private boolean U(c pendingMessageInfo) {
        Object obj = pendingMessageInfo.f53641d;
        if (obj == null) {
            Pair<Object, Long> pairW = W(new e(pendingMessageInfo.f53638a.h(), pendingMessageInfo.f53638a.j(), androidx.media2.exoplayer.external.c.b(pendingMessageInfo.f53638a.f())), false);
            if (pairW == null) {
                return false;
            }
            pendingMessageInfo.c(this.X.f55298a.b(pairW.first), ((Long) pairW.second).longValue(), pairW.first);
            return true;
        }
        int iB = this.X.f55298a.b(obj);
        if (iB == -1) {
            return false;
        }
        pendingMessageInfo.f53639b = iB;
        return true;
    }

    private void V() {
        int size = this.f53632s.size();
        while (true) {
            size--;
            if (size < 0) {
                Collections.sort(this.f53632s);
                return;
            } else if (!U(this.f53632s.get(size))) {
                this.f53632s.get(size).f53638a.l(false);
                this.f53632s.remove(size);
            }
        }
    }

    private Pair<Object, Long> W(e seekPosition, boolean trySubsequentPeriods) {
        int iB;
        z0 z0Var = this.X.f55298a;
        z0 z0Var2 = seekPosition.f53646a;
        if (z0Var.s()) {
            return null;
        }
        z0 z0Var3 = z0Var2.s() ? z0Var : z0Var2;
        try {
            Pair<Object, Long> pairJ = z0Var3.j(this.f53620j, this.f53622k, seekPosition.f53647b, seekPosition.f53648c);
            if (z0Var == z0Var3 || (iB = z0Var.b(pairJ.first)) != -1) {
                return pairJ;
            }
            if (trySubsequentPeriods && X(pairJ.first, z0Var3, z0Var) != null) {
                return r(z0Var, z0Var.f(iB, this.f53622k).f57955c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @androidx.annotation.p0
    private Object X(Object oldPeriodUid, z0 oldTimeline, z0 newTimeline) {
        int iB = oldTimeline.b(oldPeriodUid);
        int i10 = oldTimeline.i();
        int i11 = 0;
        int iD = iB;
        int iB2 = -1;
        while (i11 < i10 && iB2 == -1) {
            z0 z0Var = oldTimeline;
            iD = z0Var.d(iD, this.f53622k, this.f53620j, this.f53631p2, this.f53615g3);
            if (iD == -1) {
                break;
            }
            iB2 = newTimeline.b(z0Var.m(iD));
            i11++;
            oldTimeline = z0Var;
        }
        if (iB2 == -1) {
            return null;
        }
        return newTimeline.m(iB2);
    }

    private void Y(long thisOperationStartTimeMs, long intervalMs) {
        this.f53614g.k(2);
        this.f53614g.j(2, thisOperationStartTimeMs + intervalMs);
    }

    private void a0(boolean sendDiscontinuity) throws i {
        androidx.media2.exoplayer.external.source.z.a aVar = this.f53634v.n().f55230f.f55252a;
        long jD0 = d0(aVar, this.X.f55310m, true);
        if (jD0 != this.X.f55310m) {
            l0 l0Var = this.X;
            this.X = l0Var.c(aVar, jD0, l0Var.f55301d, t());
            if (sendDiscontinuity) {
                this.f53628o.g(4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    private void b0(e seekPosition) throws i {
        long jLongValue;
        androidx.media2.exoplayer.external.source.z.a aVarI;
        long j10;
        boolean z10;
        long j11;
        l0 l0VarC;
        long jN;
        this.f53628o.e(1);
        Pair<Object, Long> pairW = W(seekPosition, true);
        if (pairW == null) {
            aVarI = this.X.i(this.f53615g3, this.f53620j, this.f53622k);
            z10 = true;
            jLongValue = -9223372036854775807L;
            j10 = -9223372036854775807L;
        } else {
            Object obj = pairW.first;
            long jLongValue2 = ((Long) pairW.second).longValue();
            androidx.media2.exoplayer.external.source.z.a aVarV = this.f53634v.v(obj, jLongValue2);
            if (aVarV.b()) {
                jLongValue = 0;
                aVarI = aVarV;
                j10 = jLongValue2;
                z10 = true;
            } else {
                jLongValue = ((Long) pairW.second).longValue();
                aVarI = aVarV;
                j10 = jLongValue2;
                z10 = seekPosition.f53648c == -9223372036854775807L;
            }
        }
        try {
            if (this.Y != null && this.f53619i3 <= 0) {
                if (jLongValue == -9223372036854775807L) {
                    w0(4);
                    S(false, false, true, false, true);
                } else {
                    if (aVarI.equals(this.X.f55299b)) {
                        g0 g0VarN = this.f53634v.n();
                        jN = (g0VarN == null || !g0VarN.f55228d || jLongValue == 0) ? jLongValue : g0VarN.f55225a.n(jLongValue, this.f53635w);
                        if (androidx.media2.exoplayer.external.c.c(jN) == androidx.media2.exoplayer.external.c.c(this.X.f55310m)) {
                            l0VarC = this.X.c(aVarI, this.X.f55310m, j10, t());
                            if (!z10) {
                                return;
                            }
                        }
                    } else {
                        jN = jLongValue;
                    }
                    long jC0 = c0(aVarI, jN);
                    z10 |= jLongValue != jC0;
                    j11 = jC0;
                    l0VarC = this.X.c(aVarI, j11, j10, t());
                }
            }
            this.f53621j3 = seekPosition;
            j11 = jLongValue;
            l0VarC = this.X.c(aVarI, j11, j10, t());
        } finally {
            this.X = this.X.c(aVarI, jLongValue, j10, t());
            if (z10) {
                this.f53628o.g(2);
            }
        }
    }

    private long c0(androidx.media2.exoplayer.external.source.z.a periodId, long periodPositionUs) throws i {
        return d0(periodId, periodPositionUs, this.f53634v.n() != this.f53634v.o());
    }

    private long d0(androidx.media2.exoplayer.external.source.z.a periodId, long periodPositionUs, boolean forceDisableRenderers) throws i {
        C0();
        this.H1 = false;
        w0(2);
        g0 g0VarN = this.f53634v.n();
        g0 g0VarA = g0VarN;
        while (g0VarA != null) {
            if (periodId.equals(g0VarA.f55230f.f55252a) && g0VarA.f55228d) {
                this.f53634v.u(g0VarA);
                break;
            }
            g0VarA = this.f53634v.a();
        }
        if (forceDisableRenderers || g0VarN != g0VarA || (g0VarA != null && g0VarA.z(periodPositionUs) < 0)) {
            for (t0 t0Var : this.Z) {
                i(t0Var);
            }
            this.Z = new t0[0];
            if (g0VarA != null) {
                g0VarA.x(0L);
            }
            g0VarN = null;
        }
        if (g0VarA != null) {
            G0(g0VarN);
            if (g0VarA.f55229e) {
                periodPositionUs = g0VarA.f55225a.h(periodPositionUs);
                g0VarA.f55225a.p(periodPositionUs - this.f53624l, this.f53626m);
            }
            T(periodPositionUs);
            E();
        } else {
            this.f53634v.e(true);
            this.X = this.X.g(TrackGroupArray.f55656d, this.f53611d);
            T(periodPositionUs);
        }
        w(false);
        this.f53614g.i(2);
        return periodPositionUs;
    }

    private void e0(q0 message) throws i {
        if (message.f() == -9223372036854775807L) {
            f0(message);
            return;
        }
        if (this.Y == null || this.f53619i3 > 0) {
            this.f53632s.add(new c(message));
            return;
        }
        c cVar = new c(message);
        if (!U(cVar)) {
            message.l(false);
        } else {
            this.f53632s.add(cVar);
            Collections.sort(this.f53632s);
        }
    }

    private void f0(q0 message) throws i {
        if (message.d().getLooper() != this.f53614g.f()) {
            this.f53614g.b(16, message).sendToTarget();
            return;
        }
        h(message);
        int i10 = this.X.f55302e;
        if (i10 == 3 || i10 == 2) {
            this.f53614g.i(2);
        }
    }

    private void g0(final q0 message) {
        message.d().post(new Runnable(this, message) { // from class: androidx.media2.exoplayer.external.a0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b0 f53122a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final q0 f53123b;

            {
                this.f53122a = this;
                this.f53123b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f53122a.D(this.f53123b);
            }
        });
    }

    private void h(q0 message) throws i {
        if (message.k()) {
            return;
        }
        try {
            message.g().i(message.i(), message.e());
        } finally {
            message.l(true);
        }
    }

    private void h0(m0 m0Var, boolean z10) {
        this.f53614g.e(17, z10 ? 1 : 0, 0, m0Var).sendToTarget();
    }

    private void i(t0 renderer) throws i {
        this.f53627n.a(renderer);
        n(renderer);
        renderer.d();
    }

    private void i0() {
        for (t0 t0Var : this.f53608a) {
            if (t0Var.e() != null) {
                t0Var.v();
            }
        }
    }

    private void k() throws i, IOException {
        boolean z10;
        boolean z11;
        int i10;
        long jC = this.f53633t.c();
        E0();
        g0 g0VarN = this.f53634v.n();
        if (g0VarN == null) {
            Y(jC, 10L);
            return;
        }
        androidx.media2.exoplayer.external.util.l0.a("doSomeWork");
        F0();
        if (g0VarN.f55228d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            g0VarN.f55225a.p(this.X.f55310m - this.f53624l, this.f53626m);
            int i11 = 0;
            boolean z12 = true;
            boolean z13 = true;
            while (true) {
                t0[] t0VarArr = this.f53608a;
                if (i11 >= t0VarArr.length) {
                    break;
                }
                t0 t0Var = t0VarArr[i11];
                if (t0Var.getState() != 0) {
                    t0Var.g(this.f53623k3, jElapsedRealtime);
                    z12 = z12 && t0Var.a();
                    boolean z14 = g0VarN.f55227c[i11] != t0Var.e();
                    boolean z15 = z14 || (!z14 && g0VarN.j() != null && t0Var.q()) || t0Var.isReady() || t0Var.a();
                    z13 = z13 && z15;
                    if (!z15) {
                        t0Var.x();
                    }
                }
                i11++;
            }
            z10 = z13;
            z11 = z12;
        } else {
            g0VarN.f55225a.o();
            z10 = true;
            z11 = true;
        }
        long j10 = g0VarN.f55230f.f55256e;
        if (z11 && g0VarN.f55228d && ((j10 == -9223372036854775807L || j10 <= this.X.f55310m) && g0VarN.f55230f.f55258g)) {
            w0(4);
            C0();
        } else if (this.X.f55302e == 2 && y0(z10)) {
            w0(3);
            if (this.f53630p1) {
                z0();
            }
        } else if (this.X.f55302e == 3 && (this.Z.length != 0 ? !z10 : !C())) {
            this.H1 = this.f53630p1;
            w0(2);
            C0();
        }
        if (this.X.f55302e == 2) {
            for (t0 t0Var2 : this.Z) {
                t0Var2.x();
            }
        }
        if ((this.f53630p1 && this.X.f55302e == 3) || (i10 = this.X.f55302e) == 2) {
            Y(jC, 10L);
        } else if (this.Z.length == 0 || i10 == 4) {
            this.f53614g.k(2);
        } else {
            Y(jC, 1000L);
        }
        androidx.media2.exoplayer.external.util.l0.c();
    }

    private void k0(boolean foregroundMode, @androidx.annotation.p0 AtomicBoolean processedFlag) {
        if (this.f53617h3 != foregroundMode) {
            this.f53617h3 = foregroundMode;
            if (!foregroundMode) {
                for (t0 t0Var : this.f53608a) {
                    if (t0Var.getState() == 0) {
                        t0Var.reset();
                    }
                }
            }
        }
        if (processedFlag != null) {
            synchronized (this) {
                processedFlag.set(true);
                notifyAll();
            }
        }
    }

    private void l(int rendererIndex, boolean wasRendererEnabled, int enabledRendererIndex) throws i {
        g0 g0VarN = this.f53634v.n();
        t0 t0Var = this.f53608a[rendererIndex];
        this.Z[enabledRendererIndex] = t0Var;
        if (t0Var.getState() == 0) {
            androidx.media2.exoplayer.external.trackselection.s sVarO = g0VarN.o();
            v0 v0Var = sVarO.f57230b[rendererIndex];
            Format[] formatArrO = o(sVarO.f57231c.a(rendererIndex));
            boolean z10 = this.f53630p1 && this.X.f55302e == 3;
            t0Var.y(v0Var, formatArrO, g0VarN.f55227c[rendererIndex], this.f53623k3, !wasRendererEnabled && z10, g0VarN.l());
            this.f53627n.b(t0Var);
            if (z10) {
                t0Var.start();
            }
        }
    }

    private void l0(boolean isLoading) {
        l0 l0Var = this.X;
        if (l0Var.f55304g != isLoading) {
            this.X = l0Var.a(isLoading);
        }
    }

    private void m(boolean[] rendererWasEnabledFlags, int totalEnabledRendererCount) throws i {
        this.Z = new t0[totalEnabledRendererCount];
        androidx.media2.exoplayer.external.trackselection.s sVarO = this.f53634v.n().o();
        for (int i10 = 0; i10 < this.f53608a.length; i10++) {
            if (!sVarO.c(i10)) {
                this.f53608a[i10].reset();
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f53608a.length; i12++) {
            if (sVarO.c(i12)) {
                l(i12, rendererWasEnabledFlags[i12], i11);
                i11++;
            }
        }
    }

    private void n(t0 renderer) throws i {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private void n0(boolean playWhenReady) throws i {
        this.H1 = false;
        this.f53630p1 = playWhenReady;
        if (!playWhenReady) {
            C0();
            F0();
            return;
        }
        int i10 = this.X.f55302e;
        if (i10 == 3) {
            z0();
            this.f53614g.i(2);
        } else if (i10 == 2) {
            this.f53614g.i(2);
        }
    }

    private static Format[] o(androidx.media2.exoplayer.external.trackselection.m newSelection) {
        int length = newSelection != null ? newSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i10 = 0; i10 < length; i10++) {
            formatArr[i10] = newSelection.l(i10);
        }
        return formatArr;
    }

    private long p() {
        g0 g0VarO = this.f53634v.o();
        if (g0VarO == null) {
            return 0L;
        }
        long jL = g0VarO.l();
        if (!g0VarO.f55228d) {
            return jL;
        }
        int i10 = 0;
        while (true) {
            t0[] t0VarArr = this.f53608a;
            if (i10 >= t0VarArr.length) {
                return jL;
            }
            if (t0VarArr[i10].getState() != 0 && this.f53608a[i10].e() == g0VarO.f55227c[i10]) {
                long jS = this.f53608a[i10].s();
                if (jS == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(jS, jL);
            }
            i10++;
        }
    }

    private void p0(m0 playbackParameters) {
        this.f53627n.w(playbackParameters);
        h0(this.f53627n.c(), true);
    }

    private Pair<Object, Long> r(z0 timeline, int windowIndex, long windowPositionUs) {
        return timeline.j(this.f53620j, this.f53622k, windowIndex, windowPositionUs);
    }

    private void r0(int repeatMode) throws i {
        this.f53631p2 = repeatMode;
        if (!this.f53634v.C(repeatMode)) {
            a0(true);
        }
        w(false);
    }

    private long t() {
        return u(this.X.f55308k);
    }

    private void t0(x0 seekParameters) {
        this.f53635w = seekParameters;
    }

    private long u(long bufferedPositionInLoadingPeriodUs) {
        g0 g0VarI = this.f53634v.i();
        if (g0VarI == null) {
            return 0L;
        }
        return Math.max(0L, bufferedPositionInLoadingPeriodUs - g0VarI.y(this.f53623k3));
    }

    private void v(androidx.media2.exoplayer.external.source.x mediaPeriod) {
        if (this.f53634v.s(mediaPeriod)) {
            this.f53634v.t(this.f53623k3);
            E();
        }
    }

    private void v0(boolean shuffleModeEnabled) throws i {
        this.f53615g3 = shuffleModeEnabled;
        if (!this.f53634v.D(shuffleModeEnabled)) {
            a0(true);
        }
        w(false);
    }

    private void w(boolean loadingTrackSelectionChanged) {
        g0 g0VarI = this.f53634v.i();
        androidx.media2.exoplayer.external.source.z.a aVar = g0VarI == null ? this.X.f55299b : g0VarI.f55230f.f55252a;
        boolean zEquals = this.X.f55307j.equals(aVar);
        if (!zEquals) {
            this.X = this.X.b(aVar);
        }
        l0 l0Var = this.X;
        l0Var.f55308k = g0VarI == null ? l0Var.f55310m : g0VarI.i();
        this.X.f55309l = t();
        if ((!zEquals || loadingTrackSelectionChanged) && g0VarI != null && g0VarI.f55228d) {
            D0(g0VarI.n(), g0VarI.o());
        }
    }

    private void w0(int state) {
        l0 l0Var = this.X;
        if (l0Var.f55302e != state) {
            this.X = l0Var.e(state);
        }
    }

    private void x(androidx.media2.exoplayer.external.source.x mediaPeriod) throws i {
        if (this.f53634v.s(mediaPeriod)) {
            g0 g0VarI = this.f53634v.i();
            g0VarI.p(this.f53627n.c().f55313a, this.X.f55298a);
            D0(g0VarI.n(), g0VarI.o());
            if (g0VarI == this.f53634v.n()) {
                T(g0VarI.f55230f.f55253b);
                G0(null);
            }
            E();
        }
    }

    private boolean x0() {
        g0 g0VarN;
        g0 g0VarJ;
        if (this.f53630p1 && (g0VarN = this.f53634v.n()) != null && (g0VarJ = g0VarN.j()) != null) {
            return (g0VarN != this.f53634v.o() || B()) && this.f53623k3 >= g0VarJ.m();
        }
        return false;
    }

    private void y(m0 m0Var, boolean z10) throws i {
        this.f53618i.obtainMessage(1, z10 ? 1 : 0, 0, m0Var).sendToTarget();
        H0(m0Var.f55313a);
        for (t0 t0Var : this.f53608a) {
            if (t0Var != null) {
                t0Var.z(m0Var.f55313a);
            }
        }
    }

    private boolean y0(boolean renderersReadyOrEnded) {
        if (this.Z.length == 0) {
            return C();
        }
        if (!renderersReadyOrEnded) {
            return false;
        }
        if (!this.X.f55304g) {
            return true;
        }
        g0 g0VarI = this.f53634v.i();
        return (g0VarI.q() && g0VarI.f55230f.f55258g) || this.f53612e.g(t(), this.f53627n.c().f55313a, this.H1);
    }

    private void z() {
        w0(4);
        S(false, false, true, false, true);
    }

    private void z0() throws i {
        this.H1 = false;
        this.f53627n.f();
        for (t0 t0Var : this.Z) {
            t0Var.start();
        }
    }

    public void A0(boolean z10) {
        this.f53614g.d(6, z10 ? 1 : 0, 0).sendToTarget();
    }

    final /* synthetic */ void D(q0 q0Var) {
        try {
            h(q0Var);
        } catch (i e10) {
            androidx.media2.exoplayer.external.util.p.e(f53594m3, "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.w0.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void j(androidx.media2.exoplayer.external.source.x source) {
        this.f53614g.b(10, source).sendToTarget();
    }

    public void N(androidx.media2.exoplayer.external.source.z zVar, boolean z10, boolean z11) {
        this.f53614g.e(0, z10 ? 1 : 0, z11 ? 1 : 0, zVar).sendToTarget();
    }

    public synchronized void P() {
        try {
            if (this.f53629p0) {
                return;
            }
            this.f53614g.i(7);
            boolean z10 = false;
            while (!this.f53629p0) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void Z(z0 timeline, int windowIndex, long positionUs) {
        this.f53614g.b(3, new e(timeline, windowIndex, positionUs)).sendToTarget();
    }

    @Override // androidx.media2.exoplayer.external.trackselection.r.a
    public void b() {
        this.f53614g.i(11);
    }

    @Override // androidx.media2.exoplayer.external.source.z.b
    public void c(androidx.media2.exoplayer.external.source.z source, z0 timeline) {
        this.f53614g.b(8, new b(source, timeline)).sendToTarget();
    }

    @Override // androidx.media2.exoplayer.external.q0.a
    public synchronized void d(q0 message) {
        if (!this.f53629p0) {
            this.f53614g.b(15, message).sendToTarget();
        } else {
            androidx.media2.exoplayer.external.util.p.l(f53594m3, "Ignoring messages sent after release.");
            message.l(false);
        }
    }

    @Override // androidx.media2.exoplayer.external.g.a
    public void f(m0 playbackParameters) {
        h0(playbackParameters, false);
    }

    @Override // androidx.media2.exoplayer.external.source.x.a
    public void g(androidx.media2.exoplayer.external.source.x source) {
        this.f53614g.b(9, source).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        int i10 = 6 >> 1;
        try {
            switch (msg.what) {
                case 0:
                    O((androidx.media2.exoplayer.external.source.z) msg.obj, msg.arg1 != 0, msg.arg2 != 0);
                    break;
                case 1:
                    n0(msg.arg1 != 0);
                    break;
                case 2:
                    k();
                    break;
                case 3:
                    b0((e) msg.obj);
                    break;
                case 4:
                    p0((m0) msg.obj);
                    break;
                case 5:
                    t0((x0) msg.obj);
                    break;
                case 6:
                    B0(false, msg.arg1 != 0, true);
                    break;
                case 7:
                    Q();
                    return true;
                case 8:
                    A((b) msg.obj);
                    break;
                case 9:
                    x((androidx.media2.exoplayer.external.source.x) msg.obj);
                    break;
                case 10:
                    v((androidx.media2.exoplayer.external.source.x) msg.obj);
                    break;
                case 11:
                    R();
                    break;
                case 12:
                    r0(msg.arg1);
                    break;
                case 13:
                    v0(msg.arg1 != 0);
                    break;
                case 14:
                    k0(msg.arg1 != 0, (AtomicBoolean) msg.obj);
                    break;
                case 15:
                    e0((q0) msg.obj);
                    break;
                case 16:
                    g0((q0) msg.obj);
                    break;
                case 17:
                    y((m0) msg.obj, msg.arg1 != 0);
                    break;
                default:
                    return false;
            }
            F();
        } catch (i e10) {
            androidx.media2.exoplayer.external.util.p.e(f53594m3, "Playback error.", e10);
            B0(true, false, false);
            this.X = this.X.d(e10);
            F();
        } catch (IOException e11) {
            androidx.media2.exoplayer.external.util.p.e(f53594m3, "Source error.", e11);
            B0(false, false, false);
            this.X = this.X.d(i.d(e11));
            F();
        } catch (OutOfMemoryError | RuntimeException e12) {
            androidx.media2.exoplayer.external.util.p.e(f53594m3, "Internal runtime error.", e12);
            i iVarA = e12 instanceof OutOfMemoryError ? i.a((OutOfMemoryError) e12) : i.e((RuntimeException) e12);
            B0(true, false, false);
            this.X = this.X.d(iVarA);
            F();
        }
        return true;
    }

    public synchronized void j0(boolean foregroundMode) {
        boolean z10 = false;
        try {
            if (foregroundMode) {
                this.f53614g.d(14, 1, 0).sendToTarget();
            } else {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                this.f53614g.e(14, 0, 0, atomicBoolean).sendToTarget();
                while (!atomicBoolean.get() && !this.f53629p0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void m0(boolean z10) {
        this.f53614g.d(1, z10 ? 1 : 0, 0).sendToTarget();
    }

    public void o0(m0 playbackParameters) {
        this.f53614g.b(4, playbackParameters).sendToTarget();
    }

    public void q0(int repeatMode) {
        this.f53614g.d(12, repeatMode, 0).sendToTarget();
    }

    public Looper s() {
        return this.f53616h.getLooper();
    }

    public void s0(x0 seekParameters) {
        this.f53614g.b(5, seekParameters).sendToTarget();
    }

    public void u0(boolean z10) {
        this.f53614g.d(13, z10 ? 1 : 0, 0).sendToTarget();
    }
}
