package androidx.media2.exoplayer.external.video;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.d0;
import androidx.media2.exoplayer.external.util.j0;
import androidx.media2.exoplayer.external.util.l0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media3.exoplayer.audio.s0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class e extends androidx.media2.exoplayer.external.b {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f57789w3 = 0;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final int f57790x3 = 1;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final int f57791y3 = 2;

    @p0
    private androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> H1;
    private Format X;
    private androidx.media2.exoplayer.external.decoder.g<g, ? extends h, ? extends f> Y;
    private g Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f57792g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f57793h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private long f57794i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f57795j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private long f57796j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f57797k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f57798k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f57799l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f57800l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u.a f57801m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f57802m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f57803n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private int f57804n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j0<Format> f57805o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private int f57806o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private h f57807p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> f57808p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f57809p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private long f57810p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private int f57811q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private int f57812r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.decoder.e f57813s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f57814s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.t> f57815t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private long f57816t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private long f57817u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Format f57818v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    protected androidx.media2.exoplayer.external.decoder.d f57819v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Format f57820w;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface a {
    }

    protected e(long allowedJoiningTimeMs, @p0 Handler eventHandler, @p0 u eventListener, int maxDroppedFramesToNotify, @p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.t> drmSessionManager, boolean playClearSamplesWithoutKeys) {
        super(2);
        this.f57795j = allowedJoiningTimeMs;
        this.f57797k = maxDroppedFramesToNotify;
        this.f57815t = drmSessionManager;
        this.f57799l = playClearSamplesWithoutKeys;
        this.f57796j3 = -9223372036854775807L;
        M();
        this.f57803n = new d0();
        this.f57805o = new j0<>();
        this.f57813s = androidx.media2.exoplayer.external.decoder.e.I();
        this.f57801m = new u.a(eventHandler, eventListener);
        this.f57809p2 = 0;
    }

    private void L() {
        this.f57793h3 = false;
    }

    private void M() {
        this.f57804n3 = -1;
        this.f57806o3 = -1;
    }

    private boolean P(long positionUs, long elapsedRealtimeUs) throws androidx.media2.exoplayer.external.i, f {
        if (this.f57807p0 == null) {
            h hVarO = O();
            this.f57807p0 = hVarO;
            if (hVarO == null) {
                return false;
            }
            androidx.media2.exoplayer.external.decoder.d dVar = this.f57819v3;
            int i10 = dVar.f53781f;
            int i11 = hVarO.f53794c;
            dVar.f53781f = i10 + i11;
            this.f57814s3 -= i11;
        }
        if (!this.f57807p0.t()) {
            boolean zL0 = l0(positionUs, elapsedRealtimeUs);
            if (zL0) {
                j0(this.f57807p0.f53793b);
                K();
            }
            return zL0;
        }
        if (this.f57809p2 == 2) {
            m0();
            X();
        } else {
            this.f57807p0.x();
            K();
            this.f57802m3 = true;
        }
        return false;
    }

    private boolean R() throws Exception {
        androidx.media2.exoplayer.external.decoder.g<g, ? extends h, ? extends f> gVar = this.Y;
        if (gVar != null && this.f57809p2 != 2 && !this.f57800l3) {
            if (this.Z == null) {
                g gVar2 = (g) gVar.c();
                this.Z = gVar2;
                if (gVar2 == null) {
                    return false;
                }
            }
            if (this.f57809p2 == 1) {
                this.Z.w(4);
                this.Y.b(this.Z);
                this.Z = null;
                this.f57809p2 = 2;
                return false;
            }
            int iH = this.f57798k3 ? -4 : H(this.f57803n, this.Z, false);
            if (iH == -3) {
                return false;
            }
            if (iH == -5) {
                f0(this.f57803n);
                return true;
            }
            if (this.Z.t()) {
                this.f57800l3 = true;
                this.Y.b(this.Z);
                this.Z = null;
                return false;
            }
            boolean zU0 = u0(this.Z.E());
            this.f57798k3 = zU0;
            if (zU0) {
                return false;
            }
            Format format = this.f57820w;
            if (format != null) {
                this.f57805o.a(this.Z.f53790d, format);
                this.f57820w = null;
            }
            this.Z.D();
            g gVar3 = this.Z;
            gVar3.f57821j = this.f57818v.Y;
            k0(gVar3);
            this.Y.b(this.Z);
            this.f57814s3++;
            this.f57792g3 = true;
            this.f57819v3.f53778c++;
            this.Z = null;
            return true;
        }
        return false;
    }

    private static boolean U(long earlyUs) {
        return earlyUs < -30000;
    }

    private static boolean V(long earlyUs) {
        return earlyUs < -500000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r10.f57808p1.T() == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X() throws androidx.media2.exoplayer.external.i {
        /*
            r10 = this;
            androidx.media2.exoplayer.external.decoder.g<androidx.media2.exoplayer.external.video.g, ? extends androidx.media2.exoplayer.external.video.h, ? extends androidx.media2.exoplayer.external.video.f> r0 = r10.Y
            if (r0 == 0) goto L5
            goto L1e
        L5:
            androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> r0 = r10.H1
            r10.o0(r0)
            androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> r0 = r10.f57808p1
            if (r0 == 0) goto L20
            androidx.media2.exoplayer.external.drm.t r0 = r0.W()
            if (r0 != 0) goto L21
            androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> r1 = r10.f57808p1
            r9 = 2
            androidx.media2.exoplayer.external.drm.p$a r1 = r1.T()
            if (r1 == 0) goto L1e
            goto L21
        L1e:
            r9 = 5
            return
        L20:
            r0 = 0
        L21:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: androidx.media2.exoplayer.external.video.f -> L4e
            r9 = 7
            androidx.media2.exoplayer.external.Format r3 = r10.f57818v     // Catch: androidx.media2.exoplayer.external.video.f -> L4e
            androidx.media2.exoplayer.external.decoder.g r0 = r10.N(r3, r0)     // Catch: androidx.media2.exoplayer.external.video.f -> L4e
            r9 = 2
            r10.Y = r0     // Catch: androidx.media2.exoplayer.external.video.f -> L4e
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: androidx.media2.exoplayer.external.video.f -> L4e
            androidx.media2.exoplayer.external.decoder.g<androidx.media2.exoplayer.external.video.g, ? extends androidx.media2.exoplayer.external.video.h, ? extends androidx.media2.exoplayer.external.video.f> r0 = r10.Y     // Catch: androidx.media2.exoplayer.external.video.f -> L4e
            java.lang.String r4 = r0.getName()     // Catch: androidx.media2.exoplayer.external.video.f -> L4e
            long r7 = r5 - r1
            r3 = r10
            r3.d0(r4, r5, r7)     // Catch: androidx.media2.exoplayer.external.video.f -> L4a
            androidx.media2.exoplayer.external.decoder.d r10 = r3.f57819v3     // Catch: androidx.media2.exoplayer.external.video.f -> L4a
            int r0 = r10.f53776a     // Catch: androidx.media2.exoplayer.external.video.f -> L4a
            int r0 = r0 + 1
            r9 = 1
            r10.f53776a = r0     // Catch: androidx.media2.exoplayer.external.video.f -> L4a
            r9 = 4
            return
        L4a:
            r0 = move-exception
        L4b:
            r10 = r0
            r9 = 3
            goto L52
        L4e:
            r0 = move-exception
            r3 = r10
            r9 = 7
            goto L4b
        L52:
            int r0 = r3.j()
            androidx.media2.exoplayer.external.i r10 = androidx.media2.exoplayer.external.i.c(r10, r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.video.e.X():void");
    }

    private void Y() {
        if (this.f57811q3 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f57801m.c(this.f57811q3, jElapsedRealtime - this.f57810p3);
            this.f57811q3 = 0;
            this.f57810p3 = jElapsedRealtime;
        }
    }

    private void Z(Surface surface) {
        if (this.f57793h3) {
            return;
        }
        this.f57793h3 = true;
        this.f57801m.m(surface);
    }

    private void b0(Surface surface) {
        if (this.f57793h3) {
            this.f57801m.m(surface);
        }
    }

    private void c0() {
        int i10 = this.f57804n3;
        if (i10 == -1 && this.f57806o3 == -1) {
            return;
        }
        this.f57801m.n(i10, this.f57806o3, 0, 1.0f);
    }

    private boolean l0(long positionUs, long elapsedRealtimeUs) throws androidx.media2.exoplayer.external.i, f {
        if (this.f57794i3 == -9223372036854775807L) {
            this.f57794i3 = positionUs;
        }
        long j10 = this.f57807p0.f53793b - positionUs;
        if (!T()) {
            if (!U(j10)) {
                return false;
            }
            v0(this.f57807p0);
            return true;
        }
        long j11 = this.f57807p0.f53793b - this.f57817u3;
        Format formatI = this.f57805o.i(j11);
        if (formatI != null) {
            this.X = formatI;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z10 = getState() == 2;
        if (!this.f57793h3 || (z10 && t0(j10, jElapsedRealtime - this.f57816t3))) {
            this.f57816t3 = SystemClock.elapsedRealtime() * 1000;
            n0(j11, this.X);
            return true;
        }
        if (!z10 || positionUs == this.f57794i3 || (r0(j10, elapsedRealtimeUs) && W(positionUs))) {
            return false;
        }
        if (s0(j10, elapsedRealtimeUs)) {
            Q(this.f57807p0);
            return true;
        }
        if (j10 < 30000) {
            this.f57816t3 = SystemClock.elapsedRealtime() * 1000;
            n0(j11, this.X);
            return true;
        }
        return false;
    }

    private void o0(@p0 androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> session) {
        androidx.media2.exoplayer.external.drm.o.a(this.f57808p1, session);
        this.f57808p1 = session;
    }

    private void p0() {
        this.f57796j3 = this.f57795j > 0 ? SystemClock.elapsedRealtime() + this.f57795j : -9223372036854775807L;
    }

    private void q0(@p0 androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> session) {
        androidx.media2.exoplayer.external.drm.o.a(this.H1, session);
        this.H1 = session;
    }

    private boolean u0(boolean bufferEncrypted) throws androidx.media2.exoplayer.external.i {
        androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> pVar = this.f57808p1;
        if (pVar == null || (!bufferEncrypted && this.f57799l)) {
            return false;
        }
        int state = pVar.getState();
        if (state != 1) {
            return state != 4;
        }
        throw androidx.media2.exoplayer.external.i.c(this.f57808p1.T(), j());
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void B(boolean joining) throws androidx.media2.exoplayer.external.i {
        androidx.media2.exoplayer.external.decoder.d dVar = new androidx.media2.exoplayer.external.decoder.d();
        this.f57819v3 = dVar;
        this.f57801m.d(dVar);
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void C(long positionUs, boolean joining) throws androidx.media2.exoplayer.external.i {
        this.f57800l3 = false;
        this.f57802m3 = false;
        L();
        this.f57794i3 = -9223372036854775807L;
        this.f57812r3 = 0;
        if (this.Y != null) {
            S();
        }
        if (joining) {
            p0();
        } else {
            this.f57796j3 = -9223372036854775807L;
        }
        this.f57805o.c();
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void E() {
        this.f57811q3 = 0;
        this.f57810p3 = SystemClock.elapsedRealtime();
        this.f57816t3 = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void F() {
        this.f57796j3 = -9223372036854775807L;
        Y();
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void G(Format[] formats, long offsetUs) throws androidx.media2.exoplayer.external.i {
        this.f57817u3 = offsetUs;
        super.G(formats, offsetUs);
    }

    protected void K() {
        this.f57807p0 = null;
    }

    protected abstract androidx.media2.exoplayer.external.decoder.g<g, ? extends h, ? extends f> N(Format format, @p0 androidx.media2.exoplayer.external.drm.t mediaCrypto) throws f;

    @p0
    protected abstract h O() throws f;

    protected void Q(h outputBuffer) {
        x0(1);
        outputBuffer.x();
    }

    @androidx.annotation.i
    protected void S() throws androidx.media2.exoplayer.external.i {
        this.f57798k3 = false;
        this.f57814s3 = 0;
        if (this.f57809p2 != 0) {
            m0();
            X();
            return;
        }
        this.Z = null;
        h hVar = this.f57807p0;
        if (hVar != null) {
            hVar.x();
            K();
        }
        this.Y.flush();
        this.f57792g3 = false;
    }

    protected abstract boolean T();

    protected boolean W(long positionUs) throws androidx.media2.exoplayer.external.i {
        int I = I(positionUs);
        if (I == 0) {
            return false;
        }
        this.f57819v3.f53784i++;
        x0(this.f57814s3 + I);
        S();
        return true;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean a() {
        return this.f57802m3;
    }

    protected final void a0(int width, int height) {
        if (this.f57804n3 == width && this.f57806o3 == height) {
            return;
        }
        this.f57804n3 = width;
        this.f57806o3 = height;
        this.f57801m.n(width, height, 0, 1.0f);
    }

    @Override // androidx.media2.exoplayer.external.u0
    public final int b(Format format) {
        return w0(this.f57815t, format);
    }

    @androidx.annotation.i
    protected void d0(String name, long initializedTimestampMs, long initializationDurationMs) {
        this.f57801m.a(name, initializedTimestampMs, initializationDurationMs);
    }

    protected final void e0(Surface surface) {
        this.f57812r3 = 0;
        this.f57819v3.f53780e++;
        Z(surface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.i
    protected void f0(d0 formatHolder) throws androidx.media2.exoplayer.external.i {
        Format format = this.f57818v;
        Format format2 = formatHolder.f53762c;
        this.f57818v = format2;
        this.f57820w = format2;
        if (!q0.b(format2.f53108l, format == null ? null : format.f53108l)) {
            if (this.f57818v.f53108l == null) {
                q0(null);
            } else if (formatHolder.f53760a) {
                q0(formatHolder.f53761b);
            } else {
                androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.t> rVar = this.f57815t;
                if (rVar == null) {
                    throw androidx.media2.exoplayer.external.i.c(new IllegalStateException("Media requires a DrmSessionManager"), j());
                }
                androidx.media2.exoplayer.external.drm.p<T> pVarD = rVar.d(Looper.myLooper(), this.f57818v.f53108l);
                androidx.media2.exoplayer.external.drm.p<androidx.media2.exoplayer.external.drm.t> pVar = this.H1;
                if (pVar != null) {
                    pVar.X();
                }
                this.H1 = pVarD;
            }
        }
        if (this.H1 != this.f57808p1) {
            if (this.f57792g3) {
                this.f57809p2 = 1;
            } else {
                m0();
                X();
            }
        }
        this.f57801m.e(this.f57818v);
    }

    @Override // androidx.media2.exoplayer.external.t0
    public void g(long positionUs, long elapsedRealtimeUs) throws androidx.media2.exoplayer.external.i {
        if (this.f57802m3) {
            return;
        }
        if (this.f57818v == null) {
            this.f57813s.o();
            int iH = H(this.f57803n, this.f57813s, true);
            if (iH != -5) {
                if (iH == -4) {
                    androidx.media2.exoplayer.external.util.a.i(this.f57813s.t());
                    this.f57800l3 = true;
                    this.f57802m3 = true;
                    return;
                }
                return;
            }
            f0(this.f57803n);
        }
        X();
        if (this.Y != null) {
            try {
                l0.a("drainAndFeed");
                while (P(positionUs, elapsedRealtimeUs)) {
                }
                while (R()) {
                }
                l0.c();
                this.f57819v3.a();
            } catch (f e10) {
                throw androidx.media2.exoplayer.external.i.c(e10, j());
            }
        }
    }

    protected final void g0() {
        c0();
        L();
        if (getState() == 2) {
            p0();
        }
    }

    protected final void h0() {
        M();
        L();
    }

    protected final void i0(Surface surface) {
        c0();
        b0(surface);
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean isReady() {
        if (this.f57798k3) {
            return false;
        }
        if (this.f57818v != null && ((n() || this.f57807p0 != null) && (this.f57793h3 || !T()))) {
            this.f57796j3 = -9223372036854775807L;
            return true;
        }
        if (this.f57796j3 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f57796j3) {
            return true;
        }
        this.f57796j3 = -9223372036854775807L;
        return false;
    }

    @androidx.annotation.i
    protected void j0(long presentationTimeUs) {
        this.f57814s3--;
    }

    protected void k0(g buffer) {
    }

    @androidx.annotation.i
    protected void m0() {
        this.Z = null;
        K();
        this.f57809p2 = 0;
        this.f57792g3 = false;
        this.f57814s3 = 0;
        androidx.media2.exoplayer.external.decoder.g<g, ? extends h, ? extends f> gVar = this.Y;
        if (gVar != null) {
            gVar.release();
            this.Y = null;
            this.f57819v3.f53777b++;
        }
        o0(null);
    }

    protected abstract void n0(long presentationTimeUs, Format outputFormat) throws f;

    @Override // androidx.media2.exoplayer.external.b
    protected void o() {
        this.f57818v = null;
        this.f57798k3 = false;
        M();
        L();
        try {
            q0(null);
            m0();
        } finally {
            this.f57801m.b(this.f57819v3);
        }
    }

    protected boolean r0(long earlyUs, long elapsedRealtimeUs) {
        return V(earlyUs);
    }

    protected boolean s0(long earlyUs, long elapsedRealtimeUs) {
        return U(earlyUs);
    }

    protected boolean t0(long earlyUs, long elapsedSinceLastRenderUs) {
        return U(earlyUs) && elapsedSinceLastRenderUs > s0.f63372z;
    }

    protected void v0(h outputBuffer) {
        this.f57819v3.f53781f++;
        outputBuffer.x();
    }

    protected abstract int w0(@p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.t> drmSessionManager, Format format);

    protected void x0(int droppedBufferCount) {
        androidx.media2.exoplayer.external.decoder.d dVar = this.f57819v3;
        dVar.f53782g += droppedBufferCount;
        this.f57811q3 += droppedBufferCount;
        int i10 = this.f57812r3 + droppedBufferCount;
        this.f57812r3 = i10;
        dVar.f53783h = Math.max(i10, dVar.f53783h);
        int i11 = this.f57797k;
        if (i11 <= 0 || this.f57811q3 < i11) {
            return;
        }
        Y();
    }
}
