package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,231:1\n1282#2,6:232\n1282#2,6:268\n75#3:238\n33#4:239\n33#4:252\n53#5,3:240\n53#5,3:253\n53#5,3:257\n536#6,9:243\n545#6,8:260\n30#7:256\n273#7:274\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n72#1:232,6\n222#1:268,6\n84#1:238\n201#1:239\n208#1:252\n201#1:240,3\n208#1:253,3\n210#1:257,3\n197#1:243,9\n197#1:260,8\n210#1:256\n79#1:274\n*E\n"})
public final class g {

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.o4 f21068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f21071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f21072e;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.g$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,231:1\n363#2:232\n99#3:233\n97#3,8:234\n106#3:278\n80#4,6:242\n87#4,3:257\n90#4,2:266\n94#4:277\n391#5,9:248\n400#5:268\n401#5,2:275\n4360#6,6:260\n1282#7,6:269\n1282#7,6:279\n273#8:285\n273#8:286\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1$1\n*L\n87#1:232\n97#1:233\n97#1:234,8\n97#1:278\n97#1:242,6\n97#1:257,3\n97#1:266,2\n97#1:277\n97#1:248,9\n97#1:268\n97#1:275,2\n97#1:260,6\n107#1:269,6\n114#1:279,6\n107#1:285\n114#1:286\n*E\n"})
        static final class C0158a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f21073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f21074b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.a0 f21075c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ w f21076d;

