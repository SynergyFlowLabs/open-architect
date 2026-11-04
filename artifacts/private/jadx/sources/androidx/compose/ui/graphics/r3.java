package androidx.compose.ui.graphics;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,827:1\n82#2:828\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n785#1:828\n*E\n"})
final class r3 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0, androidx.compose.ui.node.i2 {
    private float H1;
    private float X;
    private float Y;
    private float Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private q3 f38153g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f38154h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @Nullable
    private e3 f38155i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private long f38156j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private long f38157k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private int f38158l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private int f38159m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @Nullable
    private r0 f38160n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final boolean f38161o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f38162p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f38163p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private long f38164p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private Function1<? super r1, Unit> f38165p3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f38166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f38167t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f38168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f38169w;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<r1, Unit> {
        a() {
            super(1);
        }

        public final void c(r1 r1Var) {
            r1Var.z(r3.this.B());
            r1Var.C(r3.this.F());
            r1Var.setAlpha(r3.this.r());
            r1Var.E(r3.this.p());
            r1Var.h(r3.this.o());
            r1Var.Q(r3.this.a0());
            r1Var.k(r3.this.D());
            r1Var.l(r3.this.q());
            r1Var.m(r3.this.v());
            r1Var.j(r3.this.i());
            r1Var.W1(r3.this.c6());
            r1Var.Q3(r3.this.t3());
            r1Var.O(r3.this.b());
            r1Var.A(r3.this.g());
            r1Var.h0(r3.this.f0());
            r1Var.j0(r3.this.L());
            r1Var.H(r3.this.T());
            r1Var.s(r3.this.t());
            r1Var.f(r3.this.e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1 r1Var) {
            c(r1Var);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.layout.i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i2 f38171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r3 f38172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.i2 i2Var, r3 r3Var) {
            super(1);
            this.f38171a = i2Var;
            this.f38172b = r3Var;
        }

        public final void c(androidx.compose.ui.layout.i2.a aVar) {
            androidx.compose.ui.layout.i2.a.A0(aVar, this.f38171a, 0, 0, 0.0f, this.f38172b.f38165p3, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.layout.i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ r3(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var, long j11, long j12, int i10, int i11, r0 r0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q3Var, z10, e3Var, j11, j12, i10, i11, r0Var);
    }

    public final void A(@Nullable e3 e3Var) {
        this.f38155i3 = e3Var;
    }

    public final float B() {
        return this.f38166s;
    }

    public final void C(float f10) {
        this.f38167t = f10;
    }

    public final float D() {
        return this.Z;
    }

    public final void E(float f10) {
        this.f38169w = f10;
    }

    public final float F() {
        return this.f38167t;
    }

    public final void H(int i10) {
        this.f38158l3 = i10;
    }

    public final long L() {
        return this.f38157k3;
    }

    @Override // androidx.compose.ui.node.i2
    public boolean N4() {
        return this.f38161o3;
    }

    public final void O(boolean z10) {
        this.f38154h3 = z10;
    }

    public final void Q(float f10) {
        this.Y = f10;
    }

    public final void Q3(@NotNull q3 q3Var) {
        this.f38153g3 = q3Var;
    }

    public final int T() {
        return this.f38158l3;
    }

    public final void W1(long j10) {
        this.f38164p2 = j10;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    public final float a0() {
        return this.Y;
    }

    public final boolean b() {
        return this.f38154h3;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        int i10 = 4 | 0;
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new b(i2VarP0, this), 4, null);
    }

    public final long c6() {
        return this.f38164p2;
    }

    @Nullable
    public final r0 e() {
        return this.f38160n3;
    }

    public final void f(@Nullable r0 r0Var) {
        this.f38160n3 = r0Var;
    }

    public final long f0() {
        return this.f38156j3;
    }

    @Nullable
    public final e3 g() {
        return this.f38155i3;
    }

    public final void h(float f10) {
        this.X = f10;
    }

    public final void h0(long j10) {
        this.f38156j3 = j10;
    }

    public final float i() {
        return this.H1;
    }

    public final void j(float f10) {
        this.H1 = f10;
    }

    public final void j0(long j10) {
        this.f38157k3 = j10;
    }

    public final void k(float f10) {
        this.Z = f10;
    }

    public final void l(float f10) {
        this.f38162p0 = f10;
    }

    public final void m(float f10) {
        this.f38163p1 = f10;
    }

    public final float o() {
        return this.X;
    }

    public final float p() {
        return this.f38169w;
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
    }

    public final float q() {
        return this.f38162p0;
    }

    public final float r() {
        return this.f38168v;
    }

    public final void s(int i10) {
        this.f38159m3 = i10;
    }

    public final void setAlpha(float f10) {
        this.f38168v = f10;
    }

    public final int t() {
        return this.f38159m3;
    }

    @NotNull
    public final q3 t3() {
        return this.f38153g3;
    }

    @NotNull
    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f38166s + ", scaleY=" + this.f38167t + ", alpha = " + this.f38168v + ", translationX=" + this.f38169w + ", translationY=" + this.X + ", shadowElevation=" + this.Y + ", rotationX=" + this.Z + ", rotationY=" + this.f38162p0 + ", rotationZ=" + this.f38163p1 + ", cameraDistance=" + this.H1 + ", transformOrigin=" + ((Object) z3.n(this.f38164p2)) + ", shape=" + this.f38153g3 + ", clip=" + this.f38154h3 + ", renderEffect=" + this.f38155i3 + ", ambientShadowColor=" + ((Object) q0.L(this.f38156j3)) + ", spotShadowColor=" + ((Object) q0.L(this.f38157k3)) + ", compositingStrategy=" + ((Object) h1.i(this.f38158l3)) + ", blendMode=" + ((Object) d0.I(this.f38159m3)) + ", colorFilter=" + this.f38160n3 + ')';
    }

    public final float v() {
        return this.f38163p1;
    }

    public final void w9() {
        androidx.compose.ui.node.k1 k1VarY4 = androidx.compose.ui.node.k.p(this, androidx.compose.ui.node.m1.b(2)).Y4();
        if (k1VarY4 != null) {
            k1VarY4.u7(this.f38165p3, true);
        }
    }

    public final void z(float f10) {
        this.f38166s = f10;
    }

    public /* synthetic */ r3(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var, long j11, long j12, int i10, int i11, r0 r0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q3Var, z10, e3Var, j11, j12, (i12 & 65536) != 0 ? h1.f37790b.a() : i10, (i12 & 131072) != 0 ? d0.f37693b.B() : i11, (i12 & 262144) != 0 ? null : r0Var, null);
    }

    private r3(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q3 q3Var, boolean z10, e3 e3Var, long j11, long j12, int i10, int i11, r0 r0Var) {
        this.f38166s = f10;
        this.f38167t = f11;
        this.f38168v = f12;
        this.f38169w = f13;
        this.X = f14;
        this.Y = f15;
        this.Z = f16;
        this.f38162p0 = f17;
        this.f38163p1 = f18;
        this.H1 = f19;
        this.f38164p2 = j10;
        this.f38153g3 = q3Var;
        this.f38154h3 = z10;
        this.f38155i3 = e3Var;
        this.f38156j3 = j11;
        this.f38157k3 = j12;
        this.f38158l3 = i10;
        this.f38159m3 = i11;
        this.f38160n3 = r0Var;
        this.f38165p3 = new a();
    }
}
