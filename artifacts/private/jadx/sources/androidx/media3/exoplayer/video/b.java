package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.media3.common.n4;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.v0;
import androidx.media3.common.util.z0;
import androidx.media3.common.x0;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.s0;
import androidx.media3.exoplayer.source.t0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class b extends androidx.media3.exoplayer.i {
    private static final String D3 = "DecoderVideoRenderer";
    private static final int E3 = 0;
    private static final int F3 = 1;
    private static final int G3 = 2;
    private int A3;
    private long B3;
    protected androidx.media3.exoplayer.j C3;

    @p0
    private androidx.media3.decoder.e<androidx.media3.decoder.g, ? extends androidx.media3.decoder.l, ? extends androidx.media3.decoder.f> H1;
    private final l0.a X;
    private final v0<androidx.media3.common.w> Y;
    private final androidx.media3.decoder.g Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @p0
    private androidx.media3.decoder.l f66253g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f66254h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @p0
    private Object f66255i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @p0
    private Surface f66256j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @p0
    private v f66257k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @p0
    private w f66258l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @p0
    private androidx.media3.exoplayer.drm.m f66259m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @p0
    private androidx.media3.exoplayer.drm.m f66260n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private int f66261o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @p0
    private androidx.media3.common.w f66262p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private androidx.media3.common.w f66263p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @p0
    private androidx.media3.decoder.g f66264p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f66265p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private int f66266q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private long f66267r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private long f66268s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f66269t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f66270u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f66271v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f66272v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f66273w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @p0
    private n4 f66274w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private long f66275x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private int f66276y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private int f66277z3;

    protected b(long j10, @p0 Handler handler, @p0 l0 l0Var, int i10) {
        super(2);
        this.f66271v = j10;
        this.f66273w = i10;
        this.f66268s3 = -9223372036854775807L;
        this.Y = new v0<>();
        this.Z = androidx.media3.decoder.g.L();
        this.X = new l0.a(handler, l0Var);
        this.f66261o3 = 0;
        this.f66254h3 = -1;
        this.f66266q3 = 0;
        this.C3 = new androidx.media3.exoplayer.j();
    }

    private static boolean A0(long j10) {
        return j10 < -500000;
    }

    private void B0(int i10) {
        this.f66266q3 = Math.min(this.f66266q3, i10);
    }

    private void D0() throws s0 {
        androidx.media3.decoder.b bVarC;
        if (this.H1 != null) {
            return;
        }
        T0(this.f66260n3);
        androidx.media3.exoplayer.drm.m mVar = this.f66259m3;
        if (mVar != null) {
            bVarC = mVar.c();
            if (bVarC == null && this.f66259m3.T() == null) {
                return;
            }
        } else {
            bVarC = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            androidx.media3.decoder.e<androidx.media3.decoder.g, ? extends androidx.media3.decoder.l, ? extends androidx.media3.decoder.f> eVarT0 = t0((androidx.media3.common.w) androidx.media3.common.util.a.g(this.f66262p0), bVarC);
            this.H1 = eVarT0;
            eVarT0.e(Y());
            U0(this.f66254h3);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.X.k(((androidx.media3.decoder.e) androidx.media3.common.util.a.g(this.H1)).getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.C3.f63908a++;
        } catch (androidx.media3.decoder.f e10) {
            androidx.media3.common.util.z.e(D3, "Video codec error", e10);
            this.X.s(e10);
            throw S(e10, this.f66262p0, x0.f61836p3);
        } catch (OutOfMemoryError e11) {
            throw S(e11, this.f66262p0, x0.f61836p3);
        }
    }

    private void E0() {
        if (this.f66276y3 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.X.n(this.f66276y3, jElapsedRealtime - this.f66275x3);
            this.f66276y3 = 0;
            this.f66275x3 = jElapsedRealtime;
        }
    }

    private void F0() {
        if (this.f66266q3 != 3) {
            this.f66266q3 = 3;
            Object obj = this.f66255i3;
            if (obj != null) {
                this.X.q(obj);
            }
        }
    }

    private void G0(int i10, int i11) {
        n4 n4Var = this.f66274w3;
        if (n4Var != null && n4Var.f60997a == i10 && n4Var.f60998b == i11) {
            return;
        }
        n4 n4Var2 = new n4(i10, i11);
        this.f66274w3 = n4Var2;
        this.X.t(n4Var2);
    }

    private void H0() {
        Object obj;
        if (this.f66266q3 != 3 || (obj = this.f66255i3) == null) {
            return;
        }
        this.X.q(obj);
    }

    private void I0() {
        n4 n4Var = this.f66274w3;
        if (n4Var != null) {
            this.X.t(n4Var);
        }
    }

    private void K0() {
        I0();
        B0(1);
        if (getState() == 2) {
            V0();
        }
    }

    private void L0() {
        this.f66274w3 = null;
        B0(1);
    }

    private void M0() {
        I0();
        H0();
    }

    private boolean P0(long j10, long j11) throws androidx.media3.decoder.f, s0 {
        if (this.f66267r3 == -9223372036854775807L) {
            this.f66267r3 = j10;
        }
        androidx.media3.decoder.l lVar = (androidx.media3.decoder.l) androidx.media3.common.util.a.g(this.f66253g3);
        long j12 = lVar.f62708b;
        long j13 = j12 - j10;
        if (!y0()) {
            if (!z0(j13)) {
                return false;
            }
            c1(lVar);
            return true;
        }
        androidx.media3.common.w wVarJ = this.Y.j(j12);
        if (wVarJ != null) {
            this.f66263p1 = wVarJ;
        } else if (this.f66263p1 == null) {
            this.f66263p1 = this.Y.i();
        }
        long jB0 = j12 - b0();
        if (a1(j13)) {
            R0(lVar, jB0, (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f66263p1));
            return true;
        }
        if (getState() == 2 && j10 != this.f66267r3 && (!Y0(j13, j11) || !C0(j10))) {
            if (Z0(j13, j11)) {
                v0(lVar);
                return true;
            }
            if (j13 < 30000) {
                R0(lVar, jB0, (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f66263p1));
                return true;
            }
            return false;
        }
        return false;
    }

    private void T0(@p0 androidx.media3.exoplayer.drm.m mVar) {
        androidx.media3.exoplayer.drm.m.b(this.f66259m3, mVar);
        this.f66259m3 = mVar;
    }

    private void V0() {
        this.f66268s3 = this.f66271v > 0 ? SystemClock.elapsedRealtime() + this.f66271v : -9223372036854775807L;
    }

    private void X0(@p0 androidx.media3.exoplayer.drm.m mVar) {
        androidx.media3.exoplayer.drm.m.b(this.f66260n3, mVar);
        this.f66260n3 = mVar;
    }

    private boolean a1(long j10) {
        boolean z10 = getState() == 2;
        int i10 = this.f66266q3;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return z10 && b1(j10, k1.D1(SystemClock.elapsedRealtime()) - this.B3);
        }
        throw new IllegalStateException();
    }

    private boolean u0(long j10, long j11) throws androidx.media3.decoder.f, s0 {
        if (this.f66253g3 == null) {
            androidx.media3.decoder.l lVar = (androidx.media3.decoder.l) ((androidx.media3.decoder.e) androidx.media3.common.util.a.g(this.H1)).a();
            this.f66253g3 = lVar;
            if (lVar == null) {
                return false;
            }
            androidx.media3.exoplayer.j jVar = this.C3;
            int i10 = jVar.f63913f;
            int i11 = lVar.f62709c;
            jVar.f63913f = i10 + i11;
            this.A3 -= i11;
        }
        if (!this.f66253g3.s()) {
            boolean zP0 = P0(j10, j11);
            if (zP0) {
                N0(((androidx.media3.decoder.l) androidx.media3.common.util.a.g(this.f66253g3)).f62708b);
                this.f66253g3 = null;
            }
            return zP0;
        }
        if (this.f66261o3 == 2) {
            Q0();
            D0();
        } else {
            this.f66253g3.D();
            this.f66253g3 = null;
            this.f66272v3 = true;
        }
        return false;
    }

    private boolean w0() throws androidx.media3.decoder.f, s0 {
        androidx.media3.decoder.e<androidx.media3.decoder.g, ? extends androidx.media3.decoder.l, ? extends androidx.media3.decoder.f> eVar = this.H1;
        if (eVar != null && this.f66261o3 != 2 && !this.f66270u3) {
            if (this.f66264p2 == null) {
                androidx.media3.decoder.g gVarC = eVar.c();
                this.f66264p2 = gVarC;
                if (gVarC == null) {
                    return false;
                }
            }
            androidx.media3.decoder.g gVar = (androidx.media3.decoder.g) androidx.media3.common.util.a.g(this.f66264p2);
            if (this.f66261o3 == 1) {
                gVar.z(4);
                ((androidx.media3.decoder.e) androidx.media3.common.util.a.g(this.H1)).b(gVar);
                this.f66264p2 = null;
                this.f66261o3 = 2;
                return false;
            }
            p3 p3VarW = W();
            int iP0 = p0(p3VarW, gVar, 0);
            if (iP0 == -5) {
                J0(p3VarW);
                return true;
            }
            int i10 = 7 | (-4);
            if (iP0 != -4) {
                if (iP0 == -3) {
                    return false;
                }
                throw new IllegalStateException();
            }
            if (gVar.s()) {
                this.f66270u3 = true;
                ((androidx.media3.decoder.e) androidx.media3.common.util.a.g(this.H1)).b(gVar);
                this.f66264p2 = null;
                return false;
            }
            if (this.f66269t3) {
                this.Y.a(gVar.f62702f, (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f66262p0));
                this.f66269t3 = false;
            }
            gVar.H();
            gVar.f62698b = this.f66262p0;
            O0(gVar);
            ((androidx.media3.decoder.e) androidx.media3.common.util.a.g(this.H1)).b(gVar);
            this.A3++;
            this.f66265p3 = true;
            this.C3.f63910c++;
            this.f66264p2 = null;
            return true;
        }
        return false;
    }

    private boolean y0() {
        if (this.f66254h3 == -1) {
            return false;
        }
        int i10 = 6 ^ 1;
        return true;
    }

    private static boolean z0(long j10) {
        return j10 < -30000;
    }

    protected boolean C0(long j10) throws s0 {
        int iR0 = r0(j10);
        if (iR0 == 0) {
            return false;
        }
        this.C3.f63917j++;
        d1(iR0, this.A3);
        x0();
        return true;
    }

    @androidx.annotation.i
    protected void J0(p3 p3Var) throws s0 {
        this.f66269t3 = true;
        androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(p3Var.f64600b);
        X0(p3Var.f64599a);
        androidx.media3.common.w wVar2 = this.f66262p0;
        this.f66262p0 = wVar;
        androidx.media3.decoder.e<androidx.media3.decoder.g, ? extends androidx.media3.decoder.l, ? extends androidx.media3.decoder.f> eVar = this.H1;
        if (eVar == null) {
            D0();
            this.X.p((androidx.media3.common.w) androidx.media3.common.util.a.g(this.f66262p0), null);
            return;
        }
        androidx.media3.exoplayer.k kVar = this.f66260n3 != this.f66259m3 ? new androidx.media3.exoplayer.k(eVar.getName(), (androidx.media3.common.w) androidx.media3.common.util.a.g(wVar2), wVar, 0, 128) : s0(eVar.getName(), (androidx.media3.common.w) androidx.media3.common.util.a.g(wVar2), wVar);
        if (kVar.f63950d == 0) {
            if (this.f66265p3) {
                this.f66261o3 = 1;
            } else {
                Q0();
                D0();
            }
        }
        this.X.p((androidx.media3.common.w) androidx.media3.common.util.a.g(this.f66262p0), kVar);
    }

    @androidx.annotation.i
    protected void N0(long j10) {
        this.A3--;
    }

    protected void O0(androidx.media3.decoder.g gVar) {
    }

    @androidx.annotation.i
    protected void Q0() {
        this.f66264p2 = null;
        this.f66253g3 = null;
        this.f66261o3 = 0;
        this.f66265p3 = false;
        this.A3 = 0;
        androidx.media3.decoder.e<androidx.media3.decoder.g, ? extends androidx.media3.decoder.l, ? extends androidx.media3.decoder.f> eVar = this.H1;
        if (eVar != null) {
            this.C3.f63909b++;
            eVar.release();
            this.X.l(this.H1.getName());
            this.H1 = null;
        }
        T0(null);
    }

    protected void R0(androidx.media3.decoder.l lVar, long j10, androidx.media3.common.w wVar) throws androidx.media3.decoder.f {
        w wVar2 = this.f66258l3;
        if (wVar2 != null) {
            wVar2.h(j10, U().a(), wVar, null);
        }
        this.B3 = k1.D1(SystemClock.elapsedRealtime());
        int i10 = lVar.f62733f;
        boolean z10 = i10 == 1 && this.f66256j3 != null;
        boolean z11 = i10 == 0 && this.f66257k3 != null;
        if (!z11 && !z10) {
            v0(lVar);
            return;
        }
        G0(lVar.f62735h, lVar.f62736i);
        if (z11) {
            ((v) androidx.media3.common.util.a.g(this.f66257k3)).setOutputBuffer(lVar);
        } else {
            S0(lVar, (Surface) androidx.media3.common.util.a.g(this.f66256j3));
        }
        this.f66277z3 = 0;
        this.C3.f63912e++;
        F0();
    }

    protected abstract void S0(androidx.media3.decoder.l lVar, Surface surface) throws androidx.media3.decoder.f;

    protected abstract void U0(int i10);

    protected final void W0(@p0 Object obj) {
        if (obj instanceof Surface) {
            this.f66256j3 = (Surface) obj;
            this.f66257k3 = null;
            this.f66254h3 = 1;
        } else if (obj instanceof v) {
            this.f66256j3 = null;
            this.f66257k3 = (v) obj;
            this.f66254h3 = 0;
        } else {
            this.f66256j3 = null;
            this.f66257k3 = null;
            int i10 = 6 ^ (-1);
            this.f66254h3 = -1;
            obj = null;
        }
        if (this.f66255i3 == obj) {
            if (obj != null) {
                M0();
            }
            return;
        }
        this.f66255i3 = obj;
        if (obj == null) {
            L0();
            return;
        }
        if (this.H1 != null) {
            U0(this.f66254h3);
        }
        K0();
    }

    protected boolean Y0(long j10, long j11) {
        return A0(j10);
    }

    protected boolean Z0(long j10, long j11) {
        return z0(j10);
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean a() {
        return this.f66272v3;
    }

    protected boolean b1(long j10, long j11) {
        return z0(j10) && j11 > androidx.media3.exoplayer.audio.s0.f63372z;
    }

    protected void c1(androidx.media3.decoder.l lVar) {
        this.C3.f63913f++;
        lVar.D();
    }

    protected void d1(int i10, int i11) {
        androidx.media3.exoplayer.j jVar = this.C3;
        jVar.f63915h += i10;
        int i12 = i10 + i11;
        jVar.f63914g += i12;
        this.f66276y3 += i12;
        int i13 = this.f66277z3 + i12;
        this.f66277z3 = i13;
        jVar.f63916i = Math.max(i13, jVar.f63916i);
        int i14 = this.f66273w;
        if (i14 > 0 && this.f66276y3 >= i14) {
            E0();
        }
    }

    @Override // androidx.media3.exoplayer.i
    protected void e0() {
        this.f66262p0 = null;
        this.f66274w3 = null;
        B0(0);
        try {
            X0(null);
            Q0();
        } finally {
            this.X.m(this.C3);
        }
    }

    @Override // androidx.media3.exoplayer.i
    protected void f0(boolean z10, boolean z11) throws s0 {
        androidx.media3.exoplayer.j jVar = new androidx.media3.exoplayer.j();
        this.C3 = jVar;
        this.X.o(jVar);
        this.f66266q3 = z11 ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e A[LOOP:0: B:17:0x0046->B:19:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:1: B:20:0x0050->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.z4
    public void g(long j10, long j11) throws s0 {
        if (!this.f66272v3) {
            if (this.f66262p0 == null) {
                p3 p3VarW = W();
                this.Z.o();
                int iP0 = p0(p3VarW, this.Z, 2);
                if (iP0 == -5) {
                    J0(p3VarW);
                    D0();
                    if (this.H1 != null) {
                        try {
                            z0.a("drainAndFeed");
                            while (u0(j10, j11)) {
                            }
                            while (w0()) {
                            }
                            z0.b();
                            this.C3.c();
                        } catch (androidx.media3.decoder.f e10) {
                            androidx.media3.common.util.z.e(D3, "Video codec error", e10);
                            this.X.s(e10);
                            throw S(e10, this.f66262p0, x0.f61838r3);
                        }
                    }
                } else if (iP0 == -4) {
                    androidx.media3.common.util.a.i(this.Z.s());
                    this.f66270u3 = true;
                    this.f66272v3 = true;
                }
            } else {
                D0();
                if (this.H1 != null) {
                    z0.a("drainAndFeed");
                    while (u0(j10, j11)) {
                    }
                    while (w0()) {
                    }
                    z0.b();
                    this.C3.c();
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.i
    protected void h0(long j10, boolean z10) throws s0 {
        this.f66270u3 = false;
        this.f66272v3 = false;
        int i10 = 6 >> 1;
        B0(1);
        this.f66267r3 = -9223372036854775807L;
        this.f66277z3 = 0;
        if (this.H1 != null) {
            x0();
        }
        if (z10) {
            V0();
        } else {
            this.f66268s3 = -9223372036854775807L;
        }
        this.Y.c();
    }

    @Override // androidx.media3.exoplayer.i, androidx.media3.exoplayer.w4.b
    public void i(int i10, @p0 Object obj) throws s0 {
        if (i10 == 1) {
            W0(obj);
        } else if (i10 == 7) {
            this.f66258l3 = (w) obj;
        } else {
            super.i(i10, obj);
        }
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean isReady() {
        if (this.f66262p0 != null && ((d0() || this.f66253g3 != null) && (this.f66266q3 == 3 || !y0()))) {
            this.f66268s3 = -9223372036854775807L;
            return true;
        }
        if (this.f66268s3 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f66268s3) {
            return true;
        }
        this.f66268s3 = -9223372036854775807L;
        return false;
    }

    @Override // androidx.media3.exoplayer.z4
    public void j() {
        if (this.f66266q3 == 0) {
            this.f66266q3 = 1;
        }
    }

    @Override // androidx.media3.exoplayer.i
    protected void l0() {
        this.f66276y3 = 0;
        this.f66275x3 = SystemClock.elapsedRealtime();
        this.B3 = k1.D1(SystemClock.elapsedRealtime());
    }

    @Override // androidx.media3.exoplayer.i
    protected void m0() {
        this.f66268s3 = -9223372036854775807L;
        E0();
    }

    @Override // androidx.media3.exoplayer.i
    protected void n0(androidx.media3.common.w[] wVarArr, long j10, long j11, t0.b bVar) throws s0 {
        super.n0(wVarArr, j10, j11, bVar);
    }

    protected androidx.media3.exoplayer.k s0(String str, androidx.media3.common.w wVar, androidx.media3.common.w wVar2) {
        return new androidx.media3.exoplayer.k(str, wVar, wVar2, 0, 1);
    }

    protected abstract androidx.media3.decoder.e<androidx.media3.decoder.g, ? extends androidx.media3.decoder.l, ? extends androidx.media3.decoder.f> t0(androidx.media3.common.w wVar, @p0 androidx.media3.decoder.b bVar) throws androidx.media3.decoder.f;

    protected void v0(androidx.media3.decoder.l lVar) {
        d1(0, 1);
        lVar.D();
    }

    @androidx.annotation.i
    protected void x0() throws s0 {
        this.A3 = 0;
        if (this.f66261o3 != 0) {
            Q0();
            D0();
            return;
        }
        this.f66264p2 = null;
        androidx.media3.decoder.l lVar = this.f66253g3;
        if (lVar != null) {
            lVar.D();
            this.f66253g3 = null;
        }
        androidx.media3.decoder.e eVar = (androidx.media3.decoder.e) androidx.media3.common.util.a.g(this.H1);
        eVar.flush();
        eVar.e(Y());
        this.f66265p3 = false;
    }
}
