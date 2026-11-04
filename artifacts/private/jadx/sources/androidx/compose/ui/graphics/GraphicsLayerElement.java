package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class GraphicsLayerElement extends androidx.compose.ui.node.e1<r3> {
    private final int X;

    @Nullable
    private final r0 Y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f37504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f37505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f37506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f37507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f37508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f37509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f37510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f37511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f37512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f37513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final q3 f37514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f37515o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final e3 f37516s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f37517t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f37518v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f37519w;

    public /* synthetic */ GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var, long j11, long j12, int i10, int i11, r0 r0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q3Var, z10, e3Var, j11, j12, i10, i11, r0Var);
    }

    public static /* synthetic */ GraphicsLayerElement G(GraphicsLayerElement graphicsLayerElement, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var, long j11, long j12, int i10, int i11, r0 r0Var, int i12, Object obj) {
        r0 r0Var2;
        int i13;
        float f20 = (i12 & 1) != 0 ? graphicsLayerElement.f37503c : f10;
        float f21 = (i12 & 2) != 0 ? graphicsLayerElement.f37504d : f11;
        float f22 = (i12 & 4) != 0 ? graphicsLayerElement.f37505e : f12;
        float f23 = (i12 & 8) != 0 ? graphicsLayerElement.f37506f : f13;
        float f24 = (i12 & 16) != 0 ? graphicsLayerElement.f37507g : f14;
        float f25 = (i12 & 32) != 0 ? graphicsLayerElement.f37508h : f15;
        float f26 = (i12 & 64) != 0 ? graphicsLayerElement.f37509i : f16;
        float f27 = (i12 & 128) != 0 ? graphicsLayerElement.f37510j : f17;
        float f28 = (i12 & 256) != 0 ? graphicsLayerElement.f37511k : f18;
        float f29 = (i12 & 512) != 0 ? graphicsLayerElement.f37512l : f19;
        long j13 = (i12 & 1024) != 0 ? graphicsLayerElement.f37513m : j10;
        q3 q3Var2 = (i12 & 2048) != 0 ? graphicsLayerElement.f37514n : q3Var;
        boolean z11 = (i12 & 4096) != 0 ? graphicsLayerElement.f37515o : z10;
        float f30 = f20;
        e3 e3Var2 = (i12 & 8192) != 0 ? graphicsLayerElement.f37516s : e3Var;
        long j14 = (i12 & 16384) != 0 ? graphicsLayerElement.f37517t : j11;
        long j15 = (i12 & 32768) != 0 ? graphicsLayerElement.f37518v : j12;
        int i14 = (i12 & 65536) != 0 ? graphicsLayerElement.f37519w : i10;
        int i15 = (i12 & 131072) != 0 ? graphicsLayerElement.X : i11;
        if ((i12 & 262144) != 0) {
            i13 = i14;
            r0Var2 = graphicsLayerElement.Y;
        } else {
            r0Var2 = r0Var;
            i13 = i14;
        }
        return graphicsLayerElement.F(f30, f21, f22, f23, f24, f25, f26, f27, f28, f29, j13, q3Var2, z11, e3Var2, j14, j15, i13, i15, r0Var2);
    }

    public final float A() {
        return this.f37507g;
    }

    public final float B() {
        return this.f37508h;
    }

    public final float C() {
        return this.f37509i;
    }

    public final float D() {
        return this.f37510j;
    }

    public final float E() {
        return this.f37511k;
    }

    @NotNull
    public final GraphicsLayerElement F(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, @NotNull q3 q3Var, boolean z10, @Nullable e3 e3Var, long j11, long j12, int i10, int i11, @Nullable r0 r0Var) {
        return new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q3Var, z10, e3Var, j11, j12, i10, i11, r0Var, null);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public r3 a() {
        return new r3(this.f37503c, this.f37504d, this.f37505e, this.f37506f, this.f37507g, this.f37508h, this.f37509i, this.f37510j, this.f37511k, this.f37512l, this.f37513m, this.f37514n, this.f37515o, this.f37516s, this.f37517t, this.f37518v, this.f37519w, this.X, this.Y, null);
    }

    public final float I() {
        return this.f37505e;
    }

    public final long K() {
        return this.f37517t;
    }

    public final int L() {
        return this.X;
    }

    public final float M() {
        return this.f37512l;
    }

    public final boolean O() {
        return this.f37515o;
    }

    @Nullable
    public final r0 Q() {
        return this.Y;
    }

    public final int R() {
        return this.f37519w;
    }

    @Nullable
    public final e3 S() {
        return this.f37516s;
    }

    public final float T() {
        return this.f37509i;
    }

    public final float Y() {
        return this.f37510j;
    }

    public final float a0() {
        return this.f37511k;
    }

    public final float d0() {
        return this.f37503c;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f37503c, graphicsLayerElement.f37503c) == 0 && Float.compare(this.f37504d, graphicsLayerElement.f37504d) == 0 && Float.compare(this.f37505e, graphicsLayerElement.f37505e) == 0 && Float.compare(this.f37506f, graphicsLayerElement.f37506f) == 0 && Float.compare(this.f37507g, graphicsLayerElement.f37507g) == 0 && Float.compare(this.f37508h, graphicsLayerElement.f37508h) == 0 && Float.compare(this.f37509i, graphicsLayerElement.f37509i) == 0 && Float.compare(this.f37510j, graphicsLayerElement.f37510j) == 0 && Float.compare(this.f37511k, graphicsLayerElement.f37511k) == 0 && Float.compare(this.f37512l, graphicsLayerElement.f37512l) == 0 && z3.i(this.f37513m, graphicsLayerElement.f37513m) && Intrinsics.areEqual(this.f37514n, graphicsLayerElement.f37514n) && this.f37515o == graphicsLayerElement.f37515o && Intrinsics.areEqual(this.f37516s, graphicsLayerElement.f37516s) && q0.y(this.f37517t, graphicsLayerElement.f37517t) && q0.y(this.f37518v, graphicsLayerElement.f37518v) && h1.g(this.f37519w, graphicsLayerElement.f37519w) && d0.G(this.X, graphicsLayerElement.X) && Intrinsics.areEqual(this.Y, graphicsLayerElement.Y);
    }

    public final float f0() {
        return this.f37504d;
    }

    public final float g0() {
        return this.f37508h;
    }

    @NotNull
    public final q3 h0() {
        return this.f37514n;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((Float.hashCode(this.f37503c) * 31) + Float.hashCode(this.f37504d)) * 31) + Float.hashCode(this.f37505e)) * 31) + Float.hashCode(this.f37506f)) * 31) + Float.hashCode(this.f37507g)) * 31) + Float.hashCode(this.f37508h)) * 31) + Float.hashCode(this.f37509i)) * 31) + Float.hashCode(this.f37510j)) * 31) + Float.hashCode(this.f37511k)) * 31) + Float.hashCode(this.f37512l)) * 31) + z3.m(this.f37513m)) * 31) + this.f37514n.hashCode()) * 31) + Boolean.hashCode(this.f37515o)) * 31;
        e3 e3Var = this.f37516s;
        int iHashCode2 = (((((((((iHashCode + (e3Var == null ? 0 : e3Var.hashCode())) * 31) + q0.K(this.f37517t)) * 31) + q0.K(this.f37518v)) * 31) + h1.h(this.f37519w)) * 31) + d0.H(this.X)) * 31;
        r0 r0Var = this.Y;
        return iHashCode2 + (r0Var != null ? r0Var.hashCode() : 0);
    }

    public final long i0() {
        return this.f37518v;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("graphicsLayer");
        t2Var.b().c("scaleX", Float.valueOf(this.f37503c));
        t2Var.b().c("scaleY", Float.valueOf(this.f37504d));
        t2Var.b().c("alpha", Float.valueOf(this.f37505e));
        t2Var.b().c("translationX", Float.valueOf(this.f37506f));
        t2Var.b().c("translationY", Float.valueOf(this.f37507g));
        t2Var.b().c("shadowElevation", Float.valueOf(this.f37508h));
        t2Var.b().c("rotationX", Float.valueOf(this.f37509i));
        t2Var.b().c("rotationY", Float.valueOf(this.f37510j));
        t2Var.b().c("rotationZ", Float.valueOf(this.f37511k));
        t2Var.b().c("cameraDistance", Float.valueOf(this.f37512l));
        t2Var.b().c("transformOrigin", z3.b(this.f37513m));
        t2Var.b().c("shape", this.f37514n);
        t2Var.b().c("clip", Boolean.valueOf(this.f37515o));
        t2Var.b().c("renderEffect", this.f37516s);
        t2Var.b().c("ambientShadowColor", q0.n(this.f37517t));
        t2Var.b().c("spotShadowColor", q0.n(this.f37518v));
        t2Var.b().c("compositingStrategy", h1.d(this.f37519w));
        t2Var.b().c("blendMode", d0.D(this.X));
        t2Var.b().c("colorFilter", this.Y);
    }

    public final long j0() {
        return this.f37513m;
    }

    public final float l() {
        return this.f37503c;
    }

    public final float l0() {
        return this.f37506f;
    }

    public final float m() {
        return this.f37512l;
    }

    public final float m0() {
        return this.f37507g;
    }

    public final long n() {
        return this.f37513m;
    }

    @NotNull
    public final q3 o() {
        return this.f37514n;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull r3 r3Var) {
        r3Var.z(this.f37503c);
        r3Var.C(this.f37504d);
        r3Var.setAlpha(this.f37505e);
        r3Var.E(this.f37506f);
        r3Var.h(this.f37507g);
        r3Var.Q(this.f37508h);
        r3Var.k(this.f37509i);
        r3Var.l(this.f37510j);
        r3Var.m(this.f37511k);
        r3Var.j(this.f37512l);
        r3Var.W1(this.f37513m);
        r3Var.Q3(this.f37514n);
        r3Var.O(this.f37515o);
        r3Var.A(this.f37516s);
        r3Var.h0(this.f37517t);
        r3Var.j0(this.f37518v);
        r3Var.H(this.f37519w);
        r3Var.s(this.X);
        r3Var.f(this.Y);
        r3Var.w9();
    }

    public final boolean p() {
        return this.f37515o;
    }

    @Nullable
    public final e3 q() {
        return this.f37516s;
    }

    public final long r() {
        return this.f37517t;
    }

    public final long s() {
        return this.f37518v;
    }

    public final int t() {
        return this.f37519w;
    }

    @NotNull
    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f37503c + ", scaleY=" + this.f37504d + ", alpha=" + this.f37505e + ", translationX=" + this.f37506f + ", translationY=" + this.f37507g + ", shadowElevation=" + this.f37508h + ", rotationX=" + this.f37509i + ", rotationY=" + this.f37510j + ", rotationZ=" + this.f37511k + ", cameraDistance=" + this.f37512l + ", transformOrigin=" + ((Object) z3.n(this.f37513m)) + ", shape=" + this.f37514n + ", clip=" + this.f37515o + ", renderEffect=" + this.f37516s + ", ambientShadowColor=" + ((Object) q0.L(this.f37517t)) + ", spotShadowColor=" + ((Object) q0.L(this.f37518v)) + ", compositingStrategy=" + ((Object) h1.i(this.f37519w)) + ", blendMode=" + ((Object) d0.I(this.X)) + ", colorFilter=" + this.Y + ')';
    }

    public final int u() {
        return this.X;
    }

    @Nullable
    public final r0 v() {
        return this.Y;
    }

    public final float w() {
        return this.f37504d;
    }

    public final float y() {
        return this.f37505e;
    }

    public final float z() {
        return this.f37506f;
    }

    private GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var, long j11, long j12, int i10, int i11, r0 r0Var) {
        this.f37503c = f10;
        this.f37504d = f11;
        this.f37505e = f12;
        this.f37506f = f13;
        this.f37507g = f14;
        this.f37508h = f15;
        this.f37509i = f16;
        this.f37510j = f17;
        this.f37511k = f18;
        this.f37512l = f19;
        this.f37513m = j10;
        this.f37514n = q3Var;
        this.f37515o = z10;
        this.f37516s = e3Var;
        this.f37517t = j11;
        this.f37518v = j12;
        this.f37519w = i10;
        this.X = i11;
        this.Y = r0Var;
    }
}
