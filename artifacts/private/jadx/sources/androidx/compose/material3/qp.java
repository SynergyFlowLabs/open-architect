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
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 12 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 13 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1129:1\n1282#2,6:1130\n1282#2,6:1138\n1282#2,6:1182\n1282#2,6:1188\n1282#2,6:1198\n1282#2,6:1206\n1282#2,6:1245\n1282#2,6:1256\n1282#2,6:1262\n1282#2,6:1268\n1282#2,6:1510\n75#3:1136\n75#3:1137\n75#3:1177\n75#3:1204\n75#3:1205\n75#3:1251\n70#4,6:1144\n77#4:1197\n70#4,6:1212\n77#4:1277\n70#4:1305\n67#4,9:1306\n77#4:1345\n70#4:1346\n67#4,9:1347\n77#4:1386\n70#4:1419\n67#4,9:1420\n77#4:1459\n70#4:1460\n67#4,9:1461\n77#4:1500\n79#5,6:1150\n86#5,3:1165\n89#5,2:1174\n93#5:1196\n79#5,6:1218\n86#5,3:1233\n89#5,2:1242\n93#5:1276\n79#5,6:1278\n86#5,3:1293\n89#5,2:1302\n79#5,6:1315\n86#5,3:1330\n89#5,2:1339\n93#5:1344\n79#5,6:1356\n86#5,3:1371\n89#5,2:1380\n93#5:1385\n93#5:1389\n79#5,6:1392\n86#5,3:1407\n89#5,2:1416\n79#5,6:1429\n86#5,3:1444\n89#5,2:1453\n93#5:1458\n79#5,6:1470\n86#5,3:1485\n89#5,2:1494\n93#5:1499\n93#5:1503\n347#6,9:1156\n356#6:1176\n357#6,2:1194\n347#6,9:1224\n356#6:1244\n357#6,2:1274\n347#6,9:1284\n356#6:1304\n347#6,9:1321\n356#6,3:1341\n347#6,9:1362\n356#6,3:1382\n357#6,2:1387\n347#6,9:1398\n356#6:1418\n347#6,9:1435\n356#6,3:1455\n347#6,9:1476\n356#6,3:1496\n357#6,2:1501\n4206#7,6:1168\n4206#7,6:1236\n4206#7,6:1296\n4206#7,6:1333\n4206#7,6:1374\n4206#7,6:1410\n4206#7,6:1447\n4206#7,6:1488\n30#8:1178\n30#8:1252\n53#9,3:1179\n53#9,3:1253\n85#9:1520\n85#9:1525\n113#10:1390\n113#10:1391\n113#10:1528\n49#11:1504\n49#11:1505\n68#11:1506\n68#11:1507\n49#11:1508\n49#11:1509\n78#12:1516\n111#12,2:1517\n78#12:1521\n111#12,2:1522\n54#13:1519\n54#13:1524\n85#14:1526\n85#14:1527\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n*L\n258#1:1130,6\n274#1:1138,6\n293#1:1182,6\n305#1:1188,6\n350#1:1198,6\n366#1:1206,6\n379#1:1245,6\n414#1:1256,6\n423#1:1262,6\n426#1:1268,6\n1118#1:1510,6\n271#1:1136\n272#1:1137\n285#1:1177\n363#1:1204\n364#1:1205\n406#1:1251\n260#1:1144,6\n260#1:1197\n352#1:1212,6\n352#1:1277\n464#1:1305\n464#1:1306,9\n464#1:1345\n467#1:1346\n467#1:1347,9\n467#1:1386\n519#1:1419\n519#1:1420,9\n519#1:1459\n522#1:1460\n522#1:1461,9\n522#1:1500\n260#1:1150,6\n260#1:1165,3\n260#1:1174,2\n260#1:1196\n352#1:1218,6\n352#1:1233,3\n352#1:1242,2\n352#1:1276\n455#1:1278,6\n455#1:1293,3\n455#1:1302,2\n464#1:1315,6\n464#1:1330,3\n464#1:1339,2\n464#1:1344\n467#1:1356,6\n467#1:1371,3\n467#1:1380,2\n467#1:1385\n455#1:1389\n510#1:1392,6\n510#1:1407,3\n510#1:1416,2\n519#1:1429,6\n519#1:1444,3\n519#1:1453,2\n519#1:1458\n522#1:1470,6\n522#1:1485,3\n522#1:1494,2\n522#1:1499\n510#1:1503\n260#1:1156,9\n260#1:1176\n260#1:1194,2\n352#1:1224,9\n352#1:1244\n352#1:1274,2\n455#1:1284,9\n455#1:1304\n464#1:1321,9\n464#1:1341,3\n467#1:1362,9\n467#1:1382,3\n455#1:1387,2\n510#1:1398,9\n510#1:1418\n519#1:1435,9\n519#1:1455,3\n522#1:1476,9\n522#1:1496,3\n510#1:1501,2\n260#1:1168,6\n352#1:1236,6\n455#1:1296,6\n464#1:1333,6\n467#1:1374,6\n510#1:1410,6\n519#1:1447,6\n522#1:1488,6\n287#1:1178\n408#1:1252\n287#1:1179,3\n408#1:1253,3\n274#1:1520\n366#1:1525\n546#1:1390\n547#1:1391\n1128#1:1528\n916#1:1504\n925#1:1505\n1001#1:1506\n1042#1:1507\n1042#1:1508\n1047#1:1509\n258#1:1516\n258#1:1517,2\n350#1:1521\n350#1:1522,2\n274#1:1519\n366#1:1524\n373#1:1526\n379#1:1527\n*E\n"})
public final class qp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f32280a = "indicatorRipple";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f32281b = "indicator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f32282c = "icon";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f32283d = "label";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f32284e = androidx.compose.ui.unit.h.r(12);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vo f32286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f32287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f32288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.text.y3> f32289e;

        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, vo voVar, boolean z11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.n7<androidx.compose.ui.text.y3> n7Var) {
            this.f32285a = z10;
            this.f32286b = voVar;
            this.f32287c = z11;
            this.f32288d = function2;
            this.f32289e = n7Var;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(22475789, i10, -1, "androidx.compose.material3.AnimatedNavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:387)");
            }
            qp.S(this.f32285a, qp.B(this.f32289e), this.f32286b, this.f32287c, this.f32288d, c0Var, 0);
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
        final /* synthetic */ long f32290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f32291b;

        /* JADX WARN: Multi-variable type inference failed */
        b(long j10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f32290a = j10;
            this.f32291b = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(851124593, i10, -1, "androidx.compose.material3.AnimatedNavigationItem.<anonymous> (NavigationItem.kt:346)");
            }
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(this.f32290a)), this.f32291b, c0Var, androidx.compose.runtime.n4.f36267i);
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
        final /* synthetic */ long f32292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f32293b;

        /* JADX WARN: Multi-variable type inference failed */
        c(long j10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f32292a = j10;
            this.f32293b = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1119868672, i10, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:248)");
            }
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(this.f32292a)), this.f32293b, c0Var, androidx.compose.runtime.n4.f36267i);
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

    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f32295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vo f32296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f32297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f32298e;

        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, androidx.compose.ui.text.y3 y3Var, vo voVar, boolean z11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f32294a = z10;
            this.f32295b = y3Var;
            this.f32296c = voVar;
            this.f32297d = z11;
            this.f32298e = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1062206119, i10, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:254)");
            }
            qp.S(this.f32294a, this.f32295b, this.f32296c, this.f32297d, this.f32298e, c0Var, 0);
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
    public static final androidx.compose.ui.text.y3 A(boolean z10, androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.text.y3 y3Var2, androidx.compose.runtime.n7 n7Var) {
        return (!z10 || z(n7Var) >= 0.5f) ? y3Var2 : y3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.y3 B(androidx.compose.runtime.n7<androidx.compose.ui.text.y3> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float C(androidx.compose.runtime.n7 n7Var) {
        return kotlin.ranges.r.t(((Number) n7Var.getValue()).floatValue(), 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float D(androidx.compose.runtime.n7 n7Var) {
        return kotlin.ranges.r.t(z(n7Var), 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(boolean z10, Function0 function0, Function2 function2, androidx.compose.ui.graphics.q3 q3Var, float f10, androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.text.y3 y3Var2, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, vo voVar, androidx.compose.ui.a0 a0Var, boolean z11, Function2 function3, int i10, androidx.compose.foundation.interaction.j jVar, int i11, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        t(z10, function0, function2, q3Var, f10, y3Var, y3Var2, f11, f12, f13, f14, f15, f16, f17, f18, voVar, a0Var, z11, function3, i10, jVar, c0Var, androidx.compose.runtime.t4.a(i11 | 1), androidx.compose.runtime.t4.a(i12), androidx.compose.runtime.t4.a(i13));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void F(final long j10, final androidx.compose.ui.graphics.q3 q3Var, final Function0<Float> function0, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-273382589);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(q3Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function0) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-273382589, i11, -1, "androidx.compose.material3.Indicator (NavigationItem.kt:1114)");
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, f32281b);
            boolean z10 = (i11 & 896) == 256;
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.jp
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qp.I(function0, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.c(androidx.compose.ui.graphics.q1.a(a0VarB, (Function1) objI0), j10, q3Var), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.kp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qp.J(j10, q3Var, function0, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void G(final androidx.compose.foundation.interaction.h hVar, final androidx.compose.ui.graphics.q3 q3Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-629069867);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(q3Var) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-629069867, i11, -1, "androidx.compose.material3.IndicatorRipple (NavigationItem.kt:1101)");
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.w2.d(androidx.compose.ui.draw.j.a(androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, f32280a), q3Var), hVar, gt.e(false, 0.0f, 0L, 7, null)), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.np
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qp.H(hVar, q3Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(androidx.compose.foundation.interaction.h hVar, androidx.compose.ui.graphics.q3 q3Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        G(hVar, q3Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(Function0 function0, androidx.compose.ui.graphics.r1 r1Var) {
        r1Var.setAlpha(((Number) function0.invoke()).floatValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(long j10, androidx.compose.ui.graphics.q3 q3Var, Function0 function0, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        F(j10, q3Var, function0, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void K(boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final androidx.compose.ui.text.y3 y3Var, @NotNull final androidx.compose.ui.graphics.q3 q3Var, final float f10, final float f11, final float f12, final float f13, final float f14, final float f15, @NotNull final vo voVar, @NotNull final androidx.compose.ui.a0 a0Var, final boolean z11, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final int i10, @NotNull androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i14;
        androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.internal.c cVar;
        androidx.compose.foundation.interaction.h hVar;
        final boolean z12 = z10;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2075155418);
        if ((i11 & 6) == 0) {
            i13 = (c0VarR.G(z12) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0VarR.D(y3Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            q3Var2 = q3Var;
            i13 |= c0VarR.D(q3Var2) ? 16384 : 8192;
        } else {
            q3Var2 = q3Var;
        }
        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i13 |= c0VarR.I(f10) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c0VarR.I(f11) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c0VarR.I(f12) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= c0VarR.I(f13) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= c0VarR.I(f14) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c0VarR.I(f15) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c0VarR.D(voVar) ? 32 : 16;
        }
        if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
            i14 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= c0VarR.G(z11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= c0VarR.k0(function3) ? 16384 : 8192;
        }
        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i14 |= c0VarR.K(i10) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i14 |= c0VarR.D(jVar) ? 1048576 : 524288;
        }
        int i15 = i14;
        if (c0VarR.h(((i13 & 306783379) == 306783378 && (599187 & i15) == 599186) ? false : true, i13 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2075155418, i13, i15, "androidx.compose.material3.NavigationItem (NavigationItem.kt:245)");
            }
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(1119868672, true, new c(voVar.j(z12, z11), function2), c0VarR, 54);
            if (function3 == null) {
                c0VarR.E(-803302356);
                c0VarR.A();
                cVar = null;
            } else {
                c0VarR.E(-803266737);
                androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(1062206119, true, new d(z12, y3Var, voVar, z11, function3), c0VarR, 54);
                c0VarR.A();
                cVar = cVarE2;
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.e6.b(0);
                c0VarR.Y(objI0);
            }
            final androidx.compose.runtime.l3 l3Var = (androidx.compose.runtime.l3) objI0;
            z12 = z10;
            jVar2 = jVar;
            androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.a(androidx.compose.foundation.selection.c.a(a0Var, z12, jVar2, null, z11, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), ((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O(), ((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O());
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.xo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qp.Q(l3Var, (androidx.compose.ui.unit.u) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.layout.y1.a(a0VarA, (Function1) objI1);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA2);
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
            final androidx.compose.runtime.n7<Float> n7VarA0 = a0(z12, c0VarR, i13 & 14);
            if (wo.f(i10, wo.f34270b.b())) {
                c0VarR.E(484755993);
                androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                long jG = n0.g.g((((long) Float.floatToRawIntBits(dVar.S7(f32284e))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits((N(l3Var) - dVar.g6(f10)) / 2)) << 32));
                Unit unit = Unit.f312394a;
                boolean zL = ((i15 & 3670016) == 1048576) | c0VarR.L(jG);
                Object objI2 = c0VarR.i0();
                if (zL || objI2 == aVar.a()) {
                    objI2 = new androidx.compose.material3.internal.z2(jVar2, jG, null);
                    c0VarR.Y(objI2);
                }
                hVar = (androidx.compose.material3.internal.z2) objI2;
                c0VarR.A();
            } else {
                c0VarR.E(485471938);
                c0VarR.A();
                hVar = null;
            }
            if (hVar == null) {
                hVar = jVar2;
            }
            long jF = voVar.f();
            boolean zD = c0VarR.D(n7VarA0);
            Object objI3 = c0VarR.i0();
            if (zD || objI3 == aVar.a()) {
                objI3 = new Function0() { // from class: androidx.compose.material3.hp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(qp.R(n7VarA0));
                    }
                };
                c0VarR.Y(objI3);
            }
            int i16 = i13 << 3;
            c0Var2 = c0VarR;
            L(hVar, jF, q3Var2, cVarE, i10, cVar, (Function0) objI3, f11, f12, f13, f14, f15, c0Var2, ((i13 >> 6) & 896) | 3072 | ((i15 >> 3) & 57344) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), ((i13 >> 27) & 14) | ((i15 << 3) & com.planner5d.library.engine.input.f.b.B));
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            jVar2 = jVar;
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final androidx.compose.foundation.interaction.j jVar3 = jVar2;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ip
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qp.O(z12, function0, function2, y3Var, q3Var, f10, f11, f12, f13, f14, f15, voVar, a0Var, z11, function3, i10, jVar3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    private static final void L(final androidx.compose.foundation.interaction.h hVar, final long j10, final androidx.compose.ui.graphics.q3 q3Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final int i10, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function0<Float> function0, final float f10, final float f11, final float f12, final float f13, final float f14, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        Function0<Float> function1;
        int i14;
        Object ga0Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1473868071);
        if ((i11 & 6) == 0) {
            i13 = (c0VarR.D(hVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0VarR.L(j10) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= c0VarR.D(q3Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c0VarR.K(i10) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= c0VarR.k0(function3) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            function1 = function0;
            i13 |= c0VarR.k0(function1) ? 1048576 : 524288;
        } else {
            function1 = function0;
        }
        if ((12582912 & i11) == 0) {
            i13 |= c0VarR.I(f10) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= c0VarR.I(f11) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= c0VarR.I(f12) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c0VarR.I(f13) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c0VarR.I(f14) ? 32 : 16;
        }
        int i15 = i14;
        if (c0VarR.h(((i13 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i13 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1473868071, i13, i15, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:453)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarJ = j2.j(aVar);
            if (function3 == null || wo.f(i10, wo.f34270b.b())) {
                ga0Var = new ga0(function3 != null, function0, f10, f11, f12, f14, null);
            } else {
                ga0Var = new q10(function1, f10, f11, f13, null);
            }
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
            androidx.compose.runtime.y7.n(c0VarD, ga0Var, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            int i16 = i13 >> 3;
            G(hVar, q3Var, c0VarR, (i13 & 14) | (i16 & com.planner5d.library.engine.input.f.b.B));
            int i17 = i13;
            F(j10, q3Var, function0, c0VarR, (i16 & okhttp3.internal.ws.g.f334652s) | ((i13 >> 12) & 896));
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar, f32282c);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB);
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
            function2.invoke(c0VarR, Integer.valueOf((i17 >> 9) & 14));
            c0VarR.o();
            if (function3 != null) {
                c0VarR.E(-2087200706);
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.layout.i0.b(aVar, "label");
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB2);
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
                function3.invoke(c0VarR, Integer.valueOf((i17 >> 15) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(-2087119982);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.op
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qp.M(hVar, j10, q3Var, function2, i10, function3, function0, f10, f11, f12, f13, f14, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(androidx.compose.foundation.interaction.h hVar, long j10, androidx.compose.ui.graphics.q3 q3Var, Function2 function2, int i10, Function2 function3, Function0 function0, float f10, float f11, float f12, float f13, float f14, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        L(hVar, j10, q3Var, function2, i10, function3, function0, f10, f11, f12, f13, f14, c0Var, androidx.compose.runtime.t4.a(i11 | 1), androidx.compose.runtime.t4.a(i12));
        return Unit.f312394a;
    }

    private static final int N(androidx.compose.runtime.l3 l3Var) {
        return l3Var.m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(boolean z10, Function0 function0, Function2 function2, androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, float f12, float f13, float f14, float f15, vo voVar, androidx.compose.ui.a0 a0Var, boolean z11, Function2 function3, int i10, androidx.compose.foundation.interaction.j jVar, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        K(z10, function0, function2, y3Var, q3Var, f10, f11, f12, f13, f14, f15, voVar, a0Var, z11, function3, i10, jVar, c0Var, androidx.compose.runtime.t4.a(i11 | 1), androidx.compose.runtime.t4.a(i12));
        return Unit.f312394a;
    }

    private static final void P(androidx.compose.runtime.l3 l3Var, int i10) {
        l3Var.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(androidx.compose.runtime.l3 l3Var, androidx.compose.ui.unit.u uVar) {
        P(l3Var, (int) (uVar.q() >> 32));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float R(androidx.compose.runtime.n7 n7Var) {
        return kotlin.ranges.r.t(((Number) n7Var.getValue()).floatValue(), 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void S(final boolean z10, androidx.compose.ui.text.y3 y3Var, final vo voVar, final boolean z11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.ui.text.y3 y3Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2136267443);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(y3Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(voVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.G(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(function2) ? 16384 : 8192;
        }
        if (c0VarR.h((i11 & 9363) != 9362, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2136267443, i11, -1, "androidx.compose.material3.StyledLabel (NavigationItem.kt:1083)");
            }
            y3Var2 = y3Var;
            androidx.compose.material3.internal.k3.b(voVar.k(z10, z11), y3Var2, function2, c0VarR, (i11 & com.planner5d.library.engine.input.f.b.B) | ((i11 >> 6) & 896));
            function3 = function2;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            y3Var2 = y3Var;
            function3 = function2;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.text.y3 y3Var3 = y3Var2;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.gp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qp.T(z10, y3Var3, voVar, z11, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(boolean z10, androidx.compose.ui.text.y3 y3Var, vo voVar, boolean z11, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        S(z10, y3Var, voVar, z11, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final /* synthetic */ androidx.compose.ui.layout.b1 Y(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, androidx.compose.ui.layout.i2 i2Var4, long j10, float f10) {
        return g0(c1Var, i2Var, i2Var2, i2Var3, i2Var4, j10, f10);
    }

    @androidx.compose.runtime.o
    private static final androidx.compose.runtime.n7<Float> a0(boolean z10, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1105658511, i10, -1, "androidx.compose.material3.animateIndicatorProgressAsState (NavigationItem.kt:1094)");
        }
        androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(z10 ? 1.0f : 0.0f, hm.b(d0.h1.DefaultSpatial, c0Var, 6), 0.0f, null, null, c0Var, 0, 28);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 b0(androidx.compose.ui.layout.c1 c1Var, int i10, Function0<Float> function0, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, final androidx.compose.ui.layout.i2 i2Var3, final androidx.compose.ui.layout.i2 i2Var4, int i11, long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        final float fFloatValue = function0.invoke().floatValue();
        boolean zF = wo.f(i10, wo.f34270b.b());
        float f17 = 2;
        float f18 = f16 * f17;
        int i12 = androidx.compose.ui.unit.c.i(j10, Math.max(i2Var.h1(), i11 + c1Var.g6(androidx.compose.ui.unit.h.r(f18))));
        float fI = i12 + ((androidx.compose.ui.unit.c.i(j10, i2Var3.h1() + c1Var.g6(f16)) - i12) * fFloatValue);
        int iS = androidx.compose.ui.util.e.s(androidx.compose.ui.unit.c.h(j10, kotlin.math.b.L0(i2Var3.c1() + c1Var.S7(f10) + i2Var.c1())), androidx.compose.ui.unit.c.h(j10, i2Var3.c1()), fFloatValue);
        final int iG6 = c1Var.g6(f16);
        int iS2 = (fFloatValue == 0.0f || fFloatValue == 1.0f) ? androidx.compose.ui.util.e.s(kotlin.math.b.L0((fI - i2Var4.h1()) / f17), kotlin.math.b.L0(((iG6 + fI) - i2Var4.h1()) / f17), fFloatValue) : c1Var.g6(f16);
        int iG7 = c1Var.g6(f12) + iG6;
        int iG8 = c1Var.g6(f13) + iG6;
        int iG9 = c1Var.g6(f11);
        int iG10 = c1Var.g6(f14);
        final int iS3 = androidx.compose.ui.util.e.s(iG7, iG8, fFloatValue);
        final int iS4 = androidx.compose.ui.util.e.s(iG9, iG10, fFloatValue);
        int iH1 = ((i2Var2.h1() + c1Var.g6(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(f12 * f17) + androidx.compose.ui.unit.h.r(f18)))) - i2Var.h1()) / 2;
        int iC1 = i2Var2.c1() + iS4 + c1Var.g6(androidx.compose.ui.unit.h.r(f10 + f10));
        float fH1 = ((i2Var2.h1() + iS3) + c1Var.g6(f15)) - ((!zF || fFloatValue <= 0.0f) ? c1Var.g6(f16) * (1.0f - fFloatValue) : 0.0f);
        int iC2 = (iS - i2Var.c1()) / 2;
        final Object objValueOf = fFloatValue < 0.5f ? Integer.valueOf(iH1) : Float.valueOf(fH1 * fFloatValue);
        final int i13 = fFloatValue < 0.5f ? iC1 : iC2;
        final int i14 = iS2;
        return androidx.compose.ui.layout.c1.h6(c1Var, kotlin.math.b.L0(fI), iS, null, new Function1() { // from class: androidx.compose.material3.pp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qp.c0(i2Var4, i14, i2Var2, iS3, iS4, i2Var, objValueOf, i13, i2Var3, iG6, fFloatValue, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2 i2Var2, int i11, int i12, androidx.compose.ui.layout.i2 i2Var3, Object obj, int i13, androidx.compose.ui.layout.i2 i2Var4, int i14, final float f10, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.p0(aVar, i2Var, i10, 0, 0.0f, null, 12, null);
        androidx.compose.ui.layout.i2.a.p0(aVar, i2Var2, i11, i12, 0.0f, null, 12, null);
        androidx.compose.ui.layout.i2.a.p0(aVar, i2Var3, ((Number) obj).intValue(), i13, 0.0f, new Function1() { // from class: androidx.compose.material3.mp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return qp.d0(f10, (androidx.compose.ui.graphics.r1) obj2);
            }
        }, 4, null);
        androidx.compose.ui.layout.i2.a.p0(aVar, i2Var4, i14, 0, 0.0f, null, 12, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(float f10, androidx.compose.ui.graphics.r1 r1Var) {
        float f11 = f10 - 0.5f;
        r1Var.setAlpha(4 * f11 * f11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 e0(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, final androidx.compose.ui.layout.i2 i2Var3, long j10) {
        int i10 = androidx.compose.ui.unit.c.i(j10, i2Var2.h1());
        int iH = androidx.compose.ui.unit.c.h(j10, i2Var2.c1());
        final int iH1 = (i10 - i2Var3.h1()) / 2;
        final int iC1 = (iH - i2Var3.c1()) / 2;
        final int iH2 = (i10 - i2Var.h1()) / 2;
        final int iC2 = (iH - i2Var.c1()) / 2;
        final int iH3 = (i10 - i2Var2.h1()) / 2;
        final int iC3 = (iH - i2Var2.c1()) / 2;
        return androidx.compose.ui.layout.c1.h6(c1Var, i10, iH, null, new Function1() { // from class: androidx.compose.material3.yo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qp.f0(i2Var3, iH1, iC1, i2Var, iH2, iC2, i2Var2, iH3, iC3, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(androidx.compose.ui.layout.i2 i2Var, int i10, int i11, androidx.compose.ui.layout.i2 i2Var2, int i12, int i13, androidx.compose.ui.layout.i2 i2Var3, int i14, int i15, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, i10, i11, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i12, i13, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, i14, i15, 0.0f, 4, null);
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.layout.b1 g0(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, final androidx.compose.ui.layout.i2 i2Var3, final androidx.compose.ui.layout.i2 i2Var4, long j10, float f10) {
        int i10 = androidx.compose.ui.unit.c.i(j10, i2Var3.h1());
        int iH = androidx.compose.ui.unit.c.h(j10, i2Var3.c1());
        final int iH1 = (i10 - i2Var4.h1()) / 2;
        final int iC1 = (iH - i2Var4.c1()) / 2;
        final int iC2 = (iH - i2Var2.c1()) / 2;
        final int iC3 = (iH - i2Var.c1()) / 2;
        final int iH2 = (i10 - ((i2Var2.h1() + c1Var.g6(f10)) + i2Var.h1())) / 2;
        final int iH3 = i2Var2.h1() + iH2 + c1Var.g6(f10);
        final int iH4 = (i10 - i2Var3.h1()) / 2;
        final int iC4 = (iH - i2Var3.c1()) / 2;
        return androidx.compose.ui.layout.c1.h6(c1Var, i10, iH, null, new Function1() { // from class: androidx.compose.material3.fp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qp.h0(i2Var4, iH1, iC1, i2Var, iH3, iC3, i2Var2, iH2, iC2, i2Var3, iH4, iC4, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(androidx.compose.ui.layout.i2 i2Var, int i10, int i11, androidx.compose.ui.layout.i2 i2Var2, int i12, int i13, androidx.compose.ui.layout.i2 i2Var3, int i14, int i15, androidx.compose.ui.layout.i2 i2Var4, int i16, int i17, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, i10, i11, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i12, i13, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, i14, i15, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var4, i16, i17, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 i0(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, final androidx.compose.ui.layout.i2 i2Var3, final androidx.compose.ui.layout.i2 i2Var4, long j10, float f10, float f11, float f12) {
        int i10 = androidx.compose.ui.unit.c.i(j10, Math.max(i2Var.h1(), i2Var3.h1()));
        int iH = androidx.compose.ui.unit.c.h(j10, kotlin.math.b.L0(i2Var3.c1() + c1Var.S7(f10) + i2Var.c1() + (c1Var.S7(f12) * 2)));
        final int iG6 = c1Var.g6(androidx.compose.ui.unit.h.r(f12 + f11));
        final int iH1 = (i10 - i2Var2.h1()) / 2;
        final int iH2 = (i10 - i2Var4.h1()) / 2;
        final int iG7 = iG6 - c1Var.g6(f11);
        final int iH3 = (i10 - i2Var.h1()) / 2;
        final int iC1 = iG6 + i2Var2.c1() + c1Var.g6(androidx.compose.ui.unit.h.r(f10 + f11));
        final int iH4 = (i10 - i2Var3.h1()) / 2;
        return androidx.compose.ui.layout.c1.h6(c1Var, i10, iH, null, new Function1() { // from class: androidx.compose.material3.zo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qp.j0(i2Var4, iH2, iG7, i2Var, iH3, iC1, i2Var2, iH1, iG6, i2Var3, iH4, iG7, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(androidx.compose.ui.layout.i2 i2Var, int i10, int i11, androidx.compose.ui.layout.i2 i2Var2, int i12, int i13, androidx.compose.ui.layout.i2 i2Var3, int i14, int i15, androidx.compose.ui.layout.i2 i2Var4, int i16, int i17, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, i10, i11, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i12, i13, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, i14, i15, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var4, i16, i17, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0211  */
    /* JADX WARN: Code duplicated, block: B:166:0x0217  */
    /* JADX WARN: Code duplicated, block: B:169:0x023e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0291  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:178:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:184:0x0301  */
    /* JADX WARN: Code duplicated, block: B:187:0x032a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0330  */
    /* JADX WARN: Code duplicated, block: B:192:0x0358  */
    /* JADX WARN: Code duplicated, block: B:195:0x036a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0392  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:200:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:205:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:207:0x0409  */
    /* JADX WARN: Code duplicated, block: B:209:0x0415  */
    /* JADX WARN: Code duplicated, block: B:210:0x0418  */
    /* JADX WARN: Code duplicated, block: B:215:0x042d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0447  */
    /* JADX WARN: Code duplicated, block: B:223:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:224:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:227:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void t(final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final androidx.compose.ui.graphics.q3 q3Var, final float f10, @NotNull final androidx.compose.ui.text.y3 y3Var, @NotNull final androidx.compose.ui.text.y3 y3Var2, final float f11, final float f12, final float f13, final float f14, final float f15, final float f16, final float f17, final float f18, @NotNull final vo voVar, @NotNull final androidx.compose.ui.a0 a0Var, final boolean z11, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final int i10, @NotNull androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        boolean z12;
        androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.s5 s5VarT;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final androidx.compose.runtime.l3 l3Var;
        Object objI1;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        final boolean zF;
        androidx.compose.runtime.n7<Float> n7VarA0;
        float f19;
        final androidx.compose.runtime.n7<Float> n7VarF;
        Object objI2;
        androidx.compose.runtime.n7 n7Var;
        final androidx.compose.runtime.n7<Float> n7Var2;
        androidx.compose.runtime.c0 c0Var3;
        boolean z13;
        boolean z14;
        androidx.compose.runtime.internal.c cVar;
        androidx.compose.material3.internal.z2 z2Var;
        androidx.compose.foundation.interaction.h hVar;
        boolean zD;
        Object objI3;
        boolean zD2;
        Object objI4;
        long jG;
        boolean zL;
        Object objI5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1114086313);
        if ((i11 & 6) == 0) {
            i14 = (c0VarR.G(z10) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i14 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= c0VarR.D(q3Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= c0VarR.I(f10) ? 16384 : 8192;
        }
        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i14 |= c0VarR.D(y3Var) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= c0VarR.D(y3Var2) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= c0VarR.I(f11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= c0VarR.I(f12) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= c0VarR.I(f13) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (c0VarR.I(f14) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= c0VarR.I(f15) ? 32 : 16;
        }
        if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
            i15 |= c0VarR.I(f16) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i15 |= c0VarR.I(f17) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i15 |= c0VarR.I(f18) ? 16384 : 8192;
        }
        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i15 |= c0VarR.D(voVar) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= c0VarR.D(a0Var) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i15 |= c0VarR.G(z11) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i15 |= c0VarR.k0(function3) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i12 & 805306368) == 0) {
            i15 |= c0VarR.K(i10) ? 536870912 : 268435456;
        }
        int i17 = i15;
        if ((i13 & 6) == 0) {
            i16 = i13 | (c0VarR.D(jVar) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i14 & 306783379) == 306783378 && (306783379 & i17) == 306783378) {
            if ((i16 & 3) == 2) {
                z12 = false;
            }
            if (c0VarR.h(z12, i14 & 1)) {
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1114086313, i14, i17, "androidx.compose.material3.AnimatedNavigationItem (NavigationItem.kt:343)");
                }
                androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(851124593, true, new b(voVar.j(z10, z11), function2), c0VarR, 54);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.e6.b(0);
                    c0VarR.Y(objI0);
                }
                l3Var = (androidx.compose.runtime.l3) objI0;
                int i18 = i14;
                jVar2 = jVar;
                androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.a(androidx.compose.foundation.selection.c.a(a0Var, z10, jVar, null, z11, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), ((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O(), ((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O());
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.ap
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qp.y(l3Var, (androidx.compose.ui.unit.u) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.layout.y1.a(a0VarA, (Function1) objI1);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA2);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                function0A = aVar2.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                zF = wo.f(i10, wo.f34270b.b());
                n7VarA0 = a0(z10, c0VarR, i18 & 14);
                if (zF) {
                    f19 = 0.0f;
                } else {
                    f19 = 1.0f;
                }
                n7VarF = androidx.compose.animation.core.f.f(f19, hm.b(d0.h1.DefaultSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.bp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return qp.A(zF, y3Var, y3Var2, n7VarF);
                        }
                    });
                    c0VarR.Y(objI2);
                }
                n7Var = (androidx.compose.runtime.n7) objI2;
                if (function3 != null) {
                    c0VarR.E(680212713);
                    c0Var3 = c0VarR;
                    n7Var2 = n7VarA0;
                    z14 = false;
                    z13 = true;
                    androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(22475789, true, new a(z10, voVar, z11, function3, n7Var), c0Var3, 54);
                    c0Var3.A();
                    cVar = cVarE2;
                } else {
                    n7Var2 = n7VarA0;
                    c0Var3 = c0VarR;
                    z13 = true;
                    z14 = false;
                    c0Var3.E(680534989);
                    c0Var3.A();
                    cVar = null;
                }
                if (zF) {
                    c0Var3.E(680694081);
                    androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var3.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((w(l3Var) - dVar.g6(f10)) / 2)) << 32) | (((long) Float.floatToRawIntBits(dVar.S7(f32284e))) & com.rabbitmq.client.k0.f265952a));
                    Unit unit = Unit.f312394a;
                    if ((i16 & 14) == 4) {
                        z14 = z13;
                    }
                    zL = z14 | c0Var3.L(jG);
                    objI5 = c0Var3.i0();
                    if (zL || objI5 == aVar.a()) {
                        objI5 = new androidx.compose.material3.internal.z2(jVar2, jG, null);
                        c0Var3.Y(objI5);
                    }
                    c0Var3.A();
                    z2Var = (androidx.compose.material3.internal.z2) objI5;
                } else {
                    z2Var = null;
                    c0Var3.E(681416753);
                    c0Var3.A();
                }
                if (z2Var != null) {
                    hVar = z2Var;
                } else {
                    hVar = jVar2;
                }
                long jF = voVar.f();
                zD = c0Var3.D(n7Var2);
                objI3 = c0Var3.i0();
                if (zD || objI3 == aVar.a()) {
                    objI3 = new Function0() { // from class: androidx.compose.material3.cp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(qp.C(n7Var2));
                        }
                    };
                    c0Var3.Y(objI3);
                }
                Function0 function1 = (Function0) objI3;
                zD2 = c0Var3.D(n7VarF);
                objI4 = c0Var3.i0();
                if (zD2 || objI4 == aVar.a()) {
                    objI4 = new Function0() { // from class: androidx.compose.material3.dp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(qp.D(n7VarF));
                        }
                    };
                    c0Var3.Y(objI4);
                }
                Function0 function4 = (Function0) objI4;
                int i19 = i18 << 3;
                int i20 = ((i18 >> 3) & 896) | 24576 | ((i17 >> 12) & 458752) | (234881024 & i19) | (i19 & 1879048192);
                int i21 = i17 << 3;
                int i22 = ((i18 >> 27) & 14) | (i21 & com.planner5d.library.engine.input.f.b.B) | (i21 & 896) | (i21 & 7168) | (57344 & i21) | (i21 & 458752);
                androidx.compose.runtime.c0 c0Var4 = c0Var3;
                u(hVar, jF, q3Var, function1, cVarE, i10, function4, cVar, f11, f12, f13, f14, f15, f16, f17, f18, c0Var4, i20, i22);
                c0Var2 = c0Var4;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                jVar2 = jVar;
                c0Var2 = c0VarR;
                c0Var2.u();
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final androidx.compose.foundation.interaction.j jVar3 = jVar2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ep
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qp.E(z10, function0, function2, q3Var, f10, y3Var, y3Var2, f11, f12, f13, f14, f15, f16, f17, f18, voVar, a0Var, z11, function3, i10, jVar3, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        z12 = true;
        if (c0VarR.h(z12, i14 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1114086313, i14, i17, "androidx.compose.material3.AnimatedNavigationItem (NavigationItem.kt:343)");
            }
            androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(851124593, true, new b(voVar.j(z10, z11), function2), c0VarR, 54);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.e6.b(0);
                c0VarR.Y(objI0);
            }
            l3Var = (androidx.compose.runtime.l3) objI0;
            int i110 = i14;
            jVar2 = jVar;
            androidx.compose.ui.a0 a0VarA3 = androidx.compose.foundation.layout.i6.a(androidx.compose.foundation.selection.c.a(a0Var, z10, jVar, null, z11, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), ((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O(), ((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O());
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.ap
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qp.y(l3Var, (androidx.compose.ui.unit.u) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarA4 = androidx.compose.ui.layout.y1.a(a0VarA3, (Function1) objI1);
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarA4);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar3.e());
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
            androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
            zF = wo.f(i10, wo.f34270b.b());
            n7VarA0 = a0(z10, c0VarR, i110 & 14);
            if (zF) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            n7VarF = androidx.compose.animation.core.f.f(f19, hm.b(d0.h1.DefaultSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
            objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.bp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qp.A(zF, y3Var, y3Var2, n7VarF);
                    }
                });
                c0VarR.Y(objI2);
            }
            n7Var = (androidx.compose.runtime.n7) objI2;
            if (function3 != null) {
                c0VarR.E(680212713);
                c0Var3 = c0VarR;
                n7Var2 = n7VarA0;
                z14 = false;
                z13 = true;
                androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(22475789, true, new a(z10, voVar, z11, function3, n7Var), c0Var3, 54);
                c0Var3.A();
                cVar = cVarE4;
            } else {
                n7Var2 = n7VarA0;
                c0Var3 = c0VarR;
                z13 = true;
                z14 = false;
                c0Var3.E(680534989);
                c0Var3.A();
                cVar = null;
            }
            if (zF) {
                c0Var3.E(680694081);
                androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0Var3.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((w(l3Var) - dVar2.g6(f10)) / 2)) << 32) | (((long) Float.floatToRawIntBits(dVar2.S7(f32284e))) & com.rabbitmq.client.k0.f265952a));
                Unit unit2 = Unit.f312394a;
                if ((i16 & 14) == 4) {
                    z14 = z13;
                }
                zL = z14 | c0Var3.L(jG);
                objI5 = c0Var3.i0();
                if (zL) {
                    objI5 = new androidx.compose.material3.internal.z2(jVar2, jG, null);
                    c0Var3.Y(objI5);
                } else {
                    objI5 = new androidx.compose.material3.internal.z2(jVar2, jG, null);
                    c0Var3.Y(objI5);
                }
                c0Var3.A();
                z2Var = (androidx.compose.material3.internal.z2) objI5;
            } else {
                z2Var = null;
                c0Var3.E(681416753);
                c0Var3.A();
            }
            if (z2Var != null) {
                hVar = z2Var;
            } else {
                hVar = jVar2;
            }
            long jF2 = voVar.f();
            zD = c0Var3.D(n7Var2);
            objI3 = c0Var3.i0();
            if (zD) {
                objI3 = new Function0() { // from class: androidx.compose.material3.cp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(qp.C(n7Var2));
                    }
                };
                c0Var3.Y(objI3);
            } else {
                objI3 = new Function0() { // from class: androidx.compose.material3.cp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(qp.C(n7Var2));
                    }
                };
                c0Var3.Y(objI3);
            }
            Function0 function5 = (Function0) objI3;
            zD2 = c0Var3.D(n7VarF);
            objI4 = c0Var3.i0();
            if (zD2) {
                objI4 = new Function0() { // from class: androidx.compose.material3.dp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(qp.D(n7VarF));
                    }
                };
                c0Var3.Y(objI4);
            } else {
                objI4 = new Function0() { // from class: androidx.compose.material3.dp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(qp.D(n7VarF));
                    }
                };
                c0Var3.Y(objI4);
            }
            Function0 function6 = (Function0) objI4;
            int i111 = i110 << 3;
            int i23 = ((i110 >> 3) & 896) | 24576 | ((i17 >> 12) & 458752) | (234881024 & i111) | (i111 & 1879048192);
            int i24 = i17 << 3;
            int i25 = ((i110 >> 27) & 14) | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (i24 & 458752);
            androidx.compose.runtime.c0 c0Var5 = c0Var3;
            u(hVar, jF2, q3Var, function5, cVarE3, i10, function6, cVar, f11, f12, f13, f14, f15, f16, f17, f18, c0Var5, i23, i25);
            c0Var2 = c0Var5;
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            jVar2 = jVar;
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final androidx.compose.foundation.interaction.j jVar4 = jVar2;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ep
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qp.E(z10, function0, function2, q3Var, f10, y3Var, y3Var2, f11, f12, f13, f14, f15, f16, f17, f18, voVar, a0Var, z11, function3, i10, jVar4, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    private static final void u(final androidx.compose.foundation.interaction.h hVar, final long j10, final androidx.compose.ui.graphics.q3 q3Var, final Function0<Float> function0, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final int i10, final Function0<Float> function1, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final float f10, final float f11, final float f12, final float f13, final float f14, final float f15, final float f16, final float f17, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        Function0<Float> function4;
        int i14;
        Object ga0Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(94433406);
        if ((i11 & 6) == 0) {
            i13 = (c0VarR.D(hVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0VarR.L(j10) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= c0VarR.D(q3Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            function4 = function0;
            i13 |= c0VarR.k0(function4) ? 2048 : 1024;
        } else {
            function4 = function0;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c0VarR.k0(function2) ? 16384 : 8192;
        }
        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i13 |= c0VarR.K(i10) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c0VarR.k0(function1) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c0VarR.k0(function3) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= c0VarR.I(f10) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= c0VarR.I(f11) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c0VarR.I(f12) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c0VarR.I(f13) ? 32 : 16;
        }
        if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
            i14 |= c0VarR.I(f14) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= c0VarR.I(f15) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= c0VarR.I(f16) ? 16384 : 8192;
        }
        if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i14 |= c0VarR.I(f17) ? 131072 : 65536;
        }
        int i15 = i14;
        if (c0VarR.h(((i13 & 306783379) == 306783378 && (74899 & i15) == 74898) ? false : true, i13 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(94433406, i13, i15, "androidx.compose.material3.AnimatedNavigationItemLayout (NavigationItem.kt:508)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarJ = j2.j(aVar);
            if (function3 != null) {
                ga0Var = new s(i10, function1, function4, f10, f11, f12, f13, f14, f16, f17, null);
            } else {
                float f18 = 0;
                ga0Var = new ga0(false, function0, f15, f15, androidx.compose.ui.unit.h.r(f18), androidx.compose.ui.unit.h.r(f18), null);
            }
            Object obj = ga0Var;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
            androidx.compose.runtime.y7.n(c0VarD, obj, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            int i16 = i13 >> 3;
            G(hVar, q3Var, c0VarR, (i13 & 14) | (i16 & com.planner5d.library.engine.input.f.b.B));
            int i17 = i13;
            F(j10, q3Var, function0, c0VarR, i16 & androidx.media3.exoplayer.analytics.b.f62802b0);
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar, f32282c);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB);
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
            function2.invoke(c0VarR, Integer.valueOf((i17 >> 12) & 14));
            c0VarR.o();
            if (function3 != null) {
                c0VarR.E(-987944825);
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.layout.i0.b(aVar, "label");
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB2);
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
                function3.invoke(c0VarR, Integer.valueOf((i17 >> 21) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(-987864101);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return qp.v(hVar, j10, q3Var, function0, function2, i10, function1, function3, f10, f11, f12, f13, f14, f15, f16, f17, i11, i12, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(androidx.compose.foundation.interaction.h hVar, long j10, androidx.compose.ui.graphics.q3 q3Var, Function0 function0, Function2 function2, int i10, Function0 function1, Function2 function3, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        u(hVar, j10, q3Var, function0, function2, i10, function1, function3, f10, f11, f12, f13, f14, f15, f16, f17, c0Var, androidx.compose.runtime.t4.a(i11 | 1), androidx.compose.runtime.t4.a(i12));
        return Unit.f312394a;
    }

    private static final int w(androidx.compose.runtime.l3 l3Var) {
        return l3Var.m1();
    }

    private static final void x(androidx.compose.runtime.l3 l3Var, int i10) {
        l3Var.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(androidx.compose.runtime.l3 l3Var, androidx.compose.ui.unit.u uVar) {
        x(l3Var, (int) (uVar.q() >> 32));
        return Unit.f312394a;
    }

    private static final float z(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }
}
