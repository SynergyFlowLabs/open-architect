package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.platform.o4;
import androidx.compose.ui.platform.w2;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
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
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 10 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 11 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 12 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n+ 13 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1593:1\n1367#1,7:1600\n1367#1,7:1686\n1220#1,2:1694\n1222#1,2:1705\n207#1:1709\n207#1:1881\n207#1:1890\n1357#1,7:1962\n207#1:2097\n207#1:2106\n207#1:2115\n1367#1,7:2129\n1107#2:1594\n1085#2,2:1595\n1107#2:1597\n1085#2,2:1598\n1107#2:1608\n1085#2,2:1609\n1107#2:1762\n1085#2,2:1763\n1107#2:1824\n1085#2,2:1825\n1107#2:1932\n1085#2,2:1933\n1107#2:2001\n1085#2,2:2002\n1107#2:2066\n1085#2,2:2067\n48#3:1607\n46#3:1612\n50#3:1646\n30#3:1648\n50#3:1649\n46#3:1651\n46#3:1671\n46#3:1696\n1#4:1611\n424#5,5:1613\n144#5:1618\n429#5,3:1619\n424#5,8:1622\n436#5,8:1630\n472#5:1647\n472#5:1650\n424#5,8:1652\n424#5,8:1672\n424#5,8:1697\n144#5:1708\n424#5,8:1710\n424#5,8:1882\n424#5,8:1891\n424#5,8:2031\n424#5,8:2098\n424#5,8:2107\n424#5,8:2116\n57#6,4:1638\n103#6,4:1642\n57#6,4:1661\n57#6,4:1665\n78#6,5:1681\n78#6,5:1854\n103#6,4:1859\n103#6,4:1863\n57#6,4:1877\n103#6,4:2124\n90#7:1660\n90#7:1669\n114#7:1670\n90#7:1680\n90#7:1693\n90#7:1707\n94#7:1730\n138#7:1792\n94#7:1867\n118#7:1868\n94#7:1869\n118#7:1870\n114#7:1871\n110#7:1899\n110#7:1916\n82#7:1969\n106#7:2039\n90#7:2128\n654#8,6:1718\n654#8,6:1724\n633#8,6:1731\n654#8,3:1737\n639#8,2:1740\n642#8,2:1785\n657#8,3:1787\n644#8:1790\n634#8:1791\n633#8,6:1793\n654#8,3:1799\n639#8,2:1802\n642#8,2:1847\n657#8,3:1849\n644#8:1852\n634#8:1853\n633#8,6:1900\n654#8,3:1906\n639#8,2:1909\n642#8,2:1955\n657#8,3:1957\n644#8:1960\n634#8:1961\n633#8,6:1970\n654#8,3:1976\n639#8,2:1979\n642#8,2:2024\n657#8,3:2026\n644#8:2029\n634#8:2030\n450#9,6:1742\n460#9,2:1749\n462#9,8:1754\n470#9,9:1765\n479#9,8:1777\n450#9,6:1804\n460#9,2:1811\n462#9,8:1816\n470#9,9:1827\n479#9,8:1839\n450#9,5:1911\n455#9:1917\n460#9,2:1919\n462#9,8:1924\n470#9,9:1935\n479#9,8:1947\n450#9,6:1981\n460#9,2:1988\n462#9,8:1993\n470#9,9:2004\n479#9,8:2016\n450#9,6:2046\n460#9,2:2053\n462#9,8:2058\n470#9,9:2069\n479#9,8:2081\n247#10:1748\n247#10:1810\n247#10:1918\n247#10:1987\n247#10:2052\n240#11,3:1751\n243#11,3:1774\n240#11,3:1813\n243#11,3:1836\n240#11,3:1921\n243#11,3:1944\n240#11,3:1990\n243#11,3:2013\n240#11,3:2055\n243#11,3:2078\n1573#12,5:1872\n117#13:2040\n106#13,5:2041\n111#13,8:2089\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n120#1:1600,7\n592#1:1686,7\n600#1:1694,2\n600#1:1705,2\n679#1:1709\n1211#1:1881\n1216#1:1890\n1259#1:1962,7\n1389#1:2097\n1410#1:2106\n1422#1:2115\n1487#1:2129,7\n139#1:1594\n139#1:1595,2\n628#1:1597\n628#1:1598,2\n153#1:1608\n153#1:1609,2\n781#1:1762\n781#1:1763,2\n791#1:1824\n791#1:1825,2\n1246#1:1932\n1246#1:1933,2\n1328#1:2001\n1328#1:2002,2\n1352#1:2066\n1352#1:2067,2\n143#1:1607\n155#1:1612\n342#1:1646\n352#1:1648\n353#1:1649\n378#1:1651\n552#1:1671\n600#1:1696\n155#1:1613,5\n157#1:1618\n155#1:1619,3\n207#1:1622,8\n210#1:1630,8\n342#1:1647\n353#1:1650\n378#1:1652,8\n552#1:1672,8\n600#1:1697,8\n643#1:1708\n679#1:1710,8\n1211#1:1882,8\n1216#1:1891,8\n1330#1:2031,8\n1389#1:2098,8\n1410#1:2107,8\n1422#1:2116,8\n291#1:1638,4\n338#1:1642,4\n503#1:1661,4\n506#1:1665,4\n580#1:1681,5\n920#1:1854,5\n949#1:1859,4\n952#1:1863,4\n1151#1:1877,4\n1440#1:2124,4\n464#1:1660\n531#1:1669\n544#1:1670\n565#1:1680\n596#1:1693\n616#1:1707\n781#1:1730\n791#1:1792\n964#1:1867\n965#1:1868\n968#1:1869\n969#1:1870\n971#1:1871\n1246#1:1899\n1247#1:1916\n1328#1:1969\n1352#1:2039\n1460#1:2128\n761#1:1718,6\n772#1:1724,6\n781#1:1731,6\n781#1:1737,3\n781#1:1740,2\n781#1:1785,2\n781#1:1787,3\n781#1:1790\n781#1:1791\n791#1:1793,6\n791#1:1799,3\n791#1:1802,2\n791#1:1847,2\n791#1:1849,3\n791#1:1852\n791#1:1853\n1246#1:1900,6\n1246#1:1906,3\n1246#1:1909,2\n1246#1:1955,2\n1246#1:1957,3\n1246#1:1960\n1246#1:1961\n1328#1:1970,6\n1328#1:1976,3\n1328#1:1979,2\n1328#1:2024,2\n1328#1:2026,3\n1328#1:2029\n1328#1:2030\n781#1:1742,6\n781#1:1749,2\n781#1:1754,8\n781#1:1765,9\n781#1:1777,8\n791#1:1804,6\n791#1:1811,2\n791#1:1816,8\n791#1:1827,9\n791#1:1839,8\n1246#1:1911,5\n1246#1:1917\n1246#1:1919,2\n1246#1:1924,8\n1246#1:1935,9\n1246#1:1947,8\n1328#1:1981,6\n1328#1:1988,2\n1328#1:1993,8\n1328#1:2004,9\n1328#1:2016,8\n1352#1:2046,6\n1352#1:2053,2\n1352#1:2058,8\n1352#1:2069,9\n1352#1:2081,8\n781#1:1748\n791#1:1810\n1246#1:1918\n1328#1:1987\n1352#1:2052\n781#1:1751,3\n781#1:1774,3\n791#1:1813,3\n791#1:1836,3\n1246#1:1921,3\n1246#1:1944,3\n1328#1:1990,3\n1328#1:2013,3\n1352#1:2055,3\n1352#1:2078,3\n1054#1:1872,5\n1352#1:2040\n1352#1:2041,5\n1352#1:2089,8\n*E\n"})
public final class l0 implements androidx.compose.runtime.x, androidx.compose.ui.layout.p2, y1, androidx.compose.ui.layout.l0, androidx.compose.ui.semantics.p, androidx.compose.ui.node.g, b0, x1.b {
    public static final int B3 = Integer.MAX_VALUE;

