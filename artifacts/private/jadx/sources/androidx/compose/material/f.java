package androidx.compose.material;

import java.util.ArrayList;
import java.util.List;
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
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,450:1\n1282#2,6:451\n1282#2,6:569\n79#3,6:457\n86#3,3:472\n89#3,2:481\n79#3,6:494\n86#3,3:509\n89#3,2:518\n93#3:523\n79#3,6:535\n86#3,3:550\n89#3,2:559\n93#3:564\n93#3:568\n79#3:575\n77#3,8:576\n86#3,3:593\n89#3,2:602\n93#3:607\n347#4,9:463\n356#4:483\n347#4,9:500\n356#4,3:520\n347#4,9:541\n356#4,3:561\n357#4,2:566\n347#4,9:584\n356#4,3:604\n4206#5,6:475\n4206#5,6:512\n4206#5,6:553\n4206#5,6:596\n70#6:484\n67#6,9:485\n77#6:524\n70#6:525\n67#6,9:526\n77#6:565\n113#7:608\n113#7:609\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n*L\n259#1:451,6\n351#1:569,6\n249#1:457,6\n249#1:472,3\n249#1:481,2\n252#1:494,6\n252#1:509,3\n252#1:518,2\n252#1:523\n255#1:535,6\n255#1:550,3\n255#1:559,2\n255#1:564\n249#1:568\n351#1:575\n351#1:576,8\n351#1:593,3\n351#1:602,2\n351#1:607\n249#1:463,9\n249#1:483\n252#1:500,9\n252#1:520,3\n255#1:541,9\n255#1:561,3\n249#1:566,2\n351#1:584,9\n351#1:604,3\n249#1:475,6\n252#1:512,6\n255#1:553,6\n351#1:596,6\n252#1:484\n252#1:485,9\n252#1:524\n255#1:525\n255#1:526,9\n255#1:565\n441#1:608\n442#1:609\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.a0 f22663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.a0 f22664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f22666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f22667e;

    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n117#2,2:451\n34#2,6:453\n119#2:459\n117#2,2:460\n34#2,6:462\n119#2:468\n1#3:469\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2$1\n*L\n264#1:451,2\n264#1:453,6\n264#1:459\n268#1:460,2\n268#1:462,6\n268#1:468\n*E\n"})
    static final class a implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22668a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2 i2Var2, int i11, androidx.compose.ui.layout.i2.a aVar) {
            if (i2Var != null) {
                androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, i10, 0.0f, 4, null);
            }
            if (i2Var2 != null) {
                androidx.compose.ui.layout.i2.a.P(aVar, i2Var2, 0, i11, 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            androidx.compose.ui.layout.z0 z0Var;
            androidx.compose.ui.layout.z0 z0Var2;
            int iIntValue;
            int iIntValue2;
            int iIntValue3;
            final int i10;
            List<? extends androidx.compose.ui.layout.z0> list2 = list;
            int size = list2.size();
            int iC1 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z0Var = null;
                    break;
                }
                z0Var = list.get(i11);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "title")) {
                    break;
                }
                i11++;
            }
            androidx.compose.ui.layout.z0 z0Var3 = z0Var;
            final androidx.compose.ui.layout.i2 i2VarP0 = z0Var3 != null ? z0Var3.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null)) : null;
            int size2 = list2.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    z0Var2 = null;
                    break;
                }
                z0Var2 = list.get(i12);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "text")) {
                    break;
                }
                i12++;
            }
            androidx.compose.ui.layout.z0 z0Var4 = z0Var2;
            final androidx.compose.ui.layout.i2 i2VarP1 = z0Var4 != null ? z0Var4.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null)) : null;
            int iMax = Math.max(i2VarP0 != null ? i2VarP0.h1() : 0, i2VarP1 != null ? i2VarP1.h1() : 0);
            if (i2VarP0 == null) {
                iIntValue = 0;
            } else {
                int iIntValue4 = Integer.valueOf(i2VarP0.M(androidx.compose.ui.layout.b.a())).intValue();
                Integer numValueOf = iIntValue4 == Integer.MIN_VALUE ? null : Integer.valueOf(iIntValue4);
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
            }
            if (i2VarP0 == null) {
                iIntValue2 = 0;
            } else {
                int iM = i2VarP0.M(androidx.compose.ui.layout.b.b());
                Integer numValueOf2 = iM == Integer.MIN_VALUE ? null : Integer.valueOf(iM);
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
            }
            final int iC8 = c1Var.c8(f.f22665c) - iIntValue;
            if (i2VarP1 == null) {
                iIntValue3 = 0;
            } else {
                int iM2 = i2VarP1.M(androidx.compose.ui.layout.b.a());
                Integer numValueOf3 = iM2 != Integer.MIN_VALUE ? Integer.valueOf(iM2) : null;
                if (numValueOf3 != null) {
                    iIntValue3 = numValueOf3.intValue();
                } else {
                    iIntValue3 = 0;
                }
            }
            int iC9 = i2VarP0 == null ? c1Var.c8(f.f22667e) : c1Var.c8(f.f22666d);
            int iC2 = i2VarP0 != null ? i2VarP0.c1() + iC8 : 0;
            if (i2VarP0 == null) {
                i10 = iC9 - iIntValue3;
            } else {
                i10 = (iIntValue2 == 0 ? iC2 - iIntValue3 : (iC8 + iIntValue2) - iIntValue3) + iC9;
            }
            if (i2VarP1 != null) {
                if (iIntValue2 == 0) {
                    iC1 = (i2VarP1.c1() + iC9) - iIntValue3;
                } else {
                    iC1 = ((i2VarP1.c1() + iC9) - iIntValue3) - ((i2VarP0 != null ? i2VarP0.c1() : 0) - iIntValue2);
                }
            }
            return androidx.compose.ui.layout.c1.h6(c1Var, iMax, iC2 + iC1, null, new Function1() { // from class: androidx.compose.material.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.a.g(i2VarP0, iC8, i2VarP1, i10, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogContent$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,450:1\n87#2:451\n83#2,10:452\n94#2:492\n79#3,6:462\n86#3,3:477\n89#3,2:486\n93#3:491\n347#4,9:468\n356#4,3:488\n4206#5,6:480\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogContent$1\n*L\n209#1:451\n209#1:452,10\n209#1:492\n209#1:462,6\n209#1:477,3\n209#1:486,2\n209#1:491\n209#1:468,9\n209#1:488,3\n209#1:480,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22671c;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22672a;

            /* JADX INFO: renamed from: androidx.compose.material.f$b$a$a, reason: collision with other inner class name */
            static final class C0171a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22673a;

                /* JADX WARN: Multi-variable type inference failed */
                C0171a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                    this.f22673a = function2;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                    boolean z10;
                    if ((i10 & 3) != 2) {
                        z10 = true;
                        int i11 = 2 ^ 1;
                    } else {
                        z10 = false;
                    }
                    if (!c0Var.h(z10, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1654653485, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:214)");
                    }
                    wk.l(x9.f25488a.c(c0Var, 6).n(), this.f22673a, c0Var, 0);
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
            a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f22672a = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1737550099, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:213)");
                }
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(u4.f25148a.c(c0Var, 6))), androidx.compose.runtime.internal.w.e(-1654653485, true, new C0171a(this.f22672a), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

        /* JADX INFO: renamed from: androidx.compose.material.f$b$b, reason: collision with other inner class name */
        static final class C0172b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22674a;

            /* JADX INFO: renamed from: androidx.compose.material.f$b$b$a */
            static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22675a;

                /* JADX WARN: Multi-variable type inference failed */
                a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                    this.f22675a = function2;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2126650894, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:225)");
                    }
                    wk.l(x9.f25488a.c(c0Var, 6).d(), this.f22675a, c0Var, 0);
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
            C0172b(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f22674a = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                int i11 = (6 ^ 2) ^ 1;
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1265552690, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:222)");
                }
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(u4.f25148a.d(c0Var, 6))), androidx.compose.runtime.internal.w.e(-2126650894, true, new a(this.f22674a), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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
        b(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4) {
            this.f22669a = function2;
            this.f22670b = function3;
            this.f22671c = function4;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.runtime.internal.c cVarE;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(802957984, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous> (AlertDialog.kt:208)");
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f22669a;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f22670b;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function4 = this.f22671c;
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
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            androidx.compose.runtime.internal.c cVarE2 = null;
            int i11 = 6 >> 0;
            if (function2 == null) {
                c0Var.E(-97968969);
                c0Var.A();
                cVarE = null;
            } else {
                c0Var.E(-97968968);
                cVarE = androidx.compose.runtime.internal.w.e(1737550099, true, new a(function2), c0Var, 54);
                c0Var.A();
            }
            if (function3 == null) {
                c0Var.E(-97547524);
            } else {
                c0Var.E(-97547523);
                cVarE2 = androidx.compose.runtime.internal.w.e(1265552690, true, new C0172b(function3), c0Var, 54);
            }
            c0Var.A();
            f.d(n0Var, cVarE, cVarE2, c0Var, 6);
            function4.invoke(c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,450:1\n34#2,6:451\n70#2,4:457\n70#2,6:461\n75#2:467\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1\n*L\n389#1:451,6\n420#1:457,4\n433#1:461,6\n420#1:467\n*E\n"})
    static final class c implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f22676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f22677b;

        c(float f10, float f11) {
            this.f22676a = f10;
            this.f22677b = f11;
        }

        private static final boolean g(List<androidx.compose.ui.layout.i2> list, kotlin.jvm.internal.i1.f fVar, androidx.compose.ui.layout.c1 c1Var, float f10, long j10, androidx.compose.ui.layout.i2 i2Var) {
            return list.isEmpty() || (fVar.f312749a + c1Var.g6(f10)) + i2Var.h1() <= androidx.compose.ui.unit.b.p(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(List list, androidx.compose.ui.layout.c1 c1Var, float f10, int i10, List list2, androidx.compose.ui.layout.i2.a aVar) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                List list3 = (List) list.get(i11);
                int size2 = list3.size();
                int[] iArr = new int[size2];
                int i12 = 0;
                while (i12 < size2) {
                    iArr[i12] = ((androidx.compose.ui.layout.i2) list3.get(i12)).h1() + (i12 < CollectionsKt.getLastIndex(list3) ? c1Var.g6(f10) : 0);
                    i12++;
                }
                int[] iArr2 = new int[size2];
                androidx.compose.foundation.layout.q.f16330a.k().arrange(c1Var, i10, iArr, iArr2);
                int size3 = list3.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    androidx.compose.ui.layout.i2.a.P(aVar, (androidx.compose.ui.layout.i2) list3.get(i13), iArr2[i13], ((Number) list2.get(i11)).intValue(), 0.0f, 4, null);
                }
            }
            return Unit.f312394a;
        }

        private static final void i(List<List<androidx.compose.ui.layout.i2>> list, kotlin.jvm.internal.i1.f fVar, androidx.compose.ui.layout.c1 c1Var, float f10, List<androidx.compose.ui.layout.i2> list2, List<Integer> list3, kotlin.jvm.internal.i1.f fVar2, List<Integer> list4, kotlin.jvm.internal.i1.f fVar3, kotlin.jvm.internal.i1.f fVar4) {
            if (!list.isEmpty()) {
                fVar.f312749a += c1Var.g6(f10);
            }
            int i10 = 1 << 0;
            list.add(0, CollectionsKt.toList(list2));
            list3.add(Integer.valueOf(fVar2.f312749a));
            list4.add(Integer.valueOf(fVar.f312749a));
            fVar.f312749a += fVar2.f312749a;
            fVar3.f312749a = Math.max(fVar3.f312749a, fVar4.f312749a);
            list2.clear();
            fVar4.f312749a = 0;
            fVar2.f312749a = 0;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(final androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            final ArrayList arrayList;
            List<? extends androidx.compose.ui.layout.z0> list2 = list;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
            kotlin.jvm.internal.i1.f fVar2 = new kotlin.jvm.internal.i1.f();
            ArrayList arrayList5 = new ArrayList();
            kotlin.jvm.internal.i1.f fVar3 = new kotlin.jvm.internal.i1.f();
            kotlin.jvm.internal.i1.f fVar4 = new kotlin.jvm.internal.i1.f();
            int i10 = 0;
            long jB = androidx.compose.ui.unit.c.b(0, androidx.compose.ui.unit.b.p(j10), 0, 0, 13, null);
            float f10 = this.f22676a;
            ArrayList arrayList6 = arrayList4;
            float f11 = this.f22677b;
            int size = list2.size();
            while (i10 < size) {
                androidx.compose.ui.layout.i2 i2VarP0 = list2.get(i10).P0(jB);
                long j11 = jB;
                int i11 = size;
                int i12 = i10;
                float f12 = f10;
                if (!g(arrayList5, fVar3, c1Var, f12, j10, i2VarP0)) {
                    kotlin.jvm.internal.i1.f fVar5 = fVar4;
                    ArrayList arrayList7 = arrayList3;
                    ArrayList arrayList8 = arrayList5;
                    kotlin.jvm.internal.i1.f fVar6 = fVar;
                    ArrayList arrayList9 = arrayList6;
                    i(arrayList2, fVar2, c1Var, f11, arrayList8, arrayList7, fVar5, arrayList9, fVar6, fVar3);
                    arrayList5 = arrayList8;
                    arrayList3 = arrayList7;
                    fVar4 = fVar5;
                    arrayList6 = arrayList9;
                    fVar = fVar6;
                }
                if (!arrayList5.isEmpty()) {
                    fVar3.f312749a += c1Var.g6(f12);
                }
                arrayList5.add(i2VarP0);
                fVar3.f312749a += i2VarP0.h1();
                fVar4.f312749a = Math.max(fVar4.f312749a, i2VarP0.c1());
                i10 = i12 + 1;
                size = i11;
                f10 = f12;
                jB = j11;
                list2 = list;
            }
            if (arrayList5.isEmpty()) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                i(arrayList, fVar2, c1Var, this.f22677b, arrayList5, arrayList3, fVar4, arrayList6, fVar, fVar3);
                fVar2 = fVar2;
            }
            final int iP = androidx.compose.ui.unit.b.p(j10) != Integer.MAX_VALUE ? androidx.compose.ui.unit.b.p(j10) : Math.max(fVar.f312749a, androidx.compose.ui.unit.b.r(j10));
            int iMax = Math.max(fVar2.f312749a, androidx.compose.ui.unit.b.q(j10));
            final float f13 = this.f22676a;
            final ArrayList arrayList10 = arrayList6;
            return androidx.compose.ui.layout.c1.h6(c1Var, iP, iMax, null, new Function1() { // from class: androidx.compose.material.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.c.h(arrayList, c1Var, f13, iP, arrayList10, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogImpl$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,450:1\n113#2:451\n113#2:489\n70#3:452\n67#3,9:453\n77#3:493\n79#4,6:462\n86#4,3:477\n89#4,2:486\n93#4:492\n347#5,9:468\n356#5:488\n357#5,2:490\n4206#6,6:480\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogImpl$1\n*L\n152#1:451\n153#1:489\n152#1:452\n152#1:453,9\n152#1:493\n152#1:462,6\n152#1:477,3\n152#1:486,2\n152#1:492\n152#1:468,9\n152#1:488\n152#1:490,2\n152#1:480,6\n*E\n"})
    public static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22679b;

        public static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22680a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22681b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
                this.f22680a = function2;
                this.f22681b = function3;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                int i11 = 1 >> 2;
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1975681962, i10, -1, "androidx.compose.material.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:153)");
                }
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f22680a;
                if (function2 == null) {
                    c0Var.E(690531395);
                } else {
                    c0Var.E(-254819458);
                    function2.invoke(c0Var, 0);
                }
                c0Var.A();
                this.f22681b.invoke(c0Var, 0);
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
        public d(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f22678a = function2;
            this.f22679b = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-309297447, i10, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:151)");
            }
            float f10 = 8;
            androidx.compose.ui.a0 a0VarS = androidx.compose.foundation.layout.d5.s(androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(2));
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f22678a;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f22679b;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
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
            f.h(androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(12), androidx.compose.runtime.internal.w.e(-1975681962, true, new a(function2, function3), c0Var, 54), c0Var, 438);
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

    public static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f22683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f22686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f22687f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f22688g;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.ui.a0 a0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11) {
            this.f22682a = function2;
            this.f22683b = a0Var;
            this.f22684c = function3;
            this.f22685d = function4;
            this.f22686e = q3Var;
            this.f22687f = j10;
            this.f22688g = j11;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-488319269, i10, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:181)");
            }
            f.f(this.f22682a, this.f22683b, this.f22684c, this.f22685d, this.f22686e, this.f22687f, this.f22688g, c0Var, 0, 0);
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

    static {
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        float f10 = 24;
        f22663a = androidx.compose.foundation.layout.d5.v(aVar, androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f10), 0.0f, 10, null);
        f22664b = androidx.compose.foundation.layout.d5.v(aVar, androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(28), 2, null);
        f22665c = androidx.compose.ui.unit.a0.m(40);
        f22666d = androidx.compose.ui.unit.a0.m(36);
        f22667e = androidx.compose.ui.unit.a0.m(38);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void d(@NotNull final androidx.compose.foundation.layout.m0 m0Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1213983107);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(m0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function3) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1213983107, i11, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:247)");
            }
            androidx.compose.ui.a0 a0VarH = m0Var.h(androidx.compose.ui.a0.E, 1.0f, false);
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = a.f22668a;
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            if (function2 == null) {
                c0VarR.E(1809237538);
            } else {
                c0VarR.E(1809237539);
                androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(f22663a, "title");
                androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.a0 a0VarP = m0Var.p(a0VarB, aVar2.u());
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarP);
                Function0<androidx.compose.ui.node.g> function0A2 = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                function2.invoke(c0VarR, 0);
                c0VarR.o();
            }
            c0VarR.A();
            if (function3 == null) {
                c0VarR.E(1809370342);
            } else {
                c0VarR.E(1809370343);
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.layout.i0.b(f22664b, "text");
                androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.a0 a0VarP2 = m0Var.p(a0VarB2, aVar3.u());
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarP2);
                Function0<androidx.compose.ui.node.g> function0A3 = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                androidx.compose.runtime.c0 c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                function3.invoke(c0VarR, 0);
                c0VarR.o();
            }
            c0VarR.A();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.e(m0Var, function2, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(androidx.compose.foundation.layout.m0 m0Var, Function2 function2, Function2 function3, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d(m0Var, function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x0139  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void f(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i14;
        int i15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        int i16;
        androidx.compose.ui.graphics.q3 q3VarD;
        long jN;
        long jD;
        int i17;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j12;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        int i18;
        int i19;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1945098332);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        function6 = function4;
                        if (c0VarR.k0(function6)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            q3VarD = q3Var;
                            int i21 = c0VarR.D(q3VarD) ? 16384 : 8192;
                            i12 |= i21;
                        } else {
                            q3VarD = q3Var;
                        }
                        i12 |= i21;
                    } else {
                        q3VarD = q3Var;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jN = j10;
                            int i22 = c0VarR.L(jN) ? 131072 : 65536;
                            i12 |= i22;
                        } else {
                            jN = j10;
                        }
                        i12 |= i22;
                    } else {
                        jN = j10;
                    }
                    if ((i10 & 1572864) == 0) {
                        if ((i11 & 64) == 0) {
                            jD = j11;
                            int i23 = c0VarR.L(jD) ? 1048576 : 524288;
                            i12 |= i23;
                        } else {
                            jD = j11;
                        }
                        i12 |= i23;
                    } else {
                        jD = j11;
                    }
                    i17 = i12;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i17 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 16) != 0) {
                                i18 = i17 & (-57345);
                                q3VarD = x9.f25488a.b(c0VarR, 6).d();
                            } else {
                                i18 = i17;
                            }
                            if ((i11 & 32) != 0) {
                                jN = x9.f25488a.a(c0VarR, 6).n();
                                i19 = i18 & (-458753);
                            } else {
                                i19 = i18;
                            }
                            if ((i11 & 64) != 0) {
                                jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                                i19 &= -3670017;
                            }
                        } else {
                            c0VarR.u();
                            i19 = (i11 & 16) != 0 ? i17 & (-57345) : i17;
                            if ((i11 & 32) != 0) {
                                i19 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i19 &= -3670017;
                            }
                        }
                        long j14 = jD;
                        long j15 = jN;
                        androidx.compose.ui.graphics.q3 q3Var3 = q3VarD;
                        androidx.compose.ui.a0 a0Var4 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1945098332, i19, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:201)");
                        }
                        int i24 = ((i19 >> 3) & 14) | 1572864;
                        int i25 = i19 >> 9;
                        c0Var2 = c0VarR;
                        ah.e(a0Var4, q3Var3, j15, j14, null, 0.0f, androidx.compose.runtime.internal.w.e(802957984, true, new b(function5, function6, function2), c0VarR, 54), c0Var2, i24 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168), 48);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function7 = function5;
                        function8 = function6;
                        a0Var3 = a0Var4;
                        q3Var2 = q3Var3;
                        j12 = j15;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        function7 = function5;
                        function8 = function6;
                        q3Var2 = q3VarD;
                        j12 = jN;
                        j13 = jD;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.b
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f.g(function2, a0Var3, function7, function8, q3Var2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                function6 = function4;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarD = q3Var;
                        if (c0VarR.D(q3VarD)) {
                        }
                        i12 |= i21;
                    } else {
                        q3VarD = q3Var;
                    }
                    i12 |= i21;
                } else {
                    q3VarD = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jN = j10;
                        if (c0VarR.L(jN)) {
                        }
                        i12 |= i22;
                    } else {
                        jN = j10;
                    }
                    i12 |= i22;
                } else {
                    jN = j10;
                }
                if ((i10 & 1572864) == 0) {
                    if ((i11 & 64) == 0) {
                        jD = j11;
                        if (c0VarR.L(jD)) {
                        }
                        i12 |= i23;
                    } else {
                        jD = j11;
                    }
                    i12 |= i23;
                } else {
                    jD = j11;
                }
                i17 = i12;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i17 & (-57345);
                            q3VarD = x9.f25488a.b(c0VarR, 6).d();
                        } else {
                            i18 = i17;
                        }
                        if ((i11 & 32) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i19 = i18 & (-458753);
                        } else {
                            i19 = i18;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                            i19 &= -3670017;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i17 & (-57345);
                            q3VarD = x9.f25488a.b(c0VarR, 6).d();
                        } else {
                            i18 = i17;
                        }
                        if ((i11 & 32) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i19 = i18 & (-458753);
                        } else {
                            i19 = i18;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                            i19 &= -3670017;
                        }
                    }
                    long j16 = jD;
                    long j17 = jN;
                    androidx.compose.ui.graphics.q3 q3Var4 = q3VarD;
                    androidx.compose.ui.a0 a0Var5 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1945098332, i19, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:201)");
                    }
                    int i26 = ((i19 >> 3) & 14) | 1572864;
                    int i27 = i19 >> 9;
                    c0Var2 = c0VarR;
                    ah.e(a0Var5, q3Var4, j17, j16, null, 0.0f, androidx.compose.runtime.internal.w.e(802957984, true, new b(function5, function6, function2), c0VarR, 54), c0Var2, i26 | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | (i27 & 7168), 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function7 = function5;
                    function8 = function6;
                    a0Var3 = a0Var5;
                    q3Var2 = q3Var4;
                    j12 = j17;
                    j13 = j16;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function7 = function5;
                    function8 = function6;
                    q3Var2 = q3VarD;
                    j12 = jN;
                    j13 = jD;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f.g(function2, a0Var3, function7, function8, q3Var2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            function5 = function3;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function6 = function4;
                    if (c0VarR.k0(function6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarD = q3Var;
                        if (c0VarR.D(q3VarD)) {
                        }
                        i12 |= i21;
                    } else {
                        q3VarD = q3Var;
                    }
                    i12 |= i21;
                } else {
                    q3VarD = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jN = j10;
                        if (c0VarR.L(jN)) {
                        }
                        i12 |= i22;
                    } else {
                        jN = j10;
                    }
                    i12 |= i22;
                } else {
                    jN = j10;
                }
                if ((i10 & 1572864) == 0) {
                    if ((i11 & 64) == 0) {
                        jD = j11;
                        if (c0VarR.L(jD)) {
                        }
                        i12 |= i23;
                    } else {
                        jD = j11;
                    }
                    i12 |= i23;
                } else {
                    jD = j11;
                }
                i17 = i12;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i17 & (-57345);
                            q3VarD = x9.f25488a.b(c0VarR, 6).d();
                        } else {
                            i18 = i17;
                        }
                        if ((i11 & 32) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i19 = i18 & (-458753);
                        } else {
                            i19 = i18;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                            i19 &= -3670017;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i17 & (-57345);
                            q3VarD = x9.f25488a.b(c0VarR, 6).d();
                        } else {
                            i18 = i17;
                        }
                        if ((i11 & 32) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i19 = i18 & (-458753);
                        } else {
                            i19 = i18;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                            i19 &= -3670017;
                        }
                    }
                    long j18 = jD;
                    long j19 = jN;
                    androidx.compose.ui.graphics.q3 q3Var5 = q3VarD;
                    androidx.compose.ui.a0 a0Var6 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1945098332, i19, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:201)");
                    }
                    int i28 = ((i19 >> 3) & 14) | 1572864;
                    int i29 = i19 >> 9;
                    c0Var2 = c0VarR;
                    ah.e(a0Var6, q3Var5, j19, j18, null, 0.0f, androidx.compose.runtime.internal.w.e(802957984, true, new b(function5, function6, function2), c0VarR, 54), c0Var2, i28 | (i29 & com.planner5d.library.engine.input.f.b.B) | (i29 & 896) | (i29 & 7168), 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function7 = function5;
                    function8 = function6;
                    a0Var3 = a0Var6;
                    q3Var2 = q3Var5;
                    j12 = j19;
                    j13 = j18;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function7 = function5;
                    function8 = function6;
                    q3Var2 = q3VarD;
                    j12 = jN;
                    j13 = jD;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f.g(function2, a0Var3, function7, function8, q3Var2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function6 = function4;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarD = q3Var;
                    if (c0VarR.D(q3VarD)) {
                    }
                    i12 |= i21;
                } else {
                    q3VarD = q3Var;
                }
                i12 |= i21;
            } else {
                q3VarD = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jN = j10;
                    if (c0VarR.L(jN)) {
                    }
                    i12 |= i22;
                } else {
                    jN = j10;
                }
                i12 |= i22;
            } else {
                jN = j10;
            }
            if ((i10 & 1572864) == 0) {
                if ((i11 & 64) == 0) {
                    jD = j11;
                    if (c0VarR.L(jD)) {
                    }
                    i12 |= i23;
                } else {
                    jD = j11;
                }
                i12 |= i23;
            } else {
                jD = j11;
            }
            i17 = i12;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i17 & (-57345);
                        q3VarD = x9.f25488a.b(c0VarR, 6).d();
                    } else {
                        i18 = i17;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i19 = i18 & (-458753);
                    } else {
                        i19 = i18;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                        i19 &= -3670017;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i17 & (-57345);
                        q3VarD = x9.f25488a.b(c0VarR, 6).d();
                    } else {
                        i18 = i17;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i19 = i18 & (-458753);
                    } else {
                        i19 = i18;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                        i19 &= -3670017;
                    }
                }
                long j110 = jD;
                long j111 = jN;
                androidx.compose.ui.graphics.q3 q3Var6 = q3VarD;
                androidx.compose.ui.a0 a0Var7 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1945098332, i19, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:201)");
                }
                int i210 = ((i19 >> 3) & 14) | 1572864;
                int i211 = i19 >> 9;
                c0Var2 = c0VarR;
                ah.e(a0Var7, q3Var6, j111, j110, null, 0.0f, androidx.compose.runtime.internal.w.e(802957984, true, new b(function5, function6, function2), c0VarR, 54), c0Var2, i210 | (i211 & com.planner5d.library.engine.input.f.b.B) | (i211 & 896) | (i211 & 7168), 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function7 = function5;
                function8 = function6;
                a0Var3 = a0Var7;
                q3Var2 = q3Var6;
                j12 = j111;
                j13 = j110;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function7 = function5;
                function8 = function6;
                q3Var2 = q3VarD;
                j12 = jN;
                j13 = jD;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f.g(function2, a0Var3, function7, function8, q3Var2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function5 = function3;
                if (c0VarR.k0(function5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function6 = function4;
                    if (c0VarR.k0(function6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarD = q3Var;
                        if (c0VarR.D(q3VarD)) {
                        }
                        i12 |= i21;
                    } else {
                        q3VarD = q3Var;
                    }
                    i12 |= i21;
                } else {
                    q3VarD = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jN = j10;
                        if (c0VarR.L(jN)) {
                        }
                        i12 |= i22;
                    } else {
                        jN = j10;
                    }
                    i12 |= i22;
                } else {
                    jN = j10;
                }
                if ((i10 & 1572864) == 0) {
                    if ((i11 & 64) == 0) {
                        jD = j11;
                        if (c0VarR.L(jD)) {
                        }
                        i12 |= i23;
                    } else {
                        jD = j11;
                    }
                    i12 |= i23;
                } else {
                    jD = j11;
                }
                i17 = i12;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i17 & (-57345);
                            q3VarD = x9.f25488a.b(c0VarR, 6).d();
                        } else {
                            i18 = i17;
                        }
                        if ((i11 & 32) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i19 = i18 & (-458753);
                        } else {
                            i19 = i18;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                            i19 &= -3670017;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i17 & (-57345);
                            q3VarD = x9.f25488a.b(c0VarR, 6).d();
                        } else {
                            i18 = i17;
                        }
                        if ((i11 & 32) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i19 = i18 & (-458753);
                        } else {
                            i19 = i18;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                            i19 &= -3670017;
                        }
                    }
                    long j112 = jD;
                    long j113 = jN;
                    androidx.compose.ui.graphics.q3 q3Var7 = q3VarD;
                    androidx.compose.ui.a0 a0Var8 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1945098332, i19, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:201)");
                    }
                    int i212 = ((i19 >> 3) & 14) | 1572864;
                    int i213 = i19 >> 9;
                    c0Var2 = c0VarR;
                    ah.e(a0Var8, q3Var7, j113, j112, null, 0.0f, androidx.compose.runtime.internal.w.e(802957984, true, new b(function5, function6, function2), c0VarR, 54), c0Var2, i212 | (i213 & com.planner5d.library.engine.input.f.b.B) | (i213 & 896) | (i213 & 7168), 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function7 = function5;
                    function8 = function6;
                    a0Var3 = a0Var8;
                    q3Var2 = q3Var7;
                    j12 = j113;
                    j13 = j112;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function7 = function5;
                    function8 = function6;
                    q3Var2 = q3VarD;
                    j12 = jN;
                    j13 = jD;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f.g(function2, a0Var3, function7, function8, q3Var2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function6 = function4;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarD = q3Var;
                    if (c0VarR.D(q3VarD)) {
                    }
                    i12 |= i21;
                } else {
                    q3VarD = q3Var;
                }
                i12 |= i21;
            } else {
                q3VarD = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jN = j10;
                    if (c0VarR.L(jN)) {
                    }
                    i12 |= i22;
                } else {
                    jN = j10;
                }
                i12 |= i22;
            } else {
                jN = j10;
            }
            if ((i10 & 1572864) == 0) {
                if ((i11 & 64) == 0) {
                    jD = j11;
                    if (c0VarR.L(jD)) {
                    }
                    i12 |= i23;
                } else {
                    jD = j11;
                }
                i12 |= i23;
            } else {
                jD = j11;
            }
            i17 = i12;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i17 & (-57345);
                        q3VarD = x9.f25488a.b(c0VarR, 6).d();
                    } else {
                        i18 = i17;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i19 = i18 & (-458753);
                    } else {
                        i19 = i18;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                        i19 &= -3670017;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i17 & (-57345);
                        q3VarD = x9.f25488a.b(c0VarR, 6).d();
                    } else {
                        i18 = i17;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i19 = i18 & (-458753);
                    } else {
                        i19 = i18;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                        i19 &= -3670017;
                    }
                }
                long j114 = jD;
                long j115 = jN;
                androidx.compose.ui.graphics.q3 q3Var8 = q3VarD;
                androidx.compose.ui.a0 a0Var9 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1945098332, i19, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:201)");
                }
                int i214 = ((i19 >> 3) & 14) | 1572864;
                int i215 = i19 >> 9;
                c0Var2 = c0VarR;
                ah.e(a0Var9, q3Var8, j115, j114, null, 0.0f, androidx.compose.runtime.internal.w.e(802957984, true, new b(function5, function6, function2), c0VarR, 54), c0Var2, i214 | (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 896) | (i215 & 7168), 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function7 = function5;
                function8 = function6;
                a0Var3 = a0Var9;
                q3Var2 = q3Var8;
                j12 = j115;
                j13 = j114;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function7 = function5;
                function8 = function6;
                q3Var2 = q3VarD;
                j12 = jN;
                j13 = jD;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f.g(function2, a0Var3, function7, function8, q3Var2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        function5 = function3;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                function6 = function4;
                if (c0VarR.k0(function6)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarD = q3Var;
                    if (c0VarR.D(q3VarD)) {
                    }
                    i12 |= i21;
                } else {
                    q3VarD = q3Var;
                }
                i12 |= i21;
            } else {
                q3VarD = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jN = j10;
                    if (c0VarR.L(jN)) {
                    }
                    i12 |= i22;
                } else {
                    jN = j10;
                }
                i12 |= i22;
            } else {
                jN = j10;
            }
            if ((i10 & 1572864) == 0) {
                if ((i11 & 64) == 0) {
                    jD = j11;
                    if (c0VarR.L(jD)) {
                    }
                    i12 |= i23;
                } else {
                    jD = j11;
                }
                i12 |= i23;
            } else {
                jD = j11;
            }
            i17 = i12;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i17 & (-57345);
                        q3VarD = x9.f25488a.b(c0VarR, 6).d();
                    } else {
                        i18 = i17;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i19 = i18 & (-458753);
                    } else {
                        i19 = i18;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                        i19 &= -3670017;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i17 & (-57345);
                        q3VarD = x9.f25488a.b(c0VarR, 6).d();
                    } else {
                        i18 = i17;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i19 = i18 & (-458753);
                    } else {
                        i19 = i18;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                        i19 &= -3670017;
                    }
                }
                long j116 = jD;
                long j117 = jN;
                androidx.compose.ui.graphics.q3 q3Var9 = q3VarD;
                androidx.compose.ui.a0 a0Var10 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1945098332, i19, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:201)");
                }
                int i216 = ((i19 >> 3) & 14) | 1572864;
                int i217 = i19 >> 9;
                c0Var2 = c0VarR;
                ah.e(a0Var10, q3Var9, j117, j116, null, 0.0f, androidx.compose.runtime.internal.w.e(802957984, true, new b(function5, function6, function2), c0VarR, 54), c0Var2, i216 | (i217 & com.planner5d.library.engine.input.f.b.B) | (i217 & 896) | (i217 & 7168), 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function7 = function5;
                function8 = function6;
                a0Var3 = a0Var10;
                q3Var2 = q3Var9;
                j12 = j117;
                j13 = j116;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function7 = function5;
                function8 = function6;
                q3Var2 = q3VarD;
                j12 = jN;
                j13 = jD;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f.g(function2, a0Var3, function7, function8, q3Var2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function6 = function4;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3VarD = q3Var;
                if (c0VarR.D(q3VarD)) {
                }
                i12 |= i21;
            } else {
                q3VarD = q3Var;
            }
            i12 |= i21;
        } else {
            q3VarD = q3Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                jN = j10;
                if (c0VarR.L(jN)) {
                }
                i12 |= i22;
            } else {
                jN = j10;
            }
            i12 |= i22;
        } else {
            jN = j10;
        }
        if ((i10 & 1572864) == 0) {
            if ((i11 & 64) == 0) {
                jD = j11;
                if (c0VarR.L(jD)) {
                }
                i12 |= i23;
            } else {
                jD = j11;
            }
            i12 |= i23;
        } else {
            jD = j11;
        }
        i17 = i12;
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i17 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    function6 = null;
                }
                if ((i11 & 16) != 0) {
                    i18 = i17 & (-57345);
                    q3VarD = x9.f25488a.b(c0VarR, 6).d();
                } else {
                    i18 = i17;
                }
                if ((i11 & 32) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i19 = i18 & (-458753);
                } else {
                    i19 = i18;
                }
                if ((i11 & 64) != 0) {
                    jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                    i19 &= -3670017;
                }
            } else {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    function6 = null;
                }
                if ((i11 & 16) != 0) {
                    i18 = i17 & (-57345);
                    q3VarD = x9.f25488a.b(c0VarR, 6).d();
                } else {
                    i18 = i17;
                }
                if ((i11 & 32) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i19 = i18 & (-458753);
                } else {
                    i19 = i18;
                }
                if ((i11 & 64) != 0) {
                    jD = n4.d(jN, c0VarR, (i19 >> 15) & 14);
                    i19 &= -3670017;
                }
            }
            long j118 = jD;
            long j119 = jN;
            androidx.compose.ui.graphics.q3 q3Var10 = q3VarD;
            androidx.compose.ui.a0 a0Var11 = a0Var2;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1945098332, i19, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:201)");
            }
            int i218 = ((i19 >> 3) & 14) | 1572864;
            int i219 = i19 >> 9;
            c0Var2 = c0VarR;
            ah.e(a0Var11, q3Var10, j119, j118, null, 0.0f, androidx.compose.runtime.internal.w.e(802957984, true, new b(function5, function6, function2), c0VarR, 54), c0Var2, i218 | (i219 & com.planner5d.library.engine.input.f.b.B) | (i219 & 896) | (i219 & 7168), 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function7 = function5;
            function8 = function6;
            a0Var3 = a0Var11;
            q3Var2 = q3Var10;
            j12 = j119;
            j13 = j118;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            function7 = function5;
            function8 = function6;
            q3Var2 = q3VarD;
            j12 = jN;
            j13 = jD;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.g(function2, a0Var3, function7, function8, q3Var2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function2 function2, androidx.compose.ui.a0 a0Var, Function2 function3, Function2 function4, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(function2, a0Var, function3, function4, q3Var, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void h(final float f10, final float f11, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1271829505);
        int i12 = 2 >> 4;
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.I(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.I(f11) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1271829505, i11, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:349)");
            }
            boolean z10 = ((i11 & 14) == 4) | ((i11 & com.planner5d.library.engine.input.f.b.B) == 32);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new c(f10, f11);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            int i13 = (i11 >> 6) & 14;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            int i14 = ((i13 << 6) & 896) | 6;
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
            function2.invoke(c0VarR, Integer.valueOf((i14 >> 6) & 14));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.i(f10, f11, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(float f10, float f11, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        h(f10, f11, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void j(@NotNull Function0<Unit> function0, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @NotNull androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @NotNull androidx.compose.ui.window.k kVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11 = i10 >> 3;
        z.d(function0, androidx.compose.runtime.internal.w.e(-309297447, true, new d(function3, function2), c0Var, 54), a0Var, function4, function5, q3Var, j10, j11, kVar, c0Var, (i10 & 14) | 48 | (i10 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (i11 & 234881024), 0);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void k(@NotNull Function0<Unit> function0, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @NotNull androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @NotNull androidx.compose.ui.window.k kVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.ui.window.b.a(function0, kVar, androidx.compose.runtime.internal.w.e(-488319269, true, new e(function2, a0Var, function3, function4, q3Var, j10, j11), c0Var, 54), c0Var, (i10 & 14) | androidx.media3.exoplayer.a5.S0 | ((i10 >> 21) & com.planner5d.library.engine.input.f.b.B), 0);
    }
}
