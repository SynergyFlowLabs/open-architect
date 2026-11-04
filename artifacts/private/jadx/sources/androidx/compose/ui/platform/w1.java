package androidx.compose.ui.platform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class w1 {
    public static final int B = 8;
    private int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f40921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f40927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f40928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f40929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f40930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f40931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f40932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f40933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f40934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f40935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f40936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f40937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f40938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f40939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f40940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f40941u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f40942v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f40943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.e3 f40944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f40945y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.r0 f40946z;

    public /* synthetic */ w1(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, androidx.compose.ui.graphics.e3 e3Var, int i18, androidx.compose.ui.graphics.r0 r0Var, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, i11, i12, i13, i14, i15, f10, f11, f12, f13, f14, i16, i17, f15, f16, f17, f18, f19, f20, z10, z11, f21, e3Var, i18, r0Var, i19);
    }

    public static /* synthetic */ w1 C(w1 w1Var, long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, androidx.compose.ui.graphics.e3 e3Var, int i18, androidx.compose.ui.graphics.r0 r0Var, int i19, int i20, Object obj) {
        int i21;
        androidx.compose.ui.graphics.r0 r0Var2;
        long j11 = (i20 & 1) != 0 ? w1Var.f40921a : j10;
        int i22 = (i20 & 2) != 0 ? w1Var.f40922b : i10;
        int i23 = (i20 & 4) != 0 ? w1Var.f40923c : i11;
        int i24 = (i20 & 8) != 0 ? w1Var.f40924d : i12;
        int i25 = (i20 & 16) != 0 ? w1Var.f40925e : i13;
        int i26 = (i20 & 32) != 0 ? w1Var.f40926f : i14;
        int i27 = (i20 & 64) != 0 ? w1Var.f40927g : i15;
        float f22 = (i20 & 128) != 0 ? w1Var.f40928h : f10;
        float f23 = (i20 & 256) != 0 ? w1Var.f40929i : f11;
        float f24 = (i20 & 512) != 0 ? w1Var.f40930j : f12;
        float f25 = (i20 & 1024) != 0 ? w1Var.f40931k : f13;
        float f26 = (i20 & 2048) != 0 ? w1Var.f40932l : f14;
        int i28 = (i20 & 4096) != 0 ? w1Var.f40933m : i16;
        long j12 = j11;
        int i29 = (i20 & 8192) != 0 ? w1Var.f40934n : i17;
        float f27 = (i20 & 16384) != 0 ? w1Var.f40935o : f15;
        float f28 = (i20 & 32768) != 0 ? w1Var.f40936p : f16;
        float f29 = (i20 & 65536) != 0 ? w1Var.f40937q : f17;
        float f30 = (i20 & 131072) != 0 ? w1Var.f40938r : f18;
        float f31 = (i20 & 262144) != 0 ? w1Var.f40939s : f19;
        float f32 = (i20 & 524288) != 0 ? w1Var.f40940t : f20;
        boolean z12 = (i20 & 1048576) != 0 ? w1Var.f40941u : z10;
        boolean z13 = (i20 & 2097152) != 0 ? w1Var.f40942v : z11;
        float f33 = (i20 & 4194304) != 0 ? w1Var.f40943w : f21;
        androidx.compose.ui.graphics.e3 e3Var2 = (i20 & 8388608) != 0 ? w1Var.f40944x : e3Var;
        int i30 = (i20 & 16777216) != 0 ? w1Var.f40945y : i18;
        androidx.compose.ui.graphics.r0 r0Var3 = (i20 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? w1Var.f40946z : r0Var;
        if ((i20 & 67108864) != 0) {
            r0Var2 = r0Var3;
            i21 = w1Var.A;
        } else {
            i21 = i19;
            r0Var2 = r0Var3;
        }
        return w1Var.B(j12, i22, i23, i24, i25, i26, i27, f22, f23, f24, f25, f26, i28, i29, f27, f28, f29, f30, f31, f32, z12, z13, f33, e3Var2, i30, r0Var2, i21);
    }

    public final float A() {
        return this.f40929i;
    }

    @NotNull
    public final w1 B(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, @Nullable androidx.compose.ui.graphics.e3 e3Var, int i18, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i19) {
        return new w1(j10, i10, i11, i12, i13, i14, i15, f10, f11, f12, f13, f14, i16, i17, f15, f16, f17, f18, f19, f20, z10, z11, f21, e3Var, i18, r0Var, i19, null);
    }

    public final float D() {
        return this.f40943w;
    }

    public final int E() {
        return this.f40933m;
    }

    public final int F() {
        return this.f40945y;
    }

    public final int G() {
        return this.f40925e;
    }

    public final float H() {
        return this.f40938r;
    }

    public final boolean I() {
        return this.f40942v;
    }

    public final boolean J() {
        return this.f40941u;
    }

    @Nullable
    public final androidx.compose.ui.graphics.r0 K() {
        return this.f40946z;
    }

    public final int L() {
        return this.A;
    }

    public final float M() {
        return this.f40932l;
    }

    public final int N() {
        return this.f40927g;
    }

    public final int O() {
        return this.f40922b;
    }

    public final float P() {
        return this.f40939s;
    }

    public final float Q() {
        return this.f40940t;
    }

    @Nullable
    public final androidx.compose.ui.graphics.e3 R() {
        return this.f40944x;
    }

    public final int S() {
        return this.f40924d;
    }

    public final float T() {
        return this.f40936p;
    }

    public final float U() {
        return this.f40937q;
    }

    public final float V() {
        return this.f40935o;
    }

    public final float W() {
        return this.f40928h;
    }

    public final float X() {
        return this.f40929i;
    }

    public final int Y() {
        return this.f40934n;
    }

    public final int Z() {
        return this.f40923c;
    }

    public final long a() {
        return this.f40921a;
    }

    public final float a0() {
        return this.f40930j;
    }

    public final float b() {
        return this.f40930j;
    }

    public final float b0() {
        return this.f40931k;
    }

    public final float c() {
        return this.f40931k;
    }

    public final long c0() {
        return this.f40921a;
    }

    public final float d() {
        return this.f40932l;
    }

    public final int d0() {
        return this.f40926f;
    }

    public final int e() {
        return this.f40933m;
    }

    public final void e0(float f10) {
        this.f40943w = f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.f40921a == w1Var.f40921a && this.f40922b == w1Var.f40922b && this.f40923c == w1Var.f40923c && this.f40924d == w1Var.f40924d && this.f40925e == w1Var.f40925e && this.f40926f == w1Var.f40926f && this.f40927g == w1Var.f40927g && Float.compare(this.f40928h, w1Var.f40928h) == 0 && Float.compare(this.f40929i, w1Var.f40929i) == 0 && Float.compare(this.f40930j, w1Var.f40930j) == 0 && Float.compare(this.f40931k, w1Var.f40931k) == 0 && Float.compare(this.f40932l, w1Var.f40932l) == 0 && this.f40933m == w1Var.f40933m && this.f40934n == w1Var.f40934n && Float.compare(this.f40935o, w1Var.f40935o) == 0 && Float.compare(this.f40936p, w1Var.f40936p) == 0 && Float.compare(this.f40937q, w1Var.f40937q) == 0 && Float.compare(this.f40938r, w1Var.f40938r) == 0 && Float.compare(this.f40939s, w1Var.f40939s) == 0 && Float.compare(this.f40940t, w1Var.f40940t) == 0 && this.f40941u == w1Var.f40941u && this.f40942v == w1Var.f40942v && Float.compare(this.f40943w, w1Var.f40943w) == 0 && Intrinsics.areEqual(this.f40944x, w1Var.f40944x) && androidx.compose.ui.graphics.d0.G(this.f40945y, w1Var.f40945y) && Intrinsics.areEqual(this.f40946z, w1Var.f40946z) && androidx.compose.ui.graphics.h1.g(this.A, w1Var.A);
    }

    public final int f() {
        return this.f40934n;
    }

    public final void f0(int i10) {
        this.f40933m = i10;
    }

    public final float g() {
        return this.f40935o;
    }

    public final void g0(int i10) {
        this.f40945y = i10;
    }

    public final float h() {
        return this.f40936p;
    }

    public final void h0(float f10) {
        this.f40938r = f10;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.f40921a) * 31) + Integer.hashCode(this.f40922b)) * 31) + Integer.hashCode(this.f40923c)) * 31) + Integer.hashCode(this.f40924d)) * 31) + Integer.hashCode(this.f40925e)) * 31) + Integer.hashCode(this.f40926f)) * 31) + Integer.hashCode(this.f40927g)) * 31) + Float.hashCode(this.f40928h)) * 31) + Float.hashCode(this.f40929i)) * 31) + Float.hashCode(this.f40930j)) * 31) + Float.hashCode(this.f40931k)) * 31) + Float.hashCode(this.f40932l)) * 31) + Integer.hashCode(this.f40933m)) * 31) + Integer.hashCode(this.f40934n)) * 31) + Float.hashCode(this.f40935o)) * 31) + Float.hashCode(this.f40936p)) * 31) + Float.hashCode(this.f40937q)) * 31) + Float.hashCode(this.f40938r)) * 31) + Float.hashCode(this.f40939s)) * 31) + Float.hashCode(this.f40940t)) * 31) + Boolean.hashCode(this.f40941u)) * 31) + Boolean.hashCode(this.f40942v)) * 31) + Float.hashCode(this.f40943w)) * 31;
        androidx.compose.ui.graphics.e3 e3Var = this.f40944x;
        int iHashCode2 = (((iHashCode + (e3Var == null ? 0 : e3Var.hashCode())) * 31) + androidx.compose.ui.graphics.d0.H(this.f40945y)) * 31;
        androidx.compose.ui.graphics.r0 r0Var = this.f40946z;
        return ((iHashCode2 + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.h1.h(this.A);
    }

    public final float i() {
        return this.f40937q;
    }

    public final void i0(boolean z10) {
        this.f40942v = z10;
    }

    public final float j() {
        return this.f40938r;
    }

    public final void j0(boolean z10) {
        this.f40941u = z10;
    }

    public final float k() {
        return this.f40939s;
    }

    public final void k0(@Nullable androidx.compose.ui.graphics.r0 r0Var) {
        this.f40946z = r0Var;
    }

    public final int l() {
        return this.f40922b;
    }

    public final void l0(int i10) {
        this.A = i10;
    }

    public final float m() {
        return this.f40940t;
    }

    public final void m0(float f10) {
        this.f40932l = f10;
    }

    public final boolean n() {
        return this.f40941u;
    }

    public final void n0(float f10) {
        this.f40939s = f10;
    }

    public final boolean o() {
        return this.f40942v;
    }

    public final void o0(float f10) {
        this.f40940t = f10;
    }

    public final float p() {
        return this.f40943w;
    }

    public final void p0(@Nullable androidx.compose.ui.graphics.e3 e3Var) {
        this.f40944x = e3Var;
    }

    @Nullable
    public final androidx.compose.ui.graphics.e3 q() {
        return this.f40944x;
    }

    public final void q0(float f10) {
        this.f40936p = f10;
    }

    public final int r() {
        return this.f40945y;
    }

    public final void r0(float f10) {
        this.f40937q = f10;
    }

    @Nullable
    public final androidx.compose.ui.graphics.r0 s() {
        return this.f40946z;
    }

    public final void s0(float f10) {
        this.f40935o = f10;
    }

    public final int t() {
        return this.A;
    }

    public final void t0(float f10) {
        this.f40928h = f10;
    }

    @NotNull
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.f40921a + ", left=" + this.f40922b + ", top=" + this.f40923c + ", right=" + this.f40924d + ", bottom=" + this.f40925e + ", width=" + this.f40926f + ", height=" + this.f40927g + ", scaleX=" + this.f40928h + ", scaleY=" + this.f40929i + ", translationX=" + this.f40930j + ", translationY=" + this.f40931k + ", elevation=" + this.f40932l + ", ambientShadowColor=" + this.f40933m + ", spotShadowColor=" + this.f40934n + ", rotationZ=" + this.f40935o + ", rotationX=" + this.f40936p + ", rotationY=" + this.f40937q + ", cameraDistance=" + this.f40938r + ", pivotX=" + this.f40939s + ", pivotY=" + this.f40940t + ", clipToOutline=" + this.f40941u + ", clipToBounds=" + this.f40942v + ", alpha=" + this.f40943w + ", renderEffect=" + this.f40944x + ", blendMode=" + ((Object) androidx.compose.ui.graphics.d0.I(this.f40945y)) + ", colorFilter=" + this.f40946z + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.h1.i(this.A)) + ')';
    }

    public final int u() {
        return this.f40923c;
    }

    public final void u0(float f10) {
        this.f40929i = f10;
    }

    public final int v() {
        return this.f40924d;
    }

    public final void v0(int i10) {
        this.f40934n = i10;
    }

    public final int w() {
        return this.f40925e;
    }

    public final void w0(float f10) {
        this.f40930j = f10;
    }

    public final int x() {
        return this.f40926f;
    }

    public final void x0(float f10) {
        this.f40931k = f10;
    }

    public final int y() {
        return this.f40927g;
    }

    public final float z() {
        return this.f40928h;
    }

    private w1(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, androidx.compose.ui.graphics.e3 e3Var, int i18, androidx.compose.ui.graphics.r0 r0Var, int i19) {
        this.f40921a = j10;
        this.f40922b = i10;
        this.f40923c = i11;
        this.f40924d = i12;
        this.f40925e = i13;
        this.f40926f = i14;
        this.f40927g = i15;
        this.f40928h = f10;
        this.f40929i = f11;
        this.f40930j = f12;
        this.f40931k = f13;
        this.f40932l = f14;
        this.f40933m = i16;
        this.f40934n = i17;
        this.f40935o = f15;
        this.f40936p = f16;
        this.f40937q = f17;
        this.f40938r = f18;
        this.f40939s = f19;
        this.f40940t = f20;
        this.f40941u = z10;
        this.f40942v = z11;
        this.f40943w = f21;
        this.f40944x = e3Var;
        this.f40945y = i18;
        this.f40946z = r0Var;
        this.A = i19;
    }
}
