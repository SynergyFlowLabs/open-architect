package androidx.compose.animation;

import androidx.compose.animation.core.j5;
import androidx.compose.animation.core.q2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.layout.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1222:1\n683#2:1223\n683#2:1225\n1#3:1224\n1#3:1226\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n*L\n1181#1:1223\n1182#1:1225\n1181#1:1224\n1182#1:1226\n*E\n"})
public final class d1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f13423e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final q2<n0.j> f13419a = androidx.compose.animation.core.p.r(0.0f, 400.0f, j5.h(n0.j.f332705e), 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a1.a f13420b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Function2<androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, k2> f13421c = a.f13425a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final s f13422d = new s() { // from class: androidx.compose.animation.c1
        @Override // androidx.compose.animation.s
        public final androidx.compose.animation.core.y0 a(n0.j jVar, n0.j jVar2) {
            return d1.b(jVar, jVar2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.k2<androidx.compose.ui.layout.l, androidx.collection.k2<androidx.compose.ui.e, u0>> f13424f = new androidx.collection.k2<>(0, 1, null);

    static final class a extends kotlin.jvm.internal.l0 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13425a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke(androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar) {
            return null;
        }
    }

    public static final class b implements a1.a {
        b() {
        }

        @Override // androidx.compose.animation.a1.a
        public k2 a(a1.d dVar, n0.j jVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar2) {
            a1.d dVarE = dVar.e();
            if (dVarE != null) {
                return dVarE.a();
            }
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1222:1\n70#2:1223\n67#2,9:1224\n77#2:1263\n80#3,6:1233\n87#3,3:1248\n90#3,2:1257\n94#3:1262\n391#4,9:1239\n400#4,3:1259\n4360#5,6:1251\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$1\n*L\n103#1:1223\n103#1:1224,9\n103#1:1263\n103#1:1233,6\n103#1:1248,3\n103#1:1257,2\n103#1:1262\n103#1:1239,9\n103#1:1259,3\n103#1:1251,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.l0 implements pj.o<a1, androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<a1, androidx.compose.runtime.c0, Integer, Unit> f13427b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.a0 a0Var, pj.n<? super a1, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            super(4);
            this.f13426a = a0Var;
            this.f13427b = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(a1 a1Var, androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = (c0Var.D(a1Var) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= c0Var.D(a0Var) ? 32 : 16;
            }
            if (!c0Var.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1948801580, i11, -1, "androidx.compose.animation.SharedTransitionLayout.<anonymous> (SharedTransitionScope.kt:102)");
            }
            androidx.compose.ui.a0 a0VarB2 = this.f13426a.B2(a0Var);
            pj.n<a1, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f13427b;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarB2);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            nVar.invoke(a1Var, c0Var, Integer.valueOf(i11 & 14));
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(a1 a1Var, androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(a1Var, a0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f13428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<a1, androidx.compose.runtime.c0, Integer, Unit> f13429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13431d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.a0 a0Var, pj.n<? super a1, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10, int i11) {
            super(2);
            this.f13428a = a0Var;
            this.f13429b = nVar;
            this.f13430c = i10;
            this.f13431d = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            d1.d(this.f13428a, this.f13429b, c0Var, t4.a(this.f13430c | 1), this.f13431d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1222:1\n607#2:1223\n604#2,6:1224\n1282#3,3:1230\n1285#3,3:1234\n1282#3,6:1237\n1282#3,6:1243\n1282#3,6:1249\n1282#3,6:1255\n605#4:1233\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1\n*L\n124#1:1223\n124#1:1224,6\n124#1:1230,3\n124#1:1234,3\n125#1:1237,6\n127#1:1243,6\n141#1:1249,6\n146#1:1255,6\n124#1:1233\n*E\n"})
    static final class e extends kotlin.jvm.internal.l0 implements pj.n<androidx.compose.ui.layout.w0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<a1, androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, Unit> f13432a;

        static final class a extends kotlin.jvm.internal.l0 implements pj.n<androidx.compose.ui.layout.c1, androidx.compose.ui.layout.z0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f13433a;

            /* JADX INFO: renamed from: androidx.compose.animation.d1$e$a$a, reason: collision with other inner class name */
            static final class C0061a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.c1 f13434a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ b1 f13435b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ i2 f13436c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0061a(androidx.compose.ui.layout.c1 c1Var, b1 b1Var, i2 i2Var) {
                    super(1);
                    this.f13434a = c1Var;
                    this.f13435b = b1Var;
                    this.f13436c = i2Var;
                }

                public final void c(i2.a aVar) {
                    androidx.compose.ui.layout.g0 g0VarN = aVar.n();
                    if (g0VarN != null) {
                        if (this.f13434a.P5()) {
                            this.f13435b.y(g0VarN);
                        } else {
                            this.f13435b.z(g0VarN);
                        }
                    }
                    i2.a.P(aVar, this.f13436c, 0, 0, 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                    c(aVar);
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1 b1Var) {
                super(3);
                this.f13433a = b1Var;
            }

            public final androidx.compose.ui.layout.b1 c(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, long j10) {
                i2 i2VarP0 = z0Var.P0(j10);
                return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new C0061a(c1Var, this.f13433a, i2VarP0), 4, null);
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.b1 invoke(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
                return c(c1Var, z0Var, bVar.x());
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.drawscope.c, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f13437a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b1 b1Var) {
                super(1);
                this.f13437a = b1Var;
            }

            public final void c(androidx.compose.ui.graphics.drawscope.c cVar) {
                cVar.E4();
                this.f13437a.h(cVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
                c(cVar);
                return Unit.f312394a;
            }
        }

        @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1222:1\n66#2,5:1223\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1$3$1\n*L\n146#1:1223,5\n*E\n"})
        static final class c extends kotlin.jvm.internal.l0 implements Function1<v1, u1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f13438a;

            @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1$3$1\n*L\n1#1,69:1\n146#2:70\n*E\n"})
            public static final class a implements u1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ b1 f13439a;

                public a(b1 b1Var) {
                    this.f13439a = b1Var;
                }

                @Override // androidx.compose.runtime.u1
                public void dispose() {
                    this.f13439a.q();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b1 b1Var) {
                super(1);
                this.f13438a = b1Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final u1 invoke(v1 v1Var) {
                return new a(this.f13438a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(pj.o<? super a1, ? super androidx.compose.ui.a0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
            super(3);
            this.f13432a = oVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.ui.layout.w0 w0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2062852661, i10, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:123)");
            }
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = b2.o(kotlin.coroutines.h.f312451a, c0Var);
                c0Var.Y(objI0);
            }
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = new b1(w0Var, s0Var);
                c0Var.Y(objI1);
            }
            b1 b1Var = (b1) objI1;
            pj.o<a1, androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, Unit> oVar = this.f13432a;
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            Object objI2 = c0Var.i0();
            if (objI2 == aVar.a()) {
                objI2 = new a(b1Var);
                c0Var.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.q0.a(aVar2, (pj.n) objI2);
            Object objI3 = c0Var.i0();
            if (objI3 == aVar.a()) {
                objI3 = new b(b1Var);
                c0Var.Y(objI3);
            }
            oVar.invoke(b1Var, androidx.compose.ui.draw.n.d(a0VarA, (Function1) objI3), c0Var, 6);
            Unit unit = Unit.f312394a;
            Object objI4 = c0Var.i0();
            if (objI4 == aVar.a()) {
                objI4 = new c(b1Var);
                c0Var.Y(objI4);
            }
            b2.d(unit, (Function1) objI4, c0Var, 54);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.layout.w0 w0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(w0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<a1, androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, Unit> f13440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13441b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(pj.o<? super a1, ? super androidx.compose.ui.a0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, int i10) {
            super(2);
            this.f13440a = oVar;
            this.f13441b = i10;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            d1.e(this.f13440a, c0Var, t4.a(this.f13441b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.y0 b(n0.j jVar, n0.j jVar2) {
        return f13419a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0
    public static final u0 c(androidx.compose.ui.layout.l lVar, androidx.compose.ui.e eVar) {
        if (!n(lVar) || !m(eVar)) {
            return new u0(lVar, eVar);
        }
        androidx.collection.k2<androidx.compose.ui.layout.l, androidx.collection.k2<androidx.compose.ui.e, u0>> k2Var = f13424f;
        androidx.collection.k2<androidx.compose.ui.e, u0> k2VarP = k2Var.p(lVar);
        if (k2VarP == null) {
            k2VarP = new androidx.collection.k2<>(0, 1, null);
            k2Var.q0(lVar, k2VarP);
        }
        androidx.collection.k2<androidx.compose.ui.e, u0> k2Var2 = k2VarP;
        u0 u0VarP = k2Var2.p(eVar);
        if (u0VarP == null) {
            u0VarP = new u0(lVar, eVar);
            k2Var2.q0(eVar, u0VarP);
        }
        return u0VarP;
    }

    @androidx.compose.runtime.o
    @i0
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void d(@Nullable androidx.compose.ui.a0 a0Var, @NotNull pj.n<? super a1, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(646379026);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(nVar) ? 32 : 16;
        }
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(646379026, i12, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:98)");
            }
            e(androidx.compose.runtime.internal.w.e(1948801580, true, new c(a0Var, nVar), c0VarR, 54), c0VarR, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new d(a0Var, nVar, i10, i11));
        }
    }

    @androidx.compose.runtime.o
    @i0
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(@NotNull pj.o<? super a1, ? super androidx.compose.ui.a0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1908320054);
        int i12 = 3 & 2;
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                int i13 = 6 & (-1);
                androidx.compose.runtime.m0.A0(1908320054, i11, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:121)");
            }
            int i14 = 0 | 6;
            androidx.compose.ui.layout.y0.a(androidx.compose.runtime.internal.w.e(2062852661, true, new e(oVar), c0VarR, 54), c0VarR, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new f(oVar, i10));
        }
    }

    @i0
    private static /* synthetic */ void j() {
    }

    @i0
    private static /* synthetic */ void k() {
    }

    @i0
    private static /* synthetic */ void l() {
    }

    private static final boolean m(androidx.compose.ui.e eVar) {
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        return eVar == aVar.C() || eVar == aVar.y() || eVar == aVar.A() || eVar == aVar.o() || eVar == aVar.i() || eVar == aVar.k() || eVar == aVar.g() || eVar == aVar.c() || eVar == aVar.e();
    }

    private static final boolean n(androidx.compose.ui.layout.l lVar) {
        androidx.compose.ui.layout.l.a aVar = androidx.compose.ui.layout.l.f39405a;
        if (lVar != aVar.g() && lVar != aVar.e() && lVar != aVar.c() && lVar != aVar.i() && lVar != aVar.a() && lVar != aVar.m() && lVar != aVar.k()) {
            return false;
        }
        return true;
    }
}
