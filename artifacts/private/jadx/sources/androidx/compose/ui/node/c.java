package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,436:1\n57#2,4:437\n57#2,4:447\n57#2,4:475\n57#2,4:538\n57#2,4:542\n98#3:441\n90#3:443\n98#3:451\n86#3:453\n82#3:455\n106#3:457\n110#3:459\n94#3:463\n90#3:465\n106#3:467\n98#3:468\n247#4:442\n247#4:444\n247#4:452\n247#4:454\n247#4:456\n247#4:458\n247#4:460\n247#4:464\n247#4:466\n247#4:493\n648#5,2:445\n643#5,2:461\n248#6,5:469\n91#6:474\n92#6,8:479\n450#6,6:487\n460#6,2:494\n462#6,8:499\n470#6,9:510\n479#6,8:522\n101#6,7:530\n240#7,3:496\n243#7,3:519\n1107#8:507\n1085#8,2:508\n1#9:537\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n113#1:437,4\n132#1:447,4\n259#1:475,4\n402#1:538,4\n410#1:542,4\n115#1:441\n123#1:443\n134#1:451\n142#1:453\n150#1:455\n166#1:457\n192#1:459\n205#1:463\n210#1:465\n224#1:467\n259#1:468\n115#1:442\n123#1:444\n134#1:452\n142#1:454\n150#1:456\n166#1:458\n192#1:460\n205#1:464\n210#1:466\n259#1:493\n127#1:445,2\n203#1:461,2\n259#1:469,5\n259#1:474\n259#1:479,8\n259#1:487,6\n259#1:494,2\n259#1:499,8\n259#1:510,9\n259#1:522,8\n259#1:530,7\n259#1:496,3\n259#1:519,3\n259#1:507\n259#1:508,2\n*E\n"})
public final class c extends androidx.compose.ui.a0.d implements g0, t, i2, d2, androidx.compose.ui.modifier.j, androidx.compose.ui.modifier.n, a2, f0, v, androidx.compose.ui.focus.j, androidx.compose.ui.focus.c0, androidx.compose.ui.focus.k0, y1, androidx.compose.ui.draw.f {
    public static final int Y = 8;

