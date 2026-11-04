package androidx.compose.material;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,381:1\n113#2:382\n113#2:383\n113#2:384\n113#2:706\n113#2:707\n113#2:708\n113#2:709\n113#2:710\n113#2:711\n113#2:712\n113#2:713\n113#2:714\n1282#3,6:385\n1282#3,6:588\n79#4:391\n77#4,8:392\n86#4,3:409\n89#4,2:418\n79#4,6:431\n86#4,3:446\n89#4,2:455\n93#4:460\n93#4:464\n79#4,6:475\n86#4,3:490\n89#4,2:499\n79#4,6:512\n86#4,3:527\n89#4,2:536\n93#4:541\n79#4,6:553\n86#4,3:568\n89#4,2:577\n93#4:582\n93#4:586\n79#4,6:594\n86#4,3:609\n89#4,2:618\n79#4,6:631\n86#4,3:646\n89#4,2:655\n93#4:660\n79#4,6:672\n86#4,3:687\n89#4,2:696\n93#4:701\n93#4:705\n347#5,9:400\n356#5:420\n347#5,9:437\n356#5,3:457\n357#5,2:462\n347#5,9:481\n356#5:501\n347#5,9:518\n356#5,3:538\n347#5,9:559\n356#5,3:579\n357#5,2:584\n347#5,9:600\n356#5:620\n347#5,9:637\n356#5,3:657\n347#5,9:678\n356#5,3:698\n357#5,2:703\n4206#6,6:412\n4206#6,6:449\n4206#6,6:493\n4206#6,6:530\n4206#6,6:571\n4206#6,6:612\n4206#6,6:649\n4206#6,6:690\n70#7:421\n67#7,9:422\n77#7:461\n70#7:502\n67#7,9:503\n77#7:542\n70#7:543\n67#7,9:544\n77#7:583\n70#7:621\n67#7,9:622\n77#7:661\n70#7:662\n67#7,9:663\n77#7:702\n87#8:465\n84#8,9:466\n94#8:587\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n92#1:382\n165#1:383\n181#1:384\n372#1:706\n373#1:707\n374#1:708\n375#1:709\n376#1:710\n377#1:711\n378#1:712\n379#1:713\n380#1:714\n244#1:385,6\n320#1:588,6\n237#1:391\n237#1:392,8\n237#1:409,3\n237#1:418,2\n238#1:431,6\n238#1:446,3\n238#1:455,2\n238#1:460\n237#1:464\n291#1:475,6\n291#1:490,3\n291#1:499,2\n300#1:512,6\n300#1:527,3\n300#1:536,2\n300#1:541\n306#1:553,6\n306#1:568,3\n306#1:577,2\n306#1:582\n291#1:586\n314#1:594,6\n314#1:609,3\n314#1:618,2\n316#1:631,6\n316#1:646,3\n316#1:655,2\n316#1:660\n317#1:672,6\n317#1:687,3\n317#1:696,2\n317#1:701\n314#1:705\n237#1:400,9\n237#1:420\n238#1:437,9\n238#1:457,3\n237#1:462,2\n291#1:481,9\n291#1:501\n300#1:518,9\n300#1:538,3\n306#1:559,9\n306#1:579,3\n291#1:584,2\n314#1:600,9\n314#1:620\n316#1:637,9\n316#1:657,3\n317#1:678,9\n317#1:698,3\n314#1:703,2\n237#1:412,6\n238#1:449,6\n291#1:493,6\n300#1:530,6\n306#1:571,6\n314#1:612,6\n316#1:649,6\n317#1:690,6\n238#1:421\n238#1:422,9\n238#1:461\n300#1:502\n300#1:503,9\n300#1:542\n306#1:543\n306#1:544,9\n306#1:583\n316#1:621\n316#1:622,9\n316#1:661\n317#1:662\n317#1:663,9\n317#1:702\n291#1:465\n291#1:466,9\n291#1:587\n*E\n"})
public final class pg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f24206c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f24209f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f24204a = androidx.compose.ui.unit.h.r(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24205b = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f24207d = androidx.compose.ui.unit.h.r(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f24208e = androidx.compose.ui.unit.h.r(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f24210g = androidx.compose.ui.unit.h.r(12);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f24211h = androidx.compose.ui.unit.h.r(48);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f24212i = androidx.compose.ui.unit.h.r(68);

    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,381:1\n563#2,2:382\n34#2,6:384\n565#2:390\n563#2,2:391\n34#2,6:393\n565#2:399\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1\n*L\n322#1:382,2\n322#1:384,6\n322#1:390\n328#1:391,2\n328#1:393,6\n328#1:399\n*E\n"})
    static final class a implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24214b;

        a(String str, String str2) {
            this.f24213a = str;
            this.f24214b = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2 i2Var2, int i11, int i12, androidx.compose.ui.layout.i2.a aVar) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, i10, 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i11, i12, 0.0f, 4, null);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            int iG6;
            int iMax;
            String str = this.f24213a;
            int size = list.size();
            int iC1 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.z0 z0Var = list.get(i10);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), str)) {
                    long j11 = j10;
                    final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j11);
                    int iU = kotlin.ranges.r.u((androidx.compose.ui.unit.b.p(j11) - i2VarP0.h1()) - c1Var.g6(pg.f24209f), androidx.compose.ui.unit.b.r(j11));
                    String str2 = this.f24214b;
                    int size2 = list.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        androidx.compose.ui.layout.z0 z0Var2 = list.get(i11);
                        if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), str2)) {
                            final androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(androidx.compose.ui.unit.b.d(j11, 0, iU, 0, 0, 9, null));
                            int iM = i2VarP1.M(androidx.compose.ui.layout.b.a());
                            int iM2 = i2VarP1.M(androidx.compose.ui.layout.b.b());
                            boolean z10 = true;
                            boolean z11 = (iM == Integer.MIN_VALUE || iM2 == Integer.MIN_VALUE) ? false : true;
                            if (iM != iM2 && z11) {
                                z10 = false;
                            }
                            final int iP = androidx.compose.ui.unit.b.p(j10) - i2VarP0.h1();
                            if (z10) {
                                iMax = Math.max(c1Var.g6(pg.f24211h), i2VarP0.c1());
                                iG6 = (iMax - i2VarP1.c1()) / 2;
                                int iM3 = i2VarP0.M(androidx.compose.ui.layout.b.a());
                                if (iM3 != Integer.MIN_VALUE) {
                                    iC1 = (iM + iG6) - iM3;
                                }
                            } else {
                                iG6 = c1Var.g6(pg.f24204a) - iM;
                                iMax = Math.max(c1Var.g6(pg.f24212i), i2VarP1.c1() + iG6);
                                iC1 = (iMax - i2VarP0.c1()) / 2;
                            }
                            final int i12 = iC1;
                            final int i13 = iG6;
                            return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), iMax, null, new Function1() { // from class: androidx.compose.material.og
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pg.a.g(i2VarP1, i13, i2VarP0, iP, i12, (androidx.compose.ui.layout.i2.a) obj);
                                }
                            }, 4, null);
                        }
                        i11++;
                        c1Var = c1Var;
                        j11 = j10;
                    }
                    androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                    throw new kotlin.a0();
                }
            }
            androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
            throw new kotlin.a0();
        }
    }

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24217c;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24218a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24219b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f24220c;

            /* JADX INFO: renamed from: androidx.compose.material.pg$b$a$a, reason: collision with other inner class name */
            static final class C0188a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24221a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24222b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f24223c;

                /* JADX WARN: Multi-variable type inference failed */
                C0188a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z10) {
                    this.f24221a = function2;
                    this.f24222b = function3;
                    this.f24223c = z10;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        int i11 = 3 | (-1);
                        androidx.compose.runtime.m0.A0(1789628237, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:104)");
                    }
                    if (this.f24221a == null) {
                        c0Var.E(1845819398);
                        pg.n(this.f24222b, c0Var, 0);
                        c0Var.A();
                    } else if (this.f24223c) {
                        c0Var.E(1845821491);
                        pg.f(this.f24222b, this.f24221a, c0Var, 0);
                        c0Var.A();
                    } else {
                        c0Var.E(1845823628);
                        pg.h(this.f24222b, this.f24221a, c0Var, 0);
                        c0Var.A();
                    }
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
            a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z10) {
                this.f24218a = function2;
                this.f24219b = function3;
                this.f24220c = z10;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1236486620, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:102)");
                }
                wk.l(x9.f25488a.c(c0Var, 6).d(), androidx.compose.runtime.internal.w.e(1789628237, true, new C0188a(this.f24218a, this.f24219b, this.f24220c), c0Var, 54), c0Var, 48);
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
        b(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z10) {
            this.f24215a = function2;
            this.f24216b = function3;
            this.f24217c = z10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1429068516, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:101)");
            }
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(u4.f25148a.c(c0Var, 6))), androidx.compose.runtime.internal.w.e(1236486620, true, new a(this.f24215a, this.f24216b, this.f24217c), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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
        final /* synthetic */ xf f24224a;

        c(xf xfVar) {
            this.f24224a = xfVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-261845785, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:181)");
            }
            wk.o(this.f24224a.Q(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 131070);
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

    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$Snackbar$actionComposable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,381:1\n1282#2,6:382\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$Snackbar$actionComposable$1\n*L\n173#1:382,6\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f24225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xf f24226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24227c;

        static final class a implements pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f24228a;

            a(String str) {
                this.f24228a = str;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-929149933, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:173)");
                }
                wk.o(this.f24228a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 131070);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
                c(x5Var, c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        d(long j10, xf xfVar, String str) {
            this.f24225a = j10;
            this.f24226b = xfVar;
            this.f24227c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(xf xfVar) {
            xfVar.R();
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
                androidx.compose.runtime.m0.A0(1843479216, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:170)");
            }
            o3 o3VarM = p3.f24148a.m(0L, this.f24225a, 0L, c0Var, 3072, 5);
            boolean zK0 = c0Var.k0(this.f24226b);
            final xf xfVar = this.f24226b;
            Object objI0 = c0Var.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material.qg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return pg.d.f(xfVar);
                    }
                };
                c0Var.Y(objI0);
            }
            t3.h((Function0) objI0, null, false, null, null, null, null, o3VarM, null, androidx.compose.runtime.internal.w.e(-929149933, true, new a(this.f24227c), c0Var, 54), c0Var, 805306368, 382);
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

    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$TextOnlySnackbar$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,381:1\n34#2,6:382\n34#2,6:388\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$TextOnlySnackbar$2$1\n*L\n250#1:382,6\n281#1:388,6\n*E\n"})
    static final class e implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f24229a = new e();

        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(ArrayList arrayList, int i10, androidx.compose.ui.layout.i2.a aVar) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) arrayList.get(i11);
                int i12 = 4 | 4;
                androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, (i10 - i2Var.c1()) / 2, 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z10 = false;
            int iM = Integer.MIN_VALUE;
            int iM2 = Integer.MIN_VALUE;
            int iMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.i2 i2VarP0 = list.get(i10).P0(j10);
                arrayList.add(i2VarP0);
                if (i2VarP0.M(androidx.compose.ui.layout.b.a()) != Integer.MIN_VALUE && (iM == Integer.MIN_VALUE || i2VarP0.M(androidx.compose.ui.layout.b.a()) < iM)) {
                    iM = i2VarP0.M(androidx.compose.ui.layout.b.a());
                }
                if (i2VarP0.M(androidx.compose.ui.layout.b.b()) != Integer.MIN_VALUE && (iM2 == Integer.MIN_VALUE || i2VarP0.M(androidx.compose.ui.layout.b.b()) > iM2)) {
                    iM2 = i2VarP0.M(androidx.compose.ui.layout.b.b());
                }
                iMax = Math.max(iMax, i2VarP0.c1());
            }
            if (iM != Integer.MIN_VALUE && iM2 != Integer.MIN_VALUE) {
                z10 = true;
            }
            final int iMax2 = Math.max(c1Var.g6((iM == iM2 || !z10) ? pg.f24211h : pg.f24212i), iMax);
            return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), iMax2, null, new Function1() { // from class: androidx.compose.material.rg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return pg.e.g(arrayList, iMax2, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    static {
        float f10 = 8;
        f24206c = androidx.compose.ui.unit.h.r(f10);
        f24209f = androidx.compose.ui.unit.h.r(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void f(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1534293206);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1534293206, i11, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:289)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(aVar, 0.0f, 1, null);
            float f10 = f24205b;
            float f11 = f24206c;
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(a0VarH, f10, 0.0f, f11, f24207d, 2, null);
            androidx.compose.foundation.layout.q.m mVarY = androidx.compose.foundation.layout.q.f16330a.y();
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0VarR, 0);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            androidx.compose.ui.a0 a0VarV2 = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.c.j(aVar, f24204a, f24210g), 0.0f, 0.0f, f11, 0.0f, 11, null);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
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
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0VarR, Integer.valueOf(i11 & 14));
            c0VarR.o();
            androidx.compose.ui.a0 a0VarP = n0Var.p(aVar, aVar2.s());
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarP);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
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
            androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar3.f());
            function3.invoke(c0VarR, Integer.valueOf((i11 >> 3) & 14));
            c0VarR.o();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.ng
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return pg.g(function2, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function2 function2, Function2 function3, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        f(function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void h(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1302703572);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1302703572, i11, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:310)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(aVar, f24205b, 0.0f, f24206c, 0.0f, 10, null);
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a(com.facebook.internal.w0.f100156c1, "text");
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
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
            androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.layout.i0.b(aVar, "text"), 0.0f, f24208e, 1, null);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarT);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
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
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0VarR, Integer.valueOf(i11 & 14));
            c0VarR.o();
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar, com.facebook.internal.w0.f100156c1);
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar2.a();
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
            androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar2.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar2.f());
            function3.invoke(c0VarR, Integer.valueOf((i11 >> 3) & 14));
            c0VarR.o();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.mg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return pg.i(function2, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function2 function2, Function2 function3, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        h(function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x018a  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:141:0x0219  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void j(@Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3Var2;
        long jA;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final long j12;
        final long j13;
        final float f11;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        androidx.compose.ui.graphics.q3 q3VarE;
        long jN;
        long j14;
        float fR;
        androidx.compose.ui.graphics.q3 q3Var4;
        long j15;
        int i19;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-662779944);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 48) == 0) {
                function4 = function2;
                i12 |= c0VarR.k0(function4) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        q3Var2 = q3Var;
                        int i23 = c0VarR.D(q3Var2) ? 2048 : 1024;
                        i12 |= i23;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        jA = j10;
                        int i24 = c0VarR.L(jA) ? 16384 : 8192;
                        i12 |= i24;
                    } else {
                        jA = j10;
                    }
                    i12 |= i24;
                } else {
                    jA = j10;
                }
                if ((196608 & i10) != 0) {
                    if ((i11 & 32) == 0 || !c0VarR.L(j11)) {
                        i20 = 65536;
                    } else {
                        i20 = 131072;
                    }
                    i12 |= i20;
                }
                i15 = i11 & 64;
                i16 = 1572864;
                if (i15 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f10)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function3)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((4793491 & i12) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        }
                        if ((i11 & 8) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i12 &= -7169;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jA = yf.f25708a.a(c0VarR, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i12 = (-458753) & i12;
                        } else {
                            jN = j11;
                        }
                        if (i15 != 0) {
                            j14 = jA;
                            fR = androidx.compose.ui.unit.h.r(6);
                        } else {
                            j14 = jA;
                            fR = f10;
                        }
                        q3Var4 = q3VarE;
                        j15 = jN;
                        i19 = -662779944;
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        j15 = j11;
                        fR = f10;
                        function6 = function4;
                        i16 = 1572864;
                        i19 = -662779944;
                        j14 = jA;
                        a0Var3 = a0Var;
                        q3Var4 = q3Var2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i19, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:93)");
                    }
                    int i25 = i12 >> 6;
                    c0Var2 = c0VarR;
                    ah.e(a0Var3, q3Var4, j14, j15, null, fR, androidx.compose.runtime.internal.w.e(-1429068516, true, new b(function6, function3, z11), c0VarR, 54), c0Var2, i16 | (i12 & 14) | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | ((i12 >> 3) & 458752), 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function6;
                    z13 = z11;
                    a0Var2 = a0Var3;
                    q3Var3 = q3Var4;
                    j12 = j14;
                    j13 = j15;
                    f11 = fR;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    function5 = function4;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    j12 = jA;
                    j13 = j11;
                    f11 = f10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.lg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pg.l(a0Var2, function5, z13, q3Var3, j12, j13, f11, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i23;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i23;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jA = j10;
                    if (c0VarR.L(jA)) {
                    }
                    i12 |= i24;
                } else {
                    jA = j10;
                }
                i12 |= i24;
            } else {
                jA = j10;
            }
            if ((196608 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i15 = i11 & 64;
            i16 = 1572864;
            if (i15 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f10)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function3)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((4793491 & i12) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i12 &= -7169;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jA = yf.f25708a.a(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 = (-458753) & i12;
                    } else {
                        jN = j11;
                    }
                    if (i15 != 0) {
                        j14 = jA;
                        fR = androidx.compose.ui.unit.h.r(6);
                    } else {
                        j14 = jA;
                        fR = f10;
                    }
                    q3Var4 = q3VarE;
                    j15 = jN;
                    i19 = -662779944;
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i12 &= -7169;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jA = yf.f25708a.a(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 = (-458753) & i12;
                    } else {
                        jN = j11;
                    }
                    if (i15 != 0) {
                        j14 = jA;
                        fR = androidx.compose.ui.unit.h.r(6);
                    } else {
                        j14 = jA;
                        fR = f10;
                    }
                    q3Var4 = q3VarE;
                    j15 = jN;
                    i19 = -662779944;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i19, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:93)");
                }
                int i26 = i12 >> 6;
                c0Var2 = c0VarR;
                ah.e(a0Var3, q3Var4, j14, j15, null, fR, androidx.compose.runtime.internal.w.e(-1429068516, true, new b(function6, function3, z11), c0VarR, 54), c0Var2, i16 | (i12 & 14) | (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 896) | (i26 & 7168) | ((i12 >> 3) & 458752), 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function5 = function6;
                z13 = z11;
                a0Var2 = a0Var3;
                q3Var3 = q3Var4;
                j12 = j14;
                j13 = j15;
                f11 = fR;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                function5 = function4;
                z13 = z11;
                q3Var3 = q3Var2;
                j12 = jA;
                j13 = j11;
                f11 = f10;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.lg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pg.l(a0Var2, function5, z13, q3Var3, j12, j13, f11, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function4 = function2;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i23;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i23;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jA = j10;
                    if (c0VarR.L(jA)) {
                    }
                    i12 |= i24;
                } else {
                    jA = j10;
                }
                i12 |= i24;
            } else {
                jA = j10;
            }
            if ((196608 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i15 = i11 & 64;
            i16 = 1572864;
            if (i15 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f10)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function3)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((4793491 & i12) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i12 &= -7169;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jA = yf.f25708a.a(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 = (-458753) & i12;
                    } else {
                        jN = j11;
                    }
                    if (i15 != 0) {
                        j14 = jA;
                        fR = androidx.compose.ui.unit.h.r(6);
                    } else {
                        j14 = jA;
                        fR = f10;
                    }
                    q3Var4 = q3VarE;
                    j15 = jN;
                    i19 = -662779944;
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i12 &= -7169;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jA = yf.f25708a.a(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 = (-458753) & i12;
                    } else {
                        jN = j11;
                    }
                    if (i15 != 0) {
                        j14 = jA;
                        fR = androidx.compose.ui.unit.h.r(6);
                    } else {
                        j14 = jA;
                        fR = f10;
                    }
                    q3Var4 = q3VarE;
                    j15 = jN;
                    i19 = -662779944;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i19, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:93)");
                }
                int i27 = i12 >> 6;
                c0Var2 = c0VarR;
                ah.e(a0Var3, q3Var4, j14, j15, null, fR, androidx.compose.runtime.internal.w.e(-1429068516, true, new b(function6, function3, z11), c0VarR, 54), c0Var2, i16 | (i12 & 14) | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | (i27 & 7168) | ((i12 >> 3) & 458752), 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function5 = function6;
                z13 = z11;
                a0Var2 = a0Var3;
                q3Var3 = q3Var4;
                j12 = j14;
                j13 = j15;
                f11 = fR;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                function5 = function4;
                z13 = z11;
                q3Var3 = q3Var2;
                j12 = jA;
                j13 = j11;
                f11 = f10;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.lg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pg.l(a0Var2, function5, z13, q3Var3, j12, j13, f11, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i23;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i23;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                jA = j10;
                if (c0VarR.L(jA)) {
                }
                i12 |= i24;
            } else {
                jA = j10;
            }
            i12 |= i24;
        } else {
            jA = j10;
        }
        if ((196608 & i10) != 0) {
            if ((i11 & 32) == 0) {
                i20 = 65536;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        i15 = i11 & 64;
        i16 = 1572864;
        if (i15 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.I(f10)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.k0(function3)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((4793491 & i12) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i22 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 8) != 0) {
                    q3VarE = x9.f25488a.b(c0VarR, 6).e();
                    i12 &= -7169;
                } else {
                    q3VarE = q3Var2;
                }
                if ((i11 & 16) != 0) {
                    jA = yf.f25708a.a(c0VarR, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i12 = (-458753) & i12;
                } else {
                    jN = j11;
                }
                if (i15 != 0) {
                    j14 = jA;
                    fR = androidx.compose.ui.unit.h.r(6);
                } else {
                    j14 = jA;
                    fR = f10;
                }
                q3Var4 = q3VarE;
                j15 = jN;
                i19 = -662779944;
            } else {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i22 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 8) != 0) {
                    q3VarE = x9.f25488a.b(c0VarR, 6).e();
                    i12 &= -7169;
                } else {
                    q3VarE = q3Var2;
                }
                if ((i11 & 16) != 0) {
                    jA = yf.f25708a.a(c0VarR, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i12 = (-458753) & i12;
                } else {
                    jN = j11;
                }
                if (i15 != 0) {
                    j14 = jA;
                    fR = androidx.compose.ui.unit.h.r(6);
                } else {
                    j14 = jA;
                    fR = f10;
                }
                q3Var4 = q3VarE;
                j15 = jN;
                i19 = -662779944;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i19, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:93)");
            }
            int i28 = i12 >> 6;
            c0Var2 = c0VarR;
            ah.e(a0Var3, q3Var4, j14, j15, null, fR, androidx.compose.runtime.internal.w.e(-1429068516, true, new b(function6, function3, z11), c0VarR, 54), c0Var2, i16 | (i12 & 14) | (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 896) | (i28 & 7168) | ((i12 >> 3) & 458752), 16);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function5 = function6;
            z13 = z11;
            a0Var2 = a0Var3;
            q3Var3 = q3Var4;
            j12 = j14;
            j13 = j15;
            f11 = fR;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var2 = a0Var;
            function5 = function4;
            z13 = z11;
            q3Var3 = q3Var2;
            j12 = jA;
            j13 = j11;
            f11 = f10;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.lg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return pg.l(a0Var2, function5, z13, q3Var3, j12, j13, f11, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x015a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:123:0x0172  */
    /* JADX WARN: Code duplicated, block: B:126:0x017e  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0199  */
    /* JADX WARN: Code duplicated, block: B:132:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:145:0x0239  */
    /* JADX WARN: Code duplicated, block: B:147:0x0249  */
    /* JADX WARN: Code duplicated, block: B:150:0x025f  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void k(@NotNull final xf xfVar, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarE;
        long jA;
        long jN;
        int i15;
        int i16;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final float f11;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j13;
        final long j14;
        final long j15;
        androidx.compose.runtime.s5 s5VarT;
        long jB;
        float fR;
        long j16;
        long j17;
        boolean z14;
        androidx.compose.ui.graphics.q3 q3Var3;
        long j18;
        String strS;
        xf xfVar2;
        androidx.compose.runtime.internal.c cVarE;
        int i17;
        int i18;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(258660814);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(xfVar) : c0VarR.k0(xfVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        q3VarE = q3Var;
                        int i20 = c0VarR.D(q3VarE) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        q3VarE = q3Var;
                    }
                    i12 |= i20;
                } else {
                    q3VarE = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        jA = j10;
                        int i21 = c0VarR.L(jA) ? 16384 : 8192;
                        i12 |= i21;
                    } else {
                        jA = j10;
                    }
                    i12 |= i21;
                } else {
                    jA = j10;
                }
                if ((196608 & i10) == 0) {
                    jN = j11;
                    if ((i11 & 32) == 0 || !c0VarR.L(jN)) {
                        i18 = 65536;
                    } else {
                        i18 = 131072;
                    }
                    i12 |= i18;
                } else {
                    jN = j11;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0 || !c0VarR.L(j12)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i12 |= i17;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
                if ((4793491 & i12) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i19 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        }
                        if ((i11 & 16) != 0) {
                            jA = yf.f25708a.a(c0VarR, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jB = yf.f25708a.b(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jB = j12;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(6);
                        } else {
                            fR = f10;
                        }
                        j16 = jN;
                        j17 = jB;
                        z14 = z11;
                        q3Var3 = q3VarE;
                        j18 = jA;
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        j17 = j12;
                        fR = f10;
                        q3Var3 = q3VarE;
                        j18 = jA;
                        j16 = jN;
                        z14 = z11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:165)");
                    }
                    strS = xfVar.S();
                    if (strS != null) {
                        c0VarR.E(593509092);
                        xfVar2 = xfVar;
                        cVarE = androidx.compose.runtime.internal.w.e(1843479216, true, new d(j17, xfVar2, strS), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        xfVar2 = xfVar;
                        c0VarR.E(593808056);
                        c0VarR.A();
                        cVarE = null;
                    }
                    c0Var2 = c0VarR;
                    j(androidx.compose.foundation.layout.d5.r(a0Var2, androidx.compose.ui.unit.h.r(12)), cVarE, z14, q3Var3, j18, j16, fR, androidx.compose.runtime.internal.w.e(-261845785, true, new c(xfVar2), c0VarR, 54), c0Var2, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j15 = j17;
                    a0Var3 = a0Var2;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    j13 = j18;
                    j14 = j16;
                    f11 = fR;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarE;
                    j13 = jA;
                    j14 = jN;
                    j15 = j12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.jg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pg.m(xfVar, a0Var3, z13, q3Var2, j13, j14, j15, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarE = q3Var;
                    if (c0VarR.D(q3VarE)) {
                    }
                    i12 |= i20;
                } else {
                    q3VarE = q3Var;
                }
                i12 |= i20;
            } else {
                q3VarE = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jA = j10;
                    if (c0VarR.L(jA)) {
                    }
                    i12 |= i21;
                } else {
                    jA = j10;
                }
                i12 |= i21;
            } else {
                jA = j10;
            }
            if ((196608 & i10) == 0) {
                jN = j11;
                if ((i11 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            } else {
                jN = j11;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f10)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((4793491 & i12) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                    }
                    if ((i11 & 16) != 0) {
                        jA = yf.f25708a.a(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jB = yf.f25708a.b(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jB = j12;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(6);
                    } else {
                        fR = f10;
                    }
                    j16 = jN;
                    j17 = jB;
                    z14 = z11;
                    q3Var3 = q3VarE;
                    j18 = jA;
                } else {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                    }
                    if ((i11 & 16) != 0) {
                        jA = yf.f25708a.a(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jB = yf.f25708a.b(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jB = j12;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(6);
                    } else {
                        fR = f10;
                    }
                    j16 = jN;
                    j17 = jB;
                    z14 = z11;
                    q3Var3 = q3VarE;
                    j18 = jA;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:165)");
                }
                strS = xfVar.S();
                if (strS != null) {
                    c0VarR.E(593509092);
                    xfVar2 = xfVar;
                    cVarE = androidx.compose.runtime.internal.w.e(1843479216, true, new d(j17, xfVar2, strS), c0VarR, 54);
                    c0VarR.A();
                } else {
                    xfVar2 = xfVar;
                    c0VarR.E(593808056);
                    c0VarR.A();
                    cVarE = null;
                }
                c0Var2 = c0VarR;
                j(androidx.compose.foundation.layout.d5.r(a0Var2, androidx.compose.ui.unit.h.r(12)), cVarE, z14, q3Var3, j18, j16, fR, androidx.compose.runtime.internal.w.e(-261845785, true, new c(xfVar2), c0VarR, 54), c0Var2, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j15 = j17;
                a0Var3 = a0Var2;
                z13 = z14;
                q3Var2 = q3Var3;
                j13 = j18;
                j14 = j16;
                f11 = fR;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarE;
                j13 = jA;
                j14 = jN;
                j15 = j12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.jg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pg.m(xfVar, a0Var3, z13, q3Var2, j13, j14, j15, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarE = q3Var;
                    if (c0VarR.D(q3VarE)) {
                    }
                    i12 |= i20;
                } else {
                    q3VarE = q3Var;
                }
                i12 |= i20;
            } else {
                q3VarE = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jA = j10;
                    if (c0VarR.L(jA)) {
                    }
                    i12 |= i21;
                } else {
                    jA = j10;
                }
                i12 |= i21;
            } else {
                jA = j10;
            }
            if ((196608 & i10) == 0) {
                jN = j11;
                if ((i11 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            } else {
                jN = j11;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f10)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((4793491 & i12) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                    }
                    if ((i11 & 16) != 0) {
                        jA = yf.f25708a.a(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jB = yf.f25708a.b(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jB = j12;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(6);
                    } else {
                        fR = f10;
                    }
                    j16 = jN;
                    j17 = jB;
                    z14 = z11;
                    q3Var3 = q3VarE;
                    j18 = jA;
                } else {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                    }
                    if ((i11 & 16) != 0) {
                        jA = yf.f25708a.a(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jB = yf.f25708a.b(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jB = j12;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(6);
                    } else {
                        fR = f10;
                    }
                    j16 = jN;
                    j17 = jB;
                    z14 = z11;
                    q3Var3 = q3VarE;
                    j18 = jA;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:165)");
                }
                strS = xfVar.S();
                if (strS != null) {
                    c0VarR.E(593509092);
                    xfVar2 = xfVar;
                    cVarE = androidx.compose.runtime.internal.w.e(1843479216, true, new d(j17, xfVar2, strS), c0VarR, 54);
                    c0VarR.A();
                } else {
                    xfVar2 = xfVar;
                    c0VarR.E(593808056);
                    c0VarR.A();
                    cVarE = null;
                }
                c0Var2 = c0VarR;
                j(androidx.compose.foundation.layout.d5.r(a0Var2, androidx.compose.ui.unit.h.r(12)), cVarE, z14, q3Var3, j18, j16, fR, androidx.compose.runtime.internal.w.e(-261845785, true, new c(xfVar2), c0VarR, 54), c0Var2, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j15 = j17;
                a0Var3 = a0Var2;
                z13 = z14;
                q3Var2 = q3Var3;
                j13 = j18;
                j14 = j16;
                f11 = fR;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarE;
                j13 = jA;
                j14 = jN;
                j15 = j12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.jg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pg.m(xfVar, a0Var3, z13, q3Var2, j13, j14, j15, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3VarE = q3Var;
                if (c0VarR.D(q3VarE)) {
                }
                i12 |= i20;
            } else {
                q3VarE = q3Var;
            }
            i12 |= i20;
        } else {
            q3VarE = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                jA = j10;
                if (c0VarR.L(jA)) {
                }
                i12 |= i21;
            } else {
                jA = j10;
            }
            i12 |= i21;
        } else {
            jA = j10;
        }
        if ((196608 & i10) == 0) {
            jN = j11;
            if ((i11 & 32) == 0) {
                i18 = 65536;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        } else {
            jN = j11;
        }
        if ((1572864 & i10) != 0) {
            if ((i11 & 64) == 0) {
                i17 = 524288;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.I(f10)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((4793491 & i12) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarE = x9.f25488a.b(c0VarR, 6).e();
                }
                if ((i11 & 16) != 0) {
                    jA = yf.f25708a.a(c0VarR, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jB = yf.f25708a.b(c0VarR, 6);
                    i12 &= -3670017;
                } else {
                    jB = j12;
                }
                if (i15 != 0) {
                    fR = androidx.compose.ui.unit.h.r(6);
                } else {
                    fR = f10;
                }
                j16 = jN;
                j17 = jB;
                z14 = z11;
                q3Var3 = q3VarE;
                j18 = jA;
            } else {
                if (i19 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarE = x9.f25488a.b(c0VarR, 6).e();
                }
                if ((i11 & 16) != 0) {
                    jA = yf.f25708a.a(c0VarR, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jB = yf.f25708a.b(c0VarR, 6);
                    i12 &= -3670017;
                } else {
                    jB = j12;
                }
                if (i15 != 0) {
                    fR = androidx.compose.ui.unit.h.r(6);
                } else {
                    fR = f10;
                }
                j16 = jN;
                j17 = jB;
                z14 = z11;
                q3Var3 = q3VarE;
                j18 = jA;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:165)");
            }
            strS = xfVar.S();
            if (strS != null) {
                c0VarR.E(593509092);
                xfVar2 = xfVar;
                cVarE = androidx.compose.runtime.internal.w.e(1843479216, true, new d(j17, xfVar2, strS), c0VarR, 54);
                c0VarR.A();
            } else {
                xfVar2 = xfVar;
                c0VarR.E(593808056);
                c0VarR.A();
                cVarE = null;
            }
            c0Var2 = c0VarR;
            j(androidx.compose.foundation.layout.d5.r(a0Var2, androidx.compose.ui.unit.h.r(12)), cVarE, z14, q3Var3, j18, j16, fR, androidx.compose.runtime.internal.w.e(-261845785, true, new c(xfVar2), c0VarR, 54), c0Var2, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j15 = j17;
            a0Var3 = a0Var2;
            z13 = z14;
            q3Var2 = q3Var3;
            j13 = j18;
            j14 = j16;
            f11 = fR;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            f11 = f10;
            a0Var3 = a0Var2;
            z13 = z11;
            q3Var2 = q3VarE;
            j13 = jA;
            j14 = jN;
            j15 = j12;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.jg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return pg.m(xfVar, a0Var3, z13, q3Var2, j13, j14, j15, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.a0 a0Var, Function2 function2, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, Function2 function3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(a0Var, function2, z10, q3Var, j10, j11, f10, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(xf xfVar, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k(xfVar, a0Var, z10, q3Var, j10, j11, j12, f10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void n(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(343813818);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(343813818, i11, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = e.f24229a;
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
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
            androidx.compose.ui.a0 a0VarS = androidx.compose.foundation.layout.d5.s(aVar, f24205b, f24208e);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarS);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
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
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0VarR, Integer.valueOf(i11 & 14));
            c0VarR.o();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.kg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return pg.o(function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        n(function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
