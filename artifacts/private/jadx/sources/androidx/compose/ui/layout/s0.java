package androidx.compose.ui.layout;

import androidx.compose.runtime.a4;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.p5;
import androidx.compose.runtime.t5;
import androidx.compose.runtime.x3;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1351:1\n1184#1:1380\n1184#1:1391\n1184#1:1504\n1184#1:1509\n1184#1:1523\n1107#2:1352\n1085#2,2:1353\n57#3,4:1355\n66#3,4:1360\n103#3,4:1365\n103#3,4:1371\n103#3,4:1432\n103#3,4:1436\n103#3,4:1440\n57#3,4:1472\n57#3,4:1476\n103#3,4:1529\n683#4:1359\n683#4:1369\n842#4:1445\n844#4,4:1459\n848#4:1469\n683#4:1470\n1#5:1364\n1#5:1370\n1#5:1444\n1#5:1471\n1#5:1533\n604#6,5:1375\n610#6:1385\n604#6,5:1386\n610#6:1396\n604#6,7:1397\n604#6,5:1518\n610#6:1528\n1220#7,4:1381\n1220#7,4:1392\n1220#7,2:1404\n1222#7,2:1430\n1220#7,4:1505\n1220#7,4:1510\n1220#7,4:1514\n1220#7,4:1524\n372#8,3:1406\n329#8,6:1409\n339#8,3:1416\n342#8,9:1420\n375#8:1429\n329#8,6:1446\n339#8,3:1453\n342#8,2:1457\n345#8,6:1463\n372#8,3:1480\n329#8,6:1483\n339#8,3:1490\n342#8,9:1494\n375#8:1503\n1399#9:1415\n1270#9:1419\n1399#9:1452\n1270#9:1456\n1399#9:1489\n1270#9:1493\n35#10,5:1534\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n659#1:1380\n743#1:1391\n1176#1:1504\n1180#1:1509\n1190#1:1523\n544#1:1352\n544#1:1353,2\n573#1:1355,4\n586#1:1360,4\n597#1:1365,4\n655#1:1371,4\n813#1:1432,4\n819#1:1436,4\n823#1:1440,4\n1029#1:1472,4\n1031#1:1476,4\n1290#1:1529,4\n583#1:1359\n624#1:1369\n927#1:1445\n927#1:1459,4\n927#1:1469\n974#1:1470\n583#1:1364\n624#1:1370\n974#1:1471\n658#1:1375,5\n658#1:1385\n727#1:1386,5\n727#1:1396\n779#1:1397,7\n1189#1:1518,5\n1189#1:1528\n659#1:1381,4\n743#1:1392,4\n797#1:1404,2\n797#1:1430,2\n1176#1:1505,4\n1180#1:1510,4\n1184#1:1514,4\n1190#1:1524,4\n798#1:1406,3\n798#1:1409,6\n798#1:1416,3\n798#1:1420,9\n798#1:1429\n927#1:1446,6\n927#1:1453,3\n927#1:1457,2\n927#1:1463,6\n1158#1:1480,3\n1158#1:1483,6\n1158#1:1490,3\n1158#1:1494,9\n1158#1:1503\n798#1:1415\n798#1:1419\n927#1:1452\n927#1:1456\n1158#1:1489\n1158#1:1493\n1319#1:1534,5\n*E\n"})
public final class s0 implements androidx.compose.runtime.x {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f39480t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.l0 f39481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.p0 f39482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private c3 f39483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39485e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39495o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<androidx.compose.ui.node.l0, b> f39486f = androidx.collection.b3.u();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, androidx.compose.ui.node.l0> f39487g = androidx.collection.b3.u();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c f39488h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final a f39489i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, androidx.compose.ui.node.l0> f39490j = androidx.collection.b3.u();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c3.a f39491k = new c3.a(null, 1, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, a3.b> f39492l = androidx.collection.b3.u();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<Object> f39493m = new androidx.compose.runtime.collection.d<>(new Object[16], 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final String f39496s = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    private final class a implements b3, c1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ c f39497a;

        public a() {
            this.f39497a = s0.this.f39488h;
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public long C0(long j10) {
            return this.f39497a.C0(j10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public float D3(int i10) {
            return this.f39497a.D3(i10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public float F3(float f10) {
            return this.f39497a.F3(f10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        @NotNull
        public n0.j N3(@NotNull androidx.compose.ui.unit.k kVar) {
            return this.f39497a.N3(kVar);
        }

        @Override // androidx.compose.ui.layout.z
        public boolean P5() {
            return this.f39497a.P5();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.b3
        @NotNull
        public List<z0> S4(@Nullable Object obj, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            androidx.compose.ui.node.l0 l0Var = (androidx.compose.ui.node.l0) s0.this.f39487g.p(obj);
            return (l0Var == null || s0.this.f39481a.b0().indexOf(l0Var) >= s0.this.f39484d) ? s0.this.v(obj, function2) : l0Var.Y();
        }

        @Override // androidx.compose.ui.layout.c1
        @NotNull
        public b1 S6(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @NotNull Function1<? super i2.a, Unit> function1) {
            return this.f39497a.S6(i10, i11, map, function1);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public float S7(float f10) {
            return this.f39497a.S7(f10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public int c8(long j10) {
            return this.f39497a.c8(j10);
        }

        @Override // androidx.compose.ui.unit.n
        @k7
        public long d0(float f10) {
            return this.f39497a.d0(f10);
        }

        @Override // androidx.compose.ui.layout.c1
        @NotNull
        public b1 f8(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @Nullable Function1<? super v2, Unit> function1, @NotNull Function1<? super i2.a, Unit> function2) {
            return this.f39497a.f8(i10, i11, map, function1, function2);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public int g6(float f10) {
            return this.f39497a.g6(f10);
        }

        @Override // androidx.compose.ui.unit.d
        public float getDensity() {
            return this.f39497a.getDensity();
        }

        @Override // androidx.compose.ui.layout.z
        @NotNull
        public androidx.compose.ui.unit.w getLayoutDirection() {
            return this.f39497a.getLayoutDirection();
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public long j1(int i10) {
            return this.f39497a.j1(i10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public long k4(long j10) {
            return this.f39497a.k4(j10);
        }

        @Override // androidx.compose.ui.unit.n
        public float m0() {
            return this.f39497a.m0();
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public long m1(float f10) {
            return this.f39497a.m1(f10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public float p6(long j10) {
            return this.f39497a.p6(j10);
        }

        @Override // androidx.compose.ui.unit.n
        @k7
        public float y(long j10) {
            return this.f39497a.y(j10);
        }
    }

    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1351:1\n394#2:1352\n395#2,2:1355\n398#2:1358\n57#3,2:1353\n60#3:1357\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n*L\n1240#1:1352\n1240#1:1355,2\n1240#1:1358\n1240#1:1353,2\n1240#1:1357\n*E\n"})
    private final class c implements b3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private androidx.compose.ui.unit.w f39507a = androidx.compose.ui.unit.w.Rtl;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f39508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f39509c;

        public static final class a implements b1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f39511a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f39512b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map<androidx.compose.ui.layout.a, Integer> f39513c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<v2, Unit> f39514d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f39515e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s0 f39516f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<i2.a, Unit> f39517g;

            /* JADX WARN: Multi-variable type inference failed */
            a(int i10, int i11, Map<androidx.compose.ui.layout.a, Integer> map, Function1<? super v2, Unit> function1, c cVar, s0 s0Var, Function1<? super i2.a, Unit> function2) {
                this.f39511a = i10;
                this.f39512b = i11;
                this.f39513c = map;
                this.f39514d = function1;
                this.f39515e = cVar;
                this.f39516f = s0Var;
                this.f39517g = function2;
            }

            @Override // androidx.compose.ui.layout.b1
            public int getHeight() {
                return this.f39512b;
            }

            @Override // androidx.compose.ui.layout.b1
            public int getWidth() {
                return this.f39511a;
            }

            @Override // androidx.compose.ui.layout.b1
            public Function1<v2, Unit> j() {
                return this.f39514d;
            }

            @Override // androidx.compose.ui.layout.b1
            public Map<androidx.compose.ui.layout.a, Integer> x() {
                return this.f39513c;
            }

            @Override // androidx.compose.ui.layout.b1
            public void y() {
                androidx.compose.ui.node.v0 v0VarN4;
                if (!this.f39515e.P5() || (v0VarN4 = this.f39516f.f39481a.e0().N4()) == null) {
                    this.f39517g.invoke(this.f39516f.f39481a.e0().t2());
                } else {
                    this.f39517g.invoke(v0VarN4.t2());
                }
            }
        }

        public c() {
        }

        @Override // androidx.compose.ui.layout.z
        public boolean P5() {
            if (s0.this.f39481a.m0() != androidx.compose.ui.node.l0.e.LookaheadLayingOut && s0.this.f39481a.m0() != androidx.compose.ui.node.l0.e.LookaheadMeasuring) {
                return false;
            }
            return true;
        }

        @Override // androidx.compose.ui.layout.b3
        @NotNull
        public List<z0> S4(@Nullable Object obj, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            return s0.this.X(obj, function2);
        }

        public void c(float f10) {
            this.f39508b = f10;
        }

        @Override // androidx.compose.ui.layout.c1
        @NotNull
        public b1 f8(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @Nullable Function1<? super v2, Unit> function1, @NotNull Function1<? super i2.a, Unit> function2) {
            boolean z10;
            if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
                z10 = true;
                boolean z11 = false | true;
            } else {
                z10 = false;
            }
            if (!z10) {
                s0.a.i("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i10, i11, map, function1, this, s0.this, function2);
        }

        @Override // androidx.compose.ui.unit.d
        public float getDensity() {
            return this.f39508b;
        }

        @Override // androidx.compose.ui.layout.z
        @NotNull
        public androidx.compose.ui.unit.w getLayoutDirection() {
            return this.f39507a;
        }

        @Override // androidx.compose.ui.unit.n
        public float m0() {
            return this.f39509c;
        }

        public void w(float f10) {
            this.f39509c = f10;
        }

        public void x(@NotNull androidx.compose.ui.unit.w wVar) {
            this.f39507a = wVar;
        }
    }

    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1\n+ 2 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n1#1,1351:1\n943#2,5:1352\n943#2,5:1357\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1\n*L\n905#1:1352,5\n916#1:1357,5\n*E\n"})
    public static final class d extends androidx.compose.ui.node.l0.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<b3, androidx.compose.ui.unit.b, b1> f39519d;

        @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1\n+ 2 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1\n*L\n1#1,946:1\n906#2,5:947\n*E\n"})
        public static final class a implements b1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ b1 f39520a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s0 f39521b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f39522c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b1 f39523d;

            public a(b1 b1Var, s0 s0Var, int i10, b1 b1Var2) {
                this.f39521b = s0Var;
                this.f39522c = i10;
                this.f39523d = b1Var2;
                this.f39520a = b1Var;
            }

            @Override // androidx.compose.ui.layout.b1
            public int getHeight() {
                return this.f39520a.getHeight();
            }

            @Override // androidx.compose.ui.layout.b1
            public int getWidth() {
                return this.f39520a.getWidth();
            }

            @Override // androidx.compose.ui.layout.b1
            public Function1<v2, Unit> j() {
                return this.f39520a.j();
            }

            @Override // androidx.compose.ui.layout.b1
            public Map<androidx.compose.ui.layout.a, Integer> x() {
                return this.f39520a.x();
            }

            @Override // androidx.compose.ui.layout.b1
            public void y() {
                this.f39521b.f39485e = this.f39522c;
                this.f39523d.y();
                this.f39521b.F();
            }
        }

        @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1\n+ 2 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1\n*L\n1#1,946:1\n917#2,4:947\n*E\n"})
        public static final class b implements b1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ b1 f39524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s0 f39525b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f39526c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b1 f39527d;

            public b(b1 b1Var, s0 s0Var, int i10, b1 b1Var2) {
                this.f39525b = s0Var;
                this.f39526c = i10;
                this.f39527d = b1Var2;
                this.f39524a = b1Var;
            }

            @Override // androidx.compose.ui.layout.b1
            public int getHeight() {
                return this.f39524a.getHeight();
            }

            @Override // androidx.compose.ui.layout.b1
            public int getWidth() {
                return this.f39524a.getWidth();
            }

            @Override // androidx.compose.ui.layout.b1
            public Function1<v2, Unit> j() {
                return this.f39524a.j();
            }

            @Override // androidx.compose.ui.layout.b1
            public Map<androidx.compose.ui.layout.a, Integer> x() {
                return this.f39524a.x();
            }

            @Override // androidx.compose.ui.layout.b1
            public void y() {
                this.f39525b.f39484d = this.f39526c;
                this.f39527d.y();
                s0 s0Var = this.f39525b;
                s0Var.D(s0Var.f39484d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1> function2, String str) {
            super(str);
            this.f39519d = function2;
        }

        @Override // androidx.compose.ui.layout.a1
        public b1 a(c1 c1Var, List<? extends z0> list, long j10) {
            s0.this.f39488h.x(c1Var.getLayoutDirection());
            s0.this.f39488h.c(c1Var.getDensity());
            s0.this.f39488h.w(c1Var.m0());
            if (c1Var.P5() || s0.this.f39481a.t0() == null) {
                s0.this.f39484d = 0;
                b1 b1VarInvoke = this.f39519d.invoke(s0.this.f39488h, androidx.compose.ui.unit.b.a(j10));
                return new b(b1VarInvoke, s0.this, s0.this.f39484d, b1VarInvoke);
            }
            s0.this.f39485e = 0;
            b1 b1VarInvoke2 = this.f39519d.invoke(s0.this.f39489i, androidx.compose.ui.unit.b.a(j10));
            return new a(b1VarInvoke2, s0.this, s0.this.f39485e, b1VarInvoke2);
        }
    }

    public static final class e implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ b1 f39528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f39529b;

        public e(b1 b1Var, Function0<Unit> function0) {
            this.f39529b = function0;
            this.f39528a = b1Var;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f39528a.getHeight();
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f39528a.getWidth();
        }

        @Override // androidx.compose.ui.layout.b1
        public Function1<v2, Unit> j() {
            return this.f39528a.j();
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f39528a.x();
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
            this.f39529b.invoke();
        }
    }

    public static final class f implements a3.b {
        f() {
        }

        @Override // androidx.compose.ui.layout.a3.b
        public void dispose() {
        }
    }

    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createPrecomposedSlotHandle$2\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1351:1\n103#2,4:1352\n1220#3,4:1356\n30#4:1360\n80#5:1361\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createPrecomposedSlotHandle$2\n*L\n1072#1:1352,4\n1075#1:1356,4\n1100#1:1360\n1100#1:1361\n*E\n"})
    public static final class g implements a3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.collection.u1 f39530a = androidx.collection.m0.k();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f39532c;

        g(Object obj) {
            this.f39532c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.a3.b
        public long a(int i10) {
            androidx.compose.ui.node.l0 l0Var = (androidx.compose.ui.node.l0) s0.this.f39490j.p(this.f39532c);
            if (l0Var != null && l0Var.I()) {
                int size = l0Var.Z().size();
                if (i10 < 0 || i10 >= size) {
                    s0.a.k("Index (" + i10 + ") is out of bound of [0, " + size + ')');
                }
                if (this.f39530a.d(i10)) {
                    int width = l0Var.Z().get(i10).getWidth();
                    return androidx.compose.ui.unit.u.e((((long) l0Var.Z().get(i10).getHeight()) & com.rabbitmq.client.k0.f265952a) | (((long) width) << 32));
                }
            }
            return androidx.compose.ui.unit.u.f42720b.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.a3.b
        public int b() {
            List<androidx.compose.ui.node.l0> listZ;
            androidx.compose.ui.node.l0 l0Var = (androidx.compose.ui.node.l0) s0.this.f39490j.p(this.f39532c);
            if (l0Var == null || (listZ = l0Var.Z()) == null) {
                return 0;
            }
            return listZ.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.a3.b
        public void c(Object obj, Function1<? super androidx.compose.ui.node.p2, ? extends androidx.compose.ui.node.p2.a.EnumC0311a> function1) {
            androidx.compose.ui.node.i1 i1VarA0;
            androidx.compose.ui.a0.d dVarL;
            androidx.compose.ui.node.l0 l0Var = (androidx.compose.ui.node.l0) s0.this.f39490j.p(this.f39532c);
            if (l0Var == null || (i1VarA0 = l0Var.A0()) == null || (dVarL = i1VarA0.l()) == null) {
                return;
            }
            androidx.compose.ui.node.q2.g(dVarL, obj, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.a3.b
        public void d(int i10, long j10) {
            androidx.compose.ui.node.l0 l0Var = (androidx.compose.ui.node.l0) s0.this.f39490j.p(this.f39532c);
            if (l0Var == null || !l0Var.I()) {
                return;
            }
            int size = l0Var.Z().size();
            if (i10 < 0 || i10 >= size) {
                s0.a.k("Index (" + i10 + ") is out of bound of [0, " + size + ')');
            }
            if (l0Var.J()) {
                s0.a.g("Pre-measure called on node that is not placed");
            }
            androidx.compose.ui.node.l0 l0Var2 = s0.this.f39481a;
            l0Var2.f39882v = true;
            androidx.compose.ui.node.p0.c(l0Var).q(l0Var.Z().get(i10), j10);
            Unit unit = Unit.f312394a;
            l0Var2.f39882v = false;
            this.f39530a.G(i10);
        }

        @Override // androidx.compose.ui.layout.a3.b
        public void dispose() {
            s0.this.E(this.f39532c);
        }

        public final androidx.collection.u1 e() {
            return this.f39530a;
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f39533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.f39533a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            p5 p5VarD;
            if (this.f39533a.a() || (p5VarD = this.f39533a.d()) == null) {
                return;
            }
            p5VarD.deactivate();
        }
    }

    public static final class i implements f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f39534a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f39536c;

        i(Object obj) {
            this.f39536c = obj;
        }

        @Override // androidx.compose.ui.layout.a3.a
        public boolean a(t5 t5Var) {
            return true;
        }

        @Override // androidx.compose.ui.layout.a3.a
        public a3.b apply() {
            return s0.this.A(this.f39536c);
        }

        @Override // androidx.compose.ui.layout.a3.a
        public void cancel() {
        }

        @Override // androidx.compose.ui.layout.a3.a
        public boolean isComplete() {
            return this.f39534a;
        }
    }

    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precomposePaused$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,1351:1\n1#2:1352\n604#3,5:1353\n610#3:1363\n1184#4:1358\n1220#5,4:1359\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precomposePaused$2\n*L\n1138#1:1353,5\n1138#1:1363\n1139#1:1358\n1139#1:1359,4\n*E\n"})
    public static final class j implements f2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f39538b;

        j(Object obj) {
            this.f39538b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final b b() {
            androidx.compose.ui.node.l0 l0Var = (androidx.compose.ui.node.l0) s0.this.f39490j.p(this.f39538b);
            if (l0Var != null) {
                return (b) s0.this.f39486f.p(l0Var);
            }
            return null;
        }

        @Override // androidx.compose.ui.layout.a3.a
        public boolean a(t5 t5Var) {
            b bVarB = b();
            a4 a4VarH = bVarB != null ? bVarB.h() : null;
            if (a4VarH == null || a4VarH.isComplete()) {
                return true;
            }
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            s0 s0Var = s0.this;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                androidx.compose.ui.node.l0 l0Var = s0Var.f39481a;
                l0Var.f39882v = true;
                boolean zA = a4VarH.a(t5Var);
                l0Var.f39882v = false;
                aVar.x(mVarG, mVarM, function1L);
                return zA;
            } catch (Throwable th2) {
                aVar.x(mVarG, mVarM, function1L);
                throw th2;
            }
        }

        @Override // androidx.compose.ui.layout.a3.a
        public a3.b apply() {
            b bVarB = b();
            if (bVarB != null) {
                s0.this.t(bVarB, false);
            }
            return s0.this.A(this.f39538b);
        }

        @Override // androidx.compose.ui.layout.a3.a
        public void cancel() {
            b bVarB = b();
            if ((bVarB != null ? bVarB.h() : null) != null) {
                s0.this.E(this.f39538b);
            }
        }

        @Override // androidx.compose.ui.layout.a3.a
        public boolean isComplete() {
            a4 a4VarH;
            b bVarB = b();
            if (bVarB == null || (a4VarH = bVarB.h()) == null) {
                return true;
            }
            return a4VarH.isComplete();
        }
    }

    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$4$1$composable$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1351:1\n166#2,10:1352\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$4$1$composable$1\n*L\n684#1:1352,10\n*E\n"})
    static final class k extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f39539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f39540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(b bVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            super(2);
            this.f39539a = bVar;
            this.f39540b = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1524156494, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:683)");
            }
            boolean zA = this.f39539a.a();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f39540b;
            c0Var.r(androidx.compose.runtime.m0.f36245r, Boolean.valueOf(zA));
            boolean zG = c0Var.G(zA);
            if (zA) {
                function2.invoke(c0Var, 0);
            } else {
                c0Var.c(zG);
            }
            c0Var.g0();
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

    public s0(@NotNull androidx.compose.ui.node.l0 l0Var, @NotNull c3 c3Var) {
        this.f39481a = l0Var;
        this.f39483c = c3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a3.b A(Object obj) {
        return !this.f39481a.I() ? new f() : new g(obj);
    }

    private final void B(b bVar, androidx.compose.ui.node.v1 v1Var) {
        v1Var.o(new h(bVar));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:5:0x0014->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[EDGE_INSN: B:21:0x0059->B:18:0x0059 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0056], SYNTHETIC] */
    private final void C() {
        p5 p5VarD;
        androidx.compose.ui.node.l0 l0Var = this.f39481a;
        l0Var.f39882v = true;
        androidx.collection.k2<androidx.compose.ui.node.l0, b> k2Var = this.f39486f;
        Object[] objArr = k2Var.f12132c;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && (p5VarD = ((b) objArr[(i10 << 3) + i12]).d()) != null) {
                            p5VarD.dispose();
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.f39481a.J1();
        Unit unit = Unit.f312394a;
        l0Var.f39882v = false;
        this.f39486f.K();
        this.f39487g.K();
        this.f39495o = 0;
        this.f39494n = 0;
        this.f39490j.K();
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Object obj) {
        M();
        androidx.compose.ui.node.l0 l0VarL0 = this.f39490j.l0(obj);
        if (l0VarL0 != null) {
            if (!(this.f39495o > 0)) {
                s0.a.i("No pre-composed items to dispose");
            }
            int iIndexOf = this.f39481a.b0().indexOf(l0VarL0);
            if (!(iIndexOf >= this.f39481a.b0().size() - this.f39495o)) {
                s0.a.i("Item is not in pre-composed item range");
            }
            this.f39494n++;
            this.f39495o--;
            b bVarP = this.f39486f.p(l0VarL0);
            if (bVarP != null) {
                w(bVarP);
            }
            int size = (this.f39481a.b0().size() - this.f39495o) - this.f39494n;
            O(iIndexOf, size, 1);
            D(size);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        androidx.collection.k2<Object, a3.b> k2Var = this.f39492l;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = k2Var.f12131b[i13];
                        a3.b bVar = (a3.b) k2Var.f12132c[i13];
                        int iS = this.f39493m.S(obj);
                        if (iS < 0 || iS >= this.f39485e) {
                            bVar.dispose();
                            k2Var.o0(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final androidx.compose.ui.node.v1 I() {
        if (androidx.compose.ui.k.f39206i) {
            return androidx.compose.ui.node.p0.c(this.f39481a).getOutOfFrameExecutor();
        }
        return null;
    }

    private final Object J(List<androidx.compose.ui.node.l0> list, int i10) {
        b bVarP = this.f39486f.p(list.get(i10));
        Intrinsics.checkNotNull(bVarP);
        return bVarP.i();
    }

    private final <T> T L(Function0<? extends T> function0) {
        androidx.compose.ui.node.l0 l0Var = this.f39481a;
        l0Var.f39882v = true;
        T tInvoke = function0.invoke();
        l0Var.f39882v = false;
        return tInvoke;
    }

    private final void N(boolean z10) {
        this.f39495o = 0;
        this.f39490j.K();
        List<androidx.compose.ui.node.l0> listB0 = this.f39481a.b0();
        int size = listB0.size();
        if (this.f39494n != size) {
            this.f39494n = size;
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    androidx.compose.ui.node.l0 l0Var = listB0.get(i10);
                    b bVarP = this.f39486f.p(l0Var);
                    if (bVarP != null && bVarP.a()) {
                        T(l0Var);
                        U(bVarP, z10);
                        bVarP.r(z2.f39601a);
                    }
                } catch (Throwable th2) {
                    aVar.x(mVarG, mVarM, function1L);
                    throw th2;
                }
            }
            Unit unit = Unit.f312394a;
            aVar.x(mVarG, mVarM, function1L);
            this.f39487g.K();
        }
        M();
    }

    private final void O(int i10, int i11, int i12) {
        androidx.compose.ui.node.l0 l0Var = this.f39481a;
        l0Var.f39882v = true;
        this.f39481a.A1(i10, i11, i12);
        Unit unit = Unit.f312394a;
        l0Var.f39882v = false;
    }

    static /* synthetic */ void P(s0 s0Var, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        s0Var.O(i10, i11, i12);
    }

    private final void R(Object obj, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10) {
        if (this.f39481a.I()) {
            M();
            if (!this.f39487g.g(obj)) {
                this.f39492l.l0(obj);
                androidx.collection.k2<Object, androidx.compose.ui.node.l0> k2Var = this.f39490j;
                androidx.compose.ui.node.l0 l0VarP = k2Var.p(obj);
                if (l0VarP == null) {
                    l0VarP = a0(obj);
                    if (l0VarP != null) {
                        O(this.f39481a.b0().indexOf(l0VarP), this.f39481a.b0().size(), 1);
                        this.f39495o++;
                    } else {
                        l0VarP = z(this.f39481a.b0().size());
                        this.f39495o++;
                    }
                    k2Var.q0(obj, l0VarP);
                }
                Z(l0VarP, obj, z10, function2);
            }
        }
    }

    private final void T(androidx.compose.ui.node.l0 l0Var) {
        androidx.compose.ui.node.a1 a1VarV0 = l0Var.v0();
        androidx.compose.ui.node.l0.g gVar = androidx.compose.ui.node.l0.g.NotUsed;
        a1VarV0.T3(gVar);
        androidx.compose.ui.node.x0 x0VarP0 = l0Var.p0();
        if (x0VarP0 != null) {
            x0VarP0.G3(gVar);
        }
    }

    private final void U(b bVar, boolean z10) {
        p5 p5VarD;
        if (z10 || !bVar.c()) {
            bVar.k(d7.g(Boolean.FALSE, null, 2, null));
        } else {
            bVar.j(false);
        }
        if (bVar.h() != null) {
            w(bVar);
            return;
        }
        if (z10) {
            p5 p5VarD2 = bVar.d();
            if (p5VarD2 != null) {
                p5VarD2.deactivate();
                return;
            }
            return;
        }
        androidx.compose.ui.node.v1 v1VarI = I();
        if (v1VarI != null) {
            B(bVar, v1VarI);
        } else {
            if (bVar.c() || (p5VarD = bVar.d()) == null) {
                return;
            }
            p5VarD.deactivate();
        }
    }

    private final void Y(androidx.compose.ui.node.l0 l0Var, b bVar, boolean z10) {
        if (!(bVar.h() == null)) {
            s0.a.g("new subcompose call while paused composition is still active");
        }
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            androidx.compose.ui.node.l0 l0Var2 = this.f39481a;
            l0Var2.f39882v = true;
            p5 p5VarD = bVar.d();
            androidx.compose.runtime.p0 p0Var = this.f39482b;
            if (p0Var == null) {
                s0.a.j("parent composition reference not set");
                throw new kotlin.a0();
            }
            if (p5VarD == null || p5VarD.k()) {
                p5VarD = z10 ? androidx.compose.ui.platform.a4.a(l0Var, p0Var) : androidx.compose.ui.platform.a4.b(l0Var, p0Var);
            }
            bVar.m(p5VarD);
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E = bVar.e();
            if (I() != null) {
                bVar.l(false);
            } else {
                bVar.l(true);
                function2E = androidx.compose.runtime.internal.w.c(1524156494, true, new k(bVar, function2E));
            }
            if (z10) {
                Intrinsics.checkNotNull(p5VarD, "null cannot be cast to non-null type androidx.compose.runtime.PausableComposition");
                if (bVar.g()) {
                    bVar.q(((x3) p5VarD).f(function2E));
                } else {
                    bVar.q(((x3) p5VarD).b(function2E));
                }
            } else if (bVar.g()) {
                p5VarD.d(function2E);
            } else {
                p5VarD.l(function2E);
            }
            bVar.p(false);
            Unit unit = Unit.f312394a;
            l0Var2.f39882v = false;
            aVar.x(mVarG, mVarM, function1L);
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    private final void Z(androidx.compose.ui.node.l0 l0Var, Object obj, boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        androidx.collection.k2<androidx.compose.ui.node.l0, b> k2Var = this.f39486f;
        b bVarP = k2Var.p(l0Var);
        if (bVarP == null) {
            b bVar = new b(obj, androidx.compose.ui.layout.k.f39386a.a(), null, 4, null);
            k2Var.q0(l0Var, bVar);
            bVarP = bVar;
        }
        b bVar2 = bVarP;
        boolean z11 = bVar2.e() != function2;
        if (bVar2.h() != null) {
            if (z11) {
                w(bVar2);
            } else if (!z10) {
                t(bVar2, true);
            }
            p5 p5VarD = bVar2.d();
            if (p5VarD != null) {
            }
            if (!z11) {
            }
            bVar2.n(function2);
            Y(l0Var, bVar2, z10);
            bVar2.o(false);
        }
        p5 p5VarD2 = bVar2.d();
        boolean zM = p5VarD2 != null ? p5VarD2.m() : true;
        if (!z11 || zM || bVar2.f()) {
            bVar2.n(function2);
            Y(l0Var, bVar2, z10);
            bVar2.o(false);
        }
    }

    private final androidx.compose.ui.node.l0 a0(Object obj) {
        int i10;
        if (this.f39494n == 0) {
            return null;
        }
        List<androidx.compose.ui.node.l0> listB0 = this.f39481a.b0();
        int size = listB0.size() - this.f39495o;
        int i11 = size - this.f39494n;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            if (Intrinsics.areEqual(J(listB0, i13), obj)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                b bVarP = this.f39486f.p(listB0.get(i12));
                Intrinsics.checkNotNull(bVarP);
                b bVar = bVarP;
                if (bVar.i() == z2.f39601a || this.f39483c.b(obj, bVar.i())) {
                    bVar.r(obj);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            O(i13, i11, 1);
        }
        this.f39494n--;
        androidx.compose.ui.node.l0 l0Var = listB0.get(i11);
        b bVarP2 = this.f39486f.p(l0Var);
        Intrinsics.checkNotNull(bVarP2);
        b bVar2 = bVarP2;
        bVar2.k(d7.g(Boolean.TRUE, null, 2, null));
        bVar2.p(true);
        bVar2.o(true);
        return l0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(b bVar, boolean z10) {
        a4 a4VarH = bVar.h();
        if (a4VarH != null) {
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                androidx.compose.ui.node.l0 l0Var = this.f39481a;
                l0Var.f39882v = true;
                if (z10) {
                    while (!a4VarH.isComplete()) {
                        a4VarH.a(new t5() { // from class: androidx.compose.ui.layout.r0
                            @Override // androidx.compose.runtime.t5
                            public final boolean a() {
                                return s0.u();
                            }
                        });
                    }
                }
                a4VarH.apply();
                bVar.q(null);
                Unit unit = Unit.f312394a;
                l0Var.f39882v = false;
                aVar.x(mVarG, mVarM, function1L);
            } catch (Throwable th2) {
                aVar.x(mVarG, mVarM, function1L);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<z0> v(Object obj, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        boolean z10 = false;
        if (!(this.f39493m.R() >= this.f39485e)) {
            s0.a.g("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int iR = this.f39493m.R();
        int i10 = this.f39485e;
        if (iR == i10) {
            this.f39493m.d(obj);
        } else {
            this.f39493m.x0(i10, obj);
        }
        this.f39485e++;
        if (this.f39490j.f(obj)) {
            androidx.compose.ui.node.l0 l0VarP = this.f39490j.p(obj);
            b bVarP = l0VarP != null ? this.f39486f.p(l0VarP) : null;
            if (bVarP != null && bVarP.f()) {
                Z(l0VarP, obj, false, function2);
            }
        } else {
            this.f39492l.q0(obj, Q(obj, function2));
            if (this.f39481a.m0() == androidx.compose.ui.node.l0.e.LayingOut) {
                this.f39481a.N1(true);
            } else {
                androidx.compose.ui.node.l0.Q1(this.f39481a, true, false, false, 6, null);
            }
        }
        androidx.compose.ui.node.l0 l0VarP2 = this.f39490j.p(obj);
        if (l0VarP2 != null) {
            List<androidx.compose.ui.node.a1> listS1 = l0VarP2.v0().S1();
            int size = listS1.size();
            for (int i11 = 0; i11 < size; i11++) {
                listS1.get(i11).c3();
            }
            if (listS1 != null) {
                return listS1;
            }
        }
        return CollectionsKt.emptyList();
    }

    private final void w(b bVar) {
        a4 a4VarH = bVar.h();
        if (a4VarH != null) {
            a4VarH.cancel();
            bVar.q(null);
            p5 p5VarD = bVar.d();
            if (p5VarD != null) {
                p5VarD.dispose();
            }
            bVar.m(null);
        }
    }

    private final b1 y(b1 b1Var, Function0<Unit> function0) {
        return new e(b1Var, function0);
    }

    private final androidx.compose.ui.node.l0 z(int i10) {
        androidx.compose.ui.node.l0 l0Var = new androidx.compose.ui.node.l0(true, 0, 2, null);
        androidx.compose.ui.node.l0 l0Var2 = this.f39481a;
        l0Var2.f39882v = true;
        this.f39481a.W0(i10, l0Var);
        Unit unit = Unit.f312394a;
        l0Var2.f39882v = false;
        return l0Var;
    }

    public final void D(int i10) {
        boolean z10 = false;
        this.f39494n = 0;
        List<androidx.compose.ui.node.l0> listB0 = this.f39481a.b0();
        int size = (listB0.size() - this.f39495o) - 1;
        if (i10 <= size) {
            this.f39491k.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.f39491k.add(J(listB0, i11));
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f39483c.a(this.f39491k);
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            boolean z11 = false;
            while (size >= i10) {
                try {
                    androidx.compose.ui.node.l0 l0Var = listB0.get(size);
                    b bVarP = this.f39486f.p(l0Var);
                    Intrinsics.checkNotNull(bVarP);
                    b bVar = bVarP;
                    Object objI = bVar.i();
                    if (this.f39491k.contains(objI)) {
                        this.f39494n++;
                        if (bVar.a()) {
                            T(l0Var);
                            U(bVar, false);
                            if (bVar.c()) {
                                z11 = true;
                            }
                        }
                    } else {
                        androidx.compose.ui.node.l0 l0Var2 = this.f39481a;
                        l0Var2.f39882v = true;
                        this.f39486f.l0(l0Var);
                        p5 p5VarD = bVar.d();
                        if (p5VarD != null) {
                            p5VarD.dispose();
                        }
                        this.f39481a.K1(size, 1);
                        Unit unit = Unit.f312394a;
                        l0Var2.f39882v = false;
                    }
                    this.f39487g.l0(objI);
                    size--;
                } catch (Throwable th2) {
                    aVar.x(mVarG, mVarM, function1L);
                    throw th2;
                }
            }
            Unit unit2 = Unit.f312394a;
            aVar.x(mVarG, mVarM, function1L);
            z10 = z11;
        }
        if (z10) {
            androidx.compose.runtime.snapshots.m.f36535e.y();
        }
        M();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[LOOP:0: B:7:0x0020->B:19:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0064 A[EDGE_INSN: B:31:0x0064->B:20:0x0064 BREAK  A[LOOP:0: B:7:0x0020->B:19:0x0061], SYNTHETIC] */
    public final void G() {
        if (this.f39494n != this.f39481a.b0().size()) {
            androidx.collection.k2<androidx.compose.ui.node.l0, b> k2Var = this.f39486f;
            Object[] objArr = k2Var.f12132c;
            long[] jArr = k2Var.f12130a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                ((b) objArr[(i10 << 3) + i12]).o(true);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            if (this.f39481a.t0() != null) {
                if (this.f39481a.o0()) {
                    return;
                }
                androidx.compose.ui.node.l0.Q1(this.f39481a, false, false, false, 7, null);
            } else {
                if (this.f39481a.w0()) {
                    return;
                }
                androidx.compose.ui.node.l0.U1(this.f39481a, false, false, false, 7, null);
            }
        }
    }

    @Nullable
    public final androidx.compose.runtime.p0 H() {
        return this.f39482b;
    }

    @NotNull
    public final c3 K() {
        return this.f39483c;
    }

    public final void M() {
        int size = this.f39481a.b0().size();
        if (!(this.f39486f.v() == size)) {
            s0.a.g("Inconsistency between the count of nodes tracked by the state (" + this.f39486f.v() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.f39494n) - this.f39495o >= 0)) {
            s0.a.g("Incorrect state. Total children " + size + ". Reusable children " + this.f39494n + ". Precomposed children " + this.f39495o);
        }
        if (!(this.f39490j.v() == this.f39495o)) {
            s0.a.g("Incorrect state. Precomposed children " + this.f39495o + ". Map size " + this.f39490j.v());
        }
    }

    @NotNull
    public final a3.b Q(@Nullable Object obj, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        R(obj, function2, false);
        return A(obj);
    }

    @NotNull
    public final a3.a S(@Nullable Object obj, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        if (!this.f39481a.I()) {
            return new i(obj);
        }
        R(obj, function2, true);
        return new j(obj);
    }

    public final void V(@Nullable androidx.compose.runtime.p0 p0Var) {
        this.f39482b = p0Var;
    }

    public final void W(@NotNull c3 c3Var) {
        if (this.f39483c != c3Var) {
            this.f39483c = c3Var;
            N(false);
            androidx.compose.ui.node.l0.U1(this.f39481a, false, false, false, 7, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    @NotNull
    public final List<z0> X(@Nullable Object obj, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        s0 s0Var;
        M();
        androidx.compose.ui.node.l0.e eVarM0 = this.f39481a.m0();
        androidx.compose.ui.node.l0.e eVar = androidx.compose.ui.node.l0.e.Measuring;
        if (!(eVarM0 == eVar || eVarM0 == androidx.compose.ui.node.l0.e.LayingOut || eVarM0 == androidx.compose.ui.node.l0.e.LookaheadMeasuring || eVarM0 == androidx.compose.ui.node.l0.e.LookaheadLayingOut)) {
            s0.a.i("subcompose can only be used inside the measure or layout blocks");
        }
        androidx.collection.k2<Object, androidx.compose.ui.node.l0> k2Var = this.f39487g;
        androidx.compose.ui.node.l0 l0VarP = k2Var.p(obj);
        if (l0VarP == null) {
            l0VarP = this.f39490j.l0(obj);
            if (l0VarP != null) {
                if (!(this.f39495o > 0)) {
                    s0.a.i("Check failed.");
                }
                this.f39495o--;
            } else {
                l0VarP = a0(obj);
                if (l0VarP == null) {
                    l0VarP = z(this.f39484d);
                }
            }
            k2Var.q0(obj, l0VarP);
        }
        androidx.compose.ui.node.l0 l0Var = l0VarP;
        if (CollectionsKt.getOrNull(this.f39481a.b0(), this.f39484d) == l0Var) {
            s0Var = this;
        } else {
            int iIndexOf = this.f39481a.b0().indexOf(l0Var);
            if (!(iIndexOf >= this.f39484d)) {
                s0.a.g("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i10 = this.f39484d;
            if (i10 != iIndexOf) {
                s0Var = this;
                P(s0Var, iIndexOf, i10, 0, 4, null);
            } else {
                s0Var = this;
            }
        }
        s0Var.f39484d++;
        s0Var.Z(l0Var, obj, false, function2);
        if (eVarM0 != eVar && eVarM0 != androidx.compose.ui.node.l0.e.LayingOut) {
            return l0Var.X();
        }
        return l0Var.Y();
    }

    @Override // androidx.compose.runtime.x
    public void c() {
        C();
    }

    @Override // androidx.compose.runtime.x
    public void g() {
        N(true);
    }

    @Override // androidx.compose.runtime.x
    public void r() {
        N(false);
    }

    @NotNull
    public final a1 x(@NotNull Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1> function2) {
        return new d(function2, this.f39496s);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Object f39499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> f39500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private p5 f39501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f39502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f39503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private a4 f39504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private androidx.compose.runtime.n3<Boolean> f39505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f39506h;

        public b(@Nullable Object obj, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable p5 p5Var) {
            this.f39499a = obj;
            this.f39500b = function2;
            this.f39501c = p5Var;
            int i10 = 2 & 2;
            this.f39505g = d7.g(Boolean.TRUE, null, 2, null);
        }

        public final boolean a() {
            return this.f39505g.getValue().booleanValue();
        }

        @NotNull
        public final androidx.compose.runtime.n3<Boolean> b() {
            return this.f39505g;
        }

        public final boolean c() {
            return this.f39506h;
        }

        @Nullable
        public final p5 d() {
            return this.f39501c;
        }

        @NotNull
        public final Function2<androidx.compose.runtime.c0, Integer, Unit> e() {
            return this.f39500b;
        }

        public final boolean f() {
            return this.f39502d;
        }

        public final boolean g() {
            return this.f39503e;
        }

        @Nullable
        public final a4 h() {
            return this.f39504f;
        }

        @Nullable
        public final Object i() {
            return this.f39499a;
        }

        public final void j(boolean z10) {
            this.f39505g.setValue(Boolean.valueOf(z10));
        }

        public final void k(@NotNull androidx.compose.runtime.n3<Boolean> n3Var) {
            this.f39505g = n3Var;
        }

        public final void l(boolean z10) {
            this.f39506h = z10;
        }

        public final void m(@Nullable p5 p5Var) {
            this.f39501c = p5Var;
        }

        public final void n(@NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f39500b = function2;
        }

        public final void o(boolean z10) {
            this.f39502d = z10;
        }

        public final void p(boolean z10) {
            this.f39503e = z10;
        }

        public final void q(@Nullable a4 a4Var) {
            this.f39504f = a4Var;
        }

        public final void r(@Nullable Object obj) {
            this.f39499a = obj;
        }

        public /* synthetic */ b(Object obj, Function2 function2, p5 p5Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i10 & 4) != 0 ? null : p5Var);
        }
    }
}
