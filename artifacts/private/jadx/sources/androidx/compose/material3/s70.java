package androidx.compose.material3;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 13 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 14 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 15 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 16 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 17 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 18 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 19 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 20 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,2144:1\n1282#2,6:2145\n1282#2,6:2151\n1282#2,6:2157\n1282#2,6:2163\n1282#2,6:2194\n1282#2,6:2241\n1282#2,6:2288\n1282#2,6:2294\n1282#2,6:2300\n1282#2,6:2306\n1282#2,6:2560\n1282#2,6:2566\n1282#2,6:2573\n1282#2,6:2606\n1282#2,6:2612\n1282#2,6:2621\n1282#2,6:2629\n1282#2,6:2677\n1282#2,6:2683\n1282#2,6:2691\n1282#2,6:2697\n1282#2,6:2703\n1282#2,3:2716\n1285#2,3:2720\n1282#2,6:2723\n1282#2,6:2729\n1282#2,6:2735\n1282#2,6:2777\n1282#2,6:2787\n1282#2,6:2793\n1282#2,6:2875\n1282#2,6:2886\n1282#2,6:2898\n1282#2,6:2904\n63#3:2169\n58#3,9:2170\n66#3:2179\n66#3:2180\n52#3:2181\n49#3:2183\n66#3:2184\n60#3:2185\n49#3:2186\n66#3:2187\n60#3:2188\n49#3:2189\n63#3:2974\n63#3:2976\n113#4:2182\n188#4:2190\n113#4:2627\n113#4:2973\n113#4:2975\n113#4:2977\n113#4:2978\n113#4:2979\n113#4:2980\n113#4:2981\n113#4:2982\n113#4:2983\n113#4:2991\n113#4:2992\n113#4:2993\n113#4:2994\n113#4:2995\n53#5,3:2191\n53#5,3:2952\n53#5,3:2956\n53#5,3:2969\n87#6:2200\n84#6,9:2201\n94#6:2240\n87#6:2394\n83#6,10:2395\n94#6:2476\n87#6:2799\n84#6,9:2800\n94#6:2897\n79#7,6:2210\n86#7,3:2225\n89#7,2:2234\n93#7:2239\n79#7,6:2257\n86#7,3:2272\n89#7,2:2281\n93#7:2286\n79#7,6:2322\n86#7,3:2337\n89#7,2:2346\n79#7,6:2359\n86#7,3:2374\n89#7,2:2383\n93#7:2388\n93#7:2392\n79#7,6:2405\n86#7,3:2420\n89#7,2:2429\n79#7,6:2442\n86#7,3:2457\n89#7,2:2466\n93#7:2471\n93#7:2475\n79#7,6:2488\n86#7,3:2503\n89#7,2:2512\n79#7,6:2525\n86#7,3:2540\n89#7,2:2549\n93#7:2554\n93#7:2558\n79#7,6:2579\n86#7,3:2594\n89#7,2:2603\n93#7:2620\n79#7,6:2644\n86#7,3:2659\n89#7,2:2668\n93#7:2673\n79#7,6:2750\n86#7,3:2765\n89#7,2:2774\n93#7:2785\n79#7,6:2809\n86#7,3:2824\n89#7,2:2833\n79#7,6:2848\n86#7,3:2863\n89#7,2:2872\n93#7:2884\n93#7:2896\n79#7,6:2910\n86#7,3:2925\n89#7,2:2934\n93#7:2939\n347#8,9:2216\n356#8,3:2236\n347#8,9:2263\n356#8,3:2283\n347#8,9:2328\n356#8:2348\n347#8,9:2365\n356#8,3:2385\n357#8,2:2390\n347#8,9:2411\n356#8:2431\n347#8,9:2448\n356#8,3:2468\n357#8,2:2473\n347#8,9:2494\n356#8:2514\n347#8,9:2531\n356#8,3:2551\n357#8,2:2556\n347#8,9:2585\n356#8:2605\n357#8,2:2618\n347#8,9:2650\n356#8,3:2670\n347#8,9:2756\n356#8:2776\n357#8,2:2783\n347#8,9:2815\n356#8:2835\n347#8,9:2854\n356#8:2874\n357#8,2:2882\n357#8,2:2894\n347#8,9:2916\n356#8,3:2936\n4206#9,6:2228\n4206#9,6:2275\n4206#9,6:2340\n4206#9,6:2377\n4206#9,6:2423\n4206#9,6:2460\n4206#9,6:2506\n4206#9,6:2543\n4206#9,6:2597\n4206#9,6:2662\n4206#9,6:2768\n4206#9,6:2827\n4206#9,6:2866\n4206#9,6:2928\n99#10:2247\n96#10,9:2248\n106#10:2287\n99#10:2312\n96#10,9:2313\n106#10:2393\n99#10:2477\n95#10,10:2478\n106#10:2559\n70#11:2349\n67#11,9:2350\n77#11:2389\n70#11:2432\n67#11,9:2433\n77#11:2472\n70#11:2515\n67#11,9:2516\n77#11:2555\n70#11:2635\n68#11,8:2636\n77#11:2674\n70#11:2741\n68#11,8:2742\n77#11:2786\n70#11:2838\n67#11,9:2839\n77#11:2885\n210#12:2572\n216#12:2675\n213#12:2676\n237#12:2836\n234#12:2837\n228#12:2892\n231#12:2893\n222#12:2940\n225#12:2941\n219#12:2942\n75#13:2628\n75#13:2689\n75#13:2881\n1#14:2690\n607#15:2709\n604#15,6:2710\n605#16:2719\n110#17:2943\n85#18:2944\n85#18:2945\n117#18,2:2946\n85#18:2948\n117#18,2:2949\n85#18:2959\n117#18,2:2960\n85#18:2962\n117#18,2:2963\n85#18:2965\n117#18,2:2966\n85#18:2972\n30#19:2951\n30#19:2955\n30#19:2968\n65#20:2984\n237#20,6:2985\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n227#1:2145,6\n229#1:2151,6\n231#1:2157,6\n590#1:2163,6\n960#1:2194,6\n983#1:2241,6\n1003#1:2288,6\n1006#1:2294,6\n1008#1:2300,6\n1010#1:2306,6\n1208#1:2560,6\n1254#1:2566,6\n1311#1:2573,6\n1322#1:2606,6\n1340#1:2612,6\n1366#1:2621,6\n1391#1:2629,6\n1419#1:2677,6\n1423#1:2683,6\n1732#1:2691,6\n1733#1:2697,6\n1734#1:2703,6\n1735#1:2716,3\n1735#1:2720,3\n1745#1:2723,6\n1758#1:2729,6\n1766#1:2735,6\n1785#1:2777,6\n1868#1:2787,6\n1869#1:2793,6\n1909#1:2875,6\n1949#1:2886,6\n1963#1:2898,6\n1980#1:2904,6\n933#1:2169\n934#1:2170,9\n937#1:2179\n939#1:2180\n941#1:2181\n944#1:2183\n945#1:2184\n945#1:2185\n945#1:2186\n946#1:2187\n946#1:2188\n946#1:2189\n2066#1:2974\n2067#1:2976\n942#1:2182\n948#1:2190\n1367#1:2627\n2066#1:2973\n2067#1:2975\n2068#1:2977\n2069#1:2978\n2070#1:2979\n2072#1:2980\n2073#1:2981\n2074#1:2982\n2075#1:2983\n2080#1:2991\n2082#1:2992\n2083#1:2993\n2084#1:2994\n2085#1:2995\n948#1:2191,3\n1662#1:2952,3\n1691#1:2956,3\n1748#1:2969,3\n959#1:2200\n959#1:2201,9\n959#1:2240\n1135#1:2394\n1135#1:2395,10\n1135#1:2476\n1877#1:2799\n1877#1:2800,9\n1877#1:2897\n959#1:2210,6\n959#1:2225,3\n959#1:2234,2\n959#1:2239\n982#1:2257,6\n982#1:2272,3\n982#1:2281,2\n982#1:2286\n1018#1:2322,6\n1018#1:2337,3\n1018#1:2346,2\n1121#1:2359,6\n1121#1:2374,3\n1121#1:2383,2\n1121#1:2388\n1018#1:2392\n1135#1:2405,6\n1135#1:2420,3\n1135#1:2429,2\n1138#1:2442,6\n1138#1:2457,3\n1138#1:2466,2\n1138#1:2471\n1135#1:2475\n1155#1:2488,6\n1155#1:2503,3\n1155#1:2512,2\n1158#1:2525,6\n1158#1:2540,3\n1158#1:2549,2\n1158#1:2554\n1155#1:2558\n1308#1:2579,6\n1308#1:2594,3\n1308#1:2603,2\n1308#1:2620\n1391#1:2644,6\n1391#1:2659,3\n1391#1:2668,2\n1391#1:2673\n1754#1:2750,6\n1754#1:2765,3\n1754#1:2774,2\n1754#1:2785\n1877#1:2809,6\n1877#1:2824,3\n1877#1:2833,2\n1902#1:2848,6\n1902#1:2863,3\n1902#1:2872,2\n1902#1:2884\n1877#1:2896\n1980#1:2910,6\n1980#1:2925,3\n1980#1:2934,2\n1980#1:2939\n959#1:2216,9\n959#1:2236,3\n982#1:2263,9\n982#1:2283,3\n1018#1:2328,9\n1018#1:2348\n1121#1:2365,9\n1121#1:2385,3\n1018#1:2390,2\n1135#1:2411,9\n1135#1:2431\n1138#1:2448,9\n1138#1:2468,3\n1135#1:2473,2\n1155#1:2494,9\n1155#1:2514\n1158#1:2531,9\n1158#1:2551,3\n1155#1:2556,2\n1308#1:2585,9\n1308#1:2605\n1308#1:2618,2\n1391#1:2650,9\n1391#1:2670,3\n1754#1:2756,9\n1754#1:2776\n1754#1:2783,2\n1877#1:2815,9\n1877#1:2835\n1902#1:2854,9\n1902#1:2874\n1902#1:2882,2\n1877#1:2894,2\n1980#1:2916,9\n1980#1:2936,3\n959#1:2228,6\n982#1:2275,6\n1018#1:2340,6\n1121#1:2377,6\n1135#1:2423,6\n1138#1:2460,6\n1155#1:2506,6\n1158#1:2543,6\n1308#1:2597,6\n1391#1:2662,6\n1754#1:2768,6\n1877#1:2827,6\n1902#1:2866,6\n1980#1:2928,6\n982#1:2247\n982#1:2248,9\n982#1:2287\n1018#1:2312\n1018#1:2313,9\n1018#1:2393\n1155#1:2477\n1155#1:2478,10\n1155#1:2559\n1121#1:2349\n1121#1:2350,9\n1121#1:2389\n1138#1:2432\n1138#1:2433,9\n1138#1:2472\n1158#1:2515\n1158#1:2516,9\n1158#1:2555\n1391#1:2635\n1391#1:2636,8\n1391#1:2674\n1754#1:2741\n1754#1:2742,8\n1754#1:2786\n1902#1:2838\n1902#1:2839,9\n1902#1:2885\n1307#1:2572\n1409#1:2675\n1411#1:2676\n1896#1:2836\n1898#1:2837\n1953#1:2892\n1955#1:2893\n2023#1:2940\n2025#1:2941\n2027#1:2942\n1382#1:2628\n1730#1:2689\n1913#1:2881\n1735#1:2709\n1735#1:2710,6\n1735#1:2719\n2096#1:2943\n226#1:2944\n1003#1:2945\n1003#1:2946,2\n1006#1:2948\n1006#1:2949,2\n1732#1:2959\n1732#1:2960,2\n1733#1:2962\n1733#1:2963,2\n1734#1:2965\n1734#1:2966,2\n1745#1:2972\n1662#1:2951\n1691#1:2955\n1748#1:2968\n2079#1:2984\n2079#1:2985,6\n*E\n"})
public final class s70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f32747a = 6.2831855f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f32748b = 3.1415927f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f32749c = 1.5707963267948966d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f32750d = 0.10471976f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f32751e = 0.5235988f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f32752f = 2.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f32753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f32754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f32755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f32756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f32757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f32758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f32759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f32760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f32761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.f0 f32762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.f0 f32763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.f0 f32764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f32765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f32766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f32767u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f32768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float f32769w;

    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2144:1\n230#2,3:2145\n34#2,6:2148\n233#2:2154\n150#2,3:2155\n34#2,6:2158\n153#2:2164\n117#2,2:2165\n34#2,6:2167\n119#2:2173\n117#2,2:2174\n34#2,6:2176\n119#2:2182\n70#2,6:2183\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$1\n*L\n1985#1:2145,3\n1985#1:2148,6\n1985#1:2154\n1988#1:2155,3\n1988#1:2158,6\n1988#1:2164\n1989#1:2165,2\n1989#1:2167,6\n1989#1:2173\n1990#1:2174,2\n1990#1:2176,6\n1990#1:2182\n1998#1:2183,6\n*E\n"})
    static final class a implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f32770a;

        a(float f10) {
            this.f32770a = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2 i2Var, List list, androidx.compose.ui.layout.i2 i2Var2, long j10, float f10, float f11, androidx.compose.ui.layout.i2.a aVar) {
            if (i2Var != null) {
                androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.i2 i2Var3 = (androidx.compose.ui.layout.i2) list.get(i10);
                double d10 = f10;
                double d11 = ((double) (i10 * f11)) - 1.5707963267948966d;
                androidx.compose.ui.layout.i2.a.P(aVar, i2Var3, kotlin.math.b.K0((Math.cos(d11) * d10) + ((double) ((androidx.compose.ui.unit.b.p(j10) / 2) - (i2Var3.h1() / 2)))), kotlin.math.b.K0((d10 * Math.sin(d11)) + ((double) ((androidx.compose.ui.unit.b.o(j10) / 2) - (i2Var3.c1() / 2)))), 0.0f, 4, null);
            }
            if (i2Var2 != null) {
                androidx.compose.ui.layout.i2.a.P(aVar, i2Var2, (androidx.compose.ui.unit.b.r(j10) - i2Var2.h1()) / 2, (androidx.compose.ui.unit.b.q(j10) - i2Var2.c1()) / 2, 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, final long j10) {
            androidx.compose.ui.layout.z0 z0Var;
            androidx.compose.ui.layout.z0 z0Var2;
            final float fO = androidx.compose.ui.unit.b.o(j10) * this.f32770a;
            int i10 = 0;
            long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
            ArrayList arrayList = new ArrayList(list.size());
            List<? extends androidx.compose.ui.layout.z0> list2 = list;
            int size = list2.size();
            for (int i11 = 0; i11 < size; i11++) {
                androidx.compose.ui.layout.z0 z0Var3 = list.get(i11);
                androidx.compose.ui.layout.z0 z0Var4 = z0Var3;
                if (androidx.compose.ui.layout.i0.a(z0Var4) != dj.Selector && androidx.compose.ui.layout.i0.a(z0Var4) != dj.InnerCircle) {
                    arrayList.add(z0Var3);
                }
            }
            final ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(((androidx.compose.ui.layout.z0) arrayList.get(i12)).P0(jD));
            }
            int size3 = list2.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size3) {
                    z0Var = null;
                    break;
                }
                z0Var = list.get(i13);
                if (androidx.compose.ui.layout.i0.a(z0Var) == dj.Selector) {
                    break;
                }
                i13++;
            }
            androidx.compose.ui.layout.z0 z0Var5 = z0Var;
            int size4 = list2.size();
            while (true) {
                if (i10 >= size4) {
                    z0Var2 = null;
                    break;
                }
                z0Var2 = list.get(i10);
                if (androidx.compose.ui.layout.i0.a(z0Var2) == dj.InnerCircle) {
                    break;
                }
                i10++;
            }
            androidx.compose.ui.layout.z0 z0Var6 = z0Var2;
            final float size5 = 6.2831855f / arrayList2.size();
            androidx.compose.ui.layout.i2 i2VarP0 = z0Var5 != null ? z0Var5.P0(jD) : null;
            final androidx.compose.ui.layout.i2 i2VarP1 = z0Var6 != null ? z0Var6.P0(jD) : null;
            final androidx.compose.ui.layout.i2 i2Var = i2VarP0;
            return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.q(j10), null, new Function1() { // from class: androidx.compose.material3.r70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s70.a.g(i2Var, arrayList2, i2VarP1, j10, fO, size5, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2144:1\n99#2:2145\n95#2,10:2146\n106#2:2186\n79#3,6:2156\n86#3,3:2171\n89#3,2:2180\n93#3:2185\n347#4,9:2162\n356#4,3:2182\n4206#5,6:2174\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n*L\n1180#1:2145\n1180#1:2146,10\n1180#1:2186\n1180#1:2156,6\n1180#1:2171,3\n1180#1:2180,2\n1180#1:2185\n1180#1:2162,9\n1180#1:2182,3\n1180#1:2174,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h80 f32771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u50 f32772b;

        b(h80 h80Var, u50 u50Var) {
            this.f32771a = h80Var;
            this.f32772b = u50Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            int i11 = 2 ^ 0;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-477913269, i10, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1179)");
            }
            h80 h80Var = this.f32771a;
            u50 u50Var = this.f32772b;
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
            d0.b3 b3Var = d0.b3.f267681a;
            androidx.compose.ui.a0 a0VarY = androidx.compose.foundation.layout.i6.y(aVar, b3Var.N(), b3Var.L());
            int iL1 = s70.L1(h80Var);
            g80.a aVar3 = g80.f27919b;
            s70.P0(a0VarY, iL1, h80Var, aVar3.a(), u50Var, c0Var, 3078);
            s70.g0(androidx.compose.foundation.layout.i6.y(aVar, s70.f32757k, b3Var.I()), c0Var, 6);
            s70.P0(androidx.compose.foundation.layout.i6.y(aVar, b3Var.N(), b3Var.L()), h80Var.f(), h80Var, aVar3.b(), u50Var, c0Var, 3078);
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

    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2144:1\n1282#2,6:2145\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$1\n*L\n1611#1:2145,6\n*E\n"})
    static final class c implements pj.n<androidx.collection.f0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u50 f32773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.j f32774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f32775c;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u50 f32776a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.collection.f0 f32777b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.j f32778c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f32779d;

            /* JADX INFO: renamed from: androidx.compose.material3.s70$c$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$1$2$1\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2144:1\n65#2:2145\n1282#3,6:2146\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$1$2$1\n*L\n1617#1:2145\n1625#1:2146,6\n*E\n"})
            static final class C0251a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.collection.f0 f32780a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.material3.j f32781b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f32782c;

                /* JADX INFO: renamed from: androidx.compose.material3.s70$c$a$a$a, reason: collision with other inner class name */
                @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$1$2$1$2\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2144:1\n65#2:2145\n1282#3,6:2146\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$1$2$1$2\n*L\n1640#1:2145\n1644#1:2146,6\n*E\n"})
                static final class C0252a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.material3.j f32783a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ boolean f32784b;

                    C0252a(androidx.compose.material3.j jVar, boolean z10) {
                        this.f32783a = jVar;
                        this.f32784b = z10;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit f(int i10, androidx.compose.ui.semantics.e0 e0Var) {
                        androidx.compose.ui.semantics.b0.c2(e0Var, 12 + i10);
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
                            androidx.compose.runtime.m0.A0(-1385767514, i10, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1639)");
                        }
                        int i11 = s70.f32764r.f12216b;
                        androidx.compose.material3.j jVar = this.f32783a;
                        boolean z10 = this.f32784b;
                        for (final int i12 = 0; i12 < i11; i12++) {
                            int iW = s70.f32764r.w(i12);
                            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                            boolean zK = c0Var.K(i12);
                            Object objI0 = c0Var.i0();
                            if (zK || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.v70
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s70.c.a.C0251a.C0252a.f(i12, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0Var.Y(objI0);
                            }
                            int i13 = 2 | 0;
                            s70.S(androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), jVar, iW, z10, c0Var, 0);
                        }
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

                C0251a(androidx.collection.f0 f0Var, androidx.compose.material3.j jVar, boolean z10) {
                    this.f32780a = f0Var;
                    this.f32781b = jVar;
                    this.f32782c = z10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(int i10, androidx.compose.ui.semantics.e0 e0Var) {
                    androidx.compose.ui.semantics.b0.c2(e0Var, i10 + 1.0f);
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
                        androidx.compose.runtime.m0.A0(-596940007, i10, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1616)");
                    }
                    c0Var.E(1866272144);
                    androidx.collection.f0 f0Var = this.f32780a;
                    int i11 = f0Var.f12216b;
                    androidx.compose.material3.j jVar = this.f32781b;
                    boolean z10 = this.f32782c;
                    for (final int i12 = 0; i12 < i11; i12++) {
                        int iW = (!jVar.g() || g80.f(jVar.c(), g80.f27919b.b())) ? f0Var.w(i12) : f0Var.w(i12) % 12;
                        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                        boolean zK = c0Var.K(i12);
                        Object objI0 = c0Var.i0();
                        if (zK || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.u70
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s70.c.a.C0251a.f(i12, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var.Y(objI0);
                        }
                        s70.S(androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), jVar, iW, z10, c0Var, 0);
                    }
                    c0Var.A();
                    if (g80.f(this.f32781b.c(), g80.f27919b.a()) && this.f32781b.g()) {
                        c0Var.E(2020585964);
                        s70.M(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.w(androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, dj.InnerCircle), d0.b3.f267681a.b()), androidx.compose.ui.graphics.q0.f38131b.s(), androidx.compose.foundation.shape.o.k()), s70.f32754h, androidx.compose.runtime.internal.w.e(-1385767514, true, new C0252a(this.f32781b, this.f32782c), c0Var, 54), c0Var, 432, 0);
                        c0Var.A();
                    } else {
                        c0Var.E(2021505641);
                        c0Var.A();
                    }
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

            a(u50 u50Var, androidx.collection.f0 f0Var, androidx.compose.material3.j jVar, boolean z10) {
                this.f32776a = u50Var;
                this.f32777b = f0Var;
                this.f32778c = jVar;
                this.f32779d = z10;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-99063847, i10, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1613)");
                }
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(this.f32776a.a(false))), androidx.compose.runtime.internal.w.e(-596940007, true, new C0251a(this.f32777b, this.f32778c, this.f32779d), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

        c(u50 u50Var, androidx.compose.material3.j jVar, boolean z10) {
            this.f32773a = u50Var;
            this.f32774b = jVar;
            this.f32775c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.q1(e0Var);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.collection.f0 f0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                int i11 = 0 & (-1);
                androidx.compose.runtime.m0.A0(747010833, i10, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1609)");
            }
            androidx.compose.ui.a0 a0VarW = androidx.compose.foundation.layout.i6.w(androidx.compose.ui.a0.E, d0.b3.f267681a.b());
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.t70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.c.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            s70.M(androidx.compose.ui.semantics.t.f(a0VarW, false, (Function1) objI0, 1, null), s70.f32753g, androidx.compose.runtime.internal.w.e(-99063847, true, new a(this.f32773a, f0Var, this.f32774b, this.f32775c), c0Var, 54), c0Var, 432, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.collection.f0 f0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            d(f0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", i = {}, l = {1769}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockText$2$1$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,2144:1\n65#2:2145\n69#2:2148\n60#3:2146\n70#3:2149\n22#4:2147\n22#4:2150\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockText$2$1$1$1\n*L\n1770#1:2145\n1771#1:2148\n1770#1:2146\n1771#1:2149\n1770#1:2147\n1771#1:2150\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.j f32786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f32787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f32788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<n0.g> f32789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.unit.q> f32790f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.material3.j jVar, float f10, boolean z10, androidx.compose.runtime.n3<n0.g> n3Var, androidx.compose.runtime.n3<androidx.compose.ui.unit.q> n3Var2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f32786b = jVar;
            this.f32787c = f10;
            this.f32788d = z10;
            this.f32789e = n3Var;
            this.f32790f = n3Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f32786b, this.f32787c, this.f32788d, this.f32789e, this.f32790f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32785a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.material3.j jVar = this.f32786b;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (s70.T(this.f32789e) >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (s70.T(this.f32789e) & com.rabbitmq.client.k0.f265952a));
                float f10 = this.f32787c;
                boolean z10 = this.f32788d;
                long jV = s70.V(this.f32790f);
                androidx.compose.animation.core.l2 l2Var = new androidx.compose.animation.core.l2(0, 1, null);
                this.f32785a = 1;
                if (s70.Q1(jVar, fIntBitsToFloat, fIntBitsToFloat2, f10, z10, jV, l2Var, this) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2144:1\n563#2,2:2145\n34#2,6:2147\n565#2:2153\n230#2,3:2154\n34#2,6:2157\n233#2:2163\n150#2,3:2164\n34#2,6:2167\n153#2:2173\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1\n*L\n1210#1:2145,2\n1210#1:2147,6\n1210#1:2153\n1221#1:2154,3\n1221#1:2157,6\n1221#1:2163\n1222#1:2164,3\n1222#1:2167,6\n1222#1:2173\n*E\n"})
    static final class e implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32791a = new e();

        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(List list, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
            androidx.compose.ui.layout.i2.a.P(aVar, (androidx.compose.ui.layout.i2) list.get(0), 0, 0, 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.P(aVar, (androidx.compose.ui.layout.i2) list.get(1), ((androidx.compose.ui.layout.i2) list.get(0)).h1(), 0, 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var, ((androidx.compose.ui.layout.i2) list.get(0)).h1() - (i2Var.h1() / 2), 0, 0.0f, 4, null);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.z0 z0Var = list.get(i10);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "Spacer")) {
                    final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, c1Var.g6(d0.b3.f267681a.y()), 0, 0, 12, null));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        androidx.compose.ui.layout.z0 z0Var2 = list.get(i11);
                        if (!Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "Spacer")) {
                            arrayList.add(z0Var2);
                        }
                    }
                    final ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        arrayList2.add(((androidx.compose.ui.layout.z0) arrayList.get(i12)).P0(androidx.compose.ui.unit.b.d(j10, 0, androidx.compose.ui.unit.b.p(j10) / 2, 0, 0, 12, null)));
                    }
                    return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, new Function1() { // from class: androidx.compose.material3.w70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.e.g(arrayList2, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
                        }
                    }, 4, null);
                }
            }
            androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
            throw new kotlin.a0();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.f2<Boolean> f32793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h80 f32794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> f32795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> f32796e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.node.f2<Boolean> f2Var, h80 h80Var, androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var, androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var2, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f32793b = f2Var;
            this.f32794c = h80Var;
            this.f32795d = n3Var;
            this.f32796e = n3Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f32793b, this.f32794c, this.f32795d, this.f32796e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f32792a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (Intrinsics.areEqual(this.f32793b.a(), kotlin.coroutines.jvm.internal.b.a(true))) {
                s70.B0(this.f32795d, s70.y0(this.f32794c));
                s70.E0(this.f32796e, s70.G0(this.f32794c));
            }
            this.f32793b.b(kotlin.coroutines.jvm.internal.b.a(true));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$2$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2144:1\n99#2:2145\n95#2,10:2146\n106#2:2222\n79#3,6:2156\n86#3,3:2171\n89#3,2:2180\n93#3:2221\n347#4,9:2162\n356#4:2182\n357#4,2:2219\n4206#5,6:2174\n1282#6,6:2183\n1282#6,6:2189\n1282#6,6:2195\n1282#6,6:2201\n1282#6,6:2207\n1282#6,6:2213\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$2$1\n*L\n1033#1:2145\n1033#1:2146,10\n1033#1:2222\n1033#1:2156,6\n1033#1:2171,3\n1033#1:2180,2\n1033#1:2221\n1033#1:2162,9\n1033#1:2182\n1033#1:2219,2\n1033#1:2174,6\n1036#1:2183,6\n1050#1:2189,6\n1071#1:2195,6\n1080#1:2201,6\n1092#1:2207,6\n1113#1:2213,6\n*E\n"})
    static final class g implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> f32797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h80 f32798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.f2<Boolean> f32799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u50 f32800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> f32801e;

        static final class a implements Function1<androidx.compose.ui.input.key.c, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h80 f32802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> f32803b;

            a(h80 h80Var, androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var) {
                this.f32802a = h80Var;
                this.f32803b = n3Var;
            }

            public final Boolean c(KeyEvent keyEvent) {
                int iC = androidx.compose.ui.input.key.e.c(keyEvent);
                if (48 <= iC && iC < 58 && androidx.compose.ui.text.w3.n(s70.A0(this.f32803b).l()) == 2 && s70.A0(this.f32803b).m().length() == 2) {
                    this.f32802a.b(g80.f27919b.b());
                }
                return Boolean.FALSE;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
                return c(cVar.h());
            }
        }

        static final class b implements Function1<androidx.compose.ui.input.key.c, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h80 f32804a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> f32805b;

            b(h80 h80Var, androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var) {
                this.f32804a = h80Var;
                this.f32805b = n3Var;
            }

            public final Boolean c(KeyEvent keyEvent) {
                boolean z10 = androidx.compose.ui.input.key.e.c(keyEvent) == 0 && androidx.compose.ui.text.w3.n(s70.D0(this.f32805b).l()) == 0;
                if (z10) {
                    this.f32804a.b(g80.f27919b.a());
                }
                return Boolean.valueOf(z10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
                return c(cVar.h());
            }
        }

        g(androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var, h80 h80Var, androidx.compose.ui.node.f2<Boolean> f2Var, u50 u50Var, androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var2) {
            this.f32797a = n3Var;
            this.f32798b = h80Var;
            this.f32799c = f2Var;
            this.f32800d = u50Var;
            this.f32801e = n3Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit A(androidx.compose.runtime.n3 n3Var, androidx.compose.ui.text.input.y0 y0Var) {
            s70.E0(n3Var, y0Var);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(h80 h80Var, androidx.compose.foundation.text.y3 y3Var) {
            h80Var.b(g80.f27919b.b());
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(h80 h80Var, androidx.compose.ui.node.f2 f2Var, final androidx.compose.runtime.n3 n3Var, androidx.compose.ui.text.input.y0 y0Var) {
            s70.T1(g80.f27919b.a(), h80Var, y0Var, s70.A0(n3Var), h80Var.g() ? 23 : 12, f2Var, new Function1() { // from class: androidx.compose.material3.x70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s70.g.x(n3Var, (androidx.compose.ui.text.input.y0) obj);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(androidx.compose.runtime.n3 n3Var, androidx.compose.ui.text.input.y0 y0Var) {
            s70.B0(n3Var, y0Var);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(h80 h80Var, androidx.compose.foundation.text.y3 y3Var) {
            h80Var.b(g80.f27919b.b());
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit z(h80 h80Var, androidx.compose.ui.node.f2 f2Var, final androidx.compose.runtime.n3 n3Var, androidx.compose.ui.text.input.y0 y0Var) {
            s70.T1(g80.f27919b.b(), h80Var, y0Var, s70.D0(n3Var), 59, f2Var, new Function1() { // from class: androidx.compose.material3.y70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s70.g.A(n3Var, (androidx.compose.ui.text.input.y0) obj);
                }
            });
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            n(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void n(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1306700887, i10, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:1032)");
            }
            final androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var = this.f32797a;
            final h80 h80Var = this.f32798b;
            final androidx.compose.ui.node.f2<Boolean> f2Var = this.f32799c;
            u50 u50Var = this.f32800d;
            final androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var2 = this.f32801e;
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
            boolean zD = c0Var.D(n3Var) | c0Var.k0(h80Var);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a(h80Var, n3Var);
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.input.key.f.a(aVar, (Function1) objI0);
            androidx.compose.ui.text.input.y0 y0VarA0 = s70.A0(n3Var);
            boolean zK0 = c0Var.k0(h80Var) | c0Var.D(n3Var) | c0Var.k0(f2Var);
            Object objI1 = c0Var.i0();
            if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.z70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.g.v(h80Var, f2Var, n3Var, (androidx.compose.ui.text.input.y0) obj);
                    }
                };
                c0Var.Y(objI1);
            }
            Function1 function1 = (Function1) objI1;
            g80.a aVar3 = g80.f27919b;
            int iA = aVar3.a();
            androidx.compose.ui.text.input.t.a aVar4 = androidx.compose.ui.text.input.t.f41944b;
            int iG = aVar4.g();
            androidx.compose.ui.text.input.b0.a aVar5 = androidx.compose.ui.text.input.b0.f41811b;
            androidx.compose.foundation.text.b4 b4Var = new androidx.compose.foundation.text.b4(0, (Boolean) null, aVar5.g(), iG, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null);
            boolean zK1 = c0Var.k0(h80Var);
            Object objI2 = c0Var.i0();
            if (zK1 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material3.a80
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.g.y(h80Var, (androidx.compose.foundation.text.y3) obj);
                    }
                };
                c0Var.Y(objI2);
            }
            s70.J0(a0VarA, y0VarA0, function1, h80Var, iA, b4Var, new androidx.compose.foundation.text.z3(null, null, (Function1) objI2, null, null, null, 59, null), u50Var, c0Var, 24576, 0);
            s70.g0(androidx.compose.foundation.layout.i6.y(aVar, s70.f32757k, d0.a3.f267591a.g()), c0Var, 6);
            boolean zD2 = c0Var.D(n3Var2) | c0Var.k0(h80Var);
            Object objI3 = c0Var.i0();
            if (zD2 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = new b(h80Var, n3Var2);
                c0Var.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.input.key.f.b(aVar, (Function1) objI3);
            androidx.compose.ui.text.input.y0 y0VarD0 = s70.D0(n3Var2);
            boolean zK2 = c0Var.k0(h80Var) | c0Var.D(n3Var2) | c0Var.k0(f2Var);
            Object objI4 = c0Var.i0();
            if (zK2 || objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                objI4 = new Function1() { // from class: androidx.compose.material3.b80
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.g.z(h80Var, f2Var, n3Var2, (androidx.compose.ui.text.input.y0) obj);
                    }
                };
                c0Var.Y(objI4);
            }
            Function1 function2 = (Function1) objI4;
            int iB = aVar3.b();
            androidx.compose.foundation.text.b4 b4Var2 = new androidx.compose.foundation.text.b4(0, (Boolean) null, aVar5.g(), aVar4.c(), (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null);
            boolean zK3 = c0Var.k0(h80Var);
            Object objI5 = c0Var.i0();
            if (zK3 || objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                objI5 = new Function1() { // from class: androidx.compose.material3.c80
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.g.s(h80Var, (androidx.compose.foundation.text.y3) obj);
                    }
                };
                c0Var.Y(objI5);
            }
            s70.J0(a0VarB, y0VarD0, function2, h80Var, iB, b4Var2, new androidx.compose.foundation.text.z3(null, null, (Function1) objI5, null, null, null, 59, null), u50Var, c0Var, 24576, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt$TimePicker$1$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.f2<Boolean> f32807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.j f32808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h80 f32809d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.ui.node.f2<Boolean> f2Var, androidx.compose.material3.j jVar, h80 h80Var, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f32807b = f2Var;
            this.f32808c = jVar;
            this.f32809d = h80Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f32807b, this.f32808c, this.f32809d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f32806a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (Intrinsics.areEqual(this.f32807b.a(), kotlin.coroutines.jvm.internal.b.a(true))) {
                this.f32808c.d(this.f32809d.a());
                this.f32808c.e(this.f32809d.f());
            }
            this.f32807b.b(kotlin.coroutines.jvm.internal.b.a(true));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2144:1\n113#2:2145\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n*L\n1934#1:2145\n*E\n"})
    static final class i implements pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.y0 f32810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f32811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j40 f32812c;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.j f32813a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j40 f32814b;

            a(androidx.compose.foundation.interaction.j jVar, j40 j40Var) {
                this.f32813a = jVar;
                this.f32814b = j40Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(769667466, i10, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1935)");
                }
                lq.f30410a.d(true, false, this.f32813a, null, this.f32814b, cx.i(d0.a3.f267591a.x(), c0Var, 6), 0.0f, 0.0f, c0Var, 100663734, 200);
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

        i(androidx.compose.ui.text.input.y0 y0Var, androidx.compose.foundation.interaction.j jVar, j40 j40Var) {
            this.f32810a = y0Var;
            this.f32811b = jVar;
            this.f32812c = j40Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @androidx.compose.runtime.o
        @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, int i10) {
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
            int i11;
            if ((i10 & 6) == 0) {
                function3 = function2;
                i11 = i10 | (c0Var.k0(function3) ? 4 : 2);
            } else {
                function3 = function2;
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1007938103, i11, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1925)");
            }
            lq lqVar = lq.f30410a;
            String strM = this.f32810a.m();
            androidx.compose.ui.text.input.j1 j1VarC = androidx.compose.ui.text.input.j1.f41895a.c();
            androidx.compose.foundation.layout.g5 g5VarF = androidx.compose.foundation.layout.d5.f(androidx.compose.ui.unit.h.r(0));
            androidx.compose.foundation.interaction.j jVar = this.f32811b;
            j40 j40Var = this.f32812c;
            lqVar.h(strM, function3, true, true, j1VarC, jVar, false, null, null, null, null, null, null, null, j40Var, g5VarF, androidx.compose.runtime.internal.w.e(769667466, true, new a(jVar, j40Var), c0Var, 54), c0Var, ((i11 << 3) & com.planner5d.library.engine.input.f.b.B) | 224640, 14352384, 16320);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit> function2, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(function2, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h80 f32816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.g0 f32818d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(h80 h80Var, int i10, androidx.compose.ui.focus.g0 g0Var, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f32816b = h80Var;
            this.f32817c = i10;
            this.f32818d = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new j(this.f32816b, this.f32817c, this.f32818d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f32815a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (g80.f(this.f32816b.c(), this.f32817c)) {
                androidx.compose.ui.focus.g0.k(this.f32818d, 0, 1, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeSelector$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2144:1\n70#2:2145\n66#2,10:2146\n77#2:2192\n79#3,6:2156\n86#3,3:2171\n89#3,2:2180\n93#3:2191\n347#4,9:2162\n356#4:2182\n357#4,2:2189\n4206#5,6:2174\n1282#6,6:2183\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeSelector$3\n*L\n1439#1:2145\n1439#1:2146,10\n1439#1:2192\n1439#1:2156,6\n1439#1:2171,3\n1439#1:2180,2\n1439#1:2191\n1439#1:2162,9\n1439#1:2182\n1439#1:2189,2\n1439#1:2174,6\n1441#1:2183,6\n*E\n"})
    static final class k implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h80 f32820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f32822d;

        k(int i10, h80 h80Var, int i11, long j10) {
            this.f32819a = i10;
            this.f32820b = h80Var;
            this.f32821c = i11;
            this.f32822d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, androidx.compose.ui.semantics.e0 e0Var) {
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
                androidx.compose.runtime.m0.A0(-1477282471, i10, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1431)");
            }
            final String strP1 = s70.P1(this.f32819a, this.f32820b.g(), this.f32821c, c0Var, 0);
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            int i11 = this.f32821c;
            long j10 = this.f32822d;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
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
            boolean zD = c0Var.D(strP1);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.d80
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.k.f(strP1, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(c4.c(i11, 2, 0, false, null, 14, null), androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262136);
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

    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2144:1\n563#2,2:2145\n34#2,6:2147\n565#2:2153\n230#2,3:2154\n34#2,6:2157\n233#2:2163\n150#2,3:2164\n34#2,6:2167\n153#2:2173\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1\n*L\n1256#1:2145,2\n1256#1:2147,6\n1256#1:2153\n1267#1:2154,3\n1267#1:2157,6\n1267#1:2163\n1268#1:2164,3\n1268#1:2167,6\n1268#1:2173\n*E\n"})
    static final class l implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f32823a = new l();

        l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(List list, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
            androidx.compose.ui.layout.i2.a.P(aVar, (androidx.compose.ui.layout.i2) list.get(0), 0, 0, 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.P(aVar, (androidx.compose.ui.layout.i2) list.get(1), 0, ((androidx.compose.ui.layout.i2) list.get(0)).c1(), 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, ((androidx.compose.ui.layout.i2) list.get(0)).c1() - (i2Var.c1() / 2), 0.0f, 4, null);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.z0 z0Var = list.get(i10);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "Spacer")) {
                    final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, c1Var.g6(d0.b3.f267681a.y()), 3, null));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        androidx.compose.ui.layout.z0 z0Var2 = list.get(i11);
                        if (!Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "Spacer")) {
                            arrayList.add(z0Var2);
                        }
                    }
                    final ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        arrayList2.add(((androidx.compose.ui.layout.z0) arrayList.get(i12)).P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, androidx.compose.ui.unit.b.o(j10) / 2, 3, null)));
                    }
                    return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, new Function1() { // from class: androidx.compose.material3.e80
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.l.g(arrayList2, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
                        }
                    }, 4, null);
                }
            }
            androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
            throw new kotlin.a0();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt", f = "TimePicker.kt", i = {0, 0, 1, 1}, l = {920, 923}, m = "onTap-uYHVD98", n = {"$this$onTap_u2duYHVD98", "autoSwitchToMinute", "$this$onTap_u2duYHVD98", "autoSwitchToMinute"}, s = {"L$0", "Z$0", "L$0", "Z$0"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f32825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32827d;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32826c = obj;
            this.f32827d |= Integer.MIN_VALUE;
            return s70.Q1(null, 0.0f, 0.0f, 0.0f, false, 0L, null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n1#1,110:1\n2097#2,3:111\n*E\n"})
    public static final class n extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32828a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z10) {
            super(1);
            this.f32828a = z10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("visible");
            t2Var.b().c("visible", Boolean.valueOf(this.f32828a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    static {
        float fR = androidx.compose.ui.unit.h.r(101);
        d0.b3 b3Var = d0.b3.f267681a;
        f32753g = fR / b3Var.b();
        f32754h = androidx.compose.ui.unit.h.r(69) / b3Var.b();
        f32755i = androidx.compose.ui.unit.h.r(36);
        float f10 = 24;
        f32756j = androidx.compose.ui.unit.h.r(f10);
        f32757k = androidx.compose.ui.unit.h.r(f10);
        f32758l = androidx.compose.ui.unit.h.r(7);
        f32759m = androidx.compose.ui.unit.h.r(f10);
        f32760n = androidx.compose.ui.unit.h.r(74);
        f32761o = androidx.compose.ui.unit.h.r(48);
        f32762p = androidx.collection.g0.h(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        androidx.collection.f0 f0VarH = androidx.collection.g0.h(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f32763q = f0VarH;
        androidx.collection.r1 r1Var = new androidx.collection.r1(f0VarH.f12216b);
        int[] iArr = f0VarH.f12215a;
        int i10 = f0VarH.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            r1Var.b0((iArr[i11] % 12) + 12);
        }
        f32764r = r1Var;
        f32765s = androidx.compose.ui.unit.h.r(12);
        f32766t = androidx.compose.ui.unit.h.r(androidx.media3.exoplayer.a5.S0);
        f32767u = androidx.compose.ui.unit.h.r(330);
        f32768v = androidx.compose.ui.unit.h.r(238);
        f32769w = androidx.compose.ui.unit.h.r(200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.y0 A0(androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var, androidx.compose.ui.text.input.y0 y0Var) {
        n3Var.setValue(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.n3 C0(h80 h80Var) {
        return androidx.compose.runtime.d7.g(G0(h80Var), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.y0 D0(androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var, androidx.compose.ui.text.input.y0 y0Var) {
        n3Var.setValue(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float E1(float f10, float f11) {
        float fAtan2 = ((float) Math.atan2(f10, f11)) - 1.5707964f;
        boolean z10 = false | false;
        return fAtan2 < 0.0f ? fAtan2 + 6.2831855f : fAtan2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(androidx.compose.ui.a0 a0Var, u50 u50Var, h80 h80Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        x0(a0Var, u50Var, h80Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final float F1(float f10, float f11, int i10, int i11) {
        return (float) Math.hypot(i10 - f10, i11 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.y0 G0(h80 h80Var) {
        return new androidx.compose.ui.text.input.y0(c4.c(h80Var.f(), 2, 0, false, null, 14, null), 0L, (androidx.compose.ui.text.w3) null, 6, (DefaultConstructorMarker) null);
    }

    private static final androidx.compose.ui.a0 G1(androidx.compose.ui.a0 a0Var, final androidx.compose.material3.j jVar, final u50 u50Var) {
        return androidx.compose.ui.draw.n.d(a0Var, new Function1() { // from class: androidx.compose.material3.u60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s70.H1(jVar, u50Var, (androidx.compose.ui.graphics.drawscope.c) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x0164  */
    /* JADX WARN: Code duplicated, block: B:110:0x016e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0174  */
    /* JADX WARN: Code duplicated, block: B:115:0x018e  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107  */
    /* JADX WARN: Code duplicated, block: B:87:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x0129  */
    /* JADX WARN: Code duplicated, block: B:98:0x012f  */
    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void H0(@NotNull final h80 h80Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable u50 u50Var, int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        u50 u50Var2;
        int i14;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final u50 u50Var3;
        final int i15;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        u50 u50VarA;
        int i16;
        u50 u50Var4;
        int iD;
        androidx.compose.runtime.n7<Boolean> n7VarN;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        androidx.compose.ui.node.f2 f2Var;
        int i17;
        boolean z11;
        Object objI1;
        androidx.compose.material3.j jVar;
        boolean z12;
        boolean z13;
        Object objI2;
        u50 u50Var5;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-619286452);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? c0VarR.D(h80Var) : c0VarR.k0(h80Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    u50Var2 = u50Var;
                    int i19 = c0VarR.D(u50Var2) ? 256 : 128;
                    i13 |= i19;
                } else {
                    u50Var2 = u50Var;
                }
                i13 |= i19;
            } else {
                u50Var2 = u50Var;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    i14 = i10;
                    int i20 = c0VarR.K(i14) ? 2048 : 1024;
                    i13 |= i20;
                } else {
                    i14 = i10;
                }
                i13 |= i20;
            } else {
                i14 = i10;
            }
            if ((i13 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0 || c0VarR.y()) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        u50VarA = v50.f33879a.a(c0VarR, 6);
                        i13 &= -897;
                    } else {
                        u50VarA = u50Var2;
                    }
                    if ((i12 & 8) != 0) {
                        i16 = i13 & (-7169);
                        u50Var4 = u50VarA;
                        iD = v50.f33879a.d(c0VarR, 6);
                    } else {
                        i16 = i13;
                        u50Var4 = u50VarA;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-619286452, i16, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:224)");
                    }
                    n7VarN = androidx.compose.material3.internal.h.n(false, false, false, c0VarR, 0, 7);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new androidx.compose.ui.node.f2();
                        c0VarR.Y(objI0);
                    }
                    f2Var = (androidx.compose.ui.node.f2) objI0;
                    i17 = i16 & 14;
                    if (i17 != 4 || ((i16 & 8) != 0 && c0VarR.D(h80Var))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11 || objI1 == aVar.a()) {
                        objI1 = new androidx.compose.material3.j(h80Var, f2Var);
                        c0VarR.Y(objI1);
                    }
                    jVar = (androidx.compose.material3.j) objI1;
                    Integer numValueOf = Integer.valueOf(h80Var.a());
                    Integer numValueOf2 = Integer.valueOf(h80Var.f());
                    boolean zK0 = c0VarR.k0(f2Var) | c0VarR.k0(jVar);
                    if (i17 != 4 || ((i16 & 8) != 0 && c0VarR.k0(h80Var))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zK0 | z12;
                    objI2 = c0VarR.i0();
                    if (z13 || objI2 == aVar.a()) {
                        objI2 = new h(f2Var, jVar, h80Var, null);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.b2.h(numValueOf, numValueOf2, (Function2) objI2, c0VarR, 0);
                    if (f80.f(iD, f80.f27609b.b())) {
                        c0VarR.E(2017551219);
                        u50Var5 = u50Var4;
                        a0Var5 = a0Var4;
                        a1(jVar, a0Var5, u50Var5, !N0(n7VarN), c0VarR, i16 & 1008, 0);
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    } else {
                        u50Var5 = u50Var4;
                        a0Var5 = a0Var4;
                        c0VarR.E(2017750673);
                        n0(jVar, a0Var5, u50Var5, !N0(n7VarN), c0VarR, i16 & 1008, 0);
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    u50Var3 = u50Var5;
                    i15 = iD;
                } else {
                    c0VarR.u();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    i16 = i13;
                    a0Var4 = a0Var2;
                    u50Var4 = u50Var2;
                }
                iD = i14;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-619286452, i16, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:224)");
                }
                n7VarN = androidx.compose.material3.internal.h.n(false, false, false, c0VarR, 0, 7);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new androidx.compose.ui.node.f2();
                    c0VarR.Y(objI0);
                }
                f2Var = (androidx.compose.ui.node.f2) objI0;
                i17 = i16 & 14;
                if (i17 != 4) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                objI1 = c0VarR.i0();
                if (z11) {
                    objI1 = new androidx.compose.material3.j(h80Var, f2Var);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new androidx.compose.material3.j(h80Var, f2Var);
                    c0VarR.Y(objI1);
                }
                jVar = (androidx.compose.material3.j) objI1;
                Integer numValueOf3 = Integer.valueOf(h80Var.a());
                Integer numValueOf4 = Integer.valueOf(h80Var.f());
                boolean zK1 = c0VarR.k0(f2Var) | c0VarR.k0(jVar);
                if (i17 != 4) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                z13 = zK1 | z12;
                objI2 = c0VarR.i0();
                if (z13) {
                    objI2 = new h(f2Var, jVar, h80Var, null);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new h(f2Var, jVar, h80Var, null);
                    c0VarR.Y(objI2);
                }
                androidx.compose.runtime.b2.h(numValueOf3, numValueOf4, (Function2) objI2, c0VarR, 0);
                if (f80.f(iD, f80.f27609b.b())) {
                    c0VarR.E(2017551219);
                    u50Var5 = u50Var4;
                    a0Var5 = a0Var4;
                    a1(jVar, a0Var5, u50Var5, !N0(n7VarN), c0VarR, i16 & 1008, 0);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                } else {
                    u50Var5 = u50Var4;
                    a0Var5 = a0Var4;
                    c0VarR.E(2017750673);
                    n0(jVar, a0Var5, u50Var5, !N0(n7VarN), c0VarR, i16 & 1008, 0);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                u50Var3 = u50Var5;
                i15 = iD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                u50Var3 = u50Var2;
                i15 = i14;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.n60
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s70.O0(h80Var, a0Var3, u50Var3, i15, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                u50Var2 = u50Var;
                if (c0VarR.D(u50Var2)) {
                }
                i13 |= i19;
            } else {
                u50Var2 = u50Var;
            }
            i13 |= i19;
        } else {
            u50Var2 = u50Var;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                i14 = i10;
                if (c0VarR.K(i14)) {
                }
                i13 |= i20;
            } else {
                i14 = i10;
            }
            i13 |= i20;
        } else {
            i14 = i10;
        }
        if ((i13 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    u50VarA = v50.f33879a.a(c0VarR, 6);
                    i13 &= -897;
                } else {
                    u50VarA = u50Var2;
                }
                if ((i12 & 8) != 0) {
                    i16 = i13 & (-7169);
                    u50Var4 = u50VarA;
                    iD = v50.f33879a.d(c0VarR, 6);
                } else {
                    i16 = i13;
                    u50Var4 = u50VarA;
                    iD = i14;
                }
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    u50VarA = v50.f33879a.a(c0VarR, 6);
                    i13 &= -897;
                } else {
                    u50VarA = u50Var2;
                }
                if ((i12 & 8) != 0) {
                    i16 = i13 & (-7169);
                    u50Var4 = u50VarA;
                    iD = v50.f33879a.d(c0VarR, 6);
                } else {
                    i16 = i13;
                    u50Var4 = u50VarA;
                    iD = i14;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-619286452, i16, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:224)");
            }
            n7VarN = androidx.compose.material3.internal.h.n(false, false, false, c0VarR, 0, 7);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new androidx.compose.ui.node.f2();
                c0VarR.Y(objI0);
            }
            f2Var = (androidx.compose.ui.node.f2) objI0;
            i17 = i16 & 14;
            if (i17 != 4) {
                z11 = true;
            } else {
                z11 = true;
            }
            objI1 = c0VarR.i0();
            if (z11) {
                objI1 = new androidx.compose.material3.j(h80Var, f2Var);
                c0VarR.Y(objI1);
            } else {
                objI1 = new androidx.compose.material3.j(h80Var, f2Var);
                c0VarR.Y(objI1);
            }
            jVar = (androidx.compose.material3.j) objI1;
            Integer numValueOf5 = Integer.valueOf(h80Var.a());
            Integer numValueOf6 = Integer.valueOf(h80Var.f());
            boolean zK2 = c0VarR.k0(f2Var) | c0VarR.k0(jVar);
            if (i17 != 4) {
                z12 = true;
            } else {
                z12 = true;
            }
            z13 = zK2 | z12;
            objI2 = c0VarR.i0();
            if (z13) {
                objI2 = new h(f2Var, jVar, h80Var, null);
                c0VarR.Y(objI2);
            } else {
                objI2 = new h(f2Var, jVar, h80Var, null);
                c0VarR.Y(objI2);
            }
            androidx.compose.runtime.b2.h(numValueOf5, numValueOf6, (Function2) objI2, c0VarR, 0);
            if (f80.f(iD, f80.f27609b.b())) {
                c0VarR.E(2017551219);
                u50Var5 = u50Var4;
                a0Var5 = a0Var4;
                a1(jVar, a0Var5, u50Var5, !N0(n7VarN), c0VarR, i16 & 1008, 0);
                c0Var2 = c0VarR;
                c0Var2.A();
            } else {
                u50Var5 = u50Var4;
                a0Var5 = a0Var4;
                c0VarR.E(2017750673);
                n0(jVar, a0Var5, u50Var5, !N0(n7VarN), c0VarR, i16 & 1008, 0);
                c0Var2 = c0VarR;
                c0Var2.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            u50Var3 = u50Var5;
            i15 = iD;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            u50Var3 = u50Var2;
            i15 = i14;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.n60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.O0(h80Var, a0Var3, u50Var3, i15, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(androidx.compose.material3.j jVar, u50 u50Var, androidx.compose.ui.graphics.drawscope.c cVar) {
        float fS7 = cVar.S7(androidx.compose.ui.unit.j.j(M1(jVar)));
        long jG = n0.g.g((((long) Float.floatToRawIntBits(cVar.S7(androidx.compose.ui.unit.j.l(M1(jVar))))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fS7) << 32));
        d0.b3 b3Var = d0.b3.f267681a;
        float fS8 = ((cVar.S7(b3Var.j()) / 2.0f) * cVar.g6(jVar.v())) / cVar.g6(b3Var.b());
        long jM = u50Var.m();
        long jA = androidx.compose.ui.graphics.q0.f38131b.a();
        androidx.compose.ui.graphics.d0.a aVar = androidx.compose.ui.graphics.d0.f37693b;
        androidx.compose.ui.graphics.drawscope.f.B4(cVar, jA, fS8, jG, 0.0f, null, null, aVar.a(), 56, null);
        cVar.E4();
        androidx.compose.ui.graphics.drawscope.f.B4(cVar, jM, fS8, jG, 0.0f, null, null, aVar.C(), 56, null);
        float fS9 = cVar.S7(b3Var.l());
        float fCos = ((float) Math.cos(jVar.u())) * fS8;
        androidx.compose.ui.graphics.drawscope.f.j2(cVar, jM, n0.o.b(cVar.d()), n0.g.v(jG, n0.g.g((((long) Float.floatToRawIntBits(((float) Math.sin(jVar.u())) * fS8)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fCos) << 32))), fS9, 0, null, 0.0f, null, aVar.B(), 240, null);
        androidx.compose.ui.graphics.drawscope.f.B4(cVar, jM, cVar.S7(b3Var.g()) / 2, n0.o.b(cVar.d()), 0.0f, null, null, 0, 120, null);
        androidx.compose.ui.graphics.drawscope.f.B4(cVar, u50Var.a(true), fS8, jG, 0.0f, null, null, aVar.k(), 56, null);
        return Unit.f312394a;
    }

    @af
    @NotNull
    public static final h80 I0(int i10, int i11, boolean z10) {
        return new k80(i10, i11, z10);
    }

    public static final float I1() {
        return f32769w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x014f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0301  */
    /* JADX WARN: Code duplicated, block: B:114:0x030d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0311  */
    /* JADX WARN: Code duplicated, block: B:118:0x0334  */
    /* JADX WARN: Code duplicated, block: B:120:0x0342  */
    /* JADX WARN: Code duplicated, block: B:123:0x035c  */
    /* JADX WARN: Code duplicated, block: B:125:0x037e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0384  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x0406  */
    /* JADX WARN: Code duplicated, block: B:140:0x0412  */
    /* JADX WARN: Code duplicated, block: B:141:0x0416  */
    /* JADX WARN: Code duplicated, block: B:144:0x0435  */
    /* JADX WARN: Code duplicated, block: B:146:0x0443  */
    /* JADX WARN: Code duplicated, block: B:149:0x0476  */
    /* JADX WARN: Code duplicated, block: B:151:0x047c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0597  */
    /* JADX WARN: Code duplicated, block: B:157:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:159:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:162:0x0623  */
    /* JADX WARN: Code duplicated, block: B:164:0x0627  */
    /* JADX WARN: Code duplicated, block: B:167:0x0632  */
    /* JADX WARN: Code duplicated, block: B:169:0x0636  */
    /* JADX WARN: Code duplicated, block: B:174:0x0643  */
    /* JADX WARN: Code duplicated, block: B:177:0x064d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0653  */
    /* JADX WARN: Code duplicated, block: B:182:0x066b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0672  */
    /* JADX WARN: Code duplicated, block: B:187:0x067f  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void J0(final androidx.compose.ui.a0 a0Var, final androidx.compose.ui.text.input.y0 y0Var, final Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, h80 h80Var, int i10, androidx.compose.foundation.text.b4 b4Var, androidx.compose.foundation.text.z3 z3Var, final u50 u50Var, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        boolean zK0;
        int i14;
        int i15;
        int i16;
        androidx.compose.foundation.text.b4 b4Var2;
        int i17;
        int i18;
        androidx.compose.foundation.text.z3 z3Var2;
        int i19;
        int i20;
        boolean z10;
        int i21;
        h80 h80Var2;
        final androidx.compose.foundation.text.z3 z3Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.foundation.text.b4 b4VarA;
        androidx.compose.foundation.text.z3 z3VarA;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        Object objI1;
        androidx.compose.ui.focus.g0 g0Var;
        boolean zF;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        int i22;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0Var2;
        g80.a aVar2;
        int iB;
        final String strB;
        int iJ2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        boolean zD;
        Object objI2;
        androidx.compose.runtime.c0 c0Var3;
        Object objI3;
        int iB2;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objI4;
        int iF;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1299172990);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.D(a0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= c0VarR.D(y0Var) ? 32 : 16;
        }
        if ((i12 & 4) == 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                i13 |= c0VarR.k0(function1) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if ((i11 & 4096) == 0) {
                    zK0 = c0VarR.D(h80Var);
                } else {
                    zK0 = c0VarR.k0(h80Var);
                }
                if (zK0) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (c0VarR.K(i10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    b4Var2 = b4Var;
                    if (c0VarR.D(b4Var2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                    z3Var2 = z3Var;
                } else {
                    z3Var2 = z3Var;
                    if ((i11 & 1572864) == 0) {
                        if (c0VarR.D(z3Var2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c0VarR.D(u50Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                if ((4793491 & i13) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i16 != 0) {
                        b4VarA = androidx.compose.foundation.text.b4.f18781h.a();
                    } else {
                        b4VarA = b4Var2;
                    }
                    if (i18 != 0) {
                        z3VarA = androidx.compose.foundation.text.z3.f21809g.a();
                    } else {
                        z3VarA = z3Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1299172990, i13, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1866)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new androidx.compose.ui.focus.g0();
                        c0VarR.Y(objI1);
                    }
                    g0Var = (androidx.compose.ui.focus.g0) objI1;
                    j40 j40VarK = lq.f30410a.k(u50Var.u(true), 0L, 0L, 0L, u50Var.t(true), u50Var.t(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 0, 0, 0, 3072, 2147483598, 4095);
                    zF = g80.f(i10, h80Var.c());
                    androidx.compose.foundation.layout.q.m mVarY = androidx.compose.foundation.layout.q.f16330a.y();
                    androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar3.u(), c0VarR, 0);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    function0A = aVar4.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    i22 = i13;
                    androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar4.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar4.g());
                    function2B = aVar4.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar4.f());
                    androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                    if (zF) {
                        c0Var2 = c0VarR;
                        c0Var2.E(2023879982);
                        c0Var2.A();
                    } else {
                        c0VarR.E(2023424468);
                        androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                        d0.a3 a3Var = d0.a3.f267591a;
                        androidx.compose.ui.a0 a0VarY = androidx.compose.foundation.layout.i6.y(aVar5, a3Var.y(), a3Var.w());
                        if (g80.f(i10, g80.f27919b.a())) {
                            iF = L1(h80Var);
                        } else {
                            iF = h80Var.f();
                        }
                        int i23 = iF;
                        int i24 = i22 >> 3;
                        c0Var2 = c0VarR;
                        P0(a0VarY, i23, h80Var, i10, u50Var, c0Var2, (i24 & 7168) | (i24 & 896) | 6 | ((i22 >> 9) & 57344));
                        c0Var2.A();
                    }
                    aVar2 = g80.f27919b;
                    if (g80.f(i10, aVar2.b())) {
                        androidx.compose.material3.internal.l3.a aVar6 = androidx.compose.material3.internal.l3.f29010b;
                        iB = androidx.compose.material3.internal.l3.b(ps.b.f31837f0);
                    } else {
                        androidx.compose.material3.internal.l3.a aVar7 = androidx.compose.material3.internal.l3.f29010b;
                        iB = androidx.compose.material3.internal.l3.b(ps.b.f31829b0);
                    }
                    strB = androidx.compose.material3.internal.m3.b(iB, c0Var2, 0);
                    androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarU1 = U1(aVar8, zF);
                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                    iJ2 = androidx.compose.runtime.v.j(c0Var2, 0);
                    androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarU1);
                    function0A2 = aVar4.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A2);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD2 = androidx.compose.runtime.y7.d(c0Var2);
                    androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar4.e());
                    androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar4.g());
                    function2B2 = aVar4.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar4.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.ui.a0 a0VarA = androidx.compose.ui.focus.j0.a(aVar8, r8);
                    d0.a3 a3Var2 = d0.a3.f267591a;
                    androidx.compose.ui.a0 a0VarY2 = androidx.compose.foundation.layout.i6.y(a0VarA, a3Var2.y(), a3Var2.w());
                    zD = c0Var2.D(strB);
                    objI2 = c0Var2.i0();
                    if (zD || objI2 == aVar.a()) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.m70
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s70.K0(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var2.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarY2, false, (Function1) objI2, 1, null);
                    androidx.compose.ui.text.y3 y3Var = (androidx.compose.ui.text.y3) c0Var2.W(q50.I());
                    androidx.compose.ui.graphics.i0.a aVar9 = androidx.compose.ui.graphics.i0.f37796b;
                    Float fValueOf = Float.valueOf(0.0f);
                    androidx.compose.ui.graphics.q0.a aVar10 = androidx.compose.ui.graphics.q0.f38131b;
                    Pair pair = TuplesKt.to(fValueOf, androidx.compose.ui.graphics.q0.n(aVar10.s()));
                    Pair pair2 = TuplesKt.to(Float.valueOf(0.1f), androidx.compose.ui.graphics.q0.n(aVar10.s()));
                    Float fValueOf2 = Float.valueOf(0.1f);
                    pj pjVar = pj.f31758a;
                    int i25 = i22 >> 3;
                    int i26 = i22 << 3;
                    c0Var3 = c0Var2;
                    androidx.compose.foundation.text.b4 b4Var3 = b4VarA;
                    androidx.compose.foundation.text.z3 z3Var4 = z3VarA;
                    androidx.compose.foundation.text.s0.x(y0Var, function1, a0VarF, true, false, y3Var, b4Var3, z3Var4, true, 0, 0, null, null, jVar, androidx.compose.ui.graphics.i0.a.u(aVar9, new Pair[]{pair, pair2, TuplesKt.to(fValueOf2, androidx.compose.ui.graphics.q0.n(pjVar.a(c0Var2, 6).D0())), TuplesKt.to(Float.valueOf(0.9f), androidx.compose.ui.graphics.q0.n(pjVar.a(c0Var2, 6).D0())), TuplesKt.to(Float.valueOf(0.9f), androidx.compose.ui.graphics.q0.n(aVar10.s())), TuplesKt.to(Float.valueOf(1.0f), androidx.compose.ui.graphics.q0.n(aVar10.s()))}, 0.0f, 0.0f, 0, 14, null), androidx.compose.runtime.internal.w.e(1007938103, true, new i(y0Var, r117, j40VarK), c0Var2, 54), c0Var3, (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 14) | 100666368 | (3670016 & i26) | (i26 & 29360128), 199680, 7696);
                    c0Var3.o();
                    androidx.compose.ui.a0 a0VarM = androidx.compose.foundation.layout.s4.m(aVar8, 0.0f, f32758l, 1, null);
                    objI3 = c0Var3.i0();
                    if (objI3 == aVar.a()) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.n70
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s70.L0((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI3);
                    }
                    androidx.compose.ui.a0 a0VarC = androidx.compose.ui.semantics.t.c(a0VarM, (Function1) objI3);
                    if (g80.f(i10, aVar2.a())) {
                        androidx.compose.material3.internal.l3.a aVar11 = androidx.compose.material3.internal.l3.f29010b;
                        iB2 = androidx.compose.material3.internal.l3.b(ps.b.X);
                    } else {
                        androidx.compose.material3.internal.l3.a aVar12 = androidx.compose.material3.internal.l3.f29010b;
                        iB2 = androidx.compose.material3.internal.l3.b(ps.b.f31831c0);
                    }
                    z11 = true;
                    i21 = i10;
                    q50.t(androidx.compose.material3.internal.m3.b(iB2, c0Var3, 0), a0VarC, o6.r(a3Var2.I(), c0Var3, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, la0.e(a3Var2.J(), c0Var3, 6), c0Var3, 0, 0, 131064);
                    c0VarR = c0Var3;
                    c0VarR.o();
                    g80 g80VarC = g80.c(h80Var.c());
                    if ((i22 & 7168) != 2048) {
                        if ((i22 & 4096) != 0) {
                            h80Var2 = h80Var;
                            if (c0VarR.k0(h80Var2)) {
                            }
                            if ((i22 & 57344) != 16384) {
                                z11 = false;
                            }
                            z13 = z12 | z11;
                            objI4 = c0VarR.i0();
                            if (z13 || objI4 == aVar.a()) {
                                objI4 = new j(h80Var2, i21, g0Var, null);
                                c0VarR.Y(objI4);
                            }
                            androidx.compose.runtime.b2.i(g80VarC, (Function2) objI4, c0VarR, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z3Var3 = z3Var4;
                            b4Var2 = b4Var3;
                        } else {
                            h80Var2 = h80Var;
                        }
                        z12 = false;
                        if ((i22 & 57344) != 16384) {
                            z11 = false;
                        }
                        z13 = z12 | z11;
                        objI4 = c0VarR.i0();
                        if (z13) {
                            objI4 = new j(h80Var2, i21, g0Var, null);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new j(h80Var2, i21, g0Var, null);
                            c0VarR.Y(objI4);
                        }
                        androidx.compose.runtime.b2.i(g80VarC, (Function2) objI4, c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z3Var3 = z3Var4;
                        b4Var2 = b4Var3;
                    } else {
                        h80Var2 = h80Var;
                    }
                    z12 = true;
                    if ((i22 & 57344) != 16384) {
                        z11 = false;
                    }
                    z13 = z12 | z11;
                    objI4 = c0VarR.i0();
                    if (z13) {
                        objI4 = new j(h80Var2, i21, g0Var, null);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new j(h80Var2, i21, g0Var, null);
                        c0VarR.Y(objI4);
                    }
                    androidx.compose.runtime.b2.i(g80VarC, (Function2) objI4, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z3Var3 = z3Var4;
                    b4Var2 = b4Var3;
                } else {
                    i21 = i10;
                    h80Var2 = h80Var;
                    c0VarR.u();
                    z3Var3 = z3Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final int i27 = i21;
                    final h80 h80Var3 = h80Var2;
                    final androidx.compose.foundation.text.b4 b4Var4 = b4Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.o70
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s70.M0(a0Var, y0Var, function1, h80Var3, i27, b4Var4, z3Var3, u50Var, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            b4Var2 = b4Var;
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
                z3Var2 = z3Var;
            } else {
                z3Var2 = z3Var;
                if ((i11 & 1572864) == 0) {
                    if (c0VarR.D(z3Var2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c0VarR.D(u50Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            if ((4793491 & i13) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i16 != 0) {
                    b4VarA = androidx.compose.foundation.text.b4.f18781h.a();
                } else {
                    b4VarA = b4Var2;
                }
                if (i18 != 0) {
                    z3VarA = androidx.compose.foundation.text.z3.f21809g.a();
                } else {
                    z3VarA = z3Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1299172990, i13, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1866)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.interaction.j jVar2 = (androidx.compose.foundation.interaction.j) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new androidx.compose.ui.focus.g0();
                    c0VarR.Y(objI1);
                }
                g0Var = (androidx.compose.ui.focus.g0) objI1;
                j40 j40VarK2 = lq.f30410a.k(u50Var.u(true), 0L, 0L, 0L, u50Var.t(true), u50Var.t(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 0, 0, 0, 3072, 2147483598, 4095);
                zF = g80.f(i10, h80Var.c());
                androidx.compose.foundation.layout.q.m mVarY2 = androidx.compose.foundation.layout.q.f16330a.y();
                androidx.compose.ui.e.a aVar13 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(mVarY2, aVar13.u(), c0VarR, 0);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var);
                androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                function0A = aVar14.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                i22 = i13;
                androidx.compose.runtime.y7.n(c0VarD, a1VarB2, aVar14.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar14.f());
                androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                if (zF) {
                    c0VarR.E(2023424468);
                    androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                    d0.a3 a3Var3 = d0.a3.f267591a;
                    androidx.compose.ui.a0 a0VarY3 = androidx.compose.foundation.layout.i6.y(aVar15, a3Var3.y(), a3Var3.w());
                    if (g80.f(i10, g80.f27919b.a())) {
                        iF = L1(h80Var);
                    } else {
                        iF = h80Var.f();
                    }
                    int i28 = iF;
                    int i29 = i22 >> 3;
                    c0Var2 = c0VarR;
                    P0(a0VarY3, i28, h80Var, i10, u50Var, c0Var2, (i29 & 7168) | (i29 & 896) | 6 | ((i22 >> 9) & 57344));
                    c0Var2.A();
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.E(2023879982);
                    c0Var2.A();
                }
                aVar2 = g80.f27919b;
                if (g80.f(i10, aVar2.b())) {
                    androidx.compose.material3.internal.l3.a aVar16 = androidx.compose.material3.internal.l3.f29010b;
                    iB = androidx.compose.material3.internal.l3.b(ps.b.f31837f0);
                } else {
                    androidx.compose.material3.internal.l3.a aVar17 = androidx.compose.material3.internal.l3.f29010b;
                    iB = androidx.compose.material3.internal.l3.b(ps.b.f31829b0);
                }
                strB = androidx.compose.material3.internal.m3.b(iB, c0Var2, 0);
                androidx.compose.ui.a0.a aVar18 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarU2 = U1(aVar18, zF);
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar13.C(), false);
                iJ2 = androidx.compose.runtime.v.j(c0Var2, 0);
                androidx.compose.runtime.b1 b1VarK4 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var2, a0VarU2);
                function0A2 = aVar14.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A2);
                } else {
                    c0Var2.l();
                }
                c0VarD2 = androidx.compose.runtime.y7.d(c0Var2);
                androidx.compose.runtime.y7.n(c0VarD2, a1VarK2, aVar14.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK4, aVar14.g());
                function2B2 = aVar14.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN4, aVar14.f());
                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.focus.j0.a(aVar18, r8);
                d0.a3 a3Var4 = d0.a3.f267591a;
                androidx.compose.ui.a0 a0VarY4 = androidx.compose.foundation.layout.i6.y(a0VarA2, a3Var4.y(), a3Var4.w());
                zD = c0Var2.D(strB);
                objI2 = c0Var2.i0();
                if (zD) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.m70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.K0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var2.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.m70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.K0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var2.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarF2 = androidx.compose.ui.semantics.t.f(a0VarY4, false, (Function1) objI2, 1, null);
                androidx.compose.ui.text.y3 y3Var2 = (androidx.compose.ui.text.y3) c0Var2.W(q50.I());
                androidx.compose.ui.graphics.i0.a aVar19 = androidx.compose.ui.graphics.i0.f37796b;
                Float fValueOf3 = Float.valueOf(0.0f);
                androidx.compose.ui.graphics.q0.a aVar110 = androidx.compose.ui.graphics.q0.f38131b;
                Pair pair3 = TuplesKt.to(fValueOf3, androidx.compose.ui.graphics.q0.n(aVar110.s()));
                Pair pair4 = TuplesKt.to(Float.valueOf(0.1f), androidx.compose.ui.graphics.q0.n(aVar110.s()));
                Float fValueOf4 = Float.valueOf(0.1f);
                pj pjVar2 = pj.f31758a;
                int i210 = i22 >> 3;
                int i211 = i22 << 3;
                c0Var3 = c0Var2;
                androidx.compose.foundation.text.b4 b4Var5 = b4VarA;
                androidx.compose.foundation.text.z3 z3Var5 = z3VarA;
                androidx.compose.foundation.text.s0.x(y0Var, function1, a0VarF2, true, false, y3Var2, b4Var5, z3Var5, true, 0, 0, null, null, jVar2, androidx.compose.ui.graphics.i0.a.u(aVar19, new Pair[]{pair3, pair4, TuplesKt.to(fValueOf4, androidx.compose.ui.graphics.q0.n(pjVar2.a(c0Var2, 6).D0())), TuplesKt.to(Float.valueOf(0.9f), androidx.compose.ui.graphics.q0.n(pjVar2.a(c0Var2, 6).D0())), TuplesKt.to(Float.valueOf(0.9f), androidx.compose.ui.graphics.q0.n(aVar110.s())), TuplesKt.to(Float.valueOf(1.0f), androidx.compose.ui.graphics.q0.n(aVar110.s()))}, 0.0f, 0.0f, 0, 14, null), androidx.compose.runtime.internal.w.e(1007938103, true, new i(y0Var, r117, j40VarK2), c0Var2, 54), c0Var3, (i210 & com.planner5d.library.engine.input.f.b.B) | (i210 & 14) | 100666368 | (3670016 & i211) | (i211 & 29360128), 199680, 7696);
                c0Var3.o();
                androidx.compose.ui.a0 a0VarM2 = androidx.compose.foundation.layout.s4.m(aVar18, 0.0f, f32758l, 1, null);
                objI3 = c0Var3.i0();
                if (objI3 == aVar.a()) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.n70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.L0((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI3);
                }
                androidx.compose.ui.a0 a0VarC2 = androidx.compose.ui.semantics.t.c(a0VarM2, (Function1) objI3);
                if (g80.f(i10, aVar2.a())) {
                    androidx.compose.material3.internal.l3.a aVar111 = androidx.compose.material3.internal.l3.f29010b;
                    iB2 = androidx.compose.material3.internal.l3.b(ps.b.X);
                } else {
                    androidx.compose.material3.internal.l3.a aVar112 = androidx.compose.material3.internal.l3.f29010b;
                    iB2 = androidx.compose.material3.internal.l3.b(ps.b.f31831c0);
                }
                z11 = true;
                i21 = i10;
                q50.t(androidx.compose.material3.internal.m3.b(iB2, c0Var3, 0), a0VarC2, o6.r(a3Var4.I(), c0Var3, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, la0.e(a3Var4.J(), c0Var3, 6), c0Var3, 0, 0, 131064);
                c0VarR = c0Var3;
                c0VarR.o();
                g80 g80VarC2 = g80.c(h80Var.c());
                if ((i22 & 7168) != 2048) {
                    if ((i22 & 4096) != 0) {
                        h80Var2 = h80Var;
                        if (c0VarR.k0(h80Var2)) {
                        }
                        if ((i22 & 57344) != 16384) {
                            z11 = false;
                        }
                        z13 = z12 | z11;
                        objI4 = c0VarR.i0();
                        if (z13) {
                            objI4 = new j(h80Var2, i21, g0Var, null);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new j(h80Var2, i21, g0Var, null);
                            c0VarR.Y(objI4);
                        }
                        androidx.compose.runtime.b2.i(g80VarC2, (Function2) objI4, c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z3Var3 = z3Var5;
                        b4Var2 = b4Var5;
                    } else {
                        h80Var2 = h80Var;
                    }
                    z12 = false;
                    if ((i22 & 57344) != 16384) {
                        z11 = false;
                    }
                    z13 = z12 | z11;
                    objI4 = c0VarR.i0();
                    if (z13) {
                        objI4 = new j(h80Var2, i21, g0Var, null);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new j(h80Var2, i21, g0Var, null);
                        c0VarR.Y(objI4);
                    }
                    androidx.compose.runtime.b2.i(g80VarC2, (Function2) objI4, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z3Var3 = z3Var5;
                    b4Var2 = b4Var5;
                } else {
                    h80Var2 = h80Var;
                }
                z12 = true;
                if ((i22 & 57344) != 16384) {
                    z11 = false;
                }
                z13 = z12 | z11;
                objI4 = c0VarR.i0();
                if (z13) {
                    objI4 = new j(h80Var2, i21, g0Var, null);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new j(h80Var2, i21, g0Var, null);
                    c0VarR.Y(objI4);
                }
                androidx.compose.runtime.b2.i(g80VarC2, (Function2) objI4, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z3Var3 = z3Var5;
                b4Var2 = b4Var5;
            } else {
                i21 = i10;
                h80Var2 = h80Var;
                c0VarR.u();
                z3Var3 = z3Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final int i212 = i21;
                final h80 h80Var4 = h80Var2;
                final androidx.compose.foundation.text.b4 b4Var6 = b4Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.o70
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s70.M0(a0Var, y0Var, function1, h80Var4, i212, b4Var6, z3Var3, u50Var, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if ((i11 & 4096) == 0) {
                zK0 = c0VarR.D(h80Var);
            } else {
                zK0 = c0VarR.k0(h80Var);
            }
            if (zK0) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (c0VarR.K(i10)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((196608 & i11) == 0) {
                b4Var2 = b4Var;
                if (c0VarR.D(b4Var2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
                z3Var2 = z3Var;
            } else {
                z3Var2 = z3Var;
                if ((i11 & 1572864) == 0) {
                    if (c0VarR.D(z3Var2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c0VarR.D(u50Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            if ((4793491 & i13) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i16 != 0) {
                    b4VarA = androidx.compose.foundation.text.b4.f18781h.a();
                } else {
                    b4VarA = b4Var2;
                }
                if (i18 != 0) {
                    z3VarA = androidx.compose.foundation.text.z3.f21809g.a();
                } else {
                    z3VarA = z3Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1299172990, i13, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1866)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.interaction.j jVar3 = (androidx.compose.foundation.interaction.j) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new androidx.compose.ui.focus.g0();
                    c0VarR.Y(objI1);
                }
                g0Var = (androidx.compose.ui.focus.g0) objI1;
                j40 j40VarK3 = lq.f30410a.k(u50Var.u(true), 0L, 0L, 0L, u50Var.t(true), u50Var.t(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 0, 0, 0, 3072, 2147483598, 4095);
                zF = g80.f(i10, h80Var.c());
                androidx.compose.foundation.layout.q.m mVarY3 = androidx.compose.foundation.layout.q.f16330a.y();
                androidx.compose.ui.e.a aVar113 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(mVarY3, aVar113.u(), c0VarR, 0);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0Var);
                androidx.compose.ui.node.g.a aVar114 = androidx.compose.ui.node.g.I;
                function0A = aVar114.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                i22 = i13;
                androidx.compose.runtime.y7.n(c0VarD, a1VarB3, aVar114.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar114.g());
                function2B = aVar114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar114.f());
                androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
                if (zF) {
                    c0VarR.E(2023424468);
                    androidx.compose.ui.a0.a aVar115 = androidx.compose.ui.a0.E;
                    d0.a3 a3Var5 = d0.a3.f267591a;
                    androidx.compose.ui.a0 a0VarY5 = androidx.compose.foundation.layout.i6.y(aVar115, a3Var5.y(), a3Var5.w());
                    if (g80.f(i10, g80.f27919b.a())) {
                        iF = L1(h80Var);
                    } else {
                        iF = h80Var.f();
                    }
                    int i213 = iF;
                    int i214 = i22 >> 3;
                    c0Var2 = c0VarR;
                    P0(a0VarY5, i213, h80Var, i10, u50Var, c0Var2, (i214 & 7168) | (i214 & 896) | 6 | ((i22 >> 9) & 57344));
                    c0Var2.A();
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.E(2023879982);
                    c0Var2.A();
                }
                aVar2 = g80.f27919b;
                if (g80.f(i10, aVar2.b())) {
                    androidx.compose.material3.internal.l3.a aVar116 = androidx.compose.material3.internal.l3.f29010b;
                    iB = androidx.compose.material3.internal.l3.b(ps.b.f31837f0);
                } else {
                    androidx.compose.material3.internal.l3.a aVar117 = androidx.compose.material3.internal.l3.f29010b;
                    iB = androidx.compose.material3.internal.l3.b(ps.b.f31829b0);
                }
                strB = androidx.compose.material3.internal.m3.b(iB, c0Var2, 0);
                androidx.compose.ui.a0.a aVar118 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarU3 = U1(aVar118, zF);
                androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar113.C(), false);
                iJ2 = androidx.compose.runtime.v.j(c0Var2, 0);
                androidx.compose.runtime.b1 b1VarK6 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0Var2, a0VarU3);
                function0A2 = aVar114.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A2);
                } else {
                    c0Var2.l();
                }
                c0VarD2 = androidx.compose.runtime.y7.d(c0Var2);
                androidx.compose.runtime.y7.n(c0VarD2, a1VarK3, aVar114.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK6, aVar114.g());
                function2B2 = aVar114.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN6, aVar114.f());
                androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.ui.a0 a0VarA3 = androidx.compose.ui.focus.j0.a(aVar118, r8);
                d0.a3 a3Var6 = d0.a3.f267591a;
                androidx.compose.ui.a0 a0VarY6 = androidx.compose.foundation.layout.i6.y(a0VarA3, a3Var6.y(), a3Var6.w());
                zD = c0Var2.D(strB);
                objI2 = c0Var2.i0();
                if (zD) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.m70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.K0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var2.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.m70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.K0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var2.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarF3 = androidx.compose.ui.semantics.t.f(a0VarY6, false, (Function1) objI2, 1, null);
                androidx.compose.ui.text.y3 y3Var3 = (androidx.compose.ui.text.y3) c0Var2.W(q50.I());
                androidx.compose.ui.graphics.i0.a aVar119 = androidx.compose.ui.graphics.i0.f37796b;
                Float fValueOf5 = Float.valueOf(0.0f);
                androidx.compose.ui.graphics.q0.a aVar1110 = androidx.compose.ui.graphics.q0.f38131b;
                Pair pair5 = TuplesKt.to(fValueOf5, androidx.compose.ui.graphics.q0.n(aVar1110.s()));
                Pair pair6 = TuplesKt.to(Float.valueOf(0.1f), androidx.compose.ui.graphics.q0.n(aVar1110.s()));
                Float fValueOf6 = Float.valueOf(0.1f);
                pj pjVar3 = pj.f31758a;
                int i215 = i22 >> 3;
                int i216 = i22 << 3;
                c0Var3 = c0Var2;
                androidx.compose.foundation.text.b4 b4Var7 = b4VarA;
                androidx.compose.foundation.text.z3 z3Var6 = z3VarA;
                androidx.compose.foundation.text.s0.x(y0Var, function1, a0VarF3, true, false, y3Var3, b4Var7, z3Var6, true, 0, 0, null, null, jVar3, androidx.compose.ui.graphics.i0.a.u(aVar119, new Pair[]{pair5, pair6, TuplesKt.to(fValueOf6, androidx.compose.ui.graphics.q0.n(pjVar3.a(c0Var2, 6).D0())), TuplesKt.to(Float.valueOf(0.9f), androidx.compose.ui.graphics.q0.n(pjVar3.a(c0Var2, 6).D0())), TuplesKt.to(Float.valueOf(0.9f), androidx.compose.ui.graphics.q0.n(aVar1110.s())), TuplesKt.to(Float.valueOf(1.0f), androidx.compose.ui.graphics.q0.n(aVar1110.s()))}, 0.0f, 0.0f, 0, 14, null), androidx.compose.runtime.internal.w.e(1007938103, true, new i(y0Var, r117, j40VarK3), c0Var2, 54), c0Var3, (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 14) | 100666368 | (3670016 & i216) | (i216 & 29360128), 199680, 7696);
                c0Var3.o();
                androidx.compose.ui.a0 a0VarM3 = androidx.compose.foundation.layout.s4.m(aVar118, 0.0f, f32758l, 1, null);
                objI3 = c0Var3.i0();
                if (objI3 == aVar.a()) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.n70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.L0((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI3);
                }
                androidx.compose.ui.a0 a0VarC3 = androidx.compose.ui.semantics.t.c(a0VarM3, (Function1) objI3);
                if (g80.f(i10, aVar2.a())) {
                    androidx.compose.material3.internal.l3.a aVar1111 = androidx.compose.material3.internal.l3.f29010b;
                    iB2 = androidx.compose.material3.internal.l3.b(ps.b.X);
                } else {
                    androidx.compose.material3.internal.l3.a aVar1112 = androidx.compose.material3.internal.l3.f29010b;
                    iB2 = androidx.compose.material3.internal.l3.b(ps.b.f31831c0);
                }
                z11 = true;
                i21 = i10;
                q50.t(androidx.compose.material3.internal.m3.b(iB2, c0Var3, 0), a0VarC3, o6.r(a3Var6.I(), c0Var3, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, la0.e(a3Var6.J(), c0Var3, 6), c0Var3, 0, 0, 131064);
                c0VarR = c0Var3;
                c0VarR.o();
                g80 g80VarC3 = g80.c(h80Var.c());
                if ((i22 & 7168) != 2048) {
                    if ((i22 & 4096) != 0) {
                        h80Var2 = h80Var;
                        if (c0VarR.k0(h80Var2)) {
                        }
                        if ((i22 & 57344) != 16384) {
                            z11 = false;
                        }
                        z13 = z12 | z11;
                        objI4 = c0VarR.i0();
                        if (z13) {
                            objI4 = new j(h80Var2, i21, g0Var, null);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new j(h80Var2, i21, g0Var, null);
                            c0VarR.Y(objI4);
                        }
                        androidx.compose.runtime.b2.i(g80VarC3, (Function2) objI4, c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z3Var3 = z3Var6;
                        b4Var2 = b4Var7;
                    } else {
                        h80Var2 = h80Var;
                    }
                    z12 = false;
                    if ((i22 & 57344) != 16384) {
                        z11 = false;
                    }
                    z13 = z12 | z11;
                    objI4 = c0VarR.i0();
                    if (z13) {
                        objI4 = new j(h80Var2, i21, g0Var, null);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new j(h80Var2, i21, g0Var, null);
                        c0VarR.Y(objI4);
                    }
                    androidx.compose.runtime.b2.i(g80VarC3, (Function2) objI4, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z3Var3 = z3Var6;
                    b4Var2 = b4Var7;
                } else {
                    h80Var2 = h80Var;
                }
                z12 = true;
                if ((i22 & 57344) != 16384) {
                    z11 = false;
                }
                z13 = z12 | z11;
                objI4 = c0VarR.i0();
                if (z13) {
                    objI4 = new j(h80Var2, i21, g0Var, null);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new j(h80Var2, i21, g0Var, null);
                    c0VarR.Y(objI4);
                }
                androidx.compose.runtime.b2.i(g80VarC3, (Function2) objI4, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z3Var3 = z3Var6;
                b4Var2 = b4Var7;
            } else {
                i21 = i10;
                h80Var2 = h80Var;
                c0VarR.u();
                z3Var3 = z3Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final int i217 = i21;
                final h80 h80Var5 = h80Var2;
                final androidx.compose.foundation.text.b4 b4Var8 = b4Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.o70
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s70.M0(a0Var, y0Var, function1, h80Var5, i217, b4Var8, z3Var3, u50Var, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        b4Var2 = b4Var;
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
            z3Var2 = z3Var;
        } else {
            z3Var2 = z3Var;
            if ((i11 & 1572864) == 0) {
                if (c0VarR.D(z3Var2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
        }
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (c0VarR.D(u50Var)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        if ((4793491 & i13) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            if (i16 != 0) {
                b4VarA = androidx.compose.foundation.text.b4.f18781h.a();
            } else {
                b4VarA = b4Var2;
            }
            if (i18 != 0) {
                z3VarA = androidx.compose.foundation.text.z3.f21809g.a();
            } else {
                z3VarA = z3Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1299172990, i13, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1866)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.interaction.j jVar4 = (androidx.compose.foundation.interaction.j) objI0;
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new androidx.compose.ui.focus.g0();
                c0VarR.Y(objI1);
            }
            g0Var = (androidx.compose.ui.focus.g0) objI1;
            j40 j40VarK4 = lq.f30410a.k(u50Var.u(true), 0L, 0L, 0L, u50Var.t(true), u50Var.t(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 0, 0, 0, 3072, 2147483598, 4095);
            zF = g80.f(i10, h80Var.c());
            androidx.compose.foundation.layout.q.m mVarY4 = androidx.compose.foundation.layout.q.f16330a.y();
            androidx.compose.ui.e.a aVar1113 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarB4 = androidx.compose.foundation.layout.j0.b(mVarY4, aVar1113.u(), c0VarR, 0);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0Var);
            androidx.compose.ui.node.g.a aVar1114 = androidx.compose.ui.node.g.I;
            function0A = aVar1114.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            i22 = i13;
            androidx.compose.runtime.y7.n(c0VarD, a1VarB4, aVar1114.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar1114.g());
            function2B = aVar1114.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar1114.f());
            androidx.compose.foundation.layout.n0 n0Var4 = androidx.compose.foundation.layout.n0.f16227a;
            if (zF) {
                c0VarR.E(2023424468);
                androidx.compose.ui.a0.a aVar1115 = androidx.compose.ui.a0.E;
                d0.a3 a3Var7 = d0.a3.f267591a;
                androidx.compose.ui.a0 a0VarY7 = androidx.compose.foundation.layout.i6.y(aVar1115, a3Var7.y(), a3Var7.w());
                if (g80.f(i10, g80.f27919b.a())) {
                    iF = L1(h80Var);
                } else {
                    iF = h80Var.f();
                }
                int i218 = iF;
                int i219 = i22 >> 3;
                c0Var2 = c0VarR;
                P0(a0VarY7, i218, h80Var, i10, u50Var, c0Var2, (i219 & 7168) | (i219 & 896) | 6 | ((i22 >> 9) & 57344));
                c0Var2.A();
            } else {
                c0Var2 = c0VarR;
                c0Var2.E(2023879982);
                c0Var2.A();
            }
            aVar2 = g80.f27919b;
            if (g80.f(i10, aVar2.b())) {
                androidx.compose.material3.internal.l3.a aVar1116 = androidx.compose.material3.internal.l3.f29010b;
                iB = androidx.compose.material3.internal.l3.b(ps.b.f31837f0);
            } else {
                androidx.compose.material3.internal.l3.a aVar1117 = androidx.compose.material3.internal.l3.f29010b;
                iB = androidx.compose.material3.internal.l3.b(ps.b.f31829b0);
            }
            strB = androidx.compose.material3.internal.m3.b(iB, c0Var2, 0);
            androidx.compose.ui.a0.a aVar1118 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarU4 = U1(aVar1118, zF);
            androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar1113.C(), false);
            iJ2 = androidx.compose.runtime.v.j(c0Var2, 0);
            androidx.compose.runtime.b1 b1VarK8 = c0Var2.k();
            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0Var2, a0VarU4);
            function0A2 = aVar1114.a();
            if (c0Var2.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var2.q();
            if (c0Var2.P()) {
                c0Var2.q0(function0A2);
            } else {
                c0Var2.l();
            }
            c0VarD2 = androidx.compose.runtime.y7.d(c0Var2);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK4, aVar1114.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK8, aVar1114.g());
            function2B2 = aVar1114.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN8, aVar1114.f());
            androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.a0 a0VarA4 = androidx.compose.ui.focus.j0.a(aVar1118, r8);
            d0.a3 a3Var8 = d0.a3.f267591a;
            androidx.compose.ui.a0 a0VarY8 = androidx.compose.foundation.layout.i6.y(a0VarA4, a3Var8.y(), a3Var8.w());
            zD = c0Var2.D(strB);
            objI2 = c0Var2.i0();
            if (zD) {
                objI2 = new Function1() { // from class: androidx.compose.material3.m70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.K0(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var2.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: androidx.compose.material3.m70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.K0(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var2.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarF4 = androidx.compose.ui.semantics.t.f(a0VarY8, false, (Function1) objI2, 1, null);
            androidx.compose.ui.text.y3 y3Var4 = (androidx.compose.ui.text.y3) c0Var2.W(q50.I());
            androidx.compose.ui.graphics.i0.a aVar1119 = androidx.compose.ui.graphics.i0.f37796b;
            Float fValueOf7 = Float.valueOf(0.0f);
            androidx.compose.ui.graphics.q0.a aVar11110 = androidx.compose.ui.graphics.q0.f38131b;
            Pair pair7 = TuplesKt.to(fValueOf7, androidx.compose.ui.graphics.q0.n(aVar11110.s()));
            Pair pair8 = TuplesKt.to(Float.valueOf(0.1f), androidx.compose.ui.graphics.q0.n(aVar11110.s()));
            Float fValueOf8 = Float.valueOf(0.1f);
            pj pjVar4 = pj.f31758a;
            int i2110 = i22 >> 3;
            int i2111 = i22 << 3;
            c0Var3 = c0Var2;
            androidx.compose.foundation.text.b4 b4Var9 = b4VarA;
            androidx.compose.foundation.text.z3 z3Var7 = z3VarA;
            androidx.compose.foundation.text.s0.x(y0Var, function1, a0VarF4, true, false, y3Var4, b4Var9, z3Var7, true, 0, 0, null, null, jVar4, androidx.compose.ui.graphics.i0.a.u(aVar1119, new Pair[]{pair7, pair8, TuplesKt.to(fValueOf8, androidx.compose.ui.graphics.q0.n(pjVar4.a(c0Var2, 6).D0())), TuplesKt.to(Float.valueOf(0.9f), androidx.compose.ui.graphics.q0.n(pjVar4.a(c0Var2, 6).D0())), TuplesKt.to(Float.valueOf(0.9f), androidx.compose.ui.graphics.q0.n(aVar11110.s())), TuplesKt.to(Float.valueOf(1.0f), androidx.compose.ui.graphics.q0.n(aVar11110.s()))}, 0.0f, 0.0f, 0, 14, null), androidx.compose.runtime.internal.w.e(1007938103, true, new i(y0Var, r117, j40VarK4), c0Var2, 54), c0Var3, (i2110 & com.planner5d.library.engine.input.f.b.B) | (i2110 & 14) | 100666368 | (3670016 & i2111) | (i2111 & 29360128), 199680, 7696);
            c0Var3.o();
            androidx.compose.ui.a0 a0VarM4 = androidx.compose.foundation.layout.s4.m(aVar1118, 0.0f, f32758l, 1, null);
            objI3 = c0Var3.i0();
            if (objI3 == aVar.a()) {
                objI3 = new Function1() { // from class: androidx.compose.material3.n70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.L0((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var3.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarC4 = androidx.compose.ui.semantics.t.c(a0VarM4, (Function1) objI3);
            if (g80.f(i10, aVar2.a())) {
                androidx.compose.material3.internal.l3.a aVar11111 = androidx.compose.material3.internal.l3.f29010b;
                iB2 = androidx.compose.material3.internal.l3.b(ps.b.X);
            } else {
                androidx.compose.material3.internal.l3.a aVar11112 = androidx.compose.material3.internal.l3.f29010b;
                iB2 = androidx.compose.material3.internal.l3.b(ps.b.f31831c0);
            }
            z11 = true;
            i21 = i10;
            q50.t(androidx.compose.material3.internal.m3.b(iB2, c0Var3, 0), a0VarC4, o6.r(a3Var8.I(), c0Var3, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, la0.e(a3Var8.J(), c0Var3, 6), c0Var3, 0, 0, 131064);
            c0VarR = c0Var3;
            c0VarR.o();
            g80 g80VarC4 = g80.c(h80Var.c());
            if ((i22 & 7168) != 2048) {
                if ((i22 & 4096) != 0) {
                    h80Var2 = h80Var;
                    if (c0VarR.k0(h80Var2)) {
                    }
                    if ((i22 & 57344) != 16384) {
                        z11 = false;
                    }
                    z13 = z12 | z11;
                    objI4 = c0VarR.i0();
                    if (z13) {
                        objI4 = new j(h80Var2, i21, g0Var, null);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new j(h80Var2, i21, g0Var, null);
                        c0VarR.Y(objI4);
                    }
                    androidx.compose.runtime.b2.i(g80VarC4, (Function2) objI4, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z3Var3 = z3Var7;
                    b4Var2 = b4Var9;
                } else {
                    h80Var2 = h80Var;
                }
                z12 = false;
                if ((i22 & 57344) != 16384) {
                    z11 = false;
                }
                z13 = z12 | z11;
                objI4 = c0VarR.i0();
                if (z13) {
                    objI4 = new j(h80Var2, i21, g0Var, null);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new j(h80Var2, i21, g0Var, null);
                    c0VarR.Y(objI4);
                }
                androidx.compose.runtime.b2.i(g80VarC4, (Function2) objI4, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z3Var3 = z3Var7;
                b4Var2 = b4Var9;
            } else {
                h80Var2 = h80Var;
            }
            z12 = true;
            if ((i22 & 57344) != 16384) {
                z11 = false;
            }
            z13 = z12 | z11;
            objI4 = c0VarR.i0();
            if (z13) {
                objI4 = new j(h80Var2, i21, g0Var, null);
                c0VarR.Y(objI4);
            } else {
                objI4 = new j(h80Var2, i21, g0Var, null);
                c0VarR.Y(objI4);
            }
            androidx.compose.runtime.b2.i(g80VarC4, (Function2) objI4, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z3Var3 = z3Var7;
            b4Var2 = b4Var9;
        } else {
            i21 = i10;
            h80Var2 = h80Var;
            c0VarR.u();
            z3Var3 = z3Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final int i2112 = i21;
            final h80 h80Var6 = h80Var2;
            final androidx.compose.foundation.text.b4 b4Var10 = b4Var2;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.o70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.M0(a0Var, y0Var, function1, h80Var6, i2112, b4Var10, z3Var3, u50Var, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @oj.i(name = "getDefaultTimePickerLayoutType")
    public static final int J1(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(435687004, i10, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.kt:2051)");
        }
        int iA = l80.a(c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        return Unit.f312394a;
    }

    public static /* synthetic */ void K1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L0(androidx.compose.ui.semantics.e0 e0Var) {
        return Unit.f312394a;
    }

    public static final int L1(@NotNull h80 h80Var) {
        if (h80Var.g()) {
            return h80Var.a() % 24;
        }
        if (h80Var.a() % 12 == 0) {
            return 12;
        }
        return N1(h80Var) ? h80Var.a() - 12 : h80Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void M(androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1041042571);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1041042571, i12, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1978)");
            }
            boolean z10 = (i12 & com.planner5d.library.engine.input.f.b.B) == 32;
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a(f10);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            int i14 = ((i12 >> 6) & 14) | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            int i15 = ((i14 << 6) & 896) | 6;
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
            function2.invoke(c0VarR, Integer.valueOf((i15 >> 6) & 14));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.f70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.N(a0Var2, f10, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M0(androidx.compose.ui.a0 a0Var, androidx.compose.ui.text.input.y0 y0Var, Function1 function1, h80 h80Var, int i10, androidx.compose.foundation.text.b4 b4Var, androidx.compose.foundation.text.z3 z3Var, u50 u50Var, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        J0(a0Var, y0Var, function1, h80Var, i10, b4Var, z3Var, u50Var, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    public static final long M1(@NotNull androidx.compose.material3.j jVar) {
        float fV = jVar.v();
        d0.b3 b3Var = d0.b3.f267681a;
        float fR = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(b3Var.j() / 2.0f) * (fV / b3Var.b()));
        float fR2 = androidx.compose.ui.unit.h.r(((androidx.compose.ui.unit.h) kotlin.ranges.r.w(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(((jVar.g() && N1(jVar) && g80.f(jVar.c(), g80.f27919b.a())) ? androidx.compose.ui.unit.h.r(jVar.v() * f32754h) : androidx.compose.ui.unit.h.r(jVar.v() * f32753g)) - fR)), androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(0)))).O() + fR);
        float f10 = 2;
        return androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(((float) Math.cos(jVar.u())) * fR2) + androidx.compose.ui.unit.h.r(jVar.v() / f10)))) << 32) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(fR2 * ((float) Math.sin(jVar.u()))) + androidx.compose.ui.unit.h.r(jVar.v() / f10)))) & com.rabbitmq.client.k0.f265952a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(androidx.compose.ui.a0 a0Var, float f10, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        M(a0Var, f10, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final boolean N0(androidx.compose.runtime.n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    public static final boolean N1(@NotNull h80 h80Var) {
        return h80Var.a() >= 12;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void O(final h80 h80Var, final u50 u50Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-934561141);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(h80Var) : c0VarR.k0(h80Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(u50Var) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-934561141, i11, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1173)");
            }
            androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{q50.I().f(la0.e(d0.b3.f267681a.O(), c0VarR, 6)), androidx.compose.ui.platform.q1.u().f(androidx.compose.ui.unit.w.Ltr)}, androidx.compose.runtime.internal.w.e(-477913269, true, new b(h80Var, u50Var), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.l70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.P(h80Var, u50Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O0(h80 h80Var, androidx.compose.ui.a0 a0Var, u50 u50Var, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        H0(h80Var, a0Var, u50Var, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O1(h80 h80Var, float f10, float f11, float f12, long j10) {
        if (g80.f(h80Var.c(), g80.f27919b.a()) && h80Var.g()) {
            float fF1 = F1(f10, f11, androidx.compose.ui.unit.q.n(j10), androidx.compose.ui.unit.q.p(j10));
            if (N1(h80Var)) {
                h80Var.d(h80Var.a() - (fF1 >= f12 ? 12 : 0));
            } else {
                h80Var.d(h80Var.a() + (fF1 < f12 ? 12 : 0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(h80 h80Var, u50 u50Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        O(h80Var, u50Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void P0(final androidx.compose.ui.a0 a0Var, final int i10, final h80 h80Var, final int i11, final u50 u50Var, androidx.compose.runtime.c0 c0Var, final int i12) {
        int i13;
        androidx.compose.runtime.c0 c0Var2;
        int iB;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1148055889);
        if ((i12 & 6) == 0) {
            i13 = (c0VarR.D(a0Var) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c0VarR.K(i10) ? 32 : 16;
        }
        if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= (i12 & 512) == 0 ? c0VarR.D(h80Var) : c0VarR.k0(h80Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c0VarR.K(i11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= c0VarR.D(u50Var) ? 16384 : 8192;
        }
        if (c0VarR.h((i13 & 9363) != 9362, i13 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1148055889, i13, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1403)");
            }
            boolean zF = g80.f(h80Var.c(), i11);
            if (g80.f(i11, g80.f27919b.a())) {
                androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                iB = androidx.compose.material3.internal.l3.b(ps.b.Z);
            } else {
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                iB = androidx.compose.material3.internal.l3.b(ps.b.f31833d0);
            }
            final String strB = androidx.compose.material3.internal.m3.b(iB, c0VarR, 0);
            long jT = u50Var.t(zF);
            long jU = u50Var.u(zF);
            boolean zD = c0VarR.D(strB);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.q70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.Q0(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarE = androidx.compose.ui.semantics.t.e(a0Var, true, (Function1) objI0);
            androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.b3.f267681a.M(), c0VarR, 6);
            boolean z10 = ((i13 & 7168) == 2048) | ((i13 & 896) == 256 || ((i13 & 512) != 0 && c0VarR.k0(h80Var)));
            Object objI1 = c0VarR.i0();
            if (z10 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function0() { // from class: androidx.compose.material3.g60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s70.R0(i11, h80Var);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0Var2 = c0VarR;
            u10.d(zF, (Function0) objI1, a0VarE, false, q3VarI, jT, 0L, 0.0f, 0.0f, null, null, androidx.compose.runtime.internal.w.e(-1477282471, true, new k(i11, h80Var, i10, jU), c0VarR, 54), c0Var2, 0, 48, 1992);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.h60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.S0(a0Var, i10, h80Var, i11, u50Var, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @NotNull
    public static final String P1(int i10, boolean z10, int i11, @Nullable androidx.compose.runtime.c0 c0Var, int i12) {
        int iB;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(194237364, i12, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:2019)");
        }
        if (g80.f(i10, g80.f27919b.b())) {
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            iB = androidx.compose.material3.internal.l3.b(ps.b.f31835e0);
        } else if (z10) {
            androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
            iB = androidx.compose.material3.internal.l3.b(ps.b.Y);
        } else {
            androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
            iB = androidx.compose.material3.internal.l3.b(ps.b.f31827a0);
        }
        String strC = androidx.compose.material3.internal.m3.c(iB, new Object[]{Integer.valueOf(i11)}, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return strC;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void Q(@NotNull final androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.material3.j jVar, @NotNull final u50 u50Var, final boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final androidx.compose.material3.j jVar2 = jVar;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-478841003);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(jVar2) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(u50Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.G(z10) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-478841003, i11, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1591)");
            }
            jVar2 = jVar;
            androidx.compose.animation.y.b(jVar2.t(), G1(androidx.compose.foundation.v.c(a0Var, u50Var.d(), androidx.compose.foundation.shape.o.k()).B2(new ClockDialModifier(jVar, z10, jVar.c(), hm.b(d0.h1.DefaultSpatial, c0VarR, 6), null)), jVar2, u50Var), hm.b(d0.h1.DefaultEffects, c0VarR, 6), null, androidx.compose.runtime.internal.w.e(747010833, true, new c(u50Var, jVar2, z10), c0VarR, 54), c0VarR, 24576, 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.f60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.R(a0Var, jVar2, u50Var, z10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q0(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.f());
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object Q1(androidx.compose.material3.j jVar, float f10, float f11, float f12, boolean z10, long j10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super Unit> dVar) {
        m mVar;
        float f13;
        float fRint;
        androidx.compose.material3.j jVar2;
        boolean z11;
        androidx.compose.material3.j jVar3;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f32827d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f32827d = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        m mVar2 = mVar;
        Object obj = mVar2.f32826c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar2.f32827d;
        if (i11 != 0) {
            if (i11 == 1) {
                z11 = mVar2.f32825b;
                androidx.compose.material3.j jVar4 = (androidx.compose.material3.j) mVar2.f32824a;
                ResultKt.m(obj);
                jVar2 = jVar4;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = mVar2.f32825b;
                jVar3 = (androidx.compose.material3.j) mVar2.f32824a;
                ResultKt.m(obj);
            }
            jVar2 = jVar3;
            if (z11) {
                jVar2.b(g80.f27919b.b());
            }
            return Unit.f312394a;
        }
        ResultKt.m(obj);
        float fE1 = E1(f11 - androidx.compose.ui.unit.q.p(j10), f10 - androidx.compose.ui.unit.q.n(j10));
        if (g80.f(jVar.c(), g80.f27919b.b())) {
            f13 = f32750d;
            fRint = ((float) Math.rint((fE1 / f32750d) / 5.0f)) * 5.0f;
        } else {
            f13 = f32751e;
            fRint = (float) Math.rint(fE1 / f32751e);
        }
        float f14 = fRint * f13;
        O1(jVar, f10, f11, f12, j10);
        mVar2.f32824a = jVar;
        mVar2.f32825b = z10;
        mVar2.f32827d = 1;
        if (jVar.C(f14, oVar, true, mVar2) != objL) {
            jVar2 = jVar;
            z11 = z10;
        }
        return objL;
        if (g80.f(jVar2.c(), g80.f27919b.a()) && z11) {
            mVar2.f32824a = jVar2;
            mVar2.f32825b = z11;
            mVar2.f32827d = 2;
            if (kotlinx.coroutines.d1.b(100L, mVar2) != objL) {
                jVar3 = jVar2;
                jVar2 = jVar3;
            }
            return objL;
        }
        if (z11) {
            jVar2.b(g80.f27919b.b());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(androidx.compose.ui.a0 a0Var, androidx.compose.material3.j jVar, u50 u50Var, boolean z10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Q(a0Var, jVar, u50Var, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R0(int i10, h80 h80Var) {
        if (!g80.f(i10, h80Var.c())) {
            h80Var.b(i10);
        }
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public static final h80 R1(final int i10, final int i11, final boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z10 = t50.a(c0Var, 0);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1237715277, i12, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:587)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<k80, ?> c0VarC = k80.f30017e.c();
        boolean z11 = true;
        boolean z12 = ((((i12 & 14) ^ 6) > 4 && c0Var.K(i10)) || (i12 & 6) == 4) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.K(i11)) || (i12 & 48) == 32);
        if ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 || !c0Var.G(z10)) && (i12 & androidx.media3.exoplayer.a5.S0) != 256) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objI0 = c0Var.i0();
        if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.material3.e70
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s70.S1(i10, i11, z10);
                }
            };
            c0Var.Y(objI0);
        }
        k80 k80Var = (k80) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI0, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return k80Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void S(final androidx.compose.ui.a0 a0Var, final androidx.compose.material3.j jVar, final int i10, final boolean z10, androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-206784607);
        if ((i11 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0VarR.k0(jVar) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.K(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0VarR.G(z10) ? 2048 : 1024;
        }
        int i13 = i12;
        if (c0VarR.h((i13 & 1171) != 1170, i13 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-206784607, i13, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1727)");
            }
            androidx.compose.ui.text.y3 y3VarE = la0.e(d0.b3.f267681a.c(), c0VarR, 6);
            final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            final float fS7 = dVar.S7(f32760n);
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.d7.g(n0.g.d(n0.g.f332700b.e()), null, 2, null);
                c0VarR.Y(objI0);
            }
            final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI0;
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f42709b.b()), null, 2, null);
                c0VarR.Y(objI1);
            }
            final androidx.compose.runtime.n3 n3Var2 = (androidx.compose.runtime.n3) objI1;
            Object objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.runtime.d7.g(n0.j.f332705e.a(), null, 2, null);
                c0VarR.Y(objI2);
            }
            final androidx.compose.runtime.n3 n3Var3 = (androidx.compose.runtime.n3) objI2;
            Object objI3 = c0VarR.i0();
            if (objI3 == aVar.a()) {
                objI3 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI3);
            }
            final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI3;
            final String strP1 = P1(jVar.c(), jVar.g(), i10, c0VarR, i13 & 896);
            String strC = c4.c(i10, 0, 0, false, null, 15, null);
            boolean zD = c0VarR.D(jVar);
            Object objI4 = c0VarR.i0();
            if (zD || objI4 == aVar.a()) {
                objI4 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.i60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(s70.Z(jVar, dVar, n3Var3));
                    }
                });
                c0VarR.Y(objI4);
            }
            final androidx.compose.runtime.n7 n7Var = (androidx.compose.runtime.n7) objI4;
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            Object objI5 = c0VarR.i0();
            if (objI5 == aVar.a()) {
                objI5 = new Function1() { // from class: androidx.compose.material3.j60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.b0(n3Var2, n3Var3, n3Var, (androidx.compose.ui.layout.g0) obj);
                    }
                };
                c0VarR.Y(objI5);
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.foundation.e2.c(androidx.compose.foundation.layout.i6.w(wi.j(androidx.compose.ui.layout.q1.a(a0Var, (Function1) objI5)), f32761o), false, null, 3, null);
            boolean zK0 = c0VarR.k0(s0Var) | c0VarR.k0(jVar) | c0VarR.I(fS7) | ((i13 & 7168) == 2048) | c0VarR.D(n7Var);
            Object objI6 = c0VarR.i0();
            if (zK0 || objI6 == aVar.a()) {
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.k60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.c0(s0Var, jVar, fS7, z10, n3Var, n3Var2, n7Var, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(function1);
                objI6 = function1;
            }
            androidx.compose.ui.a0 a0VarE = androidx.compose.ui.semantics.t.e(a0VarC, true, (Function1) objI6);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarE);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            boolean zD2 = c0VarR.D(strP1);
            Object objI7 = c0VarR.i0();
            if (zD2 || objI7 == aVar.a()) {
                objI7 = new Function1() { // from class: androidx.compose.material3.l60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.e0(strP1, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI7);
            }
            c0Var2 = c0VarR;
            q50.t(strC, androidx.compose.ui.semantics.t.c(aVar3, (Function1) objI7), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3VarE, c0Var2, 0, 0, 131068);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.m60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.f0(a0Var, jVar, i10, z10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S0(androidx.compose.ui.a0 a0Var, int i10, h80 h80Var, int i11, u50 u50Var, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        P0(a0Var, i10, h80Var, i11, u50Var, c0Var, androidx.compose.runtime.t4.a(i12 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k80 S1(int i10, int i11, boolean z10) {
        return new k80(i10, i11, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long T(androidx.compose.runtime.n3<n0.g> n3Var) {
        return n3Var.getValue().B();
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void T0(final boolean z10, final androidx.compose.ui.graphics.q3 q3Var, final Function0<Unit> function0, final u50 u50Var, final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1523811083);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(q3Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function0) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(u50Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(nVar) ? 16384 : 8192;
        }
        if (c0VarR.h((i11 & 9363) != 9362, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1523811083, i11, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1359)");
            }
            long jS = u50Var.s(z10);
            long jR = u50Var.r(z10);
            androidx.compose.ui.a0 a0VarF = androidx.compose.foundation.layout.i6.f(androidx.compose.ui.i0.a(androidx.compose.ui.a0.E, z10 ? 0.0f : 1.0f), 0.0f, 1, null);
            boolean z11 = (i11 & 14) == 4;
            Object objI0 = c0VarR.i0();
            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.v60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.U0(z10, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            a4.p(function0, androidx.compose.ui.semantics.t.f(a0VarF, false, (Function1) objI0, 1, null), false, q3Var, s3.f32666a.G(jR, jS, 0L, 0L, c0VarR, 24576, 12), null, null, androidx.compose.foundation.layout.d5.f(androidx.compose.ui.unit.h.r(0)), null, nVar, c0VarR, ((i11 >> 6) & 14) | 12582912 | ((i11 << 6) & 7168) | ((i11 << 15) & 1879048192), 356);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.w60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.V0(z10, q3Var, function0, u50Var, nVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(int i10, h80 h80Var, androidx.compose.ui.text.input.y0 y0Var, androidx.compose.ui.text.input.y0 y0Var2, int i11, androidx.compose.ui.node.f2<Boolean> f2Var, Function1<? super androidx.compose.ui.text.input.y0, Unit> function1) {
        f2Var.b(Boolean.FALSE);
        if (Intrinsics.areEqual(y0Var.m(), y0Var2.m())) {
            function1.invoke(y0Var);
            return;
        }
        int i12 = 12;
        if (y0Var.m().length() == 0) {
            if (g80.f(i10, g80.f27919b.a())) {
                h80Var.d((!N1(h80Var) || h80Var.g()) ? 0 : 12);
            } else {
                h80Var.e(0);
            }
            function1.invoke(androidx.compose.ui.text.input.y0.i(y0Var, "", 0L, null, 6, null));
            return;
        }
        try {
            int iE = (y0Var.m().length() == 3 && androidx.compose.ui.text.w3.n(y0Var.l()) == 1) ? CharsKt.E(y0Var.m().charAt(0)) : Integer.parseInt(y0Var.m());
            if (iE <= i11) {
                g80.a aVar = g80.f27919b;
                if (g80.f(i10, aVar.a())) {
                    if (iE != 12 || !N1(h80Var)) {
                        if (iE != 12 || N1(h80Var) || h80Var.g()) {
                            if (!N1(h80Var) || h80Var.g()) {
                                i12 = 0;
                            }
                            i12 += iE;
                        } else {
                            i12 = 0;
                        }
                    }
                    h80Var.d(i12);
                    if (iE > 1 && !h80Var.g()) {
                        h80Var.b(aVar.b());
                    }
                } else {
                    h80Var.e(iE);
                }
                function1.invoke(y0Var.m().length() <= 2 ? y0Var : androidx.compose.ui.text.input.y0.i(y0Var, String.valueOf(y0Var.m().charAt(0)), 0L, null, 6, null));
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    private static final void U(androidx.compose.runtime.n3<n0.g> n3Var, long j10) {
        n3Var.setValue(n0.g.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U0(boolean z10, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.L1(e0Var, z10);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.k7
    private static final androidx.compose.ui.a0 U1(androidx.compose.ui.a0 a0Var, boolean z10) {
        return a0Var.B2(new pa0(z10, androidx.compose.ui.platform.r2.e() ? new n(z10) : androidx.compose.ui.platform.r2.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long V(androidx.compose.runtime.n3<androidx.compose.ui.unit.q> n3Var) {
        return n3Var.getValue().x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(boolean z10, androidx.compose.ui.graphics.q3 q3Var, Function0 function0, u50 u50Var, pj.n nVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        T0(z10, q3Var, function0, u50Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final void W(androidx.compose.runtime.n3<androidx.compose.ui.unit.q> n3Var, long j10) {
        n3Var.setValue(androidx.compose.ui.unit.q.c(j10));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void W0(final h80 h80Var, final u50 u50Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2054675515);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(h80Var) : c0VarR.k0(h80Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(u50Var) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2054675515, i11, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1153)");
            }
            androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(fVarM, aVar2.w(), c0VarR, 6);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            O(h80Var, u50Var, c0VarR, i11 & okhttp3.internal.ws.g.f334652s);
            if (h80Var.g()) {
                c0VarR.E(1364727499);
                c0VarR.A();
            } else {
                c0VarR.E(1364287361);
                androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(aVar, f32765s, 0.0f, 0.0f, 0.0f, 14, null);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarV);
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
                d0.b3 b3Var = d0.b3.f267681a;
                int i12 = i11 << 3;
                Y0(androidx.compose.foundation.layout.i6.y(aVar, b3Var.J(), b3Var.I()), h80Var, u50Var, c0VarR, 6 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896));
                c0VarR.o();
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.r60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.X0(h80Var, u50Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final n0.j X(androidx.compose.runtime.n3<n0.j> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X0(h80 h80Var, u50 u50Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        W0(h80Var, u50Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final void Y(androidx.compose.runtime.n3<n0.j> n3Var, n0.j jVar) {
        n3Var.setValue(jVar);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void Y0(androidx.compose.ui.a0 a0Var, h80 h80Var, u50 u50Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final androidx.compose.ui.a0 a0Var2;
        final h80 h80Var2;
        final u50 u50Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1898918107);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c0VarR.D(h80Var) : c0VarR.k0(h80Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(u50Var) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1898918107, i11, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1252)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = l.f32823a;
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.b3.f267681a.t(), c0VarR, 6);
            Intrinsics.checkNotNull(q3VarI, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            androidx.compose.foundation.shape.e eVar = (androidx.compose.foundation.shape.e) q3VarI;
            int i12 = 7 >> 0;
            a0Var2 = a0Var;
            h80Var2 = h80Var;
            u50Var2 = u50Var;
            q0(a0Var2, h80Var2, u50Var2, a1Var, cx.m(eVar, null, 1, null), cx.d(eVar, null, 1, null), c0VarR, (i11 & 14) | 3072 | (i11 & com.planner5d.library.engine.input.f.b.B) | (i11 & 896));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            a0Var2 = a0Var;
            h80Var2 = h80Var;
            u50Var2 = u50Var;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.g70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.Z0(a0Var2, h80Var2, u50Var2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(androidx.compose.material3.j jVar, androidx.compose.ui.unit.d dVar, androidx.compose.runtime.n3 n3Var) {
        long jM1 = M1(jVar);
        float fS7 = dVar.S7(androidx.compose.ui.unit.j.j(jM1));
        return X(n3Var).f(n0.g.g((((long) Float.floatToRawIntBits(dVar.S7(androidx.compose.ui.unit.j.l(jM1)))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fS7) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(androidx.compose.ui.a0 a0Var, h80 h80Var, u50 u50Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Y0(a0Var, h80Var, u50Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final boolean a0(androidx.compose.runtime.n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x0131  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void a1(@NotNull final androidx.compose.material3.j jVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable u50 u50Var, final boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        u50 u50Var2;
        boolean z11;
        int i13;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final u50 u50Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i14;
        u50 u50VarA;
        androidx.compose.ui.a0 a0Var5;
        Object objI0;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1249591487);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(jVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    u50Var2 = u50Var;
                    int i16 = c0VarR.D(u50Var2) ? 256 : 128;
                    i12 |= i16;
                } else {
                    u50Var2 = u50Var;
                }
                i12 |= i16;
            } else {
                u50Var2 = u50Var;
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i12 |= i13;
                }
                if ((i12 & 1171) != 1170) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            a0Var5 = a0Var4;
                            i14 = i12 & (-897);
                            u50VarA = v50.f33879a.a(c0VarR, 6);
                        } else {
                            androidx.compose.ui.a0 a0Var6 = a0Var4;
                            i14 = i12;
                            u50VarA = u50Var2;
                            a0Var5 = a0Var6;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1249591487, i14, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.s60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s70.c1((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarF);
                    androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                    function0A = aVar.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                    function2B = aVar.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                    androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                    W0(jVar, u50VarA, c0VarR, (i14 & 14) | ((i14 >> 3) & com.planner5d.library.engine.input.f.b.B));
                    androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar2, f32755i), c0VarR, 6);
                    Q(androidx.compose.foundation.layout.i6.w(aVar2, d0.b3.f267681a.b()), jVar, u50VarA, z11, c0VarR, ((i14 << 3) & com.planner5d.library.engine.input.f.b.B) | 6 | (i14 & 896) | (i14 & 7168));
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar2, f32756j), c0VarR, 6);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    u50Var3 = u50VarA;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    u50Var3 = u50Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.t60
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s70.b1(jVar, a0Var3, u50Var3, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        a0Var5 = a0Var4;
                        i14 = i12 & (-897);
                        u50VarA = v50.f33879a.a(c0VarR, 6);
                    } else {
                        androidx.compose.ui.a0 a0Var7 = a0Var4;
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var7;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        a0Var5 = a0Var4;
                        i14 = i12 & (-897);
                        u50VarA = v50.f33879a.a(c0VarR, 6);
                    } else {
                        androidx.compose.ui.a0 a0Var8 = a0Var4;
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var8;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1249591487, i14, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.s60
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.c1((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarF2 = androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null);
                androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                function0A = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarB2, aVar3.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar3.f());
                androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                W0(jVar, u50VarA, c0VarR, (i14 & 14) | ((i14 >> 3) & com.planner5d.library.engine.input.f.b.B));
                androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar4, f32755i), c0VarR, 6);
                Q(androidx.compose.foundation.layout.i6.w(aVar4, d0.b3.f267681a.b()), jVar, u50VarA, z11, c0VarR, ((i14 << 3) & com.planner5d.library.engine.input.f.b.B) | 6 | (i14 & 896) | (i14 & 7168));
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar4, f32756j), c0VarR, 6);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                u50Var3 = u50VarA;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                u50Var3 = u50Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.t60
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s70.b1(jVar, a0Var3, u50Var3, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                u50Var2 = u50Var;
                if (c0VarR.D(u50Var2)) {
                }
                i12 |= i16;
            } else {
                u50Var2 = u50Var;
            }
            i12 |= i16;
        } else {
            u50Var2 = u50Var;
        }
        if ((i11 & 8) != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        a0Var5 = a0Var4;
                        i14 = i12 & (-897);
                        u50VarA = v50.f33879a.a(c0VarR, 6);
                    } else {
                        androidx.compose.ui.a0 a0Var9 = a0Var4;
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var9;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        a0Var5 = a0Var4;
                        i14 = i12 & (-897);
                        u50VarA = v50.f33879a.a(c0VarR, 6);
                    } else {
                        androidx.compose.ui.a0 a0Var10 = a0Var4;
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var10;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1249591487, i14, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.s60
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.c1((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarF3 = androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null);
                androidx.compose.ui.layout.a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                function0A = aVar5.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarB3, aVar5.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar5.g());
                function2B = aVar5.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar5.f());
                androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
                W0(jVar, u50VarA, c0VarR, (i14 & 14) | ((i14 >> 3) & com.planner5d.library.engine.input.f.b.B));
                androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar6, f32755i), c0VarR, 6);
                Q(androidx.compose.foundation.layout.i6.w(aVar6, d0.b3.f267681a.b()), jVar, u50VarA, z11, c0VarR, ((i14 << 3) & com.planner5d.library.engine.input.f.b.B) | 6 | (i14 & 896) | (i14 & 7168));
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar6, f32756j), c0VarR, 6);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                u50Var3 = u50VarA;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                u50Var3 = u50Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.t60
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s70.b1(jVar, a0Var3, u50Var3, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i12 & 1171) != 1170) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    a0Var5 = a0Var4;
                    i14 = i12 & (-897);
                    u50VarA = v50.f33879a.a(c0VarR, 6);
                } else {
                    androidx.compose.ui.a0 a0Var11 = a0Var4;
                    i14 = i12;
                    u50VarA = u50Var2;
                    a0Var5 = a0Var11;
                }
            } else {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    a0Var5 = a0Var4;
                    i14 = i12 & (-897);
                    u50VarA = v50.f33879a.a(c0VarR, 6);
                } else {
                    androidx.compose.ui.a0 a0Var12 = a0Var4;
                    i14 = i12;
                    u50VarA = u50Var2;
                    a0Var5 = a0Var12;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1249591487, i14, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.s60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.c1((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF4 = androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null);
            androidx.compose.ui.layout.a1 a1VarB4 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarF4);
            androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
            function0A = aVar7.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarB4, aVar7.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar7.g());
            function2B = aVar7.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar7.f());
            androidx.compose.foundation.layout.n0 n0Var4 = androidx.compose.foundation.layout.n0.f16227a;
            W0(jVar, u50VarA, c0VarR, (i14 & 14) | ((i14 >> 3) & com.planner5d.library.engine.input.f.b.B));
            androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar8, f32755i), c0VarR, 6);
            Q(androidx.compose.foundation.layout.i6.w(aVar8, d0.b3.f267681a.b()), jVar, u50VarA, z11, c0VarR, ((i14 << 3) & com.planner5d.library.engine.input.f.b.B) | 6 | (i14 & 896) | (i14 & 7168));
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar8, f32756j), c0VarR, 6);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            u50Var3 = u50VarA;
            a0Var3 = a0Var5;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            u50Var3 = u50Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.t60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.b1(jVar, a0Var3, u50Var3, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(androidx.compose.runtime.n3 n3Var, androidx.compose.runtime.n3 n3Var2, androidx.compose.runtime.n3 n3Var3, androidx.compose.ui.layout.g0 g0Var) {
        androidx.compose.ui.layout.g0 g0VarS0 = g0Var.s0();
        W(n3Var, g0VarS0 != null ? androidx.compose.ui.unit.v.b(g0VarS0.a()) : androidx.compose.ui.unit.q.f42709b.b());
        Y(n3Var2, androidx.compose.ui.layout.h0.a(g0Var));
        U(n3Var3, X(n3Var2).o());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(androidx.compose.material3.j jVar, androidx.compose.ui.a0 a0Var, u50 u50Var, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        a1(jVar, a0Var, u50Var, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(final kotlinx.coroutines.s0 s0Var, final androidx.compose.material3.j jVar, final float f10, final boolean z10, final androidx.compose.runtime.n3 n3Var, final androidx.compose.runtime.n3 n3Var2, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.material3.h70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(s70.d0(s0Var, jVar, f10, z10, n3Var, n3Var2));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.L1(e0Var, a0(n7Var));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c1(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.b2(e0Var, true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d0(kotlinx.coroutines.s0 s0Var, androidx.compose.material3.j jVar, float f10, boolean z10, androidx.compose.runtime.n3 n3Var, androidx.compose.runtime.n3 n3Var2) {
        kotlinx.coroutines.k.f(s0Var, null, null, new d(jVar, f10, z10, n3Var, n3Var2, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(androidx.compose.ui.a0 a0Var, androidx.compose.material3.j jVar, int i10, boolean z10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        S(a0Var, jVar, i10, z10, c0Var, androidx.compose.runtime.t4.a(i11 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void g0(final androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2100674302);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2100674302, i11, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1379)");
            }
            androidx.compose.ui.text.y3 y3VarM = androidx.compose.ui.text.y3.m((androidx.compose.ui.text.y3) c0VarR.W(q50.I()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, androidx.compose.ui.text.style.j.f42206b.a(), 0, 0L, null, null, new androidx.compose.ui.text.style.h(androidx.compose.ui.text.style.h.a.f42184b.b(), androidx.compose.ui.text.style.h.d.f42194b.a(), (DefaultConstructorMarker) null), 0, 0, null, 15695871, null);
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.o60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.h0((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.ui.semantics.t.c(a0Var, (Function1) objI0);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            c0Var2 = c0VarR;
            q50.t(":", null, o6.r(d0.a3.f267591a.G(), c0VarR, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3VarM, c0Var2, 6, 0, 131066);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.p60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.i0(a0Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(androidx.compose.ui.semantics.e0 e0Var) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(androidx.compose.ui.a0 a0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        g0(a0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void j0(final h80 h80Var, final u50 u50Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(755539561);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(h80Var) : c0VarR.k0(h80Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(u50Var) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(755539561, i11, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1133)");
            }
            androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarM, aVar2.u(), c0VarR, 6);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
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
            O(h80Var, u50Var, c0VarR, i11 & okhttp3.internal.ws.g.f334652s);
            if (h80Var.g()) {
                c0VarR.E(999020143);
                c0VarR.A();
            } else {
                c0VarR.E(998576161);
                androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(aVar, 0.0f, f32765s, 0.0f, 0.0f, 13, null);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarV);
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
                d0.b3 b3Var = d0.b3.f267681a;
                int i12 = i11 << 3;
                l0(androidx.compose.foundation.layout.i6.y(aVar, b3Var.v(), b3Var.u()), h80Var, u50Var, c0VarR, 6 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896));
                c0VarR.o();
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.y60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.k0(h80Var, u50Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(h80 h80Var, u50 u50Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        j0(h80Var, u50Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void l0(androidx.compose.ui.a0 a0Var, h80 h80Var, u50 u50Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final androidx.compose.ui.a0 a0Var2;
        final h80 h80Var2;
        final u50 u50Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1261215927);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c0VarR.D(h80Var) : c0VarR.k0(h80Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(u50Var) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1261215927, i11, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1206)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = e.f32791a;
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.b3.f267681a.t(), c0VarR, 6);
            Intrinsics.checkNotNull(q3VarI, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            androidx.compose.foundation.shape.e eVar = (androidx.compose.foundation.shape.e) q3VarI;
            a0Var2 = a0Var;
            h80Var2 = h80Var;
            u50Var2 = u50Var;
            q0(a0Var2, h80Var2, u50Var2, a1Var, cx.k(eVar, null, 1, null), cx.f(eVar, null, 1, null), c0VarR, (i11 & 14) | 3072 | (i11 & com.planner5d.library.engine.input.f.b.B) | (i11 & 896));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            a0Var2 = a0Var;
            h80Var2 = h80Var;
            u50Var2 = u50Var;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.p70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.m0(a0Var2, h80Var2, u50Var2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(androidx.compose.ui.a0 a0Var, h80 h80Var, u50 u50Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        l0(a0Var, h80Var, u50Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void n0(@NotNull final androidx.compose.material3.j jVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable u50 u50Var, final boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        u50 u50Var2;
        boolean z11;
        int i13;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final u50 u50Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i14;
        u50 u50VarA;
        androidx.compose.ui.a0 a0Var5;
        Object objI0;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1432307537);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(jVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    u50Var2 = u50Var;
                    int i16 = c0VarR.D(u50Var2) ? 256 : 128;
                    i12 |= i16;
                } else {
                    u50Var2 = u50Var;
                }
                i12 |= i16;
            } else {
                u50Var2 = u50Var;
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i12 |= i13;
                }
                if ((i12 & 1171) != 1170) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            a0Var5 = a0Var4;
                            i14 = i12 & (-897);
                            u50VarA = v50.f33879a.a(c0VarR, 6);
                        } else {
                            androidx.compose.ui.a0 a0Var6 = a0Var4;
                            i14 = i12;
                            u50VarA = u50Var2;
                            a0Var5 = a0Var6;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1432307537, i14, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.i70
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s70.o0((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null);
                    androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarF);
                    androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                    function0A = aVar.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                    function2B = aVar.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                    androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
                    j0(jVar, u50VarA, c0VarR, (i14 & 14) | ((i14 >> 3) & com.planner5d.library.engine.input.f.b.B));
                    androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar2, f32755i), c0VarR, 6);
                    Q(aVar2.B2(new j6()), jVar, u50VarA, z11, c0VarR, ((i14 << 3) & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168));
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    u50Var3 = u50VarA;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    u50Var3 = u50Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j70
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s70.p0(jVar, a0Var3, u50Var3, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        a0Var5 = a0Var4;
                        i14 = i12 & (-897);
                        u50VarA = v50.f33879a.a(c0VarR, 6);
                    } else {
                        androidx.compose.ui.a0 a0Var7 = a0Var4;
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var7;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        a0Var5 = a0Var4;
                        i14 = i12 & (-897);
                        u50VarA = v50.f33879a.a(c0VarR, 6);
                    } else {
                        androidx.compose.ui.a0 a0Var8 = a0Var4;
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var8;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1432307537, i14, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.i70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.o0((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarF2 = androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null);
                androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                function0A = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarE2, aVar3.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar3.f());
                androidx.compose.foundation.layout.y5 y5Var2 = androidx.compose.foundation.layout.y5.f16577a;
                j0(jVar, u50VarA, c0VarR, (i14 & 14) | ((i14 >> 3) & com.planner5d.library.engine.input.f.b.B));
                androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar4, f32755i), c0VarR, 6);
                Q(aVar4.B2(new j6()), jVar, u50VarA, z11, c0VarR, ((i14 << 3) & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168));
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                u50Var3 = u50VarA;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                u50Var3 = u50Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j70
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s70.p0(jVar, a0Var3, u50Var3, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                u50Var2 = u50Var;
                if (c0VarR.D(u50Var2)) {
                }
                i12 |= i16;
            } else {
                u50Var2 = u50Var;
            }
            i12 |= i16;
        } else {
            u50Var2 = u50Var;
        }
        if ((i11 & 8) != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        a0Var5 = a0Var4;
                        i14 = i12 & (-897);
                        u50VarA = v50.f33879a.a(c0VarR, 6);
                    } else {
                        androidx.compose.ui.a0 a0Var9 = a0Var4;
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var9;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        a0Var5 = a0Var4;
                        i14 = i12 & (-897);
                        u50VarA = v50.f33879a.a(c0VarR, 6);
                    } else {
                        androidx.compose.ui.a0 a0Var10 = a0Var4;
                        i14 = i12;
                        u50VarA = u50Var2;
                        a0Var5 = a0Var10;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1432307537, i14, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.i70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s70.o0((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarF3 = androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null);
                androidx.compose.ui.layout.a1 a1VarE3 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                function0A = aVar5.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarE3, aVar5.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar5.g());
                function2B = aVar5.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar5.f());
                androidx.compose.foundation.layout.y5 y5Var3 = androidx.compose.foundation.layout.y5.f16577a;
                j0(jVar, u50VarA, c0VarR, (i14 & 14) | ((i14 >> 3) & com.planner5d.library.engine.input.f.b.B));
                androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar6, f32755i), c0VarR, 6);
                Q(aVar6.B2(new j6()), jVar, u50VarA, z11, c0VarR, ((i14 << 3) & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168));
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                u50Var3 = u50VarA;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                u50Var3 = u50Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j70
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s70.p0(jVar, a0Var3, u50Var3, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i12 & 1171) != 1170) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    a0Var5 = a0Var4;
                    i14 = i12 & (-897);
                    u50VarA = v50.f33879a.a(c0VarR, 6);
                } else {
                    androidx.compose.ui.a0 a0Var11 = a0Var4;
                    i14 = i12;
                    u50VarA = u50Var2;
                    a0Var5 = a0Var11;
                }
            } else {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    a0Var5 = a0Var4;
                    i14 = i12 & (-897);
                    u50VarA = v50.f33879a.a(c0VarR, 6);
                } else {
                    androidx.compose.ui.a0 a0Var12 = a0Var4;
                    i14 = i12;
                    u50VarA = u50Var2;
                    a0Var5 = a0Var12;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1432307537, i14, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.i70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.o0((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF4 = androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null);
            androidx.compose.ui.layout.a1 a1VarE4 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarF4);
            androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
            function0A = aVar7.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarE4, aVar7.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar7.g());
            function2B = aVar7.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar7.f());
            androidx.compose.foundation.layout.y5 y5Var4 = androidx.compose.foundation.layout.y5.f16577a;
            j0(jVar, u50VarA, c0VarR, (i14 & 14) | ((i14 >> 3) & com.planner5d.library.engine.input.f.b.B));
            androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar8, f32755i), c0VarR, 6);
            Q(aVar8.B2(new j6()), jVar, u50VarA, z11, c0VarR, ((i14 << 3) & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            u50Var3 = u50VarA;
            a0Var3 = a0Var5;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            u50Var3 = u50Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.j70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.p0(jVar, a0Var3, u50Var3, z10, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.b2(e0Var, true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(androidx.compose.material3.j jVar, androidx.compose.ui.a0 a0Var, u50 u50Var, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        n0(jVar, a0Var, u50Var, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void q0(final androidx.compose.ui.a0 a0Var, final h80 h80Var, final u50 u50Var, final androidx.compose.ui.layout.a1 a1Var, final androidx.compose.ui.graphics.q3 q3Var, final androidx.compose.ui.graphics.q3 q3Var2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.ui.graphics.q3 q3Var3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1374241901);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c0VarR.D(h80Var) : c0VarR.k0(h80Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(u50Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(a1Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(q3Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            q3Var3 = q3Var2;
            i11 |= c0VarR.D(q3Var3) ? 131072 : 65536;
        } else {
            q3Var3 = q3Var2;
        }
        if (c0VarR.h((74899 & i11) != 74898, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1374241901, i11, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1301)");
            }
            d0.b3 b3Var = d0.b3.f267681a;
            androidx.compose.foundation.a1 a1VarA = androidx.compose.foundation.b1.a(b3Var.y(), u50Var.h());
            androidx.compose.ui.graphics.q3 q3VarI = cx.i(b3Var.t(), c0VarR, 6);
            Intrinsics.checkNotNull(q3VarI, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            androidx.compose.foundation.shape.e eVar = (androidx.compose.foundation.shape.e) q3VarI;
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            final String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31839g0), c0VarR, 0);
            boolean zD = c0VarR.D(strB);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.z60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s70.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarG = androidx.compose.foundation.t0.g(androidx.compose.foundation.selection.b.b(androidx.compose.ui.semantics.t.f(a0Var, false, (Function1) objI0, 1, null)), a1VarA, eVar);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarG);
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
            boolean z10 = !N1(h80Var);
            int i12 = i11 & com.planner5d.library.engine.input.f.b.B;
            boolean z11 = i12 == 32 || ((i11 & 64) != 0 && c0VarR.k0(h80Var));
            Object objI1 = c0VarR.i0();
            if (z11 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function0() { // from class: androidx.compose.material3.a70
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s70.s0(h80Var);
                    }
                };
                c0VarR.Y(objI1);
            }
            a7 a7Var = a7.f25986a;
            int i13 = (i11 << 3) & 7168;
            T0(z10, q3Var, (Function0) objI1, u50Var, a7Var.b(), c0VarR, ((i11 >> 9) & com.planner5d.library.engine.input.f.b.B) | 24576 | i13);
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(androidx.compose.ui.i0.a(androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, "Spacer"), 2.0f), 0.0f, 1, null), u50Var.h(), null, 2, null), c0VarR, 0);
            boolean z12 = false;
            boolean zN1 = N1(h80Var);
            if (i12 == 32 || ((i11 & 64) != 0 && c0VarR.k0(h80Var))) {
                z12 = true;
            }
            Object objI2 = c0VarR.i0();
            if (z12 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function0() { // from class: androidx.compose.material3.c70
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s70.t0(h80Var);
                    }
                };
                c0VarR.Y(objI2);
            }
            T0(zN1, q3Var3, (Function0) objI2, u50Var, a7Var.a(), c0VarR, ((i11 >> 12) & com.planner5d.library.engine.input.f.b.B) | 24576 | i13);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.d70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.u0(a0Var, h80Var, u50Var, a1Var, q3Var, q3Var2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.b2(e0Var, true);
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(h80 h80Var) {
        if (N1(h80Var)) {
            h80Var.d(h80Var.a() - 12);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(h80 h80Var) {
        if (!N1(h80Var)) {
            h80Var.d(h80Var.a() + 12);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(androidx.compose.ui.a0 a0Var, h80 h80Var, u50 u50Var, androidx.compose.ui.layout.a1 a1Var, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.ui.graphics.q3 q3Var2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        q0(a0Var, h80Var, u50Var, a1Var, q3Var, q3Var2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void v0(@NotNull final h80 h80Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable u50 u50Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-760850373);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(h80Var) : c0VarR.k0(h80Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= ((i11 & 4) == 0 && c0VarR.D(u50Var)) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                if (i13 != 0) {
                    a0Var = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    u50Var = v50.f33879a.a(c0VarR, 6);
                    i12 &= -897;
                }
            } else {
                c0VarR.u();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-760850373, i12, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:274)");
            }
            x0(a0Var, u50Var, h80Var, c0VarR, ((i12 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i12 << 6) & 896));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        final u50 u50Var2 = u50Var;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.x60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.w0(h80Var, a0Var2, u50Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(h80 h80Var, androidx.compose.ui.a0 a0Var, u50 u50Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        v0(h80Var, a0Var, u50Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void x0(androidx.compose.ui.a0 a0Var, u50 u50Var, h80 h80Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final androidx.compose.ui.a0 a0Var2;
        final u50 u50Var2;
        androidx.compose.ui.node.f2 f2Var;
        androidx.compose.runtime.n3 n3Var;
        androidx.compose.runtime.n3 n3Var2;
        final h80 h80Var2 = h80Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-475657989);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(u50Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= (i10 & 512) == 0 ? c0VarR.D(h80Var2) : c0VarR.k0(h80Var2) ? 256 : 128;
        }
        int i12 = i11;
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-475657989, i12, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:997)");
            }
            Object[] objArr = new Object[0];
            androidx.compose.ui.text.input.y0.a aVar = androidx.compose.ui.text.input.y0.f41979d;
            androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.input.y0, Object> c0VarA = aVar.a();
            int i13 = i12 & 896;
            boolean z10 = i13 == 256 || ((i12 & 512) != 0 && c0VarR.k0(h80Var2));
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.q60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s70.z0(h80Var2);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.n3 n3VarH = androidx.compose.runtime.saveable.i.h(objArr, c0VarA, (Function0) objI0, c0VarR, 0);
            Object[] objArr2 = new Object[0];
            androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.input.y0, Object> c0VarA2 = aVar.a();
            boolean z11 = i13 == 256 || ((i12 & 512) != 0 && c0VarR.k0(h80Var2));
            Object objI1 = c0VarR.i0();
            if (z11 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function0() { // from class: androidx.compose.material3.b70
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s70.C0(h80Var2);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.n3 n3VarH2 = androidx.compose.runtime.saveable.i.h(objArr2, c0VarA2, (Function0) objI1, c0VarR, 0);
            Object objI2 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar2 = androidx.compose.runtime.c0.f35327a;
            if (objI2 == aVar2.a()) {
                objI2 = new androidx.compose.ui.node.f2();
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.node.f2 f2Var2 = (androidx.compose.ui.node.f2) objI2;
            Integer numValueOf = Integer.valueOf(h80Var2.a());
            Integer numValueOf2 = Integer.valueOf(h80Var2.f());
            boolean zK0 = c0VarR.k0(f2Var2) | c0VarR.D(n3VarH) | (i13 == 256 || ((i12 & 512) != 0 && c0VarR.k0(h80Var2))) | c0VarR.D(n3VarH2);
            Object objI3 = c0VarR.i0();
            if (zK0 || objI3 == aVar2.a()) {
                f fVar = new f(f2Var2, h80Var, n3VarH, n3VarH2, null);
                f2Var = f2Var2;
                n3Var = n3VarH;
                n3Var2 = n3VarH2;
                c0VarR.Y(fVar);
                objI3 = fVar;
            } else {
                n3Var = n3VarH;
                n3Var2 = n3VarH2;
                f2Var = f2Var2;
            }
            androidx.compose.runtime.b2.h(numValueOf, numValueOf2, (Function2) objI3, c0VarR, 0);
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(a0Var, 0.0f, 0.0f, 0.0f, f32759m, 7, null);
            a0Var2 = a0Var;
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), aVar3.w(), c0VarR, 48);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar4.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            d0.a3 a3Var = d0.a3.f267591a;
            u50Var2 = u50Var;
            h80Var2 = h80Var;
            androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{q50.I().f(androidx.compose.ui.text.y3.m(la0.e(a3Var.F(), c0VarR, 6), u50Var.u(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, androidx.compose.ui.text.style.j.f42206b.a(), 0, 0L, null, null, null, 0, 0, null, 16744446, null)), androidx.compose.ui.platform.q1.u().f(androidx.compose.ui.unit.w.Ltr)}, androidx.compose.runtime.internal.w.e(1306700887, true, new g(n3Var, h80Var2, f2Var, u50Var2, n3Var2), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
            if (h80Var2.g()) {
                c0VarR.E(-1381607893);
                c0VarR.A();
            } else {
                c0VarR.E(-1381942321);
                androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarV2 = androidx.compose.foundation.layout.d5.v(aVar5, f32765s, 0.0f, 0.0f, 0.0f, 14, null);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
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
                Y0(androidx.compose.foundation.layout.i6.y(aVar5, a3Var.i(), a3Var.g()), h80Var2, u50Var2, c0VarR, ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | 6 | ((i12 << 3) & 896));
                c0VarR.o();
                c0VarR.A();
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            a0Var2 = a0Var;
            u50Var2 = u50Var;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.k70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s70.F0(a0Var2, u50Var2, h80Var2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.y0 y0(h80 h80Var) {
        int i10 = 0 << 6;
        return new androidx.compose.ui.text.input.y0(c4.c(L1(h80Var), 2, 0, false, null, 14, null), 0L, (androidx.compose.ui.text.w3) null, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.n3 z0(h80 h80Var) {
        return androidx.compose.runtime.d7.g(y0(h80Var), null, 2, null);
    }
}
