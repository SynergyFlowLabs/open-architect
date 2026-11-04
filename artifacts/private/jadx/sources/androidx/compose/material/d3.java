package androidx.compose.material;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,601:1\n1282#2,6:602\n1282#2,6:609\n1282#2,6:615\n1282#2,6:621\n1282#2,3:634\n1285#2,3:638\n1282#2,6:643\n1282#2,6:649\n1282#2,6:655\n1247#2,6:669\n75#3:608\n75#3:641\n607#4:627\n604#4,6:628\n605#5:637\n1#6:642\n165#7:661\n163#7,7:662\n79#7,6:675\n86#7,3:690\n89#7,2:699\n93#7:704\n171#7:705\n347#8,9:681\n356#8,3:701\n4206#9,6:693\n59#10:706\n90#11:707\n113#12:708\n113#12:709\n113#12:710\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n*L\n224#1:602,6\n235#1:609,6\n266#1:615,6\n268#1:621,6\n389#1:634,3\n389#1:638,3\n393#1:643,6\n416#1:649,6\n480#1:655,6\n471#1:669,6\n226#1:608\n390#1:641\n389#1:627\n389#1:628,6\n389#1:637\n471#1:661\n471#1:662,7\n471#1:675,6\n471#1:690,3\n471#1:699,2\n471#1:704\n471#1:705\n471#1:681,9\n471#1:701,3\n471#1:693,6\n397#1:706\n397#1:707\n598#1:708\n599#1:709\n600#1:710\n*E\n"})
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f22433a = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f22434b = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f22435c = androidx.compose.ui.unit.h.r(125);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.c.f44020u}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m3 f22437b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m3 m3Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f22437b = m3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f22437b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f22436a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m3 m3Var = this.f22437b;
                this.f22436a = 1;
                if (m3Var.j(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {430}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m3 f22439b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m3 m3Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f22439b = m3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f22439b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f22438a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m3 m3Var = this.f22439b;
                this.f22438a = 1;
                if (m3Var.i(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheet$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,601:1\n87#2:602\n83#2,10:603\n94#2:643\n79#3,6:613\n86#3,3:628\n89#3,2:637\n93#3:642\n347#4,9:619\n356#4,3:639\n4206#5,6:631\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheet$3\n*L\n441#1:602\n441#1:603,10\n441#1:643\n441#1:613,6\n441#1:628,3\n441#1:637,2\n441#1:642\n441#1:619,9\n441#1:639,3\n441#1:631,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f22440a;

        /* JADX WARN: Multi-variable type inference failed */
        c(pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f22440a = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1065607095, i10, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:440)");
            }
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f22440a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            int i11 = 1 | 6;
            nVar.invoke(androidx.compose.foundation.layout.n0.f16227a, c0Var, 6);
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

    @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,601:1\n1282#2,6:602\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$1\n*L\n370#1:602,6\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g3 f22441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f22444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f22445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.g5, androidx.compose.runtime.c0, Integer, Unit> f22446f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f22447g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f22448h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f22449i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f22450j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f22451k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f22452l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> f22453m;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.g5, androidx.compose.runtime.c0, Integer, Unit> f22454a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f22455b;

            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, float f10) {
                this.f22454a = nVar;
                this.f22455b = f10;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                int i11 = 2 | 0;
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(601061661, i10, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:340)");
                }
                int i12 = 4 ^ 0;
                this.f22454a.invoke(androidx.compose.foundation.layout.d5.j(0.0f, 0.0f, 0.0f, this.f22455b, 7, null), c0Var, 0);
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

        @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,601:1\n1282#2,6:602\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$1$2\n*L\n346#1:602,6\n*E\n"})
        static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f22456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g3 f22457b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f22458c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.q3 f22459d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f22460e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f22461f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f22462g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f22463h;

            /* JADX WARN: Multi-variable type inference failed */
            b(boolean z10, g3 g3Var, float f10, androidx.compose.ui.graphics.q3 q3Var, float f11, long j10, long j11, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f22456a = z10;
                this.f22457b = g3Var;
                this.f22458c = f10;
                this.f22459d = q3Var;
                this.f22460e = f11;
                this.f22461f = j10;
                this.f22462g = j11;
                this.f22463h = nVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                androidx.compose.ui.a0 a0VarB;
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1835125948, i10, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:342)");
                }
                if (this.f22456a) {
                    c0Var.E(-401495582);
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    boolean zD = c0Var.D(this.f22457b.a().k());
                    g3 g3Var = this.f22457b;
                    Object objI0 = c0Var.i0();
                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = d3.v(g3Var.a().k(), androidx.compose.foundation.gestures.q3.Vertical);
                        c0Var.Y(objI0);
                    }
                    a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar, (androidx.compose.ui.input.nestedscroll.a) objI0, null, 2, null);
                    c0Var.A();
                } else {
                    c0Var.E(-1675503260);
                    c0Var.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                d3.k(this.f22457b.a(), this.f22456a, this.f22459d, this.f22460e, this.f22461f, this.f22462g, this.f22458c, androidx.compose.foundation.layout.i6.n(androidx.compose.foundation.layout.i6.h(a0VarB, 0.0f, 1, null), this.f22458c, 0.0f, 2, null), this.f22463h, c0Var, 0, 0);
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

        static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<ig, androidx.compose.runtime.c0, Integer, Unit> f22464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g3 f22465b;

            /* JADX WARN: Multi-variable type inference failed */
            c(pj.n<? super ig, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, g3 g3Var) {
                this.f22464a = nVar;
                this.f22465b = g3Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                boolean z10;
                if ((i10 & 3) != 2) {
                    z10 = true;
                    boolean z11 = true | true;
                } else {
                    z10 = false;
                }
                if (!c0Var.h(z10, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(8287226, i10, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:366)");
                }
                this.f22464a.invoke(this.f22465b.b(), c0Var, 0);
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

        /* JADX WARN: Multi-variable type inference failed */
        d(g3 g3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, float f10, int i10, pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, boolean z10, androidx.compose.ui.graphics.q3 q3Var, float f11, long j10, long j11, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, pj.n<? super ig, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3) {
            this.f22441a = g3Var;
            this.f22442b = function2;
            this.f22443c = function3;
            this.f22444d = f10;
            this.f22445e = i10;
            this.f22446f = nVar;
            this.f22447g = z10;
            this.f22448h = q3Var;
            this.f22449i = f11;
            this.f22450j = j10;
            this.f22451k = j11;
            this.f22452l = nVar2;
            this.f22453m = nVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float f(g3 g3Var) {
            return g3Var.a().s();
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-747577963, i10, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:338)");
            }
            m3 m3VarA = this.f22441a.a();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f22442b;
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(601061661, true, new a(this.f22446f, this.f22444d), c0Var, 54);
            androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(1835125948, true, new b(this.f22447g, this.f22441a, this.f22444d, this.f22448h, this.f22449i, this.f22450j, this.f22451k, this.f22452l), c0Var, 54);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f22443c;
            androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(8287226, true, new c(this.f22453m, this.f22441a), c0Var, 54);
            float f10 = this.f22444d;
            boolean zD = c0Var.D(this.f22441a);
            final g3 g3Var = this.f22441a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material.e3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(d3.d.f(g3Var));
                    }
                };
                c0Var.Y(objI0);
            }
            d3.m(function2, cVarE, cVarE2, function3, cVarE3, f10, (Function0) objI0, this.f22445e, m3VarA, c0Var, 25008);
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

    @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,601:1\n150#2,3:602\n34#2,6:605\n153#2:611\n150#2,3:612\n34#2,6:615\n153#2:621\n168#2,13:622\n150#2,3:635\n34#2,6:638\n153#2:644\n150#2,3:645\n34#2,6:648\n153#2:654\n168#2,13:655\n168#2,13:668\n150#2,3:681\n34#2,6:684\n153#2:690\n168#2,13:691\n168#2,13:704\n34#2,6:717\n34#2,6:723\n34#2,6:729\n34#2,6:735\n34#2,6:741\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1\n*L\n492#1:602,3\n492#1:605,6\n492#1:611\n494#1:612,3\n494#1:615,6\n494#1:621\n495#1:622,13\n498#1:635,3\n498#1:638,6\n498#1:644\n500#1:645,3\n500#1:648,6\n500#1:654\n501#1:655,13\n502#1:668,13\n504#1:681,3\n504#1:684,6\n504#1:690\n505#1:691,13\n506#1:704,13\n532#1:717,6\n533#1:723,6\n534#1:729,6\n535#1:735,6\n536#1:741,6\n*E\n"})
    static final class e implements androidx.compose.ui.layout.h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f22466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f22467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f22468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m3 f22469d;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f22470a;

            static {
                int[] iArr = new int[n3.values().length];
                try {
                    iArr[n3.Collapsed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n3.Expanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f22470a = iArr;
            }
        }

        e(Function0<Float> function0, int i10, float f10, m3 m3Var) {
            this.f22466a = function0;
            this.f22467b = i10;
            this.f22468c = f10;
            this.f22469d = m3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function0 function0, int i10, androidx.compose.ui.layout.c1 c1Var, int i11, int i12, float f10, int i13, int i14, m3 m3Var, int i15, int i16, List list, List list2, List list3, List list4, List list5, int i17, androidx.compose.ui.layout.i2.a aVar) {
            int i18;
            int iL0 = kotlin.math.b.L0(((Number) function0.invoke()).floatValue());
            q8.a aVar2 = q8.f24378b;
            int iG6 = q8.g(i10, aVar2.c()) ? c1Var.g6(d3.f22433a) : q8.g(i10, aVar2.a()) ? (i11 - i12) / 2 : (i11 - i12) - c1Var.g6(d3.f22433a);
            int i19 = i13 / 2;
            int iG7 = c1Var.S7(f10) < ((float) i19) ? (iL0 - i13) - c1Var.g6(d3.f22433a) : iL0 - i19;
            int i20 = (i11 - i14) / 2;
            int i21 = a.f22470a[m3Var.l().ordinal()];
            if (i21 == 1) {
                i18 = iG7 - i15;
            } else {
                if (i21 != 2) {
                    throw new kotlin.k0();
                }
                i18 = i16 - i15;
            }
            int size = list.size();
            for (int i22 = 0; i22 < size; i22++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list.get(i22), 0, i17, 0.0f, 4, null);
            }
            int size2 = list2.size();
            for (int i23 = 0; i23 < size2; i23++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list2.get(i23), 0, 0, 0.0f, 4, null);
            }
            int size3 = list3.size();
            for (int i24 = 0; i24 < size3; i24++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list3.get(i24), 0, 0, 0.0f, 4, null);
            }
            int size4 = list4.size();
            for (int i25 = 0; i25 < size4; i25++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list4.get(i25), iG6, iG7, 0.0f, 4, null);
            }
            int size5 = list5.size();
            for (int i26 = 0; i26 < size5; i26++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list5.get(i26), i20, i18, 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.h1
        public final androidx.compose.ui.layout.b1 a(final androidx.compose.ui.layout.c1 c1Var, List<? extends List<? extends androidx.compose.ui.layout.z0>> list, long j10) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            int iC1;
            Object obj5;
            List<? extends androidx.compose.ui.layout.z0> list2 = list.get(0);
            List<? extends androidx.compose.ui.layout.z0> list3 = list.get(1);
            List<? extends androidx.compose.ui.layout.z0> list4 = list.get(2);
            List<? extends androidx.compose.ui.layout.z0> list5 = list.get(3);
            List<? extends androidx.compose.ui.layout.z0> list6 = list.get(4);
            final int iP = androidx.compose.ui.unit.b.p(j10);
            final int iO = androidx.compose.ui.unit.b.o(j10);
            long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
            final ArrayList arrayList = new ArrayList(list4.size());
            int size = list4.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list4.get(i10).P0(jD));
            }
            final ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(list2.get(i11).P0(jD));
            }
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
                int iC2 = ((androidx.compose.ui.layout.i2) obj).c1();
                int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                if (1 <= lastIndex) {
                    int i12 = 1;
                    while (true) {
                        Object obj6 = arrayList2.get(i12);
                        int iC3 = ((androidx.compose.ui.layout.i2) obj6).c1();
                        if (iC2 < iC3) {
                            iC2 = iC3;
                            obj = obj6;
                        }
                        if (i12 == lastIndex) {
                            break;
                        }
                        i12++;
                    }
                }
            } else {
                obj = null;
            }
            androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) obj;
            final int iC4 = i2Var != null ? i2Var.c1() : 0;
            long jD2 = androidx.compose.ui.unit.b.d(jD, 0, 0, 0, iO - iC4, 7, null);
            final ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                arrayList3.add(list3.get(i13).P0(jD2));
            }
            final ArrayList arrayList4 = new ArrayList(list5.size());
            int size4 = list5.size();
            for (int i14 = 0; i14 < size4; i14++) {
                arrayList4.add(list5.get(i14).P0(jD));
            }
            if (!arrayList4.isEmpty()) {
                obj2 = arrayList4.get(0);
                int iH1 = ((androidx.compose.ui.layout.i2) obj2).h1();
                int lastIndex2 = CollectionsKt.getLastIndex(arrayList4);
                if (1 <= lastIndex2) {
                    int i15 = 1;
                    while (true) {
                        Object obj7 = arrayList4.get(i15);
                        int iH2 = ((androidx.compose.ui.layout.i2) obj7).h1();
                        if (iH1 < iH2) {
                            obj2 = obj7;
                            iH1 = iH2;
                        }
                        if (i15 == lastIndex2) {
                            break;
                        }
                        i15++;
                    }
                }
            } else {
                obj2 = null;
            }
            androidx.compose.ui.layout.i2 i2Var2 = (androidx.compose.ui.layout.i2) obj2;
            int iH3 = i2Var2 != null ? i2Var2.h1() : 0;
            if (!arrayList4.isEmpty()) {
                obj3 = arrayList4.get(0);
                int iC5 = ((androidx.compose.ui.layout.i2) obj3).c1();
                int lastIndex3 = CollectionsKt.getLastIndex(arrayList4);
                if (1 <= lastIndex3) {
                    int i16 = 1;
                    while (true) {
                        Object obj8 = arrayList4.get(i16);
                        int iC6 = ((androidx.compose.ui.layout.i2) obj8).c1();
                        if (iC5 < iC6) {
                            iC5 = iC6;
                            obj3 = obj8;
                        }
                        if (i16 == lastIndex3) {
                            break;
                        }
                        i16++;
                    }
                }
            } else {
                obj3 = null;
            }
            androidx.compose.ui.layout.i2 i2Var3 = (androidx.compose.ui.layout.i2) obj3;
            final int iC7 = i2Var3 != null ? i2Var3.c1() : 0;
            final ArrayList arrayList5 = new ArrayList(list6.size());
            int size5 = list6.size();
            for (int i17 = 0; i17 < size5; i17++) {
                arrayList5.add(list6.get(i17).P0(jD));
            }
            if (!arrayList5.isEmpty()) {
                obj4 = arrayList5.get(0);
                int iH4 = ((androidx.compose.ui.layout.i2) obj4).h1();
                int lastIndex4 = CollectionsKt.getLastIndex(arrayList5);
                if (1 <= lastIndex4) {
                    int i18 = 1;
                    while (true) {
                        Object obj9 = arrayList5.get(i18);
                        int iH5 = ((androidx.compose.ui.layout.i2) obj9).h1();
                        if (iH4 < iH5) {
                            obj4 = obj9;
                            iH4 = iH5;
                        }
                        if (i18 == lastIndex4) {
                            break;
                        }
                        i18++;
                    }
                }
            } else {
                obj4 = null;
            }
            androidx.compose.ui.layout.i2 i2Var4 = (androidx.compose.ui.layout.i2) obj4;
            final int iH6 = i2Var4 != null ? i2Var4.h1() : 0;
            if (arrayList5.isEmpty()) {
                iC1 = 0;
                obj5 = null;
            } else {
                iC1 = 0;
                Object obj10 = arrayList5.get(0);
                int iC8 = ((androidx.compose.ui.layout.i2) obj10).c1();
                int lastIndex5 = CollectionsKt.getLastIndex(arrayList5);
                int i19 = 1;
                if (1 <= lastIndex5) {
                    while (true) {
                        Object obj11 = arrayList5.get(i19);
                        int iC9 = ((androidx.compose.ui.layout.i2) obj11).c1();
                        if (iC8 < iC9) {
                            obj10 = obj11;
                            iC8 = iC9;
                        }
                        if (i19 == lastIndex5) {
                            break;
                        }
                        i19++;
                    }
                }
                obj5 = obj10;
            }
            androidx.compose.ui.layout.i2 i2Var5 = (androidx.compose.ui.layout.i2) obj5;
            if (i2Var5 != null) {
                iC1 = i2Var5.c1();
            }
            final int i20 = iC1;
            final Function0<Float> function0 = this.f22466a;
            final int i21 = this.f22467b;
            final float f10 = this.f22468c;
            final m3 m3Var = this.f22469d;
            final int i22 = iH3;
            return androidx.compose.ui.layout.c1.h6(c1Var, iP, iO, null, new Function1() { // from class: androidx.compose.material.f3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj12) {
                    return d3.e.g(function0, i21, c1Var, iP, i22, f10, iC7, iH6, m3Var, i20, iO, arrayList3, arrayList2, arrayList, arrayList4, arrayList5, iC4, (androidx.compose.ui.layout.i2.a) obj12);
                }
            }, 4, null);
        }
    }

    @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,601:1\n30#2:602\n53#3,3:603\n60#3:607\n70#3:610\n65#4:606\n69#4:609\n22#5:608\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1\n*L\n586#1:602\n586#1:603,3\n595#1:607\n595#1:610\n595#1:606\n595#1:609\n595#1:608\n*E\n"})
    public static final class f implements androidx.compose.ui.input.nestedscroll.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u<?> f22471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.q3 f22472b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "BottomSheetScaffold.kt", i = {0}, l = {581}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f22473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f22474b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f22476d;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f22474b = obj;
                this.f22476d |= Integer.MIN_VALUE;
                return f.this.B0(0L, 0L, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "BottomSheetScaffold.kt", i = {0}, l = {572}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f22477a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f22478b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f22480d;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f22478b = obj;
                this.f22480d |= Integer.MIN_VALUE;
                return f.this.a4(0L, this);
            }
        }

        f(u<?> uVar, androidx.compose.foundation.gestures.q3 q3Var) {
            this.f22471a = uVar;
            this.f22472b = q3Var;
        }

        @oj.i(name = "offsetToFloat")
        private final float a(long j10) {
            return Float.intBitsToFloat((int) (this.f22472b == androidx.compose.foundation.gestures.q3.Horizontal ? j10 >> 32 : j10 & com.rabbitmq.client.k0.f265952a));
        }

        private final long b(float f10) {
            androidx.compose.foundation.gestures.q3 q3Var = this.f22472b;
            float f11 = q3Var == androidx.compose.foundation.gestures.q3.Horizontal ? f10 : 0.0f;
            if (q3Var != androidx.compose.foundation.gestures.q3.Vertical) {
                f10 = 0.0f;
            }
            return n0.g.g((((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f11)) << 32));
        }

        @oj.i(name = "velocityToFloat")
        private final float c(long j10) {
            return this.f22472b == androidx.compose.foundation.gestures.q3.Horizontal ? androidx.compose.ui.unit.c0.l(j10) : androidx.compose.ui.unit.c0.n(j10);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f22476d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f22476d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f22474b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f22476d;
            if (i11 == 0) {
                ResultKt.m(obj);
                u<?> uVar = this.f22471a;
                float fC = c(j11);
                aVar.f22473a = j11;
                aVar.f22476d = 1;
                if (uVar.Q(fC, aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = aVar.f22473a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j11);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long G7(long j10, int i10) {
            float fA = a(j10);
            return (fA >= 0.0f || !androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) ? n0.g.f332700b.e() : b(this.f22471a.t(fA));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object a4(long j10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i10 = bVar.f22480d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f22480d = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f22478b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = bVar.f22480d;
            if (i11 == 0) {
                ResultKt.m(obj);
                float fC = c(j10);
                float fK = this.f22471a.K();
                if (fC >= 0.0f || fK <= this.f22471a.u().e()) {
                    j10 = androidx.compose.ui.unit.c0.f42681b.a();
                } else {
                    u<?> uVar = this.f22471a;
                    bVar.f22477a = j10;
                    bVar.f22480d = 1;
                    if (uVar.Q(fC, bVar) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = bVar.f22477a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j10);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            return androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h()) ? b(this.f22471a.t(a(j11))) : n0.g.f332700b.e();
        }
    }

    public /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22481a;

        static {
            int[] iArr = new int[n3.values().length];
            try {
                iArr[n3.Collapsed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n3.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22481a = iArr;
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final g3 C(@Nullable m3 m3Var, @Nullable ig igVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.runtime.c0 c0Var2;
        if ((i11 & 1) != 0) {
            c0Var2 = c0Var;
            m3Var = D(n3.Collapsed, null, null, c0Var2, 6, 6);
        } else {
            c0Var2 = c0Var;
        }
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var2.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new ig();
                c0Var2.Y(objI0);
            }
            igVar = (ig) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1022285988, i10, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var2.D(m3Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var2.D(igVar)) || (i10 & 48) == 32);
        Object objI1 = c0Var2.i0();
        if (z10 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new g3(m3Var, igVar);
            c0Var2.Y(objI1);
        }
        g3 g3Var = (g3) objI1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return g3Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final m3 D(@NotNull final n3 n3Var, @Nullable final androidx.compose.animation.core.o<Float> oVar, @Nullable final Function1<? super n3, Boolean> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = s2.f24875a.a();
        }
        if ((i11 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.u2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(d3.E((n3) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1808153344, i10, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)");
        }
        final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        Object[] objArr = {oVar};
        androidx.compose.runtime.saveable.c0<m3, ?> c0VarC = m3.f23741b.c(oVar, function1, dVar);
        boolean z10 = true;
        int i12 = 3 & 1;
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.K(n3Var.ordinal())) || (i10 & 6) == 4) | c0Var.D(dVar) | c0Var.k0(oVar);
        if ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 || !c0Var.D(function1)) && (i10 & androidx.media3.exoplayer.a5.S0) != 256) {
            z10 = false;
        }
        boolean z11 = zD | z10;
        Object objI1 = c0Var.i0();
        if (z11 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.material.v2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d3.F(n3Var, dVar, oVar, function1);
                }
            };
            c0Var.Y(objI1);
        }
        m3 m3Var = (m3) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return m3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(n3 n3Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3 F(n3 n3Var, androidx.compose.ui.unit.d dVar, androidx.compose.animation.core.o oVar, Function1 function1) {
        return new m3(n3Var, dVar, oVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x011d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0169  */
    /* JADX WARN: Code duplicated, block: B:113:0x016b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0176  */
    /* JADX WARN: Code duplicated, block: B:118:0x017c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:130:0x0205  */
    /* JADX WARN: Code duplicated, block: B:131:0x0209  */
    /* JADX WARN: Code duplicated, block: B:134:0x0214  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x0112  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void k(final m3 m3Var, final boolean z10, final androidx.compose.ui.graphics.q3 q3Var, final float f10, final long j10, final long j11, final float f11, androidx.compose.ui.a0 a0Var, final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final androidx.compose.ui.a0 a0Var2;
        int i20;
        int i21;
        boolean z11;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.s5 s5VarT;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final kotlinx.coroutines.s0 s0Var;
        final float fS7;
        int i22;
        boolean z12;
        boolean z13;
        Object objI1;
        boolean z14;
        boolean zK0;
        Object objI2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-426833549);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(m3Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.G(z10) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.D(q3Var)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i12 |= i13;
                }
                if ((i11 & 8) != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c0VarR.I(f10)) {
                            i14 = 2048;
                        } else {
                            i14 = 1024;
                        }
                        i12 |= i14;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (c0VarR.L(j10)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i12 |= i15;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.L(j11)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f11)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 128;
                    if (i18 != 0) {
                        i12 |= 12582912;
                        i19 = 1572864;
                        a0Var2 = a0Var;
                    } else {
                        i19 = 1572864;
                        a0Var2 = a0Var;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(a0Var2)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                    }
                    if ((i11 & 256) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i21 = 67108864;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i21;
                    }
                    if ((38347923 & i12) != 38347922) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-426833549, i12, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f11);
                        u<n3> uVarK = m3Var.k();
                        int i23 = i12;
                        androidx.compose.foundation.gestures.q3 q3Var2 = androidx.compose.foundation.gestures.q3.Vertical;
                        boolean zI = c0VarR.I(fS7);
                        i22 = i23 & 14;
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zI | z12;
                        objI1 = c0VarR.i0();
                        if (z13 || objI1 == aVar.a()) {
                            objI1 = new Function2() { // from class: androidx.compose.material.z2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarE = k.e(k.h(a0Var2, uVarK, q3Var2, (Function2) objI1), m3Var.k(), q3Var2, z10, false, null, false, 56, null);
                        if (i22 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zK0 = z14 | c0VarR.k0(s0Var);
                        objI2 = c0VarR.i0();
                        if (zK0 || objI2 == aVar.a()) {
                            objI2 = new Function1() { // from class: androidx.compose.material.a3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarE, false, (Function1) objI2, 1, null);
                        androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(1065607095, true, new c(nVar), c0VarR, 54);
                        int i24 = i23 >> 6;
                        int i25 = ((i23 >> 3) & com.planner5d.library.engine.input.f.b.B) | i19 | (i24 & 896) | (i24 & 7168) | (458752 & (i23 << 6));
                        c0Var2 = c0VarR;
                        ah.e(a0VarF, q3Var, j10, j11, null, f10, cVarE, c0Var2, i25, 16);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.b3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d3.u(m3Var, z10, q3Var, f10, j10, j11, f11, a0Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.L(j10)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.L(j11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                    i19 = 1572864;
                    a0Var2 = a0Var;
                } else {
                    i19 = 1572864;
                    a0Var2 = a0Var;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(a0Var2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i21 = 67108864;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i21;
                }
                if ((38347923 & i12) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-426833549, i12, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f11);
                    u<n3> uVarK2 = m3Var.k();
                    int i26 = i12;
                    androidx.compose.foundation.gestures.q3 q3Var3 = androidx.compose.foundation.gestures.q3.Vertical;
                    boolean zI2 = c0VarR.I(fS7);
                    i22 = i26 & 14;
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zI2 | z12;
                    objI1 = c0VarR.i0();
                    if (z13) {
                        objI1 = new Function2() { // from class: androidx.compose.material.z2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material.z2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarE2 = k.e(k.h(a0Var2, uVarK2, q3Var3, (Function2) objI1), m3Var.k(), q3Var3, z10, false, null, false, 56, null);
                    if (i22 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zK0 = z14 | c0VarR.k0(s0Var);
                    objI2 = c0VarR.i0();
                    if (zK0) {
                        objI2 = new Function1() { // from class: androidx.compose.material.a3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material.a3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarF2 = androidx.compose.ui.semantics.t.f(a0VarE2, false, (Function1) objI2, 1, null);
                    androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(1065607095, true, new c(nVar), c0VarR, 54);
                    int i27 = i26 >> 6;
                    int i28 = ((i26 >> 3) & com.planner5d.library.engine.input.f.b.B) | i19 | (i27 & 896) | (i27 & 7168) | (458752 & (i26 << 6));
                    c0Var2 = c0VarR;
                    ah.e(a0VarF2, q3Var, j10, j11, null, f10, cVarE2, c0Var2, i28, 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.u(m3Var, z10, q3Var, f10, j10, j11, f11, a0Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            if ((i11 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.I(f10)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.L(j10)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.L(j11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                    i19 = 1572864;
                    a0Var2 = a0Var;
                } else {
                    i19 = 1572864;
                    a0Var2 = a0Var;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(a0Var2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i21 = 67108864;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i21;
                }
                if ((38347923 & i12) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-426833549, i12, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f11);
                    u<n3> uVarK3 = m3Var.k();
                    int i29 = i12;
                    androidx.compose.foundation.gestures.q3 q3Var4 = androidx.compose.foundation.gestures.q3.Vertical;
                    boolean zI3 = c0VarR.I(fS7);
                    i22 = i29 & 14;
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zI3 | z12;
                    objI1 = c0VarR.i0();
                    if (z13) {
                        objI1 = new Function2() { // from class: androidx.compose.material.z2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material.z2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarE3 = k.e(k.h(a0Var2, uVarK3, q3Var4, (Function2) objI1), m3Var.k(), q3Var4, z10, false, null, false, 56, null);
                    if (i22 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zK0 = z14 | c0VarR.k0(s0Var);
                    objI2 = c0VarR.i0();
                    if (zK0) {
                        objI2 = new Function1() { // from class: androidx.compose.material.a3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material.a3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarF3 = androidx.compose.ui.semantics.t.f(a0VarE3, false, (Function1) objI2, 1, null);
                    androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(1065607095, true, new c(nVar), c0VarR, 54);
                    int i210 = i29 >> 6;
                    int i211 = ((i29 >> 3) & com.planner5d.library.engine.input.f.b.B) | i19 | (i210 & 896) | (i210 & 7168) | (458752 & (i29 << 6));
                    c0Var2 = c0VarR;
                    ah.e(a0VarF3, q3Var, j10, j11, null, f10, cVarE3, c0Var2, i211, 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.u(m3Var, z10, q3Var, f10, j10, j11, f11, a0Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.L(j10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.L(j11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f11)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            i18 = i11 & 128;
            if (i18 != 0) {
                i12 |= 12582912;
                i19 = 1572864;
                a0Var2 = a0Var;
            } else {
                i19 = 1572864;
                a0Var2 = a0Var;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(a0Var2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(nVar)) {
                    i21 = 67108864;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i21;
            }
            if ((38347923 & i12) != 38347922) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i18 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-426833549, i12, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f11);
                u<n3> uVarK4 = m3Var.k();
                int i212 = i12;
                androidx.compose.foundation.gestures.q3 q3Var5 = androidx.compose.foundation.gestures.q3.Vertical;
                boolean zI4 = c0VarR.I(fS7);
                i22 = i212 & 14;
                if (i22 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zI4 | z12;
                objI1 = c0VarR.i0();
                if (z13) {
                    objI1 = new Function2() { // from class: androidx.compose.material.z2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function2() { // from class: androidx.compose.material.z2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarE4 = k.e(k.h(a0Var2, uVarK4, q3Var5, (Function2) objI1), m3Var.k(), q3Var5, z10, false, null, false, 56, null);
                if (i22 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK0 = z14 | c0VarR.k0(s0Var);
                objI2 = c0VarR.i0();
                if (zK0) {
                    objI2 = new Function1() { // from class: androidx.compose.material.a3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material.a3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarF4 = androidx.compose.ui.semantics.t.f(a0VarE4, false, (Function1) objI2, 1, null);
                androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(1065607095, true, new c(nVar), c0VarR, 54);
                int i213 = i212 >> 6;
                int i214 = ((i212 >> 3) & com.planner5d.library.engine.input.f.b.B) | i19 | (i213 & 896) | (i213 & 7168) | (458752 & (i212 << 6));
                c0Var2 = c0VarR;
                ah.e(a0VarF4, q3Var, j10, j11, null, f10, cVarE4, c0Var2, i214, 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d3.u(m3Var, z10, q3Var, f10, j10, j11, f11, a0Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        if ((i11 & 4) != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.D(q3Var)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.I(f10)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.L(j10)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.L(j11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                    i19 = 1572864;
                    a0Var2 = a0Var;
                } else {
                    i19 = 1572864;
                    a0Var2 = a0Var;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(a0Var2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i21 = 67108864;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i21;
                }
                if ((38347923 & i12) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-426833549, i12, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f11);
                    u<n3> uVarK5 = m3Var.k();
                    int i215 = i12;
                    androidx.compose.foundation.gestures.q3 q3Var6 = androidx.compose.foundation.gestures.q3.Vertical;
                    boolean zI5 = c0VarR.I(fS7);
                    i22 = i215 & 14;
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zI5 | z12;
                    objI1 = c0VarR.i0();
                    if (z13) {
                        objI1 = new Function2() { // from class: androidx.compose.material.z2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material.z2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarE5 = k.e(k.h(a0Var2, uVarK5, q3Var6, (Function2) objI1), m3Var.k(), q3Var6, z10, false, null, false, 56, null);
                    if (i22 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zK0 = z14 | c0VarR.k0(s0Var);
                    objI2 = c0VarR.i0();
                    if (zK0) {
                        objI2 = new Function1() { // from class: androidx.compose.material.a3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material.a3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarF5 = androidx.compose.ui.semantics.t.f(a0VarE5, false, (Function1) objI2, 1, null);
                    androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(1065607095, true, new c(nVar), c0VarR, 54);
                    int i216 = i215 >> 6;
                    int i217 = ((i215 >> 3) & com.planner5d.library.engine.input.f.b.B) | i19 | (i216 & 896) | (i216 & 7168) | (458752 & (i215 << 6));
                    c0Var2 = c0VarR;
                    ah.e(a0VarF5, q3Var, j10, j11, null, f10, cVarE5, c0Var2, i217, 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.u(m3Var, z10, q3Var, f10, j10, j11, f11, a0Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.L(j10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.L(j11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f11)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            i18 = i11 & 128;
            if (i18 != 0) {
                i12 |= 12582912;
                i19 = 1572864;
                a0Var2 = a0Var;
            } else {
                i19 = 1572864;
                a0Var2 = a0Var;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(a0Var2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(nVar)) {
                    i21 = 67108864;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i21;
            }
            if ((38347923 & i12) != 38347922) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i18 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-426833549, i12, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f11);
                u<n3> uVarK6 = m3Var.k();
                int i218 = i12;
                androidx.compose.foundation.gestures.q3 q3Var7 = androidx.compose.foundation.gestures.q3.Vertical;
                boolean zI6 = c0VarR.I(fS7);
                i22 = i218 & 14;
                if (i22 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zI6 | z12;
                objI1 = c0VarR.i0();
                if (z13) {
                    objI1 = new Function2() { // from class: androidx.compose.material.z2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function2() { // from class: androidx.compose.material.z2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarE6 = k.e(k.h(a0Var2, uVarK6, q3Var7, (Function2) objI1), m3Var.k(), q3Var7, z10, false, null, false, 56, null);
                if (i22 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK0 = z14 | c0VarR.k0(s0Var);
                objI2 = c0VarR.i0();
                if (zK0) {
                    objI2 = new Function1() { // from class: androidx.compose.material.a3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material.a3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarF6 = androidx.compose.ui.semantics.t.f(a0VarE6, false, (Function1) objI2, 1, null);
                androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(1065607095, true, new c(nVar), c0VarR, 54);
                int i219 = i218 >> 6;
                int i2110 = ((i218 >> 3) & com.planner5d.library.engine.input.f.b.B) | i19 | (i219 & 896) | (i219 & 7168) | (458752 & (i218 << 6));
                c0Var2 = c0VarR;
                ah.e(a0VarF6, q3Var, j10, j11, null, f10, cVarE6, c0Var2, i2110, 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d3.u(m3Var, z10, q3Var, f10, j10, j11, f11, a0Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        if ((i11 & 8) != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.I(f10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.L(j10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.L(j11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f11)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            i18 = i11 & 128;
            if (i18 != 0) {
                i12 |= 12582912;
                i19 = 1572864;
                a0Var2 = a0Var;
            } else {
                i19 = 1572864;
                a0Var2 = a0Var;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(a0Var2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(nVar)) {
                    i21 = 67108864;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i21;
            }
            if ((38347923 & i12) != 38347922) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i18 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-426833549, i12, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f11);
                u<n3> uVarK7 = m3Var.k();
                int i2111 = i12;
                androidx.compose.foundation.gestures.q3 q3Var8 = androidx.compose.foundation.gestures.q3.Vertical;
                boolean zI7 = c0VarR.I(fS7);
                i22 = i2111 & 14;
                if (i22 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zI7 | z12;
                objI1 = c0VarR.i0();
                if (z13) {
                    objI1 = new Function2() { // from class: androidx.compose.material.z2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function2() { // from class: androidx.compose.material.z2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarE7 = k.e(k.h(a0Var2, uVarK7, q3Var8, (Function2) objI1), m3Var.k(), q3Var8, z10, false, null, false, 56, null);
                if (i22 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK0 = z14 | c0VarR.k0(s0Var);
                objI2 = c0VarR.i0();
                if (zK0) {
                    objI2 = new Function1() { // from class: androidx.compose.material.a3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material.a3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarF7 = androidx.compose.ui.semantics.t.f(a0VarE7, false, (Function1) objI2, 1, null);
                androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(1065607095, true, new c(nVar), c0VarR, 54);
                int i2112 = i2111 >> 6;
                int i2113 = ((i2111 >> 3) & com.planner5d.library.engine.input.f.b.B) | i19 | (i2112 & 896) | (i2112 & 7168) | (458752 & (i2111 << 6));
                c0Var2 = c0VarR;
                ah.e(a0VarF7, q3Var, j10, j11, null, f10, cVarE7, c0Var2, i2113, 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d3.u(m3Var, z10, q3Var, f10, j10, j11, f11, a0Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.L(j10)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.L(j11)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.I(f11)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        i18 = i11 & 128;
        if (i18 != 0) {
            i12 |= 12582912;
            i19 = 1572864;
            a0Var2 = a0Var;
        } else {
            i19 = 1572864;
            a0Var2 = a0Var;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.D(a0Var2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.k0(nVar)) {
                i21 = 67108864;
            } else {
                i21 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i12 |= i21;
        }
        if ((38347923 & i12) != 38347922) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            if (i18 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-426833549, i12, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            s0Var = (kotlinx.coroutines.s0) objI0;
            fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f11);
            u<n3> uVarK8 = m3Var.k();
            int i2114 = i12;
            androidx.compose.foundation.gestures.q3 q3Var9 = androidx.compose.foundation.gestures.q3.Vertical;
            boolean zI8 = c0VarR.I(fS7);
            i22 = i2114 & 14;
            if (i22 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zI8 | z12;
            objI1 = c0VarR.i0();
            if (z13) {
                objI1 = new Function2() { // from class: androidx.compose.material.z2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function2() { // from class: androidx.compose.material.z2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d3.p(m3Var, fS7, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarE8 = k.e(k.h(a0Var2, uVarK8, q3Var9, (Function2) objI1), m3Var.k(), q3Var9, z10, false, null, false, 56, null);
            if (i22 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            zK0 = z14 | c0VarR.k0(s0Var);
            objI2 = c0VarR.i0();
            if (zK0) {
                objI2 = new Function1() { // from class: androidx.compose.material.a3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: androidx.compose.material.a3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d3.r(m3Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarF8 = androidx.compose.ui.semantics.t.f(a0VarE8, false, (Function1) objI2, 1, null);
            androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(1065607095, true, new c(nVar), c0VarR, 54);
            int i2115 = i2114 >> 6;
            int i2116 = ((i2114 >> 3) & com.planner5d.library.engine.input.f.b.B) | i19 | (i2115 & 896) | (i2115 & 7168) | (458752 & (i2114 << 6));
            c0Var2 = c0VarR;
            ah.e(a0VarF8, q3Var, j10, j11, null, f10, cVarE8, c0Var2, i2116, 16);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.b3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d3.u(m3Var, z10, q3Var, f10, j10, j11, f11, a0Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0136  */
    /* JADX WARN: Code duplicated, block: B:102:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x014e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0154  */
    /* JADX WARN: Code duplicated, block: B:113:0x015a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0168  */
    /* JADX WARN: Code duplicated, block: B:121:0x016f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177  */
    /* JADX WARN: Code duplicated, block: B:126:0x0180  */
    /* JADX WARN: Code duplicated, block: B:128:0x0185  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0193  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01be  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:171:0x0204  */
    /* JADX WARN: Code duplicated, block: B:175:0x0211  */
    /* JADX WARN: Code duplicated, block: B:178:0x021a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:209:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x0280  */
    /* JADX WARN: Code duplicated, block: B:213:0x0287  */
    /* JADX WARN: Code duplicated, block: B:215:0x0292  */
    /* JADX WARN: Code duplicated, block: B:216:0x0294  */
    /* JADX WARN: Code duplicated, block: B:218:0x029a  */
    /* JADX WARN: Code duplicated, block: B:220:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:223:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:225:0x02af  */
    /* JADX WARN: Code duplicated, block: B:228:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:229:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:232:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:236:0x02df  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:240:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:242:0x0305  */
    /* JADX WARN: Code duplicated, block: B:245:0x030e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0317  */
    /* JADX WARN: Code duplicated, block: B:249:0x031f  */
    /* JADX WARN: Code duplicated, block: B:250:0x032d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0332  */
    /* JADX WARN: Code duplicated, block: B:255:0x034e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0362  */
    /* JADX WARN: Code duplicated, block: B:259:0x036f  */
    /* JADX WARN: Code duplicated, block: B:262:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:264:0x0409  */
    /* JADX WARN: Code duplicated, block: B:267:0x042c  */
    /* JADX WARN: Code duplicated, block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:84:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:91:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x012e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable]]")
    public static final void l(@NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable g3 g3Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable pj.n<? super ig, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, int i10, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, long j10, long j11, float f11, long j12, long j13, @NotNull final pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12, final int i13) {
        int i14;
        androidx.compose.ui.a0 a0Var2;
        g3 g3VarC;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        pj.n<? super ig, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVarC;
        int i20;
        int i21;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z11;
        int i27;
        int i28;
        int i29;
        int i30;
        long jC;
        int i31;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j14;
        final long j15;
        final pj.n<? super ig, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        final int i32;
        final androidx.compose.ui.a0 a0Var3;
        final g3 g3Var2;
        final boolean z13;
        final float f12;
        final long j16;
        final long j17;
        final float f13;
        androidx.compose.runtime.s5 s5VarT;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        int iB;
        androidx.compose.ui.graphics.q3 q3VarC;
        float fB;
        long jN;
        long jD;
        int i33;
        float fC;
        float f14;
        int i34;
        long j18;
        long j19;
        long j20;
        int i35;
        int i36;
        int i37;
        int i38;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(194495313);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (c0VarR.k0(nVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i39 = i13 & 2;
        if (i39 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i14 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i13 & 4) == 0) {
                    g3VarC = g3Var;
                    int i40 = c0VarR.D(g3VarC) ? 256 : 128;
                    i14 |= i40;
                } else {
                    g3VarC = g3Var;
                }
                i14 |= i40;
            } else {
                g3VarC = g3Var;
            }
            i15 = i13 & 8;
            i16 = 1024;
            if (i15 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i14 |= i17;
                }
                i18 = i13 & 16;
                i19 = 8192;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        nVarC = nVar2;
                        if (c0VarR.k0(nVarC)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                        function4 = function3;
                    } else {
                        function4 = function3;
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(function4)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i10;
                    } else {
                        i24 = i10;
                        if ((i11 & 1572864) == 0) {
                            if (c0VarR.K(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    i26 = i13 & 128;
                    if (i26 != 0) {
                        i14 |= 12582912;
                        z11 = z10;
                    } else {
                        z11 = z10;
                        if ((i11 & 12582912) == 0) {
                            if (c0VarR.G(z11)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i14 |= i27;
                        }
                    }
                    if ((i11 & 100663296) != 0) {
                        i14 |= ((i13 & 256) == 0 || !c0VarR.D(q3Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                    }
                    if ((i11 & 805306368) != 0) {
                        i14 |= ((i13 & 512) == 0 || !c0VarR.I(f10)) ? 268435456 : 536870912;
                    }
                    if ((i12 & 6) == 0) {
                        if ((i13 & 1024) == 0 || !c0VarR.L(j10)) {
                            i38 = 2;
                        } else {
                            i38 = 4;
                        }
                        i28 = i12 | i38;
                    } else {
                        i28 = i12;
                    }
                    if ((i12 & 48) == 0) {
                        int i41 = i28;
                        if ((i13 & 2048) == 0 || !c0VarR.L(j11)) {
                            i37 = 16;
                        } else {
                            i37 = 32;
                        }
                        i28 = i41 | i37;
                    }
                    i29 = i28;
                    if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                        i30 = i29 | (((i13 & 4096) == 0 || !c0VarR.I(f11)) ? 128 : 256);
                    } else {
                        i30 = i29;
                    }
                    if ((i12 & 3072) == 0) {
                        jC = j12;
                        if ((i13 & 8192) == 0 && c0VarR.L(jC)) {
                            i16 = 2048;
                        }
                        i30 |= i16;
                    } else {
                        jC = j12;
                    }
                    if ((i12 & 24576) != 0) {
                        if ((i13 & 16384) == 0 && c0VarR.L(j13)) {
                            i19 = 16384;
                        }
                        i30 |= i19;
                    }
                    if ((i13 & 32768) != 0) {
                        i30 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar3)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 |= i31;
                    }
                    if ((306783379 & i14) == 306783378 || (i30 & 74899) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i14 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0 || c0VarR.y()) {
                            if (i39 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i13 & 4) != 0) {
                                i14 &= -897;
                                g3VarC = C(null, null, c0VarR, 0, 3);
                            }
                            if (i15 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i18 != 0) {
                                nVarC = q4.f24367a.c();
                            }
                            if (i21 != 0) {
                                function4 = null;
                            }
                            if (i23 != 0) {
                                iB = q8.f24378b.b();
                            } else {
                                iB = i24;
                            }
                            if (i26 != 0) {
                                z11 = true;
                            }
                            if ((i13 & 256) != 0) {
                                q3VarC = x9.f25488a.b(c0VarR, 6).c();
                                i14 &= -234881025;
                            } else {
                                q3VarC = q3Var;
                            }
                            if ((i13 & 512) != 0) {
                                fB = s2.f24875a.b();
                                i14 &= -1879048193;
                            } else {
                                fB = f10;
                            }
                            if ((i13 & 1024) != 0) {
                                i30 &= -15;
                                jN = x9.f25488a.a(c0VarR, 6).n();
                            } else {
                                jN = j10;
                            }
                            if ((i13 & 2048) != 0) {
                                jD = n4.d(jN, c0VarR, i30 & 14);
                                i30 &= -113;
                            } else {
                                jD = j11;
                            }
                            i33 = i30;
                            function2 = function7;
                            if ((i13 & 4096) != 0) {
                                fC = s2.f24875a.c();
                                i33 &= -897;
                            } else {
                                fC = f11;
                            }
                            f14 = fC;
                            if ((i13 & 8192) != 0) {
                                jC = x9.f25488a.a(c0VarR, 6).c();
                                i34 = i33 & (-7169);
                            } else {
                                i34 = i33;
                            }
                            if ((i13 & 16384) != 0) {
                                long jD2 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                                i34 &= -57345;
                                j18 = jD2;
                            } else {
                                j18 = j13;
                            }
                            j19 = jC;
                            j20 = jN;
                            z11 = z11;
                            i35 = i14;
                        } else {
                            c0VarR.u();
                            if ((i13 & 4) != 0) {
                                i14 &= -897;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                            }
                            if ((i13 & 512) != 0) {
                                i14 &= -1879048193;
                            }
                            if ((i13 & 1024) != 0) {
                                i30 &= -15;
                            }
                            if ((i13 & 2048) != 0) {
                                i30 &= -113;
                            }
                            i34 = i30;
                            if ((i13 & 4096) != 0) {
                                i34 &= -897;
                            }
                            if ((i13 & 8192) != 0) {
                                i34 &= -7169;
                            }
                            if ((i13 & 16384) != 0) {
                                i34 &= -57345;
                            }
                            fB = f10;
                            jD = j11;
                            f14 = f11;
                            j18 = j13;
                            j19 = jC;
                            i35 = i14;
                            iB = i24;
                            q3VarC = q3Var;
                            j20 = j10;
                        }
                        i36 = i34;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(194495313, i35, i36, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                        }
                        androidx.compose.ui.a0 a0VarF = androidx.compose.foundation.layout.i6.f(a0Var2, 0.0f, 1, null);
                        float f15 = f14;
                        float f16 = fB;
                        androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-747577963, true, new d(g3VarC, function8, function4, f15, iB, nVar3, z11, q3VarC, fB, j20, jD, nVar, nVarC), c0VarR, 54);
                        int i42 = i36 >> 3;
                        long j21 = j19;
                        long j22 = j18;
                        ah.e(a0VarF, null, j21, j22, null, 0.0f, cVarE, c0VarR, (i42 & 7168) | (i42 & 896) | 1572864, 50);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function5 = function8;
                        z13 = z11;
                        f13 = f15;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function4;
                        f12 = f16;
                        g3Var2 = g3VarC;
                        j17 = jD;
                        j14 = j22;
                        j15 = j21;
                        a0Var3 = a0Var2;
                        long j23 = j20;
                        nVar4 = nVarC;
                        i32 = iB;
                        function6 = function9;
                        q3Var2 = q3VarC;
                        j16 = j23;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function5 = function2;
                        q3Var2 = q3Var;
                        j14 = j13;
                        j15 = jC;
                        nVar4 = nVarC;
                        function6 = function4;
                        i32 = i24;
                        a0Var3 = a0Var2;
                        g3Var2 = g3VarC;
                        z13 = z11;
                        f12 = f10;
                        j16 = j10;
                        j17 = j11;
                        f13 = f11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.c3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d3.o(nVar, a0Var3, g3Var2, function5, nVar4, function6, i32, z13, q3Var2, f12, j16, j17, f13, j15, j14, nVar3, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                nVarC = nVar2;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function4)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i10;
                } else {
                    i24 = i10;
                    if ((i11 & 1572864) == 0) {
                        if (c0VarR.K(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                i26 = i13 & 128;
                if (i26 != 0) {
                    i14 |= 12582912;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i11 & 12582912) == 0) {
                        if (c0VarR.G(z11)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i14 |= i27;
                    }
                }
                if ((i11 & 100663296) != 0) {
                    i14 |= ((i13 & 256) == 0 || !c0VarR.D(q3Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                if ((i11 & 805306368) != 0) {
                    i14 |= ((i13 & 512) == 0 || !c0VarR.I(f10)) ? 268435456 : 536870912;
                }
                if ((i12 & 6) == 0) {
                    if ((i13 & 1024) == 0) {
                        i38 = 2;
                    } else {
                        i38 = 2;
                    }
                    i28 = i12 | i38;
                } else {
                    i28 = i12;
                }
                if ((i12 & 48) == 0) {
                    int i43 = i28;
                    if ((i13 & 2048) == 0) {
                        i37 = 16;
                    } else {
                        i37 = 16;
                    }
                    i28 = i43 | i37;
                }
                i29 = i28;
                if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                    i30 = i29 | (((i13 & 4096) == 0 || !c0VarR.I(f11)) ? 128 : 256);
                } else {
                    i30 = i29;
                }
                if ((i12 & 3072) == 0) {
                    jC = j12;
                    if ((i13 & 8192) == 0) {
                        i16 = 2048;
                    }
                    i30 |= i16;
                } else {
                    jC = j12;
                }
                if ((i12 & 24576) != 0) {
                    if ((i13 & 16384) == 0) {
                        i19 = 16384;
                    }
                    i30 |= i19;
                }
                if ((i13 & 32768) != 0) {
                    i30 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar3)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 |= i31;
                }
                if ((306783379 & i14) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i39 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            g3VarC = C(null, null, c0VarR, 0, 3);
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i18 != 0) {
                            nVarC = q4.f24367a.c();
                        }
                        if (i21 != 0) {
                            function4 = null;
                        }
                        if (i23 != 0) {
                            iB = q8.f24378b.b();
                        } else {
                            iB = i24;
                        }
                        if (i26 != 0) {
                            z11 = true;
                        }
                        if ((i13 & 256) != 0) {
                            q3VarC = x9.f25488a.b(c0VarR, 6).c();
                            i14 &= -234881025;
                        } else {
                            q3VarC = q3Var;
                        }
                        if ((i13 & 512) != 0) {
                            fB = s2.f24875a.b();
                            i14 &= -1879048193;
                        } else {
                            fB = f10;
                        }
                        if ((i13 & 1024) != 0) {
                            i30 &= -15;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        } else {
                            jN = j10;
                        }
                        if ((i13 & 2048) != 0) {
                            jD = n4.d(jN, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jD = j11;
                        }
                        i33 = i30;
                        function2 = function7;
                        if ((i13 & 4096) != 0) {
                            fC = s2.f24875a.c();
                            i33 &= -897;
                        } else {
                            fC = f11;
                        }
                        f14 = fC;
                        if ((i13 & 8192) != 0) {
                            jC = x9.f25488a.a(c0VarR, 6).c();
                            i34 = i33 & (-7169);
                        } else {
                            i34 = i33;
                        }
                        if ((i13 & 16384) != 0) {
                            long jD3 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                            i34 &= -57345;
                            j18 = jD3;
                        } else {
                            j18 = j13;
                        }
                        j19 = jC;
                        j20 = jN;
                        z11 = z11;
                        i35 = i14;
                    } else {
                        if (i39 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            g3VarC = C(null, null, c0VarR, 0, 3);
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i18 != 0) {
                            nVarC = q4.f24367a.c();
                        }
                        if (i21 != 0) {
                            function4 = null;
                        }
                        if (i23 != 0) {
                            iB = q8.f24378b.b();
                        } else {
                            iB = i24;
                        }
                        if (i26 != 0) {
                            z11 = true;
                        }
                        if ((i13 & 256) != 0) {
                            q3VarC = x9.f25488a.b(c0VarR, 6).c();
                            i14 &= -234881025;
                        } else {
                            q3VarC = q3Var;
                        }
                        if ((i13 & 512) != 0) {
                            fB = s2.f24875a.b();
                            i14 &= -1879048193;
                        } else {
                            fB = f10;
                        }
                        if ((i13 & 1024) != 0) {
                            i30 &= -15;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        } else {
                            jN = j10;
                        }
                        if ((i13 & 2048) != 0) {
                            jD = n4.d(jN, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jD = j11;
                        }
                        i33 = i30;
                        function2 = function7;
                        if ((i13 & 4096) != 0) {
                            fC = s2.f24875a.c();
                            i33 &= -897;
                        } else {
                            fC = f11;
                        }
                        f14 = fC;
                        if ((i13 & 8192) != 0) {
                            jC = x9.f25488a.a(c0VarR, 6).c();
                            i34 = i33 & (-7169);
                        } else {
                            i34 = i33;
                        }
                        if ((i13 & 16384) != 0) {
                            long jD4 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                            i34 &= -57345;
                            j18 = jD4;
                        } else {
                            j18 = j13;
                        }
                        j19 = jC;
                        j20 = jN;
                        z11 = z11;
                        i35 = i14;
                    }
                    i36 = i34;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(194495313, i35, i36, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                    }
                    androidx.compose.ui.a0 a0VarF2 = androidx.compose.foundation.layout.i6.f(a0Var2, 0.0f, 1, null);
                    float f17 = f14;
                    float f18 = fB;
                    androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(-747577963, true, new d(g3VarC, function10, function4, f17, iB, nVar3, z11, q3VarC, fB, j20, jD, nVar, nVarC), c0VarR, 54);
                    int i44 = i36 >> 3;
                    long j24 = j19;
                    long j25 = j18;
                    ah.e(a0VarF2, null, j24, j25, null, 0.0f, cVarE2, c0VarR, (i44 & 7168) | (i44 & 896) | 1572864, 50);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function10;
                    z13 = z11;
                    f13 = f17;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function4;
                    f12 = f18;
                    g3Var2 = g3VarC;
                    j17 = jD;
                    j14 = j25;
                    j15 = j24;
                    a0Var3 = a0Var2;
                    long j26 = j20;
                    nVar4 = nVarC;
                    i32 = iB;
                    function6 = function11;
                    q3Var2 = q3VarC;
                    j16 = j26;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function5 = function2;
                    q3Var2 = q3Var;
                    j14 = j13;
                    j15 = jC;
                    nVar4 = nVarC;
                    function6 = function4;
                    i32 = i24;
                    a0Var3 = a0Var2;
                    g3Var2 = g3VarC;
                    z13 = z11;
                    f12 = f10;
                    j16 = j10;
                    j17 = j11;
                    f13 = f11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.o(nVar, a0Var3, g3Var2, function5, nVar4, function6, i32, z13, q3Var2, f12, j16, j17, f13, j15, j14, nVar3, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            i18 = i13 & 16;
            i19 = 8192;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    nVarC = nVar2;
                    if (c0VarR.k0(nVarC)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function4)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i10;
                } else {
                    i24 = i10;
                    if ((i11 & 1572864) == 0) {
                        if (c0VarR.K(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                i26 = i13 & 128;
                if (i26 != 0) {
                    i14 |= 12582912;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i11 & 12582912) == 0) {
                        if (c0VarR.G(z11)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i14 |= i27;
                    }
                }
                if ((i11 & 100663296) != 0) {
                    i14 |= ((i13 & 256) == 0 || !c0VarR.D(q3Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                if ((i11 & 805306368) != 0) {
                    i14 |= ((i13 & 512) == 0 || !c0VarR.I(f10)) ? 268435456 : 536870912;
                }
                if ((i12 & 6) == 0) {
                    if ((i13 & 1024) == 0) {
                        i38 = 2;
                    } else {
                        i38 = 2;
                    }
                    i28 = i12 | i38;
                } else {
                    i28 = i12;
                }
                if ((i12 & 48) == 0) {
                    int i45 = i28;
                    if ((i13 & 2048) == 0) {
                        i37 = 16;
                    } else {
                        i37 = 16;
                    }
                    i28 = i45 | i37;
                }
                i29 = i28;
                if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                    i30 = i29 | (((i13 & 4096) == 0 || !c0VarR.I(f11)) ? 128 : 256);
                } else {
                    i30 = i29;
                }
                if ((i12 & 3072) == 0) {
                    jC = j12;
                    if ((i13 & 8192) == 0) {
                        i16 = 2048;
                    }
                    i30 |= i16;
                } else {
                    jC = j12;
                }
                if ((i12 & 24576) != 0) {
                    if ((i13 & 16384) == 0) {
                        i19 = 16384;
                    }
                    i30 |= i19;
                }
                if ((i13 & 32768) != 0) {
                    i30 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar3)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 |= i31;
                }
                if ((306783379 & i14) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i39 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            g3VarC = C(null, null, c0VarR, 0, 3);
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i18 != 0) {
                            nVarC = q4.f24367a.c();
                        }
                        if (i21 != 0) {
                            function4 = null;
                        }
                        if (i23 != 0) {
                            iB = q8.f24378b.b();
                        } else {
                            iB = i24;
                        }
                        if (i26 != 0) {
                            z11 = true;
                        }
                        if ((i13 & 256) != 0) {
                            q3VarC = x9.f25488a.b(c0VarR, 6).c();
                            i14 &= -234881025;
                        } else {
                            q3VarC = q3Var;
                        }
                        if ((i13 & 512) != 0) {
                            fB = s2.f24875a.b();
                            i14 &= -1879048193;
                        } else {
                            fB = f10;
                        }
                        if ((i13 & 1024) != 0) {
                            i30 &= -15;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        } else {
                            jN = j10;
                        }
                        if ((i13 & 2048) != 0) {
                            jD = n4.d(jN, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jD = j11;
                        }
                        i33 = i30;
                        function2 = function7;
                        if ((i13 & 4096) != 0) {
                            fC = s2.f24875a.c();
                            i33 &= -897;
                        } else {
                            fC = f11;
                        }
                        f14 = fC;
                        if ((i13 & 8192) != 0) {
                            jC = x9.f25488a.a(c0VarR, 6).c();
                            i34 = i33 & (-7169);
                        } else {
                            i34 = i33;
                        }
                        if ((i13 & 16384) != 0) {
                            long jD5 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                            i34 &= -57345;
                            j18 = jD5;
                        } else {
                            j18 = j13;
                        }
                        j19 = jC;
                        j20 = jN;
                        z11 = z11;
                        i35 = i14;
                    } else {
                        if (i39 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            g3VarC = C(null, null, c0VarR, 0, 3);
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i18 != 0) {
                            nVarC = q4.f24367a.c();
                        }
                        if (i21 != 0) {
                            function4 = null;
                        }
                        if (i23 != 0) {
                            iB = q8.f24378b.b();
                        } else {
                            iB = i24;
                        }
                        if (i26 != 0) {
                            z11 = true;
                        }
                        if ((i13 & 256) != 0) {
                            q3VarC = x9.f25488a.b(c0VarR, 6).c();
                            i14 &= -234881025;
                        } else {
                            q3VarC = q3Var;
                        }
                        if ((i13 & 512) != 0) {
                            fB = s2.f24875a.b();
                            i14 &= -1879048193;
                        } else {
                            fB = f10;
                        }
                        if ((i13 & 1024) != 0) {
                            i30 &= -15;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        } else {
                            jN = j10;
                        }
                        if ((i13 & 2048) != 0) {
                            jD = n4.d(jN, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jD = j11;
                        }
                        i33 = i30;
                        function2 = function7;
                        if ((i13 & 4096) != 0) {
                            fC = s2.f24875a.c();
                            i33 &= -897;
                        } else {
                            fC = f11;
                        }
                        f14 = fC;
                        if ((i13 & 8192) != 0) {
                            jC = x9.f25488a.a(c0VarR, 6).c();
                            i34 = i33 & (-7169);
                        } else {
                            i34 = i33;
                        }
                        if ((i13 & 16384) != 0) {
                            long jD6 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                            i34 &= -57345;
                            j18 = jD6;
                        } else {
                            j18 = j13;
                        }
                        j19 = jC;
                        j20 = jN;
                        z11 = z11;
                        i35 = i14;
                    }
                    i36 = i34;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(194495313, i35, i36, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                    }
                    androidx.compose.ui.a0 a0VarF3 = androidx.compose.foundation.layout.i6.f(a0Var2, 0.0f, 1, null);
                    float f19 = f14;
                    float f110 = fB;
                    androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-747577963, true, new d(g3VarC, function12, function4, f19, iB, nVar3, z11, q3VarC, fB, j20, jD, nVar, nVarC), c0VarR, 54);
                    int i46 = i36 >> 3;
                    long j27 = j19;
                    long j28 = j18;
                    ah.e(a0VarF3, null, j27, j28, null, 0.0f, cVarE3, c0VarR, (i46 & 7168) | (i46 & 896) | 1572864, 50);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function12;
                    z13 = z11;
                    f13 = f19;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function4;
                    f12 = f110;
                    g3Var2 = g3VarC;
                    j17 = jD;
                    j14 = j28;
                    j15 = j27;
                    a0Var3 = a0Var2;
                    long j29 = j20;
                    nVar4 = nVarC;
                    i32 = iB;
                    function6 = function13;
                    q3Var2 = q3VarC;
                    j16 = j29;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function5 = function2;
                    q3Var2 = q3Var;
                    j14 = j13;
                    j15 = jC;
                    nVar4 = nVarC;
                    function6 = function4;
                    i32 = i24;
                    a0Var3 = a0Var2;
                    g3Var2 = g3VarC;
                    z13 = z11;
                    f12 = f10;
                    j16 = j10;
                    j17 = j11;
                    f13 = f11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.o(nVar, a0Var3, g3Var2, function5, nVar4, function6, i32, z13, q3Var2, f12, j16, j17, f13, j15, j14, nVar3, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            nVarC = nVar2;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function4)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                i24 = i10;
            } else {
                i24 = i10;
                if ((i11 & 1572864) == 0) {
                    if (c0VarR.K(i24)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
            }
            i26 = i13 & 128;
            if (i26 != 0) {
                i14 |= 12582912;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i11 & 12582912) == 0) {
                    if (c0VarR.G(z11)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i14 |= i27;
                }
            }
            if ((i11 & 100663296) != 0) {
                i14 |= ((i13 & 256) == 0 || !c0VarR.D(q3Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            if ((i11 & 805306368) != 0) {
                i14 |= ((i13 & 512) == 0 || !c0VarR.I(f10)) ? 268435456 : 536870912;
            }
            if ((i12 & 6) == 0) {
                if ((i13 & 1024) == 0) {
                    i38 = 2;
                } else {
                    i38 = 2;
                }
                i28 = i12 | i38;
            } else {
                i28 = i12;
            }
            if ((i12 & 48) == 0) {
                int i47 = i28;
                if ((i13 & 2048) == 0) {
                    i37 = 16;
                } else {
                    i37 = 16;
                }
                i28 = i47 | i37;
            }
            i29 = i28;
            if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                i30 = i29 | (((i13 & 4096) == 0 || !c0VarR.I(f11)) ? 128 : 256);
            } else {
                i30 = i29;
            }
            if ((i12 & 3072) == 0) {
                jC = j12;
                if ((i13 & 8192) == 0) {
                    i16 = 2048;
                }
                i30 |= i16;
            } else {
                jC = j12;
            }
            if ((i12 & 24576) != 0) {
                if ((i13 & 16384) == 0) {
                    i19 = 16384;
                }
                i30 |= i19;
            }
            if ((i13 & 32768) != 0) {
                i30 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar3)) {
                    i31 = 131072;
                } else {
                    i31 = 65536;
                }
                i30 |= i31;
            }
            if ((306783379 & i14) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i14 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i39 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        g3VarC = C(null, null, c0VarR, 0, 3);
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i18 != 0) {
                        nVarC = q4.f24367a.c();
                    }
                    if (i21 != 0) {
                        function4 = null;
                    }
                    if (i23 != 0) {
                        iB = q8.f24378b.b();
                    } else {
                        iB = i24;
                    }
                    if (i26 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 256) != 0) {
                        q3VarC = x9.f25488a.b(c0VarR, 6).c();
                        i14 &= -234881025;
                    } else {
                        q3VarC = q3Var;
                    }
                    if ((i13 & 512) != 0) {
                        fB = s2.f24875a.b();
                        i14 &= -1879048193;
                    } else {
                        fB = f10;
                    }
                    if ((i13 & 1024) != 0) {
                        i30 &= -15;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    } else {
                        jN = j10;
                    }
                    if ((i13 & 2048) != 0) {
                        jD = n4.d(jN, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jD = j11;
                    }
                    i33 = i30;
                    function2 = function7;
                    if ((i13 & 4096) != 0) {
                        fC = s2.f24875a.c();
                        i33 &= -897;
                    } else {
                        fC = f11;
                    }
                    f14 = fC;
                    if ((i13 & 8192) != 0) {
                        jC = x9.f25488a.a(c0VarR, 6).c();
                        i34 = i33 & (-7169);
                    } else {
                        i34 = i33;
                    }
                    if ((i13 & 16384) != 0) {
                        long jD7 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                        i34 &= -57345;
                        j18 = jD7;
                    } else {
                        j18 = j13;
                    }
                    j19 = jC;
                    j20 = jN;
                    z11 = z11;
                    i35 = i14;
                } else {
                    if (i39 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        g3VarC = C(null, null, c0VarR, 0, 3);
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i18 != 0) {
                        nVarC = q4.f24367a.c();
                    }
                    if (i21 != 0) {
                        function4 = null;
                    }
                    if (i23 != 0) {
                        iB = q8.f24378b.b();
                    } else {
                        iB = i24;
                    }
                    if (i26 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 256) != 0) {
                        q3VarC = x9.f25488a.b(c0VarR, 6).c();
                        i14 &= -234881025;
                    } else {
                        q3VarC = q3Var;
                    }
                    if ((i13 & 512) != 0) {
                        fB = s2.f24875a.b();
                        i14 &= -1879048193;
                    } else {
                        fB = f10;
                    }
                    if ((i13 & 1024) != 0) {
                        i30 &= -15;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    } else {
                        jN = j10;
                    }
                    if ((i13 & 2048) != 0) {
                        jD = n4.d(jN, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jD = j11;
                    }
                    i33 = i30;
                    function2 = function7;
                    if ((i13 & 4096) != 0) {
                        fC = s2.f24875a.c();
                        i33 &= -897;
                    } else {
                        fC = f11;
                    }
                    f14 = fC;
                    if ((i13 & 8192) != 0) {
                        jC = x9.f25488a.a(c0VarR, 6).c();
                        i34 = i33 & (-7169);
                    } else {
                        i34 = i33;
                    }
                    if ((i13 & 16384) != 0) {
                        long jD8 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                        i34 &= -57345;
                        j18 = jD8;
                    } else {
                        j18 = j13;
                    }
                    j19 = jC;
                    j20 = jN;
                    z11 = z11;
                    i35 = i14;
                }
                i36 = i34;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(194495313, i35, i36, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                }
                androidx.compose.ui.a0 a0VarF4 = androidx.compose.foundation.layout.i6.f(a0Var2, 0.0f, 1, null);
                float f111 = f14;
                float f112 = fB;
                androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(-747577963, true, new d(g3VarC, function14, function4, f111, iB, nVar3, z11, q3VarC, fB, j20, jD, nVar, nVarC), c0VarR, 54);
                int i48 = i36 >> 3;
                long j210 = j19;
                long j211 = j18;
                ah.e(a0VarF4, null, j210, j211, null, 0.0f, cVarE4, c0VarR, (i48 & 7168) | (i48 & 896) | 1572864, 50);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function5 = function14;
                z13 = z11;
                f13 = f111;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function4;
                f12 = f112;
                g3Var2 = g3VarC;
                j17 = jD;
                j14 = j211;
                j15 = j210;
                a0Var3 = a0Var2;
                long j212 = j20;
                nVar4 = nVarC;
                i32 = iB;
                function6 = function15;
                q3Var2 = q3VarC;
                j16 = j212;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function5 = function2;
                q3Var2 = q3Var;
                j14 = j13;
                j15 = jC;
                nVar4 = nVarC;
                function6 = function4;
                i32 = i24;
                a0Var3 = a0Var2;
                g3Var2 = g3VarC;
                z13 = z11;
                f12 = f10;
                j16 = j10;
                j17 = j11;
                f13 = f11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d3.o(nVar, a0Var3, g3Var2, function5, nVar4, function6, i32, z13, q3Var2, f12, j16, j17, f13, j15, j14, nVar3, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i13 & 4) == 0) {
                g3VarC = g3Var;
                if (c0VarR.D(g3VarC)) {
                }
                i14 |= i40;
            } else {
                g3VarC = g3Var;
            }
            i14 |= i40;
        } else {
            g3VarC = g3Var;
        }
        i15 = i13 & 8;
        i16 = 1024;
        if (i15 != 0) {
            if ((i11 & 3072) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i14 |= i17;
            }
            i18 = i13 & 16;
            i19 = 8192;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    nVarC = nVar2;
                    if (c0VarR.k0(nVarC)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function4)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i10;
                } else {
                    i24 = i10;
                    if ((i11 & 1572864) == 0) {
                        if (c0VarR.K(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                i26 = i13 & 128;
                if (i26 != 0) {
                    i14 |= 12582912;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i11 & 12582912) == 0) {
                        if (c0VarR.G(z11)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i14 |= i27;
                    }
                }
                if ((i11 & 100663296) != 0) {
                    i14 |= ((i13 & 256) == 0 || !c0VarR.D(q3Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                if ((i11 & 805306368) != 0) {
                    i14 |= ((i13 & 512) == 0 || !c0VarR.I(f10)) ? 268435456 : 536870912;
                }
                if ((i12 & 6) == 0) {
                    if ((i13 & 1024) == 0) {
                        i38 = 2;
                    } else {
                        i38 = 2;
                    }
                    i28 = i12 | i38;
                } else {
                    i28 = i12;
                }
                if ((i12 & 48) == 0) {
                    int i49 = i28;
                    if ((i13 & 2048) == 0) {
                        i37 = 16;
                    } else {
                        i37 = 16;
                    }
                    i28 = i49 | i37;
                }
                i29 = i28;
                if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                    i30 = i29 | (((i13 & 4096) == 0 || !c0VarR.I(f11)) ? 128 : 256);
                } else {
                    i30 = i29;
                }
                if ((i12 & 3072) == 0) {
                    jC = j12;
                    if ((i13 & 8192) == 0) {
                        i16 = 2048;
                    }
                    i30 |= i16;
                } else {
                    jC = j12;
                }
                if ((i12 & 24576) != 0) {
                    if ((i13 & 16384) == 0) {
                        i19 = 16384;
                    }
                    i30 |= i19;
                }
                if ((i13 & 32768) != 0) {
                    i30 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar3)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 |= i31;
                }
                if ((306783379 & i14) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i14 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i39 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            g3VarC = C(null, null, c0VarR, 0, 3);
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i18 != 0) {
                            nVarC = q4.f24367a.c();
                        }
                        if (i21 != 0) {
                            function4 = null;
                        }
                        if (i23 != 0) {
                            iB = q8.f24378b.b();
                        } else {
                            iB = i24;
                        }
                        if (i26 != 0) {
                            z11 = true;
                        }
                        if ((i13 & 256) != 0) {
                            q3VarC = x9.f25488a.b(c0VarR, 6).c();
                            i14 &= -234881025;
                        } else {
                            q3VarC = q3Var;
                        }
                        if ((i13 & 512) != 0) {
                            fB = s2.f24875a.b();
                            i14 &= -1879048193;
                        } else {
                            fB = f10;
                        }
                        if ((i13 & 1024) != 0) {
                            i30 &= -15;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        } else {
                            jN = j10;
                        }
                        if ((i13 & 2048) != 0) {
                            jD = n4.d(jN, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jD = j11;
                        }
                        i33 = i30;
                        function2 = function7;
                        if ((i13 & 4096) != 0) {
                            fC = s2.f24875a.c();
                            i33 &= -897;
                        } else {
                            fC = f11;
                        }
                        f14 = fC;
                        if ((i13 & 8192) != 0) {
                            jC = x9.f25488a.a(c0VarR, 6).c();
                            i34 = i33 & (-7169);
                        } else {
                            i34 = i33;
                        }
                        if ((i13 & 16384) != 0) {
                            long jD9 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                            i34 &= -57345;
                            j18 = jD9;
                        } else {
                            j18 = j13;
                        }
                        j19 = jC;
                        j20 = jN;
                        z11 = z11;
                        i35 = i14;
                    } else {
                        if (i39 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i13 & 4) != 0) {
                            i14 &= -897;
                            g3VarC = C(null, null, c0VarR, 0, 3);
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i18 != 0) {
                            nVarC = q4.f24367a.c();
                        }
                        if (i21 != 0) {
                            function4 = null;
                        }
                        if (i23 != 0) {
                            iB = q8.f24378b.b();
                        } else {
                            iB = i24;
                        }
                        if (i26 != 0) {
                            z11 = true;
                        }
                        if ((i13 & 256) != 0) {
                            q3VarC = x9.f25488a.b(c0VarR, 6).c();
                            i14 &= -234881025;
                        } else {
                            q3VarC = q3Var;
                        }
                        if ((i13 & 512) != 0) {
                            fB = s2.f24875a.b();
                            i14 &= -1879048193;
                        } else {
                            fB = f10;
                        }
                        if ((i13 & 1024) != 0) {
                            i30 &= -15;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        } else {
                            jN = j10;
                        }
                        if ((i13 & 2048) != 0) {
                            jD = n4.d(jN, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jD = j11;
                        }
                        i33 = i30;
                        function2 = function7;
                        if ((i13 & 4096) != 0) {
                            fC = s2.f24875a.c();
                            i33 &= -897;
                        } else {
                            fC = f11;
                        }
                        f14 = fC;
                        if ((i13 & 8192) != 0) {
                            jC = x9.f25488a.a(c0VarR, 6).c();
                            i34 = i33 & (-7169);
                        } else {
                            i34 = i33;
                        }
                        if ((i13 & 16384) != 0) {
                            long jD10 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                            i34 &= -57345;
                            j18 = jD10;
                        } else {
                            j18 = j13;
                        }
                        j19 = jC;
                        j20 = jN;
                        z11 = z11;
                        i35 = i14;
                    }
                    i36 = i34;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(194495313, i35, i36, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                    }
                    androidx.compose.ui.a0 a0VarF5 = androidx.compose.foundation.layout.i6.f(a0Var2, 0.0f, 1, null);
                    float f113 = f14;
                    float f114 = fB;
                    androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(-747577963, true, new d(g3VarC, function16, function4, f113, iB, nVar3, z11, q3VarC, fB, j20, jD, nVar, nVarC), c0VarR, 54);
                    int i410 = i36 >> 3;
                    long j213 = j19;
                    long j214 = j18;
                    ah.e(a0VarF5, null, j213, j214, null, 0.0f, cVarE5, c0VarR, (i410 & 7168) | (i410 & 896) | 1572864, 50);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function16;
                    z13 = z11;
                    f13 = f113;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function4;
                    f12 = f114;
                    g3Var2 = g3VarC;
                    j17 = jD;
                    j14 = j214;
                    j15 = j213;
                    a0Var3 = a0Var2;
                    long j215 = j20;
                    nVar4 = nVarC;
                    i32 = iB;
                    function6 = function17;
                    q3Var2 = q3VarC;
                    j16 = j215;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function5 = function2;
                    q3Var2 = q3Var;
                    j14 = j13;
                    j15 = jC;
                    nVar4 = nVarC;
                    function6 = function4;
                    i32 = i24;
                    a0Var3 = a0Var2;
                    g3Var2 = g3VarC;
                    z13 = z11;
                    f12 = f10;
                    j16 = j10;
                    j17 = j11;
                    f13 = f11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d3.o(nVar, a0Var3, g3Var2, function5, nVar4, function6, i32, z13, q3Var2, f12, j16, j17, f13, j15, j14, nVar3, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            nVarC = nVar2;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function4)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                i24 = i10;
            } else {
                i24 = i10;
                if ((i11 & 1572864) == 0) {
                    if (c0VarR.K(i24)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
            }
            i26 = i13 & 128;
            if (i26 != 0) {
                i14 |= 12582912;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i11 & 12582912) == 0) {
                    if (c0VarR.G(z11)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i14 |= i27;
                }
            }
            if ((i11 & 100663296) != 0) {
                i14 |= ((i13 & 256) == 0 || !c0VarR.D(q3Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            if ((i11 & 805306368) != 0) {
                i14 |= ((i13 & 512) == 0 || !c0VarR.I(f10)) ? 268435456 : 536870912;
            }
            if ((i12 & 6) == 0) {
                if ((i13 & 1024) == 0) {
                    i38 = 2;
                } else {
                    i38 = 2;
                }
                i28 = i12 | i38;
            } else {
                i28 = i12;
            }
            if ((i12 & 48) == 0) {
                int i411 = i28;
                if ((i13 & 2048) == 0) {
                    i37 = 16;
                } else {
                    i37 = 16;
                }
                i28 = i411 | i37;
            }
            i29 = i28;
            if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                i30 = i29 | (((i13 & 4096) == 0 || !c0VarR.I(f11)) ? 128 : 256);
            } else {
                i30 = i29;
            }
            if ((i12 & 3072) == 0) {
                jC = j12;
                if ((i13 & 8192) == 0) {
                    i16 = 2048;
                }
                i30 |= i16;
            } else {
                jC = j12;
            }
            if ((i12 & 24576) != 0) {
                if ((i13 & 16384) == 0) {
                    i19 = 16384;
                }
                i30 |= i19;
            }
            if ((i13 & 32768) != 0) {
                i30 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar3)) {
                    i31 = 131072;
                } else {
                    i31 = 65536;
                }
                i30 |= i31;
            }
            if ((306783379 & i14) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i14 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i39 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        g3VarC = C(null, null, c0VarR, 0, 3);
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i18 != 0) {
                        nVarC = q4.f24367a.c();
                    }
                    if (i21 != 0) {
                        function4 = null;
                    }
                    if (i23 != 0) {
                        iB = q8.f24378b.b();
                    } else {
                        iB = i24;
                    }
                    if (i26 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 256) != 0) {
                        q3VarC = x9.f25488a.b(c0VarR, 6).c();
                        i14 &= -234881025;
                    } else {
                        q3VarC = q3Var;
                    }
                    if ((i13 & 512) != 0) {
                        fB = s2.f24875a.b();
                        i14 &= -1879048193;
                    } else {
                        fB = f10;
                    }
                    if ((i13 & 1024) != 0) {
                        i30 &= -15;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    } else {
                        jN = j10;
                    }
                    if ((i13 & 2048) != 0) {
                        jD = n4.d(jN, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jD = j11;
                    }
                    i33 = i30;
                    function2 = function7;
                    if ((i13 & 4096) != 0) {
                        fC = s2.f24875a.c();
                        i33 &= -897;
                    } else {
                        fC = f11;
                    }
                    f14 = fC;
                    if ((i13 & 8192) != 0) {
                        jC = x9.f25488a.a(c0VarR, 6).c();
                        i34 = i33 & (-7169);
                    } else {
                        i34 = i33;
                    }
                    if ((i13 & 16384) != 0) {
                        long jD11 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                        i34 &= -57345;
                        j18 = jD11;
                    } else {
                        j18 = j13;
                    }
                    j19 = jC;
                    j20 = jN;
                    z11 = z11;
                    i35 = i14;
                } else {
                    if (i39 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        g3VarC = C(null, null, c0VarR, 0, 3);
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i18 != 0) {
                        nVarC = q4.f24367a.c();
                    }
                    if (i21 != 0) {
                        function4 = null;
                    }
                    if (i23 != 0) {
                        iB = q8.f24378b.b();
                    } else {
                        iB = i24;
                    }
                    if (i26 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 256) != 0) {
                        q3VarC = x9.f25488a.b(c0VarR, 6).c();
                        i14 &= -234881025;
                    } else {
                        q3VarC = q3Var;
                    }
                    if ((i13 & 512) != 0) {
                        fB = s2.f24875a.b();
                        i14 &= -1879048193;
                    } else {
                        fB = f10;
                    }
                    if ((i13 & 1024) != 0) {
                        i30 &= -15;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    } else {
                        jN = j10;
                    }
                    if ((i13 & 2048) != 0) {
                        jD = n4.d(jN, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jD = j11;
                    }
                    i33 = i30;
                    function2 = function7;
                    if ((i13 & 4096) != 0) {
                        fC = s2.f24875a.c();
                        i33 &= -897;
                    } else {
                        fC = f11;
                    }
                    f14 = fC;
                    if ((i13 & 8192) != 0) {
                        jC = x9.f25488a.a(c0VarR, 6).c();
                        i34 = i33 & (-7169);
                    } else {
                        i34 = i33;
                    }
                    if ((i13 & 16384) != 0) {
                        long jD12 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                        i34 &= -57345;
                        j18 = jD12;
                    } else {
                        j18 = j13;
                    }
                    j19 = jC;
                    j20 = jN;
                    z11 = z11;
                    i35 = i14;
                }
                i36 = i34;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(194495313, i35, i36, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                }
                androidx.compose.ui.a0 a0VarF6 = androidx.compose.foundation.layout.i6.f(a0Var2, 0.0f, 1, null);
                float f115 = f14;
                float f116 = fB;
                androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(-747577963, true, new d(g3VarC, function18, function4, f115, iB, nVar3, z11, q3VarC, fB, j20, jD, nVar, nVarC), c0VarR, 54);
                int i412 = i36 >> 3;
                long j216 = j19;
                long j217 = j18;
                ah.e(a0VarF6, null, j216, j217, null, 0.0f, cVarE6, c0VarR, (i412 & 7168) | (i412 & 896) | 1572864, 50);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function5 = function18;
                z13 = z11;
                f13 = f115;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function4;
                f12 = f116;
                g3Var2 = g3VarC;
                j17 = jD;
                j14 = j217;
                j15 = j216;
                a0Var3 = a0Var2;
                long j218 = j20;
                nVar4 = nVarC;
                i32 = iB;
                function6 = function19;
                q3Var2 = q3VarC;
                j16 = j218;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function5 = function2;
                q3Var2 = q3Var;
                j14 = j13;
                j15 = jC;
                nVar4 = nVarC;
                function6 = function4;
                i32 = i24;
                a0Var3 = a0Var2;
                g3Var2 = g3VarC;
                z13 = z11;
                f12 = f10;
                j16 = j10;
                j17 = j11;
                f13 = f11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d3.o(nVar, a0Var3, g3Var2, function5, nVar4, function6, i32, z13, q3Var2, f12, j16, j17, f13, j15, j14, nVar3, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 3072;
        i18 = i13 & 16;
        i19 = 8192;
        if (i18 != 0) {
            if ((i11 & 24576) == 0) {
                nVarC = nVar2;
                if (c0VarR.k0(nVarC)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i14 |= i20;
            }
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function4)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                i24 = i10;
            } else {
                i24 = i10;
                if ((i11 & 1572864) == 0) {
                    if (c0VarR.K(i24)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
            }
            i26 = i13 & 128;
            if (i26 != 0) {
                i14 |= 12582912;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i11 & 12582912) == 0) {
                    if (c0VarR.G(z11)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i14 |= i27;
                }
            }
            if ((i11 & 100663296) != 0) {
                i14 |= ((i13 & 256) == 0 || !c0VarR.D(q3Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            if ((i11 & 805306368) != 0) {
                i14 |= ((i13 & 512) == 0 || !c0VarR.I(f10)) ? 268435456 : 536870912;
            }
            if ((i12 & 6) == 0) {
                if ((i13 & 1024) == 0) {
                    i38 = 2;
                } else {
                    i38 = 2;
                }
                i28 = i12 | i38;
            } else {
                i28 = i12;
            }
            if ((i12 & 48) == 0) {
                int i413 = i28;
                if ((i13 & 2048) == 0) {
                    i37 = 16;
                } else {
                    i37 = 16;
                }
                i28 = i413 | i37;
            }
            i29 = i28;
            if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                i30 = i29 | (((i13 & 4096) == 0 || !c0VarR.I(f11)) ? 128 : 256);
            } else {
                i30 = i29;
            }
            if ((i12 & 3072) == 0) {
                jC = j12;
                if ((i13 & 8192) == 0) {
                    i16 = 2048;
                }
                i30 |= i16;
            } else {
                jC = j12;
            }
            if ((i12 & 24576) != 0) {
                if ((i13 & 16384) == 0) {
                    i19 = 16384;
                }
                i30 |= i19;
            }
            if ((i13 & 32768) != 0) {
                i30 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar3)) {
                    i31 = 131072;
                } else {
                    i31 = 65536;
                }
                i30 |= i31;
            }
            if ((306783379 & i14) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i14 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i39 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        g3VarC = C(null, null, c0VarR, 0, 3);
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i18 != 0) {
                        nVarC = q4.f24367a.c();
                    }
                    if (i21 != 0) {
                        function4 = null;
                    }
                    if (i23 != 0) {
                        iB = q8.f24378b.b();
                    } else {
                        iB = i24;
                    }
                    if (i26 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 256) != 0) {
                        q3VarC = x9.f25488a.b(c0VarR, 6).c();
                        i14 &= -234881025;
                    } else {
                        q3VarC = q3Var;
                    }
                    if ((i13 & 512) != 0) {
                        fB = s2.f24875a.b();
                        i14 &= -1879048193;
                    } else {
                        fB = f10;
                    }
                    if ((i13 & 1024) != 0) {
                        i30 &= -15;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    } else {
                        jN = j10;
                    }
                    if ((i13 & 2048) != 0) {
                        jD = n4.d(jN, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jD = j11;
                    }
                    i33 = i30;
                    function2 = function7;
                    if ((i13 & 4096) != 0) {
                        fC = s2.f24875a.c();
                        i33 &= -897;
                    } else {
                        fC = f11;
                    }
                    f14 = fC;
                    if ((i13 & 8192) != 0) {
                        jC = x9.f25488a.a(c0VarR, 6).c();
                        i34 = i33 & (-7169);
                    } else {
                        i34 = i33;
                    }
                    if ((i13 & 16384) != 0) {
                        long jD13 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                        i34 &= -57345;
                        j18 = jD13;
                    } else {
                        j18 = j13;
                    }
                    j19 = jC;
                    j20 = jN;
                    z11 = z11;
                    i35 = i14;
                } else {
                    if (i39 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i13 & 4) != 0) {
                        i14 &= -897;
                        g3VarC = C(null, null, c0VarR, 0, 3);
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i18 != 0) {
                        nVarC = q4.f24367a.c();
                    }
                    if (i21 != 0) {
                        function4 = null;
                    }
                    if (i23 != 0) {
                        iB = q8.f24378b.b();
                    } else {
                        iB = i24;
                    }
                    if (i26 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 256) != 0) {
                        q3VarC = x9.f25488a.b(c0VarR, 6).c();
                        i14 &= -234881025;
                    } else {
                        q3VarC = q3Var;
                    }
                    if ((i13 & 512) != 0) {
                        fB = s2.f24875a.b();
                        i14 &= -1879048193;
                    } else {
                        fB = f10;
                    }
                    if ((i13 & 1024) != 0) {
                        i30 &= -15;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    } else {
                        jN = j10;
                    }
                    if ((i13 & 2048) != 0) {
                        jD = n4.d(jN, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jD = j11;
                    }
                    i33 = i30;
                    function2 = function7;
                    if ((i13 & 4096) != 0) {
                        fC = s2.f24875a.c();
                        i33 &= -897;
                    } else {
                        fC = f11;
                    }
                    f14 = fC;
                    if ((i13 & 8192) != 0) {
                        jC = x9.f25488a.a(c0VarR, 6).c();
                        i34 = i33 & (-7169);
                    } else {
                        i34 = i33;
                    }
                    if ((i13 & 16384) != 0) {
                        long jD14 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                        i34 &= -57345;
                        j18 = jD14;
                    } else {
                        j18 = j13;
                    }
                    j19 = jC;
                    j20 = jN;
                    z11 = z11;
                    i35 = i14;
                }
                i36 = i34;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(194495313, i35, i36, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                }
                androidx.compose.ui.a0 a0VarF7 = androidx.compose.foundation.layout.i6.f(a0Var2, 0.0f, 1, null);
                float f117 = f14;
                float f118 = fB;
                androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(-747577963, true, new d(g3VarC, function110, function4, f117, iB, nVar3, z11, q3VarC, fB, j20, jD, nVar, nVarC), c0VarR, 54);
                int i414 = i36 >> 3;
                long j219 = j19;
                long j2110 = j18;
                ah.e(a0VarF7, null, j219, j2110, null, 0.0f, cVarE7, c0VarR, (i414 & 7168) | (i414 & 896) | 1572864, 50);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function5 = function110;
                z13 = z11;
                f13 = f117;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111 = function4;
                f12 = f118;
                g3Var2 = g3VarC;
                j17 = jD;
                j14 = j2110;
                j15 = j219;
                a0Var3 = a0Var2;
                long j2111 = j20;
                nVar4 = nVarC;
                i32 = iB;
                function6 = function111;
                q3Var2 = q3VarC;
                j16 = j2111;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function5 = function2;
                q3Var2 = q3Var;
                j14 = j13;
                j15 = jC;
                nVar4 = nVarC;
                function6 = function4;
                i32 = i24;
                a0Var3 = a0Var2;
                g3Var2 = g3VarC;
                z13 = z11;
                f12 = f10;
                j16 = j10;
                j17 = j11;
                f13 = f11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d3.o(nVar, a0Var3, g3Var2, function5, nVar4, function6, i32, z13, q3Var2, f12, j16, j17, f13, j15, j14, nVar3, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 24576;
        nVarC = nVar2;
        i21 = i13 & 32;
        if (i21 != 0) {
            i14 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function3;
        } else {
            function4 = function3;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function4)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
        }
        i23 = i13 & 64;
        if (i23 != 0) {
            i14 |= 1572864;
            i24 = i10;
        } else {
            i24 = i10;
            if ((i11 & 1572864) == 0) {
                if (c0VarR.K(i24)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
        }
        i26 = i13 & 128;
        if (i26 != 0) {
            i14 |= 12582912;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i11 & 12582912) == 0) {
                if (c0VarR.G(z11)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i14 |= i27;
            }
        }
        if ((i11 & 100663296) != 0) {
            i14 |= ((i13 & 256) == 0 || !c0VarR.D(q3Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
        }
        if ((i11 & 805306368) != 0) {
            i14 |= ((i13 & 512) == 0 || !c0VarR.I(f10)) ? 268435456 : 536870912;
        }
        if ((i12 & 6) == 0) {
            if ((i13 & 1024) == 0) {
                i38 = 2;
            } else {
                i38 = 2;
            }
            i28 = i12 | i38;
        } else {
            i28 = i12;
        }
        if ((i12 & 48) == 0) {
            int i415 = i28;
            if ((i13 & 2048) == 0) {
                i37 = 16;
            } else {
                i37 = 16;
            }
            i28 = i415 | i37;
        }
        i29 = i28;
        if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
            i30 = i29 | (((i13 & 4096) == 0 || !c0VarR.I(f11)) ? 128 : 256);
        } else {
            i30 = i29;
        }
        if ((i12 & 3072) == 0) {
            jC = j12;
            if ((i13 & 8192) == 0) {
                i16 = 2048;
            }
            i30 |= i16;
        } else {
            jC = j12;
        }
        if ((i12 & 24576) != 0) {
            if ((i13 & 16384) == 0) {
                i19 = 16384;
            }
            i30 |= i19;
        }
        if ((i13 & 32768) != 0) {
            i30 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(nVar3)) {
                i31 = 131072;
            } else {
                i31 = 65536;
            }
            i30 |= i31;
        }
        if ((306783379 & i14) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (c0VarR.h(z12, i14 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i39 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i13 & 4) != 0) {
                    i14 &= -897;
                    g3VarC = C(null, null, c0VarR, 0, 3);
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i18 != 0) {
                    nVarC = q4.f24367a.c();
                }
                if (i21 != 0) {
                    function4 = null;
                }
                if (i23 != 0) {
                    iB = q8.f24378b.b();
                } else {
                    iB = i24;
                }
                if (i26 != 0) {
                    z11 = true;
                }
                if ((i13 & 256) != 0) {
                    q3VarC = x9.f25488a.b(c0VarR, 6).c();
                    i14 &= -234881025;
                } else {
                    q3VarC = q3Var;
                }
                if ((i13 & 512) != 0) {
                    fB = s2.f24875a.b();
                    i14 &= -1879048193;
                } else {
                    fB = f10;
                }
                if ((i13 & 1024) != 0) {
                    i30 &= -15;
                    jN = x9.f25488a.a(c0VarR, 6).n();
                } else {
                    jN = j10;
                }
                if ((i13 & 2048) != 0) {
                    jD = n4.d(jN, c0VarR, i30 & 14);
                    i30 &= -113;
                } else {
                    jD = j11;
                }
                i33 = i30;
                function2 = function7;
                if ((i13 & 4096) != 0) {
                    fC = s2.f24875a.c();
                    i33 &= -897;
                } else {
                    fC = f11;
                }
                f14 = fC;
                if ((i13 & 8192) != 0) {
                    jC = x9.f25488a.a(c0VarR, 6).c();
                    i34 = i33 & (-7169);
                } else {
                    i34 = i33;
                }
                if ((i13 & 16384) != 0) {
                    long jD15 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                    i34 &= -57345;
                    j18 = jD15;
                } else {
                    j18 = j13;
                }
                j19 = jC;
                j20 = jN;
                z11 = z11;
                i35 = i14;
            } else {
                if (i39 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i13 & 4) != 0) {
                    i14 &= -897;
                    g3VarC = C(null, null, c0VarR, 0, 3);
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i18 != 0) {
                    nVarC = q4.f24367a.c();
                }
                if (i21 != 0) {
                    function4 = null;
                }
                if (i23 != 0) {
                    iB = q8.f24378b.b();
                } else {
                    iB = i24;
                }
                if (i26 != 0) {
                    z11 = true;
                }
                if ((i13 & 256) != 0) {
                    q3VarC = x9.f25488a.b(c0VarR, 6).c();
                    i14 &= -234881025;
                } else {
                    q3VarC = q3Var;
                }
                if ((i13 & 512) != 0) {
                    fB = s2.f24875a.b();
                    i14 &= -1879048193;
                } else {
                    fB = f10;
                }
                if ((i13 & 1024) != 0) {
                    i30 &= -15;
                    jN = x9.f25488a.a(c0VarR, 6).n();
                } else {
                    jN = j10;
                }
                if ((i13 & 2048) != 0) {
                    jD = n4.d(jN, c0VarR, i30 & 14);
                    i30 &= -113;
                } else {
                    jD = j11;
                }
                i33 = i30;
                function2 = function7;
                if ((i13 & 4096) != 0) {
                    fC = s2.f24875a.c();
                    i33 &= -897;
                } else {
                    fC = f11;
                }
                f14 = fC;
                if ((i13 & 8192) != 0) {
                    jC = x9.f25488a.a(c0VarR, 6).c();
                    i34 = i33 & (-7169);
                } else {
                    i34 = i33;
                }
                if ((i13 & 16384) != 0) {
                    long jD16 = n4.d(jC, c0VarR, (i34 >> 9) & 14);
                    i34 &= -57345;
                    j18 = jD16;
                } else {
                    j18 = j13;
                }
                j19 = jC;
                j20 = jN;
                z11 = z11;
                i35 = i14;
            }
            i36 = i34;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function112 = function2;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(194495313, i35, i36, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
            }
            androidx.compose.ui.a0 a0VarF8 = androidx.compose.foundation.layout.i6.f(a0Var2, 0.0f, 1, null);
            float f119 = f14;
            float f1110 = fB;
            androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(-747577963, true, new d(g3VarC, function112, function4, f119, iB, nVar3, z11, q3VarC, fB, j20, jD, nVar, nVarC), c0VarR, 54);
            int i416 = i36 >> 3;
            long j2112 = j19;
            long j2113 = j18;
            ah.e(a0VarF8, null, j2112, j2113, null, 0.0f, cVarE8, c0VarR, (i416 & 7168) | (i416 & 896) | 1572864, 50);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function5 = function112;
            z13 = z11;
            f13 = f119;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function113 = function4;
            f12 = f1110;
            g3Var2 = g3VarC;
            j17 = jD;
            j14 = j2113;
            j15 = j2112;
            a0Var3 = a0Var2;
            long j2114 = j20;
            nVar4 = nVarC;
            i32 = iB;
            function6 = function113;
            q3Var2 = q3VarC;
            j16 = j2114;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            function5 = function2;
            q3Var2 = q3Var;
            j14 = j13;
            j15 = jC;
            nVar4 = nVarC;
            function6 = function4;
            i32 = i24;
            a0Var3 = a0Var2;
            g3Var2 = g3VarC;
            z13 = z11;
            f12 = f10;
            j16 = j10;
            j17 = j11;
            f13 = f11;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.c3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d3.o(nVar, a0Var3, g3Var2, function5, nVar4, function6, i32, z13, q3Var2, f12, j16, j17, f13, j15, j14, nVar3, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    public static final void m(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, final float f10, final Function0<Float> function0, final int i10, final m3 m3Var, androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(757616750);
        if ((i11 & 6) == 0) {
            i12 = (c0VarR.k0(function2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(function4) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0VarR.k0(function5) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c0VarR.k0(function6) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c0VarR.I(f10) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c0VarR.k0(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= c0VarR.K(i10) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= c0VarR.D(m3Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if (c0VarR.h((38347923 & i12) != 38347922, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(757616750, i12, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function2 == null ? q4.f24367a.a() : function2, function3, function4, function5 == null ? q4.f24367a.b() : function5, function6});
            boolean z10 = ((3670016 & i12) == 1048576) | ((29360128 & i12) == 8388608) | ((458752 & i12) == 131072) | ((i12 & 234881024) == 67108864);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new e(function0, i10, f10, m3Var);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.h1 h1Var = (androidx.compose.ui.layout.h1) objI0;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2E = androidx.compose.ui.layout.n0.e(listListOf);
            boolean zD = c0VarR.D(h1Var);
            Object objI1 = c0VarR.i0();
            if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = androidx.compose.ui.layout.j1.a(h1Var);
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI1;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            function2E.invoke(c0VarR, 0);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.y2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d3.n(function2, function3, function4, function5, function6, f10, function0, i10, m3Var, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function2 function6, float f10, Function0 function0, int i10, m3 m3Var, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        m(function2, function3, function4, function5, function6, f10, function0, i10, m3Var, c0Var, androidx.compose.runtime.t4.a(i11 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(pj.n nVar, androidx.compose.ui.a0 a0Var, g3 g3Var, Function2 function2, pj.n nVar2, Function2 function3, int i10, boolean z10, androidx.compose.ui.graphics.q3 q3Var, float f10, long j10, long j11, float f11, long j12, long j13, pj.n nVar3, int i11, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        l(nVar, a0Var, g3Var, function2, nVar2, function3, i10, z10, q3Var, f10, j10, j11, f11, j12, j13, nVar3, c0Var, androidx.compose.runtime.t4.a(i11 | 1), androidx.compose.runtime.t4.a(i12), i13);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair p(m3 m3Var, final float f10, androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.b bVar) {
        n3 n3Var;
        final int iO = androidx.compose.ui.unit.b.o(bVar.x());
        final float fQ = (int) (uVar.q() & com.rabbitmq.client.k0.f265952a);
        w5 w5VarA = k.a(new Function1() { // from class: androidx.compose.material.t2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d3.q(iO, f10, fQ, (x5) obj);
            }
        });
        int i10 = g.f22481a[m3Var.k().F().ordinal()];
        if (i10 == 1) {
            n3Var = n3.Collapsed;
        } else {
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            n3Var = n3.Expanded;
            if (!w5VarA.d(n3Var)) {
                n3Var = n3.Collapsed;
            }
        }
        return TuplesKt.to(w5VarA, n3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(int i10, float f10, float f11, x5 x5Var) {
        float f12 = i10;
        x5Var.a(n3.Collapsed, f12 - f10);
        if (f11 > 0.0f && f11 != f10) {
            x5Var.a(n3.Expanded, f12 - f11);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(final m3 m3Var, final kotlinx.coroutines.s0 s0Var, androidx.compose.ui.semantics.e0 e0Var) {
        if (m3Var.k().u().getSize() > 1) {
            if (m3Var.p()) {
                androidx.compose.ui.semantics.b0.s(e0Var, null, new Function0() { // from class: androidx.compose.material.w2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(d3.s(m3Var, s0Var));
                    }
                }, 1, null);
            } else {
                androidx.compose.ui.semantics.b0.h(e0Var, null, new Function0() { // from class: androidx.compose.material.x2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(d3.t(m3Var, s0Var));
                    }
                }, 1, null);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(m3 m3Var, kotlinx.coroutines.s0 s0Var) {
        if (!m3Var.k().x().invoke(n3.Expanded).booleanValue()) {
            return true;
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new a(m3Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(m3 m3Var, kotlinx.coroutines.s0 s0Var) {
        if (!m3Var.k().x().invoke(n3.Collapsed).booleanValue()) {
            return true;
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new b(m3Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(m3 m3Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, float f10, long j10, long j11, float f11, androidx.compose.ui.a0 a0Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k(m3Var, z10, q3Var, f10, j10, j11, f11, a0Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.input.nestedscroll.a v(u<?> uVar, androidx.compose.foundation.gestures.q3 q3Var) {
        return new f(uVar, q3Var);
    }
}
