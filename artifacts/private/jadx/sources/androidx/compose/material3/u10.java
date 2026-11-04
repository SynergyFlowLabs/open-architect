package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,488:1\n113#2:489\n113#2:490\n113#2:493\n113#2:494\n113#2:503\n113#2:504\n113#2:513\n113#2:514\n113#2:523\n75#3:491\n75#3:501\n75#3:511\n75#3:521\n49#4:492\n49#4:502\n49#4:512\n49#4:522\n1282#5,6:495\n1282#5,6:505\n1282#5,6:515\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n*L\n101#1:489\n102#1:490\n203#1:493\n204#1:494\n309#1:503\n310#1:504\n416#1:513\n417#1:514\n487#1:523\n106#1:491\n211#1:501\n317#1:511\n424#1:521\n106#1:492\n211#1:502\n317#1:512\n424#1:522\n210#1:495,6\n316#1:505,6\n423#1:515,6\n*E\n"})
public final class u10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<androidx.compose.ui.unit.h> f33319a = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material3.s10
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return u10.b();
        }
    }, 1, null);

    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,488:1\n75#2:489\n1#3:490\n1282#4,6:491\n1282#4,6:497\n70#5:503\n67#5,9:504\n77#5:543\n79#6,6:513\n86#6,3:528\n89#6,2:537\n93#6:542\n347#7,9:519\n356#7,3:539\n4206#8,6:531\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$1\n*L\n119#1:489\n121#1:491,6\n127#1:497,6\n111#1:503\n111#1:504,9\n111#1:543\n111#1:513,6\n111#1:528,3\n111#1:537,2\n111#1:542\n111#1:519,9\n111#1:539,3\n111#1:531,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f33320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f33321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f33322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f33323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.a1 f33324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f33325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33326g;

        /* JADX INFO: renamed from: androidx.compose.material3.u10$a$a, reason: collision with other inner class name */
        static final class C0254a implements PointerInputEventHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0254a f33327a = new C0254a();

            C0254a() {
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, float f10, androidx.compose.foundation.a1 a1Var, float f11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f33320a = a0Var;
            this.f33321b = q3Var;
            this.f33322c = j10;
            this.f33323d = f10;
            this.f33324e = a1Var;
            this.f33325f = f11;
            this.f33326g = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.t1(e0Var, true);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(421772006, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:110)");
            }
            androidx.compose.ui.a0 a0VarJ = u10.j(this.f33320a, this.f33321b, u10.k(this.f33322c, this.f33323d, c0Var, 0), this.f33324e, ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).S7(this.f33325f));
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.t10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return u10.a.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarE = androidx.compose.ui.semantics.t.e(a0VarJ, false, (Function1) objI0);
            Unit unit = Unit.f312394a;
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = C0254a.f33327a;
                c0Var.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarE2 = androidx.compose.ui.input.pointer.w0.e(a0VarE, unit, (PointerInputEventHandler) objI1);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f33326g;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarE2);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,488:1\n75#2:489\n1#3:490\n70#4:491\n67#4,9:492\n77#4:531\n79#5,6:501\n86#5,3:516\n89#5,2:525\n93#5:530\n347#6,9:507\n356#6,3:527\n4206#7,6:519\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$2\n*L\n225#1:489\n216#1:491\n216#1:492,9\n216#1:531\n216#1:501,6\n216#1:516,3\n216#1:525,2\n216#1:530\n216#1:507,9\n216#1:527,3\n216#1:519,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f33328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f33329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f33330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f33331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.a1 f33332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f33333f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f33334g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33335h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f33336i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33337j;

        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, float f10, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, boolean z10, Function0<Unit> function0, float f11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f33328a = a0Var;
            this.f33329b = q3Var;
            this.f33330c = j10;
            this.f33331d = f10;
            this.f33332e = a1Var;
            this.f33333f = jVar;
            this.f33334g = z10;
            this.f33335h = function0;
            this.f33336i = f11;
            this.f33337j = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(849208527, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:215)");
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.material3.internal.q1.c(androidx.compose.foundation.i1.f(u10.j(wi.j(this.f33328a), this.f33329b, u10.k(this.f33330c, this.f33331d, c0Var, 0), this.f33332e, ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).S7(this.f33336i)), this.f33333f, gt.e(false, 0.0f, 0L, 7, null), this.f33334g, null, null, this.f33335h, 24, null), null, 1, null);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f33337j;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarC);
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
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
            c0Var.o();
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

    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,488:1\n75#2:489\n1#3:490\n70#4:491\n67#4,9:492\n77#4:531\n79#5,6:501\n86#5,3:516\n89#5,2:525\n93#5:530\n347#6,9:507\n356#6,3:527\n4206#7,6:519\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$3\n*L\n331#1:489\n322#1:491\n322#1:492,9\n322#1:531\n322#1:501,6\n322#1:516,3\n322#1:525,2\n322#1:530\n322#1:507,9\n322#1:527,3\n322#1:519,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f33338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f33339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f33340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f33341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.a1 f33342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f33343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f33344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f33345h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33346i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f33347j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33348k;

        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, float f10, androidx.compose.foundation.a1 a1Var, boolean z10, androidx.compose.foundation.interaction.j jVar, boolean z11, Function0<Unit> function0, float f11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f33338a = a0Var;
            this.f33339b = q3Var;
            this.f33340c = j10;
            this.f33341d = f10;
            this.f33342e = a1Var;
            this.f33343f = z10;
            this.f33344g = jVar;
            this.f33345h = z11;
            this.f33346i = function0;
            this.f33347j = f11;
            this.f33348k = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1508735219, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:321)");
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.material3.internal.q1.c(androidx.compose.foundation.selection.c.b(u10.j(wi.j(this.f33338a), this.f33339b, u10.k(this.f33340c, this.f33341d, c0Var, 0), this.f33342e, ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).S7(this.f33347j)), this.f33343f, this.f33344g, gt.e(false, 0.0f, 0L, 7, null), this.f33345h, null, this.f33346i, 16, null), null, 1, null);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f33348k;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarC);
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
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
            c0Var.o();
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

    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,488:1\n75#2:489\n1#3:490\n70#4:491\n67#4,9:492\n77#4:531\n79#5,6:501\n86#5,3:516\n89#5,2:525\n93#5:530\n347#6,9:507\n356#6,3:527\n4206#7,6:519\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$4\n*L\n438#1:489\n429#1:491\n429#1:492,9\n429#1:531\n429#1:501,6\n429#1:516,3\n429#1:525,2\n429#1:530\n429#1:507,9\n429#1:527,3\n429#1:519,6\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f33349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f33350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f33351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f33352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.a1 f33353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f33354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f33355g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f33356h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f33357i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f33358j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33359k;

        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, float f10, androidx.compose.foundation.a1 a1Var, boolean z10, androidx.compose.foundation.interaction.j jVar, boolean z11, Function1<? super Boolean, Unit> function1, float f11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f33349a = a0Var;
            this.f33350b = q3Var;
            this.f33351c = j10;
            this.f33352d = f10;
            this.f33353e = a1Var;
            this.f33354f = z10;
            this.f33355g = jVar;
            this.f33356h = z11;
            this.f33357i = function1;
            this.f33358j = f11;
            this.f33359k = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1839065134, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:428)");
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.material3.internal.q1.c(androidx.compose.foundation.selection.e.b(u10.j(wi.j(this.f33349a), this.f33350b, u10.k(this.f33351c, this.f33352d, c0Var, 0), this.f33353e, ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).S7(this.f33358j)), this.f33354f, this.f33355g, gt.e(false, 0.0f, 0L, 7, null), this.f33356h, null, this.f33357i, 16, null), null, 1, null);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f33359k;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarC);
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
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
            c0Var.o();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.h b() {
        return androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(0));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, float f11, @Nullable androidx.compose.foundation.a1 a1Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        if ((i11 & 2) != 0) {
            q3Var = androidx.compose.ui.graphics.d3.a();
        }
        if ((i11 & 4) != 0) {
            j10 = pj.f31758a.a(c0Var, 6).M0();
        }
        if ((i11 & 8) != 0) {
            j11 = o6.g(j10, c0Var, (i10 >> 6) & 14);
        }
        if ((i11 & 16) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i11 & 32) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i11 & 64) != 0) {
            a1Var = null;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1093433818, i10, -1, "androidx.compose.material3.Surface (Surface.kt:104)");
        }
        androidx.compose.runtime.m4<androidx.compose.ui.unit.h> m4Var = f33319a;
        float fR = androidx.compose.ui.unit.h.r(((androidx.compose.ui.unit.h) c0Var.W(m4Var)).O() + f10);
        androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{c7.a().f(androidx.compose.ui.graphics.q0.n(j11)), m4Var.f(androidx.compose.ui.unit.h.o(fR))}, androidx.compose.runtime.internal.w.e(421772006, true, new a(a0Var, q3Var, j10, fR, a1Var, f11, function2), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void d(boolean z10, @NotNull Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, float f11, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        androidx.compose.ui.a0 a0Var2 = (i12 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z12 = (i12 & 8) != 0 ? true : z11;
        androidx.compose.ui.graphics.q3 q3VarA = (i12 & 16) != 0 ? androidx.compose.ui.graphics.d3.a() : q3Var;
        long jM0 = (i12 & 32) != 0 ? pj.f31758a.a(c0Var, 6).M0() : j10;
        long jG = (i12 & 64) != 0 ? o6.g(jM0, c0Var, (i10 >> 15) & 14) : j11;
        float fR = (i12 & 128) != 0 ? androidx.compose.ui.unit.h.r(0) : f10;
        float fR2 = (i12 & 256) != 0 ? androidx.compose.ui.unit.h.r(0) : f11;
        androidx.compose.foundation.a1 a1Var2 = (i12 & 512) != 0 ? null : a1Var;
        androidx.compose.foundation.interaction.j jVar2 = (i12 & 1024) == 0 ? jVar : null;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1416521139, i10, i11, "androidx.compose.material3.Surface (Surface.kt:313)");
        }
        if (jVar2 == null) {
            c0Var.E(1528143336);
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var.Y(objI0);
            }
            jVar2 = (androidx.compose.foundation.interaction.j) objI0;
        } else {
            c0Var.E(-227800369);
        }
        c0Var.A();
        androidx.compose.runtime.m4<androidx.compose.ui.unit.h> m4Var = f33319a;
        float fR3 = androidx.compose.ui.unit.h.r(((androidx.compose.ui.unit.h) c0Var.W(m4Var)).O() + fR);
        androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{c7.a().f(androidx.compose.ui.graphics.q0.n(jG)), m4Var.f(androidx.compose.ui.unit.h.o(fR3))}, androidx.compose.runtime.internal.w.e(1508735219, true, new c(a0Var2, q3VarA, jM0, fR3, a1Var2, z10, jVar2, z12, function0, fR2, function2), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(boolean z10, @NotNull Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, float f11, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        androidx.compose.ui.a0 a0Var2 = (i12 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z12 = (i12 & 8) != 0 ? true : z11;
        androidx.compose.ui.graphics.q3 q3VarA = (i12 & 16) != 0 ? androidx.compose.ui.graphics.d3.a() : q3Var;
        long jM0 = (i12 & 32) != 0 ? pj.f31758a.a(c0Var, 6).M0() : j10;
        long jG = (i12 & 64) != 0 ? o6.g(jM0, c0Var, (i10 >> 15) & 14) : j11;
        float fR = (i12 & 128) != 0 ? androidx.compose.ui.unit.h.r(0) : f10;
        float fR2 = (i12 & 256) != 0 ? androidx.compose.ui.unit.h.r(0) : f11;
        androidx.compose.foundation.a1 a1Var2 = (i12 & 512) != 0 ? null : a1Var;
        androidx.compose.foundation.interaction.j jVar2 = (i12 & 1024) == 0 ? jVar : null;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1931279214, i10, i11, "androidx.compose.material3.Surface (Surface.kt:420)");
        }
        if (jVar2 == null) {
            c0Var.E(643421417);
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var.Y(objI0);
            }
            jVar2 = (androidx.compose.foundation.interaction.j) objI0;
        } else {
            c0Var.E(-533434450);
        }
        c0Var.A();
        androidx.compose.runtime.m4<androidx.compose.ui.unit.h> m4Var = f33319a;
        float fR3 = androidx.compose.ui.unit.h.r(((androidx.compose.ui.unit.h) c0Var.W(m4Var)).O() + fR);
        androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{c7.a().f(androidx.compose.ui.graphics.q0.n(jG)), m4Var.f(androidx.compose.ui.unit.h.o(fR3))}, androidx.compose.runtime.internal.w.e(-1839065134, true, new d(a0Var2, q3VarA, jM0, fR3, a1Var2, z10, jVar2, z12, function1, fR2, function2), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void f(@NotNull Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, float f11, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        androidx.compose.ui.a0 a0Var2 = (i12 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z11 = (i12 & 4) != 0 ? true : z10;
        androidx.compose.ui.graphics.q3 q3VarA = (i12 & 8) != 0 ? androidx.compose.ui.graphics.d3.a() : q3Var;
        long jM0 = (i12 & 16) != 0 ? pj.f31758a.a(c0Var, 6).M0() : j10;
        long jG = (i12 & 32) != 0 ? o6.g(jM0, c0Var, (i10 >> 12) & 14) : j11;
        float fR = (i12 & 64) != 0 ? androidx.compose.ui.unit.h.r(0) : f10;
        float fR2 = (i12 & 128) != 0 ? androidx.compose.ui.unit.h.r(0) : f11;
        androidx.compose.foundation.a1 a1Var2 = (i12 & 256) != 0 ? null : a1Var;
        androidx.compose.foundation.interaction.j jVar2 = (i12 & 512) == 0 ? jVar : null;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1472753265, i10, i11, "androidx.compose.material3.Surface (Surface.kt:207)");
        }
        if (jVar2 == null) {
            c0Var.E(-1701037204);
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var.Y(objI0);
            }
            jVar2 = (androidx.compose.foundation.interaction.j) objI0;
        } else {
            c0Var.E(2023337163);
        }
        c0Var.A();
        androidx.compose.runtime.m4<androidx.compose.ui.unit.h> m4Var = f33319a;
        float fR3 = androidx.compose.ui.unit.h.r(((androidx.compose.ui.unit.h) c0Var.W(m4Var)).O() + fR);
        androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{c7.a().f(androidx.compose.ui.graphics.q0.n(jG)), m4Var.f(androidx.compose.ui.unit.h.o(fR3))}, androidx.compose.runtime.internal.w.e(849208527, true, new b(a0Var2, q3VarA, jM0, fR3, a1Var2, jVar2, z11, function0, fR2, function2), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    @NotNull
    public static final androidx.compose.runtime.m4<androidx.compose.ui.unit.h> i() {
        return f33319a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.k7
    public static final androidx.compose.ui.a0 j(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, androidx.compose.foundation.a1 a1Var, float f10) {
        androidx.compose.ui.graphics.q3 q3Var2;
        androidx.compose.ui.a0 a0VarD;
        if (f10 > 0.0f) {
            q3Var2 = q3Var;
            a0VarD = androidx.compose.ui.graphics.q1.d(androidx.compose.ui.a0.E, (124895 & 1) != 0 ? 1.0f : 0.0f, (124895 & 2) != 0 ? 1.0f : 0.0f, (124895 & 4) == 0 ? 0.0f : 1.0f, (124895 & 8) != 0 ? 0.0f : 0.0f, (124895 & 16) != 0 ? 0.0f : 0.0f, (124895 & 32) != 0 ? 0.0f : f10, (124895 & 64) != 0 ? 0.0f : 0.0f, (124895 & 128) != 0 ? 0.0f : 0.0f, (124895 & 256) == 0 ? 0.0f : 0.0f, (124895 & 512) != 0 ? 8.0f : 0.0f, (124895 & 1024) != 0 ? androidx.compose.ui.graphics.z3.f38723b.a() : 0L, (124895 & 2048) != 0 ? androidx.compose.ui.graphics.d3.a() : q3Var2, (124895 & 4096) != 0 ? false : false, (124895 & 8192) != 0 ? null : null, (124895 & 16384) != 0 ? androidx.compose.ui.graphics.s1.b() : 0L, (32768 & 124895) != 0 ? androidx.compose.ui.graphics.s1.b() : 0L, (124895 & 65536) != 0 ? androidx.compose.ui.graphics.h1.f37790b.a() : 0);
        } else {
            q3Var2 = q3Var;
            a0VarD = androidx.compose.ui.a0.E;
        }
        return androidx.compose.ui.draw.j.a(androidx.compose.foundation.v.c(a0Var.B2(a0VarD).B2(a1Var != null ? androidx.compose.foundation.t0.g(androidx.compose.ui.a0.E, a1Var, q3Var2) : androidx.compose.ui.a0.E), j10, q3Var2), q3Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final long k(long j10, float f10, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:478)");
        }
        long jE = o6.e(pj.f31758a.a(c0Var, 6), j10, f10, c0Var, (i10 << 3) & 1008);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jE;
    }
}
