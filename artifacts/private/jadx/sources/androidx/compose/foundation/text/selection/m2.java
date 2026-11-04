package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.r6;
import androidx.compose.foundation.text.k5;
import androidx.compose.foundation.text.x6;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
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
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 10 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1337:1\n747#1,3:1364\n750#1,2:1370\n748#1,9:1376\n757#1,9:1388\n766#1:1398\n747#1,3:1438\n750#1,2:1444\n748#1,9:1450\n757#1,9:1462\n766#1:1472\n747#1,3:1474\n750#1,2:1480\n748#1,9:1486\n757#1,9:1498\n766#1:1508\n85#2:1338\n117#2,2:1339\n85#2:1341\n85#2:1342\n117#2,2:1343\n85#2:1345\n117#2,2:1346\n85#2:1348\n117#2,2:1349\n85#2:1351\n117#2,2:1352\n85#2:1354\n117#2,2:1355\n85#2:1357\n117#2,2:1358\n85#2:1361\n117#2,2:1362\n1#3:1360\n1#3:1526\n388#4,3:1367\n391#4,4:1372\n388#4,3:1441\n391#4,4:1446\n388#4,3:1477\n391#4,4:1482\n388#4,7:1509\n71#5,3:1385\n75#5:1397\n270#5,2:1410\n35#5,5:1412\n272#5:1417\n88#5:1418\n35#5,5:1419\n89#5:1424\n35#5,5:1425\n103#5:1430\n35#5,5:1431\n104#5:1436\n71#5,3:1459\n75#5:1471\n71#5,3:1495\n75#5:1507\n71#5,5:1516\n440#5,2:1521\n35#5,3:1523\n39#5:1527\n442#5:1528\n71#5,5:1535\n35#5,5:1541\n103#5:1546\n35#5,5:1547\n104#5:1552\n103#5:1553\n35#5,5:1554\n104#5:1559\n278#6:1399\n278#6:1400\n278#6:1540\n273#6:1570\n109#7,5:1401\n97#7,4:1406\n85#7,5:1560\n1574#8:1437\n1574#8:1473\n57#9,6:1529\n425#10:1565\n425#10:1571\n425#10:1572\n54#11:1566\n59#11:1568\n85#12:1567\n90#12:1569\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n416#1:1364,3\n416#1:1370,2\n416#1:1376,9\n416#1:1388,9\n416#1:1398\n673#1:1438,3\n673#1:1444,2\n673#1:1450,9\n673#1:1462,9\n673#1:1472\n704#1:1474,3\n704#1:1480,2\n704#1:1486,9\n704#1:1498,9\n704#1:1508\n145#1:1338\n145#1:1339,2\n176#1:1341\n213#1:1342\n213#1:1343,2\n219#1:1345\n219#1:1346,2\n226#1:1348\n226#1:1349,2\n234#1:1351\n234#1:1352,2\n242#1:1354\n242#1:1355,2\n249#1:1357\n249#1:1358,2\n272#1:1361\n272#1:1362,2\n838#1:1526\n416#1:1367,3\n416#1:1372,4\n673#1:1441,3\n673#1:1446,4\n704#1:1477,3\n704#1:1482,4\n749#1:1509,7\n416#1:1385,3\n416#1:1397\n550#1:1410,2\n550#1:1412,5\n550#1:1417\n573#1:1418\n573#1:1419,5\n573#1:1424\n600#1:1425,5\n660#1:1430\n660#1:1431,5\n660#1:1436\n673#1:1459,3\n673#1:1471\n704#1:1495,3\n704#1:1507\n756#1:1516,5\n838#1:1521,2\n838#1:1523,3\n838#1:1527\n838#1:1528\n1103#1:1535,5\n1121#1:1541,5\n1136#1:1546\n1136#1:1547,5\n1136#1:1552\n1148#1:1553\n1148#1:1554,5\n1148#1:1559\n515#1:1399\n527#1:1400\n1110#1:1540\n316#1:1570\n539#1:1401,5\n540#1:1406,4\n186#1:1560,5\n672#1:1437\n703#1:1473\n853#1:1529,6\n295#1:1565\n381#1:1571\n398#1:1572\n305#1:1566\n305#1:1568\n305#1:1567\n305#1:1569\n*E\n"})
public final class m2 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f21219z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i3 f21220a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private p0.a f21224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Function1<? super androidx.compose.ui.text.f, Unit> f21225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.platform.e4 f21226g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private n0.g f21231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g0 f21232m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21239t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private o1 f21240u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f21241v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.s0 f21242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private x f21243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f21244y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<h0> f21221b = d7.g(null, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<Boolean> f21222c = d7.g(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function1<? super h0, Unit> f21223d = new Function1() { // from class: androidx.compose.foundation.text.selection.h2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return m2.F0(this.f21101a, (h0) obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.text.contextmenu.modifier.o f21227h = new androidx.compose.foundation.text.contextmenu.modifier.p();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.focus.g0 f21228i = new androidx.compose.ui.focus.g0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21229j = d7.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final n7 f21230k = w6.e(new Function0() { // from class: androidx.compose.foundation.text.selection.i2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m2.N(this.f21159a);
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21233n = w6.k(Unit.f312394a, w6.o());

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1", f = "SelectionManager.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21245a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return m2.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21245a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m2 m2Var = m2.this;
                this.f21245a = 1;
                if (m2Var.C0(this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2", f = "SelectionManager.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21247a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return m2.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21247a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m2 m2Var = m2.this;
                this.f21247a = 1;
                if (m2Var.C0(this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n1#1,102:1\n1107#2:103\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.x1 f21249a;

        public c(androidx.collection.x1 x1Var) {
            this.f21249a = x1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f21249a.n(((Number) t10).longValue())), Integer.valueOf(this.f21249a.n(((Number) t11).longValue())));
        }
    }

    @SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager$handleDragObserver$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,1337:1\n278#2:1338\n278#2:1349\n72#3,5:1339\n72#3,5:1344\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager$handleDragObserver$1\n*L\n888#1:1338\n923#1:1349\n906#1:1339,5\n916#1:1344,5\n*E\n"})
    public static final class d implements k5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m2 f21251b;

        d(boolean z10, m2 m2Var) {
            this.f21250a = z10;
            this.f21251b = m2Var;
        }

        private final void f() {
            this.f21251b.c1(true);
            this.f21251b.Q0(null);
            this.f21251b.N0(null);
        }

        @Override // androidx.compose.foundation.text.k5
        public void a() {
            f();
        }

        @Override // androidx.compose.foundation.text.k5
        public void b(long j10) {
            androidx.compose.ui.layout.g0 g0VarM;
            n0.g gVarS0 = this.f21250a ? this.f21251b.s0() : this.f21251b.b0();
            if (gVarS0 != null) {
                gVarS0.B();
                h0 h0VarN0 = this.f21251b.n0();
                if (h0VarN0 != null) {
                    e0 e0VarP = this.f21251b.P(this.f21250a ? h0VarN0.h() : h0VarN0.f());
                    if (e0VarP != null && (g0VarM = e0VarP.M()) != null) {
                        long jL = e0VarP.l(h0VarN0, this.f21250a);
                        if ((9223372034707292159L & jL) == n0.d.f332689d) {
                            return;
                        }
                        long jA = m1.a(jL);
                        m2 m2Var = this.f21251b;
                        m2Var.N0(n0.g.d(m2Var.G0().r0(g0VarM, jA)));
                        this.f21251b.Q0(this.f21250a ? androidx.compose.foundation.text.k3.SelectionStart : androidx.compose.foundation.text.k3.SelectionEnd);
                        this.f21251b.c1(false);
                    }
                }
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void c(long j10) {
            if (this.f21251b.Z() == null) {
                return;
            }
            m2 m2Var = this.f21251b;
            m2Var.P0(n0.g.w(m2Var.Y(), j10));
            long jW = n0.g.w(this.f21251b.X(), this.f21251b.Y());
            if (this.f21251b.m1(n0.g.d(jW), this.f21251b.X(), this.f21250a, n0.f21271a.l())) {
                this.f21251b.O0(jW);
                this.f21251b.P0(n0.g.f332700b.e());
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void d(long j10) {
            if (this.f21251b.Z() == null) {
                return;
            }
            h0 h0VarN0 = this.f21251b.n0();
            Intrinsics.checkNotNull(h0VarN0);
            e0 e0VarN = this.f21251b.f21220a.y().n((this.f21250a ? h0VarN0.h() : h0VarN0.f()).h());
            if (e0VarN == null) {
                androidx.compose.foundation.internal.e.j("SelectionRegistrar should contain the current selection's selectableIds");
                throw new kotlin.a0();
            }
            e0 e0Var = e0VarN;
            androidx.compose.ui.layout.g0 g0VarM = e0Var.M();
            if (g0VarM == null) {
                androidx.compose.foundation.internal.e.j("Current selectable should have layout coordinates.");
                throw new kotlin.a0();
            }
            long jL = e0Var.l(h0VarN0, this.f21250a);
            if ((9223372034707292159L & jL) == n0.d.f332689d) {
                return;
            }
            long jA = m1.a(jL);
            m2 m2Var = this.f21251b;
            m2Var.O0(m2Var.G0().r0(g0VarM, jA));
            this.f21251b.P0(n0.g.f332700b.e());
        }

        @Override // androidx.compose.foundation.text.k5
        public void e() {
            f();
        }

        @Override // androidx.compose.foundation.text.k5
        public void onCancel() {
            f();
        }
    }

    static final class e implements Function1<androidx.compose.ui.input.key.c, Boolean> {
        e() {
        }

        public final Boolean c(KeyEvent keyEvent) {
            boolean z10;
            if (b3.x(keyEvent)) {
                m2.this.M();
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return c(cVar.h());
        }
    }

    static final class f implements PointerInputEventHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f21254b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", i = {0}, l = {979, 985}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21255a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f21256b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m2 f21257c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f21258d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m2 m2Var, Function0<Unit> function0, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f21257c = m2Var;
                this.f21258d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f21257c, this.f21258d, dVar);
                aVar.f21256b = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
            
                if (r12 == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    r10 = 1
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r10 = 6
                    int r1 = r11.f21255a
                    r2 = 4
                    r2 = 2
                    r10 = 7
                    r3 = 1
                    r10 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1a
                    kotlin.ResultKt.m(r12)
                    r7 = r11
                    r7 = r11
                    r10 = 0
                    goto L61
                L1a:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    r10 = 0
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r10 = 5
                    r11.<init>(r12)
                    r10 = 7
                    throw r11
                L25:
                    r10 = 7
                    java.lang.Object r1 = r11.f21256b
                    r10 = 6
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.ResultKt.m(r12)
                    r7 = r11
                    r10 = 0
                    goto L4d
                L31:
                    r10 = 3
                    kotlin.ResultKt.m(r12)
                    java.lang.Object r12 = r11.f21256b
                    r4 = r12
                    r10 = 3
                    androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                    r11.f21256b = r4
                    r11.f21255a = r3
                    r5 = 0
                    r10 = 0
                    r6 = 0
                    r8 = 2
                    r9 = 0
                    r7 = r11
                    java.lang.Object r12 = androidx.compose.foundation.gestures.c5.j(r4, r5, r6, r7, r8, r9)
                    if (r12 != r0) goto L4c
                    goto L60
                L4c:
                    r1 = r4
                L4d:
                    r10 = 4
                    androidx.compose.ui.input.pointer.c0 r12 = (androidx.compose.ui.input.pointer.c0) r12
                    androidx.compose.ui.input.pointer.s r11 = androidx.compose.ui.input.pointer.s.Initial
                    r3 = 2
                    r3 = 0
                    r10 = 0
                    r7.f21256b = r3
                    r10 = 2
                    r7.f21255a = r2
                    java.lang.Object r12 = androidx.compose.foundation.gestures.x1.u(r1, r12, r11, r7)
                    if (r12 != r0) goto L61
                L60:
                    return r0
                L61:
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r11 = r12.booleanValue()
                    if (r11 != 0) goto L79
                    r10 = 1
                    androidx.compose.foundation.text.selection.m2 r11 = r7.f21257c
                    r10 = 6
                    boolean r11 = androidx.compose.foundation.text.selection.m2.D(r11)
                    r10 = 5
                    if (r11 != 0) goto L79
                    kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.f21258d
                    r11.invoke()
                L79:
                    r10 = 2
                    kotlin.Unit r11 = kotlin.Unit.f312394a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.m2.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        f(Function0<Unit> function0) {
            this.f21254b = function0;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objE = androidx.compose.foundation.gestures.e3.e(l0Var, new a(m2.this, this.f21254b, null), dVar);
            return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2", f = "SelectionManager.kt", i = {}, l = {436}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21259a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<CharSequence> f21261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<androidx.compose.ui.text.w3> f21262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f21263e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.jvm.internal.i1.h<CharSequence> hVar, kotlin.jvm.internal.i1.h<androidx.compose.ui.text.w3> hVar2, kotlin.jvm.internal.i1.g gVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f21261c = hVar;
            this.f21262d = hVar2;
            this.f21263e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m2.this.new g(this.f21261c, this.f21262d, this.f21263e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0083  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.compose.ui.text.w3 w3Var;
            e0 e0VarN;
            androidx.compose.ui.text.p3 p3VarK;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21259a;
            if (i10 == 0) {
                ResultKt.m(obj);
                x xVarI0 = m2.this.i0();
                if (xVarI0 != null) {
                    CharSequence charSequence = this.f21261c.f312751a;
                    long jR = this.f21262d.f312751a.r();
                    this.f21259a = 1;
                    obj = xVarI0.b(charSequence, jR, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    w3Var = null;
                }
                if (w3Var != null && !Intrinsics.areEqual(w3Var, this.f21262d.f312751a) && (e0VarN = m2.this.f21220a.y().n(this.f21263e.f312750a)) != null && e0VarN.getText() == this.f21261c.f312751a) {
                    p3VarK = e0VarN.k();
                    if (p3VarK == null) {
                        return Unit.f312394a;
                    }
                    h0 h0Var = new h0(new h0.a(n1.a(p3VarK, androidx.compose.ui.text.w3.n(w3Var.r())), androidx.compose.ui.text.w3.n(w3Var.r()), this.f21263e.f312750a), new h0.a(n1.a(p3VarK, androidx.compose.ui.text.w3.i(w3Var.r())), androidx.compose.ui.text.w3.i(w3Var.r()), this.f21263e.f312750a), false, 4, null);
                    m2.this.f21220a.J(androidx.collection.y0.k(this.f21263e.f312750a, h0Var));
                    m2.this.h0().invoke(h0Var);
                    m2.this.a1(null);
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            w3Var = (androidx.compose.ui.text.w3) obj;
            if (w3Var != null) {
                p3VarK = e0VarN.k();
                if (p3VarK == null) {
                    return Unit.f312394a;
                }
                h0 h0Var2 = new h0(new h0.a(n1.a(p3VarK, androidx.compose.ui.text.w3.n(w3Var.r())), androidx.compose.ui.text.w3.n(w3Var.r()), this.f21263e.f312750a), new h0.a(n1.a(p3VarK, androidx.compose.ui.text.w3.i(w3Var.r())), androidx.compose.ui.text.w3.i(w3Var.r()), this.f21263e.f312750a), false, 4, null);
                m2.this.f21220a.J(androidx.collection.y0.k(this.f21263e.f312750a, h0Var2));
                m2.this.h0().invoke(h0Var2);
                m2.this.a1(null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class h extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        h(Object obj) {
            super(0, obj, m2.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((m2) this.receiver).j1();
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        i(Object obj) {
            super(0, obj, m2.class, "selectAll", "selectAll$foundation_release()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((m2) this.receiver).H0();
        }
    }

    public m2(@NotNull i3 i3Var) {
        this.f21220a = i3Var;
        n0.g.a aVar = n0.g.f332700b;
        this.f21234o = d7.g(n0.g.d(aVar.e()), null, 2, null);
        this.f21235p = d7.g(n0.g.d(aVar.e()), null, 2, null);
        this.f21236q = d7.g(null, null, 2, null);
        this.f21237r = d7.g(null, null, 2, null);
        this.f21238s = d7.g(null, null, 2, null);
        this.f21239t = d7.g(null, null, 2, null);
        i3Var.C(new Function1() { // from class: androidx.compose.foundation.text.selection.j2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m2.A(this.f21187a, ((Long) obj).longValue());
            }
        });
        i3Var.H(new pj.o() { // from class: androidx.compose.foundation.text.selection.k2
            @Override // pj.o
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return m2.u(this.f21194a, ((Boolean) obj).booleanValue(), (androidx.compose.ui.layout.g0) obj2, (n0.g) obj3, (n0) obj4);
            }
        });
        i3Var.G(new Function2() { // from class: androidx.compose.foundation.text.selection.l2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m2.v(this.f21205a, ((Boolean) obj).booleanValue(), ((Long) obj2).longValue());
            }
        });
        i3Var.E(new pj.q() { // from class: androidx.compose.foundation.text.selection.y1
            @Override // pj.q
            public final Object H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return Boolean.valueOf(m2.w(this.f21561a, ((Boolean) obj).booleanValue(), (androidx.compose.ui.layout.g0) obj2, (n0.g) obj3, (n0.g) obj4, ((Boolean) obj5).booleanValue(), (n0) obj6));
            }
        });
        i3Var.F(new Function0() { // from class: androidx.compose.foundation.text.selection.z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m2.x(this.f21569a);
            }
        });
        i3Var.D(new Function1() { // from class: androidx.compose.foundation.text.selection.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m2.y(this.f20997a, ((Long) obj).longValue());
            }
        });
        i3Var.B(new Function1() { // from class: androidx.compose.foundation.text.selection.b2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m2.z(this.f21008a, ((Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(m2 m2Var, long j10) {
        if (m2Var.f21220a.f().e(j10)) {
            m2Var.Z0(Unit.f312394a);
            m2Var.k1();
            m2Var.o1();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(m2 m2Var, Function1 function1, h0 h0Var) {
        m2Var.b1(h0Var);
        function1.invoke(h0Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C0(kotlin.coroutines.d<? super Unit> dVar) {
        Object objA;
        Pair<androidx.compose.ui.text.f, androidx.compose.ui.text.w3> pairT = T();
        if (pairT == null) {
            return Unit.f312394a;
        }
        androidx.compose.ui.text.f fVarComponent1 = pairT.component1();
        long jR = pairT.component2().r();
        x xVar = this.f21243x;
        return (xVar == null || (objA = xVar.a(fVarComponent1, jR, dVar)) != kotlin.coroutines.intrinsics.b.l()) ? Unit.f312394a : objA;
    }

    private final androidx.compose.ui.a0 D0(androidx.compose.ui.a0 a0Var, Function0<Unit> function0) {
        return androidx.compose.ui.input.pointer.w0.e(a0Var, Unit.f312394a, new f(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(m2 m2Var, h0 h0Var) {
        m2Var.b1(h0Var);
        return Unit.f312394a;
    }

    private final androidx.compose.ui.a0 K(androidx.compose.ui.a0 a0Var) {
        return androidx.compose.foundation.s1.f18599d ? b3.j(a0Var, this) : a0Var;
    }

    private final void K0(o1 o1Var, h0 h0Var) {
        p0.a aVar;
        if (g1() && (aVar = this.f21224e) != null) {
            aVar.a(p0.b.f340720b.j());
        }
        this.f21220a.J(o1Var.m(h0Var));
        this.f21223d.invoke(h0Var);
    }

    private final long L(androidx.compose.ui.layout.g0 g0Var, long j10) {
        androidx.compose.ui.layout.g0 g0Var2 = this.f21232m;
        return (g0Var2 == null || !g0Var2.I()) ? n0.g.f332700b.c() : G0().r0(g0Var, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j N(m2 m2Var) {
        return m2Var.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(n0.g gVar) {
        this.f21239t.setValue(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(long j10) {
        this.f21234o.setValue(n0.g.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(long j10) {
        this.f21235p.setValue(n0.g.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(androidx.compose.foundation.text.k3 k3Var) {
        this.f21238s.setValue(k3Var);
    }

    private final n0.j R() {
        androidx.compose.ui.layout.g0 g0Var;
        j0();
        if (n0() == null || (g0Var = this.f21232m) == null || !g0Var.I()) {
            return null;
        }
        List<e0> listK = this.f21220a.K(G0());
        ArrayList arrayList = new ArrayList(listK.size());
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = listK.get(i10);
            h0 h0VarN = this.f21220a.f().n(e0Var.o());
            Pair pair = h0VarN != null ? TuplesKt.to(e0Var, h0VarN) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        List listE = n2.e(arrayList);
        if (listE.isEmpty()) {
            return null;
        }
        n0.j jVarG = n2.g(listE, g0Var);
        if (Intrinsics.areEqual(jVarG, n2.f21280a)) {
            return null;
        }
        n0.j jVarK = n2.i(g0Var).K(jVarG);
        if (jVarK.x() - jVarK.t() >= 0.0f && jVarK.j() - jVarK.B() >= 0.0f) {
            n0.j jVarT = jVarK.T(androidx.compose.ui.layout.h0.f(g0Var));
            return n0.j.h(jVarT, 0.0f, 0.0f, 0.0f, jVarT.j() + (m1.b() * 4), 7, null);
        }
        return null;
    }

    private final void R0(n0.g gVar) {
        this.f21237r.setValue(gVar);
    }

    private final n0.j W() {
        return (n0.j) this.f21230k.getValue();
    }

    private final void Z0(Unit unit) {
        this.f21233n.setValue(unit);
    }

    private final void d1(n0.g gVar) {
        this.f21236q.setValue(gVar);
    }

    private final void h1(long j10, boolean z10, n0 n0Var) {
        this.f21240u = null;
        l1(j10, n0.g.f332700b.c(), z10, n0Var);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, androidx.compose.ui.text.f] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, androidx.compose.ui.text.w3] */
    private final void i1() {
        int iNextIndex;
        kotlinx.coroutines.s0 s0Var;
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        kotlin.jvm.internal.i1.h hVar2 = new kotlin.jvm.internal.i1.h();
        kotlin.jvm.internal.i1.g gVar = new kotlin.jvm.internal.i1.g();
        List<e0> listK = this.f21220a.K(G0());
        ListIterator<e0> listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            h0 h0VarN = this.f21220a.f().n(listIterator.previous().o());
            if (h0VarN != null && h0VarN.h().g() != h0VarN.f().g()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = listK.size();
            int i10 = 0;
            while (i10 < size) {
                e0 e0Var = listK.get(i10);
                h0 h0VarN2 = this.f21220a.f().n(e0Var.o());
                if (h0VarN2 != null) {
                    ?? text = e0Var.getText();
                    long jB = androidx.compose.ui.text.x3.b(h0VarN2.h().g(), h0VarN2.f().g());
                    boolean z10 = i10 >= iNextIndex;
                    long jO = e0Var.o();
                    if (!z10) {
                        break;
                    }
                    hVar.f312751a = text;
                    hVar2.f312751a = androidx.compose.ui.text.w3.b(jB);
                    gVar.f312750a = jO;
                    break;
                }
                i10++;
            }
        }
        T t10 = hVar.f312751a;
        if (t10 == 0 || hVar2.f312751a == 0 || gVar.f312750a == 0 || ((CharSequence) t10).length() <= 0 || (s0Var = this.f21242w) == null) {
            return;
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new g(hVar, hVar2, gVar, null), 3, null);
    }

    private final Unit j0() {
        this.f21233n.getValue();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1() {
        M();
        E0();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    private final void k1() {
        n0.g gVarD;
        h0.a aVarF;
        h0.a aVarH;
        h0 h0VarN0 = n0();
        androidx.compose.ui.layout.g0 g0Var = this.f21232m;
        n0.g gVar = null;
        e0 e0VarP = (h0VarN0 == null || (aVarH = h0VarN0.h()) == null) ? null : P(aVarH);
        e0 e0VarP2 = (h0VarN0 == null || (aVarF = h0VarN0.f()) == null) ? null : P(aVarF);
        androidx.compose.ui.layout.g0 g0VarM = e0VarP != null ? e0VarP.M() : null;
        androidx.compose.ui.layout.g0 g0VarM2 = e0VarP2 != null ? e0VarP2.M() : null;
        if (h0VarN0 == null || g0Var == null || !g0Var.I() || (g0VarM == null && g0VarM2 == null)) {
            d1(null);
            R0(null);
            return;
        }
        n0.j jVarI = n2.i(g0Var);
        if (g0VarM != null) {
            long jL = e0VarP.l(h0VarN0, true);
            if ((jL & 9223372034707292159L) == n0.d.f332689d) {
                gVarD = null;
            } else {
                gVarD = n0.g.d(g0Var.r0(g0VarM, jL));
                long jB = gVarD.B();
                if (Z() != androidx.compose.foundation.text.k3.SelectionStart && !n2.d(jVarI, jB)) {
                    gVarD = null;
                }
            }
        } else {
            gVarD = null;
        }
        d1(gVarD);
        if (g0VarM2 != null) {
            long jL2 = e0VarP2.l(h0VarN0, false);
            if ((9223372034707292159L & jL2) != n0.d.f332689d) {
                n0.g gVarD2 = n0.g.d(g0Var.r0(g0VarM2, jL2));
                long jB2 = gVarD2.B();
                if (Z() == androidx.compose.foundation.text.k3.SelectionEnd || n2.d(jVarI, jB2)) {
                    gVar = gVarD2;
                }
            }
        }
        R0(gVar);
    }

    @androidx.annotation.l1
    public static /* synthetic */ void l0() {
    }

    private final void n1() {
        androidx.compose.ui.platform.e4 e4Var = this.f21226g;
        if (e4Var != null) {
            if (this.f21244y && z0()) {
                n0.j jVarR = R();
                if (jVarR != null) {
                    androidx.compose.ui.platform.e4.v(e4Var, jVarR, A0() ? new h(this) : null, null, null, y0() ? null : new i(this), null, 12, null);
                }
            } else if (e4Var.t() == androidx.compose.ui.platform.g4.Shown) {
                e4Var.b();
            }
        }
    }

    private final o1 o0(long j10, long j11, boolean z10) {
        androidx.compose.ui.layout.g0 g0VarG0 = G0();
        List<e0> listK = this.f21220a.K(g0VarG0);
        androidx.collection.x1 x1VarJ = androidx.collection.r0.j();
        List<e0> list = listK;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            x1VarJ.k0(listK.get(i10).o(), i10);
        }
        p1 p1Var = new p1(j10, j11, g0VarG0, z10, (j11 & 9223372034707292159L) == n0.d.f332689d ? null : n0(), new c(x1VarJ), null);
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            listK.get(i11).q(p1Var);
        }
        return p1Var.b();
    }

    private final void o1() {
        if (e0()) {
            if (!androidx.compose.foundation.s1.f18599d) {
                n1();
            } else if (!this.f21244y || !z0()) {
                this.f21227h.b();
            } else if (W() != null) {
                this.f21227h.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j p(m2 m2Var, androidx.compose.ui.layout.g0 g0Var) {
        n0.j jVarW = m2Var.W();
        if (jVarW == null) {
            return null;
        }
        androidx.compose.ui.layout.g0 g0Var2 = m2Var.f21232m;
        if (g0Var2 != null) {
            return androidx.compose.foundation.text.contextmenu.modifier.l.c(jVarW, g0Var2, g0Var);
        }
        androidx.compose.foundation.internal.e.j("Required value was null.");
        throw new kotlin.a0();
    }

    private final boolean p0() {
        return x0() && z0() && !B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(m2 m2Var) {
        m2Var.E0();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(m2 m2Var, androidx.compose.ui.layout.g0 g0Var) {
        m2Var.L0(g0Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(m2 m2Var, androidx.compose.ui.focus.p0 p0Var) {
        if (!p0Var.n() && m2Var.e0()) {
            m2Var.E0();
        }
        m2Var.U0(p0Var.n());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(m2 m2Var, boolean z10) {
        m2Var.V0(z10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(m2 m2Var, boolean z10, androidx.compose.ui.layout.g0 g0Var, n0.g gVar, n0 n0Var) {
        long jA = g0Var.a();
        n0.j jVar = new n0.j(0.0f, 0.0f, (int) (jA >> 32), (int) (jA & com.rabbitmq.client.k0.f265952a));
        long jL = m2Var.L(g0Var, n2.d(jVar, gVar.B()) ? gVar.B() : r6.a(gVar.B(), jVar));
        if ((9223372034707292159L & jL) != n0.d.f332689d) {
            m2Var.V0(z10);
            m2Var.h1(jL, false, n0Var);
            androidx.compose.ui.focus.g0.k(m2Var.f21228i, 0, 1, null);
            m2Var.c1(false);
            m2Var.f21241v = true;
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(m2 m2Var, boolean z10, long j10) {
        Pair<h0, androidx.collection.x0<h0>> pairI0 = m2Var.I0(j10, m2Var.n0());
        h0 h0VarComponent1 = pairI0.component1();
        androidx.collection.x0<h0> x0VarComponent2 = pairI0.component2();
        if (!Intrinsics.areEqual(h0VarComponent1, m2Var.n0())) {
            m2Var.f21220a.J(x0VarComponent2);
            m2Var.f21223d.invoke(h0VarComponent1);
        }
        m2Var.V0(z10);
        androidx.compose.ui.focus.g0.k(m2Var.f21228i, 0, 1, null);
        m2Var.c1(false);
        return Unit.f312394a;
    }

    @androidx.annotation.l1
    public static /* synthetic */ void v0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(m2 m2Var, boolean z10, androidx.compose.ui.layout.g0 g0Var, n0.g gVar, n0.g gVar2, boolean z11, n0 n0Var) {
        long jL = m2Var.L(g0Var, gVar.B());
        long jL2 = m2Var.L(g0Var, gVar2.B());
        m2Var.V0(z10);
        return m2Var.m1(n0.g.d(jL), jL2, z11, n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(m2 m2Var) {
        m2Var.c1(true);
        m2Var.Q0(null);
        m2Var.N0(null);
        if (m2Var.f21241v && m2Var.A0()) {
            m2Var.i1();
        }
        m2Var.f21241v = false;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x0() {
        return Z() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(m2 m2Var, long j10) {
        if (m2Var.f21220a.f().e(j10)) {
            m2Var.E0();
            m2Var.b1(null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(m2 m2Var, long j10) {
        h0.a aVarF;
        h0.a aVarH;
        h0 h0VarN0 = m2Var.n0();
        if (h0VarN0 != null && (aVarH = h0VarN0.h()) != null && j10 == aVarH.h()) {
            m2Var.d1(null);
        }
        h0 h0VarN1 = m2Var.n0();
        if (h0VarN1 != null && (aVarF = h0VarN1.f()) != null && j10 == aVarF.h()) {
            m2Var.R0(null);
        }
        if (m2Var.f21220a.f().e(j10)) {
            m2Var.o1();
        }
        return Unit.f312394a;
    }

    public final boolean A0() {
        h0 h0VarN0 = n0();
        if (h0VarN0 == null || Intrinsics.areEqual(h0VarN0.h(), h0VarN0.f())) {
            return false;
        }
        if (h0VarN0.h().h() == h0VarN0.f().h()) {
            return true;
        }
        List<e0> listK = this.f21220a.K(G0());
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            h0 h0VarN = this.f21220a.f().n(listK.get(i10).o());
            if (h0VarN != null && h0VarN.h().g() != h0VarN.f().g()) {
                return true;
            }
        }
        return false;
    }

    public final boolean B0() {
        h0 h0VarN0 = n0();
        if (h0VarN0 == null) {
            return true;
        }
        return Intrinsics.areEqual(h0VarN0.h(), h0VarN0.f());
    }

    public final void E0() {
        p0.a aVar;
        this.f21220a.J(androidx.collection.y0.c());
        c1(false);
        if (n0() != null) {
            this.f21223d.invoke(null);
            if (!z0() || (aVar = this.f21224e) == null) {
                return;
            }
            aVar.a(p0.b.f340720b.j());
        }
    }

    @NotNull
    public final androidx.compose.ui.layout.g0 G0() {
        androidx.compose.ui.layout.g0 g0Var = this.f21232m;
        if (g0Var == null) {
            androidx.compose.foundation.internal.e.h("null coordinates");
            throw new kotlin.a0();
        }
        if (!g0Var.I()) {
            androidx.compose.foundation.internal.e.g("unattached coordinates");
        }
        return g0Var;
    }

    public final void H0() {
        List<e0> listK = this.f21220a.K(G0());
        if (listK.isEmpty()) {
            return;
        }
        androidx.collection.a2 a2VarJ = androidx.collection.y0.j();
        int size = listK.size();
        h0 h0Var = null;
        h0 h0Var2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = listK.get(i10);
            h0 h0VarP = e0Var.p();
            if (h0VarP != null) {
                if (h0Var == null) {
                    h0Var = h0VarP;
                }
                a2VarJ.c0(e0Var.o(), h0VarP);
                h0Var2 = h0VarP;
            }
        }
        if (a2VarJ.x()) {
            return;
        }
        if (h0Var != h0Var2) {
            Intrinsics.checkNotNull(h0Var);
            h0.a aVarH = h0Var.h();
            Intrinsics.checkNotNull(h0Var2);
            h0Var = new h0(aVarH, h0Var2.f(), false);
        }
        this.f21220a.J(a2VarJ);
        this.f21223d.invoke(h0Var);
        this.f21240u = null;
    }

    @NotNull
    public final Pair<h0, androidx.collection.x0<h0>> I0(long j10, @Nullable h0 h0Var) {
        p0.a aVar;
        androidx.collection.a2 a2VarJ = androidx.collection.y0.j();
        List<e0> listK = this.f21220a.K(G0());
        int size = listK.size();
        h0 h0VarH = null;
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = listK.get(i10);
            h0 h0VarP = e0Var.o() == j10 ? e0Var.p() : null;
            if (h0VarP != null) {
                a2VarJ.j0(e0Var.o(), h0VarP);
            }
            h0VarH = n2.h(h0VarH, h0VarP);
        }
        if (z0() && !Intrinsics.areEqual(h0VarH, h0Var) && (aVar = this.f21224e) != null) {
            aVar.a(p0.b.f340720b.j());
        }
        return new Pair<>(h0VarH, a2VarJ);
    }

    public final void J0(long j10) {
        androidx.compose.ui.layout.g0 g0VarM;
        boolean zC;
        androidx.compose.ui.layout.g0 g0Var = this.f21232m;
        if (g0Var != null && g0Var.I()) {
            List<e0> listZ = this.f21220a.z();
            int size = listZ.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                e0 e0Var = listZ.get(i10);
                h0 h0VarN = this.f21220a.f().n(e0Var.o());
                if (h0VarN != null && (g0VarM = e0Var.M()) != null) {
                    long jR0 = g0VarM.r0(g0Var, j10);
                    androidx.compose.ui.text.p3 p3VarK = e0Var.k();
                    zC = p3VarK == null ? false : x6.c(p3VarK, jR0, androidx.compose.ui.text.w3.b(h0VarN.j()));
                }
                if (zC) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return;
            }
            h1(j10, true, n0.f21271a.o());
        }
    }

    public final void L0(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f21232m = g0Var;
        if (!e0() || n0() == null) {
            return;
        }
        n0.g gVarD = g0Var != null ? n0.g.d(androidx.compose.ui.layout.h0.g(g0Var)) : null;
        if (Intrinsics.areEqual(this.f21231l, gVarD)) {
            return;
        }
        this.f21231l = gVarD;
        k1();
        o1();
    }

    public final void M() {
        Function1<? super androidx.compose.ui.text.f, Unit> function1;
        androidx.compose.ui.text.f fVarM0 = m0();
        if (fVarM0 != null) {
            if (fVarM0.length() <= 0) {
                fVarM0 = null;
            }
            if (fVarM0 == null || (function1 = this.f21225f) == null) {
                return;
            }
            function1.invoke(fVarM0);
        }
    }

    public final void M0(@Nullable kotlinx.coroutines.s0 s0Var) {
        this.f21242w = s0Var;
    }

    public final void O(@NotNull pj.o<? super Long, ? super androidx.compose.ui.text.f, ? super androidx.compose.ui.text.w3, ? super Boolean, Boolean> oVar) {
        int iNextIndex;
        List<e0> listK = this.f21220a.K(G0());
        ListIterator<e0> listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            h0 h0VarN = this.f21220a.f().n(listIterator.previous().o());
            if (h0VarN != null && h0VarN.h().g() != h0VarN.f().g()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return;
        }
        int size = listK.size();
        int i10 = 0;
        while (i10 < size) {
            e0 e0Var = listK.get(i10);
            h0 h0VarN2 = this.f21220a.f().n(e0Var.o());
            if (h0VarN2 != null) {
                if (!oVar.invoke(Long.valueOf(e0Var.o()), e0Var.getText(), androidx.compose.ui.text.w3.b(androidx.compose.ui.text.x3.b(h0VarN2.h().g(), h0VarN2.f().g())), Boolean.valueOf(i10 >= iNextIndex)).booleanValue()) {
                    return;
                }
            }
            i10++;
        }
    }

    @Nullable
    public final e0 P(@NotNull h0.a aVar) {
        return this.f21220a.y().n(aVar.h());
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 Q() {
        return this.f21232m;
    }

    @NotNull
    public final androidx.compose.ui.a0 S() {
        return androidx.compose.foundation.text.contextmenu.modifier.l.b(androidx.compose.foundation.text.contextmenu.modifier.g.a(androidx.compose.ui.a0.E, new a(null)), this.f21227h, new b(null), null, new Function1() { // from class: androidx.compose.foundation.text.selection.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m2.p(this.f21086a, (androidx.compose.ui.layout.g0) obj);
            }
        }, 4, null);
    }

    public final void S0(@NotNull androidx.compose.ui.focus.g0 g0Var) {
        this.f21228i = g0Var;
    }

    @Nullable
    public final Pair<androidx.compose.ui.text.f, androidx.compose.ui.text.w3> T() {
        int iNextIndex;
        int iL;
        int iR;
        Pair<androidx.compose.ui.text.f, androidx.compose.ui.text.w3> pair;
        Pair<androidx.compose.ui.text.f, androidx.compose.ui.text.w3> pair2 = null;
        if (n0() == null || this.f21220a.z().isEmpty()) {
            return null;
        }
        androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, 1, null);
        List<e0> listK = this.f21220a.K(G0());
        ListIterator<e0> listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            h0 h0VarN = this.f21220a.f().n(listIterator.previous().o());
            if (h0VarN != null && h0VarN.h().g() != h0VarN.f().g()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = listK.size();
            int i10 = 0;
            iL = -1;
            iR = -1;
            while (i10 < size) {
                e0 e0Var = listK.get(i10);
                h0 h0VarN2 = this.f21220a.f().n(e0Var.o());
                if (h0VarN2 != null) {
                    androidx.compose.ui.text.f text = e0Var.getText();
                    long jB = androidx.compose.ui.text.x3.b(h0VarN2.h().g(), h0VarN2.f().g());
                    boolean z10 = i10 >= iNextIndex;
                    e0Var.o();
                    if (iL == -1) {
                        iL = androidx.compose.ui.text.w3.l(jB);
                        bVar.o(text, 0, androidx.compose.ui.text.w3.l(jB));
                    }
                    pair = pair2;
                    bVar.o(text, androidx.compose.ui.text.w3.l(jB), androidx.compose.ui.text.w3.k(jB));
                    if (z10) {
                        iR = bVar.r();
                        bVar.o(text, androidx.compose.ui.text.w3.k(jB), text.length());
                    } else {
                        bVar.append('\n');
                    }
                } else {
                    pair = pair2;
                }
                i10++;
                pair2 = pair;
            }
        } else {
            iL = -1;
            iR = -1;
        }
        Pair<androidx.compose.ui.text.f, androidx.compose.ui.text.w3> pair3 = pair2;
        return (iL == -1 || iR == -1) ? pair3 : new Pair<>(bVar.C(), androidx.compose.ui.text.w3.b(androidx.compose.ui.text.x3.b(iL, iR)));
    }

    public final void T0(@Nullable p0.a aVar) {
        this.f21224e = aVar;
    }

    @Nullable
    public final kotlinx.coroutines.s0 U() {
        return this.f21242w;
    }

    public final void U0(boolean z10) {
        this.f21229j.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final n0.g V() {
        return (n0.g) this.f21239t.getValue();
    }

    public final void V0(boolean z10) {
        if (this.f21222c.getValue().booleanValue() != z10) {
            this.f21222c.setValue(Boolean.valueOf(z10));
            o1();
        }
    }

    public final void W0(@Nullable Function1<? super androidx.compose.ui.text.f, Unit> function1) {
        this.f21225f = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long X() {
        return ((n0.g) this.f21234o.getValue()).B();
    }

    public final void X0(@NotNull final Function1<? super h0, Unit> function1) {
        this.f21223d = new Function1() { // from class: androidx.compose.foundation.text.selection.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m2.B(this.f21024a, function1, (h0) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long Y() {
        return ((n0.g) this.f21235p.getValue()).B();
    }

    public final void Y0(@Nullable x xVar) {
        this.f21243x = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final androidx.compose.foundation.text.k3 Z() {
        return (androidx.compose.foundation.text.k3) this.f21238s.getValue();
    }

    public final float a0() {
        e0 e0VarP;
        h0 h0VarN0 = n0();
        if (h0VarN0 == null || (e0VarP = P(h0VarN0.f())) == null) {
            return 0.0f;
        }
        return e0VarP.c(h0VarN0.f().g());
    }

    public final void a1(@Nullable o1 o1Var) {
        this.f21240u = o1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final n0.g b0() {
        return (n0.g) this.f21237r.getValue();
    }

    public final void b1(@Nullable h0 h0Var) {
        this.f21221b.setValue(h0Var);
        if (h0Var != null) {
            k1();
        }
    }

    @NotNull
    public final androidx.compose.ui.focus.g0 c0() {
        return this.f21228i;
    }

    public final void c1(boolean z10) {
        this.f21244y = z10;
        o1();
    }

    @Nullable
    public final p0.a d0() {
        return this.f21224e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e0() {
        return ((Boolean) this.f21229j.getValue()).booleanValue();
    }

    public final void e1(@Nullable androidx.compose.ui.platform.e4 e4Var) {
        this.f21226g = e4Var;
    }

    @NotNull
    public final androidx.compose.ui.a0 f0() {
        androidx.compose.ui.a0 a0VarY = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarA = androidx.compose.ui.input.key.f.a(i1.F(androidx.compose.foundation.e2.c(androidx.compose.ui.focus.d.a(androidx.compose.ui.focus.j0.a(androidx.compose.ui.layout.q1.a(D0(a0VarY, new Function0() { // from class: androidx.compose.foundation.text.selection.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m2.q(this.f21504a);
            }
        }), new Function1() { // from class: androidx.compose.foundation.text.selection.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m2.r(this.f21042a, (androidx.compose.ui.layout.g0) obj);
            }
        }), this.f21228i), new Function1() { // from class: androidx.compose.foundation.text.selection.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m2.s(this.f21052a, (androidx.compose.ui.focus.p0) obj);
            }
        }), false, null, 3, null), new Function1() { // from class: androidx.compose.foundation.text.selection.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m2.t(this.f21064a, ((Boolean) obj).booleanValue());
            }
        }), new e());
        if (p0()) {
            a0VarY = b3.y(a0VarY, this);
        }
        return K(a0VarA.B2(a0VarY));
    }

    public final void f1(@NotNull androidx.compose.foundation.text.contextmenu.modifier.o oVar) {
        this.f21227h = oVar;
    }

    @Nullable
    public final Function1<androidx.compose.ui.text.f, Unit> g0() {
        return this.f21225f;
    }

    @androidx.annotation.l1
    public final boolean g1() {
        if (z0()) {
            List<e0> listZ = this.f21220a.z();
            int size = listZ.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (listZ.get(i10).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final Function1<h0, Unit> h0() {
        return this.f21223d;
    }

    @Nullable
    public final x i0() {
        return this.f21243x;
    }

    @Nullable
    public final o1 k0() {
        return this.f21240u;
    }

    public final boolean l1(long j10, long j11, boolean z10, @NotNull n0 n0Var) {
        Q0(z10 ? androidx.compose.foundation.text.k3.SelectionStart : androidx.compose.foundation.text.k3.SelectionEnd);
        N0(n0.g.d(j10));
        o1 o1VarO0 = o0(j10, j11, z10);
        if (o1VarO0 == null || !o1VarO0.f(this.f21240u)) {
            return false;
        }
        h0 h0VarA = n0Var.a(o1VarO0);
        if (!Intrinsics.areEqual(h0VarA, n0())) {
            K0(o1VarO0, h0VarA);
            this.f21241v = false;
        }
        this.f21240u = o1VarO0;
        return true;
    }

    @Nullable
    public final androidx.compose.ui.text.f m0() {
        int iNextIndex;
        if (n0() != null && !this.f21220a.f().x()) {
            androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, 1, null);
            List<e0> listK = this.f21220a.K(G0());
            ListIterator<e0> listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                h0 h0VarN = this.f21220a.f().n(listIterator.previous().o());
                if (h0VarN != null && h0VarN.h().g() != h0VarN.f().g()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex != -1) {
                int size = listK.size();
                int i10 = 0;
                while (i10 < size) {
                    e0 e0Var = listK.get(i10);
                    h0 h0VarN2 = this.f21220a.f().n(e0Var.o());
                    if (h0VarN2 != null) {
                        androidx.compose.ui.text.f text = e0Var.getText();
                        long jB = androidx.compose.ui.text.x3.b(h0VarN2.h().g(), h0VarN2.f().g());
                        boolean z10 = i10 >= iNextIndex;
                        e0Var.o();
                        bVar.o(text, androidx.compose.ui.text.w3.l(jB), androidx.compose.ui.text.w3.k(jB));
                        if (!z10) {
                            bVar.append('\n');
                        }
                    }
                    i10++;
                }
            }
            return bVar.C();
        }
        return null;
    }

    public final boolean m1(@Nullable n0.g gVar, long j10, boolean z10, @NotNull n0 n0Var) {
        if (gVar == null) {
            return false;
        }
        return l1(gVar.B(), j10, z10, n0Var);
    }

    @Nullable
    public final h0 n0() {
        return this.f21221b.getValue();
    }

    public final boolean q0() {
        return this.f21244y;
    }

    public final float r0() {
        e0 e0VarP;
        h0 h0VarN0 = n0();
        if (h0VarN0 != null && (e0VarP = P(h0VarN0.h())) != null) {
            return e0VarP.c(h0VarN0.h().g());
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final n0.g s0() {
        return (n0.g) this.f21236q.getValue();
    }

    @Nullable
    public final androidx.compose.ui.platform.e4 t0() {
        return this.f21226g;
    }

    @NotNull
    public final androidx.compose.foundation.text.contextmenu.modifier.o u0() {
        return this.f21227h;
    }

    @NotNull
    public final k5 w0(boolean z10) {
        return new d(z10, this);
    }

    public final boolean y0() {
        h0 h0VarN;
        List<e0> listK = this.f21220a.K(G0());
        if (listK.isEmpty()) {
            return true;
        }
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = listK.get(i10);
            androidx.compose.ui.text.f text = e0Var.getText();
            if (text.length() != 0 && ((h0VarN = this.f21220a.f().n(e0Var.o())) == null || Math.abs(h0VarN.h().g() - h0VarN.f().g()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean z0() {
        return this.f21222c.getValue().booleanValue();
    }
}
