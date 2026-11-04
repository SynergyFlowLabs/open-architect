package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
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
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 14 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 15 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 16 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 17 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 18 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 19 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1315:1\n1282#2,6:1316\n1282#2,6:1322\n1282#2,3:1335\n1285#2,3:1339\n1282#2,6:1344\n1282#2,6:1350\n1282#2,6:1356\n1282#2,6:1442\n1282#2,6:1448\n1282#2,6:1454\n1282#2,6:1460\n1282#2,6:1466\n1282#2,6:1506\n1282#2,6:1513\n1282#2,3:1526\n1285#2,3:1530\n1282#2,6:1572\n1282#2,6:1608\n1282#2,6:1788\n1282#2,6:1794\n1282#2,6:1809\n1282#2,3:1822\n1285#2,3:1826\n1282#2,6:1831\n1282#2,6:1837\n1282#2,6:1843\n1282#2,6:1850\n1282#2,6:1856\n1282#2,6:1862\n607#3:1328\n604#3,6:1329\n607#3:1519\n604#3,6:1520\n607#3:1815\n604#3,6:1816\n605#4:1338\n605#4:1529\n605#4:1825\n255#5:1342\n255#5:1533\n255#5:1787\n258#5:1849\n75#6:1343\n75#6:1362\n75#6:1512\n75#6:1534\n75#6:1800\n75#6:1802\n75#6:1829\n75#6:1830\n70#7:1363\n67#7,9:1364\n70#7:1400\n66#7,10:1401\n77#7:1441\n77#7:1505\n70#7:1535\n67#7,9:1536\n70#7:1614\n67#7,9:1615\n77#7:1654\n70#7:1655\n66#7,10:1656\n77#7:1696\n77#7:1703\n70#7:1741\n66#7,10:1742\n77#7:1782\n79#8,6:1373\n86#8,3:1388\n89#8,2:1397\n79#8,6:1411\n86#8,3:1426\n89#8,2:1435\n93#8:1440\n79#8,6:1472\n86#8,3:1487\n89#8,2:1496\n93#8:1501\n93#8:1504\n79#8,6:1545\n86#8,3:1560\n89#8,2:1569\n79#8:1578\n77#8,8:1579\n86#8,3:1596\n89#8,2:1605\n79#8,6:1624\n86#8,3:1639\n89#8,2:1648\n93#8:1653\n79#8,6:1666\n86#8,3:1681\n89#8,2:1690\n93#8:1695\n93#8:1699\n93#8:1702\n79#8,6:1714\n86#8,3:1729\n89#8,2:1738\n79#8,6:1752\n86#8,3:1767\n89#8,2:1776\n93#8:1781\n93#8:1785\n347#9,9:1379\n356#9:1399\n347#9,9:1417\n356#9,3:1437\n347#9,9:1478\n356#9,3:1498\n357#9,2:1502\n347#9,9:1551\n356#9:1571\n347#9,9:1587\n356#9:1607\n347#9,9:1630\n356#9,3:1650\n347#9,9:1672\n356#9,3:1692\n357#9,2:1697\n357#9,2:1700\n347#9,9:1720\n356#9:1740\n347#9,9:1758\n356#9,3:1778\n357#9,2:1783\n4206#10,6:1391\n4206#10,6:1429\n4206#10,6:1490\n4206#10,6:1563\n4206#10,6:1599\n4206#10,6:1642\n4206#10,6:1684\n4206#10,6:1732\n4206#10,6:1770\n99#11:1704\n96#11,9:1705\n106#11:1786\n1#12:1801\n57#13:1803\n61#13:1806\n60#14:1804\n70#14:1807\n80#14:1875\n22#15:1805\n22#15:1808\n85#16:1868\n117#16,2:1869\n85#16:1876\n117#16,2:1877\n81#17:1871\n114#17,2:1872\n32#18:1874\n113#19:1879\n113#19:1880\n113#19:1881\n113#19:1882\n113#19:1883\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n*L\n305#1:1316,6\n307#1:1322,6\n340#1:1335,3\n340#1:1339,3\n343#1:1344,6\n344#1:1350,6\n353#1:1356,6\n374#1:1442,6\n379#1:1448,6\n385#1:1454,6\n397#1:1460,6\n408#1:1466,6\n465#1:1506,6\n472#1:1513,6\n478#1:1526,3\n478#1:1530,3\n509#1:1572,6\n493#1:1608,6\n777#1:1788,6\n795#1:1794,6\n943#1:1809,6\n944#1:1822,3\n944#1:1826,3\n955#1:1831,6\n987#1:1837,6\n1084#1:1843,6\n1289#1:1850,6\n1290#1:1856,6\n1301#1:1862,6\n340#1:1328\n340#1:1329,6\n478#1:1519\n478#1:1520,6\n944#1:1815\n944#1:1816,6\n340#1:1338\n478#1:1529\n944#1:1825\n341#1:1342\n479#1:1533\n773#1:1787\n1286#1:1849\n342#1:1343\n360#1:1362\n466#1:1512\n481#1:1534\n798#1:1800\n801#1:1802\n945#1:1829\n949#1:1830\n361#1:1363\n361#1:1364,9\n371#1:1400\n371#1:1401,10\n371#1:1441\n361#1:1505\n482#1:1535\n482#1:1536,9\n492#1:1614\n492#1:1615,9\n492#1:1654\n507#1:1655\n507#1:1656,10\n507#1:1696\n482#1:1703\n565#1:1741\n565#1:1742,10\n565#1:1782\n361#1:1373,6\n361#1:1388,3\n361#1:1397,2\n371#1:1411,6\n371#1:1426,3\n371#1:1435,2\n371#1:1440\n382#1:1472,6\n382#1:1487,3\n382#1:1496,2\n382#1:1501\n361#1:1504\n482#1:1545,6\n482#1:1560,3\n482#1:1569,2\n490#1:1578\n490#1:1579,8\n490#1:1596,3\n490#1:1605,2\n492#1:1624,6\n492#1:1639,3\n492#1:1648,2\n492#1:1653\n507#1:1666,6\n507#1:1681,3\n507#1:1690,2\n507#1:1695\n490#1:1699\n482#1:1702\n563#1:1714,6\n563#1:1729,3\n563#1:1738,2\n565#1:1752,6\n565#1:1767,3\n565#1:1776,2\n565#1:1781\n563#1:1785\n361#1:1379,9\n361#1:1399\n371#1:1417,9\n371#1:1437,3\n382#1:1478,9\n382#1:1498,3\n361#1:1502,2\n482#1:1551,9\n482#1:1571\n490#1:1587,9\n490#1:1607\n492#1:1630,9\n492#1:1650,3\n507#1:1672,9\n507#1:1692,3\n490#1:1697,2\n482#1:1700,2\n563#1:1720,9\n563#1:1740\n565#1:1758,9\n565#1:1778,3\n563#1:1783,2\n361#1:1391,6\n371#1:1429,6\n382#1:1490,6\n482#1:1563,6\n490#1:1599,6\n492#1:1642,6\n507#1:1684,6\n563#1:1732,6\n565#1:1770,6\n563#1:1704\n563#1:1705,9\n563#1:1786\n911#1:1803\n923#1:1806\n911#1:1804\n923#1:1807\n394#1:1875\n911#1:1805\n923#1:1808\n343#1:1868\n343#1:1869,2\n465#1:1876\n465#1:1877,2\n344#1:1871\n344#1:1872,2\n394#1:1874\n1305#1:1879\n1306#1:1880\n1308#1:1881\n1309#1:1882\n1310#1:1883\n*E\n"})
public final class no {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f31061a = 0.5f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f31062b = androidx.compose.ui.unit.h.r(400);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f31063c = androidx.compose.ui.unit.h.r(240);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f31064d = androidx.compose.ui.unit.h.r(12);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f31065e = androidx.compose.ui.unit.h.r(24);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f31066f = androidx.compose.ui.unit.h.r(48);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<Float> f31067g = new androidx.compose.animation.core.y3<>(256, 0, null, 6, null);

