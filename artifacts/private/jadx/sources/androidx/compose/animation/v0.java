package androidx.compose.animation;

import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.layout.i2;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSharedContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,352:1\n1#2:353\n61#3,3:354\n33#4:357\n53#5,3:358\n60#5:363\n70#5:367\n80#5:370\n85#5:373\n90#5:376\n85#5:379\n90#5:382\n71#6:361\n65#6:362\n73#6:365\n69#6:366\n22#7:364\n26#7:368\n30#8:369\n61#9:371\n54#9:372\n63#9:374\n59#9:375\n61#9:377\n54#9:378\n63#9:380\n59#9:381\n*S KotlinDebug\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n*L\n191#1:354,3\n227#1:357\n227#1:358,3\n259#1:363\n259#1:367\n282#1:370\n279#1:373\n279#1:376\n305#1:379\n305#1:382\n259#1:361\n259#1:362\n259#1:365\n259#1:366\n259#1:364\n260#1:368\n282#1:369\n279#1:371\n279#1:372\n279#1:374\n279#1:375\n305#1:377\n305#1:378\n305#1:380\n305#1:381\n*E\n"})
public final class v0 extends androidx.compose.ui.a0.d implements androidx.compose.ui.layout.e, androidx.compose.ui.node.t, androidx.compose.ui.modifier.j, r {
    public static final int X = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f13752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private y0 f13753t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.c f13754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.modifier.i f13755w;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f13756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i2 i2Var) {
            super(1);
            this.f13756a = i2Var;
        }

        public final void c(i2.a aVar) {
            i2.a.P(aVar, this.f13756a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2 f13758b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i2 i2Var) {
            super(1);
            this.f13758b = i2Var;
        }

        public final void c(i2.a aVar) {
            v0.this.z9(aVar, this.f13758b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2 f13760b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i2 i2Var) {
            super(1);
            this.f13760b = i2Var;
        }

        public final void c(i2.a aVar) {
            v0.this.A9(aVar, this.f13760b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.drawscope.c f13761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f13762b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.graphics.drawscope.c cVar, v0 v0Var) {
            super(1);
            this.f13761a = cVar;
            this.f13762b = v0Var;
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar) {
            this.f13761a.E4();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            c(fVar);
            return Unit.f312394a;
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f13763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f13764b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(i2 i2Var, v0 v0Var) {
            super(1);
            this.f13763a = i2Var;
            this.f13764b = v0Var;
        }

        public final void c(i2.a aVar) {
            i2.a.P(aVar, this.f13763a, 0, 0, 0.0f, 4, null);
            this.f13764b.E9().q(aVar, this.f13764b.F9());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public v0(@NotNull y0 y0Var) {
        this.f13753t = y0Var;
        this.f13754v = y0Var.g();
        this.f13755w = androidx.compose.ui.modifier.k.d(TuplesKt.to(w0.a(), y0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A9(i2.a aVar, i2 i2Var) {
        n0.g gVarD;
        long jE;
        long jB;
        androidx.compose.ui.layout.g0 g0VarN = aVar.n();
        if (g0VarN == null) {
            i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
            return;
        }
        long jR0 = D9().r0(g0VarN, n0.g.f332700b.e());
        if (E9().k() != null) {
            n0.j jVarC = E9().c();
            if (jVarC == null) {
                jVarC = n0.k.c(jR0, n0.n.f((((long) Float.floatToRawIntBits(i2Var.h1())) << 32) | (((long) Float.floatToRawIntBits(i2Var.c1())) & com.rabbitmq.client.k0.f265952a)));
            }
            o oVarC9 = C9();
            o1 o1VarK = E9().k();
            Intrinsics.checkNotNull(o1VarK);
            oVarC9.a(jVarC, z0.b(o1VarK));
        }
        n0.j jVarI = C9().i();
        if (jVarI != null) {
            o1 o1VarK2 = E9().k();
            Intrinsics.checkNotNull(o1VarK2);
            gVarD = n0.g.d(z0.a(o1VarK2, jVarI));
        } else {
            gVarD = null;
        }
        if (C9().f()) {
            jB = gVarD != null ? gVarD.B() : jR0;
            E9().t(gVarD == null ? n0.k.c(jR0, androidx.compose.ui.unit.v.h(g0VarN.a())) : n0.k.c(gVarD.B(), jVarI.z()));
        } else {
            if (gVarD != null) {
                jE = gVarD.B();
            } else {
                n0.j jVarC2 = E9().c();
                Intrinsics.checkNotNull(jVarC2);
                jE = jVarC2.E();
            }
            jB = jE;
        }
        long jV = n0.g.v(jB, jR0);
        i2.a.P(aVar, i2Var, Math.round(Float.intBitsToFloat((int) (jV >> 32))), Math.round(Float.intBitsToFloat((int) (jV & com.rabbitmq.client.k0.f265952a))), 0.0f, 4, null);
    }

    private final androidx.compose.ui.layout.g0 B9() {
        return androidx.compose.ui.node.k.s(this);
    }

    private final o C9() {
        return this.f13753t.d();
    }

    private final androidx.compose.ui.layout.g0 D9() {
        return E9().g().n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0 E9() {
        return this.f13753t.o();
    }

    private final androidx.compose.ui.layout.g0 G9() {
        return this.f13753t.o().g().K(androidx.compose.ui.node.k.s(this));
    }

    private final void H9(androidx.compose.ui.graphics.layer.c cVar) {
        if (cVar == null) {
            androidx.compose.ui.graphics.layer.c cVar2 = this.f13754v;
            if (cVar2 != null) {
                androidx.compose.ui.node.k.r(this).c(cVar2);
            }
        } else {
            this.f13753t.x(cVar);
        }
        this.f13754v = cVar;
    }

    private final void J9() {
        o7(w0.a(), this.f13753t);
        this.f13753t.z((y0) I(w0.a()));
        H9(androidx.compose.ui.node.k.r(this).b());
        this.f13752s = false;
        this.f13753t.v(this);
    }

    private final androidx.compose.ui.layout.b1 y9(androidx.compose.ui.layout.c1 c1Var, i2 i2Var) {
        this.f13752s = true;
        if (!E9().d()) {
            E9().t(null);
            return androidx.compose.ui.layout.c1.h6(c1Var, i2Var.h1(), i2Var.c1(), null, new a(i2Var), 4, null);
        }
        if (!E9().g().I()) {
            return androidx.compose.ui.layout.c1.h6(c1Var, i2Var.h1(), i2Var.c1(), null, new b(i2Var), 4, null);
        }
        long jA = this.f13753t.l().a(G9().a(), androidx.compose.ui.unit.u.e((((long) i2Var.h1()) << 32) | (((long) i2Var.c1()) & com.rabbitmq.client.k0.f265952a)));
        return androidx.compose.ui.layout.c1.h6(c1Var, (int) (jA >> 32), (int) (jA & com.rabbitmq.client.k0.f265952a), null, new c(i2Var), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z9(i2.a aVar, i2 i2Var) {
        long jB;
        if (C9().f()) {
            if (C9().f() || !E9().d()) {
                i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
                return;
            }
            return;
        }
        n0.j jVarC = E9().c();
        if (jVarC == null) {
            i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
            return;
        }
        androidx.compose.ui.layout.g0 g0VarN = aVar.n();
        if (g0VarN != null) {
            jB = androidx.compose.ui.unit.r.g(n0.g.v(jVarC.E(), D9().r0(g0VarN, n0.g.f332700b.e())));
        } else {
            jB = androidx.compose.ui.unit.q.f42709b.b();
        }
        i2.a.P(aVar, i2Var, androidx.compose.ui.unit.q.n(jB), androidx.compose.ui.unit.q.p(jB), 0.0f, 4, null);
    }

    @Override // androidx.compose.animation.r
    @Nullable
    public n0.j D7() {
        if (a9() && this.f13752s) {
            return n0.k.c(androidx.compose.ui.layout.g0.A0(D9(), B9(), 0L, false, 6, null), androidx.compose.ui.unit.v.h(B9().a()));
        }
        return null;
    }

    @NotNull
    public final y0 F9() {
        return this.f13753t;
    }

    @Override // androidx.compose.ui.layout.e
    public boolean G6(long j10) {
        return E9().d() && this.f13753t.o().g().I();
    }

    public final void I9(@NotNull y0 y0Var) {
        if (Intrinsics.areEqual(y0Var, this.f13753t)) {
            return;
        }
        this.f13753t = y0Var;
        if (a9()) {
            J9();
        }
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        k2 k2VarA;
        y0 y0Var = this.f13753t;
        if (!E9().d() || E9().c() == null) {
            k2VarA = null;
        } else {
            a1.a aVarH = this.f13753t.h();
            a1.d dVarT = this.f13753t.t();
            n0.j jVarC = E9().c();
            Intrinsics.checkNotNull(jVarC);
            k2VarA = aVarH.a(dVarT, jVarC, cVar.getLayoutDirection(), androidx.compose.ui.node.k.q(this));
        }
        y0Var.w(k2VarA);
        androidx.compose.ui.graphics.layer.c cVarG = this.f13753t.g();
        if (cVarG != null) {
            androidx.compose.ui.graphics.drawscope.f.m4(cVar, cVarG, 0L, new d(cVar, this), 1, null);
            if (this.f13753t.r()) {
                androidx.compose.ui.graphics.layer.e.a(cVar, cVarG);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + E9().e() + ",target: " + this.f13753t.d().f() + ", is attached: " + a9()).toString());
    }

    @Override // androidx.compose.ui.layout.e, androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        i2 i2VarP0 = z0Var.P0(j10);
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new e(i2VarP0, this), 4, null);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        super.e9();
        J9();
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        super.f9();
        H9(null);
        this.f13753t.z(null);
        this.f13753t.v(null);
        this.f13752s = false;
    }

    @Override // androidx.compose.ui.a0.d
    public void g9() {
        super.g9();
        androidx.compose.ui.graphics.layer.c cVar = this.f13754v;
        if (cVar != null) {
            androidx.compose.ui.node.k.r(this).c(cVar);
        }
        H9(androidx.compose.ui.node.k.r(this).b());
    }

    @Override // androidx.compose.ui.layout.e
    @NotNull
    public androidx.compose.ui.layout.b1 l2(@NotNull androidx.compose.ui.layout.g gVar, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        if (E9().d()) {
            n0.j jVarI = C9().i();
            if (jVarI == null) {
                jVarI = E9().z();
            }
            if (jVarI != null) {
                long jD = androidx.compose.ui.unit.v.d(jVarI.z());
                int i10 = (int) (jD >> 32);
                int i11 = (int) (jD & com.rabbitmq.client.k0.f265952a);
                if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + C9().i() + ", current bounds: " + E9().c()).toString());
                }
                j10 = androidx.compose.ui.unit.b.f42658b.c(kotlin.ranges.r.u(i10, 0), kotlin.ranges.r.u(i11, 0));
            }
        }
        return y9(gVar, z0Var.P0(j10));
    }

    @Override // androidx.compose.ui.modifier.j
    @NotNull
    public androidx.compose.ui.modifier.i x1() {
        return this.f13755w;
    }
}
