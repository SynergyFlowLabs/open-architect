package androidx.compose.ui.platform;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nGraphicsLayerOwnerLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,432:1\n30#2:433\n30#2:466\n80#3:434\n85#3:436\n90#3:438\n53#3,3:440\n60#3:444\n70#3:447\n85#3:450\n90#3:452\n53#3,3:454\n80#3:467\n60#3:475\n70#3:479\n54#4:435\n59#4:437\n54#4:449\n59#4:451\n30#5:439\n30#5:453\n278#5:472\n65#6:443\n69#6:446\n71#6:473\n65#6:474\n73#6:477\n69#6:478\n22#7:445\n22#7:448\n22#7:476\n78#8,5:457\n103#8,4:462\n1#9:468\n49#10:469\n52#10,2:470\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n*L\n62#1:433\n353#1:466\n62#1:434\n144#1:436\n145#1:438\n143#1:440,3\n217#1:444\n218#1:447\n265#1:450\n266#1:452\n264#1:454,3\n353#1:467\n406#1:475\n406#1:479\n144#1:435\n145#1:437\n265#1:449\n266#1:451\n143#1:439\n264#1:453\n407#1:472\n217#1:443\n218#1:446\n406#1:473\n406#1:474\n406#1:477\n406#1:478\n217#1:445\n218#1:448\n406#1:476\n330#1:457,5\n333#1:462,4\n386#1:469\n398#1:470,2\n*E\n"})
public final class j2 implements androidx.compose.ui.node.w1, androidx.compose.ui.layout.r {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f40567p1 = 8;
    private float X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.graphics.layer.c f40568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.o1 f40569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> f40571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f40572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f40573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40574g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private float[] f40576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40577j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f40581n;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.f2 f40584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f40585t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f40586v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final float[] f40575h = androidx.compose.ui.graphics.c2.c(null, 1, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f40578k = androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.w f40579l = androidx.compose.ui.unit.w.Ltr;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.drawscope.a f40580m = new androidx.compose.ui.graphics.drawscope.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f40582o = androidx.compose.ui.graphics.z3.f38723b.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40587w = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f40583p0 = new a();

    @SourceDebugExtension({"SMAP\nGraphicsLayerOwnerLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer$recordLambda$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n233#2:433\n1#3:434\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer$recordLambda$1\n*L\n275#1:433\n*E\n"})
    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {
        a() {
            super(1);
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar) {
            j2 j2Var = j2.this;
            androidx.compose.ui.graphics.k0 k0VarF = fVar.Z3().f();
            Function2 function2 = j2Var.f40571d;
            if (function2 != null) {
                function2.invoke(k0VarF, fVar.Z3().h());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            c(fVar);
            return Unit.f312394a;
        }
    }

    public j2(@NotNull androidx.compose.ui.graphics.layer.c cVar, @Nullable androidx.compose.ui.graphics.o1 o1Var, @NotNull AndroidComposeView androidComposeView, @NotNull Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2, @NotNull Function0<Unit> function0) {
        this.f40568a = cVar;
        this.f40569b = o1Var;
        this.f40570c = androidComposeView;
        this.f40571d = function2;
        this.f40572e = function0;
        long j10 = Integer.MAX_VALUE;
        this.f40573f = androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }

    private final float[] o() {
        float[] fArrC = this.f40576i;
        if (fArrC == null) {
            fArrC = androidx.compose.ui.graphics.c2.c(null, 1, null);
            this.f40576i = fArrC;
        }
        if (!this.f40586v) {
            if (Float.isNaN(fArrC[0])) {
                return null;
            }
            return fArrC;
        }
        this.f40586v = false;
        float[] fArrP = p();
        if (this.f40587w) {
            return fArrP;
        }
        if (v2.a(fArrP, fArrC)) {
            return fArrC;
        }
        fArrC[0] = Float.NaN;
        return null;
    }

    private final float[] p() {
        s();
        return this.f40575h;
    }

    private final void q(boolean z10) {
        if (z10 != this.f40577j) {
            this.f40577j = z10;
            this.f40570c.Z0(this, z10);
        }
    }

    private final void r() {
        e5.f40435a.a(this.f40570c);
    }

    private final void s() {
        if (this.f40585t) {
            androidx.compose.ui.graphics.layer.c cVar = this.f40568a;
            long jB = (cVar.x() & 9223372034707292159L) == n0.d.f332689d ? n0.o.b(androidx.compose.ui.unit.v.h(this.f40573f)) : cVar.x();
            androidx.compose.ui.graphics.c2.n(this.f40575h, Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a)), cVar.I(), cVar.J(), 1.0f, cVar.z(), cVar.A(), cVar.B(), cVar.C(), cVar.D(), 1.0f);
            this.f40585t = false;
            this.f40587w = androidx.compose.ui.graphics.d2.b(this.f40575h);
        }
    }

