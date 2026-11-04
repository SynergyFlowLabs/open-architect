package androidx.compose.animation;

import androidx.compose.ui.layout.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@i0
@SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,441:1\n141#2:442\n61#3:443\n54#3:444\n63#3:446\n59#3:447\n85#4:445\n90#4:448\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode\n*L\n238#1:442\n254#1:443\n254#1:444\n254#1:446\n254#1:447\n254#1:445\n254#1:448\n*E\n"})
public final class q extends androidx.compose.ui.a0.d implements androidx.compose.ui.layout.e {
    public static final int Z = 8;
    private boolean X = true;

    @NotNull
    private final t Y = new t();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.layout.w0 f13702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private s f13703t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> f13704v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f13705w;

    @SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,441:1\n1#2:442\n71#3:443\n65#3:444\n73#3:447\n69#3:448\n60#4:445\n70#4:449\n22#5:446\n26#5:450\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1\n*L\n274#1:443\n274#1:444\n274#1:447\n274#1:448\n274#1:445\n274#1:449\n274#1:446\n275#1:450\n*E\n"})
    static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2 f13707b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i2 i2Var) {
            super(1);
            this.f13707b = i2Var;
        }

        public final void c(i2.a aVar) {
            long jE;
            n0.j jVarE = q.this.Y.e();
            androidx.compose.ui.layout.w0 w0VarY9 = q.this.y9();
            q qVar = q.this;
            androidx.compose.ui.layout.g0 g0VarN = aVar.n();
            n0.g gVarD = g0VarN != null ? n0.g.d(w0VarY9.N(aVar).V(g0VarN, n0.g.f332700b.e(), qVar.w9())) : null;
            if (jVarE != null) {
                q.this.Y.i(jVarE.E(), jVarE.z());
                jE = jVarE.E();
            } else {
                n0.j jVarC = q.this.Y.c();
                jE = jVarC != null ? jVarC.E() : n0.g.f332700b.e();
            }
            long jV = gVarD != null ? n0.g.v(jE, gVarD.B()) : n0.g.f332700b.e();
            int i10 = 3 >> 0;
            i2.a.P(aVar, this.f13707b, Math.round(Float.intBitsToFloat((int) (jV >> 32))), Math.round(Float.intBitsToFloat((int) (jV & com.rabbitmq.client.k0.f265952a))), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public q(@NotNull androidx.compose.ui.layout.w0 w0Var, @NotNull s sVar, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> function2, boolean z10) {
        this.f13702s = w0Var;
        this.f13703t = sVar;
        this.f13704v = function2;
        this.f13705w = z10;
    }

    public final void A9(boolean z10) {
        this.f13705w = z10;
    }

    public final void B9(@NotNull s sVar) {
        this.f13703t = sVar;
    }

    public final void C9(@NotNull androidx.compose.ui.layout.w0 w0Var) {
        this.f13702s = w0Var;
    }

    public final void D9(@NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> function2) {
        this.f13704v = function2;
    }

    @Override // androidx.compose.ui.layout.e
    public boolean G6(long j10) {
        this.Y.l(androidx.compose.ui.unit.v.h(j10));
        return !this.Y.f();
    }

    @Override // androidx.compose.ui.layout.e
    public boolean J8(@NotNull i2.a aVar, @NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.Y.k(this.f13702s, aVar, Q8(), this.X, this.f13705w, this.f13703t);
        this.X = this.f13705w;
        return !this.Y.f();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        this.X = true;
    }

    @Override // androidx.compose.ui.layout.e
    @NotNull
    public androidx.compose.ui.layout.b1 l2(@NotNull androidx.compose.ui.layout.g gVar, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        long jH = this.Y.d() == n0.d.f332689d ? androidx.compose.ui.unit.v.h(gVar.s2()) : this.Y.d();
        n0.j jVarE = this.Y.e();
        if (jVarE != null) {
            jH = jVarE.z();
        }
        long jD = androidx.compose.ui.unit.v.d(jH);
        long jX = this.f13704v.invoke(androidx.compose.ui.unit.u.b(jD), androidx.compose.ui.unit.b.a(j10)).x();
        i2 i2VarP0 = z0Var.P0(jX);
        long jF = androidx.compose.ui.unit.c.f(jX, jD);
        return androidx.compose.ui.layout.c1.h6(gVar, (int) (jF >> 32), (int) (jF & com.rabbitmq.client.k0.f265952a), null, new a(i2VarP0), 4, null);
    }

    public final boolean w9() {
        return this.f13705w;
    }

    @NotNull
    public final s x9() {
        return this.f13703t;
    }

    @NotNull
    public final androidx.compose.ui.layout.w0 y9() {
        return this.f13702s;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> z9() {
        return this.f13704v;
    }
}
