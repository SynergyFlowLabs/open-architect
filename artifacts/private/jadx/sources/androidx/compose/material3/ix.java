package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,548:1\n189#2:549\n70#3:550\n67#3,9:551\n77#3:590\n79#4,6:560\n86#4,3:575\n89#4,2:584\n93#4:589\n347#5,9:566\n356#5,3:586\n4206#6,6:578\n1282#7,6:591\n1282#7,6:598\n1282#7,6:604\n1282#7,6:610\n75#8:597\n1#9:616\n113#10:617\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n434#1:549\n436#1:550\n436#1:551,9\n436#1:590\n436#1:560,6\n436#1:575,3\n436#1:584,2\n436#1:589\n436#1:566,9\n436#1:586,3\n436#1:578,6\n510#1:591,6\n517#1:598,6\n518#1:604,6\n531#1:610,6\n516#1:597\n543#1:617\n*E\n"})
public final class ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f29396a = androidx.compose.ui.unit.h.r(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.o<Float> f29397b = androidx.compose.animation.core.p.t(300, 0, androidx.compose.animation.core.u0.d(), 2, null);

    @SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,548:1\n30#2:549\n53#3,3:550\n60#3:554\n70#3:557\n65#4:553\n69#4:556\n22#5:555\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1\n*L\n494#1:549\n494#1:550,3\n503#1:554\n503#1:557\n503#1:553\n503#1:556\n503#1:555\n*E\n"})
    public static final class a implements androidx.compose.ui.input.nestedscroll.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tx f29398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f29399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.q3 f29400c;

        /* JADX WARN: Multi-variable type inference failed */
        a(tx txVar, Function1<? super Float, Unit> function1, androidx.compose.foundation.gestures.q3 q3Var) {
            this.f29398a = txVar;
            this.f29399b = function1;
            this.f29400c = q3Var;
        }

        @oj.i(name = "offsetToFloat")
        private final float a(long j10) {
            return Float.intBitsToFloat((int) (this.f29400c == androidx.compose.foundation.gestures.q3.Horizontal ? j10 >> 32 : j10 & com.rabbitmq.client.k0.f265952a));
        }

        private final long b(float f10) {
            androidx.compose.foundation.gestures.q3 q3Var = this.f29400c;
            float f11 = q3Var == androidx.compose.foundation.gestures.q3.Horizontal ? f10 : 0.0f;
            if (q3Var != androidx.compose.foundation.gestures.q3.Vertical) {
                f10 = 0.0f;
            }
            return n0.g.g((((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f11)) << 32));
        }

        @oj.i(name = "velocityToFloat")
        private final float c(long j10) {
            return this.f29400c == androidx.compose.foundation.gestures.q3.Horizontal ? androidx.compose.ui.unit.c0.l(j10) : androidx.compose.ui.unit.c0.n(j10);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            this.f29399b.invoke(kotlin.coroutines.jvm.internal.b.e(c(j11)));
            return androidx.compose.ui.unit.c0.b(j11);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long G7(long j10, int i10) {
            float fA = a(j10);
            int i11 = 7 & 0;
            return (fA >= 0.0f || !androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) ? n0.g.f332700b.e() : b(this.f29398a.q().t(fA));
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object a4(long j10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            float fC = c(j10);
            float F = this.f29398a.F();
            float fE = this.f29398a.q().u().e();
            if (fC >= 0.0f || F <= fE) {
                j10 = androidx.compose.ui.unit.c0.f42681b.a();
            } else {
                this.f29399b.invoke(kotlin.coroutines.jvm.internal.b.e(fC));
            }
            return androidx.compose.ui.unit.c0.b(j10);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            return androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h()) ? b(this.f29398a.q().t(a(j11))) : n0.g.f332700b.e();
        }
    }

    static final class b implements pj.n<k90, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29401a;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f29402a;

            a(String str) {
                this.f29402a = str;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-999924215, i10, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
                }
                q50.t(this.f29402a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
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

        b(String str) {
            this.f29401a = str;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(k90 k90Var, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? c0Var.D(k90Var) : c0Var.k0(k90Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2059851063, i11, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
            }
            h90.m(k90Var, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.w.e(-999924215, true, new a(this.f29401a), c0Var, 54), c0Var, (i11 & 14) | 805306368, 255);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(k90 k90Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(k90Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final androidx.compose.ui.input.nestedscroll.a f(@NotNull tx txVar, @NotNull androidx.compose.foundation.gestures.q3 q3Var, @NotNull Function1<? super Float, Unit> function1) {
        return new a(txVar, function1, q3Var);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void g(@NotNull final androidx.compose.foundation.layout.m0 m0Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1033612924);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(m0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        int i12 = i11;
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1033612924, i12, -1, "androidx.compose.material3.DragHandleWithTooltip (SheetDefaults.kt:432)");
            }
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31830c), c0VarR, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.a0 a0VarP = m0Var.p(aVar2, aVar3.m());
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarP);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar4.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(2059851063, true, new b(strB), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, function2, c0VarR, ((i12 << 21) & 234881024) | 48, com.planner5d.library.engine.input.f.b.R1);
            c0VarR = c0VarR;
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.hx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ix.h(m0Var, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.foundation.layout.m0 m0Var, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        g(m0Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public static final tx k(boolean z10, @Nullable Function1<? super vx, Boolean> function1, @Nullable vx vxVar, boolean z11, float f10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        final Function1<? super vx, Boolean> function2;
        final boolean z12 = (i11 & 1) != 0 ? false : z10;
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.dx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ix.m((vx) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function2 = (Function1) objI0;
        } else {
            function2 = function1;
        }
        final vx vxVar2 = (i11 & 4) != 0 ? vx.Hidden : vxVar;
        final boolean z13 = (i11 & 8) != 0 ? false : z11;
        final float fJ = (i11 & 16) != 0 ? x2.f34346a.j() : f10;
        final float fN = (i11 & 32) != 0 ? x2.f34346a.n() : f11;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-20307384, i10, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:514)");
        }
        final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        boolean z14 = true;
        boolean zD = c0Var.D(dVar) | ((((57344 & i10) ^ 24576) > 16384 && c0Var.I(fJ)) || (i10 & 24576) == 16384);
        Object objI1 = c0Var.i0();
        if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.material3.ex
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(ix.n(dVar, fJ));
                }
            };
            c0Var.Y(objI1);
        }
        final Function0<Float> function0 = (Function0) objI1;
        boolean zD2 = c0Var.D(dVar) | ((((458752 & i10) ^ androidx.profileinstaller.n.c.f73814m) > 131072 && c0Var.I(fN)) || (i10 & androidx.profileinstaller.n.c.f73814m) == 131072);
        Object objI2 = c0Var.i0();
        if (zD2 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
            objI2 = new Function0() { // from class: androidx.compose.material3.fx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(ix.o(dVar, fN));
                }
            };
            c0Var.Y(objI2);
        }
        final Function0<Float> function3 = (Function0) objI2;
        Object[] objArr = {Boolean.valueOf(z12), function2, Boolean.valueOf(z13)};
        androidx.compose.runtime.saveable.c0<tx, vx> c0VarE = tx.f33274h.e(z12, function0, function3, function2, z13);
        boolean zD3 = ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(function2)) || (i10 & 48) == 32) | ((((i10 & 14) ^ 6) > 4 && c0Var.G(z12)) || (i10 & 6) == 4) | c0Var.D(function0) | c0Var.D(function3) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.K(vxVar2.ordinal())) || (i10 & androidx.media3.exoplayer.a5.S0) == 256);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !c0Var.G(z13)) && (i10 & 3072) != 2048) {
            z14 = false;
        }
        boolean z15 = zD3 | z14;
        Object objI3 = c0Var.i0();
        if (z15 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
            objI3 = new Function0() { // from class: androidx.compose.material3.gx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ix.l(z12, function0, function3, vxVar2, function2, z13);
                }
            };
            c0Var.Y(objI3);
        }
        tx txVar = (tx) androidx.compose.runtime.saveable.i.j(objArr, c0VarE, (Function0) objI3, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return txVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tx l(boolean z10, Function0 function0, Function0 function1, vx vxVar, Function1 function2, boolean z11) {
        return new tx(z10, function0, function1, vxVar, function2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(vx vxVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n(androidx.compose.ui.unit.d dVar, float f10) {
        return dVar.S7(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(androidx.compose.ui.unit.d dVar, float f10) {
        return dVar.S7(f10);
    }
}
