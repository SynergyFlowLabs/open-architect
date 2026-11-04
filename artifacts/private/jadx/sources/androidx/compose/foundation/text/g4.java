package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1154:1\n113#2:1155\n85#3:1156\n117#3,2:1157\n85#3:1159\n117#3,2:1160\n85#3:1163\n117#3,2:1164\n85#3:1166\n117#3,2:1167\n85#3:1169\n117#3,2:1170\n85#3:1172\n117#3,2:1173\n85#3:1175\n117#3,2:1176\n85#3:1178\n117#3,2:1179\n85#3:1181\n117#3,2:1182\n85#3:1184\n117#3,2:1185\n85#3:1187\n117#3,2:1188\n85#3:1190\n117#3,2:1191\n1#4:1162\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n*L\n760#1:1155\n757#1:1156\n757#1:1157,2\n760#1:1159\n760#1:1160,2\n819#1:1163\n819#1:1164,2\n829#1:1166\n829#1:1167,2\n835#1:1169\n835#1:1170,2\n841#1:1172\n841#1:1173,2\n847#1:1175\n847#1:1176,2\n859#1:1178\n859#1:1179,2\n865#1:1181\n865#1:1182,2\n866#1:1184\n866#1:1185,2\n905#1:1187\n905#1:1188,2\n906#1:1190\n906#1:1191,2\n*E\n"})
public final class g4 {
    public static final int C = 8;

    @NotNull
    private final androidx.compose.runtime.n3 A;

    @NotNull
    private final androidx.compose.runtime.n3 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private i5 f19273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.q4 f19274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.platform.z3 f19275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.m f19276d = new androidx.compose.ui.text.input.m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.input.g1 f19277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g0 f19280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<y6> f19281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.f f19282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final x3 f19290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19292t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.text.input.y0, Unit> f19293u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.text.input.y0, Unit> f19294v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.text.input.t, Unit> f19295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.text.input.t, Boolean> f19296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.h2 f19297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f19298z;

