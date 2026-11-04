package androidx.media2.exoplayer.external.audio;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.m0;
import androidx.media2.exoplayer.external.util.l0;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class e0 extends androidx.media2.exoplayer.external.b implements androidx.media2.exoplayer.external.util.r {

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f53314n3 = 0;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f53315o3 = 1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f53316p3 = 2;
    private int H1;
    private androidx.media2.exoplayer.external.decoder.g<androidx.media2.exoplayer.external.decoder.e, ? extends androidx.media2.exoplayer.external.decoder.h, ? extends f> X;
    private androidx.media2.exoplayer.external.decoder.e Y;
    private androidx.media2.exoplayer.external.decoder.h Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f53317g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private long f53318h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f53319i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.t> f53320j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private boolean f53321j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f53322k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f53323k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final r.a f53324l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f53325l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s f53326m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f53327m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.d0 f53328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.decoder.e f53329o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @p0
    private androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> f53330p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> f53331p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f53332p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.media2.exoplayer.external.decoder.d f53333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Format f53334t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f53335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f53336w;

    private final class b implements s.c {
        private b() {
        }

        @Override // androidx.media2.exoplayer.external.audio.s.c
        public void a(int audioSessionId) {
            e0.this.f53324l.a(audioSessionId);
            e0.this.S(audioSessionId);
        }

        @Override // androidx.media2.exoplayer.external.audio.s.c
        public void b(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
            e0.this.f53324l.b(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
            e0.this.U(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
        }

        @Override // androidx.media2.exoplayer.external.audio.s.c
        public void c() {
            e0.this.T();
            e0.this.f53321j3 = true;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface c {
    }

    public e0() {
        this((Handler) null, (r) null, new j[0]);
    }

    private boolean N() throws s.d, s.a, androidx.media2.exoplayer.external.i, s.b, f {
        if (this.Z == null) {
            androidx.media2.exoplayer.external.decoder.h hVar = (androidx.media2.exoplayer.external.decoder.h) this.X.a();
            this.Z = hVar;
            if (hVar == null) {
                return false;
            }
            int i10 = hVar.f53794c;
            if (i10 > 0) {
                this.f53333s.f53781f += i10;
                this.f53326m.m();
            }
        }
        if (this.Z.t()) {
            if (this.H1 == 2) {
                Y();
                R();
                this.f53317g3 = true;
            } else {
                this.Z.x();
                this.Z = null;
                X();
            }
            return false;
        }
        if (this.f53317g3) {
            Format formatQ = Q();
            this.f53326m.r(formatQ.f53113p1, formatQ.Z, formatQ.f53112p0, 0, null, this.f53335v, this.f53336w);
            this.f53317g3 = false;
        }
        s sVar = this.f53326m;
        androidx.media2.exoplayer.external.decoder.h hVar2 = this.Z;
        if (!sVar.n(hVar2.f53810e, hVar2.f53793b)) {
            return false;
        }
        this.f53333s.f53780e++;
        this.Z.x();
        this.Z = null;
        return true;
    }

    private boolean O() throws Exception {
        androidx.media2.exoplayer.external.decoder.g<androidx.media2.exoplayer.external.decoder.e, ? extends androidx.media2.exoplayer.external.decoder.h, ? extends f> gVar = this.X;
        if (gVar != null && this.H1 != 2 && !this.f53323k3) {
            if (this.Y == null) {
                androidx.media2.exoplayer.external.decoder.e eVarC = gVar.c();
                this.Y = eVarC;
                if (eVarC == null) {
                    return false;
                }
            }
            if (this.H1 == 1) {
                this.Y.w(4);
                this.X.b(this.Y);
                this.Y = null;
                this.H1 = 2;
                return false;
            }
            int iH = this.f53327m3 ? -4 : H(this.f53328n, this.Y, false);
            if (iH == -3) {
                return false;
            }
            if (iH == -5) {
                V(this.f53328n);
                return true;
            }
            if (this.Y.t()) {
                this.f53323k3 = true;
                this.X.b(this.Y);
                this.Y = null;
                return false;
            }
            boolean zB0 = b0(this.Y.E());
            this.f53327m3 = zB0;
            if (zB0) {
                return false;
            }
            this.Y.D();
            W(this.Y);
            this.X.b(this.Y);
            this.f53332p2 = true;
            this.f53333s.f53778c++;
            this.Y = null;
            return true;
        }
        return false;
    }

    private void P() throws androidx.media2.exoplayer.external.i {
        this.f53327m3 = false;
        if (this.H1 != 0) {
            Y();
            R();
            return;
        }
        this.Y = null;
        androidx.media2.exoplayer.external.decoder.h hVar = this.Z;
        if (hVar != null) {
            hVar.x();
            this.Z = null;
        }
        this.X.flush();
        this.f53332p2 = false;
    }

    private void R() throws androidx.media2.exoplayer.external.i {
        androidx.media2.exoplayer.external.drm.t tVarW;
        if (this.X != null) {
            return;
        }
        Z(this.f53331p1);
        androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> pVar = this.f53330p0;
        if (pVar != null) {
            tVarW = pVar.W();
            if (tVarW == null && this.f53330p0.T() == null) {
                return;
            }
        } else {
            tVarW = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            l0.a("createAudioDecoder");
            this.X = M(this.f53334t, tVarW);
            l0.c();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f53324l.c(this.X.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f53333s.f53776a++;
        } catch (f e10) {
            throw androidx.media2.exoplayer.external.i.c(e10, j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void V(androidx.media2.exoplayer.external.d0 formatHolder) throws androidx.media2.exoplayer.external.i {
        Format format = this.f53334t;
        Format format2 = formatHolder.f53762c;
        this.f53334t = format2;
        if (!q0.b(format2.f53108l, format == null ? null : format.f53108l)) {
            if (this.f53334t.f53108l == null) {
                a0(null);
            } else if (formatHolder.f53760a) {
                a0(formatHolder.f53761b);
            } else {
                androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.t> rVar = this.f53320j;
                if (rVar == null) {
                    throw androidx.media2.exoplayer.external.i.c(new IllegalStateException("Media requires a DrmSessionManager"), j());
                }
                androidx.media2.exoplayer.external.drm.p<T> pVarD = rVar.d(Looper.myLooper(), this.f53334t.f53108l);
                androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> pVar = this.f53331p1;
                if (pVar != null) {
                    pVar.X();
                }
                this.f53331p1 = pVarD;
            }
        }
        if (this.f53332p2) {
            this.H1 = 1;
        } else {
            Y();
            R();
            this.f53317g3 = true;
        }
        Format format3 = this.f53334t;
        this.f53335v = format3.H1;
        this.f53336w = format3.f53114p2;
        this.f53324l.f(format3);
    }

    private void W(androidx.media2.exoplayer.external.decoder.e buffer) {
        if (this.f53319i3 && !buffer.s()) {
            if (Math.abs(buffer.f53790d - this.f53318h3) > 500000) {
                this.f53318h3 = buffer.f53790d;
            }
            this.f53319i3 = false;
        }
    }

    private void X() throws androidx.media2.exoplayer.external.i {
        this.f53325l3 = true;
        try {
            this.f53326m.k();
        } catch (s.d e10) {
            throw androidx.media2.exoplayer.external.i.c(e10, j());
        }
    }

    private void Y() {
        this.Y = null;
        this.Z = null;
        this.H1 = 0;
        this.f53332p2 = false;
        androidx.media2.exoplayer.external.decoder.g<androidx.media2.exoplayer.external.decoder.e, ? extends androidx.media2.exoplayer.external.decoder.h, ? extends f> gVar = this.X;
        if (gVar != null) {
            gVar.release();
            this.X = null;
            this.f53333s.f53777b++;
        }
        Z(null);
    }

    private void Z(@p0 androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> session) {
        androidx.media2.exoplayer.external.drm.o.a(this.f53330p0, session);
        this.f53330p0 = session;
    }

    private void a0(@p0 androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> session) {
        androidx.media2.exoplayer.external.drm.o.a(this.f53331p1, session);
        this.f53331p1 = session;
    }

    private boolean b0(boolean bufferEncrypted) throws androidx.media2.exoplayer.external.i {
        androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> pVar = this.f53330p0;
        if (pVar != null && (bufferEncrypted || !this.f53322k)) {
            int state = pVar.getState();
            if (state != 1) {
                return state != 4;
            }
            throw androidx.media2.exoplayer.external.i.c(this.f53330p0.T(), j());
        }
        return false;
    }

    private void e0() {
        long jL = this.f53326m.l(a());
        if (jL != Long.MIN_VALUE) {
            if (!this.f53321j3) {
                jL = Math.max(this.f53318h3, jL);
            }
            this.f53318h3 = jL;
            this.f53321j3 = false;
        }
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void B(boolean joining) throws androidx.media2.exoplayer.external.i {
        androidx.media2.exoplayer.external.decoder.d dVar = new androidx.media2.exoplayer.external.decoder.d();
        this.f53333s = dVar;
        this.f53324l.e(dVar);
        int i10 = h().f57729a;
        if (i10 != 0) {
            this.f53326m.p(i10);
        } else {
            this.f53326m.i();
        }
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void C(long positionUs, boolean joining) throws androidx.media2.exoplayer.external.i {
        this.f53326m.flush();
        this.f53318h3 = positionUs;
        this.f53319i3 = true;
        this.f53321j3 = true;
        this.f53323k3 = false;
        this.f53325l3 = false;
        if (this.X != null) {
            P();
        }
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void E() {
        this.f53326m.B();
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void F() {
        e0();
        this.f53326m.pause();
    }

    protected abstract androidx.media2.exoplayer.external.decoder.g<androidx.media2.exoplayer.external.decoder.e, ? extends androidx.media2.exoplayer.external.decoder.h, ? extends f> M(Format format, @p0 androidx.media2.exoplayer.external.drm.t mediaCrypto) throws f;

    protected Format Q() {
        Format format = this.f53334t;
        return Format.r(null, "audio/raw", null, -1, -1, format.Z, format.f53112p0, 2, null, null, 0, null);
    }

    protected void S(int audioSessionId) {
    }

    protected void T() {
    }

    protected void U(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean a() {
        return this.f53325l3 && this.f53326m.a();
    }

    @Override // androidx.media2.exoplayer.external.u0
    public final int b(Format format) {
        if (!androidx.media2.exoplayer.external.util.s.l(format.f53103i)) {
            return 0;
        }
        int iC0 = c0(this.f53320j, format);
        if (iC0 <= 2) {
            return iC0;
        }
        return iC0 | (q0.f57626a >= 21 ? 32 : 0) | 8;
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public m0 c() {
        return this.f53326m.c();
    }

    protected abstract int c0(@p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.t> drmSessionManager, Format format);

    protected final boolean d0(int channelCount, int encoding) {
        return this.f53326m.q(channelCount, encoding);
    }

    @Override // androidx.media2.exoplayer.external.t0
    public void g(long positionUs, long elapsedRealtimeUs) throws androidx.media2.exoplayer.external.i {
        if (this.f53325l3) {
            try {
                this.f53326m.k();
                return;
            } catch (s.d e10) {
                throw androidx.media2.exoplayer.external.i.c(e10, j());
            }
        }
        if (this.f53334t == null) {
            this.f53329o.o();
            int iH = H(this.f53328n, this.f53329o, true);
            if (iH != -5) {
                if (iH == -4) {
                    androidx.media2.exoplayer.external.util.a.i(this.f53329o.t());
                    this.f53323k3 = true;
                    X();
                    return;
                }
                return;
            }
            V(this.f53328n);
        }
        R();
        if (this.X != null) {
            try {
                l0.a("drainAndFeed");
                while (N()) {
                }
                while (O()) {
                }
                l0.c();
                this.f53333s.a();
            } catch (f | s.a | s.b | s.d e11) {
                throw androidx.media2.exoplayer.external.i.c(e11, j());
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.b, androidx.media2.exoplayer.external.q0.b
    public void i(int messageType, @p0 Object message) throws androidx.media2.exoplayer.external.i {
        if (messageType == 2) {
            this.f53326m.f(((Float) message).floatValue());
            return;
        }
        if (messageType == 3) {
            this.f53326m.o((androidx.media2.exoplayer.external.audio.c) message);
        } else if (messageType != 5) {
            super.i(messageType, message);
        } else {
            this.f53326m.h((v) message);
        }
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean isReady() {
        if (!this.f53326m.j()) {
            if (this.f53334t == null || this.f53327m3) {
                return false;
            }
            if (!n() && this.Z == null) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public long k() {
        if (getState() == 2) {
            e0();
        }
        return this.f53318h3;
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void o() {
        this.f53334t = null;
        this.f53317g3 = true;
        this.f53327m3 = false;
        try {
            a0(null);
            Y();
            this.f53326m.reset();
            this.f53324l.d(this.f53333s);
        } catch (Throwable th2) {
            this.f53324l.d(this.f53333s);
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.b, androidx.media2.exoplayer.external.t0
    public androidx.media2.exoplayer.external.util.r u() {
        return this;
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public void w(m0 playbackParameters) {
        this.f53326m.w(playbackParameters);
    }

    public e0(@p0 Handler eventHandler, @p0 r eventListener, j... audioProcessors) {
        this(eventHandler, eventListener, null, null, false, audioProcessors);
    }

    public e0(@p0 Handler eventHandler, @p0 r eventListener, @p0 d audioCapabilities) {
        this(eventHandler, eventListener, audioCapabilities, null, false, new j[0]);
    }

    public e0(@p0 Handler eventHandler, @p0 r eventListener, @p0 d audioCapabilities, @p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.t> drmSessionManager, boolean playClearSamplesWithoutKeys, j... audioProcessors) {
        this(eventHandler, eventListener, drmSessionManager, playClearSamplesWithoutKeys, new y(audioCapabilities, audioProcessors));
    }

    public e0(@p0 Handler eventHandler, @p0 r eventListener, @p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.t> drmSessionManager, boolean playClearSamplesWithoutKeys, s audioSink) {
        super(1);
        this.f53320j = drmSessionManager;
        this.f53322k = playClearSamplesWithoutKeys;
        this.f53324l = new r.a(eventHandler, eventListener);
        this.f53326m = audioSink;
        audioSink.s(new b());
        this.f53328n = new androidx.media2.exoplayer.external.d0();
        this.f53329o = androidx.media2.exoplayer.external.decoder.e.I();
        this.H1 = 0;
        this.f53317g3 = true;
    }
}