    @Nullable
    private c0 H1;

    @Nullable
    private SemanticsConfiguration X;
    private boolean Y;

    @NotNull
    private final androidx.compose.runtime.collection.d<l0> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f39847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39853g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.w f39854g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39855h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private o4 f39856h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private l0 f39857i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.b1 f39858i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39859j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private g f39860j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final g1<l0> f39861k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private g f39862k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.collection.d<l0> f39863l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f39864l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f39865m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private final i1 f39866m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private l0 f39867n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private final q0 f39868n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private x1 f39869o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.s0 f39870o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f39871p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.layout.a1 f39872p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f39873p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @Nullable
    private k1 f39874p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f39875q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.a0 f39876r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.viewinterop.b f39877s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.a0 f39878s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f39879t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @Nullable
    private Function1<? super x1, Unit> f39880t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @Nullable
    private Function1<? super x1, Unit> f39881u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f39882v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f39883v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f39884w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private int f39885w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f39886x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    public static final d f39845y3 = new d(null);

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f39846z3 = 8;

    @NotNull
    private static final f A3 = new c();

    @NotNull
    private static final Function0<l0> C3 = a.f39887a;

    @NotNull
    private static final o4 D3 = new b();

    @NotNull
    private static final Comparator<l0> E3 = new Comparator() { // from class: androidx.compose.ui.node.k0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return l0.u((l0) obj, (l0) obj2);
        }
    };

    static final class a extends kotlin.jvm.internal.l0 implements Function0<l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39887a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l0 invoke() {
            return new l0(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    public static final class b implements o4 {
        b() {
        }

        @Override // androidx.compose.ui.platform.o4
        public long a() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.o4
        public float g() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.o4
        public long i() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.o4
        public long j() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.o4
        public long l() {
            return androidx.compose.ui.unit.l.f42704b.b();
        }
    }

    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // androidx.compose.ui.layout.a1
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List list, long j10) {
            return (androidx.compose.ui.layout.b1) j(c1Var, list, j10);
        }

        public Void j(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c() {
        }

        @NotNull
        public final Function0<l0> a() {
            return l0.C3;
        }

        @NotNull
        public final o4 b() {
            return l0.D3;
        }

        @NotNull
        public final Comparator<l0> d() {
            return l0.E3;
        }

        private d() {
        }
    }

    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f39894g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f39894g;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static abstract class f implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39895b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f39896a;

        public f(@NotNull String str) {
            this.f39896a = str;
        }

        @Override // androidx.compose.ui.layout.a1
        public /* bridge */ /* synthetic */ int b(androidx.compose.ui.layout.z zVar, List list, int i10) {
            return ((Number) h(zVar, list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.a1
        public /* bridge */ /* synthetic */ int c(androidx.compose.ui.layout.z zVar, List list, int i10) {
            return ((Number) i(zVar, list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.a1
        public /* bridge */ /* synthetic */ int d(androidx.compose.ui.layout.z zVar, List list, int i10) {
            return ((Number) f(zVar, list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.a1
        public /* bridge */ /* synthetic */ int e(androidx.compose.ui.layout.z zVar, List list, int i10) {
            return ((Number) g(zVar, list, i10)).intValue();
        }

        @NotNull
        public Void f(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
            throw new IllegalStateException(this.f39896a.toString());
        }

        @NotNull
        public Void g(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
            throw new IllegalStateException(this.f39896a.toString());
        }

        @NotNull
        public Void h(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
            throw new IllegalStateException(this.f39896a.toString());
        }

        @NotNull
        public Void i(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
            throw new IllegalStateException(this.f39896a.toString());
        }
    }

    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f39901e = kotlin.enums.c.c(k());

        static {
            int i10 = 7 ^ 2;
        }

        @NotNull
        public static kotlin.enums.a<g> l() {
            return f39901e;
        }
    }

    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39902a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f39902a = iArr;
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            l0.this.k0().C();
        }
    }

    @SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$calculateSemanticsConfiguration$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1593:1\n90#2:1594\n670#3,16:1595\n686#3,3:1655\n450#4,5:1611\n455#4:1617\n460#4,2:1619\n462#4,8:1624\n470#4,9:1635\n479#4,8:1647\n1#5:1616\n247#6:1618\n240#7,3:1621\n243#7,3:1644\n1107#8:1632\n1085#8,2:1633\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$calculateSemanticsConfiguration$1\n*L\n481#1:1594\n481#1:1595,16\n481#1:1655,3\n481#1:1611,5\n481#1:1617\n481#1:1619,2\n481#1:1624,8\n481#1:1635,9\n481#1:1647,8\n481#1:1618\n481#1:1621,3\n481#1:1644,3\n481#1:1632\n481#1:1633,2\n*E\n"})
    static final class j extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<SemanticsConfiguration> f39905b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(kotlin.jvm.internal.i1.h<SemanticsConfiguration> hVar) {
            super(0);
            this.f39905b = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r5v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
            	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
            	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
            */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            /*
                r11 = this;
                androidx.compose.ui.node.l0 r0 = androidx.compose.ui.node.l0.this
                androidx.compose.ui.node.i1 r0 = r0.A0()
                r1 = 8
                int r1 = androidx.compose.ui.node.m1.b(r1)
                r10 = 4
                kotlin.jvm.internal.i1$h<androidx.compose.ui.semantics.SemanticsConfiguration> r11 = r11.f39905b
                int r2 = androidx.compose.ui.node.i1.c(r0)
                r10 = 5
                r2 = r2 & r1
                r10 = 7
                if (r2 == 0) goto Lb3
                androidx.compose.ui.a0$d r0 = r0.q()
            L1c:
                r10 = 1
                if (r0 == 0) goto Lb3
                int r2 = r0.T8()
                r2 = r2 & r1
                if (r2 == 0) goto Lac
                r10 = 1
                r2 = 0
                r3 = r0
                r3 = r0
                r4 = r2
            L2b:
                r10 = 5
                if (r3 == 0) goto Lac
                r10 = 1
                boolean r5 = r3 instanceof androidx.compose.ui.node.i2
                r6 = 1
                r10 = 2
                if (r5 == 0) goto L60
                r10 = 2
                androidx.compose.ui.node.i2 r3 = (androidx.compose.ui.node.i2) r3
                boolean r5 = r3.u5()
                if (r5 == 0) goto L49
                androidx.compose.ui.semantics.SemanticsConfiguration r5 = new androidx.compose.ui.semantics.SemanticsConfiguration
                r10 = 0
                r5.<init>()
                r11.f312751a = r5
                r5.A(r6)
            L49:
                boolean r5 = r3.A4()
                r10 = 0
                if (r5 == 0) goto L57
                T r5 = r11.f312751a
                androidx.compose.ui.semantics.SemanticsConfiguration r5 = (androidx.compose.ui.semantics.SemanticsConfiguration) r5
                r5.B(r6)
            L57:
                T r5 = r11.f312751a
                androidx.compose.ui.semantics.e0 r5 = (androidx.compose.ui.semantics.e0) r5
                r10 = 2
                r3.p0(r5)
                goto La7
            L60:
                r10 = 1
                int r5 = r3.T8()
                r5 = r5 & r1
                r10 = 0
                if (r5 == 0) goto La7
                boolean r5 = r3 instanceof androidx.compose.ui.node.m
                if (r5 == 0) goto La7
                r5 = r3
                androidx.compose.ui.node.m r5 = (androidx.compose.ui.node.m) r5
                androidx.compose.ui.a0$d r5 = r5.y9()
                r7 = 0
                r10 = r10 & r7
                r8 = r7
            L77:
                if (r5 == 0) goto La4
                int r9 = r5.T8()
                r10 = 4
                r9 = r9 & r1
                if (r9 == 0) goto L9e
                int r8 = r8 + 1
                r10 = 1
                if (r8 != r6) goto L89
                r3 = r5
                r10 = 4
                goto L9e
            L89:
                if (r4 != 0) goto L95
                androidx.compose.runtime.collection.d r4 = new androidx.compose.runtime.collection.d
                r9 = 16
                androidx.compose.ui.a0$d[] r9 = new androidx.compose.ui.a0.d[r9]
                r10 = 4
                r4.<init>(r9, r7)
            L95:
                if (r3 == 0) goto L9b
                r4.d(r3)
                r3 = r2
            L9b:
                r4.d(r5)
            L9e:
                androidx.compose.ui.a0$d r5 = r5.O8()
                r10 = 0
                goto L77
            La4:
                if (r8 != r6) goto La7
                goto L2b
            La7:
                androidx.compose.ui.a0$d r3 = androidx.compose.ui.node.k.b(r4)
                goto L2b
            Lac:
                androidx.compose.ui.a0$d r0 = r0.W8()
                r10 = 7
                goto L1c
            Lb3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.l0.j.invoke2():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    private final SemanticsConfiguration B() {
        this.Y = true;
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        hVar.f312751a = new SemanticsConfiguration();
        p0.c(this).getSnapshotObserver().j(this, new j(hVar));
        this.Y = false;
        return (SemanticsConfiguration) hVar.f312751a;
    }

    private final void B1(l0 l0Var) {
        if (l0Var.f39868n3.c() > 0) {
            q0 q0Var = this.f39868n3;
            q0Var.L(q0Var.c() - 1);
        }
        if (this.f39869o != null) {
            l0Var.G();
        }
        l0Var.f39867n = null;
        if (l0Var.f39885w3 > 0) {
            b2(this.f39885w3 - 1);
        }
        l0Var.F0().V6(null);
        if (l0Var.f39847a) {
            this.f39859j--;
            androidx.compose.runtime.collection.d<l0> dVarH = l0Var.f39861k.h();
            l0[] l0VarArr = dVarH.f35552a;
            int iR = dVarH.R();
            for (int i10 = 0; i10 < iR; i10++) {
                l0VarArr[i10].F0().V6(null);
            }
        }
        g1();
        E1();
    }

    private final void D() {
        this.f39862k3 = this.f39860j3;
        this.f39860j3 = g.NotUsed;
        androidx.compose.runtime.collection.d<l0> dVarQ0 = Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            if (l0Var.f39860j3 == g.InLayoutBlock) {
                l0Var.D();
            }
        }
    }

    private final void D1() {
        Z0();
        l0 l0VarJ0 = J0();
        if (l0VarJ0 != null) {
            l0VarJ0.X0();
        }
        Y0();
    }

    private final String E(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        androidx.compose.runtime.collection.d<l0> dVarQ0 = Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i12 = 0; i12 < iR; i12++) {
            sb2.append(l0VarArr[i12].E(i10 + 1));
        }
        String string = sb2.toString();
        if (i10 == 0) {
            string = string.substring(0, string.length() - 1);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
        }
        return string;
    }

    private final c0 E0() {
        c0 c0Var = this.H1;
        if (c0Var == null) {
            c0Var = new c0(this, s());
            this.H1 = c0Var;
        }
        return c0Var;
    }

    static /* synthetic */ String F(l0 l0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return l0Var.E(i10);
    }

    private final void G1() {
        if (this.f39865m) {
            this.f39865m = false;
            androidx.compose.runtime.collection.d<l0> dVar = this.f39863l;
            if (dVar == null) {
                dVar = new androidx.compose.runtime.collection.d<>(new l0[16], 0);
                this.f39863l = dVar;
            }
            dVar.r();
            androidx.compose.runtime.collection.d<l0> dVarH = this.f39861k.h();
            l0[] l0VarArr = dVarH.f35552a;
            int iR = dVarH.R();
            for (int i10 = 0; i10 < iR; i10++) {
                l0 l0Var = l0VarArr[i10];
                if (l0Var.f39847a) {
                    dVar.i(dVar.R(), l0Var.Q0());
                } else {
                    dVar.d(l0Var);
                }
            }
            this.f39868n3.C();
        }
    }

    public static /* synthetic */ boolean I1(l0 l0Var, androidx.compose.ui.unit.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = l0Var.f39868n3.j();
        }
        return l0Var.H1(bVar);
    }

    private final androidx.compose.runtime.tooling.h M0() {
        return (androidx.compose.runtime.tooling.h) m().a(androidx.compose.runtime.tooling.l.c());
    }

    private final float N0() {
        return v0().W2();
    }

    private final String O(l0 l0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot insert ");
        sb2.append(l0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(F(this, 0, 1, null));
        sb2.append(" Other tree: ");
        l0 l0Var2 = l0Var.f39867n;
        sb2.append(l0Var2 != null ? F(l0Var2, 0, 1, null) : null);
        return sb2.toString();
    }

    public static /* synthetic */ void O1(l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        l0Var.N1(z10);
    }

    @kotlin.a1
    public static /* synthetic */ void P0() {
    }

    public static /* synthetic */ void Q1(l0 l0Var, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        l0Var.P1(z10, z11, z12);
    }

    public static /* synthetic */ void S0(l0 l0Var, long j10, w wVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = androidx.compose.ui.input.pointer.r0.f39113b.e();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        l0Var.R0(j10, wVar, i12, z10);
    }

    public static /* synthetic */ void S1(l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        l0Var.R1(z10);
    }

    public static /* synthetic */ void U0(l0 l0Var, long j10, w wVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = androidx.compose.ui.input.pointer.r0.f39113b.d();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        l0Var.T0(j10, wVar, i12, z10);
    }

    public static /* synthetic */ void U1(l0 l0Var, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        l0Var.T1(z10, z11, z12);
    }

    @kotlin.l(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void W() {
    }

    private final void W1() {
        this.f39866m3.F();
    }

    private final void a1() {
        long j10 = this.f39849c;
        androidx.compose.ui.unit.q.a aVar = androidx.compose.ui.unit.q.f42709b;
        if (androidx.compose.ui.unit.q.k(j10, aVar.a())) {
            return;
        }
        this.f39849c = aVar.a();
        androidx.compose.runtime.collection.d<l0> dVarQ0 = Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0VarArr[i10].a1();
        }
    }

    public static /* synthetic */ void f1(l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        l0Var.e1(z10);
    }

    private final void g1() {
        l0 l0Var;
        if (this.f39859j > 0) {
            this.f39865m = true;
        }
        if (!this.f39847a || (l0Var = this.f39867n) == null) {
            return;
        }
        l0Var.g1();
    }

    private final void g2(l0 l0Var) {
        if (Intrinsics.areEqual(l0Var, this.f39857i)) {
            return;
        }
        this.f39857i = l0Var;
        if (l0Var != null) {
            this.f39868n3.a();
            k1 k1VarY4 = e0().Y4();
            for (k1 k1VarF0 = F0(); !Intrinsics.areEqual(k1VarF0, k1VarY4) && k1VarF0 != null; k1VarF0 = k1VarF0.Y4()) {
                k1VarF0.a4();
            }
        } else {
            this.f39868n3.I();
        }
        Z0();
    }

    public static /* synthetic */ boolean m1(l0 l0Var, androidx.compose.ui.unit.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = l0Var.f39868n3.k();
        }
        return l0Var.l1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(l0 l0Var, l0 l0Var2) {
        return l0Var.N0() == l0Var2.N0() ? Intrinsics.compare(l0Var.K0(), l0Var2.K0()) : Float.compare(l0Var.N0(), l0Var2.N0());
    }

    private final void z(androidx.compose.ui.a0 a0Var) {
        boolean zS = this.f39866m3.s(m1.b(16));
        boolean zS2 = this.f39866m3.s(m1.b(1024));
        this.f39876r3 = a0Var;
        this.f39866m3.Q(a0Var);
        boolean zS3 = this.f39866m3.s(m1.b(16));
        boolean zS4 = this.f39866m3.s(m1.b(1024));
        this.f39868n3.Z();
        if (this.f39857i == null && this.f39866m3.s(m1.b(512))) {
            g2(this);
        }
        if (zS == zS3 && zS2 == zS4) {
            return;
        }
        p0.c(this).getRectManager().w(this, zS4, zS3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    public final void A(@NotNull x1 x1Var) {
        boolean z10;
        l0 l0Var;
        if (!(this.f39869o == null)) {
            s0.a.i("Cannot attach " + this + " as it already is attached.  Tree: " + F(this, 0, 1, null));
        }
        l0 l0Var2 = this.f39867n;
        if (l0Var2 == null) {
            z10 = true;
        } else if (Intrinsics.areEqual(l0Var2 != null ? l0Var2.f39869o : null, x1Var)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Attaching to a different owner(");
            sb2.append(x1Var);
            sb2.append(") than the parent's owner(");
            l0 l0VarJ0 = J0();
            sb2.append(l0VarJ0 != null ? l0VarJ0.f39869o : null);
            sb2.append("). This tree: ");
            sb2.append(F(this, 0, 1, null));
            sb2.append(" Parent tree: ");
            l0 l0Var3 = this.f39867n;
            sb2.append(l0Var3 != null ? F(l0Var3, 0, 1, null) : null);
            s0.a.i(sb2.toString());
        }
        l0 l0VarJ1 = J0();
        if (l0VarJ1 == null) {
            v0().X3(true);
            x0 x0VarP0 = p0();
            if (x0VarP0 != null) {
                x0VarP0.c3();
            }
        }
        F0().V6(l0VarJ1 != null ? l0VarJ1.e0() : null);
        this.f39869o = x1Var;
        this.f39879t = (l0VarJ1 != null ? l0VarJ1.f39879t : -1) + 1;
        androidx.compose.ui.a0 a0Var = this.f39878s3;
        if (a0Var != null) {
            z(a0Var);
        }
        this.f39878s3 = null;
        if (!androidx.compose.ui.k.f39200c && this.f39866m3.s(m1.b(8))) {
            d1();
        }
        x1Var.M(this);
        if (this.f39855h) {
            g2(this);
        } else {
            l0 l0Var4 = this.f39867n;
            if (l0Var4 == null || (l0Var = l0Var4.f39857i) == null) {
                l0Var = this.f39857i;
            }
            g2(l0Var);
            if (this.f39857i == null && this.f39866m3.s(m1.b(512))) {
                g2(this);
            }
        }
        if (!M()) {
            this.f39866m3.A();
        }
        androidx.compose.runtime.collection.d<l0> dVarH = this.f39861k.h();
        l0[] l0VarArr = dVarH.f35552a;
        int iR = dVarH.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0VarArr[i10].A(x1Var);
        }
        if (!M()) {
            this.f39866m3.G();
        }
        Z0();
        if (l0VarJ1 != null) {
            l0VarJ1.Z0();
        }
        Function1<? super x1, Unit> function1 = this.f39880t3;
        if (function1 != null) {
            function1.invoke(x1Var);
        }
        this.f39868n3.Z();
        if (androidx.compose.ui.k.f39200c && !M() && this.f39866m3.s(m1.b(8))) {
            d1();
        }
        x1Var.J(this);
    }

    @NotNull
    public final i1 A0() {
        return this.f39866m3;
    }

    public final void A1(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            this.f39861k.a(i10 > i11 ? i11 + i13 : (i11 + i12) - 2, this.f39861k.i(i10 > i11 ? i10 + i13 : i10));
        }
        E1();
        g1();
        Z0();
    }

    public final long B0() {
        return this.f39849c;
    }

    public final void C() {
        this.f39862k3 = this.f39860j3;
        this.f39860j3 = g.NotUsed;
        androidx.compose.runtime.collection.d<l0> dVarQ0 = Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            if (l0Var.f39860j3 != g.NotUsed) {
                l0Var.C();
            }
        }
    }

    @Nullable
    public final Function1<x1, Unit> C0() {
        return this.f39880t3;
    }

    public final void C1() {
        this.f39852f = true;
        androidx.compose.runtime.collection.d<l0> dVarQ0 = Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0VarArr[i10].a1();
        }
    }

    @Nullable
    public final Function1<x1, Unit> D0() {
        return this.f39881u3;
    }

    public final void E1() {
        if (!this.f39847a) {
            this.f39871p0 = true;
            return;
        }
        l0 l0VarJ0 = J0();
        if (l0VarJ0 != null) {
            l0VarJ0.E1();
        }
    }

    @NotNull
    public final k1 F0() {
        return this.f39866m3.p();
    }

    public final void F1(int i10, int i11) {
        androidx.compose.ui.layout.i2.a placementScope;
        k1 k1VarE0;
        if (this.f39860j3 == g.NotUsed) {
            D();
        }
        l0 l0VarJ0 = J0();
        if (l0VarJ0 == null || (k1VarE0 = l0VarJ0.e0()) == null || (placementScope = k1VarE0.t2()) == null) {
            placementScope = p0.c(this).getPlacementScope();
        }
        androidx.compose.ui.layout.i2.a.e0(placementScope, v0(), i10, i11, 0.0f, 4, null);
    }

    public final void G() {
        x1 x1Var = this.f39869o;
        if (x1Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            l0 l0VarJ0 = J0();
            sb2.append(l0VarJ0 != null ? F(l0VarJ0, 0, 1, null) : null);
            s0.a.j(sb2.toString());
            throw new kotlin.a0();
        }
        l0 l0VarJ1 = J0();
        if (l0VarJ1 != null) {
            l0VarJ1.X0();
            l0VarJ1.Z0();
            a1 a1VarV0 = v0();
            g gVar = g.NotUsed;
            a1VarV0.T3(gVar);
            x0 x0VarP0 = p0();
            if (x0VarP0 != null) {
                x0VarP0.G3(gVar);
            }
        }
        this.f39868n3.K();
        k1 k1VarY4 = e0().Y4();
        for (k1 k1VarF0 = F0(); !Intrinsics.areEqual(k1VarF0, k1VarY4) && k1VarF0 != null; k1VarF0 = k1VarF0.Y4()) {
            k1VarF0.V5();
        }
        Function1<? super x1, Unit> function1 = this.f39881u3;
        if (function1 != null) {
            function1.invoke(x1Var);
        }
        if (!androidx.compose.ui.k.f39200c && this.f39866m3.s(m1.b(8))) {
            d1();
        }
        this.f39866m3.H();
        this.f39882v = true;
        androidx.compose.runtime.collection.d<l0> dVarH = this.f39861k.h();
        l0[] l0VarArr = dVarH.f35552a;
        int iR = dVarH.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0VarArr[i10].G();
        }
        Unit unit = Unit.f312394a;
        this.f39882v = false;
        this.f39866m3.B();
        x1Var.R(this);
        this.f39869o = null;
        this.f39849c = androidx.compose.ui.unit.q.f42709b.a();
        g2(null);
        this.f39879t = 0;
        v0().v3();
        x0 x0VarP1 = p0();
        if (x0VarP1 != null) {
            x0VarP1.m3();
        }
        if (androidx.compose.ui.k.f39200c && this.f39866m3.s(m1.b(8))) {
            SemanticsConfiguration semanticsConfiguration = this.X;
            this.X = null;
            this.f39884w = false;
            x1Var.getSemanticsOwner().f(this, semanticsConfiguration);
            x1Var.U();
        }
    }

    public final long G0() {
        return this.f39851e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void H() {
        if (m0() == e.Idle && !l0() && !w0() && !M() && J()) {
            i1 i1Var = this.f39866m3;
            int iB = m1.b(256);
            if ((i1Var.j() & iB) != 0) {
                for (androidx.compose.ui.a0.d dVarL = i1Var.l(); dVarL != null; dVarL = dVarL.O8()) {
                    if ((dVarL.T8() & iB) != 0) {
                        androidx.compose.ui.a0.d dVarN = dVarL;
                        androidx.compose.runtime.collection.d dVar = null;
                        while (dVarN != 0) {
                            if (dVarN instanceof v) {
                                v vVar = (v) dVarN;
                                vVar.n0(k.p(vVar, m1.b(256)));
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                                androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                                int i10 = 0;
                                dVarN = dVarN;
                                while (dVarY9 != null) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != 0) {
                                                dVar.d(dVarN);
                                                dVarN = 0;
                                            }
                                            dVar.d(dVarY9);
                                        }
                                    }
                                    dVarY9 = dVarY9.O8();
                                    dVarN = dVarN;
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarN = k.n(dVar);
                        }
                    }
                    if ((dVarL.N8() & iB) == 0) {
                        break;
                    }
                }
            }
        }
    }

    public final boolean H0() {
        return this.f39852f;
    }

    public final boolean H1(@Nullable androidx.compose.ui.unit.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.f39860j3 == g.NotUsed) {
            C();
        }
        return v0().E3(bVar.x());
    }

    @Override // androidx.compose.ui.node.y1
    public boolean H2() {
        return I();
    }

    @Override // androidx.compose.ui.layout.l0
    public boolean I() {
        return this.f39869o != null;
    }

    @Nullable
    public final x1 I0() {
        return this.f39869o;
    }

    @Override // androidx.compose.ui.layout.l0
    public boolean J() {
        return v0().J();
    }

    @Nullable
    public final l0 J0() {
        l0 l0Var = this.f39867n;
        while (l0Var != null && l0Var.f39847a) {
            l0Var = l0Var.f39867n;
        }
        return l0Var;
    }

    public final void J1() {
        int iR = this.f39861k.h().R();
        while (true) {
            iR--;
            if (-1 >= iR) {
                this.f39861k.c();
                return;
            }
            B1(this.f39861k.h().f35552a[iR]);
        }
    }

    @Override // androidx.compose.ui.layout.l0
    public int K() {
        return this.f39848b;
    }

    public final int K0() {
        return v0().N2();
    }

    public final void K1(int i10, int i11) {
        if (!(i11 >= 0)) {
            s0.a.g("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            B1(this.f39861k.h().f35552a[i12]);
            this.f39861k.i(i12);
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    @Override // androidx.compose.ui.layout.l0
    @NotNull
    public List<androidx.compose.ui.layout.g1> L() {
        return this.f39866m3.o();
    }

    @Nullable
    public final androidx.compose.ui.layout.s0 L0() {
        return this.f39870o3;
    }

    public final void L1() {
        if (this.f39860j3 == g.NotUsed) {
            D();
        }
        v0().G3();
    }

    @Override // androidx.compose.ui.layout.l0
    public boolean M() {
        return this.f39886x3;
    }

    public final void M1() {
        if (this.Y) {
            return;
        }
        p0.c(this).k(this);
    }

    public final void N(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar) throws Throwable {
        try {
            F0().T3(k0Var, cVar);
            Unit unit = Unit.f312394a;
        } catch (Throwable th2) {
            Y1(th2);
            throw new kotlin.a0();
        }
    }

    public final void N1(boolean z10) {
        x1 x1Var;
        if (this.f39847a || (x1Var = this.f39869o) == null) {
            return;
        }
        x1Var.A(this, true, z10);
    }

    @NotNull
    public final androidx.compose.runtime.collection.d<l0> O0() {
        if (this.f39871p0) {
            this.Z.r();
            androidx.compose.runtime.collection.d<l0> dVar = this.Z;
            dVar.i(dVar.R(), Q0());
            this.Z.A0(E3);
            this.f39871p0 = false;
        }
        return this.Z;
    }

    public final void P(@NotNull Function1<? super l0, Unit> function1) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            function1.invoke(l0VarArr[i10]);
        }
    }

    public final void P1(boolean z10, boolean z11, boolean z12) {
        if (!(this.f39857i != null)) {
            s0.a.i("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        x1 x1Var = this.f39869o;
        if (x1Var == null || this.f39882v || this.f39847a) {
            return;
        }
        x1Var.u(this, true, z10, z11);
        if (z12) {
            x0 x0VarP0 = p0();
            Intrinsics.checkNotNull(x0VarP0);
            x0VarP0.N2(z10);
        }
    }

    public final void Q(@NotNull Function2<? super Integer, ? super l0, Unit> function2) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            function2.invoke(Integer.valueOf(i10), l0VarArr[i10]);
        }
    }

    @NotNull
    public final androidx.compose.runtime.collection.d<l0> Q0() {
        r2();
        if (this.f39859j == 0) {
            return this.f39861k.h();
        }
        androidx.compose.runtime.collection.d<l0> dVar = this.f39863l;
        Intrinsics.checkNotNull(dVar);
        return dVar;
    }

    public final void R(@NotNull Function1<? super h0, Unit> function1) {
        k1 k1VarF0 = F0();
        k1 k1VarE0 = e0();
        while (k1VarF0 != k1VarE0) {
            Intrinsics.checkNotNull(k1VarF0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            h0 h0Var = (h0) k1VarF0;
            function1.invoke(h0Var);
            k1VarF0 = h0Var.Y4();
        }
    }

    public final void R0(long j10, @NotNull w wVar, int i10, boolean z10) {
        F0().r5(k1.f39796w3.a(), k1.e4(F0(), j10, false, 2, null), wVar, i10, z10);
    }

    public final void R1(boolean z10) {
        x1 x1Var;
        if (!this.f39847a && (x1Var = this.f39869o) != null) {
            x1.C(x1Var, this, false, z10, 2, null);
        }
    }

    public final void S(@NotNull Function1<? super k1, Unit> function1) {
        k1 k1VarY4 = e0().Y4();
        for (k1 k1VarF0 = F0(); !Intrinsics.areEqual(k1VarF0, k1VarY4) && k1VarF0 != null; k1VarF0 = k1VarF0.Y4()) {
            function1.invoke(k1VarF0);
        }
    }

    public final boolean T() {
        androidx.compose.ui.node.b bVarO;
        androidx.compose.ui.node.a aVarX;
        q0 q0Var = this.f39868n3;
        if (!q0Var.b().x().l() && ((bVarO = q0Var.o()) == null || (aVarX = bVarO.x()) == null || !aVarX.l())) {
            return false;
        }
        return true;
    }

    public final void T0(long j10, @NotNull w wVar, int i10, boolean z10) {
        F0().r5(k1.f39796w3.b(), k1.e4(F0(), j10, false, 2, null), wVar, androidx.compose.ui.input.pointer.r0.f39113b.d(), z10);
    }

    public final void T1(boolean z10, boolean z11, boolean z12) {
        x1 x1Var;
        if (this.f39882v || this.f39847a || (x1Var = this.f39869o) == null) {
            return;
        }
        x1.W(x1Var, this, false, z10, z11, 2, null);
        if (z12) {
            v0().X2(z10);
        }
    }

    public final boolean U() {
        return this.f39878s3 != null;
    }

    public final boolean V() {
        return this.f39864l3;
    }

    public final <T> T V0(@NotNull Function0<? extends T> function0) {
        this.f39882v = true;
        T tInvoke = function0.invoke();
        this.f39882v = false;
        return tInvoke;
    }

    public final void V1(@NotNull l0 l0Var) {
        if (h.f39902a[l0Var.m0().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + l0Var.m0());
        }
        if (l0Var.o0()) {
            Q1(l0Var, true, false, false, 6, null);
            return;
        }
        if (l0Var.n0()) {
            l0Var.N1(true);
        }
        if (l0Var.w0()) {
            U1(l0Var, true, false, false, 6, null);
        } else if (l0Var.l0()) {
            l0Var.R1(true);
        }
    }

    public final void W0(int i10, @NotNull l0 l0Var) {
        if (!(l0Var.f39867n == null || l0Var.f39869o == null)) {
            s0.a.i(O(l0Var));
        }
        l0Var.f39867n = this;
        this.f39861k.a(i10, l0Var);
        E1();
        if (l0Var.f39847a) {
            this.f39859j++;
        }
        g1();
        x1 x1Var = this.f39869o;
        if (x1Var != null) {
            l0Var.A(x1Var);
        }
        if (l0Var.f39868n3.c() > 0) {
            q0 q0Var = this.f39868n3;
            q0Var.L(q0Var.c() + 1);
        }
        if (l0Var.f39885w3 > 0) {
            b2(this.f39885w3 + 1);
        }
    }

    @NotNull
    public final List<androidx.compose.ui.layout.z0> X() {
        x0 x0VarP0 = p0();
        Intrinsics.checkNotNull(x0VarP0);
        return x0VarP0.M1();
    }

    public final void X0() {
        k1 k1VarF0 = f0();
        if (k1VarF0 != null) {
            k1VarF0.t5();
            return;
        }
        l0 l0VarJ0 = J0();
        if (l0VarJ0 != null) {
            l0VarJ0.X0();
        }
    }

    public final void X1() {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            g gVar = l0Var.f39862k3;
            l0Var.f39860j3 = gVar;
            if (gVar != g.NotUsed) {
                l0Var.X1();
            }
        }
    }

    @NotNull
    public final List<androidx.compose.ui.layout.z0> Y() {
        return v0().S1();
    }

    public final void Y0() {
        k1 k1VarF0 = F0();
        k1 k1VarE0 = e0();
        while (k1VarF0 != k1VarE0) {
            Intrinsics.checkNotNull(k1VarF0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            h0 h0Var = (h0) k1VarF0;
            w1 w1VarH4 = h0Var.H4();
            if (w1VarH4 != null) {
                w1VarH4.invalidate();
            }
            k1VarF0 = h0Var.Y4();
        }
        w1 w1VarH5 = e0().H4();
        if (w1VarH5 != null) {
            w1VarH5.invalidate();
        }
    }

    @NotNull
    public final Void Y1(@NotNull Throwable th2) throws Throwable {
        androidx.compose.runtime.tooling.h hVarM0 = M0();
        if (hVarM0 == null) {
            throw th2;
        }
        hVarM0.a(th2, this);
        throw th2;
    }

    @NotNull
    public final List<l0> Z() {
        return Q0().q();
    }

    public final void Z0() {
        if (this.f39847a) {
            l0 l0VarJ0 = J0();
            if (l0VarJ0 != null) {
                l0VarJ0.Z0();
                return;
            }
            return;
        }
        if (this.f39857i != null) {
            Q1(this, false, false, false, 7, null);
        } else {
            U1(this, false, false, false, 7, null);
        }
    }

    public final void Z1(boolean z10) {
        this.f39864l3 = z10;
    }

    @Override // androidx.compose.ui.node.g
    @NotNull
    public androidx.compose.ui.a0 a() {
        return this.f39876r3;
    }

    public final int a0() {
        return this.f39879t;
    }

    public final void a2(int i10) {
        this.f39879t = i10;
    }

    @Override // androidx.compose.ui.node.g
    public void b(@NotNull androidx.compose.ui.unit.w wVar) {
        if (this.f39854g3 != wVar) {
            this.f39854g3 = wVar;
            D1();
            for (androidx.compose.ui.a0.d dVarL = this.f39866m3.l(); dVarL != null; dVarL = dVarL.O8()) {
                dVarL.z5();
            }
        }
    }

    @NotNull
    public final List<l0> b0() {
        return this.f39861k.h().q();
    }

    public final void b1() {
        if (this.f39885w3 == 0 || l0() || w0() || this.f39883v3) {
            return;
        }
        p0.c(this).f(this);
    }

    public final void b2(int i10) {
        l0 l0VarJ0;
        l0 l0VarJ1;
        int i11 = this.f39885w3;
        if (i11 != i10) {
            if (i10 > 0 && i11 == 0 && (l0VarJ1 = J0()) != null) {
                l0VarJ1.b2(l0VarJ1.f39885w3 + 1);
            }
            if (i10 == 0 && this.f39885w3 > 0 && (l0VarJ0 = J0()) != null) {
                l0VarJ0.b2(l0VarJ0.f39885w3 - 1);
            }
            this.f39885w3 = i10;
        }
    }

    @Override // androidx.compose.runtime.x
    public void c() {
        androidx.compose.ui.viewinterop.b bVar = this.f39877s;
        if (bVar != null) {
            bVar.c();
        }
        androidx.compose.ui.layout.s0 s0Var = this.f39870o3;
        if (s0Var != null) {
            s0Var.c();
        }
        k1 k1VarY4 = e0().Y4();
        for (k1 k1VarF0 = F0(); !Intrinsics.areEqual(k1VarF0, k1VarY4) && k1VarF0 != null; k1VarF0 = k1VarF0.Y4()) {
            k1VarF0.j6();
        }
    }

    public final int c0() {
        return this.f39885w3;
    }

    public final void c1() {
        this.f39868n3.B();
    }

    public final void c2(boolean z10) {
        this.f39875q3 = z10;
    }

    @Override // androidx.compose.ui.node.g
    public void d(int i10) {
        this.f39853g = i10;
    }

    public final boolean d0() {
        long jG4 = e0().G4();
        if (!androidx.compose.ui.unit.b.n(jG4) || !androidx.compose.ui.unit.b.l(jG4)) {
            return false;
        }
        int i10 = 6 >> 1;
        return true;
    }

    public final void d1() {
        if (this.Y) {
            return;
        }
        if (!androidx.compose.ui.k.f39200c) {
            this.X = null;
            p0.c(this).U();
        } else {
            if (this.f39866m3.z() || U()) {
                this.f39884w = true;
                return;
            }
            SemanticsConfiguration semanticsConfiguration = this.X;
            this.X = B();
            this.f39884w = false;
            x1 x1VarC = p0.c(this);
            x1VarC.getSemanticsOwner().f(this, semanticsConfiguration);
            x1VarC.U();
        }
    }

    public final void d2(@Nullable androidx.compose.ui.viewinterop.b bVar) {
        this.f39877s = bVar;
    }

    @Override // androidx.compose.ui.node.g
    public void e(@NotNull androidx.compose.ui.unit.d dVar) {
        if (Intrinsics.areEqual(this.f39873p2, dVar)) {
            return;
        }
        this.f39873p2 = dVar;
        D1();
        for (androidx.compose.ui.a0.d dVarL = this.f39866m3.l(); dVarL != null; dVarL = dVarL.O8()) {
            dVarL.l0();
        }
    }

    @NotNull
    public final k1 e0() {
        return this.f39866m3.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final void e1(boolean z10) {
        l0 l0VarJ0;
        if (z10 && (l0VarJ0 = J0()) != null) {
            l0VarJ0.X0();
        }
        d1();
        U1(this, false, false, false, 7, null);
        i1 i1Var = this.f39866m3;
        int iB = m1.b(2);
        if ((i1Var.j() & iB) != 0) {
            for (androidx.compose.ui.a0.d dVarL = i1Var.l(); dVarL != null; dVarL = dVarL.O8()) {
                if ((dVarL.T8() & iB) != 0) {
                    androidx.compose.ui.a0.d dVarN = dVarL;
                    androidx.compose.runtime.collection.d dVar = null;
                    while (dVarN != 0) {
                        if (dVarN instanceof g0) {
                            w1 w1VarH4 = k.p((g0) dVarN, m1.b(2)).H4();
                            if (w1VarH4 != null) {
                                w1VarH4.invalidate();
                            }
                        } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                            androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                            int i10 = 0;
                            dVarN = dVarN;
                            while (dVarY9 != null) {
                                if ((dVarY9.T8() & iB) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarN = dVarY9;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                        }
                                        if (dVarN != 0) {
                                            dVar.d(dVarN);
                                            dVarN = 0;
                                        }
                                        dVar.d(dVarY9);
                                    }
                                }
                                dVarY9 = dVarY9.O8();
                                dVarN = dVarN;
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarN = k.n(dVar);
                    }
                }
                if ((dVarL.N8() & iB) == 0) {
                    break;
                }
            }
        }
        androidx.compose.runtime.collection.d<l0> dVarQ0 = Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i11 = 0; i11 < iR; i11++) {
            l0VarArr[i11].e1(false);
        }
    }

    public final void e2(@NotNull g gVar) {
        this.f39860j3 = gVar;
    }

    @Override // androidx.compose.ui.node.g
    public int f() {
        return this.f39853g;
    }

    @Nullable
    public final k1 f0() {
        if (this.f39875q3) {
            k1 k1VarE0 = e0();
            k1 k1VarA5 = F0().a5();
            this.f39874p3 = null;
            while (!Intrinsics.areEqual(k1VarE0, k1VarA5)) {
                if ((k1VarE0 != null ? k1VarE0.H4() : null) != null) {
                    this.f39874p3 = k1VarE0;
                    break;
                }
                k1VarE0 = k1VarE0 != null ? k1VarE0.a5() : null;
            }
        }
        k1 k1Var = this.f39874p3;
        if (k1Var == null || k1Var.H4() != null) {
            return k1Var;
        }
        s0.a.j("layer was not set");
        throw new kotlin.a0();
    }

    public final void f2(long j10) {
        this.f39850d = j10;
    }

    @Override // androidx.compose.runtime.x
    public void g() {
        androidx.compose.ui.viewinterop.b bVar = this.f39877s;
        if (bVar != null) {
            bVar.g();
        }
        androidx.compose.ui.layout.s0 s0Var = this.f39870o3;
        if (s0Var != null) {
            s0Var.g();
        }
        this.f39886x3 = true;
        W1();
        if (I()) {
            if (androidx.compose.ui.k.f39200c) {
                this.X = null;
                this.f39884w = false;
            } else {
                d1();
            }
        }
        x1 x1Var = this.f39869o;
        if (x1Var != null) {
            x1Var.V(this);
        }
    }

    public final boolean g0() {
        return this.f39875q3;
    }

    @Override // androidx.compose.ui.layout.l0, androidx.compose.ui.node.g
    @NotNull
    public androidx.compose.ui.unit.d getDensity() {
        return this.f39873p2;
    }

    @Override // androidx.compose.ui.layout.l0
    public int getHeight() {
        return this.f39868n3.i();
    }

    @Override // androidx.compose.ui.layout.l0, androidx.compose.ui.node.g
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.f39854g3;
    }

    @Override // androidx.compose.ui.layout.l0, androidx.compose.ui.node.g
    @NotNull
    public o4 getViewConfiguration() {
        return this.f39856h3;
    }

    @Override // androidx.compose.ui.layout.l0
    public int getWidth() {
        return this.f39868n3.A();
    }

    @Override // androidx.compose.ui.layout.p2
    public void h() {
        l0 l0Var;
        if (this.f39857i != null) {
            int i10 = 4 << 0;
            l0Var = this;
            Q1(l0Var, false, false, false, 5, null);
        } else {
            l0Var = this;
            U1(l0Var, false, false, false, 5, null);
        }
        androidx.compose.ui.unit.b bVarJ = l0Var.f39868n3.j();
        if (bVarJ != null) {
            x1 x1Var = l0Var.f39869o;
            if (x1Var != null) {
                x1Var.q(l0Var, bVarJ.x());
            }
        } else {
            x1 x1Var2 = l0Var.f39869o;
            if (x1Var2 != null) {
                x1.d(x1Var2, false, 1, null);
            }
        }
    }

    @Nullable
    public final androidx.compose.ui.viewinterop.b h0() {
        return this.f39877s;
    }

    public final boolean h1() {
        return v0().Z2();
    }

    public final void h2(boolean z10) {
        this.f39883v3 = z10;
    }

    @Override // androidx.compose.ui.node.g
    public void i(@NotNull androidx.compose.ui.layout.a1 a1Var) {
        if (Intrinsics.areEqual(this.f39872p1, a1Var)) {
            return;
        }
        this.f39872p1 = a1Var;
        c0 c0Var = this.H1;
        if (c0Var != null) {
            c0Var.l(s());
        }
        Z0();
    }

    @NotNull
    public final g i0() {
        return this.f39860j3;
    }

    @Nullable
    public final Boolean i1() {
        x0 x0VarP0 = p0();
        if (x0VarP0 != null) {
            return Boolean.valueOf(x0VarP0.J());
        }
        return null;
    }

    public final void i2(long j10) {
        this.f39849c = j10;
    }

    @Override // androidx.compose.ui.node.g
    public void j(@NotNull androidx.compose.ui.a0 a0Var) {
        if (!(!this.f39847a || a() == androidx.compose.ui.a0.E)) {
            s0.a.g("Modifiers are not supported on virtual LayoutNodes");
        }
        if (M()) {
            s0.a.g("modifier is updated when deactivated");
        }
        if (!I()) {
            this.f39878s3 = a0Var;
            return;
        }
        z(a0Var);
        if (this.f39884w) {
            d1();
        }
    }

    public final long j0() {
        return this.f39850d;
    }

    public final boolean j1() {
        return this.f39884w;
    }

    public final void j2(@Nullable Function1<? super x1, Unit> function1) {
        this.f39880t3 = function1;
    }

    @Override // androidx.compose.ui.node.b0
    @androidx.compose.ui.t
    @Nullable
    public View k() {
        androidx.compose.ui.viewinterop.b bVar = this.f39877s;
        if (bVar != null) {
            return bVar.getInteropView();
        }
        return null;
    }

    @NotNull
    public final q0 k0() {
        return this.f39868n3;
    }

    public final boolean k1() {
        return this.f39855h;
    }

    public final void k2(@Nullable Function1<? super x1, Unit> function1) {
        this.f39881u3 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.node.g
    public void l(@org.jetbrains.annotations.NotNull androidx.compose.runtime.b1 r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.l0.l(androidx.compose.runtime.b1):void");
    }

    public final boolean l0() {
        return this.f39868n3.m();
    }

    public final boolean l1(@Nullable androidx.compose.ui.unit.b bVar) {
        if (bVar == null || this.f39857i == null) {
            return false;
        }
        x0 x0VarP0 = p0();
        Intrinsics.checkNotNull(x0VarP0);
        return x0VarP0.s3(bVar.x());
    }

    public final void l2(long j10) {
        this.f39851e = j10;
    }

    @Override // androidx.compose.ui.node.g
    @NotNull
    public androidx.compose.runtime.b1 m() {
        return this.f39858i3;
    }

    @NotNull
    public final e m0() {
        return this.f39868n3.n();
    }

    public final void m2(boolean z10) {
        this.f39852f = z10;
    }

    @Override // androidx.compose.ui.layout.l0
    @NotNull
    public androidx.compose.ui.layout.g0 n() {
        return e0();
    }

    public final boolean n0() {
        return this.f39868n3.r();
    }

    public final void n1() {
        if (this.f39860j3 == g.NotUsed) {
            D();
        }
        x0 x0VarP0 = p0();
        Intrinsics.checkNotNull(x0VarP0);
        x0VarP0.v3();
    }

    public void n2(int i10) {
        this.f39848b = i10;
    }

    public final boolean o0() {
        return this.f39868n3.t();
    }

    public final void o1() {
        this.f39868n3.D();
    }

    public final void o2(boolean z10) {
        this.f39884w = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // androidx.compose.ui.node.g
    public void p(@NotNull o4 o4Var) {
        if (Intrinsics.areEqual(this.f39856h3, o4Var)) {
            return;
        }
        this.f39856h3 = o4Var;
        i1 i1Var = this.f39866m3;
        int iB = m1.b(16);
        if ((i1Var.j() & iB) != 0) {
            for (androidx.compose.ui.a0.d dVarL = i1Var.l(); dVarL != null; dVarL = dVarL.O8()) {
                if ((dVarL.T8() & iB) != 0) {
                    androidx.compose.ui.a0.d dVarN = dVarL;
                    androidx.compose.runtime.collection.d dVar = null;
                    while (dVarN != 0) {
                        if (dVarN instanceof d2) {
                            ((d2) dVarN).u8();
                        } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                            androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                            int i10 = 0;
                            dVarN = dVarN;
                            while (dVarY9 != null) {
                                if ((dVarY9.T8() & iB) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarN = dVarY9;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                        }
                                        if (dVarN != 0) {
                                            dVar.d(dVarN);
                                            dVarN = 0;
                                        }
                                        dVar.d(dVarY9);
                                    }
                                }
                                dVarY9 = dVarY9.O8();
                                dVarN = dVarN;
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarN = k.n(dVar);
                    }
                }
                if ((dVarL.N8() & iB) == 0) {
                    return;
                }
            }
        }
    }

    @Nullable
    public final x0 p0() {
        return this.f39868n3.u();
    }

    public final void p1() {
        this.f39868n3.E();
    }

    public final void p2(@Nullable androidx.compose.ui.layout.s0 s0Var) {
        this.f39870o3 = s0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // androidx.compose.ui.node.x1.b
    public void q() {
        k1 k1VarE0 = e0();
        int iB = m1.b(128);
        boolean zJ = n1.j(iB);
        androidx.compose.ui.a0.d dVarV4 = k1VarE0.V4();
        if (!zJ && (dVarV4 = dVarV4.W8()) == null) {
            return;
        }
        for (androidx.compose.ui.a0.d dVarM5 = k1VarE0.m5(zJ); dVarM5 != null && (dVarM5.N8() & iB) != 0; dVarM5 = dVarM5.O8()) {
            if ((dVarM5.T8() & iB) != 0) {
                androidx.compose.ui.a0.d dVarN = dVarM5;
                androidx.compose.runtime.collection.d dVar = null;
                while (dVarN != 0) {
                    if (dVarN instanceof f0) {
                        ((f0) dVarN).x(e0());
                    } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                        androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                        int i10 = 0;
                        dVarN = dVarN;
                        while (dVarY9 != null) {
                            if ((dVarY9.T8() & iB) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    dVarN = dVarY9;
                                } else {
                                    if (dVar == null) {
                                        dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                    }
                                    if (dVarN != 0) {
                                        dVar.d(dVarN);
                                        dVarN = 0;
                                    }
                                    dVar.d(dVarY9);
                                }
                            }
                            dVarY9 = dVarY9.O8();
                            dVarN = dVarN;
                        }
                        if (i10 == 1) {
                        }
                    }
                    dVarN = k.n(dVar);
                }
            }
            if (dVarM5 == dVarV4) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.semantics.p
    @Nullable
    public SemanticsConfiguration q0() {
        if (!I() || M() || !this.f39866m3.s(m1.b(8))) {
            return null;
        }
        if (!androidx.compose.ui.k.f39200c && this.X == null) {
            this.X = B();
        }
        return this.X;
    }

    public final void q1() {
        this.f39868n3.F();
    }

    public final void q2(boolean z10) {
        this.f39855h = z10;
    }

    @Override // androidx.compose.runtime.x
    public void r() {
        if (!I()) {
            s0.a.g("onReuse is only expected on attached node");
        }
        androidx.compose.ui.viewinterop.b bVar = this.f39877s;
        if (bVar != null) {
            bVar.r();
        }
        androidx.compose.ui.layout.s0 s0Var = this.f39870o3;
        if (s0Var != null) {
            s0Var.r();
        }
        this.Y = false;
        if (M()) {
            this.f39886x3 = false;
            if (!androidx.compose.ui.k.f39200c) {
                d1();
            }
        } else {
            W1();
        }
        int iK = K();
        n2(androidx.compose.ui.semantics.t.d());
        x1 x1Var = this.f39869o;
        if (x1Var != null) {
            x1Var.E(this, iK);
        }
        this.f39866m3.A();
        this.f39866m3.G();
        if (androidx.compose.ui.k.f39200c && this.f39866m3.s(m1.b(8))) {
            d1();
        }
        V1(this);
        x1 x1Var2 = this.f39869o;
        if (x1Var2 != null) {
            x1Var2.g(this, iK);
        }
    }

    @Override // androidx.compose.ui.semantics.p
    @NotNull
    public List<androidx.compose.ui.semantics.p> r0() {
        return Z();
    }

    public final void r1() {
        this.f39868n3.G();
    }

    public final void r2() {
        if (this.f39859j > 0) {
            G1();
        }
    }

    @Override // androidx.compose.ui.node.g
    @NotNull
    public androidx.compose.ui.layout.a1 s() {
        return this.f39872p1;
    }

    @Override // androidx.compose.ui.semantics.p
    public boolean s0() {
        return F0().z5();
    }

    public final int s1(int i10) {
        return E0().c(i10);
    }

    @Nullable
    public final l0 t0() {
        return this.f39857i;
    }

    public final int t1(int i10) {
        return E0().d(i10);
    }

    @NotNull
    public String toString() {
        return w2.b(this, null) + " children: " + Z().size() + " measurePolicy: " + s() + " deactivated: " + M();
    }

    @NotNull
    public final n0 u0() {
        return p0.c(this).getSharedDrawScope();
    }

    public final int u1(int i10) {
        return E0().e(i10);
    }

    @NotNull
    public final a1 v0() {
        return this.f39868n3.v();
    }

    public final int v1(int i10) {
        return E0().f(i10);
    }

    public final boolean w0() {
        return this.f39868n3.w();
    }

    public final int w1(int i10) {
        return E0().g(i10);
    }

    @NotNull
    public final g x0() {
        return v0().A2();
    }

    public final int x1(int i10) {
        return E0().h(i10);
    }

    @NotNull
    public final g y0() {
        g gVarW2;
        x0 x0VarP0 = p0();
        if (x0VarP0 != null && (gVarW2 = x0VarP0.w2()) != null) {
            return gVarW2;
        }
        return g.NotUsed;
    }

    public final int y1(int i10) {
        return E0().i(i10);
    }

    public final boolean z0() {
        return this.f39883v3;
    }

    public final int z1(int i10) {
        return E0().j(i10);
    }

    public l0(boolean z10, int i10) {
        this.f39847a = z10;
        this.f39848b = i10;
        androidx.compose.ui.unit.q.a aVar = androidx.compose.ui.unit.q.f42709b;
        this.f39849c = aVar.a();
        this.f39850d = androidx.compose.ui.unit.u.f42720b.a();
        this.f39851e = aVar.a();
        boolean z11 = false | true;
        this.f39852f = true;
        this.f39861k = new g1<>(new androidx.compose.runtime.collection.d(new l0[16], 0), new i());
        this.Z = new androidx.compose.runtime.collection.d<>(new l0[16], 0);
        this.f39871p0 = true;
        this.f39872p1 = A3;
        this.f39873p2 = p0.f39955b;
        this.f39854g3 = androidx.compose.ui.unit.w.Ltr;
        this.f39856h3 = D3;
        this.f39858i3 = androidx.compose.runtime.b1.B.a();
        g gVar = g.NotUsed;
        this.f39860j3 = gVar;
        this.f39862k3 = gVar;
        this.f39866m3 = new i1(this);
        this.f39868n3 = new q0(this);
        this.f39875q3 = true;
        this.f39876r3 = androidx.compose.ui.a0.E;
    }

    @Override // androidx.compose.ui.layout.l0
    @Nullable
    public androidx.compose.ui.semantics.p o() {
        return J0();
    }

    public /* synthetic */ l0(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? androidx.compose.ui.semantics.t.d() : i10);
    }
}
