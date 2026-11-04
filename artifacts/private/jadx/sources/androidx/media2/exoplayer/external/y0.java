package androidx.media2.exoplayer.external;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.trackselection.DefaultTrackSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class y0 extends androidx.media2.exoplayer.external.a implements j, o0.a, o0.j, o0.h, o0.e {
    private static final String Y = "SimpleExoPlayer";
    private final androidx.media2.exoplayer.external.upstream.d A;
    private final androidx.media2.exoplayer.external.analytics.a B;
    private final androidx.media2.exoplayer.external.audio.g C;

    @androidx.annotation.p0
    private Format D;

    @androidx.annotation.p0
    private Format E;

    @androidx.annotation.p0
    private Surface F;
    private boolean G;
    private int H;

    @androidx.annotation.p0
    private SurfaceHolder I;

    @androidx.annotation.p0
    private TextureView J;
    private int K;
    private int L;

    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.decoder.d M;

    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.decoder.d N;
    private int O;
    private androidx.media2.exoplayer.external.audio.c P;
    private float Q;

    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.source.z R;
    private List<androidx.media2.exoplayer.external.text.b> S;

    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.video.i T;

    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.video.spherical.a U;
    private boolean V;

    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.util.a0 W;
    private boolean X;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final t0[] f57930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final s f57931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f57932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final c f57933t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final CopyOnWriteArraySet<androidx.media2.exoplayer.external.video.l> f57934u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final CopyOnWriteArraySet<androidx.media2.exoplayer.external.audio.i> f57935v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final CopyOnWriteArraySet<androidx.media2.exoplayer.external.text.k> f57936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet<androidx.media2.exoplayer.external.metadata.e> f57937x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final CopyOnWriteArraySet<androidx.media2.exoplayer.external.video.u> f57938y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final CopyOnWriteArraySet<androidx.media2.exoplayer.external.audio.r> f57939z;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f57940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w0 f57941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media2.exoplayer.external.util.c f57942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media2.exoplayer.external.trackselection.r f57943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f0 f57944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media2.exoplayer.external.upstream.d f57945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.media2.exoplayer.external.analytics.a f57946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Looper f57947h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f57948i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f57949j;

        public b(Context context) {
            this(context, new h(context));
        }

        public y0 a() {
            androidx.media2.exoplayer.external.util.a.i(!this.f57949j);
            this.f57949j = true;
            return new y0(this.f57940a, this.f57941b, this.f57943d, this.f57944e, this.f57945f, this.f57946g, this.f57942c, this.f57947h);
        }

        public b b(androidx.media2.exoplayer.external.analytics.a analyticsCollector) {
            androidx.media2.exoplayer.external.util.a.i(!this.f57949j);
            this.f57946g = analyticsCollector;
            return this;
        }

        public b c(androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
            androidx.media2.exoplayer.external.util.a.i(!this.f57949j);
            this.f57945f = bandwidthMeter;
            return this;
        }

        @l1
        public b d(androidx.media2.exoplayer.external.util.c clock) {
            androidx.media2.exoplayer.external.util.a.i(!this.f57949j);
            this.f57942c = clock;
            return this;
        }

        public b e(f0 loadControl) {
            androidx.media2.exoplayer.external.util.a.i(!this.f57949j);
            this.f57944e = loadControl;
            return this;
        }

        public b f(Looper looper) {
            androidx.media2.exoplayer.external.util.a.i(!this.f57949j);
            this.f57947h = looper;
            return this;
        }

        public b g(androidx.media2.exoplayer.external.trackselection.r trackSelector) {
            androidx.media2.exoplayer.external.util.a.i(!this.f57949j);
            this.f57943d = trackSelector;
            return this;
        }

        public b h(boolean useLazyPreparation) {
            androidx.media2.exoplayer.external.util.a.i(!this.f57949j);
            this.f57948i = useLazyPreparation;
            return this;
        }

        public b(Context context, w0 renderersFactory) {
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
            f fVar = new f();
            androidx.media2.exoplayer.external.upstream.r rVarL = androidx.media2.exoplayer.external.upstream.r.l(context);
            Looper looperQ = androidx.media2.exoplayer.external.util.q0.Q();
            androidx.media2.exoplayer.external.util.c cVar = androidx.media2.exoplayer.external.util.c.f57511a;
            this(context, renderersFactory, defaultTrackSelector, fVar, rVarL, looperQ, new androidx.media2.exoplayer.external.analytics.a(cVar), true, cVar);
        }

        public b(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, Looper looper, androidx.media2.exoplayer.external.analytics.a analyticsCollector, boolean useLazyPreparation, androidx.media2.exoplayer.external.util.c clock) {
            this.f57940a = context;
            this.f57941b = renderersFactory;
            this.f57943d = trackSelector;
            this.f57944e = loadControl;
            this.f57945f = bandwidthMeter;
            this.f57947h = looper;
            this.f57946g = analyticsCollector;
            this.f57948i = useLazyPreparation;
            this.f57942c = clock;
        }
    }

    private final class c implements androidx.media2.exoplayer.external.video.u, androidx.media2.exoplayer.external.audio.r, androidx.media2.exoplayer.external.text.k, androidx.media2.exoplayer.external.metadata.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, androidx.media2.exoplayer.external.audio.g.e, o0.d {
        private c() {
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void A(int i10) {
            p0.e(this, i10);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void C(boolean z10, int i10) {
            p0.d(this, z10, i10);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void D(z0 z0Var, Object obj, int i10) {
            p0.j(this, z0Var, obj, i10);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void F() {
            p0.g(this);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void G(z0 z0Var, int i10) {
            p0.i(this, z0Var, i10);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void H(TrackGroupArray trackGroupArray, androidx.media2.exoplayer.external.trackselection.p pVar) {
            p0.k(this, trackGroupArray, pVar);
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void I(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
            Iterator it = y0.this.f57939z.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.audio.r) it.next()).I(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
            }
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void J(androidx.media2.exoplayer.external.decoder.d counters) {
            Iterator it = y0.this.f57938y.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.video.u) it.next()).J(counters);
            }
            y0.this.D = null;
            y0.this.M = null;
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void K(i iVar) {
            p0.c(this, iVar);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void L(androidx.media2.exoplayer.external.decoder.d counters) {
            y0.this.M = counters;
            Iterator it = y0.this.f57938y.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.video.u) it.next()).L(counters);
            }
        }

        @Override // androidx.media2.exoplayer.external.metadata.e
        public void P(Metadata metadata) {
            Iterator it = y0.this.f57937x.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.metadata.e) it.next()).P(metadata);
            }
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void Q(androidx.media2.exoplayer.external.decoder.d counters) {
            Iterator it = y0.this.f57939z.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.audio.r) it.next()).Q(counters);
            }
            y0.this.E = null;
            y0.this.N = null;
            y0.this.O = 0;
        }

        @Override // androidx.media2.exoplayer.external.audio.r, androidx.media2.exoplayer.external.audio.i
        public void a(int sessionId) {
            if (y0.this.O == sessionId) {
                return;
            }
            y0.this.O = sessionId;
            for (androidx.media2.exoplayer.external.audio.i iVar : y0.this.f57935v) {
                if (!y0.this.f57939z.contains(iVar)) {
                    iVar.a(sessionId);
                }
            }
            Iterator it = y0.this.f57939z.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.audio.r) it.next()).a(sessionId);
            }
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void b(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
            Iterator it = y0.this.f57939z.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.audio.r) it.next()).b(decoderName, initializedTimestampMs, initializationDurationMs);
            }
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void c(int count, long elapsed) {
            Iterator it = y0.this.f57938y.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.video.u) it.next()).c(count, elapsed);
            }
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void d(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
            Iterator it = y0.this.f57938y.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.video.u) it.next()).d(decoderName, initializedTimestampMs, initializationDurationMs);
            }
        }

        @Override // androidx.media2.exoplayer.external.video.u, androidx.media2.exoplayer.external.video.l
        public void e(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
            for (androidx.media2.exoplayer.external.video.l lVar : y0.this.f57934u) {
                if (!y0.this.f57938y.contains(lVar)) {
                    lVar.e(width, height, unappliedRotationDegrees, pixelWidthHeightRatio);
                }
            }
            Iterator it = y0.this.f57938y.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.video.u) it.next()).e(width, height, unappliedRotationDegrees, pixelWidthHeightRatio);
            }
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void f(m0 m0Var) {
            p0.b(this, m0Var);
        }

        @Override // androidx.media2.exoplayer.external.audio.g.e
        public void g(float volumeMultiplier) {
            y0.this.s1();
        }

        @Override // androidx.media2.exoplayer.external.audio.g.e
        public void h(int playerCommand) {
            y0 y0Var = y0.this;
            y0Var.C1(y0Var.J(), playerCommand);
        }

        @Override // androidx.media2.exoplayer.external.text.k
        public void i(List<androidx.media2.exoplayer.external.text.b> cues) {
            y0.this.S = cues;
            Iterator it = y0.this.f57936w.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.text.k) it.next()).i(cues);
            }
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void j(boolean isLoading) {
            if (y0.this.W != null) {
                if (isLoading && !y0.this.X) {
                    y0.this.W.a(0);
                    y0.this.X = true;
                } else {
                    if (isLoading || !y0.this.X) {
                        return;
                    }
                    y0.this.W.e(0);
                    y0.this.X = false;
                }
            }
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void m(Format format) {
            y0.this.D = format;
            Iterator it = y0.this.f57938y.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.video.u) it.next()).m(format);
            }
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void n(boolean z10) {
            p0.h(this, z10);
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void o(androidx.media2.exoplayer.external.decoder.d counters) {
            y0.this.N = counters;
            Iterator it = y0.this.f57939z.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.audio.r) it.next()).o(counters);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
            y0.this.B1(new Surface(surfaceTexture), true);
            y0.this.n1(width, height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            y0.this.B1(null, true);
            y0.this.n1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int width, int height) {
            y0.this.n1(width, height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void q(Format format) {
            y0.this.E = format;
            Iterator it = y0.this.f57939z.iterator();
            while (it.hasNext()) {
                ((androidx.media2.exoplayer.external.audio.r) it.next()).q(format);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            y0.this.n1(width, height);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            y0.this.B1(holder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            y0.this.B1(null, false);
            y0.this.n1(0, 0);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void w(Surface surface) {
            if (y0.this.F == surface) {
                Iterator it = y0.this.f57934u.iterator();
                while (it.hasNext()) {
                    ((androidx.media2.exoplayer.external.video.l) it.next()).v();
                }
            }
            Iterator it2 = y0.this.f57938y.iterator();
            while (it2.hasNext()) {
                ((androidx.media2.exoplayer.external.video.u) it2.next()).w(surface);
            }
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void x(int i10) {
            p0.f(this, i10);
        }
    }

    @Deprecated
    public interface d extends androidx.media2.exoplayer.external.video.l {
    }

    protected y0(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, androidx.media2.exoplayer.external.analytics.a analyticsCollector, androidx.media2.exoplayer.external.util.c clock, Looper looper) {
        this(context, renderersFactory, trackSelector, loadControl, androidx.media2.exoplayer.external.drm.q.b(), bandwidthMeter, analyticsCollector, clock, looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B1(@androidx.annotation.p0 Surface surface, boolean ownsSurface) {
        ArrayList arrayList = new ArrayList();
        for (t0 t0Var : this.f57930q) {
            if (t0Var.f() == 2) {
                arrayList.add(this.f57931r.z0(t0Var).s(1).p(surface).m());
            }
        }
        Surface surface2 = this.F;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((q0) it.next()).a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.G) {
                this.F.release();
            }
        }
        this.F = surface;
        this.G = ownsSurface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C1(boolean playWhenReady, int playerCommand) {
        this.f57931r.W0(playWhenReady && playerCommand != -1, playerCommand != 1);
    }

    private void D1() {
        if (Looper.myLooper() != d0()) {
            androidx.media2.exoplayer.external.util.p.m(Y, "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.V ? null : new IllegalStateException());
            this.V = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1(int width, int height) {
        if (width == this.K && height == this.L) {
            return;
        }
        this.K = width;
        this.L = height;
        Iterator<androidx.media2.exoplayer.external.video.l> it = this.f57934u.iterator();
        while (it.hasNext()) {
            it.next().z(width, height);
        }
    }

    private void q1() {
        TextureView textureView = this.J;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f57933t) {
                androidx.media2.exoplayer.external.util.p.l(Y, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.J.setSurfaceTextureListener(null);
            }
            this.J = null;
        }
        SurfaceHolder surfaceHolder = this.I;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f57933t);
            this.I = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1() {
        float fN = this.Q * this.C.n();
        for (t0 t0Var : this.f57930q) {
            if (t0Var.f() == 1) {
                this.f57931r.z0(t0Var).s(2).p(Float.valueOf(fN)).m();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public o0.a A0() {
        return this;
    }

    @Deprecated
    public void A1(d listener) {
        this.f57934u.clear();
        if (listener != null) {
            K0(listener);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public void B0(androidx.media2.exoplayer.external.audio.c audioAttributes, boolean handleAudioFocus) {
        D1();
        if (!androidx.media2.exoplayer.external.util.q0.b(this.P, audioAttributes)) {
            this.P = audioAttributes;
            for (t0 t0Var : this.f57930q) {
                if (t0Var.f() == 1) {
                    this.f57931r.z0(t0Var).s(3).p(audioAttributes).m();
                }
            }
            Iterator<androidx.media2.exoplayer.external.audio.i> it = this.f57935v.iterator();
            while (it.hasNext()) {
                it.next().E(audioAttributes);
            }
        }
        androidx.media2.exoplayer.external.audio.g gVar = this.C;
        if (!handleAudioFocus) {
            audioAttributes = null;
        }
        C1(J(), gVar.v(audioAttributes, J(), H()));
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int C() {
        D1();
        return this.f57931r.C();
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void C0(androidx.media2.exoplayer.external.video.i listener) {
        D1();
        this.T = listener;
        for (t0 t0Var : this.f57930q) {
            if (t0Var.f() == 2) {
                this.f57931r.z0(t0Var).s(6).p(listener).m();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void D(int repeatMode) {
        D1();
        this.f57931r.D(repeatMode);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void D0(o0.d listener) {
        D1();
        this.f57931r.D0(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int E() {
        D1();
        return this.f57931r.E();
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public i E0() {
        D1();
        return this.f57931r.E0();
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void F0(androidx.media2.exoplayer.external.video.l listener) {
        this.f57934u.remove(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void G0(androidx.media2.exoplayer.external.video.spherical.a listener) {
        D1();
        this.U = listener;
        for (t0 t0Var : this.f57930q) {
            if (t0Var.f() == 5) {
                this.f57931r.z0(t0Var).s(7).p(listener).m();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int H() {
        D1();
        return this.f57931r.H();
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void H0(androidx.media2.exoplayer.external.video.spherical.a listener) {
        D1();
        if (this.U != listener) {
            return;
        }
        for (t0 t0Var : this.f57930q) {
            if (t0Var.f() == 5) {
                this.f57931r.z0(t0Var).s(7).p(null).m();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public TrackGroupArray I() {
        D1();
        return this.f57931r.I();
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void I0(androidx.media2.exoplayer.external.video.i listener) {
        D1();
        if (this.T == listener) {
            for (t0 t0Var : this.f57930q) {
                if (t0Var.f() == 2) {
                    this.f57931r.z0(t0Var).s(6).p(null).m();
                }
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public boolean J() {
        D1();
        return this.f57931r.J();
    }

    @Override // androidx.media2.exoplayer.external.j
    public void J0(@androidx.annotation.p0 x0 seekParameters) {
        D1();
        this.f57931r.J0(seekParameters);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void K(boolean shuffleModeEnabled) {
        D1();
        this.f57931r.K(shuffleModeEnabled);
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void K0(androidx.media2.exoplayer.external.video.l listener) {
        this.f57934u.add(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void L(boolean reset) {
        D1();
        this.f57931r.L(reset);
        androidx.media2.exoplayer.external.source.z zVar = this.R;
        if (zVar != null) {
            zVar.i(this.B);
            this.B.e0();
            if (reset) {
                this.R = null;
            }
        }
        this.C.r();
        this.S = Collections.EMPTY_LIST;
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public void L0(androidx.media2.exoplayer.external.audio.i listener) {
        this.f57935v.remove(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int M() {
        D1();
        return this.f57931r.M();
    }

    @Override // androidx.media2.exoplayer.external.j
    public void M0(androidx.media2.exoplayer.external.source.z mediaSource) {
        y0(mediaSource, true, true);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int O() {
        D1();
        return this.f57931r.O();
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int P() {
        D1();
        return this.f57931r.P();
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long R() {
        D1();
        return this.f57931r.R();
    }

    @Override // androidx.media2.exoplayer.external.j
    public void W(boolean foregroundMode) {
        this.f57931r.W(foregroundMode);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int Y() {
        D1();
        return this.f57931r.Y();
    }

    @Override // androidx.media2.exoplayer.external.j
    public void Z() {
        D1();
        if (this.R != null) {
            if (E0() != null || H() == 1) {
                y0(this.R, false, false);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.h
    public void a(androidx.media2.exoplayer.external.text.k listener) {
        if (!this.S.isEmpty()) {
            listener.i(this.S);
        }
        this.f57936w.add(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void b(int videoScalingMode) {
        D1();
        this.H = videoScalingMode;
        for (t0 t0Var : this.f57930q) {
            if (t0Var.f() == 2) {
                this.f57931r.z0(t0Var).s(4).p(Integer.valueOf(videoScalingMode)).m();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void b0(boolean playWhenReady) {
        D1();
        C1(playWhenReady, this.C.q(playWhenReady, H()));
    }

    public void b1(androidx.media2.exoplayer.external.analytics.c listener) {
        D1();
        this.B.T(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public m0 c() {
        D1();
        return this.f57931r.c();
    }

    @Override // androidx.media2.exoplayer.external.o0
    public z0 c0() {
        D1();
        return this.f57931r.c0();
    }

    @Deprecated
    public void c1(androidx.media2.exoplayer.external.audio.r listener) {
        this.f57939z.add(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public boolean d() {
        D1();
        return this.f57931r.d();
    }

    @Override // androidx.media2.exoplayer.external.o0
    public Looper d0() {
        return this.f57931r.d0();
    }

    @Deprecated
    public void d1(androidx.media2.exoplayer.external.video.u listener) {
        this.f57938y.add(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public androidx.media2.exoplayer.external.audio.c e() {
        return this.P;
    }

    @Deprecated
    public void e1(androidx.media2.exoplayer.external.metadata.e output) {
        k(output);
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public void f(float audioVolume) {
        D1();
        float fQ = androidx.media2.exoplayer.external.util.q0.q(audioVolume, 0.0f, 1.0f);
        if (this.Q == fQ) {
            return;
        }
        this.Q = fQ;
        s1();
        Iterator<androidx.media2.exoplayer.external.audio.i> it = this.f57935v.iterator();
        while (it.hasNext()) {
            it.next().B(fQ);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void f0(TextureView textureView) {
        D1();
        q1();
        this.J = textureView;
        if (textureView == null) {
            B1(null, true);
            n1(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            androidx.media2.exoplayer.external.util.p.l(Y, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f57933t);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            B1(null, true);
            n1(0, 0);
        } else {
            B1(new Surface(surfaceTexture), true);
            n1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Deprecated
    public void f1(androidx.media2.exoplayer.external.text.k output) {
        g(output);
    }

    @Override // androidx.media2.exoplayer.external.o0.h
    public void g(androidx.media2.exoplayer.external.text.k listener) {
        this.f57936w.remove(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public androidx.media2.exoplayer.external.trackselection.p g0() {
        D1();
        return this.f57931r.g0();
    }

    @Deprecated
    public void g1(d listener) {
        F0(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public int getAudioSessionId() {
        return this.O;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long getCurrentPosition() {
        D1();
        return this.f57931r.getCurrentPosition();
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long getDuration() {
        D1();
        return this.f57931r.getDuration();
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public void h(androidx.media2.exoplayer.external.audio.v auxEffectInfo) {
        D1();
        for (t0 t0Var : this.f57930q) {
            if (t0Var.f() == 1) {
                this.f57931r.z0(t0Var).s(5).p(auxEffectInfo).m();
            }
        }
    }

    public androidx.media2.exoplayer.external.analytics.a h1() {
        return this.B;
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void i(@androidx.annotation.p0 Surface surface) {
        D1();
        q1();
        B1(surface, false);
        int i10 = surface != null ? -1 : 0;
        n1(i10, i10);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public int i0(int index) {
        D1();
        return this.f57931r.i0(index);
    }

    @androidx.annotation.p0
    public androidx.media2.exoplayer.external.decoder.d i1() {
        return this.N;
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void j(SurfaceView surfaceView) {
        l(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void j0(int windowIndex, long positionMs) {
        D1();
        this.B.c0();
        this.f57931r.j0(windowIndex, positionMs);
    }

    @androidx.annotation.p0
    public Format j1() {
        return this.E;
    }

    @Override // androidx.media2.exoplayer.external.o0.e
    public void k(androidx.media2.exoplayer.external.metadata.e listener) {
        this.f57937x.remove(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public float k0() {
        return this.Q;
    }

    @Deprecated
    public int k1() {
        return androidx.media2.exoplayer.external.util.q0.a0(this.P.f53276c);
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void l(SurfaceHolder surfaceHolder) {
        D1();
        q1();
        this.I = surfaceHolder;
        if (surfaceHolder == null) {
            B1(null, false);
            n1(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f57933t);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            B1(null, false);
            n1(0, 0);
        } else {
            B1(surface, false);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            n1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public void l0(androidx.media2.exoplayer.external.audio.i listener) {
        this.f57935v.add(listener);
    }

    @androidx.annotation.p0
    public androidx.media2.exoplayer.external.decoder.d l1() {
        return this.M;
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void m(SurfaceHolder surfaceHolder) {
        D1();
        if (surfaceHolder == null || surfaceHolder != this.I) {
            return;
        }
        l(null);
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void m0() {
        D1();
        i(null);
    }

    @androidx.annotation.p0
    public Format m1() {
        return this.D;
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public void n() {
        h(new androidx.media2.exoplayer.external.audio.v(0, 0.0f));
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long n0() {
        D1();
        return this.f57931r.n0();
    }

    @Override // androidx.media2.exoplayer.external.o0.a
    public void o(androidx.media2.exoplayer.external.audio.c audioAttributes) {
        B0(audioAttributes, false);
    }

    public void o1(androidx.media2.exoplayer.external.analytics.c listener) {
        D1();
        this.B.d0(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void p(TextureView textureView) {
        D1();
        if (textureView == null || textureView != this.J) {
            return;
        }
        f0(null);
    }

    @Override // androidx.media2.exoplayer.external.j
    public Looper p0() {
        return this.f57931r.p0();
    }

    @Deprecated
    public void p1(androidx.media2.exoplayer.external.audio.r listener) {
        this.f57939z.remove(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0.e
    public void q(androidx.media2.exoplayer.external.metadata.e listener) {
        this.f57937x.add(listener);
    }

    @Override // androidx.media2.exoplayer.external.j
    public x0 r() {
        D1();
        return this.f57931r.r();
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void r0(SurfaceView surfaceView) {
        m(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Deprecated
    public void r1(androidx.media2.exoplayer.external.video.u listener) {
        this.f57938y.remove(listener);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void release() {
        D1();
        this.C.r();
        this.f57931r.release();
        q1();
        Surface surface = this.F;
        if (surface != null) {
            if (this.G) {
                surface.release();
            }
            this.F = null;
        }
        androidx.media2.exoplayer.external.source.z zVar = this.R;
        if (zVar != null) {
            zVar.i(this.B);
            this.R = null;
        }
        if (this.X) {
            ((androidx.media2.exoplayer.external.util.a0) androidx.media2.exoplayer.external.util.a.g(this.W)).e(0);
            this.X = false;
        }
        this.A.f(this.B);
        this.S = Collections.EMPTY_LIST;
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public int s() {
        return this.H;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public boolean s0() {
        D1();
        return this.f57931r.s0();
    }

    @Deprecated
    public void t1(androidx.media2.exoplayer.external.audio.r listener) {
        this.f57939z.retainAll(Collections.singleton(this.B));
        if (listener != null) {
            c1(listener);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.j
    public void u(Surface surface) {
        D1();
        if (surface == null || surface != this.F) {
            return;
        }
        i(null);
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public o0.j u0() {
        return this;
    }

    @Deprecated
    public void u1(int streamType) {
        int iG = androidx.media2.exoplayer.external.util.q0.G(streamType);
        o(new androidx.media2.exoplayer.external.audio.c.b().d(iG).b(androidx.media2.exoplayer.external.util.q0.E(streamType)).a());
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long v() {
        D1();
        return this.f57931r.v();
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public o0.e v0() {
        return this;
    }

    @Deprecated
    public void v1(androidx.media2.exoplayer.external.metadata.e output) {
        this.f57937x.retainAll(Collections.singleton(this.B));
        if (output != null) {
            q(output);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void w(@androidx.annotation.p0 m0 playbackParameters) {
        D1();
        this.f57931r.w(playbackParameters);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public void w0(o0.d listener) {
        D1();
        this.f57931r.w0(listener);
    }

    @e.b(23)
    @Deprecated
    public void w1(@androidx.annotation.p0 PlaybackParams params) {
        m0 m0Var;
        if (params != null) {
            params.allowDefaults();
            m0Var = new m0(params.getSpeed(), params.getPitch());
        } else {
            m0Var = null;
        }
        w(m0Var);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public boolean x() {
        D1();
        return this.f57931r.x();
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public o0.h x0() {
        return this;
    }

    public void x1(@androidx.annotation.p0 androidx.media2.exoplayer.external.util.a0 priorityTaskManager) {
        D1();
        if (androidx.media2.exoplayer.external.util.q0.b(this.W, priorityTaskManager)) {
            return;
        }
        if (this.X) {
            ((androidx.media2.exoplayer.external.util.a0) androidx.media2.exoplayer.external.util.a.g(this.W)).e(0);
        }
        if (priorityTaskManager == null || !d()) {
            this.X = false;
        } else {
            priorityTaskManager.a(0);
            this.X = true;
        }
        this.W = priorityTaskManager;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public long y() {
        D1();
        return this.f57931r.y();
    }

    @Override // androidx.media2.exoplayer.external.j
    public void y0(androidx.media2.exoplayer.external.source.z mediaSource, boolean resetPosition, boolean resetState) {
        D1();
        androidx.media2.exoplayer.external.source.z zVar = this.R;
        if (zVar != null) {
            zVar.i(this.B);
            this.B.e0();
        }
        this.R = mediaSource;
        mediaSource.g(this.f57932s, this.B);
        C1(J(), this.C.p(J()));
        this.f57931r.y0(mediaSource, resetPosition, resetState);
    }

    @Deprecated
    public void y1(androidx.media2.exoplayer.external.text.k output) {
        this.f57936w.clear();
        if (output != null) {
            a(output);
        }
    }

    @Override // androidx.media2.exoplayer.external.j
    public q0 z0(q0.b target) {
        D1();
        return this.f57931r.z0(target);
    }

    @Deprecated
    public void z1(androidx.media2.exoplayer.external.video.u listener) {
        this.f57938y.retainAll(Collections.singleton(this.B));
        if (listener != null) {
            d1(listener);
        }
    }

    @Deprecated
    protected y0(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, androidx.media2.exoplayer.external.analytics.a analyticsCollector, androidx.media2.exoplayer.external.util.c clock, Looper looper) {
        this.A = bandwidthMeter;
        this.B = analyticsCollector;
        c cVar = new c();
        this.f57933t = cVar;
        CopyOnWriteArraySet<androidx.media2.exoplayer.external.video.l> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f57934u = copyOnWriteArraySet;
        CopyOnWriteArraySet<androidx.media2.exoplayer.external.audio.i> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f57935v = copyOnWriteArraySet2;
        this.f57936w = new CopyOnWriteArraySet<>();
        this.f57937x = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<androidx.media2.exoplayer.external.video.u> copyOnWriteArraySet3 = new CopyOnWriteArraySet<>();
        this.f57938y = copyOnWriteArraySet3;
        CopyOnWriteArraySet<androidx.media2.exoplayer.external.audio.r> copyOnWriteArraySet4 = new CopyOnWriteArraySet<>();
        this.f57939z = copyOnWriteArraySet4;
        Handler handler = new Handler(looper);
        this.f57932s = handler;
        t0[] t0VarArrA = renderersFactory.a(handler, cVar, cVar, cVar, cVar, drmSessionManager);
        this.f57930q = t0VarArrA;
        this.Q = 1.0f;
        this.O = 0;
        this.P = androidx.media2.exoplayer.external.audio.c.f53273e;
        this.H = 1;
        this.S = Collections.EMPTY_LIST;
        s sVar = new s(t0VarArrA, trackSelector, loadControl, bandwidthMeter, clock, looper);
        this.f57931r = sVar;
        analyticsCollector.f0(sVar);
        w0(analyticsCollector);
        w0(cVar);
        copyOnWriteArraySet3.add(analyticsCollector);
        copyOnWriteArraySet.add(analyticsCollector);
        copyOnWriteArraySet4.add(analyticsCollector);
        copyOnWriteArraySet2.add(analyticsCollector);
        q(analyticsCollector);
        bandwidthMeter.g(handler, analyticsCollector);
        if (drmSessionManager instanceof androidx.media2.exoplayer.external.drm.n) {
            ((androidx.media2.exoplayer.external.drm.n) drmSessionManager).h(handler, analyticsCollector);
        }
        this.C = new androidx.media2.exoplayer.external.audio.g(context, cVar);
    }
}