    @Nullable
    private androidx.compose.ui.layout.g0 X;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.a0.c f39694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f39695t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.modifier.a f39696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private HashSet<androidx.compose.ui.modifier.c<?>> f39697w;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c.this.E9();
        }
    }

    @SourceDebugExtension({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$3\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,436:1\n106#2:437\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$3\n*L\n184#1:437\n*E\n"})
    public static final class b implements x1.b {
        b() {
        }

        @Override // androidx.compose.ui.node.x1.b
        public void q() {
            if (c.this.X == null) {
                c cVar = c.this;
                cVar.x(k.p(cVar, m1.b(128)));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.c$c, reason: collision with other inner class name */
    static final class C0308c extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0.c f39700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f39701b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0308c(androidx.compose.ui.a0.c cVar, c cVar2) {
            super(0);
            this.f39700a = cVar;
            this.f39701b = cVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((androidx.compose.ui.draw.l) this.f39700a).j3(this.f39701b);
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            androidx.compose.ui.a0.c cVarW9 = c.this.w9();
            Intrinsics.checkNotNull(cVarW9, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((androidx.compose.ui.modifier.d) cVarW9).c7(c.this);
        }
    }

    public c(@NotNull androidx.compose.ui.a0.c cVar) {
        p9(n1.f(cVar));
        this.f39694s = cVar;
        this.f39695t = true;
        this.f39697w = new HashSet<>();
    }

    private final void C9() {
        if (!a9()) {
            s0.a.i("unInitializeModifier called on unattached node");
        }
        androidx.compose.ui.a0.c cVar = this.f39694s;
        if ((m1.b(32) & T8()) != 0) {
            if (cVar instanceof androidx.compose.ui.modifier.l) {
                k.v(this).getModifierLocalManager().e(this, ((androidx.compose.ui.modifier.l) cVar).getKey());
            }
            if (cVar instanceof androidx.compose.ui.modifier.d) {
                ((androidx.compose.ui.modifier.d) cVar).c7(androidx.compose.ui.node.d.f39709a);
            }
        }
        if ((m1.b(8) & T8()) != 0) {
            k.v(this).U();
        }
        if (cVar instanceof androidx.compose.ui.focus.i0) {
            ((androidx.compose.ui.focus.i0) cVar).n1().h().n0(this);
        }
    }

    private final void D9() {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        if (cVar instanceof androidx.compose.ui.draw.l) {
            k.v(this).getSnapshotObserver().i(this, androidx.compose.ui.node.d.f39710b, new C0308c(cVar, this));
        }
        this.f39695t = false;
    }

    private final void F9(androidx.compose.ui.modifier.l<?> lVar) {
        androidx.compose.ui.modifier.a aVar = this.f39696v;
        if (aVar != null && aVar.a(lVar.getKey())) {
            aVar.e(lVar);
            k.v(this).getModifierLocalManager().g(this, lVar.getKey());
        } else {
            this.f39696v = new androidx.compose.ui.modifier.a(lVar);
            if (androidx.compose.ui.node.d.e(this)) {
                k.v(this).getModifierLocalManager().b(this, lVar.getKey());
            }
        }
    }

    private final void y9(boolean z10) {
        if (!a9()) {
            s0.a.i("initializeModifier called on unattached node");
        }
        androidx.compose.ui.a0.c cVar = this.f39694s;
        if ((m1.b(32) & T8()) != 0) {
            if (cVar instanceof androidx.compose.ui.modifier.d) {
                t9(new a());
            }
            if (cVar instanceof androidx.compose.ui.modifier.l) {
                F9((androidx.compose.ui.modifier.l) cVar);
            }
        }
        if ((m1.b(4) & T8()) != 0) {
            if (cVar instanceof androidx.compose.ui.draw.l) {
                this.f39695t = true;
            }
            if (!z10) {
                j0.a(this);
            }
        }
        if ((m1.b(2) & T8()) != 0) {
            if (androidx.compose.ui.node.d.e(this)) {
                k1 k1VarP8 = P8();
                Intrinsics.checkNotNull(k1VarP8);
                ((h0) k1VarP8).q8(this);
                k1VarP8.S5();
            }
            if (!z10) {
                j0.a(this);
                k.u(this).Z0();
            }
        }
        if (cVar instanceof androidx.compose.ui.layout.q2) {
            ((androidx.compose.ui.layout.q2) cVar).q6(k.u(this));
        }
        if ((m1.b(128) & T8()) != 0) {
            if ((cVar instanceof androidx.compose.ui.layout.x1) && androidx.compose.ui.node.d.e(this)) {
                k.u(this).Z0();
            }
            if (cVar instanceof androidx.compose.ui.layout.u1) {
                this.X = null;
                if (androidx.compose.ui.node.d.e(this)) {
                    k.v(this).l(new b());
                }
            }
        }
        if ((m1.b(256) & T8()) != 0 && (cVar instanceof androidx.compose.ui.layout.p1) && androidx.compose.ui.node.d.e(this)) {
            k.u(this).Z0();
        }
        if (cVar instanceof androidx.compose.ui.focus.i0) {
            ((androidx.compose.ui.focus.i0) cVar).n1().h().d(this);
        }
        if ((m1.b(16) & T8()) != 0 && (cVar instanceof androidx.compose.ui.input.pointer.j0)) {
            ((androidx.compose.ui.input.pointer.j0) cVar).z7().i(P8());
        }
        if ((m1.b(8) & T8()) != 0) {
            k.v(this).U();
        }
    }

    public final void A9(@NotNull androidx.compose.ui.a0.c cVar) {
        if (a9()) {
            C9();
        }
        this.f39694s = cVar;
        p9(n1.f(cVar));
        if (a9()) {
            y9(false);
        }
    }

    public final void B9(@NotNull HashSet<androidx.compose.ui.modifier.c<?>> hashSet) {
        this.f39697w = hashSet;
    }

    public final void E9() {
        if (a9()) {
            this.f39697w.clear();
            k.v(this).getSnapshotObserver().i(this, androidx.compose.ui.node.d.f39711c, new d());
        }
    }

    @Override // androidx.compose.ui.node.y1
    public boolean H2() {
        return a9();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.runtime.collection.d] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.runtime.collection.d] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // androidx.compose.ui.modifier.j, androidx.compose.ui.modifier.n
    public <T> T I(@NotNull androidx.compose.ui.modifier.c<T> cVar) {
        i1 i1VarA0;
        this.f39697w.add(cVar);
        int iB = m1.b(32);
        if (!w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = w().W8();
        l0 l0VarU = k.u(this);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        ?? N = dVarW8;
                        ?? dVar = 0;
                        while (N != 0) {
                            if (N instanceof androidx.compose.ui.modifier.j) {
                                androidx.compose.ui.modifier.j jVar = (androidx.compose.ui.modifier.j) N;
                                if (jVar.x1().a(cVar)) {
                                    return (T) jVar.x1().b(cVar);
                                }
                            } else if ((N.T8() & iB) != 0 && (N instanceof m)) {
                                androidx.compose.ui.a0.d dVarY9 = ((m) N).y9();
                                int i10 = 0;
                                N = N;
                                dVar = dVar;
                                while (dVarY9 != null) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVar = dVar;
                                            N = dVarY9;
                                        } else {
                                            if (dVar == 0) {
                                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (N != 0) {
                                                dVar.d(N);
                                                N = 0;
                                            }
                                            dVar.d(dVarY9);
                                        }
                                    }
                                    dVarY9 = dVarY9.O8();
                                    N = N;
                                    dVar = dVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            N = k.n(dVar);
                        }
                    }
                    dVarW8 = dVarW8.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
        return cVar.a().invoke();
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        androidx.compose.ui.a0.c cVar2 = this.f39694s;
        Intrinsics.checkNotNull(cVar2, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        androidx.compose.ui.draw.m mVar = (androidx.compose.ui.draw.m) cVar2;
        if (this.f39695t && (cVar2 instanceof androidx.compose.ui.draw.l)) {
            D9();
        }
        mVar.P(cVar);
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.o0) cVar).U(zVar, yVar, i10);
    }

    @Override // androidx.compose.ui.node.a2
    @Nullable
    public Object V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((androidx.compose.ui.layout.e2) cVar).V(dVar, obj);
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.o0) cVar).W(zVar, yVar, i10);
    }

    @Override // androidx.compose.ui.focus.j
    public void Z(@NotNull androidx.compose.ui.focus.p0 p0Var) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        if (!(cVar instanceof androidx.compose.ui.focus.h)) {
            s0.a.i("onFocusEvent called on wrong node");
        }
        ((androidx.compose.ui.focus.h) cVar).Z(p0Var);
    }

    @Override // androidx.compose.ui.focus.c0
    public void Z6(@NotNull androidx.compose.ui.focus.z zVar) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        if (!(cVar instanceof androidx.compose.ui.focus.t)) {
            s0.a.i("applyFocusProperties called on wrong node");
        }
        ((androidx.compose.ui.focus.t) cVar).A3(new androidx.compose.ui.focus.s(zVar));
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.o0) cVar).c(c1Var, z0Var, j10);
    }

    @Override // androidx.compose.ui.node.f0
    public void c0(long j10) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        if (cVar instanceof androidx.compose.ui.layout.x1) {
            ((androidx.compose.ui.layout.x1) cVar).c0(j10);
        }
    }

    @Override // androidx.compose.ui.draw.f
    public long d() {
        return androidx.compose.ui.unit.v.h(k.p(this, m1.b(128)).a());
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.o0) cVar).e0(zVar, yVar, i10);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        y9(true);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        C9();
    }

    @Override // androidx.compose.ui.draw.f
    @NotNull
    public androidx.compose.ui.unit.d getDensity() {
        return k.u(this).getDensity();
    }

    @Override // androidx.compose.ui.draw.f
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return k.u(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.o0) cVar).k0(zVar, yVar, i10);
    }

    @Override // androidx.compose.ui.node.d2
    public boolean k8() {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((androidx.compose.ui.input.pointer.j0) cVar).z7().c();
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.d2
    public void l0() {
        if (this.f39694s instanceof androidx.compose.ui.input.pointer.j0) {
            p3();
        }
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((androidx.compose.ui.layout.p1) cVar).n0(g0Var);
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfigurationQ0 = ((androidx.compose.ui.semantics.s) cVar).q0();
        Intrinsics.checkNotNull(e0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((SemanticsConfiguration) e0Var).d(semanticsConfigurationQ0);
    }

    @Override // androidx.compose.ui.node.d2
    public boolean p1() {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((androidx.compose.ui.input.pointer.j0) cVar).z7().a();
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.j0) cVar).z7().f();
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        androidx.compose.ui.a0.c cVar = this.f39694s;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.j0) cVar).z7().g(qVar, sVar, j10);
    }

    @NotNull
    public String toString() {
        return this.f39694s.toString();
    }

    @NotNull
    public final androidx.compose.ui.a0.c w9() {
        return this.f39694s;
    }

    @Override // androidx.compose.ui.node.f0
    public void x(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.X = g0Var;
        androidx.compose.ui.a0.c cVar = this.f39694s;
        if (cVar instanceof androidx.compose.ui.layout.u1) {
            ((androidx.compose.ui.layout.u1) cVar).x(g0Var);
        }
    }

    @Override // androidx.compose.ui.modifier.j
    @NotNull
    public androidx.compose.ui.modifier.i x1() {
        androidx.compose.ui.modifier.a aVar = this.f39696v;
        return aVar != null ? aVar : androidx.compose.ui.modifier.k.a();
    }

    @NotNull
    public final HashSet<androidx.compose.ui.modifier.c<?>> x9() {
        return this.f39697w;
    }

    @Override // androidx.compose.ui.node.t
    public void z3() {
        this.f39695t = true;
        u.a(this);
    }

    public final void z9() {
        this.f39695t = true;
        u.a(this);
    }
}
