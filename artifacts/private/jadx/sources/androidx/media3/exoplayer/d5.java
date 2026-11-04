package androidx.media3.exoplayer;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class d5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f63553g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f63554h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f63555i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f63556j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f63557k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f63558l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f63559m = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z4 f63560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final z4 f63562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63563d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f63564e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63565f = false;

    public d5(z4 z4Var, @androidx.annotation.p0 z4 z4Var2, int i10) {
        this.f63560a = z4Var;
        this.f63561b = i10;
        this.f63562c = z4Var2;
    }

    private boolean A() {
        return this.f63563d == 3;
    }

    private void C(z4 z4Var, androidx.media3.exoplayer.source.s1 s1Var, n nVar, long j10, boolean z10) throws s0 {
        if (y(z4Var)) {
            if (s1Var != z4Var.e()) {
                d(z4Var, nVar);
            } else if (z10) {
                z4Var.t(j10);
            }
        }
    }

    private void E(boolean z10) {
        if (z10) {
            if (this.f63564e) {
                this.f63560a.reset();
                this.f63564e = false;
            }
        } else if (this.f63565f) {
            ((z4) androidx.media3.common.util.a.g(this.f63562c)).reset();
            this.f63565f = false;
        }
    }

    private int K(@androidx.annotation.p0 z4 z4Var, z3 z3Var, androidx.media3.exoplayer.trackselection.l0 l0Var, n nVar) throws s0 {
        if (z4Var == null || !y(z4Var) || ((z4Var == this.f63560a && v()) || (z4Var == this.f63562c && A()))) {
            return 1;
        }
        androidx.media3.exoplayer.source.s1 s1VarE = z4Var.e();
        androidx.media3.exoplayer.source.s1[] s1VarArr = z3Var.f66953c;
        int i10 = this.f63561b;
        boolean z10 = s1VarE != s1VarArr[i10];
        boolean zC = l0Var.c(i10);
        if (zC && !z10) {
            return 1;
        }
        if (!z4Var.r()) {
            z4Var.y(i(l0Var.f65720c[this.f63561b]), (androidx.media3.exoplayer.source.s1) androidx.media3.common.util.a.g(z3Var.f66953c[this.f63561b]), z3Var.n(), z3Var.m(), z3Var.f66958h.f62779a);
            return 3;
        }
        if (!z4Var.a()) {
            return 0;
        }
        d(z4Var, nVar);
        if (!zC || u()) {
            E(z4Var == this.f63560a);
        }
        return 1;
    }

    private void P(z4 z4Var, long j10) {
        z4Var.v();
        if (z4Var instanceof androidx.media3.exoplayer.text.i) {
            ((androidx.media3.exoplayer.text.i) z4Var).J0(j10);
        }
    }

    private void X(boolean z10) throws s0 {
        if (z10) {
            ((z4) androidx.media3.common.util.a.g(this.f63562c)).i(17, this.f63560a);
        } else {
            this.f63560a.i(17, androidx.media3.common.util.a.g(this.f63562c));
        }
    }

    private void d(z4 z4Var, n nVar) {
        androidx.media3.common.util.a.i(this.f63560a == z4Var || this.f63562c == z4Var);
        if (y(z4Var)) {
            nVar.a(z4Var);
            g(z4Var);
            z4Var.d();
        }
    }

    private void g(z4 z4Var) {
        if (z4Var.getState() == 2) {
            z4Var.stop();
        }
    }

    private static androidx.media3.common.w[] i(@androidx.annotation.p0 androidx.media3.exoplayer.trackselection.c0 c0Var) {
        int length = c0Var != null ? c0Var.length() : 0;
        androidx.media3.common.w[] wVarArr = new androidx.media3.common.w[length];
        for (int i10 = 0; i10 < length; i10++) {
            wVarArr[i10] = ((androidx.media3.exoplayer.trackselection.c0) androidx.media3.common.util.a.g(c0Var)).l(i10);
        }
        return wVarArr;
    }

    @androidx.annotation.p0
    private z4 l(@androidx.annotation.p0 z3 z3Var) {
        if (z3Var != null && z3Var.f66953c[this.f63561b] != null) {
            if (this.f63560a.e() == z3Var.f66953c[this.f63561b]) {
                return this.f63560a;
            }
            z4 z4Var = this.f63562c;
            if (z4Var != null && z4Var.e() == z3Var.f66953c[this.f63561b]) {
                return this.f63562c;
            }
        }
        return null;
    }

    private boolean p(z3 z3Var, @androidx.annotation.p0 z4 z4Var) {
        if (z4Var == null) {
            return true;
        }
        androidx.media3.exoplayer.source.s1 s1Var = z3Var.f66953c[this.f63561b];
        if (z4Var.e() == null || (z4Var.e() == s1Var && (s1Var == null || z4Var.q() || q(z4Var, z3Var)))) {
            return true;
        }
        z3 z3VarK = z3Var.k();
        return z3VarK != null && z3VarK.f66953c[this.f63561b] == z4Var.e();
    }

    private boolean q(z4 z4Var, z3 z3Var) {
        z3 z3VarK = z3Var.k();
        return z3Var.f66958h.f62785g && z3VarK != null && z3VarK.f66956f && ((z4Var instanceof androidx.media3.exoplayer.text.i) || (z4Var instanceof androidx.media3.exoplayer.metadata.c) || z4Var.s() >= z3VarK.n());
    }

    private boolean v() {
        int i10 = this.f63563d;
        return i10 == 2 || i10 == 4;
    }

    private static boolean y(z4 z4Var) {
        return z4Var.getState() != 0;
    }

    public void B(androidx.media3.exoplayer.source.s1 s1Var, n nVar, long j10, boolean z10) throws s0 {
        C(this.f63560a, s1Var, nVar, j10, z10);
        z4 z4Var = this.f63562c;
        if (z4Var != null) {
            C(z4Var, s1Var, nVar, j10, z10);
        }
    }

    public void D() throws s0 {
        int i10 = this.f63563d;
        int i11 = 0;
        if (i10 != 3 && i10 != 4) {
            if (i10 == 2) {
                this.f63563d = 0;
            }
        } else {
            X(i10 == 4);
            if (this.f63563d != 4) {
                i11 = 1;
            }
            this.f63563d = i11;
        }
    }

    public void F(androidx.media3.exoplayer.trackselection.l0 l0Var, androidx.media3.exoplayer.trackselection.l0 l0Var2, long j10) {
        int i10;
        boolean zC = l0Var.c(this.f63561b);
        boolean zC2 = l0Var2.c(this.f63561b);
        z4 z4Var = (this.f63562c == null || (i10 = this.f63563d) == 3 || (i10 == 0 && y(this.f63560a))) ? this.f63560a : (z4) androidx.media3.common.util.a.g(this.f63562c);
        if (!zC || z4Var.r()) {
            return;
        }
        boolean z10 = m() == -2;
        c5[] c5VarArr = l0Var.f65719b;
        int i11 = this.f63561b;
        c5 c5Var = c5VarArr[i11];
        c5 c5Var2 = l0Var2.f65719b[i11];
        if (!zC2 || !Objects.equals(c5Var2, c5Var) || z10 || u()) {
            P(z4Var, j10);
        }
    }

    public void G(z3 z3Var) throws IOException {
        ((z4) androidx.media3.common.util.a.g(l(z3Var))).x();
    }

    public void H() {
        this.f63560a.release();
        this.f63564e = false;
        z4 z4Var = this.f63562c;
        if (z4Var != null) {
            z4Var.release();
            this.f63565f = false;
        }
    }

    public void I(long j10, long j11) throws s0 {
        if (y(this.f63560a)) {
            this.f63560a.g(j10, j11);
        }
        z4 z4Var = this.f63562c;
        if (z4Var != null && y(z4Var)) {
            this.f63562c.g(j10, j11);
        }
    }

    public int J(z3 z3Var, androidx.media3.exoplayer.trackselection.l0 l0Var, n nVar) throws s0 {
        int iK = K(this.f63560a, z3Var, l0Var, nVar);
        return iK == 1 ? K(this.f63562c, z3Var, l0Var, nVar) : iK;
    }

    public void L() {
        if (!y(this.f63560a)) {
            E(true);
        }
        z4 z4Var = this.f63562c;
        if (z4Var == null || y(z4Var)) {
            return;
        }
        E(false);
    }

    public void M(z3 z3Var, long j10) throws s0 {
        z4 z4VarL = l(z3Var);
        if (z4VarL != null) {
            z4VarL.t(j10);
        }
    }

    public void N(long j10) {
        int i10;
        if (y(this.f63560a) && (i10 = this.f63563d) != 4 && i10 != 2) {
            P(this.f63560a, j10);
        }
        z4 z4Var = this.f63562c;
        if (z4Var != null && y(z4Var) && this.f63563d != 3) {
            P(this.f63562c, j10);
        }
    }

    public void O(z3 z3Var, long j10) {
        P((z4) androidx.media3.common.util.a.g(l(z3Var)), j10);
    }

    public void Q(float f10, float f11) throws s0 {
        this.f63560a.R(f10, f11);
        z4 z4Var = this.f63562c;
        if (z4Var != null) {
            z4Var.R(f10, f11);
        }
    }

    public void R(androidx.media3.common.z3 z3Var) {
        this.f63560a.P(z3Var);
        z4 z4Var = this.f63562c;
        if (z4Var != null) {
            z4Var.P(z3Var);
        }
    }

    public void S(@androidx.annotation.p0 Object obj) throws s0 {
        if (m() != 2) {
            return;
        }
        int i10 = this.f63563d;
        if (i10 != 4 && i10 != 1) {
            this.f63560a.i(1, obj);
            return;
        }
        ((z4) androidx.media3.common.util.a.g(this.f63562c)).i(1, obj);
    }

    public void T(float f10) throws s0 {
        if (m() != 1) {
            return;
        }
        this.f63560a.i(2, Float.valueOf(f10));
        z4 z4Var = this.f63562c;
        if (z4Var != null) {
            z4Var.i(2, Float.valueOf(f10));
        }
    }

    public void U() throws s0 {
        if (this.f63560a.getState() == 1) {
            int i10 = 5 | 4;
            if (this.f63563d != 4) {
                this.f63560a.start();
                return;
            }
        }
        z4 z4Var = this.f63562c;
        if (z4Var != null && z4Var.getState() == 1 && this.f63563d != 3) {
            this.f63562c.start();
        }
    }

    public void V() {
        int i10;
        androidx.media3.common.util.a.i(!u());
        if (y(this.f63560a)) {
            i10 = 3;
        } else {
            z4 z4Var = this.f63562c;
            i10 = (z4Var == null || !y(z4Var)) ? 2 : 4;
        }
        this.f63563d = i10;
    }

    public void W() {
        if (y(this.f63560a)) {
            g(this.f63560a);
        }
        z4 z4Var = this.f63562c;
        if (z4Var != null && y(z4Var)) {
            g(this.f63562c);
        }
    }

    public boolean a(z3 z3Var) {
        z4 z4VarL = l(z3Var);
        return z4VarL == null || z4VarL.q() || z4VarL.isReady() || z4VarL.a();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public void b(n nVar) throws s0 {
        boolean z10;
        d(this.f63560a, nVar);
        z4 z4Var = this.f63562c;
        if (z4Var != null) {
            if (y(z4Var)) {
                int i10 = 4 | 3;
                if (this.f63563d != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            d(this.f63562c, nVar);
            E(false);
            if (z10) {
                X(true);
            }
        }
        this.f63563d = 0;
    }

    public void c(n nVar) {
        if (u()) {
            int i10 = this.f63563d;
            boolean z10 = i10 == 4 || i10 == 2;
            int i11 = i10 != 4 ? 0 : 1;
            d(z10 ? this.f63560a : (z4) androidx.media3.common.util.a.g(this.f63562c), nVar);
            E(z10);
            this.f63563d = i11;
        }
    }

    public void e(c5 c5Var, androidx.media3.exoplayer.trackselection.c0 c0Var, androidx.media3.exoplayer.source.s1 s1Var, long j10, boolean z10, boolean z11, long j11, long j12, androidx.media3.exoplayer.source.t0.b bVar, n nVar) throws s0 {
        androidx.media3.common.w[] wVarArrI = i(c0Var);
        int i10 = this.f63563d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.f63564e = true;
            this.f63560a.m(c5Var, wVarArrI, s1Var, j10, z10, z11, j11, j12, bVar);
            nVar.b(this.f63560a);
        } else {
            this.f63565f = true;
            ((z4) androidx.media3.common.util.a.g(this.f63562c)).m(c5Var, wVarArrI, s1Var, j10, z10, z11, j11, j12, bVar);
            nVar.b(this.f63562c);
        }
    }

    public void f() {
        if (y(this.f63560a)) {
            this.f63560a.j();
            return;
        }
        z4 z4Var = this.f63562c;
        if (z4Var == null || !y(z4Var)) {
            return;
        }
        this.f63562c.j();
    }

    public int h() {
        boolean zY = y(this.f63560a);
        z4 z4Var = this.f63562c;
        return (zY ? 1 : 0) + ((z4Var == null || !y(z4Var)) ? 0 : 1);
    }

    public long j(long j10, long j11) {
        long jO = y(this.f63560a) ? this.f63560a.O(j10, j11) : Long.MAX_VALUE;
        z4 z4Var = this.f63562c;
        return (z4Var == null || !y(z4Var)) ? jO : Math.min(jO, this.f63562c.O(j10, j11));
    }

    public long k(@androidx.annotation.p0 z3 z3Var) {
        z4 z4VarL = l(z3Var);
        Objects.requireNonNull(z4VarL);
        return z4VarL.s();
    }

    public int m() {
        return this.f63560a.f();
    }

    public void n(int i10, @androidx.annotation.p0 Object obj, z3 z3Var) throws s0 {
        ((z4) androidx.media3.common.util.a.g(l(z3Var))).i(i10, obj);
    }

    public boolean o(z3 z3Var) {
        return p(z3Var, this.f63560a) && p(z3Var, this.f63562c);
    }

    public boolean r(z3 z3Var) {
        return ((z4) androidx.media3.common.util.a.g(l(z3Var))).q();
    }

    public boolean s() {
        return this.f63562c != null;
    }

    public boolean t() {
        boolean zA = y(this.f63560a) ? this.f63560a.a() : true;
        z4 z4Var = this.f63562c;
        return (z4Var == null || !y(z4Var)) ? zA : this.f63562c.a() & zA;
    }

    public boolean u() {
        return v() || A();
    }

    public boolean w(@androidx.annotation.p0 z3 z3Var) {
        return l(z3Var) != null;
    }

    public boolean x() {
        int i10 = this.f63563d;
        return (i10 == 0 || i10 == 2 || i10 == 4) ? y(this.f63560a) : y((z4) androidx.media3.common.util.a.g(this.f63562c));
    }

    public boolean z(int i10) {
        return (v() && i10 == this.f63561b) || (A() && i10 != this.f63561b);
    }
}
