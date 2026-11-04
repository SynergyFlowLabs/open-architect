package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 5 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,810:1\n514#1:829\n515#1:832\n517#1,10:834\n530#1,3:869\n527#1,9:872\n514#1:881\n515#1:884\n517#1,19:886\n514#1:918\n515#1:921\n517#1:923\n518#1,18:928\n1107#2:811\n1085#2,2:812\n1107#2:814\n1085#2,2:815\n103#3,4:817\n103#3,4:821\n57#3,4:825\n103#3,2:830\n106#3:833\n103#3,2:882\n106#3:885\n103#3,4:914\n103#3,2:919\n106#3:922\n103#3,4:924\n103#3,4:955\n103#3,4:959\n103#3,4:963\n57#3,4:986\n103#3,4:990\n222#4,5:844\n227#4,19:850\n107#5:849\n207#6:905\n207#6:946\n207#6:994\n424#7,8:906\n424#7,8:947\n643#7,2:967\n424#7,8:969\n519#7:977\n424#7,8:978\n424#7,8:995\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n398#1:829\n398#1:832\n398#1:834,10\n398#1:869,3\n398#1:872,9\n432#1:881\n432#1:884\n432#1:886,19\n473#1:918\n473#1:921\n473#1:923\n473#1:928,18\n67#1:811\n67#1:812,2\n88#1:814\n88#1:815,2\n75#1:817,4\n97#1:821,4\n138#1:825,4\n398#1:830,2\n398#1:833\n432#1:882,2\n432#1:885\n472#1:914,4\n473#1:919,2\n473#1:922\n473#1:924,4\n514#1:955,4\n517#1:959,4\n518#1:963,4\n671#1:986,4\n676#1:990,4\n400#1:844,5\n400#1:850,19\n400#1:849\n452#1:905\n502#1:946\n694#1:994\n452#1:906,8\n502#1:947,8\n538#1:967,2\n542#1:969,8\n626#1:977\n627#1:978,8\n694#1:995,8\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f40098l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0 f40099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p f40100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t1 f40103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<x1.b> f40104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f40105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<a> f40106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.b f40107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private g2.a f40108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final s0 f40109k;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f40110d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final l0 f40111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f40112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f40113c;

        public a(@NotNull l0 l0Var, boolean z10, boolean z11) {
            this.f40111a = l0Var;
            this.f40112b = z10;
            this.f40113c = z11;
        }

        @NotNull
        public final l0 a() {
            return this.f40111a;
        }

        public final boolean b() {
            return this.f40113c;
        }

        public final boolean c() {
            return this.f40112b;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40114a;

        static {
            int[] iArr = new int[l0.e.values().length];
            try {
                iArr[l0.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l0.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l0.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l0.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l0.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f40114a = iArr;
        }
    }

    public y0(@NotNull l0 l0Var) {
        this.f40099a = l0Var;
        x1.a aVar = x1.J;
        p pVar = new p(aVar.a());
        this.f40100b = pVar;
        this.f40103e = new t1();
        int i10 = 7 << 0;
        this.f40104f = new androidx.compose.runtime.collection.d<>(new x1.b[16], 0);
        this.f40105g = 1L;
        androidx.compose.runtime.collection.d<a> dVar = new androidx.compose.runtime.collection.d<>(new a[16], 0);
        this.f40106h = dVar;
        this.f40109k = aVar.a() ? new s0(l0Var, pVar, dVar.q()) : null;
    }

    private final boolean A(l0 l0Var, boolean z10) {
        return z10 ? l0Var.o0() : l0Var.w0();
    }

    private final void C(l0 l0Var, boolean z10) {
        if (A(l0Var, z10)) {
            F(l0Var, z10, false);
        }
    }

    private final void D(boolean z10, Function0<Unit> function0) {
        if (!this.f40099a.I()) {
            s0.a.g("performMeasureAndLayout called with unattached root");
        }
        if (!this.f40099a.J()) {
            s0.a.g("performMeasureAndLayout called with unplaced root");
        }
        if (this.f40101c) {
            s0.a.g("performMeasureAndLayout called during measure layout");
        }
        if (this.f40107i != null) {
            this.f40101c = true;
            this.f40102d = z10;
            try {
                function0.invoke();
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                try {
                    g2.a aVar = this.f40108j;
                    if (aVar == null) {
                        throw th2;
                    }
                    aVar.a(th2);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    this.f40101c = false;
                    this.f40102d = false;
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            this.f40101c = false;
            this.f40102d = false;
            kotlin.jvm.internal.h0.c(1);
            s0 s0Var = this.f40109k;
            if (s0Var != null) {
                s0Var.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F(l0 l0Var, boolean z10, boolean z11) {
        androidx.compose.ui.unit.b bVar;
        boolean zG;
        l0 l0VarJ0;
        if (l0Var.M()) {
            return false;
        }
        if (!l0Var.J() && !l0Var.h1() && !n(l0Var) && !Intrinsics.areEqual(l0Var.i1(), Boolean.TRUE) && !m(l0Var) && !l0Var.T()) {
            return false;
        }
        if (l0Var == this.f40099a) {
            bVar = this.f40107i;
            Intrinsics.checkNotNull(bVar);
        } else {
            bVar = null;
        }
        if (z10) {
            zG = l0Var.o0() ? g(l0Var, bVar) : false;
            if (z11 && ((zG || l0Var.n0()) && Intrinsics.areEqual(l0Var.i1(), Boolean.TRUE))) {
                l0Var.n1();
            }
        } else {
            boolean zH = l0Var.w0() ? h(l0Var, bVar) : false;
            if (z11 && l0Var.l0() && (l0Var == this.f40099a || ((l0VarJ0 = l0Var.J0()) != null && l0VarJ0.J() && l0Var.h1()))) {
                if (l0Var == this.f40099a) {
                    l0Var.F1(0, 0);
                } else {
                    l0Var.L1();
                }
                this.f40103e.d(l0Var);
                p0.c(l0Var).getRectManager().k(l0Var);
                s0 s0Var = this.f40109k;
                if (s0Var != null) {
                    s0Var.a();
                }
            }
            zG = zH;
        }
        i();
        return zG;
    }

    static /* synthetic */ boolean G(y0 y0Var, l0 l0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return y0Var.F(l0Var, z10, z11);
    }

    private final void H(l0 l0Var) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = l0Var.Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var2 = l0VarArr[i10];
            if (u(l0Var2)) {
                if (r0.a(l0Var2)) {
                    I(l0Var2, true);
                } else {
                    H(l0Var2);
                }
            }
        }
    }

    private final void I(l0 l0Var, boolean z10) {
        androidx.compose.ui.unit.b bVar;
        if (l0Var.M()) {
            return;
        }
        if (l0Var == this.f40099a) {
            bVar = this.f40107i;
            Intrinsics.checkNotNull(bVar);
        } else {
            bVar = null;
        }
        if (z10) {
            g(l0Var, bVar);
        } else {
            h(l0Var, bVar);
        }
    }

    public static /* synthetic */ boolean K(y0 y0Var, l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return y0Var.J(l0Var, z10);
    }

    public static /* synthetic */ boolean M(y0 y0Var, l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return y0Var.L(l0Var, z10);
    }

    public static /* synthetic */ boolean P(y0 y0Var, l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return y0Var.O(l0Var, z10);
    }

    public static /* synthetic */ boolean R(y0 y0Var, l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return y0Var.Q(l0Var, z10);
    }

    private final void d() {
        androidx.compose.runtime.collection.d<x1.b> dVar = this.f40104f;
        x1.b[] bVarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            bVarArr[i10].q();
        }
        this.f40104f.r();
    }

    public static /* synthetic */ void f(y0 y0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        y0Var.e(z10);
    }

    private final boolean g(l0 l0Var, androidx.compose.ui.unit.b bVar) {
        if (l0Var.t0() == null) {
            return false;
        }
        boolean zL1 = bVar != null ? l0Var.l1(bVar) : l0.m1(l0Var, null, 1, null);
        l0 l0VarJ0 = l0Var.J0();
        if (zL1 && l0VarJ0 != null) {
            if (l0VarJ0.t0() == null) {
                boolean z10 = false & false;
                l0.U1(l0VarJ0, false, false, false, 3, null);
                return zL1;
            }
            if (l0Var.y0() == l0.g.InMeasureBlock) {
                l0.Q1(l0VarJ0, false, false, false, 3, null);
                return zL1;
            }
            if (l0Var.y0() == l0.g.InLayoutBlock) {
                l0.O1(l0VarJ0, false, 1, null);
            }
        }
        return zL1;
    }

    private final boolean h(l0 l0Var, androidx.compose.ui.unit.b bVar) {
        boolean zH1 = bVar != null ? l0Var.H1(bVar) : l0.I1(l0Var, null, 1, null);
        l0 l0VarJ0 = l0Var.J0();
        if (zH1 && l0VarJ0 != null) {
            if (l0Var.x0() == l0.g.InMeasureBlock) {
                l0.U1(l0VarJ0, false, false, false, 3, null);
                return zH1;
            }
            if (l0Var.x0() == l0.g.InLayoutBlock) {
                l0.S1(l0VarJ0, false, 1, null);
            }
        }
        return zH1;
    }

    private final void i() {
        if (this.f40106h.R() != 0) {
            androidx.compose.runtime.collection.d<a> dVar = this.f40106h;
            a[] aVarArr = dVar.f35552a;
            int iR = dVar.R();
            for (int i10 = 0; i10 < iR; i10++) {
                a aVar = aVarArr[i10];
                if (aVar.a().I()) {
                    if (aVar.c()) {
                        l0.Q1(aVar.a(), aVar.b(), false, false, 2, null);
                    } else {
                        l0.U1(aVar.a(), aVar.b(), false, false, 2, null);
                    }
                }
            }
            this.f40106h.r();
        }
    }

    private final void j(l0 l0Var) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = l0Var.Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var2 = l0VarArr[i10];
            if (Intrinsics.areEqual(l0Var2.i1(), Boolean.TRUE) && !l0Var2.M()) {
                if (this.f40100b.f(l0Var2, true)) {
                    l0Var2.n1();
                }
                j(l0Var2);
            }
        }
    }

    private final void l(l0 l0Var, boolean z10) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = l0Var.Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var2 = l0VarArr[i10];
            if ((!z10 && u(l0Var2)) || (z10 && r(l0Var2))) {
                if (r0.a(l0Var2) && !z10) {
                    if (l0Var2.o0() && this.f40100b.f(l0Var2, true)) {
                        F(l0Var2, true, false);
                    } else {
                        k(l0Var2, true);
                    }
                }
                C(l0Var2, z10);
                if (!A(l0Var2, z10)) {
                    l(l0Var2, z10);
                }
            }
        }
        C(l0Var, z10);
    }

    private final boolean m(l0 l0Var) {
        androidx.compose.ui.node.b bVarO;
        androidx.compose.ui.node.a aVarX;
        return l0Var.o0() && !(l0Var.y0() == l0.g.NotUsed && ((bVarO = l0Var.k0().o()) == null || (aVarX = bVarO.x()) == null || !aVarX.l()));
    }

    private final boolean n(l0 l0Var) {
        return l0Var.w0() && t(l0Var);
    }

    private final boolean r(l0 l0Var) {
        androidx.compose.ui.node.b bVarO;
        androidx.compose.ui.node.a aVarX;
        if (l0Var.y0() != l0.g.InMeasureBlock && ((bVarO = l0Var.k0().o()) == null || (aVarX = bVarO.x()) == null || !aVarX.l())) {
            return false;
        }
        return true;
    }

    private final boolean t(l0 l0Var) {
        do {
            if (l0Var.x0() == l0.g.NotUsed && !l0Var.k0().b().x().l()) {
                l0 l0VarJ0 = l0Var.J0();
                if ((l0VarJ0 != null ? l0VarJ0.m0() : null) != l0.e.Measuring) {
                    return false;
                }
            }
            l0Var = l0Var.J0();
            if (l0Var == null) {
                return false;
            }
        } while (!l0Var.J());
        return true;
    }

    private final boolean u(l0 l0Var) {
        if (l0Var.x0() != l0.g.InMeasureBlock && !l0Var.k0().b().x().l()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean x(y0 y0Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        return y0Var.w(function0);
    }

    public final void B(@NotNull l0 l0Var) {
        this.f40100b.k(l0Var);
        this.f40103e.f(l0Var);
    }

    public final void E(@NotNull x1.b bVar) {
        this.f40104f.d(bVar);
    }

    public final boolean J(@NotNull l0 l0Var, boolean z10) {
        int i10 = b.f40114a[l0Var.m0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new kotlin.k0();
                    }
                }
            }
            if ((l0Var.o0() || l0Var.n0()) && !z10) {
                s0 s0Var = this.f40109k;
                if (s0Var != null) {
                    s0Var.a();
                }
                return false;
            }
            l0Var.p1();
            l0Var.o1();
            if (l0Var.M()) {
                return false;
            }
            l0 l0VarJ0 = l0Var.J0();
            if (Intrinsics.areEqual(l0Var.i1(), Boolean.TRUE) && ((l0VarJ0 == null || !l0VarJ0.o0()) && (l0VarJ0 == null || !l0VarJ0.n0()))) {
                this.f40100b.d(l0Var, d0.LookaheadPlacement);
            } else if (l0Var.J() && ((l0VarJ0 == null || !l0VarJ0.l0()) && (l0VarJ0 == null || !l0VarJ0.w0()))) {
                this.f40100b.d(l0Var, d0.Placement);
            }
            return !this.f40102d;
        }
        s0 s0Var2 = this.f40109k;
        if (s0Var2 != null) {
            s0Var2.a();
        }
        return false;
    }

    public final boolean L(@NotNull l0 l0Var, boolean z10) {
        l0 l0VarJ0;
        l0 l0VarJ1;
        if (!(l0Var.t0() != null)) {
            s0.a.i("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = b.f40114a[l0Var.m0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                int i11 = 3 ^ 4;
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new kotlin.k0();
                    }
                    if (l0Var.o0() && !z10) {
                        return false;
                    }
                    l0Var.q1();
                    l0Var.r1();
                    if (l0Var.M()) {
                        return false;
                    }
                    if ((Intrinsics.areEqual(l0Var.i1(), Boolean.TRUE) || m(l0Var)) && ((l0VarJ0 = l0Var.J0()) == null || !l0VarJ0.o0())) {
                        this.f40100b.d(l0Var, d0.LookaheadMeasurement);
                    } else if ((l0Var.J() || n(l0Var)) && ((l0VarJ1 = l0Var.J0()) == null || !l0VarJ1.w0())) {
                        this.f40100b.d(l0Var, d0.Measurement);
                    }
                    return !this.f40102d;
                }
            }
            this.f40106h.d(new a(l0Var, true, z10));
            s0 s0Var = this.f40109k;
            if (s0Var != null) {
                s0Var.a();
            }
        }
        return false;
    }

    public final void N(@NotNull l0 l0Var) {
        this.f40103e.d(l0Var);
    }

    public final boolean O(@NotNull l0 l0Var, boolean z10) {
        int i10 = b.f40114a[l0Var.m0().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            s0 s0Var = this.f40109k;
            if (s0Var != null) {
                s0Var.a();
            }
            return false;
        }
        if (i10 != 5) {
            throw new kotlin.k0();
        }
        l0 l0VarJ0 = l0Var.J0();
        boolean z11 = l0VarJ0 == null || l0VarJ0.J();
        if (!z10 && (l0Var.w0() || (l0Var.l0() && l0Var.J() == z11 && l0Var.J() == l0Var.h1()))) {
            s0 s0Var2 = this.f40109k;
            if (s0Var2 != null) {
                s0Var2.a();
            }
            return false;
        }
        l0Var.o1();
        if (l0Var.M()) {
            return false;
        }
        if (l0Var.h1() && z11) {
            if ((l0VarJ0 == null || !l0VarJ0.l0()) && (l0VarJ0 == null || !l0VarJ0.w0())) {
                this.f40100b.d(l0Var, d0.Placement);
            }
            if (!this.f40102d) {
                return true;
            }
        }
        return false;
    }

    public final boolean Q(@NotNull l0 l0Var, boolean z10) {
        int i10 = b.f40114a[l0Var.m0().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new kotlin.k0();
                }
                if (l0Var.w0() && !z10) {
                    return false;
                }
                l0Var.r1();
                if (l0Var.M()) {
                    return false;
                }
                if (!l0Var.J() && !n(l0Var)) {
                    return false;
                }
                l0 l0VarJ0 = l0Var.J0();
                if (l0VarJ0 == null || !l0VarJ0.w0()) {
                    this.f40100b.d(l0Var, d0.Measurement);
                }
                return !this.f40102d;
            }
            this.f40106h.d(new a(l0Var, false, z10));
            s0 s0Var = this.f40109k;
            if (s0Var != null) {
                s0Var.a();
            }
        }
        return false;
    }

    public final void S(boolean z10) {
        this.f40101c = z10;
    }

    public final void T(@Nullable g2.a aVar) {
        this.f40108j = aVar;
    }

    public final void U(long j10) {
        androidx.compose.ui.unit.b bVar = this.f40107i;
        if (!(bVar == null ? false : androidx.compose.ui.unit.b.g(bVar.x(), j10))) {
            if (this.f40101c) {
                s0.a.g("updateRootConstraints called while measuring");
            }
            this.f40107i = androidx.compose.ui.unit.b.a(j10);
            if (this.f40099a.t0() != null) {
                this.f40099a.q1();
            }
            this.f40099a.r1();
            p pVar = this.f40100b;
            l0 l0Var = this.f40099a;
            pVar.d(l0Var, l0Var.t0() != null ? d0.LookaheadMeasurement : d0.Measurement);
        }
    }

    public final void e(boolean z10) {
        if (z10) {
            this.f40103e.e(this.f40099a);
        }
        if (this.f40103e.c()) {
            this.f40103e.a();
        }
    }

    public final void k(@NotNull l0 l0Var, boolean z10) {
        if (!this.f40101c) {
            s0.a.i("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (A(l0Var, z10)) {
            s0.a.g("node not yet measured");
        }
        l(l0Var, z10);
    }

    public final boolean o() {
        return this.f40101c;
    }

    public final boolean p() {
        return this.f40100b.i();
    }

    public final boolean q() {
        return this.f40103e.c();
    }

    public final long s() {
        if (!this.f40101c) {
            s0.a.g("measureIteration should be only used during the measure/layout pass");
        }
        return this.f40105g;
    }

    @Nullable
    public final g2.a v() {
        return this.f40108j;
    }

    public final boolean w(@Nullable Function0<Unit> function0) {
        boolean z10;
        l0 l0VarE;
        boolean z11;
        boolean z12;
        if (!this.f40099a.I()) {
            s0.a.g("performMeasureAndLayout called with unattached root");
        }
        if (!this.f40099a.J()) {
            s0.a.g("performMeasureAndLayout called with unplaced root");
        }
        if (this.f40101c) {
            s0.a.g("performMeasureAndLayout called during measure layout");
        }
        boolean z13 = false;
        if (this.f40107i != null) {
            this.f40101c = true;
            this.f40102d = true;
            try {
                if (this.f40100b.i()) {
                    p pVar = this.f40100b;
                    z10 = false;
                    while (true) {
                        try {
                            if (!pVar.f39950a.c()) {
                                l0VarE = pVar.f39950a.e();
                                z12 = l0VarE.t0() != null;
                                z11 = false;
                            } else if (!pVar.f39951b.c()) {
                                l0VarE = pVar.f39951b.e();
                                z12 = l0VarE.t0() != null;
                                z11 = true;
                            } else {
                                if (pVar.f39952c.c()) {
                                    break;
                                }
                                l0VarE = pVar.f39952c.e();
                                z11 = true;
                                z12 = false;
                            }
                            boolean zF = F(l0VarE, z12, z11);
                            if (!z11) {
                                if (l0VarE.n0()) {
                                    this.f40100b.d(l0VarE, d0.LookaheadPlacement);
                                }
                                if (l0VarE.l0()) {
                                    this.f40100b.d(l0VarE, d0.Placement);
                                }
                            }
                            if (l0VarE == this.f40099a && zF) {
                                z10 = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                g2.a aVar = this.f40108j;
                                if (aVar == null) {
                                    throw th;
                                }
                                aVar.a(th);
                            } catch (Throwable th3) {
                                this.f40101c = false;
                                this.f40102d = false;
                                throw th3;
                            }
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z10 = false;
                }
            } catch (Throwable th4) {
                th = th4;
                z10 = false;
            }
            this.f40101c = false;
            this.f40102d = false;
            z13 = z10;
            s0 s0Var = this.f40109k;
            if (s0Var != null) {
                s0Var.a();
            }
        }
        d();
        return z13;
    }

    public final void y(@NotNull l0 l0Var, long j10) {
        if (l0Var.M()) {
            return;
        }
        if (Intrinsics.areEqual(l0Var, this.f40099a)) {
            s0.a.g("measureAndLayout called on root");
        }
        if (!this.f40099a.I()) {
            s0.a.g("performMeasureAndLayout called with unattached root");
        }
        if (!this.f40099a.J()) {
            s0.a.g("performMeasureAndLayout called with unplaced root");
        }
        if (this.f40101c) {
            s0.a.g("performMeasureAndLayout called during measure layout");
        }
        if (this.f40107i != null) {
            this.f40101c = true;
            this.f40102d = false;
            try {
                this.f40100b.k(l0Var);
                if (g(l0Var, androidx.compose.ui.unit.b.a(j10)) || l0Var.n0()) {
                    if (Intrinsics.areEqual(l0Var.i1(), Boolean.TRUE)) {
                        l0Var.n1();
                    }
                }
                j(l0Var);
                h(l0Var, androidx.compose.ui.unit.b.a(j10));
                if (l0Var.l0() && l0Var.J()) {
                    l0Var.L1();
                    this.f40103e.d(l0Var);
                }
                i();
            } catch (Throwable th2) {
                try {
                    g2.a aVar = this.f40108j;
                    if (aVar == null) {
                        throw th2;
                    }
                    aVar.a(th2);
                } catch (Throwable th3) {
                    this.f40101c = false;
                    this.f40102d = false;
                    throw th3;
                }
            }
            this.f40101c = false;
            this.f40102d = false;
            s0 s0Var = this.f40109k;
            if (s0Var != null) {
                s0Var.a();
            }
        }
        d();
    }

    public final void z() {
        if (this.f40100b.i()) {
            if (!this.f40099a.I()) {
                s0.a.g("performMeasureAndLayout called with unattached root");
            }
            if (!this.f40099a.J()) {
                s0.a.g("performMeasureAndLayout called with unplaced root");
            }
            if (this.f40101c) {
                s0.a.g("performMeasureAndLayout called during measure layout");
            }
            if (this.f40107i != null) {
                this.f40101c = true;
                this.f40102d = false;
                try {
                    if (this.f40100b.g()) {
                        if (this.f40099a.t0() != null) {
                            I(this.f40099a, true);
                        } else {
                            H(this.f40099a);
                        }
                    }
                    I(this.f40099a, false);
                } catch (Throwable th2) {
                    try {
                        g2.a aVar = this.f40108j;
                        if (aVar == null) {
                            throw th2;
                        }
                        aVar.a(th2);
                    } catch (Throwable th3) {
                        this.f40101c = false;
                        this.f40102d = false;
                        throw th3;
                    }
                }
                this.f40101c = false;
                this.f40102d = false;
                s0 s0Var = this.f40109k;
                if (s0Var != null) {
                    s0Var.a();
                }
            }
        }
    }
}
