package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.c5;
import androidx.compose.foundation.gestures.r3;
import androidx.compose.foundation.gestures.x1;
import androidx.compose.foundation.s1;
import androidx.compose.foundation.text.input.internal.f4;
import androidx.compose.foundation.text.input.internal.n4;
import androidx.compose.foundation.text.input.internal.o3;
import androidx.compose.foundation.text.input.internal.q6;
import androidx.compose.foundation.text.input.internal.r6;
import androidx.compose.foundation.text.input.internal.w6;
import androidx.compose.foundation.text.input.internal.y6;
import androidx.compose.foundation.text.k3;
import androidx.compose.foundation.text.k5;
import androidx.compose.foundation.text.n5;
import androidx.compose.foundation.text.selection.n2;
import androidx.compose.foundation.text.selection.o1;
import androidx.compose.foundation.text.selection.r1;
import androidx.compose.foundation.text.selection.z4;
import androidx.compose.foundation.text.x6;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 11 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1712:1\n85#2:1713\n117#2,2:1714\n85#2:1716\n117#2,2:1717\n85#2:1719\n117#2,2:1720\n85#2:1724\n117#2,2:1725\n85#2:1727\n117#2,2:1728\n85#2:1730\n117#2,2:1731\n85#2:1733\n117#2,2:1734\n85#2:1736\n117#2,2:1737\n85#2:1772\n278#3:1722\n278#3:1723\n30#3:1778\n30#3:1785\n273#3:1801\n273#3:1802\n1#4:1739\n604#5,7:1740\n54#6:1747\n85#7:1748\n53#7,3:1779\n70#7:1783\n53#7,3:1786\n70#7:1790\n60#7:1793\n60#7:1796\n70#7:1799\n730#8,23:1749\n72#9,5:1773\n69#10:1782\n69#10:1789\n65#10:1792\n65#10:1795\n69#10:1798\n22#11:1784\n22#11:1791\n22#11:1794\n22#11:1797\n22#11:1800\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n140#1:1713\n140#1:1714,2\n158#1:1716\n158#1:1717,2\n176#1:1719\n176#1:1720,2\n208#1:1724\n208#1:1725,2\n221#1:1727\n221#1:1728,2\n224#1:1730\n224#1:1731,2\n230#1:1733\n230#1:1734,2\n233#1:1736\n233#1:1737,2\n1182#1:1772\n191#1:1722\n196#1:1723\n1243#1:1778\n1247#1:1785\n616#1:1801\n1057#1:1802\n314#1:1740,7\n347#1:1747\n347#1:1748\n1243#1:1779,3\n1244#1:1783\n1247#1:1786,3\n1248#1:1790\n1250#1:1793\n1251#1:1796\n1253#1:1799\n558#1:1749,23\n1225#1:1773,5\n1244#1:1782\n1248#1:1789\n1250#1:1792\n1251#1:1795\n1253#1:1798\n1244#1:1784\n1248#1:1791\n1250#1:1794\n1251#1:1797\n1253#1:1800\n*E\n"})
public final class d0 {
    public static final int C = 8;

    @NotNull
    private final n7 A;

