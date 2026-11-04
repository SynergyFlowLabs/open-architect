package androidx.compose.ui.graphics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class l3 implements r1 {
    public static final int H1 = 0;

    @Nullable
    private e3 Y;

    @Nullable
    private r0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37848a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f37852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f37853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f37854g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f37857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f37858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f37859l;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private f2 f37864p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f37865s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f37849b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f37850c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f37851d = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37855h = s1.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37856i = s1.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f37860m = 8.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f37861n = z3.f38723b.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private q3 f37862o = d3.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37866t = h1.f37790b.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f37867v = n0.n.f332724b.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f37868w = androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null);

    @NotNull
    private androidx.compose.ui.unit.w X = androidx.compose.ui.unit.w.Ltr;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f37863p0 = d0.f37693b.B();

    @Override // androidx.compose.ui.graphics.r1
    public void A(@Nullable e3 e3Var) {
        if (Intrinsics.areEqual(this.Y, e3Var)) {
            return;
        }
        this.f37848a |= 131072;
        this.Y = e3Var;
    }

    @Override // androidx.compose.ui.graphics.r1
    public float B() {
        return this.f37849b;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void C(float f10) {
        if (this.f37850c == f10) {
            return;
        }
        this.f37848a |= 2;
        this.f37850c = f10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public float D() {
        return this.f37857j;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void E(float f10) {
        if (this.f37852e == f10) {
            return;
        }
        this.f37848a |= 8;
        this.f37852e = f10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public float F() {
        return this.f37850c;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void H(int i10) {
        if (h1.g(this.f37866t, i10)) {
            return;
        }
        this.f37848a |= 32768;
        this.f37866t = i10;
    }

    @Nullable
    public final f2 I() {
        return this.f37864p1;
    }

    public final void J() {
        z(1.0f);
        C(1.0f);
        setAlpha(1.0f);
        E(0.0f);
        h(0.0f);
        Q(0.0f);
        h0(s1.b());
        j0(s1.b());
        k(0.0f);
        l(0.0f);
        m(0.0f);
        j(8.0f);
        W1(z3.f38723b.a());
        Q3(d3.a());
        O(false);
        A(null);
        f(null);
        s(d0.f37693b.B());
        H(h1.f37790b.a());
        U(n0.n.f332724b.a());
        this.f37864p1 = null;
        this.f37848a = 0;
    }

    public final void K(@NotNull androidx.compose.ui.unit.d dVar) {
        this.f37868w = dVar;
    }

    @Override // androidx.compose.ui.graphics.r1
    public long L() {
        return this.f37856i;
    }

    public final void M(@NotNull androidx.compose.ui.unit.w wVar) {
        this.X = wVar;
    }

    public final void N(int i10) {
        this.f37848a = i10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void O(boolean z10) {
        if (this.f37865s != z10) {
            this.f37848a |= 16384;
            this.f37865s = z10;
        }
    }

    @androidx.annotation.l1
    public final void P(@Nullable f2 f2Var) {
        this.f37864p1 = f2Var;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void Q(float f10) {
        if (this.f37854g == f10) {
            return;
        }
        this.f37848a |= 32;
        this.f37854g = f10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void Q3(@NotNull q3 q3Var) {
        if (!Intrinsics.areEqual(this.f37862o, q3Var)) {
            this.f37848a |= 8192;
            this.f37862o = q3Var;
        }
    }

    @Override // androidx.compose.ui.graphics.r1
    public int T() {
        return this.f37866t;
    }

    public void U(long j10) {
        this.f37867v = j10;
    }

    public final void V() {
        this.f37864p1 = t3().mo0createOutlinePq9zytI(d(), this.X, this.f37868w);
    }

    @Override // androidx.compose.ui.graphics.r1
    public void W1(long j10) {
        if (z3.i(this.f37861n, j10)) {
            return;
        }
        this.f37848a |= 4096;
        this.f37861n = j10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public float a0() {
        return this.f37854g;
    }

    @Override // androidx.compose.ui.graphics.r1
    public boolean b() {
        return this.f37865s;
    }

    @NotNull
    public final androidx.compose.ui.unit.d c() {
        return this.f37868w;
    }

    @Override // androidx.compose.ui.graphics.r1
    public long c6() {
        return this.f37861n;
    }

    @Override // androidx.compose.ui.graphics.r1
    public long d() {
        return this.f37867v;
    }

    @Override // androidx.compose.ui.graphics.r1
    @Nullable
    public r0 e() {
        return this.Z;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void f(@Nullable r0 r0Var) {
        if (Intrinsics.areEqual(this.Z, r0Var)) {
            return;
        }
        this.f37848a |= 262144;
        this.Z = r0Var;
    }

    @Override // androidx.compose.ui.graphics.r1
    public long f0() {
        return this.f37855h;
    }

    @Override // androidx.compose.ui.graphics.r1
    @Nullable
    public e3 g() {
        return this.Y;
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f37868w.getDensity();
    }

    @Override // androidx.compose.ui.graphics.r1
    public void h(float f10) {
        if (this.f37853f == f10) {
            return;
        }
        this.f37848a |= 16;
        this.f37853f = f10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void h0(long j10) {
        if (q0.y(this.f37855h, j10)) {
            return;
        }
        this.f37848a |= 64;
        this.f37855h = j10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public float i() {
        return this.f37860m;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void j(float f10) {
        if (this.f37860m == f10) {
            return;
        }
        this.f37848a |= 2048;
        this.f37860m = f10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void j0(long j10) {
        if (q0.y(this.f37856i, j10)) {
            return;
        }
        this.f37848a |= 128;
        this.f37856i = j10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void k(float f10) {
        if (this.f37857j == f10) {
            return;
        }
        this.f37848a |= 256;
        this.f37857j = f10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void l(float f10) {
        if (this.f37858k == f10) {
            return;
        }
        this.f37848a |= 512;
        this.f37858k = f10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void m(float f10) {
        if (this.f37859l == f10) {
            return;
        }
        this.f37848a |= 1024;
        this.f37859l = f10;
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f37868w.m0();
    }

    @Override // androidx.compose.ui.graphics.r1
    public float o() {
        return this.f37853f;
    }

    @Override // androidx.compose.ui.graphics.r1
    public float p() {
        return this.f37852e;
    }

    @Override // androidx.compose.ui.graphics.r1
    public float q() {
        return this.f37858k;
    }

    @Override // androidx.compose.ui.graphics.r1
    public float r() {
        return this.f37851d;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void s(int i10) {
        if (!d0.G(this.f37863p0, i10)) {
            this.f37848a |= 524288;
            this.f37863p0 = i10;
        }
    }

    @Override // androidx.compose.ui.graphics.r1
    public void setAlpha(float f10) {
        if (this.f37851d == f10) {
            return;
        }
        this.f37848a |= 4;
        this.f37851d = f10;
    }

    @Override // androidx.compose.ui.graphics.r1
    public int t() {
        return this.f37863p0;
    }

    @Override // androidx.compose.ui.graphics.r1
    @NotNull
    public q3 t3() {
        return this.f37862o;
    }

    @Override // androidx.compose.ui.graphics.r1
    public float v() {
        return this.f37859l;
    }

    @NotNull
    public final androidx.compose.ui.unit.w w() {
        return this.X;
    }

    public final int x() {
        return this.f37848a;
    }

    @Override // androidx.compose.ui.graphics.r1
    public void z(float f10) {
        if (this.f37849b == f10) {
            return;
        }
        this.f37848a |= 1;
        this.f37849b = f10;
    }
}
