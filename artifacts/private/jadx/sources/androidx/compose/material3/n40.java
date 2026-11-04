package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2045:1\n1282#2,6:2046\n1#3:2052\n113#4:2053\n113#4:2056\n113#4:2057\n113#4:2058\n113#4:2059\n75#5:2054\n75#5:2055\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n404#1:2046,6\n470#1:2053\n75#1:2056\n81#1:2057\n84#1:2058\n87#1:2059\n479#1:2054\n582#1:2055\n*E\n"})
public final class n40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n40 f30917a = new n40();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f30918b = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f30919c = androidx.compose.ui.unit.h.r(280);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f30920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f30921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f30922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f30923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f30924h = 0;

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f30927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j40 f30928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f30929e;

        b(boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var) {
            this.f30925a = z10;
            this.f30926b = z11;
            this.f30927c = hVar;
            this.f30928d = j40Var;
            this.f30929e = q3Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(417908150, i10, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:390)");
            }
            n40 n40Var = n40.f30917a;
            n40Var.d(this.f30925a, this.f30926b, this.f30927c, androidx.compose.ui.a0.E, this.f30928d, this.f30929e, n40Var.v(), n40Var.D(), c0Var, 114822144, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements pj.n<w40, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30930a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f30930a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(w40 w40Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1110058497, i10, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:415)");
            }
            this.f30930a.invoke(c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(w40 w40Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(w40Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f30933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j40 f30934d;

        d(boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var) {
            this.f30931a = z10;
            this.f30932b = z11;
            this.f30933c = hVar;
            this.f30934d = j40Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(245572296, i10, -1, "androidx.compose.material3.TextFieldDefaults.decorator.<anonymous> (TextFieldDefaults.kt:168)");
            }
            n40 n40Var = n40.f30917a;
            boolean z10 = true & false;
            n40Var.d(this.f30931a, this.f30932b, this.f30933c, null, this.f30934d, n40Var.A(c0Var, 6), n40Var.v(), n40Var.D(), c0Var, 114819072, 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults$decorator$2\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2045:1\n170#2,8:2046\n1#3:2054\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults$decorator$2\n*L\n186#1:2046,8\n*E\n"})
    static final class e implements androidx.compose.foundation.text.input.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.h f30935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.p f30936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.o f30937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v40 f30938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.n<w40, androidx.compose.runtime.c0, Integer, Unit> f30939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30940f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30941g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30942h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30943i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30944j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30945k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f30946l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f30947m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f30948n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.g5 f30949o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j40 f30950p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30951q;

        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.foundation.text.input.h hVar, androidx.compose.foundation.text.input.p pVar, androidx.compose.foundation.text.input.o oVar, v40 v40Var, pj.n<? super w40, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar2, androidx.compose.foundation.layout.g5 g5Var, j40 j40Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8) {
            this.f30935a = hVar;
            this.f30936b = pVar;
            this.f30937c = oVar;
            this.f30938d = v40Var;
            this.f30939e = nVar;
            this.f30940f = function2;
            this.f30941g = function3;
            this.f30942h = function4;
            this.f30943i = function5;
            this.f30944j = function6;
            this.f30945k = function7;
            this.f30946l = z10;
            this.f30947m = z11;
            this.f30948n = hVar2;
            this.f30949o = g5Var;
            this.f30950p = j40Var;
            this.f30951q = function8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(e eVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
            eVar.a(function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
            return Unit.f312394a;
        }

        @Override // androidx.compose.foundation.text.input.n
        @androidx.compose.runtime.o
        @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void a(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
            int i11;
            androidx.compose.runtime.c0 c0Var2;
            androidx.compose.foundation.text.input.j jVar;
            CharSequence charSequenceE;
            androidx.compose.runtime.c0 c0VarR = c0Var.R(-94654579);
            if ((i10 & 6) == 0) {
                i11 = i10 | (c0VarR.k0(function2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= c0VarR.D(this) ? 32 : 16;
            }
            if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-94654579, i11, -1, "androidx.compose.material3.TextFieldDefaults.decorator.<no name provided>.Decoration (TextFieldDefaults.kt:179)");
                }
                if (this.f30935a == null) {
                    charSequenceE = this.f30936b.p();
                } else {
                    androidx.compose.foundation.text.input.p pVar = this.f30936b;
                    androidx.compose.foundation.text.input.j jVarA = pVar.A();
                    try {
                        pVar.d(jVarA);
                        pVar.k();
                        androidx.compose.foundation.text.input.h hVar = this.f30935a;
                        if (jVarA == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("buffer");
                            jVar = null;
                        } else {
                            jVar = jVarA;
                        }
                        hVar.a(jVar);
                        charSequenceE = jVarA.e();
                    } catch (Throwable th2) {
                        pVar.k();
                        throw th2;
                    }
                }
                c0Var2 = c0VarR;
                androidx.compose.material3.internal.b4.l(androidx.compose.material3.internal.f4.Filled, charSequenceE, function2, this.f30938d, this.f30939e, this.f30940f, this.f30941g, this.f30942h, this.f30943i, this.f30944j, this.f30945k, Intrinsics.areEqual(this.f30937c, androidx.compose.foundation.text.input.o.c.f20303b), this.f30946l, this.f30947m, this.f30948n, this.f30949o, this.f30950p, this.f30951q, c0Var2, ((i11 << 6) & 896) | 6, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
            }
            androidx.compose.runtime.s5 s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.o40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n40.e.c(this.f31278a, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }

    static final class f implements androidx.compose.ui.graphics.x0, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function0 f30952a;

        f(Function0 function0) {
            this.f30952a = function0;
        }

        @Override // androidx.compose.ui.graphics.x0
        public final /* synthetic */ long a() {
            return ((androidx.compose.ui.graphics.q0) this.f30952a.invoke()).M();
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f30952a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.compose.ui.graphics.x0) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    static {
        int i10 = 6 & 1;
        float fR = androidx.compose.ui.unit.h.r(1);
        f30920d = fR;
        float fR2 = androidx.compose.ui.unit.h.r(2);
        f30921e = fR2;
        f30922f = fR;
        f30923g = fR2;
    }

    private n40() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @kotlin.b1(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ androidx.compose.ui.a0 F(n40 n40Var, androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            j40Var = null;
        }
        if ((i10 & 16) != 0) {
            q3Var = null;
        }
        if ((i10 & 32) != 0) {
            f10 = f30921e;
        }
        if ((i10 & 64) != 0) {
            f11 = f30920d;
        }
        return n40Var.E(a0Var, z10, z11, hVar, j40Var, q3Var, f10, f11);
    }

    public static /* synthetic */ androidx.compose.ui.a0 H(n40 n40Var, androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            f10 = f30921e;
        }
        return n40Var.G(a0Var, z10, z11, hVar, j40Var, f10, (i10 & 32) != 0 ? f30920d : f11);
    }

    public static /* synthetic */ androidx.compose.foundation.layout.g5 J(n40 n40Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.material3.internal.b4.M();
        }
        return n40Var.I(f10, f11, f12, f13);
    }

    public static /* synthetic */ androidx.compose.foundation.layout.g5 L(n40 n40Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.material3.internal.b4.L();
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.r(0);
        }
        return n40Var.K(f10, f11, f12, f13);
    }

    public static /* synthetic */ androidx.compose.foundation.layout.g5 N(n40 n40Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 4) != 0) {
            f12 = u40.o();
        }
        if ((i10 & 8) != 0) {
            f13 = u40.o();
        }
        return n40Var.M(f10, f11, f12, f13);
    }

    public static /* synthetic */ androidx.compose.foundation.layout.g5 P(n40 n40Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.material3.internal.b4.M();
        }
        return n40Var.O(f10, f11, f12, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(n40 n40Var, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        n40Var.e(z10, z11, hVar, j40Var, q3Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(n40 n40Var, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, androidx.compose.ui.a0 a0Var, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        n40Var.d(z10, z11, hVar, a0Var, j40Var, q3Var, f10, f11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(n40 n40Var, String str, Function2 function2, boolean z10, boolean z11, androidx.compose.ui.text.input.j1 j1Var, androidx.compose.foundation.interaction.h hVar, boolean z12, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, Function2 function9, androidx.compose.ui.graphics.q3 q3Var, j40 j40Var, androidx.compose.foundation.layout.g5 g5Var, Function2 function10, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        n40Var.h(str, function2, z10, z11, j1Var, hVar, z12, function3, function4, function5, function6, function7, function8, function9, q3Var, j40Var, g5Var, function10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    public static /* synthetic */ androidx.compose.foundation.layout.g5 m(n40 n40Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 4) != 0) {
            f12 = u40.o();
        }
        if ((i10 & 8) != 0) {
            f13 = u40.o();
        }
        return n40Var.l(f10, f11, f12, f13);
    }

    public static /* synthetic */ androidx.compose.foundation.layout.g5 o(n40 n40Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.material3.internal.b4.M();
        }
        return n40Var.n(f10, f11, f12, f13);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @kotlin.b1(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void s() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @kotlin.b1(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    public static /* synthetic */ void u() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @kotlin.b1(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void z() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 A(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1941327459, i10, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:68)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.v0.f269078a.e(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    public final float B() {
        return f30922f;
    }

    public final float D() {
        return f30920d;
    }

    @NotNull
    public final androidx.compose.ui.a0 E(@NotNull androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable j40 j40Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, float f11) {
        return a0Var.B2(new IndicatorLineElement(z10, z11, hVar, j40Var, q3Var, f10, f11, null));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility. Use overload with `textFieldShape`.")
    @af
    public final /* synthetic */ androidx.compose.ui.a0 G(androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, float f10, float f11) {
        return E(a0Var, z10, z11, hVar, j40Var, null, f10, f11);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @kotlin.b1(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @NotNull
    public final androidx.compose.foundation.layout.g5 I(float f10, float f11, float f12, float f13) {
        return lq.f30410a.l(f10, f11, f12, f13);
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 K(float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.layout.d5.i(f10, f11, f12, f13);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @kotlin.b1(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    public final androidx.compose.foundation.layout.g5 M(float f10, float f11, float f12, float f13) {
        return l(f10, f11, f12, f13);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @kotlin.b1(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    public final androidx.compose.foundation.layout.g5 O(float f10, float f11, float f12, float f13) {
        return n(f10, f11, f12, f13);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0110  */
    /* JADX WARN: Code duplicated, block: B:101:0x0112  */
    /* JADX WARN: Code duplicated, block: B:104:0x011b  */
    /* JADX WARN: Code duplicated, block: B:122:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x015d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0164  */
    /* JADX WARN: Code duplicated, block: B:127:0x016f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0175  */
    /* JADX WARN: Code duplicated, block: B:131:0x017e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0183  */
    /* JADX WARN: Code duplicated, block: B:135:0x0188  */
    /* JADX WARN: Code duplicated, block: B:138:0x018d  */
    /* JADX WARN: Code duplicated, block: B:139:0x019e  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x020e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0219  */
    /* JADX WARN: Code duplicated, block: B:150:0x022f  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x0104  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void d(final boolean z10, final boolean z11, @NotNull final androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable j40 j40Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.graphics.q3 q3Var2;
        float f12;
        float f13;
        int i13;
        boolean z12;
        final j40 j40Var2;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final float f14;
        final float f15;
        androidx.compose.runtime.s5 s5VarT;
        j40 j40VarJ;
        androidx.compose.ui.graphics.q3 q3VarA;
        float f16;
        j40 j40Var3;
        androidx.compose.ui.a0 a0Var4;
        float f17;
        int i14;
        float f18;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-818661242);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z11) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.D(hVar) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c0VarR.D(j40Var)) ? 8192 : 16384;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    q3Var2 = q3Var;
                    int i16 = c0VarR.D(q3Var2) ? 131072 : 65536;
                    i12 |= i16;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i16;
            } else {
                q3Var2 = q3Var;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    f12 = f10;
                    int i17 = c0VarR.I(f12) ? 1048576 : 524288;
                    i12 |= i17;
                } else {
                    f12 = f10;
                }
                i12 |= i17;
            } else {
                f12 = f10;
            }
            if ((12582912 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    f13 = f11;
                    int i18 = c0VarR.I(f13) ? 8388608 : 4194304;
                    i12 |= i18;
                } else {
                    f13 = f11;
                }
                i12 |= i18;
            } else {
                f13 = f11;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i13 = 67108864;
                } else {
                    i13 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i13;
            }
            if ((38347923 & i12) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i15 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 16) != 0) {
                        j40VarJ = j(c0VarR, (i12 >> 24) & 14);
                        i12 &= -57345;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 64) != 0) {
                        f16 = f30921e;
                        i12 &= -3670017;
                    } else {
                        f16 = f12;
                    }
                    if ((i11 & 128) != 0) {
                        int i19 = i12 & (-29360129);
                        j40Var3 = j40VarJ;
                        a0Var4 = a0Var2;
                        f17 = f16;
                        i14 = i19;
                        f18 = f30920d;
                    } else {
                        int i20 = i12;
                        j40Var3 = j40VarJ;
                        a0Var4 = a0Var2;
                        f17 = f16;
                        i14 = i20;
                        f18 = f13;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                    }
                    a0Var4 = a0Var2;
                    q3VarA = q3Var2;
                    f17 = f12;
                    f18 = f13;
                    i14 = i12;
                    j40Var3 = j40Var;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-818661242, i14, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:241)");
                }
                androidx.compose.ui.a0 a0VarO = androidx.compose.material3.internal.b4.O(a0Var4, new f(new kotlin.jvm.internal.c1(androidx.compose.animation.e1.c(j40Var3.b(z10, z11, androidx.compose.foundation.interaction.d.a(hVar, c0VarR, (i14 >> 6) & 14).getValue().booleanValue()), hm.b(d0.h1.FastEffects, c0VarR, 6), null, null, c0VarR, 0, 12)) { // from class: androidx.compose.material3.n40.a
                    @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                    public Object get() {
                        return ((androidx.compose.runtime.n7) this.receiver).getValue();
                    }
                }), q3VarA);
                androidx.compose.ui.a0 a0Var5 = a0Var4;
                j40 j40Var4 = j40Var3;
                androidx.compose.ui.graphics.q3 q3Var4 = q3VarA;
                float f19 = f17;
                float f20 = f18;
                androidx.compose.foundation.layout.x.b(E(a0VarO, z10, z11, hVar, j40Var4, q3Var4, f19, f20), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                f15 = f20;
                f14 = f19;
                q3Var3 = q3Var4;
                j40Var2 = j40Var4;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                j40Var2 = j40Var;
                a0Var3 = a0Var2;
                c0Var2 = c0VarR;
                q3Var3 = q3Var2;
                f14 = f12;
                f15 = f13;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.m40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n40.g(this.f30531a, z10, z11, hVar, a0Var3, j40Var2, q3Var3, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        if ((i10 & 24576) != 0) {
            i12 |= ((i11 & 16) == 0 || !c0VarR.D(j40Var)) ? 8192 : 16384;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i16;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i16;
        } else {
            q3Var2 = q3Var;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                f12 = f10;
                if (c0VarR.I(f12)) {
                }
                i12 |= i17;
            } else {
                f12 = f10;
            }
            i12 |= i17;
        } else {
            f12 = f10;
        }
        if ((12582912 & i10) == 0) {
            if ((i11 & 128) == 0) {
                f13 = f11;
                if (c0VarR.I(f13)) {
                }
                i12 |= i18;
            } else {
                f13 = f11;
            }
            i12 |= i18;
        } else {
            f13 = f11;
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.D(this)) {
                i13 = 67108864;
            } else {
                i13 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i12 |= i13;
        }
        if ((38347923 & i12) != 38347922) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 16) != 0) {
                    j40VarJ = j(c0VarR, (i12 >> 24) & 14);
                    i12 &= -57345;
                } else {
                    j40VarJ = j40Var;
                }
                if ((i11 & 32) != 0) {
                    q3VarA = f30917a.A(c0VarR, 6);
                    i12 &= -458753;
                } else {
                    q3VarA = q3Var2;
                }
                if ((i11 & 64) != 0) {
                    f16 = f30921e;
                    i12 &= -3670017;
                } else {
                    f16 = f12;
                }
                if ((i11 & 128) != 0) {
                    int i110 = i12 & (-29360129);
                    j40Var3 = j40VarJ;
                    a0Var4 = a0Var2;
                    f17 = f16;
                    i14 = i110;
                    f18 = f30920d;
                } else {
                    int i21 = i12;
                    j40Var3 = j40VarJ;
                    a0Var4 = a0Var2;
                    f17 = f16;
                    i14 = i21;
                    f18 = f13;
                }
            } else {
                if (i15 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 16) != 0) {
                    j40VarJ = j(c0VarR, (i12 >> 24) & 14);
                    i12 &= -57345;
                } else {
                    j40VarJ = j40Var;
                }
                if ((i11 & 32) != 0) {
                    q3VarA = f30917a.A(c0VarR, 6);
                    i12 &= -458753;
                } else {
                    q3VarA = q3Var2;
                }
                if ((i11 & 64) != 0) {
                    f16 = f30921e;
                    i12 &= -3670017;
                } else {
                    f16 = f12;
                }
                if ((i11 & 128) != 0) {
                    int i111 = i12 & (-29360129);
                    j40Var3 = j40VarJ;
                    a0Var4 = a0Var2;
                    f17 = f16;
                    i14 = i111;
                    f18 = f30920d;
                } else {
                    int i22 = i12;
                    j40Var3 = j40VarJ;
                    a0Var4 = a0Var2;
                    f17 = f16;
                    i14 = i22;
                    f18 = f13;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-818661242, i14, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:241)");
            }
            androidx.compose.ui.a0 a0VarO2 = androidx.compose.material3.internal.b4.O(a0Var4, new f(new kotlin.jvm.internal.c1(androidx.compose.animation.e1.c(j40Var3.b(z10, z11, androidx.compose.foundation.interaction.d.a(hVar, c0VarR, (i14 >> 6) & 14).getValue().booleanValue()), hm.b(d0.h1.FastEffects, c0VarR, 6), null, null, c0VarR, 0, 12)) { // from class: androidx.compose.material3.n40.a
                @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                public Object get() {
                    return ((androidx.compose.runtime.n7) this.receiver).getValue();
                }
            }), q3VarA);
            androidx.compose.ui.a0 a0Var6 = a0Var4;
            j40 j40Var5 = j40Var3;
            androidx.compose.ui.graphics.q3 q3Var5 = q3VarA;
            float f110 = f17;
            float f21 = f18;
            androidx.compose.foundation.layout.x.b(E(a0VarO2, z10, z11, hVar, j40Var5, q3Var5, f110, f21), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var2 = c0VarR;
            f15 = f21;
            f14 = f110;
            q3Var3 = q3Var5;
            j40Var2 = j40Var5;
            a0Var3 = a0Var6;
        } else {
            c0VarR.u();
            j40Var2 = j40Var;
            a0Var3 = a0Var2;
            c0Var2 = c0VarR;
            q3Var3 = q3Var2;
            f14 = f12;
            f15 = f13;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.m40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n40.g(this.f30531a, z10, z11, hVar, a0Var3, j40Var2, q3Var3, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Renamed to TextFieldDefaults.Container", replaceWith = @kotlin.b1(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n)", imports = {}))
    @af
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.o
    public final void e(final boolean z10, final boolean z11, @NotNull final androidx.compose.foundation.interaction.h hVar, @NotNull final j40 j40Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        boolean z13;
        androidx.compose.foundation.interaction.h hVar2;
        j40 j40Var2;
        androidx.compose.ui.graphics.q3 q3VarA;
        n40 n40Var;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.graphics.q3 q3Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(918564008);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            z13 = z11;
        } else {
            z13 = z11;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.G(z13) ? 32 : 16;
            }
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
            hVar2 = hVar;
        } else {
            hVar2 = hVar;
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i12 |= c0VarR.D(hVar2) ? 256 : 128;
            }
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            j40Var2 = j40Var;
        } else {
            j40Var2 = j40Var;
            if ((i10 & 3072) == 0) {
                i12 |= c0VarR.D(j40Var2) ? 2048 : 1024;
            }
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3VarA = q3Var;
                int i13 = c0VarR.D(q3VarA) ? 16384 : 8192;
                i12 |= i13;
            } else {
                q3VarA = q3Var;
            }
            i12 |= i13;
        } else {
            q3VarA = q3Var;
        }
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            n40Var = this;
        } else {
            n40Var = this;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i12 |= c0VarR.D(n40Var) ? 131072 : 65536;
            }
        }
        if (c0VarR.h((74899 & i12) != 74898, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                q3VarA = f30917a.A(c0VarR, 6);
                i12 &= -57345;
            }
            androidx.compose.ui.graphics.q3 q3Var3 = q3VarA;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(918564008, i12, -1, "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:761)");
            }
            int i14 = i12 << 3;
            c0Var2 = c0VarR;
            n40Var.d(z12, z13, hVar2, androidx.compose.ui.a0.E, j40Var2, q3Var3, f30921e, f30920d, c0Var2, (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (57344 & i14) | (i14 & 458752) | ((i12 << 9) & 234881024), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            q3Var2 = q3Var3;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            q3Var2 = q3VarA;
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.l40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n40.f(this.f30228a, z10, z11, hVar, j40Var, q3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131  */
    /* JADX WARN: Code duplicated, block: B:105:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:123:0x017a  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0188  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0190  */
    /* JADX WARN: Code duplicated, block: B:133:0x019f  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x0200  */
    /* JADX WARN: Code duplicated, block: B:164:0x0208  */
    /* JADX WARN: Code duplicated, block: B:166:0x0211  */
    /* JADX WARN: Code duplicated, block: B:169:0x021a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0221  */
    /* JADX WARN: Code duplicated, block: B:174:0x0229  */
    /* JADX WARN: Code duplicated, block: B:176:0x022f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0238  */
    /* JADX WARN: Code duplicated, block: B:181:0x023d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0245  */
    /* JADX WARN: Code duplicated, block: B:185:0x024a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0252  */
    /* JADX WARN: Code duplicated, block: B:189:0x0258  */
    /* JADX WARN: Code duplicated, block: B:190:0x025b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0265  */
    /* JADX WARN: Code duplicated, block: B:195:0x0268  */
    /* JADX WARN: Code duplicated, block: B:197:0x026c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0272  */
    /* JADX WARN: Code duplicated, block: B:200:0x0275  */
    /* JADX WARN: Code duplicated, block: B:204:0x0289  */
    /* JADX WARN: Code duplicated, block: B:208:0x0297  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:226:0x02f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:229:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:231:0x0301  */
    /* JADX WARN: Code duplicated, block: B:232:0x0303  */
    /* JADX WARN: Code duplicated, block: B:234:0x0309  */
    /* JADX WARN: Code duplicated, block: B:235:0x030b  */
    /* JADX WARN: Code duplicated, block: B:237:0x030f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0312  */
    /* JADX WARN: Code duplicated, block: B:240:0x0316  */
    /* JADX WARN: Code duplicated, block: B:241:0x0319  */
    /* JADX WARN: Code duplicated, block: B:243:0x031d  */
    /* JADX WARN: Code duplicated, block: B:244:0x0320  */
    /* JADX WARN: Code duplicated, block: B:246:0x0324  */
    /* JADX WARN: Code duplicated, block: B:247:0x0327  */
    /* JADX WARN: Code duplicated, block: B:250:0x032d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0339  */
    /* JADX WARN: Code duplicated, block: B:254:0x0342  */
    /* JADX WARN: Code duplicated, block: B:255:0x0352  */
    /* JADX WARN: Code duplicated, block: B:258:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x035e  */
    /* JADX WARN: Code duplicated, block: B:260:0x037d  */
    /* JADX WARN: Code duplicated, block: B:262:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:264:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:266:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:269:0x040a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:272:0x0417  */
    /* JADX WARN: Code duplicated, block: B:273:0x0419  */
    /* JADX WARN: Code duplicated, block: B:276:0x0427  */
    /* JADX WARN: Code duplicated, block: B:279:0x0431  */
    /* JADX WARN: Code duplicated, block: B:283:0x043c  */
    /* JADX WARN: Code duplicated, block: B:286:0x0477  */
    /* JADX WARN: Code duplicated, block: B:287:0x0487  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:290:0x0509  */
    /* JADX WARN: Code duplicated, block: B:292:0x0529  */
    /* JADX WARN: Code duplicated, block: B:295:0x054c  */
    /* JADX WARN: Code duplicated, block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void h(@NotNull final String str, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final boolean z10, final boolean z11, @NotNull final androidx.compose.ui.text.input.j1 j1Var, @NotNull final androidx.compose.foundation.interaction.h hVar, boolean z12, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable j40 j40Var, @Nullable androidx.compose.foundation.layout.g5 g5Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        int i16;
        int i17;
        androidx.compose.foundation.interaction.h hVar2;
        int i18;
        int i19;
        boolean z15;
        int i20;
        int i21;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        boolean z16;
        androidx.compose.runtime.c0 c0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final j40 j40Var2;
        final androidx.compose.foundation.layout.g5 g5Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18;
        final boolean z17;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function20;
        androidx.compose.runtime.s5 s5VarT;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function21;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function22;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function23;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function24;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function25;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function26;
        androidx.compose.ui.graphics.q3 q3VarA;
        j40 j40VarJ;
        androidx.compose.foundation.layout.g5 g5VarM;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function27;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E;
        androidx.compose.ui.graphics.q3 q3Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function28;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function29;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function30;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function31;
        boolean z18;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function32;
        androidx.compose.foundation.layout.g5 g5Var3;
        boolean z19;
        boolean z20;
        Object objI0;
        androidx.compose.runtime.internal.c cVar;
        int i42;
        int i43;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1806980801);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.D(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & 48) == 0) {
                function11 = function2;
                i13 |= c0VarR.k0(function11) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z13 = z10;
                    if (c0VarR.G(z13)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
                if ((i12 & 8) != 0) {
                    if ((i10 & 3072) == 0) {
                        z14 = z11;
                        if (c0VarR.G(z14)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i13 |= i15;
                    }
                    i16 = 8192;
                    if ((i12 & 16) != 0) {
                        i13 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (c0VarR.D(j1Var)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 32) != 0) {
                        if ((196608 & i10) == 0) {
                            hVar2 = hVar;
                            if (c0VarR.D(hVar2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i13 |= i18;
                        }
                        i19 = i12 & 64;
                        if (i19 != 0) {
                            i13 |= 1572864;
                            z15 = z12;
                        } else {
                            z15 = z12;
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.G(z15)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                                i13 |= i20;
                            }
                        }
                        i21 = i12 & 128;
                        if (i21 != 0) {
                            i13 |= 12582912;
                            function12 = function3;
                        } else {
                            function12 = function3;
                            if ((i10 & 12582912) == 0) {
                                if (c0VarR.k0(function12)) {
                                    i22 = 8388608;
                                } else {
                                    i22 = 4194304;
                                }
                                i13 |= i22;
                            }
                        }
                        i23 = i12 & 256;
                        if (i23 != 0) {
                            i13 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function4)) {
                                i24 = 67108864;
                            } else {
                                i24 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 512;
                        if (i25 != 0) {
                            if ((i10 & 805306368) == 0) {
                                if (c0VarR.k0(function5)) {
                                    i26 = 536870912;
                                } else {
                                    i26 = 268435456;
                                }
                                i13 |= i26;
                            }
                            i27 = i12 & 1024;
                            if (i27 != 0) {
                                i28 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.k0(function6)) {
                                    i29 = 4;
                                } else {
                                    i29 = 2;
                                }
                                i28 = i11 | i29;
                            } else {
                                i28 = i11;
                            }
                            i30 = i12 & 2048;
                            if (i30 != 0) {
                                i28 |= 48;
                            } else if ((i11 & 48) != 0) {
                                if (c0VarR.k0(function7)) {
                                    i31 = 32;
                                } else {
                                    i31 = 16;
                                }
                                i28 |= i31;
                            }
                            i32 = i28;
                            i33 = i12 & 4096;
                            if (i33 != 0) {
                                i34 = i32 | androidx.media3.exoplayer.a5.S0;
                            } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                                if (c0VarR.k0(function8)) {
                                    i35 = 256;
                                } else {
                                    i35 = 128;
                                }
                                i34 = i32 | i35;
                            } else {
                                i34 = i32;
                            }
                            i36 = i12 & 8192;
                            if (i36 != 0) {
                                i38 = i34 | 3072;
                            } else {
                                i37 = i34;
                                if ((i11 & 3072) == 0) {
                                    i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                                } else {
                                    i38 = i37;
                                }
                            }
                            if ((i11 & 24576) != 0) {
                                if ((i12 & 16384) == 0 && c0VarR.D(q3Var)) {
                                    i16 = 16384;
                                }
                                i38 |= i16;
                            }
                            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                                if ((i12 & 32768) == 0 || !c0VarR.D(j40Var)) {
                                    i43 = 65536;
                                } else {
                                    i43 = 131072;
                                }
                                i38 |= i43;
                            }
                            if ((i11 & 1572864) != 0) {
                                if ((i12 & 65536) == 0 || !c0VarR.D(g5Var)) {
                                    i42 = 524288;
                                } else {
                                    i42 = 1048576;
                                }
                                i38 |= i42;
                            }
                            i39 = i12 & 131072;
                            if (i39 != 0) {
                                i38 |= 12582912;
                            } else if ((i11 & 12582912) == 0) {
                                if (c0VarR.k0(function10)) {
                                    i40 = 8388608;
                                } else {
                                    i40 = 4194304;
                                }
                                i38 |= i40;
                            }
                            if ((i12 & 262144) != 0) {
                                i38 |= 100663296;
                            } else if ((i11 & 100663296) == 0) {
                                if (c0VarR.D(this)) {
                                    i41 = 67108864;
                                } else {
                                    i41 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i38 |= i41;
                            }
                            if ((i13 & 306783379) == 306783378 || (i38 & 38347923) != 38347922) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (c0VarR.h(z16, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i19 != 0) {
                                        z15 = false;
                                    }
                                    if (i21 != 0) {
                                        function12 = null;
                                    }
                                    if (i23 != 0) {
                                        function21 = null;
                                    } else {
                                        function21 = function4;
                                    }
                                    if (i25 != 0) {
                                        function22 = null;
                                    } else {
                                        function22 = function5;
                                    }
                                    if (i27 != 0) {
                                        function23 = null;
                                    } else {
                                        function23 = function6;
                                    }
                                    if (i30 != 0) {
                                        function24 = null;
                                    } else {
                                        function24 = function7;
                                    }
                                    if (i33 != 0) {
                                        function25 = null;
                                    } else {
                                        function25 = function8;
                                    }
                                    if (i36 != 0) {
                                        function26 = null;
                                    } else {
                                        function26 = function9;
                                    }
                                    if ((i12 & 16384) != 0) {
                                        q3VarA = f30917a.A(c0VarR, 6);
                                        i38 &= -57345;
                                    } else {
                                        q3VarA = q3Var;
                                    }
                                    if ((i12 & 32768) != 0) {
                                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                        i38 &= -458753;
                                    } else {
                                        j40VarJ = j40Var;
                                    }
                                    if ((i12 & 65536) != 0) {
                                        if (function12 == null) {
                                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i38 &= -3670017;
                                    } else {
                                        g5VarM = g5Var;
                                    }
                                    if (i39 != 0) {
                                        function27 = function26;
                                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                    } else {
                                        function27 = function26;
                                        function2E = function10;
                                    }
                                    q3Var3 = q3VarA;
                                    function28 = function22;
                                    function29 = function12;
                                    function30 = function23;
                                    function31 = function21;
                                    z18 = z15;
                                    function32 = function24;
                                    g5Var3 = g5VarM;
                                } else {
                                    c0VarR.u();
                                    if ((i12 & 16384) != 0) {
                                        i38 &= -57345;
                                    }
                                    if ((32768 & i12) != 0) {
                                        i38 &= -458753;
                                    }
                                    if ((i12 & 65536) != 0) {
                                        i38 &= -3670017;
                                    }
                                    function28 = function5;
                                    function30 = function6;
                                    function25 = function8;
                                    q3Var3 = q3Var;
                                    j40VarJ = j40Var;
                                    g5Var3 = g5Var;
                                    function2E = function10;
                                    function29 = function12;
                                    z18 = z15;
                                    i38 = i38;
                                    function31 = function4;
                                    function32 = function7;
                                    function27 = function9;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                                }
                                if ((i13 & 14) == 4) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                androidx.compose.ui.graphics.q3 q3Var4 = q3Var3;
                                z20 = z19 | ((57344 & i13) == 16384);
                                objI0 = c0VarR.i0();
                                if (z20 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                    c0VarR.Y(objI0);
                                }
                                String strM = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                                androidx.compose.material3.internal.f4 f4Var = androidx.compose.material3.internal.f4.Filled;
                                v40.b bVar = new v40.b(false, null, null, 7, null);
                                if (function29 == null) {
                                    c0VarR.E(-1353131191);
                                    c0VarR.A();
                                    cVar = null;
                                } else {
                                    c0VarR.E(-1353131190);
                                    androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                                    c0VarR.A();
                                    cVar = cVarE;
                                }
                                int i44 = i13 >> 9;
                                int i45 = i38 << 21;
                                boolean z21 = z14;
                                androidx.compose.runtime.internal.c cVar2 = cVar;
                                c0Var2 = c0VarR;
                                androidx.compose.material3.internal.b4.l(f4Var, strM, function11, bVar, cVar2, function31, function28, function30, function32, function25, function27, z21, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i44) | (3670016 & i44) | (29360128 & i45) | (234881024 & i45) | (i45 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i44 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                function18 = function29;
                                function13 = function31;
                                function14 = function28;
                                function19 = function30;
                                function15 = function32;
                                function16 = function25;
                                function20 = function27;
                                z17 = z18;
                                g5Var2 = g5Var3;
                                j40Var2 = j40VarJ;
                                function17 = function2E;
                                q3Var2 = q3Var4;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                function13 = function4;
                                function14 = function5;
                                function15 = function7;
                                function16 = function8;
                                q3Var2 = q3Var;
                                j40Var2 = j40Var;
                                g5Var2 = g5Var;
                                function17 = function10;
                                function18 = function12;
                                z17 = z15;
                                function19 = function6;
                                function20 = function9;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 805306368;
                        i27 = i12 & 1024;
                        if (i27 != 0) {
                            i28 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function6)) {
                                i29 = 4;
                            } else {
                                i29 = 2;
                            }
                            i28 = i11 | i29;
                        } else {
                            i28 = i11;
                        }
                        i30 = i12 & 2048;
                        if (i30 != 0) {
                            i28 |= 48;
                        } else if ((i11 & 48) != 0) {
                            if (c0VarR.k0(function7)) {
                                i31 = 32;
                            } else {
                                i31 = 16;
                            }
                            i28 |= i31;
                        }
                        i32 = i28;
                        i33 = i12 & 4096;
                        if (i33 != 0) {
                            i34 = i32 | androidx.media3.exoplayer.a5.S0;
                        } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                            if (c0VarR.k0(function8)) {
                                i35 = 256;
                            } else {
                                i35 = 128;
                            }
                            i34 = i32 | i35;
                        } else {
                            i34 = i32;
                        }
                        i36 = i12 & 8192;
                        if (i36 != 0) {
                            i38 = i34 | 3072;
                        } else {
                            i37 = i34;
                            if ((i11 & 3072) == 0) {
                                i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                            } else {
                                i38 = i37;
                            }
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i16 = 16384;
                            }
                            i38 |= i16;
                        }
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                            if ((i12 & 32768) == 0) {
                                i43 = 65536;
                            } else {
                                i43 = 65536;
                            }
                            i38 |= i43;
                        }
                        if ((i11 & 1572864) != 0) {
                            if ((i12 & 65536) == 0) {
                                i42 = 524288;
                            } else {
                                i42 = 524288;
                            }
                            i38 |= i42;
                        }
                        i39 = i12 & 131072;
                        if (i39 != 0) {
                            i38 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            if (c0VarR.k0(function10)) {
                                i40 = 8388608;
                            } else {
                                i40 = 4194304;
                            }
                            i38 |= i40;
                        }
                        if ((i12 & 262144) != 0) {
                            i38 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            if (c0VarR.D(this)) {
                                i41 = 67108864;
                            } else {
                                i41 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i38 |= i41;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (c0VarR.h(z16, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            } else {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i13 & 14) == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            androidx.compose.ui.graphics.q3 q3Var5 = q3Var3;
                            z20 = z19 | ((57344 & i13) == 16384);
                            objI0 = c0VarR.i0();
                            if (z20) {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            }
                            String strM2 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                            androidx.compose.material3.internal.f4 f4Var2 = androidx.compose.material3.internal.f4.Filled;
                            v40.b bVar2 = new v40.b(false, null, null, 7, null);
                            if (function29 == null) {
                                c0VarR.E(-1353131191);
                                c0VarR.A();
                                cVar = null;
                            } else {
                                c0VarR.E(-1353131190);
                                androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE2;
                            }
                            int i46 = i13 >> 9;
                            int i47 = i38 << 21;
                            boolean z22 = z14;
                            androidx.compose.runtime.internal.c cVar3 = cVar;
                            c0Var2 = c0VarR;
                            androidx.compose.material3.internal.b4.l(f4Var2, strM2, function11, bVar2, cVar3, function31, function28, function30, function32, function25, function27, z22, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i46) | (3670016 & i46) | (29360128 & i47) | (234881024 & i47) | (i47 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i46 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z17 = z18;
                            g5Var2 = g5Var3;
                            j40Var2 = j40VarJ;
                            function17 = function2E;
                            q3Var2 = q3Var5;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            q3Var2 = q3Var;
                            j40Var2 = j40Var;
                            g5Var2 = g5Var;
                            function17 = function10;
                            function18 = function12;
                            z17 = z15;
                            function19 = function6;
                            function20 = function9;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    hVar2 = hVar;
                    i19 = i12 & 64;
                    if (i19 != 0) {
                        i13 |= 1572864;
                        z15 = z12;
                    } else {
                        z15 = z12;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.G(z15)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 128;
                    if (i21 != 0) {
                        i13 |= 12582912;
                        function12 = function3;
                    } else {
                        function12 = function3;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function12)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i13 |= i22;
                        }
                    }
                    i23 = i12 & 256;
                    if (i23 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function4)) {
                            i24 = 67108864;
                        } else {
                            i24 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 512;
                    if (i25 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function5)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                            i13 |= i26;
                        }
                        i27 = i12 & 1024;
                        if (i27 != 0) {
                            i28 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function6)) {
                                i29 = 4;
                            } else {
                                i29 = 2;
                            }
                            i28 = i11 | i29;
                        } else {
                            i28 = i11;
                        }
                        i30 = i12 & 2048;
                        if (i30 != 0) {
                            i28 |= 48;
                        } else if ((i11 & 48) != 0) {
                            if (c0VarR.k0(function7)) {
                                i31 = 32;
                            } else {
                                i31 = 16;
                            }
                            i28 |= i31;
                        }
                        i32 = i28;
                        i33 = i12 & 4096;
                        if (i33 != 0) {
                            i34 = i32 | androidx.media3.exoplayer.a5.S0;
                        } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                            if (c0VarR.k0(function8)) {
                                i35 = 256;
                            } else {
                                i35 = 128;
                            }
                            i34 = i32 | i35;
                        } else {
                            i34 = i32;
                        }
                        i36 = i12 & 8192;
                        if (i36 != 0) {
                            i38 = i34 | 3072;
                        } else {
                            i37 = i34;
                            if ((i11 & 3072) == 0) {
                                i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                            } else {
                                i38 = i37;
                            }
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i16 = 16384;
                            }
                            i38 |= i16;
                        }
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                            if ((i12 & 32768) == 0) {
                                i43 = 65536;
                            } else {
                                i43 = 65536;
                            }
                            i38 |= i43;
                        }
                        if ((i11 & 1572864) != 0) {
                            if ((i12 & 65536) == 0) {
                                i42 = 524288;
                            } else {
                                i42 = 524288;
                            }
                            i38 |= i42;
                        }
                        i39 = i12 & 131072;
                        if (i39 != 0) {
                            i38 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            if (c0VarR.k0(function10)) {
                                i40 = 8388608;
                            } else {
                                i40 = 4194304;
                            }
                            i38 |= i40;
                        }
                        if ((i12 & 262144) != 0) {
                            i38 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            if (c0VarR.D(this)) {
                                i41 = 67108864;
                            } else {
                                i41 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i38 |= i41;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (c0VarR.h(z16, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            } else {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i13 & 14) == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            androidx.compose.ui.graphics.q3 q3Var6 = q3Var3;
                            z20 = z19 | ((57344 & i13) == 16384);
                            objI0 = c0VarR.i0();
                            if (z20) {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            }
                            String strM3 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                            androidx.compose.material3.internal.f4 f4Var3 = androidx.compose.material3.internal.f4.Filled;
                            v40.b bVar3 = new v40.b(false, null, null, 7, null);
                            if (function29 == null) {
                                c0VarR.E(-1353131191);
                                c0VarR.A();
                                cVar = null;
                            } else {
                                c0VarR.E(-1353131190);
                                androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE3;
                            }
                            int i48 = i13 >> 9;
                            int i49 = i38 << 21;
                            boolean z23 = z14;
                            androidx.compose.runtime.internal.c cVar4 = cVar;
                            c0Var2 = c0VarR;
                            androidx.compose.material3.internal.b4.l(f4Var3, strM3, function11, bVar3, cVar4, function31, function28, function30, function32, function25, function27, z23, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i48) | (3670016 & i48) | (29360128 & i49) | (234881024 & i49) | (i49 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i48 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z17 = z18;
                            g5Var2 = g5Var3;
                            j40Var2 = j40VarJ;
                            function17 = function2E;
                            q3Var2 = q3Var6;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            q3Var2 = q3Var;
                            j40Var2 = j40Var;
                            g5Var2 = g5Var;
                            function17 = function10;
                            function18 = function12;
                            z17 = z15;
                            function19 = function6;
                            function20 = function9;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var7 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM4 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var4 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar4 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE4;
                        }
                        int i410 = i13 >> 9;
                        int i411 = i38 << 21;
                        boolean z24 = z14;
                        androidx.compose.runtime.internal.c cVar5 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var4, strM4, function11, bVar4, cVar5, function31, function28, function30, function32, function25, function27, z24, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i410) | (3670016 & i410) | (29360128 & i411) | (234881024 & i411) | (i411 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i410 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 3072;
                z14 = z11;
                i16 = 8192;
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.D(j1Var)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    if ((196608 & i10) == 0) {
                        hVar2 = hVar;
                        if (c0VarR.D(hVar2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 64;
                    if (i19 != 0) {
                        i13 |= 1572864;
                        z15 = z12;
                    } else {
                        z15 = z12;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.G(z15)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 128;
                    if (i21 != 0) {
                        i13 |= 12582912;
                        function12 = function3;
                    } else {
                        function12 = function3;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function12)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i13 |= i22;
                        }
                    }
                    i23 = i12 & 256;
                    if (i23 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function4)) {
                            i24 = 67108864;
                        } else {
                            i24 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 512;
                    if (i25 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function5)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                            i13 |= i26;
                        }
                        i27 = i12 & 1024;
                        if (i27 != 0) {
                            i28 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function6)) {
                                i29 = 4;
                            } else {
                                i29 = 2;
                            }
                            i28 = i11 | i29;
                        } else {
                            i28 = i11;
                        }
                        i30 = i12 & 2048;
                        if (i30 != 0) {
                            i28 |= 48;
                        } else if ((i11 & 48) != 0) {
                            if (c0VarR.k0(function7)) {
                                i31 = 32;
                            } else {
                                i31 = 16;
                            }
                            i28 |= i31;
                        }
                        i32 = i28;
                        i33 = i12 & 4096;
                        if (i33 != 0) {
                            i34 = i32 | androidx.media3.exoplayer.a5.S0;
                        } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                            if (c0VarR.k0(function8)) {
                                i35 = 256;
                            } else {
                                i35 = 128;
                            }
                            i34 = i32 | i35;
                        } else {
                            i34 = i32;
                        }
                        i36 = i12 & 8192;
                        if (i36 != 0) {
                            i38 = i34 | 3072;
                        } else {
                            i37 = i34;
                            if ((i11 & 3072) == 0) {
                                i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                            } else {
                                i38 = i37;
                            }
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i16 = 16384;
                            }
                            i38 |= i16;
                        }
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                            if ((i12 & 32768) == 0) {
                                i43 = 65536;
                            } else {
                                i43 = 65536;
                            }
                            i38 |= i43;
                        }
                        if ((i11 & 1572864) != 0) {
                            if ((i12 & 65536) == 0) {
                                i42 = 524288;
                            } else {
                                i42 = 524288;
                            }
                            i38 |= i42;
                        }
                        i39 = i12 & 131072;
                        if (i39 != 0) {
                            i38 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            if (c0VarR.k0(function10)) {
                                i40 = 8388608;
                            } else {
                                i40 = 4194304;
                            }
                            i38 |= i40;
                        }
                        if ((i12 & 262144) != 0) {
                            i38 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            if (c0VarR.D(this)) {
                                i41 = 67108864;
                            } else {
                                i41 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i38 |= i41;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (c0VarR.h(z16, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            } else {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i13 & 14) == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            androidx.compose.ui.graphics.q3 q3Var8 = q3Var3;
                            z20 = z19 | ((57344 & i13) == 16384);
                            objI0 = c0VarR.i0();
                            if (z20) {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            }
                            String strM5 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                            androidx.compose.material3.internal.f4 f4Var5 = androidx.compose.material3.internal.f4.Filled;
                            v40.b bVar5 = new v40.b(false, null, null, 7, null);
                            if (function29 == null) {
                                c0VarR.E(-1353131191);
                                c0VarR.A();
                                cVar = null;
                            } else {
                                c0VarR.E(-1353131190);
                                androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE5;
                            }
                            int i412 = i13 >> 9;
                            int i413 = i38 << 21;
                            boolean z25 = z14;
                            androidx.compose.runtime.internal.c cVar6 = cVar;
                            c0Var2 = c0VarR;
                            androidx.compose.material3.internal.b4.l(f4Var5, strM5, function11, bVar5, cVar6, function31, function28, function30, function32, function25, function27, z25, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i412) | (3670016 & i412) | (29360128 & i413) | (234881024 & i413) | (i413 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i412 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z17 = z18;
                            g5Var2 = g5Var3;
                            j40Var2 = j40VarJ;
                            function17 = function2E;
                            q3Var2 = q3Var8;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            q3Var2 = q3Var;
                            j40Var2 = j40Var;
                            g5Var2 = g5Var;
                            function17 = function10;
                            function18 = function12;
                            z17 = z15;
                            function19 = function6;
                            function20 = function9;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var9 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM6 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var6 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar6 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE6;
                        }
                        int i414 = i13 >> 9;
                        int i415 = i38 << 21;
                        boolean z26 = z14;
                        androidx.compose.runtime.internal.c cVar7 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var6, strM6, function11, bVar6, cVar7, function31, function28, function30, function32, function25, function27, z26, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i414) | (3670016 & i414) | (29360128 & i415) | (234881024 & i415) | (i415 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i414 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var9;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                hVar2 = hVar;
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.G(z15)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function12)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i13 |= i22;
                    }
                }
                i23 = i12 & 256;
                if (i23 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function4)) {
                        i24 = 67108864;
                    } else {
                        i24 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 512;
                if (i25 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function5)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i13 |= i26;
                    }
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var10 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM7 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var7 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar7 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE7;
                        }
                        int i416 = i13 >> 9;
                        int i417 = i38 << 21;
                        boolean z27 = z14;
                        androidx.compose.runtime.internal.c cVar8 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var7, strM7, function11, bVar7, cVar8, function31, function28, function30, function32, function25, function27, z27, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i416) | (3670016 & i416) | (29360128 & i417) | (234881024 & i417) | (i417 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i416 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var10;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var11 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM8 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var8 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar8 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE8;
                    }
                    int i418 = i13 >> 9;
                    int i419 = i38 << 21;
                    boolean z28 = z14;
                    androidx.compose.runtime.internal.c cVar9 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var8, strM8, function11, bVar8, cVar9, function31, function28, function30, function32, function25, function27, z28, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i418) | (3670016 & i418) | (29360128 & i419) | (234881024 & i419) | (i419 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i418 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var11;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.media3.exoplayer.a5.S0;
            z13 = z10;
            if ((i12 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    z14 = z11;
                    if (c0VarR.G(z14)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = 8192;
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.D(j1Var)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    if ((196608 & i10) == 0) {
                        hVar2 = hVar;
                        if (c0VarR.D(hVar2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 64;
                    if (i19 != 0) {
                        i13 |= 1572864;
                        z15 = z12;
                    } else {
                        z15 = z12;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.G(z15)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 128;
                    if (i21 != 0) {
                        i13 |= 12582912;
                        function12 = function3;
                    } else {
                        function12 = function3;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function12)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i13 |= i22;
                        }
                    }
                    i23 = i12 & 256;
                    if (i23 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function4)) {
                            i24 = 67108864;
                        } else {
                            i24 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 512;
                    if (i25 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function5)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                            i13 |= i26;
                        }
                        i27 = i12 & 1024;
                        if (i27 != 0) {
                            i28 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function6)) {
                                i29 = 4;
                            } else {
                                i29 = 2;
                            }
                            i28 = i11 | i29;
                        } else {
                            i28 = i11;
                        }
                        i30 = i12 & 2048;
                        if (i30 != 0) {
                            i28 |= 48;
                        } else if ((i11 & 48) != 0) {
                            if (c0VarR.k0(function7)) {
                                i31 = 32;
                            } else {
                                i31 = 16;
                            }
                            i28 |= i31;
                        }
                        i32 = i28;
                        i33 = i12 & 4096;
                        if (i33 != 0) {
                            i34 = i32 | androidx.media3.exoplayer.a5.S0;
                        } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                            if (c0VarR.k0(function8)) {
                                i35 = 256;
                            } else {
                                i35 = 128;
                            }
                            i34 = i32 | i35;
                        } else {
                            i34 = i32;
                        }
                        i36 = i12 & 8192;
                        if (i36 != 0) {
                            i38 = i34 | 3072;
                        } else {
                            i37 = i34;
                            if ((i11 & 3072) == 0) {
                                i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                            } else {
                                i38 = i37;
                            }
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i16 = 16384;
                            }
                            i38 |= i16;
                        }
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                            if ((i12 & 32768) == 0) {
                                i43 = 65536;
                            } else {
                                i43 = 65536;
                            }
                            i38 |= i43;
                        }
                        if ((i11 & 1572864) != 0) {
                            if ((i12 & 65536) == 0) {
                                i42 = 524288;
                            } else {
                                i42 = 524288;
                            }
                            i38 |= i42;
                        }
                        i39 = i12 & 131072;
                        if (i39 != 0) {
                            i38 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            if (c0VarR.k0(function10)) {
                                i40 = 8388608;
                            } else {
                                i40 = 4194304;
                            }
                            i38 |= i40;
                        }
                        if ((i12 & 262144) != 0) {
                            i38 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            if (c0VarR.D(this)) {
                                i41 = 67108864;
                            } else {
                                i41 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i38 |= i41;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (c0VarR.h(z16, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            } else {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i13 & 14) == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            androidx.compose.ui.graphics.q3 q3Var12 = q3Var3;
                            z20 = z19 | ((57344 & i13) == 16384);
                            objI0 = c0VarR.i0();
                            if (z20) {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            }
                            String strM9 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                            androidx.compose.material3.internal.f4 f4Var9 = androidx.compose.material3.internal.f4.Filled;
                            v40.b bVar9 = new v40.b(false, null, null, 7, null);
                            if (function29 == null) {
                                c0VarR.E(-1353131191);
                                c0VarR.A();
                                cVar = null;
                            } else {
                                c0VarR.E(-1353131190);
                                androidx.compose.runtime.internal.c cVarE9 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE9;
                            }
                            int i4110 = i13 >> 9;
                            int i4111 = i38 << 21;
                            boolean z29 = z14;
                            androidx.compose.runtime.internal.c cVar10 = cVar;
                            c0Var2 = c0VarR;
                            androidx.compose.material3.internal.b4.l(f4Var9, strM9, function11, bVar9, cVar10, function31, function28, function30, function32, function25, function27, z29, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4110) | (3670016 & i4110) | (29360128 & i4111) | (234881024 & i4111) | (i4111 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4110 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z17 = z18;
                            g5Var2 = g5Var3;
                            j40Var2 = j40VarJ;
                            function17 = function2E;
                            q3Var2 = q3Var12;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            q3Var2 = q3Var;
                            j40Var2 = j40Var;
                            g5Var2 = g5Var;
                            function17 = function10;
                            function18 = function12;
                            z17 = z15;
                            function19 = function6;
                            function20 = function9;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var13 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM10 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var10 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar10 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE10 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE10;
                        }
                        int i4112 = i13 >> 9;
                        int i4113 = i38 << 21;
                        boolean z210 = z14;
                        androidx.compose.runtime.internal.c cVar11 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var10, strM10, function11, bVar10, cVar11, function31, function28, function30, function32, function25, function27, z210, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4112) | (3670016 & i4112) | (29360128 & i4113) | (234881024 & i4113) | (i4113 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4112 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var13;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                hVar2 = hVar;
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.G(z15)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function12)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i13 |= i22;
                    }
                }
                i23 = i12 & 256;
                if (i23 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function4)) {
                        i24 = 67108864;
                    } else {
                        i24 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 512;
                if (i25 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function5)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i13 |= i26;
                    }
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var14 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM11 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var11 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar11 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE11 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE11;
                        }
                        int i4114 = i13 >> 9;
                        int i4115 = i38 << 21;
                        boolean z211 = z14;
                        androidx.compose.runtime.internal.c cVar12 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var11, strM11, function11, bVar11, cVar12, function31, function28, function30, function32, function25, function27, z211, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4114) | (3670016 & i4114) | (29360128 & i4115) | (234881024 & i4115) | (i4115 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4114 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var15 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM12 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var12 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar12 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE12 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE12;
                    }
                    int i4116 = i13 >> 9;
                    int i4117 = i38 << 21;
                    boolean z212 = z14;
                    androidx.compose.runtime.internal.c cVar13 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var12, strM12, function11, bVar12, cVar13, function31, function28, function30, function32, function25, function27, z212, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4116) | (3670016 & i4116) | (29360128 & i4117) | (234881024 & i4117) | (i4117 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4116 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var15;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            z14 = z11;
            i16 = 8192;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.D(j1Var)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((i12 & 32) != 0) {
                if ((196608 & i10) == 0) {
                    hVar2 = hVar;
                    if (c0VarR.D(hVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.G(z15)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function12)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i13 |= i22;
                    }
                }
                i23 = i12 & 256;
                if (i23 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function4)) {
                        i24 = 67108864;
                    } else {
                        i24 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 512;
                if (i25 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function5)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i13 |= i26;
                    }
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var16 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM13 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var13 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar13 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE13 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE13;
                        }
                        int i4118 = i13 >> 9;
                        int i4119 = i38 << 21;
                        boolean z213 = z14;
                        androidx.compose.runtime.internal.c cVar14 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var13, strM13, function11, bVar13, cVar14, function31, function28, function30, function32, function25, function27, z213, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4118) | (3670016 & i4118) | (29360128 & i4119) | (234881024 & i4119) | (i4119 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4118 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var16;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var17 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM14 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var14 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar14 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE14 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE14;
                    }
                    int i41110 = i13 >> 9;
                    int i41111 = i38 << 21;
                    boolean z214 = z14;
                    androidx.compose.runtime.internal.c cVar15 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var14, strM14, function11, bVar14, cVar15, function31, function28, function30, function32, function25, function27, z214, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i41110) | (3670016 & i41110) | (29360128 & i41111) | (234881024 & i41111) | (i41111 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i41110 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var17;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            hVar2 = hVar;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.G(z15)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
                function12 = function3;
            } else {
                function12 = function3;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function12)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
            }
            i23 = i12 & 256;
            if (i23 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(function4)) {
                    i24 = 67108864;
                } else {
                    i24 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i24;
            }
            i25 = i12 & 512;
            if (i25 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function5)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i13 |= i26;
                }
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var18 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM15 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var15 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar15 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE15 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE15;
                    }
                    int i41112 = i13 >> 9;
                    int i41113 = i38 << 21;
                    boolean z215 = z14;
                    androidx.compose.runtime.internal.c cVar16 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var15, strM15, function11, bVar15, cVar16, function31, function28, function30, function32, function25, function27, z215, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i41112) | (3670016 & i41112) | (29360128 & i41113) | (234881024 & i41113) | (i41113 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i41112 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var18;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i27 = i12 & 1024;
            if (i27 != 0) {
                i28 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function6)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i11 | i29;
            } else {
                i28 = i11;
            }
            i30 = i12 & 2048;
            if (i30 != 0) {
                i28 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.k0(function7)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i28 |= i31;
            }
            i32 = i28;
            i33 = i12 & 4096;
            if (i33 != 0) {
                i34 = i32 | androidx.media3.exoplayer.a5.S0;
            } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(function8)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                i34 = i32 | i35;
            } else {
                i34 = i32;
            }
            i36 = i12 & 8192;
            if (i36 != 0) {
                i38 = i34 | 3072;
            } else {
                i37 = i34;
                if ((i11 & 3072) == 0) {
                    i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                } else {
                    i38 = i37;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i16 = 16384;
                }
                i38 |= i16;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32768) == 0) {
                    i43 = 65536;
                } else {
                    i43 = 65536;
                }
                i38 |= i43;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 65536) == 0) {
                    i42 = 524288;
                } else {
                    i42 = 524288;
                }
                i38 |= i42;
            }
            i39 = i12 & 131072;
            if (i39 != 0) {
                i38 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c0VarR.k0(function10)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i38 |= i40;
            }
            if ((i12 & 262144) != 0) {
                i38 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i41 = 67108864;
                } else {
                    i41 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i38 |= i41;
            }
            if ((i13 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c0VarR.h(z16, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                } else {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i13 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                androidx.compose.ui.graphics.q3 q3Var19 = q3Var3;
                z20 = z19 | ((57344 & i13) == 16384);
                objI0 = c0VarR.i0();
                if (z20) {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                } else {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                }
                String strM16 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                androidx.compose.material3.internal.f4 f4Var16 = androidx.compose.material3.internal.f4.Filled;
                v40.b bVar16 = new v40.b(false, null, null, 7, null);
                if (function29 == null) {
                    c0VarR.E(-1353131191);
                    c0VarR.A();
                    cVar = null;
                } else {
                    c0VarR.E(-1353131190);
                    androidx.compose.runtime.internal.c cVarE16 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE16;
                }
                int i41114 = i13 >> 9;
                int i41115 = i38 << 21;
                boolean z216 = z14;
                androidx.compose.runtime.internal.c cVar17 = cVar;
                c0Var2 = c0VarR;
                androidx.compose.material3.internal.b4.l(f4Var16, strM16, function11, bVar16, cVar17, function31, function28, function30, function32, function25, function27, z216, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i41114) | (3670016 & i41114) | (29360128 & i41115) | (234881024 & i41115) | (i41115 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i41114 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z17 = z18;
                g5Var2 = g5Var3;
                j40Var2 = j40VarJ;
                function17 = function2E;
                q3Var2 = q3Var19;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                q3Var2 = q3Var;
                j40Var2 = j40Var;
                g5Var2 = g5Var;
                function17 = function10;
                function18 = function12;
                z17 = z15;
                function19 = function6;
                function20 = function9;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        function11 = function2;
        if ((i12 & 4) != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z13 = z10;
                if (c0VarR.G(z13)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    z14 = z11;
                    if (c0VarR.G(z14)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = 8192;
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.D(j1Var)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    if ((196608 & i10) == 0) {
                        hVar2 = hVar;
                        if (c0VarR.D(hVar2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 64;
                    if (i19 != 0) {
                        i13 |= 1572864;
                        z15 = z12;
                    } else {
                        z15 = z12;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.G(z15)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 128;
                    if (i21 != 0) {
                        i13 |= 12582912;
                        function12 = function3;
                    } else {
                        function12 = function3;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function12)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i13 |= i22;
                        }
                    }
                    i23 = i12 & 256;
                    if (i23 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function4)) {
                            i24 = 67108864;
                        } else {
                            i24 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 512;
                    if (i25 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function5)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                            i13 |= i26;
                        }
                        i27 = i12 & 1024;
                        if (i27 != 0) {
                            i28 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function6)) {
                                i29 = 4;
                            } else {
                                i29 = 2;
                            }
                            i28 = i11 | i29;
                        } else {
                            i28 = i11;
                        }
                        i30 = i12 & 2048;
                        if (i30 != 0) {
                            i28 |= 48;
                        } else if ((i11 & 48) != 0) {
                            if (c0VarR.k0(function7)) {
                                i31 = 32;
                            } else {
                                i31 = 16;
                            }
                            i28 |= i31;
                        }
                        i32 = i28;
                        i33 = i12 & 4096;
                        if (i33 != 0) {
                            i34 = i32 | androidx.media3.exoplayer.a5.S0;
                        } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                            if (c0VarR.k0(function8)) {
                                i35 = 256;
                            } else {
                                i35 = 128;
                            }
                            i34 = i32 | i35;
                        } else {
                            i34 = i32;
                        }
                        i36 = i12 & 8192;
                        if (i36 != 0) {
                            i38 = i34 | 3072;
                        } else {
                            i37 = i34;
                            if ((i11 & 3072) == 0) {
                                i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                            } else {
                                i38 = i37;
                            }
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i16 = 16384;
                            }
                            i38 |= i16;
                        }
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                            if ((i12 & 32768) == 0) {
                                i43 = 65536;
                            } else {
                                i43 = 65536;
                            }
                            i38 |= i43;
                        }
                        if ((i11 & 1572864) != 0) {
                            if ((i12 & 65536) == 0) {
                                i42 = 524288;
                            } else {
                                i42 = 524288;
                            }
                            i38 |= i42;
                        }
                        i39 = i12 & 131072;
                        if (i39 != 0) {
                            i38 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            if (c0VarR.k0(function10)) {
                                i40 = 8388608;
                            } else {
                                i40 = 4194304;
                            }
                            i38 |= i40;
                        }
                        if ((i12 & 262144) != 0) {
                            i38 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            if (c0VarR.D(this)) {
                                i41 = 67108864;
                            } else {
                                i41 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i38 |= i41;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (c0VarR.h(z16, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            } else {
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    function12 = null;
                                }
                                if (i23 != 0) {
                                    function21 = null;
                                } else {
                                    function21 = function4;
                                }
                                if (i25 != 0) {
                                    function22 = null;
                                } else {
                                    function22 = function5;
                                }
                                if (i27 != 0) {
                                    function23 = null;
                                } else {
                                    function23 = function6;
                                }
                                if (i30 != 0) {
                                    function24 = null;
                                } else {
                                    function24 = function7;
                                }
                                if (i33 != 0) {
                                    function25 = null;
                                } else {
                                    function25 = function8;
                                }
                                if (i36 != 0) {
                                    function26 = null;
                                } else {
                                    function26 = function9;
                                }
                                if ((i12 & 16384) != 0) {
                                    q3VarA = f30917a.A(c0VarR, 6);
                                    i38 &= -57345;
                                } else {
                                    q3VarA = q3Var;
                                }
                                if ((i12 & 32768) != 0) {
                                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                    i38 &= -458753;
                                } else {
                                    j40VarJ = j40Var;
                                }
                                if ((i12 & 65536) != 0) {
                                    if (function12 == null) {
                                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i38 &= -3670017;
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i39 != 0) {
                                    function27 = function26;
                                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                                } else {
                                    function27 = function26;
                                    function2E = function10;
                                }
                                q3Var3 = q3VarA;
                                function28 = function22;
                                function29 = function12;
                                function30 = function23;
                                function31 = function21;
                                z18 = z15;
                                function32 = function24;
                                g5Var3 = g5VarM;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                            }
                            if ((i13 & 14) == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            androidx.compose.ui.graphics.q3 q3Var110 = q3Var3;
                            z20 = z19 | ((57344 & i13) == 16384);
                            objI0 = c0VarR.i0();
                            if (z20) {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                                c0VarR.Y(objI0);
                            }
                            String strM17 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                            androidx.compose.material3.internal.f4 f4Var17 = androidx.compose.material3.internal.f4.Filled;
                            v40.b bVar17 = new v40.b(false, null, null, 7, null);
                            if (function29 == null) {
                                c0VarR.E(-1353131191);
                                c0VarR.A();
                                cVar = null;
                            } else {
                                c0VarR.E(-1353131190);
                                androidx.compose.runtime.internal.c cVarE17 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE17;
                            }
                            int i41116 = i13 >> 9;
                            int i41117 = i38 << 21;
                            boolean z217 = z14;
                            androidx.compose.runtime.internal.c cVar18 = cVar;
                            c0Var2 = c0VarR;
                            androidx.compose.material3.internal.b4.l(f4Var17, strM17, function11, bVar17, cVar18, function31, function28, function30, function32, function25, function27, z217, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i41116) | (3670016 & i41116) | (29360128 & i41117) | (234881024 & i41117) | (i41117 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i41116 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function18 = function29;
                            function13 = function31;
                            function14 = function28;
                            function19 = function30;
                            function15 = function32;
                            function16 = function25;
                            function20 = function27;
                            z17 = z18;
                            g5Var2 = g5Var3;
                            j40Var2 = j40VarJ;
                            function17 = function2E;
                            q3Var2 = q3Var110;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function13 = function4;
                            function14 = function5;
                            function15 = function7;
                            function16 = function8;
                            q3Var2 = q3Var;
                            j40Var2 = j40Var;
                            g5Var2 = g5Var;
                            function17 = function10;
                            function18 = function12;
                            z17 = z15;
                            function19 = function6;
                            function20 = function9;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var111 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM18 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var18 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar18 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE18 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE18;
                        }
                        int i41118 = i13 >> 9;
                        int i41119 = i38 << 21;
                        boolean z218 = z14;
                        androidx.compose.runtime.internal.c cVar19 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var18, strM18, function11, bVar18, cVar19, function31, function28, function30, function32, function25, function27, z218, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i41118) | (3670016 & i41118) | (29360128 & i41119) | (234881024 & i41119) | (i41119 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i41118 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var111;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                hVar2 = hVar;
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.G(z15)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function12)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i13 |= i22;
                    }
                }
                i23 = i12 & 256;
                if (i23 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function4)) {
                        i24 = 67108864;
                    } else {
                        i24 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 512;
                if (i25 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function5)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i13 |= i26;
                    }
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var112 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM19 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var19 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar19 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE19 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE19;
                        }
                        int i411110 = i13 >> 9;
                        int i411111 = i38 << 21;
                        boolean z219 = z14;
                        androidx.compose.runtime.internal.c cVar110 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var19, strM19, function11, bVar19, cVar110, function31, function28, function30, function32, function25, function27, z219, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i411110) | (3670016 & i411110) | (29360128 & i411111) | (234881024 & i411111) | (i411111 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i411110 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var112;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var113 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM110 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var110 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar110 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE110 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE110;
                    }
                    int i411112 = i13 >> 9;
                    int i411113 = i38 << 21;
                    boolean z2110 = z14;
                    androidx.compose.runtime.internal.c cVar111 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var110, strM110, function11, bVar110, cVar111, function31, function28, function30, function32, function25, function27, z2110, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i411112) | (3670016 & i411112) | (29360128 & i411113) | (234881024 & i411113) | (i411113 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i411112 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var113;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            z14 = z11;
            i16 = 8192;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.D(j1Var)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((i12 & 32) != 0) {
                if ((196608 & i10) == 0) {
                    hVar2 = hVar;
                    if (c0VarR.D(hVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.G(z15)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function12)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i13 |= i22;
                    }
                }
                i23 = i12 & 256;
                if (i23 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function4)) {
                        i24 = 67108864;
                    } else {
                        i24 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 512;
                if (i25 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function5)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i13 |= i26;
                    }
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var114 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM111 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var111 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar111 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE111 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE111;
                        }
                        int i411114 = i13 >> 9;
                        int i411115 = i38 << 21;
                        boolean z2111 = z14;
                        androidx.compose.runtime.internal.c cVar112 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var111, strM111, function11, bVar111, cVar112, function31, function28, function30, function32, function25, function27, z2111, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i411114) | (3670016 & i411114) | (29360128 & i411115) | (234881024 & i411115) | (i411115 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i411114 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var114;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var115 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM112 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var112 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar112 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE112 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE112;
                    }
                    int i411116 = i13 >> 9;
                    int i411117 = i38 << 21;
                    boolean z2112 = z14;
                    androidx.compose.runtime.internal.c cVar113 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var112, strM112, function11, bVar112, cVar113, function31, function28, function30, function32, function25, function27, z2112, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i411116) | (3670016 & i411116) | (29360128 & i411117) | (234881024 & i411117) | (i411117 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i411116 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var115;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            hVar2 = hVar;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.G(z15)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
                function12 = function3;
            } else {
                function12 = function3;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function12)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
            }
            i23 = i12 & 256;
            if (i23 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(function4)) {
                    i24 = 67108864;
                } else {
                    i24 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i24;
            }
            i25 = i12 & 512;
            if (i25 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function5)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i13 |= i26;
                }
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var116 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM113 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var113 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar113 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE113 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE113;
                    }
                    int i411118 = i13 >> 9;
                    int i411119 = i38 << 21;
                    boolean z2113 = z14;
                    androidx.compose.runtime.internal.c cVar114 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var113, strM113, function11, bVar113, cVar114, function31, function28, function30, function32, function25, function27, z2113, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i411118) | (3670016 & i411118) | (29360128 & i411119) | (234881024 & i411119) | (i411119 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i411118 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var116;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i27 = i12 & 1024;
            if (i27 != 0) {
                i28 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function6)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i11 | i29;
            } else {
                i28 = i11;
            }
            i30 = i12 & 2048;
            if (i30 != 0) {
                i28 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.k0(function7)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i28 |= i31;
            }
            i32 = i28;
            i33 = i12 & 4096;
            if (i33 != 0) {
                i34 = i32 | androidx.media3.exoplayer.a5.S0;
            } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(function8)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                i34 = i32 | i35;
            } else {
                i34 = i32;
            }
            i36 = i12 & 8192;
            if (i36 != 0) {
                i38 = i34 | 3072;
            } else {
                i37 = i34;
                if ((i11 & 3072) == 0) {
                    i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                } else {
                    i38 = i37;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i16 = 16384;
                }
                i38 |= i16;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32768) == 0) {
                    i43 = 65536;
                } else {
                    i43 = 65536;
                }
                i38 |= i43;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 65536) == 0) {
                    i42 = 524288;
                } else {
                    i42 = 524288;
                }
                i38 |= i42;
            }
            i39 = i12 & 131072;
            if (i39 != 0) {
                i38 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c0VarR.k0(function10)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i38 |= i40;
            }
            if ((i12 & 262144) != 0) {
                i38 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i41 = 67108864;
                } else {
                    i41 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i38 |= i41;
            }
            if ((i13 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c0VarR.h(z16, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                } else {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i13 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                androidx.compose.ui.graphics.q3 q3Var117 = q3Var3;
                z20 = z19 | ((57344 & i13) == 16384);
                objI0 = c0VarR.i0();
                if (z20) {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                } else {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                }
                String strM114 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                androidx.compose.material3.internal.f4 f4Var114 = androidx.compose.material3.internal.f4.Filled;
                v40.b bVar114 = new v40.b(false, null, null, 7, null);
                if (function29 == null) {
                    c0VarR.E(-1353131191);
                    c0VarR.A();
                    cVar = null;
                } else {
                    c0VarR.E(-1353131190);
                    androidx.compose.runtime.internal.c cVarE114 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE114;
                }
                int i4111110 = i13 >> 9;
                int i4111111 = i38 << 21;
                boolean z2114 = z14;
                androidx.compose.runtime.internal.c cVar115 = cVar;
                c0Var2 = c0VarR;
                androidx.compose.material3.internal.b4.l(f4Var114, strM114, function11, bVar114, cVar115, function31, function28, function30, function32, function25, function27, z2114, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4111110) | (3670016 & i4111110) | (29360128 & i4111111) | (234881024 & i4111111) | (i4111111 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4111110 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z17 = z18;
                g5Var2 = g5Var3;
                j40Var2 = j40VarJ;
                function17 = function2E;
                q3Var2 = q3Var117;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                q3Var2 = q3Var;
                j40Var2 = j40Var;
                g5Var2 = g5Var;
                function17 = function10;
                function18 = function12;
                z17 = z15;
                function19 = function6;
                function20 = function9;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        z13 = z10;
        if ((i12 & 8) != 0) {
            if ((i10 & 3072) == 0) {
                z14 = z11;
                if (c0VarR.G(z14)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = 8192;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.D(j1Var)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((i12 & 32) != 0) {
                if ((196608 & i10) == 0) {
                    hVar2 = hVar;
                    if (c0VarR.D(hVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.G(z15)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                    function12 = function3;
                } else {
                    function12 = function3;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function12)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i13 |= i22;
                    }
                }
                i23 = i12 & 256;
                if (i23 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function4)) {
                        i24 = 67108864;
                    } else {
                        i24 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 512;
                if (i25 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function5)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i13 |= i26;
                    }
                    i27 = i12 & 1024;
                    if (i27 != 0) {
                        i28 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function6)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i11 | i29;
                    } else {
                        i28 = i11;
                    }
                    i30 = i12 & 2048;
                    if (i30 != 0) {
                        i28 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.k0(function7)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i28 |= i31;
                    }
                    i32 = i28;
                    i33 = i12 & 4096;
                    if (i33 != 0) {
                        i34 = i32 | androidx.media3.exoplayer.a5.S0;
                    } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(function8)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i34 = i32 | i35;
                    } else {
                        i34 = i32;
                    }
                    i36 = i12 & 8192;
                    if (i36 != 0) {
                        i38 = i34 | 3072;
                    } else {
                        i37 = i34;
                        if ((i11 & 3072) == 0) {
                            i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                        } else {
                            i38 = i37;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i16 = 16384;
                        }
                        i38 |= i16;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i43 = 65536;
                        } else {
                            i43 = 65536;
                        }
                        i38 |= i43;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 65536) == 0) {
                            i42 = 524288;
                        } else {
                            i42 = 524288;
                        }
                        i38 |= i42;
                    }
                    i39 = i12 & 131072;
                    if (i39 != 0) {
                        i38 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function10)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i38 |= i40;
                    }
                    if ((i12 & 262144) != 0) {
                        i38 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(this)) {
                            i41 = 67108864;
                        } else {
                            i41 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i38 |= i41;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c0VarR.h(z16, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        } else {
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                function12 = null;
                            }
                            if (i23 != 0) {
                                function21 = null;
                            } else {
                                function21 = function4;
                            }
                            if (i25 != 0) {
                                function22 = null;
                            } else {
                                function22 = function5;
                            }
                            if (i27 != 0) {
                                function23 = null;
                            } else {
                                function23 = function6;
                            }
                            if (i30 != 0) {
                                function24 = null;
                            } else {
                                function24 = function7;
                            }
                            if (i33 != 0) {
                                function25 = null;
                            } else {
                                function25 = function8;
                            }
                            if (i36 != 0) {
                                function26 = null;
                            } else {
                                function26 = function9;
                            }
                            if ((i12 & 16384) != 0) {
                                q3VarA = f30917a.A(c0VarR, 6);
                                i38 &= -57345;
                            } else {
                                q3VarA = q3Var;
                            }
                            if ((i12 & 32768) != 0) {
                                j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                                i38 &= -458753;
                            } else {
                                j40VarJ = j40Var;
                            }
                            if ((i12 & 65536) != 0) {
                                if (function12 == null) {
                                    g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i38 &= -3670017;
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i39 != 0) {
                                function27 = function26;
                                function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                            } else {
                                function27 = function26;
                                function2E = function10;
                            }
                            q3Var3 = q3VarA;
                            function28 = function22;
                            function29 = function12;
                            function30 = function23;
                            function31 = function21;
                            z18 = z15;
                            function32 = function24;
                            g5Var3 = g5VarM;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                        }
                        if ((i13 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.graphics.q3 q3Var118 = q3Var3;
                        z20 = z19 | ((57344 & i13) == 16384);
                        objI0 = c0VarR.i0();
                        if (z20) {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                            c0VarR.Y(objI0);
                        }
                        String strM115 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                        androidx.compose.material3.internal.f4 f4Var115 = androidx.compose.material3.internal.f4.Filled;
                        v40.b bVar115 = new v40.b(false, null, null, 7, null);
                        if (function29 == null) {
                            c0VarR.E(-1353131191);
                            c0VarR.A();
                            cVar = null;
                        } else {
                            c0VarR.E(-1353131190);
                            androidx.compose.runtime.internal.c cVarE115 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE115;
                        }
                        int i4111112 = i13 >> 9;
                        int i4111113 = i38 << 21;
                        boolean z2115 = z14;
                        androidx.compose.runtime.internal.c cVar116 = cVar;
                        c0Var2 = c0VarR;
                        androidx.compose.material3.internal.b4.l(f4Var115, strM115, function11, bVar115, cVar116, function31, function28, function30, function32, function25, function27, z2115, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4111112) | (3670016 & i4111112) | (29360128 & i4111113) | (234881024 & i4111113) | (i4111113 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4111112 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function18 = function29;
                        function13 = function31;
                        function14 = function28;
                        function19 = function30;
                        function15 = function32;
                        function16 = function25;
                        function20 = function27;
                        z17 = z18;
                        g5Var2 = g5Var3;
                        j40Var2 = j40VarJ;
                        function17 = function2E;
                        q3Var2 = q3Var118;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function13 = function4;
                        function14 = function5;
                        function15 = function7;
                        function16 = function8;
                        q3Var2 = q3Var;
                        j40Var2 = j40Var;
                        g5Var2 = g5Var;
                        function17 = function10;
                        function18 = function12;
                        z17 = z15;
                        function19 = function6;
                        function20 = function9;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var119 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM116 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var116 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar116 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE116 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE116;
                    }
                    int i4111114 = i13 >> 9;
                    int i4111115 = i38 << 21;
                    boolean z2116 = z14;
                    androidx.compose.runtime.internal.c cVar117 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var116, strM116, function11, bVar116, cVar117, function31, function28, function30, function32, function25, function27, z2116, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4111114) | (3670016 & i4111114) | (29360128 & i4111115) | (234881024 & i4111115) | (i4111115 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4111114 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var119;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            hVar2 = hVar;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.G(z15)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
                function12 = function3;
            } else {
                function12 = function3;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function12)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
            }
            i23 = i12 & 256;
            if (i23 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(function4)) {
                    i24 = 67108864;
                } else {
                    i24 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i24;
            }
            i25 = i12 & 512;
            if (i25 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function5)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i13 |= i26;
                }
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var1110 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM117 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var117 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar117 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE117 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE117;
                    }
                    int i4111116 = i13 >> 9;
                    int i4111117 = i38 << 21;
                    boolean z2117 = z14;
                    androidx.compose.runtime.internal.c cVar118 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var117, strM117, function11, bVar117, cVar118, function31, function28, function30, function32, function25, function27, z2117, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4111116) | (3670016 & i4111116) | (29360128 & i4111117) | (234881024 & i4111117) | (i4111117 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4111116 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var1110;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i27 = i12 & 1024;
            if (i27 != 0) {
                i28 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function6)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i11 | i29;
            } else {
                i28 = i11;
            }
            i30 = i12 & 2048;
            if (i30 != 0) {
                i28 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.k0(function7)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i28 |= i31;
            }
            i32 = i28;
            i33 = i12 & 4096;
            if (i33 != 0) {
                i34 = i32 | androidx.media3.exoplayer.a5.S0;
            } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(function8)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                i34 = i32 | i35;
            } else {
                i34 = i32;
            }
            i36 = i12 & 8192;
            if (i36 != 0) {
                i38 = i34 | 3072;
            } else {
                i37 = i34;
                if ((i11 & 3072) == 0) {
                    i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                } else {
                    i38 = i37;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i16 = 16384;
                }
                i38 |= i16;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32768) == 0) {
                    i43 = 65536;
                } else {
                    i43 = 65536;
                }
                i38 |= i43;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 65536) == 0) {
                    i42 = 524288;
                } else {
                    i42 = 524288;
                }
                i38 |= i42;
            }
            i39 = i12 & 131072;
            if (i39 != 0) {
                i38 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c0VarR.k0(function10)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i38 |= i40;
            }
            if ((i12 & 262144) != 0) {
                i38 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i41 = 67108864;
                } else {
                    i41 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i38 |= i41;
            }
            if ((i13 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c0VarR.h(z16, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                } else {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i13 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                androidx.compose.ui.graphics.q3 q3Var1111 = q3Var3;
                z20 = z19 | ((57344 & i13) == 16384);
                objI0 = c0VarR.i0();
                if (z20) {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                } else {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                }
                String strM118 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                androidx.compose.material3.internal.f4 f4Var118 = androidx.compose.material3.internal.f4.Filled;
                v40.b bVar118 = new v40.b(false, null, null, 7, null);
                if (function29 == null) {
                    c0VarR.E(-1353131191);
                    c0VarR.A();
                    cVar = null;
                } else {
                    c0VarR.E(-1353131190);
                    androidx.compose.runtime.internal.c cVarE118 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE118;
                }
                int i4111118 = i13 >> 9;
                int i4111119 = i38 << 21;
                boolean z2118 = z14;
                androidx.compose.runtime.internal.c cVar119 = cVar;
                c0Var2 = c0VarR;
                androidx.compose.material3.internal.b4.l(f4Var118, strM118, function11, bVar118, cVar119, function31, function28, function30, function32, function25, function27, z2118, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i4111118) | (3670016 & i4111118) | (29360128 & i4111119) | (234881024 & i4111119) | (i4111119 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i4111118 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z17 = z18;
                g5Var2 = g5Var3;
                j40Var2 = j40VarJ;
                function17 = function2E;
                q3Var2 = q3Var1111;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                q3Var2 = q3Var;
                j40Var2 = j40Var;
                g5Var2 = g5Var;
                function17 = function10;
                function18 = function12;
                z17 = z15;
                function19 = function6;
                function20 = function9;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        z14 = z11;
        i16 = 8192;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.D(j1Var)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i13 |= i17;
        }
        if ((i12 & 32) != 0) {
            if ((196608 & i10) == 0) {
                hVar2 = hVar;
                if (c0VarR.D(hVar2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.G(z15)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
                function12 = function3;
            } else {
                function12 = function3;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function12)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
            }
            i23 = i12 & 256;
            if (i23 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(function4)) {
                    i24 = 67108864;
                } else {
                    i24 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i24;
            }
            i25 = i12 & 512;
            if (i25 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function5)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i13 |= i26;
                }
                i27 = i12 & 1024;
                if (i27 != 0) {
                    i28 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function6)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i11 | i29;
                } else {
                    i28 = i11;
                }
                i30 = i12 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.k0(function7)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i12 & 4096;
                if (i33 != 0) {
                    i34 = i32 | androidx.media3.exoplayer.a5.S0;
                } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function8)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i34 = i32 | i35;
                } else {
                    i34 = i32;
                }
                i36 = i12 & 8192;
                if (i36 != 0) {
                    i38 = i34 | 3072;
                } else {
                    i37 = i34;
                    if ((i11 & 3072) == 0) {
                        i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                    } else {
                        i38 = i37;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i16 = 16384;
                    }
                    i38 |= i16;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i43 = 65536;
                    } else {
                        i43 = 65536;
                    }
                    i38 |= i43;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 65536) == 0) {
                        i42 = 524288;
                    } else {
                        i42 = 524288;
                    }
                    i38 |= i42;
                }
                i39 = i12 & 131072;
                if (i39 != 0) {
                    i38 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function10)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i38 |= i40;
                }
                if ((i12 & 262144) != 0) {
                    i38 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i41 = 67108864;
                    } else {
                        i41 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i38 |= i41;
                }
                if ((i13 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c0VarR.h(z16, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    } else {
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            function12 = null;
                        }
                        if (i23 != 0) {
                            function21 = null;
                        } else {
                            function21 = function4;
                        }
                        if (i25 != 0) {
                            function22 = null;
                        } else {
                            function22 = function5;
                        }
                        if (i27 != 0) {
                            function23 = null;
                        } else {
                            function23 = function6;
                        }
                        if (i30 != 0) {
                            function24 = null;
                        } else {
                            function24 = function7;
                        }
                        if (i33 != 0) {
                            function25 = null;
                        } else {
                            function25 = function8;
                        }
                        if (i36 != 0) {
                            function26 = null;
                        } else {
                            function26 = function9;
                        }
                        if ((i12 & 16384) != 0) {
                            q3VarA = f30917a.A(c0VarR, 6);
                            i38 &= -57345;
                        } else {
                            q3VarA = q3Var;
                        }
                        if ((i12 & 32768) != 0) {
                            j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                            i38 &= -458753;
                        } else {
                            j40VarJ = j40Var;
                        }
                        if ((i12 & 65536) != 0) {
                            if (function12 == null) {
                                g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i38 &= -3670017;
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i39 != 0) {
                            function27 = function26;
                            function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                        } else {
                            function27 = function26;
                            function2E = function10;
                        }
                        q3Var3 = q3VarA;
                        function28 = function22;
                        function29 = function12;
                        function30 = function23;
                        function31 = function21;
                        z18 = z15;
                        function32 = function24;
                        g5Var3 = g5VarM;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                    }
                    if ((i13 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.graphics.q3 q3Var1112 = q3Var3;
                    z20 = z19 | ((57344 & i13) == 16384);
                    objI0 = c0VarR.i0();
                    if (z20) {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                        c0VarR.Y(objI0);
                    }
                    String strM119 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                    androidx.compose.material3.internal.f4 f4Var119 = androidx.compose.material3.internal.f4.Filled;
                    v40.b bVar119 = new v40.b(false, null, null, 7, null);
                    if (function29 == null) {
                        c0VarR.E(-1353131191);
                        c0VarR.A();
                        cVar = null;
                    } else {
                        c0VarR.E(-1353131190);
                        androidx.compose.runtime.internal.c cVarE119 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE119;
                    }
                    int i41111110 = i13 >> 9;
                    int i41111111 = i38 << 21;
                    boolean z2119 = z14;
                    androidx.compose.runtime.internal.c cVar1110 = cVar;
                    c0Var2 = c0VarR;
                    androidx.compose.material3.internal.b4.l(f4Var119, strM119, function11, bVar119, cVar1110, function31, function28, function30, function32, function25, function27, z2119, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i41111110) | (3670016 & i41111110) | (29360128 & i41111111) | (234881024 & i41111111) | (i41111111 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i41111110 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function18 = function29;
                    function13 = function31;
                    function14 = function28;
                    function19 = function30;
                    function15 = function32;
                    function16 = function25;
                    function20 = function27;
                    z17 = z18;
                    g5Var2 = g5Var3;
                    j40Var2 = j40VarJ;
                    function17 = function2E;
                    q3Var2 = q3Var1112;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function13 = function4;
                    function14 = function5;
                    function15 = function7;
                    function16 = function8;
                    q3Var2 = q3Var;
                    j40Var2 = j40Var;
                    g5Var2 = g5Var;
                    function17 = function10;
                    function18 = function12;
                    z17 = z15;
                    function19 = function6;
                    function20 = function9;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i27 = i12 & 1024;
            if (i27 != 0) {
                i28 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function6)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i11 | i29;
            } else {
                i28 = i11;
            }
            i30 = i12 & 2048;
            if (i30 != 0) {
                i28 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.k0(function7)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i28 |= i31;
            }
            i32 = i28;
            i33 = i12 & 4096;
            if (i33 != 0) {
                i34 = i32 | androidx.media3.exoplayer.a5.S0;
            } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(function8)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                i34 = i32 | i35;
            } else {
                i34 = i32;
            }
            i36 = i12 & 8192;
            if (i36 != 0) {
                i38 = i34 | 3072;
            } else {
                i37 = i34;
                if ((i11 & 3072) == 0) {
                    i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                } else {
                    i38 = i37;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i16 = 16384;
                }
                i38 |= i16;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32768) == 0) {
                    i43 = 65536;
                } else {
                    i43 = 65536;
                }
                i38 |= i43;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 65536) == 0) {
                    i42 = 524288;
                } else {
                    i42 = 524288;
                }
                i38 |= i42;
            }
            i39 = i12 & 131072;
            if (i39 != 0) {
                i38 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c0VarR.k0(function10)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i38 |= i40;
            }
            if ((i12 & 262144) != 0) {
                i38 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i41 = 67108864;
                } else {
                    i41 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i38 |= i41;
            }
            if ((i13 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c0VarR.h(z16, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                } else {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i13 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                androidx.compose.ui.graphics.q3 q3Var1113 = q3Var3;
                z20 = z19 | ((57344 & i13) == 16384);
                objI0 = c0VarR.i0();
                if (z20) {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                } else {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                }
                String strM1110 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                androidx.compose.material3.internal.f4 f4Var1110 = androidx.compose.material3.internal.f4.Filled;
                v40.b bVar1110 = new v40.b(false, null, null, 7, null);
                if (function29 == null) {
                    c0VarR.E(-1353131191);
                    c0VarR.A();
                    cVar = null;
                } else {
                    c0VarR.E(-1353131190);
                    androidx.compose.runtime.internal.c cVarE1110 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE1110;
                }
                int i41111112 = i13 >> 9;
                int i41111113 = i38 << 21;
                boolean z21110 = z14;
                androidx.compose.runtime.internal.c cVar1111 = cVar;
                c0Var2 = c0VarR;
                androidx.compose.material3.internal.b4.l(f4Var1110, strM1110, function11, bVar1110, cVar1111, function31, function28, function30, function32, function25, function27, z21110, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i41111112) | (3670016 & i41111112) | (29360128 & i41111113) | (234881024 & i41111113) | (i41111113 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i41111112 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z17 = z18;
                g5Var2 = g5Var3;
                j40Var2 = j40VarJ;
                function17 = function2E;
                q3Var2 = q3Var1113;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                q3Var2 = q3Var;
                j40Var2 = j40Var;
                g5Var2 = g5Var;
                function17 = function10;
                function18 = function12;
                z17 = z15;
                function19 = function6;
                function20 = function9;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        hVar2 = hVar;
        i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 1572864;
            z15 = z12;
        } else {
            z15 = z12;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.G(z15)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
        }
        i21 = i12 & 128;
        if (i21 != 0) {
            i13 |= 12582912;
            function12 = function3;
        } else {
            function12 = function3;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function12)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
        }
        i23 = i12 & 256;
        if (i23 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.k0(function4)) {
                i24 = 67108864;
            } else {
                i24 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i13 |= i24;
        }
        i25 = i12 & 512;
        if (i25 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function5)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i13 |= i26;
            }
            i27 = i12 & 1024;
            if (i27 != 0) {
                i28 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function6)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i11 | i29;
            } else {
                i28 = i11;
            }
            i30 = i12 & 2048;
            if (i30 != 0) {
                i28 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.k0(function7)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i28 |= i31;
            }
            i32 = i28;
            i33 = i12 & 4096;
            if (i33 != 0) {
                i34 = i32 | androidx.media3.exoplayer.a5.S0;
            } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(function8)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                i34 = i32 | i35;
            } else {
                i34 = i32;
            }
            i36 = i12 & 8192;
            if (i36 != 0) {
                i38 = i34 | 3072;
            } else {
                i37 = i34;
                if ((i11 & 3072) == 0) {
                    i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
                } else {
                    i38 = i37;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i16 = 16384;
                }
                i38 |= i16;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32768) == 0) {
                    i43 = 65536;
                } else {
                    i43 = 65536;
                }
                i38 |= i43;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 65536) == 0) {
                    i42 = 524288;
                } else {
                    i42 = 524288;
                }
                i38 |= i42;
            }
            i39 = i12 & 131072;
            if (i39 != 0) {
                i38 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c0VarR.k0(function10)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i38 |= i40;
            }
            if ((i12 & 262144) != 0) {
                i38 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i41 = 67108864;
                } else {
                    i41 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i38 |= i41;
            }
            if ((i13 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c0VarR.h(z16, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                } else {
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        function12 = null;
                    }
                    if (i23 != 0) {
                        function21 = null;
                    } else {
                        function21 = function4;
                    }
                    if (i25 != 0) {
                        function22 = null;
                    } else {
                        function22 = function5;
                    }
                    if (i27 != 0) {
                        function23 = null;
                    } else {
                        function23 = function6;
                    }
                    if (i30 != 0) {
                        function24 = null;
                    } else {
                        function24 = function7;
                    }
                    if (i33 != 0) {
                        function25 = null;
                    } else {
                        function25 = function8;
                    }
                    if (i36 != 0) {
                        function26 = null;
                    } else {
                        function26 = function9;
                    }
                    if ((i12 & 16384) != 0) {
                        q3VarA = f30917a.A(c0VarR, 6);
                        i38 &= -57345;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((i12 & 32768) != 0) {
                        j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                        i38 &= -458753;
                    } else {
                        j40VarJ = j40Var;
                    }
                    if ((i12 & 65536) != 0) {
                        if (function12 == null) {
                            g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i38 &= -3670017;
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i39 != 0) {
                        function27 = function26;
                        function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                    } else {
                        function27 = function26;
                        function2E = function10;
                    }
                    q3Var3 = q3VarA;
                    function28 = function22;
                    function29 = function12;
                    function30 = function23;
                    function31 = function21;
                    z18 = z15;
                    function32 = function24;
                    g5Var3 = g5VarM;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                }
                if ((i13 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                androidx.compose.ui.graphics.q3 q3Var1114 = q3Var3;
                z20 = z19 | ((57344 & i13) == 16384);
                objI0 = c0VarR.i0();
                if (z20) {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                } else {
                    objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                    c0VarR.Y(objI0);
                }
                String strM1111 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
                androidx.compose.material3.internal.f4 f4Var1111 = androidx.compose.material3.internal.f4.Filled;
                v40.b bVar1111 = new v40.b(false, null, null, 7, null);
                if (function29 == null) {
                    c0VarR.E(-1353131191);
                    c0VarR.A();
                    cVar = null;
                } else {
                    c0VarR.E(-1353131190);
                    androidx.compose.runtime.internal.c cVarE1111 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE1111;
                }
                int i41111114 = i13 >> 9;
                int i41111115 = i38 << 21;
                boolean z21111 = z14;
                androidx.compose.runtime.internal.c cVar1112 = cVar;
                c0Var2 = c0VarR;
                androidx.compose.material3.internal.b4.l(f4Var1111, strM1111, function11, bVar1111, cVar1112, function31, function28, function30, function32, function25, function27, z21111, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i41111114) | (3670016 & i41111114) | (29360128 & i41111115) | (234881024 & i41111115) | (i41111115 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i41111114 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function18 = function29;
                function13 = function31;
                function14 = function28;
                function19 = function30;
                function15 = function32;
                function16 = function25;
                function20 = function27;
                z17 = z18;
                g5Var2 = g5Var3;
                j40Var2 = j40VarJ;
                function17 = function2E;
                q3Var2 = q3Var1114;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function13 = function4;
                function14 = function5;
                function15 = function7;
                function16 = function8;
                q3Var2 = q3Var;
                j40Var2 = j40Var;
                g5Var2 = g5Var;
                function17 = function10;
                function18 = function12;
                z17 = z15;
                function19 = function6;
                function20 = function9;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        i27 = i12 & 1024;
        if (i27 != 0) {
            i28 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.k0(function6)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i28 = i11 | i29;
        } else {
            i28 = i11;
        }
        i30 = i12 & 2048;
        if (i30 != 0) {
            i28 |= 48;
        } else if ((i11 & 48) != 0) {
            if (c0VarR.k0(function7)) {
                i31 = 32;
            } else {
                i31 = 16;
            }
            i28 |= i31;
        }
        i32 = i28;
        i33 = i12 & 4096;
        if (i33 != 0) {
            i34 = i32 | androidx.media3.exoplayer.a5.S0;
        } else if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if (c0VarR.k0(function8)) {
                i35 = 256;
            } else {
                i35 = 128;
            }
            i34 = i32 | i35;
        } else {
            i34 = i32;
        }
        i36 = i12 & 8192;
        if (i36 != 0) {
            i38 = i34 | 3072;
        } else {
            i37 = i34;
            if ((i11 & 3072) == 0) {
                i38 = i37 | (c0VarR.k0(function9) ? 2048 : 1024);
            } else {
                i38 = i37;
            }
        }
        if ((i11 & 24576) != 0) {
            if ((i12 & 16384) == 0) {
                i16 = 16384;
            }
            i38 |= i16;
        }
        if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
            if ((i12 & 32768) == 0) {
                i43 = 65536;
            } else {
                i43 = 65536;
            }
            i38 |= i43;
        }
        if ((i11 & 1572864) != 0) {
            if ((i12 & 65536) == 0) {
                i42 = 524288;
            } else {
                i42 = 524288;
            }
            i38 |= i42;
        }
        i39 = i12 & 131072;
        if (i39 != 0) {
            i38 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (c0VarR.k0(function10)) {
                i40 = 8388608;
            } else {
                i40 = 4194304;
            }
            i38 |= i40;
        }
        if ((i12 & 262144) != 0) {
            i38 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            if (c0VarR.D(this)) {
                i41 = 67108864;
            } else {
                i41 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i38 |= i41;
        }
        if ((i13 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c0VarR.h(z16, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    z15 = false;
                }
                if (i21 != 0) {
                    function12 = null;
                }
                if (i23 != 0) {
                    function21 = null;
                } else {
                    function21 = function4;
                }
                if (i25 != 0) {
                    function22 = null;
                } else {
                    function22 = function5;
                }
                if (i27 != 0) {
                    function23 = null;
                } else {
                    function23 = function6;
                }
                if (i30 != 0) {
                    function24 = null;
                } else {
                    function24 = function7;
                }
                if (i33 != 0) {
                    function25 = null;
                } else {
                    function25 = function8;
                }
                if (i36 != 0) {
                    function26 = null;
                } else {
                    function26 = function9;
                }
                if ((i12 & 16384) != 0) {
                    q3VarA = f30917a.A(c0VarR, 6);
                    i38 &= -57345;
                } else {
                    q3VarA = q3Var;
                }
                if ((i12 & 32768) != 0) {
                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                    i38 &= -458753;
                } else {
                    j40VarJ = j40Var;
                }
                if ((i12 & 65536) != 0) {
                    if (function12 == null) {
                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i38 &= -3670017;
                } else {
                    g5VarM = g5Var;
                }
                if (i39 != 0) {
                    function27 = function26;
                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                } else {
                    function27 = function26;
                    function2E = function10;
                }
                q3Var3 = q3VarA;
                function28 = function22;
                function29 = function12;
                function30 = function23;
                function31 = function21;
                z18 = z15;
                function32 = function24;
                g5Var3 = g5VarM;
            } else {
                if (i19 != 0) {
                    z15 = false;
                }
                if (i21 != 0) {
                    function12 = null;
                }
                if (i23 != 0) {
                    function21 = null;
                } else {
                    function21 = function4;
                }
                if (i25 != 0) {
                    function22 = null;
                } else {
                    function22 = function5;
                }
                if (i27 != 0) {
                    function23 = null;
                } else {
                    function23 = function6;
                }
                if (i30 != 0) {
                    function24 = null;
                } else {
                    function24 = function7;
                }
                if (i33 != 0) {
                    function25 = null;
                } else {
                    function25 = function8;
                }
                if (i36 != 0) {
                    function26 = null;
                } else {
                    function26 = function9;
                }
                if ((i12 & 16384) != 0) {
                    q3VarA = f30917a.A(c0VarR, 6);
                    i38 &= -57345;
                } else {
                    q3VarA = q3Var;
                }
                if ((i12 & 32768) != 0) {
                    j40VarJ = j(c0VarR, (i38 >> 24) & 14);
                    i38 &= -458753;
                } else {
                    j40VarJ = j40Var;
                }
                if ((i12 & 65536) != 0) {
                    if (function12 == null) {
                        g5VarM = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        g5VarM = m(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i38 &= -3670017;
                } else {
                    g5VarM = g5Var;
                }
                if (i39 != 0) {
                    function27 = function26;
                    function2E = androidx.compose.runtime.internal.w.e(417908150, true, new b(z13, z15, hVar2, j40VarJ, q3VarA), c0VarR, 54);
                } else {
                    function27 = function26;
                    function2E = function10;
                }
                q3Var3 = q3VarA;
                function28 = function22;
                function29 = function12;
                function30 = function23;
                function31 = function21;
                z18 = z15;
                function32 = function24;
                g5Var3 = g5VarM;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1806980801, i13, i38, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
            }
            if ((i13 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            androidx.compose.ui.graphics.q3 q3Var1115 = q3Var3;
            z20 = z19 | ((57344 & i13) == 16384);
            objI0 = c0VarR.i0();
            if (z20) {
                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                c0VarR.Y(objI0);
            } else {
                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                c0VarR.Y(objI0);
            }
            String strM1112 = ((androidx.compose.ui.text.input.h1) objI0).b().m();
            androidx.compose.material3.internal.f4 f4Var1112 = androidx.compose.material3.internal.f4.Filled;
            v40.b bVar1112 = new v40.b(false, null, null, 7, null);
            if (function29 == null) {
                c0VarR.E(-1353131191);
                c0VarR.A();
                cVar = null;
            } else {
                c0VarR.E(-1353131190);
                androidx.compose.runtime.internal.c cVarE1112 = androidx.compose.runtime.internal.w.e(1110058497, true, new c(function29), c0VarR, 54);
                c0VarR.A();
                cVar = cVarE1112;
            }
            int i41111116 = i13 >> 9;
            int i41111117 = i38 << 21;
            boolean z21112 = z14;
            androidx.compose.runtime.internal.c cVar1113 = cVar;
            c0Var2 = c0VarR;
            androidx.compose.material3.internal.b4.l(f4Var1112, strM1112, function11, bVar1112, cVar1113, function31, function28, function30, function32, function25, function27, z21112, z10, z18, hVar, g5Var3, j40VarJ, function2E, c0Var2, ((i13 << 3) & 896) | 6 | (458752 & i41111116) | (3670016 & i41111116) | (29360128 & i41111117) | (234881024 & i41111117) | (i41111117 & 1879048192), ((i38 >> 9) & 14) | ((i13 >> 6) & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i41111116 & 7168) | (57344 & (i13 >> 3)) | ((i38 >> 3) & 458752) | ((i38 << 3) & 3670016) | (29360128 & i38));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function18 = function29;
            function13 = function31;
            function14 = function28;
            function19 = function30;
            function15 = function32;
            function16 = function25;
            function20 = function27;
            z17 = z18;
            g5Var2 = g5Var3;
            j40Var2 = j40VarJ;
            function17 = function2E;
            q3Var2 = q3Var1115;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            function13 = function4;
            function14 = function5;
            function15 = function7;
            function16 = function8;
            q3Var2 = q3Var;
            j40Var2 = j40Var;
            g5Var2 = g5Var;
            function17 = function10;
            function18 = function12;
            z17 = z15;
            function19 = function6;
            function20 = function9;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.k40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n40.i(this.f29952a, str, function2, z10, z11, j1Var, hVar, z17, function18, function13, function14, function19, function15, function16, function20, q3Var2, j40Var2, g5Var2, function17, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public final j40 j(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(831731228, i10, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:478)");
        }
        j40 j40VarQ = q(pj.f31758a.a(c0Var, 6), (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarQ;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final j40 k(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable androidx.compose.foundation.text.selection.w4 w4Var, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long jU = (i15 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i15 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i15 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i15 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i15 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i15 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i15 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        long j52 = jU;
        long jU8 = (i15 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j17;
        long jU9 = (i15 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j18;
        long jU10 = (i15 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j19;
        androidx.compose.foundation.text.selection.w4 w4Var2 = (i15 & 1024) != 0 ? null : w4Var;
        long jU11 = (i15 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j20;
        long jU12 = (i15 & 4096) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j21;
        long jU13 = (i15 & 8192) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j22;
        long jU14 = (i15 & 16384) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j23;
        long jU15 = (32768 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j24;
        long jU16 = (65536 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j25;
        long jU17 = (131072 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j26;
        long jU18 = (262144 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j27;
        long jU19 = (524288 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j28;
        long jU20 = (1048576 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j29;
        long jU21 = (2097152 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j30;
        long jU22 = (4194304 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j31;
        long jU23 = (8388608 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j32;
        long jU24 = (16777216 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j33;
        long jU25 = (33554432 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j34;
        long jU26 = (67108864 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j35;
        long jU27 = (134217728 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j36;
        long jU28 = (268435456 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j37;
        long jU29 = (536870912 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j38;
        long jU30 = (i15 & 1073741824) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j39;
        long jU31 = (i16 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j40;
        long jU32 = (i16 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j41;
        long jU33 = (i16 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j42;
        long jU34 = (i16 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j43;
        long jU35 = (i16 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j44;
        long jU36 = (i16 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j45;
        long jU37 = (i16 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j46;
        long jU38 = (i16 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j47;
        long jU39 = (i16 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j48;
        long jU40 = (i16 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j49;
        long jU41 = (i16 & 1024) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j50;
        long jU42 = (i16 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j51;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1513344955, i10, i11, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:580)");
        }
        j40 j40VarC = q(pj.f31758a.a(c0Var, 6), (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d())).c(j52, jU2, jU3, jU4, jU5, jU6, jU7, jU8, jU9, jU10, w4Var2, jU11, jU12, jU13, jU14, jU15, jU16, jU17, jU18, jU19, jU20, jU21, jU22, jU23, jU24, jU25, jU26, jU27, jU28, jU29, jU30, jU31, jU32, jU33, jU34, jU35, jU36, jU37, jU38, jU39, jU40, jU41, jU42);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarC;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 l(float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.layout.d5.i(f10, f12, f11, f13);
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 n(float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.layout.d5.i(f10, f11, f12, f13);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[_[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]:[_]]")
    @NotNull
    public final androidx.compose.foundation.text.input.n p(@NotNull androidx.compose.foundation.text.input.p pVar, boolean z10, @NotNull androidx.compose.foundation.text.input.o oVar, @Nullable androidx.compose.foundation.text.input.h hVar, @NotNull androidx.compose.foundation.interaction.h hVar2, @Nullable v40 v40Var, @Nullable pj.n<? super w40, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7, boolean z11, @Nullable j40 j40Var, @Nullable androidx.compose.foundation.layout.g5 g5Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        n40 n40Var;
        j40 j40VarJ;
        androidx.compose.foundation.layout.g5 g5VarO;
        androidx.compose.foundation.interaction.h hVar3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E;
        v40 bVar = (i12 & 32) != 0 ? new v40.b(false, null, null, 7, null) : v40Var;
        pj.n<? super w40, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2 = (i12 & 64) != 0 ? null : nVar;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = (i12 & 128) != 0 ? null : function2;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = (i12 & 256) != 0 ? null : function3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = (i12 & 512) != 0 ? null : function4;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = (i12 & 1024) != 0 ? null : function5;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = (i12 & 2048) != 0 ? null : function6;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = (i12 & 4096) != 0 ? null : function7;
        boolean z12 = (i12 & 8192) != 0 ? false : z11;
        if ((i12 & 16384) != 0) {
            n40Var = this;
            j40VarJ = n40Var.j(c0Var, (i11 >> 21) & 14);
        } else {
            n40Var = this;
            j40VarJ = j40Var;
        }
        if ((32768 & i12) != 0) {
            g5VarO = (nVar2 == null || (bVar instanceof v40.a)) ? o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : m(n40Var, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        } else {
            g5VarO = g5Var;
        }
        if ((i12 & 65536) != 0) {
            hVar3 = hVar2;
            function2E = androidx.compose.runtime.internal.w.e(245572296, true, new d(z10, z12, hVar3, j40VarJ), c0Var, 54);
        } else {
            hVar3 = hVar2;
            function2E = function8;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(320881373, i10, i11, "androidx.compose.material3.TextFieldDefaults.decorator (TextFieldDefaults.kt:178)");
        }
        e eVar = new e(hVar, pVar, oVar, bVar, nVar2, function9, function10, function11, function12, function13, function14, z10, z12, hVar3, g5VarO, j40VarJ, function2E);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return eVar;
    }

    @NotNull
    public final j40 q(@NotNull l6 l6Var, @NotNull androidx.compose.foundation.text.selection.w4 w4Var) {
        j40 j40VarX = l6Var.X();
        if (j40VarX != null) {
            if (!Intrinsics.areEqual(j40VarX.M(), w4Var)) {
                j40VarX = j40VarX.c(((-1025) & 1) != 0 ? j40VarX.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarX.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarX.f29657c : 0L, ((-1025) & 8) != 0 ? j40VarX.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarX.f29659e : 0L, ((-1025) & 32) != 0 ? j40VarX.f29660f : 0L, ((-1025) & 64) != 0 ? j40VarX.f29661g : 0L, ((-1025) & 128) != 0 ? j40VarX.f29662h : 0L, ((-1025) & 256) != 0 ? j40VarX.f29663i : 0L, ((-1025) & 512) != 0 ? j40VarX.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarX.f29665k : w4Var, ((-1025) & 2048) != 0 ? j40VarX.f29666l : 0L, ((-1025) & 4096) != 0 ? j40VarX.f29667m : 0L, ((-1025) & 8192) != 0 ? j40VarX.f29668n : 0L, ((-1025) & 16384) != 0 ? j40VarX.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarX.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarX.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarX.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarX.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarX.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarX.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarX.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarX.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarX.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarX.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarX.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarX.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarX.B : 0L, ((-1025) & 268435456) != 0 ? j40VarX.C : 0L, ((-1025) & 536870912) != 0 ? j40VarX.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarX.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarX.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarX.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarX.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarX.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarX.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarX.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarX.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarX.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarX.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarX.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarX.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarX.Q : 0L);
                l6Var.O1(j40VarX);
            }
            if (j40VarX != null) {
                return j40VarX;
            }
        }
        d0.v0 v0Var = d0.v0.f269078a;
        j40 j40Var = new j40(o6.o(l6Var, v0Var.P()), o6.o(l6Var, v0Var.b0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, v0Var.k()), v0Var.l(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, v0Var.I()), o6.o(l6Var, v0Var.d()), o6.o(l6Var, v0Var.d()), o6.o(l6Var, v0Var.d()), o6.o(l6Var, v0Var.d()), o6.o(l6Var, v0Var.c()), o6.o(l6Var, v0Var.w()), w4Var, o6.o(l6Var, v0Var.N()), o6.o(l6Var, v0Var.a()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, v0Var.f()), v0Var.h(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, v0Var.u()), o6.o(l6Var, v0Var.R()), o6.o(l6Var, v0Var.i0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, v0Var.o()), v0Var.p(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, v0Var.K()), o6.o(l6Var, v0Var.T()), o6.o(l6Var, v0Var.m0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, v0Var.s()), v0Var.t(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, v0Var.M()), o6.o(l6Var, v0Var.Q()), o6.o(l6Var, v0Var.g0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, v0Var.m()), v0Var.n(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, v0Var.J()), o6.o(l6Var, v0Var.d0()), o6.o(l6Var, v0Var.d0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, v0Var.k()), v0Var.l(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, v0Var.d0()), o6.o(l6Var, v0Var.S()), o6.o(l6Var, v0Var.k0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, v0Var.q()), v0Var.r(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, v0Var.L()), o6.o(l6Var, v0Var.e0()), o6.o(l6Var, v0Var.e0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, v0Var.e0()), v0Var.l(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, v0Var.e0()), o6.o(l6Var, v0Var.f0()), o6.o(l6Var, v0Var.f0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, v0Var.f0()), v0Var.l(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, v0Var.f0()), null);
        l6Var.O1(j40Var);
        return j40Var;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getFilledShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 r(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(611926497, i10, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:790)");
        }
        androidx.compose.ui.graphics.q3 q3VarA = A(c0Var, i10 & 14);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarA;
    }

    public final float t() {
        return f30923g;
    }

    public final float v() {
        return f30921e;
    }

    public final float w() {
        return f30918b;
    }

    public final float x() {
        return f30919c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getOutlinedShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 y(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-584749279, i10, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:782)");
        }
        androidx.compose.ui.graphics.q3 q3VarS = lq.f30410a.s(c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarS;
    }
}
