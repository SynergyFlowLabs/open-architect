package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWideNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 10 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 14 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1263:1\n75#2:1264\n75#2:1277\n75#2:1279\n75#2:1282\n75#2:1290\n1282#3,6:1265\n1282#3,6:1271\n1282#3,6:1284\n1282#3,6:1292\n1282#3,6:1298\n1282#3,6:1304\n1282#3,6:1310\n1282#3,6:1323\n1282#3,6:1330\n1282#3,6:1336\n1282#3,6:1342\n1282#3,6:1348\n113#4:1278\n113#4:1280\n113#4:1281\n113#4:1382\n113#4:1410\n113#4:1411\n1#5:1283\n267#6:1291\n261#6:1329\n57#7:1316\n61#7:1319\n57#7:1364\n60#8:1317\n70#8:1320\n60#8:1365\n85#8:1368\n22#9:1318\n22#9:1321\n22#9:1366\n635#10:1322\n78#11:1354\n111#11,2:1355\n78#11:1357\n111#11,2:1358\n85#12:1360\n85#12:1361\n85#12:1362\n85#12:1363\n85#12:1369\n85#12:1370\n117#12,2:1371\n54#13:1367\n52#14,9:1373\n52#14,9:1383\n52#14,9:1392\n52#14,9:1401\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailKt\n*L\n171#1:1264\n223#1:1277\n226#1:1279\n494#1:1282\n990#1:1290\n220#1:1265,6\n221#1:1271,6\n691#1:1284,6\n1001#1:1292,6\n1002#1:1298,6\n1021#1:1304,6\n1042#1:1310,6\n1111#1:1323,6\n1115#1:1330,6\n1116#1:1336,6\n1126#1:1342,6\n1130#1:1348,6\n224#1:1278\n244#1:1280\n472#1:1281\n1139#1:1382\n1158#1:1410\n1159#1:1411\n991#1:1291\n1112#1:1329\n1082#1:1316\n1094#1:1319\n1008#1:1364\n1082#1:1317\n1094#1:1320\n1008#1:1365\n1024#1:1368\n1082#1:1318\n1094#1:1321\n1008#1:1366\n1104#1:1322\n220#1:1354\n220#1:1355,2\n221#1:1357\n221#1:1358,2\n233#1:1360\n238#1:1361\n243#1:1362\n248#1:1363\n1106#1:1369\n1111#1:1370\n1111#1:1371,2\n1024#1:1367\n1136#1:1373,9\n1150#1:1383,9\n1153#1:1392,9\n1156#1:1401,9\n*E\n"})
public final class ib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f28525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f28526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f28527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f28528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f28529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f28530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f28531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f28532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f28533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f28534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f28535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f28536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f28537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f28538n = 0.5f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f28539o = "header";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<ob0> f28540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<yl> f28541q;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$4$1", f = "WideNavigationRail.kt", i = {}, l = {1042}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ float f28543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Float, kotlin.coroutines.d<? super Unit>, Object> f28544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f28544c = function2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(s0Var, f10.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28542a;
            if (i10 == 0) {
                ResultKt.m(obj);
                float f10 = this.f28543b;
                Function2<Float, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f28544c;
                Float fE = kotlin.coroutines.jvm.internal.b.e(f10);
                this.f28542a = 1;
                if (function2.invoke(fE, this) == objL) {
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

        public final Object k(kotlinx.coroutines.s0 s0Var, float f10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f28544c, dVar);
            aVar.f28543b = f10;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nWideNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailKt$ModalWideNavigationRailContent$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1263:1\n1282#2,6:1264\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailKt$ModalWideNavigationRailContent$5\n*L\n1047#1:1264,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f28545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vs f28546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ qa0 f28549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f28550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.v6 f28552h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.q.m f28553i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28554j;

        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, vs vsVar, boolean z10, boolean z11, qa0 qa0Var, androidx.compose.ui.graphics.q3 q3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.foundation.layout.v6 v6Var, androidx.compose.foundation.layout.q.m mVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f28545a = cVar;
            this.f28546b = vsVar;
            this.f28547c = z10;
            this.f28548d = z11;
            this.f28549e = qa0Var;
            this.f28550f = q3Var;
            this.f28551g = function2;
            this.f28552h = v6Var;
            this.f28553i = mVar;
            this.f28554j = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.animation.core.c cVar, vs vsVar, boolean z10, androidx.compose.ui.graphics.r1 r1Var) {
            float fFloatValue = ((Number) cVar.v()).floatValue();
            if (fFloatValue <= 0.0f) {
                return Unit.f312394a;
            }
            float fQ0 = ib0.q0(r1Var, fFloatValue, vsVar.a());
            r1Var.z(fQ0 == 0.0f ? 1.0f : ib0.r0(r1Var, fFloatValue) / fQ0);
            r1Var.W1(androidx.compose.ui.graphics.a4.a(z10 ? 0.0f : 1.0f, 0.5f));
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
                androidx.compose.runtime.m0.A0(-1043835354, i10, -1, "androidx.compose.material3.ModalWideNavigationRailContent.<anonymous> (WideNavigationRail.kt:1044)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zK0 = c0Var.k0(this.f28545a) | c0Var.D(this.f28546b) | c0Var.G(this.f28547c);
            final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f28545a;
            final vs vsVar = this.f28546b;
            final boolean z10 = this.f28547c;
            Object objI0 = c0Var.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.jb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ib0.b.f(cVar, vsVar, z10, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            int i11 = 1 << 1;
            ib0.L(androidx.compose.ui.graphics.q1.a(aVar, (Function1) objI0), true, this.f28548d, this.f28549e, this.f28550f, this.f28551g, this.f28552h, this.f28553i, this.f28554j, c0Var, 48);
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.WideNavigationRailKt$Scrim$2$1", f = "WideNavigationRail.kt", i = {}, l = {1130}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f28556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f28557c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, androidx.compose.runtime.n3<Boolean> n3Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f28556b = function1;
            this.f28557c = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f28556b, this.f28557c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28555a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (ib0.B(this.f28557c)) {
                    Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f28556b;
                    this.f28555a = 1;
                    if (function1.invoke(this) == objL) {
                        return objL;
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f28558a;

        d(androidx.compose.runtime.n3<Boolean> n3Var) {
            this.f28558a = n3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(androidx.compose.runtime.n3 n3Var, n0.g gVar) {
            ib0.C(n3Var, true);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final androidx.compose.runtime.n3<Boolean> n3Var = this.f28558a;
            Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, null, new Function1() { // from class: androidx.compose.material3.kb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ib0.d.b(n3Var, (n0.g) obj);
                }
            }, dVar, 7, null);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nWideNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailKt$WideNavigationRailLayout$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,1263:1\n1282#2,6:1264\n79#3,6:1270\n86#3,3:1285\n89#3,2:1294\n79#3,6:1307\n86#3,3:1322\n89#3,2:1331\n93#3:1336\n93#3:1340\n347#4,9:1276\n356#4:1296\n347#4,9:1313\n356#4,3:1333\n357#4,2:1338\n4206#5,6:1288\n4206#5,6:1325\n70#6:1297\n67#6,9:1298\n77#6:1337\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailKt$WideNavigationRailLayout$1\n*L\n266#1:1264,6\n259#1:1270,6\n259#1:1285,3\n259#1:1294,2\n269#1:1307,6\n269#1:1322,3\n269#1:1331,2\n269#1:1336\n259#1:1340\n259#1:1276,9\n259#1:1296\n269#1:1313,9\n269#1:1333,3\n259#1:1338,2\n259#1:1288,6\n269#1:1325,6\n269#1:1297\n269#1:1298,9\n269#1:1337\n*E\n"})
    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.v6 f28559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f28562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f28563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f28564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f28565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l3 f28566h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l3 f28567i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.q.m f28568j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f28569k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28570l;

        @SourceDebugExtension({"SMAP\nWideNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailKt$WideNavigationRailLayout$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1263:1\n563#2,2:1264\n34#2,6:1266\n565#2:1272\n150#2,3:1273\n34#2,6:1276\n153#2:1282\n70#2,6:1283\n70#2,6:1290\n1#3:1289\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailKt$WideNavigationRailLayout$1$2\n*L\n303#1:1264,2\n303#1:1266,6\n303#1:1272\n319#1:1273,3\n319#1:1276,6\n319#1:1282\n398#1:1283,6\n409#1:1290,6\n*E\n"})
        public static final class a implements androidx.compose.ui.layout.a1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28571a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f28572b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f28573c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f28574d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f28575e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f28576f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l3 f28577g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l3 f28578h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.q.m f28579i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f28580j;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10, androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var, float f10, androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var2, androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var3, androidx.compose.runtime.l3 l3Var, androidx.compose.runtime.l3 l3Var2, androidx.compose.foundation.layout.q.m mVar, androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var4) {
                this.f28571a = function2;
                this.f28572b = z10;
                this.f28573c = n7Var;
                this.f28574d = f10;
                this.f28575e = n7Var2;
                this.f28576f = n7Var3;
                this.f28577g = l3Var;
                this.f28578h = l3Var2;
                this.f28579i = mVar;
                this.f28580j = n7Var4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit h(androidx.compose.ui.layout.i2.a aVar) {
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final Unit i(int i10, androidx.compose.ui.layout.c1 c1Var, kotlin.jvm.internal.i1.h hVar, List list, androidx.compose.foundation.layout.q.m mVar, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.layout.i2.a aVar) {
                int iC1;
                int iG6 = i10 - c1Var.g6(ib0.f28527c);
                T t10 = hVar.f312751a;
                if (t10 == 0 || ((androidx.compose.ui.layout.i2) t10).c1() <= 0) {
                    iC1 = 0;
                } else {
                    androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) hVar.f312751a, 0, 0, 0.0f, 4, null);
                    iC1 = ((androidx.compose.ui.layout.i2) hVar.f312751a).c1() + c1Var.g6(ib0.f28528d);
                }
                if (list != null) {
                    if (!Intrinsics.areEqual(mVar, androidx.compose.foundation.layout.q.f16330a.m())) {
                        iG6 -= iC1;
                    }
                    int[] iArr = new int[list.size()];
                    List list2 = list;
                    int size = list2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr[i11] = ((androidx.compose.ui.layout.i2) list.get(i11)).c1();
                        if (i11 < list.size() - 1) {
                            iArr[i11] = iArr[i11] + c1Var.g6(ib0.M(n7Var));
                        }
                    }
                    int[] iArr2 = new int[list.size()];
                    mVar.arrange(c1Var, iG6, iArr, iArr2);
                    if (Intrinsics.areEqual(mVar, androidx.compose.foundation.layout.q.f16330a.m())) {
                        iC1 = 0;
                    }
                    int size2 = list2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list.get(i12), 0, iArr2[i12] + iC1, 0.0f, 4, null);
                    }
                }
                return Unit.f312394a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v10, types: [T, androidx.compose.ui.layout.i2] */
            @Override // androidx.compose.ui.layout.a1
            public androidx.compose.ui.layout.b1 a(final androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
                int iR;
                int iC1;
                int iG6;
                List<? extends androidx.compose.ui.layout.z0> listSubList = list;
                final int iO = androidx.compose.ui.unit.b.o(j10);
                int size = listSubList.size();
                int iR2 = androidx.compose.ui.unit.b.r(j10);
                if (androidx.compose.ui.unit.b.r(j10) == 0) {
                    iR2 = kotlin.ranges.r.B(c1Var.g6(ib0.f28530f), androidx.compose.ui.unit.b.p(j10));
                    iR = kotlin.ranges.r.B(c1Var.g6(ib0.T(this.f28573c)), androidx.compose.ui.unit.b.p(j10));
                } else {
                    iR = androidx.compose.ui.unit.b.r(j10);
                }
                if (size < 1) {
                    return androidx.compose.ui.layout.c1.h6(c1Var, iR, iO, null, new Function1() { // from class: androidx.compose.material3.mb0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ib0.e.a.h((androidx.compose.ui.layout.i2.a) obj);
                        }
                    }, 4, null);
                }
                long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
                final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
                if (this.f28571a != null) {
                    int size2 = listSubList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                            throw new kotlin.a0();
                        }
                        androidx.compose.ui.layout.z0 z0Var = listSubList.get(i10);
                        if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), ib0.f28539o)) {
                            hVar.f312751a = z0Var.P0(jD);
                            if (size > 1) {
                                listSubList = listSubList.subList(1, size);
                            }
                            size--;
                            iC1 = ((androidx.compose.ui.layout.i2) hVar.f312751a).c1();
                            break;
                        }
                        i10++;
                    }
                } else {
                    iC1 = 0;
                }
                final ArrayList arrayList = size > 0 ? new ArrayList() : null;
                int iP = this.f28572b ? androidx.compose.ui.unit.b.p(jD) : iR;
                if (arrayList != null) {
                    float f10 = this.f28574d;
                    boolean z10 = this.f28572b;
                    androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var = this.f28575e;
                    int i11 = iC1;
                    ArrayList arrayList2 = new ArrayList(listSubList.size());
                    int size3 = listSubList.size();
                    int i12 = 0;
                    iG6 = 0;
                    int iC2 = i11;
                    while (i12 < size3) {
                        List<? extends androidx.compose.ui.layout.z0> list2 = listSubList;
                        int i13 = size3;
                        int i14 = i12;
                        boolean z11 = z10;
                        float f11 = f10;
                        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var2 = n7Var;
                        androidx.compose.ui.layout.i2 i2VarP0 = listSubList.get(i12).P0(androidx.compose.ui.unit.c.g(androidx.compose.ui.unit.c.r(jD, 0, -iC2, 1, null), androidx.compose.ui.unit.b.f42658b.b(c1Var.g6(f10), iP, c1Var.g6(ib0.N(n7Var)), androidx.compose.ui.unit.b.o(jD))));
                        int iB0 = i2VarP0.b0();
                        if (z11 && iG6 < iB0) {
                            iG6 = iB0 + c1Var.g6(ib0.f28526b);
                        }
                        iC2 = i2VarP0.c1();
                        arrayList2.add(Boolean.valueOf(arrayList.add(i2VarP0)));
                        i12 = i14 + 1;
                        listSubList = list2;
                        z10 = z11;
                        f10 = f11;
                        n7Var = n7Var2;
                        size3 = i13;
                    }
                } else {
                    iG6 = 0;
                }
                if (this.f28572b) {
                    androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) hVar.f312751a;
                    int iMax = Math.max(iG6, i2Var != null ? i2Var.h1() : 0);
                    if (iMax > iR && iMax > iR2) {
                        iR = kotlin.ranges.r.B(c1Var.g6(ib0.U(this.f28576f)), kotlin.ranges.r.B(Math.max(iMax, iR2), androidx.compose.ui.unit.b.p(j10)));
                        ib0.S(this.f28577g, iR);
                    }
                } else if (ib0.R(this.f28577g) > 0) {
                    iR = kotlin.ranges.r.I(c1Var.g6(ib0.U(this.f28576f)), iR, kotlin.ranges.r.u(ib0.P(this.f28578h), iR));
                }
                int i15 = iR;
                ib0.Q(this.f28578h, i15);
                final androidx.compose.foundation.layout.q.m mVar = this.f28579i;
                final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var3 = this.f28580j;
                return androidx.compose.ui.layout.c1.h6(c1Var, i15, iO, null, new Function1() { // from class: androidx.compose.material3.nb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ib0.e.a.i(iO, c1Var, hVar, arrayList, mVar, n7Var3, (androidx.compose.ui.layout.i2.a) obj);
                    }
                }, 4, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.foundation.layout.v6 v6Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10, androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var, float f10, androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var2, androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var3, androidx.compose.runtime.l3 l3Var, androidx.compose.runtime.l3 l3Var2, androidx.compose.foundation.layout.q.m mVar, androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var4, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f28559a = v6Var;
            this.f28560b = function2;
            this.f28561c = z10;
            this.f28562d = n7Var;
            this.f28563e = f10;
            this.f28564f = n7Var2;
            this.f28565g = n7Var3;
            this.f28566h = l3Var;
            this.f28567i = l3Var2;
            this.f28568j = mVar;
            this.f28569k = n7Var4;
            this.f28570l = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.b2(e0Var, true);
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
                androidx.compose.runtime.m0.A0(-1489314345, i10, -1, "androidx.compose.material3.WideNavigationRailLayout.<anonymous> (WideNavigationRail.kt:258)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.selection.b.b(androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.i6.D(androidx.compose.foundation.layout.t7.h(androidx.compose.foundation.layout.i6.d(aVar, 0.0f, 1, null), this.f28559a), 0.0f, ib0.f28531g, 1, null), 0.0f, ib0.f28527c, 0.0f, 0.0f, 13, null));
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.lb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ib0.e.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarB, false, (Function1) objI0, 1, null);
            a aVar2 = new a(this.f28560b, this.f28561c, this.f28562d, this.f28563e, this.f28564f, this.f28565g, this.f28566h, this.f28567i, this.f28568j, this.f28569k);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28560b;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f28570l;
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
            androidx.compose.runtime.y7.n(c0VarD, aVar2, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            if (function2 != null) {
                c0Var.E(1714892004);
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.layout.i0.b(aVar, ib0.f28539o);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ2 = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarB2);
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
                function2.invoke(c0Var, 0);
                c0Var.o();
                c0Var.A();
            } else {
                c0Var.E(1714982338);
                c0Var.A();
            }
            function3.invoke(c0Var, 0);
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

    static {
        d0.s1 s1Var = d0.s1.f268847a;
        float fB = s1Var.b();
        d0.n1 n1Var = d0.n1.f268535a;
        float f10 = 2;
        f28525a = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(fB - n1Var.i()) / f10);
        f28526b = androidx.compose.ui.unit.h.r(20);
        d0.o1 o1Var = d0.o1.f268586a;
        f28527c = o1Var.g();
        f28528d = n1Var.h();
        f28529e = o1Var.d();
        d0.q1 q1Var = d0.q1.f268698a;
        f28530f = q1Var.d();
        f28531g = q1Var.c();
        f28532h = n1Var.e();
        f28533i = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(s1Var.a() - n1Var.i()) / f10);
        f28534j = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(s1Var.b() - n1Var.i()) / f10);
        f28535k = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(d0.r1.f268773a.a() - n1Var.i()) / f10);
        f28536l = androidx.compose.ui.unit.h.r(24);
        f28537m = androidx.compose.ui.unit.h.r(48);
        f28540p = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material3.eb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ib0.q();
            }
        }, 1, null);
        f28541q = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material3.fb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ib0.p();
            }
        }, 1, null);
    }

    private static final float A(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(androidx.compose.runtime.n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(androidx.compose.runtime.n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(String str, final androidx.compose.runtime.n3 n3Var, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.material3.cb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ib0.E(n3Var));
            }
        }, 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(androidx.compose.runtime.n3 n3Var) {
        C(n3Var, true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(long j10, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, j10, 0L, 0L, kotlin.ranges.r.H(A(n7Var), 0.0f, 1.0f), null, null, 0, 118, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(long j10, Function1 function1, boolean z10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        z(j10, function1, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x015e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0161  */
    /* JADX WARN: Code duplicated, block: B:124:0x0167  */
    /* JADX WARN: Code duplicated, block: B:125:0x016f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0176  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:133:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0194  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    @androidx.compose.runtime.o
    public static final void H(@Nullable androidx.compose.ui.a0 a0Var, @Nullable qb0 qb0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable qa0 qa0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.foundation.layout.v6 v6Var, @Nullable androidx.compose.foundation.layout.q.m mVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.ui.graphics.q3 q3VarJ;
        qa0 qa0VarA;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        androidx.compose.foundation.layout.v6 v6VarK;
        androidx.compose.foundation.layout.q.m mVar2;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i13;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final qa0 qa0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        final androidx.compose.foundation.layout.v6 v6Var2;
        final androidx.compose.foundation.layout.q.m mVar3;
        final qb0 qb0Var2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        qb0 qb0VarD;
        qb0 qb0Var3;
        androidx.compose.foundation.layout.q.m mVarC;
        androidx.compose.ui.graphics.q3 q3Var3;
        qa0 qa0Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        androidx.compose.foundation.layout.v6 v6Var3;
        int i14;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(164193188);
        int i15 = i11 & 1;
        if (i15 != 0) {
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
            if ((i11 & 2) != 0) {
                i14 = 16;
            } else {
                if ((i10 & 64) == 0 ? c0VarR.D(qb0Var) : c0VarR.k0(qb0Var)) {
                    i14 = 32;
                } else {
                    i14 = 16;
                }
            }
            i12 |= i14;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                q3VarJ = q3Var;
                int i16 = c0VarR.D(q3VarJ) ? 256 : 128;
                i12 |= i16;
            } else {
                q3VarJ = q3Var;
            }
            i12 |= i16;
        } else {
            q3VarJ = q3Var;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                qa0VarA = qa0Var;
                int i17 = c0VarR.D(qa0VarA) ? 2048 : 1024;
                i12 |= i17;
            } else {
                qa0VarA = qa0Var;
            }
            i12 |= i17;
        } else {
            qa0VarA = qa0Var;
        }
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((i10 & 24576) == 0) {
                function4 = function2;
                i12 |= c0VarR.k0(function4) ? 16384 : 8192;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    v6VarK = v6Var;
                    int i19 = c0VarR.D(v6VarK) ? 131072 : 65536;
                    i12 |= i19;
                } else {
                    v6VarK = v6Var;
                }
                i12 |= i19;
            } else {
                v6VarK = v6Var;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    mVar2 = mVar;
                    int i20 = c0VarR.D(mVar2) ? 1048576 : 524288;
                    i12 |= i20;
                } else {
                    mVar2 = mVar;
                }
                i12 |= i20;
            } else {
                mVar2 = mVar;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i12 |= i13;
                }
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            qb0VarD = wb0.d(null, c0VarR, 0, 1);
                            i12 &= -113;
                        } else {
                            qb0VarD = qb0Var;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarJ = ra0.f32505a.j(c0VarR, 6);
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            qa0VarA = ra0.f32505a.a(c0VarR, 6);
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 32) != 0) {
                            v6VarK = ra0.f32505a.k(c0VarR, 6);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            qb0Var3 = qb0VarD;
                            mVarC = ra0.f32505a.c();
                            q3Var3 = q3VarJ;
                            qa0Var3 = qa0VarA;
                            function7 = function4;
                            v6Var3 = v6VarK;
                        } else {
                            qb0Var3 = qb0VarD;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(164193188, i12, -1, "androidx.compose.material3.WideNavigationRail (WideNavigationRail.kt:169)");
                        }
                        androidx.compose.ui.a0 a0Var5 = a0Var4;
                        ((ob0) c0VarR.W(f28540p)).a(new pb0(a0Var5, qb0Var3, q3Var3, qa0Var3, function7, v6Var3, mVarC, function5), c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        qb0Var2 = qb0Var3;
                        q3Var2 = q3Var3;
                        qa0Var2 = qa0Var3;
                        function6 = function7;
                        v6Var2 = v6Var3;
                        mVar3 = mVarC;
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
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        qb0Var3 = qb0Var;
                        a0Var4 = a0Var2;
                    }
                    q3Var3 = q3VarJ;
                    qa0Var3 = qa0VarA;
                    function7 = function4;
                    v6Var3 = v6VarK;
                    mVarC = mVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(164193188, i12, -1, "androidx.compose.material3.WideNavigationRail (WideNavigationRail.kt:169)");
                    }
                    androidx.compose.ui.a0 a0Var6 = a0Var4;
                    ((ob0) c0VarR.W(f28540p)).a(new pb0(a0Var6, qb0Var3, q3Var3, qa0Var3, function7, v6Var3, mVarC, function5), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var6;
                    qb0Var2 = qb0Var3;
                    q3Var2 = q3Var3;
                    qa0Var2 = qa0Var3;
                    function6 = function7;
                    v6Var2 = v6Var3;
                    mVar3 = mVarC;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var2 = q3VarJ;
                    qa0Var2 = qa0VarA;
                    function6 = function4;
                    v6Var2 = v6VarK;
                    mVar3 = mVar2;
                    qb0Var2 = qb0Var;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.db0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.I(a0Var3, qb0Var2, q3Var2, qa0Var2, function6, v6Var2, mVar3, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            function5 = function3;
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        qb0VarD = wb0.d(null, c0VarR, 0, 1);
                        i12 &= -113;
                    } else {
                        qb0VarD = qb0Var;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarJ = ra0.f32505a.j(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        qa0VarA = ra0.f32505a.a(c0VarR, 6);
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 32) != 0) {
                        v6VarK = ra0.f32505a.k(c0VarR, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        qb0Var3 = qb0VarD;
                        mVarC = ra0.f32505a.c();
                        q3Var3 = q3VarJ;
                        qa0Var3 = qa0VarA;
                        function7 = function4;
                        v6Var3 = v6VarK;
                    } else {
                        qb0Var3 = qb0VarD;
                        q3Var3 = q3VarJ;
                        qa0Var3 = qa0VarA;
                        function7 = function4;
                        v6Var3 = v6VarK;
                        mVarC = mVar2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        qb0VarD = wb0.d(null, c0VarR, 0, 1);
                        i12 &= -113;
                    } else {
                        qb0VarD = qb0Var;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarJ = ra0.f32505a.j(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        qa0VarA = ra0.f32505a.a(c0VarR, 6);
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 32) != 0) {
                        v6VarK = ra0.f32505a.k(c0VarR, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        qb0Var3 = qb0VarD;
                        mVarC = ra0.f32505a.c();
                        q3Var3 = q3VarJ;
                        qa0Var3 = qa0VarA;
                        function7 = function4;
                        v6Var3 = v6VarK;
                    } else {
                        qb0Var3 = qb0VarD;
                        q3Var3 = q3VarJ;
                        qa0Var3 = qa0VarA;
                        function7 = function4;
                        v6Var3 = v6VarK;
                        mVarC = mVar2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(164193188, i12, -1, "androidx.compose.material3.WideNavigationRail (WideNavigationRail.kt:169)");
                }
                androidx.compose.ui.a0 a0Var7 = a0Var4;
                ((ob0) c0VarR.W(f28540p)).a(new pb0(a0Var7, qb0Var3, q3Var3, qa0Var3, function7, v6Var3, mVarC, function5), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var7;
                qb0Var2 = qb0Var3;
                q3Var2 = q3Var3;
                qa0Var2 = qa0Var3;
                function6 = function7;
                v6Var2 = v6Var3;
                mVar3 = mVarC;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarJ;
                qa0Var2 = qa0VarA;
                function6 = function4;
                v6Var2 = v6VarK;
                mVar3 = mVar2;
                qb0Var2 = qb0Var;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.db0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ib0.I(a0Var3, qb0Var2, q3Var2, qa0Var2, function6, v6Var2, mVar3, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function4 = function2;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                v6VarK = v6Var;
                if (c0VarR.D(v6VarK)) {
                }
                i12 |= i19;
            } else {
                v6VarK = v6Var;
            }
            i12 |= i19;
        } else {
            v6VarK = v6Var;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                mVar2 = mVar;
                if (c0VarR.D(mVar2)) {
                }
                i12 |= i20;
            } else {
                mVar2 = mVar;
            }
            i12 |= i20;
        } else {
            mVar2 = mVar;
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                function5 = function3;
                if (c0VarR.k0(function5)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i12 |= i13;
            }
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        qb0VarD = wb0.d(null, c0VarR, 0, 1);
                        i12 &= -113;
                    } else {
                        qb0VarD = qb0Var;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarJ = ra0.f32505a.j(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        qa0VarA = ra0.f32505a.a(c0VarR, 6);
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 32) != 0) {
                        v6VarK = ra0.f32505a.k(c0VarR, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        qb0Var3 = qb0VarD;
                        mVarC = ra0.f32505a.c();
                        q3Var3 = q3VarJ;
                        qa0Var3 = qa0VarA;
                        function7 = function4;
                        v6Var3 = v6VarK;
                    } else {
                        qb0Var3 = qb0VarD;
                        q3Var3 = q3VarJ;
                        qa0Var3 = qa0VarA;
                        function7 = function4;
                        v6Var3 = v6VarK;
                        mVarC = mVar2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        qb0VarD = wb0.d(null, c0VarR, 0, 1);
                        i12 &= -113;
                    } else {
                        qb0VarD = qb0Var;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarJ = ra0.f32505a.j(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        qa0VarA = ra0.f32505a.a(c0VarR, 6);
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 32) != 0) {
                        v6VarK = ra0.f32505a.k(c0VarR, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        qb0Var3 = qb0VarD;
                        mVarC = ra0.f32505a.c();
                        q3Var3 = q3VarJ;
                        qa0Var3 = qa0VarA;
                        function7 = function4;
                        v6Var3 = v6VarK;
                    } else {
                        qb0Var3 = qb0VarD;
                        q3Var3 = q3VarJ;
                        qa0Var3 = qa0VarA;
                        function7 = function4;
                        v6Var3 = v6VarK;
                        mVarC = mVar2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(164193188, i12, -1, "androidx.compose.material3.WideNavigationRail (WideNavigationRail.kt:169)");
                }
                androidx.compose.ui.a0 a0Var8 = a0Var4;
                ((ob0) c0VarR.W(f28540p)).a(new pb0(a0Var8, qb0Var3, q3Var3, qa0Var3, function7, v6Var3, mVarC, function5), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var8;
                qb0Var2 = qb0Var3;
                q3Var2 = q3Var3;
                qa0Var2 = qa0Var3;
                function6 = function7;
                v6Var2 = v6Var3;
                mVar3 = mVarC;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var2 = q3VarJ;
                qa0Var2 = qa0VarA;
                function6 = function4;
                v6Var2 = v6VarK;
                mVar3 = mVar2;
                qb0Var2 = qb0Var;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.db0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ib0.I(a0Var3, qb0Var2, q3Var2, qa0Var2, function6, v6Var2, mVar3, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        function5 = function3;
        if ((4793491 & i12) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    qb0VarD = wb0.d(null, c0VarR, 0, 1);
                    i12 &= -113;
                } else {
                    qb0VarD = qb0Var;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarJ = ra0.f32505a.j(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    qa0VarA = ra0.f32505a.a(c0VarR, 6);
                }
                if (i18 != 0) {
                    function4 = null;
                }
                if ((i11 & 32) != 0) {
                    v6VarK = ra0.f32505a.k(c0VarR, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    qb0Var3 = qb0VarD;
                    mVarC = ra0.f32505a.c();
                    q3Var3 = q3VarJ;
                    qa0Var3 = qa0VarA;
                    function7 = function4;
                    v6Var3 = v6VarK;
                } else {
                    qb0Var3 = qb0VarD;
                    q3Var3 = q3VarJ;
                    qa0Var3 = qa0VarA;
                    function7 = function4;
                    v6Var3 = v6VarK;
                    mVarC = mVar2;
                }
            } else {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    qb0VarD = wb0.d(null, c0VarR, 0, 1);
                    i12 &= -113;
                } else {
                    qb0VarD = qb0Var;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarJ = ra0.f32505a.j(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    qa0VarA = ra0.f32505a.a(c0VarR, 6);
                }
                if (i18 != 0) {
                    function4 = null;
                }
                if ((i11 & 32) != 0) {
                    v6VarK = ra0.f32505a.k(c0VarR, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    qb0Var3 = qb0VarD;
                    mVarC = ra0.f32505a.c();
                    q3Var3 = q3VarJ;
                    qa0Var3 = qa0VarA;
                    function7 = function4;
                    v6Var3 = v6VarK;
                } else {
                    qb0Var3 = qb0VarD;
                    q3Var3 = q3VarJ;
                    qa0Var3 = qa0VarA;
                    function7 = function4;
                    v6Var3 = v6VarK;
                    mVarC = mVar2;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(164193188, i12, -1, "androidx.compose.material3.WideNavigationRail (WideNavigationRail.kt:169)");
            }
            androidx.compose.ui.a0 a0Var9 = a0Var4;
            ((ob0) c0VarR.W(f28540p)).a(new pb0(a0Var9, qb0Var3, q3Var3, qa0Var3, function7, v6Var3, mVarC, function5), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var9;
            qb0Var2 = qb0Var3;
            q3Var2 = q3Var3;
            qa0Var2 = qa0Var3;
            function6 = function7;
            v6Var2 = v6Var3;
            mVar3 = mVarC;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            q3Var2 = q3VarJ;
            qa0Var2 = qa0VarA;
            function6 = function4;
            v6Var2 = v6VarK;
            mVar3 = mVar2;
            qb0Var2 = qb0Var;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.db0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ib0.I(a0Var3, qb0Var2, q3Var2, qa0Var2, function6, v6Var2, mVar3, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(androidx.compose.ui.a0 a0Var, qb0 qb0Var, androidx.compose.ui.graphics.q3 q3Var, qa0 qa0Var, Function2 function2, androidx.compose.foundation.layout.v6 v6Var, androidx.compose.foundation.layout.q.m mVar, Function2 function3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        H(a0Var, qb0Var, q3Var, qa0Var, function2, v6Var, mVar, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0116  */
    /* JADX WARN: Code duplicated, block: B:105:0x011a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0128  */
    /* JADX WARN: Code duplicated, block: B:108:0x012b  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:116:0x0149  */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:128:0x0172 A[PHI: r0 r7 r9 r10 r15
      0x0172: PHI (r0v22 int) = (r0v12 int), (r0v27 int), (r0v28 int) binds: [B:142:0x01a8, B:126:0x016e, B:127:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r7v31 androidx.compose.ui.a0) = (r7v7 androidx.compose.ui.a0), (r7v4 androidx.compose.ui.a0), (r7v4 androidx.compose.ui.a0) binds: [B:142:0x01a8, B:126:0x016e, B:127:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r9v17 boolean) = (r9v7 boolean), (r9v4 boolean), (r9v4 boolean) binds: [B:142:0x01a8, B:126:0x016e, B:127:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r10v15 int) = (r10v10 int), (r10v7 int), (r10v7 int) binds: [B:142:0x01a8, B:126:0x016e, B:127:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r15v8 androidx.compose.material3.vo) = (r15v4 androidx.compose.material3.vo), (r15v3 androidx.compose.material3.vo), (r15v3 androidx.compose.material3.vo) binds: [B:142:0x01a8, B:126:0x016e, B:127:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:133:0x0188  */
    /* JADX WARN: Code duplicated, block: B:136:0x018e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:140:0x019e  */
    /* JADX WARN: Code duplicated, block: B:143:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:155:0x0260  */
    /* JADX WARN: Code duplicated, block: B:157:0x0270  */
    /* JADX WARN: Code duplicated, block: B:160:0x0281  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0100  */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void J(final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final boolean z11, @Nullable androidx.compose.ui.a0 a0Var, boolean z12, int i10, @Nullable vo voVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        boolean z13;
        int i13;
        Function0<Unit> function1;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.a0 a0Var2;
        int i17;
        int i18;
        boolean z14;
        int i19;
        int iD;
        vo voVarA;
        int i20;
        int i21;
        int i22;
        boolean z15;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z16;
        final int i23;
        final vo voVar2;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        int i24;
        int i25;
        androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.foundation.interaction.j jVar4;
        Object objI0;
        int i26;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1894733304);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            z13 = z10;
        } else {
            z13 = z10;
            if ((i11 & 6) == 0) {
                i13 = (c0VarR.G(z13) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i11 & 48) == 0) {
                i13 |= c0VarR.k0(function1) ? 32 : 16;
            }
        }
        if ((i12 & 4) == 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                function4 = function2;
                i13 |= c0VarR.k0(function4) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                if ((i11 & 3072) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i13 |= i14;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (c0VarR.G(z11)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((196608 & i11) == 0) {
                        a0Var2 = a0Var;
                        if (c0VarR.D(a0Var2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        if ((1572864 & i11) == 0) {
                            z14 = z12;
                            if (c0VarR.G(z14)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i13 |= i19;
                        }
                        if ((12582912 & i11) == 0) {
                            if ((i12 & 128) == 0) {
                                iD = i10;
                                int i27 = c0VarR.K(iD) ? 8388608 : 4194304;
                                i13 |= i27;
                            } else {
                                iD = i10;
                            }
                            i13 |= i27;
                        } else {
                            iD = i10;
                        }
                        if ((100663296 & i11) == 0) {
                            if ((i12 & 256) == 0) {
                                voVarA = voVar;
                                if (c0VarR.D(voVarA)) {
                                    i26 = 67108864;
                                }
                                i13 |= i26;
                            } else {
                                voVarA = voVar;
                            }
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                            i13 |= i26;
                        } else {
                            voVarA = voVar;
                        }
                        i20 = i12 & 512;
                        if (i20 != 0) {
                            if ((i11 & 805306368) == 0) {
                                if (c0VarR.D(jVar)) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i13 |= i21;
                            }
                            i22 = i13;
                            if ((i13 & 306783379) != 306783378) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (c0VarR.h(z15, i22 & 1)) {
                                c0VarR.l0();
                                if ((i11 & 1) != 0 || c0VarR.y()) {
                                    if (i16 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i18 != 0) {
                                        z14 = true;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i24 = i22 & (-29360129);
                                        iD = sa0.f32881a.d(z11);
                                    } else {
                                        i24 = i22;
                                    }
                                    if ((i12 & 256) != 0) {
                                        i24 &= -234881025;
                                        voVarA = sa0.f32881a.a(c0VarR, 6);
                                    }
                                    i25 = i24;
                                    if (i20 != 0) {
                                        jVar3 = null;
                                    }
                                    androidx.compose.ui.a0 a0Var4 = a0Var2;
                                    boolean z17 = z14;
                                    int i28 = iD;
                                    vo voVar3 = voVarA;
                                    c0VarR.Z();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                                    }
                                    if (jVar3 == null) {
                                        c0VarR.E(-1539072909);
                                        objI0 = c0VarR.i0();
                                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                            objI0 = androidx.compose.foundation.interaction.i.a();
                                            c0VarR.Y(objI0);
                                        }
                                        c0VarR.A();
                                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                                    } else {
                                        c0VarR.E(227446500);
                                        c0VarR.A();
                                        jVar4 = jVar3;
                                    }
                                    androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                                    d0.s1 s1Var = d0.s1.f268847a;
                                    float fB = s1Var.b();
                                    androidx.compose.ui.text.y3 y3VarE = la0.e(s1Var.d(), c0VarR, 6);
                                    d0.r1 r1Var = d0.r1.f268773a;
                                    int i29 = i25 << 3;
                                    c0Var2 = c0VarR;
                                    qp.t(z13, function1, function4, q3VarI, fB, y3VarE, la0.e(r1Var.e(), c0VarR, 6), f28534j, f28533i, s1Var.c(), r1Var.b(), f28535k, f28525a, r1Var.d(), f28526b, voVar3, a0Var4, z17, function5, i28, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i29) | (i29 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    jVar2 = jVar3;
                                    voVar2 = voVar3;
                                    a0Var3 = a0Var4;
                                    z16 = z17;
                                    i23 = i28;
                                } else {
                                    c0VarR.u();
                                    i25 = (i12 & 128) != 0 ? i22 & (-29360129) : i22;
                                    if ((i12 & 256) != 0) {
                                        i25 &= -234881025;
                                    }
                                }
                                jVar3 = jVar;
                                androidx.compose.ui.a0 a0Var5 = a0Var2;
                                boolean z18 = z14;
                                int i210 = iD;
                                vo voVar4 = voVarA;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                                }
                                if (jVar3 == null) {
                                    c0VarR.E(-1539072909);
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = androidx.compose.foundation.interaction.i.a();
                                        c0VarR.Y(objI0);
                                    }
                                    c0VarR.A();
                                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                                } else {
                                    c0VarR.E(227446500);
                                    c0VarR.A();
                                    jVar4 = jVar3;
                                }
                                androidx.compose.ui.graphics.q3 q3VarI2 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                                d0.s1 s1Var2 = d0.s1.f268847a;
                                float fB2 = s1Var2.b();
                                androidx.compose.ui.text.y3 y3VarE2 = la0.e(s1Var2.d(), c0VarR, 6);
                                d0.r1 r1Var2 = d0.r1.f268773a;
                                int i211 = i25 << 3;
                                c0Var2 = c0VarR;
                                qp.t(z13, function1, function4, q3VarI2, fB2, y3VarE2, la0.e(r1Var2.e(), c0VarR, 6), f28534j, f28533i, s1Var2.c(), r1Var2.b(), f28535k, f28525a, r1Var2.d(), f28526b, voVar4, a0Var5, z18, function5, i210, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i211) | (i211 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                jVar2 = jVar3;
                                voVar2 = voVar4;
                                a0Var3 = a0Var5;
                                z16 = z18;
                                i23 = i210;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                a0Var3 = a0Var2;
                                z16 = z14;
                                i23 = iD;
                                voVar2 = voVarA;
                                jVar2 = jVar;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 805306368;
                        i22 = i13;
                        if ((i13 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i22 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            androidx.compose.ui.a0 a0Var6 = a0Var2;
                            boolean z19 = z14;
                            int i212 = iD;
                            vo voVar5 = voVarA;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                            }
                            if (jVar3 == null) {
                                c0VarR.E(-1539072909);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                c0VarR.E(227446500);
                                c0VarR.A();
                                jVar4 = jVar3;
                            }
                            androidx.compose.ui.graphics.q3 q3VarI3 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            d0.s1 s1Var3 = d0.s1.f268847a;
                            float fB3 = s1Var3.b();
                            androidx.compose.ui.text.y3 y3VarE3 = la0.e(s1Var3.d(), c0VarR, 6);
                            d0.r1 r1Var3 = d0.r1.f268773a;
                            int i213 = i25 << 3;
                            c0Var2 = c0VarR;
                            qp.t(z13, function1, function4, q3VarI3, fB3, y3VarE3, la0.e(r1Var3.e(), c0VarR, 6), f28534j, f28533i, s1Var3.c(), r1Var3.b(), f28535k, f28525a, r1Var3.d(), f28526b, voVar5, a0Var6, z19, function5, i212, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i213) | (i213 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar3;
                            voVar2 = voVar5;
                            a0Var3 = a0Var6;
                            z16 = z19;
                            i23 = i212;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z16 = z14;
                            i23 = iD;
                            voVar2 = voVarA;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 1572864;
                    z14 = z12;
                    if ((12582912 & i11) == 0) {
                        if ((i12 & 128) == 0) {
                            iD = i10;
                            if (c0VarR.K(iD)) {
                            }
                            i13 |= i27;
                        } else {
                            iD = i10;
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    if ((100663296 & i11) == 0) {
                        if ((i12 & 256) == 0) {
                            voVarA = voVar;
                            if (c0VarR.D(voVarA)) {
                                i26 = 67108864;
                            }
                            i13 |= i26;
                        } else {
                            voVarA = voVar;
                        }
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i20 = i12 & 512;
                    if (i20 != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c0VarR.D(jVar)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                        i22 = i13;
                        if ((i13 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i22 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            androidx.compose.ui.a0 a0Var7 = a0Var2;
                            boolean z110 = z14;
                            int i214 = iD;
                            vo voVar6 = voVarA;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                            }
                            if (jVar3 == null) {
                                c0VarR.E(-1539072909);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                c0VarR.E(227446500);
                                c0VarR.A();
                                jVar4 = jVar3;
                            }
                            androidx.compose.ui.graphics.q3 q3VarI4 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            d0.s1 s1Var4 = d0.s1.f268847a;
                            float fB4 = s1Var4.b();
                            androidx.compose.ui.text.y3 y3VarE4 = la0.e(s1Var4.d(), c0VarR, 6);
                            d0.r1 r1Var4 = d0.r1.f268773a;
                            int i215 = i25 << 3;
                            c0Var2 = c0VarR;
                            qp.t(z13, function1, function4, q3VarI4, fB4, y3VarE4, la0.e(r1Var4.e(), c0VarR, 6), f28534j, f28533i, s1Var4.c(), r1Var4.b(), f28535k, f28525a, r1Var4.d(), f28526b, voVar6, a0Var7, z110, function5, i214, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i215) | (i215 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar3;
                            voVar2 = voVar6;
                            a0Var3 = a0Var7;
                            z16 = z110;
                            i23 = i214;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z16 = z14;
                            i23 = iD;
                            voVar2 = voVarA;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var8 = a0Var2;
                        boolean z111 = z14;
                        int i216 = iD;
                        vo voVar7 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI5 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var5 = d0.s1.f268847a;
                        float fB5 = s1Var5.b();
                        androidx.compose.ui.text.y3 y3VarE5 = la0.e(s1Var5.d(), c0VarR, 6);
                        d0.r1 r1Var5 = d0.r1.f268773a;
                        int i217 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI5, fB5, y3VarE5, la0.e(r1Var5.e(), c0VarR, 6), f28534j, f28533i, s1Var5.c(), r1Var5.b(), f28535k, f28525a, r1Var5.d(), f28526b, voVar7, a0Var8, z111, function5, i216, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i217) | (i217 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar7;
                        a0Var3 = a0Var8;
                        z16 = z111;
                        i23 = i216;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                a0Var2 = a0Var;
                i18 = i12 & 64;
                if (i18 != 0) {
                    if ((1572864 & i11) == 0) {
                        z14 = z12;
                        if (c0VarR.G(z14)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    if ((12582912 & i11) == 0) {
                        if ((i12 & 128) == 0) {
                            iD = i10;
                            if (c0VarR.K(iD)) {
                            }
                            i13 |= i27;
                        } else {
                            iD = i10;
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    if ((100663296 & i11) == 0) {
                        if ((i12 & 256) == 0) {
                            voVarA = voVar;
                            if (c0VarR.D(voVarA)) {
                                i26 = 67108864;
                            }
                            i13 |= i26;
                        } else {
                            voVarA = voVar;
                        }
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i20 = i12 & 512;
                    if (i20 != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c0VarR.D(jVar)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                        i22 = i13;
                        if ((i13 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i22 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            androidx.compose.ui.a0 a0Var9 = a0Var2;
                            boolean z112 = z14;
                            int i218 = iD;
                            vo voVar8 = voVarA;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                            }
                            if (jVar3 == null) {
                                c0VarR.E(-1539072909);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                c0VarR.E(227446500);
                                c0VarR.A();
                                jVar4 = jVar3;
                            }
                            androidx.compose.ui.graphics.q3 q3VarI6 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            d0.s1 s1Var6 = d0.s1.f268847a;
                            float fB6 = s1Var6.b();
                            androidx.compose.ui.text.y3 y3VarE6 = la0.e(s1Var6.d(), c0VarR, 6);
                            d0.r1 r1Var6 = d0.r1.f268773a;
                            int i219 = i25 << 3;
                            c0Var2 = c0VarR;
                            qp.t(z13, function1, function4, q3VarI6, fB6, y3VarE6, la0.e(r1Var6.e(), c0VarR, 6), f28534j, f28533i, s1Var6.c(), r1Var6.b(), f28535k, f28525a, r1Var6.d(), f28526b, voVar8, a0Var9, z112, function5, i218, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i219) | (i219 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar3;
                            voVar2 = voVar8;
                            a0Var3 = a0Var9;
                            z16 = z112;
                            i23 = i218;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z16 = z14;
                            i23 = iD;
                            voVar2 = voVarA;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var10 = a0Var2;
                        boolean z113 = z14;
                        int i2110 = iD;
                        vo voVar9 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI7 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var7 = d0.s1.f268847a;
                        float fB7 = s1Var7.b();
                        androidx.compose.ui.text.y3 y3VarE7 = la0.e(s1Var7.d(), c0VarR, 6);
                        d0.r1 r1Var7 = d0.r1.f268773a;
                        int i2111 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI7, fB7, y3VarE7, la0.e(r1Var7.e(), c0VarR, 6), f28534j, f28533i, s1Var7.c(), r1Var7.b(), f28535k, f28525a, r1Var7.d(), f28526b, voVar9, a0Var10, z113, function5, i2110, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2111) | (i2111 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar9;
                        a0Var3 = a0Var10;
                        z16 = z113;
                        i23 = i2110;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 1572864;
                z14 = z12;
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        iD = i10;
                        if (c0VarR.K(iD)) {
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                if ((100663296 & i11) == 0) {
                    if ((i12 & 256) == 0) {
                        voVarA = voVar;
                        if (c0VarR.D(voVarA)) {
                            i26 = 67108864;
                        }
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var11 = a0Var2;
                        boolean z114 = z14;
                        int i2112 = iD;
                        vo voVar10 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI8 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var8 = d0.s1.f268847a;
                        float fB8 = s1Var8.b();
                        androidx.compose.ui.text.y3 y3VarE8 = la0.e(s1Var8.d(), c0VarR, 6);
                        d0.r1 r1Var8 = d0.r1.f268773a;
                        int i2113 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI8, fB8, y3VarE8, la0.e(r1Var8.e(), c0VarR, 6), f28534j, f28533i, s1Var8.c(), r1Var8.b(), f28535k, f28525a, r1Var8.d(), f28526b, voVar10, a0Var11, z114, function5, i2112, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2113) | (i2113 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar10;
                        a0Var3 = a0Var11;
                        z16 = z114;
                        i23 = i2112;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var12 = a0Var2;
                    boolean z115 = z14;
                    int i2114 = iD;
                    vo voVar11 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI9 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var9 = d0.s1.f268847a;
                    float fB9 = s1Var9.b();
                    androidx.compose.ui.text.y3 y3VarE9 = la0.e(s1Var9.d(), c0VarR, 6);
                    d0.r1 r1Var9 = d0.r1.f268773a;
                    int i2115 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI9, fB9, y3VarE9, la0.e(r1Var9.e(), c0VarR, 6), f28534j, f28533i, s1Var9.c(), r1Var9.b(), f28535k, f28525a, r1Var9.d(), f28526b, voVar11, a0Var12, z115, function5, i2114, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2115) | (i2115 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar11;
                    a0Var3 = a0Var12;
                    z16 = z115;
                    i23 = i2114;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            function5 = function3;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (c0VarR.G(z11)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    if ((1572864 & i11) == 0) {
                        z14 = z12;
                        if (c0VarR.G(z14)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    if ((12582912 & i11) == 0) {
                        if ((i12 & 128) == 0) {
                            iD = i10;
                            if (c0VarR.K(iD)) {
                            }
                            i13 |= i27;
                        } else {
                            iD = i10;
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    if ((100663296 & i11) == 0) {
                        if ((i12 & 256) == 0) {
                            voVarA = voVar;
                            if (c0VarR.D(voVarA)) {
                                i26 = 67108864;
                            }
                            i13 |= i26;
                        } else {
                            voVarA = voVar;
                        }
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i20 = i12 & 512;
                    if (i20 != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c0VarR.D(jVar)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                        i22 = i13;
                        if ((i13 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i22 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            androidx.compose.ui.a0 a0Var13 = a0Var2;
                            boolean z116 = z14;
                            int i2116 = iD;
                            vo voVar12 = voVarA;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                            }
                            if (jVar3 == null) {
                                c0VarR.E(-1539072909);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                c0VarR.E(227446500);
                                c0VarR.A();
                                jVar4 = jVar3;
                            }
                            androidx.compose.ui.graphics.q3 q3VarI10 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            d0.s1 s1Var10 = d0.s1.f268847a;
                            float fB10 = s1Var10.b();
                            androidx.compose.ui.text.y3 y3VarE10 = la0.e(s1Var10.d(), c0VarR, 6);
                            d0.r1 r1Var10 = d0.r1.f268773a;
                            int i2117 = i25 << 3;
                            c0Var2 = c0VarR;
                            qp.t(z13, function1, function4, q3VarI10, fB10, y3VarE10, la0.e(r1Var10.e(), c0VarR, 6), f28534j, f28533i, s1Var10.c(), r1Var10.b(), f28535k, f28525a, r1Var10.d(), f28526b, voVar12, a0Var13, z116, function5, i2116, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2117) | (i2117 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar3;
                            voVar2 = voVar12;
                            a0Var3 = a0Var13;
                            z16 = z116;
                            i23 = i2116;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z16 = z14;
                            i23 = iD;
                            voVar2 = voVarA;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var14 = a0Var2;
                        boolean z117 = z14;
                        int i2118 = iD;
                        vo voVar13 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI11 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var11 = d0.s1.f268847a;
                        float fB11 = s1Var11.b();
                        androidx.compose.ui.text.y3 y3VarE11 = la0.e(s1Var11.d(), c0VarR, 6);
                        d0.r1 r1Var11 = d0.r1.f268773a;
                        int i2119 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI11, fB11, y3VarE11, la0.e(r1Var11.e(), c0VarR, 6), f28534j, f28533i, s1Var11.c(), r1Var11.b(), f28535k, f28525a, r1Var11.d(), f28526b, voVar13, a0Var14, z117, function5, i2118, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2119) | (i2119 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar13;
                        a0Var3 = a0Var14;
                        z16 = z117;
                        i23 = i2118;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 1572864;
                z14 = z12;
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        iD = i10;
                        if (c0VarR.K(iD)) {
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                if ((100663296 & i11) == 0) {
                    if ((i12 & 256) == 0) {
                        voVarA = voVar;
                        if (c0VarR.D(voVarA)) {
                            i26 = 67108864;
                        }
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var15 = a0Var2;
                        boolean z118 = z14;
                        int i21110 = iD;
                        vo voVar14 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI12 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var12 = d0.s1.f268847a;
                        float fB12 = s1Var12.b();
                        androidx.compose.ui.text.y3 y3VarE12 = la0.e(s1Var12.d(), c0VarR, 6);
                        d0.r1 r1Var12 = d0.r1.f268773a;
                        int i21111 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI12, fB12, y3VarE12, la0.e(r1Var12.e(), c0VarR, 6), f28534j, f28533i, s1Var12.c(), r1Var12.b(), f28535k, f28525a, r1Var12.d(), f28526b, voVar14, a0Var15, z118, function5, i21110, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21111) | (i21111 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar14;
                        a0Var3 = a0Var15;
                        z16 = z118;
                        i23 = i21110;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var16 = a0Var2;
                    boolean z119 = z14;
                    int i21112 = iD;
                    vo voVar15 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI13 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var13 = d0.s1.f268847a;
                    float fB13 = s1Var13.b();
                    androidx.compose.ui.text.y3 y3VarE13 = la0.e(s1Var13.d(), c0VarR, 6);
                    d0.r1 r1Var13 = d0.r1.f268773a;
                    int i21113 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI13, fB13, y3VarE13, la0.e(r1Var13.e(), c0VarR, 6), f28534j, f28533i, s1Var13.c(), r1Var13.b(), f28535k, f28525a, r1Var13.d(), f28526b, voVar15, a0Var16, z119, function5, i21112, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21113) | (i21113 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar15;
                    a0Var3 = a0Var16;
                    z16 = z119;
                    i23 = i21112;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            a0Var2 = a0Var;
            i18 = i12 & 64;
            if (i18 != 0) {
                if ((1572864 & i11) == 0) {
                    z14 = z12;
                    if (c0VarR.G(z14)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        iD = i10;
                        if (c0VarR.K(iD)) {
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                if ((100663296 & i11) == 0) {
                    if ((i12 & 256) == 0) {
                        voVarA = voVar;
                        if (c0VarR.D(voVarA)) {
                            i26 = 67108864;
                        }
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var17 = a0Var2;
                        boolean z1110 = z14;
                        int i21114 = iD;
                        vo voVar16 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI14 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var14 = d0.s1.f268847a;
                        float fB14 = s1Var14.b();
                        androidx.compose.ui.text.y3 y3VarE14 = la0.e(s1Var14.d(), c0VarR, 6);
                        d0.r1 r1Var14 = d0.r1.f268773a;
                        int i21115 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI14, fB14, y3VarE14, la0.e(r1Var14.e(), c0VarR, 6), f28534j, f28533i, s1Var14.c(), r1Var14.b(), f28535k, f28525a, r1Var14.d(), f28526b, voVar16, a0Var17, z1110, function5, i21114, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21115) | (i21115 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar16;
                        a0Var3 = a0Var17;
                        z16 = z1110;
                        i23 = i21114;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var18 = a0Var2;
                    boolean z1111 = z14;
                    int i21116 = iD;
                    vo voVar17 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI15 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var15 = d0.s1.f268847a;
                    float fB15 = s1Var15.b();
                    androidx.compose.ui.text.y3 y3VarE15 = la0.e(s1Var15.d(), c0VarR, 6);
                    d0.r1 r1Var15 = d0.r1.f268773a;
                    int i21117 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI15, fB15, y3VarE15, la0.e(r1Var15.e(), c0VarR, 6), f28534j, f28533i, s1Var15.c(), r1Var15.b(), f28535k, f28525a, r1Var15.d(), f28526b, voVar17, a0Var18, z1111, function5, i21116, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21117) | (i21117 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar17;
                    a0Var3 = a0Var18;
                    z16 = z1111;
                    i23 = i21116;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            z14 = z12;
            if ((12582912 & i11) == 0) {
                if ((i12 & 128) == 0) {
                    iD = i10;
                    if (c0VarR.K(iD)) {
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                i13 |= i27;
            } else {
                iD = i10;
            }
            if ((100663296 & i11) == 0) {
                if ((i12 & 256) == 0) {
                    voVarA = voVar;
                    if (c0VarR.D(voVarA)) {
                        i26 = 67108864;
                    }
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i26 = com.google.api.client.googleapis.media.a.f115410j;
                i13 |= i26;
            } else {
                voVarA = voVar;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var19 = a0Var2;
                    boolean z1112 = z14;
                    int i21118 = iD;
                    vo voVar18 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI16 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var16 = d0.s1.f268847a;
                    float fB16 = s1Var16.b();
                    androidx.compose.ui.text.y3 y3VarE16 = la0.e(s1Var16.d(), c0VarR, 6);
                    d0.r1 r1Var16 = d0.r1.f268773a;
                    int i21119 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI16, fB16, y3VarE16, la0.e(r1Var16.e(), c0VarR, 6), f28534j, f28533i, s1Var16.c(), r1Var16.b(), f28535k, f28525a, r1Var16.d(), f28526b, voVar18, a0Var19, z1112, function5, i21118, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21119) | (i21119 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar18;
                    a0Var3 = a0Var19;
                    z16 = z1112;
                    i23 = i21118;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i22 = i13;
            if ((i13 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i22 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                androidx.compose.ui.a0 a0Var110 = a0Var2;
                boolean z1113 = z14;
                int i211110 = iD;
                vo voVar19 = voVarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1539072909);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(227446500);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                androidx.compose.ui.graphics.q3 q3VarI17 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                d0.s1 s1Var17 = d0.s1.f268847a;
                float fB17 = s1Var17.b();
                androidx.compose.ui.text.y3 y3VarE17 = la0.e(s1Var17.d(), c0VarR, 6);
                d0.r1 r1Var17 = d0.r1.f268773a;
                int i211111 = i25 << 3;
                c0Var2 = c0VarR;
                qp.t(z13, function1, function4, q3VarI17, fB17, y3VarE17, la0.e(r1Var17.e(), c0VarR, 6), f28534j, f28533i, s1Var17.c(), r1Var17.b(), f28535k, f28525a, r1Var17.d(), f28526b, voVar19, a0Var110, z1113, function5, i211110, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i211111) | (i211111 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar3;
                voVar2 = voVar19;
                a0Var3 = a0Var110;
                z16 = z1113;
                i23 = i211110;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z16 = z14;
                i23 = iD;
                voVar2 = voVarA;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        function4 = function2;
        if ((i12 & 8) != 0) {
            if ((i11 & 3072) == 0) {
                function5 = function3;
                if (c0VarR.k0(function5)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (c0VarR.G(z11)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    if ((1572864 & i11) == 0) {
                        z14 = z12;
                        if (c0VarR.G(z14)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    if ((12582912 & i11) == 0) {
                        if ((i12 & 128) == 0) {
                            iD = i10;
                            if (c0VarR.K(iD)) {
                            }
                            i13 |= i27;
                        } else {
                            iD = i10;
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    if ((100663296 & i11) == 0) {
                        if ((i12 & 256) == 0) {
                            voVarA = voVar;
                            if (c0VarR.D(voVarA)) {
                                i26 = 67108864;
                            }
                            i13 |= i26;
                        } else {
                            voVarA = voVar;
                        }
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i20 = i12 & 512;
                    if (i20 != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c0VarR.D(jVar)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                        i22 = i13;
                        if ((i13 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i22 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i16 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if ((i12 & 128) != 0) {
                                    i24 = i22 & (-29360129);
                                    iD = sa0.f32881a.d(z11);
                                } else {
                                    i24 = i22;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 &= -234881025;
                                    voVarA = sa0.f32881a.a(c0VarR, 6);
                                }
                                i25 = i24;
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            androidx.compose.ui.a0 a0Var111 = a0Var2;
                            boolean z1114 = z14;
                            int i211112 = iD;
                            vo voVar110 = voVarA;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                            }
                            if (jVar3 == null) {
                                c0VarR.E(-1539072909);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                c0VarR.E(227446500);
                                c0VarR.A();
                                jVar4 = jVar3;
                            }
                            androidx.compose.ui.graphics.q3 q3VarI18 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            d0.s1 s1Var18 = d0.s1.f268847a;
                            float fB18 = s1Var18.b();
                            androidx.compose.ui.text.y3 y3VarE18 = la0.e(s1Var18.d(), c0VarR, 6);
                            d0.r1 r1Var18 = d0.r1.f268773a;
                            int i211113 = i25 << 3;
                            c0Var2 = c0VarR;
                            qp.t(z13, function1, function4, q3VarI18, fB18, y3VarE18, la0.e(r1Var18.e(), c0VarR, 6), f28534j, f28533i, s1Var18.c(), r1Var18.b(), f28535k, f28525a, r1Var18.d(), f28526b, voVar110, a0Var111, z1114, function5, i211112, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i211113) | (i211113 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar3;
                            voVar2 = voVar110;
                            a0Var3 = a0Var111;
                            z16 = z1114;
                            i23 = i211112;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z16 = z14;
                            i23 = iD;
                            voVar2 = voVarA;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var112 = a0Var2;
                        boolean z1115 = z14;
                        int i211114 = iD;
                        vo voVar111 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI19 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var19 = d0.s1.f268847a;
                        float fB19 = s1Var19.b();
                        androidx.compose.ui.text.y3 y3VarE19 = la0.e(s1Var19.d(), c0VarR, 6);
                        d0.r1 r1Var19 = d0.r1.f268773a;
                        int i211115 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI19, fB19, y3VarE19, la0.e(r1Var19.e(), c0VarR, 6), f28534j, f28533i, s1Var19.c(), r1Var19.b(), f28535k, f28525a, r1Var19.d(), f28526b, voVar111, a0Var112, z1115, function5, i211114, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i211115) | (i211115 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar111;
                        a0Var3 = a0Var112;
                        z16 = z1115;
                        i23 = i211114;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 1572864;
                z14 = z12;
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        iD = i10;
                        if (c0VarR.K(iD)) {
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                if ((100663296 & i11) == 0) {
                    if ((i12 & 256) == 0) {
                        voVarA = voVar;
                        if (c0VarR.D(voVarA)) {
                            i26 = 67108864;
                        }
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var113 = a0Var2;
                        boolean z1116 = z14;
                        int i211116 = iD;
                        vo voVar112 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI110 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var110 = d0.s1.f268847a;
                        float fB110 = s1Var110.b();
                        androidx.compose.ui.text.y3 y3VarE110 = la0.e(s1Var110.d(), c0VarR, 6);
                        d0.r1 r1Var110 = d0.r1.f268773a;
                        int i211117 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI110, fB110, y3VarE110, la0.e(r1Var110.e(), c0VarR, 6), f28534j, f28533i, s1Var110.c(), r1Var110.b(), f28535k, f28525a, r1Var110.d(), f28526b, voVar112, a0Var113, z1116, function5, i211116, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i211117) | (i211117 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar112;
                        a0Var3 = a0Var113;
                        z16 = z1116;
                        i23 = i211116;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var114 = a0Var2;
                    boolean z1117 = z14;
                    int i211118 = iD;
                    vo voVar113 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI111 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var111 = d0.s1.f268847a;
                    float fB111 = s1Var111.b();
                    androidx.compose.ui.text.y3 y3VarE111 = la0.e(s1Var111.d(), c0VarR, 6);
                    d0.r1 r1Var111 = d0.r1.f268773a;
                    int i211119 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI111, fB111, y3VarE111, la0.e(r1Var111.e(), c0VarR, 6), f28534j, f28533i, s1Var111.c(), r1Var111.b(), f28535k, f28525a, r1Var111.d(), f28526b, voVar113, a0Var114, z1117, function5, i211118, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i211119) | (i211119 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar113;
                    a0Var3 = a0Var114;
                    z16 = z1117;
                    i23 = i211118;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            a0Var2 = a0Var;
            i18 = i12 & 64;
            if (i18 != 0) {
                if ((1572864 & i11) == 0) {
                    z14 = z12;
                    if (c0VarR.G(z14)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        iD = i10;
                        if (c0VarR.K(iD)) {
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                if ((100663296 & i11) == 0) {
                    if ((i12 & 256) == 0) {
                        voVarA = voVar;
                        if (c0VarR.D(voVarA)) {
                            i26 = 67108864;
                        }
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var115 = a0Var2;
                        boolean z1118 = z14;
                        int i2111110 = iD;
                        vo voVar114 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI112 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var112 = d0.s1.f268847a;
                        float fB112 = s1Var112.b();
                        androidx.compose.ui.text.y3 y3VarE112 = la0.e(s1Var112.d(), c0VarR, 6);
                        d0.r1 r1Var112 = d0.r1.f268773a;
                        int i2111111 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI112, fB112, y3VarE112, la0.e(r1Var112.e(), c0VarR, 6), f28534j, f28533i, s1Var112.c(), r1Var112.b(), f28535k, f28525a, r1Var112.d(), f28526b, voVar114, a0Var115, z1118, function5, i2111110, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2111111) | (i2111111 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar114;
                        a0Var3 = a0Var115;
                        z16 = z1118;
                        i23 = i2111110;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var116 = a0Var2;
                    boolean z1119 = z14;
                    int i2111112 = iD;
                    vo voVar115 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI113 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var113 = d0.s1.f268847a;
                    float fB113 = s1Var113.b();
                    androidx.compose.ui.text.y3 y3VarE113 = la0.e(s1Var113.d(), c0VarR, 6);
                    d0.r1 r1Var113 = d0.r1.f268773a;
                    int i2111113 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI113, fB113, y3VarE113, la0.e(r1Var113.e(), c0VarR, 6), f28534j, f28533i, s1Var113.c(), r1Var113.b(), f28535k, f28525a, r1Var113.d(), f28526b, voVar115, a0Var116, z1119, function5, i2111112, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2111113) | (i2111113 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar115;
                    a0Var3 = a0Var116;
                    z16 = z1119;
                    i23 = i2111112;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            z14 = z12;
            if ((12582912 & i11) == 0) {
                if ((i12 & 128) == 0) {
                    iD = i10;
                    if (c0VarR.K(iD)) {
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                i13 |= i27;
            } else {
                iD = i10;
            }
            if ((100663296 & i11) == 0) {
                if ((i12 & 256) == 0) {
                    voVarA = voVar;
                    if (c0VarR.D(voVarA)) {
                        i26 = 67108864;
                    }
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i26 = com.google.api.client.googleapis.media.a.f115410j;
                i13 |= i26;
            } else {
                voVarA = voVar;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var117 = a0Var2;
                    boolean z11110 = z14;
                    int i2111114 = iD;
                    vo voVar116 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI114 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var114 = d0.s1.f268847a;
                    float fB114 = s1Var114.b();
                    androidx.compose.ui.text.y3 y3VarE114 = la0.e(s1Var114.d(), c0VarR, 6);
                    d0.r1 r1Var114 = d0.r1.f268773a;
                    int i2111115 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI114, fB114, y3VarE114, la0.e(r1Var114.e(), c0VarR, 6), f28534j, f28533i, s1Var114.c(), r1Var114.b(), f28535k, f28525a, r1Var114.d(), f28526b, voVar116, a0Var117, z11110, function5, i2111114, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2111115) | (i2111115 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar116;
                    a0Var3 = a0Var117;
                    z16 = z11110;
                    i23 = i2111114;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i22 = i13;
            if ((i13 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i22 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                androidx.compose.ui.a0 a0Var118 = a0Var2;
                boolean z11111 = z14;
                int i2111116 = iD;
                vo voVar117 = voVarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1539072909);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(227446500);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                androidx.compose.ui.graphics.q3 q3VarI115 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                d0.s1 s1Var115 = d0.s1.f268847a;
                float fB115 = s1Var115.b();
                androidx.compose.ui.text.y3 y3VarE115 = la0.e(s1Var115.d(), c0VarR, 6);
                d0.r1 r1Var115 = d0.r1.f268773a;
                int i2111117 = i25 << 3;
                c0Var2 = c0VarR;
                qp.t(z13, function1, function4, q3VarI115, fB115, y3VarE115, la0.e(r1Var115.e(), c0VarR, 6), f28534j, f28533i, s1Var115.c(), r1Var115.b(), f28535k, f28525a, r1Var115.d(), f28526b, voVar117, a0Var118, z11111, function5, i2111116, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2111117) | (i2111117 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar3;
                voVar2 = voVar117;
                a0Var3 = a0Var118;
                z16 = z11111;
                i23 = i2111116;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z16 = z14;
                i23 = iD;
                voVar2 = voVarA;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        function5 = function3;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (c0VarR.G(z11)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((196608 & i11) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                if ((1572864 & i11) == 0) {
                    z14 = z12;
                    if (c0VarR.G(z14)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        iD = i10;
                        if (c0VarR.K(iD)) {
                        }
                        i13 |= i27;
                    } else {
                        iD = i10;
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                if ((100663296 & i11) == 0) {
                    if ((i12 & 256) == 0) {
                        voVarA = voVar;
                        if (c0VarR.D(voVarA)) {
                            i26 = 67108864;
                        }
                        i13 |= i26;
                    } else {
                        voVarA = voVar;
                    }
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    i22 = i13;
                    if ((i13 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i22 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if ((i12 & 128) != 0) {
                                i24 = i22 & (-29360129);
                                iD = sa0.f32881a.d(z11);
                            } else {
                                i24 = i22;
                            }
                            if ((i12 & 256) != 0) {
                                i24 &= -234881025;
                                voVarA = sa0.f32881a.a(c0VarR, 6);
                            }
                            i25 = i24;
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        androidx.compose.ui.a0 a0Var119 = a0Var2;
                        boolean z11112 = z14;
                        int i2111118 = iD;
                        vo voVar118 = voVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1539072909);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(227446500);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        androidx.compose.ui.graphics.q3 q3VarI116 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        d0.s1 s1Var116 = d0.s1.f268847a;
                        float fB116 = s1Var116.b();
                        androidx.compose.ui.text.y3 y3VarE116 = la0.e(s1Var116.d(), c0VarR, 6);
                        d0.r1 r1Var116 = d0.r1.f268773a;
                        int i2111119 = i25 << 3;
                        c0Var2 = c0VarR;
                        qp.t(z13, function1, function4, q3VarI116, fB116, y3VarE116, la0.e(r1Var116.e(), c0VarR, 6), f28534j, f28533i, s1Var116.c(), r1Var116.b(), f28535k, f28525a, r1Var116.d(), f28526b, voVar118, a0Var119, z11112, function5, i2111118, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i2111119) | (i2111119 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar118;
                        a0Var3 = a0Var119;
                        z16 = z11112;
                        i23 = i2111118;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z16 = z14;
                        i23 = iD;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var1110 = a0Var2;
                    boolean z11113 = z14;
                    int i21111110 = iD;
                    vo voVar119 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI117 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var117 = d0.s1.f268847a;
                    float fB117 = s1Var117.b();
                    androidx.compose.ui.text.y3 y3VarE117 = la0.e(s1Var117.d(), c0VarR, 6);
                    d0.r1 r1Var117 = d0.r1.f268773a;
                    int i21111111 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI117, fB117, y3VarE117, la0.e(r1Var117.e(), c0VarR, 6), f28534j, f28533i, s1Var117.c(), r1Var117.b(), f28535k, f28525a, r1Var117.d(), f28526b, voVar119, a0Var1110, z11113, function5, i21111110, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21111111) | (i21111111 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar119;
                    a0Var3 = a0Var1110;
                    z16 = z11113;
                    i23 = i21111110;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            z14 = z12;
            if ((12582912 & i11) == 0) {
                if ((i12 & 128) == 0) {
                    iD = i10;
                    if (c0VarR.K(iD)) {
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                i13 |= i27;
            } else {
                iD = i10;
            }
            if ((100663296 & i11) == 0) {
                if ((i12 & 256) == 0) {
                    voVarA = voVar;
                    if (c0VarR.D(voVarA)) {
                        i26 = 67108864;
                    }
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i26 = com.google.api.client.googleapis.media.a.f115410j;
                i13 |= i26;
            } else {
                voVarA = voVar;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var1111 = a0Var2;
                    boolean z11114 = z14;
                    int i21111112 = iD;
                    vo voVar1110 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI118 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var118 = d0.s1.f268847a;
                    float fB118 = s1Var118.b();
                    androidx.compose.ui.text.y3 y3VarE118 = la0.e(s1Var118.d(), c0VarR, 6);
                    d0.r1 r1Var118 = d0.r1.f268773a;
                    int i21111113 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI118, fB118, y3VarE118, la0.e(r1Var118.e(), c0VarR, 6), f28534j, f28533i, s1Var118.c(), r1Var118.b(), f28535k, f28525a, r1Var118.d(), f28526b, voVar1110, a0Var1111, z11114, function5, i21111112, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21111113) | (i21111113 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar1110;
                    a0Var3 = a0Var1111;
                    z16 = z11114;
                    i23 = i21111112;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i22 = i13;
            if ((i13 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i22 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                androidx.compose.ui.a0 a0Var1112 = a0Var2;
                boolean z11115 = z14;
                int i21111114 = iD;
                vo voVar1111 = voVarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1539072909);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(227446500);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                androidx.compose.ui.graphics.q3 q3VarI119 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                d0.s1 s1Var119 = d0.s1.f268847a;
                float fB119 = s1Var119.b();
                androidx.compose.ui.text.y3 y3VarE119 = la0.e(s1Var119.d(), c0VarR, 6);
                d0.r1 r1Var119 = d0.r1.f268773a;
                int i21111115 = i25 << 3;
                c0Var2 = c0VarR;
                qp.t(z13, function1, function4, q3VarI119, fB119, y3VarE119, la0.e(r1Var119.e(), c0VarR, 6), f28534j, f28533i, s1Var119.c(), r1Var119.b(), f28535k, f28525a, r1Var119.d(), f28526b, voVar1111, a0Var1112, z11115, function5, i21111114, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21111115) | (i21111115 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar3;
                voVar2 = voVar1111;
                a0Var3 = a0Var1112;
                z16 = z11115;
                i23 = i21111114;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z16 = z14;
                i23 = iD;
                voVar2 = voVarA;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        a0Var2 = a0Var;
        i18 = i12 & 64;
        if (i18 != 0) {
            if ((1572864 & i11) == 0) {
                z14 = z12;
                if (c0VarR.G(z14)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((12582912 & i11) == 0) {
                if ((i12 & 128) == 0) {
                    iD = i10;
                    if (c0VarR.K(iD)) {
                    }
                    i13 |= i27;
                } else {
                    iD = i10;
                }
                i13 |= i27;
            } else {
                iD = i10;
            }
            if ((100663296 & i11) == 0) {
                if ((i12 & 256) == 0) {
                    voVarA = voVar;
                    if (c0VarR.D(voVarA)) {
                        i26 = 67108864;
                    }
                    i13 |= i26;
                } else {
                    voVarA = voVar;
                }
                i26 = com.google.api.client.googleapis.media.a.f115410j;
                i13 |= i26;
            } else {
                voVarA = voVar;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                i22 = i13;
                if ((i13 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i22 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if ((i12 & 128) != 0) {
                            i24 = i22 & (-29360129);
                            iD = sa0.f32881a.d(z11);
                        } else {
                            i24 = i22;
                        }
                        if ((i12 & 256) != 0) {
                            i24 &= -234881025;
                            voVarA = sa0.f32881a.a(c0VarR, 6);
                        }
                        i25 = i24;
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    androidx.compose.ui.a0 a0Var1113 = a0Var2;
                    boolean z11116 = z14;
                    int i21111116 = iD;
                    vo voVar1112 = voVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1539072909);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(227446500);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    androidx.compose.ui.graphics.q3 q3VarI1110 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    d0.s1 s1Var1110 = d0.s1.f268847a;
                    float fB1110 = s1Var1110.b();
                    androidx.compose.ui.text.y3 y3VarE1110 = la0.e(s1Var1110.d(), c0VarR, 6);
                    d0.r1 r1Var1110 = d0.r1.f268773a;
                    int i21111117 = i25 << 3;
                    c0Var2 = c0VarR;
                    qp.t(z13, function1, function4, q3VarI1110, fB1110, y3VarE1110, la0.e(r1Var1110.e(), c0VarR, 6), f28534j, f28533i, s1Var1110.c(), r1Var1110.b(), f28535k, f28525a, r1Var1110.d(), f28526b, voVar1112, a0Var1113, z11116, function5, i21111116, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21111117) | (i21111117 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar1112;
                    a0Var3 = a0Var1113;
                    z16 = z11116;
                    i23 = i21111116;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z16 = z14;
                    i23 = iD;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i22 = i13;
            if ((i13 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i22 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                androidx.compose.ui.a0 a0Var1114 = a0Var2;
                boolean z11117 = z14;
                int i21111118 = iD;
                vo voVar1113 = voVarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1539072909);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(227446500);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                androidx.compose.ui.graphics.q3 q3VarI1111 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                d0.s1 s1Var1111 = d0.s1.f268847a;
                float fB1111 = s1Var1111.b();
                androidx.compose.ui.text.y3 y3VarE1111 = la0.e(s1Var1111.d(), c0VarR, 6);
                d0.r1 r1Var1111 = d0.r1.f268773a;
                int i21111119 = i25 << 3;
                c0Var2 = c0VarR;
                qp.t(z13, function1, function4, q3VarI1111, fB1111, y3VarE1111, la0.e(r1Var1111.e(), c0VarR, 6), f28534j, f28533i, s1Var1111.c(), r1Var1111.b(), f28535k, f28525a, r1Var1111.d(), f28526b, voVar1113, a0Var1114, z11117, function5, i21111118, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i21111119) | (i21111119 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar3;
                voVar2 = voVar1113;
                a0Var3 = a0Var1114;
                z16 = z11117;
                i23 = i21111118;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z16 = z14;
                i23 = iD;
                voVar2 = voVarA;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 1572864;
        z14 = z12;
        if ((12582912 & i11) == 0) {
            if ((i12 & 128) == 0) {
                iD = i10;
                if (c0VarR.K(iD)) {
                }
                i13 |= i27;
            } else {
                iD = i10;
            }
            i13 |= i27;
        } else {
            iD = i10;
        }
        if ((100663296 & i11) == 0) {
            if ((i12 & 256) == 0) {
                voVarA = voVar;
                if (c0VarR.D(voVarA)) {
                    i26 = 67108864;
                }
                i13 |= i26;
            } else {
                voVarA = voVar;
            }
            i26 = com.google.api.client.googleapis.media.a.f115410j;
            i13 |= i26;
        } else {
            voVarA = voVar;
        }
        i20 = i12 & 512;
        if (i20 != 0) {
            if ((i11 & 805306368) == 0) {
                if (c0VarR.D(jVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            i22 = i13;
            if ((i13 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i22 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if ((i12 & 128) != 0) {
                        i24 = i22 & (-29360129);
                        iD = sa0.f32881a.d(z11);
                    } else {
                        i24 = i22;
                    }
                    if ((i12 & 256) != 0) {
                        i24 &= -234881025;
                        voVarA = sa0.f32881a.a(c0VarR, 6);
                    }
                    i25 = i24;
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                androidx.compose.ui.a0 a0Var1115 = a0Var2;
                boolean z11118 = z14;
                int i211111110 = iD;
                vo voVar1114 = voVarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1539072909);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(227446500);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                androidx.compose.ui.graphics.q3 q3VarI1112 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                d0.s1 s1Var1112 = d0.s1.f268847a;
                float fB1112 = s1Var1112.b();
                androidx.compose.ui.text.y3 y3VarE1112 = la0.e(s1Var1112.d(), c0VarR, 6);
                d0.r1 r1Var1112 = d0.r1.f268773a;
                int i211111111 = i25 << 3;
                c0Var2 = c0VarR;
                qp.t(z13, function1, function4, q3VarI1112, fB1112, y3VarE1112, la0.e(r1Var1112.e(), c0VarR, 6), f28534j, f28533i, s1Var1112.c(), r1Var1112.b(), f28535k, f28525a, r1Var1112.d(), f28526b, voVar1114, a0Var1115, z11118, function5, i211111110, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i211111111) | (i211111111 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar3;
                voVar2 = voVar1114;
                a0Var3 = a0Var1115;
                z16 = z11118;
                i23 = i211111110;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z16 = z14;
                i23 = iD;
                voVar2 = voVarA;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        i22 = i13;
        if ((i13 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c0VarR.h(z15, i22 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i18 != 0) {
                    z14 = true;
                }
                if ((i12 & 128) != 0) {
                    i24 = i22 & (-29360129);
                    iD = sa0.f32881a.d(z11);
                } else {
                    i24 = i22;
                }
                if ((i12 & 256) != 0) {
                    i24 &= -234881025;
                    voVarA = sa0.f32881a.a(c0VarR, 6);
                }
                i25 = i24;
                if (i20 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
            } else {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i18 != 0) {
                    z14 = true;
                }
                if ((i12 & 128) != 0) {
                    i24 = i22 & (-29360129);
                    iD = sa0.f32881a.d(z11);
                } else {
                    i24 = i22;
                }
                if ((i12 & 256) != 0) {
                    i24 &= -234881025;
                    voVarA = sa0.f32881a.a(c0VarR, 6);
                }
                i25 = i24;
                if (i20 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
            }
            androidx.compose.ui.a0 a0Var1116 = a0Var2;
            boolean z11119 = z14;
            int i211111112 = iD;
            vo voVar1115 = voVarA;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1894733304, i25, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:688)");
            }
            if (jVar3 == null) {
                c0VarR.E(-1539072909);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
            } else {
                c0VarR.E(227446500);
                c0VarR.A();
                jVar4 = jVar3;
            }
            androidx.compose.ui.graphics.q3 q3VarI1113 = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
            d0.s1 s1Var1113 = d0.s1.f268847a;
            float fB1113 = s1Var1113.b();
            androidx.compose.ui.text.y3 y3VarE1113 = la0.e(s1Var1113.d(), c0VarR, 6);
            d0.r1 r1Var1113 = d0.r1.f268773a;
            int i211111113 = i25 << 3;
            c0Var2 = c0VarR;
            qp.t(z13, function1, function4, q3VarI1113, fB1113, y3VarE1113, la0.e(r1Var1113.e(), c0VarR, 6), f28534j, f28533i, s1Var1113.c(), r1Var1113.b(), f28535k, f28525a, r1Var1113.d(), f28526b, voVar1115, a0Var1116, z11119, function5, i211111112, jVar4, c0Var2, (i25 & 14) | 918577152 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896), ((i25 >> 9) & 458752) | 28086 | (3670016 & i211111113) | (i211111113 & 29360128) | ((i25 << 15) & 234881024) | ((i25 << 6) & 1879048192), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            jVar2 = jVar3;
            voVar2 = voVar1115;
            a0Var3 = a0Var1116;
            z16 = z11119;
            i23 = i211111112;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z16 = z14;
            i23 = iD;
            voVar2 = voVarA;
            jVar2 = jVar;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ta0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ib0.K(z10, function0, function2, function3, z11, a0Var3, z16, i23, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(boolean z10, Function0 function0, Function2 function2, Function2 function3, boolean z11, androidx.compose.ui.a0 a0Var, boolean z12, int i10, vo voVar, androidx.compose.foundation.interaction.j jVar, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        J(z10, function0, function2, function3, z11, a0Var, z12, i10, voVar, jVar, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void L(final androidx.compose.ui.a0 a0Var, final boolean z10, final boolean z11, final qa0 qa0Var, final androidx.compose.ui.graphics.q3 q3Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final androidx.compose.foundation.layout.v6 v6Var, final androidx.compose.foundation.layout.q.m mVar, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        qa0 qa0Var2;
        float fO;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1004308036);
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
            qa0Var2 = qa0Var;
            i11 |= c0VarR.D(qa0Var2) ? 2048 : 1024;
        } else {
            qa0Var2 = qa0Var;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(q3Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(function2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.D(v6Var) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= c0VarR.D(mVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c0VarR.k0(function3) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if (c0VarR.h((38347923 & i11) != 38347922, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1004308036, i11, -1, "androidx.compose.material3.WideNavigationRailLayout (WideNavigationRail.kt:218)");
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.e6.b(0);
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.l3 l3Var = (androidx.compose.runtime.l3) objI0;
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.e6.b(0);
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.l3 l3Var2 = (androidx.compose.runtime.l3) objI1;
            if (androidx.compose.ui.unit.h.x(((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O(), androidx.compose.ui.unit.h.f42689b.e())) {
                c0VarR.E(-597966102);
                c0VarR.A();
                fO = androidx.compose.ui.unit.h.r(0);
            } else {
                c0VarR.E(-597931134);
                fO = ((androidx.compose.ui.unit.h) c0VarR.W(wi.g())).O();
                c0VarR.A();
            }
            float f10 = fO;
            androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.DefaultSpatial, c0VarR, 6);
            androidx.compose.animation.core.y0 y0VarB2 = hm.b(d0.h1.FastSpatial, c0VarR, 6);
            int i12 = i11;
            u10.c(a0Var, q3Var, !z10 ? qa0Var2.c() : qa0Var2.e(), !z10 ? qa0Var2.d() : qa0Var2.f(), 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-1489314345, true, new e(v6Var, function2, z11, androidx.compose.animation.core.f.d(!z11 ? f28529e : f28530f, !z10 ? y0VarB : y0VarB2, null, null, c0VarR, 0, 12), f10, androidx.compose.animation.core.f.d(!z11 ? f28532h : f10, y0VarB, null, null, c0VarR, 0, 12), androidx.compose.animation.core.f.d(!z11 ? f28529e : f28531g, !z10 ? y0VarB : y0VarB2, null, null, c0VarR, 0, 12), l3Var2, l3Var, mVar, androidx.compose.animation.core.f.d(!z11 ? d0.o1.f268586a.e() : androidx.compose.ui.unit.h.r(0), y0VarB, null, null, c0VarR, 0, 12), function3), c0VarR, 54), c0VarR, (i12 & 14) | 12582912 | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B), com.planner5d.library.engine.input.f.b.B);
            c0VarR = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.bb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ib0.O(a0Var, z10, z11, qa0Var, q3Var, function2, v6Var, mVar, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float M(androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var) {
        return n7Var.getValue().O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float N(androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var) {
        return n7Var.getValue().O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, qa0 qa0Var, androidx.compose.ui.graphics.q3 q3Var, Function2 function2, androidx.compose.foundation.layout.v6 v6Var, androidx.compose.foundation.layout.q.m mVar, Function2 function3, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        L(a0Var, z10, z11, qa0Var, q3Var, function2, v6Var, mVar, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(androidx.compose.runtime.l3 l3Var) {
        return l3Var.m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(androidx.compose.runtime.l3 l3Var, int i10) {
        l3Var.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int R(androidx.compose.runtime.l3 l3Var) {
        return l3Var.m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(androidx.compose.runtime.l3 l3Var, int i10) {
        l3Var.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float T(androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var) {
        return n7Var.getValue().O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float U(androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var) {
        return n7Var.getValue().O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yl p() {
        return zb.f35075a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ob0 q() {
        return bd.f26280a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float q0(androidx.compose.ui.graphics.r1 r1Var, float f10, boolean z10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r1Var.d() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return (((z10 ? 1.0f : -1.0f) * androidx.compose.ui.util.e.r(0.0f, Math.min(r1Var.S7(f28536l), fIntBitsToFloat), f10)) / fIntBitsToFloat) + 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:109:0x0138  */
    /* JADX WARN: Code duplicated, block: B:112:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x0149  */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:123:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0170  */
    /* JADX WARN: Code duplicated, block: B:127:0x0174  */
    /* JADX WARN: Code duplicated, block: B:129:0x017c  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0184  */
    /* JADX WARN: Code duplicated, block: B:139:0x019d  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:166:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x020c  */
    /* JADX WARN: Code duplicated, block: B:168:0x020f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0214  */
    /* JADX WARN: Code duplicated, block: B:172:0x021f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0227  */
    /* JADX WARN: Code duplicated, block: B:177:0x022d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0236  */
    /* JADX WARN: Code duplicated, block: B:181:0x023c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0245  */
    /* JADX WARN: Code duplicated, block: B:185:0x024a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0255  */
    /* JADX WARN: Code duplicated, block: B:188:0x0259  */
    /* JADX WARN: Code duplicated, block: B:190:0x025c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0263  */
    /* JADX WARN: Code duplicated, block: B:194:0x0268  */
    /* JADX WARN: Code duplicated, block: B:195:0x0273  */
    /* JADX WARN: Code duplicated, block: B:198:0x027b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0286  */
    /* JADX WARN: Code duplicated, block: B:201:0x028c  */
    /* JADX WARN: Code duplicated, block: B:202:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:205:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:210:0x0316  */
    /* JADX WARN: Code duplicated, block: B:213:0x0335  */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    @androidx.compose.runtime.o
    public static final void r(@Nullable androidx.compose.ui.a0 a0Var, @Nullable qb0 qb0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable androidx.compose.ui.graphics.q3 q3Var2, @Nullable qa0 qa0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, float f10, @Nullable androidx.compose.foundation.layout.v6 v6Var, @Nullable androidx.compose.foundation.layout.q.m mVar, @Nullable am amVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        androidx.compose.ui.graphics.q3 q3Var3;
        androidx.compose.ui.graphics.q3 q3Var4;
        int i14;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i15;
        int i16;
        float f11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z12;
        final androidx.compose.foundation.layout.v6 v6Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final androidx.compose.ui.a0 a0Var3;
        final float f12;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var5;
        final androidx.compose.ui.graphics.q3 q3Var6;
        final qb0 qb0Var2;
        final qa0 qa0Var2;
        final androidx.compose.foundation.layout.q.m mVar2;
        final am amVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        qb0 qb0VarD;
        androidx.compose.ui.graphics.q3 q3VarF;
        androidx.compose.ui.graphics.q3 q3VarI;
        qa0 qa0VarA;
        float fR;
        androidx.compose.foundation.layout.v6 v6VarK;
        androidx.compose.foundation.layout.q.m mVarC;
        am amVarH;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.ui.graphics.q3 q3Var7;
        qb0 qb0Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        androidx.compose.foundation.layout.v6 v6Var3;
        androidx.compose.ui.graphics.q3 q3Var8;
        float f13;
        androidx.compose.foundation.layout.q.m mVar3;
        boolean z14;
        qa0 qa0Var3;
        int i23;
        int i24;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-38559147);
        int i25 = i12 & 1;
        if (i25 != 0) {
            i13 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i12 & 2) != 0) {
                i24 = 16;
            } else {
                if ((i10 & 64) == 0 ? c0VarR.D(qb0Var) : c0VarR.k0(qb0Var)) {
                    i24 = 32;
                } else {
                    i24 = 16;
                }
            }
            i13 |= i24;
        }
        int i26 = i12 & 4;
        if (i26 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                i13 |= c0VarR.G(z11) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    q3Var3 = q3Var;
                    int i27 = c0VarR.D(q3Var3) ? 2048 : 1024;
                    i13 |= i27;
                } else {
                    q3Var3 = q3Var;
                }
                i13 |= i27;
            } else {
                q3Var3 = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    q3Var4 = q3Var2;
                    int i28 = c0VarR.D(q3Var4) ? 16384 : 8192;
                    i13 |= i28;
                } else {
                    q3Var4 = q3Var2;
                }
                i13 |= i28;
            } else {
                q3Var4 = q3Var2;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32) == 0 || !c0VarR.D(qa0Var)) {
                    i23 = 65536;
                } else {
                    i23 = 131072;
                }
                i13 |= i23;
            }
            i14 = i12 & 64;
            if (i14 != 0) {
                i13 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function4)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i13 |= i15;
                }
            }
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
                f11 = f10;
            } else {
                f11 = f10;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f11)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
            }
            if ((i10 & 100663296) != 0) {
                i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            if ((i10 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !c0VarR.D(mVar)) ? 268435456 : 536870912;
            }
            i18 = i12 & 1024;
            if (i18 != 0) {
                i19 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.D(amVar)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i11 | i20;
            } else {
                i19 = i11;
            }
            if ((i12 & 2048) != 0) {
                i19 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.k0(function3)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i19 |= i21;
            }
            i22 = i19;
            if ((i13 & 306783379) == 306783378 || (i22 & 19) != 18) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        qb0VarD = wb0.d(null, c0VarR, 0, 1);
                        i13 &= -113;
                    } else {
                        qb0VarD = qb0Var;
                    }
                    if (i26 != 0) {
                        z11 = false;
                    }
                    if ((i12 & 8) != 0) {
                        q3VarF = ra0.f32505a.f(c0VarR, 6);
                        i13 &= -7169;
                    } else {
                        q3VarF = q3Var3;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarI = ra0.f32505a.i(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        q3VarI = q3Var4;
                    }
                    if ((i12 & 32) != 0) {
                        qa0VarA = ra0.f32505a.a(c0VarR, 6);
                        i13 &= -458753;
                    } else {
                        qa0VarA = qa0Var;
                    }
                    if (i14 != 0) {
                        function4 = null;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarK = ra0.f32505a.k(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarK = v6Var;
                    }
                    if ((i12 & 512) != 0) {
                        mVarC = ra0.f32505a.c();
                        i13 &= -1879048193;
                    } else {
                        mVarC = mVar;
                    }
                    if (i18 != 0) {
                        a0Var5 = a0Var4;
                        q3Var7 = q3VarF;
                        qb0Var3 = qb0VarD;
                        function6 = function4;
                        v6Var3 = v6VarK;
                        q3Var8 = q3VarI;
                        f13 = fR;
                        mVar3 = mVarC;
                        z14 = z11;
                        qa0Var3 = qa0VarA;
                        amVarH = ra0.f32505a.h();
                    } else {
                        amVarH = amVar;
                        a0Var5 = a0Var4;
                        q3Var7 = q3VarF;
                        qb0Var3 = qb0VarD;
                        function6 = function4;
                        v6Var3 = v6VarK;
                        q3Var8 = q3VarI;
                        f13 = fR;
                        mVar3 = mVarC;
                        z14 = z11;
                        qa0Var3 = qa0VarA;
                    }
                } else {
                    c0VarR.u();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                    }
                    if ((i12 & 256) != 0) {
                        i13 &= -234881025;
                    }
                    if ((i12 & 512) != 0) {
                        i13 &= -1879048193;
                    }
                    qb0Var3 = qb0Var;
                    qa0Var3 = qa0Var;
                    v6Var3 = v6Var;
                    mVar3 = mVar;
                    amVarH = amVar;
                    function6 = function4;
                    a0Var5 = a0Var2;
                    f13 = f11;
                    z14 = z11;
                    q3Var7 = q3Var3;
                    q3Var8 = q3Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-38559147, i13, i22, "androidx.compose.material3.ModalWideNavigationRail (WideNavigationRail.kt:477)");
                }
                ((yl) c0VarR.W(f28541q)).a(new zl(a0Var5, qb0Var3, z14, q3Var7, q3Var8, qa0Var3, function6, f13, v6Var3, mVar3, amVarH, function3, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                qb0Var2 = qb0Var3;
                z13 = z14;
                q3Var5 = q3Var7;
                q3Var6 = q3Var8;
                qa0Var2 = qa0Var3;
                function5 = function6;
                f12 = f13;
                v6Var2 = v6Var3;
                mVar2 = mVar3;
                amVar2 = amVarH;
            } else {
                c0VarR.u();
                v6Var2 = v6Var;
                function5 = function4;
                a0Var3 = a0Var2;
                f12 = f11;
                z13 = z11;
                q3Var5 = q3Var3;
                q3Var6 = q3Var4;
                qb0Var2 = qb0Var;
                qa0Var2 = qa0Var;
                mVar2 = mVar;
                amVar2 = amVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ab0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ib0.y(a0Var3, qb0Var2, z13, q3Var5, q3Var6, qa0Var2, function5, f12, v6Var2, mVar2, amVar2, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                q3Var3 = q3Var;
                if (c0VarR.D(q3Var3)) {
                }
                i13 |= i27;
            } else {
                q3Var3 = q3Var;
            }
            i13 |= i27;
        } else {
            q3Var3 = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                q3Var4 = q3Var2;
                if (c0VarR.D(q3Var4)) {
                }
                i13 |= i28;
            } else {
                q3Var4 = q3Var2;
            }
            i13 |= i28;
        } else {
            q3Var4 = q3Var2;
        }
        if ((i10 & androidx.profileinstaller.n.c.f73814m) != 0) {
            if ((i12 & 32) == 0) {
                i23 = 65536;
            } else {
                i23 = 65536;
            }
            i13 |= i23;
        }
        i14 = i12 & 64;
        if (i14 != 0) {
            i13 |= 1572864;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function4)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
        }
        i16 = i12 & 128;
        if (i16 != 0) {
            i13 |= 12582912;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
        }
        if ((i10 & 100663296) != 0) {
            i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
        }
        if ((i10 & 805306368) != 0) {
            i13 |= ((i12 & 512) == 0 || !c0VarR.D(mVar)) ? 268435456 : 536870912;
        }
        i18 = i12 & 1024;
        if (i18 != 0) {
            i19 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.D(amVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i19 = i11 | i20;
        } else {
            i19 = i11;
        }
        if ((i12 & 2048) != 0) {
            i19 |= 48;
        } else if ((i11 & 48) != 0) {
            if (c0VarR.k0(function3)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i19 |= i21;
        }
        i22 = i19;
        if ((i13 & 306783379) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (c0VarR.h(z12, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    qb0VarD = wb0.d(null, c0VarR, 0, 1);
                    i13 &= -113;
                } else {
                    qb0VarD = qb0Var;
                }
                if (i26 != 0) {
                    z11 = false;
                }
                if ((i12 & 8) != 0) {
                    q3VarF = ra0.f32505a.f(c0VarR, 6);
                    i13 &= -7169;
                } else {
                    q3VarF = q3Var3;
                }
                if ((i12 & 16) != 0) {
                    q3VarI = ra0.f32505a.i(c0VarR, 6);
                    i13 &= -57345;
                } else {
                    q3VarI = q3Var4;
                }
                if ((i12 & 32) != 0) {
                    qa0VarA = ra0.f32505a.a(c0VarR, 6);
                    i13 &= -458753;
                } else {
                    qa0VarA = qa0Var;
                }
                if (i14 != 0) {
                    function4 = null;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f11;
                }
                if ((i12 & 256) != 0) {
                    v6VarK = ra0.f32505a.k(c0VarR, 6);
                    i13 &= -234881025;
                } else {
                    v6VarK = v6Var;
                }
                if ((i12 & 512) != 0) {
                    mVarC = ra0.f32505a.c();
                    i13 &= -1879048193;
                } else {
                    mVarC = mVar;
                }
                if (i18 != 0) {
                    a0Var5 = a0Var4;
                    q3Var7 = q3VarF;
                    qb0Var3 = qb0VarD;
                    function6 = function4;
                    v6Var3 = v6VarK;
                    q3Var8 = q3VarI;
                    f13 = fR;
                    mVar3 = mVarC;
                    z14 = z11;
                    qa0Var3 = qa0VarA;
                    amVarH = ra0.f32505a.h();
                } else {
                    amVarH = amVar;
                    a0Var5 = a0Var4;
                    q3Var7 = q3VarF;
                    qb0Var3 = qb0VarD;
                    function6 = function4;
                    v6Var3 = v6VarK;
                    q3Var8 = q3VarI;
                    f13 = fR;
                    mVar3 = mVarC;
                    z14 = z11;
                    qa0Var3 = qa0VarA;
                }
            } else {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    qb0VarD = wb0.d(null, c0VarR, 0, 1);
                    i13 &= -113;
                } else {
                    qb0VarD = qb0Var;
                }
                if (i26 != 0) {
                    z11 = false;
                }
                if ((i12 & 8) != 0) {
                    q3VarF = ra0.f32505a.f(c0VarR, 6);
                    i13 &= -7169;
                } else {
                    q3VarF = q3Var3;
                }
                if ((i12 & 16) != 0) {
                    q3VarI = ra0.f32505a.i(c0VarR, 6);
                    i13 &= -57345;
                } else {
                    q3VarI = q3Var4;
                }
                if ((i12 & 32) != 0) {
                    qa0VarA = ra0.f32505a.a(c0VarR, 6);
                    i13 &= -458753;
                } else {
                    qa0VarA = qa0Var;
                }
                if (i14 != 0) {
                    function4 = null;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f11;
                }
                if ((i12 & 256) != 0) {
                    v6VarK = ra0.f32505a.k(c0VarR, 6);
                    i13 &= -234881025;
                } else {
                    v6VarK = v6Var;
                }
                if ((i12 & 512) != 0) {
                    mVarC = ra0.f32505a.c();
                    i13 &= -1879048193;
                } else {
                    mVarC = mVar;
                }
                if (i18 != 0) {
                    a0Var5 = a0Var4;
                    q3Var7 = q3VarF;
                    qb0Var3 = qb0VarD;
                    function6 = function4;
                    v6Var3 = v6VarK;
                    q3Var8 = q3VarI;
                    f13 = fR;
                    mVar3 = mVarC;
                    z14 = z11;
                    qa0Var3 = qa0VarA;
                    amVarH = ra0.f32505a.h();
                } else {
                    amVarH = amVar;
                    a0Var5 = a0Var4;
                    q3Var7 = q3VarF;
                    qb0Var3 = qb0VarD;
                    function6 = function4;
                    v6Var3 = v6VarK;
                    q3Var8 = q3VarI;
                    f13 = fR;
                    mVar3 = mVarC;
                    z14 = z11;
                    qa0Var3 = qa0VarA;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-38559147, i13, i22, "androidx.compose.material3.ModalWideNavigationRail (WideNavigationRail.kt:477)");
            }
            ((yl) c0VarR.W(f28541q)).a(new zl(a0Var5, qb0Var3, z14, q3Var7, q3Var8, qa0Var3, function6, f13, v6Var3, mVar3, amVarH, function3, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            qb0Var2 = qb0Var3;
            z13 = z14;
            q3Var5 = q3Var7;
            q3Var6 = q3Var8;
            qa0Var2 = qa0Var3;
            function5 = function6;
            f12 = f13;
            v6Var2 = v6Var3;
            mVar2 = mVar3;
            amVar2 = amVarH;
        } else {
            c0VarR.u();
            v6Var2 = v6Var;
            function5 = function4;
            a0Var3 = a0Var2;
            f12 = f11;
            z13 = z11;
            q3Var5 = q3Var3;
            q3Var6 = q3Var4;
            qb0Var2 = qb0Var;
            qa0Var2 = qa0Var;
            mVar2 = mVar;
            amVar2 = amVar;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ab0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ib0.y(a0Var3, qb0Var2, z13, q3Var5, q3Var6, qa0Var2, function5, f12, v6Var2, mVar2, amVar2, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float r0(androidx.compose.ui.graphics.r1 r1Var, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r1Var.d() & com.rabbitmq.client.k0.f265952a));
        if (!Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
            return 1.0f - (androidx.compose.ui.util.e.r(0.0f, Math.min(r1Var.S7(f28537m), fIntBitsToFloat), f10) / fIntBitsToFloat);
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void s(final boolean z10, final boolean z11, final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, final vs vsVar, final Function2<? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, final androidx.compose.ui.a0 a0Var, final fm fmVar, final qa0 qa0Var, final androidx.compose.ui.graphics.q3 q3Var, final float f10, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final androidx.compose.foundation.layout.v6 v6Var, final boolean z12, final androidx.compose.foundation.layout.q.m mVar, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        qa0 qa0Var2;
        int i13;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1593438005);
        if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z11) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= (i10 & 512) == 0 ? c0VarR.D(cVar) : c0VarR.k0(cVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0VarR.D(vsVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0VarR.k0(function2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0VarR.D(a0Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c0VarR.k0(fmVar) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            qa0Var2 = qa0Var;
            i12 |= c0VarR.D(qa0Var2) ? 8388608 : 4194304;
        } else {
            qa0Var2 = qa0Var;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0VarR.D(q3Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0VarR.I(f10) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0VarR.k0(function3) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0VarR.D(v6Var) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= c0VarR.G(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0VarR.D(mVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c0VarR.k0(function4) ? 16384 : 8192;
        }
        int i14 = i13;
        if (c0VarR.h(((i12 & 306783379) == 306783378 && (i14 & 9363) == 9362) ? false : true, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1593438005, i12, i14, "androidx.compose.material3.ModalWideNavigationRailContent (WideNavigationRail.kt:988)");
            }
            final boolean z13 = c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl;
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            final String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31853n0), c0VarR, 0);
            long jE = qa0Var2.e();
            long jF = qa0Var2.f();
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.layout.i6.d(androidx.compose.foundation.layout.i6.D(a0Var, 0.0f, f10, 1, null), 0.0f, 1, null);
            boolean zD = c0VarR.D(strB);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.gb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ib0.t(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarD, false, (Function1) objI0, 1, null);
            boolean zK0 = ((i12 & 896) == 256 || ((i12 & 512) != 0 && c0VarR.k0(cVar))) | c0VarR.k0(fmVar) | ((i12 & 7168) == 2048) | c0VarR.G(z13);
            Object objI1 = c0VarR.i0();
            if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.hb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ib0.u(cVar, fmVar, vsVar, z13, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.graphics.q1.a(a0VarF, (Function1) objI1);
            androidx.compose.material3.internal.d0<xb0> d0VarQ = fmVar.q();
            androidx.compose.foundation.gestures.q3 q3Var2 = androidx.compose.foundation.gestures.q3.Horizontal;
            boolean zG = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | c0VarR.G(z13) | c0VarR.k0(fmVar);
            Object objI2 = c0VarR.i0();
            if (zG || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function2() { // from class: androidx.compose.material3.ua0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ib0.v(z11, z13, fmVar, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarH = androidx.compose.material3.internal.t.h(a0VarA, d0VarQ, q3Var2, (Function2) objI2);
            androidx.compose.foundation.gestures.a3 a3VarA = fmVar.q().A();
            boolean zH = fmVar.q().H();
            boolean zK1 = c0VarR.k0(function2);
            Object objI3 = c0VarR.i0();
            if (zK1 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = new a(function2, null);
                c0VarR.Y(objI3);
            }
            c0Var2 = c0VarR;
            u10.c(androidx.compose.foundation.gestures.x2.i(a0VarH, a3VarA, q3Var2, z12, null, zH, null, (pj.n) objI3, false, 168, null), q3Var, jE, jF, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-1043835354, true, new b(cVar, vsVar, z13, z10, qa0Var2, q3Var, function3, v6Var, mVar, function4), c0Var2, 54), c0Var2, ((i12 >> 21) & com.planner5d.library.engine.input.f.b.B) | 12582912, com.planner5d.library.engine.input.f.b.B);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.va0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ib0.x(z10, z11, cVar, vsVar, function2, a0Var, fmVar, qa0Var, q3Var, f10, function3, v6Var, z12, mVar, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public static final androidx.compose.runtime.m4<yl> s0() {
        return f28541q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.G1(e0Var, str);
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<ob0> t0() {
        return f28540p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(androidx.compose.animation.core.c cVar, fm fmVar, vs vsVar, boolean z10, androidx.compose.ui.graphics.r1 r1Var) {
        float fFloatValue = ((Number) cVar.v()).floatValue();
        if (fFloatValue <= 0.0f) {
            return Unit.f312394a;
        }
        float fS = fmVar.s();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r1Var.d() >> 32));
        if (!Float.isNaN(fS) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
            r1Var.z(q0(r1Var, fFloatValue, vsVar.a()));
            r1Var.C(r0(r1Var, fFloatValue));
            r1Var.W1(androidx.compose.ui.graphics.a4.a(z10 ? 1.0f : 0.0f, 0.5f));
        }
        return Unit.f312394a;
    }

    public static final float u0() {
        return f28525a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair v(boolean z10, boolean z11, fm fmVar, androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.b bVar) {
        final float fQ = (int) (uVar.q() >> 32);
        final float f10 = 0.0f;
        if (!z10) {
            fQ = 0.0f;
        } else if (!z11) {
            fQ = -fQ;
        }
        return TuplesKt.to(androidx.compose.material3.internal.t.a(new Function1() { // from class: androidx.compose.material3.za0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ib0.w(fQ, f10, (androidx.compose.material3.internal.c2) obj);
            }
        }), fmVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(float f10, float f11, androidx.compose.material3.internal.c2 c2Var) {
        c2Var.a(xb0.Collapsed, f10);
        c2Var.a(xb0.Expanded, f11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(boolean z10, boolean z11, androidx.compose.animation.core.c cVar, vs vsVar, Function2 function2, androidx.compose.ui.a0 a0Var, fm fmVar, qa0 qa0Var, androidx.compose.ui.graphics.q3 q3Var, float f10, Function2 function3, androidx.compose.foundation.layout.v6 v6Var, boolean z12, androidx.compose.foundation.layout.q.m mVar, Function2 function4, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        s(z10, z11, cVar, vsVar, function2, a0Var, fmVar, qa0Var, q3Var, f10, function3, v6Var, z12, mVar, function4, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(androidx.compose.ui.a0 a0Var, qb0 qb0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.ui.graphics.q3 q3Var2, qa0 qa0Var, Function2 function2, float f10, androidx.compose.foundation.layout.v6 v6Var, androidx.compose.foundation.layout.q.m mVar, am amVar, Function2 function3, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        r(a0Var, qb0Var, z10, q3Var, q3Var2, qa0Var, function2, f10, v6Var, mVar, amVar, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void z(final long j10, final Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, final boolean z10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.ui.a0 a0VarE;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(144695261);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function1) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(144695261, i11, -1, "androidx.compose.material3.Scrim (WideNavigationRail.kt:1102)");
            }
            if (j10 != 16) {
                c0VarR.E(-1530482291);
                int i12 = i11;
                boolean z11 = true;
                final androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(z10 ? 1.0f : 0.0f, hm.b(d0.h1.DefaultEffects, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                Object objI0 = c0VarR.i0();
                androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI0;
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                final String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31851m0), c0VarR, 0);
                if (z10) {
                    c0VarR.E(-1530047423);
                    androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                    Object objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new d(n3Var);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarE2 = androidx.compose.ui.input.pointer.w0.e(aVar3, function1, (PointerInputEventHandler) objI1);
                    boolean zD = c0VarR.D(strB);
                    Object objI2 = c0VarR.i0();
                    if (zD || objI2 == aVar.a()) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.wa0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ib0.D(strB, n3Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    a0VarE = androidx.compose.ui.semantics.t.e(a0VarE2, true, (Function1) objI2);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1529667363);
                    c0VarR.A();
                    a0VarE = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null).B2(a0VarE);
                if ((i12 & 14) != 4) {
                    z11 = false;
                }
                boolean zD2 = z11 | c0VarR.D(n7VarF);
                Object objI3 = c0VarR.i0();
                if (zD2 || objI3 == aVar.a()) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.xa0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ib0.F(j10, n7VarF, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.foundation.f1.e(a0VarB2, (Function1) objI3, c0VarR, 0);
                Boolean boolValueOf = Boolean.valueOf(B(n3Var));
                boolean zK0 = c0VarR.k0(function1);
                Object objI4 = c0VarR.i0();
                if (zK0 || objI4 == aVar.a()) {
                    objI4 = new c(function1, n3Var, null);
                    c0VarR.Y(objI4);
                }
                androidx.compose.runtime.b2.i(boolValueOf, (Function2) objI4, c0VarR, 0);
                c0VarR.A();
            } else {
                c0VarR.E(-1529413659);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ib0.G(j10, function1, z10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
