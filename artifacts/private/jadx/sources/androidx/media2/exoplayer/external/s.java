package androidx.media2.exoplayer.external;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class s extends androidx.media2.exoplayer.external.a implements j {
    private static final String P = "ExoPlayerImpl";
    private boolean A;
    private boolean B;
    private int C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private m0 J;
    private x0 K;
    private l0 L;
    private int M;
    private int N;
    private long O;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final androidx.media2.exoplayer.external.trackselection.s f55629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final t0[] f55630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.trackselection.r f55631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f55632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final b0 f55633u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Handler f55634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final CopyOnWriteArrayList<androidx.media2.exoplayer.external.a.C0499a> f55635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final z0.b f55636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ArrayDeque<Runnable> f55637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private androidx.media2.exoplayer.external.source.z f55638z;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            s.this.G(msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l0 f55640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CopyOnWriteArrayList<androidx.media2.exoplayer.external.a.C0499a> f55641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.trackselection.r f55642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f55643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f55644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f55645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f55646g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f55647h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f55648i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f55649j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final boolean f55650k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final boolean f55651l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f55652m;

        public b(l0 playbackInfo, l0 previousPlaybackInfo, CopyOnWriteArrayList<androidx.media2.exoplayer.external.a.C0499a> listeners, androidx.media2.exoplayer.external.trackselection.r trackSelector, boolean positionDiscontinuity, int positionDiscontinuityReason, int timelineChangeReason, boolean seekProcessed, boolean playWhenReady) {
            this.f55640a = playbackInfo;
            this.f55641b = new CopyOnWriteArrayList<>(listeners);
            this.f55642c = trackSelector;
            this.f55643d = positionDiscontinuity;
            this.f55644e = positionDiscontinuityReason;
            this.f55645f = timelineChangeReason;
            this.f55646g = seekProcessed;
            this.f55652m = playWhenReady;
            this.f55647h = previousPlaybackInfo.f55302e != playbackInfo.f55302e;
            i iVar = previousPlaybackInfo.f55303f;
            i iVar2 = playbackInfo.f55303f;
            this.f55648i = (iVar == iVar2 || iVar2 == null) ? false : true;
            this.f55649j = previousPlaybackInfo.f55298a != playbackInfo.f55298a;
            this.f55650k = previousPlaybackInfo.f55304g != playbackInfo.f55304g;
            this.f55651l = previousPlaybackInfo.f55306i != playbackInfo.f55306i;
        }

        final /* synthetic */ void a(o0.d dVar) {
            dVar.G(this.f55640a.f55298a, this.f55645f);
        }

        final /* synthetic */ void b(o0.d dVar) {
            dVar.A(this.f55644e);
        }

        final /* synthetic */ void c(o0.d dVar) {
            dVar.K(this.f55640a.f55303f);
        }

        final /* synthetic */ void d(o0.d dVar) {
            l0 l0Var = this.f55640a;
            dVar.H(l0Var.f55305h, l0Var.f55306i.f57231c);
        }

        final /* synthetic */ void e(o0.d dVar) {
            dVar.j(this.f55640a.f55304g);
        }

        final /* synthetic */ void f(o0.d dVar) {
            dVar.C(this.f55652m, this.f55640a.f55302e);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f55649j || this.f55645f == 0) {
                s.e0(this.f55641b, new androidx.media2.exoplayer.external.a.b(this) { // from class: androidx.media2.exoplayer.external.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final s.b f56523a;

                    {
                        this.f56523a = this;
                    }

                    @Override // androidx.media2.exoplayer.external.a.b
                    public void a(o0.d dVar) {
                        this.f56523a.a(dVar);
                    }
                });
            }
            if (this.f55643d) {
                s.e0(this.f55641b, new androidx.media2.exoplayer.external.a.b(this) { // from class: androidx.media2.exoplayer.external.u

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final s.b f57233a;

                    {
                        this.f57233a = this;
                    }

                    @Override // androidx.media2.exoplayer.external.a.b
                    public void a(o0.d dVar) {
                        this.f57233a.b(dVar);
                    }
                });
            }
            if (this.f55648i) {
                s.e0(this.f55641b, new androidx.media2.exoplayer.external.a.b(this) { // from class: androidx.media2.exoplayer.external.v

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final s.b f57727a;

                    {
                        this.f57727a = this;
                    }

                    @Override // androidx.media2.exoplayer.external.a.b
                    public void a(o0.d dVar) {
                        this.f57727a.c(dVar);
                    }
                });
            }
            if (this.f55651l) {
                this.f55642c.d(this.f55640a.f55306i.f57232d);
                s.e0(this.f55641b, new androidx.media2.exoplayer.external.a.b(this) { // from class: androidx.media2.exoplayer.external.w

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final s.b f57920a;

                    {
                        this.f57920a = this;
                    }

                    @Override // androidx.media2.exoplayer.external.a.b
                    public void a(o0.d dVar) {
                        this.f57920a.d(dVar);
                    }
                });
            }
            if (this.f55650k) {
                s.e0(this.f55641b, new androidx.media2.exoplayer.external.a.b(this) { // from class: androidx.media2.exoplayer.external.x

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final s.b f57921a;

                    {
                        this.f57921a = this;
                    }

                    @Override // androidx.media2.exoplayer.external.a.b
                    public void a(o0.d dVar) {
                        this.f57921a.e(dVar);
                    }
                });
            }
            if (this.f55647h) {
                s.e0(this.f55641b, new androidx.media2.exoplayer.external.a.b(this) { // from class: androidx.media2.exoplayer.external.y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final s.b f57929a;

                    {
                        this.f57929a = this;
                    }

                    @Override // androidx.media2.exoplayer.external.a.b
                    public void a(o0.d dVar) {
                        this.f57929a.f(dVar);
                    }
                });
            }
            if (this.f55646g) {
                s.e0(this.f55641b, z.f57951a);
            }
        }
    }

    @e.a({"HandlerLeak"})
    public s(t0[] renderers, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, androidx.media2.exoplayer.external.util.c clock, Looper looper) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = androidx.media2.exoplayer.external.util.q0.f57630e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb2.append("Init ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append(c0.f53753c);
        sb2.append("] [");
        sb2.append(str);
        sb2.append("]");
        androidx.media2.exoplayer.external.util.p.h(P, sb2.toString());
        androidx.media2.exoplayer.external.util.a.i(renderers.length > 0);
        this.f55630r = (t0[]) androidx.media2.exoplayer.external.util.a.g(renderers);
        this.f55631s = (androidx.media2.exoplayer.external.trackselection.r) androidx.media2.exoplayer.external.util.a.g(trackSelector);
        this.A = false;
        this.C = 0;
        this.D = false;
        this.f55635w = new CopyOnWriteArrayList<>();
        androidx.media2.exoplayer.external.trackselection.s sVar = new androidx.media2.exoplayer.external.trackselection.s(new v0[renderers.length], new androidx.media2.exoplayer.external.trackselection.m[renderers.length], null);
        this.f55629q = sVar;
        this.f55636x = new z0.b();
        this.J = m0.f55312e;
        this.K = x0.f57926g;
        a aVar = new a(looper);
        this.f55632t = aVar;
        this.L = l0.h(0L, sVar);
        this.f55637y = new ArrayDeque<>();
        b0 b0Var = new b0(renderers, trackSelector, sVar, loadControl, bandwidthMeter, this.A, this.C, this.D, aVar, clock);
        this.f55633u = b0Var;
        this.f55634v = new Handler(b0Var.s());
    }

    private l0 B(boolean resetPosition, boolean resetState, boolean resetError, int playbackState) {
        if (resetPosition) {
            this.M = 0;
            this.N = 0;
            this.O = 0L;
        } else {
            this.M = Y();
            this.N = O();
            this.O = getCurrentPosition();
        }
        boolean z10 = resetPosition || resetState;
        androidx.media2.exoplayer.external.source.z.a aVarI = z10 ? this.L.i(this.D, this.f53119p, this.f55636x) : this.L.f55299b;
        long j10 = z10 ? 0L : this.L.f55310m;
        return new l0(resetState ? z0.f57952a : this.L.f55298a, aVarI, j10, z10 ? -9223372036854775807L : this.L.f55301d, playbackState, resetError ? null : this.L.f55303f, false, resetState ? TrackGroupArray.f55656d : this.L.f55305h, resetState ? this.f55629q : this.L.f55306i, aVarI, j10, 0L, j10);
    }

    private void T0(final androidx.media2.exoplayer.external.a.b listenerInvocation) {
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f55635w);
        U0(new Runnable(copyOnWriteArrayList, listenerInvocation) { // from class: androidx.media2.exoplayer.external.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList f55627a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final a.b f55628b;

            {
                this.f55627a = copyOnWriteArrayList;
                this.f55628b = listenerInvocation;
            }

            @Override // java.lang.Runnable
            public void run() {
                s.e0(this.f55627a, this.f55628b);
            }
        });
    }

    private void U0(Runnable listenerNotificationRunnable) {
        boolean zIsEmpty = this.f55637y.isEmpty();
        this.f55637y.addLast(listenerNotificationRunnable);
        if (zIsEmpty) {
            while (!this.f55637y.isEmpty()) {
                this.f55637y.peekFirst().run();
                this.f55637y.removeFirst();
            }
        }
    }

    private void V(l0 playbackInfo, int operationAcks, boolean positionDiscontinuity, int positionDiscontinuityReason) {
        int i10 = this.E - operationAcks;
        this.E = i10;
        if (i10 == 0) {
            l0 l0VarC = playbackInfo.f55300c == -9223372036854775807L ? playbackInfo.c(playbackInfo.f55299b, 0L, playbackInfo.f55301d, playbackInfo.f55309l) : playbackInfo;
            if (!this.L.f55298a.s() && l0VarC.f55298a.s()) {
                this.N = 0;
                this.M = 0;
                this.O = 0L;
            }
            int i11 = this.F ? 0 : 2;
            boolean z10 = this.G;
            this.F = false;
            this.G = false;
            Y0(l0VarC, positionDiscontinuity, positionDiscontinuityReason, i11, z10);
        }
    }

    private long V0(androidx.media2.exoplayer.external.source.z.a periodId, long positionUs) {
        long jC = c.c(positionUs);
        this.L.f55298a.h(periodId.f56507a, this.f55636x);
        return jC + this.f55636x.l();
    }

    private boolean X0() {
        return this.L.f55298a.s() || this.E > 0;
    }

    private void Y0(l0 playbackInfo, boolean positionDiscontinuity, int positionDiscontinuityReason, int timelineChangeReason, boolean seekProcessed) {
        l0 l0Var = this.L;
        this.L = playbackInfo;
        U0(new b(playbackInfo, l0Var, this.f55635w, this.f55631s, positionDiscontinuity, positionDiscontinuityReason, timelineChangeReason, seekProcessed, this.A));
    }

    private void a0(final m0 playbackParameters, boolean operationAck) {
        if (operationAck) {
            this.I--;
        }
        if (this.I != 0 || this.J.equals(playbackParameters)) {
            return;
        }
        this.J = playbackParameters;
        T0(new androidx.media2.exoplayer.external.a.b(playbackParameters) { // from class: androidx.media2.exoplayer.external.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final m0 f55613a;

            {
                this.f55613a = playbackParameters;
            }

            @Override // androidx.media2.exoplayer.external.a.b
            public void a(o0.d dVar) {
                dVar.f(this.f55613a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e0(CopyOnWriteArrayList<androidx.media2.exoplayer.external.a.C0499a> listeners, androidx.media2.exoplayer.external.a.b listenerInvocation) {
        Iterator<androidx.media2.exoplayer.external.a.C0499a> it = listeners.iterator();
        while (it.hasNext()) {
            it.next().a(listenerInvocation);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public o0.a A0() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int C() {
        return this.C;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void D(final int repeatMode) {
        if (this.C != repeatMode) {
            this.C = repeatMode;
            this.f55633u.q0(repeatMode);
            T0(new androidx.media2.exoplayer.external.a.b(repeatMode) { // from class: androidx.media2.exoplayer.external.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f55311a;

                {
                    this.f55311a = repeatMode;
                }

                @Override // androidx.media2.exoplayer.external.a.b
                public void a(o0.d dVar) {
                    dVar.x(this.f55311a);
                }
            });
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void D0(o0.d listener) {
        for (androidx.media2.exoplayer.external.a.C0499a c0499a : this.f55635w) {
            if (c0499a.f53120a.equals(listener)) {
                c0499a.b();
                this.f55635w.remove(c0499a);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int E() {
        if (x()) {
            return this.L.f55299b.f56508b;
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public i E0() {
        return this.L.f55303f;
    }

    void G(Message msg) {
        int i10 = msg.what;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException();
            }
            a0((m0) msg.obj, msg.arg1 != 0);
        } else {
            l0 l0Var = (l0) msg.obj;
            int i11 = msg.arg1;
            int i12 = msg.arg2;
            V(l0Var, i11, i12 != -1, i12);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int H() {
        return this.L.f55302e;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public TrackGroupArray I() {
        return this.L.f55305h;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public boolean J() {
        return this.A;
    }

    @Override // androidx.media2.exoplayer.external.j
    public void J0(@androidx.annotation.p0 x0 seekParameters) {
        if (seekParameters == null) {
            seekParameters = x0.f57926g;
        }
        if (this.K.equals(seekParameters)) {
            return;
        }
        this.K = seekParameters;
        this.f55633u.s0(seekParameters);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void K(final boolean shuffleModeEnabled) {
        if (this.D != shuffleModeEnabled) {
            this.D = shuffleModeEnabled;
            this.f55633u.u0(shuffleModeEnabled);
            T0(new androidx.media2.exoplayer.external.a.b(shuffleModeEnabled) { // from class: androidx.media2.exoplayer.external.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final boolean f55590a;

                {
                    this.f55590a = shuffleModeEnabled;
                }

                @Override // androidx.media2.exoplayer.external.a.b
                public void a(o0.d dVar) {
                    dVar.n(this.f55590a);
                }
            });
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void L(boolean reset) {
        if (reset) {
            this.f55638z = null;
        }
        l0 l0VarB = B(reset, reset, reset, 1);
        this.E++;
        this.f55633u.A0(reset);
        Y0(l0VarB, false, 4, 1, false);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int M() {
        return this.f55630r.length;
    }

    @Override // androidx.media2.exoplayer.external.j
    public void M0(androidx.media2.exoplayer.external.source.z mediaSource) {
        y0(mediaSource, true, true);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int O() {
        if (X0()) {
            return this.N;
        }
        l0 l0Var = this.L;
        return l0Var.f55298a.b(l0Var.f55299b.f56507a);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int P() {
        if (x()) {
            return this.L.f55299b.f56509c;
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long R() {
        if (X0()) {
            return this.O;
        }
        l0 l0Var = this.L;
        if (l0Var.f55307j.f56510d != l0Var.f55299b.f56510d) {
            return l0Var.f55298a.n(Y(), this.f53119p).c();
        }
        long j10 = l0Var.f55308k;
        if (this.L.f55307j.b()) {
            l0 l0Var2 = this.L;
            z0.b bVarH = l0Var2.f55298a.h(l0Var2.f55307j.f56507a, this.f55636x);
            long jF = bVarH.f(this.L.f55307j.f56508b);
            j10 = jF == Long.MIN_VALUE ? bVarH.f57956d : jF;
        }
        return V0(this.L.f55307j, j10);
    }

    @Override // androidx.media2.exoplayer.external.j
    public void W(boolean foregroundMode) {
        if (this.H != foregroundMode) {
            this.H = foregroundMode;
            this.f55633u.j0(foregroundMode);
        }
    }

    public void W0(final boolean playWhenReady, boolean suppressPlayback) {
        boolean z10 = playWhenReady && !suppressPlayback;
        if (this.B != z10) {
            this.B = z10;
            this.f55633u.m0(z10);
        }
        if (this.A != playWhenReady) {
            this.A = playWhenReady;
            final int i10 = this.L.f55302e;
            T0(new androidx.media2.exoplayer.external.a.b(playWhenReady, i10) { // from class: androidx.media2.exoplayer.external.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final boolean f55295a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f55296b;

                {
                    this.f55295a = playWhenReady;
                    this.f55296b = i10;
                }

                @Override // androidx.media2.exoplayer.external.a.b
                public void a(o0.d dVar) {
                    dVar.C(this.f55295a, this.f55296b);
                }
            });
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int Y() {
        if (X0()) {
            return this.M;
        }
        l0 l0Var = this.L;
        return l0Var.f55298a.h(l0Var.f55299b.f56507a, this.f55636x).f57955c;
    }

    @Override // androidx.media2.exoplayer.external.j
    public void Z() {
        androidx.media2.exoplayer.external.source.z zVar = this.f55638z;
        if (zVar == null || this.L.f55302e != 1) {
            return;
        }
        y0(zVar, false, false);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void b0(boolean playWhenReady) {
        W0(playWhenReady, false);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public m0 c() {
        return this.J;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public z0 c0() {
        return this.L.f55298a;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public boolean d() {
        return this.L.f55304g;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public Looper d0() {
        return this.f55632t.getLooper();
    }

    @Override // androidx.media2.exoplayer.external.o0
    public androidx.media2.exoplayer.external.trackselection.p g0() {
        return this.L.f55306i.f57231c;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long getCurrentPosition() {
        if (X0()) {
            return this.O;
        }
        if (this.L.f55299b.b()) {
            return c.c(this.L.f55310m);
        }
        l0 l0Var = this.L;
        return V0(l0Var.f55299b, l0Var.f55310m);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long getDuration() {
        if (!x()) {
            return N();
        }
        l0 l0Var = this.L;
        androidx.media2.exoplayer.external.source.z.a aVar = l0Var.f55299b;
        l0Var.f55298a.h(aVar.f56507a, this.f55636x);
        return c.c(this.f55636x.b(aVar.f56508b, aVar.f56509c));
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int i0(int index) {
        return this.f55630r[index].f();
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void j0(int windowIndex, long positionMs) {
        int i10;
        z0 z0Var = this.L.f55298a;
        if (windowIndex < 0 || (!z0Var.s() && windowIndex >= z0Var.r())) {
            throw new e0(z0Var, windowIndex, positionMs);
        }
        this.G = true;
        this.E++;
        if (x()) {
            androidx.media2.exoplayer.external.util.p.l(P, "seekTo ignored because an ad is playing");
            this.f55632t.obtainMessage(0, 1, -1, this.L).sendToTarget();
            return;
        }
        this.M = windowIndex;
        if (z0Var.s()) {
            this.O = positionMs == -9223372036854775807L ? 0L : positionMs;
            this.N = 0;
            i10 = windowIndex;
        } else {
            long jB = positionMs == -9223372036854775807L ? z0Var.n(windowIndex, this.f53119p).b() : c.b(positionMs);
            i10 = windowIndex;
            Pair<Object, Long> pairJ = z0Var.j(this.f53119p, this.f55636x, i10, jB);
            this.O = c.c(jB);
            this.N = z0Var.b(pairJ.first);
        }
        this.f55633u.Z(z0Var, i10, c.b(positionMs));
        T0(o.f55591a);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long n0() {
        if (!x()) {
            return getCurrentPosition();
        }
        l0 l0Var = this.L;
        l0Var.f55298a.h(l0Var.f55299b.f56507a, this.f55636x);
        l0 l0Var2 = this.L;
        return l0Var2.f55301d == -9223372036854775807L ? l0Var2.f55298a.n(Y(), this.f53119p).a() : this.f55636x.l() + c.c(this.L.f55301d);
    }

    @Override // androidx.media2.exoplayer.external.j
    public Looper p0() {
        return this.f55633u.s();
    }

    @Override // androidx.media2.exoplayer.external.j
    public x0 r() {
        return this.K;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void release() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = androidx.media2.exoplayer.external.util.q0.f57630e;
        String strB = c0.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(strB).length());
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append(c0.f53753c);
        sb2.append("] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(strB);
        sb2.append("]");
        androidx.media2.exoplayer.external.util.p.h(P, sb2.toString());
        this.f55638z = null;
        this.f55633u.P();
        this.f55632t.removeCallbacksAndMessages(null);
        this.L = B(false, false, false, 1);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public boolean s0() {
        return this.D;
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public o0.j u0() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long v() {
        if (!x()) {
            return R();
        }
        l0 l0Var = this.L;
        return l0Var.f55307j.equals(l0Var.f55299b) ? c.c(this.L.f55308k) : getDuration();
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public o0.e v0() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void w(@androidx.annotation.p0 final m0 playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = m0.f55312e;
        }
        if (this.J.equals(playbackParameters)) {
            return;
        }
        this.I++;
        this.J = playbackParameters;
        this.f55633u.o0(playbackParameters);
        T0(new androidx.media2.exoplayer.external.a.b(playbackParameters) { // from class: androidx.media2.exoplayer.external.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final m0 f55612a;

            {
                this.f55612a = playbackParameters;
            }

            @Override // androidx.media2.exoplayer.external.a.b
            public void a(o0.d dVar) {
                dVar.f(this.f55612a);
            }
        });
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void w0(o0.d listener) {
        this.f55635w.addIfAbsent(new androidx.media2.exoplayer.external.a.C0499a(listener));
    }

    @Override // androidx.media2.exoplayer.external.o0
    public boolean x() {
        if (X0() || !this.L.f55299b.b()) {
            return false;
        }
        int i10 = 2 >> 1;
        return true;
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public o0.h x0() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long y() {
        return c.c(this.L.f55309l);
    }

    @Override // androidx.media2.exoplayer.external.j
    public void y0(androidx.media2.exoplayer.external.source.z mediaSource, boolean resetPosition, boolean resetState) {
        this.f55638z = mediaSource;
        l0 l0VarB = B(resetPosition, resetState, true, 2);
        this.F = true;
        this.E++;
        this.f55633u.N(mediaSource, resetPosition, resetState);
        Y0(l0VarB, false, 4, 1, false);
    }

    @Override // androidx.media2.exoplayer.external.j
    public q0 z0(q0.b target) {
        return new q0(this.f55633u, target, this.L.f55298a, Y(), this.f55634v);
    }
}
