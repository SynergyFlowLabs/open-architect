package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.annotation.w0(23)
@SourceDebugExtension({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,412:1\n65#2:413\n69#2:416\n60#3:414\n70#3:417\n85#3:420\n90#3:422\n22#4:415\n22#4:418\n54#5:419\n59#5:421\n1#6:423\n*S KotlinDebug\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n*L\n202#1:413\n203#1:416\n202#1:414\n203#1:417\n216#1:420\n217#1:422\n202#1:415\n203#1:418\n216#1:419\n217#1:421\n*E\n"})
public final class r3 implements androidx.compose.ui.node.w1, androidx.compose.ui.layout.r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final b f40798s = new b(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f40799t = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final Function2<v1, Matrix, Unit> f40800v = a.f40816a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> f40802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f40803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40804d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.h2 f40808h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final v1 f40812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f40813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f40814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f40815o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final g3 f40805e = new g3();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final x2<v1> f40809i = new x2<>(f40800v);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.l0 f40810j = new androidx.compose.ui.graphics.l0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f40811k = androidx.compose.ui.graphics.z3.f38723b.a();

    static final class a extends kotlin.jvm.internal.l0 implements Function2<v1, Matrix, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40816a = new a();

        a() {
            super(2);
        }

        public final void c(v1 v1Var, Matrix matrix) {
            v1Var.P(matrix);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(v1 v1Var, Matrix matrix) {
            c(v1Var, matrix);
            return Unit.f312394a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @androidx.annotation.w0(29)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f40817a = new c();

        private c() {
        }

        @oj.n
        public static final long a(@NotNull View view) {
            return view.getUniqueDrawingId();
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.k0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.ui.graphics.k0, androidx.compose.ui.graphics.layer.c, Unit> f40818a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2) {
            super(1);
            this.f40818a = function2;
        }

        public final void c(androidx.compose.ui.graphics.k0 k0Var) {
            this.f40818a.invoke(k0Var, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.k0 k0Var) {
            c(k0Var);
            return Unit.f312394a;
        }
    }

    public r3(@NotNull AndroidComposeView androidComposeView, @NotNull Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2, @NotNull Function0<Unit> function0) {
        this.f40801a = androidComposeView;
        this.f40802b = function2;
        this.f40803c = function0;
        p3 p3Var = new p3(androidComposeView);
        p3Var.O(true);
        p3Var.G(false);
        this.f40812l = p3Var;
    }

    private final void n(androidx.compose.ui.graphics.k0 k0Var) {
        if (this.f40812l.N() || this.f40812l.d()) {
            this.f40805e.a(k0Var);
        }
    }

    private final void p(boolean z10) {
        if (z10 != this.f40804d) {
            this.f40804d = z10;
            this.f40801a.Z0(this, z10);
        }
    }

    private final void q() {
        e5.f40435a.a(this.f40801a);
    }

    @Override // androidx.compose.ui.node.w1
    public void a(@NotNull float[] fArr) {
        androidx.compose.ui.graphics.c2.w(fArr, this.f40809i.b(this.f40812l));
    }

    @Override // androidx.compose.ui.node.w1
    public void b(@NotNull Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2, @NotNull Function0<Unit> function0) {
        this.f40809i.h();
        p(false);
        this.f40806f = false;
        this.f40807g = false;
        this.f40811k = androidx.compose.ui.graphics.z3.f38723b.a();
        this.f40802b = function2;
        this.f40803c = function0;
    }

    @Override // androidx.compose.ui.node.w1
    public void c(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        Canvas canvasD = androidx.compose.ui.graphics.c.d(k0Var);
        if (canvasD.isHardwareAccelerated()) {
            l();
            boolean z10 = this.f40812l.d0() > 0.0f;
            this.f40807g = z10;
            if (z10) {
                k0Var.D();
            }
            this.f40812l.w(canvasD);
            if (this.f40807g) {
                k0Var.q();
            }
            return;
        }
        float fY = this.f40812l.y();
        float fN = this.f40812l.n();
        float fX = this.f40812l.x();
        float fB = this.f40812l.b();
        if (this.f40812l.r() < 1.0f) {
            androidx.compose.ui.graphics.h2 h2VarA = this.f40808h;
            if (h2VarA == null) {
                h2VarA = androidx.compose.ui.graphics.m.a();
                this.f40808h = h2VarA;
            }
            h2VarA.setAlpha(this.f40812l.r());
            canvasD.saveLayer(fY, fN, fX, fB, h2VarA.D());
        } else {
            k0Var.save();
        }
        k0Var.c(fY, fN);
        k0Var.L(this.f40809i.b(this.f40812l));
        n(k0Var);
        Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2 = this.f40802b;
        if (function2 != null) {
            function2.invoke(k0Var, null);
        }
        k0Var.B();
        p(false);
    }

    @Override // androidx.compose.ui.node.w1
    public void d(@NotNull n0.e eVar, boolean z10) {
        if (z10) {
            this.f40809i.f(this.f40812l, eVar);
        } else {
            this.f40809i.d(this.f40812l, eVar);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public void destroy() {
        if (this.f40812l.a()) {
            this.f40812l.c();
        }
        this.f40802b = null;
        this.f40803c = null;
        this.f40806f = true;
        p(false);
        this.f40801a.g1();
        this.f40801a.e1(this);
    }

    @Override // androidx.compose.ui.node.w1
    public long f(long j10, boolean z10) {
        return z10 ? this.f40809i.g(this.f40812l, j10) : this.f40809i.e(this.f40812l, j10);
    }

    @Override // androidx.compose.ui.node.w1
    public void g(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        this.f40812l.R(androidx.compose.ui.graphics.z3.k(this.f40811k) * i10);
        this.f40812l.S(androidx.compose.ui.graphics.z3.l(this.f40811k) * i11);
        v1 v1Var = this.f40812l;
        if (v1Var.X(v1Var.y(), this.f40812l.n(), this.f40812l.y() + i10, this.f40812l.n() + i11)) {
            this.f40812l.U(this.f40805e.b());
            invalidate();
            this.f40809i.c();
        }
    }

    @Override // androidx.compose.ui.node.w1
    public float getFrameRate() {
        return this.f40814n;
    }

    @Override // androidx.compose.ui.layout.r
    public long getLayerId() {
        return this.f40812l.u();
    }

    @Override // androidx.compose.ui.layout.r
    public long getOwnerViewId() {
        return c.a(this.f40801a);
    }

    @Override // androidx.compose.ui.node.w1
    @NotNull
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo3getUnderlyingMatrixsQKQjiQ() {
        return this.f40809i.b(this.f40812l);
    }

    @Override // androidx.compose.ui.node.w1
    public boolean h(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10));
        if (this.f40812l.d()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) this.f40812l.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) this.f40812l.getHeight());
        }
        if (this.f40812l.N()) {
            return this.f40805e.f(j10);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.w1
    public void i(@NotNull androidx.compose.ui.graphics.l3 l3Var) {
        Function0<Unit> function0;
        int iX = l3Var.x() | this.f40813m;
        int i10 = iX & 4096;
        if (i10 != 0) {
            this.f40811k = l3Var.c6();
        }
        boolean z10 = false;
        boolean z11 = this.f40812l.N() && !this.f40805e.e();
        if ((iX & 1) != 0) {
            this.f40812l.z(l3Var.B());
        }
        if ((iX & 2) != 0) {
            this.f40812l.C(l3Var.F());
        }
        if ((iX & 4) != 0) {
            this.f40812l.setAlpha(l3Var.r());
        }
        if ((iX & 8) != 0) {
            this.f40812l.E(l3Var.p());
        }
        if ((iX & 16) != 0) {
            this.f40812l.h(l3Var.o());
        }
        if ((iX & 32) != 0) {
            this.f40812l.I(l3Var.a0());
        }
        if ((iX & 64) != 0) {
            this.f40812l.a0(androidx.compose.ui.graphics.s0.t(l3Var.f0()));
        }
        if ((iX & 128) != 0) {
            this.f40812l.c0(androidx.compose.ui.graphics.s0.t(l3Var.L()));
        }
        if ((iX & 1024) != 0) {
            this.f40812l.m(l3Var.v());
        }
        if ((iX & 256) != 0) {
            this.f40812l.k(l3Var.D());
        }
        if ((iX & 512) != 0) {
            this.f40812l.l(l3Var.q());
        }
        if ((iX & 2048) != 0) {
            this.f40812l.j(l3Var.i());
        }
        if (i10 != 0) {
            this.f40812l.R(androidx.compose.ui.graphics.z3.k(this.f40811k) * this.f40812l.getWidth());
            this.f40812l.S(androidx.compose.ui.graphics.z3.l(this.f40811k) * this.f40812l.getHeight());
        }
        boolean z12 = l3Var.b() && l3Var.t3() != androidx.compose.ui.graphics.d3.a();
        if ((iX & 24576) != 0) {
            this.f40812l.V(z12);
            this.f40812l.G(l3Var.b() && l3Var.t3() == androidx.compose.ui.graphics.d3.a());
        }
        if ((131072 & iX) != 0) {
            this.f40812l.A(l3Var.g());
        }
        if ((262144 & iX) != 0) {
            this.f40812l.f(l3Var.e());
        }
        if ((524288 & iX) != 0) {
            this.f40812l.s(l3Var.t());
        }
        if ((32768 & iX) != 0) {
            this.f40812l.H(l3Var.T());
        }
        boolean zH = this.f40805e.h(l3Var.I(), l3Var.r(), z12, l3Var.a0(), l3Var.d());
        if (this.f40805e.c()) {
            this.f40812l.U(this.f40805e.b());
        }
        if (z12 && !this.f40805e.e()) {
            z10 = true;
        }
        if (z11 != z10 || (z10 && zH)) {
            invalidate();
        } else {
            q();
        }
        if (!this.f40807g && this.f40812l.d0() > 0.0f && (function0 = this.f40803c) != null) {
            function0.invoke();
        }
        if ((iX & androidx.compose.ui.graphics.k1.f37825u) != 0) {
            this.f40809i.c();
        }
        this.f40813m = l3Var.x();
    }

    @Override // androidx.compose.ui.node.w1
    public void invalidate() {
        if (this.f40804d || this.f40806f) {
            return;
        }
        this.f40801a.invalidate();
        p(true);
    }

    @Override // androidx.compose.ui.node.w1
    public void j(@NotNull float[] fArr) {
        float[] fArrA = this.f40809i.a(this.f40812l);
        if (fArrA != null) {
            androidx.compose.ui.graphics.c2.w(fArr, fArrA);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public void k(long j10) {
        int iY = this.f40812l.y();
        int iN = this.f40812l.n();
        int iN2 = androidx.compose.ui.unit.q.n(j10);
        int iP = androidx.compose.ui.unit.q.p(j10);
        if (iY == iN2 && iN == iP) {
            return;
        }
        if (iY != iN2) {
            this.f40812l.Q(iN2 - iY);
        }
        if (iN != iP) {
            this.f40812l.J(iP - iN);
        }
        q();
        this.f40809i.c();
    }

    @Override // androidx.compose.ui.node.w1
    public void l() {
        if (this.f40804d || !this.f40812l.a()) {
            androidx.compose.ui.graphics.k2 k2VarD = (!this.f40812l.N() || this.f40805e.e()) ? null : this.f40805e.d();
            Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2 = this.f40802b;
            if (function2 != null) {
                this.f40812l.b0(this.f40810j, k2VarD, new d(function2));
            }
            p(false);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public boolean m() {
        return this.f40815o;
    }

    @NotNull
    public final AndroidComposeView o() {
        return this.f40801a;
    }

    @Override // androidx.compose.ui.node.w1
    public void setFrameRate(float f10) {
        this.f40814n = f10;
    }

    @Override // androidx.compose.ui.node.w1
    public void setFrameRateFromParent(boolean z10) {
        this.f40815o = z10;
    }
}
