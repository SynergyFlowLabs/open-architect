package androidx.compose.animation;

import androidx.collection.b3;
import androidx.collection.k2;
import androidx.compose.animation.core.l3;
import androidx.compose.animation.core.t4;
import androidx.compose.animation.core.w3;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.layout.e2;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,959:1\n1#2:960\n85#3:961\n117#3,2:962\n85#3:976\n117#3,2:977\n1282#4,6:964\n1282#4,6:970\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n547#1:961\n547#1:962,2\n559#1:976\n559#1:977,2\n559#1:964,6\n572#1:970,6\n*E\n"})
public final class AnimatedContentTransitionScopeImpl<S> implements androidx.compose.animation.i<S> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12534g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l3<S> f12535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.e f12536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.w f12537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f12538d = d7.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f42720b.a()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k2<S, n7<androidx.compose.ui.unit.u>> f12539e = b3.u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private n7<androidx.compose.ui.unit.u> f12540f;

    private static final class SizeModifierElement<S> extends androidx.compose.ui.node.e1<b<S>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final l3<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> f12541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final n7<g1> f12542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final AnimatedContentTransitionScopeImpl<S> f12543e;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifierElement(@Nullable l3<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar, @NotNull n7<? extends g1> n7Var, @NotNull AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.f12541c = aVar;
            this.f12542d = n7Var;
            this.f12543e = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.ui.node.e1
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof SizeModifierElement) {
                SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
                if (Intrinsics.areEqual(sizeModifierElement.f12541c, this.f12541c) && Intrinsics.areEqual(sizeModifierElement.f12542d, this.f12542d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.ui.node.e1
        public int hashCode() {
            int iHashCode = this.f12543e.hashCode() * 31;
            l3<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar = this.f12541c;
            return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f12542d.hashCode();
        }

        @Override // androidx.compose.ui.node.e1
        public void j(@NotNull t2 t2Var) {
            t2Var.d("sizeTransform");
            t2Var.b().c("sizeAnimation", this.f12541c);
            t2Var.b().c("sizeTransform", this.f12542d);
            t2Var.b().c("scope", this.f12543e);
        }

        @Override // androidx.compose.ui.node.e1
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b<S> a() {
            return new b<>(this.f12541c, this.f12542d, this.f12543e);
        }

        @NotNull
        public final AnimatedContentTransitionScopeImpl<S> m() {
            return this.f12543e;
        }

        @Nullable
        public final l3<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> n() {
            return this.f12541c;
        }

        @NotNull
        public final n7<g1> o() {
            return this.f12542d;
        }

        @Override // androidx.compose.ui.node.e1
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(@NotNull b<S> bVar) {
            bVar.B9(this.f12541c);
            bVar.C9(this.f12542d);
            bVar.A9(this.f12543e);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,959:1\n85#2:960\n117#2,2:961\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n*L\n593#1:960\n593#1:961,2\n*E\n"})
    public static final class a implements e2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f12544b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final n3 f12545a;

        public a(boolean z10) {
            this.f12545a = d7.g(Boolean.valueOf(z10), null, 2, null);
        }

        @Override // androidx.compose.ui.layout.e2
        @NotNull
        public Object V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.f12545a.getValue()).booleanValue();
        }

        public final void b(boolean z10) {
            this.f12545a.setValue(Boolean.valueOf(z10));
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,959:1\n30#2:960\n30#2:962\n30#2:964\n30#2:966\n80#3:961\n80#3:963\n80#3:965\n80#3:967\n85#3:969\n90#3:971\n54#4:968\n59#4:970\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode\n*L\n658#1:960\n661#1:962\n662#1:964\n664#1:966\n658#1:961\n661#1:963\n662#1:965\n664#1:967\n690#1:969\n690#1:971\n690#1:968\n690#1:970\n*E\n"})
    private static final class b<S> extends o0 {
        private long X = androidx.compose.animation.e.f13442a;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        private l3<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> f12546t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        private n7<? extends g1> f12547v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        private AnimatedContentTransitionScopeImpl<S> f12548w;

        @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,959:1\n30#2:960\n80#3:961\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1\n*L\n693#1:960\n693#1:961\n*E\n"})
        static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b<S> f12549a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i2 f12550b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f12551c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b<S> bVar, i2 i2Var, long j10) {
                super(1);
                this.f12549a = bVar;
                this.f12550b = i2Var;
                this.f12551c = j10;
            }

            public final void c(i2.a aVar) {
                i2.a.V(aVar, this.f12550b, this.f12549a.w9().g().a(androidx.compose.ui.unit.u.e((((long) this.f12550b.h1()) << 32) | (((long) this.f12550b.c1()) & com.rabbitmq.client.k0.f265952a)), this.f12551c, androidx.compose.ui.unit.w.Ltr), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentTransitionScopeImpl$b$b, reason: collision with other inner class name */
        static final class C0052b extends kotlin.jvm.internal.l0 implements Function1<l3.b<S>, androidx.compose.animation.core.y0<androidx.compose.ui.unit.u>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b<S> f12552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f12553b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0052b(b<S> bVar, long j10) {
                super(1);
                this.f12552a = bVar;
                this.f12553b = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> invoke(l3.b<S> bVar) {
                long jQ;
                androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0VarC;
                if (Intrinsics.areEqual(bVar.l(), this.f12552a.w9().l())) {
                    jQ = this.f12552a.z9(this.f12553b);
                } else {
                    n7<androidx.compose.ui.unit.u> n7VarP = this.f12552a.w9().w().p(bVar.l());
                    jQ = n7VarP != null ? n7VarP.getValue().q() : androidx.compose.ui.unit.u.f42720b.a();
                }
                n7<androidx.compose.ui.unit.u> n7VarP2 = this.f12552a.w9().w().p(bVar.j());
                long jQ2 = n7VarP2 != null ? n7VarP2.getValue().q() : androidx.compose.ui.unit.u.f42720b.a();
                g1 value = this.f12552a.y9().getValue();
                return (value == null || (y0VarC = value.c(jQ, jQ2)) == null) ? androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null) : y0VarC;
            }
        }

        static final class c extends kotlin.jvm.internal.l0 implements Function1<S, androidx.compose.ui.unit.u> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b<S> f12554a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f12555b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b<S> bVar, long j10) {
                super(1);
                this.f12554a = bVar;
                this.f12555b = j10;
            }

            public final long c(S s10) {
                if (Intrinsics.areEqual(s10, this.f12554a.w9().l())) {
                    return this.f12554a.z9(this.f12555b);
                }
                n7<androidx.compose.ui.unit.u> n7VarP = this.f12554a.w9().w().p(s10);
                return n7VarP != null ? n7VarP.getValue().q() : androidx.compose.ui.unit.u.f42720b.a();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(Object obj) {
                return androidx.compose.ui.unit.u.b(c(obj));
            }
        }

        public b(@Nullable l3<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar, @NotNull n7<? extends g1> n7Var, @NotNull AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.f12546t = aVar;
            this.f12547v = n7Var;
            this.f12548w = animatedContentTransitionScopeImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long z9(long j10) {
            return androidx.compose.ui.unit.u.h(this.X, androidx.compose.animation.e.f13442a) ? j10 : this.X;
        }

        public final void A9(@NotNull AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.f12548w = animatedContentTransitionScopeImpl;
        }

        public final void B9(@Nullable l3<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar) {
            this.f12546t = aVar;
        }

        public final void C9(@NotNull n7<? extends g1> n7Var) {
            this.f12547v = n7Var;
        }

        @Override // androidx.compose.ui.node.g0
        @NotNull
        public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
            long jQ;
            i2 i2VarP0 = z0Var.P0(j10);
            if (c1Var.P5()) {
                jQ = androidx.compose.ui.unit.u.e((((long) i2VarP0.h1()) << 32) | (((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a));
            } else if (this.f12546t == null) {
                jQ = androidx.compose.ui.unit.u.e((((long) i2VarP0.h1()) << 32) | (((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a));
                this.X = androidx.compose.ui.unit.u.e((((long) i2VarP0.h1()) << 32) | (((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a));
            } else {
                long jE = androidx.compose.ui.unit.u.e((((long) i2VarP0.h1()) << 32) | (((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a));
                l3<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar = this.f12546t;
                Intrinsics.checkNotNull(aVar);
                n7<androidx.compose.ui.unit.u> n7VarA = aVar.a(new C0052b(this, jE), new c(this, jE));
                this.f12548w.A(n7VarA);
                jQ = n7VarA.getValue().q();
                this.X = n7VarA.getValue().q();
            }
            return androidx.compose.ui.layout.c1.h6(c1Var, (int) (jQ >> 32), (int) (jQ & com.rabbitmq.client.k0.f265952a), null, new a(this, i2VarP0, jQ), 4, null);
        }

        @Override // androidx.compose.ui.a0.d
        public void g9() {
            super.g9();
            this.X = androidx.compose.animation.e.f13442a;
        }

        @NotNull
        public final AnimatedContentTransitionScopeImpl<S> w9() {
            return this.f12548w;
        }

        @Nullable
        public final l3<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> x9() {
            return this.f12546t;
        }

        @NotNull
        public final n7<g1> y9() {
            return this.f12547v;
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,959:1\n54#2:960\n85#3:961\n80#3:963\n30#4:962\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$1\n*L\n451#1:960\n451#1:961\n451#1:963\n451#1:962\n*E\n"})
    static final class c extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f12557b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super Integer, Integer> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            super(1);
            this.f12556a = function1;
            this.f12557b = animatedContentTransitionScopeImpl;
        }

        public final Integer c(int i10) {
            long j10 = i10;
            return this.f12556a.invoke(Integer.valueOf(((int) (this.f12557b.t() >> 32)) - androidx.compose.ui.unit.q.n(this.f12557b.o(androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32)), this.f12557b.t()))));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,959:1\n30#2:960\n80#3:961\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$2\n*L\n456#1:960\n456#1:961\n*E\n"})
    static final class d extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f12559b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super Integer, Integer> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            super(1);
            this.f12558a = function1;
            this.f12559b = animatedContentTransitionScopeImpl;
        }

        public final Integer c(int i10) {
            long j10 = i10;
            return this.f12558a.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.n(this.f12559b.o(androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32)), this.f12559b.t()))) - i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$3\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,959:1\n59#2:960\n90#3:961\n80#3:963\n30#4:962\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$3\n*L\n461#1:960\n461#1:961\n461#1:963\n461#1:962\n*E\n"})
    static final class e extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f12561b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super Integer, Integer> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            super(1);
            this.f12560a = function1;
            this.f12561b = animatedContentTransitionScopeImpl;
        }

        public final Integer c(int i10) {
            long j10 = i10;
            return this.f12560a.invoke(Integer.valueOf(((int) (this.f12561b.t() & com.rabbitmq.client.k0.f265952a)) - androidx.compose.ui.unit.q.p(this.f12561b.o(androidx.compose.ui.unit.u.e((com.rabbitmq.client.k0.f265952a & j10) | (j10 << 32)), this.f12561b.t()))));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$4\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,959:1\n30#2:960\n80#3:961\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$4\n*L\n466#1:960\n466#1:961\n*E\n"})
    static final class f extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f12563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super Integer, Integer> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            super(1);
            this.f12562a = function1;
            this.f12563b = animatedContentTransitionScopeImpl;
        }

        public final Integer c(int i10) {
            long j10 = i10;
            return this.f12562a.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.p(this.f12563b.o(androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32)), this.f12563b.t()))) - i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,959:1\n30#2:960\n80#3:961\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$1\n*L\n522#1:960\n522#1:961\n*E\n"})
    static final class g extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f12564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12565b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12564a = animatedContentTransitionScopeImpl;
            this.f12565b = function1;
        }

        public final Integer c(int i10) {
            n7 n7Var = (n7) this.f12564a.w().p(this.f12564a.x().y());
            long j10 = i10;
            return this.f12565b.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.n(this.f12564a.o(androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32)), n7Var != null ? ((androidx.compose.ui.unit.u) n7Var.getValue()).q() : androidx.compose.ui.unit.u.f42720b.a()))) - i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,959:1\n30#2:960\n80#3:961\n85#3:963\n54#4:962\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$2\n*L\n528#1:960\n528#1:961\n528#1:963\n528#1:962\n*E\n"})
    static final class h extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f12566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12566a = animatedContentTransitionScopeImpl;
            this.f12567b = function1;
        }

        public final Integer c(int i10) {
            n7 n7Var = (n7) this.f12566a.w().p(this.f12566a.x().y());
            long jQ = n7Var != null ? ((androidx.compose.ui.unit.u) n7Var.getValue()).q() : androidx.compose.ui.unit.u.f42720b.a();
            long j10 = i10;
            return this.f12567b.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.n(this.f12566a.o(androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32)), jQ))) + ((int) (jQ >> 32))));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$3\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,959:1\n30#2:960\n80#3:961\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$3\n*L\n534#1:960\n534#1:961\n*E\n"})
    static final class i extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f12568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12569b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12568a = animatedContentTransitionScopeImpl;
            this.f12569b = function1;
        }

        public final Integer c(int i10) {
            n7 n7Var = (n7) this.f12568a.w().p(this.f12568a.x().y());
            long j10 = i10;
            return this.f12569b.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.p(this.f12568a.o(androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32)), n7Var != null ? ((androidx.compose.ui.unit.u) n7Var.getValue()).q() : androidx.compose.ui.unit.u.f42720b.a()))) - i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$4\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,959:1\n30#2:960\n80#3:961\n90#3:963\n59#4:962\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$4\n*L\n540#1:960\n540#1:961\n540#1:963\n540#1:962\n*E\n"})
    static final class j extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f12570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12571b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12570a = animatedContentTransitionScopeImpl;
            this.f12571b = function1;
        }

        public final Integer c(int i10) {
            n7 n7Var = (n7) this.f12570a.w().p(this.f12570a.x().y());
            long jQ = n7Var != null ? ((androidx.compose.ui.unit.u) n7Var.getValue()).q() : androidx.compose.ui.unit.u.f42720b.a();
            long j10 = i10;
            return this.f12571b.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.p(this.f12570a.o(androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32)), jQ))) + ((int) (jQ & com.rabbitmq.client.k0.f265952a))));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    public AnimatedContentTransitionScopeImpl(@NotNull l3<S> l3Var, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.unit.w wVar) {
        this.f12535a = l3Var;
        this.f12536b = eVar;
        this.f12537c = wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long o(long j10, long j11) {
        return g().a(j10, j11, androidx.compose.ui.unit.w.Ltr);
    }

    private static final boolean q(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    private static final void r(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long t() {
        n7<androidx.compose.ui.unit.u> n7Var = this.f12540f;
        return n7Var != null ? n7Var.getValue().q() : v();
    }

    private final boolean y(int i10) {
        androidx.compose.animation.i.a.C0065a c0065a = androidx.compose.animation.i.a.f13518b;
        if (androidx.compose.animation.i.a.j(i10, c0065a.c())) {
            return true;
        }
        if (androidx.compose.animation.i.a.j(i10, c0065a.e()) && this.f12537c == androidx.compose.ui.unit.w.Ltr) {
            return true;
        }
        return androidx.compose.animation.i.a.j(i10, c0065a.b()) && this.f12537c == androidx.compose.ui.unit.w.Rtl;
    }

    private final boolean z(int i10) {
        androidx.compose.animation.i.a.C0065a c0065a = androidx.compose.animation.i.a.f13518b;
        return androidx.compose.animation.i.a.j(i10, c0065a.d()) || (androidx.compose.animation.i.a.j(i10, c0065a.e()) && this.f12537c == androidx.compose.ui.unit.w.Rtl) || (androidx.compose.animation.i.a.j(i10, c0065a.b()) && this.f12537c == androidx.compose.ui.unit.w.Ltr);
    }

    public final void A(@Nullable n7<androidx.compose.ui.unit.u> n7Var) {
        this.f12540f = n7Var;
    }

    public void B(@NotNull androidx.compose.ui.e eVar) {
        this.f12536b = eVar;
    }

    public final void C(@NotNull androidx.compose.ui.unit.w wVar) {
        this.f12537c = wVar;
    }

    public final void D(long j10) {
        this.f12538d.setValue(androidx.compose.ui.unit.u.b(j10));
    }

    @Override // androidx.compose.animation.i
    @NotNull
    public f0 c(int i10, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super Integer, Integer> function1) {
        if (y(i10)) {
            return b0.L(y0Var, new g(this, function1));
        }
        if (z(i10)) {
            return b0.L(y0Var, new h(this, function1));
        }
        androidx.compose.animation.i.a.C0065a c0065a = androidx.compose.animation.i.a.f13518b;
        if (androidx.compose.animation.i.a.j(i10, c0065a.f())) {
            return b0.N(y0Var, new i(this, function1));
        }
        return androidx.compose.animation.i.a.j(i10, c0065a.a()) ? b0.N(y0Var, new j(this, function1)) : f0.f13493a.b();
    }

    @Override // androidx.compose.animation.i
    @NotNull
    public androidx.compose.ui.e g() {
        return this.f12536b;
    }

    @Override // androidx.compose.animation.i
    @NotNull
    public d0 h(int i10, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super Integer, Integer> function1) {
        if (y(i10)) {
            return b0.F(y0Var, new c(function1, this));
        }
        if (z(i10)) {
            return b0.F(y0Var, new d(function1, this));
        }
        androidx.compose.animation.i.a.C0065a c0065a = androidx.compose.animation.i.a.f13518b;
        if (androidx.compose.animation.i.a.j(i10, c0065a.f())) {
            return b0.H(y0Var, new e(function1, this));
        }
        return androidx.compose.animation.i.a.j(i10, c0065a.a()) ? b0.H(y0Var, new f(function1, this)) : d0.f13416a.a();
    }

    @Override // androidx.compose.animation.core.l3.b
    public S j() {
        return this.f12535a.w().j();
    }

    @Override // androidx.compose.animation.i
    @NotNull
    public x k(@NotNull x xVar, @Nullable g1 g1Var) {
        xVar.e(g1Var);
        return xVar;
    }

    @Override // androidx.compose.animation.core.l3.b
    public S l() {
        return this.f12535a.w().l();
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.ui.a0 p(@NotNull x xVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.ui.a0 a0Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:557)");
        }
        boolean zD = c0Var.D(this);
        Object objI0 = c0Var.i0();
        l3.a aVarB = null;
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = d7.g(Boolean.FALSE, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        n7 n7VarW = w6.w(xVar.b(), c0Var, 0);
        if (Intrinsics.areEqual(this.f12535a.p(), this.f12535a.y())) {
            r(n3Var, false);
        } else if (n7VarW.getValue() != null) {
            r(n3Var, true);
        }
        if (q(n3Var)) {
            c0Var.E(1353180665);
            aVarB = w3.B(this.f12535a, t4.O(androidx.compose.ui.unit.u.f42720b), null, c0Var, 0, 2);
            boolean zD2 = c0Var.D(aVarB);
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                g1 g1Var = (g1) n7VarW.getValue();
                objI1 = (g1Var == null || g1Var.b()) ? androidx.compose.ui.draw.j.b(androidx.compose.ui.a0.E) : androidx.compose.ui.a0.E;
                c0Var.Y(objI1);
            }
            a0Var = (androidx.compose.ui.a0) objI1;
            c0Var.A();
        } else {
            c0Var.E(1353446707);
            c0Var.A();
            this.f12540f = null;
            a0Var = androidx.compose.ui.a0.E;
        }
        androidx.compose.ui.a0 a0VarB2 = a0Var.B2(new SizeModifierElement(aVarB, n7VarW, this));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a0VarB2;
    }

    @Nullable
    public final n7<androidx.compose.ui.unit.u> s() {
        return this.f12540f;
    }

    @NotNull
    public final androidx.compose.ui.unit.w u() {
        return this.f12537c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long v() {
        return ((androidx.compose.ui.unit.u) this.f12538d.getValue()).q();
    }

    @NotNull
    public final k2<S, n7<androidx.compose.ui.unit.u>> w() {
        return this.f12539e;
    }

    @NotNull
    public final l3<S> x() {
        return this.f12535a;
    }
}