    private final void t() {
        Function0<Unit> function0;
        androidx.compose.ui.graphics.f2 f2Var = this.f40584s;
        if (f2Var == null) {
            return;
        }
        androidx.compose.ui.graphics.layer.e.b(this.f40568a, f2Var);
        if (!(f2Var instanceof androidx.compose.ui.graphics.f2.a) || Build.VERSION.SDK_INT >= 33 || (function0 = this.f40572e) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.compose.ui.node.w1
    public void a(@NotNull float[] fArr) {
        androidx.compose.ui.graphics.c2.w(fArr, p());
    }

    @Override // androidx.compose.ui.node.w1
    public void b(@NotNull Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2, @NotNull Function0<Unit> function0) {
        androidx.compose.ui.graphics.o1 o1Var = this.f40569b;
        if (o1Var == null) {
            s0.a.j("currently reuse is only supported when we manage the layer lifecycle");
            throw new kotlin.a0();
        }
        if (!this.f40568a.K()) {
            s0.a.g("layer should have been released before reuse");
        }
        this.f40568a = o1Var.b();
        this.f40574g = false;
        this.f40571d = function2;
        this.f40572e = function0;
        this.f40585t = false;
        this.f40586v = false;
        this.f40587w = true;
        androidx.compose.ui.graphics.c2.m(this.f40575h);
        float[] fArr = this.f40576i;
        if (fArr != null) {
            androidx.compose.ui.graphics.c2.m(fArr);
        }
        this.f40582o = androidx.compose.ui.graphics.z3.f38723b.a();
        this.Z = false;
        long j10 = Integer.MAX_VALUE;
        this.f40573f = androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
        this.f40584s = null;
        this.f40581n = 0;
    }

    @Override // androidx.compose.ui.node.w1
    public void c(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        l();
        this.Z = this.f40568a.E() > 0.0f;
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = this.f40580m.Z3();
        dVarZ3.k(k0Var);
        dVarZ3.j(cVar);
        androidx.compose.ui.graphics.layer.e.a(this.f40580m, this.f40568a);
    }

    @Override // androidx.compose.ui.node.w1
    public void d(@NotNull n0.e eVar, boolean z10) {
        float[] fArrO = z10 ? o() : p();
        if (!this.f40587w) {
            if (fArrO == null) {
                eVar.B(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            androidx.compose.ui.graphics.c2.l(fArrO, eVar);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public void destroy() {
        setFrameRate(0.0f);
        setFrameRateFromParent(false);
        this.f40571d = null;
        this.f40572e = null;
        this.f40574g = true;
        q(false);
        androidx.compose.ui.graphics.o1 o1Var = this.f40569b;
        if (o1Var != null) {
            o1Var.c(this.f40568a);
            this.f40570c.e1(this);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public long f(long j10, boolean z10) {
        float[] fArrP;
        if (z10) {
            fArrP = o();
            if (fArrP == null) {
                return n0.g.f332700b.a();
            }
        } else {
            fArrP = p();
        }
        return this.f40587w ? j10 : androidx.compose.ui.graphics.c2.j(fArrP, j10);
    }

    @Override // androidx.compose.ui.node.w1
    public void g(long j10) {
        if (androidx.compose.ui.unit.u.h(j10, this.f40573f)) {
            return;
        }
        if (this.f40570c.U0()) {
            this.f40570c.Q(androidx.compose.ui.q.f40995b.b());
        }
        this.f40573f = j10;
        invalidate();
    }

    @Override // androidx.compose.ui.node.w1
    public float getFrameRate() {
        return this.X;
    }

    @Override // androidx.compose.ui.layout.r
    public long getLayerId() {
        return this.f40568a.u();
    }

    @Override // androidx.compose.ui.layout.r
    public long getOwnerViewId() {
        return this.f40568a.w();
    }

    @Override // androidx.compose.ui.node.w1
    @NotNull
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo3getUnderlyingMatrixsQKQjiQ() {
        return p();
    }

    @Override // androidx.compose.ui.node.w1
    public boolean h(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        if (this.f40568a.p()) {
            return y3.c(this.f40568a.v(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.w1
    public void i(@NotNull androidx.compose.ui.graphics.l3 l3Var) {
        int iB;
        Function0<Unit> function0;
        int iX = l3Var.x() | this.f40581n;
        this.f40579l = l3Var.w();
        this.f40578k = l3Var.c();
        int i10 = iX & 4096;
        if (i10 != 0) {
            this.f40582o = l3Var.c6();
        }
        if ((iX & 1) != 0) {
            this.f40568a.n0(l3Var.B());
        }
        if ((iX & 2) != 0) {
            this.f40568a.o0(l3Var.F());
        }
        if ((iX & 4) != 0) {
            this.f40568a.V(l3Var.r());
        }
        if ((iX & 8) != 0) {
            this.f40568a.t0(l3Var.p());
        }
        if ((iX & 16) != 0) {
            this.f40568a.u0(l3Var.o());
        }
        if ((iX & 32) != 0) {
            this.f40568a.p0(l3Var.a0());
            if (l3Var.a0() > 0.0f && !this.Z && (function0 = this.f40572e) != null) {
                function0.invoke();
            }
        }
        if ((iX & 64) != 0) {
            this.f40568a.W(l3Var.f0());
        }
        if ((iX & 128) != 0) {
            this.f40568a.r0(l3Var.L());
        }
        if ((iX & 1024) != 0) {
            this.f40568a.k0(l3Var.v());
        }
        if ((iX & 256) != 0) {
            this.f40568a.i0(l3Var.D());
        }
        if ((iX & 512) != 0) {
            this.f40568a.j0(l3Var.q());
        }
        if ((iX & 2048) != 0) {
            this.f40568a.Y(l3Var.i());
        }
        if (i10 != 0) {
            if (androidx.compose.ui.graphics.z3.i(this.f40582o, androidx.compose.ui.graphics.z3.f38723b.a())) {
                this.f40568a.d0(n0.g.f332700b.c());
            } else {
                this.f40568a.d0(n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.z3.l(this.f40582o) * ((int) (this.f40573f & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.z3.k(this.f40582o) * ((int) (this.f40573f >> 32)))) << 32)));
            }
        }
        if ((iX & 16384) != 0) {
            this.f40568a.Z(l3Var.b());
        }
        if ((131072 & iX) != 0) {
            this.f40568a.h0(l3Var.g());
        }
        if ((262144 & iX) != 0) {
            this.f40568a.a0(l3Var.e());
        }
        if ((524288 & iX) != 0) {
            this.f40568a.X(l3Var.t());
        }
        if ((32768 & iX) != 0) {
            androidx.compose.ui.graphics.layer.c cVar = this.f40568a;
            int iT = l3Var.T();
            androidx.compose.ui.graphics.h1.a aVar = androidx.compose.ui.graphics.h1.f37790b;
            if (androidx.compose.ui.graphics.h1.g(iT, aVar.a())) {
                iB = androidx.compose.ui.graphics.layer.b.f37875b.a();
            } else if (androidx.compose.ui.graphics.h1.g(iT, aVar.c())) {
                iB = androidx.compose.ui.graphics.layer.b.f37875b.c();
            } else {
                if (!androidx.compose.ui.graphics.h1.g(iT, aVar.b())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iB = androidx.compose.ui.graphics.layer.b.f37875b.b();
            }
            cVar.b0(iB);
        }
        boolean z10 = true;
        if ((iX & androidx.compose.ui.graphics.k1.f37825u) != 0) {
            this.f40585t = true;
            this.f40586v = true;
        }
        if (Intrinsics.areEqual(this.f40584s, l3Var.I())) {
            z10 = false;
        } else {
            this.f40584s = l3Var.I();
            t();
        }
        this.f40581n = l3Var.x();
        if (iX != 0 || z10) {
            r();
            if (this.f40570c.U0()) {
                this.f40570c.Q(getFrameRate());
            }
        }
    }

    @Override // androidx.compose.ui.node.w1
    public void invalidate() {
        if (this.f40577j || this.f40574g) {
            return;
        }
        this.f40570c.invalidate();
        q(true);
    }

    @Override // androidx.compose.ui.node.w1
    public void j(@NotNull float[] fArr) {
        float[] fArrO = o();
        if (fArrO != null) {
            androidx.compose.ui.graphics.c2.w(fArr, fArrO);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public void k(long j10) {
        if (this.f40570c.U0()) {
            this.f40570c.Q(androidx.compose.ui.q.f40995b.b());
        }
        this.f40568a.s0(j10);
        r();
    }

    @Override // androidx.compose.ui.node.w1
    public void l() {
        if (this.f40570c.U0() && getFrameRate() != 0.0f) {
            this.f40570c.Q(getFrameRate());
        }
        if (this.f40577j) {
            if (!androidx.compose.ui.graphics.z3.i(this.f40582o, androidx.compose.ui.graphics.z3.f38723b.a()) && !androidx.compose.ui.unit.u.h(this.f40568a.F(), this.f40573f)) {
                androidx.compose.ui.graphics.layer.c cVar = this.f40568a;
                float fK = androidx.compose.ui.graphics.z3.k(this.f40582o) * ((int) (this.f40573f >> 32));
                cVar.d0(n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.z3.l(this.f40582o) * ((int) (this.f40573f & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fK) << 32)));
            }
            this.f40568a.P(this.f40578k, this.f40579l, this.f40573f, this.f40583p0);
            q(false);
        }
    }

    @Override // androidx.compose.ui.node.w1
    public boolean m() {
        return this.Y;
    }

    @Override // androidx.compose.ui.node.w1
    public void setFrameRate(float f10) {
        this.X = f10;
    }

    @Override // androidx.compose.ui.node.w1
    public void setFrameRateFromParent(boolean z10) {
        this.Y = z10;
    }
}
