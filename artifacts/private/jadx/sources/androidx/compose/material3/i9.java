package androidx.compose.material3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 15 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 16 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2305:1\n1282#2,6:2306\n1282#2,6:2312\n1282#2,6:2318\n1282#2,6:2324\n1282#2,6:2330\n1282#2,6:2380\n1282#2,6:2386\n1282#2,6:2392\n1282#2,3:2405\n1285#2,3:2409\n1282#2,6:2412\n1282#2,6:2456\n1282#2,6:2462\n1282#2,6:2468\n1282#2,6:2601\n1282#2,6:2607\n1282#2,6:2650\n1282#2,6:2703\n1282#2,6:2781\n1282#2,6:2787\n1282#2,6:2793\n1282#2,6:2811\n1282#2,6:2817\n1282#2,6:2823\n87#3:2336\n84#3,9:2337\n94#3:2376\n87#3:2418\n83#3,10:2419\n87#3:2512\n84#3,9:2513\n94#3:2552\n94#3:2560\n87#3:2561\n85#3,8:2562\n94#3:2600\n87#3:2710\n85#3,8:2711\n94#3:2806\n79#4,6:2346\n86#4,3:2361\n89#4,2:2370\n93#4:2375\n79#4,6:2429\n86#4,3:2444\n89#4,2:2453\n79#4,6:2485\n86#4,3:2500\n89#4,2:2509\n79#4,6:2522\n86#4,3:2537\n89#4,2:2546\n93#4:2551\n93#4:2555\n93#4:2559\n79#4,6:2570\n86#4,3:2585\n89#4,2:2594\n93#4:2599\n79#4,6:2619\n86#4,3:2634\n89#4,2:2643\n79#4,6:2667\n86#4,3:2682\n89#4,2:2691\n93#4:2696\n93#4:2701\n79#4,6:2719\n86#4,3:2734\n89#4,2:2743\n79#4,6:2752\n86#4,3:2767\n89#4,2:2776\n93#4:2801\n93#4:2805\n79#4,6:2835\n86#4,3:2850\n89#4,2:2859\n93#4:2864\n347#5,9:2352\n356#5,3:2372\n347#5,9:2435\n356#5:2455\n347#5,9:2491\n356#5:2511\n347#5,9:2528\n356#5,3:2548\n357#5,2:2553\n357#5,2:2557\n347#5,9:2576\n356#5,3:2596\n347#5,9:2625\n356#5:2645\n347#5,9:2673\n356#5,3:2693\n357#5,2:2699\n347#5,9:2725\n356#5:2745\n347#5,9:2758\n356#5:2778\n357#5,2:2799\n357#5,2:2803\n347#5,9:2841\n356#5,3:2861\n4206#6,6:2364\n4206#6,6:2447\n4206#6,6:2503\n4206#6,6:2540\n4206#6,6:2588\n4206#6,6:2637\n4206#6,6:2685\n4206#6,6:2737\n4206#6,6:2770\n4206#6,6:2853\n75#7:2377\n75#7:2656\n75#7:2657\n75#7:2779\n75#7:2780\n75#7:2866\n1#8:2378\n113#9:2379\n113#9:2870\n113#9:2871\n113#9:2872\n113#9:2873\n113#9:2874\n113#9:2875\n113#9:2876\n607#10:2398\n604#10,6:2399\n605#11:2408\n70#12:2474\n66#12,10:2475\n77#12:2556\n70#12:2658\n68#12,8:2659\n77#12:2697\n99#13,6:2613\n106#13:2702\n99#13,6:2746\n106#13:2802\n99#13,6:2829\n106#13:2865\n34#14,4:2646\n39#14:2698\n68#15:2709\n159#16:2807\n162#16:2808\n171#16:2809\n117#16:2810\n85#17:2867\n117#17,2:2868\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n171#1:2306,6\n190#1:2312,6\n193#1:2318,6\n376#1:2324,6\n1357#1:2330,6\n1460#1:2380,6\n1466#1:2386,6\n1544#1:2392,6\n1556#1:2405,3\n1556#1:2409,3\n1557#1:2412,6\n1569#1:2456,6\n1581#1:2462,6\n1593#1:2468,6\n1715#1:2601,6\n1753#1:2607,6\n1805#1:2650,6\n1848#1:2703,6\n1900#1:2781,6\n1929#1:2787,6\n1935#1:2793,6\n2013#1:2811,6\n2131#1:2817,6\n2149#1:2823,6\n1353#1:2336\n1353#1:2337,9\n1353#1:2376\n1558#1:2418\n1558#1:2419,10\n1598#1:2512\n1598#1:2513,9\n1598#1:2552\n1558#1:2560\n1686#1:2561\n1686#1:2562,8\n1686#1:2600\n1857#1:2710\n1857#1:2711,8\n1857#1:2806\n1353#1:2346,6\n1353#1:2361,3\n1353#1:2370,2\n1353#1:2375\n1558#1:2429,6\n1558#1:2444,3\n1558#1:2453,2\n1597#1:2485,6\n1597#1:2500,3\n1597#1:2509,2\n1598#1:2522,6\n1598#1:2537,3\n1598#1:2546,2\n1598#1:2551\n1597#1:2555\n1558#1:2559\n1686#1:2570,6\n1686#1:2585,3\n1686#1:2594,2\n1686#1:2599\n1796#1:2619,6\n1796#1:2634,3\n1796#1:2643,2\n1803#1:2667,6\n1803#1:2682,3\n1803#1:2691,2\n1803#1:2696\n1796#1:2701\n1857#1:2719,6\n1857#1:2734,3\n1857#1:2743,2\n1864#1:2752,6\n1864#1:2767,3\n1864#1:2776,2\n1864#1:2801\n1857#1:2805\n2193#1:2835,6\n2193#1:2850,3\n2193#1:2859,2\n2193#1:2864\n1353#1:2352,9\n1353#1:2372,3\n1558#1:2435,9\n1558#1:2455\n1597#1:2491,9\n1597#1:2511\n1598#1:2528,9\n1598#1:2548,3\n1597#1:2553,2\n1558#1:2557,2\n1686#1:2576,9\n1686#1:2596,3\n1796#1:2625,9\n1796#1:2645\n1803#1:2673,9\n1803#1:2693,3\n1796#1:2699,2\n1857#1:2725,9\n1857#1:2745\n1864#1:2758,9\n1864#1:2778\n1864#1:2799,2\n1857#1:2803,2\n2193#1:2841,9\n2193#1:2861,3\n1353#1:2364,6\n1558#1:2447,6\n1597#1:2503,6\n1598#1:2540,6\n1686#1:2588,6\n1796#1:2637,6\n1803#1:2685,6\n1857#1:2737,6\n1864#1:2770,6\n2193#1:2853,6\n1447#1:2377\n1815#1:2656\n1816#1:2657\n1887#1:2779\n1888#1:2780\n2253#1:2866\n1447#1:2379\n2293#1:2870\n2294#1:2871\n2295#1:2872\n2296#1:2873\n2298#1:2874\n2299#1:2875\n2301#1:2876\n1556#1:2398\n1556#1:2399,6\n1556#1:2408\n1597#1:2474\n1597#1:2475,10\n1597#1:2556\n1803#1:2658\n1803#1:2659,8\n1803#1:2697\n1796#1:2613,6\n1796#1:2702\n1864#1:2746,6\n1864#1:2802\n2193#1:2829,6\n2193#1:2865\n1802#1:2646,4\n1802#1:2698\n1859#1:2709\n1978#1:2807\n1980#1:2808\n1982#1:2809\n1987#1:2810\n1557#1:2867\n1557#1:2868,2\n*E\n"})
public final class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f28365a = androidx.compose.ui.unit.h.r(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f28366b = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f28367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f28368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f28369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f28370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f28371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f28372h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f28373i = 3;

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,2305:1\n87#2:2306\n84#2,9:2307\n94#2:2383\n79#3,6:2316\n86#3,3:2331\n89#3,2:2340\n79#3,6:2349\n86#3,3:2364\n89#3,2:2373\n93#3:2378\n93#3:2382\n347#4,9:2322\n356#4:2342\n347#4,9:2355\n356#4,3:2375\n357#4,2:2380\n4206#5,6:2334\n4206#5,6:2367\n99#6,6:2343\n106#6:2379\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1\n*L\n1372#1:2306\n1372#1:2307,9\n1372#1:2383\n1372#1:2316,6\n1372#1:2331,3\n1372#1:2340,2\n1379#1:2349,6\n1379#1:2364,3\n1379#1:2373,2\n1379#1:2378\n1372#1:2382\n1372#1:2322,9\n1372#1:2342\n1379#1:2355,9\n1379#1:2375,3\n1372#1:2380,2\n1372#1:2334,6\n1379#1:2367,6\n1379#1:2343,6\n1379#1:2379\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r7 f28377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f28378e;

        /* JADX INFO: renamed from: androidx.compose.material3.i9$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2305:1\n70#2:2306\n67#2,9:2307\n77#2:2346\n79#3,6:2316\n86#3,3:2331\n89#3,2:2340\n93#3:2345\n347#4,9:2322\n356#4,3:2342\n4206#5,6:2334\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1$1$1$1\n*L\n1386#1:2306\n1386#1:2307,9\n1386#1:2346\n1386#1:2316,6\n1386#1:2331,3\n1386#1:2340,2\n1386#1:2345\n1386#1:2322,9\n1386#1:2342,3\n1386#1:2334,6\n*E\n"})
        static final class C0221a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.x5 f28379a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28380b;

            /* JADX WARN: Multi-variable type inference failed */
            C0221a(androidx.compose.foundation.layout.x5 x5Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f28379a = x5Var;
                this.f28380b = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-738208900, i10, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1385)");
                }
                androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.x5.q(this.f28379a, androidx.compose.ui.a0.E, 1.0f, false, 2, null);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28380b;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarQ);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, r7 r7Var, androidx.compose.ui.text.y3 y3Var) {
            this.f28374a = function2;
            this.f28375b = function3;
            this.f28376c = function4;
            this.f28377d = r7Var;
            this.f28378e = y3Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.foundation.layout.q.e eVarW;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1658370654, i10, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1371)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(aVar, 0.0f, 1, null);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28374a;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f28375b;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function4 = this.f28376c;
            r7 r7Var = this.f28377d;
            androidx.compose.ui.text.y3 y3Var = this.f28378e;
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY = qVar.y();
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            if (function2 == null || function3 == null) {
                eVarW = function2 != null ? qVar.w() : qVar.o();
            } else {
                eVarW = qVar.s();
            }
            androidx.compose.ui.a0 a0VarH2 = androidx.compose.foundation.layout.i6.h(aVar, 0.0f, 1, null);
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarW, aVar2.q(), c0Var, 48);
            int iJ2 = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarH2);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A2);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarE, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            if (function2 != null) {
                c0Var.E(-516028300);
                q50.o(y3Var, androidx.compose.runtime.internal.w.e(-738208900, true, new C0221a(y5Var, function2), c0Var, 54), c0Var, 48);
                c0Var.A();
            } else {
                c0Var.E(-515838022);
                c0Var.A();
            }
            if (function3 == null) {
                c0Var.E(-515799087);
            } else {
                c0Var.E(260455984);
                function3.invoke(c0Var, 0);
            }
            c0Var.A();
            c0Var.o();
            if (function4 == null && function2 == null && function3 == null) {
                c0Var.E(-250277930);
                c0Var.A();
            } else {
                c0Var.E(-250360576);
                ld.h(null, 0.0f, r7Var.s(), c0Var, 0, 3);
                c0Var.A();
            }
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

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z9 f28381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r7 f28382b;

        b(z9 z9Var, r7 r7Var) {
            this.f28381a = z9Var;
            this.f28382b = r7Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1655706771, i10, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:173)");
            }
            v7.f33887a.g(this.f28381a.e(), androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, i9.f28369e), this.f28382b.A(), c0Var, 3120, 0);
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
        final /* synthetic */ z9 f28383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y7 f28384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r7 f28385c;

        c(z9 z9Var, y7 y7Var, r7 r7Var) {
            this.f28383a = z9Var;
            this.f28384b = y7Var;
            this.f28385c = r7Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1439279037, i10, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:180)");
            }
            v7.f33887a.d(this.f28383a.j(), this.f28383a.e(), this.f28384b, androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, i9.f28370f), this.f28385c.t(), c0Var, 199680, 0);
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

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2305:1\n1282#2,6:2306\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$5\n*L\n210#1:2306,6\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z9 f28386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r7 f28387b;

        d(z9 z9Var, r7 r7Var) {
            this.f28386a = z9Var;
            this.f28387b = r7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(z9 z9Var, ed edVar) {
            z9Var.d(edVar.i());
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
                androidx.compose.runtime.m0.A0(-1483431603, i10, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:206)");
            }
            androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, i9.T0());
            int iE = this.f28386a.e();
            boolean zD = c0Var.D(this.f28386a);
            final z9 z9Var = this.f28386a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.j9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.d.f(z9Var, (ed) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            i9.c0(a0VarP, iE, (Function1) objI0, this.f28387b, c0Var, 6);
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

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$6\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2305:1\n1282#2,6:2306\n1282#2,6:2312\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$6\n*L\n225#1:2306,6\n226#1:2312,6\n*E\n"})
    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z9 f28388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f28389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y7 f28390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r7 f28391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.g0 f28392e;

        e(z9 z9Var, androidx.compose.material3.internal.k1 k1Var, y7 y7Var, r7 r7Var, androidx.compose.ui.focus.g0 g0Var) {
            this.f28388a = z9Var;
            this.f28389b = k1Var;
            this.f28390c = y7Var;
            this.f28391d = r7Var;
            this.f28392e = g0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(z9 z9Var, Long l10) {
            z9Var.g(l10);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(z9 z9Var, long j10) {
            z9Var.a(j10);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void f(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1346903698, i10, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:220)");
            }
            Long lJ = this.f28388a.j();
            long jF = this.f28388a.f();
            int iE = this.f28388a.e();
            boolean zD = c0Var.D(this.f28388a);
            final z9 z9Var = this.f28388a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.k9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.e.i(z9Var, (Long) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            Function1 function1 = (Function1) objI0;
            boolean zD2 = c0Var.D(this.f28388a);
            final z9 z9Var2 = this.f28388a;
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.l9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.e.k(z9Var2, ((Long) obj).longValue());
                    }
                };
                c0Var.Y(objI1);
            }
            i9.o0(lJ, jF, iE, function1, (Function1) objI1, this.f28389b, this.f28388a.c(), this.f28390c, this.f28388a.b(), this.f28391d, this.f28392e, c0Var, 0, 0);
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1", f = "DatePicker.kt", i = {}, l = {1552}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f28394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.foundation.lazy.j1 j1Var, int i10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f28394b = j1Var;
            this.f28395c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f28394b, this.f28395c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28393a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (!this.f28394b.a()) {
                    int iE = this.f28394b.E();
                    int i11 = this.f28395c;
                    if (iE != i11) {
                        androidx.compose.foundation.lazy.j1 j1Var = this.f28394b;
                        this.f28393a = 1;
                        if (androidx.compose.foundation.lazy.j1.f0(j1Var, i11, 0, this, 2, null) == objL) {
                            return objL;
                        }
                    }
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
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1", f = "DatePicker.kt", i = {}, l = {1572}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f28397b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.foundation.lazy.j1 j1Var, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f28397b = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f28397b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28396a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.foundation.lazy.j1 j1Var = this.f28397b;
                    int iE = j1Var.E() + 1;
                    this.f28396a = 1;
                    if (androidx.compose.foundation.lazy.j1.x(j1Var, iE, 0, this, 2, null) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", i = {}, l = {1584}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f28399b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.foundation.lazy.j1 j1Var, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f28399b = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f28399b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28398a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.foundation.lazy.j1 j1Var = this.f28399b;
                    int iE = j1Var.E() - 1;
                    this.f28398a = 1;
                    if (androidx.compose.foundation.lazy.j1.x(j1Var, iE, 0, this, 2, null) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,2305:1\n93#2:2306\n1282#3,6:2307\n1282#3,6:2352\n87#4:2313\n84#4,9:2314\n94#4:2361\n79#5,6:2323\n86#5,3:2338\n89#5,2:2347\n93#5:2360\n347#6,9:2329\n356#6:2349\n357#6,2:2358\n4206#7,6:2341\n68#8:2350\n52#8:2351\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2\n*L\n1633#1:2306\n1634#1:2307,6\n1646#1:2352,6\n1634#1:2313\n1634#1:2314,9\n1634#1:2361\n1634#1:2323,6\n1634#1:2338,3\n1634#1:2347,2\n1634#1:2360\n1634#1:2329,9\n1634#1:2349\n1634#1:2358,2\n1634#1:2341,6\n1641#1:2350\n1641#1:2351\n*E\n"})
    static final class i implements pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f28400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f28401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f28402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f28403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ IntRange f28404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.o1 f28405f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ww f28406g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f28407h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ r7 f28408i;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", i = {}, l = {1653}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.j1 f28410b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f28411c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ IntRange f28412d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.o1 f28413e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.lazy.j1 j1Var, int i10, IntRange intRange, androidx.compose.material3.internal.o1 o1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f28410b = j1Var;
                this.f28411c = i10;
                this.f28412d = intRange;
                this.f28413e = o1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f28410b, this.f28411c, this.f28412d, this.f28413e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28409a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.foundation.lazy.j1 j1Var = this.f28410b;
                    int iL = (((this.f28411c - this.f28412d.l()) * 12) + this.f28413e.k()) - 1;
                    this.f28409a = 1;
                    if (androidx.compose.foundation.lazy.j1.f0(j1Var, iL, 0, this, 2, null) == objL) {
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

        i(long j10, androidx.compose.runtime.n3<Boolean> n3Var, kotlinx.coroutines.s0 s0Var, androidx.compose.foundation.lazy.j1 j1Var, IntRange intRange, androidx.compose.material3.internal.o1 o1Var, ww wwVar, androidx.compose.material3.internal.k1 k1Var, r7 r7Var) {
            this.f28400a = j10;
            this.f28401b = n3Var;
            this.f28402c = s0Var;
            this.f28403d = j1Var;
            this.f28404e = intRange;
            this.f28405f = o1Var;
            this.f28406g = wwVar;
            this.f28407h = k1Var;
            this.f28408i = r7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(String str, androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.G1(e0Var, str);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(kotlinx.coroutines.s0 s0Var, androidx.compose.runtime.n3 n3Var, androidx.compose.foundation.lazy.j1 j1Var, IntRange intRange, androidx.compose.material3.internal.o1 o1Var, int i10) {
            i9.Q(n3Var, !i9.P(n3Var));
            kotlinx.coroutines.k.f(s0Var, null, null, new a(j1Var, i10, intRange, o1Var, null), 3, null);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void f(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1193716082, i10, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1632)");
            }
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            final String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.B), c0Var, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(strB);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.m9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.i.i(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar2, false, (Function1) objI0, 1, null);
            long j10 = this.f28400a;
            final androidx.compose.runtime.n3<Boolean> n3Var = this.f28401b;
            final kotlinx.coroutines.s0 s0Var = this.f28402c;
            final androidx.compose.foundation.lazy.j1 j1Var = this.f28403d;
            final IntRange intRange = this.f28404e;
            final androidx.compose.material3.internal.o1 o1Var = this.f28405f;
            ww wwVar = this.f28406g;
            androidx.compose.material3.internal.k1 k1Var = this.f28407h;
            r7 r7Var = this.f28408i;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.foundation.layout.i6.l(aVar2, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(i9.V0() * 7) - fd.f27637a.b())), i9.S0(), 0.0f, 2, null);
            boolean zD2 = c0Var.D(n3Var) | c0Var.k0(s0Var) | c0Var.D(j1Var) | c0Var.k0(intRange) | c0Var.D(o1Var);
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                Object obj = new Function1() { // from class: androidx.compose.material3.n9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return i9.i.k(s0Var, n3Var, j1Var, intRange, o1Var, ((Integer) obj2).intValue());
                    }
                };
                c0Var.Y(obj);
                objI1 = obj;
            }
            i9.D0(a0VarT, j10, (Function1) objI1, wwVar, k1Var, intRange, r7Var, c0Var, 6);
            ld.h(null, 0.0f, r7Var.s(), c0Var, 0, 3);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            f(lVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerHeader$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2305:1\n70#2:2306\n66#2,10:2307\n77#2:2347\n79#3,6:2317\n86#3,3:2332\n89#3,2:2341\n93#3:2346\n347#4,9:2323\n356#4,3:2343\n4206#5,6:2335\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerHeader$1$1\n*L\n1693#1:2306\n1693#1:2307,10\n1693#1:2347\n1693#1:2317,6\n1693#1:2332,3\n1693#1:2341,2\n1693#1:2346\n1693#1:2323,9\n1693#1:2343,3\n1693#1:2335,6\n*E\n"})
    static final class j implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28414a;

        /* JADX WARN: Multi-variable type inference failed */
        j(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28414a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1344395458, i10, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1692)");
            }
            androidx.compose.ui.e eVarG = androidx.compose.ui.e.f37317a.g();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28414a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarG, false);
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
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Day$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2305:1\n70#2:2306\n68#2,8:2307\n77#2:2351\n79#3,6:2315\n86#3,3:2330\n89#3,2:2339\n93#3:2350\n347#4,9:2321\n356#4:2341\n357#4,2:2348\n4206#5,6:2333\n1282#6,6:2342\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Day$2\n*L\n2033#1:2306\n2033#1:2307,8\n2033#1:2351\n2033#1:2315,6\n2033#1:2330,3\n2033#1:2339,2\n2033#1:2350\n2033#1:2321,9\n2033#1:2341\n2033#1:2348,2\n2033#1:2333,6\n2044#1:2342,6\n*E\n"})
    static final class k implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r7 f28416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f28419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f28420f;

        k(String str, r7 r7Var, boolean z10, boolean z11, boolean z12, boolean z13) {
            this.f28415a = str;
            this.f28416b = r7Var;
            this.f28417c = z10;
            this.f28418d = z11;
            this.f28419e = z12;
            this.f28420f = z13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
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
                androidx.compose.runtime.m0.A0(1126347158, i10, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:2032)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            d0.x xVar = d0.x.f269223a;
            androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.i6.q(aVar, xVar.h(), xVar.f());
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            String str = this.f28415a;
            r7 r7Var = this.f28416b;
            boolean z10 = this.f28417c;
            boolean z11 = this.f28418d;
            boolean z12 = this.f28419e;
            boolean z13 = this.f28420f;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarQ);
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
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.o9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.k.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(str, androidx.compose.ui.semantics.t.c(aVar, (Function1) objI0), r7Var.f(z10, z11, z12, z13, c0Var, 0).getValue().M(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 261112);
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

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DisplayModeToggleButton$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2305:1\n153#2:2306\n150#2:2313\n1282#3,6:2307\n1282#3,6:2314\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DisplayModeToggleButton$1\n*L\n1414#1:2306\n1421#1:2313\n1411#1:2307,6\n1418#1:2314,6\n*E\n"})
    static final class l implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f28421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<ed, Unit> f28422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f28423c;

        /* JADX WARN: Multi-variable type inference failed */
        l(int i10, Function1<? super ed, Unit> function1, androidx.compose.ui.a0 a0Var) {
            this.f28421a = i10;
            this.f28422b = function1;
            this.f28423c = a0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(Function1 function1) {
            function1.invoke(ed.c(ed.f27323b.a()));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Function1 function1) {
            function1.invoke(ed.c(ed.f27323b.b()));
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void f(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1734512197, i10, -1, "androidx.compose.material3.DisplayModeToggleButton.<anonymous> (DatePicker.kt:1408)");
            }
            if (ed.f(this.f28421a, ed.f27323b.b())) {
                c0Var.E(-101264927);
                androidx.compose.ui.graphics.vector.d dVarE = androidx.compose.material3.internal.p2.b.f29069a.e();
                androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31861v), c0Var, 0);
                boolean zD = c0Var.D(this.f28422b);
                final Function1<ed, Unit> function1 = this.f28422b;
                Object objI0 = c0Var.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.p9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i9.l.i(function1);
                        }
                    };
                    c0Var.Y(objI0);
                }
                i9.g0((Function0) objI0, dVarE, strB, this.f28423c, false, c0Var, 0, 16);
                c0Var.A();
            } else {
                c0Var.E(-100967048);
                androidx.compose.ui.graphics.vector.d dVarD = androidx.compose.material3.internal.p2.b.f29069a.d();
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                String strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31859t), c0Var, 0);
                boolean zD2 = c0Var.D(this.f28422b);
                final Function1<ed, Unit> function2 = this.f28422b;
                Object objI1 = c0Var.i0();
                if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.q9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i9.l.k(function2);
                        }
                    };
                    c0Var.Y(objI1);
                }
                i9.g0((Function0) objI1, dVarD, strB2, this.f28423c, false, c0Var, 0, 16);
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

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2305:1\n1282#2,6:2306\n1282#2,6:2312\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1\n*L\n1727#1:2306,6\n1732#1:2312,6\n*E\n"})
    static final class m implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f28424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IntRange f28425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f28426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.o1 f28427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f28428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.j1 f28429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Long f28430g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y7 f28431h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ww f28432i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r7 f28433j;

        @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1$2$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2305:1\n70#2:2306\n67#2,9:2307\n77#2:2346\n79#3,6:2316\n86#3,3:2331\n89#3,2:2340\n93#3:2345\n347#4,9:2322\n356#4,3:2342\n4206#5,6:2334\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1$2$1$1\n*L\n1735#1:2306\n1735#1:2307,9\n1735#1:2346\n1735#1:2316,6\n1735#1:2331,3\n1735#1:2340,2\n1735#1:2345\n1735#1:2322,9\n1735#1:2342,3\n1735#1:2334,6\n*E\n"})
        static final class a implements pj.o<androidx.compose.foundation.lazy.i, Integer, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.k1 f28434a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.o1 f28435b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Long, Unit> f28436c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.j1 f28437d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Long f28438e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y7 f28439f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ww f28440g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ r7 f28441h;

            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.material3.internal.k1 k1Var, androidx.compose.material3.internal.o1 o1Var, Function1<? super Long, Unit> function1, androidx.compose.material3.internal.j1 j1Var, Long l10, y7 y7Var, ww wwVar, r7 r7Var) {
                this.f28434a = k1Var;
                this.f28435b = o1Var;
                this.f28436c = function1;
                this.f28437d = j1Var;
                this.f28438e = l10;
                this.f28439f = y7Var;
                this.f28440g = wwVar;
                this.f28441h = r7Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.foundation.lazy.i iVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (c0Var.D(iVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= c0Var.K(i10) ? 32 : 16;
                }
                if (!c0Var.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(72599078, i12, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1733)");
                }
                androidx.compose.material3.internal.o1 o1VarT = this.f28434a.t(this.f28435b, i10);
                androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.lazy.i.d(iVar, androidx.compose.ui.a0.E, 0.0f, 1, null);
                Function1<Long, Unit> function1 = this.f28436c;
                androidx.compose.material3.internal.j1 j1Var = this.f28437d;
                Long l10 = this.f28438e;
                y7 y7Var = this.f28439f;
                ww wwVar = this.f28440g;
                r7 r7Var = this.f28441h;
                androidx.compose.material3.internal.k1 k1Var = this.f28434a;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarD);
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
                i9.i0(o1VarT, function1, j1Var.v(), l10, null, null, y7Var, wwVar, r7Var, k1Var.l(), c0Var, 221184);
                c0Var.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
                c(iVar, num.intValue(), c0Var, num2.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        m(androidx.compose.foundation.lazy.j1 j1Var, IntRange intRange, androidx.compose.material3.internal.k1 k1Var, androidx.compose.material3.internal.o1 o1Var, Function1<? super Long, Unit> function1, androidx.compose.material3.internal.j1 j1Var2, Long l10, y7 y7Var, ww wwVar, r7 r7Var) {
            this.f28424a = j1Var;
            this.f28425b = intRange;
            this.f28426c = k1Var;
            this.f28427d = o1Var;
            this.f28428e = function1;
            this.f28429f = j1Var2;
            this.f28430g = l10;
            this.f28431h = y7Var;
            this.f28432i = wwVar;
            this.f28433j = r7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.B1(e0Var, new androidx.compose.ui.semantics.l(new Function0() { // from class: androidx.compose.material3.t9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(i9.m.n());
                }
            }, new Function0() { // from class: androidx.compose.material3.u9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(i9.m.s());
                }
            }, false, 4, null));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float n() {
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float s() {
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(IntRange intRange, androidx.compose.material3.internal.k1 k1Var, androidx.compose.material3.internal.o1 o1Var, Function1 function1, androidx.compose.material3.internal.j1 j1Var, Long l10, y7 y7Var, ww wwVar, r7 r7Var, androidx.compose.foundation.lazy.w0 w0Var) {
            androidx.compose.foundation.lazy.w0.g(w0Var, i9.W0(intRange), null, null, androidx.compose.runtime.internal.w.c(72599078, true, new a(k1Var, o1Var, function1, j1Var, l10, y7Var, wwVar, r7Var)), 6, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            k(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void k(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1504086906, i10, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1721)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar2 = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar2.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.r9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.m.m((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null);
            androidx.compose.foundation.lazy.j1 j1Var = this.f28424a;
            androidx.compose.foundation.gestures.c3 c3VarR = v7.f33887a.r(j1Var, null, c0Var, androidx.media3.exoplayer.a5.S0, 2);
            boolean zK0 = c0Var.k0(this.f28425b) | c0Var.k0(this.f28426c) | c0Var.D(this.f28427d) | c0Var.D(this.f28428e) | c0Var.D(this.f28429f) | c0Var.D(this.f28430g) | c0Var.k0(this.f28431h) | c0Var.D(this.f28432i) | c0Var.D(this.f28433j);
            final IntRange intRange = this.f28425b;
            final androidx.compose.material3.internal.k1 k1Var = this.f28426c;
            final androidx.compose.material3.internal.o1 o1Var = this.f28427d;
            final Function1<Long, Unit> function1 = this.f28428e;
            final androidx.compose.material3.internal.j1 j1Var2 = this.f28429f;
            final Long l10 = this.f28430g;
            final y7 y7Var = this.f28431h;
            final ww wwVar = this.f28432i;
            final r7 r7Var = this.f28433j;
            Object objI1 = c0Var.i0();
            if (zK0 || objI1 == aVar2.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.s9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.m.v(intRange, k1Var, o1Var, function1, j1Var2, l10, y7Var, wwVar, r7Var, (androidx.compose.foundation.lazy.w0) obj);
                    }
                };
                c0Var.Y(objI1);
            }
            androidx.compose.foundation.lazy.h.n(a0VarF, j1Var, null, false, null, null, c3VarR, false, null, (Function1) objI1, c0Var, 0, 444);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", i = {}, l = {1754}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f28443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f28444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f28445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ IntRange f28446e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(androidx.compose.foundation.lazy.j1 j1Var, Function1<? super Long, Unit> function1, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f28443b = j1Var;
            this.f28444c = function1;
            this.f28445d = k1Var;
            this.f28446e = intRange;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new n(this.f28443b, this.f28444c, this.f28445d, this.f28446e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28442a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.lazy.j1 j1Var = this.f28443b;
                Function1<Long, Unit> function1 = this.f28444c;
                androidx.compose.material3.internal.k1 k1Var = this.f28445d;
                IntRange intRange = this.f28446e;
                this.f28442a = 1;
                if (i9.Z0(j1Var, function1, k1Var, intRange, this) == objL) {
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
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class o implements pj.n<k90, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28447a;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f28448a;

            a(String str) {
                this.f28448a = str;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1905952188, i10, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2283)");
                }
                q50.t(this.f28448a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
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

        o(String str) {
            this.f28447a = str;
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
                androidx.compose.runtime.m0.A0(-456272562, i11, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2283)");
            }
            h90.m(k90Var, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.w.e(1905952188, true, new a(this.f28447a), c0Var, 54), c0Var, (i11 & 14) | 805306368, 255);
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

    static final class p implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f28449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f28450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.vector.d f28452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28453e;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.vector.d f28454a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f28455b;

            a(androidx.compose.ui.graphics.vector.d dVar, String str) {
                this.f28454a = dVar;
                this.f28455b = str;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1301085432, i10, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2287)");
                }
                ni.p(this.f28454a, this.f28455b, null, 0L, c0Var, 0, 12);
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

        p(Function0<Unit> function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.vector.d dVar, String str) {
            this.f28449a = function0;
            this.f28450b = a0Var;
            this.f28451c = z10;
            this.f28452d = dVar;
            this.f28453e = str;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            int i11 = 6 & 1;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1124908186, i10, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2286)");
            }
            ei.D(this.f28449a, this.f28450b, this.f28451c, null, null, null, androidx.compose.runtime.internal.w.e(-1301085432, true, new a(this.f28452d, this.f28453e), c0Var, 54), c0Var, 1572864, 56);
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

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2305:1\n1282#2,6:2306\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1\n*L\n2208#1:2306,6\n*E\n"})
    static final class q implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r7 f28457b;

        q(String str, r7 r7Var) {
            this.f28456a = str;
            this.f28457b = r7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.E1(e0Var, androidx.compose.ui.semantics.g.f41102b.b());
            androidx.compose.ui.semantics.b0.v1(e0Var, str);
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
                androidx.compose.runtime.m0.A0(619076006, i10, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2204)");
            }
            String str = this.f28456a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(str);
            final String str2 = this.f28456a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.v9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.q.f(str2, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(str, androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), this.f28457b.u(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262136);
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

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n*L\n1#1,2305:1\n99#2:2306\n95#2,10:2307\n106#2:2349\n79#3,6:2317\n86#3,3:2332\n89#3,2:2341\n93#3:2348\n347#4,9:2323\n356#4:2343\n357#4,2:2346\n4206#5,6:2335\n105#6:2344\n102#6:2345\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$2\n*L\n2221#1:2306\n2221#1:2307,10\n2221#1:2349\n2221#1:2317,6\n2221#1:2332,3\n2221#1:2341,2\n2221#1:2348\n2221#1:2323,9\n2221#1:2343\n2221#1:2346,2\n2221#1:2335,6\n2226#1:2344\n2233#1:2345\n*E\n"})
    static final class r implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f28458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f28460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28461d;

        r(Function0<Unit> function0, boolean z10, Function0<Unit> function1, boolean z11) {
            this.f28458a = function0;
            this.f28459b = z10;
            this.f28460c = function1;
            this.f28461d = z11;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-128317193, i10, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2220)");
            }
            Function0<Unit> function0 = this.f28458a;
            boolean z10 = this.f28459b;
            Function0<Unit> function1 = this.f28460c;
            boolean z11 = this.f28461d;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.w(), c0Var, 0);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            androidx.compose.material3.internal.p2.a.C0231a c0231a = androidx.compose.material3.internal.p2.a.C0231a.f29065a;
            androidx.compose.ui.graphics.vector.d dVarA = c0231a.a();
            androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
            i9.g0(function0, dVarA, androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31863x), c0Var, 0), null, z10, c0Var, 0, 8);
            i9.g0(function1, c0231a.b(), androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31862w), c0Var, 0), null, z11, c0Var, 0, 8);
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

    static final class s implements pj.o<androidx.compose.animation.g, ed, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Long f28462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f28463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f28464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f28465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f28466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IntRange f28467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y7 f28468g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ww f28469h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ r7 f28470i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.g0 f28471j;

        /* JADX WARN: Multi-variable type inference failed */
        s(Long l10, long j10, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function2, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, androidx.compose.ui.focus.g0 g0Var) {
            this.f28462a = l10;
            this.f28463b = j10;
            this.f28464c = function1;
            this.f28465d = function2;
            this.f28466e = k1Var;
            this.f28467f = intRange;
            this.f28468g = y7Var;
            this.f28469h = wwVar;
            this.f28470i = r7Var;
            this.f28471j = g0Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.animation.g gVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1838500091, i11, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1498)");
            }
            ed.a aVar = ed.f27323b;
            if (ed.f(i10, aVar.b())) {
                c0Var.E(1567031954);
                i9.N(this.f28462a, this.f28463b, this.f28464c, this.f28465d, this.f28466e, this.f28467f, this.f28468g, this.f28469h, this.f28470i, c0Var, 0);
                c0Var.A();
            } else if (ed.f(i10, aVar.a())) {
                c0Var.E(1567050592);
                n7.g(this.f28462a, this.f28464c, this.f28466e, this.f28467f, this.f28468g, this.f28469h, this.f28470i, this.f28471j, c0Var, 0);
                c0Var.A();
            } else {
                c0Var.E(1334373351);
                c0Var.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.g gVar, ed edVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(gVar, edVar.i(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Year$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2305:1\n70#2:2306\n68#2,8:2307\n77#2:2351\n79#3,6:2315\n86#3,3:2330\n89#3,2:2339\n93#3:2350\n347#4,9:2321\n356#4:2341\n357#4,2:2348\n4206#5,6:2333\n1282#6,6:2342\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Year$2\n*L\n2158#1:2306\n2158#1:2307,8\n2158#1:2351\n2158#1:2315,6\n2158#1:2330,3\n2158#1:2339,2\n2158#1:2350\n2158#1:2321,9\n2158#1:2341\n2158#1:2348,2\n2158#1:2333,6\n2162#1:2342,6\n*E\n"})
    static final class t implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r7 f28473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f28476e;

        t(String str, r7 r7Var, boolean z10, boolean z11, boolean z12) {
            this.f28472a = str;
            this.f28473b = r7Var;
            this.f28474c = z10;
            this.f28475d = z11;
            this.f28476e = z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
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
                androidx.compose.runtime.m0.A0(-564400443, i10, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2157)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(aVar, 0.0f, 1, null);
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            String str = this.f28472a;
            r7 r7Var = this.f28473b;
            boolean z10 = this.f28474c;
            boolean z11 = this.f28475d;
            boolean z12 = this.f28476e;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
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
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.w9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.t.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(str, androidx.compose.ui.semantics.t.c(aVar, (Function1) objI0), r7Var.H(z10, z11, z12, c0Var, 0).getValue().M(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 261112);
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

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2305:1\n1282#2,6:2306\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n*L\n2087#1:2306,6\n*E\n"})
    static final class u implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f28477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f28478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IntRange f28479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f28480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r7 f28481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f28482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ww f28483g;

        @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 DatePicker.jvm.kt\nandroidx/compose/material3/DatePicker_jvmKt\n*L\n1#1,2305:1\n1282#2,6:2306\n108#3:2312\n29#4:2313\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$1$1$1\n*L\n2100#1:2306,6\n2104#1:2312\n2103#1:2313\n*E\n"})
        static final class a implements pj.o<androidx.compose.foundation.lazy.grid.f0, Integer, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ IntRange f28484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.k1 f28485b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f28486c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f28487d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<Integer, Unit> f28488e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ww f28489f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ r7 f28490g;

            /* JADX WARN: Multi-variable type inference failed */
            a(IntRange intRange, androidx.compose.material3.internal.k1 k1Var, int i10, int i11, Function1<? super Integer, Unit> function1, ww wwVar, r7 r7Var) {
                this.f28484a = intRange;
                this.f28485b = k1Var;
                this.f28486c = i10;
                this.f28487d = i11;
                this.f28488e = function1;
                this.f28489f = wwVar;
                this.f28490g = r7Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1, int i10) {
                function1.invoke(Integer.valueOf(i10));
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void d(androidx.compose.foundation.lazy.grid.f0 f0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
                int i12;
                if ((i11 & 48) == 0) {
                    i12 = i11 | (c0Var.K(i10) ? 32 : 16);
                } else {
                    i12 = i11;
                }
                if (!c0Var.h((i12 & 145) != 144, i12 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(674613074, i12, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2088)");
                }
                final int iL = i10 + this.f28484a.l();
                String strC = c4.c(iL, 0, 0, false, this.f28485b.l(), 7, null);
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                d0.x xVar = d0.x.f269223a;
                androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.i6.q(aVar, xVar.J(), xVar.I());
                boolean z10 = iL == this.f28486c;
                boolean z11 = iL == this.f28487d;
                boolean zD = c0Var.D(this.f28488e) | c0Var.K(iL);
                final Function1<Integer, Unit> function1 = this.f28488e;
                Object objI0 = c0Var.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.y9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i9.u.a.f(function1, iL);
                        }
                    };
                    c0Var.Y(objI0);
                }
                boolean zB = this.f28489f.b(iL);
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                String str = String.format(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31855p), c0Var, 0), Arrays.copyOf(new Object[]{strC}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                i9.A0(strC, a0VarQ, z10, z11, (Function0) objI0, zB, str, this.f28490g, c0Var, 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.grid.f0 f0Var, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
                d(f0Var, num.intValue(), c0Var, num2.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        u(androidx.compose.material3.internal.k1 k1Var, long j10, IntRange intRange, androidx.compose.ui.a0 a0Var, r7 r7Var, Function1<? super Integer, Unit> function1, ww wwVar) {
            this.f28477a = k1Var;
            this.f28478b = j10;
            this.f28479c = intRange;
            this.f28480d = a0Var;
            this.f28481e = r7Var;
            this.f28482f = function1;
            this.f28483g = wwVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(IntRange intRange, androidx.compose.material3.internal.k1 k1Var, int i10, int i11, Function1 function1, ww wwVar, r7 r7Var, androidx.compose.foundation.lazy.grid.f1 f1Var) {
            androidx.compose.foundation.lazy.grid.f1.q(f1Var, CollectionsKt.count(intRange), null, null, null, androidx.compose.runtime.internal.w.c(674613074, true, new a(intRange, k1Var, i10, i11, function1, wwVar, r7Var)), 14, null);
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
                androidx.compose.runtime.m0.A0(1301915789, i10, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2070)");
            }
            androidx.compose.material3.internal.k1 k1Var = this.f28477a;
            final int iN = k1Var.o(k1Var.p()).n();
            final int iN2 = this.f28477a.n(this.f28478b).n();
            androidx.compose.foundation.lazy.grid.x1 x1VarJ = androidx.compose.foundation.lazy.grid.e2.j(Math.max(0, (iN2 - this.f28479c.l()) - 3), 0, c0Var, 0, 2);
            androidx.compose.foundation.lazy.grid.b.C0105b c0105b = new androidx.compose.foundation.lazy.grid.b.C0105b(3);
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(this.f28480d, this.f28481e.g(), null, 2, null);
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.f fVarU = qVar.u();
            androidx.compose.foundation.layout.q.f fVarG = qVar.G(i9.f28371g);
            boolean zK0 = c0Var.k0(this.f28479c) | c0Var.k0(this.f28477a) | c0Var.K(iN2) | c0Var.K(iN) | c0Var.D(this.f28482f) | c0Var.D(this.f28483g) | c0Var.D(this.f28481e);
            final IntRange intRange = this.f28479c;
            final androidx.compose.material3.internal.k1 k1Var2 = this.f28477a;
            final Function1<Integer, Unit> function1 = this.f28482f;
            final ww wwVar = this.f28483g;
            final r7 r7Var = this.f28481e;
            Object objI0 = c0Var.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                Function1 function2 = new Function1() { // from class: androidx.compose.material3.x9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.u.f(intRange, k1Var2, iN2, iN, function1, wwVar, r7Var, (androidx.compose.foundation.lazy.grid.f1) obj);
                    }
                };
                c0Var.Y(function2);
                objI0 = function2;
            }
            androidx.compose.foundation.lazy.grid.p.k(c0105b, a0VarD, x1VarJ, null, false, fVarG, fVarU, null, false, null, (Function1) objI0, c0Var, 1769472, 0, 920);
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

    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPickerMenuButton$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n*L\n1#1,2305:1\n99#2:2306\n96#2:2307\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPickerMenuButton$1\n*L\n2263#1:2306\n2265#1:2307\n*E\n"})
    static final class v implements pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28492b;

        /* JADX WARN: Multi-variable type inference failed */
        v(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10) {
            this.f28491a = function2;
            this.f28492b = z10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, int i10) {
            String strB;
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1899489890, i10, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2256)");
            }
            this.f28491a.invoke(c0Var, 0);
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.w(aVar, s3.f32666a.t()), c0Var, 6);
            androidx.compose.ui.graphics.vector.d dVarA = androidx.compose.material3.internal.p2.b.f29069a.a();
            if (this.f28492b) {
                c0Var.E(1509384391);
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31860u), c0Var, 0);
                c0Var.A();
            } else {
                c0Var.E(1509478662);
                androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31864y), c0Var, 0);
                c0Var.A();
            }
            ni.p(dVarA, strB, androidx.compose.ui.draw.u.a(aVar, this.f28492b ? 180.0f : 0.0f), 0L, c0Var, 0, 8);
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

    static final class w<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f28493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f28494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f28495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ IntRange f28496d;

        /* JADX WARN: Multi-variable type inference failed */
        w(androidx.compose.foundation.lazy.j1 j1Var, Function1<? super Long, Unit> function1, androidx.compose.material3.internal.k1 k1Var, IntRange intRange) {
            this.f28493a = j1Var;
            this.f28494b = function1;
            this.f28495c = k1Var;
            this.f28496d = intRange;
        }

        public final Object a(int i10, kotlin.coroutines.d<? super Unit> dVar) {
            int iE = this.f28493a.E() / 12;
            this.f28494b.invoke(kotlin.coroutines.jvm.internal.b.g(this.f28495c.m(this.f28496d.l() + iE, (this.f28493a.E() % 12) + 1).m()));
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
            return a(((Number) obj).intValue(), dVar);
        }
    }

    static {
        float f10 = 12;
        f28367c = androidx.compose.ui.unit.h.r(f10);
        f28368d = androidx.compose.foundation.layout.d5.j(0.0f, 0.0f, androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10), 3, null);
        float f11 = 24;
        float f12 = 16;
        f28369e = androidx.compose.foundation.layout.d5.j(androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f12), androidx.compose.ui.unit.h.r(f10), 0.0f, 8, null);
        f28370f = androidx.compose.foundation.layout.d5.j(androidx.compose.ui.unit.h.r(f11), 0.0f, androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10), 2, null);
        f28371g = androidx.compose.ui.unit.h.r(f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void A0(final String str, final androidx.compose.ui.a0 a0Var, final boolean z10, final boolean z11, final Function0<Unit> function0, final boolean z12, final String str2, final r7 r7Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        String str3;
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1153850597);
        if ((i10 & 6) == 0) {
            str3 = str;
            i11 = (c0VarR.D(str3) ? 4 : 2) | i10;
        } else {
            str3 = str;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.G(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(function0) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.G(z12) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.D(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.D(r7Var) ? 8388608 : 4194304;
        }
        if (c0VarR.h((4793491 & i11) != 4793490, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1153850597, i11, -1, "androidx.compose.material3.Year (DatePicker.kt:2128)");
            }
            boolean z13 = ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objI0 = c0VarR.i0();
            if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = (!z11 || z10) ? null : androidx.compose.foundation.b1.a(d0.x.f269223a.p(), r7Var.C());
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.a1 a1Var = (androidx.compose.foundation.a1) objI0;
            boolean z14 = (3670016 & i11) == 1048576;
            Object objI1 = c0VarR.i0();
            if (z14 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.r8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.B0(str2, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            int i12 = i11 >> 6;
            int i13 = i12 & 14;
            c0Var2 = c0VarR;
            u10.d(z10, function0, androidx.compose.ui.semantics.t.e(a0Var, true, (Function1) objI1), z12, cx.i(d0.x.f269223a.O(), c0VarR, 6), r7Var.G(z10, z12, c0VarR, i13 | ((i11 >> 12) & com.planner5d.library.engine.input.f.b.B) | ((i11 >> 15) & 896)).getValue().M(), 0L, 0.0f, 0.0f, a1Var, null, androidx.compose.runtime.internal.w.e(-564400443, true, new t(str3, r7Var, z11, z10, z12), c0VarR, 54), c0Var2, i13 | ((i11 >> 9) & com.planner5d.library.engine.input.f.b.B) | (i12 & 7168), 48, 1472);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.s8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.C0(str, a0Var, z10, z11, function0, z12, str2, r7Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.T1(e0Var, new androidx.compose.ui.text.f(str, null, 2, null));
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(String str, androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, Function0 function0, boolean z12, String str2, r7 r7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        A0(str, a0Var, z10, z11, function0, z12, str2, r7Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void D0(final androidx.compose.ui.a0 a0Var, final long j10, final Function1<? super Integer, Unit> function1, final ww wwVar, final androidx.compose.material3.internal.k1 k1Var, final IntRange intRange, final r7 r7Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1286899812);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.L(j10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(wwVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(k1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.D(r7Var) ? 1048576 : 524288;
        }
        if (c0VarR.h((599187 & i11) != 599186, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1286899812, i11, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2068)");
            }
            q50.o(la0.e(d0.x.f269223a.K(), c0VarR, 6), androidx.compose.runtime.internal.w.e(1301915789, true, new u(k1Var, j10, intRange, a0Var, r7Var, function1, wwVar), c0VarR, 54), c0VarR, 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.d8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.E0(a0Var, j10, function1, wwVar, k1Var, intRange, r7Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(androidx.compose.ui.a0 a0Var, long j10, Function1 function1, ww wwVar, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, r7 r7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        D0(a0Var, j10, function1, wwVar, k1Var, intRange, r7Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:60:0x010c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void F0(final Function0<Unit> function0, final boolean z10, androidx.compose.ui.a0 a0Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-709923073);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else if ((i10 & 6) == 0) {
            function1 = function0;
            i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            function1 = function0;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(function2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-709923073, i12, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2247)");
                }
                a0Var2 = a0Var4;
                a4.p(function1, a0Var2, false, androidx.compose.foundation.shape.o.k(), s3.f32666a.G(0L, ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M(), 0L, 0L, c0VarR, 24576, 13), null, null, null, null, androidx.compose.runtime.internal.w.e(1899489890, true, new v(function2, z10), c0VarR, 54), c0VarR, (i12 & 14) | 807075840 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B), 388);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
            }
            a0Var3 = a0Var2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.h9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i9.G0(function0, z10, a0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.k0(function2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            if (i14 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-709923073, i12, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2247)");
            }
            a0Var2 = a0Var4;
            a4.p(function1, a0Var2, false, androidx.compose.foundation.shape.o.k(), s3.f32666a.G(0L, ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M(), 0L, 0L, c0VarR, 24576, 13), null, null, null, null, androidx.compose.runtime.internal.w.e(1899489890, true, new v(function2, z10), c0VarR, 54), c0VarR, (i12 & 14) | 807075840 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B), 388);
            c0VarR = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        a0Var3 = a0Var2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.h9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.G0(function0, z10, a0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G0(Function0 function0, boolean z10, androidx.compose.ui.a0 a0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        F0(function0, z10, a0Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void I(@NotNull final androidx.compose.ui.a0 a0Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @NotNull final r7 r7Var, @NotNull final androidx.compose.ui.text.y3 y3Var, final float f10, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        r7 r7Var2;
        androidx.compose.ui.text.y3 y3Var2;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1539132883);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            function6 = function2;
            i11 |= c0VarR.k0(function6) ? 32 : 16;
        } else {
            function6 = function2;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            function7 = function3;
            i11 |= c0VarR.k0(function7) ? 256 : 128;
        } else {
            function7 = function3;
        }
        if ((i10 & 3072) == 0) {
            function8 = function4;
            i11 |= c0VarR.k0(function8) ? 2048 : 1024;
        } else {
            function8 = function4;
        }
        if ((i10 & 24576) == 0) {
            r7Var2 = r7Var;
            i11 |= c0VarR.D(r7Var2) ? 16384 : 8192;
        } else {
            r7Var2 = r7Var;
        }
        if ((196608 & i10) == 0) {
            y3Var2 = y3Var;
            i11 |= c0VarR.D(y3Var2) ? 131072 : 65536;
        } else {
            y3Var2 = y3Var;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.I(f10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.k0(function5) ? 8388608 : 4194304;
        }
        if (c0VarR.h((4793491 & i11) != 4793490, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1539132883, i11, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1351)");
            }
            int i12 = i11;
            androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.A(a0Var, d0.x.f269223a.e(), 0.0f, 0.0f, 0.0f, 14, null);
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.d9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.K((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(androidx.compose.ui.semantics.t.f(a0VarA, false, (Function1) objI0, 1, null), r7Var2.g(), null, 2, null);
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            V(androidx.compose.ui.a0.E, function2, r7Var2.A(), r7Var2.t(), f10, androidx.compose.runtime.internal.w.e(-1658370654, true, new a(function7, function8, function6, r7Var2, y3Var2), c0VarR, 54), c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 196614 | (57344 & (i12 >> 6)));
            c0Var2 = c0VarR;
            function5.invoke(c0Var2, Integer.valueOf((i12 >> 21) & 14));
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.e9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.J(a0Var, function2, function3, function4, r7Var, y3Var, f10, function5, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, Function2 function4, r7 r7Var, androidx.compose.ui.text.y3 y3Var, float f10, Function2 function5, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        I(a0Var, function2, function3, function4, r7Var, y3Var, f10, function5, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.t1(e0Var, true);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0173  */
    /* JADX WARN: Code duplicated, block: B:120:0x017c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0180  */
    /* JADX WARN: Code duplicated, block: B:123:0x0197  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:142:0x0205  */
    /* JADX WARN: Code duplicated, block: B:144:0x0209  */
    /* JADX WARN: Code duplicated, block: B:146:0x0213  */
    /* JADX WARN: Code duplicated, block: B:150:0x0223  */
    /* JADX WARN: Code duplicated, block: B:152:0x0241  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:158:0x02af  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void L(@NotNull final z9 z9Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable y7 y7Var, @Nullable r7 r7Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z10, @Nullable androidx.compose.ui.focus.g0 g0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        r7 r7Var2;
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E;
        int i14;
        int i15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i16;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final y7 y7Var2;
        final androidx.compose.ui.focus.g0 g0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final r7 r7Var3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final boolean z13;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        androidx.compose.runtime.s5 s5VarT;
        y7 y7Var3;
        r7 r7VarI;
        boolean z14;
        int i21;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E2;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        boolean z15;
        r7 r7Var4;
        androidx.compose.ui.a0 a0Var4;
        int i22;
        androidx.compose.ui.focus.g0 g0Var3;
        Object objI0;
        Object objI1;
        boolean zD;
        Object objI2;
        androidx.compose.material3.internal.k1 k1VarA;
        androidx.compose.runtime.internal.c cVarE;
        int i23;
        boolean zK0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1105472031);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(z9Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) != 0) {
                    i23 = 128;
                } else {
                    if ((i10 & 512) == 0) {
                        zK0 = c0VarR.D(y7Var);
                    } else {
                        zK0 = c0VarR.k0(y7Var);
                    }
                    if (zK0) {
                        i23 = 256;
                    } else {
                        i23 = 128;
                    }
                }
                i12 |= i23;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    r7Var2 = r7Var;
                    int i25 = c0VarR.D(r7Var2) ? 2048 : 1024;
                    i12 |= i25;
                } else {
                    r7Var2 = r7Var;
                }
                i12 |= i25;
            } else {
                r7Var2 = r7Var;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    function2E = function2;
                    if (c0VarR.k0(function2E)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function3;
                        if (c0VarR.k0(function4)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        if ((1572864 & i10) == 0) {
                            z11 = z10;
                            if (c0VarR.G(z11)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 128;
                        if (i19 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(g0Var)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 4793491) != 4793490) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i24 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if ((i11 & 4) != 0) {
                                    objI1 = c0VarR.i0();
                                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                        c0VarR.Y(objI1);
                                    }
                                    y7Var3 = (y7) objI1;
                                    i12 &= -897;
                                } else {
                                    y7Var3 = y7Var;
                                }
                                if ((i11 & 8) != 0) {
                                    r7VarI = v7.f33887a.i(c0VarR, 6);
                                    i12 &= -7169;
                                } else {
                                    r7VarI = r7Var2;
                                }
                                if (i13 != 0) {
                                    z14 = true;
                                    function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                                    i21 = 54;
                                } else {
                                    z14 = true;
                                    i21 = 54;
                                }
                                if (i15 != 0) {
                                    function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                                } else {
                                    function2E2 = function4;
                                }
                                if (i17 != 0) {
                                    z11 = true;
                                }
                                if (i19 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = new androidx.compose.ui.focus.g0();
                                        c0VarR.Y(objI0);
                                    }
                                    int i26 = i12;
                                    g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                    z15 = z11;
                                    r7Var4 = r7VarI;
                                    i22 = i26;
                                    function4 = function2E2;
                                    function7 = function2E;
                                    a0Var4 = a0Var2;
                                } else {
                                    function4 = function2E2;
                                    function7 = function2E;
                                    z15 = z11;
                                    r7Var4 = r7VarI;
                                    a0Var4 = a0Var2;
                                    i22 = i12;
                                    g0Var3 = g0Var;
                                }
                            } else {
                                c0VarR.u();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                y7Var3 = y7Var;
                                i22 = i12;
                                function7 = function2E;
                                z15 = z11;
                                g0Var3 = g0Var;
                                a0Var4 = a0Var2;
                                r7Var4 = r7Var2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                            }
                            zD = c0VarR.D(z9Var.getLocale());
                            objI2 = c0VarR.i0();
                            if (zD || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                if (z9Var instanceof l2) {
                                    k1VarA = ((l2) z9Var).l();
                                } else {
                                    k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                                }
                                objI2 = k1VarA;
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.material3.internal.k1 k1Var = (androidx.compose.material3.internal.k1) objI2;
                            if (z15) {
                                c0VarR.E(-690551113);
                                cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-690163489);
                                c0VarR.A();
                                cVarE = null;
                            }
                            androidx.compose.runtime.internal.c cVar = cVarE;
                            d0.x xVar = d0.x.f269223a;
                            androidx.compose.ui.text.y3 y3VarE = la0.e(xVar.v(), c0VarR, 6);
                            float fS = xVar.s();
                            androidx.compose.ui.focus.g0 g0Var4 = g0Var3;
                            e eVar = new e(z9Var, k1Var, y7Var3, r7Var4, g0Var4);
                            y7 y7Var4 = y7Var3;
                            int i27 = i22 >> 9;
                            c0Var2 = c0VarR;
                            I(a0Var4, function7, function4, cVar, r7Var4, y3VarE, fS, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | ((i22 << 3) & 57344));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            y7Var2 = y7Var4;
                            g0Var2 = g0Var4;
                            z13 = z15;
                            a0Var3 = a0Var4;
                            function5 = function7;
                            r7Var3 = r7Var4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            y7Var2 = y7Var;
                            g0Var2 = g0Var;
                            a0Var3 = a0Var2;
                            r7Var3 = r7Var2;
                            function5 = function2E;
                            z13 = z11;
                        }
                        function6 = function4;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    z11 = z10;
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(g0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i28 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i28;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i29 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i29;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                        }
                        zD = c0VarR.D(z9Var.getLocale());
                        objI2 = c0VarR.i0();
                        if (zD) {
                            if (z9Var instanceof l2) {
                                k1VarA = ((l2) z9Var).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        } else {
                            if (z9Var instanceof l2) {
                                k1VarA = ((l2) z9Var).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material3.internal.k1 k1Var2 = (androidx.compose.material3.internal.k1) objI2;
                        if (z15) {
                            c0VarR.E(-690551113);
                            cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-690163489);
                            c0VarR.A();
                            cVarE = null;
                        }
                        androidx.compose.runtime.internal.c cVar2 = cVarE;
                        d0.x xVar2 = d0.x.f269223a;
                        androidx.compose.ui.text.y3 y3VarE2 = la0.e(xVar2.v(), c0VarR, 6);
                        float fS2 = xVar2.s();
                        androidx.compose.ui.focus.g0 g0Var5 = g0Var3;
                        e eVar2 = new e(z9Var, k1Var2, y7Var3, r7Var4, g0Var5);
                        y7 y7Var5 = y7Var3;
                        int i210 = i22 >> 9;
                        c0Var2 = c0VarR;
                        I(a0Var4, function7, function4, cVar2, r7Var4, y3VarE2, fS2, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar2, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i210 & com.planner5d.library.engine.input.f.b.B) | (i210 & 896) | ((i22 << 3) & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        y7Var2 = y7Var5;
                        g0Var2 = g0Var5;
                        z13 = z15;
                        a0Var3 = a0Var4;
                        function5 = function7;
                        r7Var3 = r7Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        y7Var2 = y7Var;
                        g0Var2 = g0Var;
                        a0Var3 = a0Var2;
                        r7Var3 = r7Var2;
                        function5 = function2E;
                        z13 = z11;
                    }
                    function6 = function4;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function3;
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(g0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i211 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i211;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i212 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i212;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                        }
                        zD = c0VarR.D(z9Var.getLocale());
                        objI2 = c0VarR.i0();
                        if (zD) {
                            if (z9Var instanceof l2) {
                                k1VarA = ((l2) z9Var).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        } else {
                            if (z9Var instanceof l2) {
                                k1VarA = ((l2) z9Var).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material3.internal.k1 k1Var3 = (androidx.compose.material3.internal.k1) objI2;
                        if (z15) {
                            c0VarR.E(-690551113);
                            cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-690163489);
                            c0VarR.A();
                            cVarE = null;
                        }
                        androidx.compose.runtime.internal.c cVar3 = cVarE;
                        d0.x xVar3 = d0.x.f269223a;
                        androidx.compose.ui.text.y3 y3VarE3 = la0.e(xVar3.v(), c0VarR, 6);
                        float fS3 = xVar3.s();
                        androidx.compose.ui.focus.g0 g0Var6 = g0Var3;
                        e eVar3 = new e(z9Var, k1Var3, y7Var3, r7Var4, g0Var6);
                        y7 y7Var6 = y7Var3;
                        int i213 = i22 >> 9;
                        c0Var2 = c0VarR;
                        I(a0Var4, function7, function4, cVar3, r7Var4, y3VarE3, fS3, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar3, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i213 & com.planner5d.library.engine.input.f.b.B) | (i213 & 896) | ((i22 << 3) & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        y7Var2 = y7Var6;
                        g0Var2 = g0Var6;
                        z13 = z15;
                        a0Var3 = a0Var4;
                        function5 = function7;
                        r7Var3 = r7Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        y7Var2 = y7Var;
                        g0Var2 = g0Var;
                        a0Var3 = a0Var2;
                        r7Var3 = r7Var2;
                        function5 = function2E;
                        z13 = z11;
                    }
                    function6 = function4;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z11 = z10;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i214 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i214;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i215 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i215;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zD = c0VarR.D(z9Var.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var4 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-690551113);
                        cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-690163489);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar4 = cVarE;
                    d0.x xVar4 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE4 = la0.e(xVar4.v(), c0VarR, 6);
                    float fS4 = xVar4.s();
                    androidx.compose.ui.focus.g0 g0Var7 = g0Var3;
                    e eVar4 = new e(z9Var, k1Var4, y7Var3, r7Var4, g0Var7);
                    y7 y7Var7 = y7Var3;
                    int i216 = i22 >> 9;
                    c0Var2 = c0VarR;
                    I(a0Var4, function7, function4, cVar4, r7Var4, y3VarE4, fS4, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar4, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i216 & com.planner5d.library.engine.input.f.b.B) | (i216 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var7;
                    g0Var2 = g0Var7;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function2E = function2;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(g0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i217 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i217;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i218 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i218;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                        }
                        zD = c0VarR.D(z9Var.getLocale());
                        objI2 = c0VarR.i0();
                        if (zD) {
                            if (z9Var instanceof l2) {
                                k1VarA = ((l2) z9Var).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        } else {
                            if (z9Var instanceof l2) {
                                k1VarA = ((l2) z9Var).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material3.internal.k1 k1Var5 = (androidx.compose.material3.internal.k1) objI2;
                        if (z15) {
                            c0VarR.E(-690551113);
                            cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-690163489);
                            c0VarR.A();
                            cVarE = null;
                        }
                        androidx.compose.runtime.internal.c cVar5 = cVarE;
                        d0.x xVar5 = d0.x.f269223a;
                        androidx.compose.ui.text.y3 y3VarE5 = la0.e(xVar5.v(), c0VarR, 6);
                        float fS5 = xVar5.s();
                        androidx.compose.ui.focus.g0 g0Var8 = g0Var3;
                        e eVar5 = new e(z9Var, k1Var5, y7Var3, r7Var4, g0Var8);
                        y7 y7Var8 = y7Var3;
                        int i219 = i22 >> 9;
                        c0Var2 = c0VarR;
                        I(a0Var4, function7, function4, cVar5, r7Var4, y3VarE5, fS5, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar5, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i219 & com.planner5d.library.engine.input.f.b.B) | (i219 & 896) | ((i22 << 3) & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        y7Var2 = y7Var8;
                        g0Var2 = g0Var8;
                        z13 = z15;
                        a0Var3 = a0Var4;
                        function5 = function7;
                        r7Var3 = r7Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        y7Var2 = y7Var;
                        g0Var2 = g0Var;
                        a0Var3 = a0Var2;
                        r7Var3 = r7Var2;
                        function5 = function2E;
                        z13 = z11;
                    }
                    function6 = function4;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z11 = z10;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i2110 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i2110;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i2111 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i2111;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zD = c0VarR.D(z9Var.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var6 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-690551113);
                        cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-690163489);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar6 = cVarE;
                    d0.x xVar6 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE6 = la0.e(xVar6.v(), c0VarR, 6);
                    float fS6 = xVar6.s();
                    androidx.compose.ui.focus.g0 g0Var9 = g0Var3;
                    e eVar6 = new e(z9Var, k1Var6, y7Var3, r7Var4, g0Var9);
                    y7 y7Var9 = y7Var3;
                    int i2112 = i22 >> 9;
                    c0Var2 = c0VarR;
                    I(a0Var4, function7, function4, cVar6, r7Var4, y3VarE6, fS6, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar6, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i2112 & com.planner5d.library.engine.input.f.b.B) | (i2112 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var9;
                    g0Var2 = g0Var9;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function3;
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i2113 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i2113;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i2114 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i2114;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zD = c0VarR.D(z9Var.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var7 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-690551113);
                        cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-690163489);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar7 = cVarE;
                    d0.x xVar7 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE7 = la0.e(xVar7.v(), c0VarR, 6);
                    float fS7 = xVar7.s();
                    androidx.compose.ui.focus.g0 g0Var10 = g0Var3;
                    e eVar7 = new e(z9Var, k1Var7, y7Var3, r7Var4, g0Var10);
                    y7 y7Var10 = y7Var3;
                    int i2115 = i22 >> 9;
                    c0Var2 = c0VarR;
                    I(a0Var4, function7, function4, cVar7, r7Var4, y3VarE7, fS7, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar7, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i2115 & com.planner5d.library.engine.input.f.b.B) | (i2115 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var10;
                    g0Var2 = g0Var10;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z11 = z10;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(g0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i2116 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i2116;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i2117 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i2117;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                }
                zD = c0VarR.D(z9Var.getLocale());
                objI2 = c0VarR.i0();
                if (zD) {
                    if (z9Var instanceof l2) {
                        k1VarA = ((l2) z9Var).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                } else {
                    if (z9Var instanceof l2) {
                        k1VarA = ((l2) z9Var).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                }
                androidx.compose.material3.internal.k1 k1Var8 = (androidx.compose.material3.internal.k1) objI2;
                if (z15) {
                    c0VarR.E(-690551113);
                    cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-690163489);
                    c0VarR.A();
                    cVarE = null;
                }
                androidx.compose.runtime.internal.c cVar8 = cVarE;
                d0.x xVar8 = d0.x.f269223a;
                androidx.compose.ui.text.y3 y3VarE8 = la0.e(xVar8.v(), c0VarR, 6);
                float fS8 = xVar8.s();
                androidx.compose.ui.focus.g0 g0Var11 = g0Var3;
                e eVar8 = new e(z9Var, k1Var8, y7Var3, r7Var4, g0Var11);
                y7 y7Var11 = y7Var3;
                int i2118 = i22 >> 9;
                c0Var2 = c0VarR;
                I(a0Var4, function7, function4, cVar8, r7Var4, y3VarE8, fS8, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar8, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i2118 & com.planner5d.library.engine.input.f.b.B) | (i2118 & 896) | ((i22 << 3) & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                y7Var2 = y7Var11;
                g0Var2 = g0Var11;
                z13 = z15;
                a0Var3 = a0Var4;
                function5 = function7;
                r7Var3 = r7Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                y7Var2 = y7Var;
                g0Var2 = g0Var;
                a0Var3 = a0Var2;
                r7Var3 = r7Var2;
                function5 = function2E;
                z13 = z11;
            }
            function6 = function4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) != 0) {
                i23 = 128;
            } else {
                if ((i10 & 512) == 0) {
                    zK0 = c0VarR.D(y7Var);
                } else {
                    zK0 = c0VarR.k0(y7Var);
                }
                if (zK0) {
                    i23 = 256;
                } else {
                    i23 = 128;
                }
            }
            i12 |= i23;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                r7Var2 = r7Var;
                if (c0VarR.D(r7Var2)) {
                }
                i12 |= i25;
            } else {
                r7Var2 = r7Var;
            }
            i12 |= i25;
        } else {
            r7Var2 = r7Var;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                function2E = function2;
                if (c0VarR.k0(function2E)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(g0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i2119 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i2119;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i21110 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i21110;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                        }
                        zD = c0VarR.D(z9Var.getLocale());
                        objI2 = c0VarR.i0();
                        if (zD) {
                            if (z9Var instanceof l2) {
                                k1VarA = ((l2) z9Var).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        } else {
                            if (z9Var instanceof l2) {
                                k1VarA = ((l2) z9Var).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material3.internal.k1 k1Var9 = (androidx.compose.material3.internal.k1) objI2;
                        if (z15) {
                            c0VarR.E(-690551113);
                            cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-690163489);
                            c0VarR.A();
                            cVarE = null;
                        }
                        androidx.compose.runtime.internal.c cVar9 = cVarE;
                        d0.x xVar9 = d0.x.f269223a;
                        androidx.compose.ui.text.y3 y3VarE9 = la0.e(xVar9.v(), c0VarR, 6);
                        float fS9 = xVar9.s();
                        androidx.compose.ui.focus.g0 g0Var12 = g0Var3;
                        e eVar9 = new e(z9Var, k1Var9, y7Var3, r7Var4, g0Var12);
                        y7 y7Var12 = y7Var3;
                        int i21111 = i22 >> 9;
                        c0Var2 = c0VarR;
                        I(a0Var4, function7, function4, cVar9, r7Var4, y3VarE9, fS9, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar9, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i21111 & com.planner5d.library.engine.input.f.b.B) | (i21111 & 896) | ((i22 << 3) & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        y7Var2 = y7Var12;
                        g0Var2 = g0Var12;
                        z13 = z15;
                        a0Var3 = a0Var4;
                        function5 = function7;
                        r7Var3 = r7Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        y7Var2 = y7Var;
                        g0Var2 = g0Var;
                        a0Var3 = a0Var2;
                        r7Var3 = r7Var2;
                        function5 = function2E;
                        z13 = z11;
                    }
                    function6 = function4;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z11 = z10;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i21112 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i21112;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i21113 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i21113;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zD = c0VarR.D(z9Var.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var10 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-690551113);
                        cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-690163489);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar10 = cVarE;
                    d0.x xVar10 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE10 = la0.e(xVar10.v(), c0VarR, 6);
                    float fS10 = xVar10.s();
                    androidx.compose.ui.focus.g0 g0Var13 = g0Var3;
                    e eVar10 = new e(z9Var, k1Var10, y7Var3, r7Var4, g0Var13);
                    y7 y7Var13 = y7Var3;
                    int i21114 = i22 >> 9;
                    c0Var2 = c0VarR;
                    I(a0Var4, function7, function4, cVar10, r7Var4, y3VarE10, fS10, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar10, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i21114 & com.planner5d.library.engine.input.f.b.B) | (i21114 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var13;
                    g0Var2 = g0Var13;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function3;
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i21115 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i21115;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i21116 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i21116;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zD = c0VarR.D(z9Var.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var11 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-690551113);
                        cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-690163489);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar11 = cVarE;
                    d0.x xVar11 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE11 = la0.e(xVar11.v(), c0VarR, 6);
                    float fS11 = xVar11.s();
                    androidx.compose.ui.focus.g0 g0Var14 = g0Var3;
                    e eVar11 = new e(z9Var, k1Var11, y7Var3, r7Var4, g0Var14);
                    y7 y7Var14 = y7Var3;
                    int i21117 = i22 >> 9;
                    c0Var2 = c0VarR;
                    I(a0Var4, function7, function4, cVar11, r7Var4, y3VarE11, fS11, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar11, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i21117 & com.planner5d.library.engine.input.f.b.B) | (i21117 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var14;
                    g0Var2 = g0Var14;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z11 = z10;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(g0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i21118 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i21118;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i21119 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i21119;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                }
                zD = c0VarR.D(z9Var.getLocale());
                objI2 = c0VarR.i0();
                if (zD) {
                    if (z9Var instanceof l2) {
                        k1VarA = ((l2) z9Var).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                } else {
                    if (z9Var instanceof l2) {
                        k1VarA = ((l2) z9Var).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                }
                androidx.compose.material3.internal.k1 k1Var12 = (androidx.compose.material3.internal.k1) objI2;
                if (z15) {
                    c0VarR.E(-690551113);
                    cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-690163489);
                    c0VarR.A();
                    cVarE = null;
                }
                androidx.compose.runtime.internal.c cVar12 = cVarE;
                d0.x xVar12 = d0.x.f269223a;
                androidx.compose.ui.text.y3 y3VarE12 = la0.e(xVar12.v(), c0VarR, 6);
                float fS12 = xVar12.s();
                androidx.compose.ui.focus.g0 g0Var15 = g0Var3;
                e eVar12 = new e(z9Var, k1Var12, y7Var3, r7Var4, g0Var15);
                y7 y7Var15 = y7Var3;
                int i211110 = i22 >> 9;
                c0Var2 = c0VarR;
                I(a0Var4, function7, function4, cVar12, r7Var4, y3VarE12, fS12, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar12, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i211110 & com.planner5d.library.engine.input.f.b.B) | (i211110 & 896) | ((i22 << 3) & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                y7Var2 = y7Var15;
                g0Var2 = g0Var15;
                z13 = z15;
                a0Var3 = a0Var4;
                function5 = function7;
                r7Var3 = r7Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                y7Var2 = y7Var;
                g0Var2 = g0Var;
                a0Var3 = a0Var2;
                r7Var3 = r7Var2;
                function5 = function2E;
                z13 = z11;
            }
            function6 = function4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function2E = function2;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                function4 = function3;
                if (c0VarR.k0(function4)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i211111 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i211111;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i211112 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i211112;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zD = c0VarR.D(z9Var.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (z9Var instanceof l2) {
                            k1VarA = ((l2) z9Var).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var13 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-690551113);
                        cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-690163489);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar13 = cVarE;
                    d0.x xVar13 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE13 = la0.e(xVar13.v(), c0VarR, 6);
                    float fS13 = xVar13.s();
                    androidx.compose.ui.focus.g0 g0Var16 = g0Var3;
                    e eVar13 = new e(z9Var, k1Var13, y7Var3, r7Var4, g0Var16);
                    y7 y7Var16 = y7Var3;
                    int i211113 = i22 >> 9;
                    c0Var2 = c0VarR;
                    I(a0Var4, function7, function4, cVar13, r7Var4, y3VarE13, fS13, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar13, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i211113 & com.planner5d.library.engine.input.f.b.B) | (i211113 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var16;
                    g0Var2 = g0Var16;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z11 = z10;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(g0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i211114 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i211114;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i211115 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i211115;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                }
                zD = c0VarR.D(z9Var.getLocale());
                objI2 = c0VarR.i0();
                if (zD) {
                    if (z9Var instanceof l2) {
                        k1VarA = ((l2) z9Var).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                } else {
                    if (z9Var instanceof l2) {
                        k1VarA = ((l2) z9Var).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                }
                androidx.compose.material3.internal.k1 k1Var14 = (androidx.compose.material3.internal.k1) objI2;
                if (z15) {
                    c0VarR.E(-690551113);
                    cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-690163489);
                    c0VarR.A();
                    cVarE = null;
                }
                androidx.compose.runtime.internal.c cVar14 = cVarE;
                d0.x xVar14 = d0.x.f269223a;
                androidx.compose.ui.text.y3 y3VarE14 = la0.e(xVar14.v(), c0VarR, 6);
                float fS14 = xVar14.s();
                androidx.compose.ui.focus.g0 g0Var17 = g0Var3;
                e eVar14 = new e(z9Var, k1Var14, y7Var3, r7Var4, g0Var17);
                y7 y7Var17 = y7Var3;
                int i211116 = i22 >> 9;
                c0Var2 = c0VarR;
                I(a0Var4, function7, function4, cVar14, r7Var4, y3VarE14, fS14, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar14, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i211116 & com.planner5d.library.engine.input.f.b.B) | (i211116 & 896) | ((i22 << 3) & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                y7Var2 = y7Var17;
                g0Var2 = g0Var17;
                z13 = z15;
                a0Var3 = a0Var4;
                function5 = function7;
                r7Var3 = r7Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                y7Var2 = y7Var;
                g0Var2 = g0Var;
                a0Var3 = a0Var2;
                r7Var3 = r7Var2;
                function5 = function2E;
                z13 = z11;
            }
            function6 = function4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function4 = function3;
        i17 = i11 & 64;
        if (i17 != 0) {
            if ((1572864 & i10) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(g0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i211117 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i211117;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i211118 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i211118;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                }
                zD = c0VarR.D(z9Var.getLocale());
                objI2 = c0VarR.i0();
                if (zD) {
                    if (z9Var instanceof l2) {
                        k1VarA = ((l2) z9Var).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                } else {
                    if (z9Var instanceof l2) {
                        k1VarA = ((l2) z9Var).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                }
                androidx.compose.material3.internal.k1 k1Var15 = (androidx.compose.material3.internal.k1) objI2;
                if (z15) {
                    c0VarR.E(-690551113);
                    cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-690163489);
                    c0VarR.A();
                    cVarE = null;
                }
                androidx.compose.runtime.internal.c cVar15 = cVarE;
                d0.x xVar15 = d0.x.f269223a;
                androidx.compose.ui.text.y3 y3VarE15 = la0.e(xVar15.v(), c0VarR, 6);
                float fS15 = xVar15.s();
                androidx.compose.ui.focus.g0 g0Var18 = g0Var3;
                e eVar15 = new e(z9Var, k1Var15, y7Var3, r7Var4, g0Var18);
                y7 y7Var18 = y7Var3;
                int i211119 = i22 >> 9;
                c0Var2 = c0VarR;
                I(a0Var4, function7, function4, cVar15, r7Var4, y3VarE15, fS15, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar15, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i211119 & com.planner5d.library.engine.input.f.b.B) | (i211119 & 896) | ((i22 << 3) & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                y7Var2 = y7Var18;
                g0Var2 = g0Var18;
                z13 = z15;
                a0Var3 = a0Var4;
                function5 = function7;
                r7Var3 = r7Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                y7Var2 = y7Var;
                g0Var2 = g0Var;
                a0Var3 = a0Var2;
                r7Var3 = r7Var2;
                function5 = function2E;
                z13 = z11;
            }
            function6 = function4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        z11 = z10;
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.D(g0Var)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        if ((i12 & 4793491) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                        c0VarR.Y(objI1);
                    }
                    y7Var3 = (y7) objI1;
                    i12 &= -897;
                } else {
                    y7Var3 = y7Var;
                }
                if ((i11 & 8) != 0) {
                    r7VarI = v7.f33887a.i(c0VarR, 6);
                    i12 &= -7169;
                } else {
                    r7VarI = r7Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                    function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                    i21 = 54;
                } else {
                    z14 = true;
                    i21 = 54;
                }
                if (i15 != 0) {
                    function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                } else {
                    function2E2 = function4;
                }
                if (i17 != 0) {
                    z11 = true;
                }
                if (i19 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new androidx.compose.ui.focus.g0();
                        c0VarR.Y(objI0);
                    }
                    int i2111110 = i12;
                    g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                    z15 = z11;
                    r7Var4 = r7VarI;
                    i22 = i2111110;
                    function4 = function2E2;
                    function7 = function2E;
                    a0Var4 = a0Var2;
                } else {
                    function4 = function2E2;
                    function7 = function2E;
                    z15 = z11;
                    r7Var4 = r7VarI;
                    a0Var4 = a0Var2;
                    i22 = i12;
                    g0Var3 = g0Var;
                }
            } else {
                if (i24 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                        c0VarR.Y(objI1);
                    }
                    y7Var3 = (y7) objI1;
                    i12 &= -897;
                } else {
                    y7Var3 = y7Var;
                }
                if ((i11 & 8) != 0) {
                    r7VarI = v7.f33887a.i(c0VarR, 6);
                    i12 &= -7169;
                } else {
                    r7VarI = r7Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                    function2E = androidx.compose.runtime.internal.w.e(1655706771, true, new b(z9Var, r7VarI), c0VarR, 54);
                    i21 = 54;
                } else {
                    z14 = true;
                    i21 = 54;
                }
                if (i15 != 0) {
                    function2E2 = androidx.compose.runtime.internal.w.e(1439279037, z14, new c(z9Var, y7Var3, r7VarI), c0VarR, i21);
                } else {
                    function2E2 = function4;
                }
                if (i17 != 0) {
                    z11 = true;
                }
                if (i19 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new androidx.compose.ui.focus.g0();
                        c0VarR.Y(objI0);
                    }
                    int i2111111 = i12;
                    g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                    z15 = z11;
                    r7Var4 = r7VarI;
                    i22 = i2111111;
                    function4 = function2E2;
                    function7 = function2E;
                    a0Var4 = a0Var2;
                } else {
                    function4 = function2E2;
                    function7 = function2E;
                    z15 = z11;
                    r7Var4 = r7VarI;
                    a0Var4 = a0Var2;
                    i22 = i12;
                    g0Var3 = g0Var;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1105472031, i22, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
            }
            zD = c0VarR.D(z9Var.getLocale());
            objI2 = c0VarR.i0();
            if (zD) {
                if (z9Var instanceof l2) {
                    k1VarA = ((l2) z9Var).l();
                } else {
                    k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                }
                objI2 = k1VarA;
                c0VarR.Y(objI2);
            } else {
                if (z9Var instanceof l2) {
                    k1VarA = ((l2) z9Var).l();
                } else {
                    k1VarA = androidx.compose.material3.internal.n1.a(z9Var.getLocale());
                }
                objI2 = k1VarA;
                c0VarR.Y(objI2);
            }
            androidx.compose.material3.internal.k1 k1Var16 = (androidx.compose.material3.internal.k1) objI2;
            if (z15) {
                c0VarR.E(-690551113);
                cVarE = androidx.compose.runtime.internal.w.e(-1483431603, true, new d(z9Var, r7Var4), c0VarR, 54);
                c0VarR.A();
            } else {
                c0VarR.E(-690163489);
                c0VarR.A();
                cVarE = null;
            }
            androidx.compose.runtime.internal.c cVar16 = cVarE;
            d0.x xVar16 = d0.x.f269223a;
            androidx.compose.ui.text.y3 y3VarE16 = la0.e(xVar16.v(), c0VarR, 6);
            float fS16 = xVar16.s();
            androidx.compose.ui.focus.g0 g0Var19 = g0Var3;
            e eVar16 = new e(z9Var, k1Var16, y7Var3, r7Var4, g0Var19);
            y7 y7Var19 = y7Var3;
            int i2111112 = i22 >> 9;
            c0Var2 = c0VarR;
            I(a0Var4, function7, function4, cVar16, r7Var4, y3VarE16, fS16, androidx.compose.runtime.internal.w.e(-1346903698, true, eVar16, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i2111112 & com.planner5d.library.engine.input.f.b.B) | (i2111112 & 896) | ((i22 << 3) & 57344));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            y7Var2 = y7Var19;
            g0Var2 = g0Var19;
            z13 = z15;
            a0Var3 = a0Var4;
            function5 = function7;
            r7Var3 = r7Var4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            y7Var2 = y7Var;
            g0Var2 = g0Var;
            a0Var3 = a0Var2;
            r7Var3 = r7Var2;
            function5 = function2E;
            z13 = z11;
        }
        function6 = function4;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.M(z9Var, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(z9 z9Var, androidx.compose.ui.a0 a0Var, y7 y7Var, r7 r7Var, Function2 function2, Function2 function3, boolean z10, androidx.compose.ui.focus.g0 g0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        L(z9Var, a0Var, y7Var, r7Var, function2, function3, z10, g0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void N(final Long l10, final long j10, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function2, final androidx.compose.material3.internal.k1 k1Var, final IntRange intRange, final y7 y7Var, final ww wwVar, final r7 r7Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-434467002);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.L(j10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(k1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= (2097152 & i10) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.D(wwVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c0VarR.D(r7Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if (c0VarR.h((38347923 & i11) != 38347922, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-434467002, i11, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1537)");
            }
            androidx.compose.material3.internal.o1 o1VarN = k1Var.n(j10);
            int iU = kotlin.ranges.r.u(o1VarN.o(intRange), 0);
            final androidx.compose.foundation.lazy.j1 j1VarF = androidx.compose.foundation.lazy.o1.f(iU, 0, c0VarR, 0, 2);
            Integer numValueOf = Integer.valueOf(iU);
            boolean zD = c0VarR.D(j1VarF) | c0VarR.K(iU);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new f(j1VarF, iU, null);
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.i(numValueOf, (Function2) objI0, c0VarR, 0);
            Object objI1 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI1;
            Object[] objArr = new Object[0];
            Object objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = new Function0() { // from class: androidx.compose.material3.u8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i9.O();
                    }
                };
                c0VarR.Y(objI2);
            }
            final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) androidx.compose.runtime.saveable.i.k(objArr, (Function0) objI2, c0VarR, 48);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY = qVar.y();
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar3.u(), c0VarR, 0);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar2);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            int i12 = i11;
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar4.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            float f10 = f28367c;
            androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(aVar2, f10, 0.0f, 2, null);
            boolean zF = j1VarF.f();
            boolean zK = j1VarF.k();
            boolean zP = P(n3Var);
            String strA = y7Var.a(Long.valueOf(j10), k1Var.l());
            if (strA == null) {
                strA = "-";
            }
            boolean zK0 = c0VarR.k0(s0Var) | c0VarR.D(j1VarF);
            String str = strA;
            Object objI3 = c0VarR.i0();
            if (zK0 || objI3 == aVar.a()) {
                objI3 = new Function0() { // from class: androidx.compose.material3.v8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i9.R(s0Var, j1VarF);
                    }
                };
                c0VarR.Y(objI3);
            }
            Function0 function0 = (Function0) objI3;
            boolean zK1 = c0VarR.k0(s0Var) | c0VarR.D(j1VarF);
            Object objI4 = c0VarR.i0();
            if (zK1 || objI4 == aVar.a()) {
                objI4 = new Function0() { // from class: androidx.compose.material3.x8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i9.S(s0Var, j1VarF);
                    }
                };
                c0VarR.Y(objI4);
            }
            Function0 function3 = (Function0) objI4;
            boolean zD2 = c0VarR.D(n3Var);
            Object objI5 = c0VarR.i0();
            if (zD2 || objI5 == aVar.a()) {
                objI5 = new Function0() { // from class: androidx.compose.material3.y8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i9.T(n3Var);
                    }
                };
                c0VarR.Y(objI5);
            }
            Function0 function4 = (Function0) objI5;
            int i13 = i12 & 234881024;
            m0(a0VarT, zF, zK, zP, str, function0, function3, function4, r7Var, c0VarR, i13 | 6);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar2);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
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
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar4.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.a0 a0VarT2 = androidx.compose.foundation.layout.d5.t(aVar2, f10, 0.0f, 2, null);
            androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar3.u(), c0VarR, 0);
            int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarT2);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar4.a();
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
            androidx.compose.runtime.y7.n(c0VarD3, a1VarB2, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar4.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar4.f());
            x0(r7Var, k1Var, c0VarR, ((i12 >> 24) & 14) | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B));
            e0(j1VarF, l10, function1, function2, k1Var, intRange, y7Var, wwVar, r7Var, c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (i12 & 29360128) | i13);
            c0VarR.o();
            d0.h1 h1Var = d0.h1.DefaultEffects;
            androidx.compose.animation.core.y0 y0VarB = hm.b(h1Var, c0VarR, 6);
            androidx.compose.animation.core.y0 y0VarB2 = hm.b(d0.h1.FastEffects, c0VarR, 6);
            androidx.compose.animation.core.y0 y0VarB3 = hm.b(h1Var, c0VarR, 6);
            androidx.compose.animation.k.j(P(n3Var), androidx.compose.ui.draw.j.b(aVar2), androidx.compose.animation.b0.m(y0VarB3, null, false, null, 14, null).c(androidx.compose.animation.b0.n(y0VarB, 0.6f)), androidx.compose.animation.b0.C(y0VarB3, null, false, null, 14, null).d(androidx.compose.animation.b0.q(y0VarB2, 0.0f, 2, null)), null, androidx.compose.runtime.internal.w.e(1193716082, true, new i(j10, n3Var, s0Var, j1VarF, intRange, o1VarN, wwVar, k1Var, r7Var), c0VarR, 54), c0VarR, 196656, 16);
            c0VarR = c0VarR;
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.z8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.U(l10, j10, function1, function2, k1Var, intRange, y7Var, wwVar, r7Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.n3 O() {
        return androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P(androidx.compose.runtime.n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(androidx.compose.runtime.n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(kotlinx.coroutines.s0 s0Var, androidx.compose.foundation.lazy.j1 j1Var) {
        kotlinx.coroutines.k.f(s0Var, null, null, new g(j1Var, null), 3, null);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final String R0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(502032503, i10, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1972)");
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            c0Var.E(974450583);
            if (z12) {
                c0Var.E(1416909399);
                androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                sb2.append(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.I), c0Var, 0));
                c0Var.A();
            } else if (z13) {
                c0Var.E(1416913397);
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                sb2.append(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.F), c0Var, 0));
                c0Var.A();
            } else if (z14) {
                c0Var.E(1416917332);
                androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                sb2.append(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.E), c0Var, 0));
                c0Var.A();
            } else {
                c0Var.E(974832875);
                c0Var.A();
            }
            c0Var.A();
        } else {
            c0Var.E(974838827);
            c0Var.A();
        }
        if (z11) {
            c0Var.E(1416920485);
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            androidx.compose.material3.internal.l3.a aVar4 = androidx.compose.material3.internal.l3.f29010b;
            sb2.append(androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.A), c0Var, 0));
            c0Var.A();
        } else {
            c0Var.E(975029291);
            c0Var.A();
        }
        String string = sb2.length() == 0 ? null : sb2.toString();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(kotlinx.coroutines.s0 s0Var, androidx.compose.foundation.lazy.j1 j1Var) {
        int i10 = 5 ^ 0;
        kotlinx.coroutines.k.f(s0Var, null, null, new h(j1Var, null), 3, null);
        return Unit.f312394a;
    }

    public static final float S0() {
        return f28367c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(androidx.compose.runtime.n3 n3Var) {
        Q(n3Var, !P(n3Var));
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.foundation.layout.g5 T0() {
        return f28368d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(Long l10, long j10, Function1 function1, Function1 function2, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        N(l10, j10, function1, function2, k1Var, intRange, y7Var, wwVar, r7Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final float U0() {
        return f28366b;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void V(@NotNull final androidx.compose.ui.a0 a0Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final long j10, final long j11, final float f10, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2020490761);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.L(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.L(j11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.I(f10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(function3) ? 131072 : 65536;
        }
        if (c0VarR.h((74899 & i11) != 74898, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2020490761, i11, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1677)");
            }
            androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.h(a0Var, 0.0f, 1, null).B2(function2 != null ? androidx.compose.foundation.layout.i6.b(androidx.compose.ui.a0.E, 0.0f, f10, 1, null) : androidx.compose.ui.a0.E);
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.s(), androidx.compose.ui.e.f37317a.u(), c0VarR, 6);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB2);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            if (function2 != null) {
                c0VarR.E(396894187);
                androidx.compose.material3.internal.k3.b(j10, la0.e(d0.x.f269223a.x(), c0VarR, 6), androidx.compose.runtime.internal.w.e(1344395458, true, new j(function2), c0VarR, 54), c0VarR, ((i11 >> 6) & 14) | androidx.media3.exoplayer.a5.S0);
                c0VarR.A();
            } else {
                c0VarR.E(397163267);
                c0VarR.A();
            }
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j11)), function3, c0VarR, androidx.compose.runtime.n4.f36267i | ((i11 >> 12) & com.planner5d.library.engine.input.f.b.B));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.W(a0Var, function2, j10, j11, f10, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float V0() {
        return f28365a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(androidx.compose.ui.a0 a0Var, Function2 function2, long j10, long j11, float f10, Function2 function3, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        V(a0Var, function2, j10, j11, f10, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final int W0(@NotNull IntRange intRange) {
        return ((intRange.m() - intRange.l()) + 1) * 12;
    }

    @NotNull
    public static final z9 X(@NotNull Locale locale, @Nullable Long l10, @Nullable Long l11, @NotNull IntRange intRange, int i10, @NotNull ww wwVar) {
        return new ca(l10, l11, intRange, i10, wwVar, locale, null);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final z9 X0(@Nullable Long l10, @Nullable Long l11, @Nullable IntRange intRange, int i10, @Nullable ww wwVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        if ((i12 & 1) != 0) {
            l10 = null;
        }
        final Long l12 = l10;
        final Long l13 = (i12 & 2) != 0 ? l12 : l11;
        if ((i12 & 4) != 0) {
            intRange = v7.f33887a.q();
        }
        final IntRange intRange2 = intRange;
        if ((i12 & 8) != 0) {
            i10 = ed.f27323b.b();
        }
        final int i13 = i10;
        if ((i12 & 16) != 0) {
            wwVar = v7.f33887a.m();
        }
        final ww wwVar2 = wwVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2065763010, i11, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:373)");
        }
        final Locale localeA = b4.a(c0Var, 0);
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<ca, Object> c0VarC = ca.f26520i.c(wwVar2, localeA);
        boolean z10 = true;
        boolean zK0 = ((((i11 & 14) ^ 6) > 4 && c0Var.D(l12)) || (i11 & 6) == 4) | ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(l13)) || (i11 & 48) == 32) | c0Var.k0(intRange2) | ((((i11 & 7168) ^ 3072) > 2048 && c0Var.K(i13)) || (i11 & 3072) == 2048);
        if ((((57344 & i11) ^ 24576) <= 16384 || !c0Var.D(wwVar2)) && (i11 & 24576) != 16384) {
            z10 = false;
        }
        boolean zK1 = zK0 | z10 | c0Var.k0(localeA);
        Object objI0 = c0Var.i0();
        if (zK1 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            Object obj = new Function0() { // from class: androidx.compose.material3.b8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i9.Y0(l12, l13, intRange2, i13, wwVar2, localeA);
                }
            };
            c0Var.Y(obj);
            objI0 = obj;
        }
        ca caVar = (ca) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI0, c0Var, 0);
        caVar.m(wwVar2);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return caVar;
    }

    public static /* synthetic */ z9 Y(Locale locale, Long l10, Long l11, IntRange intRange, int i10, ww wwVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l10 = null;
        }
        if ((i11 & 4) != 0) {
            l11 = l10;
        }
        if ((i11 & 8) != 0) {
            intRange = v7.f33887a.q();
        }
        if ((i11 & 16) != 0) {
            i10 = ed.f27323b.b();
        }
        if ((i11 & 32) != 0) {
            wwVar = v7.f33887a.m();
        }
        ww wwVar2 = wwVar;
        IntRange intRange2 = intRange;
        return X(locale, l10, l11, intRange2, i10, wwVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ca Y0(Long l10, Long l11, IntRange intRange, int i10, ww wwVar, Locale locale) {
        return new ca(l10, l11, intRange, i10, wwVar, locale, null);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void Z(final String str, final androidx.compose.ui.a0 a0Var, final boolean z10, final Function0<Unit> function0, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final String str2, final r7 r7Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        boolean z15;
        boolean z16;
        boolean z17;
        r7 r7Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-945355136);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(function0) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            z15 = z11;
            i11 |= c0VarR.G(z15) ? 16384 : 8192;
        } else {
            z15 = z11;
        }
        if ((196608 & i10) == 0) {
            z16 = z12;
            i11 |= c0VarR.G(z16) ? 131072 : 65536;
        } else {
            z16 = z12;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.G(z13) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            z17 = z14;
            i11 |= c0VarR.G(z17) ? 8388608 : 4194304;
        } else {
            z17 = z14;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c0VarR.D(str2) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((805306368 & i10) == 0) {
            r7Var2 = r7Var;
            i11 |= c0VarR.D(r7Var2) ? 536870912 : 268435456;
        } else {
            r7Var2 = r7Var;
        }
        if (c0VarR.h((306783379 & i11) != 306783378, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-945355136, i11, -1, "androidx.compose.material3.Day (DatePicker.kt:2003)");
            }
            boolean z18 = (234881024 & i11) == 67108864;
            Object objI0 = c0VarR.i0();
            if (z18 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.e8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.a0(str2, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarE = androidx.compose.ui.semantics.t.e(a0Var, true, (Function1) objI0);
            d0.x xVar = d0.x.f269223a;
            int i12 = i11 >> 6;
            u10.d(z10, function0, a0VarE, z12, cx.i(xVar.g(), c0VarR, 6), r7Var2.e(z10, z16, z15, c0VarR, (i12 & 14) | ((i11 >> 12) & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i11 >> 18) & 7168)).getValue().M(), 0L, 0.0f, 0.0f, (!z13 || z10) ? null : androidx.compose.foundation.b1.a(xVar.p(), r7Var.C()), null, androidx.compose.runtime.internal.w.e(1126347158, true, new k(str, r7Var, z13, z10, z17, z12), c0VarR, 54), c0VarR, i12 & 7294, 48, 1472);
            c0VarR = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.f8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.b0(str, a0Var, z10, function0, z11, z12, z13, z14, str2, r7Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Nullable
    public static final Object Z0(@NotNull final androidx.compose.foundation.lazy.j1 j1Var, @NotNull Function1<? super Long, Unit> function1, @NotNull androidx.compose.material3.internal.k1 k1Var, @NotNull IntRange intRange, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = androidx.compose.runtime.w6.y(new Function0() { // from class: androidx.compose.material3.a9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(i9.a1(j1Var));
            }
        }).collect(new w(j1Var, function1, k1Var, intRange), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.T1(e0Var, new androidx.compose.ui.text.f(str, null, 2, null));
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a1(androidx.compose.foundation.lazy.j1 j1Var) {
        return j1Var.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(String str, androidx.compose.ui.a0 a0Var, boolean z10, Function0 function0, boolean z11, boolean z12, boolean z13, boolean z14, String str2, r7 r7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Z(str, a0Var, z10, function0, z11, z12, z13, z14, str2, r7Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void c0(@NotNull final androidx.compose.ui.a0 a0Var, final int i10, @NotNull final Function1<? super ed, Unit> function1, @NotNull final r7 r7Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1461252485);
        if ((i11 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0VarR.K(i10) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0VarR.D(r7Var) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1461252485, i12, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1406)");
            }
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(r7Var.t())), androidx.compose.runtime.internal.w.e(-1734512197, true, new l(i10, function1, a0Var), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.t8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.d0(a0Var, i10, function1, r7Var, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(androidx.compose.ui.a0 a0Var, int i10, Function1 function1, r7 r7Var, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c0(a0Var, i10, function1, r7Var, c0Var, androidx.compose.runtime.t4.a(i11 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void e0(androidx.compose.foundation.lazy.j1 j1Var, final Long l10, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function2, final androidx.compose.material3.internal.k1 k1Var, final IntRange intRange, final y7 y7Var, final ww wwVar, final r7 r7Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Long l11;
        Function1<? super Long, Unit> function3;
        ww wwVar2;
        r7 r7Var2;
        Object nVar;
        final androidx.compose.foundation.lazy.j1 j1Var2 = j1Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1994757941);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(j1Var2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            l11 = l10;
            i11 |= c0VarR.D(l11) ? 32 : 16;
        } else {
            l11 = l10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            function3 = function1;
            i11 |= c0VarR.k0(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(k1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= (2097152 & i10) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            wwVar2 = wwVar;
            i11 |= c0VarR.D(wwVar2) ? 8388608 : 4194304;
        } else {
            wwVar2 = wwVar;
        }
        if ((100663296 & i10) == 0) {
            r7Var2 = r7Var;
            i11 |= c0VarR.D(r7Var2) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        } else {
            r7Var2 = r7Var;
        }
        if (c0VarR.h((38347923 & i11) != 38347922, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1994757941, i11, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1711)");
            }
            androidx.compose.material3.internal.j1 j1VarP = k1Var.p();
            boolean zD = c0VarR.D(intRange);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = k1Var.m(intRange.l(), 1);
                c0VarR.Y(objI0);
            }
            int i12 = i11;
            q50.o(la0.e(d0.x.f269223a.i(), c0VarR, 6), androidx.compose.runtime.internal.w.e(1504086906, true, new m(j1Var2, intRange, k1Var, (androidx.compose.material3.internal.o1) objI0, function3, j1VarP, l11, y7Var, wwVar2, r7Var2), c0VarR, 54), c0VarR, 48);
            int i13 = i12 & 14;
            boolean zK0 = (i13 == 4) | ((i12 & 7168) == 2048) | c0VarR.k0(k1Var) | c0VarR.k0(intRange);
            Object objI1 = c0VarR.i0();
            if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                j1Var2 = j1Var;
                nVar = new n(j1Var2, function2, k1Var, intRange, null);
                c0VarR.Y(nVar);
            } else {
                nVar = objI1;
                j1Var2 = j1Var;
            }
            androidx.compose.runtime.b2.i(j1Var2, (Function2) nVar, c0VarR, i13);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.q8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.f0(j1Var2, l10, function1, function2, k1Var, intRange, y7Var, wwVar, r7Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(androidx.compose.foundation.lazy.j1 j1Var, Long l10, Function1 function1, Function1 function2, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        e0(j1Var, l10, function1, function2, k1Var, intRange, y7Var, wwVar, r7Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void g0(final Function0<Unit> function0, final androidx.compose.ui.graphics.vector.d dVar, final String str, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.graphics.vector.d dVar2;
        int i13;
        int i14;
        androidx.compose.ui.a0 a0Var2;
        int i15;
        int i16;
        boolean z11;
        int i17;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean z14;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-368059805);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else if ((i10 & 6) == 0) {
            function1 = function0;
            i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            function1 = function0;
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= c0VarR.D(dVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= androidx.media3.exoplayer.a5.S0;
            } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.D(str)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-368059805, i12, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                        }
                        androidx.compose.ui.a0 a0Var5 = a0Var4;
                        boolean z15 = z14;
                        h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-456272562, true, new o(str), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(-1124908186, true, new p(function1, a0Var5, z15, dVar2, str), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
                        c0VarR = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z15;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return i9.h0(function0, dVar, str, a0Var3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z11 = z10;
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-368059805, i12, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                    }
                    androidx.compose.ui.a0 a0Var6 = a0Var4;
                    boolean z16 = z14;
                    h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-456272562, true, new o(str), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(-1124908186, true, new p(function1, a0Var6, z16, dVar2, str), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
                    c0VarR = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var6;
                    z13 = z16;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i9.h0(function0, dVar, str, a0Var3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            a0Var2 = a0Var;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-368059805, i12, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                    }
                    androidx.compose.ui.a0 a0Var7 = a0Var4;
                    boolean z17 = z14;
                    h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-456272562, true, new o(str), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(-1124908186, true, new p(function1, a0Var7, z17, dVar2, str), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
                    c0VarR = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var7;
                    z13 = z17;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i9.h0(function0, dVar, str, a0Var3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i16 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-368059805, i12, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                }
                androidx.compose.ui.a0 a0Var8 = a0Var4;
                boolean z18 = z14;
                h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-456272562, true, new o(str), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(-1124908186, true, new p(function1, a0Var8, z18, dVar2, str), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var8;
                z13 = z18;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i9.h0(function0, dVar, str, a0Var3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        dVar2 = dVar;
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if (c0VarR.D(str)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-368059805, i12, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                    }
                    androidx.compose.ui.a0 a0Var9 = a0Var4;
                    boolean z19 = z14;
                    h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-456272562, true, new o(str), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(-1124908186, true, new p(function1, a0Var9, z19, dVar2, str), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
                    c0VarR = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var9;
                    z13 = z19;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i9.h0(function0, dVar, str, a0Var3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i16 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-368059805, i12, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                }
                androidx.compose.ui.a0 a0Var10 = a0Var4;
                boolean z110 = z14;
                h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-456272562, true, new o(str), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(-1124908186, true, new p(function1, a0Var10, z110, dVar2, str), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var10;
                z13 = z110;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i9.h0(function0, dVar, str, a0Var3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i16 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-368059805, i12, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                }
                androidx.compose.ui.a0 a0Var11 = a0Var4;
                boolean z111 = z14;
                h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-456272562, true, new o(str), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(-1124908186, true, new p(function1, a0Var11, z111, dVar2, str), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var11;
                z13 = z111;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i9.h0(function0, dVar, str, a0Var3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z11 = z10;
        if ((i12 & 9363) != 9362) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i14 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i16 != 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-368059805, i12, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
            }
            androidx.compose.ui.a0 a0Var12 = a0Var4;
            boolean z112 = z14;
            h90.x(u80.f33535a.o(s80.f32838b.a(), 0.0f, c0VarR, 390, 2), androidx.compose.runtime.internal.w.e(-456272562, true, new o(str), c0VarR, 54), h90.S(false, false, null, c0VarR, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.w.e(-1124908186, true, new p(function1, a0Var12, z112, dVar2, str), c0VarR, 54), c0VarR, 100663344, com.planner5d.library.engine.input.f.b.R1);
            c0VarR = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var12;
            z13 = z112;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z13 = z11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.h0(function0, dVar, str, a0Var3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(Function0 function0, androidx.compose.ui.graphics.vector.d dVar, String str, androidx.compose.ui.a0 a0Var, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        g0(function0, dVar, str, a0Var, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0345  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void i0(@NotNull final androidx.compose.material3.internal.o1 o1Var, @NotNull final Function1<? super Long, Unit> function1, final long j10, @Nullable final Long l10, @Nullable final Long l11, @Nullable final xw xwVar, @NotNull final y7 y7Var, @NotNull final ww wwVar, @NotNull final r7 r7Var, @NotNull final Locale locale, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.material3.internal.o1 o1Var2;
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.ui.a0 a0VarD;
        int i12;
        int i13;
        androidx.compose.runtime.c0 c0Var3;
        char c10;
        Object obj;
        boolean z10;
        boolean z11;
        Object objG;
        Locale locale2 = locale;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-333300603);
        if ((i10 & 6) == 0) {
            o1Var2 = o1Var;
            i11 = (c0VarR.D(o1Var2) ? 4 : 2) | i10;
        } else {
            o1Var2 = o1Var;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function1) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.L(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(l10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(l11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.D(xwVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= (2097152 & i10) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.D(wwVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c0VarR.D(r7Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c0VarR.k0(locale2) ? 536870912 : 268435456;
        }
        int i14 = i11;
        if (c0VarR.h((306783379 & i14) != 306783378, i14 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-333300603, i14, -1, "androidx.compose.material3.Month (DatePicker.kt:1844)");
            }
            if (xwVar != null) {
                c0VarR.E(606579709);
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                boolean z12 = ((i14 & 458752) == 131072) | ((234881024 & i14) == 67108864);
                Object objI0 = c0VarR.i0();
                if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.l8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return i9.j0(xwVar, r7Var, (androidx.compose.ui.graphics.drawscope.c) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0VarD = androidx.compose.ui.draw.n.d(aVar, (Function1) objI0);
                c0VarR.A();
            } else {
                c0VarR.E(606771165);
                c0VarR.A();
                a0VarD = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.l(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f28365a * 6)).B2(a0VarD);
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.u(), androidx.compose.ui.e.f37317a.u(), c0VarR, 6);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB2);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            c0VarR.E(-680088486);
            int i15 = 0;
            int i16 = 0;
            while (i16 < 6) {
                androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.u(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarH);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                int i17 = i15;
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
                int i18 = i16;
                androidx.compose.runtime.y7.n(c0VarD2, a1VarE, aVar3.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
                androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
                c0VarR.E(1542622325);
                int i19 = i17;
                int i20 = 0;
                while (i20 < 7) {
                    if (i19 < o1Var2.i() || i19 >= o1Var2.i() + o1Var2.l()) {
                        i19 = i19;
                        i12 = i20;
                        i13 = i14;
                        c0Var3 = c0VarR;
                        c0Var3.E(576825328);
                        androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                        d0.x xVar = d0.x.f269223a;
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.layout.i6.A(aVar4, xVar.h(), xVar.f(), 0.0f, 0.0f, 12, null), ((androidx.compose.ui.unit.h) c0Var3.W(wi.g())).O(), ((androidx.compose.ui.unit.h) c0Var3.W(wi.g())).O()), c0Var3, 0);
                        c0Var3.A();
                    } else {
                        c0VarR.E(577914947);
                        int i21 = i19 - o1Var2.i();
                        i12 = i20;
                        final long jM = o1Var2.m() + (((long) i21) * 86400000);
                        boolean z13 = jM == j10;
                        boolean z14 = l10 != null && jM == l10.longValue();
                        boolean z15 = l11 != null && jM == l11.longValue();
                        if (xwVar != null) {
                            c0VarR.E(578361347);
                            boolean zL = ((i14 & 458752) == 131072) | c0VarR.L(jM);
                            Object objI1 = c0VarR.i0();
                            if (zL || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                if (jM < (l10 != null ? l10.longValue() : Long.MAX_VALUE)) {
                                    z11 = false;
                                } else {
                                    if (jM <= (l11 != null ? l11.longValue() : Long.MIN_VALUE)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                }
                                c10 = 2;
                                obj = null;
                                objG = androidx.compose.runtime.d7.g(Boolean.valueOf(z11), null, 2, null);
                                c0VarR.Y(objG);
                            } else {
                                objG = objI1;
                                c10 = 2;
                                obj = null;
                            }
                            boolean zBooleanValue = ((Boolean) ((androidx.compose.runtime.n3) objG).getValue()).booleanValue();
                            c0VarR.A();
                            z10 = zBooleanValue;
                        } else {
                            i12 = i12;
                            c10 = 2;
                            obj = null;
                            c0VarR.E(578890300);
                            c0VarR.A();
                            z10 = false;
                        }
                        androidx.compose.runtime.c0 c0Var4 = c0VarR;
                        int i22 = i14;
                        boolean z16 = z10;
                        String strR0 = R0(xwVar != null, z13, z14, z15, z16, c0Var4, 0);
                        boolean z17 = z13;
                        boolean z18 = z14;
                        boolean z19 = z15;
                        String strC = y7Var.c(Long.valueOf(jM), locale2, true);
                        if (strC == null) {
                            strC = "";
                        }
                        String str = strC;
                        String strC2 = c4.c(i21 + 1, 0, 0, false, locale2, 7, null);
                        androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                        boolean z20 = z18 || z19;
                        boolean zL2 = ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) | c0Var4.L(jM);
                        Object objI2 = c0Var4.i0();
                        if (zL2 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.w8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return i9.k0(function1, jM);
                                }
                            };
                            c0Var4.Y(objI2);
                        }
                        Function0 function0 = (Function0) objI2;
                        i13 = i22;
                        boolean zL3 = ((i22 & 29360128) == 8388608) | c0Var4.L(jM);
                        Object objI3 = c0Var4.i0();
                        if (zL3 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = Boolean.valueOf(wwVar.b(o1Var.n()) && wwVar.a(jM));
                            c0Var4.Y(objI3);
                        }
                        boolean zBooleanValue2 = ((Boolean) objI3).booleanValue();
                        if (strR0 != null) {
                            str = strR0 + ", " + str;
                        }
                        Z(strC2, aVar5, z20, function0, z18, zBooleanValue2, z17, z16, str, r7Var, c0Var4, ((i13 << 3) & 1879048192) | 48);
                        c0Var3 = c0Var4;
                        c0Var3.A();
                    }
                    o1Var2 = o1Var;
                    locale2 = locale;
                    i19++;
                    i20 = i12 + 1;
                    c0VarR = c0Var3;
                    i14 = i13;
                }
                int i23 = i14;
                androidx.compose.runtime.c0 c0Var5 = c0VarR;
                c0Var5.A();
                c0Var5.o();
                o1Var2 = o1Var;
                locale2 = locale;
                i16 = i18 + 1;
                i15 = i19;
                i14 = i23;
            }
            c0Var2 = c0VarR;
            c0Var2.A();
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.b9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return i9.l0(o1Var, function1, j10, l10, l11, xwVar, y7Var, wwVar, r7Var, locale, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(xw xwVar, r7 r7Var, androidx.compose.ui.graphics.drawscope.c cVar) {
        za.C(cVar, xwVar, r7Var.k());
        cVar.E4();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(Function1 function1, long j10) {
        function1.invoke(Long.valueOf(j10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(androidx.compose.material3.internal.o1 o1Var, Function1 function1, long j10, Long l10, Long l11, xw xwVar, y7 y7Var, ww wwVar, r7 r7Var, Locale locale, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        i0(o1Var, function1, j10, l10, l11, xwVar, y7Var, wwVar, r7Var, locale, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void m0(final androidx.compose.ui.a0 a0Var, final boolean z10, final boolean z11, final boolean z12, final String str, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final r7 r7Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Function0<Unit> function3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-773929258);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.G(z12) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(str) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(function0) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.k0(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            function3 = function2;
            i11 |= c0VarR.k0(function3) ? 8388608 : 4194304;
        } else {
            function3 = function2;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c0VarR.D(r7Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if (c0VarR.h((38347923 & i11) != 38347922, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-773929258, i11, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2191)");
            }
            androidx.compose.ui.a0 a0VarL = androidx.compose.foundation.layout.i6.l(androidx.compose.foundation.layout.i6.h(a0Var, 0.0f, 1, null), f28366b);
            int i12 = i11;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(z12 ? androidx.compose.foundation.layout.q.f16330a.w() : androidx.compose.foundation.layout.q.f16330a.s(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarL);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            F0(function3, z12, null, androidx.compose.runtime.internal.w.e(619076006, true, new q(str, r7Var), c0VarR, 54), c0VarR, ((i12 >> 21) & 14) | 3072 | ((i12 >> 6) & com.planner5d.library.engine.input.f.b.B), 4);
            if (z12) {
                c0VarR.E(282432080);
                c0VarR.A();
            } else {
                c0VarR.E(281624840);
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(r7Var.u())), androidx.compose.runtime.internal.w.e(-128317193, true, new r(function1, z11, function0, z10), c0VarR, 54), c0VarR, 48 | androidx.compose.runtime.n4.f36267i);
                c0VarR.A();
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.g8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.n0(a0Var, z10, z11, z12, str, function0, function1, function2, r7Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, boolean z12, String str, Function0 function0, Function0 function1, Function0 function2, r7 r7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        m0(a0Var, z10, z11, z12, str, function0, function1, function2, r7Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void o0(final Long l10, final long j10, final int i10, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function2, final androidx.compose.material3.internal.k1 k1Var, final IntRange intRange, final y7 y7Var, final ww wwVar, final r7 r7Var, final androidx.compose.ui.focus.g0 g0Var, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.material3.internal.k1 k1Var2;
        IntRange intRange2;
        ww wwVar2;
        int i14;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2053685029);
        if ((i11 & 6) == 0) {
            i13 = (c0VarR.D(l10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0VarR.L(j10) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= c0VarR.K(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0VarR.k0(function1) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c0VarR.k0(function2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            k1Var2 = k1Var;
            i13 |= c0VarR.k0(k1Var2) ? 131072 : 65536;
        } else {
            k1Var2 = k1Var;
        }
        if ((1572864 & i11) == 0) {
            intRange2 = intRange;
            i13 |= c0VarR.k0(intRange2) ? 1048576 : 524288;
        } else {
            intRange2 = intRange;
        }
        if ((12582912 & i11) == 0) {
            i13 |= (16777216 & i11) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            wwVar2 = wwVar;
            i13 |= c0VarR.D(wwVar2) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        } else {
            wwVar2 = wwVar;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= c0VarR.D(r7Var) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c0VarR.D(g0Var) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if (c0VarR.h(((i13 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i13 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2053685029, i13, i14, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1443)");
            }
            final int i15 = -((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).g6(androidx.compose.ui.unit.h.r(48));
            final androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.DefaultEffects, c0VarR, 6);
            final androidx.compose.animation.core.y0 y0VarB2 = hm.b(d0.h1.FastEffects, c0VarR, 6);
            int i16 = i13;
            d0.h1 h1Var = d0.h1.DefaultSpatial;
            final androidx.compose.animation.core.y0 y0VarB3 = hm.b(h1Var, c0VarR, 6);
            final androidx.compose.animation.core.y0 y0VarB4 = hm.b(h1Var, c0VarR, 6);
            ed edVarC = ed.c(i10);
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar2 = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar2.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.n8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.p0((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null);
            boolean zK0 = c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB) | c0VarR.k0(y0VarB2) | c0VarR.K(i15) | c0VarR.k0(y0VarB4);
            Object objI1 = c0VarR.i0();
            if (zK0 || objI1 == aVar2.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.o8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i9.q0(y0VarB3, y0VarB, y0VarB2, i15, y0VarB4, (androidx.compose.animation.i) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0Var2 = c0VarR;
            androidx.compose.animation.e.b(edVarC, a0VarF, (Function1) objI1, null, "DatePickerDisplayModeAnimation", null, androidx.compose.runtime.internal.w.e(1838500091, true, new s(l10, j10, function1, function2, k1Var2, intRange2, y7Var, wwVar2, r7Var, g0Var), c0VarR, 54), c0Var2, ((i16 >> 6) & 14) | 1597440, 40);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.p8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.w0(l10, j10, i10, function1, function2, k1Var, intRange, y7Var, wwVar, r7Var, g0Var, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.t1(e0Var, true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.x q0(androidx.compose.animation.core.y0 y0Var, androidx.compose.animation.core.y0 y0Var2, androidx.compose.animation.core.y0 y0Var3, final int i10, final androidx.compose.animation.core.y0 y0Var4, androidx.compose.animation.i iVar) {
        return iVar.k(ed.f(((ed) iVar.j()).i(), ed.f27323b.a()) ? androidx.compose.animation.e.f(androidx.compose.animation.b0.H(y0Var, new Function1() { // from class: androidx.compose.material3.h8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(i9.r0(((Integer) obj).intValue()));
            }
        }).c(androidx.compose.animation.b0.o(y0Var2, 0.0f, 2, null)), androidx.compose.animation.b0.q(y0Var3, 0.0f, 2, null).d(androidx.compose.animation.b0.N(y0Var, new Function1() { // from class: androidx.compose.material3.i8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(i9.s0(i10, ((Integer) obj).intValue()));
            }
        }))) : androidx.compose.animation.e.f(androidx.compose.animation.b0.H(y0Var, new Function1() { // from class: androidx.compose.material3.j8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(i9.t0(i10, ((Integer) obj).intValue()));
            }
        }).c(androidx.compose.animation.b0.o(y0Var2, 0.0f, 2, null)), androidx.compose.animation.b0.N(y0Var, new Function1() { // from class: androidx.compose.material3.k8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(i9.u0(((Integer) obj).intValue()));
            }
        }).d(androidx.compose.animation.b0.q(y0Var3, 0.0f, 2, null))), androidx.compose.animation.e.c(true, new Function2() { // from class: androidx.compose.material3.m8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i9.v0(y0Var4, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.u) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r0(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s0(int i10, int i11) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t0(int i10, int i11) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u0(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.y0 v0(androidx.compose.animation.core.y0 y0Var, androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.u uVar2) {
        return y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(Long l10, long j10, int i10, Function1 function1, Function1 function2, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, androidx.compose.ui.focus.g0 g0Var, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        o0(l10, j10, i10, function1, function2, k1Var, intRange, y7Var, wwVar, r7Var, g0Var, c0Var, androidx.compose.runtime.t4.a(i11 | 1), androidx.compose.runtime.t4.a(i12));
        return Unit.f312394a;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void x0(@NotNull final r7 r7Var, @NotNull final androidx.compose.material3.internal.k1 k1Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1849465391);
        int i11 = (i10 & 6) == 0 ? (c0VarR.D(r7Var) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(k1Var) ? 32 : 16;
        }
        ?? r10 = 0;
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1849465391, i11, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1782)");
            }
            int iJ = k1Var.j();
            List<Pair<String, String>> listQ = k1Var.q();
            ArrayList arrayList = new ArrayList();
            int i12 = iJ - 1;
            int size = listQ.size();
            for (int i13 = i12; i13 < size; i13++) {
                arrayList.add(listQ.get(i13));
            }
            for (int i14 = 0; i14 < i12; i14++) {
                arrayList.add(listQ.get(i14));
            }
            androidx.compose.ui.text.y3 y3VarE = la0.e(d0.x.f269223a.S(), c0VarR, 6);
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.b(androidx.compose.ui.a0.E, 0.0f, f28365a, 1, null), 0.0f, 1, null);
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.u(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ2))) {
                c0VarD.Y(Integer.valueOf(iJ2));
                c0VarD.f(Integer.valueOf(iJ2), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            c0VarR.E(24563235);
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                final Pair pair = (Pair) arrayList.get(i15);
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                boolean zD = c0VarR.D(pair);
                Object objI0 = c0VarR.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.f9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return i9.y0(pair, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarC = androidx.compose.ui.semantics.t.c(aVar2, (Function1) objI0);
                d0.x xVar = d0.x.f269223a;
                androidx.compose.ui.a0 a0VarY = androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.layout.i6.A(a0VarC, xVar.h(), xVar.f(), 0.0f, 0.0f, 12, null), ((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O(), ((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O());
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), r10);
                int iJ3 = androidx.compose.runtime.v.j(c0VarR, r10);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarY);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
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
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ3))) {
                    c0VarD2.Y(Integer.valueOf(iJ3));
                    c0VarD2.f(Integer.valueOf(iJ3), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.runtime.c0 c0Var3 = c0VarR;
                q50.t((String) pair.getSecond(), androidx.compose.foundation.layout.i6.H(aVar2, null, false, 3, null), r7Var.D(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, y3VarE, c0Var3, 48, 0, 130040);
                c0Var3.o();
                i15++;
                c0VarR = c0Var3;
                arrayList = arrayList;
                r10 = 0;
            }
            c0Var2 = c0VarR;
            c0Var2.A();
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.g9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.z0(r7Var, k1Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(Pair pair, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, (String) pair.getFirst());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(r7 r7Var, androidx.compose.material3.internal.k1 k1Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        x0(r7Var, k1Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
