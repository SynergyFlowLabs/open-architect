package androidx.compose.foundation.lazy.layout;

import androidx.collection.b3;
import androidx.collection.d3;
import androidx.compose.foundation.lazy.layout.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,587:1\n103#2:588\n35#2,5:589\n104#2:594\n35#2,3:623\n39#2:633\n35#2,5:636\n35#2,5:643\n35#2,5:679\n35#2,5:686\n35#2,3:724\n39#2:733\n32#3:595\n32#3:597\n80#4:596\n80#4:598\n85#4:728\n90#4:730\n80#4:732\n365#5,3:599\n329#5,6:602\n339#5,3:609\n342#5,9:613\n368#5:622\n372#5,3:693\n329#5,6:696\n339#5,3:703\n342#5,2:707\n345#5,6:711\n375#5:717\n1399#6:608\n1270#6:612\n1399#6:658\n1270#6:662\n1399#6:702\n1270#6:706\n1#7:626\n13409#8,2:627\n13409#8,2:629\n13409#8,2:631\n13474#8,3:665\n12574#8,2:668\n13409#8,2:691\n13409#8,2:709\n13474#8,3:718\n13474#8,3:721\n1019#9,2:634\n1010#9,2:641\n1019#9,2:677\n1010#9,2:684\n231#10,3:648\n200#10,7:651\n211#10,3:659\n214#10,2:663\n217#10,6:670\n234#10:676\n54#11:727\n59#11:729\n30#12:731\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n89#1:588\n89#1:589,5\n89#1:594\n113#1:623,3\n113#1:633\n189#1:636,5\n199#1:643,5\n289#1:679,5\n314#1:686,5\n433#1:724,3\n433#1:733\n102#1:595\n104#1:597\n102#1:596\n104#1:598\n438#1:728\n439#1:730\n437#1:732\n111#1:599,3\n111#1:602,6\n111#1:609,3\n111#1:613,9\n111#1:622\n368#1:693,3\n368#1:696,6\n368#1:703,3\n368#1:707,2\n368#1:711,6\n368#1:717\n111#1:608\n111#1:612\n210#1:658\n210#1:662\n368#1:702\n368#1:706\n145#1:627,2\n157#1:629,2\n166#1:631,2\n226#1:665,3\n264#1:668,2\n353#1:691,2\n369#1:709,2\n390#1:718,3\n401#1:721,3\n188#1:634,2\n198#1:641,2\n288#1:677,2\n313#1:684,2\n210#1:648,3\n210#1:651,7\n210#1:659,3\n210#1:663,2\n210#1:670,6\n210#1:676\n438#1:727\n439#1:729\n437#1:731\n*E\n"})
public final class LazyLayoutItemAnimator<T extends y0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f17234l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private o0 f17236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17237c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.node.t f17244j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, LazyLayoutItemAnimator<T>.b> f17235a = b3.u();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.collection.l2<Object> f17238d = d3.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<T> f17239e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<T> f17240f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<T> f17241g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<T> f17242h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<a0> f17243i = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f17245k = new DisplayingDisappearingItemsElement(this);

    private static final class DisplayingDisappearingItemsElement extends androidx.compose.ui.node.e1<a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final LazyLayoutItemAnimator<?> f17246c;

        public DisplayingDisappearingItemsElement(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.f17246c = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> l() {
            return this.f17246c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement n(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.f17246c;
            }
            return displayingDisappearingItemsElement.m(lazyLayoutItemAnimator);
        }

        @Override // androidx.compose.ui.node.e1
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && Intrinsics.areEqual(this.f17246c, ((DisplayingDisappearingItemsElement) obj).f17246c);
        }

        @Override // androidx.compose.ui.node.e1
        public int hashCode() {
            return this.f17246c.hashCode();
        }

        @Override // androidx.compose.ui.node.e1
        public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("DisplayingDisappearingItemsElement");
        }

        @NotNull
        public final DisplayingDisappearingItemsElement m(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new DisplayingDisappearingItemsElement(lazyLayoutItemAnimator);
        }

        @Override // androidx.compose.ui.node.e1
        @NotNull
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this.f17246c);
        }

        @Override // androidx.compose.ui.node.e1
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(@NotNull a aVar) {
            aVar.y9(this.f17246c);
        }

        @NotNull
        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f17246c + ')';
        }
    }

    @SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,587:1\n35#2,3:588\n39#2:598\n120#3,7:591\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n*L\n552#1:588,3\n552#1:598\n556#1:591,7\n*E\n"})
    private static final class a extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        private LazyLayoutItemAnimator<?> f17247s;

        public a(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.f17247s = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> v9() {
            return this.f17247s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a x9(a aVar, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lazyLayoutItemAnimator = aVar.f17247s;
            }
            return aVar.w9(lazyLayoutItemAnimator);
        }

        @Override // androidx.compose.ui.node.t
        public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
            List list = ((LazyLayoutItemAnimator) this.f17247s).f17243i;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a0 a0Var = (a0) list.get(i10);
                androidx.compose.ui.graphics.layer.c cVarT = a0Var.t();
                if (cVarT != null) {
                    float fN = androidx.compose.ui.unit.q.n(a0Var.s());
                    float fP = androidx.compose.ui.unit.q.p(a0Var.s());
                    float fN2 = fN - androidx.compose.ui.unit.q.n(cVarT.H());
                    float fP2 = fP - androidx.compose.ui.unit.q.p(cVarT.H());
                    cVar.Z3().i().c(fN2, fP2);
                    try {
                        androidx.compose.ui.graphics.layer.e.a(cVar, cVarT);
                        cVar.Z3().i().c(-fN2, -fP2);
                    } catch (Throwable th2) {
                        cVar.Z3().i().c(-fN2, -fP2);
                        throw th2;
                    }
                }
            }
            cVar.E4();
        }

        @Override // androidx.compose.ui.a0.d
        public void e9() {
            ((LazyLayoutItemAnimator) this.f17247s).f17244j = this;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f17247s, ((a) obj).f17247s);
        }

        @Override // androidx.compose.ui.a0.d
        public void f9() {
            this.f17247s.p();
        }

        public int hashCode() {
            return this.f17247s.hashCode();
        }

        @NotNull
        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f17247s + ')';
        }

        @NotNull
        public final a w9(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new a(lazyLayoutItemAnimator);
        }

        public final void y9(@NotNull LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            if (Intrinsics.areEqual(this.f17247s, lazyLayoutItemAnimator) || !w().a9()) {
                return;
            }
            this.f17247s.p();
            ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).f17244j = this;
            this.f17247s = lazyLayoutItemAnimator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n12574#2,2:588\n1#3:590\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n*L\n479#1:588,2\n*E\n"})
    final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private androidx.compose.ui.unit.b f17249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17251d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f17253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f17254g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private a0[] f17248a = g0.f17403a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f17252e = 1;

        public b() {
        }

        private final boolean i() {
            for (a0 a0Var : this.f17248a) {
                if (a0Var != null && a0Var.C()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void o(b bVar, y0 y0Var, kotlinx.coroutines.s0 s0Var, androidx.compose.ui.graphics.o1 o1Var, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                i12 = LazyLayoutItemAnimator.this.f(y0Var);
            }
            bVar.n(y0Var, s0Var, o1Var, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            androidx.compose.ui.node.t tVar = lazyLayoutItemAnimator.f17244j;
            if (tVar != null) {
                androidx.compose.ui.node.u.a(tVar);
            }
            return Unit.f312394a;
        }

        @NotNull
        public final a0[] b() {
            return this.f17248a;
        }

        @Nullable
        public final androidx.compose.ui.unit.b c() {
            return this.f17249b;
        }

        public final int d() {
            return this.f17250c;
        }

        public final int e() {
            return this.f17251d;
        }

        public final int f() {
            return this.f17254g;
        }

        public final int g() {
            return this.f17253f;
        }

        public final int h() {
            return this.f17252e;
        }

        public final void j(@Nullable androidx.compose.ui.unit.b bVar) {
            this.f17249b = bVar;
        }

        public final void k(int i10) {
            this.f17250c = i10;
        }

        public final void l(int i10) {
            this.f17251d = i10;
        }

        public final void m(int i10) {
            this.f17252e = i10;
        }

        public final void n(@NotNull T t10, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull androidx.compose.ui.graphics.o1 o1Var, int i10, int i11, int i12) {
            if (!i()) {
                this.f17253f = i10;
                this.f17254g = i11;
            }
            int length = this.f17248a.length;
            for (int iB = t10.b(); iB < length; iB++) {
                a0 a0Var = this.f17248a[iB];
                if (a0Var != null) {
                    a0Var.D();
                }
            }
            if (this.f17248a.length != t10.b()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.f17248a, t10.b());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                this.f17248a = (a0[]) objArrCopyOf;
            }
            this.f17249b = androidx.compose.ui.unit.b.a(t10.h());
            this.f17250c = i12;
            this.f17251d = t10.c();
            this.f17252e = t10.e();
            int iB2 = t10.b();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i13 = 0; i13 < iB2; i13++) {
                p pVarC = g0.c(t10.n(i13));
                if (pVarC == null) {
                    a0 a0Var2 = this.f17248a[i13];
                    if (a0Var2 != null) {
                        a0Var2.D();
                    }
                    this.f17248a[i13] = null;
                } else {
                    a0 a0Var3 = this.f17248a[i13];
                    if (a0Var3 == null) {
                        a0Var3 = new a0(s0Var, o1Var, new Function0() { // from class: androidx.compose.foundation.lazy.layout.f0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LazyLayoutItemAnimator.b.p(lazyLayoutItemAnimator);
                            }
                        });
                        this.f17248a[i13] = a0Var3;
                    }
                    a0Var3.H(pVarC.v9());
                    a0Var3.N(pVarC.x9());
                    a0Var3.I(pVarC.w9());
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n1#1,102:1\n198#2:103\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f17256a;

        public c(o0 o0Var) {
            this.f17256a = o0Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f17256a.c(((y0) t10).getKey())), Integer.valueOf(this.f17256a.c(((y0) t11).getKey())));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n1#1,102:1\n313#2:103\n*E\n"})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f17257a;

        public d(o0 o0Var) {
            this.f17257a = o0Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f17257a.c(((y0) t10).getKey())), Integer.valueOf(this.f17257a.c(((y0) t11).getKey())));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n1#1,121:1\n188#2:122\n*E\n"})
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f17258a;

        public e(o0 o0Var) {
            this.f17258a = o0Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f17258a.c(((y0) t11).getKey())), Integer.valueOf(this.f17258a.c(((y0) t10).getKey())));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n1#1,121:1\n288#2:122\n*E\n"})
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f17259a;

        public f(o0 o0Var) {
            this.f17259a = o0Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f17259a.c(((y0) t11).getKey())), Integer.valueOf(this.f17259a.c(((y0) t10).getKey())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(y0 y0Var) {
        long jO = y0Var.o(0);
        return !y0Var.j() ? androidx.compose.ui.unit.q.p(jO) : androidx.compose.ui.unit.q.n(jO);
    }

    private final boolean g(T t10) {
        int iB = t10.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (g0.c(t10.n(i10)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int h(y0 y0Var) {
        long jO = y0Var.o(0);
        return y0Var.j() ? androidx.compose.ui.unit.q.p(jO) : androidx.compose.ui.unit.q.n(jO);
    }

    private final void k(T t10, int i10, LazyLayoutItemAnimator<T>.b bVar) {
        int i11 = 0;
        long jO = t10.o(0);
        long jH = t10.j() ? androidx.compose.ui.unit.q.h(jO, 0, i10, 1, null) : androidx.compose.ui.unit.q.h(jO, i10, 0, 2, null);
        a0[] a0VarArrB = bVar.b();
        int length = a0VarArrB.length;
        int i12 = 0;
        while (i11 < length) {
            a0 a0Var = a0VarArrB[i11];
            int i13 = i12 + 1;
            if (a0Var != null) {
                a0Var.O(androidx.compose.ui.unit.q.s(jH, androidx.compose.ui.unit.q.r(t10.o(i12), jO)));
            }
            i11++;
            i12 = i13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void l(LazyLayoutItemAnimator lazyLayoutItemAnimator, y0 y0Var, int i10, b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            LazyLayoutItemAnimator<T>.b bVarP = lazyLayoutItemAnimator.f17235a.p(y0Var.getKey());
            Intrinsics.checkNotNull(bVarP);
            bVar = bVarP;
        }
        lazyLayoutItemAnimator.k(y0Var, i10, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[LOOP:0: B:7:0x0019->B:25:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[EDGE_INSN: B:29:0x0075->B:26:0x0075 BREAK  A[LOOP:0: B:7:0x0019->B:25:0x0072], SYNTHETIC] */
    private final void n() {
        if (this.f17235a.y()) {
            androidx.collection.k2<Object, LazyLayoutItemAnimator<T>.b> k2Var = this.f17235a;
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
                                for (a0 a0Var : ((b) objArr[(i10 << 3) + i12]).b()) {
                                    if (a0Var != null) {
                                        a0Var.D();
                                    }
                                }
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
            this.f17235a.K();
        }
    }

    private final void o(Object obj) {
        a0[] a0VarArrB;
        LazyLayoutItemAnimator<T>.b bVarL0 = this.f17235a.l0(obj);
        if (bVarL0 == null || (a0VarArrB = bVarL0.b()) == null) {
            return;
        }
        for (a0 a0Var : a0VarArrB) {
            if (a0Var != null) {
                a0Var.D();
            }
        }
    }

    private final void q(T t10, boolean z10) {
        LazyLayoutItemAnimator<T>.b bVarP = this.f17235a.p(t10.getKey());
        Intrinsics.checkNotNull(bVarP);
        a0[] a0VarArrB = bVarP.b();
        int length = a0VarArrB.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            a0 a0Var = a0VarArrB[i10];
            int i12 = i11 + 1;
            if (a0Var != null) {
                long jO = t10.o(i11);
                long jX = a0Var.x();
                if (!androidx.compose.ui.unit.q.k(jX, a0.f17266s.a()) && !androidx.compose.ui.unit.q.k(jX, jO)) {
                    a0Var.o(androidx.compose.ui.unit.q.r(jO, jX), z10);
                }
                a0Var.O(jO);
            }
            i10++;
            i11 = i12;
        }
    }

    static /* synthetic */ void r(LazyLayoutItemAnimator lazyLayoutItemAnimator, y0 y0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lazyLayoutItemAnimator.q(y0Var, z10);
    }

    private final int s(int[] iArr, T t10) {
        int iC = t10.c();
        int iE = t10.e() + iC;
        int iMax = 0;
        while (iC < iE) {
            int iM = iArr[iC] + t10.m();
            iArr[iC] = iM;
            iMax = Math.max(iMax, iM);
            iC++;
        }
        return iMax;
    }

    @Nullable
    public final a0 e(@NotNull Object obj, int i10) {
        a0[] a0VarArrB;
        LazyLayoutItemAnimator<T>.b bVarP = this.f17235a.p(obj);
        if (bVarP == null || (a0VarArrB = bVarP.b()) == null) {
            return null;
        }
        return a0VarArrB[i10];
    }

    public final long i() {
        long jA = androidx.compose.ui.unit.u.f42720b.a();
        List<a0> list = this.f17243i;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = list.get(i10);
            androidx.compose.ui.graphics.layer.c cVarT = a0Var.t();
            if (cVarT != null) {
                int iMax = Math.max((int) (jA >> 32), androidx.compose.ui.unit.q.n(a0Var.x()) + ((int) (cVarT.F() >> 32)));
                jA = androidx.compose.ui.unit.u.e((((long) Math.max((int) (jA & com.rabbitmq.client.k0.f265952a), androidx.compose.ui.unit.q.p(a0Var.x()) + ((int) (cVarT.F() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (((long) iMax) << 32));
            }
        }
        return jA;
    }

    @NotNull
    public final androidx.compose.ui.a0 j() {
        return this.f17245k;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x00e3 A[EDGE_INSN: B:230:0x00e3->B:42:0x00e3 BREAK  A[LOOP:1: B:28:0x009b->B:40:0x00d8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8 A[LOOP:1: B:28:0x009b->B:40:0x00d8, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int i10, int i11, int i12, @NotNull List<T> list, @NotNull o0 o0Var, @NotNull b1<T> b1Var, boolean z10, boolean z11, int i13, boolean z12, int i14, int i15, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull androidx.compose.ui.graphics.o1 o1Var) {
        List<T> list2;
        boolean z13;
        int iF;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i16;
        Object obj;
        LazyLayoutItemAnimator<T>.b bVarP;
        int i17;
        int i18;
        int i19;
        o0 o0Var2 = this.f17236b;
        this.f17236b = o0Var;
        List<T> list3 = list;
        int size = list3.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size) {
                if (!this.f17235a.x()) {
                    break;
                }
                n();
                return;
            } else if (g(list.get(i20))) {
                break;
            } else {
                i20++;
            }
        }
        int i21 = this.f17237c;
        y0 y0Var = (y0) CollectionsKt.firstOrNull((List) list);
        this.f17237c = y0Var != null ? y0Var.getIndex() : 0;
        long jF = z10 ? androidx.compose.ui.unit.q.f((((long) i10) & com.rabbitmq.client.k0.f265952a) | (((long) 0) << 32)) : androidx.compose.ui.unit.q.f((((long) i10) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a));
        boolean z14 = z11 || !z12;
        androidx.collection.k2<Object, LazyLayoutItemAnimator<T>.b> k2Var = this.f17235a;
        Object[] objArr3 = k2Var.f12131b;
        long[] jArr3 = k2Var.f12130a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            list2 = list3;
            int i22 = 0;
            while (true) {
                long j10 = jArr3[i22];
                z13 = z14;
                Object[] objArr4 = objArr3;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i23 = 8 - ((~(i22 - length)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & 255) < 128) {
                            this.f17238d.C(objArr4[(i22 << 3) + i24]);
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                    if (i22 != length) {
                        break;
                    }
                    i22++;
                    z14 = z13;
                    objArr3 = objArr4;
                } else if (i22 != length) {
                    break;
                    break;
                } else {
                    i22++;
                    z14 = z13;
                    objArr3 = objArr4;
                }
            }
        } else {
            list2 = list3;
            z13 = z14;
        }
        int size2 = list2.size();
        int i25 = 0;
        while (i25 < size2) {
            T t10 = list.get(i25);
            this.f17238d.g0(t10.getKey());
            if (g(t10)) {
                LazyLayoutItemAnimator<T>.b bVarP2 = this.f17235a.p(t10.getKey());
                int iC = o0Var2 != null ? o0Var2.c(t10.getKey()) : -1;
                boolean z15 = iC == -1 && o0Var2 != null;
                if (bVarP2 == null) {
                    LazyLayoutItemAnimator<T>.b bVar = new b();
                    b.o(bVar, t10, s0Var, o1Var, i14, i15, 0, 32, null);
                    i18 = size2;
                    i19 = i25;
                    this.f17235a.q0(t10.getKey(), bVar);
                    if (t10.getIndex() == iC || iC == -1) {
                        long jO = t10.o(0);
                        k(t10, t10.j() ? androidx.compose.ui.unit.q.p(jO) : androidx.compose.ui.unit.q.n(jO), bVar);
                        if (z15) {
                            a0[] a0VarArrB = bVar.b();
                            for (a0 a0Var : a0VarArrB) {
                                if (a0Var != null) {
                                    a0Var.m();
                                    Unit unit = Unit.f312394a;
                                }
                            }
                        }
                        Unit unit2 = Unit.f312394a;
                    } else if (iC < i21) {
                        this.f17239e.add(t10);
                    } else {
                        this.f17240f.add(t10);
                    }
                } else {
                    i18 = size2;
                    i19 = i25;
                    if (z13) {
                        b.o(bVarP2, t10, s0Var, o1Var, i14, i15, 0, 32, null);
                        a0[] a0VarArrB2 = bVarP2.b();
                        int length2 = a0VarArrB2.length;
                        int i26 = 0;
                        while (i26 < length2) {
                            a0 a0Var2 = a0VarArrB2[i26];
                            a0[] a0VarArr = a0VarArrB2;
                            int i27 = length2;
                            if (a0Var2 != null && !androidx.compose.ui.unit.q.k(a0Var2.x(), a0.f17266s.a())) {
                                a0Var2.O(androidx.compose.ui.unit.q.s(a0Var2.x(), jF));
                            }
                            i26++;
                            a0VarArrB2 = a0VarArr;
                            length2 = i27;
                        }
                        if (z15) {
                            for (a0 a0Var3 : bVarP2.b()) {
                                if (a0Var3 != null) {
                                    if (a0Var3.A()) {
                                        this.f17243i.remove(a0Var3);
                                        androidx.compose.ui.node.t tVar = this.f17244j;
                                        if (tVar != null) {
                                            androidx.compose.ui.node.u.a(tVar);
                                            Unit unit3 = Unit.f312394a;
                                        }
                                    }
                                    a0Var3.m();
                                }
                            }
                        }
                        r(this, t10, false, 2, null);
                    }
                    Unit unit4 = Unit.f312394a;
                }
            } else {
                i18 = size2;
                i19 = i25;
                o(t10.getKey());
                Unit unit5 = Unit.f312394a;
            }
            i25 = i19 + 1;
            size2 = i18;
        }
        int[] iArr = new int[i13];
        if (z13 && o0Var2 != null) {
            if (!this.f17239e.isEmpty()) {
                List<T> list4 = this.f17239e;
                if (list4.size() > 1) {
                    CollectionsKt.sortWith(list4, new e(o0Var2));
                }
                List<T> list5 = this.f17239e;
                int size3 = list5.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    T t11 = list5.get(i28);
                    l(this, t11, i14 - s(iArr, t11), null, 4, null);
                    r(this, t11, false, 2, null);
                }
                ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
            }
            if (!this.f17240f.isEmpty()) {
                List<T> list6 = this.f17240f;
                if (list6.size() > 1) {
                    CollectionsKt.sortWith(list6, new c(o0Var2));
                }
                List<T> list7 = this.f17240f;
                int size4 = list7.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    T t12 = list7.get(i29);
                    l(this, t12, (i15 + s(iArr, t12)) - t12.m(), null, 4, null);
                    r(this, t12, false, 2, null);
                }
                ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
            }
        }
        androidx.collection.l2<Object> l2Var = this.f17238d;
        Object[] objArr5 = l2Var.f12171b;
        long[] jArr4 = l2Var.f12170a;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i30 = 0;
            while (true) {
                long j11 = jArr4[i30];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i31 = 8 - ((~(i30 - length3)) >>> 31);
                    int i32 = 0;
                    while (i32 < i31) {
                        if ((j11 & 255) >= 128 || (bVarP = this.f17235a.p((obj = objArr5[(i30 << 3) + i32]))) == 0) {
                            jArr2 = jArr4;
                            objArr2 = objArr5;
                            i16 = i32;
                        } else {
                            jArr2 = jArr4;
                            int iC2 = o0Var.c(obj);
                            objArr2 = objArr5;
                            bVarP.m(Math.min(i13, bVarP.h()));
                            i16 = i32;
                            bVarP.l(Math.min(i13 - bVarP.h(), bVarP.e()));
                            if (iC2 == -1) {
                                a0[] a0VarArrB3 = bVarP.b();
                                int length4 = a0VarArrB3.length;
                                int i33 = 0;
                                boolean z16 = false;
                                int i34 = 0;
                                while (i33 < length4) {
                                    a0[] a0VarArr2 = a0VarArrB3;
                                    a0 a0Var4 = a0VarArr2[i33];
                                    int i35 = i34 + 1;
                                    if (a0Var4 != null) {
                                        if (a0Var4.A()) {
                                            Unit unit6 = Unit.f312394a;
                                            i17 = i33;
                                            z16 = true;
                                        } else if (a0Var4.z()) {
                                            a0Var4.D();
                                            bVarP.b()[i34] = null;
                                            i17 = i33;
                                            this.f17243i.remove(a0Var4);
                                            androidx.compose.ui.node.t tVar2 = this.f17244j;
                                            if (tVar2 != null) {
                                                androidx.compose.ui.node.u.a(tVar2);
                                                Unit unit7 = Unit.f312394a;
                                            }
                                        } else {
                                            i17 = i33;
                                            if (a0Var4.t() != null) {
                                                a0Var4.n();
                                            }
                                            if (a0Var4.A()) {
                                                this.f17243i.add(a0Var4);
                                                androidx.compose.ui.node.t tVar3 = this.f17244j;
                                                if (tVar3 != null) {
                                                    androidx.compose.ui.node.u.a(tVar3);
                                                    Unit unit8 = Unit.f312394a;
                                                }
                                                z16 = true;
                                            } else {
                                                a0Var4.D();
                                                bVarP.b()[i34] = null;
                                            }
                                            Unit unit9 = Unit.f312394a;
                                        }
                                        i33 = i17 + 1;
                                        a0VarArrB3 = a0VarArr2;
                                        i34 = i35;
                                    } else {
                                        i17 = i33;
                                    }
                                    i33 = i17 + 1;
                                    a0VarArrB3 = a0VarArr2;
                                    i34 = i35;
                                }
                                if (!z16) {
                                    o(obj);
                                }
                                Unit unit10 = Unit.f312394a;
                            } else {
                                androidx.compose.ui.unit.b bVarC = bVarP.c();
                                Intrinsics.checkNotNull(bVarC);
                                y0 y0VarA = b1Var.a(iC2, bVarP.e(), bVarP.h(), bVarC.x());
                                y0VarA.d(true);
                                a0[] a0VarArrB4 = bVarP.b();
                                int length5 = a0VarArrB4.length;
                                int i36 = 0;
                                while (true) {
                                    if (i36 < length5) {
                                        a0 a0Var5 = a0VarArrB4[i36];
                                        int i37 = length5;
                                        if (a0Var5 != null && a0Var5.B()) {
                                        }
                                        i36++;
                                        length5 = i37;
                                    } else if (o0Var2 != null && iC2 == o0Var2.c(obj)) {
                                        o(obj);
                                        Unit unit11 = Unit.f312394a;
                                    }
                                    bVarP.n(y0VarA, s0Var, o1Var, i14, i15, bVarP.d());
                                    if (iC2 < this.f17237c) {
                                        this.f17241g.add((T) y0VarA);
                                    } else {
                                        this.f17242h.add((T) y0VarA);
                                    }
                                }
                            }
                        }
                        j11 >>= 8;
                        i32 = i16 + 1;
                        jArr4 = jArr2;
                        objArr5 = objArr2;
                    }
                    jArr = jArr4;
                    objArr = objArr5;
                    if (i31 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    objArr = objArr5;
                }
                if (i30 == length3) {
                    break;
                }
                i30++;
                jArr4 = jArr;
                objArr5 = objArr;
            }
        }
        if (!this.f17241g.isEmpty()) {
            List<T> list8 = this.f17241g;
            if (list8.size() > 1) {
                CollectionsKt.sortWith(list8, new f(o0Var));
            }
            List<T> list9 = this.f17241g;
            int size5 = list9.size();
            for (int i38 = 0; i38 < size5; i38++) {
                T t13 = list9.get(i38);
                LazyLayoutItemAnimator<T>.b bVarP3 = this.f17235a.p(t13.getKey());
                Intrinsics.checkNotNull(bVarP3);
                LazyLayoutItemAnimator<T>.b bVar2 = bVarP3;
                t13.k((z11 ? h((y0) CollectionsKt.first((List) list)) : bVar2.g()) - s(iArr, t13), bVar2.d(), i11, i12);
                if (z13) {
                    q(t13, true);
                }
            }
            ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        if (!this.f17242h.isEmpty()) {
            List<T> list10 = this.f17242h;
            if (list10.size() > 1) {
                CollectionsKt.sortWith(list10, new d(o0Var));
            }
            List<T> list11 = this.f17242h;
            int size6 = list11.size();
            for (int i39 = 0; i39 < size6; i39++) {
                T t14 = list11.get(i39);
                LazyLayoutItemAnimator<T>.b bVarP4 = this.f17235a.p(t14.getKey());
                Intrinsics.checkNotNull(bVarP4);
                LazyLayoutItemAnimator<T>.b bVar3 = bVarP4;
                int iS = s(iArr, t14);
                if (z11) {
                    y0 y0Var2 = (y0) CollectionsKt.last((List) list);
                    iF = h(y0Var2) + y0Var2.m();
                } else {
                    iF = bVar3.f();
                }
                t14.k((iF - t14.m()) + iS, bVar3.d(), i11, i12);
                if (z13) {
                    q(t14, true);
                }
            }
        }
        List<T> list12 = this.f17241g;
        CollectionsKt.reverse(list12);
        Unit unit12 = Unit.f312394a;
        list.addAll(0, list12);
        list.addAll(this.f17242h);
        this.f17239e.clear();
        this.f17240f.clear();
        this.f17241g.clear();
        this.f17242h.clear();
        this.f17238d.L();
    }

    public final void p() {
        n();
        this.f17236b = null;
        this.f17237c = -1;
    }
}
