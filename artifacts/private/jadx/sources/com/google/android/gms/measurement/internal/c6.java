package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class c6 {

    @androidx.annotation.p0
    private Long A;
    private long B;

    @androidx.annotation.p0
    private String C;
    private int D;
    private int E;
    private long F;
    private String G;

    @androidx.annotation.p0
    private byte[] H;
    private int I;
    private long J;
    private long K;
    private long L;
    private long M;
    private long N;
    private long O;

    @androidx.annotation.p0
    private String P;
    private boolean Q;
    private long R;
    private long S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h7 f109812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f109813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private String f109814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private String f109815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private String f109816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private String f109817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f109818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f109819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f109820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private String f109821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f109822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private String f109823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f109824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f109825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f109826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f109827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private Boolean f109828q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f109829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private List f109830s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private String f109831t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f109832u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f109833v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f109834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f109835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f109836y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.p0
    private Long f109837z;

    @androidx.annotation.m1
    c6(h7 h7Var, String str) {
        com.google.android.gms.common.internal.w.r(h7Var);
        com.google.android.gms.common.internal.w.l(str);
        this.f109812a = h7Var;
        this.f109813b = str;
        h7Var.b().h();
    }

    @androidx.annotation.m1
    public final boolean A() {
        this.f109812a.b().h();
        return this.Q;
    }

    @androidx.annotation.m1
    public final void A0(long j10) {
        this.f109812a.b().h();
        this.Q |= this.f109819h != j10;
        this.f109819h = j10;
    }

    @androidx.annotation.m1
    public final int B() {
        this.f109812a.b().h();
        return this.D;
    }

    @androidx.annotation.m1
    public final long B0() {
        this.f109812a.b().h();
        return this.f109820i;
    }

    @androidx.annotation.m1
    public final void C(int i10) {
        this.f109812a.b().h();
        this.Q |= this.D != i10;
        this.D = i10;
    }

    @androidx.annotation.m1
    public final void C0(long j10) {
        this.f109812a.b().h();
        this.Q |= this.f109820i != j10;
        this.f109820i = j10;
    }

    @androidx.annotation.m1
    public final int D() {
        this.f109812a.b().h();
        return this.E;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String D0() {
        this.f109812a.b().h();
        return this.f109821j;
    }

    @androidx.annotation.m1
    public final void E(int i10) {
        boolean z10;
        this.f109812a.b().h();
        boolean z11 = this.Q;
        if (this.E != i10) {
            z10 = true;
            int i11 = 2 << 1;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.E = i10;
    }

    @androidx.annotation.m1
    public final void E0(@androidx.annotation.p0 String str) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.f109821j, str);
        this.f109821j = str;
    }

    @androidx.annotation.m1
    public final void F(long j10) {
        boolean z10;
        this.f109812a.b().h();
        boolean z11 = this.Q;
        if (this.F != j10) {
            z10 = true;
            int i10 = 2 & 1;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.F = j10;
    }

    @androidx.annotation.m1
    public final long F0() {
        this.f109812a.b().h();
        return this.f109822k;
    }

    @androidx.annotation.m1
    public final long G() {
        this.f109812a.b().h();
        return this.F;
    }

    @androidx.annotation.m1
    public final void G0(long j10) {
        this.f109812a.b().h();
        this.Q |= this.f109822k != j10;
        this.f109822k = j10;
    }

    @androidx.annotation.m1
    public final void H(String str) {
        this.f109812a.b().h();
        this.Q |= this.G != str;
        this.G = str;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String H0() {
        this.f109812a.b().h();
        return this.f109823l;
    }

    @androidx.annotation.m1
    public final String I() {
        this.f109812a.b().h();
        return this.G;
    }

    @androidx.annotation.m1
    public final void I0(@androidx.annotation.p0 String str) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.f109823l, str);
        this.f109823l = str;
    }

    @androidx.annotation.m1
    public final void J(@androidx.annotation.p0 byte[] bArr) {
        this.f109812a.b().h();
        this.Q |= this.H != bArr;
        this.H = bArr;
    }

    @androidx.annotation.m1
    public final long J0() {
        this.f109812a.b().h();
        return this.f109824m;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final byte[] K() {
        this.f109812a.b().h();
        return this.H;
    }

    @androidx.annotation.m1
    public final void K0(long j10) {
        boolean z10;
        this.f109812a.b().h();
        boolean z11 = this.Q;
        if (this.f109824m != j10) {
            z10 = true;
            boolean z12 = !true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.f109824m = j10;
    }

    @androidx.annotation.m1
    public final void L(int i10) {
        this.f109812a.b().h();
        this.Q |= this.I != i10;
        this.I = i10;
    }

    @androidx.annotation.m1
    public final long L0() {
        this.f109812a.b().h();
        return this.f109825n;
    }

    @androidx.annotation.m1
    public final int M() {
        this.f109812a.b().h();
        return this.I;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String N() {
        this.f109812a.b().h();
        String str = this.P;
        O(null);
        return str;
    }

    @androidx.annotation.m1
    public final void O(@androidx.annotation.p0 String str) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    @androidx.annotation.m1
    public final boolean P() {
        this.f109812a.b().h();
        return this.f109827p;
    }

    @androidx.annotation.m1
    public final void Q(boolean z10) {
        this.f109812a.b().h();
        this.Q |= this.f109827p != z10;
        this.f109827p = z10;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final Boolean R() {
        this.f109812a.b().h();
        return this.f109828q;
    }

    @androidx.annotation.m1
    public final void S(@androidx.annotation.p0 Boolean bool) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.f109828q, bool);
        this.f109828q = bool;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final List T() {
        this.f109812a.b().h();
        return this.f109830s;
    }

    @androidx.annotation.m1
    public final void U(@androidx.annotation.p0 List list) {
        this.f109812a.b().h();
        if (Objects.equals(this.f109830s, list)) {
            return;
        }
        this.Q = true;
        this.f109830s = list != null ? new ArrayList(list) : null;
    }

    @androidx.annotation.m1
    public final boolean V() {
        this.f109812a.b().h();
        return this.f109832u;
    }

    @androidx.annotation.m1
    public final void W(boolean z10) {
        this.f109812a.b().h();
        this.Q |= this.f109832u != z10;
        this.f109832u = z10;
    }

    @androidx.annotation.m1
    public final long X() {
        this.f109812a.b().h();
        return this.f109833v;
    }

    @androidx.annotation.m1
    public final void Y(long j10) {
        this.f109812a.b().h();
        this.Q |= this.f109833v != j10;
        this.f109833v = j10;
    }

    @androidx.annotation.m1
    public final long Z() {
        this.f109812a.b().h();
        return this.f109834w;
    }

    @androidx.annotation.m1
    public final void a(long j10) {
        this.f109812a.b().h();
        this.Q |= this.f109825n != j10;
        this.f109825n = j10;
    }

    @androidx.annotation.m1
    public final void a0(long j10) {
        this.f109812a.b().h();
        this.Q |= this.f109834w != j10;
        this.f109834w = j10;
    }

    @androidx.annotation.m1
    public final long b() {
        this.f109812a.b().h();
        return this.f109829r;
    }

    @androidx.annotation.m1
    public final int b0() {
        this.f109812a.b().h();
        return this.f109835x;
    }

    @androidx.annotation.m1
    public final void c(long j10) {
        this.f109812a.b().h();
        this.Q |= this.f109829r != j10;
        this.f109829r = j10;
    }

    @androidx.annotation.m1
    public final void c0(int i10) {
        this.f109812a.b().h();
        this.Q |= this.f109835x != i10;
        this.f109835x = i10;
    }

    @androidx.annotation.m1
    public final boolean d() {
        this.f109812a.b().h();
        return this.f109826o;
    }

    @androidx.annotation.m1
    public final boolean d0() {
        this.f109812a.b().h();
        return this.f109836y;
    }

    @androidx.annotation.m1
    public final void e(boolean z10) {
        this.f109812a.b().h();
        this.Q |= this.f109826o != z10;
        this.f109826o = z10;
    }

    @androidx.annotation.m1
    public final void e0(boolean z10) {
        this.f109812a.b().h();
        this.Q |= this.f109836y != z10;
        this.f109836y = z10;
    }

    @androidx.annotation.m1
    public final void f(long j10) {
        com.google.android.gms.common.internal.w.a(j10 >= 0);
        this.f109812a.b().h();
        this.Q |= this.f109818g != j10;
        this.f109818g = j10;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final Long f0() {
        this.f109812a.b().h();
        return this.f109837z;
    }

    @androidx.annotation.m1
    public final long g() {
        this.f109812a.b().h();
        return this.f109818g;
    }

    @androidx.annotation.m1
    public final void g0(@androidx.annotation.p0 Long l10) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.f109837z, l10);
        this.f109837z = l10;
    }

    @androidx.annotation.m1
    public final long h() {
        this.f109812a.b().h();
        return this.R;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final Long h0() {
        this.f109812a.b().h();
        return this.A;
    }

    @androidx.annotation.m1
    public final void i(long j10) {
        this.f109812a.b().h();
        this.Q |= this.R != j10;
        this.R = j10;
    }

    @androidx.annotation.m1
    public final void i0(@androidx.annotation.p0 Long l10) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.A, l10);
        this.A = l10;
    }

    @androidx.annotation.m1
    public final long j() {
        this.f109812a.b().h();
        return this.S;
    }

    @androidx.annotation.m1
    public final long j0() {
        this.f109812a.b().h();
        return this.B;
    }

    @androidx.annotation.m1
    public final void k(long j10) {
        this.f109812a.b().h();
        this.Q |= this.S != j10;
        this.S = j10;
    }

    @androidx.annotation.m1
    public final void k0(long j10) {
        this.f109812a.b().h();
        this.Q |= this.B != j10;
        this.B = j10;
    }

    @androidx.annotation.m1
    public final void l() {
        h7 h7Var = this.f109812a;
        h7Var.b().h();
        long j10 = this.f109818g + 1;
        if (j10 > androidx.collection.g3.f12256c) {
            h7Var.a().r().b("Bundle index overflow. appId", w5.x(this.f109813b));
            j10 = 0;
        }
        this.Q = true;
        this.f109818g = j10;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String l0() {
        this.f109812a.b().h();
        return this.C;
    }

    @androidx.annotation.m1
    public final void m(long j10) {
        h7 h7Var = this.f109812a;
        h7Var.b().h();
        long j11 = this.f109818g + j10;
        if (j11 > androidx.collection.g3.f12256c) {
            h7Var.a().r().b("Bundle index overflow. appId", w5.x(this.f109813b));
            j11 = (-1) + j10;
        }
        long j12 = this.F + 1;
        if (j12 > androidx.collection.g3.f12256c) {
            h7Var.a().r().b("Delivery index overflow. appId", w5.x(this.f109813b));
            j12 = 0;
        }
        this.Q = true;
        this.f109818g = j11;
        this.F = j12;
    }

    @androidx.annotation.m1
    public final void m0(@androidx.annotation.p0 String str) {
        this.f109812a.b().h();
        this.Q |= this.C != str;
        this.C = str;
    }

    @androidx.annotation.m1
    public final long n() {
        this.f109812a.b().h();
        return this.J;
    }

    @androidx.annotation.m1
    public final void n0() {
        this.f109812a.b().h();
        this.Q = false;
    }

    @androidx.annotation.m1
    public final void o(long j10) {
        this.f109812a.b().h();
        this.Q |= this.J != j10;
        this.J = j10;
    }

    @androidx.annotation.m1
    public final String o0() {
        this.f109812a.b().h();
        return this.f109813b;
    }

    @androidx.annotation.m1
    public final long p() {
        this.f109812a.b().h();
        return this.K;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String p0() {
        this.f109812a.b().h();
        return this.f109814c;
    }

    @androidx.annotation.m1
    public final void q(long j10) {
        this.f109812a.b().h();
        this.Q |= this.K != j10;
        this.K = j10;
    }

    @androidx.annotation.m1
    public final void q0(@androidx.annotation.p0 String str) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.f109814c, str);
        this.f109814c = str;
    }

    @androidx.annotation.m1
    public final long r() {
        this.f109812a.b().h();
        return this.L;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String r0() {
        this.f109812a.b().h();
        return this.f109815d;
    }

    @androidx.annotation.m1
    public final void s(long j10) {
        this.f109812a.b().h();
        this.Q |= this.L != j10;
        this.L = j10;
    }

    @androidx.annotation.m1
    public final void s0(@androidx.annotation.p0 String str) {
        this.f109812a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= true ^ Objects.equals(this.f109815d, str);
        this.f109815d = str;
    }

    @androidx.annotation.m1
    public final long t() {
        this.f109812a.b().h();
        return this.M;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String t0() {
        this.f109812a.b().h();
        return this.f109831t;
    }

    @androidx.annotation.m1
    public final void u(long j10) {
        this.f109812a.b().h();
        this.Q |= this.M != j10;
        this.M = j10;
    }

    @androidx.annotation.m1
    public final void u0(@androidx.annotation.p0 String str) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.f109831t, str);
        this.f109831t = str;
    }

    @androidx.annotation.m1
    public final long v() {
        this.f109812a.b().h();
        return this.O;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String v0() {
        this.f109812a.b().h();
        return this.f109816e;
    }

    @androidx.annotation.m1
    public final void w(long j10) {
        this.f109812a.b().h();
        this.Q |= this.O != j10;
        this.O = j10;
    }

    @androidx.annotation.m1
    public final void w0(@androidx.annotation.p0 String str) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.f109816e, str);
        this.f109816e = str;
    }

    @androidx.annotation.m1
    public final long x() {
        this.f109812a.b().h();
        return this.N;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String x0() {
        this.f109812a.b().h();
        return this.f109817f;
    }

    @androidx.annotation.m1
    public final void y(long j10) {
        this.f109812a.b().h();
        this.Q |= this.N != j10;
        this.N = j10;
    }

    @androidx.annotation.m1
    public final void y0(@androidx.annotation.p0 String str) {
        this.f109812a.b().h();
        this.Q |= !Objects.equals(this.f109817f, str);
        this.f109817f = str;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final String z() {
        this.f109812a.b().h();
        return this.P;
    }

    @androidx.annotation.m1
    public final long z0() {
        this.f109812a.b().h();
        return this.f109819h;
    }
}
