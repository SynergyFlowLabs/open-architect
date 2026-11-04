package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class b1 implements androidx.compose.animation.core.o<g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f14375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<n0.g> f14376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f14377c;

    /* JADX INFO: Add missing generic type declarations: [V] */
    @SourceDebugExtension({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/DelegatingAnimationSpec$vectorize$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,456:1\n65#2:457\n69#2:460\n60#3:458\n70#3:461\n53#3,3:463\n53#3,3:467\n22#4:459\n30#5:462\n30#5:466\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/DelegatingAnimationSpec$vectorize$1\n*L\n358#1:457\n358#1:460\n358#1:458\n358#1:461\n358#1:463,3\n369#1:467,3\n358#1:459\n358#1:462\n369#1:466\n*E\n"})
    public static final class a<V> implements androidx.compose.animation.core.y4<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.z3<g0, V> f14378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.u4<androidx.compose.animation.core.s> f14379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.u4<androidx.compose.animation.core.t> f14380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.u4<androidx.compose.animation.core.s> f14381d;

        a(androidx.compose.animation.core.z3<g0, V> z3Var, androidx.compose.animation.core.u4<androidx.compose.animation.core.s> u4Var, androidx.compose.animation.core.u4<androidx.compose.animation.core.t> u4Var2, androidx.compose.animation.core.u4<androidx.compose.animation.core.s> u4Var3) {
            this.f14378a = z3Var;
            this.f14379b = u4Var;
            this.f14380c = u4Var2;
            this.f14381d = u4Var3;
        }

        private final androidx.compose.animation.core.s n(g0 g0Var) {
            return (androidx.compose.animation.core.s) androidx.compose.animation.core.t4.P(kotlin.jvm.internal.z.f312833a).a().invoke(Float.valueOf(g0Var.f()));
        }

        private final androidx.compose.animation.core.t o(g0 g0Var) {
            Function1<n0.g, V> function1A = androidx.compose.animation.core.t4.R(n0.g.f332700b).a();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (g0Var.g() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (g0Var.g() & com.rabbitmq.client.k0.f265952a));
            return (androidx.compose.animation.core.t) function1A.invoke(n0.g.d(n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a))));
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/t;Landroidx/compose/animation/core/s;)TV; */
        private final androidx.compose.animation.core.w p(androidx.compose.animation.core.s sVar, androidx.compose.animation.core.t tVar, androidx.compose.animation.core.s sVar2) {
            Function1<g0, V> function1A = this.f14378a.a();
            float f10 = sVar.f();
            float f11 = tVar.f();
            return (androidx.compose.animation.core.w) function1A.invoke(new g0(f10, n0.g.g((((long) Float.floatToRawIntBits(tVar.g())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f11) << 32)), sVar2.f(), null));
        }

        private final androidx.compose.animation.core.s q(g0 g0Var) {
            return (androidx.compose.animation.core.s) androidx.compose.animation.core.t4.P(kotlin.jvm.internal.z.f312833a).a().invoke(Float.valueOf(g0Var.h()));
        }

        /* JADX WARN: Incorrect types in method signature: (TV;TV;TV;)J */
        @Override // androidx.compose.animation.core.u4
        public long c(androidx.compose.animation.core.w wVar, androidx.compose.animation.core.w wVar2, androidx.compose.animation.core.w wVar3) {
            g0 g0VarInvoke = this.f14378a.b().invoke(wVar);
            g0 g0VarInvoke2 = this.f14378a.b().invoke(wVar2);
            g0 g0VarInvoke3 = this.f14378a.b().invoke(wVar3);
            return Math.max(this.f14379b.c(q(g0VarInvoke), q(g0VarInvoke2), q(g0VarInvoke3)), Math.max(this.f14380c.c(o(g0VarInvoke), o(g0VarInvoke2), o(g0VarInvoke3)), this.f14381d.c(n(g0VarInvoke), n(g0VarInvoke2), n(g0VarInvoke3))));
        }

        /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
        @Override // androidx.compose.animation.core.u4
        public androidx.compose.animation.core.w g(long j10, androidx.compose.animation.core.w wVar, androidx.compose.animation.core.w wVar2, androidx.compose.animation.core.w wVar3) {
            g0 g0VarInvoke = this.f14378a.b().invoke(wVar);
            g0 g0VarInvoke2 = this.f14378a.b().invoke(wVar2);
            g0 g0VarInvoke3 = this.f14378a.b().invoke(wVar3);
            return p((androidx.compose.animation.core.s) this.f14379b.g(j10, q(g0VarInvoke), q(g0VarInvoke2), q(g0VarInvoke3)), (androidx.compose.animation.core.t) this.f14380c.g(j10, o(g0VarInvoke), o(g0VarInvoke2), o(g0VarInvoke3)), (androidx.compose.animation.core.s) this.f14381d.g(j10, n(g0VarInvoke), n(g0VarInvoke2), n(g0VarInvoke3)));
        }

        /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
        @Override // androidx.compose.animation.core.u4
        public androidx.compose.animation.core.w i(long j10, androidx.compose.animation.core.w wVar, androidx.compose.animation.core.w wVar2, androidx.compose.animation.core.w wVar3) {
            g0 g0VarInvoke = this.f14378a.b().invoke(wVar);
            g0 g0VarInvoke2 = this.f14378a.b().invoke(wVar2);
            g0 g0VarInvoke3 = this.f14378a.b().invoke(wVar3);
            return p((androidx.compose.animation.core.s) this.f14379b.i(j10, q(g0VarInvoke), q(g0VarInvoke2), q(g0VarInvoke3)), (androidx.compose.animation.core.t) this.f14380c.i(j10, o(g0VarInvoke), o(g0VarInvoke2), o(g0VarInvoke3)), (androidx.compose.animation.core.s) this.f14381d.i(j10, n(g0VarInvoke), n(g0VarInvoke2), n(g0VarInvoke3)));
        }
    }

    public b1(@NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull androidx.compose.animation.core.o<n0.g> oVar2, @NotNull androidx.compose.animation.core.o<Float> oVar3) {
        this.f14375a = oVar;
        this.f14376b = oVar2;
        this.f14377c = oVar3;
    }

    @Override // androidx.compose.animation.core.o
    @NotNull
    public <V extends androidx.compose.animation.core.w> androidx.compose.animation.core.u4<V> a(@NotNull androidx.compose.animation.core.z3<g0, V> z3Var) {
        androidx.compose.animation.core.o<Float> oVar = this.f14375a;
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
        return new a(z3Var, oVar.a(androidx.compose.animation.core.t4.P(zVar)), this.f14376b.a(androidx.compose.animation.core.t4.R(n0.g.f332700b)), this.f14377c.a(androidx.compose.animation.core.t4.P(zVar)));
    }
}
