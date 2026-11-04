package androidx.compose.material;

import android.view.KeyEvent;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 12 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 13 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 14 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 15 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 16 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 17 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 18 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 19 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 20 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 21 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1288:1\n1282#2,6:1289\n1282#2,6:1296\n1282#2,6:1304\n1282#2,6:1310\n1282#2,6:1316\n1282#2,6:1408\n1282#2,6:1414\n1282#2,6:1461\n1282#2,6:1467\n1282#2,6:1478\n1282#2,6:1507\n1#3:1295\n68#4:1302\n68#4:1322\n68#4:1361\n66#4:1362\n68#4:1405\n66#4:1406\n66#4:1407\n75#5:1303\n75#5:1360\n75#5:1404\n70#6:1323\n67#6,9:1324\n77#6:1366\n70#6:1367\n67#6,9:1368\n77#6:1423\n70#6:1424\n67#6,9:1425\n77#6:1477\n79#7,6:1333\n86#7,3:1348\n89#7,2:1357\n93#7:1365\n79#7,6:1377\n86#7,3:1392\n89#7,2:1401\n93#7:1422\n79#7,6:1434\n86#7,3:1449\n89#7,2:1458\n93#7:1476\n347#8,9:1339\n356#8:1359\n357#8,2:1363\n347#8,9:1383\n356#8:1403\n357#8,2:1420\n347#8,9:1440\n356#8:1460\n357#8,2:1474\n4206#9,6:1351\n4206#9,6:1395\n4206#9,6:1452\n113#10:1473\n113#10:1582\n113#10:1583\n113#10:1584\n113#10:1585\n113#10:1586\n113#10:1587\n113#10:1588\n503#11,13:1484\n150#11,3:1563\n34#11,4:1566\n39#11:1579\n153#11:1580\n65#12,10:1497\n110#13:1513\n69#14:1514\n69#14:1524\n65#14:1530\n69#14:1533\n65#14:1539\n69#14:1542\n65#14:1570\n69#14:1573\n70#15:1515\n53#15,3:1518\n60#15:1522\n70#15:1525\n53#15,3:1527\n60#15:1531\n70#15:1534\n53#15,3:1536\n60#15:1540\n70#15:1543\n53#15,3:1545\n60#15:1571\n70#15:1574\n53#15,3:1576\n22#16:1516\n22#16:1523\n22#16:1532\n22#16:1541\n22#16:1572\n30#17:1517\n30#17:1526\n30#17:1535\n30#17:1544\n30#17:1575\n57#18:1521\n1485#19:1548\n1510#19,3:1549\n1513#19,3:1559\n381#20,7:1552\n216#21:1562\n217#21:1581\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n167#1:1289,6\n171#1:1296,6\n406#1:1304,6\n407#1:1310,6\n411#1:1316,6\n754#1:1408,6\n766#1:1414,6\n790#1:1461,6\n791#1:1467,6\n839#1:1478,6\n929#1:1507,6\n176#1:1302\n417#1:1322\n695#1:1361\n696#1:1362\n739#1:1405\n740#1:1406\n741#1:1407\n191#1:1303\n689#1:1360\n733#1:1404\n685#1:1323\n685#1:1324,9\n685#1:1366\n729#1:1367\n729#1:1368,9\n729#1:1423\n789#1:1424\n789#1:1425,9\n789#1:1477\n685#1:1333,6\n685#1:1348,3\n685#1:1357,2\n685#1:1365\n729#1:1377,6\n729#1:1392,3\n729#1:1401,2\n729#1:1422\n789#1:1434,6\n789#1:1449,3\n789#1:1458,2\n789#1:1476\n685#1:1339,9\n685#1:1359\n685#1:1363,2\n729#1:1383,9\n729#1:1403\n729#1:1420,2\n789#1:1440,9\n789#1:1460\n789#1:1474,2\n685#1:1351,6\n729#1:1395,6\n789#1:1452,6\n818#1:1473\n1249#1:1582\n1250#1:1583\n1251#1:1584\n1252#1:1585\n1255#1:1586\n1256#1:1587\n1257#1:1588\n888#1:1484,13\n870#1:1563,3\n870#1:1566,4\n870#1:1579\n870#1:1580\n919#1:1497,10\n1030#1:1513\n841#1:1514\n842#1:1524\n853#1:1530\n853#1:1533\n856#1:1539\n856#1:1542\n870#1:1570\n870#1:1573\n841#1:1515\n841#1:1518,3\n842#1:1522\n842#1:1525\n842#1:1527,3\n853#1:1531\n853#1:1534\n853#1:1536,3\n856#1:1540\n856#1:1543\n856#1:1545,3\n870#1:1571\n870#1:1574\n870#1:1576,3\n841#1:1516\n842#1:1523\n853#1:1532\n856#1:1541\n870#1:1572\n841#1:1517\n842#1:1526\n853#1:1535\n856#1:1544\n870#1:1575\n842#1:1521\n867#1:1548\n867#1:1549,3\n867#1:1559,3\n867#1:1552,7\n868#1:1562\n868#1:1581\n*E\n"})
public final class qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f24409a = androidx.compose.ui.unit.h.r(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24410b = androidx.compose.ui.unit.h.r(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f24411c = androidx.compose.ui.unit.h.r(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f24412d = androidx.compose.ui.unit.h.r(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f24413e = androidx.compose.ui.unit.h.r(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f24414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f24415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.a0 f24416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<Float> f24417i;

    @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1288:1\n75#2:1289\n75#2:1290\n1282#3,6:1291\n1282#3,6:1297\n1282#3,6:1303\n1282#3,6:1309\n1282#3,3:1322\n1285#3,3:1326\n1282#3,6:1329\n1282#3,6:1335\n1282#3,6:1341\n1282#3,6:1347\n607#4:1315\n604#4,6:1316\n605#5:1325\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n419#1:1289\n424#1:1290\n435#1:1291,6\n436#1:1297,6\n439#1:1303,6\n446#1:1309,6\n453#1:1322,3\n453#1:1326,3\n455#1:1329,6\n481#1:1335,6\n526#1:1341,6\n535#1:1347,6\n453#1:1315\n453#1:1316,6\n453#1:1325\n*E\n"})
    static final class a implements pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f24418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f24419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Float> f24420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function1<kotlin.ranges.f<Float>, Unit>> f24422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f24425h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f24426i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ue f24427j;

        /* JADX INFO: renamed from: androidx.compose.material.qf$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0191a extends kotlin.jvm.internal.g0 implements Function1<Float, Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.f<Float> f24428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f24429b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f24430c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0191a(kotlin.ranges.f<Float> fVar, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2) {
                super(1, Intrinsics.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.f24428a = fVar;
                this.f24429b = eVar;
                this.f24430c = eVar2;
            }

            public final Float X(float f10) {
                return Float.valueOf(a.z(this.f24428a, this.f24429b, this.f24430c, f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return X(f10.floatValue());
            }
        }

        /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function1<Float, Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.f<Float> f24431a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f24432b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f24433c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlin.ranges.f<Float> fVar, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2) {
                super(1, Intrinsics.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.f24431a = fVar;
                this.f24432b = eVar;
                this.f24433c = eVar2;
            }

            public final Float X(float f10) {
                return Float.valueOf(a.z(this.f24431a, this.f24432b, this.f24433c, f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return X(f10.floatValue());
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {465}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24434a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f24435b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f24436c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24437d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f24438e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k3 f24439f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k3 f24440g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Function1<kotlin.ranges.f<Float>, Unit>> f24441h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f24442i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f24443j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.f<Float> f24444k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(float f10, float f11, Function0<Unit> function0, boolean z10, androidx.compose.runtime.k3 k3Var, androidx.compose.runtime.k3 k3Var2, androidx.compose.runtime.n7<? extends Function1<? super kotlin.ranges.f<Float>, Unit>> n7Var, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, kotlin.ranges.f<Float> fVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f24435b = f10;
                this.f24436c = f11;
                this.f24437d = function0;
                this.f24438e = z10;
                this.f24439f = k3Var;
                this.f24440g = k3Var2;
                this.f24441h = n7Var;
                this.f24442i = eVar;
                this.f24443j = eVar2;
                this.f24444k = fVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(boolean z10, androidx.compose.runtime.k3 k3Var, androidx.compose.runtime.k3 k3Var2, androidx.compose.runtime.n7 n7Var, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, kotlin.ranges.f fVar, androidx.compose.animation.core.c cVar) {
                (z10 ? k3Var : k3Var2).q(((Number) cVar.v()).floatValue());
                ((Function1) n7Var.getValue()).invoke(a.A(eVar, eVar2, fVar, kotlin.ranges.r.e(k3Var.V0(), k3Var2.V0())));
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f24435b, this.f24436c, this.f24437d, this.f24438e, this.f24439f, this.f24440g, this.f24441h, this.f24442i, this.f24443j, this.f24444k, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f24434a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVarB = androidx.compose.animation.core.d.b(this.f24435b, 0.0f, 2, null);
                    Float fE = kotlin.coroutines.jvm.internal.b.e(this.f24436c);
                    androidx.compose.animation.core.y3 y3Var = qf.f24417i;
                    Float fE2 = kotlin.coroutines.jvm.internal.b.e(0.0f);
                    final boolean z10 = this.f24438e;
                    final androidx.compose.runtime.k3 k3Var = this.f24439f;
                    final androidx.compose.runtime.k3 k3Var2 = this.f24440g;
                    final androidx.compose.runtime.n7<Function1<kotlin.ranges.f<Float>, Unit>> n7Var = this.f24441h;
                    final kotlin.jvm.internal.i1.e eVar = this.f24442i;
                    final kotlin.jvm.internal.i1.e eVar2 = this.f24443j;
                    final kotlin.ranges.f<Float> fVar = this.f24444k;
                    Function1 function1 = new Function1() { // from class: androidx.compose.material.rf
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return qf.a.c.m(z10, k3Var, k3Var2, n7Var, eVar, eVar2, fVar, (androidx.compose.animation.core.c) obj2);
                        }
                    };
                    this.f24434a = 1;
                    if (cVarB.h(fE, y3Var, fE2, function1, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                Function0<Unit> function0 = this.f24437d;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.ranges.f<Float> fVar, kotlin.ranges.f<Float> fVar2, List<Float> list, Function0<Unit> function0, androidx.compose.runtime.n7<? extends Function1<? super kotlin.ranges.f<Float>, Unit>> n7Var, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.j jVar2, boolean z10, int i10, ue ueVar) {
            this.f24418a = fVar;
            this.f24419b = fVar2;
            this.f24420c = list;
            this.f24421d = function0;
            this.f24422e = n7Var;
            this.f24423f = jVar;
            this.f24424g = jVar2;
            this.f24425h = z10;
            this.f24426i = i10;
            this.f24427j = ueVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.ranges.f<Float> A(kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, kotlin.ranges.f<Float> fVar, kotlin.ranges.f<Float> fVar2) {
            return qf.b0(eVar.f312748a, eVar2.f312748a, fVar2, fVar.u().floatValue(), fVar.i().floatValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(androidx.compose.runtime.n7 n7Var, float f10, float f11) {
            ((Function1) n7Var.getValue()).invoke(kotlin.ranges.r.e(f11, f10));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(androidx.compose.runtime.n7 n7Var, float f10, float f11) {
            ((Function1) n7Var.getValue()).invoke(kotlin.ranges.r.e(f10, f11));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(androidx.compose.runtime.k3 k3Var, androidx.compose.runtime.k3 k3Var2, List list, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, Function0 function0, kotlinx.coroutines.s0 s0Var, androidx.compose.runtime.n7 n7Var, kotlin.ranges.f fVar, boolean z10) {
            float fV0 = (z10 ? k3Var : k3Var2).V0();
            float fI0 = qf.i0(fV0, list, eVar.f312748a, eVar2.f312748a);
            if (fV0 != fI0) {
                kotlinx.coroutines.k.f(s0Var, null, null, new c(fV0, fI0, function0, z10, k3Var, k3Var2, n7Var, eVar, eVar2, fVar, null), 3, null);
                return Unit.f312394a;
            }
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit y(androidx.compose.runtime.k3 k3Var, androidx.compose.runtime.k3 k3Var2, kotlin.ranges.f fVar, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, androidx.compose.runtime.n7 n7Var, kotlin.ranges.f fVar2, boolean z10, float f10) {
            kotlin.ranges.f<Float> fVarE;
            if (z10) {
                k3Var.q(k3Var.V0() + f10);
                k3Var2.q(z(fVar2, eVar, eVar2, ((Number) fVar.i()).floatValue()));
                float fV0 = k3Var2.V0();
                fVarE = kotlin.ranges.r.e(kotlin.ranges.r.H(k3Var.V0(), eVar.f312748a, fV0), fV0);
            } else {
                k3Var2.q(k3Var2.V0() + f10);
                k3Var.q(z(fVar2, eVar, eVar2, ((Number) fVar.u()).floatValue()));
                float fV1 = k3Var.V0();
                fVarE = kotlin.ranges.r.e(fV1, kotlin.ranges.r.H(k3Var2.V0(), fV1, eVar2.f312748a));
            }
            ((Function1) n7Var.getValue()).invoke(A(eVar, eVar2, fVar2, fVarE));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float z(kotlin.ranges.f<Float> fVar, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, float f10) {
            return qf.a0(fVar.u().floatValue(), fVar.i().floatValue(), f10, eVar.f312748a, eVar2.f312748a);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            n(h0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void n(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.foundation.layout.h0 h0Var2;
            int i11;
            kotlin.jvm.internal.i1.e eVar;
            kotlin.jvm.internal.i1.e eVar2;
            if ((i10 & 6) == 0) {
                h0Var2 = h0Var;
                i11 = i10 | (c0Var.D(h0Var2) ? 4 : 2);
            } else {
                h0Var2 = h0Var;
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(652589923, i11, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:418)");
            }
            boolean z10 = c0Var.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl;
            float fP = androidx.compose.ui.unit.b.p(h0Var2.h());
            final kotlin.jvm.internal.i1.e eVar3 = new kotlin.jvm.internal.i1.e();
            final kotlin.jvm.internal.i1.e eVar4 = new kotlin.jvm.internal.i1.e();
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            eVar3.f312748a = fP - dVar.S7(qf.X());
            eVar4.f312748a = dVar.S7(qf.X());
            kotlin.ranges.f<Float> fVar = this.f24419b;
            kotlin.ranges.f<Float> fVar2 = this.f24418a;
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.g4.b(z(fVar2, eVar4, eVar3, fVar.u().floatValue()));
                c0Var.Y(objI0);
            }
            final androidx.compose.runtime.k3 k3Var = (androidx.compose.runtime.k3) objI0;
            kotlin.ranges.f<Float> fVar3 = this.f24419b;
            kotlin.ranges.f<Float> fVar4 = this.f24418a;
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.g4.b(z(fVar4, eVar4, eVar3, fVar3.i().floatValue()));
                c0Var.Y(objI1);
            }
            final androidx.compose.runtime.k3 k3Var2 = (androidx.compose.runtime.k3) objI1;
            boolean zD = c0Var.D(this.f24418a) | c0Var.I(eVar4.f312748a) | c0Var.I(eVar3.f312748a);
            kotlin.ranges.f<Float> fVar5 = this.f24418a;
            Object objI2 = c0Var.i0();
            if (zD || objI2 == aVar.a()) {
                objI2 = new C0191a(fVar5, eVar4, eVar3);
                c0Var.Y(objI2);
            }
            qf.o((Function1) ((kotlin.reflect.i) objI2), this.f24418a, kotlin.ranges.r.e(eVar4.f312748a, eVar3.f312748a), k3Var, this.f24419b.u().floatValue(), c0Var, 3072);
            boolean zD2 = c0Var.D(this.f24418a) | c0Var.I(eVar4.f312748a) | c0Var.I(eVar3.f312748a);
            kotlin.ranges.f<Float> fVar6 = this.f24418a;
            Object objI3 = c0Var.i0();
            if (zD2 || objI3 == aVar.a()) {
                objI3 = new b(fVar6, eVar4, eVar3);
                c0Var.Y(objI3);
            }
            qf.o((Function1) ((kotlin.reflect.i) objI3), this.f24418a, kotlin.ranges.r.e(eVar4.f312748a, eVar3.f312748a), k3Var2, this.f24419b.i().floatValue(), c0Var, 3072);
            Object objI4 = c0Var.i0();
            if (objI4 == aVar.a()) {
                objI4 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
                c0Var.Y(objI4);
            }
            final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI4;
            boolean zK0 = c0Var.k0(this.f24420c) | c0Var.I(eVar4.f312748a) | c0Var.I(eVar3.f312748a) | c0Var.D(this.f24421d) | c0Var.k0(s0Var) | c0Var.D(this.f24422e) | c0Var.D(this.f24418a);
            final List<Float> list = this.f24420c;
            final Function0<Unit> function0 = this.f24421d;
            final androidx.compose.runtime.n7<Function1<kotlin.ranges.f<Float>, Unit>> n7Var = this.f24422e;
            final kotlin.ranges.f<Float> fVar7 = this.f24418a;
            Object objI5 = c0Var.i0();
            if (zK0 || objI5 == aVar.a()) {
                objI5 = new Function1() { // from class: androidx.compose.material.mf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qf.a.x(k3Var, k3Var2, list, eVar4, eVar3, function0, s0Var, n7Var, fVar7, ((Boolean) obj).booleanValue());
                    }
                };
                eVar = eVar4;
                eVar2 = eVar3;
                c0Var.Y(objI5);
            } else {
                eVar2 = eVar3;
                eVar = eVar4;
            }
            androidx.compose.runtime.n7 n7VarW = androidx.compose.runtime.w6.w((Function1) objI5, c0Var, 0);
            boolean zD3 = c0Var.D(this.f24418a) | c0Var.I(eVar.f312748a) | c0Var.I(eVar2.f312748a) | c0Var.D(this.f24419b) | c0Var.D(this.f24422e);
            final kotlin.ranges.f<Float> fVar8 = this.f24419b;
            final androidx.compose.runtime.n7<Function1<kotlin.ranges.f<Float>, Unit>> n7Var2 = this.f24422e;
            final kotlin.ranges.f<Float> fVar9 = this.f24418a;
            Object objI6 = c0Var.i0();
            if (zD3 || objI6 == aVar.a()) {
                final kotlin.jvm.internal.i1.e eVar5 = eVar2;
                final kotlin.jvm.internal.i1.e eVar6 = eVar;
                objI6 = new Function2() { // from class: androidx.compose.material.nf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qf.a.y(k3Var, k3Var2, fVar8, eVar6, eVar5, n7Var2, fVar9, ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue());
                    }
                };
                c0Var.Y(objI6);
            }
            androidx.compose.runtime.n7 n7VarW2 = androidx.compose.runtime.w6.w((Function2) objI6, c0Var, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarZ = qf.Z(aVar2, this.f24423f, this.f24424g, k3Var, k3Var2, this.f24425h, z10, fP, this.f24418a, n7VarW, n7VarW2);
            final float fH = kotlin.ranges.r.H(this.f24419b.u().floatValue(), this.f24418a.u().floatValue(), this.f24419b.i().floatValue());
            final float fH2 = kotlin.ranges.r.H(this.f24419b.i().floatValue(), this.f24419b.u().floatValue(), this.f24418a.i().floatValue());
            float fW = qf.W(this.f24418a.u().floatValue(), this.f24418a.i().floatValue(), fH);
            float fW2 = qf.W(this.f24418a.u().floatValue(), this.f24418a.i().floatValue(), fH2);
            int iFloor = (int) Math.floor(this.f24426i * fW2);
            int iFloor2 = (int) Math.floor(this.f24426i * (1.0f - fW));
            boolean z11 = this.f24425h;
            boolean zD4 = c0Var.D(this.f24422e) | c0Var.I(fH2);
            final androidx.compose.runtime.n7<Function1<kotlin.ranges.f<Float>, Unit>> n7Var3 = this.f24422e;
            Object objI7 = c0Var.i0();
            if (zD4 || objI7 == aVar.a()) {
                objI7 = new Function1() { // from class: androidx.compose.material.of
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qf.a.s(n7Var3, fH2, ((Float) obj).floatValue());
                    }
                };
                c0Var.Y(objI7);
            }
            androidx.compose.ui.a0 a0VarD0 = qf.d0(aVar2, fH, z11, (Function1) objI7, this.f24421d, kotlin.ranges.r.e(this.f24418a.u().floatValue(), fH2), iFloor);
            boolean z12 = this.f24425h;
            boolean zD5 = c0Var.D(this.f24422e) | c0Var.I(fH);
            final androidx.compose.runtime.n7<Function1<kotlin.ranges.f<Float>, Unit>> n7Var4 = this.f24422e;
            Object objI8 = c0Var.i0();
            if (zD5 || objI8 == aVar.a()) {
                objI8 = new Function1() { // from class: androidx.compose.material.pf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qf.a.v(n7Var4, fH, ((Float) obj).floatValue());
                    }
                };
                c0Var.Y(objI8);
            }
            qf.t(this.f24425h, fW, fW2, this.f24420c, this.f24427j, eVar2.f312748a - eVar.f312748a, this.f24423f, this.f24424g, a0VarZ, a0VarD0, qf.d0(aVar2, fH2, z12, (Function1) objI8, this.f24421d, kotlin.ranges.r.e(fH, this.f24418a.i().floatValue()), iFloor2), c0Var, 14155776, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
    }

    @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1288:1\n75#2:1289\n75#2:1290\n607#3:1291\n604#3,6:1292\n1282#4,3:1298\n1285#4,3:1302\n1282#4,6:1305\n1282#4,6:1311\n1282#4,6:1317\n1282#4,6:1323\n1282#4,6:1329\n1282#4,6:1335\n605#5:1301\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n*L\n196#1:1289\n201#1:1290\n212#1:1291\n212#1:1292,6\n212#1:1298,3\n212#1:1302,3\n213#1:1305,6\n214#1:1311,6\n217#1:1317,6\n226#1:1323,6\n229#1:1329,6\n260#1:1335,6\n212#1:1301\n*E\n"})
    static final class b implements pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f24445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f24446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Float> f24447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f24450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ue f24451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function1<Float, Unit>> f24452h;

        /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<Float, Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.f<Float> f24453a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f24454b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.e f24455c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.ranges.f<Float> fVar, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2) {
                super(1, Intrinsics.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.f24453a = fVar;
                this.f24454b = eVar;
                this.f24455c = eVar2;
            }

            public final Float X(float f10) {
                return Float.valueOf(b.n(this.f24453a, this.f24454b, this.f24455c, f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return X(f10.floatValue());
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material.qf$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$Slider$2$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C0192b extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ float f24457b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Function1<Float, Unit>> f24458c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0192b(androidx.compose.runtime.n7<? extends Function1<? super Float, Unit>> n7Var, kotlin.coroutines.d<? super C0192b> dVar) {
                super(3, dVar);
                this.f24458c = n7Var;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
                return k(s0Var, f10.floatValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f24456a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f24458c.getValue().invoke(kotlin.coroutines.jvm.internal.b.e(this.f24457b));
                return Unit.f312394a;
            }

            public final Object k(kotlinx.coroutines.s0 s0Var, float f10, kotlin.coroutines.d<? super Unit> dVar) {
                C0192b c0192b = new C0192b(this.f24458c, dVar);
                c0192b.f24457b = f10;
                return c0192b.invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24459a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ we f24460b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f24461c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f24462d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f24463e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24464f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(we weVar, float f10, float f11, float f12, Function0<Unit> function0, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f24460b = weVar;
                this.f24461c = f10;
                this.f24462d = f11;
                this.f24463e = f12;
                this.f24464f = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f24460b, this.f24461c, this.f24462d, this.f24463e, this.f24464f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f24459a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    we weVar = this.f24460b;
                    float f10 = this.f24461c;
                    float f11 = this.f24462d;
                    float f12 = this.f24463e;
                    this.f24459a = 1;
                    if (qf.T(weVar, f10, f11, f12, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                Function0<Unit> function0 = this.f24464f;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.ranges.f<Float> fVar, float f10, List<Float> list, Function0<Unit> function0, androidx.compose.foundation.interaction.j jVar, boolean z10, ue ueVar, androidx.compose.runtime.n7<? extends Function1<? super Float, Unit>> n7Var) {
            this.f24445a = fVar;
            this.f24446b = f10;
            this.f24447c = list;
            this.f24448d = function0;
            this.f24449e = jVar;
            this.f24450f = z10;
            this.f24451g = ueVar;
            this.f24452h = n7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(androidx.compose.runtime.k3 k3Var, androidx.compose.runtime.k3 k3Var2, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, androidx.compose.runtime.n7 n7Var, kotlin.ranges.f fVar, float f10) {
            k3Var.q(k3Var.V0() + f10 + k3Var2.V0());
            k3Var2.q(0.0f);
            ((Function1) n7Var.getValue()).invoke(Float.valueOf(s(eVar, eVar2, fVar, kotlin.ranges.r.H(k3Var.V0(), eVar.f312748a, eVar2.f312748a))));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(androidx.compose.runtime.k3 k3Var, List list, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, kotlinx.coroutines.s0 s0Var, we weVar, Function0 function0, float f10) {
            float fV0 = k3Var.V0();
            float fI0 = qf.i0(fV0, list, eVar.f312748a, eVar2.f312748a);
            if (fV0 != fI0) {
                kotlinx.coroutines.k.f(s0Var, null, null, new c(weVar, fV0, fI0, f10, function0, null), 3, null);
            } else if (!weVar.h() && function0 != null) {
                function0.invoke();
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float n(kotlin.ranges.f<Float> fVar, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, float f10) {
            return qf.a0(fVar.u().floatValue(), fVar.i().floatValue(), f10, eVar.f312748a, eVar2.f312748a);
        }

        private static final float s(kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.e eVar2, kotlin.ranges.f<Float> fVar, float f10) {
            return qf.a0(eVar.f312748a, eVar2.f312748a, f10, fVar.u().floatValue(), fVar.i().floatValue());
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void i(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.foundation.layout.h0 h0Var2;
            int i11;
            kotlin.jvm.internal.i1.e eVar;
            kotlin.jvm.internal.i1.e eVar2;
            final we weVar;
            kotlin.jvm.internal.i1.e eVar3;
            kotlin.jvm.internal.i1.e eVar4;
            if ((i10 & 6) == 0) {
                h0Var2 = h0Var;
                i11 = i10 | (c0Var.D(h0Var2) ? 4 : 2);
            } else {
                h0Var2 = h0Var;
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2085116814, i11, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:195)");
            }
            boolean z10 = c0Var.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl;
            float fP = androidx.compose.ui.unit.b.p(h0Var2.h());
            final kotlin.jvm.internal.i1.e eVar5 = new kotlin.jvm.internal.i1.e();
            final kotlin.jvm.internal.i1.e eVar6 = new kotlin.jvm.internal.i1.e();
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            eVar5.f312748a = Math.max(fP - dVar.S7(qf.X()), 0.0f);
            eVar6.f312748a = Math.min(dVar.S7(qf.X()), eVar5.f312748a);
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
                c0Var.Y(objI0);
            }
            final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
            float f10 = this.f24446b;
            kotlin.ranges.f<Float> fVar = this.f24445a;
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.g4.b(n(fVar, eVar6, eVar5, f10));
                c0Var.Y(objI1);
            }
            final androidx.compose.runtime.k3 k3Var = (androidx.compose.runtime.k3) objI1;
            Object objI2 = c0Var.i0();
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.runtime.g4.b(0.0f);
                c0Var.Y(objI2);
            }
            final androidx.compose.runtime.k3 k3Var2 = (androidx.compose.runtime.k3) objI2;
            boolean zI = c0Var.I(eVar6.f312748a) | c0Var.I(eVar5.f312748a) | c0Var.D(this.f24445a);
            final androidx.compose.runtime.n7<Function1<Float, Unit>> n7Var = this.f24452h;
            final kotlin.ranges.f<Float> fVar2 = this.f24445a;
            Object objI3 = c0Var.i0();
            if (zI || objI3 == aVar.a()) {
                eVar = eVar6;
                eVar2 = eVar5;
                objI3 = new we(new Function1() { // from class: androidx.compose.material.sf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qf.b.k(k3Var, k3Var2, eVar6, eVar5, n7Var, fVar2, ((Float) obj).floatValue());
                    }
                });
                c0Var.Y(objI3);
            } else {
                eVar2 = eVar5;
                eVar = eVar6;
            }
            we weVar2 = (we) objI3;
            boolean zD = c0Var.D(this.f24445a) | c0Var.I(eVar.f312748a) | c0Var.I(eVar2.f312748a);
            kotlin.ranges.f<Float> fVar3 = this.f24445a;
            Object objI4 = c0Var.i0();
            if (zD || objI4 == aVar.a()) {
                objI4 = new a(fVar3, eVar, eVar2);
                c0Var.Y(objI4);
            }
            qf.o((Function1) ((kotlin.reflect.i) objI4), this.f24445a, kotlin.ranges.r.e(eVar.f312748a, eVar2.f312748a), k3Var, this.f24446b, c0Var, 3072);
            boolean zK0 = c0Var.k0(this.f24447c) | c0Var.I(eVar.f312748a) | c0Var.I(eVar2.f312748a) | c0Var.k0(s0Var) | c0Var.k0(weVar2) | c0Var.D(this.f24448d);
            final List<Float> list = this.f24447c;
            final Function0<Unit> function0 = this.f24448d;
            Object objI5 = c0Var.i0();
            if (zK0 || objI5 == aVar.a()) {
                weVar = weVar2;
                final kotlin.jvm.internal.i1.e eVar7 = eVar2;
                final kotlin.jvm.internal.i1.e eVar8 = eVar;
                Object obj = new Function1() { // from class: androidx.compose.material.tf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return qf.b.m(k3Var, list, eVar8, eVar7, s0Var, weVar, function0, ((Float) obj2).floatValue());
                    }
                };
                eVar3 = eVar8;
                eVar4 = eVar7;
                c0Var.Y(obj);
                objI5 = obj;
            } else {
                eVar4 = eVar2;
                eVar3 = eVar;
                weVar = weVar2;
            }
            androidx.compose.runtime.n7 n7VarW = androidx.compose.runtime.w6.w((Function1) objI5, c0Var, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH0 = qf.h0(aVar2, weVar, this.f24449e, fP, z10, k3Var, n7VarW, k3Var2, this.f24450f);
            androidx.compose.foundation.gestures.q3 q3Var = androidx.compose.foundation.gestures.q3.Horizontal;
            boolean zH = weVar.h();
            boolean z11 = this.f24450f;
            boolean z12 = z10;
            androidx.compose.foundation.interaction.j jVar = this.f24449e;
            boolean zD2 = c0Var.D(n7VarW);
            Object objI6 = c0Var.i0();
            if (zD2 || objI6 == aVar.a()) {
                objI6 = new C0192b(n7VarW, null);
                c0Var.Y(objI6);
            }
            qf.z(this.f24450f, qf.W(this.f24445a.u().floatValue(), this.f24445a.i().floatValue(), kotlin.ranges.r.H(this.f24446b, this.f24445a.u().floatValue(), this.f24445a.i().floatValue())), this.f24447c, this.f24451g, eVar4.f312748a - eVar3.f312748a, this.f24449e, a0VarH0.B2(androidx.compose.foundation.gestures.x2.i(aVar2, weVar, q3Var, z11, jVar, zH, null, (pj.n) objI6, z12, 32, null)), c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            i(h0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$SliderThumb$1$1$1", f = "Slider.kt", i = {}, l = {792}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f24467c;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f24468a;

            a(SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList) {
                this.f24468a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f24468a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f24468a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f24468a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
                    this.f24468a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.c) {
                    this.f24468a.remove(((androidx.compose.foundation.interaction.a.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.C0087a) {
                    this.f24468a.remove(((androidx.compose.foundation.interaction.a.C0087a) gVar).a());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.interaction.j jVar, SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f24466b = jVar;
            this.f24467c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f24466b, this.f24467c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24465a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f24466b.c();
                a aVar = new a(this.f24467c);
                this.f24465a = 1;
                if (iVarC.collect(aVar, this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {com.google.api.v.f116367a}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f24471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f24472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f24473e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f10, float f11, float f12, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f24471c = f10;
            this.f24472d = f11;
            this.f24473e = f12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(androidx.compose.foundation.gestures.k2 k2Var, kotlin.jvm.internal.i1.e eVar, androidx.compose.animation.core.c cVar) {
            k2Var.a(((Number) cVar.v()).floatValue() - eVar.f312748a);
            eVar.f312748a = ((Number) cVar.v()).floatValue();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f24471c, this.f24472d, this.f24473e, dVar);
            dVar2.f24470b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24469a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final androidx.compose.foundation.gestures.k2 k2Var = (androidx.compose.foundation.gestures.k2) this.f24470b;
                final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
                float f10 = this.f24471c;
                eVar.f312748a = f10;
                androidx.compose.animation.core.c cVarB = androidx.compose.animation.core.d.b(f10, 0.0f, 2, null);
                Float fE = kotlin.coroutines.jvm.internal.b.e(this.f24472d);
                androidx.compose.animation.core.y3 y3Var = qf.f24417i;
                Float fE2 = kotlin.coroutines.jvm.internal.b.e(this.f24473e);
                Function1 function1 = new Function1() { // from class: androidx.compose.material.uf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return qf.d.n(k2Var, eVar, (androidx.compose.animation.core.c) obj2);
                    }
                };
                this.f24469a = 1;
                if (cVarB.h(fE, y3Var, fE2, function1, this) == objL) {
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
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.foundation.gestures.k2 k2Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(k2Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt", f = "Slider.kt", i = {0}, l = {901}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f24474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24476c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24475b = obj;
            this.f24476c |= Integer.MIN_VALUE;
            return qf.U(null, 0L, 0, this);
        }
    }

    static final class f implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Float> f24479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Float> f24480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function2<Boolean, Float, Unit>> f24481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f24482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f24483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function1<Boolean, Unit>> f24484h;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1081}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24485a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f24486b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f24487c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f24488d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f24489e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ rd f24490f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Float> f24491g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Function1<Boolean, Unit>> f24492h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Float> f24493i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Function2<Boolean, Float, Unit>> f24494j;

            /* JADX INFO: renamed from: androidx.compose.material.qf$f$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1082, 1093, 1115}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", androidx.core.app.w.I0, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1288:1\n65#2:1289\n65#2:1292\n65#2:1295\n60#3:1290\n60#3:1293\n60#3:1296\n22#4:1291\n22#4:1294\n22#4:1297\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1\n*L\n1084#1:1289\n1101#1:1292\n1116#1:1295\n1084#1:1290\n1101#1:1293\n1116#1:1296\n1084#1:1291\n1101#1:1294\n1116#1:1297\n*E\n"})
            static final class C0193a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f24495a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f24496b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f24497c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f24498d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f24499e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f24500f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f24501g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ float f24502h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ rd f24503i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.n7<Float> f24504j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f24505k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.n7<Function1<Boolean, Unit>> f24506l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.n7<Float> f24507m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.n7<Function2<Boolean, Float, Unit>> f24508n;

                /* JADX INFO: renamed from: androidx.compose.material.qf$f$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1133}, m = "invokeSuspend", n = {}, s = {})
                static final class C0194a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f24509a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ rd f24510b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ kotlin.jvm.internal.i1.a f24511c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.a f24512d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0194a(rd rdVar, kotlin.jvm.internal.i1.a aVar, androidx.compose.foundation.interaction.a aVar2, kotlin.coroutines.d<? super C0194a> dVar) {
                        super(2, dVar);
                        this.f24510b = rdVar;
                        this.f24511c = aVar;
                        this.f24512d = aVar2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new C0194a(this.f24510b, this.f24511c, this.f24512d, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f24509a;
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            androidx.compose.foundation.interaction.j jVarA = this.f24510b.a(this.f24511c.f312744a);
                            androidx.compose.foundation.interaction.a aVar = this.f24512d;
                            this.f24509a = 1;
                            if (jVarA.b(aVar, this) == objL) {
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
                        return ((C0194a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0193a(boolean z10, float f10, rd rdVar, androidx.compose.runtime.n7<Float> n7Var, kotlinx.coroutines.s0 s0Var, androidx.compose.runtime.n7<? extends Function1<? super Boolean, Unit>> n7Var2, androidx.compose.runtime.n7<Float> n7Var3, androidx.compose.runtime.n7<? extends Function2<? super Boolean, ? super Float, Unit>> n7Var4, kotlin.coroutines.d<? super C0193a> dVar) {
                    super(2, dVar);
                    this.f24501g = z10;
                    this.f24502h = f10;
                    this.f24503i = rdVar;
                    this.f24504j = n7Var;
                    this.f24505k = s0Var;
                    this.f24506l = n7Var2;
                    this.f24507m = n7Var3;
                    this.f24508n = n7Var4;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit n(androidx.compose.runtime.n7 n7Var, kotlin.jvm.internal.i1.a aVar, boolean z10, androidx.compose.ui.input.pointer.c0 c0Var) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.r.k(c0Var) >> 32));
                    Function2 function2 = (Function2) n7Var.getValue();
                    Boolean boolValueOf = Boolean.valueOf(aVar.f312744a);
                    if (z10) {
                        fIntBitsToFloat = -fIntBitsToFloat;
                    }
                    function2.invoke(boolValueOf, Float.valueOf(fIntBitsToFloat));
                    return Unit.f312394a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C0193a c0193a = new C0193a(this.f24501g, this.f24502h, this.f24503i, this.f24504j, this.f24505k, this.f24506l, this.f24507m, this.f24508n, dVar);
                    c0193a.f24500f = obj;
                    return c0193a;
                }

                /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0184, code lost:
                
                    if (r1 == r6) goto L53;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                    /*
                        Method dump skipped, instruction units count: 456
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.qf.f.a.C0193a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0193a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.ui.input.pointer.l0 l0Var, boolean z10, float f10, rd rdVar, androidx.compose.runtime.n7<Float> n7Var, androidx.compose.runtime.n7<? extends Function1<? super Boolean, Unit>> n7Var2, androidx.compose.runtime.n7<Float> n7Var3, androidx.compose.runtime.n7<? extends Function2<? super Boolean, ? super Float, Unit>> n7Var4, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f24487c = l0Var;
                this.f24488d = z10;
                this.f24489e = f10;
                this.f24490f = rdVar;
                this.f24491g = n7Var;
                this.f24492h = n7Var2;
                this.f24493i = n7Var3;
                this.f24494j = n7Var4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f24487c, this.f24488d, this.f24489e, this.f24490f, this.f24491g, this.f24492h, this.f24493i, this.f24494j, dVar);
                aVar.f24486b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f24485a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f24486b;
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f24487c;
                    C0193a c0193a = new C0193a(this.f24488d, this.f24489e, this.f24490f, this.f24491g, s0Var, this.f24492h, this.f24493i, this.f24494j, null);
                    this.f24485a = 1;
                    if (androidx.compose.foundation.gestures.e3.e(l0Var, c0193a, this) == objL) {
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

        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.j jVar2, androidx.compose.runtime.n7<Float> n7Var, androidx.compose.runtime.n7<Float> n7Var2, androidx.compose.runtime.n7<? extends Function2<? super Boolean, ? super Float, Unit>> n7Var3, boolean z10, float f10, androidx.compose.runtime.n7<? extends Function1<? super Boolean, Unit>> n7Var4) {
            this.f24477a = jVar;
            this.f24478b = jVar2;
            this.f24479c = n7Var;
            this.f24480d = n7Var2;
            this.f24481e = n7Var3;
            this.f24482f = z10;
            this.f24483g = f10;
            this.f24484h = n7Var4;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG = kotlinx.coroutines.t0.g(new a(l0Var, this.f24482f, this.f24483g, new rd(this.f24477a, this.f24478b, this.f24479c, this.f24480d, this.f24481e), this.f24479c, this.f24484h, this.f24480d, this.f24481e, null), dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    static final class g implements Function1<androidx.compose.ui.input.key.c, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f24513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f24514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function1<Float, Unit>> f24516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f24517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f24518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function0<Unit>> f24519g;

        /* JADX WARN: Multi-variable type inference failed */
        g(boolean z10, kotlin.ranges.f<Float> fVar, int i10, androidx.compose.runtime.n7<? extends Function1<? super Float, Unit>> n7Var, float f10, boolean z11, androidx.compose.runtime.n7<? extends Function0<Unit>> n7Var2) {
            this.f24513a = z10;
            this.f24514b = fVar;
            this.f24515c = i10;
            this.f24516d = n7Var;
            this.f24517e = f10;
            this.f24518f = z11;
            this.f24519g = n7Var2;
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (!this.f24513a) {
                return Boolean.FALSE;
            }
            int iB = androidx.compose.ui.input.key.e.b(keyEvent);
            androidx.compose.ui.input.key.d.a aVar = androidx.compose.ui.input.key.d.f38913b;
            boolean z10 = false;
            if (androidx.compose.ui.input.key.d.g(iB, aVar.a())) {
                float fAbs = Math.abs(this.f24514b.i().floatValue() - this.f24514b.u().floatValue());
                int i10 = this.f24515c;
                int i11 = i10 > 0 ? i10 + 1 : 100;
                float f10 = fAbs / i11;
                long jA = androidx.compose.ui.input.key.e.a(keyEvent);
                androidx.compose.ui.input.key.b.a aVar2 = androidx.compose.ui.input.key.b.f38761b;
                if (androidx.compose.ui.input.key.b.E4(jA, aVar2.w0())) {
                    this.f24516d.getValue().invoke(kotlin.ranges.r.N(Float.valueOf(this.f24517e + f10), this.f24514b));
                } else if (androidx.compose.ui.input.key.b.E4(jA, aVar2.r0())) {
                    this.f24516d.getValue().invoke(kotlin.ranges.r.N(Float.valueOf(this.f24517e - f10), this.f24514b));
                } else {
                    int i12 = -1;
                    if (androidx.compose.ui.input.key.b.E4(jA, aVar2.v0())) {
                        this.f24516d.getValue().invoke(kotlin.ranges.r.N(Float.valueOf(this.f24517e + ((this.f24518f ? -1 : 1) * f10)), this.f24514b));
                    } else if (androidx.compose.ui.input.key.b.E4(jA, aVar2.u0())) {
                        if (!this.f24518f) {
                            i12 = 1;
                        }
                        this.f24516d.getValue().invoke(kotlin.ranges.r.N(Float.valueOf(this.f24517e - (i12 * f10)), this.f24514b));
                    } else if (androidx.compose.ui.input.key.b.E4(jA, aVar2.S1())) {
                        this.f24516d.getValue().invoke(this.f24514b.u());
                    } else if (androidx.compose.ui.input.key.b.E4(jA, aVar2.R1())) {
                        this.f24516d.getValue().invoke(this.f24514b.i());
                    } else if (androidx.compose.ui.input.key.b.E4(jA, aVar2.D2())) {
                        this.f24516d.getValue().invoke(kotlin.ranges.r.N(Float.valueOf(this.f24517e - (kotlin.ranges.r.I(i11 / 10, 1, 10) * f10)), this.f24514b));
                    } else if (androidx.compose.ui.input.key.b.E4(jA, aVar2.C2())) {
                        this.f24516d.getValue().invoke(kotlin.ranges.r.N(Float.valueOf(this.f24517e + (kotlin.ranges.r.I(i11 / 10, 1, 10) * f10)), this.f24514b));
                    }
                }
                z10 = true;
            } else if (androidx.compose.ui.input.key.d.g(iB, aVar.b())) {
                long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
                androidx.compose.ui.input.key.b.a aVar3 = androidx.compose.ui.input.key.b.f38761b;
                if (androidx.compose.ui.input.key.b.E4(jA2, aVar3.w0()) || androidx.compose.ui.input.key.b.E4(jA2, aVar3.r0()) || androidx.compose.ui.input.key.b.E4(jA2, aVar3.v0()) || androidx.compose.ui.input.key.b.E4(jA2, aVar3.u0()) || androidx.compose.ui.input.key.b.E4(jA2, aVar3.S1()) || androidx.compose.ui.input.key.b.E4(jA2, aVar3.R1()) || androidx.compose.ui.input.key.b.E4(jA2, aVar3.D2()) || androidx.compose.ui.input.key.b.E4(jA2, aVar3.C2())) {
                    Function0<Unit> value = this.f24519g.getValue();
                    if (value != null) {
                        value.invoke();
                    }
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return c(cVar.h());
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n1#1,110:1\n1031#2,10:111\n*E\n"})
    public static final class h extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.a3 f24520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f24522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f24523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7 f24524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7 f24525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3 f24526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f24527h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.compose.foundation.gestures.a3 a3Var, androidx.compose.foundation.interaction.j jVar, float f10, boolean z10, androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n7 n7Var2, androidx.compose.runtime.n3 n3Var, boolean z11) {
            super(1);
            this.f24520a = a3Var;
            this.f24521b = jVar;
            this.f24522c = f10;
            this.f24523d = z10;
            this.f24524e = n7Var;
            this.f24525f = n7Var2;
            this.f24526g = n3Var;
            this.f24527h = z11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("sliderTapModifier");
            t2Var.b().c("draggableState", this.f24520a);
            t2Var.b().c("interactionSource", this.f24521b);
            t2Var.b().c("maxPx", Float.valueOf(this.f24522c));
            t2Var.b().c("isRtl", Boolean.valueOf(this.f24523d));
            t2Var.b().c("rawOffset", this.f24524e);
            t2Var.b().c("gestureEndAction", this.f24525f);
            t2Var.b().c("pressOffset", this.f24526g);
            t2Var.b().c("enabled", Boolean.valueOf(this.f24527h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1288:1\n607#2:1289\n604#2,6:1290\n1282#3,3:1296\n1285#3,3:1300\n1282#3,6:1303\n605#4:1299\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n*L\n1002#1:1289\n1002#1:1290,6\n1002#1:1296,3\n1002#1:1300,3\n1003#1:1303,6\n1002#1:1299\n*E\n"})
    static final class i implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f24528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.a3 f24529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f24531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f24532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Float> f24533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Float> f24534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function1<Float, Unit>> f24535h;

        static final class a implements PointerInputEventHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f24536a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f24537b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n3<Float> f24538c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Float> f24539d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f24540e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.a3 f24541f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Function1<Float, Unit>> f24542g;

            /* JADX INFO: renamed from: androidx.compose.material.qf$i$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1", f = "Slider.kt", i = {}, l = {1009}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2$1$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1288:1\n65#2:1289\n60#3:1290\n22#4:1291\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2$1$1$1\n*L\n1006#1:1289\n1006#1:1290\n1006#1:1291\n*E\n"})
            static final class C0195a extends kotlin.coroutines.jvm.internal.o implements pj.n<androidx.compose.foundation.gestures.r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f24543a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f24544b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ long f24545c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f24546d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f24547e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.n3<Float> f24548f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.n7<Float> f24549g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0195a(boolean z10, float f10, androidx.compose.runtime.n3<Float> n3Var, androidx.compose.runtime.n7<Float> n7Var, kotlin.coroutines.d<? super C0195a> dVar) {
                    super(3, dVar);
                    this.f24546d = z10;
                    this.f24547e = f10;
                    this.f24548f = n3Var;
                    this.f24549g = n7Var;
                }

                @Override // pj.n
                public /* bridge */ /* synthetic */ Object invoke(androidx.compose.foundation.gestures.r3 r3Var, n0.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return k(r3Var, gVar.B(), dVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v8 */
                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f24543a;
                    try {
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            androidx.compose.foundation.gestures.r3 r3Var = (androidx.compose.foundation.gestures.r3) this.f24544b;
                            long j10 = this.f24545c;
                            this.f24548f.setValue(kotlin.coroutines.jvm.internal.b.e((this.f24546d ? this.f24547e - Float.intBitsToFloat((int) (j10 >> 32)) : Float.intBitsToFloat((int) (j10 >> 32))) - this.f24549g.getValue().floatValue()));
                            this.f24543a = 1;
                            Object objE7 = r3Var.e7(this);
                            this = objE7;
                            if (objE7 == objL) {
                                return objL;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                            this = this;
                        }
                    } catch (androidx.compose.foundation.gestures.f3 unused) {
                        this.f24548f.setValue(kotlin.coroutines.jvm.internal.b.e(0.0f));
                    }
                    return Unit.f312394a;
                }

                public final Object k(androidx.compose.foundation.gestures.r3 r3Var, long j10, kotlin.coroutines.d<? super Unit> dVar) {
                    C0195a c0195a = new C0195a(this.f24546d, this.f24547e, this.f24548f, this.f24549g, dVar);
                    c0195a.f24544b = r3Var;
                    c0195a.f24545c = j10;
                    return c0195a.invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1", f = "Slider.kt", i = {}, l = {1016}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f24550a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.gestures.a3 f24551b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.n7<Function1<Float, Unit>> f24552c;

                /* JADX INFO: renamed from: androidx.compose.material.qf$i$a$b$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class C0196a extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f24553a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f24554b;

                    C0196a(kotlin.coroutines.d<? super C0196a> dVar) {
                        super(2, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        C0196a c0196a = new C0196a(dVar);
                        c0196a.f24554b = obj;
                        return c0196a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        kotlin.coroutines.intrinsics.b.l();
                        if (this.f24553a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                        ((androidx.compose.foundation.gestures.k2) this.f24554b).a(0.0f);
                        return Unit.f312394a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(androidx.compose.foundation.gestures.k2 k2Var, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C0196a) create(k2Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(androidx.compose.foundation.gestures.a3 a3Var, androidx.compose.runtime.n7<? extends Function1<? super Float, Unit>> n7Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f24551b = a3Var;
                    this.f24552c = n7Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f24551b, this.f24552c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f24550a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        androidx.compose.foundation.gestures.a3 a3Var = this.f24551b;
                        androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.UserInput;
                        C0196a c0196a = new C0196a(null);
                        this.f24550a = 1;
                        if (a3Var.a(q3Var, c0196a, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    this.f24552c.getValue().invoke(kotlin.coroutines.jvm.internal.b.e(0.0f));
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, float f10, androidx.compose.runtime.n3<Float> n3Var, androidx.compose.runtime.n7<Float> n7Var, kotlinx.coroutines.s0 s0Var, androidx.compose.foundation.gestures.a3 a3Var, androidx.compose.runtime.n7<? extends Function1<? super Float, Unit>> n7Var2) {
                this.f24536a = z10;
                this.f24537b = f10;
                this.f24538c = n3Var;
                this.f24539d = n7Var;
                this.f24540e = s0Var;
                this.f24541f = a3Var;
                this.f24542g = n7Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit b(kotlinx.coroutines.s0 s0Var, androidx.compose.foundation.gestures.a3 a3Var, androidx.compose.runtime.n7 n7Var, n0.g gVar) {
                kotlinx.coroutines.k.f(s0Var, null, null, new b(a3Var, n7Var, null), 3, null);
                return Unit.f312394a;
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                C0195a c0195a = new C0195a(this.f24536a, this.f24537b, this.f24538c, this.f24539d, null);
                final kotlinx.coroutines.s0 s0Var = this.f24540e;
                final androidx.compose.foundation.gestures.a3 a3Var = this.f24541f;
                final androidx.compose.runtime.n7<Function1<Float, Unit>> n7Var = this.f24542g;
                Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, c0195a, new Function1() { // from class: androidx.compose.material.wf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qf.i.a.b(s0Var, a3Var, n7Var, (n0.g) obj);
                    }
                }, dVar, 3, null);
                return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(boolean z10, androidx.compose.foundation.gestures.a3 a3Var, androidx.compose.foundation.interaction.j jVar, float f10, boolean z11, androidx.compose.runtime.n3<Float> n3Var, androidx.compose.runtime.n7<Float> n7Var, androidx.compose.runtime.n7<? extends Function1<? super Float, Unit>> n7Var2) {
            this.f24528a = z10;
            this.f24529b = a3Var;
            this.f24530c = jVar;
            this.f24531d = f10;
            this.f24532e = z11;
            this.f24533f = n3Var;
            this.f24534g = n7Var;
            this.f24535h = n7Var2;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(1945228890);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1945228890, i10, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:1000)");
            }
            if (this.f24528a) {
                c0Var.E(-1679801122);
                Object objI0 = c0Var.i0();
                androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
                    c0Var.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
                Object[] objArr = {this.f24529b, this.f24530c, Float.valueOf(this.f24531d), Boolean.valueOf(this.f24532e)};
                boolean zG = c0Var.G(this.f24532e) | c0Var.I(this.f24531d) | c0Var.D(this.f24533f) | c0Var.D(this.f24534g) | c0Var.k0(s0Var) | c0Var.k0(this.f24529b) | c0Var.D(this.f24535h);
                boolean z10 = this.f24532e;
                float f10 = this.f24531d;
                androidx.compose.runtime.n3<Float> n3Var = this.f24533f;
                androidx.compose.runtime.n7<Float> n7Var = this.f24534g;
                androidx.compose.foundation.gestures.a3 a3Var = this.f24529b;
                androidx.compose.runtime.n7<Function1<Float, Unit>> n7Var2 = this.f24535h;
                Object objI1 = c0Var.i0();
                if (zG || objI1 == aVar.a()) {
                    Object aVar2 = new a(z10, f10, n3Var, n7Var, s0Var, a3Var, n7Var2);
                    c0Var.Y(aVar2);
                    objI1 = aVar2;
                }
                a0Var = androidx.compose.ui.input.pointer.w0.j(a0Var, objArr, (PointerInputEventHandler) objI1);
                c0Var.A();
            } else {
                c0Var.E(-1678708124);
                c0Var.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    static {
        float fR = androidx.compose.ui.unit.h.r(48);
        f24414f = fR;
        float fR2 = androidx.compose.ui.unit.h.r(144);
        f24415g = fR2;
        f24416h = androidx.compose.foundation.layout.i6.k(androidx.compose.foundation.layout.i6.D(androidx.compose.ui.a0.E, fR2, 0.0f, 2, null), 0.0f, fR, 1, null);
        f24417i = new androidx.compose.animation.core.y3<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(boolean z10, float f10, List list, ue ueVar, float f11, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.a0 a0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        z(z10, f10, list, ueVar, f11, jVar, a0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void B(final androidx.compose.foundation.layout.c0 c0Var, final androidx.compose.ui.a0 a0Var, final float f10, final androidx.compose.foundation.interaction.j jVar, final ue ueVar, final boolean z10, final float f11, androidx.compose.runtime.c0 c0Var2, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var2.R(428907178);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(c0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.I(f10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(jVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(ueVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.G(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.I(f11) ? 1048576 : 524288;
        }
        if (c0VarR.h((599187 & i11) != 599186, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(428907178, i11, -1, "androidx.compose.material.SliderThumb (Slider.kt:787)");
            }
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.ui.a0.E, f10, 0.0f, 0.0f, 0.0f, 14, null);
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.a0 a0VarB = c0Var.b(a0VarV, aVar.o());
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB);
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
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar3 = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar3.a()) {
                objI0 = androidx.compose.runtime.w6.g();
                c0VarR.Y(objI0);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objI0;
            boolean z11 = (i11 & 7168) == 2048;
            Object objI1 = c0VarR.i0();
            if (z11 || objI1 == aVar3.a()) {
                objI1 = new c(jVar, snapshotStateList, null);
                c0VarR.Y(objI1);
            }
            int i12 = i11 >> 9;
            androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i12 & 14);
            float fR = !snapshotStateList.isEmpty() ? f24412d : f24411c;
            androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.n2.b(androidx.compose.foundation.w2.d(androidx.compose.foundation.layout.i6.y(a0Var, f11, f11), jVar, wd.h(false, f24410b, 0L, 4, null)), jVar, false, 2, null);
            if (!z10) {
                fR = androidx.compose.ui.unit.h.r(0);
            }
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(a0VarB2, fR, androidx.compose.foundation.shape.o.k(), false, 0L, 0L, 24, null), ueVar.c(z10, c0VarR, ((i11 >> 15) & 14) | (i12 & com.planner5d.library.engine.input.f.b.B)).getValue().M(), androidx.compose.foundation.shape.o.k()), c0VarR, 0);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.df
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qf.C(c0Var, a0Var, f10, jVar, ueVar, z10, f11, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(androidx.compose.foundation.layout.c0 c0Var, androidx.compose.ui.a0 a0Var, float f10, androidx.compose.foundation.interaction.j jVar, ue ueVar, boolean z10, float f11, int i10, androidx.compose.runtime.c0 c0Var2, int i11) {
        B(c0Var, a0Var, f10, jVar, ueVar, z10, f11, c0Var2, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void D(final androidx.compose.ui.a0 a0Var, final ue ueVar, final boolean z10, final float f10, final float f11, final List<Float> list, final float f12, final float f13, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        float f14;
        float f15;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1833126050);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(ueVar) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.I(f10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            f14 = f11;
            i11 |= c0VarR.I(f14) ? 16384 : 8192;
        } else {
            f14 = f11;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(list) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            f15 = f12;
            i11 |= c0VarR.I(f15) ? 1048576 : 524288;
        } else {
            f15 = f12;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.I(f13) ? 8388608 : 4194304;
        }
        if (c0VarR.h((i11 & 4793491) != 4793490, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1833126050, i11, -1, "androidx.compose.material.Track (Slider.kt:833)");
            }
            int i12 = ((i11 >> 6) & 14) | 48 | ((i11 << 3) & 896);
            final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarA = ueVar.a(z10, false, c0VarR, i12);
            final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarA2 = ueVar.a(z10, true, c0VarR, i12);
            final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB = ueVar.b(z10, false, c0VarR, i12);
            final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB2 = ueVar.b(z10, true, c0VarR, i12);
            boolean zD = ((29360128 & i11) == 8388608) | ((i11 & 3670016) == 1048576) | c0VarR.D(n7VarA) | ((57344 & i11) == 16384) | ((i11 & 7168) == 2048) | c0VarR.D(n7VarA2) | c0VarR.k0(list) | c0VarR.D(n7VarB) | c0VarR.D(n7VarB2);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                final float f16 = f15;
                final float f17 = f14;
                Object obj = new Function1() { // from class: androidx.compose.material.hf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return qf.E(f16, n7VarA, f13, f17, f10, n7VarA2, list, n7VarB, n7VarB2, (androidx.compose.ui.graphics.drawscope.f) obj2);
                    }
                };
                c0VarR.Y(obj);
                objI0 = obj;
            }
            androidx.compose.foundation.f1.e(a0Var, (Function1) objI0, c0VarR, i11 & 14);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.jf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return qf.F(a0Var, ueVar, z10, f10, f11, list, f12, f13, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(float f10, androidx.compose.runtime.n7 n7Var, float f11, float f12, float f13, androidx.compose.runtime.n7 n7Var2, List list, androidx.compose.runtime.n7 n7Var3, androidx.compose.runtime.n7 n7Var4, androidx.compose.ui.graphics.drawscope.f fVar) {
        boolean z10 = fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
        long jY = fVar.Y();
        long j10 = com.rabbitmq.client.k0.f265952a;
        long jG = n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jY & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32)) - f10;
        long jG2 = n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long j11 = z10 ? jG2 : jG;
        long j12 = z10 ? jG : jG2;
        long jM = ((androidx.compose.ui.graphics.q0) n7Var.getValue()).M();
        androidx.compose.ui.graphics.u3.a aVar = androidx.compose.ui.graphics.u3.f38256b;
        androidx.compose.ui.graphics.drawscope.f.j2(fVar, jM, j11, j12, f11, aVar.b(), null, 0.0f, null, 0, 480, null);
        long j13 = j12;
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j13 >> 32);
        long jG3 = n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i10) + ((Float.intBitsToFloat(i11) - Float.intBitsToFloat(i10)) * f12))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) + ((Float.intBitsToFloat(i11) - Float.intBitsToFloat(i10)) * f13);
        androidx.compose.ui.graphics.drawscope.f.j2(fVar, ((androidx.compose.ui.graphics.q0) n7Var2.getValue()).M(), n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32)), jG3, f11, aVar.b(), null, 0.0f, null, 0, 480, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            float fFloatValue = ((Number) obj).floatValue();
            Boolean boolValueOf = Boolean.valueOf(fFloatValue > f12 || fFloatValue < f13);
            Object arrayList = linkedHashMap.get(boolValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(boolValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size = list2.size();
            int i12 = 0;
            while (i12 < size) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (n0.h.h(j11, j13, ((Number) list2.get(i12)).floatValue()) >> 32));
                long j14 = j10;
                arrayList2.add(n0.g.d(n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & j14)))) & j14) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32))));
                i12++;
                j10 = j14;
            }
            long j15 = j10;
            androidx.compose.ui.graphics.drawscope.f.K3(fVar, arrayList2, androidx.compose.ui.graphics.z2.f38718b.b(), ((androidx.compose.ui.graphics.q0) (zBooleanValue ? n7Var3 : n7Var4).getValue()).M(), f11, androidx.compose.ui.graphics.u3.f38256b.b(), null, 0.0f, null, 0, 480, null);
            j10 = j15;
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(androidx.compose.ui.a0 a0Var, ue ueVar, boolean z10, float f10, float f11, List list, float f12, float f13, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        D(a0Var, ueVar, z10, f10, f11, list, f12, f13, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object T(androidx.compose.foundation.gestures.a3 a3Var, float f10, float f11, float f12, kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = androidx.compose.foundation.gestures.a3.c(a3Var, null, new d(f10, f11, f12, null), dVar, 1, null);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object U(androidx.compose.ui.input.pointer.c cVar, long j10, int i10, kotlin.coroutines.d<? super Pair<androidx.compose.ui.input.pointer.c0, Float>> dVar) {
        e eVar;
        kotlin.jvm.internal.i1.e eVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.f24476c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f24476c = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        e eVar3 = eVar;
        Object obj = eVar3.f24475b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = eVar3.f24476c;
        if (i12 == 0) {
            ResultKt.m(obj);
            final kotlin.jvm.internal.i1.e eVar4 = new kotlin.jvm.internal.i1.e();
            Function2 function2 = new Function2() { // from class: androidx.compose.material.kf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return qf.V(eVar4, (androidx.compose.ui.input.pointer.c0) obj2, ((Float) obj3).floatValue());
                }
            };
            eVar3.f24474a = eVar4;
            eVar3.f24476c = 1;
            Object objA = v5.a(cVar, j10, i10, function2, eVar3);
            if (objA == objL) {
                return objL;
            }
            obj = objA;
            eVar2 = eVar4;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = (kotlin.jvm.internal.i1.e) eVar3.f24474a;
            ResultKt.m(obj);
        }
        androidx.compose.ui.input.pointer.c0 c0Var = (androidx.compose.ui.input.pointer.c0) obj;
        if (c0Var != null) {
            return TuplesKt.to(c0Var, kotlin.coroutines.jvm.internal.b.e(eVar2.f312748a));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(kotlin.jvm.internal.i1.e eVar, androidx.compose.ui.input.pointer.c0 c0Var, float f10) {
        c0Var.a();
        eVar.f312748a = f10;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float W(float f10, float f11, float f12) {
        float f13 = f11 - f10;
        float f14 = f13 == 0.0f ? 0.0f : (f12 - f10) / f13;
        float f15 = f14 >= 0.0f ? f14 : 0.0f;
        if (f15 > 1.0f) {
            return 1.0f;
        }
        return f15;
    }

    public static final float X() {
        return f24409a;
    }

    public static final float Y() {
        return f24413e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0 Z(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.j jVar2, androidx.compose.runtime.n7<Float> n7Var, androidx.compose.runtime.n7<Float> n7Var2, boolean z10, boolean z11, float f10, kotlin.ranges.f<Float> fVar, androidx.compose.runtime.n7<? extends Function1<? super Boolean, Unit>> n7Var3, androidx.compose.runtime.n7<? extends Function2<? super Boolean, ? super Float, Unit>> n7Var4) {
        return z10 ? androidx.compose.ui.input.pointer.w0.j(a0Var, new Object[]{jVar, jVar2, Float.valueOf(f10), Boolean.valueOf(z11), fVar}, new f(jVar, jVar2, n7Var, n7Var2, n7Var4, z11, f10, n7Var3)) : a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float a0(float f10, float f11, float f12, float f13, float f14) {
        return androidx.compose.ui.util.e.r(f13, f14, W(f10, f11, f12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.ranges.f<Float> b0(float f10, float f11, kotlin.ranges.f<Float> fVar, float f12, float f13) {
        return kotlin.ranges.r.e(a0(f10, f11, fVar.u().floatValue(), f12, f13), a0(f10, f11, fVar.i().floatValue(), f12, f13));
    }

    private static final androidx.compose.ui.a0 c0(androidx.compose.ui.a0 a0Var, boolean z10, int i10, kotlin.ranges.f<Float> fVar, float f10, boolean z11, androidx.compose.runtime.n7<? extends Function1<? super Float, Unit>> n7Var, androidx.compose.runtime.n7<? extends Function0<Unit>> n7Var2) {
        if (i10 >= 0) {
            return androidx.compose.ui.input.key.f.a(a0Var, new g(z10, fVar, i10, n7Var, f10, z11, n7Var2));
        }
        throw new IllegalArgumentException("steps should be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0 d0(androidx.compose.ui.a0 a0Var, float f10, final boolean z10, final Function1<? super Float, Unit> function1, final Function0<Unit> function0, final kotlin.ranges.f<Float> fVar, final int i10) {
        final float fH = kotlin.ranges.r.H(f10, fVar.u().floatValue(), fVar.i().floatValue());
        return androidx.compose.foundation.m4.d(androidx.compose.ui.semantics.t.f(a0Var, false, new Function1() { // from class: androidx.compose.material.bf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qf.f0(z10, fVar, i10, fH, function1, function0, (androidx.compose.ui.semantics.e0) obj);
            }
        }, 1, null), f10, fVar, i10);
    }

    static /* synthetic */ androidx.compose.ui.a0 e0(androidx.compose.ui.a0 a0Var, float f10, boolean z10, Function1 function1, Function0 function0, kotlin.ranges.f fVar, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        Function0 function2 = function0;
        if ((i11 & 16) != 0) {
            fVar = kotlin.ranges.r.e(0.0f, 1.0f);
        }
        kotlin.ranges.f fVar2 = fVar;
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        return d0(a0Var, f10, z10, function1, function2, fVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(boolean z10, final kotlin.ranges.f fVar, final int i10, final float f10, final Function1 function1, final Function0 function0, androidx.compose.ui.semantics.e0 e0Var) {
        if (!z10) {
            androidx.compose.ui.semantics.b0.n(e0Var);
        }
        androidx.compose.ui.semantics.b0.I1(e0Var, null, new Function1() { // from class: androidx.compose.material.ze
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(qf.g0(fVar, i10, f10, function1, function0, ((Float) obj).floatValue()));
            }
        }, 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean g0(kotlin.ranges.f fVar, int i10, float f10, Function1 function1, Function0 function0, float f11) {
        int i11;
        float fH = kotlin.ranges.r.H(f11, ((Number) fVar.u()).floatValue(), ((Number) fVar.i()).floatValue());
        if (i10 > 0 && (i11 = i10 + 1) >= 0) {
            float fAbs = fH;
            float f12 = fAbs;
            int i12 = 0;
            while (true) {
                float fR = androidx.compose.ui.util.e.r(((Number) fVar.u()).floatValue(), ((Number) fVar.i()).floatValue(), i12 / i11);
                float f13 = fR - fH;
                if (Math.abs(f13) <= fAbs) {
                    fAbs = Math.abs(f13);
                    f12 = fR;
                }
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
            fH = f12;
        }
        if (fH == f10) {
            return false;
        }
        function1.invoke(Float.valueOf(fH));
        if (function0 != null) {
            function0.invoke();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0 h0(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.gestures.a3 a3Var, androidx.compose.foundation.interaction.j jVar, float f10, boolean z10, androidx.compose.runtime.n7<Float> n7Var, androidx.compose.runtime.n7<? extends Function1<? super Float, Unit>> n7Var2, androidx.compose.runtime.n3<Float> n3Var, boolean z11) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new h(a3Var, jVar, f10, z10, n7Var, n7Var2, n3Var, z11) : androidx.compose.ui.platform.r2.b(), new i(z11, a3Var, jVar, f10, z10, n3Var, n7Var, n7Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i0(float f10, List<Float> list, float f11, float f12) {
        Float f13;
        if (list.isEmpty()) {
            f13 = null;
        } else {
            Float f14 = list.get(0);
            float fAbs = Math.abs(androidx.compose.ui.util.e.r(f11, f12, f14.floatValue()) - f10);
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Float f15 = list.get(i10);
                    float fAbs2 = Math.abs(androidx.compose.ui.util.e.r(f11, f12, f15.floatValue()) - f10);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f14 = f15;
                        fAbs = fAbs2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            f13 = f14;
        }
        Float f16 = f13;
        if (f16 != null) {
            f10 = androidx.compose.ui.util.e.r(f11, f12, f16.floatValue());
        }
        return f10;
    }

    private static final List<Float> j0(int i10) {
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        int i11 = i10 + 2;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(i12 / (i10 + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final void o(final Function1<? super Float, Float> function1, final kotlin.ranges.f<Float> fVar, final kotlin.ranges.f<Float> fVar2, final androidx.compose.runtime.n3<Float> n3Var, final float f10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        float f11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-743965752);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(fVar) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(fVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(n3Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            f11 = f10;
            i11 |= c0VarR.I(f11) ? 16384 : 8192;
        } else {
            f11 = f10;
        }
        if (c0VarR.h((i11 & 9363) != 9362, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-743965752, i11, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:927)");
            }
            boolean z10 = ((i11 & com.planner5d.library.engine.input.f.b.B) == 32) | ((i11 & 14) == 4) | ((57344 & i11) == 16384) | ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                final float f12 = f11;
                Function0 function0 = new Function0() { // from class: androidx.compose.material.lf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qf.p(fVar, function1, f12, n3Var, fVar2);
                    }
                };
                c0VarR.Y(function0);
                objI0 = function0;
            }
            androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.ye
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qf.q(function1, fVar, fVar2, n3Var, f10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit p(kotlin.ranges.f fVar, Function1 function1, float f10, androidx.compose.runtime.n3 n3Var, kotlin.ranges.f fVar2) {
        float fFloatValue = (((Number) fVar.i()).floatValue() - ((Number) fVar.u()).floatValue()) / 1000;
        float fFloatValue2 = ((Number) function1.invoke(Float.valueOf(f10))).floatValue();
        if (Math.abs(fFloatValue2 - ((Number) n3Var.getValue()).floatValue()) > fFloatValue && fVar2.c((Comparable) n3Var.getValue())) {
            n3Var.setValue(Float.valueOf(fFloatValue2));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function1 function1, kotlin.ranges.f fVar, kotlin.ranges.f fVar2, androidx.compose.runtime.n3 n3Var, float f10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        o(function1, fVar, fVar2, n3Var, f10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0150  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x0162  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:116:0x0168  */
    /* JADX WARN: Code duplicated, block: B:118:0x016c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:137:0x0209  */
    /* JADX WARN: Code duplicated, block: B:140:0x0211  */
    /* JADX WARN: Code duplicated, block: B:142:0x0217  */
    /* JADX WARN: Code duplicated, block: B:145:0x0287  */
    /* JADX WARN: Code duplicated, block: B:147:0x0296  */
    /* JADX WARN: Code duplicated, block: B:149:0x029e  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @androidx.compose.runtime.o
    @u7
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void r(@NotNull final kotlin.ranges.f<Float> fVar, @NotNull final Function1<? super kotlin.ranges.f<Float>, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable kotlin.ranges.f<Float> fVar2, @androidx.annotation.g0(from = 0) int i10, @Nullable Function0<Unit> function0, @Nullable ue ueVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        kotlin.ranges.f<Float> fVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        Function0<Unit> function2;
        int i20;
        ue ueVar2;
        boolean z11;
        androidx.compose.runtime.c0 c0Var2;
        final Function0<Unit> function3;
        final androidx.compose.ui.a0 a0Var3;
        final int i21;
        final boolean z12;
        final ue ueVar3;
        final kotlin.ranges.f<Float> fVar4;
        androidx.compose.runtime.s5 s5VarT;
        boolean z13;
        kotlin.ranges.f<Float> fVarE;
        int i22;
        boolean z14;
        androidx.compose.runtime.c0 c0Var3;
        int i23;
        ue ueVarA;
        int i24;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        androidx.compose.foundation.interaction.j jVar;
        Object objI1;
        androidx.compose.foundation.interaction.j jVar2;
        boolean z15;
        Object objI2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1556183027);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.D(fVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= c0VarR.k0(function1) ? 32 : 16;
        }
        int i25 = i12 & 4;
        if (i25 == 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c0VarR.G(z10)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        fVar3 = fVar2;
                        int i26 = c0VarR.D(fVar3) ? 16384 : 8192;
                        i13 |= i26;
                    } else {
                        fVar3 = fVar2;
                    }
                    i13 |= i26;
                } else {
                    fVar3 = fVar2;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    i17 = i10;
                } else {
                    i17 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i17)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    function2 = function0;
                } else {
                    function2 = function0;
                    if ((i11 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                if ((i11 & 12582912) == 0) {
                    if ((i12 & 128) == 0) {
                        ueVar2 = ueVar;
                        int i27 = c0VarR.D(ueVar2) ? 8388608 : 4194304;
                        i13 |= i27;
                    } else {
                        ueVar2 = ueVar;
                    }
                    i13 |= i27;
                } else {
                    ueVar2 = ueVar;
                }
                if ((i13 & 4793491) != 4793490) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0 || c0VarR.y()) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = kotlin.ranges.r.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar3;
                        }
                        if (i16 != 0) {
                            i22 = 0;
                        } else {
                            i22 = i17;
                        }
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            i23 = 131072;
                            c0Var3 = c0VarR;
                            i13 &= -29360129;
                            z14 = true;
                            ueVarA = ve.f25286a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                        } else {
                            z14 = true;
                            c0Var3 = c0VarR;
                            i23 = 131072;
                            ueVarA = ueVar2;
                        }
                        i24 = i22;
                    } else {
                        c0VarR.u();
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                        }
                        z13 = z10;
                        ueVarA = ueVar2;
                        z14 = true;
                        fVarE = fVar3;
                        i24 = i17;
                        c0Var3 = c0VarR;
                        function2 = function2;
                        i23 = 131072;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1556183027, i13, -1, "androidx.compose.material.RangeSlider (Slider.kt:404)");
                    }
                    objI0 = c0Var3.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI0);
                    }
                    jVar = (androidx.compose.foundation.interaction.j) objI0;
                    objI1 = c0Var3.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI1);
                    }
                    jVar2 = (androidx.compose.foundation.interaction.j) objI1;
                    if (i24 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    androidx.compose.runtime.n7 n7VarW = androidx.compose.runtime.w6.w(function1, c0Var3, (i13 >> 3) & 14);
                    z15 = (458752 & i13) == i23 ? z14 : false;
                    objI2 = c0Var3.i0();
                    if (z15 || objI2 == aVar.a()) {
                        objI2 = j0(i24);
                        c0Var3.Y(objI2);
                    }
                    List list = (List) objI2;
                    androidx.compose.ui.a0 a0VarH = l9.h(a0Var2);
                    float f10 = f24409a;
                    androidx.compose.ui.a0 a0VarS = androidx.compose.foundation.layout.i6.s(a0VarH, androidx.compose.ui.unit.h.r(4 * f10), androidx.compose.ui.unit.h.r(f10 * 2), 0.0f, 0.0f, 12, null);
                    androidx.compose.runtime.c0 c0Var4 = c0Var3;
                    kotlin.ranges.f<Float> fVar5 = fVarE;
                    androidx.compose.foundation.layout.g0.c(a0VarS, null, false, androidx.compose.runtime.internal.w.e(652589923, z14, new a(fVar5, fVar, list, function2, n7VarW, jVar, jVar2, z13, i24, ueVarA), c0Var4, 54), c0Var4, 3072, 6);
                    c0Var2 = c0Var4;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    fVar4 = fVar5;
                    function3 = function2;
                    z12 = z13;
                    i21 = i24;
                    ueVar3 = ueVarA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    i21 = i17;
                    z12 = z10;
                    ueVar3 = ueVar2;
                    fVar4 = fVar3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.cf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qf.s(fVar, function1, a0Var3, z12, fVar4, i21, function3, ueVar3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    fVar3 = fVar2;
                    if (c0VarR.D(fVar3)) {
                    }
                    i13 |= i26;
                } else {
                    fVar3 = fVar2;
                }
                i13 |= i26;
            } else {
                fVar3 = fVar2;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                i17 = i10;
            } else {
                i17 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                function2 = function0;
            } else {
                function2 = function0;
                if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            if ((i11 & 12582912) == 0) {
                if ((i12 & 128) == 0) {
                    ueVar2 = ueVar;
                    if (c0VarR.D(ueVar2)) {
                    }
                    i13 |= i27;
                } else {
                    ueVar2 = ueVar;
                }
                i13 |= i27;
            } else {
                ueVar2 = ueVar;
            }
            if ((i13 & 4793491) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = kotlin.ranges.r.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar3;
                    }
                    if (i16 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i17;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        i23 = 131072;
                        c0Var3 = c0VarR;
                        i13 &= -29360129;
                        z14 = true;
                        ueVarA = ve.f25286a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                    } else {
                        z14 = true;
                        c0Var3 = c0VarR;
                        i23 = 131072;
                        ueVarA = ueVar2;
                    }
                    i24 = i22;
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = kotlin.ranges.r.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar3;
                    }
                    if (i16 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i17;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        i23 = 131072;
                        c0Var3 = c0VarR;
                        i13 &= -29360129;
                        z14 = true;
                        ueVarA = ve.f25286a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                    } else {
                        z14 = true;
                        c0Var3 = c0VarR;
                        i23 = 131072;
                        ueVarA = ueVar2;
                    }
                    i24 = i22;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1556183027, i13, -1, "androidx.compose.material.RangeSlider (Slider.kt:404)");
                }
                objI0 = c0Var3.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0Var3.Y(objI0);
                }
                jVar = (androidx.compose.foundation.interaction.j) objI0;
                objI1 = c0Var3.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.foundation.interaction.i.a();
                    c0Var3.Y(objI1);
                }
                jVar2 = (androidx.compose.foundation.interaction.j) objI1;
                if (i24 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                androidx.compose.runtime.n7 n7VarW2 = androidx.compose.runtime.w6.w(function1, c0Var3, (i13 >> 3) & 14);
                if ((458752 & i13) == i23) {
                }
                objI2 = c0Var3.i0();
                if (z15) {
                    objI2 = j0(i24);
                    c0Var3.Y(objI2);
                } else {
                    objI2 = j0(i24);
                    c0Var3.Y(objI2);
                }
                List list2 = (List) objI2;
                androidx.compose.ui.a0 a0VarH2 = l9.h(a0Var2);
                float f11 = f24409a;
                androidx.compose.ui.a0 a0VarS2 = androidx.compose.foundation.layout.i6.s(a0VarH2, androidx.compose.ui.unit.h.r(4 * f11), androidx.compose.ui.unit.h.r(f11 * 2), 0.0f, 0.0f, 12, null);
                androidx.compose.runtime.c0 c0Var5 = c0Var3;
                kotlin.ranges.f<Float> fVar6 = fVarE;
                androidx.compose.foundation.layout.g0.c(a0VarS2, null, false, androidx.compose.runtime.internal.w.e(652589923, z14, new a(fVar6, fVar, list2, function2, n7VarW2, jVar, jVar2, z13, i24, ueVarA), c0Var5, 54), c0Var5, 3072, 6);
                c0Var2 = c0Var5;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                fVar4 = fVar6;
                function3 = function2;
                z12 = z13;
                i21 = i24;
                ueVar3 = ueVarA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function3 = function2;
                a0Var3 = a0Var2;
                i21 = i17;
                z12 = z10;
                ueVar3 = ueVar2;
                fVar4 = fVar3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.cf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qf.s(fVar, function1, a0Var3, z12, fVar4, i21, function3, ueVar3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                if (c0VarR.G(z10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    fVar3 = fVar2;
                    if (c0VarR.D(fVar3)) {
                    }
                    i13 |= i26;
                } else {
                    fVar3 = fVar2;
                }
                i13 |= i26;
            } else {
                fVar3 = fVar2;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                i17 = i10;
            } else {
                i17 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                function2 = function0;
            } else {
                function2 = function0;
                if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            if ((i11 & 12582912) == 0) {
                if ((i12 & 128) == 0) {
                    ueVar2 = ueVar;
                    if (c0VarR.D(ueVar2)) {
                    }
                    i13 |= i27;
                } else {
                    ueVar2 = ueVar;
                }
                i13 |= i27;
            } else {
                ueVar2 = ueVar;
            }
            if ((i13 & 4793491) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = kotlin.ranges.r.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar3;
                    }
                    if (i16 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i17;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        i23 = 131072;
                        c0Var3 = c0VarR;
                        i13 &= -29360129;
                        z14 = true;
                        ueVarA = ve.f25286a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                    } else {
                        z14 = true;
                        c0Var3 = c0VarR;
                        i23 = 131072;
                        ueVarA = ueVar2;
                    }
                    i24 = i22;
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = kotlin.ranges.r.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar3;
                    }
                    if (i16 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i17;
                    }
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        i23 = 131072;
                        c0Var3 = c0VarR;
                        i13 &= -29360129;
                        z14 = true;
                        ueVarA = ve.f25286a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                    } else {
                        z14 = true;
                        c0Var3 = c0VarR;
                        i23 = 131072;
                        ueVarA = ueVar2;
                    }
                    i24 = i22;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1556183027, i13, -1, "androidx.compose.material.RangeSlider (Slider.kt:404)");
                }
                objI0 = c0Var3.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0Var3.Y(objI0);
                }
                jVar = (androidx.compose.foundation.interaction.j) objI0;
                objI1 = c0Var3.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.foundation.interaction.i.a();
                    c0Var3.Y(objI1);
                }
                jVar2 = (androidx.compose.foundation.interaction.j) objI1;
                if (i24 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                androidx.compose.runtime.n7 n7VarW3 = androidx.compose.runtime.w6.w(function1, c0Var3, (i13 >> 3) & 14);
                if ((458752 & i13) == i23) {
                }
                objI2 = c0Var3.i0();
                if (z15) {
                    objI2 = j0(i24);
                    c0Var3.Y(objI2);
                } else {
                    objI2 = j0(i24);
                    c0Var3.Y(objI2);
                }
                List list3 = (List) objI2;
                androidx.compose.ui.a0 a0VarH3 = l9.h(a0Var2);
                float f12 = f24409a;
                androidx.compose.ui.a0 a0VarS3 = androidx.compose.foundation.layout.i6.s(a0VarH3, androidx.compose.ui.unit.h.r(4 * f12), androidx.compose.ui.unit.h.r(f12 * 2), 0.0f, 0.0f, 12, null);
                androidx.compose.runtime.c0 c0Var6 = c0Var3;
                kotlin.ranges.f<Float> fVar7 = fVarE;
                androidx.compose.foundation.layout.g0.c(a0VarS3, null, false, androidx.compose.runtime.internal.w.e(652589923, z14, new a(fVar7, fVar, list3, function2, n7VarW3, jVar, jVar2, z13, i24, ueVarA), c0Var6, 54), c0Var6, 3072, 6);
                c0Var2 = c0Var6;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                fVar4 = fVar7;
                function3 = function2;
                z12 = z13;
                i21 = i24;
                ueVar3 = ueVarA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function3 = function2;
                a0Var3 = a0Var2;
                i21 = i17;
                z12 = z10;
                ueVar3 = ueVar2;
                fVar4 = fVar3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.cf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qf.s(fVar, function1, a0Var3, z12, fVar4, i21, function3, ueVar3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                fVar3 = fVar2;
                if (c0VarR.D(fVar3)) {
                }
                i13 |= i26;
            } else {
                fVar3 = fVar2;
            }
            i13 |= i26;
        } else {
            fVar3 = fVar2;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            i17 = i10;
        } else {
            i17 = i10;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i17)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
        }
        i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 1572864;
            function2 = function0;
        } else {
            function2 = function0;
            if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(function2)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
        }
        if ((i11 & 12582912) == 0) {
            if ((i12 & 128) == 0) {
                ueVar2 = ueVar;
                if (c0VarR.D(ueVar2)) {
                }
                i13 |= i27;
            } else {
                ueVar2 = ueVar;
            }
            i13 |= i27;
        } else {
            ueVar2 = ueVar;
        }
        if ((i13 & 4793491) != 4793490) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i25 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = kotlin.ranges.r.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar3;
                }
                if (i16 != 0) {
                    i22 = 0;
                } else {
                    i22 = i17;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 128) != 0) {
                    i23 = 131072;
                    c0Var3 = c0VarR;
                    i13 &= -29360129;
                    z14 = true;
                    ueVarA = ve.f25286a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                } else {
                    z14 = true;
                    c0Var3 = c0VarR;
                    i23 = 131072;
                    ueVarA = ueVar2;
                }
                i24 = i22;
            } else {
                if (i25 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = kotlin.ranges.r.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar3;
                }
                if (i16 != 0) {
                    i22 = 0;
                } else {
                    i22 = i17;
                }
                if (i19 != 0) {
                    function2 = null;
                }
                if ((i12 & 128) != 0) {
                    i23 = 131072;
                    c0Var3 = c0VarR;
                    i13 &= -29360129;
                    z14 = true;
                    ueVarA = ve.f25286a.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 0, 6, 1023);
                } else {
                    z14 = true;
                    c0Var3 = c0VarR;
                    i23 = 131072;
                    ueVarA = ueVar2;
                }
                i24 = i22;
            }
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1556183027, i13, -1, "androidx.compose.material.RangeSlider (Slider.kt:404)");
            }
            objI0 = c0Var3.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.foundation.interaction.i.a();
                c0Var3.Y(objI0);
            }
            jVar = (androidx.compose.foundation.interaction.j) objI0;
            objI1 = c0Var3.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.foundation.interaction.i.a();
                c0Var3.Y(objI1);
            }
            jVar2 = (androidx.compose.foundation.interaction.j) objI1;
            if (i24 >= 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            androidx.compose.runtime.n7 n7VarW4 = androidx.compose.runtime.w6.w(function1, c0Var3, (i13 >> 3) & 14);
            if ((458752 & i13) == i23) {
            }
            objI2 = c0Var3.i0();
            if (z15) {
                objI2 = j0(i24);
                c0Var3.Y(objI2);
            } else {
                objI2 = j0(i24);
                c0Var3.Y(objI2);
            }
            List list4 = (List) objI2;
            androidx.compose.ui.a0 a0VarH4 = l9.h(a0Var2);
            float f13 = f24409a;
            androidx.compose.ui.a0 a0VarS4 = androidx.compose.foundation.layout.i6.s(a0VarH4, androidx.compose.ui.unit.h.r(4 * f13), androidx.compose.ui.unit.h.r(f13 * 2), 0.0f, 0.0f, 12, null);
            androidx.compose.runtime.c0 c0Var7 = c0Var3;
            kotlin.ranges.f<Float> fVar8 = fVarE;
            androidx.compose.foundation.layout.g0.c(a0VarS4, null, false, androidx.compose.runtime.internal.w.e(652589923, z14, new a(fVar8, fVar, list4, function2, n7VarW4, jVar, jVar2, z13, i24, ueVarA), c0Var7, 54), c0Var7, 3072, 6);
            c0Var2 = c0Var7;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var2;
            fVar4 = fVar8;
            function3 = function2;
            z12 = z13;
            i21 = i24;
            ueVar3 = ueVarA;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            function3 = function2;
            a0Var3 = a0Var2;
            i21 = i17;
            z12 = z10;
            ueVar3 = ueVar2;
            fVar4 = fVar3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.cf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qf.s(fVar, function1, a0Var3, z12, fVar4, i21, function3, ueVar3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(kotlin.ranges.f fVar, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z10, kotlin.ranges.f fVar2, int i10, Function0 function0, ue ueVar, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        r(fVar, function1, a0Var, z10, fVar2, i10, function0, ueVar, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void t(final boolean z10, final float f10, final float f11, final List<Float> list, final ue ueVar, final float f12, final androidx.compose.foundation.interaction.j jVar, final androidx.compose.foundation.interaction.j jVar2, final androidx.compose.ui.a0 a0Var, final androidx.compose.ui.a0 a0Var2, androidx.compose.ui.a0 a0Var3, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z11;
        int i12;
        List<Float> list2;
        ue ueVar2;
        int i13;
        final androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-278895713);
        if ((i10 & 6) == 0) {
            z11 = z10;
            i12 = (c0VarR.G(z11) ? 4 : 2) | i10;
        } else {
            z11 = z10;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.I(f11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            list2 = list;
            i12 |= c0VarR.k0(list2) ? 2048 : 1024;
        } else {
            list2 = list;
        }
        if ((i10 & 24576) == 0) {
            ueVar2 = ueVar;
            i12 |= c0VarR.D(ueVar2) ? 16384 : 8192;
        } else {
            ueVar2 = ueVar;
        }
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i12 |= c0VarR.I(f12) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c0VarR.D(jVar) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0VarR.D(jVar2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0VarR.D(a0Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0VarR.D(a0Var2) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0VarR.D(a0Var3) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if (c0VarR.h(((i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-278895713, i12, i13, "androidx.compose.material.RangeSliderImpl (Slider.kt:724)");
            }
            tg.a aVar = tg.f25008b;
            final String strA = ug.a(aVar.g(), c0VarR, 6);
            final String strA2 = ug.a(aVar.f(), c0VarR, 6);
            androidx.compose.ui.a0 a0VarB2 = a0Var.B2(f24416h);
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB2);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            float fS7 = dVar.S7(f24413e);
            float f13 = f24409a;
            float fS8 = dVar.S7(f13);
            float fF3 = dVar.F3(f12);
            float fR = androidx.compose.ui.unit.h.r(f13 * 2);
            float fR2 = androidx.compose.ui.unit.h.r(fF3 * f10);
            float fR3 = androidx.compose.ui.unit.h.r(fF3 * f11);
            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarF = androidx.compose.foundation.layout.i6.f(d0Var.b(aVar4, aVar2.o()), 0.0f, 1, null);
            int i14 = i12 >> 9;
            int i15 = i12 << 6;
            int i16 = i12;
            D(a0VarF, ueVar2, z11, f10, f11, list2, fS8, fS7, c0VarR, (i15 & 896) | (i14 & com.planner5d.library.engine.input.f.b.B) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752));
            c0VarR = c0VarR;
            boolean zD = c0VarR.D(strA);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.ef
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qf.u(strA, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            int i17 = i16 & 57344;
            int i18 = (i16 << 15) & 458752;
            B(d0Var, androidx.compose.foundation.e2.b(androidx.compose.ui.semantics.t.e(aVar4, true, (Function1) objI0), true, jVar).B2(a0Var2), fR2, jVar, ueVar, z10, fR, c0VarR, (i14 & 7168) | 1572870 | i17 | i18);
            boolean zD2 = c0VarR.D(strA2);
            Object objI1 = c0VarR.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material.ff
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qf.v(strA2, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            a0Var4 = a0Var3;
            B(d0Var, androidx.compose.foundation.e2.b(androidx.compose.ui.semantics.t.e(aVar4, true, (Function1) objI1), true, jVar2).B2(a0Var4), fR3, jVar2, ueVar, z10, fR, c0VarR, ((i16 >> 12) & 7168) | 1572870 | i17 | i18);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            a0Var4 = a0Var3;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.gf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qf.w(z10, f10, f11, list, ueVar, f12, jVar, jVar2, a0Var, a0Var2, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(boolean z10, float f10, float f11, List list, ue ueVar, float f12, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.j jVar2, androidx.compose.ui.a0 a0Var, androidx.compose.ui.a0 a0Var2, androidx.compose.ui.a0 a0Var3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        t(z10, f10, f11, list, ueVar, f12, jVar, jVar2, a0Var, a0Var2, a0Var3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX WARN: Failed to calculate best type for var: r46v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r46v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r46v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r46v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r46v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r46v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r46v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r46v6 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r46v3 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void x(float r39, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r40, @org.jetbrains.annotations.Nullable androidx.compose.ui.a0 r41, boolean r42, @org.jetbrains.annotations.Nullable kotlin.ranges.f<java.lang.Float> r43, @androidx.annotation.g0(from = 0) int r44, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r45, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.j r46, @org.jetbrains.annotations.Nullable androidx.compose.material.ue r47, @org.jetbrains.annotations.Nullable androidx.compose.runtime.c0 r48, int r49, int r50) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.qf.x(float, kotlin.jvm.functions.Function1, androidx.compose.ui.a0, boolean, kotlin.ranges.f, int, kotlin.jvm.functions.Function0, androidx.compose.foundation.interaction.j, androidx.compose.material.ue, androidx.compose.runtime.c0, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(float f10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z10, kotlin.ranges.f fVar, int i10, Function0 function0, androidx.compose.foundation.interaction.j jVar, ue ueVar, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        x(f10, function1, a0Var, z10, fVar, i10, function0, jVar, ueVar, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void z(final boolean z10, final float f10, final List<Float> list, final ue ueVar, final float f11, final androidx.compose.foundation.interaction.j jVar, final androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        boolean z11;
        int i11;
        List<Float> list2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1679682785);
        if ((i10 & 6) == 0) {
            z11 = z10;
            i11 = (c0VarR.G(z11) ? 4 : 2) | i10;
        } else {
            z11 = z10;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            list2 = list;
            i11 |= c0VarR.k0(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(ueVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.I(f11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.D(jVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.D(a0Var) ? 1048576 : 524288;
        }
        int i12 = i11;
        if (c0VarR.h((599187 & i12) != 599186, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1679682785, i12, -1, "androidx.compose.material.SliderImpl (Slider.kt:683)");
            }
            androidx.compose.ui.a0 a0VarB2 = a0Var.B2(f24416h);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            float fS7 = dVar.S7(f24413e);
            float f12 = f24409a;
            float fS8 = dVar.S7(f12);
            float fF3 = dVar.F3(f11);
            float fR = androidx.compose.ui.unit.h.r(f12 * 2);
            float fR2 = androidx.compose.ui.unit.h.r(fF3 * f10);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            int i13 = i12 >> 6;
            int i14 = i12 << 9;
            D(androidx.compose.foundation.layout.i6.f(aVar2, 0.0f, 1, null), ueVar, z11, 0.0f, f10, list2, fS8, fS7, c0VarR, (i14 & 458752) | ((i12 << 6) & 896) | (i13 & com.planner5d.library.engine.input.f.b.B) | 3078 | (i14 & 57344));
            B(d0Var, aVar2, fR2, jVar, ueVar, z10, fR, c0VarR, (i13 & 7168) | 1572918 | ((i12 << 3) & 57344) | ((i12 << 15) & 458752));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.af
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qf.A(z10, f10, list, ueVar, f11, jVar, a0Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
