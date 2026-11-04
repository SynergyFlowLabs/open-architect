package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z0;
import androidx.media3.common.y0;
import androidx.media3.decoder.e;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.u3;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class c0<T extends androidx.media3.decoder.e<androidx.media3.decoder.g, ? extends androidx.media3.decoder.k, ? extends androidx.media3.decoder.f>> extends androidx.media3.exoplayer.i implements u3 {
    private static final int A3 = 0;
    private static final int B3 = 1;
    private static final int C3 = 2;
    private static final int D3 = 10;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final String f63152z3 = "DecoderAudioRenderer";
    private boolean H1;
    private final androidx.media3.decoder.g X;
    private androidx.media3.exoplayer.j Y;
    private androidx.media3.common.w Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.decoder.g f63153g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.decoder.k f63154h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.drm.m f63155i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.drm.m f63156j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f63157k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f63158l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f63159m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private long f63160n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private boolean f63161o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f63162p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f63163p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @androidx.annotation.p0
    private T f63164p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f63165p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f63166q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private long f63167r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final long[] f63168s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private int f63169t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f63170u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final w.a f63171v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f63172v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final x f63173w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private long f63174w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private long f63175x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private long f63176y3;

    @androidx.annotation.w0(23)
    private static final class b {
        private b() {
        }

        public static void a(x xVar, @androidx.annotation.p0 Object obj) {
            xVar.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    private final class c implements x.d {
        private c() {
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void a(long j10) {
            c0.this.f63171v.v(j10);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void b(int i10, long j10, long j11) {
            c0.this.f63171v.x(i10, j10, j11);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void c() {
            c0.this.E0();
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void d() {
            c0.this.f63170u3 = true;
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void e(x.a aVar) {
            c0.this.f63171v.o(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void f(x.a aVar) {
            c0.this.f63171v.p(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void g(boolean z10) {
            c0.this.f63171v.w(z10);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void h(Exception exc) {
            androidx.media3.common.util.z.e(c0.f63152z3, "Audio sink error", exc);
            c0.this.f63171v.n(exc);
        }
    }

    public c0() {
        this((Handler) null, (w) null, new androidx.media3.common.audio.g[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r13.f63155i3.T() == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C0() throws androidx.media3.exoplayer.s0 {
        /*
            r13 = this;
            java.lang.String r12 = "Androeed.ru"
            T extends androidx.media3.decoder.e<androidx.media3.decoder.g, ? extends androidx.media3.decoder.k, ? extends androidx.media3.decoder.f> r0 = r13.f63164p2
            r12 = 0
            if (r0 == 0) goto L9
            r12 = 3
            goto L23
        L9:
            r12 = 3
            androidx.media3.exoplayer.drm.m r0 = r13.f63156j3
            r13.I0(r0)
            androidx.media3.exoplayer.drm.m r0 = r13.f63155i3
            if (r0 == 0) goto L25
            androidx.media3.decoder.b r0 = r0.c()
            if (r0 != 0) goto L26
            androidx.media3.exoplayer.drm.m r1 = r13.f63155i3
            androidx.media3.exoplayer.drm.m$a r1 = r1.T()
            r12 = 2
            if (r1 == 0) goto L23
            goto L26
        L23:
            r12 = 5
            return
        L25:
            r0 = 0
        L26:
            r1 = 4001(0xfa1, float:5.607E-42)
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            java.lang.String r4 = "createAudioDecoder"
            androidx.media3.common.util.z0.a(r4)     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            androidx.media3.common.w r4 = r13.Z     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            androidx.media3.decoder.e r0 = r13.v0(r4, r0)     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            r12 = 4
            r13.f63164p2 = r0     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            long r4 = r13.Y()     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            r12 = 1
            r0.e(r4)     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            r12 = 0
            androidx.media3.common.util.z0.b()     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            androidx.media3.exoplayer.audio.w$a r6 = r13.f63171v     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            T extends androidx.media3.decoder.e<androidx.media3.decoder.g, ? extends androidx.media3.decoder.k, ? extends androidx.media3.decoder.f> r0 = r13.f63164p2     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            java.lang.String r7 = r0.getName()     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            long r10 = r8 - r2
            r6.q(r7, r8, r10)     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            androidx.media3.exoplayer.j r0 = r13.Y     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            int r2 = r0.f63908a     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            r12 = 6
            int r2 = r2 + 1
            r12 = 0
            r0.f63908a = r2     // Catch: java.lang.OutOfMemoryError -> L62 androidx.media3.decoder.f -> L64
            return
        L62:
            r0 = move-exception
            goto L67
        L64:
            r0 = move-exception
            r12 = 1
            goto L6f
        L67:
            r12 = 3
            androidx.media3.common.w r2 = r13.Z
            androidx.media3.exoplayer.s0 r13 = r13.S(r0, r2, r1)
            throw r13
        L6f:
            java.lang.String r2 = "ddsieneAerDercdoRoue"
            java.lang.String r2 = "DecoderAudioRenderer"
            r12 = 6
            java.lang.String r3 = "Audio codec error"
            androidx.media3.common.util.z.e(r2, r3, r0)
            r12 = 6
            androidx.media3.exoplayer.audio.w$a r2 = r13.f63171v
            r12 = 6
            r2.m(r0)
            r12 = 6
            androidx.media3.common.w r2 = r13.Z
            androidx.media3.exoplayer.s0 r13 = r13.S(r0, r2, r1)
            r12 = 1
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.c0.C0():void");
    }

    private void D0(p3 p3Var) throws androidx.media3.exoplayer.s0 {
        androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(p3Var.f64600b);
        K0(p3Var.f64599a);
        androidx.media3.common.w wVar2 = this.Z;
        this.Z = wVar;
        this.f63162p0 = wVar.H;
        this.f63163p1 = wVar.I;
        T t10 = this.f63164p2;
        if (t10 == null) {
            C0();
            this.f63171v.u(this.Z, null);
            return;
        }
        androidx.media3.exoplayer.k kVar = this.f63156j3 != this.f63155i3 ? new androidx.media3.exoplayer.k(t10.getName(), wVar2, wVar, 0, 128) : u0(t10.getName(), wVar2, wVar);
        if (kVar.f63950d == 0) {
            if (this.f63158l3) {
                this.f63157k3 = 1;
            } else {
                H0();
                C0();
                this.f63159m3 = true;
            }
        }
        this.f63171v.u(this.Z, kVar);
    }

    private void F0() throws x.h {
        this.f63166q3 = true;
        this.f63173w.k();
        this.f63176y3 = this.f63175x3;
    }

    private void G0() {
        this.f63173w.m();
        if (this.f63169t3 != 0) {
            J0(this.f63168s3[0]);
            boolean z10 = true & true;
            int i10 = this.f63169t3 - 1;
            this.f63169t3 = i10;
            long[] jArr = this.f63168s3;
            System.arraycopy(jArr, 1, jArr, 0, i10);
        }
    }

    private void H0() {
        this.f63153g3 = null;
        this.f63154h3 = null;
        this.f63157k3 = 0;
        this.f63158l3 = false;
        this.f63174w3 = -9223372036854775807L;
        this.f63175x3 = -9223372036854775807L;
        T t10 = this.f63164p2;
        if (t10 != null) {
            this.Y.f63909b++;
            t10.release();
            this.f63171v.r(this.f63164p2.getName());
            this.f63164p2 = null;
        }
        I0(null);
    }

    private void I0(@androidx.annotation.p0 androidx.media3.exoplayer.drm.m mVar) {
        androidx.media3.exoplayer.drm.m.b(this.f63155i3, mVar);
        this.f63155i3 = mVar;
    }

    private void J0(long j10) {
        this.f63167r3 = j10;
        if (j10 != -9223372036854775807L) {
            this.f63173w.z(j10);
        }
    }

    private void K0(@androidx.annotation.p0 androidx.media3.exoplayer.drm.m mVar) {
        androidx.media3.exoplayer.drm.m.b(this.f63156j3, mVar);
        this.f63156j3 = mVar;
    }

    private void N0() {
        long jL = this.f63173w.l(a());
        if (jL != Long.MIN_VALUE) {
            if (!this.f63161o3) {
                jL = Math.max(this.f63160n3, jL);
            }
            this.f63160n3 = jL;
            this.f63161o3 = false;
        }
    }

    private boolean w0() throws androidx.media3.decoder.f, x.b, androidx.media3.exoplayer.s0, x.c, x.h {
        if (this.f63154h3 == null) {
            androidx.media3.decoder.k kVar = (androidx.media3.decoder.k) this.f63164p2.a();
            this.f63154h3 = kVar;
            if (kVar == null) {
                return false;
            }
            int i10 = kVar.f62709c;
            if (i10 > 0) {
                this.Y.f63913f += i10;
                this.f63173w.m();
            }
            if (this.f63154h3.t()) {
                G0();
            }
        }
        if (this.f63154h3.s()) {
            if (this.f63157k3 == 2) {
                H0();
                C0();
                this.f63159m3 = true;
            } else {
                this.f63154h3.D();
                this.f63154h3 = null;
                try {
                    F0();
                } catch (x.h e10) {
                    throw T(e10, e10.f63453c, e10.f63452b, androidx.media3.common.x0.f61847w3);
                }
            }
            return false;
        }
        this.f63176y3 = -9223372036854775807L;
        if (this.f63159m3) {
            this.f63173w.p(A0(this.f63164p2).b().Z(this.f63162p0).a0(this.f63163p1).n0(this.Z.f61758l).X(this.Z.f61759m).f0(this.Z.f61747a).h0(this.Z.f61748b).i0(this.Z.f61749c).j0(this.Z.f61750d).w0(this.Z.f61751e).s0(this.Z.f61752f).N(), 0, z0(this.f63164p2));
            this.f63159m3 = false;
        }
        x xVar = this.f63173w;
        androidx.media3.decoder.k kVar2 = this.f63154h3;
        if (!xVar.w(kVar2.f62727f, kVar2.f62708b, 1)) {
            this.f63176y3 = this.f63154h3.f62708b;
            return false;
        }
        this.Y.f63912e++;
        this.f63154h3.D();
        this.f63154h3 = null;
        return true;
    }

    private boolean x0() throws androidx.media3.decoder.f, androidx.media3.exoplayer.s0 {
        T t10 = this.f63164p2;
        int i10 = 2 >> 0;
        if (t10 == null || this.f63157k3 == 2 || this.f63165p3) {
            return false;
        }
        if (this.f63153g3 == null) {
            androidx.media3.decoder.g gVar = (androidx.media3.decoder.g) t10.c();
            this.f63153g3 = gVar;
            if (gVar == null) {
                return false;
            }
        }
        if (this.f63157k3 == 1) {
            this.f63153g3.z(4);
            this.f63164p2.b(this.f63153g3);
            this.f63153g3 = null;
            this.f63157k3 = 2;
            return false;
        }
        p3 p3VarW = W();
        int iP0 = p0(p3VarW, this.f63153g3, 0);
        if (iP0 == -5) {
            D0(p3VarW);
            return true;
        }
        if (iP0 != -4) {
            if (iP0 != -3) {
                throw new IllegalStateException();
            }
            if (q()) {
                this.f63175x3 = this.f63174w3;
            }
            return false;
        }
        if (this.f63153g3.s()) {
            this.f63165p3 = true;
            this.f63175x3 = this.f63174w3;
            this.f63164p2.b(this.f63153g3);
            this.f63153g3 = null;
            return false;
        }
        if (!this.H1) {
            this.H1 = true;
            this.f63153g3.c(androidx.media3.common.j.W0);
        }
        this.f63174w3 = this.f63153g3.f62702f;
        if (q() || this.f63153g3.w()) {
            this.f63175x3 = this.f63174w3;
        }
        this.f63153g3.H();
        androidx.media3.decoder.g gVar2 = this.f63153g3;
        gVar2.f62698b = this.Z;
        this.f63164p2.b(gVar2);
        this.f63158l3 = true;
        this.Y.f63910c++;
        this.f63153g3 = null;
        return true;
    }

    private void y0() throws androidx.media3.exoplayer.s0 {
        if (this.f63157k3 != 0) {
            H0();
            C0();
            return;
        }
        this.f63153g3 = null;
        androidx.media3.decoder.k kVar = this.f63154h3;
        if (kVar != null) {
            kVar.D();
            this.f63154h3 = null;
        }
        androidx.media3.decoder.e eVar = (androidx.media3.decoder.e) androidx.media3.common.util.a.g(this.f63164p2);
        eVar.flush();
        eVar.e(Y());
        this.f63158l3 = false;
    }

    @z7.g
    protected abstract androidx.media3.common.w A0(T t10);

    protected final int B0(androidx.media3.common.w wVar) {
        return this.f63173w.s(wVar);
    }

    @androidx.annotation.i
    @z7.g
    protected void E0() {
        this.f63161o3 = true;
    }

    protected final boolean L0(androidx.media3.common.w wVar) {
        return this.f63173w.b(wVar);
    }

    @z7.g
    protected abstract int M0(androidx.media3.common.w wVar);

    @Override // androidx.media3.exoplayer.z4
    public long O(long j10, long j11) {
        long j12 = this.f63176y3;
        if (j12 == -9223372036854775807L) {
            return super.O(j10, j11);
        }
        long jD1 = (long) (((j12 - j10) / (c() != null ? c().f61874a : 1.0f)) / 2.0f);
        if (this.f63172v3) {
            jD1 -= k1.D1(U().b()) - j11;
        }
        return Math.max(10000L, jD1);
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean a() {
        return this.f63166q3 && this.f63173w.a();
    }

    @Override // androidx.media3.exoplayer.a5
    public final int b(androidx.media3.common.w wVar) {
        if (!androidx.media3.common.s0.q(wVar.f61761o)) {
            return a5.M(0);
        }
        int iM0 = M0(wVar);
        return iM0 <= 2 ? a5.M(iM0) : a5.D(iM0, 8, 32);
    }

    @Override // androidx.media3.exoplayer.u3
    public y0 c() {
        return this.f63173w.c();
    }

    @Override // androidx.media3.exoplayer.i
    protected void e0() {
        this.Z = null;
        this.f63159m3 = true;
        J0(-9223372036854775807L);
        this.f63170u3 = false;
        this.f63176y3 = -9223372036854775807L;
        try {
            K0(null);
            H0();
            this.f63173w.reset();
            this.f63171v.s(this.Y);
        } catch (Throwable th2) {
            this.f63171v.s(this.Y);
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.i
    protected void f0(boolean z10, boolean z11) throws androidx.media3.exoplayer.s0 {
        androidx.media3.exoplayer.j jVar = new androidx.media3.exoplayer.j();
        this.Y = jVar;
        this.f63171v.t(jVar);
        if (V().f63544b) {
            this.f63173w.r();
        } else {
            this.f63173w.i();
        }
        this.f63173w.y(Z());
        this.f63173w.u(U());
    }

    @Override // androidx.media3.exoplayer.z4
    public void g(long j10, long j11) throws androidx.media3.exoplayer.s0 {
        if (this.f63166q3) {
            try {
                this.f63173w.k();
                this.f63176y3 = this.f63175x3;
                return;
            } catch (x.h e10) {
                throw T(e10, e10.f63453c, e10.f63452b, androidx.media3.common.x0.f61847w3);
            }
        }
        if (this.Z == null) {
            p3 p3VarW = W();
            this.X.o();
            int i10 = 0 ^ 2;
            int iP0 = p0(p3VarW, this.X, 2);
            if (iP0 != -5) {
                if (iP0 == -4) {
                    androidx.media3.common.util.a.i(this.X.s());
                    this.f63165p3 = true;
                    try {
                        F0();
                        return;
                    } catch (x.h e11) {
                        throw S(e11, null, androidx.media3.common.x0.f61847w3);
                    }
                }
                return;
            }
            D0(p3VarW);
        }
        C0();
        if (this.f63164p2 != null) {
            try {
                z0.a("drainAndFeed");
                while (w0()) {
                }
                while (x0()) {
                }
                z0.b();
                this.Y.c();
            } catch (androidx.media3.decoder.f e12) {
                androidx.media3.common.util.z.e(f63152z3, "Audio codec error", e12);
                this.f63171v.m(e12);
                throw S(e12, this.Z, androidx.media3.common.x0.f61838r3);
            } catch (x.b e13) {
                throw S(e13, e13.f63445a, androidx.media3.common.x0.f61845v3);
            } catch (x.c e14) {
                throw T(e14, e14.f63448c, e14.f63447b, androidx.media3.common.x0.f61845v3);
            } catch (x.h e15) {
                throw T(e15, e15.f63453c, e15.f63452b, androidx.media3.common.x0.f61847w3);
            }
        }
    }

    @Override // androidx.media3.exoplayer.u3
    public void h(y0 y0Var) {
        this.f63173w.h(y0Var);
    }

    @Override // androidx.media3.exoplayer.i
    protected void h0(long j10, boolean z10) throws androidx.media3.exoplayer.s0 {
        this.f63173w.flush();
        this.f63160n3 = j10;
        this.f63176y3 = -9223372036854775807L;
        this.f63170u3 = false;
        this.f63161o3 = true;
        this.f63165p3 = false;
        this.f63166q3 = false;
        if (this.f63164p2 != null) {
            y0();
        }
    }

    @Override // androidx.media3.exoplayer.i, androidx.media3.exoplayer.w4.b
    public void i(int i10, @androidx.annotation.p0 Object obj) throws androidx.media3.exoplayer.s0 {
        if (i10 == 2) {
            this.f63173w.f(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f63173w.d((androidx.media3.common.d) obj);
            return;
        }
        if (i10 == 6) {
            this.f63173w.t((androidx.media3.common.f) obj);
            return;
        }
        if (i10 == 12) {
            if (k1.f61540a >= 23) {
                b.a(this.f63173w, obj);
            }
        } else if (i10 == 9) {
            this.f63173w.t0(((Boolean) obj).booleanValue());
        } else if (i10 != 10) {
            super.i(i10, obj);
        } else {
            this.f63173w.g(((Integer) obj).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean isReady() {
        if (!this.f63173w.j()) {
            if (this.Z == null) {
                return false;
            }
            if (!d0() && this.f63154h3 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.u3
    public long k() {
        if (getState() == 2) {
            N0();
        }
        return this.f63160n3;
    }

    @Override // androidx.media3.exoplayer.i
    protected void l0() {
        this.f63173w.B();
        this.f63172v3 = true;
    }

    @Override // androidx.media3.exoplayer.i
    protected void m0() {
        N0();
        this.f63173w.pause();
        this.f63172v3 = false;
    }

    @Override // androidx.media3.exoplayer.i
    protected void n0(androidx.media3.common.w[] wVarArr, long j10, long j11, androidx.media3.exoplayer.source.t0.b bVar) throws androidx.media3.exoplayer.s0 {
        super.n0(wVarArr, j10, j11, bVar);
        this.H1 = false;
        if (this.f63167r3 == -9223372036854775807L) {
            J0(j11);
            return;
        }
        int i10 = this.f63169t3;
        if (i10 == this.f63168s3.length) {
            androidx.media3.common.util.z.n(f63152z3, "Too many stream changes, so dropping offset: " + this.f63168s3[this.f63169t3 - 1]);
        } else {
            this.f63169t3 = i10 + 1;
        }
        this.f63168s3[this.f63169t3 - 1] = j11;
    }

    @Override // androidx.media3.exoplayer.i, androidx.media3.exoplayer.z4
    @androidx.annotation.p0
    public u3 u() {
        return this;
    }

    @z7.g
    protected androidx.media3.exoplayer.k u0(String str, androidx.media3.common.w wVar, androidx.media3.common.w wVar2) {
        return new androidx.media3.exoplayer.k(str, wVar, wVar2, 0, 1);
    }

    @z7.g
    protected abstract T v0(androidx.media3.common.w wVar, @androidx.annotation.p0 androidx.media3.decoder.b bVar) throws androidx.media3.decoder.f;

    @Override // androidx.media3.exoplayer.u3
    public boolean w() {
        boolean z10 = this.f63170u3;
        this.f63170u3 = false;
        return z10;
    }

    @androidx.annotation.p0
    @z7.g
    protected int[] z0(T t10) {
        return null;
    }

    public c0(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar, androidx.media3.common.audio.g... gVarArr) {
        this(handler, wVar, null, gVarArr);
    }

    public c0(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar, e eVar, androidx.media3.common.audio.g... gVarArr) {
        this(handler, wVar, new j0.h().k((e) com.google.common.base.b0.a(eVar, e.f63183e)).n(gVarArr).j());
    }

    public c0(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar, x xVar) {
        super(1);
        this.f63171v = new w.a(handler, wVar);
        this.f63173w = xVar;
        xVar.n(new c());
        this.X = androidx.media3.decoder.g.L();
        this.f63157k3 = 0;
        this.f63159m3 = true;
        J0(-9223372036854775807L);
        this.f63168s3 = new long[10];
        this.f63174w3 = -9223372036854775807L;
        this.f63175x3 = -9223372036854775807L;
        this.f63176y3 = -9223372036854775807L;
    }
}