            C0158a(long j10, boolean z10, androidx.compose.ui.a0 a0Var, w wVar) {
                this.f21073a = j10;
                this.f21074b = z10;
                this.f21075c = a0Var;
                this.f21076d = wVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean i(w wVar) {
                return (wVar.a() & 9223372034707292159L) != n0.d.f332689d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean k(w wVar) {
                return (wVar.a() & 9223372034707292159L) != n0.d.f332689d;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void f(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1260045569, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
                }
                if (this.f21073a != n0.d.f332689d) {
                    c0Var.E(3458246);
                    androidx.compose.foundation.layout.q.e eVarJ = this.f21074b ? androidx.compose.foundation.layout.q.a.f16340a.j() : androidx.compose.foundation.layout.q.a.f16340a.h();
                    androidx.compose.ui.a0 a0VarS = i6.s(this.f21075c, androidx.compose.ui.unit.l.p(this.f21073a), androidx.compose.ui.unit.l.m(this.f21073a), 0.0f, 0.0f, 12, null);
                    final w wVar = this.f21076d;
                    boolean z10 = this.f21074b;
                    androidx.compose.ui.layout.a1 a1VarE = u5.e(eVarJ, androidx.compose.ui.e.f37317a.w(), c0Var, 0);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                    androidx.compose.runtime.b1 b1VarK = c0Var.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarS);
                    androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar.a();
                    if (c0Var.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var.q();
                    if (c0Var.P()) {
                        c0Var.q0(function0A);
                    } else {
                        c0Var.l();
                    }
                    androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
                    y7.n(c0VarD, a1VarE, aVar.e());
                    y7.n(c0VarD, b1VarK, aVar.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar.f());
                    y5 y5Var = y5.f16577a;
                    androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                    boolean zK0 = c0Var.k0(wVar);
                    Object objI0 = c0Var.i0();
                    if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: androidx.compose.foundation.text.selection.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(g.a.C0158a.i(wVar));
                            }
                        };
                        c0Var.Y(objI0);
                    }
                    g.h(aVar2, (Function0) objI0, z10, c0Var, 6);
                    c0Var.o();
                    c0Var.A();
                } else {
                    c0Var.E(4389176);
                    androidx.compose.ui.a0 a0Var = this.f21075c;
                    boolean zK1 = c0Var.k0(this.f21076d);
                    final w wVar2 = this.f21076d;
                    Object objI1 = c0Var.i0();
                    if (zK1 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: androidx.compose.foundation.text.selection.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(g.a.C0158a.k(wVar2));
                            }
                        };
                        c0Var.Y(objI1);
                    }
                    g.h(a0Var, (Function0) objI1, this.f21074b, c0Var, 0);
                    c0Var.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                f(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        a(androidx.compose.ui.platform.o4 o4Var, long j10, boolean z10, androidx.compose.ui.a0 a0Var, w wVar) {
            this.f21068a = o4Var;
            this.f21069b = j10;
            this.f21070c = z10;
            this.f21071d = a0Var;
            this.f21072e = wVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            int i11 = 3 >> 1;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                int i12 = 4 & (-1);
                androidx.compose.runtime.m0.A0(1365123137, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
            }
            androidx.compose.runtime.a1.e(androidx.compose.ui.platform.q1.D().f(this.f21068a), androidx.compose.runtime.internal.w.e(1260045569, true, new C0158a(this.f21069b, this.f21070c, this.f21071d, this.f21072e), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

    @SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,231:1\n75#2:232\n1282#3,6:233\n167#4,6:239\n249#4,14:245\n57#5:259\n60#6:260\n22#7:261\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n*L\n130#1:232\n131#1:233,6\n140#1:239,6\n140#1:245,14\n132#1:259\n132#1:260\n132#1:261\n*E\n"})
    static final class b implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f21077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21078b;

        b(Function0<Boolean> function0, boolean z10) {
            this.f21077a = function0;
            this.f21078b = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.draw.o i(long j10, final Function0 function0, final boolean z10, androidx.compose.ui.draw.i iVar) {
            final androidx.compose.ui.graphics.t1 t1VarL = g.l(iVar, Float.intBitsToFloat((int) (iVar.d() >> 32)) / 2.0f);
            final androidx.compose.ui.graphics.r0 r0VarD = androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, j10, 0, 2, null);
            return iVar.N(new Function1() { // from class: androidx.compose.foundation.text.selection.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.b.k(function0, z10, t1VarL, r0VarD, (androidx.compose.ui.graphics.drawscope.c) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Function0 function0, boolean z10, androidx.compose.ui.graphics.t1 t1Var, androidx.compose.ui.graphics.r0 r0Var, androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.E4();
            if (!((Boolean) function0.invoke()).booleanValue()) {
                return Unit.f312394a;
            }
            if (z10) {
                long jY = cVar.Y();
                androidx.compose.ui.graphics.drawscope.d dVarZ3 = cVar.Z3();
                long jD = dVarZ3.d();
                dVarZ3.f().save();
                try {
                    dVarZ3.i().g(-1.0f, 1.0f, jY);
                    androidx.compose.ui.graphics.drawscope.f.G2(cVar, t1Var, 0L, 0.0f, null, r0Var, 0, 46, null);
                } finally {
                    dVarZ3.f().B();
                    dVarZ3.g(jD);
                }
            } else {
                androidx.compose.ui.graphics.drawscope.f.G2(cVar, t1Var, 0L, 0.0f, null, r0Var, 0, 46, null);
            }
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-196777734);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-196777734, i10, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:129)");
            }
            final long jB = ((w4) c0Var.W(y4.d())).b();
            boolean zL = c0Var.L(jB) | c0Var.D(this.f21077a) | c0Var.G(this.f21078b);
            final Function0<Boolean> function0 = this.f21077a;
            final boolean z10 = this.f21078b;
            Object objI0 = c0Var.i0();
            if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.selection.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.b.i(jB, function0, z10, (androidx.compose.ui.draw.i) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.ui.draw.n.c(a0Var, (Function1) objI0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarC;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return f(a0Var, c0Var, num.intValue());
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(@NotNull final w wVar, @NotNull final androidx.compose.ui.e eVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1090171650);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(wVar) : c0VarR.k0(wVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(eVar) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        boolean z10 = false;
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1090171650, i11, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:219)");
            }
            boolean z11 = (i11 & com.planner5d.library.engine.input.f.b.B) == 32;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && c0VarR.D(wVar))) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object objI0 = c0VarR.i0();
            if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new q(eVar, wVar);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.window.c.a((q) objI0, null, new androidx.compose.ui.window.t(false, false, false, (androidx.compose.ui.window.u) null, true, false, 15, (DefaultConstructorMarker) null), function2, c0VarR, ((i11 << 3) & 7168) | a5.S0, 2);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.selection.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.f(wVar, eVar, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(w wVar, androidx.compose.ui.e eVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        e(wVar, eVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void g(@NotNull final w wVar, final boolean z10, @NotNull final androidx.compose.ui.text.style.i iVar, boolean z11, long j10, final float f10, @NotNull final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        boolean z12;
        long jA;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-466280168);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(wVar) : c0VarR.k0(wVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.K(iVar.ordinal()) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            z12 = z11;
        } else {
            z12 = z11;
            if ((i10 & 3072) == 0) {
                i12 |= c0VarR.G(z12) ? 2048 : 1024;
            }
        }
        if ((i10 & 24576) == 0) {
            jA = j10;
            i12 |= ((i11 & 16) == 0 && c0VarR.L(jA)) ? 16384 : 8192;
        } else {
            jA = j10;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            i12 |= c0VarR.D(a0Var) ? 1048576 : 524288;
        }
        if (c0VarR.h((533651 & i12) != 533650, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                jA = androidx.compose.ui.unit.l.f42704b.a();
                i12 &= -57345;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-466280168, i12, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)");
            }
            final boolean zF = m1.f(z10, iVar, z11);
            androidx.compose.ui.a aVar = androidx.compose.ui.a.f36929a;
            androidx.compose.ui.e eVarO = zF ? aVar.o() : aVar.m();
            int i13 = i12 & 14;
            boolean zG = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | (i13 == 4 || ((i12 & 8) != 0 && c0VarR.k0(wVar))) | c0VarR.G(zF);
            Object objI0 = c0VarR.i0();
            if (zG || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.selection.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.j(wVar, z10, zF, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            long j11 = jA;
            e(wVar, eVarO, androidx.compose.runtime.internal.w.e(1365123137, true, new a((androidx.compose.ui.platform.o4) c0VarR.W(androidx.compose.ui.platform.q1.D()), j11, zF, androidx.compose.ui.semantics.t.f(a0Var, false, (Function1) objI0, 1, null), wVar), c0VarR, 54), c0VarR, i13 | a5.S0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            jA = j11;
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final boolean z13 = z12;
            final long j12 = jA;
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.selection.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.k(wVar, z10, iVar, z13, j12, f10, a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void h(@NotNull final androidx.compose.ui.a0 a0Var, @NotNull final Function0<Boolean> function0, final boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2111672474, i11, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:123)");
            }
            l6.a(m(i6.y(a0Var, m1.c(), m1.b()), function0, z10), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.selection.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.i(a0Var, function0, z10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.a0 a0Var, Function0 function0, boolean z10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        h(a0Var, function0, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(w wVar, boolean z10, boolean z11, androidx.compose.ui.semantics.e0 e0Var) {
        long jA = wVar.a();
        e0Var.c(m1.d(), new l1(z10 ? androidx.compose.foundation.text.k3.SelectionStart : androidx.compose.foundation.text.k3.SelectionEnd, jA, z11 ? k1.Left : k1.Right, (9223372034707292159L & jA) != n0.d.f332689d, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(w wVar, boolean z10, androidx.compose.ui.text.style.i iVar, boolean z11, long j10, float f10, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        g(wVar, z10, iVar, z11, j10, f10, a0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.graphics.t1 l(@NotNull androidx.compose.ui.draw.i iVar, float f10) {
        int iCeil = ((int) Math.ceil(f10)) * 2;
        p pVar = p.f21305a;
        androidx.compose.ui.graphics.t1 t1VarC = pVar.c();
        androidx.compose.ui.graphics.k0 k0VarA = pVar.a();
        androidx.compose.ui.graphics.drawscope.a aVarB = pVar.b();
        if (t1VarC == null || k0VarA == null || iCeil > t1VarC.getWidth() || iCeil > t1VarC.getHeight()) {
            t1VarC = androidx.compose.ui.graphics.v1.b(iCeil, iCeil, androidx.compose.ui.graphics.u1.f38249b.a(), false, null, 24, null);
            pVar.f(t1VarC);
            k0VarA = androidx.compose.ui.graphics.m0.a(t1VarC);
            pVar.d(k0VarA);
        }
        androidx.compose.ui.graphics.t1 t1Var = t1VarC;
        androidx.compose.ui.graphics.k0 k0Var = k0VarA;
        if (aVarB == null) {
            aVarB = new androidx.compose.ui.graphics.drawscope.a();
            pVar.e(aVarB);
        }
        androidx.compose.ui.graphics.drawscope.a aVar = aVarB;
        androidx.compose.ui.unit.w layoutDirection = iVar.getLayoutDirection();
        float width = t1Var.getWidth();
        long jF = n0.n.f((((long) Float.floatToRawIntBits(t1Var.getHeight())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(width) << 32));
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU = aVar.U();
        androidx.compose.ui.unit.d dVarA = c0286aU.a();
        androidx.compose.ui.unit.w wVarB = c0286aU.b();
        androidx.compose.ui.graphics.k0 k0VarC = c0286aU.c();
        long jD = c0286aU.d();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU2 = aVar.U();
        c0286aU2.l(iVar);
        c0286aU2.m(layoutDirection);
        c0286aU2.k(k0Var);
        c0286aU2.n(jF);
        k0Var.save();
        androidx.compose.ui.graphics.drawscope.f.V3(aVar, androidx.compose.ui.graphics.q0.f38131b.a(), 0L, aVar.d(), 0.0f, null, null, androidx.compose.ui.graphics.d0.f37693b.a(), 58, null);
        androidx.compose.ui.graphics.drawscope.f.V3(aVar, androidx.compose.ui.graphics.s0.d(4278190080L), n0.g.f332700b.e(), n0.n.f((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)), 0.0f, null, null, 0, 120, null);
        androidx.compose.ui.graphics.drawscope.f.B4(aVar, androidx.compose.ui.graphics.s0.d(4278190080L), f10, n0.g.g((((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f10) << 32)), 0.0f, null, null, 0, 120, null);
        k0Var.B();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU3 = aVar.U();
        c0286aU3.l(dVarA);
        c0286aU3.m(wVarB);
        c0286aU3.k(k0VarC);
        c0286aU3.n(jD);
        return t1Var;
    }

    @NotNull
    public static final androidx.compose.ui.a0 m(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function0<Boolean> function0, boolean z10) {
        return androidx.compose.ui.m.k(a0Var, null, new b(function0, z10), 1, null);
    }
}
