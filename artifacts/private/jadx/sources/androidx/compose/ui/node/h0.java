package androidx.compose.ui.node;

import androidx.compose.ui.layout.v2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,316:1\n114#2:317\n114#2:319\n247#3:318\n247#3:320\n1#4:321\n312#5,2:322\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n77#1:317\n47#1:319\n77#1:318\n47#1:320\n157#1:322,2\n*E\n"})
public final class h0 extends k1 {

    @NotNull
    public static final a L3 = new a(null);
    public static final int M3 = 0;

    @NotNull
    private static final androidx.compose.ui.graphics.h2 N3;

    @NotNull
    private g0 H3;

    @Nullable
    private androidx.compose.ui.unit.b I3;

    @Nullable
    private v0 J3;

    @Nullable
    private androidx.compose.ui.layout.h K3;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.ui.graphics.h2 a() {
            return h0.N3;
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,316:1\n512#2,3:317\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n90#1:317,3\n*E\n"})
    private final class b extends v0 {
        public b() {
            super(h0.this);
        }

        @Override // androidx.compose.ui.node.u0
        public int B1(@NotNull androidx.compose.ui.layout.a aVar) {
            int iB = i0.b(this, aVar);
            m3().l0(aVar, iB);
            return iB;
        }

        @Override // androidx.compose.ui.node.v0, androidx.compose.ui.layout.y
        public int D0(int i10) {
            g0 g0VarX7 = h0.this.X7();
            v0 v0VarN4 = h0.this.i8().N4();
            Intrinsics.checkNotNull(v0VarN4);
            return g0VarX7.k0(this, v0VarN4, i10);
        }

        @Override // androidx.compose.ui.node.v0, androidx.compose.ui.layout.y
        public int L0(int i10) {
            g0 g0VarX7 = h0.this.X7();
            v0 v0VarN4 = h0.this.i8().N4();
            Intrinsics.checkNotNull(v0VarN4);
            return g0VarX7.U(this, v0VarN4, i10);
        }

        @Override // androidx.compose.ui.node.v0, androidx.compose.ui.layout.y
        public int M0(int i10) {
            g0 g0VarX7 = h0.this.X7();
            v0 v0VarN4 = h0.this.i8().N4();
            Intrinsics.checkNotNull(v0VarN4);
            return g0VarX7.W(this, v0VarN4, i10);
        }

        @Override // androidx.compose.ui.layout.z0
        @NotNull
        public androidx.compose.ui.layout.i2 P0(long j10) {
            h0 h0Var = h0.this;
            s1(j10);
            h0Var.s8(androidx.compose.ui.unit.b.a(j10));
            g0 g0VarX7 = h0Var.X7();
            v0 v0VarN4 = h0Var.i8().N4();
            Intrinsics.checkNotNull(v0VarN4);
            G3(g0VarX7.c(this, v0VarN4, j10));
            return this;
        }

        @Override // androidx.compose.ui.node.v0, androidx.compose.ui.layout.y
        public int p0(int i10) {
            g0 g0VarX7 = h0.this.X7();
            v0 v0VarN4 = h0.this.i8().N4();
            Intrinsics.checkNotNull(v0VarN4);
            return g0VarX7.e0(this, v0VarN4, i10);
        }
    }

    public static final class c implements androidx.compose.ui.layout.b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ androidx.compose.ui.layout.b1 f39765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f39766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f39767c;

        c(androidx.compose.ui.layout.b1 b1Var, h0 h0Var) {
            this.f39765a = b1Var;
            v0 v0VarN4 = h0Var.N4();
            Intrinsics.checkNotNull(v0VarN4);
            this.f39766b = v0VarN4.h1();
            v0 v0VarN5 = h0Var.N4();
            Intrinsics.checkNotNull(v0VarN5);
            this.f39767c = v0VarN5.c1();
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f39767c;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f39766b;
        }

        @Override // androidx.compose.ui.layout.b1
        public Function1<v2, Unit> j() {
            return this.f39765a.j();
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f39765a.x();
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
            this.f39765a.y();
        }
    }