    public g4(@NotNull i5 i5Var, @NotNull androidx.compose.runtime.q4 q4Var, @Nullable androidx.compose.ui.platform.z3 z3Var) {
        this.f19273a = i5Var;
        this.f19274b = q4Var;
        this.f19275c = z3Var;
        Boolean bool = Boolean.FALSE;
        this.f19278f = androidx.compose.runtime.d7.g(bool, null, 2, null);
        this.f19279g = androidx.compose.runtime.d7.g(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(0)), null, 2, null);
        this.f19281i = androidx.compose.runtime.d7.g(null, null, 2, null);
        this.f19283k = androidx.compose.runtime.d7.g(l3.None, null, 2, null);
        this.f19284l = androidx.compose.runtime.d7.g(bool, null, 2, null);
        this.f19285m = androidx.compose.runtime.d7.g(bool, null, 2, null);
        this.f19286n = androidx.compose.runtime.d7.g(bool, null, 2, null);
        this.f19287o = androidx.compose.runtime.d7.g(bool, null, 2, null);
        this.f19288p = true;
        this.f19289q = androidx.compose.runtime.d7.g(Boolean.TRUE, null, 2, null);
        this.f19290r = new x3(z3Var);
        this.f19291s = androidx.compose.runtime.d7.g(bool, null, 2, null);
        this.f19292t = androidx.compose.runtime.d7.g(bool, null, 2, null);
        this.f19293u = new Function1() { // from class: androidx.compose.foundation.text.c4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g4.I((androidx.compose.ui.text.input.y0) obj);
            }
        };
        this.f19294v = new Function1() { // from class: androidx.compose.foundation.text.d4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g4.H(this.f19168a, (androidx.compose.ui.text.input.y0) obj);
            }
        };
        this.f19295w = new Function1() { // from class: androidx.compose.foundation.text.e4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g4.F(this.f19192a, (androidx.compose.ui.text.input.t) obj);
            }
        };
        this.f19296x = new Function1() { // from class: androidx.compose.foundation.text.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(g4.G(this.f19232a, (androidx.compose.ui.text.input.t) obj));
            }
        };
        this.f19297y = androidx.compose.ui.graphics.m.a();
        this.f19298z = androidx.compose.ui.graphics.q0.f38131b.u();
        androidx.compose.ui.text.w3.a aVar = androidx.compose.ui.text.w3.f42333b;
        this.A = androidx.compose.runtime.d7.g(androidx.compose.ui.text.w3.b(aVar.a()), null, 2, null);
        this.B = androidx.compose.runtime.d7.g(androidx.compose.ui.text.w3.b(aVar.a()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(g4 g4Var, androidx.compose.ui.text.input.t tVar) {
        g4Var.f19290r.e(tVar.p());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(g4 g4Var, androidx.compose.ui.text.input.t tVar) {
        return g4Var.f19290r.e(tVar.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(g4 g4Var, androidx.compose.ui.text.input.y0 y0Var) {
        String strM = y0Var.m();
        androidx.compose.ui.text.f fVar = g4Var.f19282j;
        if (!Intrinsics.areEqual(strM, fVar != null ? fVar.m() : null)) {
            g4Var.L(l3.None);
            if (g4Var.k()) {
                g4Var.P(false);
            } else {
                g4Var.J(false);
            }
        }
        androidx.compose.ui.text.w3.a aVar = androidx.compose.ui.text.w3.f42333b;
        g4Var.U(aVar.a());
        g4Var.K(aVar.a());
        g4Var.f19293u.invoke(y0Var);
        g4Var.f19274b.invalidate();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(androidx.compose.ui.text.input.y0 y0Var) {
        return Unit.f312394a;
    }

    @NotNull
    public final i5 A() {
        return this.f19273a;
    }

    @Nullable
    public final androidx.compose.ui.text.f B() {
        return this.f19282j;
    }

    public final boolean C() {
        return (androidx.compose.ui.text.w3.h(v()) && androidx.compose.ui.text.w3.h(f())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D() {
        return ((Boolean) this.f19289q.getValue()).booleanValue();
    }

    public final boolean E() {
        return this.f19288p;
    }

    public final void J(boolean z10) {
        this.f19291s.setValue(Boolean.valueOf(z10));
    }

    public final void K(long j10) {
        this.B.setValue(androidx.compose.ui.text.w3.b(j10));
    }

    public final void L(@NotNull l3 l3Var) {
        this.f19283k.setValue(l3Var);
    }

    public final void M(boolean z10) {
        this.f19278f.setValue(Boolean.valueOf(z10));
    }

    public final void N(boolean z10) {
        this.f19289q.setValue(Boolean.valueOf(z10));
    }

    public final void O(@Nullable androidx.compose.ui.text.input.g1 g1Var) {
        this.f19277e = g1Var;
    }

    public final void P(boolean z10) {
        this.f19292t.setValue(Boolean.valueOf(z10));
    }

    public final void Q(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f19280h = g0Var;
    }

    public final void R(@Nullable y6 y6Var) {
        this.f19281i.setValue(y6Var);
        this.f19288p = false;
    }

    public final void S(float f10) {
        this.f19279g.setValue(androidx.compose.ui.unit.h.o(f10));
    }

    public final void T(long j10) {
        this.f19298z = j10;
    }

    public final void U(long j10) {
        this.A.setValue(androidx.compose.ui.text.w3.b(j10));
    }

    public final void V(boolean z10) {
        this.f19287o.setValue(Boolean.valueOf(z10));
    }

    public final void W(boolean z10) {
        this.f19284l.setValue(Boolean.valueOf(z10));
    }

    public final void X(boolean z10) {
        this.f19286n.setValue(Boolean.valueOf(z10));
    }

    public final void Y(boolean z10) {
        this.f19285m.setValue(Boolean.valueOf(z10));
    }

    public final void Z(@NotNull i5 i5Var) {
        this.f19273a = i5Var;
    }

    public final void a0(@Nullable androidx.compose.ui.text.f fVar) {
        this.f19282j = fVar;
    }

    public final void b0(@NotNull androidx.compose.ui.text.f fVar, @NotNull androidx.compose.ui.text.f fVar2, @NotNull androidx.compose.ui.text.y3 y3Var, boolean z10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, @NotNull z3 z3Var, @NotNull androidx.compose.ui.focus.q qVar, long j10) {
        this.f19293u = function1;
        this.f19298z = j10;
        x3 x3Var = this.f19290r;
        x3Var.g(z3Var);
        x3Var.f(qVar);
        this.f19282j = fVar;
        i5 i5VarC = j5.c(this.f19273a, fVar2, y3Var, dVar, bVar, z10, 0, 0, 0, CollectionsKt.emptyList(), 448, null);
        if (this.f19273a != i5VarC) {
            this.f19288p = true;
        }
        this.f19273a = i5VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        return ((Boolean) this.f19291s.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f() {
        return ((androidx.compose.ui.text.w3) this.B.getValue()).r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final l3 g() {
        return (l3) this.f19283k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        return ((Boolean) this.f19278f.getValue()).booleanValue();
    }

    @NotNull
    public final androidx.compose.ui.graphics.h2 i() {
        return this.f19297y;
    }

    @Nullable
    public final androidx.compose.ui.text.input.g1 j() {
        return this.f19277e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        return ((Boolean) this.f19292t.getValue()).booleanValue();
    }

    @Nullable
    public final androidx.compose.ui.platform.z3 l() {
        return this.f19275c;
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 m() {
        androidx.compose.ui.layout.g0 g0Var = this.f19280h;
        if (g0Var == null || !g0Var.I()) {
            return null;
        }
        return g0Var;
    }

    @Nullable
    public final y6 n() {
        return this.f19281i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float o() {
        return ((androidx.compose.ui.unit.h) this.f19279g.getValue()).O();
    }

    @NotNull
    public final Function1<androidx.compose.ui.text.input.t, Unit> p() {
        return this.f19295w;
    }

    @NotNull
    public final Function1<androidx.compose.ui.text.input.t, Boolean> q() {
        return this.f19296x;
    }

    @NotNull
    public final Function1<androidx.compose.ui.text.input.y0, Unit> r() {
        return this.f19294v;
    }

    @NotNull
    public final androidx.compose.ui.text.input.m s() {
        return this.f19276d;
    }

    @NotNull
    public final androidx.compose.runtime.q4 t() {
        return this.f19274b;
    }

    public final long u() {
        return this.f19298z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long v() {
        return ((androidx.compose.ui.text.w3) this.A.getValue()).r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        return ((Boolean) this.f19287o.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        return ((Boolean) this.f19284l.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        return ((Boolean) this.f19286n.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        return ((Boolean) this.f19285m.getValue()).booleanValue();
    }
}