    @NotNull
    private androidx.compose.foundation.text.input.internal.selection.b B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w6 f19812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q6 f19813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f19814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.contextmenu.modifier.o f19819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f19820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.text.selection.x f19821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private m1 f19822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private p0.a f19823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private z0 f19824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final n3 f19825n = d7.g(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f19826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private Function0<? extends androidx.compose.foundation.content.internal.c> f19827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final n3 f19828q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final n3 f19829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final n3 f19830s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final n3 f19831t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final n3 f19832u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final n3 f19833v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final n3 f19834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private o1 f19835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f19836y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.l.b f19837z;

    public enum a {
        None,
        Touch,
        Mouse;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f19842e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f19842e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements androidx.compose.foundation.text.selection.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f19843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19844b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f19845c = n0.g.f332700b.c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f19846d = true;

        public b(Function0<Unit> function0) {
            this.f19843a = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String k() {
            return "Mouse.onDragDone";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l(long j10) {
            return "Mouse.onDrag " + ((Object) n0.g.z(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String m() {
            return "Mouse.onExtendDrag";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String n() {
            return "Mouse.onExtend";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String o() {
            return "Mouse.onStart";
        }

        private final long p(long j10, androidx.compose.foundation.text.selection.n0 n0Var, p3 p3Var, boolean z10) {
            int length = p3Var.l().n().length();
            int iH = this.f19844b;
            if (iH < 0 || iH > length) {
                iH = d0.this.f19813b.h(this.f19845c, false);
            }
            int i10 = iH;
            int iH2 = d0.this.f19813b.h(j10, false);
            d0 d0Var = d0.this;
            long jR1 = d0Var.r1(d0Var.G0().u(), i10, iH2, false, n0Var, false, z10);
            if (this.f19844b == -1 && !w3.h(jR1)) {
                this.f19844b = w3.n(jR1);
            }
            if (w3.m(jR1)) {
                jR1 = o0.e(jR1);
            }
            d0.this.G0().L(jR1);
            d0.this.t1(a1.Selection);
            return jR1;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean a(final long j10, @NotNull androidx.compose.foundation.text.selection.n0 n0Var) {
            p3 p3VarF = d0.this.f19813b.f();
            if (!d0.this.f19815d || p3VarF == null || d0.this.G0().u().length() == 0) {
                return false;
            }
            o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.b.l(j10);
                }
            });
            if (!w3.g(d0.this.G0().u().h(), p(j10, n0Var, p3VarF, false))) {
                this.f19846d = false;
            }
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean b(long j10, @NotNull androidx.compose.foundation.text.selection.n0 n0Var, int i10) {
            p3 p3VarF = d0.this.f19813b.f();
            if (!d0.this.f19815d || p3VarF == null || d0.this.G0().u().length() == 0) {
                return false;
            }
            this.f19846d = i10 >= 2;
            o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.b.o();
                }
            });
            d0.this.a1(a.Mouse);
            this.f19843a.invoke();
            d0.this.f19836y = -1;
            this.f19844b = -1;
            this.f19845c = j10;
            this.f19844b = w3.n(p(j10, n0Var, p3VarF, true));
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public void c() {
            o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.b.k();
                }
            });
            d0.this.a1(a.None);
            if (this.f19846d) {
                d0.this.P0();
            }
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean d(long j10) {
            o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.b.m();
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean e(long j10) {
            o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.b.n();
                }
            });
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1712:1\n273#2:1713\n1#3:1714\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n*L\n816#1:1713\n*E\n"})
    final class c implements k5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f19848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19849b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f19850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f19851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private k3 f19852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f19853f;

        public c(Function0<Unit> function0) {
            this.f19848a = function0;
            n0.g.a aVar = n0.g.f332700b;
            this.f19850c = aVar.c();
            this.f19851d = aVar.e();
            this.f19852e = k3.SelectionEnd;
            this.f19853f = true;
        }

        private final void i() {
            if ((this.f19850c & 9223372034707292159L) != n0.d.f332689d) {
                o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.k0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.c.j();
                    }
                });
                d0.this.P();
                this.f19849b = -1;
                n0.g.a aVar = n0.g.f332700b;
                this.f19850c = aVar.c();
                this.f19851d = aVar.e();
                d0.this.f19836y = -1;
                d0.this.a1(a.None);
                this.f19848a.invoke();
                if (this.f19853f) {
                    d0.this.P0();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j() {
            return "Touch.onDragStop";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String k(long j10) {
            return "Touch.onDrag at " + ((Object) n0.g.z(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l(long j10) {
            return "Touch.onDragStart after longPress at " + ((Object) n0.g.z(j10));
        }

        @Override // androidx.compose.foundation.text.k5
        public void a() {
            i();
        }

        @Override // androidx.compose.foundation.text.k5
        public void b(long j10) {
        }

        @Override // androidx.compose.foundation.text.k5
        public void c(long j10) {
            int iIntValue;
            int iH;
            androidx.compose.foundation.text.selection.n0 n0VarO;
            k3 k3Var;
            if (!d0.this.f19815d || d0.this.f19813b.f() == null || d0.this.G0().u().length() == 0) {
                return;
            }
            long jW = n0.g.w(this.f19851d, j10);
            this.f19851d = jW;
            final long jW2 = n0.g.w(this.f19850c, jW);
            o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.c.k(jW2);
                }
            });
            if (this.f19849b >= 0 || d0.this.f19813b.l(jW2)) {
                Integer numValueOf = Integer.valueOf(this.f19849b);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : d0.this.f19813b.h(this.f19850c, false);
                iH = d0.this.f19813b.h(jW2, false);
                if (this.f19849b < 0 && iIntValue == iH) {
                    return;
                }
                n0VarO = androidx.compose.foundation.text.selection.n0.f21271a.o();
                d0.this.t1(a1.Selection);
            } else {
                iIntValue = q6.i(d0.this.f19813b, this.f19850c, false, 2, null);
                iH = q6.i(d0.this.f19813b, jW2, false, 2, null);
                n0VarO = iIntValue == iH ? androidx.compose.foundation.text.selection.n0.f21271a.m() : androidx.compose.foundation.text.selection.n0.f21271a.o();
            }
            int i10 = iIntValue;
            int i11 = iH;
            androidx.compose.foundation.text.selection.n0 n0Var = n0VarO;
            long jH = d0.this.G0().u().h();
            d0 d0Var = d0.this;
            long jS1 = d0.s1(d0Var, d0Var.G0().u(), i10, i11, false, n0Var, false, false, 64, null);
            if (this.f19849b == -1 && !w3.h(jS1)) {
                this.f19849b = w3.n(jS1);
            }
            if (w3.m(jS1)) {
                jS1 = o0.e(jS1);
            }
            if (!w3.g(jS1, jH)) {
                if (w3.n(jS1) == w3.n(jH) || w3.i(jS1) != w3.i(jH)) {
                    k3Var = ((w3.n(jS1) != w3.n(jH) || w3.i(jS1) == w3.i(jH)) && ((float) (w3.n(jS1) + w3.i(jS1))) / 2.0f <= ((float) (w3.n(jH) + w3.i(jH))) / 2.0f) ? k3.SelectionStart : k3.SelectionEnd;
                } else {
                    k3Var = k3.SelectionStart;
                }
                this.f19852e = k3Var;
                this.f19853f = false;
            }
            if (w3.h(jH) || !w3.h(jS1)) {
                d0.this.G0().L(jS1);
            }
            d0.this.q1(this.f19852e, jW2);
        }

        @Override // androidx.compose.foundation.text.k5
        public void d(final long j10) {
            if (d0.this.f19815d) {
                o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.c.l(j10);
                    }
                });
                d0.this.q1(this.f19852e, j10);
                d0.this.h1(false);
                d0.this.a1(a.Touch);
                this.f19850c = j10;
                this.f19851d = n0.g.f332700b.e();
                d0.this.f19836y = -1;
                this.f19853f = true;
                if (d0.this.f19813b.f() == null) {
                    return;
                }
                if (d0.this.f19813b.l(j10)) {
                    if (d0.this.G0().u().length() == 0) {
                        return;
                    }
                    int i10 = q6.i(d0.this.f19813b, j10, false, 2, null);
                    long jS1 = d0.s1(d0.this, new androidx.compose.foundation.text.input.l(d0.this.G0().u(), w3.f42333b.a(), null, null, null, null, 60, null), i10, i10, false, androidx.compose.foundation.text.selection.n0.f21271a.o(), false, false, 96, null);
                    d0.this.G0().L(jS1);
                    d0.this.t1(a1.Selection);
                    this.f19849b = w3.n(jS1);
                    return;
                }
                int i11 = q6.i(d0.this.f19813b, j10, false, 2, null);
                p0.a aVar = d0.this.f19823l;
                if (aVar != null) {
                    aVar.a(p0.b.f340720b.j());
                }
                d0.this.G0().D(i11);
                d0.this.h1(true);
                this.f19853f = false;
                d0.this.t1(a1.Cursor);
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void e() {
        }

        @Override // androidx.compose.foundation.text.k5
        public void onCancel() {
            i();
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19855a;

        static {
            int[] iArr = new int[o3.values().length];
            try {
                iArr[o3.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o3.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o3.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o3.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19855a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {1399}, m = "copy", n = {"cancelSelection"}, s = {"Z$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f19856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19857b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f19859d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19857b = obj;
            this.f19859d |= Integer.MIN_VALUE;
            return d0.this.Q(false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super p2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19861b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.l0 f19863d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f19865b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f19866c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f19865b = d0Var;
                this.f19866c = l0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f19865b, this.f19866c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19864a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    d0 d0Var = this.f19865b;
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f19866c;
                    this.f19864a = 1;
                    if (d0Var.m0(l0Var, this) == objL) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {396}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19867a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f19868b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f19869c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d0 d0Var, androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f19868b = d0Var;
                this.f19869c = l0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f19868b, this.f19869c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19867a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    d0 d0Var = this.f19868b;
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f19869c;
                    this.f19867a = 1;
                    if (d0Var.W(l0Var, this) == objL) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {398}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19870a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f19871b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d0 f19872c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(androidx.compose.ui.input.pointer.l0 l0Var, d0 d0Var, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f19871b = l0Var;
                this.f19872c = d0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(d0 d0Var, n0.g gVar) {
                a1 a1VarJ0 = d0Var.J0();
                a1 a1Var = a1.Cursor;
                if (a1VarJ0 == a1Var) {
                    a1Var = a1.None;
                }
                d0Var.k1(a1Var);
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f19871b, this.f19872c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19870a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f19871b;
                    final d0 d0Var = this.f19872c;
                    Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.m0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return d0.f.c.m(d0Var, (n0.g) obj2);
                        }
                    };
                    this.f19870a = 1;
                    if (c5.p(l0Var, null, null, null, function1, this, 7, null) == objL) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f19863d = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = d0.this.new f(this.f19863d, dVar);
            fVar.f19861b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19860a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f19861b;
            kotlinx.coroutines.u0 u0Var = kotlinx.coroutines.u0.UNDISPATCHED;
            kotlinx.coroutines.k.f(s0Var, null, u0Var, new a(d0.this, this.f19863d, null), 1, null);
            kotlinx.coroutines.k.f(s0Var, null, u0Var, new b(d0.this, this.f19863d, null), 1, null);
            return kotlinx.coroutines.k.f(s0Var, null, u0Var, new c(this.f19863d, d0.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super p2> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {}, l = {1375}, m = "cut", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f19873a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19875c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19873a = obj;
            this.f19875c |= Integer.MIN_VALUE;
            return d0.this.T(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0}, l = {625}, m = "detectCursorHandleDragGestures", n = {"cursorDragStart", "cursorDragDelta"}, s = {"L$0", "L$1"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f19876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f19877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f19878c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19880e;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19878c = obj;
            this.f19880e |= Integer.MIN_VALUE;
            return d0.this.W(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0}, l = {1067}, m = "detectSelectionHandleDragGestures", n = {"dragBeginPosition", "dragTotalDistance", "handle"}, s = {"L$0", "L$1", "L$2"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f19881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f19882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f19883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f19884d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f19886f;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19884d = obj;
            this.f19886f |= Integer.MIN_VALUE;
            return d0.this.c0(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {503}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ long f19889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f19890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0 f19891e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", i = {}, l = {516, 524}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19892a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f19893b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ r3 f19894c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d0 f19895d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f19896e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.j f19897f;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.d0$j$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", i = {1}, l = {androidx.constraintlayout.core.motion.utils.v.g.f44096p, androidx.core.view.f0.f48707j}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
            static final class C0140a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f19898a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f19899b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ d0 f19900c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f19901d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.j f19902e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0140a(d0 d0Var, long j10, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d<? super C0140a> dVar) {
                    super(2, dVar);
                    this.f19900c = d0Var;
                    this.f19901d = j10;
                    this.f19902e = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0140a(this.f19900c, this.f19901d, this.f19902e, dVar);
                }

                /* JADX WARN: Code duplicated, block: B:22:0x006a  */
                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    d0 d0Var;
                    androidx.compose.foundation.interaction.l.b bVar;
                    androidx.compose.foundation.interaction.j jVar;
                    androidx.compose.foundation.interaction.l.b bVar2;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f19899b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            d0Var = (d0) this.f19898a;
                            ResultKt.m(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar2 = (androidx.compose.foundation.interaction.l.b) this.f19898a;
                            ResultKt.m(obj);
                        }
                        this.f19900c.f19837z = bVar2;
                        return Unit.f312394a;
                    }
                    ResultKt.m(obj);
                    androidx.compose.foundation.interaction.l.b bVar3 = this.f19900c.f19837z;
                    if (bVar3 != null) {
                        androidx.compose.foundation.interaction.j jVar2 = this.f19902e;
                        d0 d0Var2 = this.f19900c;
                        androidx.compose.foundation.interaction.l.a aVar = new androidx.compose.foundation.interaction.l.a(bVar3);
                        this.f19898a = d0Var2;
                        this.f19899b = 1;
                        if (jVar2.b(aVar, this) != objL) {
                            d0Var = d0Var2;
                        }
                    } else {
                        bVar = new androidx.compose.foundation.interaction.l.b(this.f19901d, null);
                        jVar = this.f19902e;
                        this.f19898a = bVar;
                        this.f19899b = 2;
                        if (jVar.b(bVar, this) != objL) {
                            bVar2 = bVar;
                            this.f19900c.f19837z = bVar2;
                            return Unit.f312394a;
                        }
                    }
                    return objL;
                    d0Var.f19837z = null;
                    bVar = new androidx.compose.foundation.interaction.l.b(this.f19901d, null);
                    jVar = this.f19902e;
                    this.f19898a = bVar;
                    this.f19899b = 2;
                    if (jVar.b(bVar, this) != objL) {
                        bVar2 = bVar;
                        this.f19900c.f19837z = bVar2;
                        return Unit.f312394a;
                    }
                    return objL;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0140a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r3 r3Var, d0 d0Var, long j10, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f19894c = r3Var;
                this.f19895d = d0Var;
                this.f19896e = j10;
                this.f19897f = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f19894c, this.f19895d, this.f19896e, this.f19897f, dVar);
                aVar.f19893b = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
            
                if (r3.b(r13, r12) == r0) goto L22;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r11 = 1
                    int r1 = r12.f19892a
                    r11 = 3
                    r2 = 2
                    r3 = 0
                    r3 = 1
                    if (r1 == 0) goto L23
                    r11 = 7
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    kotlin.ResultKt.m(r13)
                    goto L80
                L16:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L1e:
                    kotlin.ResultKt.m(r13)
                    r11 = 3
                    goto L53
                L23:
                    kotlin.ResultKt.m(r13)
                    java.lang.Object r13 = r12.f19893b
                    r4 = r13
                    r11 = 3
                    kotlinx.coroutines.s0 r4 = (kotlinx.coroutines.s0) r4
                    androidx.compose.foundation.text.input.internal.selection.d0$j$a$a r5 = new androidx.compose.foundation.text.input.internal.selection.d0$j$a$a
                    androidx.compose.foundation.text.input.internal.selection.d0 r6 = r12.f19895d
                    long r7 = r12.f19896e
                    r11 = 7
                    androidx.compose.foundation.interaction.j r9 = r12.f19897f
                    r11 = 3
                    r10 = 0
                    r5.<init>(r6, r7, r9, r10)
                    r11 = 1
                    r8 = 3
                    r9 = 0
                    r7 = r5
                    r11 = 4
                    r5 = 0
                    r6 = 4
                    r6 = 0
                    r11 = 5
                    kotlinx.coroutines.i.e(r4, r5, r6, r7, r8, r9)
                    androidx.compose.foundation.gestures.r3 r13 = r12.f19894c
                    r11 = 0
                    r12.f19892a = r3
                    r11 = 4
                    java.lang.Object r13 = r13.l6(r12)
                    if (r13 != r0) goto L53
                    goto L7e
                L53:
                    r11 = 4
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    androidx.compose.foundation.text.input.internal.selection.d0 r1 = r12.f19895d
                    androidx.compose.foundation.interaction.l$b r1 = androidx.compose.foundation.text.input.internal.selection.d0.u(r1)
                    r11 = 0
                    if (r1 == 0) goto L80
                    androidx.compose.foundation.interaction.j r3 = r12.f19897f
                    r11 = 2
                    if (r13 == 0) goto L6f
                    androidx.compose.foundation.interaction.l$c r13 = new androidx.compose.foundation.interaction.l$c
                    r13.<init>(r1)
                    r11 = 6
                    goto L75
                L6f:
                    androidx.compose.foundation.interaction.l$a r13 = new androidx.compose.foundation.interaction.l$a
                    r11 = 6
                    r13.<init>(r1)
                L75:
                    r12.f19892a = r2
                    java.lang.Object r13 = r3.b(r13, r12)
                    r11 = 1
                    if (r13 != r0) goto L80
                L7e:
                    r11 = 2
                    return r0
                L80:
                    androidx.compose.foundation.text.input.internal.selection.d0 r12 = r12.f19895d
                    r11 = 3
                    r13 = 0
                    androidx.compose.foundation.text.input.internal.selection.d0.D(r12, r13)
                    kotlin.Unit r12 = kotlin.Unit.f312394a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.d0.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.foundation.interaction.j jVar, d0 d0Var, kotlin.coroutines.d<? super j> dVar) {
            super(3, dVar);
            this.f19890d = jVar;
            this.f19891e = d0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(r3 r3Var, n0.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
            return k(r3Var, gVar.B(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f19887a;
            if (i10 == 0) {
                ResultKt.m(obj);
                r3 r3Var = (r3) this.f19888b;
                long j10 = this.f19889c;
                androidx.compose.foundation.interaction.j jVar = this.f19890d;
                if (jVar != null) {
                    a aVar = new a(r3Var, this.f19891e, j10, jVar, null);
                    this.f19887a = 1;
                    if (kotlinx.coroutines.t0.g(aVar, this) == objL) {
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

        public final Object k(r3 r3Var, long j10, kotlin.coroutines.d<? super Unit> dVar) {
            j jVar = new j(this.f19890d, this.f19891e, dVar);
            jVar.f19888b = r3Var;
            jVar.f19889c = j10;
            return jVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", i = {0}, l = {467}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    static final class k extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19904b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            int i10 = 5 ^ 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            k kVar = d0.this.new k(dVar);
            kVar.f19904b = obj;
            return kVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0036 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0034 -> B:12:0x0037). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0036
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f19903a
                r2 = 1
                r4 = 4
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L15
                java.lang.Object r1 = r5.f19904b
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.ResultKt.m(r6)
                r4 = 0
                goto L37
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 3
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1e:
                kotlin.ResultKt.m(r6)
                r4 = 3
                java.lang.Object r6 = r5.f19904b
                androidx.compose.ui.input.pointer.c r6 = (androidx.compose.ui.input.pointer.c) r6
                r1 = r6
            L27:
                r4 = 4
                androidx.compose.ui.input.pointer.s r6 = androidx.compose.ui.input.pointer.s.Initial
                r5.f19904b = r1
                r4 = 7
                r5.f19903a = r2
                java.lang.Object r6 = r1.I6(r6, r5)
                r4 = 3
                if (r6 != r0) goto L37
                return r0
            L37:
                androidx.compose.ui.input.pointer.q r6 = (androidx.compose.ui.input.pointer.q) r6
                androidx.compose.foundation.text.input.internal.selection.d0 r3 = androidx.compose.foundation.text.input.internal.selection.d0.this
                boolean r6 = androidx.compose.foundation.text.selection.i1.q(r6)
                r6 = r6 ^ r2
                r3.d1(r6)
                r4 = 1
                goto L27
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.d0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1", f = "TextFieldSelectionState.kt", i = {}, l = {1025}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.x f19907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f19908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f19909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0 f19910e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.foundation.text.selection.x xVar, CharSequence charSequence, long j10, d0 d0Var, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f19907b = xVar;
            this.f19908c = charSequence;
            this.f19909d = j10;
            this.f19910e = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new l(this.f19907b, this.f19908c, this.f19909d, this.f19910e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f19906a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.text.selection.x xVar = this.f19907b;
                CharSequence charSequence = this.f19908c;
                long j10 = this.f19909d;
                this.f19906a = 1;
                obj = xVar.b(charSequence, j10, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            w3 w3Var = (w3) obj;
            if (!this.f19910e.f19818g && w3Var != null && Intrinsics.areEqual(this.f19910e.G0().u().i(), this.f19908c) && w3.g(this.f19910e.G0().u().h(), this.f19909d)) {
                if (!w3.g(w3Var.r(), this.f19910e.G0().u().h())) {
                    this.f19910e.G0().L(w3Var.r());
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class m extends kotlin.jvm.internal.g0 implements Function2<androidx.compose.foundation.text.input.l, CharSequence, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f19911a = new m();

        m() {
            super(2, androidx.compose.foundation.text.input.l.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.foundation.text.input.l lVar, CharSequence charSequence) {
            return Boolean.valueOf(lVar.a(charSequence));
        }
    }

    static final class n<T> implements kotlinx.coroutines.flow.j {
        n() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(androidx.compose.foundation.text.input.l lVar, kotlin.coroutines.d<? super Unit> dVar) {
            d0.this.h1(false);
            d0.this.t1(a1.None);
            return Unit.f312394a;
        }
    }

    static final class o<T> implements kotlinx.coroutines.flow.j {
        o() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(n0.j jVar, kotlin.coroutines.d<? super Unit> dVar) {
            if (jVar != null) {
                Object objL1 = d0.this.l1(jVar, dVar);
                return objL1 == kotlin.coroutines.intrinsics.b.l() ? objL1 : Unit.f312394a;
            }
            d0.this.K0();
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {1}, l = {1429, 1431, 1431}, m = "paste", n = {"receiveContentConfiguration"}, s = {"L$0"})
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f19914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19915b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f19917d;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19915b = obj;
            this.f19917d |= Integer.MIN_VALUE;
            return d0.this.V0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {}, l = {1462, 1462}, m = "pasteAsPlainText", n = {}, s = {})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f19918a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19920c;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19918a = obj;
            this.f19920c |= Integer.MIN_VALUE;
            return d0.this.W0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class r extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super p2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19922b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.l0 f19924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f19925e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19926a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f19927b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f19928c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f19927b = d0Var;
                this.f19928c = l0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f19927b, this.f19928c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19926a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    d0 d0Var = this.f19927b;
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f19928c;
                    this.f19926a = 1;
                    if (d0Var.m0(l0Var, this) == objL) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {410}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19929a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f19930b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d0 f19931c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f19932d;

            static final class a implements androidx.compose.foundation.text.input.internal.selection.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ d0 f19933a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f19934b;

                a(d0 d0Var, boolean z10) {
                    this.f19933a = d0Var;
                    this.f19934b = z10;
                }

                @Override // androidx.compose.foundation.text.input.internal.selection.f
                public final void a(long j10) {
                    this.f19933a.O0();
                    d0 d0Var = this.f19933a;
                    boolean z10 = this.f19934b;
                    d0Var.q1(z10 ? k3.SelectionStart : k3.SelectionEnd, androidx.compose.foundation.text.selection.m1.a(d0Var.x0(z10)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.input.pointer.l0 l0Var, d0 d0Var, boolean z10, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f19930b = l0Var;
                this.f19931c = d0Var;
                this.f19932d = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(d0 d0Var) {
                d0Var.P();
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f19930b, this.f19931c, this.f19932d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19929a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f19930b;
                    a aVar = new a(this.f19931c, this.f19932d);
                    final d0 d0Var = this.f19931c;
                    Function0 function0 = new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.n0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d0.r.b.m(d0Var);
                        }
                    };
                    this.f19929a = 1;
                    if (androidx.compose.foundation.text.input.internal.selection.d.a(l0Var, aVar, function0, this) == objL) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19935a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f19936b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f19937c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f19938d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d0 d0Var, androidx.compose.ui.input.pointer.l0 l0Var, boolean z10, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f19936b = d0Var;
                this.f19937c = l0Var;
                this.f19938d = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f19936b, this.f19937c, this.f19938d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19935a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    d0 d0Var = this.f19936b;
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f19937c;
                    boolean z10 = this.f19938d;
                    this.f19935a = 1;
                    if (d0Var.c0(l0Var, z10, this) == objL) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(androidx.compose.ui.input.pointer.l0 l0Var, boolean z10, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.f19924d = l0Var;
            this.f19925e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            r rVar = d0.this.new r(this.f19924d, this.f19925e, dVar);
            rVar.f19922b = obj;
            return rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19921a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f19922b;
            kotlinx.coroutines.u0 u0Var = kotlinx.coroutines.u0.UNDISPATCHED;
            kotlinx.coroutines.k.f(s0Var, null, u0Var, new a(d0.this, this.f19924d, null), 1, null);
            kotlinx.coroutines.k.f(s0Var, null, u0Var, new b(this.f19924d, d0.this, this.f19925e, null), 1, null);
            return kotlinx.coroutines.k.f(s0Var, null, u0Var, new c(d0.this, this.f19924d, this.f19925e, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super p2> dVar) {
            return ((r) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {}, l = {438}, m = "startToolbarAndHandlesVisibilityObserver", n = {}, s = {})
    static final class s extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f19939a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19941c;

        s(kotlin.coroutines.d<? super s> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19939a = obj;
            this.f19941c |= Integer.MIN_VALUE;
            return d0.this.m1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class t extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super p2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19943b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {439}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19945a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f19946b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f19946b = d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f19946b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19945a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    d0 d0Var = this.f19946b;
                    this.f19945a = 1;
                    if (d0Var.Q0(this) == objL) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {440}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19947a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f19948b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d0 d0Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f19948b = d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f19948b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19947a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    d0 d0Var = this.f19948b;
                    this.f19947a = 1;
                    if (d0Var.S0(this) == objL) {
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

        t(kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            t tVar = d0.this.new t(dVar);
            tVar.f19943b = obj;
            return tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19942a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f19943b;
            kotlinx.coroutines.k.f(s0Var, null, null, new a(d0.this, null), 3, null);
            return kotlinx.coroutines.k.f(s0Var, null, null, new b(d0.this, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super p2> dVar) {
            return ((t) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public d0(@NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull androidx.compose.ui.unit.d dVar, boolean z10, boolean z11, boolean z12, boolean z13, @NotNull androidx.compose.foundation.text.contextmenu.modifier.o oVar, @NotNull kotlinx.coroutines.s0 s0Var, @Nullable androidx.compose.foundation.text.selection.x xVar, @NotNull m1 m1Var) {
        this.f19812a = w6Var;
        this.f19813b = q6Var;
        this.f19814c = dVar;
        this.f19815d = z10;
        this.f19816e = z11;
        this.f19817f = z12;
        this.f19818g = z13;
        this.f19819h = oVar;
        this.f19820i = s0Var;
        this.f19821j = xVar;
        this.f19822k = m1Var;
        n0.g.a aVar = n0.g.f332700b;
        this.f19828q = d7.g(n0.g.d(aVar.c()), null, 2, null);
        this.f19829r = d7.g(n0.g.d(aVar.c()), null, 2, null);
        this.f19830s = d7.g(null, null, 2, null);
        this.f19831t = d7.g(a.None, null, 2, null);
        Boolean bool = Boolean.FALSE;
        this.f19832u = d7.g(bool, null, 2, null);
        this.f19833v = d7.g(a1.None, null, 2, null);
        this.f19834w = d7.g(bool, null, 2, null);
        this.f19836y = -1;
        this.A = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.U(this.f20039a);
            }
        });
        this.B = new androidx.compose.foundation.text.input.internal.selection.b(this.f19822k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean D0() {
        return ((Boolean) this.f19832u.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long E0() {
        return ((n0.g) this.f19828q.getValue()).B();
    }

    private final long F0(int i10, int i11, w3 w3Var, boolean z10, androidx.compose.foundation.text.selection.n0 n0Var) {
        p3 p3VarF = this.f19813b.f();
        if (p3VarF == null) {
            return w3.f42333b.a();
        }
        if (w3Var == null && Intrinsics.areEqual(n0Var, androidx.compose.foundation.text.selection.n0.f21271a.k())) {
            return x3.b(i10, i11);
        }
        o1 o1VarB = r1.b(p3VarF, i10, i11, this.f19836y, w3Var != null ? w3Var.r() : w3.f42333b.a(), w3Var == null, z10);
        if (w3Var != null && !o1VarB.f(this.f19835x)) {
            return w3Var.r();
        }
        long j10 = n0Var.a(o1VarB).j();
        this.f19835x = o1VarB;
        this.f19836y = z10 ? i10 : i11;
        return j10;
    }

    private final androidx.compose.ui.layout.g0 H0() {
        androidx.compose.ui.layout.g0 g0VarK = this.f19813b.k();
        if (g0VarK == null || !g0VarK.I()) {
            return null;
        }
        return g0VarK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final a1 J0() {
        return (a1) this.f19833v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0() {
        if (s1.f18599d) {
            this.f19819h.b();
            return;
        }
        z0 z0Var = this.f19824m;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    private final boolean L0() {
        n0.j jVarI;
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            long jL = r0().l();
            aVar.x(mVarG, mVarM, function1L);
            androidx.compose.ui.layout.g0 g0VarH0 = H0();
            if (g0VarH0 == null || (jVarI = n2.i(g0VarH0)) == null) {
                return false;
            }
            return n2.d(jVarI, jL);
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0() {
        i1(p0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q0(kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = kotlinx.coroutines.flow.k.l0(kotlinx.coroutines.flow.k.j0(androidx.compose.runtime.w6.y(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.R0(this.f20041a);
            }
        }), m.f19911a), 1).collect(new n(), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    public static /* synthetic */ Object R(d0 d0Var, boolean z10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return d0Var.Q(z10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.text.input.l R0(d0 d0Var) {
        return d0Var.f19812a.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S0(kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.flow.i iVarY = androidx.compose.runtime.w6.y(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.T0(this.f19995a);
            }
        });
        if (s1.f18599d) {
            iVarY = kotlinx.coroutines.flow.k.k0(iVarY, new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(d0.U0((n0.j) obj));
                }
            });
        }
        Object objCollect = iVarY.collect(new o(), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j T0(d0 d0Var) {
        return d0Var.s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j U(d0 d0Var) {
        androidx.compose.ui.layout.g0 g0VarH0;
        boolean zH = w3.h(d0Var.f19812a.u().h());
        if (((zH && d0Var.J0() == a1.Cursor) || (!zH && d0Var.J0() == a1.Selection)) && d0Var.u0() == null && d0Var.N0() && (g0VarH0 = d0Var.H0()) != null) {
            n0.j jVarI = n2.i(g0VarH0);
            n0.j jVarC = n0.k.c(g0VarH0.k0(jVarI.E()), jVarI.z());
            n0.j jVarO0 = d0Var.o0();
            if (jVarO0.R(jVarC)) {
                return jVarO0.K(jVarC);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U0(n0.j jVar) {
        return jVar == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object W(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        h hVar;
        i1.g gVar;
        Throwable th2;
        i1.g gVar2;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f19880e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f19880e = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        h hVar2 = hVar;
        Object obj = hVar2.f19878c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar2.f19880e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar2 = (i1.g) hVar2.f19877b;
            gVar = (i1.g) hVar2.f19876a;
            try {
                ResultKt.m(obj);
                b0(gVar, gVar2, this);
                return Unit.f312394a;
            } catch (Throwable th3) {
                th2 = th3;
                b0(gVar, gVar2, this);
                throw th2;
            }
        }
        ResultKt.m(obj);
        final i1.g gVar3 = new i1.g();
        n0.g.a aVar = n0.g.f332700b;
        gVar3.f312750a = aVar.c();
        final i1.g gVar4 = new i1.g();
        gVar4.f312750a = aVar.c();
        try {
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return d0.Z(gVar3, this, gVar4, (n0.g) obj2);
                }
            };
            Function0 function0 = new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.a0(gVar3, gVar4, this);
                }
            };
            Function0 function2 = new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.X(gVar3, gVar4, this);
                }
            };
            Function2 function3 = new Function2() { // from class: androidx.compose.foundation.text.input.internal.selection.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return d0.Y(gVar4, this, gVar3, (androidx.compose.ui.input.pointer.c0) obj2, (n0.g) obj3);
                }
            };
            hVar2.f19876a = gVar3;
            hVar2.f19877b = gVar4;
            hVar2.f19880e = 1;
            if (x1.K(l0Var, function1, function0, function2, function3, hVar2) == objL) {
                return objL;
            }
            gVar = gVar3;
            gVar2 = gVar4;
            b0(gVar, gVar2, this);
            return Unit.f312394a;
        } catch (Throwable th4) {
            gVar = gVar3;
            th2 = th4;
            gVar2 = gVar4;
            b0(gVar, gVar2, this);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r9 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W0(kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.text.input.internal.selection.d0.q
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text.input.internal.selection.d0$q r0 = (androidx.compose.foundation.text.input.internal.selection.d0.q) r0
            int r1 = r0.f19920c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19920c = r1
            goto L19
        L13:
            androidx.compose.foundation.text.input.internal.selection.d0$q r0 = new androidx.compose.foundation.text.input.internal.selection.d0$q
            r7 = 6
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.f19918a
            r7 = 0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r7 = 4
            int r2 = r0.f19920c
            r3 = 0
            r3 = 2
            r7 = 6
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r9)
            goto L5f
        L31:
            r7 = 7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            r7 = 1
            kotlin.ResultKt.m(r9)
            goto L4f
        L3f:
            kotlin.ResultKt.m(r9)
            androidx.compose.ui.platform.m1 r9 = r8.f19822k
            r0.f19920c = r4
            java.lang.Object r9 = r9.b(r0)
            r7 = 5
            if (r9 != r1) goto L4f
            r7 = 0
            goto L5e
        L4f:
            androidx.compose.ui.platform.k1 r9 = (androidx.compose.ui.platform.k1) r9
            if (r9 == 0) goto L79
            r7 = 3
            r0.f19920c = r3
            r7 = 3
            java.lang.Object r9 = androidx.compose.foundation.internal.b.e(r9, r0)
            r7 = 4
            if (r9 != r1) goto L5f
        L5e:
            return r1
        L5f:
            r1 = r9
            r7 = 0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L67
            r7 = 0
            goto L79
        L67:
            androidx.compose.foundation.text.input.internal.w6 r0 = r8.f19812a
            androidx.compose.foundation.text.input.internal.undo.c r3 = androidx.compose.foundation.text.input.internal.undo.c.NeverMerge
            r5 = 10
            r6 = 0
            r7 = 2
            r2 = 0
            r4 = 0
            r7 = r4
            androidx.compose.foundation.text.input.internal.w6.H(r0, r1, r2, r3, r4, r5, r6)
            r7 = 0
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        L79:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.d0.W0(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(i1.g gVar, i1.g gVar2, d0 d0Var) {
        b0(gVar, gVar2, d0Var);
        return Unit.f312394a;
    }

    private final boolean X0(long j10) {
        int iY;
        o3 o3Var;
        int iN;
        p3 p3VarF = this.f19813b.f();
        if (p3VarF == null || (iY = p3VarF.y(j10)) == -1) {
            return false;
        }
        w6 w6Var = this.f19812a;
        long jW = w6Var.w(iY);
        long jA = w6Var.A(jW);
        if (w3.h(jW) && w3.h(jA)) {
            o3Var = o3.Untransformed;
        } else if (w3.h(jW) || w3.h(jA)) {
            o3Var = (!w3.h(jW) || w3.h(jA)) ? o3.Deletion : o3.Insertion;
        } else {
            o3Var = o3.Replacement;
        }
        int i10 = d.f19855a[o3Var.ordinal()];
        n4 n4Var = null;
        if (i10 == 1 || i10 == 2) {
            iN = w3.n(jW);
        } else if (i10 == 3) {
            n4Var = f4.c(j10, p3VarF.e(w3.n(jA)), p3VarF.e(w3.i(jA))) < 0 ? new n4(y6.Start) : new n4(y6.End);
            iN = w3.n(jW);
        } else {
            if (i10 != 4) {
                throw new kotlin.k0();
            }
            iN = f4.c(j10, p3VarF.e(w3.n(jA)), p3VarF.e(w3.i(jA))) < 0 ? w3.n(jW) : w3.i(jW);
        }
        long jA2 = x3.a(iN);
        if (w3.g(jA2, this.f19812a.t().h()) && (n4Var == null || Intrinsics.areEqual(n4Var, this.f19812a.s()))) {
            return false;
        }
        this.f19812a.M(jA2);
        if (n4Var != null) {
            this.f19812a.N(n4Var);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(i1.g gVar, d0 d0Var, i1.g gVar2, androidx.compose.ui.input.pointer.c0 c0Var, n0.g gVar3) {
        long jW = n0.g.w(gVar.f312750a, gVar3.B());
        gVar.f312750a = jW;
        d0Var.q1(k3.Cursor, n0.g.w(gVar2.f312750a, jW));
        if (d0Var.X0(d0Var.w0())) {
            c0Var.a();
            p0.a aVar = d0Var.f19823l;
            if (aVar != null) {
                aVar.a(p0.b.f340720b.j());
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(i1.g gVar, d0 d0Var, i1.g gVar2, n0.g gVar3) {
        gVar.f312750a = androidx.compose.foundation.text.selection.m1.a(d0Var.r0().l());
        gVar2.f312750a = n0.g.f332700b.e();
        d0Var.d1(true);
        d0Var.O0();
        d0Var.q1(k3.Cursor, gVar.f312750a);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(i1.g gVar, i1.g gVar2, d0 d0Var) {
        b0(gVar, gVar2, d0Var);
        return Unit.f312394a;
    }

    private static final void b0(i1.g gVar, i1.g gVar2, d0 d0Var) {
        if ((gVar.f312750a & 9223372034707292159L) != n0.d.f332689d) {
            n0.g.a aVar = n0.g.f332700b;
            gVar.f312750a = aVar.c();
            gVar2.f312750a = aVar.c();
            d0Var.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final Object c0(androidx.compose.ui.input.pointer.l0 l0Var, final boolean z10, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        i iVar;
        final k3 k3Var;
        i1.g gVar;
        i1.g gVar2;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f19886f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f19886f = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        i iVar2 = iVar;
        Object obj = iVar2.f19884d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar2.f19886f;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k3Var = (k3) iVar2.f19883c;
            gVar2 = (i1.g) iVar2.f19882b;
            gVar = (i1.g) iVar2.f19881a;
            try {
                ResultKt.m(obj);
                o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.h0(this.f20030a, k3Var);
                    }
                });
                if (u0() == k3Var) {
                    i0(gVar, this, gVar2);
                }
                return Unit.f312394a;
            } catch (Throwable th2) {
                th = th2;
                o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.h0(this.f20030a, k3Var);
                    }
                });
                if (u0() == k3Var) {
                    i0(gVar, this, gVar2);
                }
                throw th;
            }
        }
        ResultKt.m(obj);
        final i1.g gVar3 = new i1.g();
        n0.g.a aVar = n0.g.f332700b;
        gVar3.f312750a = aVar.c();
        final i1.g gVar4 = new i1.g();
        gVar4.f312750a = aVar.e();
        final k3 k3Var2 = z10 ? k3.SelectionStart : k3.SelectionEnd;
        try {
            try {
                Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return d0.d0(gVar3, this, z10, k3Var2, gVar4, (n0.g) obj2);
                    }
                };
                k3Var2 = k3Var2;
                gVar3 = gVar3;
                Function0 function0 = new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.e0(gVar3, this, gVar4);
                    }
                };
                Function0 function2 = new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.f0(gVar3, this, gVar4);
                    }
                };
                try {
                    Function2 function3 = new Function2() { // from class: androidx.compose.foundation.text.input.internal.selection.s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return d0.g0(gVar4, this, k3Var2, gVar3, z10, (androidx.compose.ui.input.pointer.c0) obj2, (n0.g) obj3);
                        }
                    };
                    gVar4 = gVar4;
                    iVar2.f19881a = gVar3;
                    iVar2.f19882b = gVar4;
                    iVar2.f19883c = k3Var2;
                    iVar2.f19886f = 1;
                    if (x1.K(l0Var, function1, function0, function2, function3, iVar2) == objL) {
                        return objL;
                    }
                    k3Var = k3Var2;
                    gVar = gVar3;
                    gVar2 = gVar4;
                    o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d0.h0(this.f20030a, k3Var);
                        }
                    });
                    if (u0() == k3Var) {
                        i0(gVar, this, gVar2);
                    }
                    return Unit.f312394a;
                } catch (Throwable th3) {
                    th = th3;
                    gVar4 = gVar4;
                    k3Var = k3Var2;
                    gVar = gVar3;
                    gVar2 = gVar4;
                    o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d0.h0(this.f20030a, k3Var);
                        }
                    });
                    if (u0() == k3Var) {
                        i0(gVar, this, gVar2);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                k3Var2 = k3Var2;
                gVar3 = gVar3;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(i1.g gVar, d0 d0Var, boolean z10, k3 k3Var, i1.g gVar2, n0.g gVar3) {
        long jA = androidx.compose.foundation.text.selection.m1.a(d0Var.x0(z10));
        gVar.f312750a = jA;
        d0Var.q1(k3Var, jA);
        gVar2.f312750a = n0.g.f332700b.e();
        int i10 = 5 & (-1);
        d0Var.f19836y = -1;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(i1.g gVar, d0 d0Var, i1.g gVar2) {
        i0(gVar, d0Var, gVar2);
        return Unit.f312394a;
    }

    private final void e1(long j10) {
        this.f19829r.setValue(n0.g.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(i1.g gVar, d0 d0Var, i1.g gVar2) {
        i0(gVar, d0Var, gVar2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(i1.g gVar, d0 d0Var, k3 k3Var, i1.g gVar2, boolean z10, androidx.compose.ui.input.pointer.c0 c0Var, n0.g gVar3) {
        gVar.f312750a = n0.g.w(gVar.f312750a, gVar3.B());
        p3 p3VarF = d0Var.f19813b.f();
        if (p3VarF == null) {
            return Unit.f312394a;
        }
        d0Var.q1(k3Var, n0.g.w(gVar2.f312750a, gVar.f312750a));
        int iY = z10 ? p3VarF.y(d0Var.w0()) : w3.n(d0Var.f19812a.u().h());
        int i10 = z10 ? w3.i(d0Var.f19812a.u().h()) : p3VarF.y(d0Var.w0());
        long jH = d0Var.f19812a.u().h();
        long jS1 = s1(d0Var, d0Var.f19812a.u(), iY, i10, z10, androidx.compose.foundation.text.selection.n0.f21271a.l(), false, false, 96, null);
        if (w3.h(jH) || !w3.h(jS1)) {
            d0Var.f19812a.L(jS1);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h0(d0 d0Var, k3 k3Var) {
        return "Selection Handle drag cancelled for draggingHandle: " + d0Var.u0() + " definedOn: " + k3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(boolean z10) {
        this.f19832u.setValue(Boolean.valueOf(z10));
    }

    private static final void i0(i1.g gVar, d0 d0Var, i1.g gVar2) {
        if ((gVar.f312750a & 9223372034707292159L) != n0.d.f332689d) {
            d0Var.P();
            n0.g.a aVar = n0.g.f332700b;
            gVar.f312750a = aVar.c();
            gVar2.f312750a = aVar.e();
            d0Var.f19836y = -1;
        }
    }

    private final void i1(long j10) {
        this.f19828q.setValue(n0.g.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(Function0 function0, d0 d0Var, Function0 function1, n0.g gVar) {
        o0.c(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.l0();
            }
        });
        function0.invoke();
        if (d0Var.f19815d && d0Var.f19817f) {
            if (!d0Var.f19816e) {
                function1.invoke();
                if (d0Var.f19812a.u().length() > 0) {
                    d0Var.h1(true);
                }
            }
            d0Var.t1(a1.None);
            d0Var.X0(r6.b(d0Var.f19813b, d0Var.f19813b.b(gVar.B())));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1(a1 a1Var) {
        this.f19833v.setValue(a1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l0() {
        return "onTapTextField";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l1(n0.j jVar, kotlin.coroutines.d<? super Unit> dVar) {
        if (s1.f18599d) {
            this.f19819h.e();
        } else {
            z0 z0Var = this.f19824m;
            if (z0Var != null) {
                Object objA = z0Var.a(this, jVar, dVar);
                return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
            }
        }
        return Unit.f312394a;
    }

    private final n0.j o0() {
        androidx.compose.ui.layout.g0 g0VarH0 = H0();
        if (g0VarH0 == null) {
            androidx.compose.foundation.internal.e.j("textLayoutCoordinates should not be null.");
            throw new kotlin.a0();
        }
        androidx.compose.foundation.text.input.l lVarU = this.f19812a.u();
        if (w3.h(lVarU.h())) {
            n0.j jVarR0 = r0();
            return n0.k.c(g0VarH0.k0(jVarR0.E()), jVarR0.z());
        }
        long jK0 = g0VarH0.k0(x0(true));
        long jK1 = g0VarH0.k0(x0(false));
        p3 p3VarF = this.f19813b.f();
        if (p3VarF == null) {
            return n0.j.f332705e.a();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (g0VarH0.k0(n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(p3VarF.e(w3.n(lVarU.h())).B())) & com.rabbitmq.client.k0.f265952a))) & com.rabbitmq.client.k0.f265952a));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (g0VarH0.k0(n0.g.g((((long) Float.floatToRawIntBits(p3VarF.e(w3.i(lVarU.h())).B())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(0.0f) << 32))) & com.rabbitmq.client.k0.f265952a));
        int i10 = (int) (jK0 >> 32);
        int i11 = (int) (jK1 >> 32);
        return new n0.j(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat((int) (jK0 & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (jK1 & com.rabbitmq.client.k0.f265952a))));
    }

    private final long p0() {
        androidx.compose.ui.layout.g0 g0VarH0 = H0();
        return g0VarH0 != null ? androidx.compose.ui.layout.h0.g(g0VarH0) : n0.g.f332700b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long r1(androidx.compose.foundation.text.input.l lVar, int i10, int i11, boolean z10, androidx.compose.foundation.text.selection.n0 n0Var, boolean z11, boolean z12) {
        p0.a aVar;
        w3 w3VarB = w3.b(lVar.h());
        long jR = w3VarB.r();
        if (z12 || (!z11 && w3.h(jR))) {
            w3VarB = null;
        }
        long jF0 = F0(i10, i11, w3VarB, z10, n0Var);
        if (!w3.g(jF0, lVar.h())) {
            boolean z13 = w3.m(jF0) != w3.m(lVar.h()) && w3.g(x3.b(w3.i(jF0), w3.n(jF0)), lVar.h());
            if (N0() && !z13 && (aVar = this.f19823l) != null) {
                aVar.a(p0.b.f340720b.j());
            }
        }
        return jF0;
    }

    static /* synthetic */ long s1(d0 d0Var, androidx.compose.foundation.text.input.l lVar, int i10, int i11, boolean z10, androidx.compose.foundation.text.selection.n0 n0Var, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            z11 = false;
        }
        if ((i12 & 64) != 0) {
            z12 = false;
        }
        return d0Var.r1(lVar, i10, i11, z10, n0Var, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long x0(boolean z10) {
        p3 p3VarF = this.f19813b.f();
        if (p3VarF == null) {
            return n0.g.f332700b.e();
        }
        long jH = this.f19812a.u().h();
        return z4.b(p3VarF, z10 ? w3.n(jH) : w3.i(jH), z10, w3.m(jH));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long z0() {
        return ((n0.g) this.f19829r.getValue()).B();
    }

    @Nullable
    public final Function0<androidx.compose.foundation.content.internal.c> A0() {
        return this.f19827p;
    }

    @Nullable
    public final Function0<Unit> B0() {
        return this.f19826o;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    @NotNull
    public final androidx.compose.foundation.text.input.internal.selection.g C0(boolean z10, boolean z11) {
        boolean z12;
        n0.j jVarI;
        n0.j jVarI2;
        k3 k3Var = z10 ? k3.SelectionStart : k3.SelectionEnd;
        p3 p3VarF = this.f19813b.f();
        if (p3VarF == null) {
            return androidx.compose.foundation.text.input.internal.selection.g.f19962f.a();
        }
        long jH = this.f19812a.u().h();
        if (w3.h(jH)) {
            return androidx.compose.foundation.text.input.internal.selection.g.f19962f.a();
        }
        long jX0 = x0(z10);
        if (t0() != a.None) {
            z12 = false;
        } else {
            if (u0() != k3Var) {
                androidx.compose.ui.layout.g0 g0VarH0 = H0();
                if (!((g0VarH0 == null || (jVarI2 = n2.i(g0VarH0)) == null) ? false : n2.d(jVarI2, jX0))) {
                    z12 = false;
                }
            }
            z12 = true;
        }
        if (z12 && this.f19812a.u().j()) {
            androidx.compose.ui.text.style.i iVarC = p3VarF.c(z10 ? w3.n(jH) : Math.max(w3.i(jH) - 1, 0));
            boolean zM = w3.m(jH);
            if (z11) {
                androidx.compose.ui.layout.g0 g0VarH1 = H0();
                if (g0VarH1 != null && (jVarI = n2.i(g0VarH1)) != null) {
                    jX0 = r6.a(jX0, jVarI);
                }
            } else {
                jX0 = n0.g.f332700b.c();
            }
            return new androidx.compose.foundation.text.input.internal.selection.g(true, jX0, x6.b(p3VarF, z10 ? w3.n(jH) : w3.i(jH)), iVarC, zM, null);
        }
        return androidx.compose.foundation.text.input.internal.selection.g.f19962f.a();
    }

    @NotNull
    public final w6 G0() {
        return this.f19812a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean I0() {
        return ((Boolean) this.f19834w.getValue()).booleanValue();
    }

    public final void J() {
        Function0<Unit> function0 = this.f19826o;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean K() {
        return v0() && w3.h(this.f19812a.u().h());
    }

    public final boolean L() {
        return (w3.h(this.f19812a.u().h()) || this.f19818g) ? false : true;
    }

    public final boolean M() {
        return (w3.h(this.f19812a.u().h()) || !v0() || this.f19818g) ? false : true;
    }

    public final boolean M0() {
        return this.f19817f;
    }

    public final boolean N() {
        if (!v0()) {
            return false;
        }
        if (this.B.b()) {
            return true;
        }
        Function0<? extends androidx.compose.foundation.content.internal.c> function0 = this.f19827p;
        return (function0 != null ? function0.invoke() : null) != null && this.B.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean N0() {
        return ((Boolean) this.f19825n.getValue()).booleanValue();
    }

    public final boolean O() {
        return w3.j(this.f19812a.u().h()) != this.f19812a.u().length();
    }

    public final void P() {
        b1(null);
        n0.g.a aVar = n0.g.f332700b;
        e1(aVar.c());
        i1(aVar.c());
    }

    public final void P0() {
        androidx.compose.foundation.text.selection.x xVar = this.f19821j;
        if (xVar != null) {
            CharSequence charSequenceI = this.f19812a.u().i();
            long jH = this.f19812a.u().h();
            if (charSequenceI.length() > 0 && !w3.h(jH)) {
                kotlinx.coroutines.k.f(this.f19820i, null, kotlinx.coroutines.u0.UNDISPATCHED, new l(xVar, charSequenceI, jH, this, null), 1, null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object Q(boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f19859d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f19859d = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f19857b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f19859d;
        if (i11 == 0) {
            ResultKt.m(obj);
            androidx.compose.foundation.text.input.l lVarU = this.f19812a.u();
            if (w3.h(lVarU.h())) {
                return Unit.f312394a;
            }
            androidx.compose.ui.text.f fVar = new androidx.compose.ui.text.f(androidx.compose.foundation.text.input.m.a(lVarU).toString(), null, 2, null);
            m1 m1Var = this.f19822k;
            k1 k1VarF = androidx.compose.foundation.internal.b.f(fVar);
            eVar.f19856a = z10;
            eVar.f19859d = 1;
            if (m1Var.c(k1VarF, eVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = eVar.f19856a;
            ResultKt.m(obj);
        }
        if (!z10) {
            return Unit.f312394a;
        }
        this.f19812a.l();
        return Unit.f312394a;
    }

    @Nullable
    public final Object S(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new f(l0Var, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object T(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f19875c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f19875c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f19873a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f19875c;
        if (i11 == 0) {
            ResultKt.m(obj);
            androidx.compose.foundation.text.input.l lVarU = this.f19812a.u();
            if (w3.h(lVarU.h())) {
                return Unit.f312394a;
            }
            androidx.compose.ui.text.f fVar = new androidx.compose.ui.text.f(androidx.compose.foundation.text.input.m.a(lVarU).toString(), null, 2, null);
            m1 m1Var = this.f19822k;
            k1 k1VarF = androidx.compose.foundation.internal.b.f(fVar);
            gVar.f19875c = 1;
            if (m1Var.c(k1VarF, gVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.f19812a.o();
        return Unit.f312394a;
    }

    public final void V() {
        if (!w3.h(this.f19812a.u().h())) {
            this.f19812a.k();
        }
        h1(false);
        t1(a1.None);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        if (W0(r0) == r1) goto L45;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V0(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.d0.V0(kotlin.coroutines.d):java.lang.Object");
    }

    public final void Y0() {
        this.f19812a.K();
    }

    @Nullable
    public final Object Z0(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new r(l0Var, z10, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    public final void a1(@NotNull a aVar) {
        this.f19831t.setValue(aVar);
    }

    public final void b1(@Nullable k3 k3Var) {
        this.f19830s.setValue(k3Var);
    }

    public final void c1(boolean z10) {
        this.f19817f = z10;
    }

    public final void d1(boolean z10) {
        this.f19825n.setValue(Boolean.valueOf(z10));
    }

    public final void f1(@Nullable Function0<? extends androidx.compose.foundation.content.internal.c> function0) {
        this.f19827p = function0;
    }

    public final void g1(@Nullable Function0<Unit> function0) {
        this.f19826o = function0;
    }

    @Nullable
    public final Object j0(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objM = c5.m(l0Var, new j(jVar, this, null), new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d0.k0(function0, this, function1, (n0.g) obj);
            }
        }, dVar);
        return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
    }

    public final void j1(boolean z10) {
        this.f19834w.setValue(Boolean.valueOf(z10));
    }

    @Nullable
    public final Object m0(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG5 = l0Var.g5(new k(null), dVar);
        return objG5 == kotlin.coroutines.intrinsics.b.l() ? objG5 : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object m1(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        s sVar;
        if (dVar instanceof s) {
            sVar = (s) dVar;
            int i10 = sVar.f19941c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f19941c = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(dVar);
            }
        } else {
            sVar = new s(dVar);
        }
        Object objG = sVar.f19939a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = sVar.f19941c;
        try {
            if (i11 == 0) {
                ResultKt.m(objG);
                t tVar = new t(null);
                sVar.f19941c = 1;
                objG = kotlinx.coroutines.t0.g(tVar, sVar);
                if (objG == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objG);
            }
            h1(false);
            if (J0() != a1.None) {
                K0();
            }
            return Unit.f312394a;
        } catch (Throwable th2) {
            h1(false);
            if (J0() != a1.None) {
                K0();
            }
            throw th2;
        }
    }

    public final void n0() {
        K0();
        this.f19823l = null;
    }

    @Nullable
    public final Object n1(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objY = androidx.compose.foundation.text.selection.i1.y(l0Var, new b(function0), new c(function0), dVar);
        return objY == kotlin.coroutines.intrinsics.b.l() ? objY : Unit.f312394a;
    }

    public final void o1(@NotNull p0.a aVar, @NotNull m1 m1Var, @NotNull z0 z0Var, @NotNull androidx.compose.ui.unit.d dVar, boolean z10, boolean z11, boolean z12) {
        if (!z10) {
            K0();
        }
        this.f19823l = aVar;
        this.f19822k = m1Var;
        this.f19824m = z0Var;
        this.f19814c = dVar;
        this.f19815d = z10;
        this.f19816e = z11;
        this.f19818g = z12;
    }

    @Nullable
    public final Object p1(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = this.B.c(dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.foundation.text.input.internal.selection.g q0(boolean z10) {
        androidx.compose.foundation.text.input.l lVarU = this.f19812a.u();
        boolean zD0 = D0();
        boolean z11 = t0() == a.None;
        k3 k3VarU0 = u0();
        if (zD0 && z11 && w3.h(lVarU.h()) && lVarU.j() && lVarU.length() > 0 && (k3VarU0 == k3.Cursor || L0())) {
            return new androidx.compose.foundation.text.input.internal.selection.g(true, z10 ? r0().l() : n0.g.f332700b.c(), 0.0f, androidx.compose.ui.text.style.i.Ltr, false, null);
        }
        return androidx.compose.foundation.text.input.internal.selection.g.f19962f.a();
    }

    public final void q1(@NotNull k3 k3Var, long j10) {
        b1(k3Var);
        e1(j10);
    }

    @NotNull
    public final n0.j r0() {
        p3 p3VarF = this.f19813b.f();
        if (p3VarF == null) {
            return n0.j.f332705e.a();
        }
        androidx.compose.foundation.text.input.l lVarU = this.f19812a.u();
        if (!w3.h(lVarU.h())) {
            return n0.j.f332705e.a();
        }
        n0.j jVarE = p3VarF.e(w3.n(lVarU.h()));
        float fT = kotlin.ranges.r.t((float) Math.floor(this.f19814c.S7(n5.a())), 1.0f);
        float f10 = fT / 2;
        float fT2 = kotlin.ranges.r.t(kotlin.ranges.r.A(p3VarF.l().f() == androidx.compose.ui.unit.w.Ltr ? jVarE.t() + (fT / 2) : jVarE.x() - (fT / 2), ((int) (p3VarF.C() >> 32)) - f10), f10);
        float fFloor = ((int) fT) % 2 == 1 ? ((float) Math.floor(fT2)) + 0.5f : (float) Math.rint(fT2);
        return new n0.j(fFloor - f10, jVarE.B(), fFloor + f10, jVarE.j());
    }

    @Nullable
    public final n0.j s0() {
        return (n0.j) this.A.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final a t0() {
        return (a) this.f19831t.getValue();
    }

    public final void t1(@NotNull a1 a1Var) {
        k1(a1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final k3 u0() {
        return (k3) this.f19830s.getValue();
    }

    public final boolean v0() {
        return this.f19815d && !this.f19816e;
    }

    public final long w0() {
        if ((z0() & 9223372034707292159L) == n0.d.f332689d) {
            return n0.g.f332700b.c();
        }
        return (E0() & 9223372034707292159L) == n0.d.f332689d ? r6.b(this.f19813b, z0()) : n0.g.w(z0(), n0.g.v(E0(), p0()));
    }

    @Nullable
    public final androidx.compose.foundation.text.selection.x y0() {
        return this.f19821j;
    }
}