    static {
        androidx.compose.ui.graphics.h2 h2VarA = androidx.compose.ui.graphics.m.a();
        h2VarA.S(androidx.compose.ui.graphics.q0.f38131b.c());
        h2VarA.H(1.0f);
        h2VarA.G(androidx.compose.ui.graphics.j2.f37801b.b());
        N3 = h2VarA;
    }

    public h0(@NotNull l0 l0Var, @NotNull g0 g0Var) {
        super(l0Var);
        this.H3 = g0Var;
        androidx.compose.ui.layout.h hVar = null;
        this.J3 = l0Var.t0() != null ? new b() : null;
        if ((g0Var.w().T8() & m1.b(512)) != 0) {
            Intrinsics.checkNotNull(g0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            hVar = new androidx.compose.ui.layout.h(this, (androidx.compose.ui.layout.e) g0Var);
        }
        this.K3 = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    private final void k8() {
        boolean z10;
        if (K2()) {
            return;
        }
        d6();
        androidx.compose.ui.layout.h hVar = this.K3;
        if (hVar != null) {
            androidx.compose.ui.layout.e eVarP0 = hVar.p0();
            androidx.compose.ui.layout.i2.a aVarT2 = t2();
            v0 v0VarN4 = N4();
            Intrinsics.checkNotNull(v0VarN4);
            if (eVarP0.J8(aVarT2, v0VarN4.p3()) || hVar.n0()) {
                z10 = false;
            } else {
                long jA = a();
                v0 v0VarN5 = N4();
                if (androidx.compose.ui.unit.u.g(jA, v0VarN5 != null ? androidx.compose.ui.unit.u.b(v0VarN5.s3()) : null)) {
                    long jA2 = i8().a();
                    v0 v0VarN6 = i8().N4();
                    if (androidx.compose.ui.unit.u.g(jA2, v0VarN6 != null ? androidx.compose.ui.unit.u.b(v0VarN6.s3()) : null)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            }
            i8().L6(z10);
        }
        l2().y();
        i8().L6(false);
    }

    @Override // androidx.compose.ui.node.u0
    public int B1(@NotNull androidx.compose.ui.layout.a aVar) {
        v0 v0VarN4 = N4();
        return v0VarN4 != null ? v0VarN4.k3(aVar) : i0.b(this, aVar);
    }

    @Override // androidx.compose.ui.layout.y
    public int D0(int i10) {
        androidx.compose.ui.layout.h hVar = this.K3;
        return hVar != null ? hVar.p0().B3(hVar, i8(), i10) : this.H3.k0(this, i8(), i10);
    }

    @Override // androidx.compose.ui.layout.y
    public int L0(int i10) {
        androidx.compose.ui.layout.h hVar = this.K3;
        return hVar != null ? hVar.p0().o6(hVar, i8(), i10) : this.H3.U(this, i8(), i10);
    }

    @Override // androidx.compose.ui.layout.y
    public int M0(int i10) {
        androidx.compose.ui.layout.h hVar = this.K3;
        return hVar != null ? hVar.p0().Y2(hVar, i8(), i10) : this.H3.W(this, i8(), i10);
    }

    @Override // androidx.compose.ui.node.k1
    protected void M6(@Nullable v0 v0Var) {
        this.J3 = v0Var;
    }

    @Override // androidx.compose.ui.node.k1
    @Nullable
    public v0 N4() {
        return this.J3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    @Override // androidx.compose.ui.layout.z0
    @NotNull
    public androidx.compose.ui.layout.i2 P0(long j10) {
        androidx.compose.ui.layout.b1 b1VarC;
        boolean z10;
        if (o4()) {
            androidx.compose.ui.unit.b bVar = this.I3;
            if (bVar == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j10 = bVar.x();
        }
        s1(j10);
        androidx.compose.ui.layout.h hVar = this.K3;
        if (hVar != null) {
            androidx.compose.ui.layout.e eVarP0 = hVar.p0();
            hVar.r0(eVarP0.G6(hVar.s2()) || !androidx.compose.ui.unit.b.f(j10, h8()));
            if (!hVar.n0()) {
                i8().K6(true);
            }
            b1VarC = eVarP0.l2(hVar, i8(), j10);
            i8().K6(false);
            int width = b1VarC.getWidth();
            v0 v0VarN4 = N4();
            Intrinsics.checkNotNull(v0VarN4);
            if (width == v0VarN4.h1()) {
                int height = b1VarC.getHeight();
                v0 v0VarN5 = N4();
                Intrinsics.checkNotNull(v0VarN5);
                z10 = height == v0VarN5.c1();
            }
            if (!hVar.n0()) {
                long jA = i8().a();
                v0 v0VarN6 = i8().N4();
                if (androidx.compose.ui.unit.u.g(jA, v0VarN6 != null ? androidx.compose.ui.unit.u.b(v0VarN6.s3()) : null) && !z10) {
                    b1VarC = new c(b1VarC, this);
                }
            }
        } else {
            b1VarC = X7().c(this, i8(), j10);
        }
        N6(b1VarC);
        Z5();
        return this;
    }

    @Override // androidx.compose.ui.node.k1
    @NotNull
    public androidx.compose.ui.a0.d V4() {
        return this.H3.w();
    }

    @NotNull
    public final g0 X7() {
        return this.H3;
    }

    @Override // androidx.compose.ui.node.k1
    public void a4() {
        if (N4() == null) {
            M6(new b());
        }
    }

    @Nullable
    public final androidx.compose.ui.unit.b h8() {
        return this.I3;
    }

    @NotNull
    public final k1 i8() {
        k1 k1VarY4 = Y4();
        Intrinsics.checkNotNull(k1VarY4);
        return k1VarY4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.k1, androidx.compose.ui.layout.i2
    public void n1(long j10, float f10, @NotNull androidx.compose.ui.graphics.layer.c cVar) {
        super.n1(j10, f10, cVar);
        k8();
    }

    @Override // androidx.compose.ui.layout.y
    public int p0(int i10) {
        androidx.compose.ui.layout.h hVar = this.K3;
        return hVar != null ? hVar.p0().c3(hVar, i8(), i10) : this.H3.e0(this, i8(), i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.k1, androidx.compose.ui.layout.i2
    public void p1(long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
        super.p1(j10, f10, function1);
        k8();
    }

    @Override // androidx.compose.ui.node.k1
    public void q6(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        k1 k1VarY4;
        i8().T3(k0Var, cVar);
        if (!p0.c(i4()).getShowLayoutBounds() || (k1VarY4 = Y4()) == null) {
            return;
        }
        if (androidx.compose.ui.unit.u.h(a(), k1VarY4.a()) && androidx.compose.ui.unit.q.k(k1VarY4.u2(), androidx.compose.ui.unit.q.f42709b.b())) {
            return;
        }
        X3(k0Var, N3);
    }

    public final void q8(@NotNull g0 g0Var) {
        if (!Intrinsics.areEqual(g0Var, this.H3)) {
            androidx.compose.ui.a0.d dVarW = g0Var.w();
            if ((dVarW.T8() & m1.b(512)) != 0) {
                Intrinsics.checkNotNull(g0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                androidx.compose.ui.layout.e eVar = (androidx.compose.ui.layout.e) g0Var;
                androidx.compose.ui.layout.h hVar = this.K3;
                if (hVar != null) {
                    hVar.s0(eVar);
                } else {
                    hVar = new androidx.compose.ui.layout.h(this, eVar);
                }
                this.K3 = hVar;
            } else {
                this.K3 = null;
            }
        }
        this.H3 = g0Var;
    }

    public final void s8(@Nullable androidx.compose.ui.unit.b bVar) {
        this.I3 = bVar;
    }
}