    @SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$DismissibleDrawerSheet$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1315:1\n1282#2,6:1316\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$DismissibleDrawerSheet$2\n*L\n741#1:1316,6\n*E\n"})
    static final class a implements pj.n<yd, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.v6 f31068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f31069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f31070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f31071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f31072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f31073f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ee f31074g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f31075h;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, ee eeVar, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f31068a = v6Var;
            this.f31069b = a0Var;
            this.f31070c = q3Var;
            this.f31071d = j10;
            this.f31072e = j11;
            this.f31073f = f10;
            this.f31074g = eeVar;
            this.f31075h = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float f(ee eeVar) {
            return eeVar.m().y();
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(yd ydVar, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (c0Var.D(ydVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1623455535, i11, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:732)");
            }
            androidx.compose.foundation.layout.v6 v6Var = this.f31068a;
            androidx.compose.ui.a0 a0Var = this.f31069b;
            androidx.compose.ui.graphics.q3 q3Var = this.f31070c;
            long j10 = this.f31071d;
            long j11 = this.f31072e;
            float f10 = this.f31073f;
            boolean zD = c0Var.D(this.f31074g);
            final ee eeVar = this.f31074g;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mo
                    @Override // androidx.compose.material3.internal.o2
                    public final float invoke() {
                        return no.a.f(eeVar);
                    }
                };
                c0Var.Y(objI0);
            }
            no.U(ydVar, v6Var, a0Var, q3Var, j10, j11, f10, (androidx.compose.material3.internal.o2) objI0, this.f31075h, c0Var, i11 & 14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(yd ydVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            d(ydVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {498}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ee f31077b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ee eeVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f31077b = eeVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f31077b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f31076a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ee eeVar = this.f31077b;
                this.f31076a = 1;
                if (eeVar.k(this) == objL) {
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

    static final class c implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ee f31078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f31079b;

        c(ee eeVar, androidx.compose.runtime.n3<Boolean> n3Var) {
            this.f31078a = eeVar;
            this.f31079b = n3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(ee eeVar, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.runtime.n3 n3Var, androidx.compose.ui.layout.i2.a aVar) {
            float fC = eeVar.m().r().c(ge.Closed);
            final float f10 = -i2Var.h1();
            if (!no.M(n3Var) || fC != f10) {
                if (!no.M(n3Var)) {
                    no.N(n3Var, true);
                }
                androidx.compose.foundation.gestures.b0.e0(eeVar.m(), androidx.compose.foundation.gestures.k.o(new Function1() { // from class: androidx.compose.material3.po
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.c.i(f10, (androidx.compose.foundation.gestures.u2) obj);
                    }
                }), null, 2, null);
            }
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i2Var.h1() + kotlin.math.b.L0(eeVar.C()), 0, 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, kotlin.math.b.L0(eeVar.C()), 0, 0.0f, 4, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(float f10, androidx.compose.foundation.gestures.u2 u2Var) {
            u2Var.a(ge.Closed, f10);
            u2Var.a(ge.Open, 0.0f);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            final androidx.compose.ui.layout.i2 i2VarP0 = list.get(0).P0(j10);
            final androidx.compose.ui.layout.i2 i2VarP1 = list.get(1).P0(j10);
            int iH1 = i2VarP1.h1();
            int iC1 = i2VarP1.c1();
            final ee eeVar = this.f31078a;
            final androidx.compose.runtime.n3<Boolean> n3Var = this.f31079b;
            int i10 = 6 << 0;
            return androidx.compose.ui.layout.c1.h6(c1Var, iH1, iC1, null, new Function1() { // from class: androidx.compose.material3.oo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return no.c.h(eeVar, i2VarP0, i2VarP1, n3Var, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.kt", i = {}, l = {957, 983, 983, 983}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.i<? extends androidx.activity.d>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yd f31082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f31083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ee f31084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f31086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f31087h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f31088i;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yd f31089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f31090b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f31091c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f31092d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f31093e;

            a(yd ydVar, boolean z10, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, kotlin.jvm.internal.i1.e eVar3) {
                this.f31089a = ydVar;
                this.f31090b = z10;
                this.f31091c = eVar;
                this.f31092d = eVar2;
                this.f31093e = eVar3;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.activity.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
                this.f31089a.h(androidx.compose.material3.internal.g3.f28886a.a(dVar.a()), dVar.b() == 0, this.f31090b, this.f31091c.f312748a, this.f31092d.f312748a, this.f31093e.f312748a);
                return Unit.f312394a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2", f = "NavigationDrawer.kt", i = {}, l = {974}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f31094a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ yd f31095b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(yd ydVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f31095b = ydVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(yd ydVar, float f10, float f11) {
                ydVar.e(f10);
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f31095b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b bVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f31094a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    float fB = this.f31095b.b();
                    final yd ydVar = this.f31095b;
                    Function2 function2 = new Function2() { // from class: androidx.compose.material3.qo
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return no.d.b.m(ydVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f31094a = 1;
                    int i11 = 2 | 0;
                    bVar = this;
                    if (androidx.compose.animation.core.f3.o(fB, 0.0f, 0.0f, null, function2, bVar, 12, null) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    bVar = this;
                }
                bVar.f31095b.a();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(yd ydVar, kotlinx.coroutines.s0 s0Var, ee eeVar, boolean z10, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, kotlin.jvm.internal.i1.e eVar3, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f31082c = ydVar;
            this.f31083d = s0Var;
            this.f31084e = eeVar;
            this.f31085f = z10;
            this.f31086g = eVar;
            this.f31087h = eVar2;
            this.f31088i = eVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f31082c, this.f31083d, this.f31084e, this.f31085f, this.f31086g, this.f31087h, this.f31088i, dVar);
            dVar2.f31081b = obj;
            return dVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
        
            if (r15.k(r14) == r1) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.no.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.i<androidx.activity.d> iVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(iVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$3$1", f = "NavigationDrawer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ee f31097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yd f31098c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ee eeVar, yd ydVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f31097b = eeVar;
            this.f31098c = ydVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f31097b, this.f31098c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f31096a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.f31097b.y()) {
                this.f31098c.a();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$DrawerSheet$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1315:1\n87#2:1316\n84#2,9:1317\n94#2:1356\n79#3,6:1326\n86#3,3:1341\n89#3,2:1350\n93#3:1355\n347#4,9:1332\n356#4,3:1352\n4206#5,6:1344\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$DrawerSheet$2\n*L\n832#1:1316\n832#1:1317,9\n832#1:1356\n832#1:1326,6\n832#1:1341,3\n832#1:1350,2\n832#1:1355\n832#1:1332,9\n832#1:1352,3\n832#1:1344,6\n*E\n"})
    static final class f implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yd f31099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f31101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.o2 f31102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f31103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.v6 f31104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f31105g;

        /* JADX WARN: Multi-variable type inference failed */
        f(yd ydVar, boolean z10, float f10, androidx.compose.material3.internal.o2 o2Var, float f11, androidx.compose.foundation.layout.v6 v6Var, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f31099a = ydVar;
            this.f31100b = z10;
            this.f31101c = f10;
            this.f31102d = o2Var;
            this.f31103e = f11;
            this.f31104f = v6Var;
            this.f31105g = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-315420087, i10, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:827)");
            }
            yd ydVar = this.f31099a;
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.t7.h(no.S0(androidx.compose.foundation.layout.i6.A(androidx.compose.ui.a0.E, no.f31063c, 0.0f, this.f31101c, 0.0f, 10, null), this.f31102d, this.f31103e, this.f31100b).B2(ydVar != null ? no.W0(androidx.compose.ui.a0.E, ydVar, this.f31100b) : androidx.compose.ui.a0.E), this.f31104f);
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f31105g;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
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

    @SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$ModalDrawerSheet$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1315:1\n1282#2,6:1316\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$ModalDrawerSheet$2\n*L\n652#1:1316,6\n*E\n"})
    static final class g implements pj.n<yd, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.v6 f31106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f31107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f31108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f31109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f31110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f31111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ee f31112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f31113h;

        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, ee eeVar, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f31106a = v6Var;
            this.f31107b = a0Var;
            this.f31108c = q3Var;
            this.f31109d = j10;
            this.f31110e = j11;
            this.f31111f = f10;
            this.f31112g = eeVar;
            this.f31113h = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float f(ee eeVar) {
            return eeVar.m().y();
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(yd ydVar, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (c0Var.D(ydVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(797187326, i11, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:643)");
            }
            androidx.compose.foundation.layout.v6 v6Var = this.f31106a;
            androidx.compose.ui.a0 a0Var = this.f31107b;
            androidx.compose.ui.graphics.q3 q3Var = this.f31108c;
            long j10 = this.f31109d;
            long j11 = this.f31110e;
            float f10 = this.f31111f;
            boolean zD = c0Var.D(this.f31112g);
            final ee eeVar = this.f31112g;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.ro
                    @Override // androidx.compose.material3.internal.o2
                    public final float invoke() {
                        return no.g.f(eeVar);
                    }
                };
                c0Var.Y(objI0);
            }
            no.U(ydVar, v6Var, a0Var, q3Var, j10, j11, f10, (androidx.compose.material3.internal.o2) objI0, this.f31113h, c0Var, i11 & 14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(yd ydVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            d(ydVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", f = "NavigationDrawer.kt", i = {}, l = {376}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ee f31115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ee eeVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f31115b = eeVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f31115b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f31114a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ee eeVar = this.f31115b;
                this.f31114a = 1;
                if (eeVar.k(this) == objL) {
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
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ee f31117b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ee eeVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f31117b = eeVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(this.f31117b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f31116a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ee eeVar = this.f31117b;
                this.f31116a = 1;
                if (eeVar.k(this) == objL) {
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
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$6$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1315:1\n150#2,3:1316\n34#2,6:1319\n153#2:1325\n320#2,8:1326\n320#2,8:1334\n34#2,6:1342\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$6$1\n*L\n410#1:1316,3\n410#1:1319,6\n410#1:1325\n411#1:1326,8\n412#1:1334,8\n431#1:1342,6\n*E\n"})
    static final class j implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ee f31118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f31119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k3 f31120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f31121d;

        j(ee eeVar, androidx.compose.runtime.n3<Boolean> n3Var, androidx.compose.runtime.k3 k3Var, float f10) {
            this.f31118a = eeVar;
            this.f31119b = n3Var;
            this.f31120c = k3Var;
            this.f31121d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(ee eeVar, int i10, List list, androidx.compose.runtime.n3 n3Var, final androidx.compose.runtime.k3 k3Var, final float f10, androidx.compose.ui.layout.i2.a aVar) {
            float fC = eeVar.m().r().c(ge.Closed);
            float f11 = -i10;
            if (!no.j0(n3Var) || fC != f11) {
                if (!no.j0(n3Var)) {
                    no.k0(n3Var, true);
                }
                no.m0(k3Var, f11);
                androidx.compose.foundation.gestures.b0.e0(eeVar.m(), androidx.compose.foundation.gestures.k.o(new Function1() { // from class: androidx.compose.material3.to
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.j.i(f10, k3Var, (androidx.compose.foundation.gestures.u2) obj);
                    }
                }), null, 2, null);
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list.get(i11), 0, 0, 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(float f10, androidx.compose.runtime.k3 k3Var, androidx.compose.foundation.gestures.u2 u2Var) {
            u2Var.a(ge.Closed, no.l0(k3Var));
            u2Var.a(ge.Open, f10);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            Integer numValueOf;
            long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).P0(jD));
            }
            Integer num = null;
            int i11 = 1;
            if (!arrayList.isEmpty()) {
                numValueOf = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(0)).h1());
                int lastIndex = CollectionsKt.getLastIndex(arrayList);
                if (1 <= lastIndex) {
                    int i12 = 1;
                    while (true) {
                        Integer numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(i12)).h1());
                        if (numValueOf2.compareTo(numValueOf) > 0) {
                            numValueOf = numValueOf2;
                        }
                        if (i12 == lastIndex) {
                            break;
                        }
                        i12++;
                    }
                }
            } else {
                numValueOf = null;
            }
            final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            if (!arrayList.isEmpty()) {
                Integer numValueOf3 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(0)).c1());
                int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                if (1 <= lastIndex2) {
                    while (true) {
                        Integer numValueOf4 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(i11)).c1());
                        if (numValueOf4.compareTo(numValueOf3) > 0) {
                            numValueOf3 = numValueOf4;
                        }
                        if (i11 == lastIndex2) {
                            break;
                        }
                        i11++;
                    }
                }
                num = numValueOf3;
            }
            int iIntValue2 = num != null ? num.intValue() : 0;
            final ee eeVar = this.f31118a;
            final androidx.compose.runtime.n3<Boolean> n3Var = this.f31119b;
            final androidx.compose.runtime.k3 k3Var = this.f31120c;
            final float f10 = this.f31121d;
            return androidx.compose.ui.layout.c1.h6(c1Var, iIntValue, iIntValue2, null, new Function1() { // from class: androidx.compose.material3.so
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return no.j.h(eeVar, iIntValue, arrayList, n3Var, k3Var, f10, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,1315:1\n113#2:1316\n113#2:1354\n113#2:1396\n99#3:1317\n96#3,9:1318\n106#3:1400\n79#4,6:1327\n86#4,3:1342\n89#4,2:1351\n79#4,6:1365\n86#4,3:1380\n89#4,2:1389\n93#4:1394\n93#4:1399\n347#5,9:1333\n356#5:1353\n347#5,9:1371\n356#5,3:1391\n357#5,2:1397\n4206#6,6:1345\n4206#6,6:1383\n70#7:1355\n67#7,9:1356\n77#7:1395\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$2\n*L\n1092#1:1316\n1098#1:1354\n1105#1:1396\n1091#1:1317\n1091#1:1318,9\n1091#1:1400\n1091#1:1327,6\n1091#1:1342,3\n1091#1:1351,2\n1100#1:1365,6\n1100#1:1380,3\n1100#1:1389,2\n1100#1:1394\n1091#1:1399\n1091#1:1333,9\n1091#1:1353\n1100#1:1371,9\n1100#1:1391,3\n1091#1:1397,2\n1091#1:1345,6\n1100#1:1383,6\n1100#1:1355\n1100#1:1356,9\n1100#1:1395\n*E\n"})
    static final class k implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn f31123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31126e;

        /* JADX WARN: Multi-variable type inference failed */
        k(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, cn cnVar, boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4) {
            this.f31122a = function2;
            this.f31123b = cnVar;
            this.f31124c = z10;
            this.f31125d = function3;
            this.f31126e = function4;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1173018444, i10, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:1090)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(aVar, androidx.compose.ui.unit.h.r(16), 0.0f, androidx.compose.ui.unit.h.r(24), 0.0f, 10, null);
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ = aVar2.q();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f31122a;
            cn cnVar = this.f31123b;
            boolean z10 = this.f31124c;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f31125d;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function4 = this.f31126e;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var, 48);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            if (function2 != null) {
                c0Var.E(-2013920011);
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(cnVar.d(z10, c0Var, 0).getValue().M())), function2, c0Var, androidx.compose.runtime.n4.f36267i);
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, androidx.compose.ui.unit.h.r(12)), c0Var, 6);
                c0Var.A();
            } else {
                c0Var.E(-2013707630);
                c0Var.A();
            }
            androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.x5.q(y5Var, aVar, 1.0f, false, 2, null);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarQ);
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
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.runtime.n4<androidx.compose.ui.graphics.q0> n4VarF = c7.a().f(androidx.compose.ui.graphics.q0.n(cnVar.c(z10, c0Var, 0).getValue().M()));
            int i11 = androidx.compose.runtime.n4.f36267i;
            androidx.compose.runtime.a1.e(n4VarF, function4, c0Var, i11);
            c0Var.o();
            if (function3 != null) {
                c0Var.E(-2013454639);
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, androidx.compose.ui.unit.h.r(12)), c0Var, 6);
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(cnVar.b(z10, c0Var, 0).getValue().M())), function3, c0Var, i11);
                c0Var.A();
            } else {
                c0Var.E(-2013238414);
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

    static final class l implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f31127a;

        l(Function0<Unit> function0) {
            this.f31127a = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(Function0 function0, n0.g gVar) {
            function0.invoke();
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final Function0<Unit> function0 = this.f31127a;
            Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, null, new Function1() { // from class: androidx.compose.material3.uo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return no.l.b(function0, (n0.g) obj);
                }
            }, dVar, 7, null);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0135 A[PHI: r1 r3 r5 r6 r10 r14
      0x0135: PHI (r1v31 int) = (r1v24 int), (r1v34 int), (r1v35 int) binds: [B:122:0x0172, B:106:0x0132, B:107:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r3v11 androidx.compose.ui.a0) = (r3v7 androidx.compose.ui.a0), (r3v3 androidx.compose.ui.a0), (r3v3 androidx.compose.ui.a0) binds: [B:122:0x0172, B:106:0x0132, B:107:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r5v5 androidx.compose.ui.graphics.q3) = (r5v3 androidx.compose.ui.graphics.q3), (r5v2 androidx.compose.ui.graphics.q3), (r5v2 androidx.compose.ui.graphics.q3) binds: [B:122:0x0172, B:106:0x0132, B:107:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r6v13 long) = (r6v9 long), (r6v6 long), (r6v6 long) binds: [B:122:0x0172, B:106:0x0132, B:107:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r10v12 float) = (r10v5 float), (r10v3 float), (r10v3 float) binds: [B:122:0x0172, B:106:0x0132, B:107:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r14v6 long) = (r14v2 long), (r14v1 long), (r14v1 long) binds: [B:122:0x0172, B:106:0x0132, B:107:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x014f  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:123:0x0174  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void H(@NotNull final ee eeVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, @Nullable androidx.compose.foundation.layout.v6 v6Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        androidx.compose.ui.graphics.q3 q3VarA;
        int i14;
        long j12;
        long jG;
        int i15;
        float fC;
        int i16;
        int i17;
        boolean z10;
        final androidx.compose.foundation.layout.v6 v6Var2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j13;
        final float f11;
        final long j14;
        androidx.compose.runtime.s5 s5VarT;
        int i18;
        androidx.compose.foundation.layout.v6 v6VarK;
        int i19;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(496605370);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(eeVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    q3VarA = q3Var;
                    if (c0VarR.D(q3VarA)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        j12 = j10;
                        int i22 = c0VarR.L(j12) ? 2048 : 1024;
                        i12 |= i22;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i22;
                } else {
                    j12 = j10;
                }
                if ((i10 & 24576) == 0) {
                    jG = j11;
                    if ((i11 & 16) == 0 || !c0VarR.L(jG)) {
                        i20 = 8192;
                    } else {
                        i20 = 16384;
                    }
                    i12 |= i20;
                } else {
                    jG = j11;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        fC = f10;
                        if (c0VarR.I(fC)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0 || !c0VarR.D(v6Var)) {
                            i19 = 524288;
                        } else {
                            i19 = 1048576;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i12 |= i17;
                        }
                        if ((i12 & 4793491) != 4793490) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i21 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    q3VarA = androidx.compose.ui.graphics.d3.a();
                                }
                                if ((i11 & 8) != 0) {
                                    j12 = xd.f34462a.j(c0VarR, 6);
                                    i12 &= -7169;
                                }
                                if ((i11 & 16) != 0) {
                                    jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                                    i12 &= -57345;
                                }
                                if (i15 != 0) {
                                    fC = xd.f34462a.c();
                                }
                                if ((i11 & 64) != 0) {
                                    a0Var3 = a0Var2;
                                    q3Var2 = q3VarA;
                                    j13 = j12;
                                    f11 = fC;
                                    j14 = jG;
                                    i18 = i12 & (-3670017);
                                    v6VarK = xd.f34462a.k(c0VarR, 6);
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                                }
                                S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                v6Var2 = v6VarK;
                            } else {
                                c0VarR.u();
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                            }
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                            }
                            S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            v6Var2 = v6VarK;
                        } else {
                            c0VarR.u();
                            v6Var2 = v6Var;
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 8) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                            }
                            if (i15 != 0) {
                                fC = xd.f34462a.c();
                            }
                            if ((i11 & 64) != 0) {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12 & (-3670017);
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12;
                                v6VarK = v6Var;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 8) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                            }
                            if (i15 != 0) {
                                fC = xd.f34462a.c();
                            }
                            if ((i11 & 64) != 0) {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12 & (-3670017);
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12;
                                v6VarK = v6Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                        }
                        S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        v6Var2 = v6VarK;
                    } else {
                        c0VarR.u();
                        v6Var2 = v6Var;
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                fC = f10;
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 8) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                            }
                            if (i15 != 0) {
                                fC = xd.f34462a.c();
                            }
                            if ((i11 & 64) != 0) {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12 & (-3670017);
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12;
                                v6VarK = v6Var;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 8) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                            }
                            if (i15 != 0) {
                                fC = xd.f34462a.c();
                            }
                            if ((i11 & 64) != 0) {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12 & (-3670017);
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12;
                                v6VarK = v6Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                        }
                        S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        v6Var2 = v6VarK;
                    } else {
                        c0VarR.u();
                        v6Var2 = v6Var;
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                    }
                    S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var2 = v6VarK;
                } else {
                    c0VarR.u();
                    v6Var2 = v6Var;
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            q3VarA = q3Var;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j12 = j10;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i22;
                } else {
                    j12 = j10;
                }
                i12 |= i22;
            } else {
                j12 = j10;
            }
            if ((i10 & 24576) == 0) {
                jG = j11;
                if ((i11 & 16) == 0) {
                    i20 = 8192;
                } else {
                    i20 = 8192;
                }
                i12 |= i20;
            } else {
                jG = j11;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    fC = f10;
                    if (c0VarR.I(fC)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 8) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                            }
                            if (i15 != 0) {
                                fC = xd.f34462a.c();
                            }
                            if ((i11 & 64) != 0) {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12 & (-3670017);
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12;
                                v6VarK = v6Var;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 8) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                            }
                            if (i15 != 0) {
                                fC = xd.f34462a.c();
                            }
                            if ((i11 & 64) != 0) {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12 & (-3670017);
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12;
                                v6VarK = v6Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                        }
                        S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        v6Var2 = v6VarK;
                    } else {
                        c0VarR.u();
                        v6Var2 = v6Var;
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                    }
                    S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var2 = v6VarK;
                } else {
                    c0VarR.u();
                    v6Var2 = v6Var;
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            fC = f10;
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                    }
                    S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var2 = v6VarK;
                } else {
                    c0VarR.u();
                    v6Var2 = v6Var;
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 8) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i15 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12;
                        v6VarK = v6Var;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 8) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i15 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12;
                        v6VarK = v6Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                }
                S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var2 = v6VarK;
            } else {
                c0VarR.u();
                v6Var2 = v6Var;
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                f11 = fC;
                j14 = jG;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                q3VarA = q3Var;
                if (c0VarR.D(q3VarA)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j12 = j10;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i22;
                } else {
                    j12 = j10;
                }
                i12 |= i22;
            } else {
                j12 = j10;
            }
            if ((i10 & 24576) == 0) {
                jG = j11;
                if ((i11 & 16) == 0) {
                    i20 = 8192;
                } else {
                    i20 = 8192;
                }
                i12 |= i20;
            } else {
                jG = j11;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    fC = f10;
                    if (c0VarR.I(fC)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 8) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                            }
                            if (i15 != 0) {
                                fC = xd.f34462a.c();
                            }
                            if ((i11 & 64) != 0) {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12 & (-3670017);
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12;
                                v6VarK = v6Var;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 8) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                            }
                            if (i15 != 0) {
                                fC = xd.f34462a.c();
                            }
                            if ((i11 & 64) != 0) {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12 & (-3670017);
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarA;
                                j13 = j12;
                                f11 = fC;
                                j14 = jG;
                                i18 = i12;
                                v6VarK = v6Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                        }
                        S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        v6Var2 = v6VarK;
                    } else {
                        c0VarR.u();
                        v6Var2 = v6Var;
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                    }
                    S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var2 = v6VarK;
                } else {
                    c0VarR.u();
                    v6Var2 = v6Var;
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            fC = f10;
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                    }
                    S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var2 = v6VarK;
                } else {
                    c0VarR.u();
                    v6Var2 = v6Var;
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 8) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i15 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12;
                        v6VarK = v6Var;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 8) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i15 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12;
                        v6VarK = v6Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                }
                S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var2 = v6VarK;
            } else {
                c0VarR.u();
                v6Var2 = v6Var;
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                f11 = fC;
                j14 = jG;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        q3VarA = q3Var;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i12 |= i22;
            } else {
                j12 = j10;
            }
            i12 |= i22;
        } else {
            j12 = j10;
        }
        if ((i10 & 24576) == 0) {
            jG = j11;
            if ((i11 & 16) == 0) {
                i20 = 8192;
            } else {
                i20 = 8192;
            }
            i12 |= i20;
        } else {
            jG = j11;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                fC = f10;
                if (c0VarR.I(fC)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 8) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i15 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            f11 = fC;
                            j14 = jG;
                            i18 = i12;
                            v6VarK = v6Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                    }
                    S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var2 = v6VarK;
                } else {
                    c0VarR.u();
                    v6Var2 = v6Var;
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 8) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i15 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12;
                        v6VarK = v6Var;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 8) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i15 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12;
                        v6VarK = v6Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                }
                S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var2 = v6VarK;
            } else {
                c0VarR.u();
                v6Var2 = v6Var;
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                f11 = fC;
                j14 = jG;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        fC = f10;
        if ((i10 & 1572864) != 0) {
            if ((i11 & 64) == 0) {
                i19 = 524288;
            } else {
                i19 = 524288;
            }
            i12 |= i19;
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 8) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i15 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12;
                        v6VarK = v6Var;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 8) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i15 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        f11 = fC;
                        j14 = jG;
                        i18 = i12;
                        v6VarK = v6Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                }
                S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var2 = v6VarK;
            } else {
                c0VarR.u();
                v6Var2 = v6Var;
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                f11 = fC;
                j14 = jG;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        if ((i12 & 4793491) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                if ((i11 & 8) != 0) {
                    j12 = xd.f34462a.j(c0VarR, 6);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                    i12 &= -57345;
                }
                if (i15 != 0) {
                    fC = xd.f34462a.c();
                }
                if ((i11 & 64) != 0) {
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                    i18 = i12 & (-3670017);
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                } else {
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                    i18 = i12;
                    v6VarK = v6Var;
                }
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                if ((i11 & 8) != 0) {
                    j12 = xd.f34462a.j(c0VarR, 6);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jG = o6.g(j12, c0VarR, (i12 >> 9) & 14);
                    i12 &= -57345;
                }
                if (i15 != 0) {
                    fC = xd.f34462a.c();
                }
                if ((i11 & 64) != 0) {
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                    i18 = i12 & (-3670017);
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                } else {
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    f11 = fC;
                    j14 = jG;
                    i18 = i12;
                    v6VarK = v6Var;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(496605370, i18, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
            }
            S(eeVar, androidx.compose.runtime.internal.w.e(1623455535, true, new a(v6VarK, a0Var3, q3Var2, j13, j14, f11, eeVar, nVar), c0VarR, 54), c0VarR, (i18 & 14) | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            v6Var2 = v6VarK;
        } else {
            c0VarR.u();
            v6Var2 = v6Var;
            a0Var3 = a0Var2;
            q3Var2 = q3VarA;
            j13 = j12;
            f11 = fC;
            j14 = jG;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.vn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.J(eeVar, a0Var3, q3Var2, j13, j14, f11, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:106:0x0132  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x014b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:116:0x016e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0180  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120 A[DONT_INVERT] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void I(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, @Nullable androidx.compose.foundation.layout.v6 v6Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.ui.graphics.q3 q3VarA;
        long j12;
        long jG;
        int i13;
        float fC;
        int i14;
        androidx.compose.foundation.layout.v6 v6Var2;
        int i15;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j13;
        final long j14;
        final float f11;
        final androidx.compose.foundation.layout.v6 v6Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.layout.v6 v6VarK;
        int i16;
        int i17;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1496398234);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                q3VarA = q3Var;
                i12 |= c0VarR.D(q3VarA) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    j12 = j10;
                    int i20 = c0VarR.L(j12) ? 256 : 128;
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 3072) == 0) {
                jG = j11;
                if ((i11 & 8) == 0 || !c0VarR.L(jG)) {
                    i17 = 1024;
                } else {
                    i17 = 2048;
                }
                i12 |= i17;
            } else {
                jG = j11;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    fC = f10;
                    if (c0VarR.I(fC)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        v6Var2 = v6Var;
                        int i21 = c0VarR.D(v6Var2) ? 131072 : 65536;
                        i12 |= i21;
                    } else {
                        v6Var2 = v6Var;
                    }
                    i12 |= i21;
                } else {
                    v6Var2 = v6Var;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i19 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 4) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fC = xd.f34462a.c();
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                v6VarK = v6Var2;
                            }
                            i16 = -1496398234;
                        } else {
                            c0VarR.u();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            j12 = j12;
                            jG = jG;
                            fC = fC;
                            v6VarK = v6Var2;
                            i16 = -1496398234;
                            a0Var4 = a0Var2;
                            q3VarA = q3VarA;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:686)");
                        }
                        int i22 = i12 << 6;
                        c0Var2 = c0VarR;
                        U(null, v6VarK, a0Var4, q3VarA, j12, jG, fC, null, nVar, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (i22 & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        v6Var3 = v6VarK;
                        a0Var3 = a0Var4;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        j14 = jG;
                        f11 = fC;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        j14 = jG;
                        f11 = fC;
                        v6Var3 = v6Var2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.pn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.K(a0Var3, q3Var2, j13, j14, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 4) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            v6VarK = v6Var2;
                        }
                        i16 = -1496398234;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 4) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            v6VarK = v6Var2;
                        }
                        i16 = -1496398234;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:686)");
                    }
                    int i23 = i12 << 6;
                    c0Var2 = c0VarR;
                    U(null, v6VarK, a0Var4, q3VarA, j12, jG, fC, null, nVar, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (458752 & i23) | (3670016 & i23) | (i23 & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var3 = v6VarK;
                    a0Var3 = a0Var4;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = fC;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = fC;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.K(a0Var3, q3Var2, j13, j14, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            fC = f10;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    v6Var2 = v6Var;
                    if (c0VarR.D(v6Var2)) {
                    }
                    i12 |= i21;
                } else {
                    v6Var2 = v6Var;
                }
                i12 |= i21;
            } else {
                v6Var2 = v6Var;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i12 |= i15;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 4) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            v6VarK = v6Var2;
                        }
                        i16 = -1496398234;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 4) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            v6VarK = v6Var2;
                        }
                        i16 = -1496398234;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:686)");
                    }
                    int i24 = i12 << 6;
                    c0Var2 = c0VarR;
                    U(null, v6VarK, a0Var4, q3VarA, j12, jG, fC, null, nVar, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (i24 & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var3 = v6VarK;
                    a0Var3 = a0Var4;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = fC;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = fC;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.K(a0Var3, q3Var2, j13, j14, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 4) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        v6VarK = v6Var2;
                    }
                    i16 = -1496398234;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 4) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        v6VarK = v6Var2;
                    }
                    i16 = -1496398234;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:686)");
                }
                int i25 = i12 << 6;
                c0Var2 = c0VarR;
                U(null, v6VarK, a0Var4, q3VarA, j12, jG, fC, null, nVar, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (i25 & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var3 = v6VarK;
                a0Var3 = a0Var4;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = fC;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = fC;
                v6Var3 = v6Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.K(a0Var3, q3Var2, j13, j14, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        q3VarA = q3Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            i12 |= i20;
        } else {
            j12 = j10;
        }
        if ((i10 & 3072) == 0) {
            jG = j11;
            if ((i11 & 8) == 0) {
                i17 = 1024;
            } else {
                i17 = 1024;
            }
            i12 |= i17;
        } else {
            jG = j11;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                fC = f10;
                if (c0VarR.I(fC)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    v6Var2 = v6Var;
                    if (c0VarR.D(v6Var2)) {
                    }
                    i12 |= i21;
                } else {
                    v6Var2 = v6Var;
                }
                i12 |= i21;
            } else {
                v6Var2 = v6Var;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i12 |= i15;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 4) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            v6VarK = v6Var2;
                        }
                        i16 = -1496398234;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 4) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fC = xd.f34462a.c();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            v6VarK = v6Var2;
                        }
                        i16 = -1496398234;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:686)");
                    }
                    int i26 = i12 << 6;
                    c0Var2 = c0VarR;
                    U(null, v6VarK, a0Var4, q3VarA, j12, jG, fC, null, nVar, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (i26 & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var3 = v6VarK;
                    a0Var3 = a0Var4;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = fC;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = fC;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.K(a0Var3, q3Var2, j13, j14, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 4) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        v6VarK = v6Var2;
                    }
                    i16 = -1496398234;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 4) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        v6VarK = v6Var2;
                    }
                    i16 = -1496398234;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:686)");
                }
                int i27 = i12 << 6;
                c0Var2 = c0VarR;
                U(null, v6VarK, a0Var4, q3VarA, j12, jG, fC, null, nVar, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (i27 & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var3 = v6VarK;
                a0Var3 = a0Var4;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = fC;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = fC;
                v6Var3 = v6Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.K(a0Var3, q3Var2, j13, j14, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        fC = f10;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                v6Var2 = v6Var;
                if (c0VarR.D(v6Var2)) {
                }
                i12 |= i21;
            } else {
                v6Var2 = v6Var;
            }
            i12 |= i21;
        } else {
            v6Var2 = v6Var;
        }
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 4) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        v6VarK = v6Var2;
                    }
                    i16 = -1496398234;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 4) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fC = xd.f34462a.c();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        v6VarK = v6Var2;
                    }
                    i16 = -1496398234;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:686)");
                }
                int i28 = i12 << 6;
                c0Var2 = c0VarR;
                U(null, v6VarK, a0Var4, q3VarA, j12, jG, fC, null, nVar, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (i28 & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var3 = v6VarK;
                a0Var3 = a0Var4;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = fC;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = fC;
                v6Var3 = v6Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.K(a0Var3, q3Var2, j13, j14, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i19 != 0) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                if ((i11 & 4) != 0) {
                    j12 = xd.f34462a.j(c0VarR, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fC = xd.f34462a.c();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                } else {
                    v6VarK = v6Var2;
                }
                i16 = -1496398234;
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i19 != 0) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                if ((i11 & 4) != 0) {
                    j12 = xd.f34462a.j(c0VarR, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jG = o6.g(j12, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fC = xd.f34462a.c();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                } else {
                    v6VarK = v6Var2;
                }
                i16 = -1496398234;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:686)");
            }
            int i29 = i12 << 6;
            c0Var2 = c0VarR;
            U(null, v6VarK, a0Var4, q3VarA, j12, jG, fC, null, nVar, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (i29 & 234881024), 128);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            v6Var3 = v6VarK;
            a0Var3 = a0Var4;
            q3Var2 = q3VarA;
            j13 = j12;
            j14 = jG;
            f11 = fC;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            q3Var2 = q3VarA;
            j13 = j12;
            j14 = jG;
            f11 = fC;
            v6Var3 = v6Var2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.K(a0Var3, q3Var2, j13, j14, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(ee eeVar, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        H(eeVar, a0Var, q3Var, j10, j11, f10, v6Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        I(a0Var, q3Var, j10, j11, f10, v6Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0182  */
    /* JADX WARN: Code duplicated, block: B:103:0x0185  */
    /* JADX WARN: Code duplicated, block: B:106:0x01be  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:118:0x0216  */
    /* JADX WARN: Code duplicated, block: B:120:0x021c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0229  */
    /* JADX WARN: Code duplicated, block: B:128:0x022f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0252  */
    /* JADX WARN: Code duplicated, block: B:134:0x025e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0262  */
    /* JADX WARN: Code duplicated, block: B:138:0x0283  */
    /* JADX WARN: Code duplicated, block: B:140:0x0291  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:153:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:156:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:159:0x0308  */
    /* JADX WARN: Code duplicated, block: B:160:0x030c  */
    /* JADX WARN: Code duplicated, block: B:163:0x032b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0339  */
    /* JADX WARN: Code duplicated, block: B:168:0x0379  */
    /* JADX WARN: Code duplicated, block: B:171:0x0385  */
    /* JADX WARN: Code duplicated, block: B:172:0x0389  */
    /* JADX WARN: Code duplicated, block: B:175:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:177:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:186:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf A[PHI: r3 r8 r9
      0x00bf: PHI (r3v22 int) = (r3v19 int), (r3v16 int), (r3v23 int) binds: [B:76:0x00d6, B:68:0x00bb, B:69:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r8v23 androidx.compose.ui.a0) = (r8v4 androidx.compose.ui.a0), (r8v2 androidx.compose.ui.a0), (r8v2 androidx.compose.ui.a0) binds: [B:76:0x00d6, B:68:0x00bb, B:69:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r9v12 androidx.compose.material3.ee) = (r9v9 androidx.compose.material3.ee), (r9v6 androidx.compose.material3.ee), (r9v6 androidx.compose.material3.ee) binds: [B:76:0x00d6, B:68:0x00bb, B:69:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x011e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124  */
    /* JADX WARN: Code duplicated, block: B:94:0x0140  */
    /* JADX WARN: Code duplicated, block: B:96:0x0146  */
    /* JADX WARN: Code duplicated, block: B:99:0x015e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void L(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, @Nullable ee eeVar, boolean z10, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        final ee eeVarA1;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        final boolean z13;
        final ee eeVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        boolean z14;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        androidx.compose.runtime.n3 n3Var;
        final androidx.compose.ui.unit.d dVar;
        final androidx.compose.animation.core.y0 y0VarB;
        final androidx.compose.animation.core.y0 y0VarB2;
        boolean zD;
        Object objI1;
        Object objI2;
        final kotlinx.coroutines.s0 s0Var;
        final String strB;
        boolean z15;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z16;
        Object objI3;
        int iJ2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        boolean zD2;
        Object objI4;
        int iJ3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        int iJ4;
        Function0<androidx.compose.ui.node.g> function0A4;
        androidx.compose.runtime.c0 c0VarD4;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1150092038);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    eeVarA1 = eeVar;
                    int i17 = c0VarR.D(eeVarA1) ? 256 : 128;
                    i12 |= i17;
                } else {
                    eeVarA1 = eeVar;
                }
                i12 |= i17;
            } else {
                eeVarA1 = eeVar;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(function3)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                        }
                        if (i13 != 0) {
                            a0Var3 = a0Var2;
                            z14 = true;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1150092038, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:463)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI0;
                        dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        y0VarB = hm.b(d0.h1.DefaultSpatial, c0VarR, 6);
                        y0VarB2 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                        int i18 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                        zD = ((i18 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB) | c0VarR.k0(y0VarB2);
                        objI1 = c0VarR.i0();
                        if (zD || objI1 == aVar.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.zn
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return no.O(eeVarA1, dVar, y0VarB, y0VarB2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.m((Function0) objI1, c0VarR, 0);
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI2);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI2;
                        androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                        strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                        if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.gestures.k.D(a0Var3, eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                        androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar4.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar4.g());
                        function2B = aVar4.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar4.f());
                        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        z16 = (i18 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256;
                        objI3 = c0VarR.i0();
                        if (z16 || objI3 == aVar.a()) {
                            objI3 = new c(eeVarA1, n3Var);
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI3;
                        androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                        iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar5);
                        function0A2 = aVar4.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD2, a1Var, aVar4.e());
                        androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar4.g());
                        function2B2 = aVar4.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                            c0VarD2.Y(Integer.valueOf(iJ2));
                            c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                        }
                        androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar4.f());
                        zD2 = c0VarR.D(strB) | ((i18 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                        objI4 = c0VarR.i0();
                        if (zD2 || objI4 == aVar.a()) {
                            objI4 = new Function1() { // from class: androidx.compose.material3.bo
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return no.P(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI4);
                        }
                        androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar5, false, (Function1) objI4, 1, null);
                        androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                        iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarF);
                        function0A3 = aVar4.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A3);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar4.e());
                        androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar4.g());
                        function2B3 = aVar4.b();
                        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                            c0VarD3.Y(Integer.valueOf(iJ3));
                            c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                        }
                        androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar4.f());
                        function2.invoke(c0VarR, Integer.valueOf(i12 & 14));
                        c0VarR.o();
                        androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                        iJ4 = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, aVar5);
                        function0A4 = aVar4.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD4, a1VarK3, aVar4.e());
                        androidx.compose.runtime.y7.n(c0VarD4, b1VarK4, aVar4.g());
                        function2B4 = aVar4.b();
                        if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iJ4))) {
                            c0VarD4.Y(Integer.valueOf(iJ4));
                            c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                        }
                        androidx.compose.runtime.y7.n(c0VarD4, a0VarN4, aVar4.f());
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
                        c0VarR.o();
                        c0VarR.o();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        z13 = z14;
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                    }
                    a0Var3 = a0Var2;
                    z14 = z11;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1150092038, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:463)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    y0VarB = hm.b(d0.h1.DefaultSpatial, c0VarR, 6);
                    y0VarB2 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    int i19 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    zD = ((i19 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB) | c0VarR.k0(y0VarB2);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.zn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.O(eeVarA1, dVar, y0VarB, y0VarB2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.zn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.O(eeVarA1, dVar, y0VarB, y0VarB2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI1, c0VarR, 0);
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI2);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI2;
                    androidx.compose.material3.internal.l3.a aVar6 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    androidx.compose.ui.a0 a0VarD2 = androidx.compose.foundation.gestures.k.D(a0Var3, eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                    androidx.compose.ui.e.a aVar7 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar7.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarD2);
                    androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                    function0A = aVar8.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK4, aVar8.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar8.g());
                    function2B = aVar8.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar8.f());
                    androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                    if (i19 <= 256) {
                    }
                    objI3 = c0VarR.i0();
                    if (z16) {
                        objI3 = new c(eeVarA1, n3Var);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new c(eeVarA1, n3Var);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.ui.layout.a1 a1Var2 = (androidx.compose.ui.layout.a1) objI3;
                    androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                    iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, aVar9);
                    function0A2 = aVar8.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD2, a1Var2, aVar8.e());
                    androidx.compose.runtime.y7.n(c0VarD2, b1VarK6, aVar8.g());
                    function2B2 = aVar8.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD2, a0VarN6, aVar8.f());
                    zD2 = c0VarR.D(strB) | ((i19 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    objI4 = c0VarR.i0();
                    if (zD2) {
                        objI4 = new Function1() { // from class: androidx.compose.material3.bo
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.P(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function1() { // from class: androidx.compose.material3.bo
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.P(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    androidx.compose.ui.a0 a0VarF2 = androidx.compose.ui.semantics.t.f(aVar9, false, (Function1) objI4, 1, null);
                    androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(aVar7.C(), false);
                    iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
                    function0A3 = aVar8.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD3, a1VarK5, aVar8.e());
                    androidx.compose.runtime.y7.n(c0VarD3, b1VarK7, aVar8.g());
                    function2B3 = aVar8.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    }
                    androidx.compose.runtime.y7.n(c0VarD3, a0VarN7, aVar8.f());
                    function2.invoke(c0VarR, Integer.valueOf(i12 & 14));
                    c0VarR.o();
                    androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(aVar7.C(), false);
                    iJ4 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, aVar9);
                    function0A4 = aVar8.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD4, a1VarK6, aVar8.e());
                    androidx.compose.runtime.y7.n(c0VarD4, b1VarK8, aVar8.g());
                    function2B4 = aVar8.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iJ4));
                        c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iJ4));
                        c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                    }
                    androidx.compose.runtime.y7.n(c0VarD4, a0VarN8, aVar8.f());
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
                    c0VarR.o();
                    c0VarR.o();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    z13 = z14;
                } else {
                    c0VarR.u();
                    z13 = z11;
                }
                eeVar2 = eeVarA1;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var4 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.co
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.R(function2, a0Var4, eeVar2, z13, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function3)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                    }
                    if (i13 != 0) {
                        a0Var3 = a0Var2;
                        z14 = true;
                    } else {
                        a0Var3 = a0Var2;
                        z14 = z11;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                    }
                    if (i13 != 0) {
                        a0Var3 = a0Var2;
                        z14 = true;
                    } else {
                        a0Var3 = a0Var2;
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1150092038, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:463)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                y0VarB = hm.b(d0.h1.DefaultSpatial, c0VarR, 6);
                y0VarB2 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                int i110 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                zD = ((i110 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB) | c0VarR.k0(y0VarB2);
                objI1 = c0VarR.i0();
                if (zD) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.zn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.O(eeVarA1, dVar, y0VarB, y0VarB2);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material3.zn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.O(eeVarA1, dVar, y0VarB, y0VarB2);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.m((Function0) objI1, c0VarR, 0);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI2);
                }
                s0Var = (kotlinx.coroutines.s0) objI2;
                androidx.compose.material3.internal.l3.a aVar10 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                androidx.compose.ui.a0 a0VarD3 = androidx.compose.foundation.gestures.k.D(a0Var3, eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                androidx.compose.ui.e.a aVar11 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(aVar11.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarD3);
                androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                function0A = aVar12.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK7, aVar12.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK9, aVar12.g());
                function2B = aVar12.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN9, aVar12.f());
                androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                if (i110 <= 256) {
                }
                objI3 = c0VarR.i0();
                if (z16) {
                    objI3 = new c(eeVarA1, n3Var);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new c(eeVarA1, n3Var);
                    c0VarR.Y(objI3);
                }
                androidx.compose.ui.layout.a1 a1Var3 = (androidx.compose.ui.layout.a1) objI3;
                androidx.compose.ui.a0.a aVar13 = androidx.compose.ui.a0.E;
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, aVar13);
                function0A2 = aVar12.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD2, a1Var3, aVar12.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK10, aVar12.g());
                function2B2 = aVar12.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN10, aVar12.f());
                zD2 = c0VarR.D(strB) | ((i110 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                objI4 = c0VarR.i0();
                if (zD2) {
                    objI4 = new Function1() { // from class: androidx.compose.material3.bo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.P(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function1() { // from class: androidx.compose.material3.bo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.P(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI4);
                }
                androidx.compose.ui.a0 a0VarF3 = androidx.compose.ui.semantics.t.f(aVar13, false, (Function1) objI4, 1, null);
                androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(aVar11.C(), false);
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
                function0A3 = aVar12.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1VarK8, aVar12.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK11, aVar12.g());
                function2B3 = aVar12.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN11, aVar12.f());
                function2.invoke(c0VarR, Integer.valueOf(i12 & 14));
                c0VarR.o();
                androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(aVar11.C(), false);
                iJ4 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, aVar13);
                function0A4 = aVar12.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A4);
                } else {
                    c0VarR.l();
                }
                c0VarD4 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD4, a1VarK9, aVar12.e());
                androidx.compose.runtime.y7.n(c0VarD4, b1VarK12, aVar12.g());
                function2B4 = aVar12.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iJ4));
                    c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iJ4));
                    c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                }
                androidx.compose.runtime.y7.n(c0VarD4, a0VarN12, aVar12.f());
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
                c0VarR.o();
                c0VarR.o();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                z13 = z14;
            } else {
                c0VarR.u();
                z13 = z11;
            }
            eeVar2 = eeVarA1;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var5 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.co
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.R(function2, a0Var5, eeVar2, z13, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                eeVarA1 = eeVar;
                if (c0VarR.D(eeVarA1)) {
                }
                i12 |= i17;
            } else {
                eeVarA1 = eeVar;
            }
            i12 |= i17;
        } else {
            eeVarA1 = eeVar;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function3)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                    }
                    if (i13 != 0) {
                        a0Var3 = a0Var2;
                        z14 = true;
                    } else {
                        a0Var3 = a0Var2;
                        z14 = z11;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                    }
                    if (i13 != 0) {
                        a0Var3 = a0Var2;
                        z14 = true;
                    } else {
                        a0Var3 = a0Var2;
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1150092038, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:463)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                y0VarB = hm.b(d0.h1.DefaultSpatial, c0VarR, 6);
                y0VarB2 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                int i111 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                zD = ((i111 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB) | c0VarR.k0(y0VarB2);
                objI1 = c0VarR.i0();
                if (zD) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.zn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.O(eeVarA1, dVar, y0VarB, y0VarB2);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material3.zn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.O(eeVarA1, dVar, y0VarB, y0VarB2);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.m((Function0) objI1, c0VarR, 0);
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI2);
                }
                s0Var = (kotlinx.coroutines.s0) objI2;
                androidx.compose.material3.internal.l3.a aVar14 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                androidx.compose.ui.a0 a0VarD4 = androidx.compose.foundation.gestures.k.D(a0Var3, eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                androidx.compose.ui.e.a aVar15 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(aVar15.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarD4);
                androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                function0A = aVar16.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK10, aVar16.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK13, aVar16.g());
                function2B = aVar16.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar16.f());
                androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                if (i111 <= 256) {
                }
                objI3 = c0VarR.i0();
                if (z16) {
                    objI3 = new c(eeVarA1, n3Var);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new c(eeVarA1, n3Var);
                    c0VarR.Y(objI3);
                }
                androidx.compose.ui.layout.a1 a1Var4 = (androidx.compose.ui.layout.a1) objI3;
                androidx.compose.ui.a0.a aVar17 = androidx.compose.ui.a0.E;
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, aVar17);
                function0A2 = aVar16.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD2, a1Var4, aVar16.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK14, aVar16.g());
                function2B2 = aVar16.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN14, aVar16.f());
                zD2 = c0VarR.D(strB) | ((i111 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                objI4 = c0VarR.i0();
                if (zD2) {
                    objI4 = new Function1() { // from class: androidx.compose.material3.bo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.P(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function1() { // from class: androidx.compose.material3.bo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.P(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI4);
                }
                androidx.compose.ui.a0 a0VarF4 = androidx.compose.ui.semantics.t.f(aVar17, false, (Function1) objI4, 1, null);
                androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(aVar15.C(), false);
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarF4);
                function0A3 = aVar16.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1VarK11, aVar16.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK15, aVar16.g());
                function2B3 = aVar16.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN15, aVar16.f());
                function2.invoke(c0VarR, Integer.valueOf(i12 & 14));
                c0VarR.o();
                androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(aVar15.C(), false);
                iJ4 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, aVar17);
                function0A4 = aVar16.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A4);
                } else {
                    c0VarR.l();
                }
                c0VarD4 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD4, a1VarK12, aVar16.e());
                androidx.compose.runtime.y7.n(c0VarD4, b1VarK16, aVar16.g());
                function2B4 = aVar16.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iJ4));
                    c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iJ4));
                    c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                }
                androidx.compose.runtime.y7.n(c0VarD4, a0VarN16, aVar16.f());
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
                c0VarR.o();
                c0VarR.o();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                z13 = z14;
            } else {
                c0VarR.u();
                z13 = z11;
            }
            eeVar2 = eeVarA1;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.co
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.R(function2, a0Var6, eeVar2, z13, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.k0(function3)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((i12 & 9363) != 9362) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                }
                if (i13 != 0) {
                    a0Var3 = a0Var2;
                    z14 = true;
                } else {
                    a0Var3 = a0Var2;
                    z14 = z11;
                }
            } else {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                }
                if (i13 != 0) {
                    a0Var3 = a0Var2;
                    z14 = true;
                } else {
                    a0Var3 = a0Var2;
                    z14 = z11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1150092038, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:463)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI0);
            }
            n3Var = (androidx.compose.runtime.n3) objI0;
            dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            y0VarB = hm.b(d0.h1.DefaultSpatial, c0VarR, 6);
            y0VarB2 = hm.b(d0.h1.FastEffects, c0VarR, 6);
            int i112 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
            zD = ((i112 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB) | c0VarR.k0(y0VarB2);
            objI1 = c0VarR.i0();
            if (zD) {
                objI1 = new Function0() { // from class: androidx.compose.material3.zn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return no.O(eeVarA1, dVar, y0VarB, y0VarB2);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function0() { // from class: androidx.compose.material3.zn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return no.O(eeVarA1, dVar, y0VarB, y0VarB2);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.b2.m((Function0) objI1, c0VarR, 0);
            objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI2);
            }
            s0Var = (kotlinx.coroutines.s0) objI2;
            androidx.compose.material3.internal.l3.a aVar18 = androidx.compose.material3.internal.l3.f29010b;
            strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
            if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                z15 = true;
            } else {
                z15 = false;
            }
            androidx.compose.ui.a0 a0VarD5 = androidx.compose.foundation.gestures.k.D(a0Var3, eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
            androidx.compose.ui.e.a aVar19 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(aVar19.C(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarD5);
            androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
            function0A = aVar110.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK13, aVar110.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK17, aVar110.g());
            function2B = aVar110.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN17, aVar110.f());
            androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
            if (i112 <= 256) {
            }
            objI3 = c0VarR.i0();
            if (z16) {
                objI3 = new c(eeVarA1, n3Var);
                c0VarR.Y(objI3);
            } else {
                objI3 = new c(eeVarA1, n3Var);
                c0VarR.Y(objI3);
            }
            androidx.compose.ui.layout.a1 a1Var5 = (androidx.compose.ui.layout.a1) objI3;
            androidx.compose.ui.a0.a aVar111 = androidx.compose.ui.a0.E;
            iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, aVar111);
            function0A2 = aVar110.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1Var5, aVar110.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK18, aVar110.g());
            function2B2 = aVar110.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN18, aVar110.f());
            zD2 = c0VarR.D(strB) | ((i112 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
            objI4 = c0VarR.i0();
            if (zD2) {
                objI4 = new Function1() { // from class: androidx.compose.material3.bo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.P(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI4);
            } else {
                objI4 = new Function1() { // from class: androidx.compose.material3.bo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.P(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI4);
            }
            androidx.compose.ui.a0 a0VarF5 = androidx.compose.ui.semantics.t.f(aVar111, false, (Function1) objI4, 1, null);
            androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(aVar19.C(), false);
            iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarF5);
            function0A3 = aVar110.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD3, a1VarK14, aVar110.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK19, aVar110.g());
            function2B3 = aVar110.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN19, aVar110.f());
            function2.invoke(c0VarR, Integer.valueOf(i12 & 14));
            c0VarR.o();
            androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(aVar19.C(), false);
            iJ4 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, aVar111);
            function0A4 = aVar110.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A4);
            } else {
                c0VarR.l();
            }
            c0VarD4 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD4, a1VarK15, aVar110.e());
            androidx.compose.runtime.y7.n(c0VarD4, b1VarK110, aVar110.g());
            function2B4 = aVar110.b();
            if (c0VarD4.P()) {
                c0VarD4.Y(Integer.valueOf(iJ4));
                c0VarD4.f(Integer.valueOf(iJ4), function2B4);
            } else {
                c0VarD4.Y(Integer.valueOf(iJ4));
                c0VarD4.f(Integer.valueOf(iJ4), function2B4);
            }
            androidx.compose.runtime.y7.n(c0VarD4, a0VarN110, aVar110.f());
            function3.invoke(c0VarR, Integer.valueOf((i12 >> 12) & 14));
            c0VarR.o();
            c0VarR.o();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            z13 = z14;
        } else {
            c0VarR.u();
            z13 = z11;
        }
        eeVar2 = eeVarA1;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var7 = a0Var2;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.co
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.R(function2, a0Var7, eeVar2, z13, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M(androidx.compose.runtime.n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    private static final float M0(float f10, float f11, float f12) {
        return kotlin.ranges.r.H((f12 - f10) / (f11 - f10), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(androidx.compose.runtime.n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    private static final float N0(androidx.compose.ui.graphics.r1 r1Var, yd ydVar) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r1Var.d() >> 32));
        if (!Float.isNaN(fIntBitsToFloat)) {
            int i10 = 7 ^ 0;
            if (fIntBitsToFloat != 0.0f) {
                return ((ydVar.b() * (ydVar.d() ? 1 : -1)) / fIntBitsToFloat) + 1.0f;
            }
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(ee eeVar, androidx.compose.ui.unit.d dVar, androidx.compose.animation.core.y0 y0Var, androidx.compose.animation.core.y0 y0Var2) {
        eeVar.F(dVar);
        eeVar.G(y0Var);
        eeVar.E(y0Var2);
        return Unit.f312394a;
    }

    private static final float O0(androidx.compose.ui.graphics.r1 r1Var, yd ydVar) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r1Var.d() & com.rabbitmq.client.k0.f265952a));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (ydVar.c() / fIntBitsToFloat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(String str, final ee eeVar, final kotlinx.coroutines.s0 s0Var, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.G1(e0Var, str);
        if (eeVar.z()) {
            androidx.compose.ui.semantics.b0.p(e0Var, null, new Function0() { // from class: androidx.compose.material3.eo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(no.Q(eeVar, s0Var));
                }
            }, 1, null);
        }
        return Unit.f312394a;
    }

    public static final float P0() {
        return f31064d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(ee eeVar, kotlinx.coroutines.s0 s0Var) {
        if (eeVar.p().invoke(ge.Closed).booleanValue()) {
            kotlinx.coroutines.k.f(s0Var, null, null, new b(eeVar, null), 3, null);
        }
        return true;
    }

    public static final float Q0() {
        return f31065e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Function2 function2, androidx.compose.ui.a0 a0Var, ee eeVar, boolean z10, Function2 function3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        L(function2, a0Var, eeVar, z10, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    public static final float R0() {
        return f31066f;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void S(@NotNull final ee eeVar, @NotNull final pj.n<? super yd, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Object dVar;
        boolean z10;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-383087355);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(eeVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(nVar) ? 32 : 16;
        }
        int i12 = i11;
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-383087355, i12, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.kt:941)");
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new yd();
                c0VarR.Y(objI0);
            }
            yd ydVar = (yd) objI0;
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI1;
            boolean z11 = c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl;
            kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
            kotlin.jvm.internal.i1.e eVar2 = new kotlin.jvm.internal.i1.e();
            kotlin.jvm.internal.i1.e eVar3 = new kotlin.jvm.internal.i1.e();
            androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            eVar.f312748a = dVar2.S7(f31064d);
            eVar2.f312748a = dVar2.S7(f31065e);
            eVar3.f312748a = dVar2.S7(f31066f);
            boolean z12 = eeVar.z();
            int i13 = i12 & 14;
            boolean zG = c0VarR.G(z11) | c0VarR.I(eVar.f312748a) | c0VarR.I(eVar2.f312748a) | c0VarR.I(eVar3.f312748a) | c0VarR.k0(s0Var) | (i13 == 4);
            Object objI2 = c0VarR.i0();
            if (zG || objI2 == aVar.a()) {
                z10 = z12;
                dVar = new d(ydVar, s0Var, eeVar, z11, eVar, eVar2, eVar3, null);
                c0VarR.Y(dVar);
            } else {
                z10 = z12;
                dVar = objI2;
            }
            androidx.compose.material3.internal.n0.e(z10, (Function2) dVar, c0VarR, 0, 0);
            Boolean boolValueOf = Boolean.valueOf(eeVar.y());
            boolean z13 = i13 == 4;
            Object objI3 = c0VarR.i0();
            if (z13 || objI3 == aVar.a()) {
                objI3 = new e(eeVar, ydVar, null);
                c0VarR.Y(objI3);
            }
            androidx.compose.runtime.b2.i(boolValueOf, (Function2) objI3, c0VarR, 0);
            nVar.invoke(ydVar, c0VarR, Integer.valueOf((i12 & com.planner5d.library.engine.input.f.b.B) | 6));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ao
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.T(eeVar, nVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0 S0(androidx.compose.ui.a0 a0Var, final androidx.compose.material3.internal.o2 o2Var, final float f10, final boolean z10) {
        return androidx.compose.ui.graphics.q1.a(a0Var, new Function1() { // from class: androidx.compose.material3.jo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return no.T0(o2Var, f10, z10, (androidx.compose.ui.graphics.r1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(ee eeVar, pj.n nVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        S(eeVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T0(androidx.compose.material3.internal.o2 o2Var, float f10, boolean z10, androidx.compose.ui.graphics.r1 r1Var) {
        float fInvoke = o2Var.invoke();
        r1Var.z(fInvoke > 0.0f ? 1 / ((fInvoke / f10) + 1.0f) : 1.0f);
        r1Var.W1(androidx.compose.ui.graphics.a4.a(z10 ? 0.0f : 1.0f, 0.0f));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x012d  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0186  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0195  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01be  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:151:0x0210  */
    /* JADX WARN: Code duplicated, block: B:153:0x0213  */
    /* JADX WARN: Code duplicated, block: B:154:0x021a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0295  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0102  */
    /* JADX WARN: Code duplicated, block: B:98:0x010a  */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void U(@Nullable final yd ydVar, @NotNull final androidx.compose.foundation.layout.v6 v6Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, @Nullable androidx.compose.material3.internal.o2 o2Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.foundation.layout.v6 v6Var2;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        androidx.compose.ui.graphics.q3 q3VarA;
        int i16;
        long j12;
        long jG;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j13;
        final long j14;
        final float f11;
        final androidx.compose.material3.internal.o2 o2Var2;
        androidx.compose.runtime.s5 s5VarT;
        int i21;
        float fG;
        androidx.compose.material3.internal.o2 o2Var3;
        float f12;
        long j15;
        Object objI0;
        boolean z11;
        androidx.compose.ui.a0 a0VarY0;
        int i22;
        boolean zK0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1560288494);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(ydVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                v6Var2 = v6Var;
                i12 |= c0VarR.D(v6Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        q3VarA = q3Var;
                        if (c0VarR.D(q3VarA)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            j12 = j10;
                            int i23 = c0VarR.L(j12) ? 16384 : 8192;
                            i12 |= i23;
                        } else {
                            j12 = j10;
                        }
                        i12 |= i23;
                    } else {
                        j12 = j10;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jG = j11;
                            int i24 = c0VarR.L(jG) ? 131072 : 65536;
                            i12 |= i24;
                        } else {
                            jG = j11;
                        }
                        i12 |= i24;
                    } else {
                        jG = j11;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f10)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 12582912) == 0) {
                        if ((i11 & 128) != 0) {
                            i22 = 4194304;
                        } else {
                            if ((16777216 & i10) == 0) {
                                zK0 = c0VarR.D(o2Var);
                            } else {
                                zK0 = c0VarR.k0(o2Var);
                            }
                            if (zK0) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                        }
                        i12 |= i22;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i19;
                        }
                        i20 = i12;
                        if ((i12 & 38347923) != 38347922) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    q3VarA = androidx.compose.ui.graphics.d3.a();
                                }
                                if ((i11 & 16) != 0) {
                                    j12 = xd.f34462a.j(c0VarR, 6);
                                    i21 = i20 & (-57345);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                                    i21 &= -458753;
                                }
                                if (i17 != 0) {
                                    fG = xd.f34462a.g();
                                } else {
                                    fG = f10;
                                }
                                if ((i11 & 128) != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                            @Override // androidx.compose.material3.internal.o2
                                            public final float invoke() {
                                                return no.V();
                                            }
                                        };
                                        c0VarR.Y(objI0);
                                    }
                                    o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                                    i21 &= -29360129;
                                } else {
                                    o2Var3 = o2Var;
                                }
                                f12 = fG;
                                j15 = j12;
                            } else {
                                c0VarR.u();
                                i21 = (i11 & 16) != 0 ? i20 & (-57345) : i20;
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                }
                                if ((i11 & 128) != 0) {
                                    i21 &= -29360129;
                                }
                                f12 = f10;
                                j15 = j12;
                                o2Var3 = o2Var;
                            }
                            long j16 = jG;
                            androidx.compose.ui.graphics.q3 q3Var3 = q3VarA;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                            }
                            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            float fP = d0.m1.f268453a.p();
                            float fS7 = dVar.S7(fP);
                            z11 = c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl;
                            if (ydVar != null) {
                                a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                            } else {
                                a0VarY0 = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.ui.a0 a0Var4 = a0Var2;
                            int i25 = i21 >> 6;
                            c0Var2 = c0VarR;
                            u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var4, f31063c, 0.0f, fP, 0.0f, 10, null), o2Var3, fS7, z11).B2(a0VarY0), 0.0f, 1, null), q3Var3, j15, j16, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP, o2Var3, fS7, v6Var2, nVar), c0VarR, 54), c0Var2, (i25 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i25 & 896) | (i25 & 7168) | (i25 & 57344), 96);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            q3Var2 = q3Var3;
                            j13 = j15;
                            j14 = j16;
                            f11 = f12;
                            o2Var2 = o2Var3;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarA;
                            j13 = j12;
                            j14 = jG;
                            f11 = f10;
                            o2Var2 = o2Var;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 16) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                                i21 &= -458753;
                            }
                            if (i17 != 0) {
                                fG = xd.f34462a.g();
                            } else {
                                fG = f10;
                            }
                            if ((i11 & 128) != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                        @Override // androidx.compose.material3.internal.o2
                                        public final float invoke() {
                                            return no.V();
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                                i21 &= -29360129;
                            } else {
                                o2Var3 = o2Var;
                            }
                            f12 = fG;
                            j15 = j12;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 16) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                                i21 &= -458753;
                            }
                            if (i17 != 0) {
                                fG = xd.f34462a.g();
                            } else {
                                fG = f10;
                            }
                            if ((i11 & 128) != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                        @Override // androidx.compose.material3.internal.o2
                                        public final float invoke() {
                                            return no.V();
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                                i21 &= -29360129;
                            } else {
                                o2Var3 = o2Var;
                            }
                            f12 = fG;
                            j15 = j12;
                        }
                        long j17 = jG;
                        androidx.compose.ui.graphics.q3 q3Var4 = q3VarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                        }
                        androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        float fP2 = d0.m1.f268453a.p();
                        float fS8 = dVar2.S7(fP2);
                        if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        }
                        if (ydVar != null) {
                            a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                        } else {
                            a0VarY0 = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0Var5 = a0Var2;
                        int i26 = i21 >> 6;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var5, f31063c, 0.0f, fP2, 0.0f, 10, null), o2Var3, fS8, z11).B2(a0VarY0), 0.0f, 1, null), q3Var4, j15, j17, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP2, o2Var3, fS8, v6Var2, nVar), c0VarR, 54), c0Var2, (i26 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i26 & 896) | (i26 & 7168) | (i26 & 57344), 96);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        q3Var2 = q3Var4;
                        j13 = j15;
                        j14 = j17;
                        f11 = f12;
                        o2Var2 = o2Var3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        j14 = jG;
                        f11 = f10;
                        o2Var2 = o2Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                q3VarA = q3Var;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        j12 = j10;
                        if (c0VarR.L(j12)) {
                        }
                        i12 |= i23;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i23;
                } else {
                    j12 = j10;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jG = j11;
                        if (c0VarR.L(jG)) {
                        }
                        i12 |= i24;
                    } else {
                        jG = j11;
                    }
                    i12 |= i24;
                } else {
                    jG = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f10)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) != 0) {
                        i22 = 4194304;
                    } else {
                        if ((16777216 & i10) == 0) {
                            zK0 = c0VarR.D(o2Var);
                        } else {
                            zK0 = c0VarR.k0(o2Var);
                        }
                        if (zK0) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                    }
                    i12 |= i22;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 16) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                                i21 &= -458753;
                            }
                            if (i17 != 0) {
                                fG = xd.f34462a.g();
                            } else {
                                fG = f10;
                            }
                            if ((i11 & 128) != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                        @Override // androidx.compose.material3.internal.o2
                                        public final float invoke() {
                                            return no.V();
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                                i21 &= -29360129;
                            } else {
                                o2Var3 = o2Var;
                            }
                            f12 = fG;
                            j15 = j12;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 16) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                                i21 &= -458753;
                            }
                            if (i17 != 0) {
                                fG = xd.f34462a.g();
                            } else {
                                fG = f10;
                            }
                            if ((i11 & 128) != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                        @Override // androidx.compose.material3.internal.o2
                                        public final float invoke() {
                                            return no.V();
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                                i21 &= -29360129;
                            } else {
                                o2Var3 = o2Var;
                            }
                            f12 = fG;
                            j15 = j12;
                        }
                        long j18 = jG;
                        androidx.compose.ui.graphics.q3 q3Var5 = q3VarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                        }
                        androidx.compose.ui.unit.d dVar3 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        float fP3 = d0.m1.f268453a.p();
                        float fS9 = dVar3.S7(fP3);
                        if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        }
                        if (ydVar != null) {
                            a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                        } else {
                            a0VarY0 = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0Var6 = a0Var2;
                        int i27 = i21 >> 6;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var6, f31063c, 0.0f, fP3, 0.0f, 10, null), o2Var3, fS9, z11).B2(a0VarY0), 0.0f, 1, null), q3Var5, j15, j18, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP3, o2Var3, fS9, v6Var2, nVar), c0VarR, 54), c0Var2, (i27 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i27 & 896) | (i27 & 7168) | (i27 & 57344), 96);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var6;
                        q3Var2 = q3Var5;
                        j13 = j15;
                        j14 = j18;
                        f11 = f12;
                        o2Var2 = o2Var3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        j14 = jG;
                        f11 = f10;
                        o2Var2 = o2Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    }
                    long j19 = jG;
                    androidx.compose.ui.graphics.q3 q3Var6 = q3VarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                    }
                    androidx.compose.ui.unit.d dVar4 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    float fP4 = d0.m1.f268453a.p();
                    float fS10 = dVar4.S7(fP4);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    }
                    if (ydVar != null) {
                        a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                    } else {
                        a0VarY0 = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0Var7 = a0Var2;
                    int i28 = i21 >> 6;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var7, f31063c, 0.0f, fP4, 0.0f, 10, null), o2Var3, fS10, z11).B2(a0VarY0), 0.0f, 1, null), q3Var6, j15, j19, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP4, o2Var3, fS10, v6Var2, nVar), c0VarR, 54), c0Var2, (i28 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i28 & 896) | (i28 & 7168) | (i28 & 57344), 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var7;
                    q3Var2 = q3Var6;
                    j13 = j15;
                    j14 = j19;
                    f11 = f12;
                    o2Var2 = o2Var3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = f10;
                    o2Var2 = o2Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    q3VarA = q3Var;
                    if (c0VarR.D(q3VarA)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        j12 = j10;
                        if (c0VarR.L(j12)) {
                        }
                        i12 |= i23;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i23;
                } else {
                    j12 = j10;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jG = j11;
                        if (c0VarR.L(jG)) {
                        }
                        i12 |= i24;
                    } else {
                        jG = j11;
                    }
                    i12 |= i24;
                } else {
                    jG = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f10)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) != 0) {
                        i22 = 4194304;
                    } else {
                        if ((16777216 & i10) == 0) {
                            zK0 = c0VarR.D(o2Var);
                        } else {
                            zK0 = c0VarR.k0(o2Var);
                        }
                        if (zK0) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                    }
                    i12 |= i22;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 16) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                                i21 &= -458753;
                            }
                            if (i17 != 0) {
                                fG = xd.f34462a.g();
                            } else {
                                fG = f10;
                            }
                            if ((i11 & 128) != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                        @Override // androidx.compose.material3.internal.o2
                                        public final float invoke() {
                                            return no.V();
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                                i21 &= -29360129;
                            } else {
                                o2Var3 = o2Var;
                            }
                            f12 = fG;
                            j15 = j12;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 16) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                                i21 &= -458753;
                            }
                            if (i17 != 0) {
                                fG = xd.f34462a.g();
                            } else {
                                fG = f10;
                            }
                            if ((i11 & 128) != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                        @Override // androidx.compose.material3.internal.o2
                                        public final float invoke() {
                                            return no.V();
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                                i21 &= -29360129;
                            } else {
                                o2Var3 = o2Var;
                            }
                            f12 = fG;
                            j15 = j12;
                        }
                        long j110 = jG;
                        androidx.compose.ui.graphics.q3 q3Var7 = q3VarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                        }
                        androidx.compose.ui.unit.d dVar5 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        float fP5 = d0.m1.f268453a.p();
                        float fS11 = dVar5.S7(fP5);
                        if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        }
                        if (ydVar != null) {
                            a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                        } else {
                            a0VarY0 = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0Var8 = a0Var2;
                        int i29 = i21 >> 6;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var8, f31063c, 0.0f, fP5, 0.0f, 10, null), o2Var3, fS11, z11).B2(a0VarY0), 0.0f, 1, null), q3Var7, j15, j110, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP5, o2Var3, fS11, v6Var2, nVar), c0VarR, 54), c0Var2, (i29 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i29 & 896) | (i29 & 7168) | (i29 & 57344), 96);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var8;
                        q3Var2 = q3Var7;
                        j13 = j15;
                        j14 = j110;
                        f11 = f12;
                        o2Var2 = o2Var3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        j14 = jG;
                        f11 = f10;
                        o2Var2 = o2Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    }
                    long j111 = jG;
                    androidx.compose.ui.graphics.q3 q3Var8 = q3VarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                    }
                    androidx.compose.ui.unit.d dVar6 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    float fP6 = d0.m1.f268453a.p();
                    float fS12 = dVar6.S7(fP6);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    }
                    if (ydVar != null) {
                        a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                    } else {
                        a0VarY0 = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0Var9 = a0Var2;
                    int i210 = i21 >> 6;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var9, f31063c, 0.0f, fP6, 0.0f, 10, null), o2Var3, fS12, z11).B2(a0VarY0), 0.0f, 1, null), q3Var8, j15, j111, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP6, o2Var3, fS12, v6Var2, nVar), c0VarR, 54), c0Var2, (i210 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i210 & 896) | (i210 & 7168) | (i210 & 57344), 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var9;
                    q3Var2 = q3Var8;
                    j13 = j15;
                    j14 = j111;
                    f11 = f12;
                    o2Var2 = o2Var3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = f10;
                    o2Var2 = o2Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            q3VarA = q3Var;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j10;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i23;
                } else {
                    j12 = j10;
                }
                i12 |= i23;
            } else {
                j12 = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jG = j11;
                    if (c0VarR.L(jG)) {
                    }
                    i12 |= i24;
                } else {
                    jG = j11;
                }
                i12 |= i24;
            } else {
                jG = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f10)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) != 0) {
                    i22 = 4194304;
                } else {
                    if ((16777216 & i10) == 0) {
                        zK0 = c0VarR.D(o2Var);
                    } else {
                        zK0 = c0VarR.k0(o2Var);
                    }
                    if (zK0) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                }
                i12 |= i22;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    }
                    long j112 = jG;
                    androidx.compose.ui.graphics.q3 q3Var9 = q3VarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                    }
                    androidx.compose.ui.unit.d dVar7 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    float fP7 = d0.m1.f268453a.p();
                    float fS13 = dVar7.S7(fP7);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    }
                    if (ydVar != null) {
                        a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                    } else {
                        a0VarY0 = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0Var10 = a0Var2;
                    int i211 = i21 >> 6;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var10, f31063c, 0.0f, fP7, 0.0f, 10, null), o2Var3, fS13, z11).B2(a0VarY0), 0.0f, 1, null), q3Var9, j15, j112, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP7, o2Var3, fS13, v6Var2, nVar), c0VarR, 54), c0Var2, (i211 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i211 & 896) | (i211 & 7168) | (i211 & 57344), 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var10;
                    q3Var2 = q3Var9;
                    j13 = j15;
                    j14 = j112;
                    f11 = f12;
                    o2Var2 = o2Var3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = f10;
                    o2Var2 = o2Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            i20 = i12;
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 16) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                        i21 &= -458753;
                    }
                    if (i17 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f10;
                    }
                    if ((i11 & 128) != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                @Override // androidx.compose.material3.internal.o2
                                public final float invoke() {
                                    return no.V();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                        i21 &= -29360129;
                    } else {
                        o2Var3 = o2Var;
                    }
                    f12 = fG;
                    j15 = j12;
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 16) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                        i21 &= -458753;
                    }
                    if (i17 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f10;
                    }
                    if ((i11 & 128) != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                @Override // androidx.compose.material3.internal.o2
                                public final float invoke() {
                                    return no.V();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                        i21 &= -29360129;
                    } else {
                        o2Var3 = o2Var;
                    }
                    f12 = fG;
                    j15 = j12;
                }
                long j113 = jG;
                androidx.compose.ui.graphics.q3 q3Var10 = q3VarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                }
                androidx.compose.ui.unit.d dVar8 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                float fP8 = d0.m1.f268453a.p();
                float fS14 = dVar8.S7(fP8);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                }
                if (ydVar != null) {
                    a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                } else {
                    a0VarY0 = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0Var11 = a0Var2;
                int i212 = i21 >> 6;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var11, f31063c, 0.0f, fP8, 0.0f, 10, null), o2Var3, fS14, z11).B2(a0VarY0), 0.0f, 1, null), q3Var10, j15, j113, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP8, o2Var3, fS14, v6Var2, nVar), c0VarR, 54), c0Var2, (i212 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i212 & 896) | (i212 & 7168) | (i212 & 57344), 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var11;
                q3Var2 = q3Var10;
                j13 = j15;
                j14 = j113;
                f11 = f12;
                o2Var2 = o2Var3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = f10;
                o2Var2 = o2Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        v6Var2 = v6Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    q3VarA = q3Var;
                    if (c0VarR.D(q3VarA)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        j12 = j10;
                        if (c0VarR.L(j12)) {
                        }
                        i12 |= i23;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i23;
                } else {
                    j12 = j10;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jG = j11;
                        if (c0VarR.L(jG)) {
                        }
                        i12 |= i24;
                    } else {
                        jG = j11;
                    }
                    i12 |= i24;
                } else {
                    jG = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f10)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) != 0) {
                        i22 = 4194304;
                    } else {
                        if ((16777216 & i10) == 0) {
                            zK0 = c0VarR.D(o2Var);
                        } else {
                            zK0 = c0VarR.k0(o2Var);
                        }
                        if (zK0) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                    }
                    i12 |= i22;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 16) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                                i21 &= -458753;
                            }
                            if (i17 != 0) {
                                fG = xd.f34462a.g();
                            } else {
                                fG = f10;
                            }
                            if ((i11 & 128) != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                        @Override // androidx.compose.material3.internal.o2
                                        public final float invoke() {
                                            return no.V();
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                                i21 &= -29360129;
                            } else {
                                o2Var3 = o2Var;
                            }
                            f12 = fG;
                            j15 = j12;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            if ((i11 & 16) != 0) {
                                j12 = xd.f34462a.j(c0VarR, 6);
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                                i21 &= -458753;
                            }
                            if (i17 != 0) {
                                fG = xd.f34462a.g();
                            } else {
                                fG = f10;
                            }
                            if ((i11 & 128) != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                        @Override // androidx.compose.material3.internal.o2
                                        public final float invoke() {
                                            return no.V();
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                                i21 &= -29360129;
                            } else {
                                o2Var3 = o2Var;
                            }
                            f12 = fG;
                            j15 = j12;
                        }
                        long j114 = jG;
                        androidx.compose.ui.graphics.q3 q3Var11 = q3VarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                        }
                        androidx.compose.ui.unit.d dVar9 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        float fP9 = d0.m1.f268453a.p();
                        float fS15 = dVar9.S7(fP9);
                        if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        }
                        if (ydVar != null) {
                            a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                        } else {
                            a0VarY0 = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0Var12 = a0Var2;
                        int i213 = i21 >> 6;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var12, f31063c, 0.0f, fP9, 0.0f, 10, null), o2Var3, fS15, z11).B2(a0VarY0), 0.0f, 1, null), q3Var11, j15, j114, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP9, o2Var3, fS15, v6Var2, nVar), c0VarR, 54), c0Var2, (i213 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i213 & 896) | (i213 & 7168) | (i213 & 57344), 96);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var12;
                        q3Var2 = q3Var11;
                        j13 = j15;
                        j14 = j114;
                        f11 = f12;
                        o2Var2 = o2Var3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarA;
                        j13 = j12;
                        j14 = jG;
                        f11 = f10;
                        o2Var2 = o2Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    }
                    long j115 = jG;
                    androidx.compose.ui.graphics.q3 q3Var12 = q3VarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                    }
                    androidx.compose.ui.unit.d dVar10 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    float fP10 = d0.m1.f268453a.p();
                    float fS16 = dVar10.S7(fP10);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    }
                    if (ydVar != null) {
                        a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                    } else {
                        a0VarY0 = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0Var13 = a0Var2;
                    int i214 = i21 >> 6;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var13, f31063c, 0.0f, fP10, 0.0f, 10, null), o2Var3, fS16, z11).B2(a0VarY0), 0.0f, 1, null), q3Var12, j15, j115, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP10, o2Var3, fS16, v6Var2, nVar), c0VarR, 54), c0Var2, (i214 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i214 & 896) | (i214 & 7168) | (i214 & 57344), 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var13;
                    q3Var2 = q3Var12;
                    j13 = j15;
                    j14 = j115;
                    f11 = f12;
                    o2Var2 = o2Var3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = f10;
                    o2Var2 = o2Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            q3VarA = q3Var;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j10;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i23;
                } else {
                    j12 = j10;
                }
                i12 |= i23;
            } else {
                j12 = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jG = j11;
                    if (c0VarR.L(jG)) {
                    }
                    i12 |= i24;
                } else {
                    jG = j11;
                }
                i12 |= i24;
            } else {
                jG = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f10)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) != 0) {
                    i22 = 4194304;
                } else {
                    if ((16777216 & i10) == 0) {
                        zK0 = c0VarR.D(o2Var);
                    } else {
                        zK0 = c0VarR.k0(o2Var);
                    }
                    if (zK0) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                }
                i12 |= i22;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    }
                    long j116 = jG;
                    androidx.compose.ui.graphics.q3 q3Var13 = q3VarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                    }
                    androidx.compose.ui.unit.d dVar11 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    float fP11 = d0.m1.f268453a.p();
                    float fS17 = dVar11.S7(fP11);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    }
                    if (ydVar != null) {
                        a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                    } else {
                        a0VarY0 = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0Var14 = a0Var2;
                    int i215 = i21 >> 6;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var14, f31063c, 0.0f, fP11, 0.0f, 10, null), o2Var3, fS17, z11).B2(a0VarY0), 0.0f, 1, null), q3Var13, j15, j116, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP11, o2Var3, fS17, v6Var2, nVar), c0VarR, 54), c0Var2, (i215 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i215 & 896) | (i215 & 7168) | (i215 & 57344), 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var14;
                    q3Var2 = q3Var13;
                    j13 = j15;
                    j14 = j116;
                    f11 = f12;
                    o2Var2 = o2Var3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = f10;
                    o2Var2 = o2Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            i20 = i12;
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 16) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                        i21 &= -458753;
                    }
                    if (i17 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f10;
                    }
                    if ((i11 & 128) != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                @Override // androidx.compose.material3.internal.o2
                                public final float invoke() {
                                    return no.V();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                        i21 &= -29360129;
                    } else {
                        o2Var3 = o2Var;
                    }
                    f12 = fG;
                    j15 = j12;
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 16) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                        i21 &= -458753;
                    }
                    if (i17 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f10;
                    }
                    if ((i11 & 128) != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                @Override // androidx.compose.material3.internal.o2
                                public final float invoke() {
                                    return no.V();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                        i21 &= -29360129;
                    } else {
                        o2Var3 = o2Var;
                    }
                    f12 = fG;
                    j15 = j12;
                }
                long j117 = jG;
                androidx.compose.ui.graphics.q3 q3Var14 = q3VarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                }
                androidx.compose.ui.unit.d dVar12 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                float fP12 = d0.m1.f268453a.p();
                float fS18 = dVar12.S7(fP12);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                }
                if (ydVar != null) {
                    a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                } else {
                    a0VarY0 = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0Var15 = a0Var2;
                int i216 = i21 >> 6;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var15, f31063c, 0.0f, fP12, 0.0f, 10, null), o2Var3, fS18, z11).B2(a0VarY0), 0.0f, 1, null), q3Var14, j15, j117, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP12, o2Var3, fS18, v6Var2, nVar), c0VarR, 54), c0Var2, (i216 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i216 & 896) | (i216 & 7168) | (i216 & 57344), 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var15;
                q3Var2 = q3Var14;
                j13 = j15;
                j14 = j117;
                f11 = f12;
                o2Var2 = o2Var3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = f10;
                o2Var2 = o2Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                q3VarA = q3Var;
                if (c0VarR.D(q3VarA)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j10;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i23;
                } else {
                    j12 = j10;
                }
                i12 |= i23;
            } else {
                j12 = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jG = j11;
                    if (c0VarR.L(jG)) {
                    }
                    i12 |= i24;
                } else {
                    jG = j11;
                }
                i12 |= i24;
            } else {
                jG = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f10)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) != 0) {
                    i22 = 4194304;
                } else {
                    if ((16777216 & i10) == 0) {
                        zK0 = c0VarR.D(o2Var);
                    } else {
                        zK0 = c0VarR.k0(o2Var);
                    }
                    if (zK0) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                }
                i12 |= i22;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        if ((i11 & 16) != 0) {
                            j12 = xd.f34462a.j(c0VarR, 6);
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                            i21 &= -458753;
                        }
                        if (i17 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f10;
                        }
                        if ((i11 & 128) != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                    @Override // androidx.compose.material3.internal.o2
                                    public final float invoke() {
                                        return no.V();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                            i21 &= -29360129;
                        } else {
                            o2Var3 = o2Var;
                        }
                        f12 = fG;
                        j15 = j12;
                    }
                    long j118 = jG;
                    androidx.compose.ui.graphics.q3 q3Var15 = q3VarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                    }
                    androidx.compose.ui.unit.d dVar13 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    float fP13 = d0.m1.f268453a.p();
                    float fS19 = dVar13.S7(fP13);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    }
                    if (ydVar != null) {
                        a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                    } else {
                        a0VarY0 = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0Var16 = a0Var2;
                    int i217 = i21 >> 6;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var16, f31063c, 0.0f, fP13, 0.0f, 10, null), o2Var3, fS19, z11).B2(a0VarY0), 0.0f, 1, null), q3Var15, j15, j118, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP13, o2Var3, fS19, v6Var2, nVar), c0VarR, 54), c0Var2, (i217 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i217 & 896) | (i217 & 7168) | (i217 & 57344), 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var16;
                    q3Var2 = q3Var15;
                    j13 = j15;
                    j14 = j118;
                    f11 = f12;
                    o2Var2 = o2Var3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarA;
                    j13 = j12;
                    j14 = jG;
                    f11 = f10;
                    o2Var2 = o2Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            i20 = i12;
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 16) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                        i21 &= -458753;
                    }
                    if (i17 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f10;
                    }
                    if ((i11 & 128) != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                @Override // androidx.compose.material3.internal.o2
                                public final float invoke() {
                                    return no.V();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                        i21 &= -29360129;
                    } else {
                        o2Var3 = o2Var;
                    }
                    f12 = fG;
                    j15 = j12;
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 16) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                        i21 &= -458753;
                    }
                    if (i17 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f10;
                    }
                    if ((i11 & 128) != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                @Override // androidx.compose.material3.internal.o2
                                public final float invoke() {
                                    return no.V();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                        i21 &= -29360129;
                    } else {
                        o2Var3 = o2Var;
                    }
                    f12 = fG;
                    j15 = j12;
                }
                long j119 = jG;
                androidx.compose.ui.graphics.q3 q3Var16 = q3VarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                }
                androidx.compose.ui.unit.d dVar14 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                float fP14 = d0.m1.f268453a.p();
                float fS110 = dVar14.S7(fP14);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                }
                if (ydVar != null) {
                    a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                } else {
                    a0VarY0 = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0Var17 = a0Var2;
                int i218 = i21 >> 6;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var17, f31063c, 0.0f, fP14, 0.0f, 10, null), o2Var3, fS110, z11).B2(a0VarY0), 0.0f, 1, null), q3Var16, j15, j119, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP14, o2Var3, fS110, v6Var2, nVar), c0VarR, 54), c0Var2, (i218 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i218 & 896) | (i218 & 7168) | (i218 & 57344), 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var17;
                q3Var2 = q3Var16;
                j13 = j15;
                j14 = j119;
                f11 = f12;
                o2Var2 = o2Var3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = f10;
                o2Var2 = o2Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        q3VarA = q3Var;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i12 |= i23;
            } else {
                j12 = j10;
            }
            i12 |= i23;
        } else {
            j12 = j10;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                jG = j11;
                if (c0VarR.L(jG)) {
                }
                i12 |= i24;
            } else {
                jG = j11;
            }
            i12 |= i24;
        } else {
            jG = j11;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.I(f10)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i10 & 12582912) == 0) {
            if ((i11 & 128) != 0) {
                i22 = 4194304;
            } else {
                if ((16777216 & i10) == 0) {
                    zK0 = c0VarR.D(o2Var);
                } else {
                    zK0 = c0VarR.k0(o2Var);
                }
                if (zK0) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
            }
            i12 |= i22;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 67108864;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i19;
            }
            i20 = i12;
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 16) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                        i21 &= -458753;
                    }
                    if (i17 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f10;
                    }
                    if ((i11 & 128) != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                @Override // androidx.compose.material3.internal.o2
                                public final float invoke() {
                                    return no.V();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                        i21 &= -29360129;
                    } else {
                        o2Var3 = o2Var;
                    }
                    f12 = fG;
                    j15 = j12;
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    if ((i11 & 16) != 0) {
                        j12 = xd.f34462a.j(c0VarR, 6);
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                        i21 &= -458753;
                    }
                    if (i17 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f10;
                    }
                    if ((i11 & 128) != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                                @Override // androidx.compose.material3.internal.o2
                                public final float invoke() {
                                    return no.V();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                        i21 &= -29360129;
                    } else {
                        o2Var3 = o2Var;
                    }
                    f12 = fG;
                    j15 = j12;
                }
                long j1110 = jG;
                androidx.compose.ui.graphics.q3 q3Var17 = q3VarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                }
                androidx.compose.ui.unit.d dVar15 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                float fP15 = d0.m1.f268453a.p();
                float fS111 = dVar15.S7(fP15);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                }
                if (ydVar != null) {
                    a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
                } else {
                    a0VarY0 = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0Var18 = a0Var2;
                int i219 = i21 >> 6;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var18, f31063c, 0.0f, fP15, 0.0f, 10, null), o2Var3, fS111, z11).B2(a0VarY0), 0.0f, 1, null), q3Var17, j15, j1110, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP15, o2Var3, fS111, v6Var2, nVar), c0VarR, 54), c0Var2, (i219 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i219 & 896) | (i219 & 7168) | (i219 & 57344), 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var18;
                q3Var2 = q3Var17;
                j13 = j15;
                j14 = j1110;
                f11 = f12;
                o2Var2 = o2Var3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarA;
                j13 = j12;
                j14 = jG;
                f11 = f10;
                o2Var2 = o2Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        i20 = i12;
        if ((i12 & 38347923) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i20 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                if ((i11 & 16) != 0) {
                    j12 = xd.f34462a.j(c0VarR, 6);
                    i21 = i20 & (-57345);
                } else {
                    i21 = i20;
                }
                if ((i11 & 32) != 0) {
                    jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                    i21 &= -458753;
                }
                if (i17 != 0) {
                    fG = xd.f34462a.g();
                } else {
                    fG = f10;
                }
                if ((i11 & 128) != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                            @Override // androidx.compose.material3.internal.o2
                            public final float invoke() {
                                return no.V();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                    i21 &= -29360129;
                } else {
                    o2Var3 = o2Var;
                }
                f12 = fG;
                j15 = j12;
            } else {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                if ((i11 & 16) != 0) {
                    j12 = xd.f34462a.j(c0VarR, 6);
                    i21 = i20 & (-57345);
                } else {
                    i21 = i20;
                }
                if ((i11 & 32) != 0) {
                    jG = o6.g(j12, c0VarR, (i21 >> 12) & 14);
                    i21 &= -458753;
                }
                if (i17 != 0) {
                    fG = xd.f34462a.g();
                } else {
                    fG = f10;
                }
                if ((i11 & 128) != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.mn
                            @Override // androidx.compose.material3.internal.o2
                            public final float invoke() {
                                return no.V();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    o2Var3 = (androidx.compose.material3.internal.o2) objI0;
                    i21 &= -29360129;
                } else {
                    o2Var3 = o2Var;
                }
                f12 = fG;
                j15 = j12;
            }
            long j1111 = jG;
            androidx.compose.ui.graphics.q3 q3Var18 = q3VarA;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1560288494, i21, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
            }
            androidx.compose.ui.unit.d dVar16 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            float fP16 = d0.m1.f268453a.p();
            float fS112 = dVar16.S7(fP16);
            if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
            }
            if (ydVar != null) {
                a0VarY0 = Y0(androidx.compose.ui.a0.E, ydVar, z11);
            } else {
                a0VarY0 = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0Var19 = a0Var2;
            int i2110 = i21 >> 6;
            c0Var2 = c0VarR;
            u10.c(androidx.compose.foundation.layout.i6.d(U0(androidx.compose.foundation.layout.i6.A(a0Var19, f31063c, 0.0f, fP16, 0.0f, 10, null), o2Var3, fS112, z11).B2(a0VarY0), 0.0f, 1, null), q3Var18, j15, j1111, f12, 0.0f, null, androidx.compose.runtime.internal.w.e(-315420087, true, new f(ydVar, z11, fP16, o2Var3, fS112, v6Var2, nVar), c0VarR, 54), c0Var2, (i2110 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i2110 & 896) | (i2110 & 7168) | (i2110 & 57344), 96);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var19;
            q3Var2 = q3Var18;
            j13 = j15;
            j14 = j1111;
            f11 = f12;
            o2Var2 = o2Var3;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            q3Var2 = q3VarA;
            j13 = j12;
            j14 = jG;
            f11 = f10;
            o2Var2 = o2Var;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.nn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.W(ydVar, v6Var, a0Var3, q3Var2, j13, j14, f11, o2Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final androidx.compose.ui.a0 U0(androidx.compose.ui.a0 a0Var, final androidx.compose.material3.internal.o2 o2Var, final float f10, final boolean z10) {
        return androidx.compose.ui.graphics.q1.a(a0Var, new Function1() { // from class: androidx.compose.material3.rn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return no.V0(o2Var, f10, z10, (androidx.compose.ui.graphics.r1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float V() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(androidx.compose.material3.internal.o2 o2Var, float f10, boolean z10, androidx.compose.ui.graphics.r1 r1Var) {
        float fInvoke = o2Var.invoke();
        r1Var.z(fInvoke > 0.0f ? (fInvoke / f10) + 1.0f : 1.0f);
        r1Var.W1(androidx.compose.ui.graphics.a4.a(z10 ? 0.0f : 1.0f, 0.5f));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(yd ydVar, androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, androidx.compose.material3.internal.o2 o2Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        U(ydVar, v6Var, a0Var, q3Var, j10, j11, f10, o2Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0 W0(androidx.compose.ui.a0 a0Var, final yd ydVar, final boolean z10) {
        return androidx.compose.ui.graphics.q1.a(a0Var, new Function1() { // from class: androidx.compose.material3.qn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return no.X0(ydVar, z10, (androidx.compose.ui.graphics.r1) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0132 A[PHI: r1 r3 r4 r5 r7 r14
      0x0132: PHI (r1v31 int) = (r1v23 int), (r1v35 int), (r1v36 int) binds: [B:128:0x017b, B:111:0x012f, B:112:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r3v11 androidx.compose.ui.a0) = (r3v7 androidx.compose.ui.a0), (r3v3 androidx.compose.ui.a0), (r3v3 androidx.compose.ui.a0) binds: [B:128:0x017b, B:111:0x012f, B:112:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r4v14 androidx.compose.ui.graphics.q3) = (r4v9 androidx.compose.ui.graphics.q3), (r4v6 androidx.compose.ui.graphics.q3), (r4v6 androidx.compose.ui.graphics.q3) binds: [B:128:0x017b, B:111:0x012f, B:112:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r5v5 long) = (r5v3 long), (r5v2 long), (r5v2 long) binds: [B:128:0x017b, B:111:0x012f, B:112:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r7v5 long) = (r7v3 long), (r7v2 long), (r7v2 long) binds: [B:128:0x017b, B:111:0x012f, B:112:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r14v8 float) = (r14v4 float), (r14v3 float), (r14v3 float) binds: [B:128:0x017b, B:111:0x012f, B:112:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x013e  */
    /* JADX WARN: Code duplicated, block: B:118:0x014a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0158  */
    /* JADX WARN: Code duplicated, block: B:124:0x0164  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:129:0x017d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0196  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0104  */
    /* JADX WARN: Code duplicated, block: B:98:0x0111  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void X(@NotNull final ee eeVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, @Nullable androidx.compose.foundation.layout.v6 v6Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.graphics.q3 q3VarI;
        long jE;
        long jG;
        int i13;
        float f11;
        int i14;
        androidx.compose.foundation.layout.v6 v6Var2;
        int i15;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j12;
        final long j13;
        final float f12;
        final androidx.compose.foundation.layout.v6 v6Var3;
        androidx.compose.runtime.s5 s5VarT;
        int i16;
        androidx.compose.foundation.layout.v6 v6VarK;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1620540727);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(eeVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    q3VarI = q3Var;
                    int i18 = c0VarR.D(q3VarI) ? 256 : 128;
                    i12 |= i18;
                } else {
                    q3VarI = q3Var;
                }
                i12 |= i18;
            } else {
                q3VarI = q3Var;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jE = j10;
                    int i19 = c0VarR.L(jE) ? 2048 : 1024;
                    i12 |= i19;
                } else {
                    jE = j10;
                }
                i12 |= i19;
            } else {
                jE = j10;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jG = j11;
                    int i20 = c0VarR.L(jG) ? 16384 : 8192;
                    i12 |= i20;
                } else {
                    jG = j11;
                }
                i12 |= i20;
            } else {
                jG = j11;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        v6Var2 = v6Var;
                        int i21 = c0VarR.D(v6Var2) ? 1048576 : 524288;
                        i12 |= i21;
                    } else {
                        v6Var2 = v6Var;
                    }
                    i12 |= i21;
                } else {
                    v6Var2 = v6Var;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                                q3VarI = xd.f34462a.i(c0VarR, 6);
                            }
                            if ((i11 & 8) != 0) {
                                jE = xd.f34462a.e(c0VarR, 6);
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                            }
                            if (i13 != 0) {
                                f11 = xd.f34462a.f();
                            }
                            if ((i11 & 64) != 0) {
                                a0Var3 = a0Var2;
                                q3Var2 = q3VarI;
                                j12 = jE;
                                j13 = jG;
                                f12 = f11;
                                i16 = i12 & (-3670017);
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1620540727, i16, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
                            }
                            S(eeVar, androidx.compose.runtime.internal.w.e(797187326, true, new g(v6VarK, a0Var3, q3Var2, j12, j13, f12, eeVar, nVar), c0VarR, 54), c0VarR, (i16 & 14) | 48);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            v6Var3 = v6VarK;
                        } else {
                            c0VarR.u();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                        }
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12;
                        v6VarK = v6Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620540727, i16, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
                        }
                        S(eeVar, androidx.compose.runtime.internal.w.e(797187326, true, new g(v6VarK, a0Var3, q3Var2, j12, j13, f12, eeVar, nVar), c0VarR, 54), c0VarR, (i16 & 14) | 48);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        v6Var3 = v6VarK;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        v6Var3 = v6Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.on
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.Z(eeVar, a0Var3, q3Var2, j12, j13, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = xd.f34462a.i(c0VarR, 6);
                        }
                        if ((i11 & 8) != 0) {
                            jE = xd.f34462a.e(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i13 != 0) {
                            f11 = xd.f34462a.f();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12;
                            v6VarK = v6Var2;
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = xd.f34462a.i(c0VarR, 6);
                        }
                        if ((i11 & 8) != 0) {
                            jE = xd.f34462a.e(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i13 != 0) {
                            f11 = xd.f34462a.f();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12;
                            v6VarK = v6Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620540727, i16, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
                    }
                    S(eeVar, androidx.compose.runtime.internal.w.e(797187326, true, new g(v6VarK, a0Var3, q3Var2, j12, j13, f12, eeVar, nVar), c0VarR, 54), c0VarR, (i16 & 14) | 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var3 = v6VarK;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarI;
                    j12 = jE;
                    j13 = jG;
                    f12 = f11;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.on
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.Z(eeVar, a0Var3, q3Var2, j12, j13, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            f11 = f10;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    v6Var2 = v6Var;
                    if (c0VarR.D(v6Var2)) {
                    }
                    i12 |= i21;
                } else {
                    v6Var2 = v6Var;
                }
                i12 |= i21;
            } else {
                v6Var2 = v6Var;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = xd.f34462a.i(c0VarR, 6);
                        }
                        if ((i11 & 8) != 0) {
                            jE = xd.f34462a.e(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i13 != 0) {
                            f11 = xd.f34462a.f();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12;
                            v6VarK = v6Var2;
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = xd.f34462a.i(c0VarR, 6);
                        }
                        if ((i11 & 8) != 0) {
                            jE = xd.f34462a.e(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i13 != 0) {
                            f11 = xd.f34462a.f();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12;
                            v6VarK = v6Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620540727, i16, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
                    }
                    S(eeVar, androidx.compose.runtime.internal.w.e(797187326, true, new g(v6VarK, a0Var3, q3Var2, j12, j13, f12, eeVar, nVar), c0VarR, 54), c0VarR, (i16 & 14) | 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var3 = v6VarK;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarI;
                    j12 = jE;
                    j13 = jG;
                    f12 = f11;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.on
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.Z(eeVar, a0Var3, q3Var2, j12, j13, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jE = xd.f34462a.e(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i13 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12;
                        v6VarK = v6Var2;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jE = xd.f34462a.e(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i13 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12;
                        v6VarK = v6Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1620540727, i16, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
                }
                S(eeVar, androidx.compose.runtime.internal.w.e(797187326, true, new g(v6VarK, a0Var3, q3Var2, j12, j13, f12, eeVar, nVar), c0VarR, 54), c0VarR, (i16 & 14) | 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var3 = v6VarK;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarI;
                j12 = jE;
                j13 = jG;
                f12 = f11;
                v6Var3 = v6Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.on
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.Z(eeVar, a0Var3, q3Var2, j12, j13, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                q3VarI = q3Var;
                if (c0VarR.D(q3VarI)) {
                }
                i12 |= i18;
            } else {
                q3VarI = q3Var;
            }
            i12 |= i18;
        } else {
            q3VarI = q3Var;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jE = j10;
                if (c0VarR.L(jE)) {
                }
                i12 |= i19;
            } else {
                jE = j10;
            }
            i12 |= i19;
        } else {
            jE = j10;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                jG = j11;
                if (c0VarR.L(jG)) {
                }
                i12 |= i20;
            } else {
                jG = j11;
            }
            i12 |= i20;
        } else {
            jG = j11;
        }
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((196608 & i10) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    v6Var2 = v6Var;
                    if (c0VarR.D(v6Var2)) {
                    }
                    i12 |= i21;
                } else {
                    v6Var2 = v6Var;
                }
                i12 |= i21;
            } else {
                v6Var2 = v6Var;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = xd.f34462a.i(c0VarR, 6);
                        }
                        if ((i11 & 8) != 0) {
                            jE = xd.f34462a.e(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i13 != 0) {
                            f11 = xd.f34462a.f();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12;
                            v6VarK = v6Var2;
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = xd.f34462a.i(c0VarR, 6);
                        }
                        if ((i11 & 8) != 0) {
                            jE = xd.f34462a.e(c0VarR, 6);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                        }
                        if (i13 != 0) {
                            f11 = xd.f34462a.f();
                        }
                        if ((i11 & 64) != 0) {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12 & (-3670017);
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            a0Var3 = a0Var2;
                            q3Var2 = q3VarI;
                            j12 = jE;
                            j13 = jG;
                            f12 = f11;
                            i16 = i12;
                            v6VarK = v6Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620540727, i16, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
                    }
                    S(eeVar, androidx.compose.runtime.internal.w.e(797187326, true, new g(v6VarK, a0Var3, q3Var2, j12, j13, f12, eeVar, nVar), c0VarR, 54), c0VarR, (i16 & 14) | 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var3 = v6VarK;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarI;
                    j12 = jE;
                    j13 = jG;
                    f12 = f11;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.on
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.Z(eeVar, a0Var3, q3Var2, j12, j13, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jE = xd.f34462a.e(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i13 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12;
                        v6VarK = v6Var2;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jE = xd.f34462a.e(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i13 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12;
                        v6VarK = v6Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1620540727, i16, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
                }
                S(eeVar, androidx.compose.runtime.internal.w.e(797187326, true, new g(v6VarK, a0Var3, q3Var2, j12, j13, f12, eeVar, nVar), c0VarR, 54), c0VarR, (i16 & 14) | 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var3 = v6VarK;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarI;
                j12 = jE;
                j13 = jG;
                f12 = f11;
                v6Var3 = v6Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.on
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.Z(eeVar, a0Var3, q3Var2, j12, j13, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        f11 = f10;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                v6Var2 = v6Var;
                if (c0VarR.D(v6Var2)) {
                }
                i12 |= i21;
            } else {
                v6Var2 = v6Var;
            }
            i12 |= i21;
        } else {
            v6Var2 = v6Var;
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jE = xd.f34462a.e(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i13 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12;
                        v6VarK = v6Var2;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jE = xd.f34462a.e(c0VarR, 6);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                    }
                    if (i13 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 64) != 0) {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12 & (-3670017);
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        a0Var3 = a0Var2;
                        q3Var2 = q3VarI;
                        j12 = jE;
                        j13 = jG;
                        f12 = f11;
                        i16 = i12;
                        v6VarK = v6Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1620540727, i16, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
                }
                S(eeVar, androidx.compose.runtime.internal.w.e(797187326, true, new g(v6VarK, a0Var3, q3Var2, j12, j13, f12, eeVar, nVar), c0VarR, 54), c0VarR, (i16 & 14) | 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var3 = v6VarK;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarI;
                j12 = jE;
                j13 = jG;
                f12 = f11;
                v6Var3 = v6Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.on
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.Z(eeVar, a0Var3, q3Var2, j12, j13, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        if ((i12 & 4793491) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarI = xd.f34462a.i(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    jE = xd.f34462a.e(c0VarR, 6);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                    i12 &= -57345;
                }
                if (i13 != 0) {
                    f11 = xd.f34462a.f();
                }
                if ((i11 & 64) != 0) {
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarI;
                    j12 = jE;
                    j13 = jG;
                    f12 = f11;
                    i16 = i12 & (-3670017);
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                } else {
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarI;
                    j12 = jE;
                    j13 = jG;
                    f12 = f11;
                    i16 = i12;
                    v6VarK = v6Var2;
                }
            } else {
                if (i17 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarI = xd.f34462a.i(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    jE = xd.f34462a.e(c0VarR, 6);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    jG = o6.g(jE, c0VarR, (i12 >> 9) & 14);
                    i12 &= -57345;
                }
                if (i13 != 0) {
                    f11 = xd.f34462a.f();
                }
                if ((i11 & 64) != 0) {
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarI;
                    j12 = jE;
                    j13 = jG;
                    f12 = f11;
                    i16 = i12 & (-3670017);
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                } else {
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarI;
                    j12 = jE;
                    j13 = jG;
                    f12 = f11;
                    i16 = i12;
                    v6VarK = v6Var2;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1620540727, i16, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
            }
            S(eeVar, androidx.compose.runtime.internal.w.e(797187326, true, new g(v6VarK, a0Var3, q3Var2, j12, j13, f12, eeVar, nVar), c0VarR, 54), c0VarR, (i16 & 14) | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            v6Var3 = v6VarK;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            q3Var2 = q3VarI;
            j12 = jE;
            j13 = jG;
            f12 = f11;
            v6Var3 = v6Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.on
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.Z(eeVar, a0Var3, q3Var2, j12, j13, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X0(yd ydVar, boolean z10, androidx.compose.ui.graphics.r1 r1Var) {
        float fN0 = N0(r1Var, ydVar);
        r1Var.z(fN0 == 0.0f ? 1.0f : O0(r1Var, ydVar) / fN0);
        r1Var.W1(androidx.compose.ui.graphics.a4.a(z10 ? 0.0f : 1.0f, 0.0f));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x012c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0139  */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153  */
    /* JADX WARN: Code duplicated, block: B:120:0x015e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0176  */
    /* JADX WARN: Code duplicated, block: B:124:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Y(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, @Nullable androidx.compose.foundation.layout.v6 v6Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.ui.graphics.q3 q3VarI;
        long jE;
        long j12;
        float f11;
        androidx.compose.foundation.layout.v6 v6VarK;
        int i13;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j13;
        final long j14;
        final float f12;
        final androidx.compose.foundation.layout.v6 v6Var2;
        androidx.compose.runtime.s5 s5VarT;
        int i14;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.graphics.q3 q3Var3;
        long j15;
        float f13;
        int i15;
        androidx.compose.ui.a0 a0Var5;
        long j16;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1922633461);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                q3VarI = q3Var;
                int i17 = c0VarR.D(q3VarI) ? 32 : 16;
                i12 |= i17;
            } else {
                q3VarI = q3Var;
            }
            i12 |= i17;
        } else {
            q3VarI = q3Var;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                jE = j10;
                int i18 = c0VarR.L(jE) ? 256 : 128;
                i12 |= i18;
            } else {
                jE = j10;
            }
            i12 |= i18;
        } else {
            jE = j10;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j12 = j11;
                int i19 = c0VarR.L(j12) ? 2048 : 1024;
                i12 |= i19;
            } else {
                j12 = j11;
            }
            i12 |= i19;
        } else {
            j12 = j11;
        }
        int i20 = i11 & 16;
        if (i20 == 0) {
            if ((i10 & 24576) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 16384 : 8192;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    v6VarK = v6Var;
                    int i21 = c0VarR.D(v6VarK) ? 131072 : 65536;
                    i12 |= i21;
                } else {
                    v6VarK = v6Var;
                }
                i12 |= i21;
            } else {
                v6VarK = v6Var;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i12 |= i13;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    i14 = 6;
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            q3VarI = xd.f34462a.i(c0VarR, 6);
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            jE = xd.f34462a.e(c0VarR, 6);
                        }
                        if ((i11 & 8) != 0) {
                            long jG = o6.g(jE, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                            j12 = jG;
                        }
                        if (i20 != 0) {
                            f11 = xd.f34462a.f();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            a0Var5 = a0Var4;
                            q3Var3 = q3VarI;
                            j15 = j12;
                            f13 = f11;
                            i14 = 6;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                            j16 = jE;
                            i15 = 1922633461;
                        } else {
                            q3Var3 = q3VarI;
                            j15 = j12;
                            f13 = f11;
                            i15 = 1922633461;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i15, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:597)");
                        }
                        int i22 = ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | i14;
                        int i23 = i12 << 6;
                        c0Var2 = c0VarR;
                        U(null, v6VarK, a0Var5, q3Var3, j16, j15, f13, null, nVar, c0Var2, i22 | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (458752 & i23) | (3670016 & i23) | (i23 & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        v6Var2 = v6VarK;
                        a0Var3 = a0Var5;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        j14 = j15;
                        f12 = f13;
                    } else {
                        c0VarR.u();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        q3Var3 = q3VarI;
                        j15 = j12;
                        f13 = f11;
                        i15 = 1922633461;
                        a0Var5 = a0Var2;
                    }
                    j16 = jE;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i15, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:597)");
                    }
                    int i24 = ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | i14;
                    int i25 = i12 << 6;
                    c0Var2 = c0VarR;
                    U(null, v6VarK, a0Var5, q3Var3, j16, j15, f13, null, nVar, c0Var2, i24 | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (i25 & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v6Var2 = v6VarK;
                    a0Var3 = a0Var5;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    j14 = j15;
                    f12 = f13;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarI;
                    j13 = jE;
                    j14 = j12;
                    f12 = f11;
                    v6Var2 = v6VarK;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.un
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.a0(a0Var3, q3Var2, j13, j14, f12, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                i14 = 6;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jE = xd.f34462a.e(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        long jG2 = o6.g(jE, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                        j12 = jG2;
                    }
                    if (i20 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3Var3 = q3VarI;
                        j15 = j12;
                        f13 = f11;
                        i14 = 6;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                        j16 = jE;
                        i15 = 1922633461;
                    } else {
                        q3Var3 = q3VarI;
                        j15 = j12;
                        f13 = f11;
                        i15 = 1922633461;
                        a0Var5 = a0Var4;
                        j16 = jE;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jE = xd.f34462a.e(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        long jG3 = o6.g(jE, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                        j12 = jG3;
                    }
                    if (i20 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3Var3 = q3VarI;
                        j15 = j12;
                        f13 = f11;
                        i14 = 6;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                        j16 = jE;
                        i15 = 1922633461;
                    } else {
                        q3Var3 = q3VarI;
                        j15 = j12;
                        f13 = f11;
                        i15 = 1922633461;
                        a0Var5 = a0Var4;
                        j16 = jE;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i15, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:597)");
                }
                int i26 = ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | i14;
                int i27 = i12 << 6;
                c0Var2 = c0VarR;
                U(null, v6VarK, a0Var5, q3Var3, j16, j15, f13, null, nVar, c0Var2, i26 | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (i27 & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var2 = v6VarK;
                a0Var3 = a0Var5;
                q3Var2 = q3Var3;
                j13 = j16;
                j14 = j15;
                f12 = f13;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarI;
                j13 = jE;
                j14 = j12;
                f12 = f11;
                v6Var2 = v6VarK;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.un
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.a0(a0Var3, q3Var2, j13, j14, f12, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        f11 = f10;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                v6VarK = v6Var;
                if (c0VarR.D(v6VarK)) {
                }
                i12 |= i21;
            } else {
                v6VarK = v6Var;
            }
            i12 |= i21;
        } else {
            v6VarK = v6Var;
        }
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i12 |= i13;
            }
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                i14 = 6;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jE = xd.f34462a.e(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        long jG4 = o6.g(jE, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                        j12 = jG4;
                    }
                    if (i20 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3Var3 = q3VarI;
                        j15 = j12;
                        f13 = f11;
                        i14 = 6;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                        j16 = jE;
                        i15 = 1922633461;
                    } else {
                        q3Var3 = q3VarI;
                        j15 = j12;
                        f13 = f11;
                        i15 = 1922633461;
                        a0Var5 = a0Var4;
                        j16 = jE;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        q3VarI = xd.f34462a.i(c0VarR, 6);
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jE = xd.f34462a.e(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        long jG5 = o6.g(jE, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                        j12 = jG5;
                    }
                    if (i20 != 0) {
                        f11 = xd.f34462a.f();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3Var3 = q3VarI;
                        j15 = j12;
                        f13 = f11;
                        i14 = 6;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                        j16 = jE;
                        i15 = 1922633461;
                    } else {
                        q3Var3 = q3VarI;
                        j15 = j12;
                        f13 = f11;
                        i15 = 1922633461;
                        a0Var5 = a0Var4;
                        j16 = jE;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i15, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:597)");
                }
                int i28 = ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | i14;
                int i29 = i12 << 6;
                c0Var2 = c0VarR;
                U(null, v6VarK, a0Var5, q3Var3, j16, j15, f13, null, nVar, c0Var2, i28 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (i29 & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v6Var2 = v6VarK;
                a0Var3 = a0Var5;
                q3Var2 = q3Var3;
                j13 = j16;
                j14 = j15;
                f12 = f13;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarI;
                j13 = jE;
                j14 = j12;
                f12 = f11;
                v6Var2 = v6VarK;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.un
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.a0(a0Var3, q3Var2, j13, j14, f12, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        if ((599187 & i12) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            i14 = 6;
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    q3VarI = xd.f34462a.i(c0VarR, 6);
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jE = xd.f34462a.e(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    long jG6 = o6.g(jE, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                    j12 = jG6;
                }
                if (i20 != 0) {
                    f11 = xd.f34462a.f();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    a0Var5 = a0Var4;
                    q3Var3 = q3VarI;
                    j15 = j12;
                    f13 = f11;
                    i14 = 6;
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                    j16 = jE;
                    i15 = 1922633461;
                } else {
                    q3Var3 = q3VarI;
                    j15 = j12;
                    f13 = f11;
                    i15 = 1922633461;
                    a0Var5 = a0Var4;
                    j16 = jE;
                }
            } else {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    q3VarI = xd.f34462a.i(c0VarR, 6);
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jE = xd.f34462a.e(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    long jG7 = o6.g(jE, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                    j12 = jG7;
                }
                if (i20 != 0) {
                    f11 = xd.f34462a.f();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    a0Var5 = a0Var4;
                    q3Var3 = q3VarI;
                    j15 = j12;
                    f13 = f11;
                    i14 = 6;
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                    j16 = jE;
                    i15 = 1922633461;
                } else {
                    q3Var3 = q3VarI;
                    j15 = j12;
                    f13 = f11;
                    i15 = 1922633461;
                    a0Var5 = a0Var4;
                    j16 = jE;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i15, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:597)");
            }
            int i210 = ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | i14;
            int i211 = i12 << 6;
            c0Var2 = c0VarR;
            U(null, v6VarK, a0Var5, q3Var3, j16, j15, f13, null, nVar, c0Var2, i210 | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (3670016 & i211) | (i211 & 234881024), 128);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            v6Var2 = v6VarK;
            a0Var3 = a0Var5;
            q3Var2 = q3Var3;
            j13 = j16;
            j14 = j15;
            f12 = f13;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            q3Var2 = q3VarI;
            j13 = jE;
            j14 = j12;
            f12 = f11;
            v6Var2 = v6VarK;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.un
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.a0(a0Var3, q3Var2, j13, j14, f12, v6Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final androidx.compose.ui.a0 Y0(androidx.compose.ui.a0 a0Var, final yd ydVar, final boolean z10) {
        return androidx.compose.ui.graphics.q1.a(a0Var, new Function1() { // from class: androidx.compose.material3.wn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return no.Z0(ydVar, z10, (androidx.compose.ui.graphics.r1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(ee eeVar, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        X(eeVar, a0Var, q3Var, j10, j11, f10, v6Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(yd ydVar, boolean z10, androidx.compose.ui.graphics.r1 r1Var) {
        r1Var.z(N0(r1Var, ydVar));
        r1Var.C(O0(r1Var, ydVar));
        r1Var.W1(androidx.compose.ui.graphics.a4.a(z10 ? 1.0f : 0.0f, 0.5f));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Y(a0Var, q3Var, j10, j11, f10, v6Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final ee a1(@NotNull final ge geVar, @Nullable final Function1<? super ge, Boolean> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.ko
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(no.b1((ge) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2098699222, i10, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:305)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<ee, ge> c0VarC = ee.f27327h.c(function1);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && c0Var.K(geVar.ordinal())) || (i10 & 6) == 4;
        if ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.D(function1)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.material3.lo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return no.c1(geVar, function1);
                }
            };
            c0Var.Y(objI1);
        }
        ee eeVar = (ee) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return eeVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0159  */
    /* JADX WARN: Code duplicated, block: B:108:0x0171  */
    /* JADX WARN: Code duplicated, block: B:111:0x017a  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:130:0x0205  */
    /* JADX WARN: Code duplicated, block: B:133:0x0249  */
    /* JADX WARN: Code duplicated, block: B:136:0x0255  */
    /* JADX WARN: Code duplicated, block: B:137:0x0259  */
    /* JADX WARN: Code duplicated, block: B:140:0x027a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0288  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:157:0x032c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0330  */
    /* JADX WARN: Code duplicated, block: B:161:0x0334  */
    /* JADX WARN: Code duplicated, block: B:163:0x033a  */
    /* JADX WARN: Code duplicated, block: B:169:0x034d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0353  */
    /* JADX WARN: Code duplicated, block: B:174:0x0365  */
    /* JADX WARN: Code duplicated, block: B:176:0x036b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0379  */
    /* JADX WARN: Code duplicated, block: B:184:0x037f  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:189:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:197:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:200:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:202:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:208:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:210:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:213:0x0401  */
    /* JADX WARN: Code duplicated, block: B:215:0x0407  */
    /* JADX WARN: Code duplicated, block: B:221:0x0419  */
    /* JADX WARN: Code duplicated, block: B:223:0x041f  */
    /* JADX WARN: Code duplicated, block: B:226:0x044d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0459  */
    /* JADX WARN: Code duplicated, block: B:230:0x045d  */
    /* JADX WARN: Code duplicated, block: B:233:0x047c  */
    /* JADX WARN: Code duplicated, block: B:235:0x048a  */
    /* JADX WARN: Code duplicated, block: B:238:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:240:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:243:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void b0(@NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, @Nullable ee eeVar, boolean z10, long j10, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        final ee eeVarA1;
        int i13;
        int i14;
        long j11;
        int i15;
        boolean z11;
        final boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final ee eeVar2;
        final long j12;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean z13;
        long jH;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final kotlinx.coroutines.s0 s0Var;
        final String strB;
        final androidx.compose.ui.unit.d dVar;
        Object objI1;
        androidx.compose.runtime.n3 n3Var;
        boolean zD;
        Object objI2;
        float f10;
        final androidx.compose.runtime.k3 k3Var;
        final boolean z14;
        final androidx.compose.animation.core.y0 y0VarB;
        final androidx.compose.animation.core.y0 y0VarB2;
        final androidx.compose.animation.core.y0 y0VarB3;
        boolean zD2;
        Object objI3;
        boolean z15;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int iJ2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        boolean z16;
        boolean zK0;
        Object objI4;
        boolean zD3;
        Object objI5;
        boolean z17;
        Object objI6;
        boolean zD4;
        Object objI7;
        boolean zD5;
        Object objI8;
        int iJ3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        int i16;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4 = function2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1907430816);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function4) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    eeVarA1 = eeVar;
                    int i18 = c0VarR.D(eeVarA1) ? 256 : 128;
                    i12 |= i18;
                } else {
                    eeVarA1 = eeVar;
                }
                i12 |= i18;
            } else {
                eeVarA1 = eeVar;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.G(z10)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    j11 = j10;
                    if ((i11 & 16) == 0 || !c0VarR.L(j11)) {
                        i16 = 8192;
                    } else {
                        i16 = 16384;
                    }
                    i12 |= i16;
                } else {
                    j11 = j10;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function3)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jH = xd.f34462a.h(c0VarR, 6);
                        } else {
                            jH = j11;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        a0Var4 = a0Var2;
                        jH = j11;
                        z13 = z10;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1907430816, i12, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:338)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                    dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    zD = c0VarR.D(dVar);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        f10 = 0.0f;
                    } else {
                        f10 = 0.0f;
                        if (objI2 == aVar.a()) {
                        }
                        k3Var = (androidx.compose.runtime.k3) objI2;
                        d0.h1 h1Var = d0.h1.DefaultSpatial;
                        z14 = z13;
                        y0VarB = hm.b(h1Var, c0VarR, 6);
                        y0VarB2 = hm.b(h1Var, c0VarR, 6);
                        y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                        int i19 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                        long j13 = jH;
                        zD2 = ((i19 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                        objI3 = c0VarR.i0();
                        if (zD2 || objI3 == aVar.a()) {
                            final ee eeVar3 = eeVarA1;
                            objI3 = new Function0() { // from class: androidx.compose.material3.gn
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return no.c0(eeVar3, dVar, y0VarB2, y0VarB3, y0VarB);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.runtime.b2.m((Function0) objI3, c0VarR, 0);
                        if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.gestures.k.D(androidx.compose.foundation.layout.i6.f(a0Var4, f10, 1, null), eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                        androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
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
                        androidx.compose.ui.a0 a0Var5 = a0Var4;
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar4.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar4.g());
                        function2B = aVar4.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar4.f());
                        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                        iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar5);
                        function0A2 = aVar4.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD2, a1VarK2, aVar4.e());
                        androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar4.g());
                        function2B2 = aVar4.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                            c0VarD2.Y(Integer.valueOf(iJ2));
                            c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                        }
                        androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar4.f());
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 15) & 14));
                        c0VarR.o();
                        boolean z18 = eeVarA1.z();
                        if ((i12 & 7168) == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zK0 = ((i19 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | z16 | c0VarR.k0(s0Var);
                        objI4 = c0VarR.i0();
                        if (zK0 || objI4 == aVar.a()) {
                            objI4 = new Function0() { // from class: androidx.compose.material3.hn
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return no.d0(z14, eeVarA1, s0Var);
                                }
                            };
                            c0VarR.Y(objI4);
                        }
                        Function0 function0 = (Function0) objI4;
                        zD3 = c0VarR.D(k3Var) | ((i19 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                        objI5 = c0VarR.i0();
                        if (zD3 || objI5 == aVar.a()) {
                            final float f11 = 0.0f;
                            objI5 = new Function0() { // from class: androidx.compose.material3.in
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(no.e0(f11, eeVarA1, k3Var));
                                }
                            };
                            c0VarR.Y(objI5);
                        }
                        v0(z18, function0, (Function0) objI5, j13, c0VarR, (i12 >> 3) & 7168);
                        z17 = (i19 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256;
                        objI6 = c0VarR.i0();
                        if (z17 || objI6 == aVar.a()) {
                            objI6 = new Function1() { // from class: androidx.compose.material3.jn
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                                }
                            };
                            c0VarR.Y(objI6);
                        }
                        androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.layout.s4.j(aVar5, (Function1) objI6);
                        zD4 = c0VarR.D(strB) | ((i19 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                        objI7 = c0VarR.i0();
                        if (zD4 || objI7 == aVar.a()) {
                            objI7 = new Function1() { // from class: androidx.compose.material3.kn
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI7);
                        }
                        androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarJ, false, (Function1) objI7, 1, null);
                        zD5 = c0VarR.D(k3Var) | ((i19 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                        objI8 = c0VarR.i0();
                        if (zD5 || objI8 == aVar.a()) {
                            objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                            c0VarR.Y(objI8);
                        }
                        androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI8;
                        int i20 = i12 & 14;
                        iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarF);
                        function0A3 = aVar4.a();
                        int i21 = ((i20 << 6) & 896) | 6;
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A3);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD3, a1Var, aVar4.e());
                        androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar4.g());
                        function2B3 = aVar4.b();
                        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                            c0VarD3.Y(Integer.valueOf(iJ3));
                            c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                        }
                        androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar4.f());
                        function4 = function2;
                        function4.invoke(c0VarR, Integer.valueOf((i21 >> 6) & 14));
                        c0VarR.o();
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        eeVar2 = eeVarA1;
                        j12 = j13;
                        a0Var3 = a0Var5;
                        z12 = z14;
                    }
                    objI2 = androidx.compose.runtime.g4.b(f10);
                    c0VarR.Y(objI2);
                    k3Var = (androidx.compose.runtime.k3) objI2;
                    d0.h1 h1Var2 = d0.h1.DefaultSpatial;
                    z14 = z13;
                    y0VarB = hm.b(h1Var2, c0VarR, 6);
                    y0VarB2 = hm.b(h1Var2, c0VarR, 6);
                    y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    int i110 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    long j14 = jH;
                    zD2 = ((i110 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        final ee eeVar4 = eeVarA1;
                        objI3 = new Function0() { // from class: androidx.compose.material3.gn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.c0(eeVar4, dVar, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        final ee eeVar5 = eeVarA1;
                        objI3 = new Function0() { // from class: androidx.compose.material3.gn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.c0(eeVar5, dVar, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI3, c0VarR, 0);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    androidx.compose.ui.a0 a0VarD2 = androidx.compose.foundation.gestures.k.D(androidx.compose.foundation.layout.i6.f(a0Var4, f10, 1, null), eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                    androidx.compose.ui.e.a aVar6 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar6.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarD2);
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
                    androidx.compose.ui.a0 a0Var6 = a0Var4;
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK3, aVar7.e());
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
                    androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar6.C(), false);
                    iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, aVar8);
                    function0A2 = aVar7.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD2, a1VarK4, aVar7.e());
                    androidx.compose.runtime.y7.n(c0VarD2, b1VarK5, aVar7.g());
                    function2B2 = aVar7.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD2, a0VarN5, aVar7.f());
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 15) & 14));
                    c0VarR.o();
                    boolean z19 = eeVarA1.z();
                    if ((i12 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zK0 = ((i110 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | z16 | c0VarR.k0(s0Var);
                    objI4 = c0VarR.i0();
                    if (zK0) {
                        objI4 = new Function0() { // from class: androidx.compose.material3.hn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.d0(z14, eeVarA1, s0Var);
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material3.hn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.d0(z14, eeVarA1, s0Var);
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    Function0 function1 = (Function0) objI4;
                    zD3 = c0VarR.D(k3Var) | ((i110 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                    objI5 = c0VarR.i0();
                    if (zD3) {
                        final float f12 = 0.0f;
                        objI5 = new Function0() { // from class: androidx.compose.material3.in
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(no.e0(f12, eeVarA1, k3Var));
                            }
                        };
                        c0VarR.Y(objI5);
                    } else {
                        final float f13 = 0.0f;
                        objI5 = new Function0() { // from class: androidx.compose.material3.in
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(no.e0(f13, eeVarA1, k3Var));
                            }
                        };
                        c0VarR.Y(objI5);
                    }
                    v0(z19, function1, (Function0) objI5, j14, c0VarR, (i12 >> 3) & 7168);
                    if (i110 <= 256) {
                    }
                    objI6 = c0VarR.i0();
                    if (z17) {
                        objI6 = new Function1() { // from class: androidx.compose.material3.jn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                            }
                        };
                        c0VarR.Y(objI6);
                    } else {
                        objI6 = new Function1() { // from class: androidx.compose.material3.jn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                            }
                        };
                        c0VarR.Y(objI6);
                    }
                    androidx.compose.ui.a0 a0VarJ2 = androidx.compose.foundation.layout.s4.j(aVar8, (Function1) objI6);
                    zD4 = c0VarR.D(strB) | ((i110 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    objI7 = c0VarR.i0();
                    if (zD4) {
                        objI7 = new Function1() { // from class: androidx.compose.material3.kn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI7);
                    } else {
                        objI7 = new Function1() { // from class: androidx.compose.material3.kn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI7);
                    }
                    androidx.compose.ui.a0 a0VarF2 = androidx.compose.ui.semantics.t.f(a0VarJ2, false, (Function1) objI7, 1, null);
                    zD5 = c0VarR.D(k3Var) | ((i110 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                    objI8 = c0VarR.i0();
                    if (zD5) {
                        objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                        c0VarR.Y(objI8);
                    } else {
                        objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                        c0VarR.Y(objI8);
                    }
                    androidx.compose.ui.layout.a1 a1Var2 = (androidx.compose.ui.layout.a1) objI8;
                    int i22 = i12 & 14;
                    iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
                    function0A3 = aVar7.a();
                    int i23 = ((i22 << 6) & 896) | 6;
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD3, a1Var2, aVar7.e());
                    androidx.compose.runtime.y7.n(c0VarD3, b1VarK6, aVar7.g());
                    function2B3 = aVar7.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    }
                    androidx.compose.runtime.y7.n(c0VarD3, a0VarN6, aVar7.f());
                    function4 = function2;
                    function4.invoke(c0VarR, Integer.valueOf((i23 >> 6) & 14));
                    c0VarR.o();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    eeVar2 = eeVarA1;
                    j12 = j14;
                    a0Var3 = a0Var6;
                    z12 = z14;
                } else {
                    c0VarR.u();
                    z12 = z10;
                    a0Var3 = a0Var2;
                    eeVar2 = eeVarA1;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ln
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.i0(function4, a0Var3, eeVar2, z12, j12, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            if ((i10 & 24576) == 0) {
                j11 = j10;
                if ((i11 & 16) == 0) {
                    i16 = 8192;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            } else {
                j11 = j10;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function3)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jH = xd.f34462a.h(c0VarR, 6);
                    } else {
                        jH = j11;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jH = xd.f34462a.h(c0VarR, 6);
                    } else {
                        jH = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1907430816, i12, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:338)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                androidx.compose.material3.internal.l3.a aVar9 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                zD = c0VarR.D(dVar);
                objI2 = c0VarR.i0();
                if (zD) {
                    f10 = 0.0f;
                    if (objI2 == aVar.a()) {
                    }
                    k3Var = (androidx.compose.runtime.k3) objI2;
                    d0.h1 h1Var3 = d0.h1.DefaultSpatial;
                    z14 = z13;
                    y0VarB = hm.b(h1Var3, c0VarR, 6);
                    y0VarB2 = hm.b(h1Var3, c0VarR, 6);
                    y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    int i111 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    long j15 = jH;
                    zD2 = ((i111 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        final ee eeVar6 = eeVarA1;
                        objI3 = new Function0() { // from class: androidx.compose.material3.gn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.c0(eeVar6, dVar, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        final ee eeVar7 = eeVarA1;
                        objI3 = new Function0() { // from class: androidx.compose.material3.gn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.c0(eeVar7, dVar, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI3, c0VarR, 0);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    androidx.compose.ui.a0 a0VarD3 = androidx.compose.foundation.gestures.k.D(androidx.compose.foundation.layout.i6.f(a0Var4, f10, 1, null), eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                    androidx.compose.ui.e.a aVar10 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(aVar10.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarD3);
                    androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                    function0A = aVar11.a();
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
                    androidx.compose.ui.a0 a0Var7 = a0Var4;
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK5, aVar11.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar11.g());
                    function2B = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar11.f());
                    androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(aVar10.C(), false);
                    iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, aVar12);
                    function0A2 = aVar11.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD2, a1VarK6, aVar11.e());
                    androidx.compose.runtime.y7.n(c0VarD2, b1VarK8, aVar11.g());
                    function2B2 = aVar11.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD2, a0VarN8, aVar11.f());
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 15) & 14));
                    c0VarR.o();
                    boolean z110 = eeVarA1.z();
                    if ((i12 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zK0 = ((i111 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | z16 | c0VarR.k0(s0Var);
                    objI4 = c0VarR.i0();
                    if (zK0) {
                        objI4 = new Function0() { // from class: androidx.compose.material3.hn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.d0(z14, eeVarA1, s0Var);
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material3.hn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.d0(z14, eeVarA1, s0Var);
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    Function0 function5 = (Function0) objI4;
                    zD3 = c0VarR.D(k3Var) | ((i111 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                    objI5 = c0VarR.i0();
                    if (zD3) {
                        final float f14 = 0.0f;
                        objI5 = new Function0() { // from class: androidx.compose.material3.in
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(no.e0(f14, eeVarA1, k3Var));
                            }
                        };
                        c0VarR.Y(objI5);
                    } else {
                        final float f15 = 0.0f;
                        objI5 = new Function0() { // from class: androidx.compose.material3.in
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(no.e0(f15, eeVarA1, k3Var));
                            }
                        };
                        c0VarR.Y(objI5);
                    }
                    v0(z110, function5, (Function0) objI5, j15, c0VarR, (i12 >> 3) & 7168);
                    if (i111 <= 256) {
                    }
                    objI6 = c0VarR.i0();
                    if (z17) {
                        objI6 = new Function1() { // from class: androidx.compose.material3.jn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                            }
                        };
                        c0VarR.Y(objI6);
                    } else {
                        objI6 = new Function1() { // from class: androidx.compose.material3.jn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                            }
                        };
                        c0VarR.Y(objI6);
                    }
                    androidx.compose.ui.a0 a0VarJ3 = androidx.compose.foundation.layout.s4.j(aVar12, (Function1) objI6);
                    zD4 = c0VarR.D(strB) | ((i111 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    objI7 = c0VarR.i0();
                    if (zD4) {
                        objI7 = new Function1() { // from class: androidx.compose.material3.kn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI7);
                    } else {
                        objI7 = new Function1() { // from class: androidx.compose.material3.kn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI7);
                    }
                    androidx.compose.ui.a0 a0VarF3 = androidx.compose.ui.semantics.t.f(a0VarJ3, false, (Function1) objI7, 1, null);
                    zD5 = c0VarR.D(k3Var) | ((i111 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                    objI8 = c0VarR.i0();
                    if (zD5) {
                        objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                        c0VarR.Y(objI8);
                    } else {
                        objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                        c0VarR.Y(objI8);
                    }
                    androidx.compose.ui.layout.a1 a1Var3 = (androidx.compose.ui.layout.a1) objI8;
                    int i24 = i12 & 14;
                    iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
                    function0A3 = aVar11.a();
                    int i25 = ((i24 << 6) & 896) | 6;
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD3, a1Var3, aVar11.e());
                    androidx.compose.runtime.y7.n(c0VarD3, b1VarK9, aVar11.g());
                    function2B3 = aVar11.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    }
                    androidx.compose.runtime.y7.n(c0VarD3, a0VarN9, aVar11.f());
                    function4 = function2;
                    function4.invoke(c0VarR, Integer.valueOf((i25 >> 6) & 14));
                    c0VarR.o();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    eeVar2 = eeVarA1;
                    j12 = j15;
                    a0Var3 = a0Var7;
                    z12 = z14;
                } else {
                    f10 = 0.0f;
                }
                objI2 = androidx.compose.runtime.g4.b(f10);
                c0VarR.Y(objI2);
                k3Var = (androidx.compose.runtime.k3) objI2;
                d0.h1 h1Var4 = d0.h1.DefaultSpatial;
                z14 = z13;
                y0VarB = hm.b(h1Var4, c0VarR, 6);
                y0VarB2 = hm.b(h1Var4, c0VarR, 6);
                y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                int i112 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                long j16 = jH;
                zD2 = ((i112 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                objI3 = c0VarR.i0();
                if (zD2) {
                    final ee eeVar8 = eeVarA1;
                    objI3 = new Function0() { // from class: androidx.compose.material3.gn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.c0(eeVar8, dVar, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    final ee eeVar9 = eeVarA1;
                    objI3 = new Function0() { // from class: androidx.compose.material3.gn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.c0(eeVar9, dVar, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.runtime.b2.m((Function0) objI3, c0VarR, 0);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                androidx.compose.ui.a0 a0VarD4 = androidx.compose.foundation.gestures.k.D(androidx.compose.foundation.layout.i6.f(a0Var4, f10, 1, null), eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                androidx.compose.ui.e.a aVar13 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(aVar13.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarD4);
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
                androidx.compose.ui.a0 a0Var8 = a0Var4;
                androidx.compose.runtime.y7.n(c0VarD, a1VarK7, aVar14.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK10, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN10, aVar14.f());
                androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(aVar13.C(), false);
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, aVar15);
                function0A2 = aVar14.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD2, a1VarK8, aVar14.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK11, aVar14.g());
                function2B2 = aVar14.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN11, aVar14.f());
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 15) & 14));
                c0VarR.o();
                boolean z111 = eeVarA1.z();
                if ((i12 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zK0 = ((i112 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | z16 | c0VarR.k0(s0Var);
                objI4 = c0VarR.i0();
                if (zK0) {
                    objI4 = new Function0() { // from class: androidx.compose.material3.hn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.d0(z14, eeVarA1, s0Var);
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material3.hn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.d0(z14, eeVarA1, s0Var);
                        }
                    };
                    c0VarR.Y(objI4);
                }
                Function0 function6 = (Function0) objI4;
                zD3 = c0VarR.D(k3Var) | ((i112 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                objI5 = c0VarR.i0();
                if (zD3) {
                    final float f16 = 0.0f;
                    objI5 = new Function0() { // from class: androidx.compose.material3.in
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(no.e0(f16, eeVarA1, k3Var));
                        }
                    };
                    c0VarR.Y(objI5);
                } else {
                    final float f17 = 0.0f;
                    objI5 = new Function0() { // from class: androidx.compose.material3.in
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(no.e0(f17, eeVarA1, k3Var));
                        }
                    };
                    c0VarR.Y(objI5);
                }
                v0(z111, function6, (Function0) objI5, j16, c0VarR, (i12 >> 3) & 7168);
                if (i112 <= 256) {
                }
                objI6 = c0VarR.i0();
                if (z17) {
                    objI6 = new Function1() { // from class: androidx.compose.material3.jn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                        }
                    };
                    c0VarR.Y(objI6);
                } else {
                    objI6 = new Function1() { // from class: androidx.compose.material3.jn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                        }
                    };
                    c0VarR.Y(objI6);
                }
                androidx.compose.ui.a0 a0VarJ4 = androidx.compose.foundation.layout.s4.j(aVar15, (Function1) objI6);
                zD4 = c0VarR.D(strB) | ((i112 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                objI7 = c0VarR.i0();
                if (zD4) {
                    objI7 = new Function1() { // from class: androidx.compose.material3.kn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI7);
                } else {
                    objI7 = new Function1() { // from class: androidx.compose.material3.kn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI7);
                }
                androidx.compose.ui.a0 a0VarF4 = androidx.compose.ui.semantics.t.f(a0VarJ4, false, (Function1) objI7, 1, null);
                zD5 = c0VarR.D(k3Var) | ((i112 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                objI8 = c0VarR.i0();
                if (zD5) {
                    objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                    c0VarR.Y(objI8);
                } else {
                    objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                    c0VarR.Y(objI8);
                }
                androidx.compose.ui.layout.a1 a1Var4 = (androidx.compose.ui.layout.a1) objI8;
                int i26 = i12 & 14;
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarF4);
                function0A3 = aVar14.a();
                int i27 = ((i26 << 6) & 896) | 6;
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1Var4, aVar14.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK12, aVar14.g());
                function2B3 = aVar14.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN12, aVar14.f());
                function4 = function2;
                function4.invoke(c0VarR, Integer.valueOf((i27 >> 6) & 14));
                c0VarR.o();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                eeVar2 = eeVarA1;
                j12 = j16;
                a0Var3 = a0Var8;
                z12 = z14;
            } else {
                c0VarR.u();
                z12 = z10;
                a0Var3 = a0Var2;
                eeVar2 = eeVarA1;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ln
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.i0(function4, a0Var3, eeVar2, z12, j12, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                eeVarA1 = eeVar;
                if (c0VarR.D(eeVarA1)) {
                }
                i12 |= i18;
            } else {
                eeVarA1 = eeVar;
            }
            i12 |= i18;
        } else {
            eeVarA1 = eeVar;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.G(z10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                j11 = j10;
                if ((i11 & 16) == 0) {
                    i16 = 8192;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            } else {
                j11 = j10;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function3)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jH = xd.f34462a.h(c0VarR, 6);
                    } else {
                        jH = j11;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jH = xd.f34462a.h(c0VarR, 6);
                    } else {
                        jH = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1907430816, i12, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:338)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                androidx.compose.material3.internal.l3.a aVar16 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                zD = c0VarR.D(dVar);
                objI2 = c0VarR.i0();
                if (zD) {
                    f10 = 0.0f;
                    if (objI2 == aVar.a()) {
                    }
                    k3Var = (androidx.compose.runtime.k3) objI2;
                    d0.h1 h1Var5 = d0.h1.DefaultSpatial;
                    z14 = z13;
                    y0VarB = hm.b(h1Var5, c0VarR, 6);
                    y0VarB2 = hm.b(h1Var5, c0VarR, 6);
                    y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    int i113 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    long j17 = jH;
                    zD2 = ((i113 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        final ee eeVar10 = eeVarA1;
                        objI3 = new Function0() { // from class: androidx.compose.material3.gn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.c0(eeVar10, dVar, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        final ee eeVar11 = eeVarA1;
                        objI3 = new Function0() { // from class: androidx.compose.material3.gn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.c0(eeVar11, dVar, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI3, c0VarR, 0);
                    if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    androidx.compose.ui.a0 a0VarD5 = androidx.compose.foundation.gestures.k.D(androidx.compose.foundation.layout.i6.f(a0Var4, f10, 1, null), eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                    androidx.compose.ui.e.a aVar17 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(aVar17.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarD5);
                    androidx.compose.ui.node.g.a aVar18 = androidx.compose.ui.node.g.I;
                    function0A = aVar18.a();
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
                    androidx.compose.ui.a0 a0Var9 = a0Var4;
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK9, aVar18.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK13, aVar18.g());
                    function2B = aVar18.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar18.f());
                    androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.ui.a0.a aVar19 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(aVar17.C(), false);
                    iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, aVar19);
                    function0A2 = aVar18.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD2, a1VarK10, aVar18.e());
                    androidx.compose.runtime.y7.n(c0VarD2, b1VarK14, aVar18.g());
                    function2B2 = aVar18.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD2, a0VarN14, aVar18.f());
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 15) & 14));
                    c0VarR.o();
                    boolean z112 = eeVarA1.z();
                    if ((i12 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zK0 = ((i113 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | z16 | c0VarR.k0(s0Var);
                    objI4 = c0VarR.i0();
                    if (zK0) {
                        objI4 = new Function0() { // from class: androidx.compose.material3.hn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.d0(z14, eeVarA1, s0Var);
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material3.hn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return no.d0(z14, eeVarA1, s0Var);
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    Function0 function7 = (Function0) objI4;
                    zD3 = c0VarR.D(k3Var) | ((i113 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                    objI5 = c0VarR.i0();
                    if (zD3) {
                        final float f18 = 0.0f;
                        objI5 = new Function0() { // from class: androidx.compose.material3.in
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(no.e0(f18, eeVarA1, k3Var));
                            }
                        };
                        c0VarR.Y(objI5);
                    } else {
                        final float f19 = 0.0f;
                        objI5 = new Function0() { // from class: androidx.compose.material3.in
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(no.e0(f19, eeVarA1, k3Var));
                            }
                        };
                        c0VarR.Y(objI5);
                    }
                    v0(z112, function7, (Function0) objI5, j17, c0VarR, (i12 >> 3) & 7168);
                    if (i113 <= 256) {
                    }
                    objI6 = c0VarR.i0();
                    if (z17) {
                        objI6 = new Function1() { // from class: androidx.compose.material3.jn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                            }
                        };
                        c0VarR.Y(objI6);
                    } else {
                        objI6 = new Function1() { // from class: androidx.compose.material3.jn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                            }
                        };
                        c0VarR.Y(objI6);
                    }
                    androidx.compose.ui.a0 a0VarJ5 = androidx.compose.foundation.layout.s4.j(aVar19, (Function1) objI6);
                    zD4 = c0VarR.D(strB) | ((i113 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    objI7 = c0VarR.i0();
                    if (zD4) {
                        objI7 = new Function1() { // from class: androidx.compose.material3.kn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI7);
                    } else {
                        objI7 = new Function1() { // from class: androidx.compose.material3.kn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI7);
                    }
                    androidx.compose.ui.a0 a0VarF5 = androidx.compose.ui.semantics.t.f(a0VarJ5, false, (Function1) objI7, 1, null);
                    zD5 = c0VarR.D(k3Var) | ((i113 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                    objI8 = c0VarR.i0();
                    if (zD5) {
                        objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                        c0VarR.Y(objI8);
                    } else {
                        objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                        c0VarR.Y(objI8);
                    }
                    androidx.compose.ui.layout.a1 a1Var5 = (androidx.compose.ui.layout.a1) objI8;
                    int i28 = i12 & 14;
                    iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarF5);
                    function0A3 = aVar18.a();
                    int i29 = ((i28 << 6) & 896) | 6;
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD3, a1Var5, aVar18.e());
                    androidx.compose.runtime.y7.n(c0VarD3, b1VarK15, aVar18.g());
                    function2B3 = aVar18.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    }
                    androidx.compose.runtime.y7.n(c0VarD3, a0VarN15, aVar18.f());
                    function4 = function2;
                    function4.invoke(c0VarR, Integer.valueOf((i29 >> 6) & 14));
                    c0VarR.o();
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    eeVar2 = eeVarA1;
                    j12 = j17;
                    a0Var3 = a0Var9;
                    z12 = z14;
                } else {
                    f10 = 0.0f;
                }
                objI2 = androidx.compose.runtime.g4.b(f10);
                c0VarR.Y(objI2);
                k3Var = (androidx.compose.runtime.k3) objI2;
                d0.h1 h1Var6 = d0.h1.DefaultSpatial;
                z14 = z13;
                y0VarB = hm.b(h1Var6, c0VarR, 6);
                y0VarB2 = hm.b(h1Var6, c0VarR, 6);
                y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                int i114 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                long j18 = jH;
                zD2 = ((i114 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                objI3 = c0VarR.i0();
                if (zD2) {
                    final ee eeVar12 = eeVarA1;
                    objI3 = new Function0() { // from class: androidx.compose.material3.gn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.c0(eeVar12, dVar, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    final ee eeVar13 = eeVarA1;
                    objI3 = new Function0() { // from class: androidx.compose.material3.gn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.c0(eeVar13, dVar, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.runtime.b2.m((Function0) objI3, c0VarR, 0);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                androidx.compose.ui.a0 a0VarD6 = androidx.compose.foundation.gestures.k.D(androidx.compose.foundation.layout.i6.f(a0Var4, f10, 1, null), eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                androidx.compose.ui.e.a aVar110 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(aVar110.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarD6);
                androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                function0A = aVar111.a();
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
                androidx.compose.ui.a0 a0Var10 = a0Var4;
                androidx.compose.runtime.y7.n(c0VarD, a1VarK11, aVar111.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK16, aVar111.g());
                function2B = aVar111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN16, aVar111.f());
                androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.ui.a0.a aVar112 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(aVar110.C(), false);
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, aVar112);
                function0A2 = aVar111.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD2, a1VarK12, aVar111.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK17, aVar111.g());
                function2B2 = aVar111.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN17, aVar111.f());
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 15) & 14));
                c0VarR.o();
                boolean z113 = eeVarA1.z();
                if ((i12 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zK0 = ((i114 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | z16 | c0VarR.k0(s0Var);
                objI4 = c0VarR.i0();
                if (zK0) {
                    objI4 = new Function0() { // from class: androidx.compose.material3.hn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.d0(z14, eeVarA1, s0Var);
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material3.hn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.d0(z14, eeVarA1, s0Var);
                        }
                    };
                    c0VarR.Y(objI4);
                }
                Function0 function8 = (Function0) objI4;
                zD3 = c0VarR.D(k3Var) | ((i114 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                objI5 = c0VarR.i0();
                if (zD3) {
                    final float f110 = 0.0f;
                    objI5 = new Function0() { // from class: androidx.compose.material3.in
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(no.e0(f110, eeVarA1, k3Var));
                        }
                    };
                    c0VarR.Y(objI5);
                } else {
                    final float f111 = 0.0f;
                    objI5 = new Function0() { // from class: androidx.compose.material3.in
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(no.e0(f111, eeVarA1, k3Var));
                        }
                    };
                    c0VarR.Y(objI5);
                }
                v0(z113, function8, (Function0) objI5, j18, c0VarR, (i12 >> 3) & 7168);
                if (i114 <= 256) {
                }
                objI6 = c0VarR.i0();
                if (z17) {
                    objI6 = new Function1() { // from class: androidx.compose.material3.jn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                        }
                    };
                    c0VarR.Y(objI6);
                } else {
                    objI6 = new Function1() { // from class: androidx.compose.material3.jn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                        }
                    };
                    c0VarR.Y(objI6);
                }
                androidx.compose.ui.a0 a0VarJ6 = androidx.compose.foundation.layout.s4.j(aVar112, (Function1) objI6);
                zD4 = c0VarR.D(strB) | ((i114 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                objI7 = c0VarR.i0();
                if (zD4) {
                    objI7 = new Function1() { // from class: androidx.compose.material3.kn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI7);
                } else {
                    objI7 = new Function1() { // from class: androidx.compose.material3.kn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI7);
                }
                androidx.compose.ui.a0 a0VarF6 = androidx.compose.ui.semantics.t.f(a0VarJ6, false, (Function1) objI7, 1, null);
                zD5 = c0VarR.D(k3Var) | ((i114 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                objI8 = c0VarR.i0();
                if (zD5) {
                    objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                    c0VarR.Y(objI8);
                } else {
                    objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                    c0VarR.Y(objI8);
                }
                androidx.compose.ui.layout.a1 a1Var6 = (androidx.compose.ui.layout.a1) objI8;
                int i210 = i12 & 14;
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarF6);
                function0A3 = aVar111.a();
                int i211 = ((i210 << 6) & 896) | 6;
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1Var6, aVar111.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK18, aVar111.g());
                function2B3 = aVar111.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN18, aVar111.f());
                function4 = function2;
                function4.invoke(c0VarR, Integer.valueOf((i211 >> 6) & 14));
                c0VarR.o();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                eeVar2 = eeVarA1;
                j12 = j18;
                a0Var3 = a0Var10;
                z12 = z14;
            } else {
                c0VarR.u();
                z12 = z10;
                a0Var3 = a0Var2;
                eeVar2 = eeVarA1;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ln
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.i0(function4, a0Var3, eeVar2, z12, j12, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        if ((i10 & 24576) == 0) {
            j11 = j10;
            if ((i11 & 16) == 0) {
                i16 = 8192;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        } else {
            j11 = j10;
        }
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(function3)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        if ((74899 & i12) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jH = xd.f34462a.h(c0VarR, 6);
                } else {
                    jH = j11;
                }
            } else {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    eeVarA1 = a1(ge.Closed, null, c0VarR, 6, 2);
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jH = xd.f34462a.h(c0VarR, 6);
                } else {
                    jH = j11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1907430816, i12, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:338)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            s0Var = (kotlinx.coroutines.s0) objI0;
            androidx.compose.material3.internal.l3.a aVar113 = androidx.compose.material3.internal.l3.f29010b;
            strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
            dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI1);
            }
            n3Var = (androidx.compose.runtime.n3) objI1;
            zD = c0VarR.D(dVar);
            objI2 = c0VarR.i0();
            if (zD) {
                f10 = 0.0f;
                if (objI2 == aVar.a()) {
                }
                k3Var = (androidx.compose.runtime.k3) objI2;
                d0.h1 h1Var7 = d0.h1.DefaultSpatial;
                z14 = z13;
                y0VarB = hm.b(h1Var7, c0VarR, 6);
                y0VarB2 = hm.b(h1Var7, c0VarR, 6);
                y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                int i115 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
                long j19 = jH;
                zD2 = ((i115 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                objI3 = c0VarR.i0();
                if (zD2) {
                    final ee eeVar14 = eeVarA1;
                    objI3 = new Function0() { // from class: androidx.compose.material3.gn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.c0(eeVar14, dVar, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    final ee eeVar15 = eeVarA1;
                    objI3 = new Function0() { // from class: androidx.compose.material3.gn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.c0(eeVar15, dVar, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.runtime.b2.m((Function0) objI3, c0VarR, 0);
                if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                androidx.compose.ui.a0 a0VarD7 = androidx.compose.foundation.gestures.k.D(androidx.compose.foundation.layout.i6.f(a0Var4, f10, 1, null), eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
                androidx.compose.ui.e.a aVar114 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(aVar114.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarD7);
                androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                function0A = aVar115.a();
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
                androidx.compose.ui.a0 a0Var11 = a0Var4;
                androidx.compose.runtime.y7.n(c0VarD, a1VarK13, aVar115.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK19, aVar115.g());
                function2B = aVar115.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN19, aVar115.f());
                androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.ui.a0.a aVar116 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(aVar114.C(), false);
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, aVar116);
                function0A2 = aVar115.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD2, a1VarK14, aVar115.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK110, aVar115.g());
                function2B2 = aVar115.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN110, aVar115.f());
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 15) & 14));
                c0VarR.o();
                boolean z114 = eeVarA1.z();
                if ((i12 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zK0 = ((i115 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | z16 | c0VarR.k0(s0Var);
                objI4 = c0VarR.i0();
                if (zK0) {
                    objI4 = new Function0() { // from class: androidx.compose.material3.hn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.d0(z14, eeVarA1, s0Var);
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material3.hn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return no.d0(z14, eeVarA1, s0Var);
                        }
                    };
                    c0VarR.Y(objI4);
                }
                Function0 function9 = (Function0) objI4;
                zD3 = c0VarR.D(k3Var) | ((i115 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                objI5 = c0VarR.i0();
                if (zD3) {
                    final float f112 = 0.0f;
                    objI5 = new Function0() { // from class: androidx.compose.material3.in
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(no.e0(f112, eeVarA1, k3Var));
                        }
                    };
                    c0VarR.Y(objI5);
                } else {
                    final float f113 = 0.0f;
                    objI5 = new Function0() { // from class: androidx.compose.material3.in
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(no.e0(f113, eeVarA1, k3Var));
                        }
                    };
                    c0VarR.Y(objI5);
                }
                v0(z114, function9, (Function0) objI5, j19, c0VarR, (i12 >> 3) & 7168);
                if (i115 <= 256) {
                }
                objI6 = c0VarR.i0();
                if (z17) {
                    objI6 = new Function1() { // from class: androidx.compose.material3.jn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                        }
                    };
                    c0VarR.Y(objI6);
                } else {
                    objI6 = new Function1() { // from class: androidx.compose.material3.jn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                        }
                    };
                    c0VarR.Y(objI6);
                }
                androidx.compose.ui.a0 a0VarJ7 = androidx.compose.foundation.layout.s4.j(aVar116, (Function1) objI6);
                zD4 = c0VarR.D(strB) | ((i115 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                objI7 = c0VarR.i0();
                if (zD4) {
                    objI7 = new Function1() { // from class: androidx.compose.material3.kn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI7);
                } else {
                    objI7 = new Function1() { // from class: androidx.compose.material3.kn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI7);
                }
                androidx.compose.ui.a0 a0VarF7 = androidx.compose.ui.semantics.t.f(a0VarJ7, false, (Function1) objI7, 1, null);
                zD5 = c0VarR.D(k3Var) | ((i115 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
                objI8 = c0VarR.i0();
                if (zD5) {
                    objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                    c0VarR.Y(objI8);
                } else {
                    objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                    c0VarR.Y(objI8);
                }
                androidx.compose.ui.layout.a1 a1Var7 = (androidx.compose.ui.layout.a1) objI8;
                int i212 = i12 & 14;
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarF7);
                function0A3 = aVar115.a();
                int i213 = ((i212 << 6) & 896) | 6;
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1Var7, aVar115.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK111, aVar115.g());
                function2B3 = aVar115.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN111, aVar115.f());
                function4 = function2;
                function4.invoke(c0VarR, Integer.valueOf((i213 >> 6) & 14));
                c0VarR.o();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                eeVar2 = eeVarA1;
                j12 = j19;
                a0Var3 = a0Var11;
                z12 = z14;
            } else {
                f10 = 0.0f;
            }
            objI2 = androidx.compose.runtime.g4.b(f10);
            c0VarR.Y(objI2);
            k3Var = (androidx.compose.runtime.k3) objI2;
            d0.h1 h1Var8 = d0.h1.DefaultSpatial;
            z14 = z13;
            y0VarB = hm.b(h1Var8, c0VarR, 6);
            y0VarB2 = hm.b(h1Var8, c0VarR, 6);
            y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
            int i116 = (i12 & 896) ^ androidx.media3.exoplayer.a5.S0;
            long j110 = jH;
            zD2 = ((i116 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(dVar) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
            objI3 = c0VarR.i0();
            if (zD2) {
                final ee eeVar16 = eeVarA1;
                objI3 = new Function0() { // from class: androidx.compose.material3.gn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return no.c0(eeVar16, dVar, y0VarB2, y0VarB3, y0VarB);
                    }
                };
                c0VarR.Y(objI3);
            } else {
                final ee eeVar17 = eeVarA1;
                objI3 = new Function0() { // from class: androidx.compose.material3.gn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return no.c0(eeVar17, dVar, y0VarB2, y0VarB3, y0VarB);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.runtime.b2.m((Function0) objI3, c0VarR, 0);
            if (c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl) {
                z15 = true;
            } else {
                z15 = false;
            }
            androidx.compose.ui.a0 a0VarD8 = androidx.compose.foundation.gestures.k.D(androidx.compose.foundation.layout.i6.f(a0Var4, f10, 1, null), eeVarA1.m(), z15, androidx.compose.foundation.gestures.q3.Horizontal, z14, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
            androidx.compose.ui.e.a aVar117 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(aVar117.C(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarD8);
            androidx.compose.ui.node.g.a aVar118 = androidx.compose.ui.node.g.I;
            function0A = aVar118.a();
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
            androidx.compose.ui.a0 a0Var12 = a0Var4;
            androidx.compose.runtime.y7.n(c0VarD, a1VarK15, aVar118.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK112, aVar118.g());
            function2B = aVar118.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN112, aVar118.f());
            androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.a0.a aVar119 = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK16 = androidx.compose.foundation.layout.x.k(aVar117.C(), false);
            iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, aVar119);
            function0A2 = aVar118.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK16, aVar118.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK113, aVar118.g());
            function2B2 = aVar118.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN113, aVar118.f());
            function3.invoke(c0VarR, Integer.valueOf((i12 >> 15) & 14));
            c0VarR.o();
            boolean z115 = eeVarA1.z();
            if ((i12 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            zK0 = ((i116 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | z16 | c0VarR.k0(s0Var);
            objI4 = c0VarR.i0();
            if (zK0) {
                objI4 = new Function0() { // from class: androidx.compose.material3.hn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return no.d0(z14, eeVarA1, s0Var);
                    }
                };
                c0VarR.Y(objI4);
            } else {
                objI4 = new Function0() { // from class: androidx.compose.material3.hn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return no.d0(z14, eeVarA1, s0Var);
                    }
                };
                c0VarR.Y(objI4);
            }
            Function0 function10 = (Function0) objI4;
            zD3 = c0VarR.D(k3Var) | ((i116 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
            objI5 = c0VarR.i0();
            if (zD3) {
                final float f114 = 0.0f;
                objI5 = new Function0() { // from class: androidx.compose.material3.in
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(no.e0(f114, eeVarA1, k3Var));
                    }
                };
                c0VarR.Y(objI5);
            } else {
                final float f115 = 0.0f;
                objI5 = new Function0() { // from class: androidx.compose.material3.in
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(no.e0(f115, eeVarA1, k3Var));
                    }
                };
                c0VarR.Y(objI5);
            }
            v0(z115, function10, (Function0) objI5, j110, c0VarR, (i12 >> 3) & 7168);
            if (i116 <= 256) {
            }
            objI6 = c0VarR.i0();
            if (z17) {
                objI6 = new Function1() { // from class: androidx.compose.material3.jn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                    }
                };
                c0VarR.Y(objI6);
            } else {
                objI6 = new Function1() { // from class: androidx.compose.material3.jn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.f0(eeVarA1, (androidx.compose.ui.unit.d) obj);
                    }
                };
                c0VarR.Y(objI6);
            }
            androidx.compose.ui.a0 a0VarJ8 = androidx.compose.foundation.layout.s4.j(aVar119, (Function1) objI6);
            zD4 = c0VarR.D(strB) | ((i116 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
            objI7 = c0VarR.i0();
            if (zD4) {
                objI7 = new Function1() { // from class: androidx.compose.material3.kn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI7);
            } else {
                objI7 = new Function1() { // from class: androidx.compose.material3.kn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.g0(strB, eeVarA1, s0Var, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI7);
            }
            androidx.compose.ui.a0 a0VarF8 = androidx.compose.ui.semantics.t.f(a0VarJ8, false, (Function1) objI7, 1, null);
            zD5 = c0VarR.D(k3Var) | ((i116 <= 256 && c0VarR.D(eeVarA1)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256);
            objI8 = c0VarR.i0();
            if (zD5) {
                objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                c0VarR.Y(objI8);
            } else {
                objI8 = new j(eeVarA1, n3Var, k3Var, 0.0f);
                c0VarR.Y(objI8);
            }
            androidx.compose.ui.layout.a1 a1Var8 = (androidx.compose.ui.layout.a1) objI8;
            int i214 = i12 & 14;
            iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarF8);
            function0A3 = aVar118.a();
            int i215 = ((i214 << 6) & 896) | 6;
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD3, a1Var8, aVar118.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK114, aVar118.g());
            function2B3 = aVar118.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN114, aVar118.f());
            function4 = function2;
            function4.invoke(c0VarR, Integer.valueOf((i215 >> 6) & 14));
            c0VarR.o();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            eeVar2 = eeVarA1;
            j12 = j110;
            a0Var3 = a0Var12;
            z12 = z14;
        } else {
            c0VarR.u();
            z12 = z10;
            a0Var3 = a0Var2;
            eeVar2 = eeVarA1;
            j12 = j11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ln
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.i0(function4, a0Var3, eeVar2, z12, j12, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b1(ge geVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(ee eeVar, androidx.compose.ui.unit.d dVar, androidx.compose.animation.core.y0 y0Var, androidx.compose.animation.core.y0 y0Var2, androidx.compose.animation.core.y0 y0Var3) {
        eeVar.F(dVar);
        eeVar.G(y0Var);
        eeVar.E(y0Var2);
        eeVar.D(y0Var3);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ee c1(ge geVar, Function1 function1) {
        return new ee(geVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(boolean z10, ee eeVar, kotlinx.coroutines.s0 s0Var) {
        if (z10 && eeVar.p().invoke(ge.Closed).booleanValue()) {
            int i10 = 6 & 0;
            kotlinx.coroutines.k.f(s0Var, null, null, new h(eeVar, null), 3, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e0(float f10, ee eeVar, androidx.compose.runtime.k3 k3Var) {
        return M0(l0(k3Var), f10, eeVar.C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.q f0(ee eeVar, androidx.compose.ui.unit.d dVar) {
        int iL0;
        float fQ = eeVar.q();
        if (Float.isNaN(fQ)) {
            iL0 = eeVar.z() ? 0 : -dVar.g6(xd.f34462a.d());
        } else {
            iL0 = kotlin.math.b.L0(fQ);
        }
        return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) iL0) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(String str, final ee eeVar, final kotlinx.coroutines.s0 s0Var, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.G1(e0Var, str);
        if (eeVar.z()) {
            androidx.compose.ui.semantics.b0.p(e0Var, null, new Function0() { // from class: androidx.compose.material3.fn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(no.h0(eeVar, s0Var));
                }
            }, 1, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h0(ee eeVar, kotlinx.coroutines.s0 s0Var) {
        if (eeVar.p().invoke(ge.Closed).booleanValue()) {
            kotlinx.coroutines.k.f(s0Var, null, null, new i(eeVar, null), 3, null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(Function2 function2, androidx.compose.ui.a0 a0Var, ee eeVar, boolean z10, long j10, Function2 function3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b0(function2, a0Var, eeVar, z10, j10, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j0(androidx.compose.runtime.n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(androidx.compose.runtime.n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l0(androidx.compose.runtime.k3 k3Var) {
        return k3Var.V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(androidx.compose.runtime.k3 k3Var, float f10) {
        k3Var.q(f10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011d  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:119:0x0164  */
    /* JADX WARN: Code duplicated, block: B:121:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0170  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173  */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0196  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:144:0x0212  */
    /* JADX WARN: Code duplicated, block: B:147:0x029e  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void n0(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable cn cnVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i16;
        int i17;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        int i18;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i19;
        int i20;
        boolean z11;
        androidx.compose.runtime.c0 c0Var2;
        final cn cnVar2;
        final androidx.compose.ui.a0 a0Var3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10;
        androidx.compose.ui.graphics.q3 q3VarI;
        int i21;
        boolean z12;
        boolean z13;
        cn cnVarA;
        androidx.compose.foundation.interaction.j jVar3;
        cn cnVar3;
        androidx.compose.ui.a0 a0Var5;
        ?? r10;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-583709666);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i11 & 4) == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i12 |= c0VarR.k0(function0) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            function6 = function4;
                            if (c0VarR.k0(function6)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((1572864 & i10) == 0) {
                            if ((i11 & 64) == 0) {
                                q3Var2 = q3Var;
                                int i22 = c0VarR.D(q3Var2) ? 1048576 : 524288;
                                i12 |= i22;
                            } else {
                                q3Var2 = q3Var;
                            }
                            i12 |= i22;
                        } else {
                            q3Var2 = q3Var;
                        }
                        if ((i10 & 12582912) != 0) {
                            i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                        }
                        i19 = i11 & 256;
                        if (i19 != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 38347923) != 38347922) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c0VarR.h(z11, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i13 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i15 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function5;
                                }
                                if (i17 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function6;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                                } else {
                                    q3VarI = q3Var2;
                                }
                                i21 = i12;
                                if ((i11 & 128) != 0) {
                                    z13 = false;
                                    z12 = true;
                                    cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                                    i12 = i21 & (-29360129);
                                } else {
                                    z12 = true;
                                    z13 = false;
                                    cnVarA = cnVar;
                                    i12 = i21;
                                }
                                if (i19 != 0) {
                                    c0VarR = c0VarR;
                                    jVar3 = null;
                                } else {
                                    c0VarR = c0VarR;
                                    jVar3 = jVar;
                                }
                                cnVar3 = cnVarA;
                                function5 = function9;
                                a0Var5 = a0Var4;
                                r10 = z12;
                            } else {
                                c0VarR.u();
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                jVar3 = jVar;
                                r10 = 1;
                                a0Var5 = a0Var2;
                                function10 = function6;
                                q3VarI = q3Var2;
                                z13 = false;
                                cnVar3 = cnVar;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.sn
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return no.o0((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            int i23 = i12 >> 3;
                            cn cnVar4 = cnVar3;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function5;
                            androidx.compose.ui.a0 a0Var6 = a0Var5;
                            androidx.compose.ui.graphics.q3 q3Var4 = q3VarI;
                            u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var4, cnVar3.a(z10, c0VarR, (i23 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function11, cnVar4, z10, function10, function2), c0VarR, 54), c0VarR, (i23 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var3 = q3Var4;
                            jVar2 = jVar3;
                            cnVar2 = cnVar4;
                            a0Var3 = a0Var6;
                            function7 = function11;
                            function8 = function10;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            cnVar2 = cnVar;
                            a0Var3 = a0Var2;
                            function7 = function5;
                            function8 = function6;
                            q3Var3 = q3Var2;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function6 = function4;
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            q3Var2 = q3Var;
                            if (c0VarR.D(q3Var2)) {
                            }
                            i12 |= i22;
                        } else {
                            q3Var2 = q3Var;
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i15 != 0) {
                                function9 = null;
                            } else {
                                function9 = function5;
                            }
                            if (i17 != 0) {
                                function10 = null;
                            } else {
                                function10 = function6;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                            } else {
                                q3VarI = q3Var2;
                            }
                            i21 = i12;
                            if ((i11 & 128) != 0) {
                                z13 = false;
                                z12 = true;
                                cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                                i12 = i21 & (-29360129);
                            } else {
                                z12 = true;
                                z13 = false;
                                cnVarA = cnVar;
                                i12 = i21;
                            }
                            if (i19 != 0) {
                                c0VarR = c0VarR;
                                jVar3 = null;
                            } else {
                                c0VarR = c0VarR;
                                jVar3 = jVar;
                            }
                            cnVar3 = cnVarA;
                            function5 = function9;
                            a0Var5 = a0Var4;
                            r10 = z12;
                        } else {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i15 != 0) {
                                function9 = null;
                            } else {
                                function9 = function5;
                            }
                            if (i17 != 0) {
                                function10 = null;
                            } else {
                                function10 = function6;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                            } else {
                                q3VarI = q3Var2;
                            }
                            i21 = i12;
                            if ((i11 & 128) != 0) {
                                z13 = false;
                                z12 = true;
                                cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                                i12 = i21 & (-29360129);
                            } else {
                                z12 = true;
                                z13 = false;
                                cnVarA = cnVar;
                                i12 = i21;
                            }
                            if (i19 != 0) {
                                c0VarR = c0VarR;
                                jVar3 = null;
                            } else {
                                c0VarR = c0VarR;
                                jVar3 = jVar;
                            }
                            cnVar3 = cnVarA;
                            function5 = function9;
                            a0Var5 = a0Var4;
                            r10 = z12;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.sn
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return no.o0((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i24 = i12 >> 3;
                        cn cnVar5 = cnVar3;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function5;
                        androidx.compose.ui.a0 a0Var7 = a0Var5;
                        androidx.compose.ui.graphics.q3 q3Var5 = q3VarI;
                        u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var5, cnVar3.a(z10, c0VarR, (i24 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function12, cnVar5, z10, function10, function2), c0VarR, 54), c0VarR, (i24 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3Var5;
                        jVar2 = jVar3;
                        cnVar2 = cnVar5;
                        a0Var3 = a0Var7;
                        function7 = function12;
                        function8 = function10;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cnVar2 = cnVar;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        function8 = function6;
                        q3Var3 = q3Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function5 = function3;
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        function6 = function4;
                        if (c0VarR.k0(function6)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            q3Var2 = q3Var;
                            if (c0VarR.D(q3Var2)) {
                            }
                            i12 |= i22;
                        } else {
                            q3Var2 = q3Var;
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i15 != 0) {
                                function9 = null;
                            } else {
                                function9 = function5;
                            }
                            if (i17 != 0) {
                                function10 = null;
                            } else {
                                function10 = function6;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                            } else {
                                q3VarI = q3Var2;
                            }
                            i21 = i12;
                            if ((i11 & 128) != 0) {
                                z13 = false;
                                z12 = true;
                                cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                                i12 = i21 & (-29360129);
                            } else {
                                z12 = true;
                                z13 = false;
                                cnVarA = cnVar;
                                i12 = i21;
                            }
                            if (i19 != 0) {
                                c0VarR = c0VarR;
                                jVar3 = null;
                            } else {
                                c0VarR = c0VarR;
                                jVar3 = jVar;
                            }
                            cnVar3 = cnVarA;
                            function5 = function9;
                            a0Var5 = a0Var4;
                            r10 = z12;
                        } else {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i15 != 0) {
                                function9 = null;
                            } else {
                                function9 = function5;
                            }
                            if (i17 != 0) {
                                function10 = null;
                            } else {
                                function10 = function6;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                            } else {
                                q3VarI = q3Var2;
                            }
                            i21 = i12;
                            if ((i11 & 128) != 0) {
                                z13 = false;
                                z12 = true;
                                cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                                i12 = i21 & (-29360129);
                            } else {
                                z12 = true;
                                z13 = false;
                                cnVarA = cnVar;
                                i12 = i21;
                            }
                            if (i19 != 0) {
                                c0VarR = c0VarR;
                                jVar3 = null;
                            } else {
                                c0VarR = c0VarR;
                                jVar3 = jVar;
                            }
                            cnVar3 = cnVarA;
                            function5 = function9;
                            a0Var5 = a0Var4;
                            r10 = z12;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.sn
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return no.o0((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i25 = i12 >> 3;
                        cn cnVar6 = cnVar3;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function5;
                        androidx.compose.ui.a0 a0Var8 = a0Var5;
                        androidx.compose.ui.graphics.q3 q3Var6 = q3VarI;
                        u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var6, cnVar3.a(z10, c0VarR, (i25 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function13, cnVar6, z10, function10, function2), c0VarR, 54), c0VarR, (i25 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3Var6;
                        jVar2 = jVar3;
                        cnVar2 = cnVar6;
                        a0Var3 = a0Var8;
                        function7 = function13;
                        function8 = function10;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cnVar2 = cnVar;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        function8 = function6;
                        q3Var3 = q3Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function6 = function4;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.sn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.o0((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i26 = i12 >> 3;
                    cn cnVar7 = cnVar3;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function5;
                    androidx.compose.ui.a0 a0Var9 = a0Var5;
                    androidx.compose.ui.graphics.q3 q3Var7 = q3VarI;
                    u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var7, cnVar3.a(z10, c0VarR, (i26 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function14, cnVar7, z10, function10, function2), c0VarR, 54), c0VarR, (i26 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var7;
                    jVar2 = jVar3;
                    cnVar2 = cnVar7;
                    a0Var3 = a0Var9;
                    function7 = function14;
                    function8 = function10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cnVar2 = cnVar;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    function8 = function6;
                    q3Var3 = q3Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            a0Var2 = a0Var;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        function6 = function4;
                        if (c0VarR.k0(function6)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            q3Var2 = q3Var;
                            if (c0VarR.D(q3Var2)) {
                            }
                            i12 |= i22;
                        } else {
                            q3Var2 = q3Var;
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i15 != 0) {
                                function9 = null;
                            } else {
                                function9 = function5;
                            }
                            if (i17 != 0) {
                                function10 = null;
                            } else {
                                function10 = function6;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                            } else {
                                q3VarI = q3Var2;
                            }
                            i21 = i12;
                            if ((i11 & 128) != 0) {
                                z13 = false;
                                z12 = true;
                                cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                                i12 = i21 & (-29360129);
                            } else {
                                z12 = true;
                                z13 = false;
                                cnVarA = cnVar;
                                i12 = i21;
                            }
                            if (i19 != 0) {
                                c0VarR = c0VarR;
                                jVar3 = null;
                            } else {
                                c0VarR = c0VarR;
                                jVar3 = jVar;
                            }
                            cnVar3 = cnVarA;
                            function5 = function9;
                            a0Var5 = a0Var4;
                            r10 = z12;
                        } else {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i15 != 0) {
                                function9 = null;
                            } else {
                                function9 = function5;
                            }
                            if (i17 != 0) {
                                function10 = null;
                            } else {
                                function10 = function6;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                            } else {
                                q3VarI = q3Var2;
                            }
                            i21 = i12;
                            if ((i11 & 128) != 0) {
                                z13 = false;
                                z12 = true;
                                cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                                i12 = i21 & (-29360129);
                            } else {
                                z12 = true;
                                z13 = false;
                                cnVarA = cnVar;
                                i12 = i21;
                            }
                            if (i19 != 0) {
                                c0VarR = c0VarR;
                                jVar3 = null;
                            } else {
                                c0VarR = c0VarR;
                                jVar3 = jVar;
                            }
                            cnVar3 = cnVarA;
                            function5 = function9;
                            a0Var5 = a0Var4;
                            r10 = z12;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.sn
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return no.o0((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i27 = i12 >> 3;
                        cn cnVar8 = cnVar3;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function5;
                        androidx.compose.ui.a0 a0Var10 = a0Var5;
                        androidx.compose.ui.graphics.q3 q3Var8 = q3VarI;
                        u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var8, cnVar3.a(z10, c0VarR, (i27 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function15, cnVar8, z10, function10, function2), c0VarR, 54), c0VarR, (i27 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3Var8;
                        jVar2 = jVar3;
                        cnVar2 = cnVar8;
                        a0Var3 = a0Var10;
                        function7 = function15;
                        function8 = function10;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cnVar2 = cnVar;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        function8 = function6;
                        q3Var3 = q3Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function6 = function4;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.sn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.o0((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i28 = i12 >> 3;
                    cn cnVar9 = cnVar3;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function5;
                    androidx.compose.ui.a0 a0Var11 = a0Var5;
                    androidx.compose.ui.graphics.q3 q3Var9 = q3VarI;
                    u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var9, cnVar3.a(z10, c0VarR, (i28 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function16, cnVar9, z10, function10, function2), c0VarR, 54), c0VarR, (i28 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var9;
                    jVar2 = jVar3;
                    cnVar2 = cnVar9;
                    a0Var3 = a0Var11;
                    function7 = function16;
                    function8 = function10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cnVar2 = cnVar;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    function8 = function6;
                    q3Var3 = q3Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function5 = function3;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    function6 = function4;
                    if (c0VarR.k0(function6)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.sn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.o0((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i29 = i12 >> 3;
                    cn cnVar10 = cnVar3;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function5;
                    androidx.compose.ui.a0 a0Var12 = a0Var5;
                    androidx.compose.ui.graphics.q3 q3Var10 = q3VarI;
                    u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var10, cnVar3.a(z10, c0VarR, (i29 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function17, cnVar10, z10, function10, function2), c0VarR, 54), c0VarR, (i29 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var10;
                    jVar2 = jVar3;
                    cnVar2 = cnVar10;
                    a0Var3 = a0Var12;
                    function7 = function17;
                    function8 = function10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cnVar2 = cnVar;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    function8 = function6;
                    q3Var3 = q3Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function6 = function4;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i22;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i20;
            }
            if ((i12 & 38347923) != 38347922) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i15 != 0) {
                        function9 = null;
                    } else {
                        function9 = function5;
                    }
                    if (i17 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    i21 = i12;
                    if ((i11 & 128) != 0) {
                        z13 = false;
                        z12 = true;
                        cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                        i12 = i21 & (-29360129);
                    } else {
                        z12 = true;
                        z13 = false;
                        cnVarA = cnVar;
                        i12 = i21;
                    }
                    if (i19 != 0) {
                        c0VarR = c0VarR;
                        jVar3 = null;
                    } else {
                        c0VarR = c0VarR;
                        jVar3 = jVar;
                    }
                    cnVar3 = cnVarA;
                    function5 = function9;
                    a0Var5 = a0Var4;
                    r10 = z12;
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i15 != 0) {
                        function9 = null;
                    } else {
                        function9 = function5;
                    }
                    if (i17 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    i21 = i12;
                    if ((i11 & 128) != 0) {
                        z13 = false;
                        z12 = true;
                        cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                        i12 = i21 & (-29360129);
                    } else {
                        z12 = true;
                        z13 = false;
                        cnVarA = cnVar;
                        i12 = i21;
                    }
                    if (i19 != 0) {
                        c0VarR = c0VarR;
                        jVar3 = null;
                    } else {
                        c0VarR = c0VarR;
                        jVar3 = jVar;
                    }
                    cnVar3 = cnVarA;
                    function5 = function9;
                    a0Var5 = a0Var4;
                    r10 = z12;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.sn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.o0((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i210 = i12 >> 3;
                cn cnVar11 = cnVar3;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function5;
                androidx.compose.ui.a0 a0Var13 = a0Var5;
                androidx.compose.ui.graphics.q3 q3Var11 = q3VarI;
                u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var11, cnVar3.a(z10, c0VarR, (i210 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function18, cnVar11, z10, function10, function2), c0VarR, 54), c0VarR, (i210 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var11;
                jVar2 = jVar3;
                cnVar2 = cnVar11;
                a0Var3 = a0Var13;
                function7 = function18;
                function8 = function10;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                cnVar2 = cnVar;
                a0Var3 = a0Var2;
                function7 = function5;
                function8 = function6;
                q3Var3 = q3Var2;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        function6 = function4;
                        if (c0VarR.k0(function6)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            q3Var2 = q3Var;
                            if (c0VarR.D(q3Var2)) {
                            }
                            i12 |= i22;
                        } else {
                            q3Var2 = q3Var;
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i15 != 0) {
                                function9 = null;
                            } else {
                                function9 = function5;
                            }
                            if (i17 != 0) {
                                function10 = null;
                            } else {
                                function10 = function6;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                            } else {
                                q3VarI = q3Var2;
                            }
                            i21 = i12;
                            if ((i11 & 128) != 0) {
                                z13 = false;
                                z12 = true;
                                cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                                i12 = i21 & (-29360129);
                            } else {
                                z12 = true;
                                z13 = false;
                                cnVarA = cnVar;
                                i12 = i21;
                            }
                            if (i19 != 0) {
                                c0VarR = c0VarR;
                                jVar3 = null;
                            } else {
                                c0VarR = c0VarR;
                                jVar3 = jVar;
                            }
                            cnVar3 = cnVarA;
                            function5 = function9;
                            a0Var5 = a0Var4;
                            r10 = z12;
                        } else {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i15 != 0) {
                                function9 = null;
                            } else {
                                function9 = function5;
                            }
                            if (i17 != 0) {
                                function10 = null;
                            } else {
                                function10 = function6;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                            } else {
                                q3VarI = q3Var2;
                            }
                            i21 = i12;
                            if ((i11 & 128) != 0) {
                                z13 = false;
                                z12 = true;
                                cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                                i12 = i21 & (-29360129);
                            } else {
                                z12 = true;
                                z13 = false;
                                cnVarA = cnVar;
                                i12 = i21;
                            }
                            if (i19 != 0) {
                                c0VarR = c0VarR;
                                jVar3 = null;
                            } else {
                                c0VarR = c0VarR;
                                jVar3 = jVar;
                            }
                            cnVar3 = cnVarA;
                            function5 = function9;
                            a0Var5 = a0Var4;
                            r10 = z12;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.sn
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return no.o0((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i211 = i12 >> 3;
                        cn cnVar12 = cnVar3;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function5;
                        androidx.compose.ui.a0 a0Var14 = a0Var5;
                        androidx.compose.ui.graphics.q3 q3Var12 = q3VarI;
                        u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var12, cnVar3.a(z10, c0VarR, (i211 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function19, cnVar12, z10, function10, function2), c0VarR, 54), c0VarR, (i211 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3Var12;
                        jVar2 = jVar3;
                        cnVar2 = cnVar12;
                        a0Var3 = a0Var14;
                        function7 = function19;
                        function8 = function10;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cnVar2 = cnVar;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        function8 = function6;
                        q3Var3 = q3Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function6 = function4;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.sn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.o0((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i212 = i12 >> 3;
                    cn cnVar13 = cnVar3;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function5;
                    androidx.compose.ui.a0 a0Var15 = a0Var5;
                    androidx.compose.ui.graphics.q3 q3Var13 = q3VarI;
                    u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var13, cnVar3.a(z10, c0VarR, (i212 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function110, cnVar13, z10, function10, function2), c0VarR, 54), c0VarR, (i212 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var13;
                    jVar2 = jVar3;
                    cnVar2 = cnVar13;
                    a0Var3 = a0Var15;
                    function7 = function110;
                    function8 = function10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cnVar2 = cnVar;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    function8 = function6;
                    q3Var3 = q3Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function5 = function3;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    function6 = function4;
                    if (c0VarR.k0(function6)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.sn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.o0((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i213 = i12 >> 3;
                    cn cnVar14 = cnVar3;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111 = function5;
                    androidx.compose.ui.a0 a0Var16 = a0Var5;
                    androidx.compose.ui.graphics.q3 q3Var14 = q3VarI;
                    u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var14, cnVar3.a(z10, c0VarR, (i213 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function111, cnVar14, z10, function10, function2), c0VarR, 54), c0VarR, (i213 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var14;
                    jVar2 = jVar3;
                    cnVar2 = cnVar14;
                    a0Var3 = a0Var16;
                    function7 = function111;
                    function8 = function10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cnVar2 = cnVar;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    function8 = function6;
                    q3Var3 = q3Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function6 = function4;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i22;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i20;
            }
            if ((i12 & 38347923) != 38347922) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i15 != 0) {
                        function9 = null;
                    } else {
                        function9 = function5;
                    }
                    if (i17 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    i21 = i12;
                    if ((i11 & 128) != 0) {
                        z13 = false;
                        z12 = true;
                        cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                        i12 = i21 & (-29360129);
                    } else {
                        z12 = true;
                        z13 = false;
                        cnVarA = cnVar;
                        i12 = i21;
                    }
                    if (i19 != 0) {
                        c0VarR = c0VarR;
                        jVar3 = null;
                    } else {
                        c0VarR = c0VarR;
                        jVar3 = jVar;
                    }
                    cnVar3 = cnVarA;
                    function5 = function9;
                    a0Var5 = a0Var4;
                    r10 = z12;
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i15 != 0) {
                        function9 = null;
                    } else {
                        function9 = function5;
                    }
                    if (i17 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    i21 = i12;
                    if ((i11 & 128) != 0) {
                        z13 = false;
                        z12 = true;
                        cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                        i12 = i21 & (-29360129);
                    } else {
                        z12 = true;
                        z13 = false;
                        cnVarA = cnVar;
                        i12 = i21;
                    }
                    if (i19 != 0) {
                        c0VarR = c0VarR;
                        jVar3 = null;
                    } else {
                        c0VarR = c0VarR;
                        jVar3 = jVar;
                    }
                    cnVar3 = cnVarA;
                    function5 = function9;
                    a0Var5 = a0Var4;
                    r10 = z12;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.sn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.o0((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i214 = i12 >> 3;
                cn cnVar15 = cnVar3;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function112 = function5;
                androidx.compose.ui.a0 a0Var17 = a0Var5;
                androidx.compose.ui.graphics.q3 q3Var15 = q3VarI;
                u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var15, cnVar3.a(z10, c0VarR, (i214 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function112, cnVar15, z10, function10, function2), c0VarR, 54), c0VarR, (i214 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var15;
                jVar2 = jVar3;
                cnVar2 = cnVar15;
                a0Var3 = a0Var17;
                function7 = function112;
                function8 = function10;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                cnVar2 = cnVar;
                a0Var3 = a0Var2;
                function7 = function5;
                function8 = function6;
                q3Var3 = q3Var2;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                function5 = function3;
                if (c0VarR.k0(function5)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    function6 = function4;
                    if (c0VarR.k0(function6)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i22;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i15 != 0) {
                            function9 = null;
                        } else {
                            function9 = function5;
                        }
                        if (i17 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        i21 = i12;
                        if ((i11 & 128) != 0) {
                            z13 = false;
                            z12 = true;
                            cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                            i12 = i21 & (-29360129);
                        } else {
                            z12 = true;
                            z13 = false;
                            cnVarA = cnVar;
                            i12 = i21;
                        }
                        if (i19 != 0) {
                            c0VarR = c0VarR;
                            jVar3 = null;
                        } else {
                            c0VarR = c0VarR;
                            jVar3 = jVar;
                        }
                        cnVar3 = cnVarA;
                        function5 = function9;
                        a0Var5 = a0Var4;
                        r10 = z12;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.sn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.o0((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i215 = i12 >> 3;
                    cn cnVar16 = cnVar3;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function113 = function5;
                    androidx.compose.ui.a0 a0Var18 = a0Var5;
                    androidx.compose.ui.graphics.q3 q3Var16 = q3VarI;
                    u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var16, cnVar3.a(z10, c0VarR, (i215 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function113, cnVar16, z10, function10, function2), c0VarR, 54), c0VarR, (i215 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var16;
                    jVar2 = jVar3;
                    cnVar2 = cnVar16;
                    a0Var3 = a0Var18;
                    function7 = function113;
                    function8 = function10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cnVar2 = cnVar;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    function8 = function6;
                    q3Var3 = q3Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function6 = function4;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i22;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i20;
            }
            if ((i12 & 38347923) != 38347922) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i15 != 0) {
                        function9 = null;
                    } else {
                        function9 = function5;
                    }
                    if (i17 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    i21 = i12;
                    if ((i11 & 128) != 0) {
                        z13 = false;
                        z12 = true;
                        cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                        i12 = i21 & (-29360129);
                    } else {
                        z12 = true;
                        z13 = false;
                        cnVarA = cnVar;
                        i12 = i21;
                    }
                    if (i19 != 0) {
                        c0VarR = c0VarR;
                        jVar3 = null;
                    } else {
                        c0VarR = c0VarR;
                        jVar3 = jVar;
                    }
                    cnVar3 = cnVarA;
                    function5 = function9;
                    a0Var5 = a0Var4;
                    r10 = z12;
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i15 != 0) {
                        function9 = null;
                    } else {
                        function9 = function5;
                    }
                    if (i17 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    i21 = i12;
                    if ((i11 & 128) != 0) {
                        z13 = false;
                        z12 = true;
                        cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                        i12 = i21 & (-29360129);
                    } else {
                        z12 = true;
                        z13 = false;
                        cnVarA = cnVar;
                        i12 = i21;
                    }
                    if (i19 != 0) {
                        c0VarR = c0VarR;
                        jVar3 = null;
                    } else {
                        c0VarR = c0VarR;
                        jVar3 = jVar;
                    }
                    cnVar3 = cnVarA;
                    function5 = function9;
                    a0Var5 = a0Var4;
                    r10 = z12;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.sn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.o0((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i216 = i12 >> 3;
                cn cnVar17 = cnVar3;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function114 = function5;
                androidx.compose.ui.a0 a0Var19 = a0Var5;
                androidx.compose.ui.graphics.q3 q3Var17 = q3VarI;
                u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var17, cnVar3.a(z10, c0VarR, (i216 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function114, cnVar17, z10, function10, function2), c0VarR, 54), c0VarR, (i216 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var17;
                jVar2 = jVar3;
                cnVar2 = cnVar17;
                a0Var3 = a0Var19;
                function7 = function114;
                function8 = function10;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                cnVar2 = cnVar;
                a0Var3 = a0Var2;
                function7 = function5;
                function8 = function6;
                q3Var3 = q3Var2;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function5 = function3;
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                function6 = function4;
                if (c0VarR.k0(function6)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i22;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i20;
            }
            if ((i12 & 38347923) != 38347922) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i15 != 0) {
                        function9 = null;
                    } else {
                        function9 = function5;
                    }
                    if (i17 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    i21 = i12;
                    if ((i11 & 128) != 0) {
                        z13 = false;
                        z12 = true;
                        cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                        i12 = i21 & (-29360129);
                    } else {
                        z12 = true;
                        z13 = false;
                        cnVarA = cnVar;
                        i12 = i21;
                    }
                    if (i19 != 0) {
                        c0VarR = c0VarR;
                        jVar3 = null;
                    } else {
                        c0VarR = c0VarR;
                        jVar3 = jVar;
                    }
                    cnVar3 = cnVarA;
                    function5 = function9;
                    a0Var5 = a0Var4;
                    r10 = z12;
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i15 != 0) {
                        function9 = null;
                    } else {
                        function9 = function5;
                    }
                    if (i17 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    i21 = i12;
                    if ((i11 & 128) != 0) {
                        z13 = false;
                        z12 = true;
                        cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                        i12 = i21 & (-29360129);
                    } else {
                        z12 = true;
                        z13 = false;
                        cnVarA = cnVar;
                        i12 = i21;
                    }
                    if (i19 != 0) {
                        c0VarR = c0VarR;
                        jVar3 = null;
                    } else {
                        c0VarR = c0VarR;
                        jVar3 = jVar;
                    }
                    cnVar3 = cnVarA;
                    function5 = function9;
                    a0Var5 = a0Var4;
                    r10 = z12;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.sn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.o0((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i217 = i12 >> 3;
                cn cnVar18 = cnVar3;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function115 = function5;
                androidx.compose.ui.a0 a0Var110 = a0Var5;
                androidx.compose.ui.graphics.q3 q3Var18 = q3VarI;
                u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var18, cnVar3.a(z10, c0VarR, (i217 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function115, cnVar18, z10, function10, function2), c0VarR, 54), c0VarR, (i217 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var18;
                jVar2 = jVar3;
                cnVar2 = cnVar18;
                a0Var3 = a0Var110;
                function7 = function115;
                function8 = function10;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                cnVar2 = cnVar;
                a0Var3 = a0Var2;
                function7 = function5;
                function8 = function6;
                q3Var3 = q3Var2;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function6 = function4;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i22;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i22;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & 12582912) != 0) {
            i12 |= ((i11 & 128) == 0 || !c0VarR.D(cnVar)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.D(jVar)) {
                i20 = 67108864;
            } else {
                i20 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i12 |= i20;
        }
        if ((i12 & 38347923) != 38347922) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i15 != 0) {
                    function9 = null;
                } else {
                    function9 = function5;
                }
                if (i17 != 0) {
                    function10 = null;
                } else {
                    function10 = function6;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                } else {
                    q3VarI = q3Var2;
                }
                i21 = i12;
                if ((i11 & 128) != 0) {
                    z13 = false;
                    z12 = true;
                    cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                    i12 = i21 & (-29360129);
                } else {
                    z12 = true;
                    z13 = false;
                    cnVarA = cnVar;
                    i12 = i21;
                }
                if (i19 != 0) {
                    c0VarR = c0VarR;
                    jVar3 = null;
                } else {
                    c0VarR = c0VarR;
                    jVar3 = jVar;
                }
                cnVar3 = cnVarA;
                function5 = function9;
                a0Var5 = a0Var4;
                r10 = z12;
            } else {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i15 != 0) {
                    function9 = null;
                } else {
                    function9 = function5;
                }
                if (i17 != 0) {
                    function10 = null;
                } else {
                    function10 = function6;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    q3VarI = cx.i(d0.m1.f268453a.h(), c0VarR, 6);
                } else {
                    q3VarI = q3Var2;
                }
                i21 = i12;
                if ((i11 & 128) != 0) {
                    z13 = false;
                    z12 = true;
                    cnVarA = dn.f27122a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 100663296, 255);
                    i12 = i21 & (-29360129);
                } else {
                    z12 = true;
                    z13 = false;
                    cnVarA = cnVar;
                    i12 = i21;
                }
                if (i19 != 0) {
                    c0VarR = c0VarR;
                    jVar3 = null;
                } else {
                    c0VarR = c0VarR;
                    jVar3 = jVar;
                }
                cnVar3 = cnVarA;
                function5 = function9;
                a0Var5 = a0Var4;
                r10 = z12;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-583709666, i12, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.sn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.o0((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            int i218 = i12 >> 3;
            cn cnVar19 = cnVar3;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function116 = function5;
            androidx.compose.ui.a0 a0Var111 = a0Var5;
            androidx.compose.ui.graphics.q3 q3Var19 = q3VarI;
            u10.d(z10, function0, androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.semantics.t.f(a0Var5, z13, (Function1) objI0, r10, null), d0.m1.f268453a.g(), 0.0f, 2, null), 0.0f, r10, null), false, q3Var19, cnVar3.a(z10, c0VarR, (i218 & 14) | ((i12 >> 18) & com.planner5d.library.engine.input.f.b.B)).getValue().M(), 0L, 0.0f, 0.0f, null, jVar3, androidx.compose.runtime.internal.w.e(-1173018444, r10, new k(function116, cnVar19, z10, function10, function2), c0VarR, 54), c0VarR, (i218 & okhttp3.internal.ws.g.f334652s) | ((i12 >> 6) & 57344), ((i12 >> 24) & 14) | 48, 968);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            q3Var3 = q3Var19;
            jVar2 = jVar3;
            cnVar2 = cnVar19;
            a0Var3 = a0Var111;
            function7 = function116;
            function8 = function10;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            cnVar2 = cnVar;
            a0Var3 = a0Var2;
            function7 = function5;
            function8 = function6;
            q3Var3 = q3Var2;
            jVar2 = jVar;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.tn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.p0(function2, z10, function0, a0Var3, function7, function8, q3Var3, cnVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.h());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(Function2 function2, boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, Function2 function3, Function2 function4, androidx.compose.ui.graphics.q3 q3Var, cn cnVar, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        n0(function2, z10, function0, a0Var, function3, function4, q3Var, cnVar, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x0146  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:134:0x020a  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123 A[DONT_INVERT] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void q0(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, @Nullable androidx.compose.foundation.layout.v6 v6Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.graphics.q3 q3Var2;
        long j12;
        long jG;
        int i13;
        float f11;
        int i14;
        androidx.compose.foundation.layout.v6 v6Var2;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i15;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final long j13;
        final long j14;
        final float f12;
        final androidx.compose.foundation.layout.v6 v6Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.ui.graphics.q3 q3VarA;
        long j15;
        float fG;
        float f13;
        long j16;
        androidx.compose.foundation.layout.v6 v6VarK;
        androidx.compose.ui.graphics.q3 q3Var4;
        int i16;
        final String strB;
        boolean zD;
        Object objI0;
        int i17;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1877158612);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                q3Var2 = q3Var;
                i12 |= c0VarR.D(q3Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    j12 = j10;
                    int i20 = c0VarR.L(j12) ? 256 : 128;
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 3072) == 0) {
                jG = j11;
                if ((i11 & 8) == 0 || !c0VarR.L(jG)) {
                    i17 = 1024;
                } else {
                    i17 = 2048;
                }
                i12 |= i17;
            } else {
                jG = j11;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        v6Var2 = v6Var;
                        int i21 = c0VarR.D(v6Var2) ? 131072 : 65536;
                        i12 |= i21;
                    } else {
                        v6Var2 = v6Var;
                    }
                    i12 |= i21;
                } else {
                    v6Var2 = v6Var;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i18 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i19 != 0) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            } else {
                                q3VarA = q3Var2;
                            }
                            if ((i11 & 4) != 0) {
                                j15 = xd.f34462a.j(c0VarR, 6);
                                i12 &= -897;
                            } else {
                                j15 = j12;
                            }
                            if ((i11 & 8) != 0) {
                                jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fG = xd.f34462a.g();
                            } else {
                                fG = f11;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                q3Var4 = q3VarA;
                                f13 = fG;
                                j16 = jG;
                                i16 = 1877158612;
                                v6VarK = xd.f34462a.k(c0VarR, 6);
                            } else {
                                f13 = fG;
                                j16 = jG;
                                v6VarK = v6Var2;
                                q3Var4 = q3VarA;
                                i16 = 1877158612;
                            }
                        } else {
                            c0VarR.u();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            a0Var3 = a0Var;
                            j16 = jG;
                            f13 = f11;
                            v6VarK = v6Var2;
                            i16 = 1877158612;
                            q3Var4 = q3Var2;
                            j15 = j12;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:771)");
                        }
                        androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                        strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                        zD = c0VarR.D(strB);
                        objI0 = c0VarR.i0();
                        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.xn
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i22 = i12 << 6;
                        c0Var2 = c0VarR;
                        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3 = nVar2;
                        long j17 = j15;
                        U(null, v6VarK, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), q3Var4, j17, j16, f13, null, nVar3, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (i22 & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        v6Var3 = v6VarK;
                        q3Var3 = q3Var4;
                        j13 = j17;
                        j14 = j16;
                        f12 = f13;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        q3Var3 = q3Var2;
                        j13 = j12;
                        j14 = jG;
                        f12 = f11;
                        v6Var3 = v6Var2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.yn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return no.s0(a0Var2, q3Var3, j13, j14, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                nVar2 = nVar;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = q3Var2;
                        }
                        if ((i11 & 4) != 0) {
                            j15 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        } else {
                            j15 = j12;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f11;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3Var4 = q3VarA;
                            f13 = fG;
                            j16 = jG;
                            i16 = 1877158612;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            f13 = fG;
                            j16 = jG;
                            v6VarK = v6Var2;
                            q3Var4 = q3VarA;
                            i16 = 1877158612;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = q3Var2;
                        }
                        if ((i11 & 4) != 0) {
                            j15 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        } else {
                            j15 = j12;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f11;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3Var4 = q3VarA;
                            f13 = fG;
                            j16 = jG;
                            i16 = 1877158612;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            f13 = fG;
                            j16 = jG;
                            v6VarK = v6Var2;
                            q3Var4 = q3VarA;
                            i16 = 1877158612;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:771)");
                    }
                    androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                    zD = c0VarR.D(strB);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.xn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material3.xn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i23 = i12 << 6;
                    c0Var2 = c0VarR;
                    pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4 = nVar2;
                    long j18 = j15;
                    U(null, v6VarK, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), q3Var4, j18, j16, f13, null, nVar4, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i23 & 7168) | (57344 & i23) | (458752 & i23) | (3670016 & i23) | (i23 & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    v6Var3 = v6VarK;
                    q3Var3 = q3Var4;
                    j13 = j18;
                    j14 = j16;
                    f12 = f13;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    q3Var3 = q3Var2;
                    j13 = j12;
                    j14 = jG;
                    f12 = f11;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.yn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.s0(a0Var2, q3Var3, j13, j14, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            f11 = f10;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    v6Var2 = v6Var;
                    if (c0VarR.D(v6Var2)) {
                    }
                    i12 |= i21;
                } else {
                    v6Var2 = v6Var;
                }
                i12 |= i21;
            } else {
                v6Var2 = v6Var;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i12 |= i15;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = q3Var2;
                        }
                        if ((i11 & 4) != 0) {
                            j15 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        } else {
                            j15 = j12;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f11;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3Var4 = q3VarA;
                            f13 = fG;
                            j16 = jG;
                            i16 = 1877158612;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            f13 = fG;
                            j16 = jG;
                            v6VarK = v6Var2;
                            q3Var4 = q3VarA;
                            i16 = 1877158612;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = q3Var2;
                        }
                        if ((i11 & 4) != 0) {
                            j15 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        } else {
                            j15 = j12;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f11;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3Var4 = q3VarA;
                            f13 = fG;
                            j16 = jG;
                            i16 = 1877158612;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            f13 = fG;
                            j16 = jG;
                            v6VarK = v6Var2;
                            q3Var4 = q3VarA;
                            i16 = 1877158612;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:771)");
                    }
                    androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                    zD = c0VarR.D(strB);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.xn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material3.xn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i24 = i12 << 6;
                    c0Var2 = c0VarR;
                    pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar5 = nVar2;
                    long j19 = j15;
                    U(null, v6VarK, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), q3Var4, j19, j16, f13, null, nVar5, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (i24 & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    v6Var3 = v6VarK;
                    q3Var3 = q3Var4;
                    j13 = j19;
                    j14 = j16;
                    f12 = f13;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    q3Var3 = q3Var2;
                    j13 = j12;
                    j14 = jG;
                    f12 = f11;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.yn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.s0(a0Var2, q3Var3, j13, j14, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            nVar2 = nVar;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j15 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        j15 = j12;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f11;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3Var4 = q3VarA;
                        f13 = fG;
                        j16 = jG;
                        i16 = 1877158612;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        f13 = fG;
                        j16 = jG;
                        v6VarK = v6Var2;
                        q3Var4 = q3VarA;
                        i16 = 1877158612;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j15 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        j15 = j12;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f11;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3Var4 = q3VarA;
                        f13 = fG;
                        j16 = jG;
                        i16 = 1877158612;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        f13 = fG;
                        j16 = jG;
                        v6VarK = v6Var2;
                        q3Var4 = q3VarA;
                        i16 = 1877158612;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:771)");
                }
                androidx.compose.material3.internal.l3.a aVar4 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                zD = c0VarR.D(strB);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.xn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material3.xn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i25 = i12 << 6;
                c0Var2 = c0VarR;
                pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar6 = nVar2;
                long j110 = j15;
                U(null, v6VarK, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), q3Var4, j110, j16, f13, null, nVar6, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (i25 & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                v6Var3 = v6VarK;
                q3Var3 = q3Var4;
                j13 = j110;
                j14 = j16;
                f12 = f13;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                q3Var3 = q3Var2;
                j13 = j12;
                j14 = jG;
                f12 = f11;
                v6Var3 = v6Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.yn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.s0(a0Var2, q3Var3, j13, j14, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        q3Var2 = q3Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            i12 |= i20;
        } else {
            j12 = j10;
        }
        if ((i10 & 3072) == 0) {
            jG = j11;
            if ((i11 & 8) == 0) {
                i17 = 1024;
            } else {
                i17 = 1024;
            }
            i12 |= i17;
        } else {
            jG = j11;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    v6Var2 = v6Var;
                    if (c0VarR.D(v6Var2)) {
                    }
                    i12 |= i21;
                } else {
                    v6Var2 = v6Var;
                }
                i12 |= i21;
            } else {
                v6Var2 = v6Var;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i12 |= i15;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = q3Var2;
                        }
                        if ((i11 & 4) != 0) {
                            j15 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        } else {
                            j15 = j12;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f11;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3Var4 = q3VarA;
                            f13 = fG;
                            j16 = jG;
                            i16 = 1877158612;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            f13 = fG;
                            j16 = jG;
                            v6VarK = v6Var2;
                            q3Var4 = q3VarA;
                            i16 = 1877158612;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i19 != 0) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = q3Var2;
                        }
                        if ((i11 & 4) != 0) {
                            j15 = xd.f34462a.j(c0VarR, 6);
                            i12 &= -897;
                        } else {
                            j15 = j12;
                        }
                        if ((i11 & 8) != 0) {
                            jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fG = xd.f34462a.g();
                        } else {
                            fG = f11;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3Var4 = q3VarA;
                            f13 = fG;
                            j16 = jG;
                            i16 = 1877158612;
                            v6VarK = xd.f34462a.k(c0VarR, 6);
                        } else {
                            f13 = fG;
                            j16 = jG;
                            v6VarK = v6Var2;
                            q3Var4 = q3VarA;
                            i16 = 1877158612;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:771)");
                    }
                    androidx.compose.material3.internal.l3.a aVar5 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                    zD = c0VarR.D(strB);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.xn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material3.xn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i26 = i12 << 6;
                    c0Var2 = c0VarR;
                    pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar7 = nVar2;
                    long j111 = j15;
                    U(null, v6VarK, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), q3Var4, j111, j16, f13, null, nVar7, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (i26 & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    v6Var3 = v6VarK;
                    q3Var3 = q3Var4;
                    j13 = j111;
                    j14 = j16;
                    f12 = f13;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    q3Var3 = q3Var2;
                    j13 = j12;
                    j14 = jG;
                    f12 = f11;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.yn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return no.s0(a0Var2, q3Var3, j13, j14, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            nVar2 = nVar;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j15 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        j15 = j12;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f11;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3Var4 = q3VarA;
                        f13 = fG;
                        j16 = jG;
                        i16 = 1877158612;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        f13 = fG;
                        j16 = jG;
                        v6VarK = v6Var2;
                        q3Var4 = q3VarA;
                        i16 = 1877158612;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j15 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        j15 = j12;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f11;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3Var4 = q3VarA;
                        f13 = fG;
                        j16 = jG;
                        i16 = 1877158612;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        f13 = fG;
                        j16 = jG;
                        v6VarK = v6Var2;
                        q3Var4 = q3VarA;
                        i16 = 1877158612;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:771)");
                }
                androidx.compose.material3.internal.l3.a aVar6 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                zD = c0VarR.D(strB);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.xn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material3.xn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i27 = i12 << 6;
                c0Var2 = c0VarR;
                pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar8 = nVar2;
                long j112 = j15;
                U(null, v6VarK, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), q3Var4, j112, j16, f13, null, nVar8, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (i27 & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                v6Var3 = v6VarK;
                q3Var3 = q3Var4;
                j13 = j112;
                j14 = j16;
                f12 = f13;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                q3Var3 = q3Var2;
                j13 = j12;
                j14 = jG;
                f12 = f11;
                v6Var3 = v6Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.yn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.s0(a0Var2, q3Var3, j13, j14, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        f11 = f10;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                v6Var2 = v6Var;
                if (c0VarR.D(v6Var2)) {
                }
                i12 |= i21;
            } else {
                v6Var2 = v6Var;
            }
            i12 |= i21;
        } else {
            v6Var2 = v6Var;
        }
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                nVar2 = nVar;
                if (c0VarR.k0(nVar2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j15 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        j15 = j12;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f11;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3Var4 = q3VarA;
                        f13 = fG;
                        j16 = jG;
                        i16 = 1877158612;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        f13 = fG;
                        j16 = jG;
                        v6VarK = v6Var2;
                        q3Var4 = q3VarA;
                        i16 = 1877158612;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i19 != 0) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j15 = xd.f34462a.j(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        j15 = j12;
                    }
                    if ((i11 & 8) != 0) {
                        jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fG = xd.f34462a.g();
                    } else {
                        fG = f11;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3Var4 = q3VarA;
                        f13 = fG;
                        j16 = jG;
                        i16 = 1877158612;
                        v6VarK = xd.f34462a.k(c0VarR, 6);
                    } else {
                        f13 = fG;
                        j16 = jG;
                        v6VarK = v6Var2;
                        q3Var4 = q3VarA;
                        i16 = 1877158612;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:771)");
                }
                androidx.compose.material3.internal.l3.a aVar7 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
                zD = c0VarR.D(strB);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.xn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material3.xn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i28 = i12 << 6;
                c0Var2 = c0VarR;
                pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar9 = nVar2;
                long j113 = j15;
                U(null, v6VarK, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), q3Var4, j113, j16, f13, null, nVar9, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (i28 & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                v6Var3 = v6VarK;
                q3Var3 = q3Var4;
                j13 = j113;
                j14 = j16;
                f12 = f13;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                q3Var3 = q3Var2;
                j13 = j12;
                j14 = jG;
                f12 = f11;
                v6Var3 = v6Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.yn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return no.s0(a0Var2, q3Var3, j13, j14, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        nVar2 = nVar;
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i19 != 0) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                } else {
                    q3VarA = q3Var2;
                }
                if ((i11 & 4) != 0) {
                    j15 = xd.f34462a.j(c0VarR, 6);
                    i12 &= -897;
                } else {
                    j15 = j12;
                }
                if ((i11 & 8) != 0) {
                    jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fG = xd.f34462a.g();
                } else {
                    fG = f11;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    q3Var4 = q3VarA;
                    f13 = fG;
                    j16 = jG;
                    i16 = 1877158612;
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                } else {
                    f13 = fG;
                    j16 = jG;
                    v6VarK = v6Var2;
                    q3Var4 = q3VarA;
                    i16 = 1877158612;
                }
            } else {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i19 != 0) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                } else {
                    q3VarA = q3Var2;
                }
                if ((i11 & 4) != 0) {
                    j15 = xd.f34462a.j(c0VarR, 6);
                    i12 &= -897;
                } else {
                    j15 = j12;
                }
                if ((i11 & 8) != 0) {
                    jG = o6.g(j15, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fG = xd.f34462a.g();
                } else {
                    fG = f11;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    q3Var4 = q3VarA;
                    f13 = fG;
                    j16 = jG;
                    i16 = 1877158612;
                    v6VarK = xd.f34462a.k(c0VarR, 6);
                } else {
                    f13 = fG;
                    j16 = jG;
                    v6VarK = v6Var2;
                    q3Var4 = q3VarA;
                    i16 = 1877158612;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:771)");
            }
            androidx.compose.material3.internal.l3.a aVar8 = androidx.compose.material3.internal.l3.f29010b;
            strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37157i), c0VarR, 0);
            zD = c0VarR.D(strB);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = new Function1() { // from class: androidx.compose.material3.xn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.material3.xn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.r0(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            int i29 = i12 << 6;
            c0Var2 = c0VarR;
            pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar10 = nVar2;
            long j114 = j15;
            U(null, v6VarK, androidx.compose.ui.semantics.t.f(a0Var3, false, (Function1) objI0, 1, null), q3Var4, j114, j16, f13, null, nVar10, c0Var2, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6 | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (i29 & 234881024), 128);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            v6Var3 = v6VarK;
            q3Var3 = q3Var4;
            j13 = j114;
            j14 = j16;
            f12 = f13;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var2 = a0Var;
            q3Var3 = q3Var2;
            j13 = j12;
            j14 = jG;
            f12 = f11;
            v6Var3 = v6Var2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.yn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.s0(a0Var2, q3Var3, j13, j14, f12, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.G1(e0Var, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f10, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        q0(a0Var, q3Var, j10, j11, f10, v6Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void t0(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(89297160);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(function3) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(89297160, i12, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:561)");
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.foundation.layout.i6.f(a0Var, 0.0f, 1, null);
            androidx.compose.foundation.layout.q.e eVarW = androidx.compose.foundation.layout.q.f16330a.w();
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarW, aVar.w(), c0VarR, 0);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarF);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            function2.invoke(c0VarR, Integer.valueOf(i12 & 14));
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar3);
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
            function3.invoke(c0VarR, Integer.valueOf((i12 >> 6) & 14));
            c0VarR.o();
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.fo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.u0(function2, a0Var2, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(Function2 function2, androidx.compose.ui.a0 a0Var, Function2 function3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        t0(function2, a0Var, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void v0(final boolean z10, final Function0<Unit> function0, final Function0<Float> function1, final long j10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.ui.a0 a0VarE;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2106487387);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.L(j10) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2106487387, i11, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1284)");
            }
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            final String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37150b), c0VarR, 0);
            if (z10) {
                c0VarR.E(598792893);
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                int i12 = i11 & com.planner5d.library.engine.input.f.b.B;
                boolean z11 = i12 == 32;
                Object objI0 = c0VarR.i0();
                if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new l(function0);
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarE2 = androidx.compose.ui.input.pointer.w0.e(aVar2, function0, (PointerInputEventHandler) objI0);
                boolean zD = (i12 == 32) | c0VarR.D(strB);
                Object objI1 = c0VarR.i0();
                if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.go
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return no.w0(strB, function0, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                a0VarE = androidx.compose.ui.semantics.t.e(a0VarE2, true, (Function1) objI1);
                c0VarR.A();
            } else {
                c0VarR.E(599116967);
                c0VarR.A();
                a0VarE = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null).B2(a0VarE);
            boolean z12 = ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objI2 = c0VarR.i0();
            if (z12 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material3.ho
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return no.y0(j10, function1, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.foundation.f1.e(a0VarB2, (Function1) objI2, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.io
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return no.z0(z10, function0, function1, j10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(String str, final Function0 function0, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.material3.en
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(no.x0(function0));
            }
        }, 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x0(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(long j10, Function0 function0, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, j10, 0L, 0L, ((Number) function0.invoke()).floatValue(), null, null, 0, 118, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(boolean z10, Function0 function0, Function0 function1, long j10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        v0(z10, function0, function1, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
